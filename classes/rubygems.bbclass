# Class used to install rubygems
#
# The gem is downloaded, unpacked, patched if necessary.
# Then the patched gem is re-packaged and installed.
#
# The bb file can contains (optional features) :
#   The bb file may override the following variables:
#   GEM_SRC = "http://my.own.gem.server.com/" # default http://rubygems.org/gems
#   GEM_NAME = "gemName" # default ${BPN} with "gem-" prefix removed
#   GEM_VERSION = "gemVersion" # default ${PV}
#   GEM_FILE = "path/to/gem/file/to/be/used.gem" # default "${WORKDIR}/${GEM_NAME}-${GEM_VERSION}.gem"
#   GEM_SPEC_FILE = "path/to/spec/file/to/be/used.gemspec" # default to generated spec file from "gem spec" command
#   GEM_INSTALL_FLAGS = "--option" # Additional gem specific options to pass to gem install command
#                                  # usefull if building from source repository
#   SRC_URI = "..." # default to "${GEM_SRC}/${GEM_NAME}-${GEM_VERSION}.gem"
#

inherit base

BBCLASSEXTEND += "native"

GEM_SRC ?= "http://rubygems.org/gems"

GEM_NAME ?= "${@get_gem_name_from_bpn(d)}"
GEM_VERSION ?= "${PV}"

SRC_URI = "${GEM_SRC}/${GEM_FILENAME}"
GEMPREFIX = "gem-"

S = "${WORKDIR}/${GEM_NAME}-${GEM_VERSION}"

GEM_FILENAME = "${GEM_NAME}-${GEM_VERSION}.gem"
GEM_FILE ?= "${WORKDIR}/${GEM_FILENAME}"
GEM_BUILT_FILE = "${S}/${GEM_FILENAME}"

GEM_SPEC_FILENAME = "${GEM_FILENAME}spec"
GEM_SPEC_FILE ?= "${S}/${GEM_SPEC_FILENAME}"

GEM_DIR = "${libdir}/ruby/gems"
GEM_HOME = "${D}${GEM_DIR}"
GEM_PATH = "${STAGING_DIR}/${GEM_DIR}:${GEM_HOME}"

GEM_INSTALL_FLAGS ?= ""

RUBYLIB_class-target = "${STAGING_LIBDIR_NATIVE}/ruby/${@get_cross_platform_folder(d)}"
CFLAGS_append = " -DHAVE_GCC_CAS"

def get_gem_name_from_bpn(d):
    bpn = (d.getVar('BPN', True) or "")
    gemPrefix = (d.getVar('GEMPREFIX', True) or "")
    if bpn.startswith(gemPrefix):
        gemName = bpn[len(gemPrefix):]
    else:
        gemName = bpn
    return gemName

def get_cross_platform_folder(d):
    target_arch = d.getVar("TARGET_ARCH",True)
    target_os = d.getVar("TARGET_OS",True)
    if target_os.endswith("linux"):
        target_os = target_os.replace('linux', 'linux-gnu')
    return target_arch + "-" + target_os + "-cross"


do_unpack_gem() {
    export RUBYLIB=${RUBYLIB}

    cd ${WORKDIR}
    # GEM_FILE might not exist if SRC_URI was overloaded
    [ ! -e ${GEM_FILE} ] && return 0

    gem unpack -V ${GEM_FILE}
}

DEPENDS_prepend_class-native = "${@d.getVar('RDEPENDS_' + "${PN}", True) or ""} "
DEPENDS_prepend_class-target = "ruby "

python () {
    # unpack_gem need ruby to be installed in sysroot to succeed
    if bb.data.inherits_class('native', d):
        d.appendVarFlag('do_unpack_gem', 'depends', ' ruby-native:do_populate_sysroot')
    else:
        d.appendVarFlag('do_unpack_gem', 'depends', ' ruby-cross-%s:do_populate_sysroot' % d.getVar("TARGET_ARCH", True))
}

addtask unpack_gem after do_unpack before do_patch

do_generate_spec() {
    export RUBYLIB=${RUBYLIB}

    # GEM_FILE might not exist if SRC_URI was overloaded
    [ ! -e ${GEM_FILE} ] && return 0

    gem spec -V --ruby ${GEM_FILE} > ${GEM_SPEC_FILE}
}

addtask generate_spec after do_unpack_gem before do_patch

rubygems_do_compile() {
    export GEM_PATH=${GEM_PATH}
    export GEM_HOME=${GEM_HOME}
    export RUBYLIB=${RUBYLIB}

    export LANG="en_US.UTF-8"
    export LANGUAGE="en_US.UTF-8"
    export LC_ALL="en_US.UTF-8"

    gem build -V ${GEM_SPEC_FILE}
}

rubygems_do_install() {
    export GEM_PATH=${GEM_PATH}
    export GEM_HOME=${GEM_HOME}
    export RUBYLIB=${RUBYLIB}

    gem uninstall ${GEM_NAME} --version ${GEM_VERSION} -x -q -V || true

    gem install --local --bindir ${D}${bindir} ${GEM_BUILT_FILE} --no-rdoc --no-ri -E --no-user-install --ignore-dependencies --force --conservative -V -- ${GEM_INSTALL_FLAGS}
}

EXPORT_FUNCTIONS do_compile do_install

PACKAGES =+ "${PN}-examples ${PN}-tests"

FILES_${PN}-dbg += "/usr/src/debug/* \
                    ${libdir}/ruby/*/.debug \
                    ${libdir}/ruby/*/*/.debug \
                    ${libdir}/ruby/*/*/*/.debug \
                    ${libdir}/ruby/*/*/*/*/.debug \
                    ${libdir}/ruby/*/*/*/*/*/.debug \
                    ${libdir}/ruby/*/*/*/*/*/*/.debug \
                    ${libdir}/ruby/*/*/*/*/*/*/*/.debug \
                    ${libdir}/ruby/*/*/*/*/*/*/*/*/.debug \
"
FILES_${PN}-dev += "${GEM_DIR}/gems/*/debian.template \
                    ${GEM_DIR}/cache \
                    ${GEM_DIR}/build_info \
                    ${GEM_DIR}/gems/*/lib/generators \
"
FILES_${PN}-tests = "${GEM_DIR}/gems/*/tests \
                     ${GEM_DIR}/gems/*/test \
"
FILES_${PN}-examples = "${GEM_DIR}/gems/*/example"
FILES_${PN}-doc += "${GEM_DIR}/gems/*/doc \
                    ${GEM_DIR}/doc \
"
FILES_${PN} += "${GEM_DIR}/gems \
                ${GEM_DIR}/specifications \
                ${GEM_DIR}/extensions \
"

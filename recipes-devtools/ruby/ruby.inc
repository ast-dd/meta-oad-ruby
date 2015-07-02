SUMMARY = "An interpreter of object-oriented scripting language"
DESCRIPTION = "Ruby is an interpreted scripting language for quick \
and easy object-oriented programming. It has many features to process \
text files and to do system management tasks (as in Perl). \
It is simple, straight-forward, and extensible. \
"
HOMEPAGE = "http://www.ruby-lang.org/"
SECTION = "devel/ruby"
LICENSE = "Ruby | BSD | GPLv2"

BBCLASSEXTEND = "native cross"

DEPENDS = "ruby-native zlib openssl tcl libyaml db gdbm readline gmp"
DEPENDS_class-native = "openssl-native libyaml-native"
DEPENDS_class-cross = "ruby-native"

PN_class-cross = "ruby-cross-${TARGET_ARCH}"

INC_PR = "r1"


SHRT_VER = "${@bb.data.getVar('PV',d,1).split('.')[0]}.${@bb.data.getVar('PV',d,1).split('.')[1]}"
SRC_URI = "http://ftp.ruby-lang.org/pub/ruby/${SHRT_VER}/ruby-${PV}.tar.gz \
           file://extmk.patch \
"

S = "${WORKDIR}/ruby-${PV}"

inherit autotools

EXTRA_OEMAKE = " \
    LIBRUBYARG='-lruby-static' \
"

EXTRA_OECONF = "\
    --disable-versioned-paths \
    --disable-rpath \
    --enable-shared \
    --enable-load-relative \
"

EXTRA_OECONF_class-cross = "\
    --disable-versioned-paths \
    --disable-rpath \
    --enable-shared \
    --enable-load-relative \
    --host=${TARGET_SYS} \
    --libdir=${STAGING_DIR_TARGET}${target_libdir} \
    --includedir=${STAGING_DIR_TARGET}${target_includedir} \
    --bindir='$''{exec_prefix}/bin' \
    --sbindir='$''{exec_prefix}/sbin' \
    --libexecdir='$''{exec_prefix}/libexec' \
"

# This snippet lets compiled extensions which rely on external libraries,
# such as zlib, compile properly.  If we don't do this, then when extmk.rb
# runs, it uses the native libraries instead of the target libraries, and so
# none of the linking operations succeed -- which makes extconf.rb think
# that the libraries aren't available and hence that the extension can't be
# built.

do_configure_prepend() {
    sed -i "s#%%TARGET_CFLAGS%%#$TARGET_CFLAGS#; s#%%TARGET_LDFLAGS%%#$TARGET_LDFLAGS#" ${S}/common.mk
    rm -rf ${S}/ruby/
}

do_install_append_class-target() {
    # Strip out --sysroot from target rbconfig.rb
    sed -i -e "s,--sysroot=${STAGING_DIR_TARGET},,g" ${D}/${libdir}/ruby/*/rbconfig.rb
}

do_install_class-cross() {
    export CPPFLAGS_FROM_CROSS="${CPPFLAGS}"
    export CPPFLAGS_FOR_TARGET="${TARGET_CPPFLAGS}"
    export STRIP_FOR_TARGET="${TARGET_SYS}-strip"
    export NM_FOR_TARGET="${TARGET_SYS}-nm"
    export OBJDUMP_FOR_TARGET="${TARGET_SYS}-objdump"
    export AS_FOR_TARGET="${TARGET_SYS}-as"
    export AR_FOR_TARGET="${TARGET_SYS}-ar"
    export RANLIB_FOR_TARGET="${TARGET_SYS}-ranlib"
    export CPP_FOR_TARGET="${TARGET_SYS}-gcc -E --sysroot=${STAGING_DIR_TARGET} ${TARGET_CC_ARCH}"
    export CXXFLAGS_FROM_CROSS="${CXXFLAGS}"
    export CXXFLAGS_FOR_TARGET="${TARGET_CXXFLAGS}"
    export CXX_FOR_TARGET="${TARGET_SYS}-g++ --sysroot=${STAGING_DIR_TARGET} ${TARGET_CC_ARCH}"
    export LDFLAGS_FROM_CROSS="${LDFLAGS}"
    export LDFLAGS_FOR_TARGET="${TARGET_LDFLAGS} --sysroot=${STAGING_DIR_TARGET}"
    export CFLAGS_FROM_CROSS="${CFLAGS}"
    export CFLAGS_FOR_TARGET="${TARGET_CFLAGS}"
    export CC_FOR_TARGET="${TARGET_SYS}-gcc --sysroot=${STAGING_DIR_TARGET} ${TARGET_CC_ARCH}"
    export CROSS_TARGET_SYS_DIR="${CROSS_TARGET_SYS_DIR}"

    oe_runmake 'DESTDIR=${D}' install-cross
}

do_install () {
    oe_runmake 'DESTDIR=${D}' install

    # Remove default gems in order to use gems build by yocto
    rm -rf ${D}${bindir}/rake
    rm -rf ${D}${bindir}/rdoc
    rm -rf ${D}${bindir}/ri
    rm -rf ${D}${libdir}/ruby/gems
}

FILES_${PN}-cross = "${libdir}/ruby/*/*"

FILES_${PN} += "${libdir}/ruby/*/* \
                ${datadir}/rubygems \
                ${libdir}/ruby/rdoc \
                ${datadir}/ri"

FILES_${PN}-dbg += "${libdir}/ruby/*/.debug \
                    ${libdir}/ruby/*/*/.debug \
                    ${libdir}/ruby/*/*/*/.debug"

SYSROOT_PREPROCESS_FUNCS_class-cross += "ruby_cross_populate"

ruby_cross_populate() {
    sysroot_stage_libdir ${D}/${STAGING_DIR_NATIVE}${target_libdir} ${SYSROOT_DESTDIR}/${STAGING_DIR_NATIVE}${target_libdir}
}

SUMMARY = "Tools for creating, working with, and running Rails applications."
DESCRIPTION = "Rails internals: application bootup, plugins, generators, and rake tasks."
HOMEPAGE = "http://rubygems.org/gems/railties"
SECTION = "devel/ruby"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI[md5sum] = "5e85f430d34227c3ebd43f279bf91622"
SRC_URI[sha256sum] = "55546f3c8e40c63cd7fd34b41dcf79eb302a38dd9b5a0383e60e9e747e7ecfe9"

PR = "r1"

RDEPENDS_${PN} = "\
    gem-actionpack \
    gem-activesupport \
    gem-rake \
    gem-thor \
"

inherit rubygems


do_install_append() {
    # Get rid of generator as it causes issue with rpm packaging
    rm -Rf ${D}${GEM_DIR}/gems/${GEM_NAME}-${GEM_VERSION}/lib/rails/generators*
}

DESCRIPTION = "A ruby gem"
HOMEPAGE = "http://rubygems.org/gems/jwt"
SECTION = "devel/ruby"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"
PR="r1"

RDEPENDS_${PN} = "gem-multi-json"

inherit rubygems

SRC_URI[md5sum] = "f405961420cec20fc61617d46646c0ca"
SRC_URI[sha256sum] = "b8efe8386c028561b07616753955c5d1a94c2861fbc3075257193bc9aff4f3a9"

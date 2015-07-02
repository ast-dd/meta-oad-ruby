DESCRIPTION = "A ruby gem"
HOMEPAGE = "http://rubygems.org/gems/fog-json"
SECTION = "devel/ruby"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

RDEPENDS_${PN} = "gem-multi-json \
                 "

inherit rubygems

SRC_URI[md5sum] = "897e2e2b0550ce32b8f13c8c80b02a09"
SRC_URI[sha256sum] = "dcd321b42f551a9ed3a2a5d43bdfe703b7588dcac5a9e504577501ba50d52794"

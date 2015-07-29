SUMMARY = "A small library for doing (command) lines"
DESCRIPTION = "A small library for doing (command) lines"
HOMEPAGE = "https://github.com/thoughtbot/cocaine"
SECTION = "devel/ruby"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

SRC_URI[md5sum] = "e8c26261ea4e313fe16f5ecb51a0ac76"
SRC_URI[sha256sum] = "ccf17d0050b63a436524f65608dd1ab993973a19af6ccb6bc3341d0629702f1d"

PR = "r0"

inherit rubygems

RDEPENDS_${PN} = " gem-climate-control"

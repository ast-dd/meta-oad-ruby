DESCRIPTION = "A ruby gem"
HOMEPAGE = "http://rubygems.org/gems/em-synchrony"
SECTION = "devel/ruby"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

RDEPENDS_${PN} = "gem-eventmachine"

inherit rubygems

SRC_URI[md5sum] = "c6a1bbc3e4c5bb426847481f52fd0294"
SRC_URI[sha256sum] = "446103a238b44d9258386f10b7f0afa85e0bbf433c11813cacd7b81aa7b84457"

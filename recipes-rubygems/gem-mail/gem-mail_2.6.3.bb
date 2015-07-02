SUMMARY = "Mail provides a nice Ruby DSL for making, sending and reading emails."
DESCRIPTION = "A really Ruby Mail handler."
HOMEPAGE = "http://rubygems.org/gems/mail"
SECTION = "devel/ruby"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI[md5sum] = "b3a0b74bc1c5cc67e34007c27ef1e579"
SRC_URI[sha256sum] = "d7fee1ec4e4ea9bb38b77de5baf53c17004133efcdff030bd1de5e3620306fd9"

PR = "r1"

RDEPENDS_${PN} = "\
    gem-mime-types \
"

inherit rubygems


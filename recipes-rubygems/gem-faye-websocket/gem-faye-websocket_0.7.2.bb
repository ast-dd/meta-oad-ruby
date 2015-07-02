DESCRIPTION = "A ruby gem"
HOMEPAGE = "http://rubygems.org/gems/faye-websocket"
SECTION = "devel/ruby"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

RDEPENDS_${PN} = "gem-eventmachine \
                  gem-websocket-driver"

inherit rubygems

SRC_URI[md5sum] = "ac8e0c0fe73ec3364e5dca63ca4d80f1"
SRC_URI[sha256sum] = "86f936e5b2342aa80203bcc577a6b4b01832ba687d01cc8dcbc36ca3de1ea277"

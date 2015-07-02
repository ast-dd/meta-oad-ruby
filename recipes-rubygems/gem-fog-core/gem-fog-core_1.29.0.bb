DESCRIPTION = "A ruby gem"
HOMEPAGE = "http://rubygems.org/gems/fog-core"
SECTION = "devel/ruby"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

RDEPENDS_${PN} = "gem-builder \
                  gem-excon \
                  gem-formatador \
                  gem-mime-types \
                  gem-net-scp \
                  gem-net-ssh \
                 "

inherit rubygems

SRC_URI[md5sum] = "5838c66a952126cad267ca7f9ec08ee6"
SRC_URI[sha256sum] = "77d45dd361b26d7cf2ddd71905521186a2f52073daf0476868c2cb13874cdb2b"

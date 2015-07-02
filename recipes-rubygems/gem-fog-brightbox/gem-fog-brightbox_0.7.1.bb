DESCRIPTION = "A ruby gem"
HOMEPAGE = "http://rubygems.org/gems/fog-brightbox"
SECTION = "devel/ruby"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

RDEPENDS_${PN} = "gem-fog-core \
                  gem-fog-json \
                  gem-inflecto \
                 "

inherit rubygems

SRC_URI[md5sum] = "97df8bbc5bda3ca6360fe3f7adf2da8b"
SRC_URI[sha256sum] = "961186ee55edb77cf88d24d15c21982000374a3f80d8df5b7ca1682ab048eab2"

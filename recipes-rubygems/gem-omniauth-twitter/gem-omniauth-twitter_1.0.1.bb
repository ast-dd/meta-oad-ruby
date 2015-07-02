DESCRIPTION = "A ruby gem"
HOMEPAGE = "http://rubygems.org/gems/omniauth-twitter"
SECTION = "devel/ruby"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

RDEPENDS_${PN} = "gem-multi-json \
                  gem-omniauth-oauth"

inherit rubygems

SRC_URI[md5sum] = "c1532dd1b549b213fa9f680f9a9723a8"
SRC_URI[sha256sum] = "cd110801549953505a6152ae1426956785aca0cb749ff82835e8d49898b30f18"

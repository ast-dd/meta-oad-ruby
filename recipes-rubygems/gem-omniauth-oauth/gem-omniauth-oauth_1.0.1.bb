DESCRIPTION = "A ruby gem"
HOMEPAGE = "http://rubygems.org/gems/omniauth-oauth"
SECTION = "devel/ruby"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

RDEPENDS_${PN} = "gem-oauth \
                  gem-omniauth"

inherit rubygems

SRC_URI[md5sum] = "45c97c9d950a43c74ee43867ef8216ff"
SRC_URI[sha256sum] = "9f1bfb30fe6ba823935330d2036e08a5406e980f1e20c9b1271b82ee34fbe759"

DESCRIPTION = "A ruby gem"
HOMEPAGE = "http://rubygems.org/gems/omniauth-google-oauth2"
SECTION = "devel/ruby"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

RDEPENDS_${PN} = "gem-omniauth \
                  gem-omniauth-oauth2"

inherit rubygems

SRC_URI[md5sum] = "0d6a9c3507376530b23003d66ec9b4de"
SRC_URI[sha256sum] = "9e7657afa6fa11d7f93c696909d4586ab6bb013b7b129018b2c1ba74c8b88d54"

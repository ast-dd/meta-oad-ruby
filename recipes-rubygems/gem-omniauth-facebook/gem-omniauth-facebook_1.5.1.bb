DESCRIPTION = "A ruby gem"
HOMEPAGE = "http://rubygems.org/gems/omniauth-facebook"
SECTION = "devel/ruby"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"
PR="R1"

RDEPENDS_${PN} = "gem-omniauth-oauth2"

inherit rubygems

SRC_URI[md5sum] = "d5eb2a72c046661dfc0cfac5719c3d7f"
SRC_URI[sha256sum] = "c3e90cfeb902f66b46c5943123ae4ef6f9ace2058d8334bf5869d28948ddb286"

SUMMARY = "HTTMultiParty is a thin wrapper around HTTParty to provide multipart uploads."
DESCRIPTION = "HTTMultiParty is a thin wrapper around HTTParty to provide multipart uploads."
HOMEPAGE = "http://rubygems.org/gems/httmultiparty"
SECTION = "devel/ruby"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

SRC_URI[md5sum] = "01610b0739b43ca4701915bc6170630a"
SRC_URI[sha256sum] = "5b0bf5403ff9f26e5771cc10f8bb757cc2b9aa39a839790439f39996ec90bc6c"

PR = "r0"

RDEPENDS_${PN} = "\
    gem-httparty \
    gem-mimemagic \
    gem-multipart-post \
"

inherit rubygems


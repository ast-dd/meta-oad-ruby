SUMMARY = "A Ruby library to handle HTTP Cookies based on RFC 6265"
DESCRIPTION = "HTTP::Cookie is a Ruby library to handle HTTP Cookies based on RFC 6265.  It has with security, standards compliance and compatibility in mind, to behave just the same as today's major web browsers.  It has builtin support for the legacy cookies.txt and the latest cookies.sqlite formats of Mozilla Firefox, and its modular API makes it easy to add support for a new backend store."
HOMEPAGE = "http://rubygems.org/gems/http-cookie"
SECTION = "devel/ruby"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

SRC_URI[md5sum] = "70529d56540a162f52ce361a389a0307"
SRC_URI[sha256sum] = "bcc1b18b5bc3e9302542c9c7f68f1ac0c3100a65dd2831786172e8676773e233"

PR = "r0"

RDEPENDS_${PN} = "\
    gem-domain-name \
"

inherit rubygems


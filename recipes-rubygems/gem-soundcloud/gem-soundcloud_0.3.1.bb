SUMMARY = "A simple Soundcloud API wrapper"
DESCRIPTION = "A simple Soundcloud API wrapper based of httparty, multipart-post, httmultiparty"
HOMEPAGE = "http://rubygems.org/gems/soundcloud"
SECTION = "devel/ruby"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

SRC_URI[md5sum] = "f11b00260129956ef24bf8e7040f2110"
SRC_URI[sha256sum] = "ea4fae56d912a8bcf7867b2b7740e61d9fc8f4f4f67460c828a17fb8f9bba63b"

PR = "r0"

RDEPENDS_${PN} = "\
    gem-hashie \
    gem-httmultiparty \
    gem-httparty \
"

inherit rubygems


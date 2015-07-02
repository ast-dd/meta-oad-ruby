SUMMARY = "A toolkit for building modeling frameworks (part of Rails)."
DESCRIPTION = "A toolkit for building modeling frameworks like Active Record. Rich support for attributes, callbacks, validations, serialization, internationalization, and testing."
HOMEPAGE = "http://rubygems.org/gems/activemodel"
SECTION = "devel/ruby"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

SRC_URI[md5sum] = "416a3b48c62bef34db13f8430b94f48f"
SRC_URI[sha256sum] = "277d3fd1736ef1c4043592f482e6dea5cf4cc7d50c706b8be4971058a0df69cc"

PR = "r1"

RDEPENDS_${PN} = "\
    gem-activesupport \
    gem-builder \
"

inherit rubygems


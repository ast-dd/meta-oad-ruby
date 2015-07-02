SUMMARY = "Makes http fun! Also, makes consuming restful web services dead easy."
DESCRIPTION = "Makes http fun! Also, makes consuming restful web services dead easy."
HOMEPAGE = "http://rubygems.org/gems/httparty"
SECTION = "devel/ruby"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

SRC_URI[md5sum] = "e19c2b90663f0a7920a5912d80f9c3b3"
SRC_URI[sha256sum] = "71d5b4f03bf5e16168a300c53286d3e3fb2c5caa9386f486d4fc78d7c02d8f38"

PR = "r0"

RDEPENDS_${PN} = "\
    gem-json \
    gem-multi-xml \
"

inherit rubygems


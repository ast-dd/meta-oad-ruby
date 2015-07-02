SUMMARY = "Rendering framework putting the V in MVC (part of Rails)."
DESCRIPTION = "Simple, battle-tested conventions and helpers for building web pages."
HOMEPAGE = "http://rubygems.org/gems/actionview"
SECTION = "devel/ruby"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

SRC_URI[md5sum] = "ef0c8fd4e8a60215c6089a9b5a3c3ae4"
SRC_URI[sha256sum] = "4c72eca866e4a80b3a56760aeb859e26bbe221fc2c06c13bc8d3220284900330"

PR = "r0"

RDEPENDS_${PN} = "\
    gem-activesupport \
    gem-builder \
    gem-erubis \
"

inherit rubygems


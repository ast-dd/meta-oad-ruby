SUMMARY = "A toolkit of support libraries and Ruby core extensions extracted from the Rails framework."
DESCRIPTION = "A toolkit of support libraries and Ruby core extensions extracted from the Rails framework. Rich support for multibyte strings, internationalization, time zones, and testing."
HOMEPAGE = "http://rubygems.org/gems/activesupport"
SECTION = "devel/ruby"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"


SRC_URI[md5sum] = "71a250e4ee809c9065333239816f8c2b"
SRC_URI[sha256sum] = "b495b8490a7f3a885c8d0868858cca5070be41a5001642d2eb83a2f2e794082a"

PR = "r1"

RDEPENDS_${PN} = "\
    gem-i18n \
    gem-json \
    gem-minitest \
    gem-thread-safe \
    gem-tzinfo \
"

inherit rubygems


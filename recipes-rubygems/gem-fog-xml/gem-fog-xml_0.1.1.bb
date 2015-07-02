SUMMARY = "XML parsing for fog providers"
DESCRIPTION = "Extraction of the XML parsing tools shared between a \
                          number of providers in the 'fog' gem"
HOMEPAGE = "http://rubygems.org/gems/fog-xml"
SECTION = "devel/ruby"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

SRC_URI[md5sum] = "e146bfe746eb5607c251398a52d1ddf5"
SRC_URI[sha256sum] = "85f7ed6418bcc8e74ea93afd265d60d8fdeabc4c94f920df3ad7ff0a3e97fd4d"

PR = "r0"

RDEPENDS_${PN} = "\
    gem-fog-core \
    gem-nokogiri \
"

inherit rubygems


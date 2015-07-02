SUMMARY = "Nokogiri (\u{92f8}) is an HTML, XML, SAX, and Reader parser"
DESCRIPTION = "Nokogiri (\u{92f8}) is an HTML, XML, SAX, and Reader parser.  Among Nokogiri's \
many features is the ability to search documents via XPath or CSS3 selectors. \
 \
XML is like violence - if it doesn\u{2019}t solve your problems, you are not using \
enough of it."
HOMEPAGE = "http://rubygems.org/gems/nokogiri"
SECTION = "devel/ruby"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI[md5sum] = "fc9f91534bf93d57b84f625b55732a7c"
SRC_URI[sha256sum] = "60c060c694a62145b9224413efa346de5a893582c1fbc0326bc74089c5d898c8"

PR = "r0"

DEPENDS = "libxml2 libxslt"
RDEPENDS_${PN} = "\
    gem-mini-portile \
"

inherit rubygems

GEM_INSTALL_FLAGS = "--use-system-libraries"

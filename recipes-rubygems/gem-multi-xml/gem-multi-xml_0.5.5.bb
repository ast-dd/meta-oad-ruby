SUMMARY = "A generic swappable back-end for XML parsing"
DESCRIPTION = "Provides swappable XML backends utilizing LibXML, Nokogiri, Ox, or REXML."
HOMEPAGE = "http://rubygems.org/gems/multi_xml"
SECTION = "devel/ruby"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

SRC_URI[md5sum] = "afecb8240f7a14a9183d79f8df5bfa3f"
SRC_URI[sha256sum] = "08936dc294586ee1d178217cce577febe26315d7880e01e4f8e97cf2753b1945"

GEM_NAME = "multi_xml"

PR = "r0"

inherit rubygems


SUMMARY = "Twitter's Bootstrap, converted to Sass and ready to drop into Rails or Compass"
HOMEPAGE = "http://rubygems.org/gems/bootstrap-sass"
SECTION = "devel/ruby"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0c8ffbe0c6f82ea4b0a4524770f5c3fe"

SRC_URI[md5sum] = "e68d7a801727ced1f91ced35bbf5fe92"
SRC_URI[sha256sum] = "e75b0f9c6737481c181e98629f5236f51dd869a5689a4efc40719517759711e2"

PR = "r0"

RDEPENDS_${PN} = "\
    gem-sass \
"

inherit rubygems


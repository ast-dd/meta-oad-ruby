DESCRIPTION = "A ruby gem"
HOMEPAGE = "http://rubygems.org/gems/thin"
SECTION = "devel/ruby"
LICENSE = "Ruby & GPL-2.0"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/Ruby;md5=105fc57d3f4d3122db32912f3e6107d0"
PR="r1"

RDEPENDS_${PN} = "gem-daemons \
                  gem-eventmachine \
                  gem-rack"

inherit rubygems

SRC_URI[md5sum] = "b1746c44618a29cca5d3973f25ef3456"
SRC_URI[sha256sum] = "91482ab856eaef002b65439bb7c09c2b160b1fb2f6093d2eb308e6029f57a6d4"

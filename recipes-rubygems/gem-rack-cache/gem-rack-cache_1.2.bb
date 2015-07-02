DESCRIPTION = "A ruby gem"
HOMEPAGE = "http://rubygems.org/gems/rack-cache"
SECTION = "devel/ruby"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING;md5=1dbcf920018d0a1b78f6476664e937c3"

RDEPENDS_${PN} = "gem-rack"

inherit rubygems

SRC_URI[md5sum] = "ccdcdd7302394e05d3033d683b658556"
SRC_URI[sha256sum] = "02bfed05f8b3266db804f2fa445801636ca2c6d211a3137ec796f88af5756e1c"

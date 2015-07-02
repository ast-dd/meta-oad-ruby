DESCRIPTION = "A ruby gem"
HOMEPAGE = "http://rubygems.org/gems/coffee-script"
SECTION = "devel/ruby"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=00981e2ce829a2b19c5a88eda36e7f0e"
PR="r1"

RDEPENDS_${PN} = "gem-coffee-script-source \
                  gem-execjs"

inherit rubygems

SRC_URI[md5sum] = "997e66011cb972fb13be5d19bedd6d6e"
SRC_URI[sha256sum] = "6d54ad08a94c4a5b3f7a8d1e0625b412f2d1ac1264243cb046131e2d9c281744"

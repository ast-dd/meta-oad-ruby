DESCRIPTION = "A ruby gem"
HOMEPAGE = "http://rubygems.org/gems/aws-s3"
SECTION = "devel/ruby"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING;md5=d9c940330eefd9f00ab9f44d519fcda4"

RDEPENDS_${PN} = "gem-builder \
                  gem-mime-types \
                  gem-xml-simple"

inherit rubygems

SRC_URI[md5sum] = "5dd33c6797f3961f0834e6984d0520b3"
SRC_URI[sha256sum] = "5ffdec2648990987a4e024fb7f3ae9e20c5d6bd692543237afa58871ec9d8246"

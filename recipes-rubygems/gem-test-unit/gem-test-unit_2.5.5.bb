DESCRIPTION = "A ruby gem"
HOMEPAGE = "http://rubygems.org/gems/test-unit"
SECTION = "devel/ruby"
LICENSE = "GPL-2.0"
LIC_FILES_CHKSUM = "file://COPYING;md5=01cfff6654bb8b1c9b0287b6eac740b2 \
                    file://GPL;md5=393a5ca445f6965873eca0259a17f833"

RDEPENDS_${PN} = "gem-power-assert"

inherit rubygems

SRC_URI[md5sum] = "330ec9fb1cb03f869bbb20274672e297"
SRC_URI[sha256sum] = "3216d6584293964c438e0573fa8f0273d12df2abb1c32d7a6aa427d6e0779d47"

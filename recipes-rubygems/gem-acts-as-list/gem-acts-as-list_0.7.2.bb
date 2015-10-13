DESCRIPTION = "A ruby gem"
HOMEPAGE = "https://rubygems.org/gems/acts_as_list"
SECTION = "devel/ruby"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://MIT-LICENSE;md5=6dfd87f04e4ab1c49736fde1bfb3fc5c"
PR="r1"

RDEPENDS_${PN} = "gem-activerecord"

GEM_NAME = "acts_as_list"

inherit rubygems

SRC_URI[md5sum] = "2ea69356c0b9511e6a2bce1a11a54d13"
SRC_URI[sha256sum] = "a49748ee8e384094cbfa6858a465eb3f00ac866181e34f37ef3f350d4a281d95"

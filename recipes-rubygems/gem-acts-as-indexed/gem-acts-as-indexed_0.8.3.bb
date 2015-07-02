DESCRIPTION = "A ruby gem"
HOMEPAGE = "https://rubygems.org/gems/acts_as_indexed"
SECTION = "devel/ruby"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://MIT-LICENSE;md5=bde9c09ae02cc67e2237c8e03f751d43"
PR="r1"

RDEPENDS_${PN} = "gem-activerecord"

GEM_NAME = "acts_as_indexed"

inherit rubygems

SRC_URI[md5sum] = "a731b92d45ef3bd89581673f22941f5d"
SRC_URI[sha256sum] = "7b2506d5f8735591a39ca4b63ec0b31a78963a8e6c79c96c8e802da2290648f3"

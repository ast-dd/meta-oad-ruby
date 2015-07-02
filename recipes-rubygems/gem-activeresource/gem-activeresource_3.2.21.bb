DESCRIPTION = "A ruby gem"
HOMEPAGE = "http://rubygems.org/gems/activeresource"
SECTION = "devel/ruby"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://MIT-LICENSE;md5=a404beb46bd0d3ce9ea61fa246caa0a1"
PR="r1"

RDEPENDS_${PN} = "gem-activemodel \
                  gem-activesupport"

inherit rubygems

SRC_URI[md5sum] = "8944318ce5ae70054bdec7eca406535a"
SRC_URI[sha256sum] = "0bbbea221e1229f3a3fd2c1a0eb41e0038b985d59fb4a7cc18f8721b49b10175"

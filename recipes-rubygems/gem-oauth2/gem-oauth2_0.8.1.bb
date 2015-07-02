DESCRIPTION = "A ruby gem"
HOMEPAGE = "http://rubygems.org/gems/oauth2"
SECTION = "devel/ruby"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=718bcf03abbbc5649c0b53686a544acd"
PR="r1"

RDEPENDS_${PN} = "gem-faraday \
                  gem-httpauth \
                  gem-jwt \
                  gem-multi-json \
                  gem-rack"

inherit rubygems

SRC_URI[md5sum] = "fa01d3c1aff4590e1ff00f3b26f23b34"
SRC_URI[sha256sum] = "e18808a91165f22b8ce7939a216a51bb50d16a90b592347084b5112a4815f3a1"

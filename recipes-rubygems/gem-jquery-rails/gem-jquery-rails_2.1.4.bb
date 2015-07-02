DESCRIPTION = "A ruby gem"
HOMEPAGE = "http://rubygems.org/gems/jquery-rails"
SECTION = "devel/ruby"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=11897031499724308a90f96ee486be14"

RDEPENDS_${PN} = "gem-railties \
                  gem-thor"

inherit rubygems

SRC_URI[md5sum] = "e5e52597add7a53b8d4ffeaf5057ebea"
SRC_URI[sha256sum] = "03acc05e3513144c3eab7561d115507768b194ad2edd9806f9138ff0621a1f70"

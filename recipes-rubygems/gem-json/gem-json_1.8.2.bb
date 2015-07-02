DESCRIPTION = "A ruby gem"
HOMEPAGE = "http://rubygems.org/gems/json"
SECTION = "devel/ruby"
LICENSE = "GPL-2.0 Ruby"
LIC_FILES_CHKSUM = "file://COPYING;md5=aef161fe3c86f1a8d6c71d3b8c5655c5 \
                    file://GPL;md5=b9ce196eccc77fa531d7da4fe63587e3"

DEPENDS = "gmp"
RDEPENDS_${PN} = "gmp"

inherit rubygems

SRC_URI[md5sum] = "45f5193f0c849387c14ed4f13e5d4c2a"
SRC_URI[sha256sum] = "256f73d107635f54e3dd84daba65da7b08f9d6a6e6aeb046db6a46b98bd8fb7f"

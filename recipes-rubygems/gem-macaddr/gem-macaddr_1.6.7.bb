DESCRIPTION = "A ruby gem"
HOMEPAGE = "http://rubygems.org/gems/macaddr"
SECTION = "devel/ruby"
LICENSE = "Ruby"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/Ruby;md5=105fc57d3f4d3122db32912f3e6107d0"

RDEPENDS_${PN} = "gem-systemu"

inherit rubygems

SRC_URI[md5sum] = "1871aa23274ad708472d62c33f62630f"
SRC_URI[sha256sum] = "128fc4a1dbcec678a832bf731206c22aff4052e7d64603b5565c29d31b06fd9f"

DESCRIPTION = "A ruby gem"
HOMEPAGE = "http://rubygems.org/gems/warden"
SECTION = "devel/ruby"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=2c50fb01b7244c81047ab36238037c4a"

RDEPENDS_${PN} = "gem-rack"

inherit rubygems

SRC_URI[md5sum] = "b55fe91874f313b8625ad3b97906cd21"
SRC_URI[sha256sum] = "97769e5b5d230fec4f77e91b1116b28fdd27428f4acab68dc5ed025af9d37f7a"

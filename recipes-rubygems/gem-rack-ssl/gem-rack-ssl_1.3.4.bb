DESCRIPTION = "A ruby gem"
HOMEPAGE = "http://rubygems.org/gems/rack-ssl"
SECTION = "devel/ruby"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=00981e2ce829a2b19c5a88eda36e7f0e"
PR="r1"

RDEPENDS_${PN} = "gem-rack"

inherit rubygems

SRC_URI[md5sum] = "15789993d97f1cc1e7907f3b37165f4f"
SRC_URI[sha256sum] = "d703764fa2a0d44a2163d6add65be89f5dba4477d1959b90d3727682a9c37dcf"

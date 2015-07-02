DESCRIPTION = "A ruby gem"
HOMEPAGE = "http://rubygems.org/gems/rdoc"
SECTION = "devel/ruby"
LICENSE = "GPL-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.rdoc;md5=deb0ecf3b81fd9a51b266d73b707f926"

RDEPENDS_${PN} = "gem-json"

inherit rubygems

SRC_URI[md5sum] = "5981db027e986779a0bcd201a7d6fba7"
SRC_URI[sha256sum] = "a8e2b78f7e5ec4cc4716cd863975645f2f2377dc6db267a15e427e5fae2633ed"

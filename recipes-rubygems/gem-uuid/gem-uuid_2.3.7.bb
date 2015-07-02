DESCRIPTION = "A ruby gem"
HOMEPAGE = "http://rubygems.org/gems/uuid"
SECTION = "devel/ruby"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://MIT-LICENSE;md5=48d3632c2dbfc05bcac4ebf6572b392d"

RDEPENDS_${PN} = "gem-macaddr"

inherit rubygems

# Remove useless binary that is in conflict with ossp-uuid
do_install_append() {
    rm -rf ${D}${bindir}
}

SRC_URI[md5sum] = "749430cac002a05e99d7ae0fb835f78a"
SRC_URI[sha256sum] = "97da1c55aa3e14850e773c3638974b836ec3dd1095b70da3e41f903dac020113"

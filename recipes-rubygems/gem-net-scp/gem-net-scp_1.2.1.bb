DESCRIPTION = "A ruby gem"
HOMEPAGE = "http://rubygems.org/gems/net-scp"
SECTION = "devel/ruby"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

RDEPENDS_${PN} = "gem-net-ssh"

inherit rubygems

SRC_URI[md5sum] = "abeec1cab9696e02069e74bd3eac8a1b"
SRC_URI[sha256sum] = "928ca046246bdbfe304313c903bab95e7b711938ceff4a2c896b91ab59c6122c"

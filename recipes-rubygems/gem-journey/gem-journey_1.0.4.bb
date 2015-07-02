DESCRIPTION = "A ruby gem"
HOMEPAGE = "http://rubygems.org/gems/journey"
SECTION = "devel/ruby"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI_append = " file://gem-journey-fix-rdoc-require.patch"

inherit rubygems

SRC_URI[md5sum] = "9af37d196636bf00f19bfafcea843da8"
SRC_URI[sha256sum] = "7454b8612530784000fbb17ea2df749a71b70702a0ac8ebef4a1e7f05aecc10f"

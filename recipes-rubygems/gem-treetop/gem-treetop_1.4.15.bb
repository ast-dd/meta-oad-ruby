DESCRIPTION = "A ruby gem"
HOMEPAGE = "http://rubygems.org/gems/treetop"
SECTION = "devel/ruby"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=66842549b6a9b0f9ed52fe73608f66e4"

RDEPENDS_${PN} = "gem-polyglot"

SRC_URI_append = " file://gem-treetop-fix-duplicate-polyglot.patch"

inherit rubygems

SRC_URI[md5sum] = "87f30c0684d7760dce9feac8ff8bd869"
SRC_URI[sha256sum] = "ffa68f201c0f62c26b0a1d13233d73194400596964696843f87ebb5d812f12ff"

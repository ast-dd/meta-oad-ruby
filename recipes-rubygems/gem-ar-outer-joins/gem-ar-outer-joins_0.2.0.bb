DESCRIPTION = "A ruby gem"
HOMEPAGE = "http://rubygems.org/gems/ar-outer-joins"
SECTION = "devel/ruby"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://README.md;md5=77814106f8af8ff1879160e310acea73"
PR="r1"

RDEPENDS_${PN} = "gem-activerecord"

GEM_NAME = "ar_outer_joins"

inherit rubygems

SRC_URI[md5sum] = "03c5fd1c15f6af7b480329dfd6cf04d7"
SRC_URI[sha256sum] = "9b0b47a33e7f66bc4371f7bf92d848618e38a387d5ab2b6f1b1d56de297f635c"

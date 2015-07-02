SUMMARY = "Cron jobs in ruby."
DESCRIPTION = "Clean ruby syntax for writing and deploying cron jobs."
HOMEPAGE = "http://rubygems.org/gems/whenever"
SECTION = "devel/ruby"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

SRC_URI[md5sum] = "bbcda747f92a31663004128e19f6a952"
SRC_URI[sha256sum] = "33b6aa01f5a5e5dc979a498ae5f70e0fdc8ee4727072a9192e0190808ca70a40"

PR = "r0"

RDEPENDS_${PN} = "\
    gem-chronic \
"

inherit rubygems


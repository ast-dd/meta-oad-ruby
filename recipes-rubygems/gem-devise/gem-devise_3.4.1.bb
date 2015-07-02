SUMMARY = "Flexible authentication solution for Rails with Warden"
DESCRIPTION = "Flexible authentication solution for Rails with Warden"
HOMEPAGE = "http://rubygems.org/gems/devise"
SECTION = "devel/ruby"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

SRC_URI[md5sum] = "8073b90ffeb9b92ab491cd3fccecf842"
SRC_URI[sha256sum] = "4316a42583f56d44059a5818941035ddd46deed33dd15c365ad281a3872636e4"

PR = "r0"

RDEPENDS_${PN} = "\
    gem-bcrypt \
    gem-orm-adapter \
    gem-railties \
    gem-responders \
    gem-thread-safe \
    gem-warden \
"

inherit rubygems


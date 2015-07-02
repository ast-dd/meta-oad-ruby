SUMMARY = "A monkey patch to speed up Rails' JSON generation time."
DESCRIPTION = "A monkey patch to speed up Rails' JSON generation time."
HOMEPAGE = "http://rubygems.org/gems/rails-patch-json-encode"
SECTION = "devel/ruby"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

SRC_URI[md5sum] = "01f433b86e259c08e1bd69b7e538060f"
SRC_URI[sha256sum] = "646466b367f6a1ac211ddeb329e203ccb74964ea660b3e85c0321f4d551ab332"

PR = "r0"

RDEPENDS_${PN} = "\
    gem-multi-json \
"

inherit rubygems


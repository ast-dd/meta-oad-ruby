DESCRIPTION = "A ruby gem"
HOMEPAGE = "http://rubygems.org/gems/hiredis"
SECTION = "devel/ruby"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://COPYING;md5=39e16be5904ac48d24b3e28c923f77f3"

SRC_URI_append = " file://${BPN}-${PV}.patch"

FILES_${PN}-staticdev = "${GEM_DIR}/gems/${GEM_NAME}-${GEM_VERSION}/vendor"

inherit rubygems

SRC_URI[md5sum] = "48f801871daeda53b6dafb7aaa1fb195"
SRC_URI[sha256sum] = "453ae038b86f64613f197c7182b056bad02240060cda3644f0e90b6b2e4a2e82"

SUMMARY = "Simple testing API built on Rack"
DESCRIPTION = "Rack::Test is a small, simple testing API for Rack apps. It can be used on its \
own or as a reusable starting point for Web frameworks and testing libraries \
to build on. Most of its initial functionality is an extraction of Merb 1.0's \
request helpers feature."
HOMEPAGE = "http://rubygems.org/gems/rack-test"
SECTION = "devel/ruby"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://MIT-LICENSE.txt;md5=b010b2c949f753e8e9ee5c14c0e97180"

SRC_URI[md5sum] = "c7db48faa3d1887198f7ce56726990e8"
SRC_URI[sha256sum] = "ff60b122e2940e32e94a2e4a61bceb8d9c99a97c1817ecc47e535522b02cdd40"

PR = "r0"

RDEPENDS_${PN} = "\
    gem-rack \
"

inherit rubygems


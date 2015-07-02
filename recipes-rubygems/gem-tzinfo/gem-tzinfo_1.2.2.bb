SUMMARY = "Daylight savings aware timezone library"
DESCRIPTION = "TZInfo provides daylight savings aware transformations between times in different time zones."
HOMEPAGE = "http://rubygems.org/gems/tzinfo"
SECTION = "devel/ruby"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=2808f34d0c2c34a07a19ed76efcf7a86"


SRC_URI[md5sum] = "972fe2c6d57be47edb144c51340fd428"
SRC_URI[sha256sum] = "fdb1d3fdf2776d490c82a0e589a08e7cbde70ac1ae7d2b1f0b7e77f3e6b801b0"

PR = "r2"

RDEPENDS_${PN} = "\
    gem-thread-safe \
"

inherit rubygems


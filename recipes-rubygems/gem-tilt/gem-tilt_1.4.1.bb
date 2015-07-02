DESCRIPTION = "A ruby gem"
HOMEPAGE = "http://rubygems.org/gems/tilt"
SECTION = "devel/ruby"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING;md5=adef2b571ef2a275250c2b2dbee3f076"

SRC_URI_append = " file://gem-tilt-fix-rdoc-require.patch"

inherit rubygems

SRC_URI[md5sum] = "63f659f48d31c50d2565fb8b10554d8f"
SRC_URI[sha256sum] = "39820562c4f5db45fe18de87ccc30a0e77a998bf5334b1d8c10a2f7dbc1f5903"

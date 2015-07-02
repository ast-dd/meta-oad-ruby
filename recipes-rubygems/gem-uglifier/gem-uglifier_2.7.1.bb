SUMMARY = "Ruby wrapper for UglifyJS JavaScript compressor"
DESCRIPTION = "Uglifier minifies JavaScript files by wrapping UglifyJS to be accessible in Ruby"
HOMEPAGE = "http://rubygems.org/gems/uglifier"
SECTION = "devel/ruby"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=31050542a772ccf08072030992562c8d"

SRC_URI[md5sum] = "53a3543d5f695f919cd907e8105c6763"
SRC_URI[sha256sum] = "9a5168195314d2b5facc25b40db8eec2d5510b77bc27c85c72427b209adbdda0"

PR = "r1"

RDEPENDS_${PN} = "\
    gem-execjs \
    gem-json \
"

inherit rubygems


SUMMARY = "Rack-based asset packaging system"
DESCRIPTION = "Sprockets is a Rack-based asset packaging system that concatenates and serves JavaScript, CoffeeScript, CSS, LESS, Sass, and SCSS."
HOMEPAGE = "http://rubygems.org/gems/sprockets"
SECTION = "devel/ruby"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1c4c534da4d716e99e102becaddf7810"

SRC_URI[md5sum] = "37e855faaba368ee3c78c7ec8d49f5d7"
SRC_URI[sha256sum] = "c25a4a37c9436e5a2c877b926156bce1826a0156d9cd96ca704ab085726ec2ae"

PR = "r1"

RDEPENDS_${PN} = "\
    gem-hike \
    gem-multi-json \
    gem-rack \
    gem-tilt \
"

inherit rubygems


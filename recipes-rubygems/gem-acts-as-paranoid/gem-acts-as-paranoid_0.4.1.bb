DESCRIPTION = "A ruby gem"
HOMEPAGE = "http://rubygems.org/gems/acts-as-paranoid"
SECTION = "devel/ruby"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5666fdf2c103d15f07751b7899158361"
PR="r1"

RDEPENDS_${PN} = "gem-activerecord"

GEM_NAME = "acts_as_paranoid"

inherit rubygems

SRC_URI[md5sum] = "18039ac227f2e5daf4a0a7c5ea0ee46b"
SRC_URI[sha256sum] = "dc657720e2c2bb0a894fbd81510bdb417521e8bcab325c57e2576b36a606732d"

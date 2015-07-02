SUMMARY = "An awesome nested set implementation for Active Record"
DESCRIPTION = "An awesome nested set implementation for Active Record"
HOMEPAGE = "http://rubygems.org/gems/awesome_nested_set"
SECTION = "devel/ruby"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://MIT-LICENSE;md5=1b3ba8f12754425e1ff653e219e524e6"

SRC_URI[md5sum] = "33b5d148b36672410ee573f8db237b9f"
SRC_URI[sha256sum] = "cfb9a09298b12b7ea0739f7a810d8cb57f1df0b72626a978f975a2460923c8c4"

PR = "r0"

RDEPENDS_${PN} = "\
    gem-activerecord \
"

inherit rubygems

GEM_NAME = "awesome_nested_set"

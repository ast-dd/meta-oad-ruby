SUMMARY = "A common interface to multiple JSON libraries."
DESCRIPTION = "A common interface to multiple JSON libraries, including Oj, Yajl, the JSON gem (with C-extensions), the pure-Ruby JSON gem, NSJSONSerialization, gson.rb, JrJackson, and OkJson."
HOMEPAGE = "http://rubygems.org/gems/multi_json"
SECTION = "devel/ruby"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=77e7a5e1b7c128037628b4bc5324c64a"

SRC_URI[md5sum] = "d9b22b25fd249e2b075cbac2ece6625b"
SRC_URI[sha256sum] = "b43f3e049cf24e29402e580de816ce1b68e941d180c866879b0b4176c285e3d5"

PR = "r2"

inherit rubygems

GEM_NAME = "multi_json"

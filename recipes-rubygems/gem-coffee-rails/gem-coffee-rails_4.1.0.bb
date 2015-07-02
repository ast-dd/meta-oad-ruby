SUMMARY = "CoffeeScript adapter for the Rails asset pipeline."
DESCRIPTION = "CoffeeScript adapter for the Rails asset pipeline."
HOMEPAGE = "http://rubygems.org/gems/coffee-rails"
SECTION = "devel/ruby"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://MIT-LICENSE;md5=65055b220bd23f1722e9710016fa701a"

SRC_URI[md5sum] = "66196271e4923f97484149a14dcf6a19"
SRC_URI[sha256sum] = "1adbc3d1e3e4d835643e7848b3279a7a1deadd8711be6a41bac1eb4788867f5c"

PR = "r0"

RDEPENDS_${PN} = "\
    gem-coffee-script \
    gem-railties \
"

inherit rubygems


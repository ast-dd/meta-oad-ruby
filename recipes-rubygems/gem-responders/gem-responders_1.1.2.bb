SUMMARY = "A set of Rails responders to dry up your application"
DESCRIPTION = "A set of Rails responders to dry up your application"
HOMEPAGE = "http://rubygems.org/gems/responders"
SECTION = "devel/ruby"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

SRC_URI[md5sum] = "6aacfa9e939a5efad2769e38cd328c22"
SRC_URI[sha256sum] = "6e78286742e728eb1c56e6d5ee91905ca7390bfffc9b7c42824acde0663a029d"

PR = "r0"

RDEPENDS_${PN} = "\
    gem-railties \
"

inherit rubygems


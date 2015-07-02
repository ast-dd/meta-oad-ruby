SUMMARY = "Sprockets Rails integration"
HOMEPAGE = "http://rubygems.org/gems/sprockets-rails"
SECTION = "devel/ruby"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

SRC_URI[md5sum] = "8a49edf5f6f29a3066291e137f2df1b6"
SRC_URI[sha256sum] = "ec11878bd0f07aba4063eca24ec3327b9e1fff04f24b66f37e4e6386c66b4c9c"

PR = "r0"

RDEPENDS_${PN} = "\
    gem-actionpack \
    gem-activesupport \
    gem-sprockets \
"

inherit rubygems


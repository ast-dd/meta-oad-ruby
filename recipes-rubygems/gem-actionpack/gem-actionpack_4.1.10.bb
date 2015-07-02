SUMMARY = "Web-flow and rendering framework putting the VC in MVC (part of Rails)."
DESCRIPTION = "Web apps on Rails. Simple, battle-tested conventions for building and testing MVC web applications. Works with any Rack-compatible server."
HOMEPAGE = "http://rubygems.org/gems/actionpack"
SECTION = "devel/ruby"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

SRC_URI[md5sum] = "13395b83f8b4f529fdf18cbb599a109f"
SRC_URI[sha256sum] = "383fbbc9db04529b15765d4b3236980b8f0c7e050128a467c2dece76b9dea29e"

PR = "r1"

RDEPENDS_${PN} = "\
    gem-actionview \
    gem-activesupport \
    gem-rack \
    gem-rack-test \
"

inherit rubygems


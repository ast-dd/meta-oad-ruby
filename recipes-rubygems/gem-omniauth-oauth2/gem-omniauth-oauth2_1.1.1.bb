DESCRIPTION = "A ruby gem"
HOMEPAGE = "http://rubygems.org/gems/omniauth-oauth2"
SECTION = "devel/ruby"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"
PR="r1"

RDEPENDS_${PN} = "gem-oauth2 \
                  gem-omniauth"

inherit rubygems

SRC_URI[md5sum] = "803db2a582cd8761d62e15593b02ce6b"
SRC_URI[sha256sum] = "72b8ba77b9ead4320e7f4e430aee0f3ef759aed79ae52c3b0e8fb2f41785eb68"

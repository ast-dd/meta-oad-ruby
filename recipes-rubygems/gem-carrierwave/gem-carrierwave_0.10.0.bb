DESCRIPTION = "A ruby gem"
HOMEPAGE = "http://rubygems.org/gems/carrierwave"
SECTION = "devel/ruby"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"
PR="r1"

RDEPENDS_${PN} = "gem-activemodel \
                  gem-activesupport \
                  gem-json \
                  gem-mime-types"

inherit rubygems

SRC_URI[md5sum] = "e7d2c7716efe5e8ec4dfd98526598fb0"
SRC_URI[sha256sum] = "206fcdbf9e4bd6f8545718d693e461a59ba9e31aa1ff815a83b56ccd763a2141"

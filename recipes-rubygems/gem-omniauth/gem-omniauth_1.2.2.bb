SUMMARY = "A generalized Rack framework for multiple-provider authentication."
DESCRIPTION = "A generalized Rack framework for multiple-provider authentication."
HOMEPAGE = "http://rubygems.org/gems/omniauth"
SECTION = "devel/ruby"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=bcf4d840c68e250bb519abfd2b409fa6"

SRC_URI[md5sum] = "f637adfe2b1438b9d14c9608d671af96"
SRC_URI[sha256sum] = "939eabc200dc19d624ad02020b9f9258a69429b2250b883e47ce2cf76c6a10b8"

PR = "r1"

RDEPENDS_${PN} = "\
    gem-hashie \
    gem-rack \
"

inherit rubygems


SUMMARY = "HTTP/REST API client library."
HOMEPAGE = "http://rubygems.org/gems/faraday"
SECTION = "devel/ruby"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=f600b8cbd186e6e8f1b74fc86889da86"

SRC_URI[md5sum] = "046e7ddb8ae4dc1142a9114b5386d6bb"
SRC_URI[sha256sum] = "5677350808cae1d7ee526fe8f78381c134193173292281ef63faf6efacfd63c0"

PR = "r0"

RDEPENDS_${PN} = "\
    gem-multipart-post \
"

inherit rubygems


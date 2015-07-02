SUMMARY = "Simple HTTP and REST client for Ruby, inspired by microframework syntax for specifying actions."
DESCRIPTION = "A simple HTTP and REST client for Ruby, inspired by the Sinatra microframework style of specifying actions: get, put, post, delete."
HOMEPAGE = "http://rubygems.org/gems/rest-client"
SECTION = "devel/ruby"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8d4c0cdd6bc54a36dbe54c0f2fa70797"

SRC_URI[md5sum] = "394f7933e557735c6ee144d37db9bbc0"
SRC_URI[sha256sum] = "e70e4fe5660181fe5c6909de06f7b716931b433f5748f3713c841be709031fd5"

PR = "r0"

RDEPENDS_${PN} = "\
    gem-http-cookie \
    gem-mime-types \
    gem-netrc \
"

inherit rubygems


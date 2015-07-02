SUMMARY = "Puma is a simple, fast, threaded, and highly concurrent HTTP 1.1 server for Ruby/Rack applications"
DESCRIPTION = "Puma is a simple, fast, threaded, and highly concurrent HTTP 1.1 server for Ruby/Rack applications. Puma is intended for use in both development and production environments. In order to get the best throughput, it is highly recommended that you use a  Ruby implementation with real threads like Rubinius or JRuby."
HOMEPAGE = "http://rubygems.org/gems/puma"
SECTION = "devel/ruby"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8f57a3474822f4108f0191a46b424e92"

SRC_URI[md5sum] = "de4517c67817a3ec7a6d98942d666f85"
SRC_URI[sha256sum] = "19c15d2a9ab87182f49b8535e85254d6b79d0d5b316c0448e50a92b793e6e6a4"

PR = "r1"

DEPENDS = "openssl"
RDEPENDS_${PN} = "\
    bash \
    gem-rack \
"

inherit rubygems


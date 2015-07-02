DESCRIPTION = "A ruby gem"
HOMEPAGE = "http://rubygems.org/gems/websocket-rails"
SECTION = "devel/ruby"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://MIT-LICENSE;md5=b0d5d04880075164bc7b2af5415f85ea"

RDEPENDS_${PN} = "gem-em-synchrony \
                  gem-faye-websocket \
                  gem-hiredis \
                  gem-rack \
                  gem-rails \
                  gem-redis \
                  gem-thin"

inherit rubygems

SRC_URI[md5sum] = "f6ae0de0e2ee76d7c353a30ad9e734cc"
SRC_URI[sha256sum] = "3f9de35c52da88f3c4c0f93ac7d590f48cefb2a3fef6e9a5d1dcf879c4abfb96"

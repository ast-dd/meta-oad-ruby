DESCRIPTION = "A ruby gem"
HOMEPAGE = "http://rubygems.org/gems/dj-mon"
SECTION = "devel/ruby"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://MIT-LICENSE;md5=5f8937e217705b720dce6c4824cfcd04"

RDEPENDS_${PN} = "gem-haml \
                  gem-rails \
                 "

GEM_NAME = "dj_mon"

inherit rubygems

SRC_URI[md5sum] = "e4b8439ce14c20c3f4dca3ff0a16b664"
SRC_URI[sha256sum] = "2db7871931d916b8745eb63992c20f9bab0ab0880bf93bd49da7c75d2bdc5798"

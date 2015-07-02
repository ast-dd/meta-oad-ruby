DESCRIPTION = "A ruby gem"
HOMEPAGE = "http://rubygems.org/gems/networkmanager-dbus"
SECTION = "devel/ruby"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://MIT-LICENSE;md5=3a0bacc1f333689dc3561ea726370412"

RDEPENDS_${PN} = "gem-ipaddress \
                  gem-ruby-dbus"

inherit rubygems

SRC_URI[md5sum] = "87e7156dc048de96e8841e0f9fefa9a0"
SRC_URI[sha256sum] = "d4a08e221e94ae4e3508f1cb97eb79c7109aee1bb757d850f610c103891c67df"

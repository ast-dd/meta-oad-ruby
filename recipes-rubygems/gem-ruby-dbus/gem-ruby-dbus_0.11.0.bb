DESCRIPTION = "A ruby gem"
HOMEPAGE = "http://rubygems.org/gems/ruby-dbus"
SECTION = "devel/ruby"
LICENSE = "LGPL-2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=fbc093901857fcd118f065f900982c24"
PR="r1"

RDEPENDS_${PN} = "\
    bash \
"

inherit rubygems

SRC_URI[md5sum] = "203dbef0a5e687fe78beb6aefe663b9e"
SRC_URI[sha256sum] = "1ff5854f31d4956cba8723a75b9203387c4ca5ed0f266e258d48a2984ac248bd"

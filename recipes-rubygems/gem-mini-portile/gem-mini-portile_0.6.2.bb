SUMMARY = "Simplistic port-like solution for developers"
DESCRIPTION = "Simplistic port-like solution for developers. It provides a standard and simplified way to compile against dependency libraries without messing up your system."
HOMEPAGE = "http://rubygems.org/gems/mini_portile"
SECTION = "devel/ruby"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

SRC_URI[md5sum] = "281cc0d974d3810d1195ad4a863ba5b6"
SRC_URI[sha256sum] = "5c60cd85db3df6b279e9a6807954c596dc0ced359a10fcd9b49969a6aa8d7d40"

PR = "r0"

inherit rubygems

GEM_NAME = "mini_portile"

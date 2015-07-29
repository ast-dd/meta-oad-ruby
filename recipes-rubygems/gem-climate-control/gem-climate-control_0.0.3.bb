SUMMARY = "Modify your ENV"
DESCRIPTION = "Modify your ENV"
HOMEPAGE = "https://github.com/thoughtbot/climate_control"
SECTION = "devel/ruby"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

SRC_URI[md5sum] = "00a9a61ffb4a5cce168ff5b3342c7c03"
SRC_URI[sha256sum] = "a5e8109935ad74e63ddbc20f37fb25f01737cd8a7dc99964d89ca26526b7334f"

PR = "r0"

inherit rubygems

GEM_NAME = "climate_control"

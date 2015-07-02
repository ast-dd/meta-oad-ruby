SUMMARY = "Ruby FFI"
DESCRIPTION = "Ruby FFI library"
HOMEPAGE = "http://rubygems.org/gems/ffi"
SECTION = "devel/ruby"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://COPYING;md5=0b4e3af2fd54eb00a94b967e6b927818 \
                    file://LICENSE;md5=dbb5a1cdfebf034d294baebfa68f56b5"

SRC_URI[md5sum] = "58e55c0eb9254a7f75bf9054423768f6"
SRC_URI[sha256sum] = "e9a01a41814ea6781750177d7d50209b8867c9e250d86c282f368bb4174a005e"

RDEPENDS_${PN} = "libffi"

PR = "r0"

inherit rubygems


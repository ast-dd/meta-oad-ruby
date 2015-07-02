require ruby.inc
PR = "${INC_PR}.0"

SRC_URI += "\
    file://ruby-2-disable-dtrace.patch \
    file://ruby-2-mkmf-verbose.patch \
    file://ruby-2-Makefile-for-cross-compile.patch \
    file://ruby-2-disable-versioned-paths.patch\
    file://ruby-2-fix-nil-spec.patch \
"
SRC_URI[md5sum] = "b49fc67a834e4f77249eb73eecffb1c9"
SRC_URI[sha256sum] = "5a4de38068eca8919cb087d338c0c2e3d72c9382c804fb27ab746e6c7819ab28"

LIC_FILES_CHKSUM = "\
    file://COPYING;md5=837b32593517ae48b9c3b5c87a5d288c \
    file://BSDL;md5=19aaf65c88a40b508d17ae4be539c4b5 \
    file://GPL;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
    file://LEGAL;md5=c440adb575ba4e6e2344c2630b6a5584 \
"

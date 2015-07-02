require ruby.inc
PR = "${INC_PR}.0"

SRC_URI += "\
    file://ruby-2-disable-dtrace.patch \
    file://ruby-2-mkmf-verbose.patch \
    file://ruby-2-Makefile-for-cross-compile.patch \
    file://ruby-2-disable-versioned-paths.patch\
"
SRC_URI[md5sum] = "df4c1b23f624a50513c7a78cb51a13dc"
SRC_URI[sha256sum] = "4305cc6ceb094df55210d83548dcbeb5117d74eea25196a9b14fa268d354b100"

LIC_FILES_CHKSUM = "\
    file://COPYING;md5=837b32593517ae48b9c3b5c87a5d288c \
    file://BSDL;md5=19aaf65c88a40b508d17ae4be539c4b5 \
    file://GPL;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
    file://LEGAL;md5=3ce1fae39fe573b818c0af162bce6579 \
"

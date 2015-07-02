SUMMARY = "OpenBSD's bcrypt() password hashing algorithm."
DESCRIPTION = "    bcrypt() is a sophisticated and secure hash algorithm designed by The OpenBSD project \
    for hashing passwords. The bcrypt Ruby gem provides a simple wrapper for safely handling \
    passwords. \
"
HOMEPAGE = "http://rubygems.org/gems/bcrypt"
SECTION = "devel/ruby"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

SRC_URI[md5sum] = "10521932110c607df4536136b92809e2"
SRC_URI[sha256sum] = "86d25b7eaec3db734bf681aa0e3d58e121766d75c849113aeb602549ff3f8e95"

PR = "r0"

inherit rubygems


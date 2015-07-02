SUMMARY = "minitest provides a complete suite of testing facilities supporting TDD, BDD, mocking, and benchmarking"
DESCRIPTION = " \
 \
minitest doesn't reinvent anything that ruby already provides, like: \
classes, modules, inheritance, methods. This means you only have to \
learn ruby to use minitest and all of your regular OO practices like \
extract-method refactorings still apply."
HOMEPAGE = "http://rubygems.org/gems/minitest"
SECTION = "devel/ruby"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

SRC_URI[md5sum] = "e85efaaa447b02613d1c113ba51f80b8"
SRC_URI[sha256sum] = "d63b3136cc48295a1e80b6a3fb3638c3024e632ce53107ad3cc3f3fa32b012c1"

PR = "r0"

inherit rubygems


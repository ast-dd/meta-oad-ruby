SUMMARY = "Get memory usage of a process in Ruby"
DESCRIPTION = "Get memory usage of a process in Ruby"
HOMEPAGE = "https://rubygems.org/gems/get_process_mem/"
SECTION = "devel/ruby"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

SRC_URI[md5sum] = "852e9a38fcc363d9a0be4e82e8eadb30"
SRC_URI[sha256sum] = "49c803f32b90d7dba27cae7bc6d7af18c9f76216fb4390ad50faadbbcc3eae08"

PR = "r0"

inherit rubygems

GEM_NAME = "get_process_mem"

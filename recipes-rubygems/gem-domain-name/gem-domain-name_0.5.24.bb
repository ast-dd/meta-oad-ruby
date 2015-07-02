SUMMARY = "Domain Name manipulation library for Ruby"
DESCRIPTION = "This is a Domain Name manipulation library for Ruby. \
 \
It can also be used for cookie domain validation based on the Public \
Suffix List. \
"
HOMEPAGE = "http://rubygems.org/gems/domain_name"
SECTION = "devel/ruby"
LICENSE = "MPL-1.1 & GPL-2.0 & LGPL-2.1"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=4c68eae14a38247dafecbdde79a46358"

SRC_URI[md5sum] = "e0dd8cf5599148233aebf08869328df2"
SRC_URI[sha256sum] = "8cbd6aea8859823f89aefeec49232e9d4377456fd42d08accfbc0cc6b32a55f6"

PR = "r0"

RDEPENDS_${PN} = "\
    gem-unf \
"

GEM_NAME = "domain_name"

inherit rubygems


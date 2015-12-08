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

SRC_URI[md5sum] = "6cc6db48dac4b72ce5de82b81316615a"
SRC_URI[sha256sum] = "5b492888a095f2f00027a268932c93d0432bf8ada568a5c601ff53ce6a761b9b"

PR = "r0"

RDEPENDS_${PN} = "\
    gem-unf \
"

GEM_NAME = "domain_name"

inherit rubygems


SUMMARY = "Module for the 'fog' gem to support Amazon Web Services."
DESCRIPTION = "This library can be used as a module for `fog` or as standalone provider \
                        to use the Amazon Web Services in applications.."
HOMEPAGE = "http://rubygems.org/gems/fog-aws"
SECTION = "devel/ruby"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

SRC_URI[md5sum] = "ef10347174d203e1cd0ed41ebdbe50b1"
SRC_URI[sha256sum] = "f16c80be530bdf2a98a4c1f0b14e0d5eba13993a9dd79cf3dc6f05e4aed6439d"

PR = "r0"

RDEPENDS_${PN} = "\
    gem-fog-core \
    gem-fog-json \
    gem-fog-xml \
    gem-ipaddress \
"

inherit rubygems


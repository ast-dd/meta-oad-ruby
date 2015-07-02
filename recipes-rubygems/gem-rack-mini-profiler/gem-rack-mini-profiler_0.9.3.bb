SUMMARY = "Profiles loading speed for rack applications."
DESCRIPTION = "Profiling toolkit for Rack applications with Rails integration. Client Side profiling, DB profiling and Server profiling."
HOMEPAGE = "http://rubygems.org/gems/rack-mini-profiler"
SECTION = "devel/ruby"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

SRC_URI[md5sum] = "1a08d68ff74c484e2d0d880ecef86476"
SRC_URI[sha256sum] = "bf77d53ab4e9fa29c6e402af51b6207983bab2e117d5151b9d2fe55ff8b635ff"

PR = "r0"

RDEPENDS_${PN} = "\
    gem-rack \
"

inherit rubygems


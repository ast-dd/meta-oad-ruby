SUMMARY = "posix-spawn uses posix_spawnp(2) for faster process spawning"
DESCRIPTION = "posix-spawn uses posix_spawnp(2) for faster process spawning"
HOMEPAGE = "https://github.com/rtomayko/posix-spawn"
SECTION = "devel/ruby"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

SRC_URI[md5sum] = "83ec826a6728d39dbb421f5b0b4d1569"
SRC_URI[sha256sum] = "b932835dd6eb241b255ba51767b68a58299abbb0fb344cb874dcd23d57b75414"

PR = "r0"

inherit rubygems


SUMMARY = "Foreign Keys for Rails"
DESCRIPTION = "Adds helpers to migrations and dumps foreign keys to schema.rb"
HOMEPAGE = "http://rubygems.org/gems/foreigner"
SECTION = "devel/ruby"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

SRC_URI[md5sum] = "f026f369994dc4caac431435d5ebaa65"
SRC_URI[sha256sum] = "6f6e7063f6459d5b014f048284cbf9307f260bed955b3868bbe050e37f22a9c4"

PR = "r1"

RDEPENDS_${PN} = "\
    gem-activerecord \
"

inherit rubygems


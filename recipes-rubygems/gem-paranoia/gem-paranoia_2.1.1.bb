SUMMARY = "Paranoia is a re-implementation of acts_as_paranoid for Rails 3, using much, much, much less code."
DESCRIPTION = " the record. Paranoia does this by setting a deleted_at field to the current time when you destroy a record, and hides it by scoping all queries on your model to only include records which do not have a deleted_at field."
HOMEPAGE = "http://rubygems.org/gems/paranoia"
SECTION = "devel/ruby"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

SRC_URI[md5sum] = "30a9c2a58daf78fe753b5fbff7df0ad5"
SRC_URI[sha256sum] = "62a09105ae59f0cd4ff1a7e689b95c8554517d34dda9a083909f8c2a1376e93b"

PR = "r0"

RDEPENDS_${PN} = "\
    gem-activerecord \
"

inherit rubygems


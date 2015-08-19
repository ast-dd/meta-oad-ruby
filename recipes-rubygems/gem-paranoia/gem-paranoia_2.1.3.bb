SUMMARY = "Paranoia is a re-implementation of acts_as_paranoid for Rails 3, using much, much, much less code."
DESCRIPTION = " the record. Paranoia does this by setting a deleted_at field to the current time when you destroy a record, and hides it by scoping all queries on your model to only include records which do not have a deleted_at field."
HOMEPAGE = "http://rubygems.org/gems/paranoia"
SECTION = "devel/ruby"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

SRC_URI[md5sum] = "a2f8f93e554647f5d012afeceb733e53"
SRC_URI[sha256sum] = "22d1c199f932821de19717a246502907c6a7b44ff427fbe962fc5ae4dafcd1ec"

PR = "r0"

RDEPENDS_${PN} = "\
    gem-activerecord \
"

inherit rubygems


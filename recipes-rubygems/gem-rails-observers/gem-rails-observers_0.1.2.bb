SUMMARY = "ActiveModel::Observer, ActiveRecord::Observer and ActionController::Caching::Sweeper extracted from Rails."
DESCRIPTION = "Rails observer (removed from core in Rails 4.0)"
HOMEPAGE = "http://rubygems.org/gems/rails-observers"
SECTION = "devel/ruby"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"


SRC_URI[md5sum] = "346b2722bcef9e6bda14c1567acad58d"
SRC_URI[sha256sum] = "9e71de73929a9a7e8cde83c041989bbb25914f84047ce15dde37eefa650a5cd3"

PR = "r0"

RDEPENDS_${PN} = "\
    gem-activemodel \
"

inherit rubygems


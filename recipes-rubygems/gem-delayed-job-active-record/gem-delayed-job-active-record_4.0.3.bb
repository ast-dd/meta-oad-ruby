SUMMARY = "ActiveRecord backend for DelayedJob"
DESCRIPTION = "ActiveRecord backend for Delayed::Job, originally authored by Tobias L\u{fc}tke"
HOMEPAGE = "http://rubygems.org/gems/delayed_job_active_record"
SECTION = "devel/ruby"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=35f32d4be1b2b77eb665d0ea1cfde923"

SRC_URI[md5sum] = "9a0669e8c97e26cf6434040e2393f19e"
SRC_URI[sha256sum] = "fdf6232811da75a3deed97359d3da9b4600e6008f5c065f6183290f0aaa4653a"

PR = "r0"

RDEPENDS_${PN} = "\
    gem-activerecord \
    gem-delayed-job \
"

inherit rubygems

GEM_NAME = "delayed_job_active_record"

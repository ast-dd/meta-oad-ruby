SUMMARY = "Database-backed asynchronous priority queue system -- Extracted from Shopify"
DESCRIPTION = "Delayed_job (or DJ) encapsulates the common pattern of asynchronously executing longer tasks in the background. It is a direct extraction from Shopify where the job table is responsible for a multitude of core tasks."
HOMEPAGE = "http://rubygems.org/gems/delayed_job"
SECTION = "devel/ruby"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=35f32d4be1b2b77eb665d0ea1cfde923"

SRC_URI[md5sum] = "faf13856ddd2c03ff77c4c3c26ae4400"
SRC_URI[sha256sum] = "ac8033f89b43cf15c8c4d39e62788e31676275fb2b8342167d21462218846eb6"

PR = "r0"

RDEPENDS_${PN} = "\
    gem-activesupport \
"

inherit rubygems

GEM_NAME = "delayed_job"

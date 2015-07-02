SUMMARY = "Integration of Plupload 2.1.1 with the Rails asset pipeline"
DESCRIPTION = "This gem integrates Plupload 2.1.1 with the Rails asset pipeline."
HOMEPAGE = "http://rubygems.org/gems/plupload-rails"
SECTION = "devel/ruby"
LICENSE = "MIT & GPL-2.0"
LIC_FILES_CHKSUM = "file://MIT-LICENSE.txt;md5=3e75afc1cf2731f1d465f2150d6247b7 \
                    file://GPL-LICENSE.txt;md5=4e5d6fc4fb57eb64189113f37a5a7f0b"

SRC_URI[md5sum] = "46a5227d9e62b2918e834e0762ae8e3e"
SRC_URI[sha256sum] = "9b8ee425273a4e391cc07b9f4f0429a2252bcc67d020d90edea1d1a5b8a17bef"

PR = "r1"

RDEPENDS_${PN} = "\
    gem-rails \
"

inherit rubygems


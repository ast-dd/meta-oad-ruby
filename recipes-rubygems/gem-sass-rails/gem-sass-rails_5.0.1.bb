SUMMARY = "Sass adapter for the Rails asset pipeline."
DESCRIPTION = "Sass adapter for the Rails asset pipeline."
HOMEPAGE = "http://rubygems.org/gems/sass-rails"
SECTION = "devel/ruby"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://MIT-LICENSE;md5=bbe542225491edcada3bf1f744b4ea54"

SRC_URI[md5sum] = "e758a8458fc06b25acb7c37d0ee0ddd4"
SRC_URI[sha256sum] = "73820862a8a08c9d04d912f0d0aeddca85bd3c7e89808aa16a57ba41b077d992"

PR = "r0"

RDEPENDS_${PN} = "\
    gem-railties \
    gem-sass \
    gem-sprockets \
    gem-sprockets-rails \
    gem-tilt \
"

inherit rubygems


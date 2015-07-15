SUMMARY = "a modular Ruby webserver interface"
DESCRIPTION = "Rack provides a minimal, modular and adaptable interface for developing \
web applications in Ruby.  By wrapping HTTP requests and responses in \
the simplest way possible, it unifies and distills the API for web \
servers, web frameworks, and software in between (the so-called \
middleware) into a single method call. \
 \
Also see http://rack.github.com/. \
"
HOMEPAGE = "http://rubygems.org/gems/rack"
SECTION = "devel/ruby"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING;md5=53d9c9f5c6fd716007e621045f6caa49"

SRC_URI[md5sum] = "02067ea717f5d2e4b8e0bcd5155fcbc5"
SRC_URI[sha256sum] = "e64af00234e8faaa69ea81ef4e3800f40743c69560f0dda8fc9969660e775fa7"

PR = "r0"

SRC_URI_append = " file://gem-rack-temp_file_reaper.patch"

inherit rubygems


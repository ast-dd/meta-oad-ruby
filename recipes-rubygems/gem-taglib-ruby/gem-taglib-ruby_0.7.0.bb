SUMMARY = "Ruby interface for the taglib C++ library"
DESCRIPTION = "Ruby interface for the taglib C++ library, for reading and writing \
meta-data (tags) of many audio formats. \
 \
In contrast to other libraries, this one wraps the C++ API using SWIG, \
not only the minimal C API. This means that all tags can be accessed. \
"
HOMEPAGE = "http://rubygems.org/gems/taglib-ruby"
SECTION = "devel/ruby"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=1ea06e7afba8486a6dce1d2697f561c1"

DEPENDS = "taglib"
RDEPENDS_${PN} = "taglib"

inherit rubygems

SRC_URI = "git://github.com/voxtok/taglib-ruby.git;branch=stable \
           file://remove-local-path.patch \
"

SRCREV = "9fbc5aa569d976dd1d5f2c9145f6b76a0e7e506c"
PV = "${GEM_VERSION}+git${SRCPV}"

S = "${WORKDIR}/git"

GEM_VERSION = "0.7.0"
GEM_SPEC_FILE = "${GEM_NAME}.gemspec"


SUMMARY = "A powerful but elegant CSS compiler that makes CSS fun again."
DESCRIPTION = "      Sass makes CSS fun again. Sass is an extension of CSS3, adding \
      nested rules, variables, mixins, selector inheritance, and more. \
      It's translated to well-formatted, standard CSS using the \
      command line tool or a web-framework plugin. \
"
HOMEPAGE = "http://rubygems.org/gems/sass"
SECTION = "devel/ruby"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

SRC_URI[md5sum] = "61a18b38136685527e1672939b4d32db"
SRC_URI[sha256sum] = "2f1e913f5845e6d3a6beebca01a25dd703bccde68b19109dbde7e41e4895b373"

PR = "r1"

inherit rubygems


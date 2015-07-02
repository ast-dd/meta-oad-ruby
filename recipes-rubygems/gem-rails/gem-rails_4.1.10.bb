SUMMARY = "Full-stack web application framework."
DESCRIPTION = "Ruby on Rails is a full-stack web framework optimized for programmer happiness and sustainable productivity. It encourages beautiful code by favoring convention over configuration."
HOMEPAGE = "http://rubygems.org/gems/rails"
SECTION = "devel/ruby"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI[md5sum] = "41b9975436db3d1bf9271cc62b6717ce"
SRC_URI[sha256sum] = "9f81f8b716ba76ea768b1c0ed4a185a3f7647b384fc297c26c2b51be82856fd3"

PR = "r1"

RDEPENDS_${PN} = "\
    gem-actionmailer \
    gem-actionpack \
    gem-actionview \
    gem-activemodel \
    gem-activerecord \
    gem-activesupport \
    gem-bundler \
    gem-railties \
    gem-sprockets-rails \
"

inherit rubygems


SUMMARY = "Object-relational mapper framework (part of Rails)."
DESCRIPTION = "Databases on Rails. Build a persistent domain model by mapping database tables to Ruby classes. Strong conventions for associations, validations, aggregations, migrations, and testing come baked-in."
HOMEPAGE = "http://rubygems.org/gems/activerecord"
SECTION = "devel/ruby"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://MIT-LICENSE;md5=81b3601494b8bbd884f94c867713c6a2"

SRC_URI[md5sum] = "64e79fa1d3b961cd319d52123d17e947"
SRC_URI[sha256sum] = "a4ab57ff0183a630b46c2fb1c8700cc139f45808b81e4650d6f235102e3d9ae6"

PR = "r1"

RDEPENDS_${PN} = "\
    gem-activemodel \
    gem-activesupport \
    gem-arel \
"

inherit rubygems


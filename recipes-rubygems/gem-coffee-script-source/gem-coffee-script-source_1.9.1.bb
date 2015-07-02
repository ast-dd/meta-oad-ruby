SUMMARY = "The CoffeeScript Compiler"
DESCRIPTION = "    CoffeeScript is a little language that compiles into JavaScript. \
    Underneath all of those embarrassing braces and semicolons, \
    JavaScript has always had a gorgeous object model at its heart. \
    CoffeeScript is an attempt to expose the good parts of JavaScript \
    in a simple way. \
"
HOMEPAGE = "http://rubygems.org/gems/coffee-script-source"
SECTION = "devel/ruby"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI[md5sum] = "77b7249504e573863aa9212d36199ffb"
SRC_URI[sha256sum] = "f37b1f38dc80dfd31ce2ea12e8f1eb072dbfdd6432dde5883361178a23462397"

PR = "r2"

inherit rubygems


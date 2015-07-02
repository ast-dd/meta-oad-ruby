DESCRIPTION = "A ruby gem"
HOMEPAGE = "http://rubygems.org/gems/mysql2"
SECTION = "devel/ruby"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://MIT-LICENSE;md5=13d9c1071f19c47fe528a77109e63a61"

DEPENDS = "mariadb"

GEM_OPTIONS = "--with-mysql-rpath=/usr/lib"

INSANE_SKIP_${PN} = "rpaths"

inherit rubygems

SRC_URI[md5sum] = "a94a0945c69e69b8f6d93ca945ef2357"
SRC_URI[sha256sum] = "c69c5f08532cdd58e5f7dccaad7ac132edaa271dd2c8d69711cf5ce3c8f858e1"

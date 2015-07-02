DESCRIPTION = "A ruby gem"
HOMEPAGE = "http://rubygems.org/gems/fog"
SECTION = "devel/ruby"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"
PR="r1"

RDEPENDS_${PN} = "gem-fog-brightbox \
                  gem-fog-core \
                  gem-fog-json \
                  gem-nokogiri \
                 "

inherit rubygems

SRC_URI[md5sum] = "56d23180b91b8274fa4e9a69a6fe324a"
SRC_URI[sha256sum] = "ee28b0bae7004a98e139f65d8fe606d666534f4b5f96cef247bdd0374ec10b92"

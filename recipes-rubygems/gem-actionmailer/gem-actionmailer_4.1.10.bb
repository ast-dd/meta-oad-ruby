SUMMARY = "Email composition, delivery, and receiving framework (part of Rails)."
DESCRIPTION = "Email on Rails. Compose, deliver, receive, and test emails using the familiar controller/view pattern. First-class support for multipart email and attachments."
HOMEPAGE = "http://rubygems.org/gems/actionmailer"
SECTION = "devel/ruby"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

SRC_URI[md5sum] = "a2874468191dc7b8bb8aa29c4edf6eec"
SRC_URI[sha256sum] = "4d771e1042dc40148f7d13e9776bd3df4d7a1f116c7991b33b3ee5ade2771edf"

PR = "r1"

RDEPENDS_${PN} = "\
    gem-actionpack \
    gem-actionview \
    gem-mail \
"

inherit rubygems


SUMMARY = "The mime-types library provides a library and registry for information about MIME content type definitions"
DESCRIPTION = "The mime-types library provides a library and registry for information about \
MIME content type definitions. It can be used to determine defined filename \
extensions for MIME types, or to use filename extensions to look up the likely \
MIME type definitions. \
 \
MIME content types are used in MIME-compliant communications, as in e-mail or \
HTTP traffic, to indicate the type of content which is transmitted. The \
mime-types library provides the ability for detailed information about MIME \
entities (provided as an enumerable collection of MIME::Type objects) to be \
determined and used programmatically. There are many types defined by RFCs and \
vendors, so the list is long but by definition incomplete; don't hesitate to \
add additional type definitions (see Contributing.rdoc). The primary sources \
for MIME type definitions found in mime-types is the \
{IANA Media Types registry}[https://www.iana.org/assignments/media-types/media-types.xhtml], \
RFCs, and W3C recommendations. It conforms to RFCs 2045 and 2231. \
 \
This is release 2.5 with a couple of bug fixes, updating to the latest IANA \
type registry, and adding a user-contributed type. mime-types 2.x supports Ruby \
1.9.2 or later."
HOMEPAGE = "http://rubygems.org/gems/mime-types"
SECTION = "devel/ruby"
LICENSE = "GPL-2.0 & MIT & Artistic-2.0"
LIC_FILES_CHKSUM = "file://Licence.rdoc;md5=ea44698b8e6523aa4ebc4e71e0ed43f1"

SRC_URI[md5sum] = "4ce330a56f80b50a982fbb37613503d2"
SRC_URI[sha256sum] = "229fbe5d9682c2b360dde81b92e98e1deec021d88bdb5e51cded8f96b8c7537e"

PR = "r0"

inherit rubygems


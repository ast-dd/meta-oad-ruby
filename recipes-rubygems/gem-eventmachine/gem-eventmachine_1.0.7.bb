SUMMARY = "Ruby/EventMachine library"
DESCRIPTION = "EventMachine implements a fast, single-threaded engine for arbitrary network \
communications. It's extremely easy to use in Ruby. EventMachine wraps all \
interactions with IP sockets, allowing programs to concentrate on the \
implementation of network protocols. It can be used to create both network \
servers and clients. To create a server or client, a Ruby program only needs \
to specify the IP address and port, and provide a Module that implements the \
communications protocol. Implementations of several standard network protocols \
are provided with the package, primarily to serve as examples. The real goal \
of EventMachine is to enable programs to easily interface with other programs \
using TCP/IP, especially if custom protocols are required."
HOMEPAGE = "http://rubygems.org/gems/eventmachine"
SECTION = "devel/ruby"
LICENSE = "GPL-2.0 & Ruby"
LIC_FILES_CHKSUM = "file://GNU;md5=904005457611884b150f6bda894a505e \
                    file://LICENSE;md5=270149a18e664d261350cfe727055898"

SRC_URI[md5sum] = "4ebc0573429b9db4bf138f4235d0e3f9"
SRC_URI[sha256sum] = "342b7dfa2bc1d43f9b58c4481d81cc9eb5f7c92a5d0eb39739459fcbdd579d4c"

PR = "r0"

inherit rubygems


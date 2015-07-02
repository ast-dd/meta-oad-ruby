SUMMARY = "A toolkit to create and control daemons in different ways"
DESCRIPTION = "    Daemons provides an easy way to wrap existing ruby scripts (for example a \
    self-written server)  to be run as a daemon and to be controlled by simple \
    start/stop/restart commands. \
 \
    You can also call blocks as daemons and control them from the parent or just \
    daemonize the current process. \
 \
    Besides this basic functionality, daemons offers many advanced features like \
    exception backtracing and logging (in case your ruby script crashes) and \
    monitoring and automatic restarting of your processes if they crash. \
"
HOMEPAGE = "http://rubygems.org/gems/daemons"
SECTION = "devel/ruby"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ee16fb84a9169fdb53f0f2de95f997c9"

SRC_URI[md5sum] = "41d6b110eb76880c3741d271dfb4cb0f"
SRC_URI[sha256sum] = "237950b2d098dd016e5055a9f19bda3eaac5964b1baaa9e7394901b4f322eaae"

PR = "r0"

inherit rubygems


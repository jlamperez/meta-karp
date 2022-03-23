DESCRIPTION = "This project maintains the Linux Console tools, which include \
               utilities to test and configure joysticks, connect legacy devices \
               to the kernel's input subsystem (providing support for serial \
               mice, touchscreens etc.), and test the input event layer."
HOMEPAGE = "http://sourceforge.net/projects/linuxconsole/"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"

SRC_URI[sha256sum] = "bd4d4b7e37da02fc67e47ddf20b6f1243c0a7af7b02b918d5e72138ea8727547"
SRC_URI = "${SOURCEFORGE_MIRROR}/linuxconsole/linuxconsoletools-1.7.1.tar.bz2"

do_compile() {
    cd utils
    make jstest
    cd ..
}

do_install() {
    install -d ${D}${bindir}
    install -m 0755 utils/jstest ${D}${bindir}
}
SUMMARY = "sixad can connect PS3 hardware (Sixaxis/DualShock3, Keypads and \
           Remotes) to a Linux-compatible machine"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=751419260aa954499f7abaabaa882bbe"

SRCREV = "7ddb281ceed92da0c20caab37580d77c782d0657"
SRC_URI = "git://github.com/jlamperez/sixad;protocol=https"

EXTRA_OEMAKE = "GASIA_GAMEPAD_HACKS=1"

DEPENDS = "libusb bluez5"
RDEPENDS_${PN} += "bash"

inherit pkgconfig

S = "${WORKDIR}/git"

do_install() {
    oe_runmake install DESTDIR=${D}
}

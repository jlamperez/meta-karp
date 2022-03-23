SUMMARY = "Realtek 802.11n WLAN Adapter Linux driver"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://${WORKDIR}/git/LICENSE;md5=ca671256c791bbbf7c985ca88dc89fc9"

inherit module

SRCREV = "cf05bfaee0f1a811fb165fc2e90465c564774383"
SRC_URI = "git://github.com/jlamperez/8821au-20210708.git;branch=main \
           file://0001-Compile-for-kria-kv26-platform.patch \
           file://0002-Use-modules_install-as-wanted-by-yocto.patch"

S = "${WORKDIR}/git"

export KSRC = "${STAGING_KERNEL_DIR}"
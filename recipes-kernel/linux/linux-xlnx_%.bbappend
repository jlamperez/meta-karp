FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_append = " file://bsp.cfg \
                   file://Add-hidsony-gasiafix.patch \
                 "
KERNEL_FEATURES_append = " bsp.cfg"

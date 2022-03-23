#
# This file is the benchmark-b4096 recipe.
#

SUMMARY = "Simple benchmark-b4096 to use fpgamanager class"
SECTION = "PETALINUX/apps"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit fpgamanager_custom
FPGA_MNGR_RECONFIG_ENABLE = "1"

SRC_URI = "file://kv260-benchmark-b4096.bit \
           file://kv260-benchmark-b4096.xclbin \
           file://shell.json \
           file://kv260-benchmark-b4096.dtsi \
           "

S = "${WORKDIR}"

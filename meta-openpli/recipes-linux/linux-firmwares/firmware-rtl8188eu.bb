LICENSE = "CLOSED"

DESCRIPTION = "Firmware for RTL8188EU"

inherit gitpkgv

SRC_URI = "https://github.com/lwfinger/rtl8188eu.git;protocol=https"



S = "${WORKDIR}/git"

do_install() {
	install -d ${D}${base_libdir}/firmware/rtlwifi
	install -m 0644 rtl8188eufw.bin ${D}/${base_libdir}/firmware/rtlwifi/
}

PACKAGES = "${PN}"
FILES_${PN} += "${base_libdir}/firmware"

PACKAGE_ARCH = "all"

SRC_URI[md5sum] = "93d5200fc2ea98fb75562a800cdd6a6b"
SRC_URI[sha256sum] = "c6a140628c5bfb1210a741975cfe5e28c11ab3cd206020d2e7e2f13cb330987c"

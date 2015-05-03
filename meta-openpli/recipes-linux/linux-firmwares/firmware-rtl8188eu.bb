LICENSE = "CLOSED"

DESCRIPTION = "Firmware for RTL8188EU"

SRC_URI = "git://github.com/lwfinger/rtl8188eu.git;protocol=git"

S = "${WORKDIR}/git"

do_install() {
	install -d ${D}${base_libdir}/firmware/rtlwifi
	install -m 0644 rtlwifi/rtl8188eufw.bin ${D}/${base_libdir}/firmware/rtlwifi/
}

PACKAGES = "${PN}"
FILES_${PN} += "${base_libdir}/firmware"

PACKAGE_ARCH = "all"

DESCRIPTION = "Backup Suite"
LICENSE = "GPLv2"

LIC_FILES_CHKSUM = "file://usr/lib/enigma2/python/Plugins/Extensions/BackupSuite/GNU_LICENSE.txt;md5=8aab2037d6ccded90e5a3a3849bc60dc"

SRC_URI = "git://github.com/openmb/BackupSuite.git"

inherit gitpkgv

S = "${WORKDIR}/git"
SRC = "${S}/usr/lib/enigma2/python/Plugins/Extensions/BackupSuite"
DEST = "${D}/usr/lib/enigma2/python/Plugins/Extensions/BackupSuite"

PV = "1.0+git${SRCPV}"
PKGV = "1.0+git${GITPKGV}"
PR = "r1"

RDEPENDS_${PN} = "mtd-utils mtd-utils-ubifs ofgwrite"

FILES_${PN} = "/usr/lib/enigma2/python/Plugins/Extensions/BackupSuite"

do_install_append() {
	install -d ${DEST}
	cp -rp ${SRC}/* ${DEST}
	# remove the files we do not want in our package
	find ${DEST} -name '*.pyo' -exec rm {} \;
	find ${DEST} -name '*.po' -exec rm {} \;
}

SUMMARY = "USB utilities for Linux (lsusb, usbhid-dump, usb-devices)"
DESCRIPTION = "Utilities to display information about USB buses and connected devices."
HOMEPAGE = "https://git.kernel.org/pub/scm/linux/kernel/git/gregkh/usbutils.git/"
LICENSE = "GPL-2.0-or-later"
LIC_FILES_CHKSUM = "file://lsusb.c;beginline=1;endline=20;md5=7981268ba5a9f28d3f009e40432d297c"

SRC_URI = "git://git.kernel.org/pub/scm/linux/kernel/git/gregkh/usbutils.git;branch=master;protocol=https \
           http://www.linux-usb.org/usb.ids;name=usbids"

SRCREV = "${AUTOREV}"
### PV = "018+git${SRCPV}"
PV = "git-${SRCREV}"

S = "${WORKDIR}/git"

SRC_URI[sha256sum] = "0048d2d8518fb0cc7c0516e16e52af023e52b55ddb3b2068a77041b5ef285768"
SRC_URI[usbids.sha256sum] = "1feaa5e681de2115c8e17f98d29cc4fd0131c8dde73a61a21f42c00c5ed26394"

DEPENDS = "libusb1 udev"

RDEPENDS:${PN} += "python3 python3-core"

inherit meson pkgconfig

### EXTRA_OEMESON += "-Dusbids_path=${datadir}/usbutils/usb.ids"

FILES_${PN} += "${datadir}/usbutils/usb.ids"

do_install:prepend() {
	install -D -m 0644 ${DL_DIR}/usb.ids ${WORKDIR}/usb.ids
}

do_install:append() {
	install -d ${D}${datadir}/usbutils
	### replacing: EXTRA_OEMESON += "-Dusbids_path=${datadir}/usbutils/usb.ids"
	### already manually installing usb.ids to the correct location:
	install -m 0644 ${WORKDIR}/usb.ids ${D}${datadir}/usbutils/
}


glib_2.0.bbappend

FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"
SRC_URI += "file://glib-fix-bool-conflict.patch"

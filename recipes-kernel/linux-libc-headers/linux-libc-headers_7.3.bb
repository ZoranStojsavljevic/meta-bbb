require linux-libc-headers.inc

SRC_URI:append:libc-musl = "\
    file://0001-libc-compat.h-fix-some-issues-arising-from-in6.h.patch \
    file://0003-remove-inclusion-of-sysinfo.h-in-kernel.h.patch \
    file://0001-libc-compat.h-musl-_does_-define-IFF_LOWER_UP-DORMAN.patch \
   "

LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"

PV = "7.3"
SRC_URI = "https://cdn.kernel.org/pub/linux/kernel/v7.x/linux-${PV}.tar.xz"

SRC_URI[sha256sum] = "87363c24f10e06321eb362765521094e94471f6bff8bce2d6b3e40f39f004953"

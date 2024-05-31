# Copyright meta-linux-mainline contributors (auto-generated file)
# SPDX-License-Identifier: CC0-1.0

inherit kernel
### inherit kernel-yocto
inherit pkgconfig

### SECTION = "kernel"
SUMMARY = "Linux kernel"
DESCRIPTION = "Linux kernel torvalds from kernel.org"
LICENSE = "LGPL-2.1-or-later"
LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"

LINUX_VERSION = "6.10"

PV = "6.10.rc2"
### PV = "${LINUX_VERSION}+git${SRCPV}"

SRCREV = "c3f38fa61af77b49866b006939479069cd451173"
SRC_URI = "git://git.kernel.org/pub/scm/linux/kernel/git/torvalds/linux.git;protocol=https;branch=master"
### SRC_URI = "git://git.kernel.org/pub/scm/linux/kernel/git/torvalds/linux.git;protocol=https;branch=${PV}"
S = "${WORKDIR}/git"

DEPENDS += "libyaml-native python3-dtschema-wrapper-native"

KERNEL_CONFIG_COMMAND = "oe_runmake_call -C ${S} CC="${KERNEL_CC}" O=${B} olddefconfig"
### KERNEL_CONFIG_COMMAND = "oe_runmake -C ${S} O=${B} ${KBUILD_DEFCONFIG}"

LINUX_VERSION_EXTENSION = "-jumpnow_zee"

### FILESEXTRAPATHS:prepend := "${THISDIR}/linux-stable-${LINUX_VERSION}:${THISDIR}/linux-stable-${LINUX_VERSION}/dts:"
FILESEXTRAPATHS:prepend := "${THISDIR}/linux-mainline-${LINUX_VERSION}:${THISDIR}/linux-mainline-${LINUX_VERSION}/dts:"

COMPATIBLE_MACHINE = "beaglebone"

KERNEL_DEVICETREE ?= " \
    ti/omap/am335x-boneblack.dtb \
    ti/omap/am335x-boneblack-wireless.dtb \
    ti/omap/am335x-boneblue.dtb \
    ti/omap/am335x-bonegreen.dtb \
    ti/omap/am335x-bonegreen-wireless.dtb \
    ti/omap/am335x-pocketbeagle.dtb \
"

SRC_URI:append:use-common-patches = " \
    file://defconfig \
    file://0001-spidev-Add-a-generic-compatible-id.patch \
    file://0002-dts-Remove-bbb-cape-i2c-definitions.patch \
    file://0003-wlcore-Change-NO-FW-RX-BA-session-warnings-to-debug.patch \
    \
    file://bbb-dcan0.dtsi;subdir=git/arch/arm/boot/dts \
    file://bbb-dcan1.dtsi;subdir=git/arch/arm/boot/dts \
    file://bbb-i2c1.dtsi;subdir=git/arch/arm/boot/dts \
    file://bbb-i2c2.dtsi;subdir=git/arch/arm/boot/dts \
    file://bbb-spi0-spidev.dtsi;subdir=git/arch/arm/boot/dts \
    file://bbb-spi1-spidev.dtsi;subdir=git/arch/arm/boot/dts \
    file://bbb-uart1.dtsi;subdir=git/arch/arm/boot/dts \
    file://bbb-uart2.dtsi;subdir=git/arch/arm/boot/dts \
    file://bbb-uart4.dtsi;subdir=git/arch/arm/boot/dts \
    file://bbb-uart5.dtsi;subdir=git/arch/arm/boot/dts \
    file://bbb-4dcape43t-keypad.dtsi;subdir=git/arch/arm/boot/dts \
    file://bbb-4dcape70t-keypad.dtsi;subdir=git/arch/arm/boot/dts \
    \
    file://bbb-4dcape43t.dts;subdir=git/arch/arm/boot/dts \
    file://bbb-4dcape43t-spi.dts;subdir=git/arch/arm/boot/dts \
    file://bbb-4dcape70t.dts;subdir=git/arch/arm/boot/dts \
    file://bbb-gen4-4dcape50t.dts;subdir=git/arch/arm/boot/dts \
    file://bbb-nhd5cape.dts;subdir=git/arch/arm/boot/dts \
    file://bbb-nhd7cape.dts;subdir=git/arch/arm/boot/dts \
    file://bbb-bcc-s6.dts;subdir=git/arch/arm/boot/dts \
"

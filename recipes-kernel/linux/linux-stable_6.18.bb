# Copyright meta-linux-mainline contributors (auto-generated file)
# SPDX-License-Identifier: CC0-1.0

require linux-stable.inc

SUMMARY = "Linux kernel 6.18.57"
DESCRIPTION = "Linux kernel stable version 6.18.57 long term from kernel.org"
LICENSE = "LGPL-2.1-or-later"

LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"

KERNEL_CONFIG_COMMAND = "oe_runmake_call -C ${S} CC="${KERNEL_CC}" O=${B} olddefconfig"

COMPATIBLE_MACHINE = "beaglebone"

INSANE_SKIP:${PN}-src += "buildpaths"

KERNEL_DEVICETREE ?= " \
    ti/omap/am335x-boneblack.dtb \
    ti/omap/am335x-boneblack-wireless.dtb \
    ti/omap/am335x-boneblue.dtb \
    ti/omap/am335x-bonegreen.dtb \
    ti/omap/am335x-bonegreen-wireless.dtb \
    ti/omap/am335x-pocketbeagle.dtb \
"

LINUX_VERSION = "6.18"
LINUX_VERSION_EXTENSION = "-jumpnow_zee"

FILESEXTRAPATHS:prepend := "${THISDIR}/linux-stable-${LINUX_VERSION}:${THISDIR}/linux-stable-${LINUX_VERSION}/dts:"

## linux-stable-6.18.57-r0 do_unpack: Recipes that set
## S = "${WORKDIR}/git" or S = "${UNPACKDIR}/git" should remove
## that assignment, as S set by bitbake.conf in oe-core now works.
##
## S = "${WORKDIR}/git"

PV = "6.18.57"
REV = "57"

## BitBake checks out the repository into a directory named
## after ${BP} under ${UNPACKDIR}. The additional files, such
## as the .dtsi files, are also unpacked there according to
## their subdir settings.
##
## ${WORKDIR} is the recipe's working area
## ${UNPACKDIR} is the area for unpacked source files
## ${S} identifies the source directory used by the build tasks.
##
## ${UNPACKDIR} = .../bbb-yocto/layers/openembedded-core/build/tmp/work/ \
##		  beaglebone_yocto-poky-linux-gnueabi/linux-stable/6.18.57/sources
## ${BP} = linux-stable-6.18.57
##
## ${S} = .../beaglebone_yocto-poky-linux-gnueabi/linux-stable/6.18.57/sources/linux-stable-6.18.57

S = "${UNPACKDIR}/${BP}"

## The command to inspect the actual values at any time is:
## bitbake -e linux-stable | grep -E '^(WORKDIR|UNPACKDIR|BP|S)='

SRCREV = "2ff600d29ee478d0a8d46ef8a58afb5e038fe692"
SRC_URI = " \
    git://git.kernel.org/pub/scm/linux/kernel/git/stable/linux-stable.git;branch=linux-${LINUX_VERSION}.y \
    file://beaglebone/defconfig \
    file://0001-spidev-Add-a-generic-compatible-id.patch \
    file://0002-dts-Remove-bbb-cape-i2c-definitions.patch \
    file://0003-wlcore-Change-NO-FW-RX-BA-session-warnings-to-debug.patch \
    \
    file://bbb-dcan0.dtsi;subdir=${BP}/arch/arm/boot/dts \
    file://bbb-dcan1.dtsi;subdir=${BP}/arch/arm/boot/dts \
    file://bbb-i2c1.dtsi;subdir=${BP}/arch/arm/boot/dts \
    file://bbb-i2c2.dtsi;subdir=${BP}/arch/arm/boot/dts \
    file://bbb-spi0-spidev.dtsi;subdir=${BP}/arch/arm/boot/dts \
    file://bbb-spi1-spidev.dtsi;subdir=${BP}/arch/arm/boot/dts \
    file://bbb-uart1.dtsi;subdir=${BP}/arch/arm/boot/dts \
    file://bbb-uart2.dtsi;subdir=${BP}/arch/arm/boot/dts \
    file://bbb-uart4.dtsi;subdir=${BP}/arch/arm/boot/dts \
    file://bbb-uart5.dtsi;subdir=${BP}/arch/arm/boot/dts \
    file://bbb-4dcape43t-keypad.dtsi;subdir=${BP}/arch/arm/boot/dts \
    file://bbb-4dcape70t-keypad.dtsi;subdir=${BP}/arch/arm/boot/dts \
    \
    file://bbb-4dcape43t.dts;subdir=${BP}/arch/arm/boot/dts \
    file://bbb-4dcape43t-spi.dts;subdir=${BP}/arch/arm/boot/dts \
    file://bbb-4dcape70t.dts;subdir=${BP}/arch/arm/boot/dts \
    file://bbb-gen4-4dcape50t.dts;subdir=${BP}/arch/arm/boot/dts \
    file://bbb-nhd5cape.dts;subdir=${BP}/arch/arm/boot/dts \
    file://bbb-nhd7cape.dts;subdir=${BP}/arch/arm/boot/dts \
    file://bbb-bcc-s6.dts;subdir=${BP}/arch/arm/boot/dts \
"

do_compile:append() {
    echo "Sanitizing generated headers to remove TMPDIR references..."

    TMPDIR_ESCAPED=$(echo "${TMPDIR}" | sed -e 's/[\/&]/\\&/g')

    ## Only run DRM msm cleanup if the directory exists (avoids spurious errors)
    if [ -d "${S}/drivers/gpu/drm/msm/generated" ]; then
        find ${S}/drivers/gpu/drm/msm/generated -name '*.xml.h' -exec \
            sed -i "s/${TMPDIR_ESCAPED}//g" {} +
    fi

    ## Also clean generated mach-types.h if it exists
    if [ -f "${S}/arch/arm/include/generated/asm/mach-types.h" ]; then
        sed -i "s/${TMPDIR_ESCAPED}//g" \
            ${S}/arch/arm/include/generated/asm/mach-types.h || true
    fi
}

do_install:append() {
    find ${D} -type f -name "*.h" -exec sed -i -e "s|${TMPDIR}|\${TMPDIR_REPLACED}|g" {} +
}


This layer depends on:

	URI: git://git.yoctoproject.org/poky.git
	branch: styhead

	URI: git://git.openembedded.org/meta-openembedded
	branch: styhead

	URI: https://github.com/meta-qt6/meta-qt6.git
	branch: dev

	URI: git://git.yoctoproject.org/meta-security.git
	branch: styhead

	URI: https://github.com/jumpnow/meta-jumpnow.git
	branch: styhead

	Latest commits with 5.1 styhead release:

	Build Configuration:
**==>>	BB_VERSION           = "2.9.1"
	BUILD_SYS            = "x86_64-linux"
	NATIVELSBSTRING      = "fedora-40"
	TARGET_SYS           = "arm-poky-linux-gnueabi"
	MACHINE              = "beaglebone-yocto"
	DISTRO               = "poky"
**==>>	DISTRO_VERSION       = "5.1"
	TUNE_FEATURES        = "arm vfp cortexa8 neon callconvention-hard"
	TARGET_FPU           = "hard"
	meta
	meta-poky
	meta-yocto-bsp       = "styhead:86bc5dca182a3fe774e17811a82177a68b27a6bb"
	meta-jumpnow         = "styhead:7adb5044e310819ceb310b3b300ff96704368214"
	meta-bbb             = "styhead:ed13b4ecd30cbf6df0c5127650f5a378c85b6859"
	meta-oe
	meta-python
	meta-networking      = "styhead:461d85a1831318747af5abe86da193bcde3fd9b4"
	meta-qt6             = "dev:abdf375a2efe48e30050bd54c717a970f883357c"
	meta-socketcan       = "styhead:3de33a9b777959a9045579ccd0aa1088eda09199"

Kernel used in meta-bbb styhead 6.11.4

	meta-bbb layer maintainer: Scott Ellis <scott@jumpnowtek.com>
	meta-bbb layer maintainer: Zoran Stojsavljevic <zoran.stojsavljevic@gmail.com>


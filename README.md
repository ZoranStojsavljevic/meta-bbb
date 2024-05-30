This layer depends on:

	URI: git://git.yoctoproject.org/poky.git
	branch: scarthgap

	URI: git://git.openembedded.org/meta-openembedded
	branch: scarthgap

	URI: https://github.com/meta-qt5/meta-qt5.git
	branch: scarthgap

	URI: git://git.yoctoproject.org/meta-security.git
	branch: scarthgap

	URI: https://github.com/jumpnow/meta-jumpnow.git
	branch: scarthgap

	Latest commits with 5.0.1 scarthgap release:

	Build Configuration:
	BB_VERSION           = "2.8.0"
	BUILD_SYS            = "x86_64-linux"
	NATIVELSBSTRING      = "fedora-40"
	TARGET_SYS           = "arm-poky-linux-gnueabi"
	MACHINE              = "beaglebone"
	DISTRO               = "poky"
	DISTRO_VERSION       = "5.0.1"
	TUNE_FEATURES        = "arm vfp cortexa8 neon callconvention-hard"
	TARGET_FPU           = "hard"
	meta
	meta-poky
	meta-yocto-bsp       = "scarthgap:c5df9c829a549ca002c36afd6bdf23639831502e"
	meta-jumpnow         = "scarthgap:3efb1aa7d511f0fb44d9dcdb578bada1882dc1b3"
	meta-bbb             = "scarthgap:c0095313c0a7e89b0a1d0bf2cf79d4cb1b9b9185"
	meta-oe
	meta-python
	meta-networking      = "scarthgap:6de0ab744341ad61b0661aa28d78dc6767ce0786"
	meta-qt5             = "upstream/scarthgap:d8eeef0bfd84672c7919cd346f25f7c9a98ddaea"
	meta-socketcan       = "scarthgap:7bba7af8403eb9a28e7d0e7f0d0229e3bffcf65a"

Kernel used in meta-bbb scarthgap 6.9.3

From the https://kernel.org/ (stable: 6.9.3)

```
	mainline:	6.10-rc1	2024-05-26
=====>>	stable:		6.9.3		2024-05-30 <<===== (@ date)
	stable:		6.8.12 [EOL]	2024-05-30
	longterm:	6.6.32		2024-05-25
	longterm:	6.1.92		2024-05-25
	longterm:	5.15.160	2024-05-25
	longterm:	5.10.218	2024-05-25
```

	meta-bbb layer maintainer: Scott Ellis <scott@jumpnowtek.com>
	meta-bbb layer maintainer: Zoran Stojsavljevic <zoran.stojsavljevic@gmail.com>


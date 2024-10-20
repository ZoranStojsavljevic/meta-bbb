This layer depends on:

	URI: git://git.yoctoproject.org/poky.git
	branch: scarthgap

	URI: git://git.openembedded.org/meta-openembedded
	branch: scarthgap

	URI: https://github.com/meta-qt6/meta-qt6.git
	branch: scarthgap

	URI: git://git.yoctoproject.org/meta-security.git
	branch: scarthgap

	URI: https://github.com/jumpnow/meta-jumpnow.git
	branch: scarthgap

	Latest commits with 5.0.2 scarthgap release:

	Build Configuration:
	BB_VERSION           = "2.8.0"
	BUILD_SYS            = "x86_64-linux"
	NATIVELSBSTRING      = "fedora-40"
	TARGET_SYS           = "arm-poky-linux-gnueabi"
	MACHINE              = "beaglebone-yocto"
	DISTRO               = "poky"
	DISTRO_VERSION       = "5.0.2"
	TUNE_FEATURES        = "arm vfp cortexa8 neon callconvention-hard"
	TARGET_FPU           = "hard"
	meta
	meta-poky
	meta-yocto-bsp       = "scarthgap:6ced2e7ca3b58130154035ad61685cd222909680"
	meta-jumpnow         = "scarthgap:3efb1aa7d511f0fb44d9dcdb578bada1882dc1b3"
	meta-bbb             = "scarthgap:a25e0b0de2df83d8bde50eee9e7ff3b25150e173"
	meta-oe
	meta-python
	meta-networking      = "scarthgap:2338409efc51cf2022ff5610a9fb689251706e2b"
	meta-qt6             = "upstream/scarthgap:eb828418264a49b8d00035cb3d7b12fcea3be801"
	meta-socketcan       = "scarthgap:7bba7af8403eb9a28e7d0e7f0d0229e3bffcf65a"

Kernel used in meta-bbb scarthgap 6.11-rc2

From the https://kernel.org/ (torvalds: 6.11-rc2)

```
=====>>	mainline:	6.11-rc2	2024-08-04 <<===== (@ date)
	stable:		6.10.4		2024-08-11
	stable:		6.9.12 [EOL]	2024-07-27
	longterm:	6.6.45		2024-08-11
	longterm:	6.1.104		2024-08-11
	longterm:	5.15.164	2024-07-27
	longterm:	5.10.223	2024-07-27
	longterm:	5.4.281		2024-07-27
	longterm:	4.19.319	2024-07-27
```

	meta-bbb layer maintainer: Scott Ellis <scott@jumpnowtek.com>
	meta-bbb layer maintainer: Zoran Stojsavljevic <zoran.stojsavljevic@gmail.com>


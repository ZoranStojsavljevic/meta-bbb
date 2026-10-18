This layer depends on:

	URI: git://git.yoctoproject.org/poky.git
	branch: walnascar

	URI: git://git.openembedded.org/meta-openembedded
	branch: walnascar

	URI: https://github.com/meta-qt6/meta-qt6.git
	branch: walnascar

	URI: git://git.yoctoproject.org/meta-security.git
	branch: walnascar

	URI: https://github.com/jumpnow/meta-jumpnow.git
	branch: walnascar

	Latest commits with 5.2.4 walnascar release:

	Build Configuration:

	**==>>	BB_VERSION           = "2.12.1"
		BUILD_SYS            = "x86_64-linux"
		NATIVELSBSTRING      = "universal"
		TARGET_SYS           = "arm-poky-linux-gnueabi"
		MACHINE              = "beaglebone-yocto"
		DISTRO               = "poky"
	**==>>	DISTRO_VERSION       = "5.2.4"
		TUNE_FEATURES        = "arm vfp cortexa8 neon callconvention-hard"
		TARGET_FPU           = "hard"
		meta
		meta-poky
		meta-yocto-bsp       = "walnascar:d0b46a6624ec9c61c47270745dd0b2d5abbe6ac1"
		meta-jumpnow         = "walnascar:d75272ddf82f1314d95ad2ccb8737d48d42e9d1f"
		meta-bbb             = "walnascar:977dfd6abc0d6e70fa009c289e3faf2d7720d280"
		meta-oe
		meta-python
		meta-networking      = "walnascar:07330a98cf93806b7a4e0170a541b94962ff3960"
	[6.11]	meta-qt6             = "6.11:ec98b3ab1c8deeab9412ef6cbfd55729dc567b01"
		meta-socketcan       = "walnascar:47a57f2f467e8d18cdaa1f2f682b296e37fec2c2"

Kernel used in meta-bbb walnascar: 6.18.57 (long term kernel released on 2026-10-15)

	meta-bbb layer initial creator: Scott Ellis <scott@jumpnowtek.com>
	meta-bbb layer current maintainer: <zoran.stojsavljevic@gmail.com>


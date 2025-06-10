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

	Latest commits with 5.2.2 walnascar release:

	Build Configuration:
**==>>	BB_VERSION           = "2.12.0"
	BUILD_SYS            = "x86_64-linux"
	NATIVELSBSTRING      = "universal"
	TARGET_SYS           = "arm-poky-linux-gnueabi"
	MACHINE              = "beaglebone-yocto"
	DISTRO               = "poky"
**==>>	DISTRO_VERSION       = "5.2.2"
	TUNE_FEATURES        = "arm vfp cortexa8 neon callconvention-hard"
	TARGET_FPU           = "hard"
	meta
	meta-poky
	meta-yocto-bsp       = "walnascar:8fe20edf8a7affb88eaad3fcd060021056ded3f7"
	meta-jumpnow         = "walnascar:d75272ddf82f1314d95ad2ccb8737d48d42e9d1f"
	meta-bbb             = "walnascar:01e88d384a80cf8ad48dfd06a44bcff2b7f80606"
	meta-oe
	meta-python
	meta-networking      = "walnascar:c009244a045923a9dfc32d7f2996cb61629870f6"
	meta-qt6             = "dev:cae750cf1964a37a4744166e844cafa280c1356d"
	meta-socketcan       = "walnascar:47a57f2f467e8d18cdaa1f2f682b296e37fec2c2"

Kernel used in meta-bbb walnascar: 6.15.2

	meta-bbb layer maintainer: Scott Ellis <scott@jumpnowtek.com>
	meta-bbb layer maintainer: Zoran Stojsavljevic <zoran.stojsavljevic@gmail.com>


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
	BB_VERSION	= "2.8.0"
	BUILD_SYS	= "x86_64-linux"
	NATIVELSBSTRING	= "fedora-40"
	TARGET_SYS	= "x86_64-poky-linux"
	MACHINE		= "qemux86-64"
	DISTRO		= "poky"
	DISTRO_VERSION	= "5.0.1"
	TUNE_FEATURES	= "m64 core2"
	TARGET_FPU	= ""
	meta
	meta-poky
	meta-yocto-bsp	= "scarthgap:4b07a5316ed4b858863dfdb7cab63859d46d1810"
	meta-jumpnow	= "scarthgap:8403f4adb7ecc45cc83d44b4a317cc9695b291dc"
	meta-bbb	= "scarthgap:f6d917e313af635536cd8f2ee2f4ce0675cc848c"
	meta-oe
	meta-python
	meta-networking	= "scarthgap:a72010b414ee3d73888ac9cb4e310e8f05e13aea"
	meta-qt5	= "upstream/scarthgap:d8eeef0bfd84672c7919cd346f25f7c9a98ddaea"
	meta-socketcan	= "master:15406dd37cc568d083cb3a40a3c61bd217a1b8ab"

Kernel used in meta-bbb scarthgap 6.1.45

From the https://kernel.org/ (longterm 6.1.xy kernel)

	mainline:	6.9-rc7		2024-05-05
	stable:		6.8.9		2024-05-02
	longterm:	6.6.30		2024-05-02
=====>>	longterm:	6.1.90 (latest)	2024-05-02 <<===== (@ date)
	longterm:	5.15.158	2024-05-02
	longterm:	5.10.216	2024-05-02

meta-bbb layer maintainer: Scott Ellis <scott@jumpnowtek.com>
meta-bbb layer maintainer: Zoran Stojsavljevic <zoran.stojsavljevic@gmail.com>

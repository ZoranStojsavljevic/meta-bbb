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
	meta-yocto-bsp	= "scarthgap:68f9a4b73d17839e0ec1f12a31fc1d42331cc42f"
	meta-jumpnow	= "scarthgap:500080773492dd842d6ea0627ebc80b2f775ca1c"
	meta-bbb	= "scarthgap:d3a38f37bb3ca7ebe51c6200258bd9cae0c0203c"
	meta-oe
	meta-python
	meta-networking	= "scarthgap:6de0ab744341ad61b0661aa28d78dc6767ce0786"
	meta-qt5	= "upstream/scarthgap:d8eeef0bfd84672c7919cd346f25f7c9a98ddaea"
	meta-socketcan	= "scarthgap:3bceabca635c98f06e5e0fb0d411813c3730d805"

Kernel used in meta-bbb scarthgap 6.9.1

From the https://kernel.org/ (stable: 6.9.1)

```
	mainline:	6.10-rc1	2024-05-26
=====>>	stable:		6.9.1		2024-05-17 <<===== (@ date)
	stable:		6.8.11		2024-05-25
	longterm:	6.6.30		2024-05-02
	longterm:	6.1.90 (latest)	2024-05-02
	longterm:	5.15.158	2024-05-02
	longterm:	5.10.216	2024-05-02
```

	meta-bbb layer maintainer: Scott Ellis <scott@jumpnowtek.com>
	meta-bbb layer maintainer: Zoran Stojsavljevic <zoran.stojsavljevic@gmail.com>


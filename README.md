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

	Latest commits with 5.2.1 walnascar release:

	Build Configuration:
**==>>	BB_VERSION           = "2.12.0"
	BUILD_SYS            = "x86_64-linux"
	NATIVELSBSTRING      = "universal"
	TARGET_SYS           = "arm-poky-linux-gnueabi"
	MACHINE              = "beaglebone-yocto"
	DISTRO               = "poky"
**==>>	DISTRO_VERSION       = "5.2.1"
	TUNE_FEATURES        = "arm vfp cortexa8 neon callconvention-hard"
	TARGET_FPU           = "hard"
	meta
	meta-poky
	meta-yocto-bsp       = "walnascar:ee0d8d8a61d8e22a3dd00c32cde58ee6e8ec458f"
	meta-jumpnow         = "walnascar:d75272ddf82f1314d95ad2ccb8737d48d42e9d1f"
	meta-bbb             = "walnascar:b48a997b2308dd85f2dce44ac61614fbdf6c5b10"
	meta-oe
	meta-python
	meta-networking      = "walnascar:2169c9afcc0945045bea49f58011080942d4ddb4"
	meta-qt6             = "dev:01bd0410181845c642adc44ee0534b6de8b388d3"
	meta-socketcan       = "walnascar:47a57f2f467e8d18cdaa1f2f682b296e37fec2c2"
	workspace            = "walnascar:ee0d8d8a61d8e22a3dd00c32cde58ee6e8ec458f"

Kernel used in meta-bbb walnascar 6.11.4 (as initial kernel, to
be changed later to 6.14.x)

	meta-bbb layer maintainer: Scott Ellis <scott@jumpnowtek.com>
	meta-bbb layer maintainer: Zoran Stojsavljevic <zoran.stojsavljevic@gmail.com>


This layer depends on:

	URI: git://git.yoctoproject.org/poky.git
	branch: wrynose

	URI: git://git.openembedded.org/meta-openembedded
	branch: wrynose

	URI: https://github.com/meta-qt6/meta-qt6.git
	branch: wrynose

	URI: git://git.yoctoproject.org/meta-security.git
	branch: wrynose

	URI: https://github.com/jumpnow/meta-jumpnow.git
	branch: wrynose

	Latest commits with 6.0.4 wrynose release:

		Build Configuration:

	**==>>	BB_VERSION             = "2.18.0"
		BUILD_SYS              = "x86_64-linux"
		NATIVELSBSTRING        = "universal"
		TARGET_SYS             = "arm-poky-linux-gnueabi"
		MACHINE                = "beaglebone-yocto"
		SDKMACHINE             = "x86_64"
		DISTRO                 = "poky"
	**==>>	DISTRO_VERSION         = "6.0.4"
		TUNE_FEATURES          = "arm vfp cortexa8 neon callconvention-hard"
		meta                   = "wrynose:884a91e689d545238cfabd7926c93663950ca286"
		meta-oe
		meta-perl
		meta-python
		meta-networking        = "wrynose:f28a144aa0a0ae05ca2ee91e1aef6aa05f6a12db"
		meta-bbb               = "wrynose:ca300dde0b709462bb1fa5e8f7006ff753720cdd"
	[6.11]	meta-qt6               = "6.11:ec98b3ab1c8deeab9412ef6cbfd55729dc567b01"
		meta-socketcan         = "wrynose:32db2e32e907adfa9c08bddd866ffe60cfd7ea0e"
		meta-poky
		meta-yocto-bsp         = "wrynose:7c25b11156553145fa6b241a2d4f65d94438f804"
		meta-jumpnow           = "wrynose:ea3165ddebfda60ec1c48171eee86345e2df69af"
		meta-signing-key
		meta-secure-core-common
		meta-tpm2
		meta-efi-secure-boot
		meta-integrity
		meta-encrypted-storage = "wrynose:07a99ae241acd488a2feda1ededf87dc70dfde80"

Kernel used in meta-bbb wrynose: 6.18.57 (long term kernel released on 2026-10-15)

	meta-bbb layer initial creator: Scott Ellis <scott@jumpnowtek.com>
	meta-bbb layer current maintainer: <zoran.stojsavljevic@gmail.com>

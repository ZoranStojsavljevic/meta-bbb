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

	Kernel used in meta-bbb wrynose: 6.18.57
	(long term kernel released on 2026-10-15).

	#################################################################
	####                       PLEASE READ
	#################################################################
	##
	## For the overriding kernel, which overrides the one placed
	## in current yocto release, there must be need to create a
	## proper linux-libc-headers/ which matches overriding kernel.
	##
	## Because of this requirement, directory:
	##
	##	 .../meta-bbb/recipes-kernel/linux-libc-headers/
	##
	## has been created/added.
	##
	## If there is own proprietary (hardware specific) kernel
	## created, there is NO need for hardware specific
	## linux-libc-headers/ to be created.
	##
	## The one standard should be reused from the original
	## kernel.org kernel, the proprietary HW dependent kernel
	## initially evolved.
	##
	## These headers are used to build the libc. Customising the
	## headers customises the libc and the libc becomes machine
	## specific. Most people do not add (would like to avoid)
	## custom libc extensions to the kernel and have a machine
	## specific libc.

	meta-bbb layer initial creator: Scott Ellis <scott@jumpnowtek.com>
	meta-bbb layer current maintainer: <zoran.stojsavljevic@gmail.com>

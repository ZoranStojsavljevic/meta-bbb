### What is python3-pygatt_4.0.5.bb?

This is a Yocto recipe file (likely located in a layer like
meta-python) that does the following:

Fetches and installs pygatt version 4.0.5 (usually from PyPI).

Ensures it gets built using Python 3.

Packages it into a format usable by Yocto-generated images or
SDKs.

pygatt supports BLE (Blue tooth Low Energy) communication using
BlueZ backend or BGAPI (used with devices like the Bluegiga
BLED112 dongle).

### python3-pygatt_4.0.5.bb included into the YOCTO image

	$ bitbake -s | grep python3-pygatt 
	python3-pygatt		:4.0.5-r0                                                    
	python3-pygattlib	:0.20200122-r0

### Use python3-pygatt if:

Building for a device that needs BLE via BlueZ or BLED112.

The toolchain uses Python 3.8–3.11 and it builds successfully.

Needs a simple GATT abstraction.

### Avoid python3-pygatt if:

Targeting modern BLE stacks or want async/modern Python support.

Using Python 3.12+ — pygatt may not be compatible without
patching.

To use an actively maintained BLE library → use bleak instead
(also has a Yocto recipe python3-bleak in meta-python).

### Styhead python3 version used

	python3			:3.12.9-r0

The conclusion: very soon python3-pygatt package is to be
obsolete (last maintained in 2018.). Instead, please, use
modern python3-bleak package.

### Replacing python3-pygatt with python3-bleak package

	$ bitbake -s | grep python3-bleak
	python3-bleak		:0.22.2-r0

	$ bitbake -s | grep pydbus
	python3-pydbus		:0.6.0-r0

	$ bitbake -s | grep -i Blue
	blueman			:2.4.3-r0
	bluepy			:1.3.0+git-r0
	bluez-tools		:git-r0
	bluez5			:5.78-r0

#@TYPE: Machine
#@Name: ACME Roadrunner on Berta D2 baseboard
#@DESCRIPTION: Machine configuration for ACME Roadrunner on Berta D2 baseboard

AT91BOOTSTRAP_MACHINE ?= "sama5d2_roadrunner"
require conf/machine/include/sama5d2.inc

MACHINE_FEATURES = "kernel26 apm ext4 usbhost usbgadget can ppp"
KERNEL_DEVICETREE = " \
		${MACHINE}.dtb \
		"
IMAGE_FSTYPES += " tar.xz"

EXTRA_IMAGEDEPENDS_remove = "virtual/bootloader"
IMAGE_BOOTLOADER = ""


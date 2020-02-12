# Copyright (C) 2018 Maksym Komar <komar@evologics.de>
# Released under the MIT license (see COPYING.MIT for the terms)
LICENSE = "MIT"

IMAGE_FEATURES += "ssh-server-dropbear package-management"

IMAGE_INSTALL = "\
    packagegroup-core-boot \
    lrzsz \
    opkg \
    \
    i2c-tools \
    devmem2 \
    mtd-utils \
    mtd-utils-ubifs \
    dtc \
    dtc-misc \
    \
    socat \
    \
    screen \
    \
    ${CORE_IMAGE_EXTRA_INSTALL} \
    "

DEPENDS += "\
    packagegroup-base-usbgadget \
    setserial \
    usbutils \
"

inherit core-image

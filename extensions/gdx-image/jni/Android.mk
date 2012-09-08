LOCAL_PATH:= $(call my-dir)
include $(CLEAR_VARS)
 
LOCAL_MODULE    := gdx-image
LOCAL_C_INCLUDES := libjpeg/ giflib/ ../../../gdx/jni/gdx2d/ 
 
LOCAL_CFLAGS := $(LOCAL_C_INCLUDES:%=-I%) -O2 -Wall -D__ANDROID__ -DHAVE_CONFIG_H
LOCAL_CPPFLAGS := $(LOCAL_C_INCLUDES:%=-I%) -O2 -Wall -D__ANDROID__
LOCAL_LDLIBS := -lm
LOCAL_ARM_MODE  := arm
 
LOCAL_SRC_FILES := com.badlogic.gdx.graphics.g2d.Jpeg.cpp\
	libjpeg/rdswitch.c\
	libjpeg/jquant2.c\
	libjpeg/jdmaster.c\
	libjpeg/jdatadst.c\
	libjpeg/jdinput.c\
	libjpeg/jdtrans.c\
	libjpeg/jcmaster.c\
	libjpeg/jaricom.c\
	libjpeg/jccolor.c\
	libjpeg/jcinit.c\
	libjpeg/jdsample.c\
	libjpeg/wrtarga.c\
	libjpeg/rdppm.c\
	libjpeg/rdtarga.c\
	libjpeg/jerror.c\
	libjpeg/jidctint.c\
	libjpeg/wrgif.c\
	libjpeg/jctrans.c\
	libjpeg/jdmainct.c\
	libjpeg/jdarith.c\
	libjpeg/jcsample.c\
	libjpeg/jcarith.c\
	libjpeg/jmemmgr.c\
	libjpeg/jutils.c\
	libjpeg/jfdctint.c\
	libjpeg/jidctfst.c\
	libjpeg/jcdctmgr.c\
	libjpeg/jfdctfst.c\
	libjpeg/wrrle.c\
	libjpeg/jidctflt.c\
	libjpeg/jdatasrc.c\
	libjpeg/jquant1.c\
	libjpeg/jcmarker.c\
	libjpeg/jmemansi.c\
	libjpeg/jcmainct.c\
	libjpeg/jdhuff.c\
	libjpeg/jddctmgr.c\
	libjpeg/wrbmp.c\
	libjpeg/jdmerge.c\
	libjpeg/jdpostct.c\
	libjpeg/jcparam.c\
	libjpeg/transupp.c\
	libjpeg/cdjpeg.c\
	libjpeg/jccoefct.c\
	libjpeg/jfdctflt.c\
	libjpeg/jdmarker.c\
	libjpeg/jdapistd.c\
	libjpeg/rdcolmap.c\
	libjpeg/wrppm.c\
	libjpeg/jcomapi.c\
	libjpeg/rdrle.c\
	libjpeg/jchuff.c\
	libjpeg/jdcolor.c\
	libjpeg/rdbmp.c\
	libjpeg/jdapimin.c\
	libjpeg/jcapistd.c\
	libjpeg/rdgif.c\
	libjpeg/jdcoefct.c\
	libjpeg/jcprepct.c\
	libjpeg/jcapimin.c\
	giflib/gifalloc.c\
	giflib/gif_font.c\
	giflib/egif_lib.c\
	giflib/gif_hash.c\
	giflib/dgif_lib.c\
	giflib/dev2gif.c\
	giflib/qprintf.c\
	giflib/quantize.c\
	giflib/gif_err.c
 
include $(BUILD_SHARED_LIBRARY)

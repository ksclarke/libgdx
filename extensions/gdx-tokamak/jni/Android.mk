LOCAL_PATH:= $(call my-dir)
include $(CLEAR_VARS)
 
LOCAL_MODULE    := gdx-tokamak
LOCAL_C_INCLUDES := . tokamak/include 
 
LOCAL_CFLAGS := $(LOCAL_C_INCLUDES:%=-I%) -O2 -Wall -D__ANDROID__
LOCAL_CPPFLAGS := $(LOCAL_C_INCLUDES:%=-I%) -O2 -Wall -D__ANDROID__
LOCAL_LDLIBS := -lm -lm
LOCAL_ARM_MODE  := arm
 
LOCAL_SRC_FILES := tokamak/boxcylinder.cpp\
	tokamak/scenery.cpp\
	tokamak/region.cpp\
	tokamak/collisionbody.cpp\
	tokamak/tricollision.cpp\
	tokamak/cylinder.cpp\
	tokamak/stack.cpp\
	tokamak/collision.cpp\
	tokamak/rigidbodybase.cpp\
	tokamak/solver.cpp\
	tokamak/rigidbody.cpp\
	tokamak/lines.cpp\
	tokamak/useopcode.cpp\
	tokamak/restcontact.cpp\
	tokamak/constraint.cpp\
	tokamak/dcd.cpp\
	tokamak/perflinux.cpp\
	tokamak/ne_interface.cpp\
	tokamak/simulator.cpp\
	tokamak/sphere.cpp\
	com.badlogic.gdx.physics.tokamak.Simulator.cpp\
	com.badlogic.gdx.physics.tokamak.RigidBody.cpp
 
include $(BUILD_SHARED_LIBRARY)

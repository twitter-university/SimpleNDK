LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)

LOCAL_SRC_FILES := com_twitter_university_android_ndk_FastAdder.c

LOCAL_MODULE := addLib

include $(BUILD_SHARED_LIBRARY)

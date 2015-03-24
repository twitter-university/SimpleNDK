#include "com_twitter_university_android_ndk_FastAdder.h"

/*
 * Class:     com_twitter_university_android_ndk_FastAdder
 * Method:    addNative
 * Signature: (II)I
 */
JNIEXPORT jint JNICALL Java_com_twitter_university_android_ndk_FastAdder_addNative
  (JNIEnv *env, jclass klass, jint a1, jint a2)
{
  return a1 + a2;
}

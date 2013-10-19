/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class com_badlogic_gdx_physics_box2d_World */

#ifndef _Included_com_badlogic_gdx_physics_box2d_World
#define _Included_com_badlogic_gdx_physics_box2d_World
#ifdef __cplusplus
extern "C" {
#endif
/*
 * Class:     com_badlogic_gdx_physics_box2d_World
 * Method:    newWorld
 * Signature: (FFZ)J
 */
JNIEXPORT jlong JNICALL Java_com_badlogic_gdx_physics_box2d_World_newWorld
  (JNIEnv *, jobject, jfloat, jfloat, jboolean);

/*
 * Class:     com_badlogic_gdx_physics_box2d_World
 * Method:    setUseDefaultContactFilter
 * Signature: (Z)V
 */
JNIEXPORT void JNICALL Java_com_badlogic_gdx_physics_box2d_World_setUseDefaultContactFilter
  (JNIEnv *, jobject, jboolean);

/*
 * Class:     com_badlogic_gdx_physics_box2d_World
 * Method:    jniCreateBody
 * Signature: (JIFFFFFFFFZZZZZF)J
 */
JNIEXPORT jlong JNICALL Java_com_badlogic_gdx_physics_box2d_World_jniCreateBody
  (JNIEnv *, jobject, jlong, jint, jfloat, jfloat, jfloat, jfloat, jfloat, jfloat, jfloat, jfloat, jboolean, jboolean, jboolean, jboolean, jboolean, jfloat);

/*
 * Class:     com_badlogic_gdx_physics_box2d_World
 * Method:    jniDestroyBody
 * Signature: (JJ)V
 */
JNIEXPORT void JNICALL Java_com_badlogic_gdx_physics_box2d_World_jniDestroyBody
  (JNIEnv *, jobject, jlong, jlong);

/*
 * Class:     com_badlogic_gdx_physics_box2d_World
 * Method:    jniCreateWheelJoint
 * Signature: (JJJZFFFFFFZFFFF)J
 */
JNIEXPORT jlong JNICALL Java_com_badlogic_gdx_physics_box2d_World_jniCreateWheelJoint
  (JNIEnv *, jobject, jlong, jlong, jlong, jboolean, jfloat, jfloat, jfloat, jfloat, jfloat, jfloat, jboolean, jfloat, jfloat, jfloat, jfloat);

/*
 * Class:     com_badlogic_gdx_physics_box2d_World
 * Method:    jniCreateRopeJoint
 * Signature: (JJJZFFFFF)J
 */
JNIEXPORT jlong JNICALL Java_com_badlogic_gdx_physics_box2d_World_jniCreateRopeJoint
  (JNIEnv *, jobject, jlong, jlong, jlong, jboolean, jfloat, jfloat, jfloat, jfloat, jfloat);

/*
 * Class:     com_badlogic_gdx_physics_box2d_World
 * Method:    jniCreateDistanceJoint
 * Signature: (JJJZFFFFFFF)J
 */
JNIEXPORT jlong JNICALL Java_com_badlogic_gdx_physics_box2d_World_jniCreateDistanceJoint
  (JNIEnv *, jobject, jlong, jlong, jlong, jboolean, jfloat, jfloat, jfloat, jfloat, jfloat, jfloat, jfloat);

/*
 * Class:     com_badlogic_gdx_physics_box2d_World
 * Method:    jniCreateFrictionJoint
 * Signature: (JJJZFFFFFF)J
 */
JNIEXPORT jlong JNICALL Java_com_badlogic_gdx_physics_box2d_World_jniCreateFrictionJoint
  (JNIEnv *, jobject, jlong, jlong, jlong, jboolean, jfloat, jfloat, jfloat, jfloat, jfloat, jfloat);

/*
 * Class:     com_badlogic_gdx_physics_box2d_World
 * Method:    jniCreateGearJoint
 * Signature: (JJJZJJF)J
 */
JNIEXPORT jlong JNICALL Java_com_badlogic_gdx_physics_box2d_World_jniCreateGearJoint
  (JNIEnv *, jobject, jlong, jlong, jlong, jboolean, jlong, jlong, jfloat);

/*
 * Class:     com_badlogic_gdx_physics_box2d_World
 * Method:    jniCreateMouseJoint
 * Signature: (JJJZFFFFF)J
 */
JNIEXPORT jlong JNICALL Java_com_badlogic_gdx_physics_box2d_World_jniCreateMouseJoint
  (JNIEnv *, jobject, jlong, jlong, jlong, jboolean, jfloat, jfloat, jfloat, jfloat, jfloat);

/*
 * Class:     com_badlogic_gdx_physics_box2d_World
 * Method:    jniCreatePrismaticJoint
 * Signature: (JJJZFFFFFFFZFFZFF)J
 */
JNIEXPORT jlong JNICALL Java_com_badlogic_gdx_physics_box2d_World_jniCreatePrismaticJoint
  (JNIEnv *, jobject, jlong, jlong, jlong, jboolean, jfloat, jfloat, jfloat, jfloat, jfloat, jfloat, jfloat, jboolean, jfloat, jfloat, jboolean, jfloat, jfloat);

/*
 * Class:     com_badlogic_gdx_physics_box2d_World
 * Method:    jniCreatePulleyJoint
 * Signature: (JJJZFFFFFFFFFFF)J
 */
JNIEXPORT jlong JNICALL Java_com_badlogic_gdx_physics_box2d_World_jniCreatePulleyJoint
  (JNIEnv *, jobject, jlong, jlong, jlong, jboolean, jfloat, jfloat, jfloat, jfloat, jfloat, jfloat, jfloat, jfloat, jfloat, jfloat, jfloat);

/*
 * Class:     com_badlogic_gdx_physics_box2d_World
 * Method:    jniCreateRevoluteJoint
 * Signature: (JJJZFFFFFZFFZFF)J
 */
JNIEXPORT jlong JNICALL Java_com_badlogic_gdx_physics_box2d_World_jniCreateRevoluteJoint
  (JNIEnv *, jobject, jlong, jlong, jlong, jboolean, jfloat, jfloat, jfloat, jfloat, jfloat, jboolean, jfloat, jfloat, jboolean, jfloat, jfloat);

/*
 * Class:     com_badlogic_gdx_physics_box2d_World
 * Method:    jniCreateWeldJoint
 * Signature: (JJJZFFFFF)J
 */
JNIEXPORT jlong JNICALL Java_com_badlogic_gdx_physics_box2d_World_jniCreateWeldJoint
  (JNIEnv *, jobject, jlong, jlong, jlong, jboolean, jfloat, jfloat, jfloat, jfloat, jfloat);

/*
 * Class:     com_badlogic_gdx_physics_box2d_World
 * Method:    jniDestroyJoint
 * Signature: (JJ)V
 */
JNIEXPORT void JNICALL Java_com_badlogic_gdx_physics_box2d_World_jniDestroyJoint
  (JNIEnv *, jobject, jlong, jlong);

/*
 * Class:     com_badlogic_gdx_physics_box2d_World
 * Method:    jniStep
 * Signature: (JFII)V
 */
JNIEXPORT void JNICALL Java_com_badlogic_gdx_physics_box2d_World_jniStep
  (JNIEnv *, jobject, jlong, jfloat, jint, jint);

/*
 * Class:     com_badlogic_gdx_physics_box2d_World
 * Method:    jniClearForces
 * Signature: (J)V
 */
JNIEXPORT void JNICALL Java_com_badlogic_gdx_physics_box2d_World_jniClearForces
  (JNIEnv *, jobject, jlong);

/*
 * Class:     com_badlogic_gdx_physics_box2d_World
 * Method:    jniSetWarmStarting
 * Signature: (JZ)V
 */
JNIEXPORT void JNICALL Java_com_badlogic_gdx_physics_box2d_World_jniSetWarmStarting
  (JNIEnv *, jobject, jlong, jboolean);

/*
 * Class:     com_badlogic_gdx_physics_box2d_World
 * Method:    jniSetContiousPhysics
 * Signature: (JZ)V
 */
JNIEXPORT void JNICALL Java_com_badlogic_gdx_physics_box2d_World_jniSetContiousPhysics
  (JNIEnv *, jobject, jlong, jboolean);

/*
 * Class:     com_badlogic_gdx_physics_box2d_World
 * Method:    jniGetProxyCount
 * Signature: (J)I
 */
JNIEXPORT jint JNICALL Java_com_badlogic_gdx_physics_box2d_World_jniGetProxyCount
  (JNIEnv *, jobject, jlong);

/*
 * Class:     com_badlogic_gdx_physics_box2d_World
 * Method:    jniGetBodyCount
 * Signature: (J)I
 */
JNIEXPORT jint JNICALL Java_com_badlogic_gdx_physics_box2d_World_jniGetBodyCount
  (JNIEnv *, jobject, jlong);

/*
 * Class:     com_badlogic_gdx_physics_box2d_World
 * Method:    jniGetJointcount
 * Signature: (J)I
 */
JNIEXPORT jint JNICALL Java_com_badlogic_gdx_physics_box2d_World_jniGetJointcount
  (JNIEnv *, jobject, jlong);

/*
 * Class:     com_badlogic_gdx_physics_box2d_World
 * Method:    jniGetContactCount
 * Signature: (J)I
 */
JNIEXPORT jint JNICALL Java_com_badlogic_gdx_physics_box2d_World_jniGetContactCount
  (JNIEnv *, jobject, jlong);

/*
 * Class:     com_badlogic_gdx_physics_box2d_World
 * Method:    jniSetGravity
 * Signature: (JFF)V
 */
JNIEXPORT void JNICALL Java_com_badlogic_gdx_physics_box2d_World_jniSetGravity
  (JNIEnv *, jobject, jlong, jfloat, jfloat);

/*
 * Class:     com_badlogic_gdx_physics_box2d_World
 * Method:    jniGetGravity
 * Signature: (J[F)V
 */
JNIEXPORT void JNICALL Java_com_badlogic_gdx_physics_box2d_World_jniGetGravity
  (JNIEnv *, jobject, jlong, jfloatArray);

/*
 * Class:     com_badlogic_gdx_physics_box2d_World
 * Method:    jniIsLocked
 * Signature: (J)Z
 */
JNIEXPORT jboolean JNICALL Java_com_badlogic_gdx_physics_box2d_World_jniIsLocked
  (JNIEnv *, jobject, jlong);

/*
 * Class:     com_badlogic_gdx_physics_box2d_World
 * Method:    jniSetAutoClearForces
 * Signature: (JZ)V
 */
JNIEXPORT void JNICALL Java_com_badlogic_gdx_physics_box2d_World_jniSetAutoClearForces
  (JNIEnv *, jobject, jlong, jboolean);

/*
 * Class:     com_badlogic_gdx_physics_box2d_World
 * Method:    jniGetAutoClearForces
 * Signature: (J)Z
 */
JNIEXPORT jboolean JNICALL Java_com_badlogic_gdx_physics_box2d_World_jniGetAutoClearForces
  (JNIEnv *, jobject, jlong);

/*
 * Class:     com_badlogic_gdx_physics_box2d_World
 * Method:    jniQueryAABB
 * Signature: (JFFFF)V
 */
JNIEXPORT void JNICALL Java_com_badlogic_gdx_physics_box2d_World_jniQueryAABB
  (JNIEnv *, jobject, jlong, jfloat, jfloat, jfloat, jfloat);

/*
 * Class:     com_badlogic_gdx_physics_box2d_World
 * Method:    jniGetContactList
 * Signature: (J[J)V
 */
JNIEXPORT void JNICALL Java_com_badlogic_gdx_physics_box2d_World_jniGetContactList
  (JNIEnv *, jobject, jlong, jlongArray);

/*
 * Class:     com_badlogic_gdx_physics_box2d_World
 * Method:    jniDispose
 * Signature: (J)V
 */
JNIEXPORT void JNICALL Java_com_badlogic_gdx_physics_box2d_World_jniDispose
  (JNIEnv *, jobject, jlong);

/*
 * Class:     com_badlogic_gdx_physics_box2d_World
 * Method:    setVelocityThreshold
 * Signature: (F)V
 */
JNIEXPORT void JNICALL Java_com_badlogic_gdx_physics_box2d_World_setVelocityThreshold
  (JNIEnv *, jclass, jfloat);

/*
 * Class:     com_badlogic_gdx_physics_box2d_World
 * Method:    getVelocityThreshold
 * Signature: ()F
 */
JNIEXPORT jfloat JNICALL Java_com_badlogic_gdx_physics_box2d_World_getVelocityThreshold
  (JNIEnv *, jclass);

/*
 * Class:     com_badlogic_gdx_physics_box2d_World
 * Method:    jniRayCast
 * Signature: (JFFFF)V
 */
JNIEXPORT void JNICALL Java_com_badlogic_gdx_physics_box2d_World_jniRayCast
  (JNIEnv *, jobject, jlong, jfloat, jfloat, jfloat, jfloat);

#ifdef __cplusplus
}
#endif
#endif

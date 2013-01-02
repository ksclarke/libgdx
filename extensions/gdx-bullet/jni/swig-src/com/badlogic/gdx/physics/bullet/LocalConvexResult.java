/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet;

import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class LocalConvexResult {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected LocalConvexResult(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(LocalConvexResult obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gdxBulletJNI.delete_LocalConvexResult(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public LocalConvexResult(btCollisionObject hitCollisionObject, LocalShapeInfo localShapeInfo, Vector3 hitNormalLocal, Vector3 hitPointLocal, float hitFraction) {
    this(gdxBulletJNI.new_LocalConvexResult(btCollisionObject.getCPtr(hitCollisionObject), hitCollisionObject, LocalShapeInfo.getCPtr(localShapeInfo), localShapeInfo, hitNormalLocal, hitPointLocal, hitFraction), true);
  }

  public void setM_hitCollisionObject(btCollisionObject value) {
    gdxBulletJNI.LocalConvexResult_m_hitCollisionObject_set(swigCPtr, this, btCollisionObject.getCPtr(value), value);
  }

  public btCollisionObject getM_hitCollisionObject() {
	long cPtr = gdxBulletJNI.LocalConvexResult_m_hitCollisionObject_get(swigCPtr, this);
	return (cPtr == 0) ? null : btCollisionObject.getInstance(cPtr, false);
}

  public void setM_localShapeInfo(LocalShapeInfo value) {
    gdxBulletJNI.LocalConvexResult_m_localShapeInfo_set(swigCPtr, this, LocalShapeInfo.getCPtr(value), value);
  }

  public LocalShapeInfo getM_localShapeInfo() {
    long cPtr = gdxBulletJNI.LocalConvexResult_m_localShapeInfo_get(swigCPtr, this);
    return (cPtr == 0) ? null : new LocalShapeInfo(cPtr, false);
  }

  public void setM_hitNormalLocal(btVector3 value) {
    gdxBulletJNI.LocalConvexResult_m_hitNormalLocal_set(swigCPtr, this, btVector3.getCPtr(value), value);
  }

  public btVector3 getM_hitNormalLocal() {
    long cPtr = gdxBulletJNI.LocalConvexResult_m_hitNormalLocal_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3(cPtr, false);
  }

  public void setM_hitPointLocal(btVector3 value) {
    gdxBulletJNI.LocalConvexResult_m_hitPointLocal_set(swigCPtr, this, btVector3.getCPtr(value), value);
  }

  public btVector3 getM_hitPointLocal() {
    long cPtr = gdxBulletJNI.LocalConvexResult_m_hitPointLocal_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3(cPtr, false);
  }

  public void setM_hitFraction(float value) {
    gdxBulletJNI.LocalConvexResult_m_hitFraction_set(swigCPtr, this, value);
  }

  public float getM_hitFraction() {
    return gdxBulletJNI.LocalConvexResult_m_hitFraction_get(swigCPtr, this);
  }

}

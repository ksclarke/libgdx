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

public class SoftBodyMaterialData {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected SoftBodyMaterialData(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(SoftBodyMaterialData obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gdxBulletJNI.delete_SoftBodyMaterialData(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setM_linearStiffness(float value) {
    gdxBulletJNI.SoftBodyMaterialData_m_linearStiffness_set(swigCPtr, this, value);
  }

  public float getM_linearStiffness() {
    return gdxBulletJNI.SoftBodyMaterialData_m_linearStiffness_get(swigCPtr, this);
  }

  public void setM_angularStiffness(float value) {
    gdxBulletJNI.SoftBodyMaterialData_m_angularStiffness_set(swigCPtr, this, value);
  }

  public float getM_angularStiffness() {
    return gdxBulletJNI.SoftBodyMaterialData_m_angularStiffness_get(swigCPtr, this);
  }

  public void setM_volumeStiffness(float value) {
    gdxBulletJNI.SoftBodyMaterialData_m_volumeStiffness_set(swigCPtr, this, value);
  }

  public float getM_volumeStiffness() {
    return gdxBulletJNI.SoftBodyMaterialData_m_volumeStiffness_get(swigCPtr, this);
  }

  public void setM_flags(int value) {
    gdxBulletJNI.SoftBodyMaterialData_m_flags_set(swigCPtr, this, value);
  }

  public int getM_flags() {
    return gdxBulletJNI.SoftBodyMaterialData_m_flags_get(swigCPtr, this);
  }

  public SoftBodyMaterialData() {
    this(gdxBulletJNI.new_SoftBodyMaterialData(), true);
  }

}

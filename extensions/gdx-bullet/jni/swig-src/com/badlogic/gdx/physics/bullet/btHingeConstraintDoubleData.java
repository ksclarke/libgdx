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

public class btHingeConstraintDoubleData {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected btHingeConstraintDoubleData(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(btHingeConstraintDoubleData obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gdxBulletJNI.delete_btHingeConstraintDoubleData(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setM_typeConstraintData(btTypedConstraintData value) {
    gdxBulletJNI.btHingeConstraintDoubleData_m_typeConstraintData_set(swigCPtr, this, btTypedConstraintData.getCPtr(value), value);
  }

  public btTypedConstraintData getM_typeConstraintData() {
    long cPtr = gdxBulletJNI.btHingeConstraintDoubleData_m_typeConstraintData_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btTypedConstraintData(cPtr, false);
  }

  public void setM_rbAFrame(btTransformDoubleData value) {
    gdxBulletJNI.btHingeConstraintDoubleData_m_rbAFrame_set(swigCPtr, this, btTransformDoubleData.getCPtr(value), value);
  }

  public btTransformDoubleData getM_rbAFrame() {
    long cPtr = gdxBulletJNI.btHingeConstraintDoubleData_m_rbAFrame_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btTransformDoubleData(cPtr, false);
  }

  public void setM_rbBFrame(btTransformDoubleData value) {
    gdxBulletJNI.btHingeConstraintDoubleData_m_rbBFrame_set(swigCPtr, this, btTransformDoubleData.getCPtr(value), value);
  }

  public btTransformDoubleData getM_rbBFrame() {
    long cPtr = gdxBulletJNI.btHingeConstraintDoubleData_m_rbBFrame_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btTransformDoubleData(cPtr, false);
  }

  public void setM_useReferenceFrameA(int value) {
    gdxBulletJNI.btHingeConstraintDoubleData_m_useReferenceFrameA_set(swigCPtr, this, value);
  }

  public int getM_useReferenceFrameA() {
    return gdxBulletJNI.btHingeConstraintDoubleData_m_useReferenceFrameA_get(swigCPtr, this);
  }

  public void setM_angularOnly(int value) {
    gdxBulletJNI.btHingeConstraintDoubleData_m_angularOnly_set(swigCPtr, this, value);
  }

  public int getM_angularOnly() {
    return gdxBulletJNI.btHingeConstraintDoubleData_m_angularOnly_get(swigCPtr, this);
  }

  public void setM_enableAngularMotor(int value) {
    gdxBulletJNI.btHingeConstraintDoubleData_m_enableAngularMotor_set(swigCPtr, this, value);
  }

  public int getM_enableAngularMotor() {
    return gdxBulletJNI.btHingeConstraintDoubleData_m_enableAngularMotor_get(swigCPtr, this);
  }

  public void setM_motorTargetVelocity(float value) {
    gdxBulletJNI.btHingeConstraintDoubleData_m_motorTargetVelocity_set(swigCPtr, this, value);
  }

  public float getM_motorTargetVelocity() {
    return gdxBulletJNI.btHingeConstraintDoubleData_m_motorTargetVelocity_get(swigCPtr, this);
  }

  public void setM_maxMotorImpulse(float value) {
    gdxBulletJNI.btHingeConstraintDoubleData_m_maxMotorImpulse_set(swigCPtr, this, value);
  }

  public float getM_maxMotorImpulse() {
    return gdxBulletJNI.btHingeConstraintDoubleData_m_maxMotorImpulse_get(swigCPtr, this);
  }

  public void setM_lowerLimit(float value) {
    gdxBulletJNI.btHingeConstraintDoubleData_m_lowerLimit_set(swigCPtr, this, value);
  }

  public float getM_lowerLimit() {
    return gdxBulletJNI.btHingeConstraintDoubleData_m_lowerLimit_get(swigCPtr, this);
  }

  public void setM_upperLimit(float value) {
    gdxBulletJNI.btHingeConstraintDoubleData_m_upperLimit_set(swigCPtr, this, value);
  }

  public float getM_upperLimit() {
    return gdxBulletJNI.btHingeConstraintDoubleData_m_upperLimit_get(swigCPtr, this);
  }

  public void setM_limitSoftness(float value) {
    gdxBulletJNI.btHingeConstraintDoubleData_m_limitSoftness_set(swigCPtr, this, value);
  }

  public float getM_limitSoftness() {
    return gdxBulletJNI.btHingeConstraintDoubleData_m_limitSoftness_get(swigCPtr, this);
  }

  public void setM_biasFactor(float value) {
    gdxBulletJNI.btHingeConstraintDoubleData_m_biasFactor_set(swigCPtr, this, value);
  }

  public float getM_biasFactor() {
    return gdxBulletJNI.btHingeConstraintDoubleData_m_biasFactor_get(swigCPtr, this);
  }

  public void setM_relaxationFactor(float value) {
    gdxBulletJNI.btHingeConstraintDoubleData_m_relaxationFactor_set(swigCPtr, this, value);
  }

  public float getM_relaxationFactor() {
    return gdxBulletJNI.btHingeConstraintDoubleData_m_relaxationFactor_get(swigCPtr, this);
  }

  public btHingeConstraintDoubleData() {
    this(gdxBulletJNI.new_btHingeConstraintDoubleData(), true);
  }

}

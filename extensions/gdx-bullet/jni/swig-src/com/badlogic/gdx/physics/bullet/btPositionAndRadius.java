/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet;

import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class btPositionAndRadius extends BulletBase {
	private long swigCPtr;
	
	protected btPositionAndRadius(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	protected btPositionAndRadius(long cPtr, boolean cMemoryOwn) {
		this("btPositionAndRadius", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(btPositionAndRadius obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	@Override
	protected void finalize() throws Throwable {
		if (!destroyed)
			destroy();
		super.finalize();
	}

  @Override protected synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				gdxBulletJNI.delete_btPositionAndRadius(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public void setPos(btVector3FloatData value) {
    gdxBulletJNI.btPositionAndRadius_pos_set(swigCPtr, this, btVector3FloatData.getCPtr(value), value);
  }

  public btVector3FloatData getPos() {
    long cPtr = gdxBulletJNI.btPositionAndRadius_pos_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3FloatData(cPtr, false);
  }

  public void setRadius(float value) {
    gdxBulletJNI.btPositionAndRadius_radius_set(swigCPtr, this, value);
  }

  public float getRadius() {
    return gdxBulletJNI.btPositionAndRadius_radius_get(swigCPtr, this);
  }

  public btPositionAndRadius() {
    this(gdxBulletJNI.new_btPositionAndRadius(), true);
  }

}

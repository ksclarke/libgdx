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

public class btPoolAllocator extends BulletBase {
	private long swigCPtr;
	
	protected btPoolAllocator(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	protected btPoolAllocator(long cPtr, boolean cMemoryOwn) {
		this("btPoolAllocator", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(btPoolAllocator obj) {
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
				gdxBulletJNI.delete_btPoolAllocator(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public btPoolAllocator(int elemSize, int maxElements) {
    this(gdxBulletJNI.new_btPoolAllocator(elemSize, maxElements), true);
  }

  public int getFreeCount() {
    return gdxBulletJNI.btPoolAllocator_getFreeCount(swigCPtr, this);
  }

  public int getUsedCount() {
    return gdxBulletJNI.btPoolAllocator_getUsedCount(swigCPtr, this);
  }

  public int getMaxCount() {
    return gdxBulletJNI.btPoolAllocator_getMaxCount(swigCPtr, this);
  }

  public SWIGTYPE_p_void allocate(int size) {
    long cPtr = gdxBulletJNI.btPoolAllocator_allocate(swigCPtr, this, size);
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public boolean validPtr(SWIGTYPE_p_void ptr) {
    return gdxBulletJNI.btPoolAllocator_validPtr(swigCPtr, this, SWIGTYPE_p_void.getCPtr(ptr));
  }

  public void freeMemory(SWIGTYPE_p_void ptr) {
    gdxBulletJNI.btPoolAllocator_freeMemory(swigCPtr, this, SWIGTYPE_p_void.getCPtr(ptr));
  }

  public int getElementSize() {
    return gdxBulletJNI.btPoolAllocator_getElementSize(swigCPtr, this);
  }

  public java.nio.ByteBuffer getPoolAddress() {
    return gdxBulletJNI.btPoolAllocator_getPoolAddress__SWIG_0(swigCPtr, this);
}

}

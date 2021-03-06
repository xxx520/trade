/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.api.jctp;

public class CThostFtdcCFMMCBrokerKeyField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcCFMMCBrokerKeyField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcCFMMCBrokerKeyField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jctpmdapiv6v3v11x64JNI.delete_CThostFtdcCFMMCBrokerKeyField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcCFMMCBrokerKeyField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcCFMMCBrokerKeyField_BrokerID_get(swigCPtr, this);
  }

  public void setParticipantID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcCFMMCBrokerKeyField_ParticipantID_set(swigCPtr, this, value);
  }

  public String getParticipantID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcCFMMCBrokerKeyField_ParticipantID_get(swigCPtr, this);
  }

  public void setCreateDate(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcCFMMCBrokerKeyField_CreateDate_set(swigCPtr, this, value);
  }

  public String getCreateDate() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcCFMMCBrokerKeyField_CreateDate_get(swigCPtr, this);
  }

  public void setCreateTime(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcCFMMCBrokerKeyField_CreateTime_set(swigCPtr, this, value);
  }

  public String getCreateTime() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcCFMMCBrokerKeyField_CreateTime_get(swigCPtr, this);
  }

  public void setKeyID(int value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcCFMMCBrokerKeyField_KeyID_set(swigCPtr, this, value);
  }

  public int getKeyID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcCFMMCBrokerKeyField_KeyID_get(swigCPtr, this);
  }

  public void setCurrentKey(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcCFMMCBrokerKeyField_CurrentKey_set(swigCPtr, this, value);
  }

  public String getCurrentKey() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcCFMMCBrokerKeyField_CurrentKey_get(swigCPtr, this);
  }

  public void setKeyKind(char value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcCFMMCBrokerKeyField_KeyKind_set(swigCPtr, this, value);
  }

  public char getKeyKind() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcCFMMCBrokerKeyField_KeyKind_get(swigCPtr, this);
  }

  public CThostFtdcCFMMCBrokerKeyField() {
    this(jctpmdapiv6v3v11x64JNI.new_CThostFtdcCFMMCBrokerKeyField(), true);
  }

}

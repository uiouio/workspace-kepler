/**
 * Autogenerated by Thrift Compiler (0.8.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.ctfo.sectionspeed.thrift;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GPSInfo implements org.apache.thrift.TBase<GPSInfo, GPSInfo._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("GPSInfo");

  private static final org.apache.thrift.protocol.TField POINT_FIELD_DESC = new org.apache.thrift.protocol.TField("point", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField SPEED_FIELD_DESC = new org.apache.thrift.protocol.TField("speed", org.apache.thrift.protocol.TType.DOUBLE, (short)2);
  private static final org.apache.thrift.protocol.TField ANGLE_FIELD_DESC = new org.apache.thrift.protocol.TField("angle", org.apache.thrift.protocol.TType.DOUBLE, (short)3);
  private static final org.apache.thrift.protocol.TField CF_FIELD_DESC = new org.apache.thrift.protocol.TField("cf", org.apache.thrift.protocol.TType.I32, (short)4);
  private static final org.apache.thrift.protocol.TField DATE_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("date_time", org.apache.thrift.protocol.TType.I64, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new GPSInfoStandardSchemeFactory());
    schemes.put(TupleScheme.class, new GPSInfoTupleSchemeFactory());
  }

  public Point point; // optional
  public double speed; // optional
  public double angle; // optional
  /**
   * 
   * @see CarForm
   */
  public CarForm cf; // optional
  public long date_time; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    POINT((short)1, "point"),
    SPEED((short)2, "speed"),
    ANGLE((short)3, "angle"),
    /**
     * 
     * @see CarForm
     */
    CF((short)4, "cf"),
    DATE_TIME((short)5, "date_time");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // POINT
          return POINT;
        case 2: // SPEED
          return SPEED;
        case 3: // ANGLE
          return ANGLE;
        case 4: // CF
          return CF;
        case 5: // DATE_TIME
          return DATE_TIME;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __SPEED_ISSET_ID = 0;
  private static final int __ANGLE_ISSET_ID = 1;
  private static final int __DATE_TIME_ISSET_ID = 2;
  private BitSet __isset_bit_vector = new BitSet(3);
  private _Fields optionals[] = {_Fields.POINT,_Fields.SPEED,_Fields.ANGLE,_Fields.CF,_Fields.DATE_TIME};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.POINT, new org.apache.thrift.meta_data.FieldMetaData("point", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Point.class)));
    tmpMap.put(_Fields.SPEED, new org.apache.thrift.meta_data.FieldMetaData("speed", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.ANGLE, new org.apache.thrift.meta_data.FieldMetaData("angle", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.CF, new org.apache.thrift.meta_data.FieldMetaData("cf", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, CarForm.class)));
    tmpMap.put(_Fields.DATE_TIME, new org.apache.thrift.meta_data.FieldMetaData("date_time", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(GPSInfo.class, metaDataMap);
  }

  public GPSInfo() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public GPSInfo(GPSInfo other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    if (other.isSetPoint()) {
      this.point = new Point(other.point);
    }
    this.speed = other.speed;
    this.angle = other.angle;
    if (other.isSetCf()) {
      this.cf = other.cf;
    }
    this.date_time = other.date_time;
  }

  public GPSInfo deepCopy() {
    return new GPSInfo(this);
  }

  @Override
  public void clear() {
    this.point = null;
    setSpeedIsSet(false);
    this.speed = 0.0;
    setAngleIsSet(false);
    this.angle = 0.0;
    this.cf = null;
    setDate_timeIsSet(false);
    this.date_time = 0;
  }

  public Point getPoint() {
    return this.point;
  }

  public GPSInfo setPoint(Point point) {
    this.point = point;
    return this;
  }

  public void unsetPoint() {
    this.point = null;
  }

  /** Returns true if field point is set (has been assigned a value) and false otherwise */
  public boolean isSetPoint() {
    return this.point != null;
  }

  public void setPointIsSet(boolean value) {
    if (!value) {
      this.point = null;
    }
  }

  public double getSpeed() {
    return this.speed;
  }

  public GPSInfo setSpeed(double speed) {
    this.speed = speed;
    setSpeedIsSet(true);
    return this;
  }

  public void unsetSpeed() {
    __isset_bit_vector.clear(__SPEED_ISSET_ID);
  }

  /** Returns true if field speed is set (has been assigned a value) and false otherwise */
  public boolean isSetSpeed() {
    return __isset_bit_vector.get(__SPEED_ISSET_ID);
  }

  public void setSpeedIsSet(boolean value) {
    __isset_bit_vector.set(__SPEED_ISSET_ID, value);
  }

  public double getAngle() {
    return this.angle;
  }

  public GPSInfo setAngle(double angle) {
    this.angle = angle;
    setAngleIsSet(true);
    return this;
  }

  public void unsetAngle() {
    __isset_bit_vector.clear(__ANGLE_ISSET_ID);
  }

  /** Returns true if field angle is set (has been assigned a value) and false otherwise */
  public boolean isSetAngle() {
    return __isset_bit_vector.get(__ANGLE_ISSET_ID);
  }

  public void setAngleIsSet(boolean value) {
    __isset_bit_vector.set(__ANGLE_ISSET_ID, value);
  }

  /**
   * 
   * @see CarForm
   */
  public CarForm getCf() {
    return this.cf;
  }

  /**
   * 
   * @see CarForm
   */
  public GPSInfo setCf(CarForm cf) {
    this.cf = cf;
    return this;
  }

  public void unsetCf() {
    this.cf = null;
  }

  /** Returns true if field cf is set (has been assigned a value) and false otherwise */
  public boolean isSetCf() {
    return this.cf != null;
  }

  public void setCfIsSet(boolean value) {
    if (!value) {
      this.cf = null;
    }
  }

  public long getDate_time() {
    return this.date_time;
  }

  public GPSInfo setDate_time(long date_time) {
    this.date_time = date_time;
    setDate_timeIsSet(true);
    return this;
  }

  public void unsetDate_time() {
    __isset_bit_vector.clear(__DATE_TIME_ISSET_ID);
  }

  /** Returns true if field date_time is set (has been assigned a value) and false otherwise */
  public boolean isSetDate_time() {
    return __isset_bit_vector.get(__DATE_TIME_ISSET_ID);
  }

  public void setDate_timeIsSet(boolean value) {
    __isset_bit_vector.set(__DATE_TIME_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case POINT:
      if (value == null) {
        unsetPoint();
      } else {
        setPoint((Point)value);
      }
      break;

    case SPEED:
      if (value == null) {
        unsetSpeed();
      } else {
        setSpeed((Double)value);
      }
      break;

    case ANGLE:
      if (value == null) {
        unsetAngle();
      } else {
        setAngle((Double)value);
      }
      break;

    case CF:
      if (value == null) {
        unsetCf();
      } else {
        setCf((CarForm)value);
      }
      break;

    case DATE_TIME:
      if (value == null) {
        unsetDate_time();
      } else {
        setDate_time((Long)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case POINT:
      return getPoint();

    case SPEED:
      return Double.valueOf(getSpeed());

    case ANGLE:
      return Double.valueOf(getAngle());

    case CF:
      return getCf();

    case DATE_TIME:
      return Long.valueOf(getDate_time());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case POINT:
      return isSetPoint();
    case SPEED:
      return isSetSpeed();
    case ANGLE:
      return isSetAngle();
    case CF:
      return isSetCf();
    case DATE_TIME:
      return isSetDate_time();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof GPSInfo)
      return this.equals((GPSInfo)that);
    return false;
  }

  public boolean equals(GPSInfo that) {
    if (that == null)
      return false;

    boolean this_present_point = true && this.isSetPoint();
    boolean that_present_point = true && that.isSetPoint();
    if (this_present_point || that_present_point) {
      if (!(this_present_point && that_present_point))
        return false;
      if (!this.point.equals(that.point))
        return false;
    }

    boolean this_present_speed = true && this.isSetSpeed();
    boolean that_present_speed = true && that.isSetSpeed();
    if (this_present_speed || that_present_speed) {
      if (!(this_present_speed && that_present_speed))
        return false;
      if (this.speed != that.speed)
        return false;
    }

    boolean this_present_angle = true && this.isSetAngle();
    boolean that_present_angle = true && that.isSetAngle();
    if (this_present_angle || that_present_angle) {
      if (!(this_present_angle && that_present_angle))
        return false;
      if (this.angle != that.angle)
        return false;
    }

    boolean this_present_cf = true && this.isSetCf();
    boolean that_present_cf = true && that.isSetCf();
    if (this_present_cf || that_present_cf) {
      if (!(this_present_cf && that_present_cf))
        return false;
      if (!this.cf.equals(that.cf))
        return false;
    }

    boolean this_present_date_time = true && this.isSetDate_time();
    boolean that_present_date_time = true && that.isSetDate_time();
    if (this_present_date_time || that_present_date_time) {
      if (!(this_present_date_time && that_present_date_time))
        return false;
      if (this.date_time != that.date_time)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(GPSInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    GPSInfo typedOther = (GPSInfo)other;

    lastComparison = Boolean.valueOf(isSetPoint()).compareTo(typedOther.isSetPoint());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPoint()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.point, typedOther.point);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSpeed()).compareTo(typedOther.isSetSpeed());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSpeed()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.speed, typedOther.speed);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAngle()).compareTo(typedOther.isSetAngle());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAngle()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.angle, typedOther.angle);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCf()).compareTo(typedOther.isSetCf());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCf()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.cf, typedOther.cf);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDate_time()).compareTo(typedOther.isSetDate_time());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDate_time()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.date_time, typedOther.date_time);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("GPSInfo(");
    boolean first = true;

    if (isSetPoint()) {
      sb.append("point:");
      if (this.point == null) {
        sb.append("null");
      } else {
        sb.append(this.point);
      }
      first = false;
    }
    if (isSetSpeed()) {
      if (!first) sb.append(", ");
      sb.append("speed:");
      sb.append(this.speed);
      first = false;
    }
    if (isSetAngle()) {
      if (!first) sb.append(", ");
      sb.append("angle:");
      sb.append(this.angle);
      first = false;
    }
    if (isSetCf()) {
      if (!first) sb.append(", ");
      sb.append("cf:");
      if (this.cf == null) {
        sb.append("null");
      } else {
        sb.append(this.cf);
      }
      first = false;
    }
    if (isSetDate_time()) {
      if (!first) sb.append(", ");
      sb.append("date_time:");
      sb.append(this.date_time);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bit_vector = new BitSet(1);
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class GPSInfoStandardSchemeFactory implements SchemeFactory {
    public GPSInfoStandardScheme getScheme() {
      return new GPSInfoStandardScheme();
    }
  }

  private static class GPSInfoStandardScheme extends StandardScheme<GPSInfo> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, GPSInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // POINT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.point = new Point();
              struct.point.read(iprot);
              struct.setPointIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SPEED
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.speed = iprot.readDouble();
              struct.setSpeedIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // ANGLE
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.angle = iprot.readDouble();
              struct.setAngleIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // CF
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.cf = CarForm.findByValue(iprot.readI32());
              struct.setCfIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // DATE_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.date_time = iprot.readI64();
              struct.setDate_timeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, GPSInfo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.point != null) {
        if (struct.isSetPoint()) {
          oprot.writeFieldBegin(POINT_FIELD_DESC);
          struct.point.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetSpeed()) {
        oprot.writeFieldBegin(SPEED_FIELD_DESC);
        oprot.writeDouble(struct.speed);
        oprot.writeFieldEnd();
      }
      if (struct.isSetAngle()) {
        oprot.writeFieldBegin(ANGLE_FIELD_DESC);
        oprot.writeDouble(struct.angle);
        oprot.writeFieldEnd();
      }
      if (struct.cf != null) {
        if (struct.isSetCf()) {
          oprot.writeFieldBegin(CF_FIELD_DESC);
          oprot.writeI32(struct.cf.getValue());
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetDate_time()) {
        oprot.writeFieldBegin(DATE_TIME_FIELD_DESC);
        oprot.writeI64(struct.date_time);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class GPSInfoTupleSchemeFactory implements SchemeFactory {
    public GPSInfoTupleScheme getScheme() {
      return new GPSInfoTupleScheme();
    }
  }

  private static class GPSInfoTupleScheme extends TupleScheme<GPSInfo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, GPSInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetPoint()) {
        optionals.set(0);
      }
      if (struct.isSetSpeed()) {
        optionals.set(1);
      }
      if (struct.isSetAngle()) {
        optionals.set(2);
      }
      if (struct.isSetCf()) {
        optionals.set(3);
      }
      if (struct.isSetDate_time()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetPoint()) {
        struct.point.write(oprot);
      }
      if (struct.isSetSpeed()) {
        oprot.writeDouble(struct.speed);
      }
      if (struct.isSetAngle()) {
        oprot.writeDouble(struct.angle);
      }
      if (struct.isSetCf()) {
        oprot.writeI32(struct.cf.getValue());
      }
      if (struct.isSetDate_time()) {
        oprot.writeI64(struct.date_time);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, GPSInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.point = new Point();
        struct.point.read(iprot);
        struct.setPointIsSet(true);
      }
      if (incoming.get(1)) {
        struct.speed = iprot.readDouble();
        struct.setSpeedIsSet(true);
      }
      if (incoming.get(2)) {
        struct.angle = iprot.readDouble();
        struct.setAngleIsSet(true);
      }
      if (incoming.get(3)) {
        struct.cf = CarForm.findByValue(iprot.readI32());
        struct.setCfIsSet(true);
      }
      if (incoming.get(4)) {
        struct.date_time = iprot.readI64();
        struct.setDate_timeIsSet(true);
      }
    }
  }

}


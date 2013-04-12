/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package cc.twittertools.thrift.gen;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
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

public class TResult implements org.apache.thrift.TBase<TResult, TResult._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TResult");

  private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("id", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField RSV_FIELD_DESC = new org.apache.thrift.protocol.TField("rsv", org.apache.thrift.protocol.TType.DOUBLE, (short)2);
  private static final org.apache.thrift.protocol.TField SCREEN_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("screen_name", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField CREATED_AT_FIELD_DESC = new org.apache.thrift.protocol.TField("created_at", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField TEXT_FIELD_DESC = new org.apache.thrift.protocol.TField("text", org.apache.thrift.protocol.TType.STRING, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TResultStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TResultTupleSchemeFactory());
  }

  public long id; // required
  public double rsv; // required
  public String screen_name; // required
  public String created_at; // required
  public String text; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ID((short)1, "id"),
    RSV((short)2, "rsv"),
    SCREEN_NAME((short)3, "screen_name"),
    CREATED_AT((short)4, "created_at"),
    TEXT((short)5, "text");

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
        case 1: // ID
          return ID;
        case 2: // RSV
          return RSV;
        case 3: // SCREEN_NAME
          return SCREEN_NAME;
        case 4: // CREATED_AT
          return CREATED_AT;
        case 5: // TEXT
          return TEXT;
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
  private static final int __ID_ISSET_ID = 0;
  private static final int __RSV_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("id", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.RSV, new org.apache.thrift.meta_data.FieldMetaData("rsv", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.SCREEN_NAME, new org.apache.thrift.meta_data.FieldMetaData("screen_name", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CREATED_AT, new org.apache.thrift.meta_data.FieldMetaData("created_at", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TEXT, new org.apache.thrift.meta_data.FieldMetaData("text", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TResult.class, metaDataMap);
  }

  public TResult() {
  }

  public TResult(
    long id,
    double rsv,
    String screen_name,
    String created_at,
    String text)
  {
    this();
    this.id = id;
    setIdIsSet(true);
    this.rsv = rsv;
    setRsvIsSet(true);
    this.screen_name = screen_name;
    this.created_at = created_at;
    this.text = text;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TResult(TResult other) {
    __isset_bitfield = other.__isset_bitfield;
    this.id = other.id;
    this.rsv = other.rsv;
    if (other.isSetScreen_name()) {
      this.screen_name = other.screen_name;
    }
    if (other.isSetCreated_at()) {
      this.created_at = other.created_at;
    }
    if (other.isSetText()) {
      this.text = other.text;
    }
  }

  public TResult deepCopy() {
    return new TResult(this);
  }

  @Override
  public void clear() {
    setIdIsSet(false);
    this.id = 0;
    setRsvIsSet(false);
    this.rsv = 0.0;
    this.screen_name = null;
    this.created_at = null;
    this.text = null;
  }

  public long getId() {
    return this.id;
  }

  public TResult setId(long id) {
    this.id = id;
    setIdIsSet(true);
    return this;
  }

  public void unsetId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ID_ISSET_ID);
  }

  /** Returns true if field id is set (has been assigned a value) and false otherwise */
  public boolean isSetId() {
    return EncodingUtils.testBit(__isset_bitfield, __ID_ISSET_ID);
  }

  public void setIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ID_ISSET_ID, value);
  }

  public double getRsv() {
    return this.rsv;
  }

  public TResult setRsv(double rsv) {
    this.rsv = rsv;
    setRsvIsSet(true);
    return this;
  }

  public void unsetRsv() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __RSV_ISSET_ID);
  }

  /** Returns true if field rsv is set (has been assigned a value) and false otherwise */
  public boolean isSetRsv() {
    return EncodingUtils.testBit(__isset_bitfield, __RSV_ISSET_ID);
  }

  public void setRsvIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __RSV_ISSET_ID, value);
  }

  public String getScreen_name() {
    return this.screen_name;
  }

  public TResult setScreen_name(String screen_name) {
    this.screen_name = screen_name;
    return this;
  }

  public void unsetScreen_name() {
    this.screen_name = null;
  }

  /** Returns true if field screen_name is set (has been assigned a value) and false otherwise */
  public boolean isSetScreen_name() {
    return this.screen_name != null;
  }

  public void setScreen_nameIsSet(boolean value) {
    if (!value) {
      this.screen_name = null;
    }
  }

  public String getCreated_at() {
    return this.created_at;
  }

  public TResult setCreated_at(String created_at) {
    this.created_at = created_at;
    return this;
  }

  public void unsetCreated_at() {
    this.created_at = null;
  }

  /** Returns true if field created_at is set (has been assigned a value) and false otherwise */
  public boolean isSetCreated_at() {
    return this.created_at != null;
  }

  public void setCreated_atIsSet(boolean value) {
    if (!value) {
      this.created_at = null;
    }
  }

  public String getText() {
    return this.text;
  }

  public TResult setText(String text) {
    this.text = text;
    return this;
  }

  public void unsetText() {
    this.text = null;
  }

  /** Returns true if field text is set (has been assigned a value) and false otherwise */
  public boolean isSetText() {
    return this.text != null;
  }

  public void setTextIsSet(boolean value) {
    if (!value) {
      this.text = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ID:
      if (value == null) {
        unsetId();
      } else {
        setId((Long)value);
      }
      break;

    case RSV:
      if (value == null) {
        unsetRsv();
      } else {
        setRsv((Double)value);
      }
      break;

    case SCREEN_NAME:
      if (value == null) {
        unsetScreen_name();
      } else {
        setScreen_name((String)value);
      }
      break;

    case CREATED_AT:
      if (value == null) {
        unsetCreated_at();
      } else {
        setCreated_at((String)value);
      }
      break;

    case TEXT:
      if (value == null) {
        unsetText();
      } else {
        setText((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ID:
      return Long.valueOf(getId());

    case RSV:
      return Double.valueOf(getRsv());

    case SCREEN_NAME:
      return getScreen_name();

    case CREATED_AT:
      return getCreated_at();

    case TEXT:
      return getText();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ID:
      return isSetId();
    case RSV:
      return isSetRsv();
    case SCREEN_NAME:
      return isSetScreen_name();
    case CREATED_AT:
      return isSetCreated_at();
    case TEXT:
      return isSetText();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TResult)
      return this.equals((TResult)that);
    return false;
  }

  public boolean equals(TResult that) {
    if (that == null)
      return false;

    boolean this_present_id = true;
    boolean that_present_id = true;
    if (this_present_id || that_present_id) {
      if (!(this_present_id && that_present_id))
        return false;
      if (this.id != that.id)
        return false;
    }

    boolean this_present_rsv = true;
    boolean that_present_rsv = true;
    if (this_present_rsv || that_present_rsv) {
      if (!(this_present_rsv && that_present_rsv))
        return false;
      if (this.rsv != that.rsv)
        return false;
    }

    boolean this_present_screen_name = true && this.isSetScreen_name();
    boolean that_present_screen_name = true && that.isSetScreen_name();
    if (this_present_screen_name || that_present_screen_name) {
      if (!(this_present_screen_name && that_present_screen_name))
        return false;
      if (!this.screen_name.equals(that.screen_name))
        return false;
    }

    boolean this_present_created_at = true && this.isSetCreated_at();
    boolean that_present_created_at = true && that.isSetCreated_at();
    if (this_present_created_at || that_present_created_at) {
      if (!(this_present_created_at && that_present_created_at))
        return false;
      if (!this.created_at.equals(that.created_at))
        return false;
    }

    boolean this_present_text = true && this.isSetText();
    boolean that_present_text = true && that.isSetText();
    if (this_present_text || that_present_text) {
      if (!(this_present_text && that_present_text))
        return false;
      if (!this.text.equals(that.text))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(TResult other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    TResult typedOther = (TResult)other;

    lastComparison = Boolean.valueOf(isSetId()).compareTo(typedOther.isSetId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.id, typedOther.id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRsv()).compareTo(typedOther.isSetRsv());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRsv()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.rsv, typedOther.rsv);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetScreen_name()).compareTo(typedOther.isSetScreen_name());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetScreen_name()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.screen_name, typedOther.screen_name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCreated_at()).compareTo(typedOther.isSetCreated_at());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCreated_at()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.created_at, typedOther.created_at);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetText()).compareTo(typedOther.isSetText());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetText()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.text, typedOther.text);
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
    StringBuilder sb = new StringBuilder("TResult(");
    boolean first = true;

    sb.append("id:");
    sb.append(this.id);
    first = false;
    if (!first) sb.append(", ");
    sb.append("rsv:");
    sb.append(this.rsv);
    first = false;
    if (!first) sb.append(", ");
    sb.append("screen_name:");
    if (this.screen_name == null) {
      sb.append("null");
    } else {
      sb.append(this.screen_name);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("created_at:");
    if (this.created_at == null) {
      sb.append("null");
    } else {
      sb.append(this.created_at);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("text:");
    if (this.text == null) {
      sb.append("null");
    } else {
      sb.append(this.text);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
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
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TResultStandardSchemeFactory implements SchemeFactory {
    public TResultStandardScheme getScheme() {
      return new TResultStandardScheme();
    }
  }

  private static class TResultStandardScheme extends StandardScheme<TResult> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.id = iprot.readI64();
              struct.setIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // RSV
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.rsv = iprot.readDouble();
              struct.setRsvIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // SCREEN_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.screen_name = iprot.readString();
              struct.setScreen_nameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // CREATED_AT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.created_at = iprot.readString();
              struct.setCreated_atIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // TEXT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.text = iprot.readString();
              struct.setTextIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TResult struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(ID_FIELD_DESC);
      oprot.writeI64(struct.id);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(RSV_FIELD_DESC);
      oprot.writeDouble(struct.rsv);
      oprot.writeFieldEnd();
      if (struct.screen_name != null) {
        oprot.writeFieldBegin(SCREEN_NAME_FIELD_DESC);
        oprot.writeString(struct.screen_name);
        oprot.writeFieldEnd();
      }
      if (struct.created_at != null) {
        oprot.writeFieldBegin(CREATED_AT_FIELD_DESC);
        oprot.writeString(struct.created_at);
        oprot.writeFieldEnd();
      }
      if (struct.text != null) {
        oprot.writeFieldBegin(TEXT_FIELD_DESC);
        oprot.writeString(struct.text);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TResultTupleSchemeFactory implements SchemeFactory {
    public TResultTupleScheme getScheme() {
      return new TResultTupleScheme();
    }
  }

  private static class TResultTupleScheme extends TupleScheme<TResult> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TResult struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetId()) {
        optionals.set(0);
      }
      if (struct.isSetRsv()) {
        optionals.set(1);
      }
      if (struct.isSetScreen_name()) {
        optionals.set(2);
      }
      if (struct.isSetCreated_at()) {
        optionals.set(3);
      }
      if (struct.isSetText()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetId()) {
        oprot.writeI64(struct.id);
      }
      if (struct.isSetRsv()) {
        oprot.writeDouble(struct.rsv);
      }
      if (struct.isSetScreen_name()) {
        oprot.writeString(struct.screen_name);
      }
      if (struct.isSetCreated_at()) {
        oprot.writeString(struct.created_at);
      }
      if (struct.isSetText()) {
        oprot.writeString(struct.text);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TResult struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.id = iprot.readI64();
        struct.setIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.rsv = iprot.readDouble();
        struct.setRsvIsSet(true);
      }
      if (incoming.get(2)) {
        struct.screen_name = iprot.readString();
        struct.setScreen_nameIsSet(true);
      }
      if (incoming.get(3)) {
        struct.created_at = iprot.readString();
        struct.setCreated_atIsSet(true);
      }
      if (incoming.get(4)) {
        struct.text = iprot.readString();
        struct.setTextIsSet(true);
      }
    }
  }

}

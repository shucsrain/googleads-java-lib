/**
 * ConversionTrackerCategory.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201402.cm;

public class ConversionTrackerCategory implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ConversionTrackerCategory(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _DEFAULT = "DEFAULT";
    public static final java.lang.String _PAGE_VIEW = "PAGE_VIEW";
    public static final java.lang.String _PURCHASE = "PURCHASE";
    public static final java.lang.String _SIGNUP = "SIGNUP";
    public static final java.lang.String _LEAD = "LEAD";
    public static final java.lang.String _REMARKETING = "REMARKETING";
    public static final java.lang.String _DOWNLOAD = "DOWNLOAD";
    public static final ConversionTrackerCategory DEFAULT = new ConversionTrackerCategory(_DEFAULT);
    public static final ConversionTrackerCategory PAGE_VIEW = new ConversionTrackerCategory(_PAGE_VIEW);
    public static final ConversionTrackerCategory PURCHASE = new ConversionTrackerCategory(_PURCHASE);
    public static final ConversionTrackerCategory SIGNUP = new ConversionTrackerCategory(_SIGNUP);
    public static final ConversionTrackerCategory LEAD = new ConversionTrackerCategory(_LEAD);
    public static final ConversionTrackerCategory REMARKETING = new ConversionTrackerCategory(_REMARKETING);
    public static final ConversionTrackerCategory DOWNLOAD = new ConversionTrackerCategory(_DOWNLOAD);
    public java.lang.String getValue() { return _value_;}
    public static ConversionTrackerCategory fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ConversionTrackerCategory enumeration = (ConversionTrackerCategory)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ConversionTrackerCategory fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConversionTrackerCategory.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201402", "ConversionTracker.Category"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}

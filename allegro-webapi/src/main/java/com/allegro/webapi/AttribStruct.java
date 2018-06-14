/**
 * AttribStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class AttribStruct  implements java.io.Serializable {
    private java.lang.String attribName;

    private com.allegro.webapi.ArrayOfString attribValues;

    public AttribStruct() {
    }

    public AttribStruct(
           java.lang.String attribName,
           com.allegro.webapi.ArrayOfString attribValues) {
           this.attribName = attribName;
           this.attribValues = attribValues;
    }


    /**
     * Gets the attribName value for this AttribStruct.
     * 
     * @return attribName
     */
    public java.lang.String getAttribName() {
        return attribName;
    }


    /**
     * Sets the attribName value for this AttribStruct.
     * 
     * @param attribName
     */
    public void setAttribName(java.lang.String attribName) {
        this.attribName = attribName;
    }


    /**
     * Gets the attribValues value for this AttribStruct.
     * 
     * @return attribValues
     */
    public com.allegro.webapi.ArrayOfString getAttribValues() {
        return attribValues;
    }


    /**
     * Sets the attribValues value for this AttribStruct.
     * 
     * @param attribValues
     */
    public void setAttribValues(com.allegro.webapi.ArrayOfString attribValues) {
        this.attribValues = attribValues;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AttribStruct)) return false;
        AttribStruct other = (AttribStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.attribName==null && other.getAttribName()==null) || 
             (this.attribName!=null &&
              this.attribName.equals(other.getAttribName()))) &&
            ((this.attribValues==null && other.getAttribValues()==null) || 
             (this.attribValues!=null &&
              this.attribValues.equals(other.getAttribValues())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getAttribName() != null) {
            _hashCode += getAttribName().hashCode();
        }
        if (getAttribValues() != null) {
            _hashCode += getAttribValues().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AttribStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl.allegrosandbox.pl/service.php", "AttribStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attribName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl.allegrosandbox.pl/service.php", "attribName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attribValues");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl.allegrosandbox.pl/service.php", "attribValues"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl.allegrosandbox.pl/service.php", "ArrayOfString"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}

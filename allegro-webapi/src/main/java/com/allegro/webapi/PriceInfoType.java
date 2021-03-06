/**
 * PriceInfoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class PriceInfoType  implements java.io.Serializable {
    private java.lang.String priceType;

    private float priceValue;

    public PriceInfoType() {
    }

    public PriceInfoType(
           java.lang.String priceType,
           float priceValue) {
           this.priceType = priceType;
           this.priceValue = priceValue;
    }


    /**
     * Gets the priceType value for this PriceInfoType.
     * 
     * @return priceType
     */
    public java.lang.String getPriceType() {
        return priceType;
    }


    /**
     * Sets the priceType value for this PriceInfoType.
     * 
     * @param priceType
     */
    public void setPriceType(java.lang.String priceType) {
        this.priceType = priceType;
    }


    /**
     * Gets the priceValue value for this PriceInfoType.
     * 
     * @return priceValue
     */
    public float getPriceValue() {
        return priceValue;
    }


    /**
     * Sets the priceValue value for this PriceInfoType.
     * 
     * @param priceValue
     */
    public void setPriceValue(float priceValue) {
        this.priceValue = priceValue;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PriceInfoType)) return false;
        PriceInfoType other = (PriceInfoType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.priceType==null && other.getPriceType()==null) || 
             (this.priceType!=null &&
              this.priceType.equals(other.getPriceType()))) &&
            this.priceValue == other.getPriceValue();
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
        if (getPriceType() != null) {
            _hashCode += getPriceType().hashCode();
        }
        _hashCode += new Float(getPriceValue()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PriceInfoType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl.allegrosandbox.pl/service.php", "PriceInfoType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priceType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl.allegrosandbox.pl/service.php", "priceType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priceValue");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl.allegrosandbox.pl/service.php", "priceValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
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

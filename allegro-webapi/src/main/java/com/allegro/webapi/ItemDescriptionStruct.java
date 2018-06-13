/**
 * ItemDescriptionStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class ItemDescriptionStruct  implements java.io.Serializable {
    private java.lang.String descriptionResult;

    public ItemDescriptionStruct() {
    }

    public ItemDescriptionStruct(
           java.lang.String descriptionResult) {
           this.descriptionResult = descriptionResult;
    }


    /**
     * Gets the descriptionResult value for this ItemDescriptionStruct.
     * 
     * @return descriptionResult
     */
    public java.lang.String getDescriptionResult() {
        return descriptionResult;
    }


    /**
     * Sets the descriptionResult value for this ItemDescriptionStruct.
     * 
     * @param descriptionResult
     */
    public void setDescriptionResult(java.lang.String descriptionResult) {
        this.descriptionResult = descriptionResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ItemDescriptionStruct)) return false;
        ItemDescriptionStruct other = (ItemDescriptionStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.descriptionResult==null && other.getDescriptionResult()==null) || 
             (this.descriptionResult!=null &&
              this.descriptionResult.equals(other.getDescriptionResult())));
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
        if (getDescriptionResult() != null) {
            _hashCode += getDescriptionResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ItemDescriptionStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl.allegrosandbox.pl/service.php", "ItemDescriptionStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descriptionResult");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl.allegrosandbox.pl/service.php", "descriptionResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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

/**
 * DoCheckItemDescriptionResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class DoCheckItemDescriptionResponse  implements java.io.Serializable {
    private com.allegro.webapi.ItemDescriptionStruct itemDescription;

    public DoCheckItemDescriptionResponse() {
    }

    public DoCheckItemDescriptionResponse(
           com.allegro.webapi.ItemDescriptionStruct itemDescription) {
           this.itemDescription = itemDescription;
    }


    /**
     * Gets the itemDescription value for this DoCheckItemDescriptionResponse.
     * 
     * @return itemDescription
     */
    public com.allegro.webapi.ItemDescriptionStruct getItemDescription() {
        return itemDescription;
    }


    /**
     * Sets the itemDescription value for this DoCheckItemDescriptionResponse.
     * 
     * @param itemDescription
     */
    public void setItemDescription(com.allegro.webapi.ItemDescriptionStruct itemDescription) {
        this.itemDescription = itemDescription;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoCheckItemDescriptionResponse)) return false;
        DoCheckItemDescriptionResponse other = (DoCheckItemDescriptionResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.itemDescription==null && other.getItemDescription()==null) || 
             (this.itemDescription!=null &&
              this.itemDescription.equals(other.getItemDescription())));
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
        if (getItemDescription() != null) {
            _hashCode += getItemDescription().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoCheckItemDescriptionResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl.allegrosandbox.pl/service.php", ">doCheckItemDescriptionResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl.allegrosandbox.pl/service.php", "itemDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl.allegrosandbox.pl/service.php", "ItemDescriptionStruct"));
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

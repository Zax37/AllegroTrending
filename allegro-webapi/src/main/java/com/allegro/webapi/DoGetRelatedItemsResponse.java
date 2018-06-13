/**
 * DoGetRelatedItemsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class DoGetRelatedItemsResponse  implements java.io.Serializable {
    private com.allegro.webapi.RelatedItemsStruct relatedItems;

    public DoGetRelatedItemsResponse() {
    }

    public DoGetRelatedItemsResponse(
           com.allegro.webapi.RelatedItemsStruct relatedItems) {
           this.relatedItems = relatedItems;
    }


    /**
     * Gets the relatedItems value for this DoGetRelatedItemsResponse.
     * 
     * @return relatedItems
     */
    public com.allegro.webapi.RelatedItemsStruct getRelatedItems() {
        return relatedItems;
    }


    /**
     * Sets the relatedItems value for this DoGetRelatedItemsResponse.
     * 
     * @param relatedItems
     */
    public void setRelatedItems(com.allegro.webapi.RelatedItemsStruct relatedItems) {
        this.relatedItems = relatedItems;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoGetRelatedItemsResponse)) return false;
        DoGetRelatedItemsResponse other = (DoGetRelatedItemsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.relatedItems==null && other.getRelatedItems()==null) || 
             (this.relatedItems!=null &&
              this.relatedItems.equals(other.getRelatedItems())));
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
        if (getRelatedItems() != null) {
            _hashCode += getRelatedItems().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoGetRelatedItemsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl.allegrosandbox.pl/service.php", ">doGetRelatedItemsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relatedItems");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl.allegrosandbox.pl/service.php", "relatedItems"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl.allegrosandbox.pl/service.php", "RelatedItemsStruct"));
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

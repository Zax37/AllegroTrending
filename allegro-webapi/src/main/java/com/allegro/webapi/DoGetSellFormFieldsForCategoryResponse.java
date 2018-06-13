/**
 * DoGetSellFormFieldsForCategoryResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class DoGetSellFormFieldsForCategoryResponse  implements java.io.Serializable {
    private com.allegro.webapi.SellFormFieldsForCategoryStruct sellFormFieldsForCategory;

    public DoGetSellFormFieldsForCategoryResponse() {
    }

    public DoGetSellFormFieldsForCategoryResponse(
           com.allegro.webapi.SellFormFieldsForCategoryStruct sellFormFieldsForCategory) {
           this.sellFormFieldsForCategory = sellFormFieldsForCategory;
    }


    /**
     * Gets the sellFormFieldsForCategory value for this DoGetSellFormFieldsForCategoryResponse.
     * 
     * @return sellFormFieldsForCategory
     */
    public com.allegro.webapi.SellFormFieldsForCategoryStruct getSellFormFieldsForCategory() {
        return sellFormFieldsForCategory;
    }


    /**
     * Sets the sellFormFieldsForCategory value for this DoGetSellFormFieldsForCategoryResponse.
     * 
     * @param sellFormFieldsForCategory
     */
    public void setSellFormFieldsForCategory(com.allegro.webapi.SellFormFieldsForCategoryStruct sellFormFieldsForCategory) {
        this.sellFormFieldsForCategory = sellFormFieldsForCategory;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoGetSellFormFieldsForCategoryResponse)) return false;
        DoGetSellFormFieldsForCategoryResponse other = (DoGetSellFormFieldsForCategoryResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sellFormFieldsForCategory==null && other.getSellFormFieldsForCategory()==null) || 
             (this.sellFormFieldsForCategory!=null &&
              this.sellFormFieldsForCategory.equals(other.getSellFormFieldsForCategory())));
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
        if (getSellFormFieldsForCategory() != null) {
            _hashCode += getSellFormFieldsForCategory().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoGetSellFormFieldsForCategoryResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl.allegrosandbox.pl/service.php", ">doGetSellFormFieldsForCategoryResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellFormFieldsForCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl.allegrosandbox.pl/service.php", "sellFormFieldsForCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl.allegrosandbox.pl/service.php", "SellFormFieldsForCategoryStruct"));
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

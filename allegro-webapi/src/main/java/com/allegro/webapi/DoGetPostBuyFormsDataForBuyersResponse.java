/**
 * DoGetPostBuyFormsDataForBuyersResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class DoGetPostBuyFormsDataForBuyersResponse  implements java.io.Serializable {
    private com.allegro.webapi.ArrayOfPostbuyformforbuyersdatastruct postBuyFormDataForBuyers;

    public DoGetPostBuyFormsDataForBuyersResponse() {
    }

    public DoGetPostBuyFormsDataForBuyersResponse(
           com.allegro.webapi.ArrayOfPostbuyformforbuyersdatastruct postBuyFormDataForBuyers) {
           this.postBuyFormDataForBuyers = postBuyFormDataForBuyers;
    }


    /**
     * Gets the postBuyFormDataForBuyers value for this DoGetPostBuyFormsDataForBuyersResponse.
     * 
     * @return postBuyFormDataForBuyers
     */
    public com.allegro.webapi.ArrayOfPostbuyformforbuyersdatastruct getPostBuyFormDataForBuyers() {
        return postBuyFormDataForBuyers;
    }


    /**
     * Sets the postBuyFormDataForBuyers value for this DoGetPostBuyFormsDataForBuyersResponse.
     * 
     * @param postBuyFormDataForBuyers
     */
    public void setPostBuyFormDataForBuyers(com.allegro.webapi.ArrayOfPostbuyformforbuyersdatastruct postBuyFormDataForBuyers) {
        this.postBuyFormDataForBuyers = postBuyFormDataForBuyers;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoGetPostBuyFormsDataForBuyersResponse)) return false;
        DoGetPostBuyFormsDataForBuyersResponse other = (DoGetPostBuyFormsDataForBuyersResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.postBuyFormDataForBuyers==null && other.getPostBuyFormDataForBuyers()==null) || 
             (this.postBuyFormDataForBuyers!=null &&
              this.postBuyFormDataForBuyers.equals(other.getPostBuyFormDataForBuyers())));
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
        if (getPostBuyFormDataForBuyers() != null) {
            _hashCode += getPostBuyFormDataForBuyers().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoGetPostBuyFormsDataForBuyersResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl.allegrosandbox.pl/service.php", ">doGetPostBuyFormsDataForBuyersResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postBuyFormDataForBuyers");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl.allegrosandbox.pl/service.php", "postBuyFormDataForBuyers"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl.allegrosandbox.pl/service.php", "ArrayOfPostbuyformforbuyersdatastruct"));
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

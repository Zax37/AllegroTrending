/**
 * DoRemoveFromBlackListResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class DoRemoveFromBlackListResponse  implements java.io.Serializable {
    private com.allegro.webapi.ArrayOfBlacklistresstruct blackListResult;

    public DoRemoveFromBlackListResponse() {
    }

    public DoRemoveFromBlackListResponse(
           com.allegro.webapi.ArrayOfBlacklistresstruct blackListResult) {
           this.blackListResult = blackListResult;
    }


    /**
     * Gets the blackListResult value for this DoRemoveFromBlackListResponse.
     * 
     * @return blackListResult
     */
    public com.allegro.webapi.ArrayOfBlacklistresstruct getBlackListResult() {
        return blackListResult;
    }


    /**
     * Sets the blackListResult value for this DoRemoveFromBlackListResponse.
     * 
     * @param blackListResult
     */
    public void setBlackListResult(com.allegro.webapi.ArrayOfBlacklistresstruct blackListResult) {
        this.blackListResult = blackListResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoRemoveFromBlackListResponse)) return false;
        DoRemoveFromBlackListResponse other = (DoRemoveFromBlackListResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.blackListResult==null && other.getBlackListResult()==null) || 
             (this.blackListResult!=null &&
              this.blackListResult.equals(other.getBlackListResult())));
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
        if (getBlackListResult() != null) {
            _hashCode += getBlackListResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoRemoveFromBlackListResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl.allegrosandbox.pl/service.php", ">doRemoveFromBlackListResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blackListResult");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl.allegrosandbox.pl/service.php", "blackListResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl.allegrosandbox.pl/service.php", "ArrayOfBlacklistresstruct"));
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

/**
 * DoGetBidItem2Response.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class DoGetBidItem2Response  implements java.io.Serializable {
    private com.allegro.webapi.ArrayOfBidliststruct2 biditemList;

    public DoGetBidItem2Response() {
    }

    public DoGetBidItem2Response(
           com.allegro.webapi.ArrayOfBidliststruct2 biditemList) {
           this.biditemList = biditemList;
    }


    /**
     * Gets the biditemList value for this DoGetBidItem2Response.
     * 
     * @return biditemList
     */
    public com.allegro.webapi.ArrayOfBidliststruct2 getBiditemList() {
        return biditemList;
    }


    /**
     * Sets the biditemList value for this DoGetBidItem2Response.
     * 
     * @param biditemList
     */
    public void setBiditemList(com.allegro.webapi.ArrayOfBidliststruct2 biditemList) {
        this.biditemList = biditemList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoGetBidItem2Response)) return false;
        DoGetBidItem2Response other = (DoGetBidItem2Response) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.biditemList==null && other.getBiditemList()==null) || 
             (this.biditemList!=null &&
              this.biditemList.equals(other.getBiditemList())));
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
        if (getBiditemList() != null) {
            _hashCode += getBiditemList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoGetBidItem2Response.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl.allegrosandbox.pl/service.php", ">doGetBidItem2Response"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biditemList");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl.allegrosandbox.pl/service.php", "biditemList"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl.allegrosandbox.pl/service.php", "ArrayOfBidliststruct2"));
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

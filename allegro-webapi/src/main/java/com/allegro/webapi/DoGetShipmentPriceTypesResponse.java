/**
 * DoGetShipmentPriceTypesResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class DoGetShipmentPriceTypesResponse  implements java.io.Serializable {
    private com.allegro.webapi.ArrayOfShipmentpricetypestruct shipmentPriceTypes;

    public DoGetShipmentPriceTypesResponse() {
    }

    public DoGetShipmentPriceTypesResponse(
           com.allegro.webapi.ArrayOfShipmentpricetypestruct shipmentPriceTypes) {
           this.shipmentPriceTypes = shipmentPriceTypes;
    }


    /**
     * Gets the shipmentPriceTypes value for this DoGetShipmentPriceTypesResponse.
     * 
     * @return shipmentPriceTypes
     */
    public com.allegro.webapi.ArrayOfShipmentpricetypestruct getShipmentPriceTypes() {
        return shipmentPriceTypes;
    }


    /**
     * Sets the shipmentPriceTypes value for this DoGetShipmentPriceTypesResponse.
     * 
     * @param shipmentPriceTypes
     */
    public void setShipmentPriceTypes(com.allegro.webapi.ArrayOfShipmentpricetypestruct shipmentPriceTypes) {
        this.shipmentPriceTypes = shipmentPriceTypes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoGetShipmentPriceTypesResponse)) return false;
        DoGetShipmentPriceTypesResponse other = (DoGetShipmentPriceTypesResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.shipmentPriceTypes==null && other.getShipmentPriceTypes()==null) || 
             (this.shipmentPriceTypes!=null &&
              this.shipmentPriceTypes.equals(other.getShipmentPriceTypes())));
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
        if (getShipmentPriceTypes() != null) {
            _hashCode += getShipmentPriceTypes().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoGetShipmentPriceTypesResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl.allegrosandbox.pl/service.php", ">doGetShipmentPriceTypesResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipmentPriceTypes");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl.allegrosandbox.pl/service.php", "shipmentPriceTypes"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl.allegrosandbox.pl/service.php", "ArrayOfShipmentpricetypestruct"));
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

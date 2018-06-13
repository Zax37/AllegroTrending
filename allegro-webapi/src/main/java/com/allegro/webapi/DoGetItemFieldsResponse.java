/**
 * DoGetItemFieldsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class DoGetItemFieldsResponse  implements java.io.Serializable {
    private com.allegro.webapi.ArrayOfFieldsvalue itemFields;

    private com.allegro.webapi.AfterSalesServiceConditionsStruct afterSalesServiceConditions;

    private java.lang.String additionalServicesGroup;

    public DoGetItemFieldsResponse() {
    }

    public DoGetItemFieldsResponse(
           com.allegro.webapi.ArrayOfFieldsvalue itemFields,
           com.allegro.webapi.AfterSalesServiceConditionsStruct afterSalesServiceConditions,
           java.lang.String additionalServicesGroup) {
           this.itemFields = itemFields;
           this.afterSalesServiceConditions = afterSalesServiceConditions;
           this.additionalServicesGroup = additionalServicesGroup;
    }


    /**
     * Gets the itemFields value for this DoGetItemFieldsResponse.
     * 
     * @return itemFields
     */
    public com.allegro.webapi.ArrayOfFieldsvalue getItemFields() {
        return itemFields;
    }


    /**
     * Sets the itemFields value for this DoGetItemFieldsResponse.
     * 
     * @param itemFields
     */
    public void setItemFields(com.allegro.webapi.ArrayOfFieldsvalue itemFields) {
        this.itemFields = itemFields;
    }


    /**
     * Gets the afterSalesServiceConditions value for this DoGetItemFieldsResponse.
     * 
     * @return afterSalesServiceConditions
     */
    public com.allegro.webapi.AfterSalesServiceConditionsStruct getAfterSalesServiceConditions() {
        return afterSalesServiceConditions;
    }


    /**
     * Sets the afterSalesServiceConditions value for this DoGetItemFieldsResponse.
     * 
     * @param afterSalesServiceConditions
     */
    public void setAfterSalesServiceConditions(com.allegro.webapi.AfterSalesServiceConditionsStruct afterSalesServiceConditions) {
        this.afterSalesServiceConditions = afterSalesServiceConditions;
    }


    /**
     * Gets the additionalServicesGroup value for this DoGetItemFieldsResponse.
     * 
     * @return additionalServicesGroup
     */
    public java.lang.String getAdditionalServicesGroup() {
        return additionalServicesGroup;
    }


    /**
     * Sets the additionalServicesGroup value for this DoGetItemFieldsResponse.
     * 
     * @param additionalServicesGroup
     */
    public void setAdditionalServicesGroup(java.lang.String additionalServicesGroup) {
        this.additionalServicesGroup = additionalServicesGroup;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoGetItemFieldsResponse)) return false;
        DoGetItemFieldsResponse other = (DoGetItemFieldsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.itemFields==null && other.getItemFields()==null) || 
             (this.itemFields!=null &&
              this.itemFields.equals(other.getItemFields()))) &&
            ((this.afterSalesServiceConditions==null && other.getAfterSalesServiceConditions()==null) || 
             (this.afterSalesServiceConditions!=null &&
              this.afterSalesServiceConditions.equals(other.getAfterSalesServiceConditions()))) &&
            ((this.additionalServicesGroup==null && other.getAdditionalServicesGroup()==null) || 
             (this.additionalServicesGroup!=null &&
              this.additionalServicesGroup.equals(other.getAdditionalServicesGroup())));
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
        if (getItemFields() != null) {
            _hashCode += getItemFields().hashCode();
        }
        if (getAfterSalesServiceConditions() != null) {
            _hashCode += getAfterSalesServiceConditions().hashCode();
        }
        if (getAdditionalServicesGroup() != null) {
            _hashCode += getAdditionalServicesGroup().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoGetItemFieldsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl.allegrosandbox.pl/service.php", ">doGetItemFieldsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemFields");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl.allegrosandbox.pl/service.php", "itemFields"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl.allegrosandbox.pl/service.php", "ArrayOfFieldsvalue"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("afterSalesServiceConditions");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl.allegrosandbox.pl/service.php", "afterSalesServiceConditions"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl.allegrosandbox.pl/service.php", "AfterSalesServiceConditionsStruct"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalServicesGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl.allegrosandbox.pl/service.php", "additionalServicesGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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

/**
 * UserPaymentStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class UserPaymentStruct  implements java.io.Serializable {
    private long payTransId;

    private com.allegro.webapi.ArrayOfPaymentsellersstruct payTransSellers;

    private java.lang.String payTransType;

    private java.lang.String payTransStatus;

    private float payTransAmount;

    private long payTransCreateDate;

    private float payTransPrice;

    private float payTransPostageAmount;

    private int payTransIncomplete;

    public UserPaymentStruct() {
    }

    public UserPaymentStruct(
           long payTransId,
           com.allegro.webapi.ArrayOfPaymentsellersstruct payTransSellers,
           java.lang.String payTransType,
           java.lang.String payTransStatus,
           float payTransAmount,
           long payTransCreateDate,
           float payTransPrice,
           float payTransPostageAmount,
           int payTransIncomplete) {
           this.payTransId = payTransId;
           this.payTransSellers = payTransSellers;
           this.payTransType = payTransType;
           this.payTransStatus = payTransStatus;
           this.payTransAmount = payTransAmount;
           this.payTransCreateDate = payTransCreateDate;
           this.payTransPrice = payTransPrice;
           this.payTransPostageAmount = payTransPostageAmount;
           this.payTransIncomplete = payTransIncomplete;
    }


    /**
     * Gets the payTransId value for this UserPaymentStruct.
     * 
     * @return payTransId
     */
    public long getPayTransId() {
        return payTransId;
    }


    /**
     * Sets the payTransId value for this UserPaymentStruct.
     * 
     * @param payTransId
     */
    public void setPayTransId(long payTransId) {
        this.payTransId = payTransId;
    }


    /**
     * Gets the payTransSellers value for this UserPaymentStruct.
     * 
     * @return payTransSellers
     */
    public com.allegro.webapi.ArrayOfPaymentsellersstruct getPayTransSellers() {
        return payTransSellers;
    }


    /**
     * Sets the payTransSellers value for this UserPaymentStruct.
     * 
     * @param payTransSellers
     */
    public void setPayTransSellers(com.allegro.webapi.ArrayOfPaymentsellersstruct payTransSellers) {
        this.payTransSellers = payTransSellers;
    }


    /**
     * Gets the payTransType value for this UserPaymentStruct.
     * 
     * @return payTransType
     */
    public java.lang.String getPayTransType() {
        return payTransType;
    }


    /**
     * Sets the payTransType value for this UserPaymentStruct.
     * 
     * @param payTransType
     */
    public void setPayTransType(java.lang.String payTransType) {
        this.payTransType = payTransType;
    }


    /**
     * Gets the payTransStatus value for this UserPaymentStruct.
     * 
     * @return payTransStatus
     */
    public java.lang.String getPayTransStatus() {
        return payTransStatus;
    }


    /**
     * Sets the payTransStatus value for this UserPaymentStruct.
     * 
     * @param payTransStatus
     */
    public void setPayTransStatus(java.lang.String payTransStatus) {
        this.payTransStatus = payTransStatus;
    }


    /**
     * Gets the payTransAmount value for this UserPaymentStruct.
     * 
     * @return payTransAmount
     */
    public float getPayTransAmount() {
        return payTransAmount;
    }


    /**
     * Sets the payTransAmount value for this UserPaymentStruct.
     * 
     * @param payTransAmount
     */
    public void setPayTransAmount(float payTransAmount) {
        this.payTransAmount = payTransAmount;
    }


    /**
     * Gets the payTransCreateDate value for this UserPaymentStruct.
     * 
     * @return payTransCreateDate
     */
    public long getPayTransCreateDate() {
        return payTransCreateDate;
    }


    /**
     * Sets the payTransCreateDate value for this UserPaymentStruct.
     * 
     * @param payTransCreateDate
     */
    public void setPayTransCreateDate(long payTransCreateDate) {
        this.payTransCreateDate = payTransCreateDate;
    }


    /**
     * Gets the payTransPrice value for this UserPaymentStruct.
     * 
     * @return payTransPrice
     */
    public float getPayTransPrice() {
        return payTransPrice;
    }


    /**
     * Sets the payTransPrice value for this UserPaymentStruct.
     * 
     * @param payTransPrice
     */
    public void setPayTransPrice(float payTransPrice) {
        this.payTransPrice = payTransPrice;
    }


    /**
     * Gets the payTransPostageAmount value for this UserPaymentStruct.
     * 
     * @return payTransPostageAmount
     */
    public float getPayTransPostageAmount() {
        return payTransPostageAmount;
    }


    /**
     * Sets the payTransPostageAmount value for this UserPaymentStruct.
     * 
     * @param payTransPostageAmount
     */
    public void setPayTransPostageAmount(float payTransPostageAmount) {
        this.payTransPostageAmount = payTransPostageAmount;
    }


    /**
     * Gets the payTransIncomplete value for this UserPaymentStruct.
     * 
     * @return payTransIncomplete
     */
    public int getPayTransIncomplete() {
        return payTransIncomplete;
    }


    /**
     * Sets the payTransIncomplete value for this UserPaymentStruct.
     * 
     * @param payTransIncomplete
     */
    public void setPayTransIncomplete(int payTransIncomplete) {
        this.payTransIncomplete = payTransIncomplete;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserPaymentStruct)) return false;
        UserPaymentStruct other = (UserPaymentStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.payTransId == other.getPayTransId() &&
            ((this.payTransSellers==null && other.getPayTransSellers()==null) || 
             (this.payTransSellers!=null &&
              this.payTransSellers.equals(other.getPayTransSellers()))) &&
            ((this.payTransType==null && other.getPayTransType()==null) || 
             (this.payTransType!=null &&
              this.payTransType.equals(other.getPayTransType()))) &&
            ((this.payTransStatus==null && other.getPayTransStatus()==null) || 
             (this.payTransStatus!=null &&
              this.payTransStatus.equals(other.getPayTransStatus()))) &&
            this.payTransAmount == other.getPayTransAmount() &&
            this.payTransCreateDate == other.getPayTransCreateDate() &&
            this.payTransPrice == other.getPayTransPrice() &&
            this.payTransPostageAmount == other.getPayTransPostageAmount() &&
            this.payTransIncomplete == other.getPayTransIncomplete();
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
        _hashCode += new Long(getPayTransId()).hashCode();
        if (getPayTransSellers() != null) {
            _hashCode += getPayTransSellers().hashCode();
        }
        if (getPayTransType() != null) {
            _hashCode += getPayTransType().hashCode();
        }
        if (getPayTransStatus() != null) {
            _hashCode += getPayTransStatus().hashCode();
        }
        _hashCode += new Float(getPayTransAmount()).hashCode();
        _hashCode += new Long(getPayTransCreateDate()).hashCode();
        _hashCode += new Float(getPayTransPrice()).hashCode();
        _hashCode += new Float(getPayTransPostageAmount()).hashCode();
        _hashCode += getPayTransIncomplete();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UserPaymentStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl.allegrosandbox.pl/service.php", "UserPaymentStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payTransId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl.allegrosandbox.pl/service.php", "payTransId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payTransSellers");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl.allegrosandbox.pl/service.php", "payTransSellers"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl.allegrosandbox.pl/service.php", "ArrayOfPaymentsellersstruct"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payTransType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl.allegrosandbox.pl/service.php", "payTransType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payTransStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl.allegrosandbox.pl/service.php", "payTransStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payTransAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl.allegrosandbox.pl/service.php", "payTransAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payTransCreateDate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl.allegrosandbox.pl/service.php", "payTransCreateDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payTransPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl.allegrosandbox.pl/service.php", "payTransPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payTransPostageAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl.allegrosandbox.pl/service.php", "payTransPostageAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payTransIncomplete");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl.allegrosandbox.pl/service.php", "payTransIncomplete"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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

/**
 * NotWonItemStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class NotWonItemStruct  implements java.io.Serializable {
    private long itemId;

    private java.lang.String itemTitle;

    private java.lang.String itemThumbnailUrl;

    private com.allegro.webapi.ArrayOfItempricestruct itemPrice;

    private int itemLeftQuantity;

    private int itemQuantityType;

    private long itemEndTime;

    private java.lang.String itemEndTimeLeft;

    private com.allegro.webapi.UserInfoStruct itemSeller;

    private int itemBiddersCounter;

    private com.allegro.webapi.UserInfoStruct itemHighestBidder;

    private int itemCategoryId;

    private int itemViewsCounter;

    private java.lang.String itemNote;

    private int itemSpecialInfo;

    private int itemShopInfo;

    private long itemProductInfo;

    private int itemPayuInfo;

    public NotWonItemStruct() {
    }

    public NotWonItemStruct(
           long itemId,
           java.lang.String itemTitle,
           java.lang.String itemThumbnailUrl,
           com.allegro.webapi.ArrayOfItempricestruct itemPrice,
           int itemLeftQuantity,
           int itemQuantityType,
           long itemEndTime,
           java.lang.String itemEndTimeLeft,
           com.allegro.webapi.UserInfoStruct itemSeller,
           int itemBiddersCounter,
           com.allegro.webapi.UserInfoStruct itemHighestBidder,
           int itemCategoryId,
           int itemViewsCounter,
           java.lang.String itemNote,
           int itemSpecialInfo,
           int itemShopInfo,
           long itemProductInfo,
           int itemPayuInfo) {
           this.itemId = itemId;
           this.itemTitle = itemTitle;
           this.itemThumbnailUrl = itemThumbnailUrl;
           this.itemPrice = itemPrice;
           this.itemLeftQuantity = itemLeftQuantity;
           this.itemQuantityType = itemQuantityType;
           this.itemEndTime = itemEndTime;
           this.itemEndTimeLeft = itemEndTimeLeft;
           this.itemSeller = itemSeller;
           this.itemBiddersCounter = itemBiddersCounter;
           this.itemHighestBidder = itemHighestBidder;
           this.itemCategoryId = itemCategoryId;
           this.itemViewsCounter = itemViewsCounter;
           this.itemNote = itemNote;
           this.itemSpecialInfo = itemSpecialInfo;
           this.itemShopInfo = itemShopInfo;
           this.itemProductInfo = itemProductInfo;
           this.itemPayuInfo = itemPayuInfo;
    }


    /**
     * Gets the itemId value for this NotWonItemStruct.
     * 
     * @return itemId
     */
    public long getItemId() {
        return itemId;
    }


    /**
     * Sets the itemId value for this NotWonItemStruct.
     * 
     * @param itemId
     */
    public void setItemId(long itemId) {
        this.itemId = itemId;
    }


    /**
     * Gets the itemTitle value for this NotWonItemStruct.
     * 
     * @return itemTitle
     */
    public java.lang.String getItemTitle() {
        return itemTitle;
    }


    /**
     * Sets the itemTitle value for this NotWonItemStruct.
     * 
     * @param itemTitle
     */
    public void setItemTitle(java.lang.String itemTitle) {
        this.itemTitle = itemTitle;
    }


    /**
     * Gets the itemThumbnailUrl value for this NotWonItemStruct.
     * 
     * @return itemThumbnailUrl
     */
    public java.lang.String getItemThumbnailUrl() {
        return itemThumbnailUrl;
    }


    /**
     * Sets the itemThumbnailUrl value for this NotWonItemStruct.
     * 
     * @param itemThumbnailUrl
     */
    public void setItemThumbnailUrl(java.lang.String itemThumbnailUrl) {
        this.itemThumbnailUrl = itemThumbnailUrl;
    }


    /**
     * Gets the itemPrice value for this NotWonItemStruct.
     * 
     * @return itemPrice
     */
    public com.allegro.webapi.ArrayOfItempricestruct getItemPrice() {
        return itemPrice;
    }


    /**
     * Sets the itemPrice value for this NotWonItemStruct.
     * 
     * @param itemPrice
     */
    public void setItemPrice(com.allegro.webapi.ArrayOfItempricestruct itemPrice) {
        this.itemPrice = itemPrice;
    }


    /**
     * Gets the itemLeftQuantity value for this NotWonItemStruct.
     * 
     * @return itemLeftQuantity
     */
    public int getItemLeftQuantity() {
        return itemLeftQuantity;
    }


    /**
     * Sets the itemLeftQuantity value for this NotWonItemStruct.
     * 
     * @param itemLeftQuantity
     */
    public void setItemLeftQuantity(int itemLeftQuantity) {
        this.itemLeftQuantity = itemLeftQuantity;
    }


    /**
     * Gets the itemQuantityType value for this NotWonItemStruct.
     * 
     * @return itemQuantityType
     */
    public int getItemQuantityType() {
        return itemQuantityType;
    }


    /**
     * Sets the itemQuantityType value for this NotWonItemStruct.
     * 
     * @param itemQuantityType
     */
    public void setItemQuantityType(int itemQuantityType) {
        this.itemQuantityType = itemQuantityType;
    }


    /**
     * Gets the itemEndTime value for this NotWonItemStruct.
     * 
     * @return itemEndTime
     */
    public long getItemEndTime() {
        return itemEndTime;
    }


    /**
     * Sets the itemEndTime value for this NotWonItemStruct.
     * 
     * @param itemEndTime
     */
    public void setItemEndTime(long itemEndTime) {
        this.itemEndTime = itemEndTime;
    }


    /**
     * Gets the itemEndTimeLeft value for this NotWonItemStruct.
     * 
     * @return itemEndTimeLeft
     */
    public java.lang.String getItemEndTimeLeft() {
        return itemEndTimeLeft;
    }


    /**
     * Sets the itemEndTimeLeft value for this NotWonItemStruct.
     * 
     * @param itemEndTimeLeft
     */
    public void setItemEndTimeLeft(java.lang.String itemEndTimeLeft) {
        this.itemEndTimeLeft = itemEndTimeLeft;
    }


    /**
     * Gets the itemSeller value for this NotWonItemStruct.
     * 
     * @return itemSeller
     */
    public com.allegro.webapi.UserInfoStruct getItemSeller() {
        return itemSeller;
    }


    /**
     * Sets the itemSeller value for this NotWonItemStruct.
     * 
     * @param itemSeller
     */
    public void setItemSeller(com.allegro.webapi.UserInfoStruct itemSeller) {
        this.itemSeller = itemSeller;
    }


    /**
     * Gets the itemBiddersCounter value for this NotWonItemStruct.
     * 
     * @return itemBiddersCounter
     */
    public int getItemBiddersCounter() {
        return itemBiddersCounter;
    }


    /**
     * Sets the itemBiddersCounter value for this NotWonItemStruct.
     * 
     * @param itemBiddersCounter
     */
    public void setItemBiddersCounter(int itemBiddersCounter) {
        this.itemBiddersCounter = itemBiddersCounter;
    }


    /**
     * Gets the itemHighestBidder value for this NotWonItemStruct.
     * 
     * @return itemHighestBidder
     */
    public com.allegro.webapi.UserInfoStruct getItemHighestBidder() {
        return itemHighestBidder;
    }


    /**
     * Sets the itemHighestBidder value for this NotWonItemStruct.
     * 
     * @param itemHighestBidder
     */
    public void setItemHighestBidder(com.allegro.webapi.UserInfoStruct itemHighestBidder) {
        this.itemHighestBidder = itemHighestBidder;
    }


    /**
     * Gets the itemCategoryId value for this NotWonItemStruct.
     * 
     * @return itemCategoryId
     */
    public int getItemCategoryId() {
        return itemCategoryId;
    }


    /**
     * Sets the itemCategoryId value for this NotWonItemStruct.
     * 
     * @param itemCategoryId
     */
    public void setItemCategoryId(int itemCategoryId) {
        this.itemCategoryId = itemCategoryId;
    }


    /**
     * Gets the itemViewsCounter value for this NotWonItemStruct.
     * 
     * @return itemViewsCounter
     */
    public int getItemViewsCounter() {
        return itemViewsCounter;
    }


    /**
     * Sets the itemViewsCounter value for this NotWonItemStruct.
     * 
     * @param itemViewsCounter
     */
    public void setItemViewsCounter(int itemViewsCounter) {
        this.itemViewsCounter = itemViewsCounter;
    }


    /**
     * Gets the itemNote value for this NotWonItemStruct.
     * 
     * @return itemNote
     */
    public java.lang.String getItemNote() {
        return itemNote;
    }


    /**
     * Sets the itemNote value for this NotWonItemStruct.
     * 
     * @param itemNote
     */
    public void setItemNote(java.lang.String itemNote) {
        this.itemNote = itemNote;
    }


    /**
     * Gets the itemSpecialInfo value for this NotWonItemStruct.
     * 
     * @return itemSpecialInfo
     */
    public int getItemSpecialInfo() {
        return itemSpecialInfo;
    }


    /**
     * Sets the itemSpecialInfo value for this NotWonItemStruct.
     * 
     * @param itemSpecialInfo
     */
    public void setItemSpecialInfo(int itemSpecialInfo) {
        this.itemSpecialInfo = itemSpecialInfo;
    }


    /**
     * Gets the itemShopInfo value for this NotWonItemStruct.
     * 
     * @return itemShopInfo
     */
    public int getItemShopInfo() {
        return itemShopInfo;
    }


    /**
     * Sets the itemShopInfo value for this NotWonItemStruct.
     * 
     * @param itemShopInfo
     */
    public void setItemShopInfo(int itemShopInfo) {
        this.itemShopInfo = itemShopInfo;
    }


    /**
     * Gets the itemProductInfo value for this NotWonItemStruct.
     * 
     * @return itemProductInfo
     */
    public long getItemProductInfo() {
        return itemProductInfo;
    }


    /**
     * Sets the itemProductInfo value for this NotWonItemStruct.
     * 
     * @param itemProductInfo
     */
    public void setItemProductInfo(long itemProductInfo) {
        this.itemProductInfo = itemProductInfo;
    }


    /**
     * Gets the itemPayuInfo value for this NotWonItemStruct.
     * 
     * @return itemPayuInfo
     */
    public int getItemPayuInfo() {
        return itemPayuInfo;
    }


    /**
     * Sets the itemPayuInfo value for this NotWonItemStruct.
     * 
     * @param itemPayuInfo
     */
    public void setItemPayuInfo(int itemPayuInfo) {
        this.itemPayuInfo = itemPayuInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NotWonItemStruct)) return false;
        NotWonItemStruct other = (NotWonItemStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.itemId == other.getItemId() &&
            ((this.itemTitle==null && other.getItemTitle()==null) || 
             (this.itemTitle!=null &&
              this.itemTitle.equals(other.getItemTitle()))) &&
            ((this.itemThumbnailUrl==null && other.getItemThumbnailUrl()==null) || 
             (this.itemThumbnailUrl!=null &&
              this.itemThumbnailUrl.equals(other.getItemThumbnailUrl()))) &&
            ((this.itemPrice==null && other.getItemPrice()==null) || 
             (this.itemPrice!=null &&
              this.itemPrice.equals(other.getItemPrice()))) &&
            this.itemLeftQuantity == other.getItemLeftQuantity() &&
            this.itemQuantityType == other.getItemQuantityType() &&
            this.itemEndTime == other.getItemEndTime() &&
            ((this.itemEndTimeLeft==null && other.getItemEndTimeLeft()==null) || 
             (this.itemEndTimeLeft!=null &&
              this.itemEndTimeLeft.equals(other.getItemEndTimeLeft()))) &&
            ((this.itemSeller==null && other.getItemSeller()==null) || 
             (this.itemSeller!=null &&
              this.itemSeller.equals(other.getItemSeller()))) &&
            this.itemBiddersCounter == other.getItemBiddersCounter() &&
            ((this.itemHighestBidder==null && other.getItemHighestBidder()==null) || 
             (this.itemHighestBidder!=null &&
              this.itemHighestBidder.equals(other.getItemHighestBidder()))) &&
            this.itemCategoryId == other.getItemCategoryId() &&
            this.itemViewsCounter == other.getItemViewsCounter() &&
            ((this.itemNote==null && other.getItemNote()==null) || 
             (this.itemNote!=null &&
              this.itemNote.equals(other.getItemNote()))) &&
            this.itemSpecialInfo == other.getItemSpecialInfo() &&
            this.itemShopInfo == other.getItemShopInfo() &&
            this.itemProductInfo == other.getItemProductInfo() &&
            this.itemPayuInfo == other.getItemPayuInfo();
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
        _hashCode += new Long(getItemId()).hashCode();
        if (getItemTitle() != null) {
            _hashCode += getItemTitle().hashCode();
        }
        if (getItemThumbnailUrl() != null) {
            _hashCode += getItemThumbnailUrl().hashCode();
        }
        if (getItemPrice() != null) {
            _hashCode += getItemPrice().hashCode();
        }
        _hashCode += getItemLeftQuantity();
        _hashCode += getItemQuantityType();
        _hashCode += new Long(getItemEndTime()).hashCode();
        if (getItemEndTimeLeft() != null) {
            _hashCode += getItemEndTimeLeft().hashCode();
        }
        if (getItemSeller() != null) {
            _hashCode += getItemSeller().hashCode();
        }
        _hashCode += getItemBiddersCounter();
        if (getItemHighestBidder() != null) {
            _hashCode += getItemHighestBidder().hashCode();
        }
        _hashCode += getItemCategoryId();
        _hashCode += getItemViewsCounter();
        if (getItemNote() != null) {
            _hashCode += getItemNote().hashCode();
        }
        _hashCode += getItemSpecialInfo();
        _hashCode += getItemShopInfo();
        _hashCode += new Long(getItemProductInfo()).hashCode();
        _hashCode += getItemPayuInfo();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NotWonItemStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl.allegrosandbox.pl/service.php", "NotWonItemStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl.allegrosandbox.pl/service.php", "itemId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemTitle");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl.allegrosandbox.pl/service.php", "itemTitle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemThumbnailUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl.allegrosandbox.pl/service.php", "itemThumbnailUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl.allegrosandbox.pl/service.php", "itemPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl.allegrosandbox.pl/service.php", "ArrayOfItempricestruct"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemLeftQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl.allegrosandbox.pl/service.php", "itemLeftQuantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemQuantityType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl.allegrosandbox.pl/service.php", "itemQuantityType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemEndTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl.allegrosandbox.pl/service.php", "itemEndTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemEndTimeLeft");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl.allegrosandbox.pl/service.php", "itemEndTimeLeft"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemSeller");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl.allegrosandbox.pl/service.php", "itemSeller"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl.allegrosandbox.pl/service.php", "UserInfoStruct"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemBiddersCounter");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl.allegrosandbox.pl/service.php", "itemBiddersCounter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemHighestBidder");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl.allegrosandbox.pl/service.php", "itemHighestBidder"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl.allegrosandbox.pl/service.php", "UserInfoStruct"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemCategoryId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl.allegrosandbox.pl/service.php", "itemCategoryId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemViewsCounter");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl.allegrosandbox.pl/service.php", "itemViewsCounter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemNote");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl.allegrosandbox.pl/service.php", "itemNote"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemSpecialInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl.allegrosandbox.pl/service.php", "itemSpecialInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemShopInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl.allegrosandbox.pl/service.php", "itemShopInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemProductInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl.allegrosandbox.pl/service.php", "itemProductInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemPayuInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl.allegrosandbox.pl/service.php", "itemPayuInfo"));
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

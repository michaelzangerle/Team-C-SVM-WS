/**
 * LocationDTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package svm.webservice.client.service;

public class LocationDTO  extends svm.webservice.client.service.DTO  implements java.io.Serializable {
    private java.lang.String community;

    private java.lang.String countryCode;

    private java.lang.String district;

    private java.lang.String latitude;

    private java.lang.String longitude;

    private java.lang.String placeName;

    private java.lang.String postalCode;

    private java.lang.String province;

    public LocationDTO() {
    }

    public LocationDTO(
           java.lang.Integer UID,
           java.lang.String community,
           java.lang.String countryCode,
           java.lang.String district,
           java.lang.String latitude,
           java.lang.String longitude,
           java.lang.String placeName,
           java.lang.String postalCode,
           java.lang.String province) {
        super(
            UID);
        this.community = community;
        this.countryCode = countryCode;
        this.district = district;
        this.latitude = latitude;
        this.longitude = longitude;
        this.placeName = placeName;
        this.postalCode = postalCode;
        this.province = province;
    }


    /**
     * Gets the community value for this LocationDTO.
     * 
     * @return community
     */
    public java.lang.String getCommunity() {
        return community;
    }


    /**
     * Sets the community value for this LocationDTO.
     * 
     * @param community
     */
    public void setCommunity(java.lang.String community) {
        this.community = community;
    }


    /**
     * Gets the countryCode value for this LocationDTO.
     * 
     * @return countryCode
     */
    public java.lang.String getCountryCode() {
        return countryCode;
    }


    /**
     * Sets the countryCode value for this LocationDTO.
     * 
     * @param countryCode
     */
    public void setCountryCode(java.lang.String countryCode) {
        this.countryCode = countryCode;
    }


    /**
     * Gets the district value for this LocationDTO.
     * 
     * @return district
     */
    public java.lang.String getDistrict() {
        return district;
    }


    /**
     * Sets the district value for this LocationDTO.
     * 
     * @param district
     */
    public void setDistrict(java.lang.String district) {
        this.district = district;
    }


    /**
     * Gets the latitude value for this LocationDTO.
     * 
     * @return latitude
     */
    public java.lang.String getLatitude() {
        return latitude;
    }


    /**
     * Sets the latitude value for this LocationDTO.
     * 
     * @param latitude
     */
    public void setLatitude(java.lang.String latitude) {
        this.latitude = latitude;
    }


    /**
     * Gets the longitude value for this LocationDTO.
     * 
     * @return longitude
     */
    public java.lang.String getLongitude() {
        return longitude;
    }


    /**
     * Sets the longitude value for this LocationDTO.
     * 
     * @param longitude
     */
    public void setLongitude(java.lang.String longitude) {
        this.longitude = longitude;
    }


    /**
     * Gets the placeName value for this LocationDTO.
     * 
     * @return placeName
     */
    public java.lang.String getPlaceName() {
        return placeName;
    }


    /**
     * Sets the placeName value for this LocationDTO.
     * 
     * @param placeName
     */
    public void setPlaceName(java.lang.String placeName) {
        this.placeName = placeName;
    }


    /**
     * Gets the postalCode value for this LocationDTO.
     * 
     * @return postalCode
     */
    public java.lang.String getPostalCode() {
        return postalCode;
    }


    /**
     * Sets the postalCode value for this LocationDTO.
     * 
     * @param postalCode
     */
    public void setPostalCode(java.lang.String postalCode) {
        this.postalCode = postalCode;
    }


    /**
     * Gets the province value for this LocationDTO.
     * 
     * @return province
     */
    public java.lang.String getProvince() {
        return province;
    }


    /**
     * Sets the province value for this LocationDTO.
     * 
     * @param province
     */
    public void setProvince(java.lang.String province) {
        this.province = province;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LocationDTO)) return false;
        LocationDTO other = (LocationDTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.community==null && other.getCommunity()==null) || 
             (this.community!=null &&
              this.community.equals(other.getCommunity()))) &&
            ((this.countryCode==null && other.getCountryCode()==null) || 
             (this.countryCode!=null &&
              this.countryCode.equals(other.getCountryCode()))) &&
            ((this.district==null && other.getDistrict()==null) || 
             (this.district!=null &&
              this.district.equals(other.getDistrict()))) &&
            ((this.latitude==null && other.getLatitude()==null) || 
             (this.latitude!=null &&
              this.latitude.equals(other.getLatitude()))) &&
            ((this.longitude==null && other.getLongitude()==null) || 
             (this.longitude!=null &&
              this.longitude.equals(other.getLongitude()))) &&
            ((this.placeName==null && other.getPlaceName()==null) || 
             (this.placeName!=null &&
              this.placeName.equals(other.getPlaceName()))) &&
            ((this.postalCode==null && other.getPostalCode()==null) || 
             (this.postalCode!=null &&
              this.postalCode.equals(other.getPostalCode()))) &&
            ((this.province==null && other.getProvince()==null) || 
             (this.province!=null &&
              this.province.equals(other.getProvince())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getCommunity() != null) {
            _hashCode += getCommunity().hashCode();
        }
        if (getCountryCode() != null) {
            _hashCode += getCountryCode().hashCode();
        }
        if (getDistrict() != null) {
            _hashCode += getDistrict().hashCode();
        }
        if (getLatitude() != null) {
            _hashCode += getLatitude().hashCode();
        }
        if (getLongitude() != null) {
            _hashCode += getLongitude().hashCode();
        }
        if (getPlaceName() != null) {
            _hashCode += getPlaceName().hashCode();
        }
        if (getPostalCode() != null) {
            _hashCode += getPostalCode().hashCode();
        }
        if (getProvince() != null) {
            _hashCode += getProvince().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LocationDTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dto.webservice.svm/xsd", "LocationDTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("community");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.webservice.svm/xsd", "community"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.webservice.svm/xsd", "countryCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("district");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.webservice.svm/xsd", "district"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("latitude");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.webservice.svm/xsd", "latitude"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("longitude");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.webservice.svm/xsd", "longitude"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("placeName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.webservice.svm/xsd", "placeName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postalCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.webservice.svm/xsd", "postalCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("province");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.webservice.svm/xsd", "province"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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

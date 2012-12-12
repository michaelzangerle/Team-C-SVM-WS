/**
 * ContactDetailsDTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package svm.webservice.client.service;

public class ContactDetailsDTO  extends svm.webservice.client.service.DTO  implements java.io.Serializable {
    private java.lang.String coordLat;

    private java.lang.String coordLong;

    private java.lang.String email1;

    private java.lang.String email2;

    private java.lang.String fax;

    private svm.webservice.client.service.LocationDTO location;

    private java.lang.String phone1;

    private java.lang.String phone2;

    private java.lang.String street;

    private java.lang.String streetNumber;

    public ContactDetailsDTO() {
    }

    public ContactDetailsDTO(
           java.lang.Integer UID,
           java.lang.String coordLat,
           java.lang.String coordLong,
           java.lang.String email1,
           java.lang.String email2,
           java.lang.String fax,
           svm.webservice.client.service.LocationDTO location,
           java.lang.String phone1,
           java.lang.String phone2,
           java.lang.String street,
           java.lang.String streetNumber) {
        super(
            UID);
        this.coordLat = coordLat;
        this.coordLong = coordLong;
        this.email1 = email1;
        this.email2 = email2;
        this.fax = fax;
        this.location = location;
        this.phone1 = phone1;
        this.phone2 = phone2;
        this.street = street;
        this.streetNumber = streetNumber;
    }


    /**
     * Gets the coordLat value for this ContactDetailsDTO.
     * 
     * @return coordLat
     */
    public java.lang.String getCoordLat() {
        return coordLat;
    }


    /**
     * Sets the coordLat value for this ContactDetailsDTO.
     * 
     * @param coordLat
     */
    public void setCoordLat(java.lang.String coordLat) {
        this.coordLat = coordLat;
    }


    /**
     * Gets the coordLong value for this ContactDetailsDTO.
     * 
     * @return coordLong
     */
    public java.lang.String getCoordLong() {
        return coordLong;
    }


    /**
     * Sets the coordLong value for this ContactDetailsDTO.
     * 
     * @param coordLong
     */
    public void setCoordLong(java.lang.String coordLong) {
        this.coordLong = coordLong;
    }


    /**
     * Gets the email1 value for this ContactDetailsDTO.
     * 
     * @return email1
     */
    public java.lang.String getEmail1() {
        return email1;
    }


    /**
     * Sets the email1 value for this ContactDetailsDTO.
     * 
     * @param email1
     */
    public void setEmail1(java.lang.String email1) {
        this.email1 = email1;
    }


    /**
     * Gets the email2 value for this ContactDetailsDTO.
     * 
     * @return email2
     */
    public java.lang.String getEmail2() {
        return email2;
    }


    /**
     * Sets the email2 value for this ContactDetailsDTO.
     * 
     * @param email2
     */
    public void setEmail2(java.lang.String email2) {
        this.email2 = email2;
    }


    /**
     * Gets the fax value for this ContactDetailsDTO.
     * 
     * @return fax
     */
    public java.lang.String getFax() {
        return fax;
    }


    /**
     * Sets the fax value for this ContactDetailsDTO.
     * 
     * @param fax
     */
    public void setFax(java.lang.String fax) {
        this.fax = fax;
    }


    /**
     * Gets the location value for this ContactDetailsDTO.
     * 
     * @return location
     */
    public svm.webservice.client.service.LocationDTO getLocation() {
        return location;
    }


    /**
     * Sets the location value for this ContactDetailsDTO.
     * 
     * @param location
     */
    public void setLocation(svm.webservice.client.service.LocationDTO location) {
        this.location = location;
    }


    /**
     * Gets the phone1 value for this ContactDetailsDTO.
     * 
     * @return phone1
     */
    public java.lang.String getPhone1() {
        return phone1;
    }


    /**
     * Sets the phone1 value for this ContactDetailsDTO.
     * 
     * @param phone1
     */
    public void setPhone1(java.lang.String phone1) {
        this.phone1 = phone1;
    }


    /**
     * Gets the phone2 value for this ContactDetailsDTO.
     * 
     * @return phone2
     */
    public java.lang.String getPhone2() {
        return phone2;
    }


    /**
     * Sets the phone2 value for this ContactDetailsDTO.
     * 
     * @param phone2
     */
    public void setPhone2(java.lang.String phone2) {
        this.phone2 = phone2;
    }


    /**
     * Gets the street value for this ContactDetailsDTO.
     * 
     * @return street
     */
    public java.lang.String getStreet() {
        return street;
    }


    /**
     * Sets the street value for this ContactDetailsDTO.
     * 
     * @param street
     */
    public void setStreet(java.lang.String street) {
        this.street = street;
    }


    /**
     * Gets the streetNumber value for this ContactDetailsDTO.
     * 
     * @return streetNumber
     */
    public java.lang.String getStreetNumber() {
        return streetNumber;
    }


    /**
     * Sets the streetNumber value for this ContactDetailsDTO.
     * 
     * @param streetNumber
     */
    public void setStreetNumber(java.lang.String streetNumber) {
        this.streetNumber = streetNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ContactDetailsDTO)) return false;
        ContactDetailsDTO other = (ContactDetailsDTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.coordLat==null && other.getCoordLat()==null) || 
             (this.coordLat!=null &&
              this.coordLat.equals(other.getCoordLat()))) &&
            ((this.coordLong==null && other.getCoordLong()==null) || 
             (this.coordLong!=null &&
              this.coordLong.equals(other.getCoordLong()))) &&
            ((this.email1==null && other.getEmail1()==null) || 
             (this.email1!=null &&
              this.email1.equals(other.getEmail1()))) &&
            ((this.email2==null && other.getEmail2()==null) || 
             (this.email2!=null &&
              this.email2.equals(other.getEmail2()))) &&
            ((this.fax==null && other.getFax()==null) || 
             (this.fax!=null &&
              this.fax.equals(other.getFax()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              this.location.equals(other.getLocation()))) &&
            ((this.phone1==null && other.getPhone1()==null) || 
             (this.phone1!=null &&
              this.phone1.equals(other.getPhone1()))) &&
            ((this.phone2==null && other.getPhone2()==null) || 
             (this.phone2!=null &&
              this.phone2.equals(other.getPhone2()))) &&
            ((this.street==null && other.getStreet()==null) || 
             (this.street!=null &&
              this.street.equals(other.getStreet()))) &&
            ((this.streetNumber==null && other.getStreetNumber()==null) || 
             (this.streetNumber!=null &&
              this.streetNumber.equals(other.getStreetNumber())));
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
        if (getCoordLat() != null) {
            _hashCode += getCoordLat().hashCode();
        }
        if (getCoordLong() != null) {
            _hashCode += getCoordLong().hashCode();
        }
        if (getEmail1() != null) {
            _hashCode += getEmail1().hashCode();
        }
        if (getEmail2() != null) {
            _hashCode += getEmail2().hashCode();
        }
        if (getFax() != null) {
            _hashCode += getFax().hashCode();
        }
        if (getLocation() != null) {
            _hashCode += getLocation().hashCode();
        }
        if (getPhone1() != null) {
            _hashCode += getPhone1().hashCode();
        }
        if (getPhone2() != null) {
            _hashCode += getPhone2().hashCode();
        }
        if (getStreet() != null) {
            _hashCode += getStreet().hashCode();
        }
        if (getStreetNumber() != null) {
            _hashCode += getStreetNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ContactDetailsDTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dto.webservice.svm/xsd", "ContactDetailsDTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coordLat");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.webservice.svm/xsd", "coordLat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coordLong");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.webservice.svm/xsd", "coordLong"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.webservice.svm/xsd", "email1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.webservice.svm/xsd", "email2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fax");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.webservice.svm/xsd", "fax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.webservice.svm/xsd", "location"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dto.webservice.svm/xsd", "LocationDTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phone1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.webservice.svm/xsd", "phone1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phone2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.webservice.svm/xsd", "phone2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("street");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.webservice.svm/xsd", "street"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("streetNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.webservice.svm/xsd", "streetNumber"));
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

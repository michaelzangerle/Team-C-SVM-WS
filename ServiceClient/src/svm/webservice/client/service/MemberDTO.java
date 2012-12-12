/**
 * MemberDTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package svm.webservice.client.service;

public class MemberDTO  extends svm.webservice.client.service.DTO  implements java.io.Serializable {
    private java.util.Date birthDate;

    private java.lang.String coordLat;

    private java.lang.String coordLong;

    private java.lang.String email1;

    private java.lang.String email2;

    private java.util.Date entryDate;

    private java.lang.String fax;

    private java.lang.String firstName;

    private java.lang.String gender;

    private java.lang.Boolean hasPaidFee;

    private java.lang.String lastName;

    private svm.webservice.client.service.LocationDTO location;

    private java.lang.String phone1;

    private java.lang.String phone2;

    private java.lang.String socialNumber;

    private svm.webservice.client.service.SportDTO sport;

    private java.lang.String street;

    private java.lang.String streetNumber;

    private java.lang.String title;

    private java.lang.String userName;

    public MemberDTO() {
    }

    public MemberDTO(
           java.lang.Integer UID,
           java.util.Date birthDate,
           java.lang.String coordLat,
           java.lang.String coordLong,
           java.lang.String email1,
           java.lang.String email2,
           java.util.Date entryDate,
           java.lang.String fax,
           java.lang.String firstName,
           java.lang.String gender,
           java.lang.Boolean hasPaidFee,
           java.lang.String lastName,
           svm.webservice.client.service.LocationDTO location,
           java.lang.String phone1,
           java.lang.String phone2,
           java.lang.String socialNumber,
           svm.webservice.client.service.SportDTO sport,
           java.lang.String street,
           java.lang.String streetNumber,
           java.lang.String title,
           java.lang.String userName) {
        super(
            UID);
        this.birthDate = birthDate;
        this.coordLat = coordLat;
        this.coordLong = coordLong;
        this.email1 = email1;
        this.email2 = email2;
        this.entryDate = entryDate;
        this.fax = fax;
        this.firstName = firstName;
        this.gender = gender;
        this.hasPaidFee = hasPaidFee;
        this.lastName = lastName;
        this.location = location;
        this.phone1 = phone1;
        this.phone2 = phone2;
        this.socialNumber = socialNumber;
        this.sport = sport;
        this.street = street;
        this.streetNumber = streetNumber;
        this.title = title;
        this.userName = userName;
    }


    /**
     * Gets the birthDate value for this MemberDTO.
     * 
     * @return birthDate
     */
    public java.util.Date getBirthDate() {
        return birthDate;
    }


    /**
     * Sets the birthDate value for this MemberDTO.
     * 
     * @param birthDate
     */
    public void setBirthDate(java.util.Date birthDate) {
        this.birthDate = birthDate;
    }


    /**
     * Gets the coordLat value for this MemberDTO.
     * 
     * @return coordLat
     */
    public java.lang.String getCoordLat() {
        return coordLat;
    }


    /**
     * Sets the coordLat value for this MemberDTO.
     * 
     * @param coordLat
     */
    public void setCoordLat(java.lang.String coordLat) {
        this.coordLat = coordLat;
    }


    /**
     * Gets the coordLong value for this MemberDTO.
     * 
     * @return coordLong
     */
    public java.lang.String getCoordLong() {
        return coordLong;
    }


    /**
     * Sets the coordLong value for this MemberDTO.
     * 
     * @param coordLong
     */
    public void setCoordLong(java.lang.String coordLong) {
        this.coordLong = coordLong;
    }


    /**
     * Gets the email1 value for this MemberDTO.
     * 
     * @return email1
     */
    public java.lang.String getEmail1() {
        return email1;
    }


    /**
     * Sets the email1 value for this MemberDTO.
     * 
     * @param email1
     */
    public void setEmail1(java.lang.String email1) {
        this.email1 = email1;
    }


    /**
     * Gets the email2 value for this MemberDTO.
     * 
     * @return email2
     */
    public java.lang.String getEmail2() {
        return email2;
    }


    /**
     * Sets the email2 value for this MemberDTO.
     * 
     * @param email2
     */
    public void setEmail2(java.lang.String email2) {
        this.email2 = email2;
    }


    /**
     * Gets the entryDate value for this MemberDTO.
     * 
     * @return entryDate
     */
    public java.util.Date getEntryDate() {
        return entryDate;
    }


    /**
     * Sets the entryDate value for this MemberDTO.
     * 
     * @param entryDate
     */
    public void setEntryDate(java.util.Date entryDate) {
        this.entryDate = entryDate;
    }


    /**
     * Gets the fax value for this MemberDTO.
     * 
     * @return fax
     */
    public java.lang.String getFax() {
        return fax;
    }


    /**
     * Sets the fax value for this MemberDTO.
     * 
     * @param fax
     */
    public void setFax(java.lang.String fax) {
        this.fax = fax;
    }


    /**
     * Gets the firstName value for this MemberDTO.
     * 
     * @return firstName
     */
    public java.lang.String getFirstName() {
        return firstName;
    }


    /**
     * Sets the firstName value for this MemberDTO.
     * 
     * @param firstName
     */
    public void setFirstName(java.lang.String firstName) {
        this.firstName = firstName;
    }


    /**
     * Gets the gender value for this MemberDTO.
     * 
     * @return gender
     */
    public java.lang.String getGender() {
        return gender;
    }


    /**
     * Sets the gender value for this MemberDTO.
     * 
     * @param gender
     */
    public void setGender(java.lang.String gender) {
        this.gender = gender;
    }


    /**
     * Gets the hasPaidFee value for this MemberDTO.
     * 
     * @return hasPaidFee
     */
    public java.lang.Boolean getHasPaidFee() {
        return hasPaidFee;
    }


    /**
     * Sets the hasPaidFee value for this MemberDTO.
     * 
     * @param hasPaidFee
     */
    public void setHasPaidFee(java.lang.Boolean hasPaidFee) {
        this.hasPaidFee = hasPaidFee;
    }


    /**
     * Gets the lastName value for this MemberDTO.
     * 
     * @return lastName
     */
    public java.lang.String getLastName() {
        return lastName;
    }


    /**
     * Sets the lastName value for this MemberDTO.
     * 
     * @param lastName
     */
    public void setLastName(java.lang.String lastName) {
        this.lastName = lastName;
    }


    /**
     * Gets the location value for this MemberDTO.
     * 
     * @return location
     */
    public svm.webservice.client.service.LocationDTO getLocation() {
        return location;
    }


    /**
     * Sets the location value for this MemberDTO.
     * 
     * @param location
     */
    public void setLocation(svm.webservice.client.service.LocationDTO location) {
        this.location = location;
    }


    /**
     * Gets the phone1 value for this MemberDTO.
     * 
     * @return phone1
     */
    public java.lang.String getPhone1() {
        return phone1;
    }


    /**
     * Sets the phone1 value for this MemberDTO.
     * 
     * @param phone1
     */
    public void setPhone1(java.lang.String phone1) {
        this.phone1 = phone1;
    }


    /**
     * Gets the phone2 value for this MemberDTO.
     * 
     * @return phone2
     */
    public java.lang.String getPhone2() {
        return phone2;
    }


    /**
     * Sets the phone2 value for this MemberDTO.
     * 
     * @param phone2
     */
    public void setPhone2(java.lang.String phone2) {
        this.phone2 = phone2;
    }


    /**
     * Gets the socialNumber value for this MemberDTO.
     * 
     * @return socialNumber
     */
    public java.lang.String getSocialNumber() {
        return socialNumber;
    }


    /**
     * Sets the socialNumber value for this MemberDTO.
     * 
     * @param socialNumber
     */
    public void setSocialNumber(java.lang.String socialNumber) {
        this.socialNumber = socialNumber;
    }


    /**
     * Gets the sport value for this MemberDTO.
     * 
     * @return sport
     */
    public svm.webservice.client.service.SportDTO getSport() {
        return sport;
    }


    /**
     * Sets the sport value for this MemberDTO.
     * 
     * @param sport
     */
    public void setSport(svm.webservice.client.service.SportDTO sport) {
        this.sport = sport;
    }


    /**
     * Gets the street value for this MemberDTO.
     * 
     * @return street
     */
    public java.lang.String getStreet() {
        return street;
    }


    /**
     * Sets the street value for this MemberDTO.
     * 
     * @param street
     */
    public void setStreet(java.lang.String street) {
        this.street = street;
    }


    /**
     * Gets the streetNumber value for this MemberDTO.
     * 
     * @return streetNumber
     */
    public java.lang.String getStreetNumber() {
        return streetNumber;
    }


    /**
     * Sets the streetNumber value for this MemberDTO.
     * 
     * @param streetNumber
     */
    public void setStreetNumber(java.lang.String streetNumber) {
        this.streetNumber = streetNumber;
    }


    /**
     * Gets the title value for this MemberDTO.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this MemberDTO.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }


    /**
     * Gets the userName value for this MemberDTO.
     * 
     * @return userName
     */
    public java.lang.String getUserName() {
        return userName;
    }


    /**
     * Sets the userName value for this MemberDTO.
     * 
     * @param userName
     */
    public void setUserName(java.lang.String userName) {
        this.userName = userName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MemberDTO)) return false;
        MemberDTO other = (MemberDTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.birthDate==null && other.getBirthDate()==null) || 
             (this.birthDate!=null &&
              this.birthDate.equals(other.getBirthDate()))) &&
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
            ((this.entryDate==null && other.getEntryDate()==null) || 
             (this.entryDate!=null &&
              this.entryDate.equals(other.getEntryDate()))) &&
            ((this.fax==null && other.getFax()==null) || 
             (this.fax!=null &&
              this.fax.equals(other.getFax()))) &&
            ((this.firstName==null && other.getFirstName()==null) || 
             (this.firstName!=null &&
              this.firstName.equals(other.getFirstName()))) &&
            ((this.gender==null && other.getGender()==null) || 
             (this.gender!=null &&
              this.gender.equals(other.getGender()))) &&
            ((this.hasPaidFee==null && other.getHasPaidFee()==null) || 
             (this.hasPaidFee!=null &&
              this.hasPaidFee.equals(other.getHasPaidFee()))) &&
            ((this.lastName==null && other.getLastName()==null) || 
             (this.lastName!=null &&
              this.lastName.equals(other.getLastName()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              this.location.equals(other.getLocation()))) &&
            ((this.phone1==null && other.getPhone1()==null) || 
             (this.phone1!=null &&
              this.phone1.equals(other.getPhone1()))) &&
            ((this.phone2==null && other.getPhone2()==null) || 
             (this.phone2!=null &&
              this.phone2.equals(other.getPhone2()))) &&
            ((this.socialNumber==null && other.getSocialNumber()==null) || 
             (this.socialNumber!=null &&
              this.socialNumber.equals(other.getSocialNumber()))) &&
            ((this.sport==null && other.getSport()==null) || 
             (this.sport!=null &&
              this.sport.equals(other.getSport()))) &&
            ((this.street==null && other.getStreet()==null) || 
             (this.street!=null &&
              this.street.equals(other.getStreet()))) &&
            ((this.streetNumber==null && other.getStreetNumber()==null) || 
             (this.streetNumber!=null &&
              this.streetNumber.equals(other.getStreetNumber()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.userName==null && other.getUserName()==null) || 
             (this.userName!=null &&
              this.userName.equals(other.getUserName())));
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
        if (getBirthDate() != null) {
            _hashCode += getBirthDate().hashCode();
        }
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
        if (getEntryDate() != null) {
            _hashCode += getEntryDate().hashCode();
        }
        if (getFax() != null) {
            _hashCode += getFax().hashCode();
        }
        if (getFirstName() != null) {
            _hashCode += getFirstName().hashCode();
        }
        if (getGender() != null) {
            _hashCode += getGender().hashCode();
        }
        if (getHasPaidFee() != null) {
            _hashCode += getHasPaidFee().hashCode();
        }
        if (getLastName() != null) {
            _hashCode += getLastName().hashCode();
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
        if (getSocialNumber() != null) {
            _hashCode += getSocialNumber().hashCode();
        }
        if (getSport() != null) {
            _hashCode += getSport().hashCode();
        }
        if (getStreet() != null) {
            _hashCode += getStreet().hashCode();
        }
        if (getStreetNumber() != null) {
            _hashCode += getStreetNumber().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getUserName() != null) {
            _hashCode += getUserName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MemberDTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dto.webservice.svm/xsd", "MemberDTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("birthDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.webservice.svm/xsd", "birthDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("entryDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.webservice.svm/xsd", "entryDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
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
        elemField.setFieldName("firstName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.webservice.svm/xsd", "firstName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gender");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.webservice.svm/xsd", "gender"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasPaidFee");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.webservice.svm/xsd", "hasPaidFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.webservice.svm/xsd", "lastName"));
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
        elemField.setFieldName("socialNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.webservice.svm/xsd", "socialNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sport");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.webservice.svm/xsd", "sport"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dto.webservice.svm/xsd", "SportDTO"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.webservice.svm/xsd", "title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.webservice.svm/xsd", "userName"));
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

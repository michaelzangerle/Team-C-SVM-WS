/**
 * MatchDTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package svm.webservice.client.service;

public class MatchDTO  extends svm.webservice.client.service.DTO  implements java.io.Serializable {
    private svm.webservice.client.service.TeamDTO away;

    private java.lang.Boolean cancelled;

    private svm.webservice.client.service.ContactDetailsDTO contactDetails;

    private java.lang.String description;

    private java.util.Date end;

    private svm.webservice.client.service.TeamDTO home;

    private svm.webservice.client.service.MatchTypeDTO matchType;

    private java.lang.String name;

    private java.lang.String remarks;

    private java.lang.Integer resultAway;

    private java.lang.Integer resultHome;

    private java.util.Date start;

    public MatchDTO() {
    }

    public MatchDTO(
           java.lang.Integer UID,
           svm.webservice.client.service.TeamDTO away,
           java.lang.Boolean cancelled,
           svm.webservice.client.service.ContactDetailsDTO contactDetails,
           java.lang.String description,
           java.util.Date end,
           svm.webservice.client.service.TeamDTO home,
           svm.webservice.client.service.MatchTypeDTO matchType,
           java.lang.String name,
           java.lang.String remarks,
           java.lang.Integer resultAway,
           java.lang.Integer resultHome,
           java.util.Date start) {
        super(
            UID);
        this.away = away;
        this.cancelled = cancelled;
        this.contactDetails = contactDetails;
        this.description = description;
        this.end = end;
        this.home = home;
        this.matchType = matchType;
        this.name = name;
        this.remarks = remarks;
        this.resultAway = resultAway;
        this.resultHome = resultHome;
        this.start = start;
    }


    /**
     * Gets the away value for this MatchDTO.
     * 
     * @return away
     */
    public svm.webservice.client.service.TeamDTO getAway() {
        return away;
    }


    /**
     * Sets the away value for this MatchDTO.
     * 
     * @param away
     */
    public void setAway(svm.webservice.client.service.TeamDTO away) {
        this.away = away;
    }


    /**
     * Gets the cancelled value for this MatchDTO.
     * 
     * @return cancelled
     */
    public java.lang.Boolean getCancelled() {
        return cancelled;
    }


    /**
     * Sets the cancelled value for this MatchDTO.
     * 
     * @param cancelled
     */
    public void setCancelled(java.lang.Boolean cancelled) {
        this.cancelled = cancelled;
    }


    /**
     * Gets the contactDetails value for this MatchDTO.
     * 
     * @return contactDetails
     */
    public svm.webservice.client.service.ContactDetailsDTO getContactDetails() {
        return contactDetails;
    }


    /**
     * Sets the contactDetails value for this MatchDTO.
     * 
     * @param contactDetails
     */
    public void setContactDetails(svm.webservice.client.service.ContactDetailsDTO contactDetails) {
        this.contactDetails = contactDetails;
    }


    /**
     * Gets the description value for this MatchDTO.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this MatchDTO.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the end value for this MatchDTO.
     * 
     * @return end
     */
    public java.util.Date getEnd() {
        return end;
    }


    /**
     * Sets the end value for this MatchDTO.
     * 
     * @param end
     */
    public void setEnd(java.util.Date end) {
        this.end = end;
    }


    /**
     * Gets the home value for this MatchDTO.
     * 
     * @return home
     */
    public svm.webservice.client.service.TeamDTO getHome() {
        return home;
    }


    /**
     * Sets the home value for this MatchDTO.
     * 
     * @param home
     */
    public void setHome(svm.webservice.client.service.TeamDTO home) {
        this.home = home;
    }


    /**
     * Gets the matchType value for this MatchDTO.
     * 
     * @return matchType
     */
    public svm.webservice.client.service.MatchTypeDTO getMatchType() {
        return matchType;
    }


    /**
     * Sets the matchType value for this MatchDTO.
     * 
     * @param matchType
     */
    public void setMatchType(svm.webservice.client.service.MatchTypeDTO matchType) {
        this.matchType = matchType;
    }


    /**
     * Gets the name value for this MatchDTO.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this MatchDTO.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the remarks value for this MatchDTO.
     * 
     * @return remarks
     */
    public java.lang.String getRemarks() {
        return remarks;
    }


    /**
     * Sets the remarks value for this MatchDTO.
     * 
     * @param remarks
     */
    public void setRemarks(java.lang.String remarks) {
        this.remarks = remarks;
    }


    /**
     * Gets the resultAway value for this MatchDTO.
     * 
     * @return resultAway
     */
    public java.lang.Integer getResultAway() {
        return resultAway;
    }


    /**
     * Sets the resultAway value for this MatchDTO.
     * 
     * @param resultAway
     */
    public void setResultAway(java.lang.Integer resultAway) {
        this.resultAway = resultAway;
    }


    /**
     * Gets the resultHome value for this MatchDTO.
     * 
     * @return resultHome
     */
    public java.lang.Integer getResultHome() {
        return resultHome;
    }


    /**
     * Sets the resultHome value for this MatchDTO.
     * 
     * @param resultHome
     */
    public void setResultHome(java.lang.Integer resultHome) {
        this.resultHome = resultHome;
    }


    /**
     * Gets the start value for this MatchDTO.
     * 
     * @return start
     */
    public java.util.Date getStart() {
        return start;
    }


    /**
     * Sets the start value for this MatchDTO.
     * 
     * @param start
     */
    public void setStart(java.util.Date start) {
        this.start = start;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MatchDTO)) return false;
        MatchDTO other = (MatchDTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.away==null && other.getAway()==null) || 
             (this.away!=null &&
              this.away.equals(other.getAway()))) &&
            ((this.cancelled==null && other.getCancelled()==null) || 
             (this.cancelled!=null &&
              this.cancelled.equals(other.getCancelled()))) &&
            ((this.contactDetails==null && other.getContactDetails()==null) || 
             (this.contactDetails!=null &&
              this.contactDetails.equals(other.getContactDetails()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.end==null && other.getEnd()==null) || 
             (this.end!=null &&
              this.end.equals(other.getEnd()))) &&
            ((this.home==null && other.getHome()==null) || 
             (this.home!=null &&
              this.home.equals(other.getHome()))) &&
            ((this.matchType==null && other.getMatchType()==null) || 
             (this.matchType!=null &&
              this.matchType.equals(other.getMatchType()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.remarks==null && other.getRemarks()==null) || 
             (this.remarks!=null &&
              this.remarks.equals(other.getRemarks()))) &&
            ((this.resultAway==null && other.getResultAway()==null) || 
             (this.resultAway!=null &&
              this.resultAway.equals(other.getResultAway()))) &&
            ((this.resultHome==null && other.getResultHome()==null) || 
             (this.resultHome!=null &&
              this.resultHome.equals(other.getResultHome()))) &&
            ((this.start==null && other.getStart()==null) || 
             (this.start!=null &&
              this.start.equals(other.getStart())));
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
        if (getAway() != null) {
            _hashCode += getAway().hashCode();
        }
        if (getCancelled() != null) {
            _hashCode += getCancelled().hashCode();
        }
        if (getContactDetails() != null) {
            _hashCode += getContactDetails().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getEnd() != null) {
            _hashCode += getEnd().hashCode();
        }
        if (getHome() != null) {
            _hashCode += getHome().hashCode();
        }
        if (getMatchType() != null) {
            _hashCode += getMatchType().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getRemarks() != null) {
            _hashCode += getRemarks().hashCode();
        }
        if (getResultAway() != null) {
            _hashCode += getResultAway().hashCode();
        }
        if (getResultHome() != null) {
            _hashCode += getResultHome().hashCode();
        }
        if (getStart() != null) {
            _hashCode += getStart().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MatchDTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dto.webservice.svm/xsd", "MatchDTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("away");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.webservice.svm/xsd", "away"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dto.webservice.svm/xsd", "TeamDTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cancelled");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.webservice.svm/xsd", "cancelled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.webservice.svm/xsd", "contactDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dto.webservice.svm/xsd", "ContactDetailsDTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.webservice.svm/xsd", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("end");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.webservice.svm/xsd", "end"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("home");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.webservice.svm/xsd", "home"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dto.webservice.svm/xsd", "TeamDTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matchType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.webservice.svm/xsd", "matchType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dto.webservice.svm/xsd", "MatchTypeDTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.webservice.svm/xsd", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remarks");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.webservice.svm/xsd", "remarks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultAway");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.webservice.svm/xsd", "resultAway"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultHome");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.webservice.svm/xsd", "resultHome"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("start");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.webservice.svm/xsd", "start"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
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

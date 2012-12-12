/**
 * ContestDTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package svm.webservice.client.service;

public class ContestDTO  extends svm.webservice.client.service.DTO  implements java.io.Serializable {
    private svm.webservice.client.service.ContactDetailsDTO contactDetails;

    private java.util.Date end;

    private java.lang.Float fee;

    private java.lang.Boolean finished;

    private java.lang.String name;

    private svm.webservice.client.service.SportDTO sport;

    private java.util.Date start;

    public ContestDTO() {
    }

    public ContestDTO(
           java.lang.Integer UID,
           svm.webservice.client.service.ContactDetailsDTO contactDetails,
           java.util.Date end,
           java.lang.Float fee,
           java.lang.Boolean finished,
           java.lang.String name,
           svm.webservice.client.service.SportDTO sport,
           java.util.Date start) {
        super(
            UID);
        this.contactDetails = contactDetails;
        this.end = end;
        this.fee = fee;
        this.finished = finished;
        this.name = name;
        this.sport = sport;
        this.start = start;
    }


    /**
     * Gets the contactDetails value for this ContestDTO.
     * 
     * @return contactDetails
     */
    public svm.webservice.client.service.ContactDetailsDTO getContactDetails() {
        return contactDetails;
    }


    /**
     * Sets the contactDetails value for this ContestDTO.
     * 
     * @param contactDetails
     */
    public void setContactDetails(svm.webservice.client.service.ContactDetailsDTO contactDetails) {
        this.contactDetails = contactDetails;
    }


    /**
     * Gets the end value for this ContestDTO.
     * 
     * @return end
     */
    public java.util.Date getEnd() {
        return end;
    }


    /**
     * Sets the end value for this ContestDTO.
     * 
     * @param end
     */
    public void setEnd(java.util.Date end) {
        this.end = end;
    }


    /**
     * Gets the fee value for this ContestDTO.
     * 
     * @return fee
     */
    public java.lang.Float getFee() {
        return fee;
    }


    /**
     * Sets the fee value for this ContestDTO.
     * 
     * @param fee
     */
    public void setFee(java.lang.Float fee) {
        this.fee = fee;
    }


    /**
     * Gets the finished value for this ContestDTO.
     * 
     * @return finished
     */
    public java.lang.Boolean getFinished() {
        return finished;
    }


    /**
     * Sets the finished value for this ContestDTO.
     * 
     * @param finished
     */
    public void setFinished(java.lang.Boolean finished) {
        this.finished = finished;
    }


    /**
     * Gets the name value for this ContestDTO.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this ContestDTO.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the sport value for this ContestDTO.
     * 
     * @return sport
     */
    public svm.webservice.client.service.SportDTO getSport() {
        return sport;
    }


    /**
     * Sets the sport value for this ContestDTO.
     * 
     * @param sport
     */
    public void setSport(svm.webservice.client.service.SportDTO sport) {
        this.sport = sport;
    }


    /**
     * Gets the start value for this ContestDTO.
     * 
     * @return start
     */
    public java.util.Date getStart() {
        return start;
    }


    /**
     * Sets the start value for this ContestDTO.
     * 
     * @param start
     */
    public void setStart(java.util.Date start) {
        this.start = start;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ContestDTO)) return false;
        ContestDTO other = (ContestDTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.contactDetails==null && other.getContactDetails()==null) || 
             (this.contactDetails!=null &&
              this.contactDetails.equals(other.getContactDetails()))) &&
            ((this.end==null && other.getEnd()==null) || 
             (this.end!=null &&
              this.end.equals(other.getEnd()))) &&
            ((this.fee==null && other.getFee()==null) || 
             (this.fee!=null &&
              this.fee.equals(other.getFee()))) &&
            ((this.finished==null && other.getFinished()==null) || 
             (this.finished!=null &&
              this.finished.equals(other.getFinished()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.sport==null && other.getSport()==null) || 
             (this.sport!=null &&
              this.sport.equals(other.getSport()))) &&
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
        if (getContactDetails() != null) {
            _hashCode += getContactDetails().hashCode();
        }
        if (getEnd() != null) {
            _hashCode += getEnd().hashCode();
        }
        if (getFee() != null) {
            _hashCode += getFee().hashCode();
        }
        if (getFinished() != null) {
            _hashCode += getFinished().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getSport() != null) {
            _hashCode += getSport().hashCode();
        }
        if (getStart() != null) {
            _hashCode += getStart().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ContestDTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dto.webservice.svm/xsd", "ContestDTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.webservice.svm/xsd", "contactDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dto.webservice.svm/xsd", "ContactDetailsDTO"));
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
        elemField.setFieldName("fee");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.webservice.svm/xsd", "fee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("finished");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.webservice.svm/xsd", "finished"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.webservice.svm/xsd", "name"));
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

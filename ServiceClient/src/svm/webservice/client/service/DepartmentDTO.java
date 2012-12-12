/**
 * DepartmentDTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package svm.webservice.client.service;

public class DepartmentDTO  extends svm.webservice.client.service.DTO  implements java.io.Serializable {
    private java.lang.String alias;

    private svm.webservice.client.service.ContactDetailsDTO contactDetails;

    private java.lang.String description;

    private java.lang.String name;

    public DepartmentDTO() {
    }

    public DepartmentDTO(
           java.lang.Integer UID,
           java.lang.String alias,
           svm.webservice.client.service.ContactDetailsDTO contactDetails,
           java.lang.String description,
           java.lang.String name) {
        super(
            UID);
        this.alias = alias;
        this.contactDetails = contactDetails;
        this.description = description;
        this.name = name;
    }


    /**
     * Gets the alias value for this DepartmentDTO.
     * 
     * @return alias
     */
    public java.lang.String getAlias() {
        return alias;
    }


    /**
     * Sets the alias value for this DepartmentDTO.
     * 
     * @param alias
     */
    public void setAlias(java.lang.String alias) {
        this.alias = alias;
    }


    /**
     * Gets the contactDetails value for this DepartmentDTO.
     * 
     * @return contactDetails
     */
    public svm.webservice.client.service.ContactDetailsDTO getContactDetails() {
        return contactDetails;
    }


    /**
     * Sets the contactDetails value for this DepartmentDTO.
     * 
     * @param contactDetails
     */
    public void setContactDetails(svm.webservice.client.service.ContactDetailsDTO contactDetails) {
        this.contactDetails = contactDetails;
    }


    /**
     * Gets the description value for this DepartmentDTO.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this DepartmentDTO.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the name value for this DepartmentDTO.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this DepartmentDTO.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DepartmentDTO)) return false;
        DepartmentDTO other = (DepartmentDTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.alias==null && other.getAlias()==null) || 
             (this.alias!=null &&
              this.alias.equals(other.getAlias()))) &&
            ((this.contactDetails==null && other.getContactDetails()==null) || 
             (this.contactDetails!=null &&
              this.contactDetails.equals(other.getContactDetails()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName())));
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
        if (getAlias() != null) {
            _hashCode += getAlias().hashCode();
        }
        if (getContactDetails() != null) {
            _hashCode += getContactDetails().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DepartmentDTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dto.webservice.svm/xsd", "DepartmentDTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alias");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.webservice.svm/xsd", "alias"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dto.webservice.svm/xsd", "name"));
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

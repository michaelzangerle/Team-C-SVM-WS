/**
 * ExportContestServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package svm.webservice.client.service;

public class ExportContestServiceLocator extends org.apache.axis.client.Service implements svm.webservice.client.service.ExportContestService {

    public ExportContestServiceLocator() {
    }


    public ExportContestServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ExportContestServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ExportContestServiceHttpSoap11Endpoint
    private java.lang.String ExportContestServiceHttpSoap11Endpoint_address = "http://localhost:8080/axis2/services/ExportContestService.ExportContestServiceHttpSoap11Endpoint/";

    public java.lang.String getExportContestServiceHttpSoap11EndpointAddress() {
        return ExportContestServiceHttpSoap11Endpoint_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ExportContestServiceHttpSoap11EndpointWSDDServiceName = "ExportContestServiceHttpSoap11Endpoint";

    public java.lang.String getExportContestServiceHttpSoap11EndpointWSDDServiceName() {
        return ExportContestServiceHttpSoap11EndpointWSDDServiceName;
    }

    public void setExportContestServiceHttpSoap11EndpointWSDDServiceName(java.lang.String name) {
        ExportContestServiceHttpSoap11EndpointWSDDServiceName = name;
    }

    public svm.webservice.client.service.ExportContestServicePortType getExportContestServiceHttpSoap11Endpoint() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ExportContestServiceHttpSoap11Endpoint_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getExportContestServiceHttpSoap11Endpoint(endpoint);
    }

    public svm.webservice.client.service.ExportContestServicePortType getExportContestServiceHttpSoap11Endpoint(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            svm.webservice.client.service.ExportContestServiceSoap11BindingStub _stub = new svm.webservice.client.service.ExportContestServiceSoap11BindingStub(portAddress, this);
            _stub.setPortName(getExportContestServiceHttpSoap11EndpointWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setExportContestServiceHttpSoap11EndpointEndpointAddress(java.lang.String address) {
        ExportContestServiceHttpSoap11Endpoint_address = address;
    }


    // Use to get a proxy class for ExportContestServiceHttpSoap12Endpoint
    private java.lang.String ExportContestServiceHttpSoap12Endpoint_address = "http://localhost:8080/axis2/services/ExportContestService.ExportContestServiceHttpSoap12Endpoint/";

    public java.lang.String getExportContestServiceHttpSoap12EndpointAddress() {
        return ExportContestServiceHttpSoap12Endpoint_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ExportContestServiceHttpSoap12EndpointWSDDServiceName = "ExportContestServiceHttpSoap12Endpoint";

    public java.lang.String getExportContestServiceHttpSoap12EndpointWSDDServiceName() {
        return ExportContestServiceHttpSoap12EndpointWSDDServiceName;
    }

    public void setExportContestServiceHttpSoap12EndpointWSDDServiceName(java.lang.String name) {
        ExportContestServiceHttpSoap12EndpointWSDDServiceName = name;
    }

    public svm.webservice.client.service.ExportContestServicePortType getExportContestServiceHttpSoap12Endpoint() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ExportContestServiceHttpSoap12Endpoint_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getExportContestServiceHttpSoap12Endpoint(endpoint);
    }

    public svm.webservice.client.service.ExportContestServicePortType getExportContestServiceHttpSoap12Endpoint(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            svm.webservice.client.service.ExportContestServiceSoap12BindingStub _stub = new svm.webservice.client.service.ExportContestServiceSoap12BindingStub(portAddress, this);
            _stub.setPortName(getExportContestServiceHttpSoap12EndpointWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setExportContestServiceHttpSoap12EndpointEndpointAddress(java.lang.String address) {
        ExportContestServiceHttpSoap12Endpoint_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     * This service has multiple ports for a given interface;
     * the proxy implementation returned may be indeterminate.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (svm.webservice.client.service.ExportContestServicePortType.class.isAssignableFrom(serviceEndpointInterface)) {
                svm.webservice.client.service.ExportContestServiceSoap11BindingStub _stub = new svm.webservice.client.service.ExportContestServiceSoap11BindingStub(new java.net.URL(ExportContestServiceHttpSoap11Endpoint_address), this);
                _stub.setPortName(getExportContestServiceHttpSoap11EndpointWSDDServiceName());
                return _stub;
            }
            if (svm.webservice.client.service.ExportContestServicePortType.class.isAssignableFrom(serviceEndpointInterface)) {
                svm.webservice.client.service.ExportContestServiceSoap12BindingStub _stub = new svm.webservice.client.service.ExportContestServiceSoap12BindingStub(new java.net.URL(ExportContestServiceHttpSoap12Endpoint_address), this);
                _stub.setPortName(getExportContestServiceHttpSoap12EndpointWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("ExportContestServiceHttpSoap11Endpoint".equals(inputPortName)) {
            return getExportContestServiceHttpSoap11Endpoint();
        }
        else if ("ExportContestServiceHttpSoap12Endpoint".equals(inputPortName)) {
            return getExportContestServiceHttpSoap12Endpoint();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://webservice.svm", "ExportContestService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://webservice.svm", "ExportContestServiceHttpSoap11Endpoint"));
            ports.add(new javax.xml.namespace.QName("http://webservice.svm", "ExportContestServiceHttpSoap12Endpoint"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ExportContestServiceHttpSoap11Endpoint".equals(portName)) {
            setExportContestServiceHttpSoap11EndpointEndpointAddress(address);
        }
        else 
if ("ExportContestServiceHttpSoap12Endpoint".equals(portName)) {
            setExportContestServiceHttpSoap12EndpointEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}

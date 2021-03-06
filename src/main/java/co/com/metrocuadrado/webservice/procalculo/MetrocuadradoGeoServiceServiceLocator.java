/**
 * MetrocuadradoGeoServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.com.metrocuadrado.webservice.procalculo;

public class MetrocuadradoGeoServiceServiceLocator extends org.apache.axis.client.Service implements co.com.metrocuadrado.webservice.procalculo.MetrocuadradoGeoServiceService {

    public MetrocuadradoGeoServiceServiceLocator() {
    }


    public MetrocuadradoGeoServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public MetrocuadradoGeoServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for metrocuadradoGeoServicePort
    private java.lang.String metrocuadradoGeoServicePort_address = "http://mapas.com.co/metrocuadrado/ws/MetrocuadradoGeoService";

    public java.lang.String getmetrocuadradoGeoServicePortAddress() {
        return metrocuadradoGeoServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String metrocuadradoGeoServicePortWSDDServiceName = "metrocuadradoGeoServicePort";

    public java.lang.String getmetrocuadradoGeoServicePortWSDDServiceName() {
        return metrocuadradoGeoServicePortWSDDServiceName;
    }

    public void setmetrocuadradoGeoServicePortWSDDServiceName(java.lang.String name) {
        metrocuadradoGeoServicePortWSDDServiceName = name;
    }

    public co.com.metrocuadrado.webservice.procalculo.MetrocuadradoGeoService getmetrocuadradoGeoServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(metrocuadradoGeoServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getmetrocuadradoGeoServicePort(endpoint);
    }

    public co.com.metrocuadrado.webservice.procalculo.MetrocuadradoGeoService getmetrocuadradoGeoServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
        	co.com.metrocuadrado.webservice.procalculo.MetrocuadradoGeoServiceServiceSoapBindingStub _stub = new co.com.metrocuadrado.webservice.procalculo.MetrocuadradoGeoServiceServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getmetrocuadradoGeoServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setmetrocuadradoGeoServicePortEndpointAddress(java.lang.String address) {
        metrocuadradoGeoServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (co.com.metrocuadrado.webservice.procalculo.MetrocuadradoGeoService.class.isAssignableFrom(serviceEndpointInterface)) {
            	co.com.metrocuadrado.webservice.procalculo.MetrocuadradoGeoServiceServiceSoapBindingStub _stub = new co.com.metrocuadrado.webservice.procalculo.MetrocuadradoGeoServiceServiceSoapBindingStub(new java.net.URL(metrocuadradoGeoServicePort_address), this);
                _stub.setPortName(getmetrocuadradoGeoServicePortWSDDServiceName());
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
        if ("metrocuadradoGeoServicePort".equals(inputPortName)) {
            return getmetrocuadradoGeoServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://services.m2.mapas.com.co", "MetrocuadradoGeoServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://services.m2.mapas.com.co", "metrocuadradoGeoServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("metrocuadradoGeoServicePort".equals(portName)) {
            setmetrocuadradoGeoServicePortEndpointAddress(address);
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

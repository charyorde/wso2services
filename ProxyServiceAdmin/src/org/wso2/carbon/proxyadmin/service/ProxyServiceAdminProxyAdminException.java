
/**
 * ProxyServiceAdminProxyAdminException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */

package org.wso2.carbon.proxyadmin.service;

public class ProxyServiceAdminProxyAdminException extends java.lang.Exception{

    private static final long serialVersionUID = 1355394611321L;
    
    private synapse.apache.org.xsd.ProxyServiceAdminProxyAdminException faultMessage;

    
        public ProxyServiceAdminProxyAdminException() {
            super("ProxyServiceAdminProxyAdminException");
        }

        public ProxyServiceAdminProxyAdminException(java.lang.String s) {
           super(s);
        }

        public ProxyServiceAdminProxyAdminException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public ProxyServiceAdminProxyAdminException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(synapse.apache.org.xsd.ProxyServiceAdminProxyAdminException msg){
       faultMessage = msg;
    }
    
    public synapse.apache.org.xsd.ProxyServiceAdminProxyAdminException getFaultMessage(){
       return faultMessage;
    }
}
    
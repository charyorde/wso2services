
/**
 * DiscoveryAdminException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */

package org.wso2.carbon.discovery;

public class DiscoveryAdminException extends java.lang.Exception{

    private static final long serialVersionUID = 1355391990127L;
    
    private synapse.apache.org.xsd.DiscoveryAdminException faultMessage;

    
        public DiscoveryAdminException() {
            super("DiscoveryAdminException");
        }

        public DiscoveryAdminException(java.lang.String s) {
           super(s);
        }

        public DiscoveryAdminException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public DiscoveryAdminException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(synapse.apache.org.xsd.DiscoveryAdminException msg){
       faultMessage = msg;
    }
    
    public synapse.apache.org.xsd.DiscoveryAdminException getFaultMessage(){
       return faultMessage;
    }
}
    
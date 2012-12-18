
/**
 * DiscoveryProxyDiscoveryException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */

package org.wso2.carbon.discovery.proxy;

public class DiscoveryProxyDiscoveryException extends java.lang.Exception{

    private static final long serialVersionUID = 1355397395517L;
    
    private org.oasis_open.docs.ws_dd.ns.discovery._2009._01.DiscoveryProxyDiscoveryException faultMessage;

    
        public DiscoveryProxyDiscoveryException() {
            super("DiscoveryProxyDiscoveryException");
        }

        public DiscoveryProxyDiscoveryException(java.lang.String s) {
           super(s);
        }

        public DiscoveryProxyDiscoveryException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public DiscoveryProxyDiscoveryException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(org.oasis_open.docs.ws_dd.ns.discovery._2009._01.DiscoveryProxyDiscoveryException msg){
       faultMessage = msg;
    }
    
    public org.oasis_open.docs.ws_dd.ns.discovery._2009._01.DiscoveryProxyDiscoveryException getFaultMessage(){
       return faultMessage;
    }
}
    
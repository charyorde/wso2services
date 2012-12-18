
/**
 * WSRegistryServiceIOExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */

package org.wso2.carbon.registry.ws.api;

public class WSRegistryServiceIOExceptionException extends java.lang.Exception{

    private static final long serialVersionUID = 1355397285965L;
    
    private org.wso2.carbon.registry.ws.api.WSRegistryServiceIOException faultMessage;

    
        public WSRegistryServiceIOExceptionException() {
            super("WSRegistryServiceIOExceptionException");
        }

        public WSRegistryServiceIOExceptionException(java.lang.String s) {
           super(s);
        }

        public WSRegistryServiceIOExceptionException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public WSRegistryServiceIOExceptionException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(org.wso2.carbon.registry.ws.api.WSRegistryServiceIOException msg){
       faultMessage = msg;
    }
    
    public org.wso2.carbon.registry.ws.api.WSRegistryServiceIOException getFaultMessage(){
       return faultMessage;
    }
}
    
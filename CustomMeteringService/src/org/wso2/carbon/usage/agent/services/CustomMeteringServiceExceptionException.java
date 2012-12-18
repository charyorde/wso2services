
/**
 * CustomMeteringServiceExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */

package org.wso2.carbon.usage.agent.services;

public class CustomMeteringServiceExceptionException extends java.lang.Exception{

    private static final long serialVersionUID = 1355390838746L;
    
    private org.wso2.carbon.usage.agent.services.CustomMeteringServiceException faultMessage;

    
        public CustomMeteringServiceExceptionException() {
            super("CustomMeteringServiceExceptionException");
        }

        public CustomMeteringServiceExceptionException(java.lang.String s) {
           super(s);
        }

        public CustomMeteringServiceExceptionException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public CustomMeteringServiceExceptionException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(org.wso2.carbon.usage.agent.services.CustomMeteringServiceException msg){
       faultMessage = msg;
    }
    
    public org.wso2.carbon.usage.agent.services.CustomMeteringServiceException getFaultMessage(){
       return faultMessage;
    }
}
    
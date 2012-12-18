
/**
 * UsageServiceExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */

package org.wso2.carbon.usage.services;

public class UsageServiceExceptionException extends java.lang.Exception{

    private static final long serialVersionUID = 1355860568029L;
    
    private org.wso2.carbon.usage.services.UsageServiceException faultMessage;

    
        public UsageServiceExceptionException() {
            super("UsageServiceExceptionException");
        }

        public UsageServiceExceptionException(java.lang.String s) {
           super(s);
        }

        public UsageServiceExceptionException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public UsageServiceExceptionException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(org.wso2.carbon.usage.services.UsageServiceException msg){
       faultMessage = msg;
    }
    
    public org.wso2.carbon.usage.services.UsageServiceException getFaultMessage(){
       return faultMessage;
    }
}
    
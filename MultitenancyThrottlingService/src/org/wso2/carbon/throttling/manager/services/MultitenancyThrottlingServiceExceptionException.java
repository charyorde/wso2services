
/**
 * MultitenancyThrottlingServiceExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */

package org.wso2.carbon.throttling.manager.services;

public class MultitenancyThrottlingServiceExceptionException extends java.lang.Exception{

    private static final long serialVersionUID = 1355860631581L;
    
    private org.wso2.carbon.throttling.manager.services.MultitenancyThrottlingServiceException faultMessage;

    
        public MultitenancyThrottlingServiceExceptionException() {
            super("MultitenancyThrottlingServiceExceptionException");
        }

        public MultitenancyThrottlingServiceExceptionException(java.lang.String s) {
           super(s);
        }

        public MultitenancyThrottlingServiceExceptionException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public MultitenancyThrottlingServiceExceptionException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(org.wso2.carbon.throttling.manager.services.MultitenancyThrottlingServiceException msg){
       faultMessage = msg;
    }
    
    public org.wso2.carbon.throttling.manager.services.MultitenancyThrottlingServiceException getFaultMessage(){
       return faultMessage;
    }
}
    
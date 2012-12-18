
/**
 * ActivationServiceExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */

package org.wso2.carbon.activation.service;

public class ActivationServiceExceptionException extends java.lang.Exception{

    private static final long serialVersionUID = 1355391904297L;
    
    private org.wso2.carbon.activation.service.ActivationServiceException faultMessage;

    
        public ActivationServiceExceptionException() {
            super("ActivationServiceExceptionException");
        }

        public ActivationServiceExceptionException(java.lang.String s) {
           super(s);
        }

        public ActivationServiceExceptionException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public ActivationServiceExceptionException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(org.wso2.carbon.activation.service.ActivationServiceException msg){
       faultMessage = msg;
    }
    
    public org.wso2.carbon.activation.service.ActivationServiceException getFaultMessage(){
       return faultMessage;
    }
}
    
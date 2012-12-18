
/**
 * EmailVerificationServiceExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */

package org.wso2.carbon.email.verification.services;

public class EmailVerificationServiceExceptionException extends java.lang.Exception{

    private static final long serialVersionUID = 1355391875665L;
    
    private org.wso2.carbon.email.verification.services.EmailVerificationServiceException faultMessage;

    
        public EmailVerificationServiceExceptionException() {
            super("EmailVerificationServiceExceptionException");
        }

        public EmailVerificationServiceExceptionException(java.lang.String s) {
           super(s);
        }

        public EmailVerificationServiceExceptionException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public EmailVerificationServiceExceptionException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(org.wso2.carbon.email.verification.services.EmailVerificationServiceException msg){
       faultMessage = msg;
    }
    
    public org.wso2.carbon.email.verification.services.EmailVerificationServiceException getFaultMessage(){
       return faultMessage;
    }
}
    
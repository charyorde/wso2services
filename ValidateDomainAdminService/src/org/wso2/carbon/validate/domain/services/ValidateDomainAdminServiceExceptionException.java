
/**
 * ValidateDomainAdminServiceExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */

package org.wso2.carbon.validate.domain.services;

public class ValidateDomainAdminServiceExceptionException extends java.lang.Exception{

    private static final long serialVersionUID = 1355860588119L;
    
    private org.wso2.carbon.validate.domain.services.ValidateDomainAdminServiceException faultMessage;

    
        public ValidateDomainAdminServiceExceptionException() {
            super("ValidateDomainAdminServiceExceptionException");
        }

        public ValidateDomainAdminServiceExceptionException(java.lang.String s) {
           super(s);
        }

        public ValidateDomainAdminServiceExceptionException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public ValidateDomainAdminServiceExceptionException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(org.wso2.carbon.validate.domain.services.ValidateDomainAdminServiceException msg){
       faultMessage = msg;
    }
    
    public org.wso2.carbon.validate.domain.services.ValidateDomainAdminServiceException getFaultMessage(){
       return faultMessage;
    }
}
    
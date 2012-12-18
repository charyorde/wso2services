
/**
 * AccountMgtServiceExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */

package org.wso2.carbon.account.mgt.services;

public class AccountMgtServiceExceptionException extends java.lang.Exception{

    private static final long serialVersionUID = 1355860548233L;
    
    private org.wso2.carbon.account.mgt.services.AccountMgtServiceException faultMessage;

    
        public AccountMgtServiceExceptionException() {
            super("AccountMgtServiceExceptionException");
        }

        public AccountMgtServiceExceptionException(java.lang.String s) {
           super(s);
        }

        public AccountMgtServiceExceptionException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public AccountMgtServiceExceptionException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(org.wso2.carbon.account.mgt.services.AccountMgtServiceException msg){
       faultMessage = msg;
    }
    
    public org.wso2.carbon.account.mgt.services.AccountMgtServiceException getFaultMessage(){
       return faultMessage;
    }
}
    
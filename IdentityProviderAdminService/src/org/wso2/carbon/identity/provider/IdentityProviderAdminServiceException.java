
/**
 * IdentityProviderAdminServiceException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */

package org.wso2.carbon.identity.provider;

public class IdentityProviderAdminServiceException extends java.lang.Exception{

    private static final long serialVersionUID = 1355394674933L;
    
    private axis2.apache.org.xsd.IdentityProviderAdminServiceException faultMessage;

    
        public IdentityProviderAdminServiceException() {
            super("IdentityProviderAdminServiceException");
        }

        public IdentityProviderAdminServiceException(java.lang.String s) {
           super(s);
        }

        public IdentityProviderAdminServiceException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public IdentityProviderAdminServiceException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(axis2.apache.org.xsd.IdentityProviderAdminServiceException msg){
       faultMessage = msg;
    }
    
    public axis2.apache.org.xsd.IdentityProviderAdminServiceException getFaultMessage(){
       return faultMessage;
    }
}
    
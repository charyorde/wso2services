
/**
 * KeyStoreAdminServiceSecurityConfigExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */

package org.wso2.carbon.security.keystore.service;

public class KeyStoreAdminServiceSecurityConfigExceptionException extends java.lang.Exception{

    private static final long serialVersionUID = 1355391957744L;
    
    private org.wso2.carbon.security.keystore.service.KeyStoreAdminServiceSecurityConfigException faultMessage;

    
        public KeyStoreAdminServiceSecurityConfigExceptionException() {
            super("KeyStoreAdminServiceSecurityConfigExceptionException");
        }

        public KeyStoreAdminServiceSecurityConfigExceptionException(java.lang.String s) {
           super(s);
        }

        public KeyStoreAdminServiceSecurityConfigExceptionException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public KeyStoreAdminServiceSecurityConfigExceptionException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(org.wso2.carbon.security.keystore.service.KeyStoreAdminServiceSecurityConfigException msg){
       faultMessage = msg;
    }
    
    public org.wso2.carbon.security.keystore.service.KeyStoreAdminServiceSecurityConfigException getFaultMessage(){
       return faultMessage;
    }
}
    

/**
 * STSAdminServiceSecurityConfigExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */

package org.wso2.carbon.security.sts.service;

public class STSAdminServiceSecurityConfigExceptionException extends java.lang.Exception{

    private static final long serialVersionUID = 1355390950527L;
    
    private org.wso2.carbon.security.sts.service.STSAdminServiceSecurityConfigException faultMessage;

    
        public STSAdminServiceSecurityConfigExceptionException() {
            super("STSAdminServiceSecurityConfigExceptionException");
        }

        public STSAdminServiceSecurityConfigExceptionException(java.lang.String s) {
           super(s);
        }

        public STSAdminServiceSecurityConfigExceptionException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public STSAdminServiceSecurityConfigExceptionException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(org.wso2.carbon.security.sts.service.STSAdminServiceSecurityConfigException msg){
       faultMessage = msg;
    }
    
    public org.wso2.carbon.security.sts.service.STSAdminServiceSecurityConfigException getFaultMessage(){
       return faultMessage;
    }
}
    
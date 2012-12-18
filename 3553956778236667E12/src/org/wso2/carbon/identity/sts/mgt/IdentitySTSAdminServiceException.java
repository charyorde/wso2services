
/**
 * IdentitySTSAdminServiceException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */

package org.wso2.carbon.identity.sts.mgt;

public class IdentitySTSAdminServiceException extends java.lang.Exception{

    private static final long serialVersionUID = 1355395677800L;
    
    private axis2.apache.org.xsd.IdentitySTSAdminServiceException faultMessage;

    
        public IdentitySTSAdminServiceException() {
            super("IdentitySTSAdminServiceException");
        }

        public IdentitySTSAdminServiceException(java.lang.String s) {
           super(s);
        }

        public IdentitySTSAdminServiceException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public IdentitySTSAdminServiceException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(axis2.apache.org.xsd.IdentitySTSAdminServiceException msg){
       faultMessage = msg;
    }
    
    public axis2.apache.org.xsd.IdentitySTSAdminServiceException getFaultMessage(){
       return faultMessage;
    }
}
    
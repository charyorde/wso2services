
/**
 * ProfileAdminServiceProfileManagementExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */

package org.wso2.carbon.profiles.mgt;

public class ProfileAdminServiceProfileManagementExceptionException extends java.lang.Exception{

    private static final long serialVersionUID = 1355395663670L;
    
    private org.wso2.carbon.profiles.mgt.ProfileAdminServiceProfileManagementException faultMessage;

    
        public ProfileAdminServiceProfileManagementExceptionException() {
            super("ProfileAdminServiceProfileManagementExceptionException");
        }

        public ProfileAdminServiceProfileManagementExceptionException(java.lang.String s) {
           super(s);
        }

        public ProfileAdminServiceProfileManagementExceptionException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public ProfileAdminServiceProfileManagementExceptionException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(org.wso2.carbon.profiles.mgt.ProfileAdminServiceProfileManagementException msg){
       faultMessage = msg;
    }
    
    public org.wso2.carbon.profiles.mgt.ProfileAdminServiceProfileManagementException getFaultMessage(){
       return faultMessage;
    }
}
    
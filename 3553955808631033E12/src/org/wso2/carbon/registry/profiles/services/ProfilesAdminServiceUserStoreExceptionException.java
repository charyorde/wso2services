
/**
 * ProfilesAdminServiceUserStoreExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */

package org.wso2.carbon.registry.profiles.services;

public class ProfilesAdminServiceUserStoreExceptionException extends java.lang.Exception{

    private static final long serialVersionUID = 1355395580832L;
    
    private org.wso2.carbon.registry.profiles.services.ProfilesAdminServiceUserStoreException faultMessage;

    
        public ProfilesAdminServiceUserStoreExceptionException() {
            super("ProfilesAdminServiceUserStoreExceptionException");
        }

        public ProfilesAdminServiceUserStoreExceptionException(java.lang.String s) {
           super(s);
        }

        public ProfilesAdminServiceUserStoreExceptionException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public ProfilesAdminServiceUserStoreExceptionException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(org.wso2.carbon.registry.profiles.services.ProfilesAdminServiceUserStoreException msg){
       faultMessage = msg;
    }
    
    public org.wso2.carbon.registry.profiles.services.ProfilesAdminServiceUserStoreException getFaultMessage(){
       return faultMessage;
    }
}
    
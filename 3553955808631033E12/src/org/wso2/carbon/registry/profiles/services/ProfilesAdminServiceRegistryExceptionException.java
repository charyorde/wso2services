
/**
 * ProfilesAdminServiceRegistryExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */

package org.wso2.carbon.registry.profiles.services;

public class ProfilesAdminServiceRegistryExceptionException extends java.lang.Exception{

    private static final long serialVersionUID = 1355395580836L;
    
    private org.wso2.carbon.registry.profiles.services.ProfilesAdminServiceRegistryException faultMessage;

    
        public ProfilesAdminServiceRegistryExceptionException() {
            super("ProfilesAdminServiceRegistryExceptionException");
        }

        public ProfilesAdminServiceRegistryExceptionException(java.lang.String s) {
           super(s);
        }

        public ProfilesAdminServiceRegistryExceptionException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public ProfilesAdminServiceRegistryExceptionException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(org.wso2.carbon.registry.profiles.services.ProfilesAdminServiceRegistryException msg){
       faultMessage = msg;
    }
    
    public org.wso2.carbon.registry.profiles.services.ProfilesAdminServiceRegistryException getFaultMessage(){
       return faultMessage;
    }
}
    
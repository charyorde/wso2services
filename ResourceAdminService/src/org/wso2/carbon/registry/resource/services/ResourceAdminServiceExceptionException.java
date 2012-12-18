
/**
 * ResourceAdminServiceExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */

package org.wso2.carbon.registry.resource.services;

public class ResourceAdminServiceExceptionException extends java.lang.Exception{

    private static final long serialVersionUID = 1355392024558L;
    
    private org.wso2.carbon.registry.resource.services.ResourceAdminServiceException faultMessage;

    
        public ResourceAdminServiceExceptionException() {
            super("ResourceAdminServiceExceptionException");
        }

        public ResourceAdminServiceExceptionException(java.lang.String s) {
           super(s);
        }

        public ResourceAdminServiceExceptionException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public ResourceAdminServiceExceptionException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(org.wso2.carbon.registry.resource.services.ResourceAdminServiceException msg){
       faultMessage = msg;
    }
    
    public org.wso2.carbon.registry.resource.services.ResourceAdminServiceException getFaultMessage(){
       return faultMessage;
    }
}
    

/**
 * AdminManagementServiceExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */

package org.wso2.carbon.admin.mgt.services;

public class AdminManagementServiceExceptionException extends java.lang.Exception{

    private static final long serialVersionUID = 1355860438499L;
    
    private org.wso2.carbon.admin.mgt.services.AdminManagementServiceException faultMessage;

    
        public AdminManagementServiceExceptionException() {
            super("AdminManagementServiceExceptionException");
        }

        public AdminManagementServiceExceptionException(java.lang.String s) {
           super(s);
        }

        public AdminManagementServiceExceptionException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public AdminManagementServiceExceptionException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(org.wso2.carbon.admin.mgt.services.AdminManagementServiceException msg){
       faultMessage = msg;
    }
    
    public org.wso2.carbon.admin.mgt.services.AdminManagementServiceException getFaultMessage(){
       return faultMessage;
    }
}
    
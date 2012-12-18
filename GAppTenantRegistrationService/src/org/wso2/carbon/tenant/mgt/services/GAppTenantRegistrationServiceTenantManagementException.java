
/**
 * GAppTenantRegistrationServiceTenantManagementException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */

package org.wso2.carbon.tenant.mgt.services;

public class GAppTenantRegistrationServiceTenantManagementException extends java.lang.Exception{

    private static final long serialVersionUID = 1355860653941L;
    
    private axis2.apache.org.xsd.GAppTenantRegistrationServiceTenantManagementException faultMessage;

    
        public GAppTenantRegistrationServiceTenantManagementException() {
            super("GAppTenantRegistrationServiceTenantManagementException");
        }

        public GAppTenantRegistrationServiceTenantManagementException(java.lang.String s) {
           super(s);
        }

        public GAppTenantRegistrationServiceTenantManagementException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public GAppTenantRegistrationServiceTenantManagementException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(axis2.apache.org.xsd.GAppTenantRegistrationServiceTenantManagementException msg){
       faultMessage = msg;
    }
    
    public axis2.apache.org.xsd.GAppTenantRegistrationServiceTenantManagementException getFaultMessage(){
       return faultMessage;
    }
}
    

/**
 * AddServicesServiceRegistryExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */

package org.wso2.carbon.governance.services.services;

public class AddServicesServiceRegistryExceptionException extends java.lang.Exception{

    private static final long serialVersionUID = 1355397314317L;
    
    private org.wso2.carbon.governance.services.services.AddServicesServiceRegistryException faultMessage;

    
        public AddServicesServiceRegistryExceptionException() {
            super("AddServicesServiceRegistryExceptionException");
        }

        public AddServicesServiceRegistryExceptionException(java.lang.String s) {
           super(s);
        }

        public AddServicesServiceRegistryExceptionException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public AddServicesServiceRegistryExceptionException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(org.wso2.carbon.governance.services.services.AddServicesServiceRegistryException msg){
       faultMessage = msg;
    }
    
    public org.wso2.carbon.governance.services.services.AddServicesServiceRegistryException getFaultMessage(){
       return faultMessage;
    }
}
    
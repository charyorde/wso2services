
/**
 * AddServicesServiceExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */

package org.wso2.carbon.governance.services.services;

public class AddServicesServiceExceptionException extends java.lang.Exception{

    private static final long serialVersionUID = 1355397314313L;
    
    private org.wso2.carbon.governance.services.services.AddServicesServiceException faultMessage;

    
        public AddServicesServiceExceptionException() {
            super("AddServicesServiceExceptionException");
        }

        public AddServicesServiceExceptionException(java.lang.String s) {
           super(s);
        }

        public AddServicesServiceExceptionException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public AddServicesServiceExceptionException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(org.wso2.carbon.governance.services.services.AddServicesServiceException msg){
       faultMessage = msg;
    }
    
    public org.wso2.carbon.governance.services.services.AddServicesServiceException getFaultMessage(){
       return faultMessage;
    }
}
    
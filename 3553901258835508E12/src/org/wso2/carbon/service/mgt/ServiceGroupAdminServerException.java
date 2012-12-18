
/**
 * ServiceGroupAdminServerException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */

package org.wso2.carbon.service.mgt;

public class ServiceGroupAdminServerException extends java.lang.Exception{

    private static final long serialVersionUID = 1355390125844L;
    
    private axis2.apache.org.xsd.ServiceGroupAdminServerException faultMessage;

    
        public ServiceGroupAdminServerException() {
            super("ServiceGroupAdminServerException");
        }

        public ServiceGroupAdminServerException(java.lang.String s) {
           super(s);
        }

        public ServiceGroupAdminServerException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public ServiceGroupAdminServerException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(axis2.apache.org.xsd.ServiceGroupAdminServerException msg){
       faultMessage = msg;
    }
    
    public axis2.apache.org.xsd.ServiceGroupAdminServerException getFaultMessage(){
       return faultMessage;
    }
}
    

/**
 * ListMetadataServiceRegistryExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */

package org.wso2.carbon.governance.list.services;

public class ListMetadataServiceRegistryExceptionException extends java.lang.Exception{

    private static final long serialVersionUID = 1355397249777L;
    
    private org.wso2.carbon.governance.list.services.ListMetadataServiceRegistryException faultMessage;

    
        public ListMetadataServiceRegistryExceptionException() {
            super("ListMetadataServiceRegistryExceptionException");
        }

        public ListMetadataServiceRegistryExceptionException(java.lang.String s) {
           super(s);
        }

        public ListMetadataServiceRegistryExceptionException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public ListMetadataServiceRegistryExceptionException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(org.wso2.carbon.governance.list.services.ListMetadataServiceRegistryException msg){
       faultMessage = msg;
    }
    
    public org.wso2.carbon.governance.list.services.ListMetadataServiceRegistryException getFaultMessage(){
       return faultMessage;
    }
}
    
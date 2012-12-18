
/**
 * ServiceStatPublisherAdminException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */

package org.wso2.carbon.bam.data.publisher.servicestats.services;

public class ServiceStatPublisherAdminException extends java.lang.Exception{

    private static final long serialVersionUID = 1355391080806L;
    
    private axis2.apache.org.xsd.ServiceStatPublisherAdminException faultMessage;

    
        public ServiceStatPublisherAdminException() {
            super("ServiceStatPublisherAdminException");
        }

        public ServiceStatPublisherAdminException(java.lang.String s) {
           super(s);
        }

        public ServiceStatPublisherAdminException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public ServiceStatPublisherAdminException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(axis2.apache.org.xsd.ServiceStatPublisherAdminException msg){
       faultMessage = msg;
    }
    
    public axis2.apache.org.xsd.ServiceStatPublisherAdminException getFaultMessage(){
       return faultMessage;
    }
}
    

/**
 * JMSTransportAdminException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */

package org.wso2.carbon.transport.jms;

public class JMSTransportAdminException extends java.lang.Exception{

    private static final long serialVersionUID = 1355389875508L;
    
    private axis2.apache.org.xsd.JMSTransportAdminException faultMessage;

    
        public JMSTransportAdminException() {
            super("JMSTransportAdminException");
        }

        public JMSTransportAdminException(java.lang.String s) {
           super(s);
        }

        public JMSTransportAdminException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public JMSTransportAdminException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(axis2.apache.org.xsd.JMSTransportAdminException msg){
       faultMessage = msg;
    }
    
    public axis2.apache.org.xsd.JMSTransportAdminException getFaultMessage(){
       return faultMessage;
    }
}
    
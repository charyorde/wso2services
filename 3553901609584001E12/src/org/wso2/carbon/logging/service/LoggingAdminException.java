
/**
 * LoggingAdminException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */

package org.wso2.carbon.logging.service;

public class LoggingAdminException extends java.lang.Exception{

    private static final long serialVersionUID = 1355390160923L;
    
    private axis2.apache.org.xsd.LoggingAdminExceptionE faultMessage;

    
        public LoggingAdminException() {
            super("LoggingAdminException");
        }

        public LoggingAdminException(java.lang.String s) {
           super(s);
        }

        public LoggingAdminException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public LoggingAdminException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(axis2.apache.org.xsd.LoggingAdminExceptionE msg){
       faultMessage = msg;
    }
    
    public axis2.apache.org.xsd.LoggingAdminExceptionE getFaultMessage(){
       return faultMessage;
    }
}
    
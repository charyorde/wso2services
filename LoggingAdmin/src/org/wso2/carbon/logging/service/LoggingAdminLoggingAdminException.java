
/**
 * LoggingAdminLoggingAdminException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */

package org.wso2.carbon.logging.service;

public class LoggingAdminLoggingAdminException extends java.lang.Exception{

    private static final long serialVersionUID = 1355390160926L;
    
    private axis2.apache.org.xsd.LoggingAdminLoggingAdminException faultMessage;

    
        public LoggingAdminLoggingAdminException() {
            super("LoggingAdminLoggingAdminException");
        }

        public LoggingAdminLoggingAdminException(java.lang.String s) {
           super(s);
        }

        public LoggingAdminLoggingAdminException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public LoggingAdminLoggingAdminException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(axis2.apache.org.xsd.LoggingAdminLoggingAdminException msg){
       faultMessage = msg;
    }
    
    public axis2.apache.org.xsd.LoggingAdminLoggingAdminException getFaultMessage(){
       return faultMessage;
    }
}
    

/**
 * JrxmlFileUploaderReportingExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */

package org.wso2.carbon.reporting.core.services;

public class JrxmlFileUploaderReportingExceptionException extends java.lang.Exception{

    private static final long serialVersionUID = 1355397521359L;
    
    private org.wso2.carbon.reporting.core.services.JrxmlFileUploaderReportingException faultMessage;

    
        public JrxmlFileUploaderReportingExceptionException() {
            super("JrxmlFileUploaderReportingExceptionException");
        }

        public JrxmlFileUploaderReportingExceptionException(java.lang.String s) {
           super(s);
        }

        public JrxmlFileUploaderReportingExceptionException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public JrxmlFileUploaderReportingExceptionException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(org.wso2.carbon.reporting.core.services.JrxmlFileUploaderReportingException msg){
       faultMessage = msg;
    }
    
    public org.wso2.carbon.reporting.core.services.JrxmlFileUploaderReportingException getFaultMessage(){
       return faultMessage;
    }
}
    
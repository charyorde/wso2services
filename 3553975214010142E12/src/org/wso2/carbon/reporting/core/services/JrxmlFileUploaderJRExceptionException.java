
/**
 * JrxmlFileUploaderJRExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */

package org.wso2.carbon.reporting.core.services;

public class JrxmlFileUploaderJRExceptionException extends java.lang.Exception{

    private static final long serialVersionUID = 1355397521355L;
    
    private org.wso2.carbon.reporting.core.services.JrxmlFileUploaderJRException faultMessage;

    
        public JrxmlFileUploaderJRExceptionException() {
            super("JrxmlFileUploaderJRExceptionException");
        }

        public JrxmlFileUploaderJRExceptionException(java.lang.String s) {
           super(s);
        }

        public JrxmlFileUploaderJRExceptionException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public JrxmlFileUploaderJRExceptionException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(org.wso2.carbon.reporting.core.services.JrxmlFileUploaderJRException msg){
       faultMessage = msg;
    }
    
    public org.wso2.carbon.reporting.core.services.JrxmlFileUploaderJRException getFaultMessage(){
       return faultMessage;
    }
}
    

/**
 * RedirectorServletServiceExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */

package org.wso2.carbon.redirector.servlet.services;

public class RedirectorServletServiceExceptionException extends java.lang.Exception{

    private static final long serialVersionUID = 1355392263876L;
    
    private org.wso2.carbon.redirector.servlet.services.RedirectorServletServiceException faultMessage;

    
        public RedirectorServletServiceExceptionException() {
            super("RedirectorServletServiceExceptionException");
        }

        public RedirectorServletServiceExceptionException(java.lang.String s) {
           super(s);
        }

        public RedirectorServletServiceExceptionException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public RedirectorServletServiceExceptionException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(org.wso2.carbon.redirector.servlet.services.RedirectorServletServiceException msg){
       faultMessage = msg;
    }
    
    public org.wso2.carbon.redirector.servlet.services.RedirectorServletServiceException getFaultMessage(){
       return faultMessage;
    }
}
    
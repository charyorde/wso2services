
/**
 * GadgetContentServiceException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */

package org.wso2.carbon.dashboard;

public class GadgetContentServiceException extends java.lang.Exception{

    private static final long serialVersionUID = 1355397268124L;
    
    private wsf.wso2.org.tools.GadgetContentServiceException faultMessage;

    
        public GadgetContentServiceException() {
            super("GadgetContentServiceException");
        }

        public GadgetContentServiceException(java.lang.String s) {
           super(s);
        }

        public GadgetContentServiceException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public GadgetContentServiceException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(wsf.wso2.org.tools.GadgetContentServiceException msg){
       faultMessage = msg;
    }
    
    public wsf.wso2.org.tools.GadgetContentServiceException getFaultMessage(){
       return faultMessage;
    }
}
    
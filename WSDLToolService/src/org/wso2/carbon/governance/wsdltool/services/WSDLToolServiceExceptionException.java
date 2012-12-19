
/**
 * WSDLToolServiceExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */

package org.wso2.carbon.governance.wsdltool.services;

public class WSDLToolServiceExceptionException extends java.lang.Exception{

    private static final long serialVersionUID = 1355397221640L;
    
    private org.wso2.carbon.governance.wsdltool.services.WSDLToolServiceException faultMessage;

    
        public WSDLToolServiceExceptionException() {
            super("WSDLToolServiceExceptionException");
        }

        public WSDLToolServiceExceptionException(java.lang.String s) {
           super(s);
        }

        public WSDLToolServiceExceptionException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public WSDLToolServiceExceptionException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(org.wso2.carbon.governance.wsdltool.services.WSDLToolServiceException msg){
       faultMessage = msg;
    }
    
    public org.wso2.carbon.governance.wsdltool.services.WSDLToolServiceException getFaultMessage(){
       return faultMessage;
    }
}
    
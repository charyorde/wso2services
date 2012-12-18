
/**
 * RelyingPartyAdminServiceException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */

package org.wso2.carbon.identity.provider;

public class RelyingPartyAdminServiceException extends java.lang.Exception{

    private static final long serialVersionUID = 1355389501104L;
    
    private axis2.apache.org.xsd.RelyingPartyAdminServiceException faultMessage;

    
        public RelyingPartyAdminServiceException() {
            super("RelyingPartyAdminServiceException");
        }

        public RelyingPartyAdminServiceException(java.lang.String s) {
           super(s);
        }

        public RelyingPartyAdminServiceException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public RelyingPartyAdminServiceException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(axis2.apache.org.xsd.RelyingPartyAdminServiceException msg){
       faultMessage = msg;
    }
    
    public axis2.apache.org.xsd.RelyingPartyAdminServiceException getFaultMessage(){
       return faultMessage;
    }
}
    
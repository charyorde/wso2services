
/**
 * LocalEntryAdminLocalEntryAdminException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */

package org.wso2.carbon.localentry.service;

public class LocalEntryAdminLocalEntryAdminException extends java.lang.Exception{

    private static final long serialVersionUID = 1355394340465L;
    
    private axis2.apache.org.xsd.LocalEntryAdminLocalEntryAdminException faultMessage;

    
        public LocalEntryAdminLocalEntryAdminException() {
            super("LocalEntryAdminLocalEntryAdminException");
        }

        public LocalEntryAdminLocalEntryAdminException(java.lang.String s) {
           super(s);
        }

        public LocalEntryAdminLocalEntryAdminException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public LocalEntryAdminLocalEntryAdminException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(axis2.apache.org.xsd.LocalEntryAdminLocalEntryAdminException msg){
       faultMessage = msg;
    }
    
    public axis2.apache.org.xsd.LocalEntryAdminLocalEntryAdminException getFaultMessage(){
       return faultMessage;
    }
}
    
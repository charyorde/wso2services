
/**
 * BAMConfigAdminServiceBAMException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */

package org.wso2.carbon.bam.core.services;

public class BAMConfigAdminServiceBAMException extends java.lang.Exception{

    private static final long serialVersionUID = 1355397593001L;
    
    private axis2.apache.org.xsd.BAMConfigAdminServiceBAMException faultMessage;

    
        public BAMConfigAdminServiceBAMException() {
            super("BAMConfigAdminServiceBAMException");
        }

        public BAMConfigAdminServiceBAMException(java.lang.String s) {
           super(s);
        }

        public BAMConfigAdminServiceBAMException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public BAMConfigAdminServiceBAMException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(axis2.apache.org.xsd.BAMConfigAdminServiceBAMException msg){
       faultMessage = msg;
    }
    
    public axis2.apache.org.xsd.BAMConfigAdminServiceBAMException getFaultMessage(){
       return faultMessage;
    }
}
    
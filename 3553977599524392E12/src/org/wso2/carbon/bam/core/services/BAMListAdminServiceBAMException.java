
/**
 * BAMListAdminServiceBAMException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */

package org.wso2.carbon.bam.core.services;

public class BAMListAdminServiceBAMException extends java.lang.Exception{

    private static final long serialVersionUID = 1355397759927L;
    
    private axis2.apache.org.xsd.BAMListAdminServiceBAMException faultMessage;

    
        public BAMListAdminServiceBAMException() {
            super("BAMListAdminServiceBAMException");
        }

        public BAMListAdminServiceBAMException(java.lang.String s) {
           super(s);
        }

        public BAMListAdminServiceBAMException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public BAMListAdminServiceBAMException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(axis2.apache.org.xsd.BAMListAdminServiceBAMException msg){
       faultMessage = msg;
    }
    
    public axis2.apache.org.xsd.BAMListAdminServiceBAMException getFaultMessage(){
       return faultMessage;
    }
}
    
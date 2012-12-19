
/**
 * BAMTenantAdminBAMException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */

package org.wso2.carbon.bam.core.admin;

public class BAMTenantAdminBAMException extends java.lang.Exception{

    private static final long serialVersionUID = 1355397622485L;
    
    private axis2.apache.org.xsd.BAMTenantAdminBAMException faultMessage;

    
        public BAMTenantAdminBAMException() {
            super("BAMTenantAdminBAMException");
        }

        public BAMTenantAdminBAMException(java.lang.String s) {
           super(s);
        }

        public BAMTenantAdminBAMException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public BAMTenantAdminBAMException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(axis2.apache.org.xsd.BAMTenantAdminBAMException msg){
       faultMessage = msg;
    }
    
    public axis2.apache.org.xsd.BAMTenantAdminBAMException getFaultMessage(){
       return faultMessage;
    }
}
    
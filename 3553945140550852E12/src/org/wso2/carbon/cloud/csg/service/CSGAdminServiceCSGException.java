
/**
 * CSGAdminServiceCSGException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */

package org.wso2.carbon.cloud.csg.service;

public class CSGAdminServiceCSGException extends java.lang.Exception{

    private static final long serialVersionUID = 1355394514029L;
    
    private synapse.apache.org.xsd.CSGAdminServiceCSGException faultMessage;

    
        public CSGAdminServiceCSGException() {
            super("CSGAdminServiceCSGException");
        }

        public CSGAdminServiceCSGException(java.lang.String s) {
           super(s);
        }

        public CSGAdminServiceCSGException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public CSGAdminServiceCSGException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(synapse.apache.org.xsd.CSGAdminServiceCSGException msg){
       faultMessage = msg;
    }
    
    public synapse.apache.org.xsd.CSGAdminServiceCSGException getFaultMessage(){
       return faultMessage;
    }
}
    
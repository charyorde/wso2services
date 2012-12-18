
/**
 * VersionExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */

package org.wso2.carbon.core.services.version;

public class VersionExceptionException extends java.lang.Exception{

    private static final long serialVersionUID = 1355391810000L;
    
    private org.wso2.carbon.core.services.version.VersionException faultMessage;

    
        public VersionExceptionException() {
            super("VersionExceptionException");
        }

        public VersionExceptionException(java.lang.String s) {
           super(s);
        }

        public VersionExceptionException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public VersionExceptionException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(org.wso2.carbon.core.services.version.VersionException msg){
       faultMessage = msg;
    }
    
    public org.wso2.carbon.core.services.version.VersionException getFaultMessage(){
       return faultMessage;
    }
}
    
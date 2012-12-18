
/**
 * UpgradeServiceExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */

package org.wso2.carbon.upgrade.services;

public class UpgradeServiceExceptionException extends java.lang.Exception{

    private static final long serialVersionUID = 1355860481716L;
    
    private org.wso2.carbon.upgrade.services.UpgradeServiceException faultMessage;

    
        public UpgradeServiceExceptionException() {
            super("UpgradeServiceExceptionException");
        }

        public UpgradeServiceExceptionException(java.lang.String s) {
           super(s);
        }

        public UpgradeServiceExceptionException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public UpgradeServiceExceptionException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(org.wso2.carbon.upgrade.services.UpgradeServiceException msg){
       faultMessage = msg;
    }
    
    public org.wso2.carbon.upgrade.services.UpgradeServiceException getFaultMessage(){
       return faultMessage;
    }
}
    
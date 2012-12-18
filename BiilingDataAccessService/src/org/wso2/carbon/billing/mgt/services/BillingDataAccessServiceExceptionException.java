
/**
 * BillingDataAccessServiceExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */

package org.wso2.carbon.billing.mgt.services;

public class BillingDataAccessServiceExceptionException extends java.lang.Exception{

    private static final long serialVersionUID = 1355860353287L;
    
    private org.wso2.carbon.billing.mgt.services.BillingDataAccessServiceException faultMessage;

    
        public BillingDataAccessServiceExceptionException() {
            super("BillingDataAccessServiceExceptionException");
        }

        public BillingDataAccessServiceExceptionException(java.lang.String s) {
           super(s);
        }

        public BillingDataAccessServiceExceptionException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public BillingDataAccessServiceExceptionException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(org.wso2.carbon.billing.mgt.services.BillingDataAccessServiceException msg){
       faultMessage = msg;
    }
    
    public org.wso2.carbon.billing.mgt.services.BillingDataAccessServiceException getFaultMessage(){
       return faultMessage;
    }
}
    
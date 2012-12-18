
/**
 * MultitenancyBillingServiceExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */

package org.wso2.carbon.billing.mgt.services;

public class MultitenancyBillingServiceExceptionException extends java.lang.Exception{

    private static final long serialVersionUID = 1355860505190L;
    
    private org.wso2.carbon.billing.mgt.services.MultitenancyBillingServiceException faultMessage;

    
        public MultitenancyBillingServiceExceptionException() {
            super("MultitenancyBillingServiceExceptionException");
        }

        public MultitenancyBillingServiceExceptionException(java.lang.String s) {
           super(s);
        }

        public MultitenancyBillingServiceExceptionException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public MultitenancyBillingServiceExceptionException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(org.wso2.carbon.billing.mgt.services.MultitenancyBillingServiceException msg){
       faultMessage = msg;
    }
    
    public org.wso2.carbon.billing.mgt.services.MultitenancyBillingServiceException getFaultMessage(){
       return faultMessage;
    }
}
    
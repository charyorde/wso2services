
/**
 * StratosPaymentPayPalExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */

package org.wso2.carbon.payment.paypal.services;

public class StratosPaymentPayPalExceptionException extends java.lang.Exception{

    private static final long serialVersionUID = 1355860278729L;
    
    private org.wso2.carbon.payment.paypal.services.StratosPaymentPayPalException faultMessage;

    
        public StratosPaymentPayPalExceptionException() {
            super("StratosPaymentPayPalExceptionException");
        }

        public StratosPaymentPayPalExceptionException(java.lang.String s) {
           super(s);
        }

        public StratosPaymentPayPalExceptionException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public StratosPaymentPayPalExceptionException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(org.wso2.carbon.payment.paypal.services.StratosPaymentPayPalException msg){
       faultMessage = msg;
    }
    
    public org.wso2.carbon.payment.paypal.services.StratosPaymentPayPalException getFaultMessage(){
       return faultMessage;
    }
}
    
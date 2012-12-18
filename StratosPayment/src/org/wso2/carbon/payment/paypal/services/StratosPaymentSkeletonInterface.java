
/**
 * StratosPaymentSkeletonInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */
    package org.wso2.carbon.payment.paypal.services;
    /**
     *  StratosPaymentSkeletonInterface java skeleton interface for the axisService
     */
    public interface StratosPaymentSkeletonInterface {
     
         
        /**
         * Auto generated method signature
         * 
                                    * @param doExpressCheckout
             * @throws StratosPaymentPayPalExceptionException : 
         */

        
                public org.wso2.carbon.payment.paypal.services.DoExpressCheckoutResponse doExpressCheckout
                (
                  org.wso2.carbon.payment.paypal.services.DoExpressCheckout doExpressCheckout
                 )
            throws StratosPaymentPayPalExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param initExpressCheckout
             * @throws StratosPaymentPayPalExceptionException : 
         */

        
                public org.wso2.carbon.payment.paypal.services.InitExpressCheckoutResponse initExpressCheckout
                (
                  org.wso2.carbon.payment.paypal.services.InitExpressCheckout initExpressCheckout
                 )
            throws StratosPaymentPayPalExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getExpressCheckoutDetails
             * @throws StratosPaymentPayPalExceptionException : 
         */

        
                public org.wso2.carbon.payment.paypal.services.GetExpressCheckoutDetailsResponse getExpressCheckoutDetails
                (
                  org.wso2.carbon.payment.paypal.services.GetExpressCheckoutDetails getExpressCheckoutDetails
                 )
            throws StratosPaymentPayPalExceptionException;
        
         }
    
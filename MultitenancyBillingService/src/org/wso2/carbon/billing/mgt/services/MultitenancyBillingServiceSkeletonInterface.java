
/**
 * MultitenancyBillingServiceSkeletonInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */
    package org.wso2.carbon.billing.mgt.services;
    /**
     *  MultitenancyBillingServiceSkeletonInterface java skeleton interface for the axisService
     */
    public interface MultitenancyBillingServiceSkeletonInterface {
     
         
        /**
         * Auto generated method signature
         * 
                                    * @param getOutstandingBalance
             * @throws MultitenancyBillingServiceExceptionException : 
         */

        
                public org.wso2.carbon.billing.mgt.services.GetOutstandingBalanceResponse getOutstandingBalance
                (
                  org.wso2.carbon.billing.mgt.services.GetOutstandingBalance getOutstandingBalance
                 )
            throws MultitenancyBillingServiceExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getCurrentInvoice
             * @throws MultitenancyBillingServiceExceptionException : 
         */

        
                public org.wso2.carbon.billing.mgt.services.GetCurrentInvoiceResponse getCurrentInvoice
                (
                  org.wso2.carbon.billing.mgt.services.GetCurrentInvoice getCurrentInvoice
                 )
            throws MultitenancyBillingServiceExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getPastInvoice
             * @throws MultitenancyBillingServiceExceptionException : 
         */

        
                public org.wso2.carbon.billing.mgt.services.GetPastInvoiceResponse getPastInvoice
                (
                  org.wso2.carbon.billing.mgt.services.GetPastInvoice getPastInvoice
                 )
            throws MultitenancyBillingServiceExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param addPayment
             * @throws MultitenancyBillingServiceExceptionException : 
         */

        
                public org.wso2.carbon.billing.mgt.services.AddPaymentResponse addPayment
                (
                  org.wso2.carbon.billing.mgt.services.AddPayment addPayment
                 )
            throws MultitenancyBillingServiceExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getAvailableBillingPeriods
             * @throws MultitenancyBillingServiceExceptionException : 
         */

        
                public org.wso2.carbon.billing.mgt.services.GetAvailableBillingPeriodsResponse getAvailableBillingPeriods
                (
                  org.wso2.carbon.billing.mgt.services.GetAvailableBillingPeriods getAvailableBillingPeriods
                 )
            throws MultitenancyBillingServiceExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getPaginatedBalances
             * @throws MultitenancyBillingServiceExceptionException : 
         */

        
                public org.wso2.carbon.billing.mgt.services.GetPaginatedBalancesResponse getPaginatedBalances
                (
                  org.wso2.carbon.billing.mgt.services.GetPaginatedBalances getPaginatedBalances
                 )
            throws MultitenancyBillingServiceExceptionException;
        
         }
    
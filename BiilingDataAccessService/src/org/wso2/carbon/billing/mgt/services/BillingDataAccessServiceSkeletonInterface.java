
/**
 * BillingDataAccessServiceSkeletonInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */
    package org.wso2.carbon.billing.mgt.services;
    /**
     *  BillingDataAccessServiceSkeletonInterface java skeleton interface for the axisService
     */
    public interface BillingDataAccessServiceSkeletonInterface {
     
         
        /**
         * Auto generated method signature
         * 
                                    * @param getItemIdWithName
             * @throws BillingDataAccessServiceExceptionException : 
         */

        
                public org.wso2.carbon.billing.mgt.services.GetItemIdWithNameResponse getItemIdWithName
                (
                  org.wso2.carbon.billing.mgt.services.GetItemIdWithName getItemIdWithName
                 )
            throws BillingDataAccessServiceExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param addSubscription
             * @throws BillingDataAccessServiceExceptionException : 
         */

        
                public org.wso2.carbon.billing.mgt.services.AddSubscriptionResponse addSubscription
                (
                  org.wso2.carbon.billing.mgt.services.AddSubscription addSubscription
                 )
            throws BillingDataAccessServiceExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getCustomerWithName
             * @throws BillingDataAccessServiceExceptionException : 
         */

        
                public org.wso2.carbon.billing.mgt.services.GetCustomerWithNameResponse getCustomerWithName
                (
                  org.wso2.carbon.billing.mgt.services.GetCustomerWithName getCustomerWithName
                 )
            throws BillingDataAccessServiceExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getInactiveSubscriptionsOfCustomer
             * @throws BillingDataAccessServiceExceptionException : 
         */

        
                public org.wso2.carbon.billing.mgt.services.GetInactiveSubscriptionsOfCustomerResponse getInactiveSubscriptionsOfCustomer
                (
                  org.wso2.carbon.billing.mgt.services.GetInactiveSubscriptionsOfCustomer getInactiveSubscriptionsOfCustomer
                 )
            throws BillingDataAccessServiceExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param deactivateActiveSubscription
             * @throws BillingDataAccessServiceExceptionException : 
         */

        
                public org.wso2.carbon.billing.mgt.services.DeactivateActiveSubscriptionResponse deactivateActiveSubscription
                (
                  org.wso2.carbon.billing.mgt.services.DeactivateActiveSubscription deactivateActiveSubscription
                 )
            throws BillingDataAccessServiceExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param changeSubscription
             * @throws BillingDataAccessServiceExceptionException : 
         */

        
                public org.wso2.carbon.billing.mgt.services.ChangeSubscriptionResponse changeSubscription
                (
                  org.wso2.carbon.billing.mgt.services.ChangeSubscription changeSubscription
                 )
            throws BillingDataAccessServiceExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getActiveSubscriptionOfCustomer
             * @throws BillingDataAccessServiceExceptionException : 
         */

        
                public org.wso2.carbon.billing.mgt.services.GetActiveSubscriptionOfCustomerResponse getActiveSubscriptionOfCustomer
                (
                  org.wso2.carbon.billing.mgt.services.GetActiveSubscriptionOfCustomer getActiveSubscriptionOfCustomer
                 )
            throws BillingDataAccessServiceExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getSubscription
             * @throws BillingDataAccessServiceExceptionException : 
         */

        
                public org.wso2.carbon.billing.mgt.services.GetSubscriptionResponse getSubscription
                (
                  org.wso2.carbon.billing.mgt.services.GetSubscription getSubscription
                 )
            throws BillingDataAccessServiceExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param activateSubscription
             * @throws BillingDataAccessServiceExceptionException : 
         */

        
                public org.wso2.carbon.billing.mgt.services.ActivateSubscriptionResponse activateSubscription
                (
                  org.wso2.carbon.billing.mgt.services.ActivateSubscription activateSubscription
                 )
            throws BillingDataAccessServiceExceptionException;
        
         }
    
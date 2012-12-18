
/**
 * UpgradeServiceSkeletonInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */
    package org.wso2.carbon.upgrade.services;
    /**
     *  UpgradeServiceSkeletonInterface java skeleton interface for the axisService
     */
    public interface UpgradeServiceSkeletonInterface {
     
         
        /**
         * Auto generated method signature
         * 
                                    * @param getCurrentSubscription
             * @throws UpgradeServiceExceptionException : 
         */

        
                public org.wso2.carbon.upgrade.services.GetCurrentSubscriptionResponse getCurrentSubscription
                (
                  org.wso2.carbon.upgrade.services.GetCurrentSubscription getCurrentSubscription
                 )
            throws UpgradeServiceExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getPackageInfo
             * @throws UpgradeServiceExceptionException : 
         */

        
                public org.wso2.carbon.upgrade.services.GetPackageInfoResponse getPackageInfo
                (
                  org.wso2.carbon.upgrade.services.GetPackageInfo getPackageInfo
                 )
            throws UpgradeServiceExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param cancelSubscription
             * @throws UpgradeServiceExceptionException : 
         */

        
                public void cancelSubscription
                (
                  org.wso2.carbon.upgrade.services.CancelSubscription cancelSubscription
                 )
            throws UpgradeServiceExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param updateSubscription
             * @throws UpgradeServiceExceptionException : 
         */

        
                public void updateSubscription
                (
                  org.wso2.carbon.upgrade.services.UpdateSubscription updateSubscription
                 )
            throws UpgradeServiceExceptionException;
        
         }
    
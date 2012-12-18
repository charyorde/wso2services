
/**
 * UsageServiceSkeletonInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */
    package org.wso2.carbon.usage.services;
    /**
     *  UsageServiceSkeletonInterface java skeleton interface for the axisService
     */
    public interface UsageServiceSkeletonInterface {
     
         
        /**
         * Auto generated method signature
         * 
                                    * @param retrievePaginatedInstanceUsage
             * @throws UsageServiceExceptionException : 
         */

        
                public org.wso2.carbon.usage.services.RetrievePaginatedInstanceUsageResponse retrievePaginatedInstanceUsage
                (
                  org.wso2.carbon.usage.services.RetrievePaginatedInstanceUsage retrievePaginatedInstanceUsage
                 )
            throws UsageServiceExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param retrieveInstanceUsage
             * @throws UsageServiceExceptionException : 
         */

        
                public org.wso2.carbon.usage.services.RetrieveInstanceUsageResponse retrieveInstanceUsage
                (
                  org.wso2.carbon.usage.services.RetrieveInstanceUsage retrieveInstanceUsage
                 )
            throws UsageServiceExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param retrieveTenantUsages
             * @throws UsageServiceExceptionException : 
         */

        
                public org.wso2.carbon.usage.services.RetrieveTenantUsagesResponse retrieveTenantUsages
                (
                  org.wso2.carbon.usage.services.RetrieveTenantUsages retrieveTenantUsages
                 )
            throws UsageServiceExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getValidUsageEntry
         */

        
                public org.wso2.carbon.usage.services.GetValidUsageEntryResponse getValidUsageEntry
                (
                  org.wso2.carbon.usage.services.GetValidUsageEntry getValidUsageEntry
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param retrieveCurrentTenantUsage
             * @throws UsageServiceExceptionException : 
         */

        
                public org.wso2.carbon.usage.services.RetrieveCurrentTenantUsageResponse retrieveCurrentTenantUsage
                (
                  org.wso2.carbon.usage.services.RetrieveCurrentTenantUsage retrieveCurrentTenantUsage
                 )
            throws UsageServiceExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param retrieveTenantUsage
             * @throws UsageServiceExceptionException : 
         */

        
                public org.wso2.carbon.usage.services.RetrieveTenantUsageResponse retrieveTenantUsage
                (
                  org.wso2.carbon.usage.services.RetrieveTenantUsage retrieveTenantUsage
                 )
            throws UsageServiceExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param retrievePaginatedTenantUsages
             * @throws UsageServiceExceptionException : 
         */

        
                public org.wso2.carbon.usage.services.RetrievePaginatedTenantUsagesResponse retrievePaginatedTenantUsages
                (
                  org.wso2.carbon.usage.services.RetrievePaginatedTenantUsages retrievePaginatedTenantUsages
                 )
            throws UsageServiceExceptionException;
        
         }
    
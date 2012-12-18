
/**
 * CachingAdminServiceSkeletonInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */
    package org.wso2.carbon.caching.service;
    /**
     *  CachingAdminServiceSkeletonInterface java skeleton interface for the axisService
     */
    public interface CachingAdminServiceSkeletonInterface {
     
         
        /**
         * Auto generated method signature
         * 
                                    * @param isCachingEnabledForService
             * @throws CachingAdminServiceCachingComponentExceptionException : 
         */

        
                public org.wso2.carbon.caching.service.IsCachingEnabledForServiceResponse isCachingEnabledForService
                (
                  org.wso2.carbon.caching.service.IsCachingEnabledForService isCachingEnabledForService
                 )
            throws CachingAdminServiceCachingComponentExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param isCachingEnabledForOperation
             * @throws CachingAdminServiceCachingComponentExceptionException : 
         */

        
                public org.wso2.carbon.caching.service.IsCachingEnabledForOperationResponse isCachingEnabledForOperation
                (
                  org.wso2.carbon.caching.service.IsCachingEnabledForOperation isCachingEnabledForOperation
                 )
            throws CachingAdminServiceCachingComponentExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getCachingPolicyForOperation
             * @throws CachingAdminServiceCachingComponentExceptionException : 
         */

        
                public org.wso2.carbon.caching.service.GetCachingPolicyForOperationResponse getCachingPolicyForOperation
                (
                  org.wso2.carbon.caching.service.GetCachingPolicyForOperation getCachingPolicyForOperation
                 )
            throws CachingAdminServiceCachingComponentExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param engageCachingForOperation
             * @throws CachingAdminServiceCachingComponentExceptionException : 
         */

        
                public org.wso2.carbon.caching.service.EngageCachingForOperationResponse engageCachingForOperation
                (
                  org.wso2.carbon.caching.service.EngageCachingForOperation engageCachingForOperation
                 )
            throws CachingAdminServiceCachingComponentExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getGlobalCachingPolicy
             * @throws CachingAdminServiceCachingComponentExceptionException : 
         */

        
                public org.wso2.carbon.caching.service.GetGlobalCachingPolicyResponse getGlobalCachingPolicy
                (
                  org.wso2.carbon.caching.service.GetGlobalCachingPolicy getGlobalCachingPolicy
                 )
            throws CachingAdminServiceCachingComponentExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param disengageCachingForOperation
             * @throws CachingAdminServiceCachingComponentExceptionException : 
         */

        
                public org.wso2.carbon.caching.service.DisengageCachingForOperationResponse disengageCachingForOperation
                (
                  org.wso2.carbon.caching.service.DisengageCachingForOperation disengageCachingForOperation
                 )
            throws CachingAdminServiceCachingComponentExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param disengageCachingForService
             * @throws CachingAdminServiceCachingComponentExceptionException : 
         */

        
                public void disengageCachingForService
                (
                  org.wso2.carbon.caching.service.DisengageCachingForService disengageCachingForService
                 )
            throws CachingAdminServiceCachingComponentExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getCachingPolicyForService
             * @throws CachingAdminServiceCachingComponentExceptionException : 
         */

        
                public org.wso2.carbon.caching.service.GetCachingPolicyForServiceResponse getCachingPolicyForService
                (
                  org.wso2.carbon.caching.service.GetCachingPolicyForService getCachingPolicyForService
                 )
            throws CachingAdminServiceCachingComponentExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param disengageGlobalCaching
             * @throws CachingAdminServiceCachingComponentExceptionException : 
         */

        
                public void disengageGlobalCaching
                (
                  org.wso2.carbon.caching.service.DisengageGlobalCaching disengageGlobalCaching
                 )
            throws CachingAdminServiceCachingComponentExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param globallyEngageCaching
             * @throws CachingAdminServiceCachingComponentExceptionException : 
         */

        
                public void globallyEngageCaching
                (
                  org.wso2.carbon.caching.service.GloballyEngageCaching globallyEngageCaching
                 )
            throws CachingAdminServiceCachingComponentExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param isCachingGloballyEnabled
             * @throws CachingAdminServiceCachingComponentExceptionException : 
         */

        
                public org.wso2.carbon.caching.service.IsCachingGloballyEnabledResponse isCachingGloballyEnabled
                (
                  org.wso2.carbon.caching.service.IsCachingGloballyEnabled isCachingGloballyEnabled
                 )
            throws CachingAdminServiceCachingComponentExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param engageCachingForService
             * @throws CachingAdminServiceCachingComponentExceptionException : 
         */

        
                public void engageCachingForService
                (
                  org.wso2.carbon.caching.service.EngageCachingForService engageCachingForService
                 )
            throws CachingAdminServiceCachingComponentExceptionException;
        
         }
    
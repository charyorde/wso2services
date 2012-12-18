
/**
 * ThrottleAdminServiceSkeletonInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */
    package org.wso2.carbon.throttle.service;
    /**
     *  ThrottleAdminServiceSkeletonInterface java skeleton interface for the axisService
     */
    public interface ThrottleAdminServiceSkeletonInterface {
     
         
        /**
         * Auto generated method signature
         * 
                                    * @param disengageGlobalThrottling
             * @throws ThrottleAdminServiceThrottleComponentExceptionException : 
         */

        
                public void disengageGlobalThrottling
                (
                  org.wso2.carbon.throttle.service.DisengageGlobalThrottling disengageGlobalThrottling
                 )
            throws ThrottleAdminServiceThrottleComponentExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getOperationPolicyConfigs
             * @throws ThrottleAdminServiceThrottleComponentExceptionException : 
         */

        
                public org.wso2.carbon.throttle.service.GetOperationPolicyConfigsResponse getOperationPolicyConfigs
                (
                  org.wso2.carbon.throttle.service.GetOperationPolicyConfigs getOperationPolicyConfigs
                 )
            throws ThrottleAdminServiceThrottleComponentExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param enableThrottling
             * @throws ThrottleAdminServiceThrottleComponentExceptionException : 
         */

        
                public void enableThrottling
                (
                  org.wso2.carbon.throttle.service.EnableThrottling enableThrottling
                 )
            throws ThrottleAdminServiceThrottleComponentExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param throttlePolicyToString
             * @throws ThrottleAdminServiceThrottleComponentExceptionException : 
         */

        
                public org.wso2.carbon.throttle.service.ThrottlePolicyToStringResponse throttlePolicyToString
                (
                  org.wso2.carbon.throttle.service.ThrottlePolicyToString throttlePolicyToString
                 )
            throws ThrottleAdminServiceThrottleComponentExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getPolicyConfigs
             * @throws ThrottleAdminServiceThrottleComponentExceptionException : 
         */

        
                public org.wso2.carbon.throttle.service.GetPolicyConfigsResponse getPolicyConfigs
                (
                  org.wso2.carbon.throttle.service.GetPolicyConfigs getPolicyConfigs
                 )
            throws ThrottleAdminServiceThrottleComponentExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getGlobalPolicyConfigs
             * @throws ThrottleAdminServiceThrottleComponentExceptionException : 
         */

        
                public org.wso2.carbon.throttle.service.GetGlobalPolicyConfigsResponse getGlobalPolicyConfigs
                (
                  org.wso2.carbon.throttle.service.GetGlobalPolicyConfigs getGlobalPolicyConfigs
                 )
            throws ThrottleAdminServiceThrottleComponentExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param disableThrottling
             * @throws ThrottleAdminServiceThrottleComponentExceptionException : 
         */

        
                public void disableThrottling
                (
                  org.wso2.carbon.throttle.service.DisableThrottling disableThrottling
                 )
            throws ThrottleAdminServiceThrottleComponentExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param engageThrottlingForOperation
             * @throws ThrottleAdminServiceThrottleComponentExceptionException : 
         */

        
                public org.wso2.carbon.throttle.service.EngageThrottlingForOperationResponse engageThrottlingForOperation
                (
                  org.wso2.carbon.throttle.service.EngageThrottlingForOperation engageThrottlingForOperation
                 )
            throws ThrottleAdminServiceThrottleComponentExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param globallyEngageThrottling
             * @throws ThrottleAdminServiceThrottleComponentExceptionException : 
         */

        
                public void globallyEngageThrottling
                (
                  org.wso2.carbon.throttle.service.GloballyEngageThrottling globallyEngageThrottling
                 )
            throws ThrottleAdminServiceThrottleComponentExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param toThrottlePolicy
             * @throws ThrottleAdminServiceThrottleComponentExceptionException : 
         */

        
                public org.wso2.carbon.throttle.service.ToThrottlePolicyResponse toThrottlePolicy
                (
                  org.wso2.carbon.throttle.service.ToThrottlePolicy toThrottlePolicy
                 )
            throws ThrottleAdminServiceThrottleComponentExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param disengageThrottlingForOperation
             * @throws ThrottleAdminServiceThrottleComponentExceptionException : 
         */

        
                public org.wso2.carbon.throttle.service.DisengageThrottlingForOperationResponse disengageThrottlingForOperation
                (
                  org.wso2.carbon.throttle.service.DisengageThrottlingForOperation disengageThrottlingForOperation
                 )
            throws ThrottleAdminServiceThrottleComponentExceptionException;
        
         }
    
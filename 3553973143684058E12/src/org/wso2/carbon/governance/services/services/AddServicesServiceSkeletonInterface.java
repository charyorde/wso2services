
/**
 * AddServicesServiceSkeletonInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */
    package org.wso2.carbon.governance.services.services;
    /**
     *  AddServicesServiceSkeletonInterface java skeleton interface for the axisService
     */
    public interface AddServicesServiceSkeletonInterface {
     
         
        /**
         * Auto generated method signature
         * 
                                    * @param getServicePath
             * @throws AddServicesServiceRegistryExceptionException : 
         */

        
                public org.wso2.carbon.governance.services.services.GetServicePathResponse getServicePath
                (
                  org.wso2.carbon.governance.services.services.GetServicePath getServicePath
                 )
            throws AddServicesServiceRegistryExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param saveServiceConfiguration
             * @throws AddServicesServiceRegistryExceptionException : 
         */

        
                public org.wso2.carbon.governance.services.services.SaveServiceConfigurationResponse saveServiceConfiguration
                (
                  org.wso2.carbon.governance.services.services.SaveServiceConfiguration saveServiceConfiguration
                 )
            throws AddServicesServiceRegistryExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getServiceConfiguration
             * @throws AddServicesServiceRegistryExceptionException : 
         */

        
                public org.wso2.carbon.governance.services.services.GetServiceConfigurationResponse getServiceConfiguration
                (
                  org.wso2.carbon.governance.services.services.GetServiceConfiguration getServiceConfiguration
                 )
            throws AddServicesServiceRegistryExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param addService
             * @throws AddServicesServiceRegistryExceptionException : 
         */

        
                public org.wso2.carbon.governance.services.services.AddServiceResponse addService
                (
                  org.wso2.carbon.governance.services.services.AddService addService
                 )
            throws AddServicesServiceRegistryExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param canChange
             * @throws AddServicesServiceExceptionException : 
         */

        
                public org.wso2.carbon.governance.services.services.CanChangeResponse canChange
                (
                  org.wso2.carbon.governance.services.services.CanChange canChange
                 )
            throws AddServicesServiceExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getAvailableAspects
             * @throws AddServicesServiceExceptionException : 
         */

        
                public org.wso2.carbon.governance.services.services.GetAvailableAspectsResponse getAvailableAspects
                (
                  org.wso2.carbon.governance.services.services.GetAvailableAspects getAvailableAspects
                 )
            throws AddServicesServiceExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param editService
             * @throws AddServicesServiceRegistryExceptionException : 
         */

        
                public org.wso2.carbon.governance.services.services.EditServiceResponse editService
                (
                  org.wso2.carbon.governance.services.services.EditService editService
                 )
            throws AddServicesServiceRegistryExceptionException;
        
         }
    
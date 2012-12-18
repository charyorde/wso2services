
/**
 * ServiceStatPublisherAdminSkeletonInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */
    package org.wso2.carbon.bam.data.publisher.servicestats.services;
    /**
     *  ServiceStatPublisherAdminSkeletonInterface java skeleton interface for the axisService
     */
    public interface ServiceStatPublisherAdminSkeletonInterface {
     
         
        /**
         * Auto generated method signature
         * 
                                    * @param getEventingConfigData
         */

        
                public axis2.apache.org.xsd.GetEventingConfigDataResponse getEventingConfigData
                (
                  axis2.apache.org.xsd.GetEventingConfigData getEventingConfigData
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param configureEventing
             * @throws ServiceStatPublisherAdminException : 
         */

        
                public void configureEventing
                (
                  axis2.apache.org.xsd.ConfigureEventing configureEventing
                 )
            throws ServiceStatPublisherAdminException;
        
         }
    
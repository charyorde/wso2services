
/**
 * MeteringQueryDSSkeletonInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */
    package org.wso2.ws.dataservice;
    /**
     *  MeteringQueryDSSkeletonInterface java skeleton interface for the axisService
     */
    public interface MeteringQueryDSSkeletonInterface {
     
         
        /**
         * Auto generated method signature
         * 
                                    * @param getRegistryBandwidthUsageStats
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.RegBandwidthStatsE getRegistryBandwidthUsageStats
                (
                  org.wso2.carbon.bam.GetRegistryBandwidthUsageStats getRegistryBandwidthUsageStats
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getHourlyServiceRequestStats
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.ServiceRequestStatsE getHourlyServiceRequestStats
                (
                  org.wso2.carbon.bam.GetHourlyServiceRequestStats getHourlyServiceRequestStats
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getDailyRegistryBandwidthUsageStats
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.RegBandwidthStatsE getDailyRegistryBandwidthUsageStats
                (
                  org.wso2.carbon.bam.GetDailyRegistryBandwidthUsageStats getDailyRegistryBandwidthUsageStats
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getHourlyBandwidthStats
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.BandwidthStatsE getHourlyBandwidthStats
                (
                  org.wso2.carbon.bam.GetHourlyBandwidthStats getHourlyBandwidthStats
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getInstanceUsageStats
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.InstanceUsageStatsE getInstanceUsageStats
                (
                  org.wso2.carbon.bam.GetInstanceUsageStats getInstanceUsageStats
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getBandwidthStats
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.BandwidthStatsE getBandwidthStats
                (
                  org.wso2.carbon.bam.GetBandwidthStats getBandwidthStats
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getServiceRequestStats
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.ServiceRequestStatsE getServiceRequestStats
                (
                  org.wso2.carbon.bam.GetServiceRequestStats getServiceRequestStats
                 )
            throws DataServiceFaultException;
        
         }
    
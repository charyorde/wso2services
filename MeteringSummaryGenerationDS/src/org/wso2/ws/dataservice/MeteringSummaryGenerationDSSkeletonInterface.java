
/**
 * MeteringSummaryGenerationDSSkeletonInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */
    package org.wso2.ws.dataservice;
    /**
     *  MeteringSummaryGenerationDSSkeletonInterface java skeleton interface for the axisService
     */
    public interface MeteringSummaryGenerationDSSkeletonInterface {
     
         
        /**
         * Auto generated method signature
         * 
                                    * @param addBandwidthStatDailySummary
             * @throws DataServiceFaultException : 
         */

        
                public void addBandwidthStatDailySummary
                (
                  org.wso2.ws.dataservice.AddBandwidthStatDailySummary addBandwidthStatDailySummary
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getDataForYearlySummary
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.BandwidthStatValuesE getDataForYearlySummary
                (
                  org.wso2.carbon.bam.GetDataForYearlySummary getDataForYearlySummary
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getRegistryHistoryBandwidthUsage
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.BandwidthUsagesE getRegistryHistoryBandwidthUsage
                (
                  org.wso2.carbon.bam.GetRegistryHistoryBandwidthUsage getRegistryHistoryBandwidthUsage
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param addBandwidthStatHourlySummary
             * @throws DataServiceFaultException : 
         */

        
                public void addBandwidthStatHourlySummary
                (
                  org.wso2.ws.dataservice.AddBandwidthStatHourlySummary addBandwidthStatHourlySummary
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getRegistryBandwidthUsage
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.BandwidthUsagesE getRegistryBandwidthUsage
                (
                  org.wso2.carbon.bam.GetRegistryBandwidthUsage getRegistryBandwidthUsage
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getDataForMonthlySummary
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.BandwidthStatValuesE getDataForMonthlySummary
                (
                  org.wso2.carbon.bam.GetDataForMonthlySummary getDataForMonthlySummary
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param addBandwidthStatYearlySummary
             * @throws DataServiceFaultException : 
         */

        
                public void addBandwidthStatYearlySummary
                (
                  org.wso2.ws.dataservice.AddBandwidthStatYearlySummary addBandwidthStatYearlySummary
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getMinimumPeriodId
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.SummaryTimesE getMinimumPeriodId
                (
                  org.wso2.carbon.bam.GetMinimumPeriodId getMinimumPeriodId
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param addBandwidthStatMonthlySummary
             * @throws DataServiceFaultException : 
         */

        
                public void addBandwidthStatMonthlySummary
                (
                  org.wso2.ws.dataservice.AddBandwidthStatMonthlySummary addBandwidthStatMonthlySummary
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param addRegistryBandwidthUsageDailySummary
             * @throws DataServiceFaultException : 
         */

        
                public void addRegistryBandwidthUsageDailySummary
                (
                  org.wso2.ws.dataservice.AddRegistryBandwidthUsageDailySummary addRegistryBandwidthUsageDailySummary
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getLatestMonthlyBandwidthSummaryPeriodId
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.SummaryTimesE getLatestMonthlyBandwidthSummaryPeriodId
                (
                  org.wso2.carbon.bam.GetLatestMonthlyBandwidthSummaryPeriodId getLatestMonthlyBandwidthSummaryPeriodId
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param deleteServerUserData
             * @throws DataServiceFaultException : 
         */

        
                public void deleteServerUserData
                (
                  org.wso2.ws.dataservice.DeleteServerUserData deleteServerUserData
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param addRegistryBandwidthUsageMonthlySummary
             * @throws DataServiceFaultException : 
         */

        
                public void addRegistryBandwidthUsageMonthlySummary
                (
                  org.wso2.ws.dataservice.AddRegistryBandwidthUsageMonthlySummary addRegistryBandwidthUsageMonthlySummary
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param addBandwidthStatQuarterlySummary
             * @throws DataServiceFaultException : 
         */

        
                public void addBandwidthStatQuarterlySummary
                (
                  org.wso2.ws.dataservice.AddBandwidthStatQuarterlySummary addBandwidthStatQuarterlySummary
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getRegistryBandwidthUsageForMonthlySummary
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.BandwidthUsageValuesE getRegistryBandwidthUsageForMonthlySummary
                (
                  org.wso2.carbon.bam.GetRegistryBandwidthUsageForMonthlySummary getRegistryBandwidthUsageForMonthlySummary
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getLatestHourlyBandwidthSummaryPeriodId
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.SummaryTimesE getLatestHourlyBandwidthSummaryPeriodId
                (
                  org.wso2.carbon.bam.GetLatestHourlyBandwidthSummaryPeriodId getLatestHourlyBandwidthSummaryPeriodId
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getDataForHourlySummary
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.BandwidthHourlyStatValuesE getDataForHourlySummary
                (
                  org.wso2.carbon.bam.GetDataForHourlySummary getDataForHourlySummary
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getLatestMonthlyRegistryBandwidthSummaryPeriodId
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.SummaryTimesE getLatestMonthlyRegistryBandwidthSummaryPeriodId
                (
                  org.wso2.carbon.bam.GetLatestMonthlyRegistryBandwidthSummaryPeriodId getLatestMonthlyRegistryBandwidthSummaryPeriodId
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getDataForQuarterlySummary
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.BandwidthStatValuesE getDataForQuarterlySummary
                (
                  org.wso2.carbon.bam.GetDataForQuarterlySummary getDataForQuarterlySummary
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getLatestDailyRegistryBandwidthSummaryPeriodId
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.SummaryTimesE getLatestDailyRegistryBandwidthSummaryPeriodId
                (
                  org.wso2.carbon.bam.GetLatestDailyRegistryBandwidthSummaryPeriodId getLatestDailyRegistryBandwidthSummaryPeriodId
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getDataForDailySummary
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.BandwidthStatValuesE getDataForDailySummary
                (
                  org.wso2.carbon.bam.GetDataForDailySummary getDataForDailySummary
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getLatestYearlyBandwidthSummaryPeriodId
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.SummaryTimesE getLatestYearlyBandwidthSummaryPeriodId
                (
                  org.wso2.carbon.bam.GetLatestYearlyBandwidthSummaryPeriodId getLatestYearlyBandwidthSummaryPeriodId
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getLatestQuarterlyBandwidthSummaryPeriodId
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.SummaryTimesE getLatestQuarterlyBandwidthSummaryPeriodId
                (
                  org.wso2.carbon.bam.GetLatestQuarterlyBandwidthSummaryPeriodId getLatestQuarterlyBandwidthSummaryPeriodId
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getLatestDailyBandwidthSummaryPeriodId
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.SummaryTimesE getLatestDailyBandwidthSummaryPeriodId
                (
                  org.wso2.carbon.bam.GetLatestDailyBandwidthSummaryPeriodId getLatestDailyBandwidthSummaryPeriodId
                 )
            throws DataServiceFaultException;
        
         }
    
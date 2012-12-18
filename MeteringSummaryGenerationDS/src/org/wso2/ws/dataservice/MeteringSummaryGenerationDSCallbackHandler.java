
/**
 * MeteringSummaryGenerationDSCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */

    package org.wso2.ws.dataservice;

    /**
     *  MeteringSummaryGenerationDSCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class MeteringSummaryGenerationDSCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public MeteringSummaryGenerationDSCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public MeteringSummaryGenerationDSCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
               // No methods generated for meps other than in-out
                
           /**
            * auto generated Axis2 call back method for getDataForYearlySummary method
            * override this method for handling normal response from getDataForYearlySummary operation
            */
           public void receiveResultgetDataForYearlySummary(
                    org.wso2.carbon.bam.BandwidthStatValuesE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getDataForYearlySummary operation
           */
            public void receiveErrorgetDataForYearlySummary(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getRegistryHistoryBandwidthUsage method
            * override this method for handling normal response from getRegistryHistoryBandwidthUsage operation
            */
           public void receiveResultgetRegistryHistoryBandwidthUsage(
                    org.wso2.carbon.bam.BandwidthUsagesE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getRegistryHistoryBandwidthUsage operation
           */
            public void receiveErrorgetRegistryHistoryBandwidthUsage(java.lang.Exception e) {
            }
                
               // No methods generated for meps other than in-out
                
           /**
            * auto generated Axis2 call back method for getRegistryBandwidthUsage method
            * override this method for handling normal response from getRegistryBandwidthUsage operation
            */
           public void receiveResultgetRegistryBandwidthUsage(
                    org.wso2.carbon.bam.BandwidthUsagesE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getRegistryBandwidthUsage operation
           */
            public void receiveErrorgetRegistryBandwidthUsage(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getDataForMonthlySummary method
            * override this method for handling normal response from getDataForMonthlySummary operation
            */
           public void receiveResultgetDataForMonthlySummary(
                    org.wso2.carbon.bam.BandwidthStatValuesE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getDataForMonthlySummary operation
           */
            public void receiveErrorgetDataForMonthlySummary(java.lang.Exception e) {
            }
                
               // No methods generated for meps other than in-out
                
           /**
            * auto generated Axis2 call back method for getMinimumPeriodId method
            * override this method for handling normal response from getMinimumPeriodId operation
            */
           public void receiveResultgetMinimumPeriodId(
                    org.wso2.carbon.bam.SummaryTimesE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getMinimumPeriodId operation
           */
            public void receiveErrorgetMinimumPeriodId(java.lang.Exception e) {
            }
                
               // No methods generated for meps other than in-out
                
               // No methods generated for meps other than in-out
                
           /**
            * auto generated Axis2 call back method for getLatestMonthlyBandwidthSummaryPeriodId method
            * override this method for handling normal response from getLatestMonthlyBandwidthSummaryPeriodId operation
            */
           public void receiveResultgetLatestMonthlyBandwidthSummaryPeriodId(
                    org.wso2.carbon.bam.SummaryTimesE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getLatestMonthlyBandwidthSummaryPeriodId operation
           */
            public void receiveErrorgetLatestMonthlyBandwidthSummaryPeriodId(java.lang.Exception e) {
            }
                
               // No methods generated for meps other than in-out
                
               // No methods generated for meps other than in-out
                
               // No methods generated for meps other than in-out
                
           /**
            * auto generated Axis2 call back method for getRegistryBandwidthUsageForMonthlySummary method
            * override this method for handling normal response from getRegistryBandwidthUsageForMonthlySummary operation
            */
           public void receiveResultgetRegistryBandwidthUsageForMonthlySummary(
                    org.wso2.carbon.bam.BandwidthUsageValuesE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getRegistryBandwidthUsageForMonthlySummary operation
           */
            public void receiveErrorgetRegistryBandwidthUsageForMonthlySummary(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getLatestHourlyBandwidthSummaryPeriodId method
            * override this method for handling normal response from getLatestHourlyBandwidthSummaryPeriodId operation
            */
           public void receiveResultgetLatestHourlyBandwidthSummaryPeriodId(
                    org.wso2.carbon.bam.SummaryTimesE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getLatestHourlyBandwidthSummaryPeriodId operation
           */
            public void receiveErrorgetLatestHourlyBandwidthSummaryPeriodId(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getDataForHourlySummary method
            * override this method for handling normal response from getDataForHourlySummary operation
            */
           public void receiveResultgetDataForHourlySummary(
                    org.wso2.carbon.bam.BandwidthHourlyStatValuesE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getDataForHourlySummary operation
           */
            public void receiveErrorgetDataForHourlySummary(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getLatestMonthlyRegistryBandwidthSummaryPeriodId method
            * override this method for handling normal response from getLatestMonthlyRegistryBandwidthSummaryPeriodId operation
            */
           public void receiveResultgetLatestMonthlyRegistryBandwidthSummaryPeriodId(
                    org.wso2.carbon.bam.SummaryTimesE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getLatestMonthlyRegistryBandwidthSummaryPeriodId operation
           */
            public void receiveErrorgetLatestMonthlyRegistryBandwidthSummaryPeriodId(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getDataForQuarterlySummary method
            * override this method for handling normal response from getDataForQuarterlySummary operation
            */
           public void receiveResultgetDataForQuarterlySummary(
                    org.wso2.carbon.bam.BandwidthStatValuesE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getDataForQuarterlySummary operation
           */
            public void receiveErrorgetDataForQuarterlySummary(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getLatestDailyRegistryBandwidthSummaryPeriodId method
            * override this method for handling normal response from getLatestDailyRegistryBandwidthSummaryPeriodId operation
            */
           public void receiveResultgetLatestDailyRegistryBandwidthSummaryPeriodId(
                    org.wso2.carbon.bam.SummaryTimesE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getLatestDailyRegistryBandwidthSummaryPeriodId operation
           */
            public void receiveErrorgetLatestDailyRegistryBandwidthSummaryPeriodId(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getDataForDailySummary method
            * override this method for handling normal response from getDataForDailySummary operation
            */
           public void receiveResultgetDataForDailySummary(
                    org.wso2.carbon.bam.BandwidthStatValuesE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getDataForDailySummary operation
           */
            public void receiveErrorgetDataForDailySummary(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getLatestYearlyBandwidthSummaryPeriodId method
            * override this method for handling normal response from getLatestYearlyBandwidthSummaryPeriodId operation
            */
           public void receiveResultgetLatestYearlyBandwidthSummaryPeriodId(
                    org.wso2.carbon.bam.SummaryTimesE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getLatestYearlyBandwidthSummaryPeriodId operation
           */
            public void receiveErrorgetLatestYearlyBandwidthSummaryPeriodId(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getLatestQuarterlyBandwidthSummaryPeriodId method
            * override this method for handling normal response from getLatestQuarterlyBandwidthSummaryPeriodId operation
            */
           public void receiveResultgetLatestQuarterlyBandwidthSummaryPeriodId(
                    org.wso2.carbon.bam.SummaryTimesE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getLatestQuarterlyBandwidthSummaryPeriodId operation
           */
            public void receiveErrorgetLatestQuarterlyBandwidthSummaryPeriodId(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getLatestDailyBandwidthSummaryPeriodId method
            * override this method for handling normal response from getLatestDailyBandwidthSummaryPeriodId operation
            */
           public void receiveResultgetLatestDailyBandwidthSummaryPeriodId(
                    org.wso2.carbon.bam.SummaryTimesE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getLatestDailyBandwidthSummaryPeriodId operation
           */
            public void receiveErrorgetLatestDailyBandwidthSummaryPeriodId(java.lang.Exception e) {
            }
                


    }
    
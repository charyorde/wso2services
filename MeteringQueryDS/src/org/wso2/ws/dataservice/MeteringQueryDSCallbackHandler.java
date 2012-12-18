
/**
 * MeteringQueryDSCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */

    package org.wso2.ws.dataservice;

    /**
     *  MeteringQueryDSCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class MeteringQueryDSCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public MeteringQueryDSCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public MeteringQueryDSCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for getRegistryBandwidthUsageStats method
            * override this method for handling normal response from getRegistryBandwidthUsageStats operation
            */
           public void receiveResultgetRegistryBandwidthUsageStats(
                    org.wso2.carbon.bam.RegBandwidthStatsE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getRegistryBandwidthUsageStats operation
           */
            public void receiveErrorgetRegistryBandwidthUsageStats(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getHourlyServiceRequestStats method
            * override this method for handling normal response from getHourlyServiceRequestStats operation
            */
           public void receiveResultgetHourlyServiceRequestStats(
                    org.wso2.carbon.bam.ServiceRequestStatsE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getHourlyServiceRequestStats operation
           */
            public void receiveErrorgetHourlyServiceRequestStats(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getDailyRegistryBandwidthUsageStats method
            * override this method for handling normal response from getDailyRegistryBandwidthUsageStats operation
            */
           public void receiveResultgetDailyRegistryBandwidthUsageStats(
                    org.wso2.carbon.bam.RegBandwidthStatsE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getDailyRegistryBandwidthUsageStats operation
           */
            public void receiveErrorgetDailyRegistryBandwidthUsageStats(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getHourlyBandwidthStats method
            * override this method for handling normal response from getHourlyBandwidthStats operation
            */
           public void receiveResultgetHourlyBandwidthStats(
                    org.wso2.carbon.bam.BandwidthStatsE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getHourlyBandwidthStats operation
           */
            public void receiveErrorgetHourlyBandwidthStats(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getInstanceUsageStats method
            * override this method for handling normal response from getInstanceUsageStats operation
            */
           public void receiveResultgetInstanceUsageStats(
                    org.wso2.carbon.bam.InstanceUsageStatsE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getInstanceUsageStats operation
           */
            public void receiveErrorgetInstanceUsageStats(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getBandwidthStats method
            * override this method for handling normal response from getBandwidthStats operation
            */
           public void receiveResultgetBandwidthStats(
                    org.wso2.carbon.bam.BandwidthStatsE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getBandwidthStats operation
           */
            public void receiveErrorgetBandwidthStats(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getServiceRequestStats method
            * override this method for handling normal response from getServiceRequestStats operation
            */
           public void receiveResultgetServiceRequestStats(
                    org.wso2.carbon.bam.ServiceRequestStatsE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getServiceRequestStats operation
           */
            public void receiveErrorgetServiceRequestStats(java.lang.Exception e) {
            }
                


    }
    

/**
 * UsageServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */

    package org.wso2.carbon.usage.services;

    /**
     *  UsageServiceCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class UsageServiceCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public UsageServiceCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public UsageServiceCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for retrievePaginatedInstanceUsage method
            * override this method for handling normal response from retrievePaginatedInstanceUsage operation
            */
           public void receiveResultretrievePaginatedInstanceUsage(
                    org.wso2.carbon.usage.services.RetrievePaginatedInstanceUsageResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from retrievePaginatedInstanceUsage operation
           */
            public void receiveErrorretrievePaginatedInstanceUsage(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for retrieveInstanceUsage method
            * override this method for handling normal response from retrieveInstanceUsage operation
            */
           public void receiveResultretrieveInstanceUsage(
                    org.wso2.carbon.usage.services.RetrieveInstanceUsageResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from retrieveInstanceUsage operation
           */
            public void receiveErrorretrieveInstanceUsage(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for retrieveTenantUsages method
            * override this method for handling normal response from retrieveTenantUsages operation
            */
           public void receiveResultretrieveTenantUsages(
                    org.wso2.carbon.usage.services.RetrieveTenantUsagesResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from retrieveTenantUsages operation
           */
            public void receiveErrorretrieveTenantUsages(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getValidUsageEntry method
            * override this method for handling normal response from getValidUsageEntry operation
            */
           public void receiveResultgetValidUsageEntry(
                    org.wso2.carbon.usage.services.GetValidUsageEntryResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getValidUsageEntry operation
           */
            public void receiveErrorgetValidUsageEntry(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for retrieveCurrentTenantUsage method
            * override this method for handling normal response from retrieveCurrentTenantUsage operation
            */
           public void receiveResultretrieveCurrentTenantUsage(
                    org.wso2.carbon.usage.services.RetrieveCurrentTenantUsageResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from retrieveCurrentTenantUsage operation
           */
            public void receiveErrorretrieveCurrentTenantUsage(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for retrieveTenantUsage method
            * override this method for handling normal response from retrieveTenantUsage operation
            */
           public void receiveResultretrieveTenantUsage(
                    org.wso2.carbon.usage.services.RetrieveTenantUsageResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from retrieveTenantUsage operation
           */
            public void receiveErrorretrieveTenantUsage(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for retrievePaginatedTenantUsages method
            * override this method for handling normal response from retrievePaginatedTenantUsages operation
            */
           public void receiveResultretrievePaginatedTenantUsages(
                    org.wso2.carbon.usage.services.RetrievePaginatedTenantUsagesResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from retrievePaginatedTenantUsages operation
           */
            public void receiveErrorretrievePaginatedTenantUsages(java.lang.Exception e) {
            }
                


    }
    
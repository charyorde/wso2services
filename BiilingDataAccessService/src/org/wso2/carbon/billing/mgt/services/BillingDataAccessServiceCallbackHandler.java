
/**
 * BillingDataAccessServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */

    package org.wso2.carbon.billing.mgt.services;

    /**
     *  BillingDataAccessServiceCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class BillingDataAccessServiceCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public BillingDataAccessServiceCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public BillingDataAccessServiceCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for getItemIdWithName method
            * override this method for handling normal response from getItemIdWithName operation
            */
           public void receiveResultgetItemIdWithName(
                    org.wso2.carbon.billing.mgt.services.GetItemIdWithNameResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getItemIdWithName operation
           */
            public void receiveErrorgetItemIdWithName(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for addSubscription method
            * override this method for handling normal response from addSubscription operation
            */
           public void receiveResultaddSubscription(
                    org.wso2.carbon.billing.mgt.services.AddSubscriptionResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from addSubscription operation
           */
            public void receiveErroraddSubscription(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getCustomerWithName method
            * override this method for handling normal response from getCustomerWithName operation
            */
           public void receiveResultgetCustomerWithName(
                    org.wso2.carbon.billing.mgt.services.GetCustomerWithNameResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getCustomerWithName operation
           */
            public void receiveErrorgetCustomerWithName(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getInactiveSubscriptionsOfCustomer method
            * override this method for handling normal response from getInactiveSubscriptionsOfCustomer operation
            */
           public void receiveResultgetInactiveSubscriptionsOfCustomer(
                    org.wso2.carbon.billing.mgt.services.GetInactiveSubscriptionsOfCustomerResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getInactiveSubscriptionsOfCustomer operation
           */
            public void receiveErrorgetInactiveSubscriptionsOfCustomer(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for deactivateActiveSubscription method
            * override this method for handling normal response from deactivateActiveSubscription operation
            */
           public void receiveResultdeactivateActiveSubscription(
                    org.wso2.carbon.billing.mgt.services.DeactivateActiveSubscriptionResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from deactivateActiveSubscription operation
           */
            public void receiveErrordeactivateActiveSubscription(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for changeSubscription method
            * override this method for handling normal response from changeSubscription operation
            */
           public void receiveResultchangeSubscription(
                    org.wso2.carbon.billing.mgt.services.ChangeSubscriptionResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from changeSubscription operation
           */
            public void receiveErrorchangeSubscription(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getActiveSubscriptionOfCustomer method
            * override this method for handling normal response from getActiveSubscriptionOfCustomer operation
            */
           public void receiveResultgetActiveSubscriptionOfCustomer(
                    org.wso2.carbon.billing.mgt.services.GetActiveSubscriptionOfCustomerResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getActiveSubscriptionOfCustomer operation
           */
            public void receiveErrorgetActiveSubscriptionOfCustomer(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getSubscription method
            * override this method for handling normal response from getSubscription operation
            */
           public void receiveResultgetSubscription(
                    org.wso2.carbon.billing.mgt.services.GetSubscriptionResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getSubscription operation
           */
            public void receiveErrorgetSubscription(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for activateSubscription method
            * override this method for handling normal response from activateSubscription operation
            */
           public void receiveResultactivateSubscription(
                    org.wso2.carbon.billing.mgt.services.ActivateSubscriptionResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from activateSubscription operation
           */
            public void receiveErroractivateSubscription(java.lang.Exception e) {
            }
                


    }
    
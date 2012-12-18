
/**
 * MultitenancyBillingServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */

    package org.wso2.carbon.billing.mgt.services;

    /**
     *  MultitenancyBillingServiceCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class MultitenancyBillingServiceCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public MultitenancyBillingServiceCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public MultitenancyBillingServiceCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for getOutstandingBalance method
            * override this method for handling normal response from getOutstandingBalance operation
            */
           public void receiveResultgetOutstandingBalance(
                    org.wso2.carbon.billing.mgt.services.GetOutstandingBalanceResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getOutstandingBalance operation
           */
            public void receiveErrorgetOutstandingBalance(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getCurrentInvoice method
            * override this method for handling normal response from getCurrentInvoice operation
            */
           public void receiveResultgetCurrentInvoice(
                    org.wso2.carbon.billing.mgt.services.GetCurrentInvoiceResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getCurrentInvoice operation
           */
            public void receiveErrorgetCurrentInvoice(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getPastInvoice method
            * override this method for handling normal response from getPastInvoice operation
            */
           public void receiveResultgetPastInvoice(
                    org.wso2.carbon.billing.mgt.services.GetPastInvoiceResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getPastInvoice operation
           */
            public void receiveErrorgetPastInvoice(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for addPayment method
            * override this method for handling normal response from addPayment operation
            */
           public void receiveResultaddPayment(
                    org.wso2.carbon.billing.mgt.services.AddPaymentResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from addPayment operation
           */
            public void receiveErroraddPayment(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getAvailableBillingPeriods method
            * override this method for handling normal response from getAvailableBillingPeriods operation
            */
           public void receiveResultgetAvailableBillingPeriods(
                    org.wso2.carbon.billing.mgt.services.GetAvailableBillingPeriodsResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getAvailableBillingPeriods operation
           */
            public void receiveErrorgetAvailableBillingPeriods(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getPaginatedBalances method
            * override this method for handling normal response from getPaginatedBalances operation
            */
           public void receiveResultgetPaginatedBalances(
                    org.wso2.carbon.billing.mgt.services.GetPaginatedBalancesResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getPaginatedBalances operation
           */
            public void receiveErrorgetPaginatedBalances(java.lang.Exception e) {
            }
                


    }
    
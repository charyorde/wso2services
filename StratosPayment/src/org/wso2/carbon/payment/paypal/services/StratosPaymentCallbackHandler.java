
/**
 * StratosPaymentCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */

    package org.wso2.carbon.payment.paypal.services;

    /**
     *  StratosPaymentCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class StratosPaymentCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public StratosPaymentCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public StratosPaymentCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for doExpressCheckout method
            * override this method for handling normal response from doExpressCheckout operation
            */
           public void receiveResultdoExpressCheckout(
                    org.wso2.carbon.payment.paypal.services.DoExpressCheckoutResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from doExpressCheckout operation
           */
            public void receiveErrordoExpressCheckout(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for initExpressCheckout method
            * override this method for handling normal response from initExpressCheckout operation
            */
           public void receiveResultinitExpressCheckout(
                    org.wso2.carbon.payment.paypal.services.InitExpressCheckoutResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from initExpressCheckout operation
           */
            public void receiveErrorinitExpressCheckout(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getExpressCheckoutDetails method
            * override this method for handling normal response from getExpressCheckoutDetails operation
            */
           public void receiveResultgetExpressCheckoutDetails(
                    org.wso2.carbon.payment.paypal.services.GetExpressCheckoutDetailsResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getExpressCheckoutDetails operation
           */
            public void receiveErrorgetExpressCheckoutDetails(java.lang.Exception e) {
            }
                


    }
    
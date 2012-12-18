
/**
 * __MultitenantDispatcherServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */

    package org.apache.ws.axis2;

    /**
     *  __MultitenantDispatcherServiceCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class __MultitenantDispatcherServiceCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public __MultitenantDispatcherServiceCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public __MultitenantDispatcherServiceCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for dispatch method
            * override this method for handling normal response from dispatch operation
            */
           public void receiveResultdispatch(
                    ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from dispatch operation
           */
            public void receiveErrordispatch(java.lang.Exception e) {
            }
                


    }
    
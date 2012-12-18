
/**
 * AccountMgtServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */

    package org.wso2.carbon.account.mgt.services;

    /**
     *  AccountMgtServiceCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class AccountMgtServiceCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public AccountMgtServiceCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public AccountMgtServiceCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for finishedDomainValidation method
            * override this method for handling normal response from finishedDomainValidation operation
            */
           public void receiveResultfinishedDomainValidation(
                    org.wso2.carbon.account.mgt.services.FinishedDomainValidationResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from finishedDomainValidation operation
           */
            public void receiveErrorfinishedDomainValidation(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for updateContact method
            * override this method for handling normal response from updateContact operation
            */
           public void receiveResultupdateContact(
                    ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from updateContact operation
           */
            public void receiveErrorupdateContact(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getFullname method
            * override this method for handling normal response from getFullname operation
            */
           public void receiveResultgetFullname(
                    org.wso2.carbon.account.mgt.services.GetFullnameResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getFullname operation
           */
            public void receiveErrorgetFullname(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getContact method
            * override this method for handling normal response from getContact operation
            */
           public void receiveResultgetContact(
                    org.wso2.carbon.account.mgt.services.GetContactResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getContact operation
           */
            public void receiveErrorgetContact(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for isEmailValidated method
            * override this method for handling normal response from isEmailValidated operation
            */
           public void receiveResultisEmailValidated(
                    org.wso2.carbon.account.mgt.services.IsEmailValidatedResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from isEmailValidated operation
           */
            public void receiveErrorisEmailValidated(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for isDomainValidated method
            * override this method for handling normal response from isDomainValidated operation
            */
           public void receiveResultisDomainValidated(
                    org.wso2.carbon.account.mgt.services.IsDomainValidatedResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from isDomainValidated operation
           */
            public void receiveErrorisDomainValidated(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for updateFullname method
            * override this method for handling normal response from updateFullname operation
            */
           public void receiveResultupdateFullname(
                    org.wso2.carbon.account.mgt.services.UpdateFullnameResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from updateFullname operation
           */
            public void receiveErrorupdateFullname(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for deactivate method
            * override this method for handling normal response from deactivate operation
            */
           public void receiveResultdeactivate(
                    ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from deactivate operation
           */
            public void receiveErrordeactivate(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for checkDomainAvailability method
            * override this method for handling normal response from checkDomainAvailability operation
            */
           public void receiveResultcheckDomainAvailability(
                    org.wso2.carbon.account.mgt.services.CheckDomainAvailabilityResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from checkDomainAvailability operation
           */
            public void receiveErrorcheckDomainAvailability(java.lang.Exception e) {
            }
                


    }
    

/**
 * ValidateDomainAdminServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */

    package org.wso2.carbon.validate.domain.services;

    /**
     *  ValidateDomainAdminServiceCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class ValidateDomainAdminServiceCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public ValidateDomainAdminServiceCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public ValidateDomainAdminServiceCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for validateByTextInRoot method
            * override this method for handling normal response from validateByTextInRoot operation
            */
           public void receiveResultvalidateByTextInRoot(
                    org.wso2.carbon.validate.domain.services.ValidateByTextInRootResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from validateByTextInRoot operation
           */
            public void receiveErrorvalidateByTextInRoot(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for validateByDNSEntry method
            * override this method for handling normal response from validateByDNSEntry operation
            */
           public void receiveResultvalidateByDNSEntry(
                    org.wso2.carbon.validate.domain.services.ValidateByDNSEntryResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from validateByDNSEntry operation
           */
            public void receiveErrorvalidateByDNSEntry(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getDomainValidationKey method
            * override this method for handling normal response from getDomainValidationKey operation
            */
           public void receiveResultgetDomainValidationKey(
                    org.wso2.carbon.validate.domain.services.GetDomainValidationKeyResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getDomainValidationKey operation
           */
            public void receiveErrorgetDomainValidationKey(java.lang.Exception e) {
            }
                


    }
    
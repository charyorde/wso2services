
/**
 * TenantMgtAdminServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */

    package org.wso2.carbon.tenant.mgt.services;

    /**
     *  TenantMgtAdminServiceCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class TenantMgtAdminServiceCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public TenantMgtAdminServiceCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public TenantMgtAdminServiceCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for updateTenant method
            * override this method for handling normal response from updateTenant operation
            */
           public void receiveResultupdateTenant(
                    ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from updateTenant operation
           */
            public void receiveErrorupdateTenant(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for deactivateTenant method
            * override this method for handling normal response from deactivateTenant operation
            */
           public void receiveResultdeactivateTenant(
                    ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from deactivateTenant operation
           */
            public void receiveErrordeactivateTenant(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for activateTenant method
            * override this method for handling normal response from activateTenant operation
            */
           public void receiveResultactivateTenant(
                    ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from activateTenant operation
           */
            public void receiveErroractivateTenant(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for retrieveTenants method
            * override this method for handling normal response from retrieveTenants operation
            */
           public void receiveResultretrieveTenants(
                    org.wso2.carbon.tenant.mgt.services.RetrieveTenantsResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from retrieveTenants operation
           */
            public void receiveErrorretrieveTenants(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getTenant method
            * override this method for handling normal response from getTenant operation
            */
           public void receiveResultgetTenant(
                    org.wso2.carbon.tenant.mgt.services.GetTenantResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getTenant operation
           */
            public void receiveErrorgetTenant(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for retrievePaginatedTenants method
            * override this method for handling normal response from retrievePaginatedTenants operation
            */
           public void receiveResultretrievePaginatedTenants(
                    org.wso2.carbon.tenant.mgt.services.RetrievePaginatedTenantsResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from retrievePaginatedTenants operation
           */
            public void receiveErrorretrievePaginatedTenants(java.lang.Exception e) {
            }
                
               // No methods generated for meps other than in-out
                
           /**
            * auto generated Axis2 call back method for addTenant method
            * override this method for handling normal response from addTenant operation
            */
           public void receiveResultaddTenant(
                    org.wso2.carbon.tenant.mgt.services.AddTenantResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from addTenant operation
           */
            public void receiveErroraddTenant(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for updateTenantPassword method
            * override this method for handling normal response from updateTenantPassword operation
            */
           public void receiveResultupdateTenantPassword(
                    org.wso2.carbon.tenant.mgt.services.UpdateTenantPasswordResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from updateTenantPassword operation
           */
            public void receiveErrorupdateTenantPassword(java.lang.Exception e) {
            }
                


    }
    
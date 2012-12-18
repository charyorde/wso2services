
/**
 * TenantRegAgentServiceSkeletonInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */
    package org.wso2.carbon.tenant.reg.agent.service;
    /**
     *  TenantRegAgentServiceSkeletonInterface java skeleton interface for the axisService
     */
    public interface TenantRegAgentServiceSkeletonInterface {
     
         
        /**
         * Auto generated method signature
         * 
                                    * @param updateTenant
             * @throws TenantRegAgentServiceUserStoreExceptionException : 
         */

        
                public void updateTenant
                (
                  org.wso2.carbon.tenant.reg.agent.service.UpdateTenant updateTenant
                 )
            throws TenantRegAgentServiceUserStoreExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param renameTenant
             * @throws TenantRegAgentServiceUserStoreExceptionException : 
         */

        
                public void renameTenant
                (
                  org.wso2.carbon.tenant.reg.agent.service.RenameTenant renameTenant
                 )
            throws TenantRegAgentServiceUserStoreExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param addTenant
             * @throws TenantRegAgentServiceUserStoreExceptionException : 
         */

        
                public void addTenant
                (
                  org.wso2.carbon.tenant.reg.agent.service.AddTenant addTenant
                 )
            throws TenantRegAgentServiceUserStoreExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getListenerOrder
         */

        
                public org.wso2.carbon.tenant.reg.agent.service.GetListenerOrderResponse getListenerOrder
                (
                  org.wso2.carbon.tenant.reg.agent.service.GetListenerOrder getListenerOrder
                 )
            ;
        
         }
    
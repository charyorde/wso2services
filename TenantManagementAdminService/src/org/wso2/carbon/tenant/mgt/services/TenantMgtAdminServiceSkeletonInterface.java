
/**
 * TenantMgtAdminServiceSkeletonInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */
    package org.wso2.carbon.tenant.mgt.services;
    /**
     *  TenantMgtAdminServiceSkeletonInterface java skeleton interface for the axisService
     */
    public interface TenantMgtAdminServiceSkeletonInterface {
     
         
        /**
         * Auto generated method signature
         * 
                                    * @param updateTenant
             * @throws TenantMgtAdminServiceExceptionException : 
         */

        
                public void updateTenant
                (
                  org.wso2.carbon.tenant.mgt.services.UpdateTenant updateTenant
                 )
            throws TenantMgtAdminServiceExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param deactivateTenant
             * @throws TenantMgtAdminServiceExceptionException : 
         */

        
                public void deactivateTenant
                (
                  org.wso2.carbon.tenant.mgt.services.DeactivateTenant deactivateTenant
                 )
            throws TenantMgtAdminServiceExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param activateTenant
             * @throws TenantMgtAdminServiceExceptionException : 
         */

        
                public void activateTenant
                (
                  org.wso2.carbon.tenant.mgt.services.ActivateTenant activateTenant
                 )
            throws TenantMgtAdminServiceExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param retrieveTenants
             * @throws TenantMgtAdminServiceExceptionException : 
         */

        
                public org.wso2.carbon.tenant.mgt.services.RetrieveTenantsResponse retrieveTenants
                (
                  org.wso2.carbon.tenant.mgt.services.RetrieveTenants retrieveTenants
                 )
            throws TenantMgtAdminServiceExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getTenant
             * @throws TenantMgtAdminServiceExceptionException : 
         */

        
                public org.wso2.carbon.tenant.mgt.services.GetTenantResponse getTenant
                (
                  org.wso2.carbon.tenant.mgt.services.GetTenant getTenant
                 )
            throws TenantMgtAdminServiceExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param retrievePaginatedTenants
             * @throws TenantMgtAdminServiceExceptionException : 
         */

        
                public org.wso2.carbon.tenant.mgt.services.RetrievePaginatedTenantsResponse retrievePaginatedTenants
                (
                  org.wso2.carbon.tenant.mgt.services.RetrievePaginatedTenants retrievePaginatedTenants
                 )
            throws TenantMgtAdminServiceExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param restartTenant
             * @throws TenantMgtAdminServiceExceptionException : 
         */

        
                public void restartTenant
                (
                  org.wso2.carbon.tenant.mgt.services.RestartTenant restartTenant
                 )
            throws TenantMgtAdminServiceExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param addTenant
             * @throws TenantMgtAdminServiceExceptionException : 
         */

        
                public org.wso2.carbon.tenant.mgt.services.AddTenantResponse addTenant
                (
                  org.wso2.carbon.tenant.mgt.services.AddTenant addTenant
                 )
            throws TenantMgtAdminServiceExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param updateTenantPassword
             * @throws TenantMgtAdminServiceExceptionException : 
         */

        
                public org.wso2.carbon.tenant.mgt.services.UpdateTenantPasswordResponse updateTenantPassword
                (
                  org.wso2.carbon.tenant.mgt.services.UpdateTenantPassword updateTenantPassword
                 )
            throws TenantMgtAdminServiceExceptionException;
        
         }
    
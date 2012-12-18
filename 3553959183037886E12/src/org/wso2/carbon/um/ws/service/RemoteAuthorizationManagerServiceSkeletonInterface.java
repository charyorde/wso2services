
/**
 * RemoteAuthorizationManagerServiceSkeletonInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */
    package org.wso2.carbon.um.ws.service;
    /**
     *  RemoteAuthorizationManagerServiceSkeletonInterface java skeleton interface for the axisService
     */
    public interface RemoteAuthorizationManagerServiceSkeletonInterface {
     
         
        /**
         * Auto generated method signature
         * 
                                    * @param isRoleAuthorized
             * @throws RemoteAuthorizationManagerServiceUserStoreExceptionException : 
         */

        
                public org.wso2.carbon.um.ws.service.IsRoleAuthorizedResponse isRoleAuthorized
                (
                  org.wso2.carbon.um.ws.service.IsRoleAuthorized isRoleAuthorized
                 )
            throws RemoteAuthorizationManagerServiceUserStoreExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param clearResourceAuthorizations
             * @throws RemoteAuthorizationManagerServiceUserStoreExceptionException : 
         */

        
                public void clearResourceAuthorizations
                (
                  org.wso2.carbon.um.ws.service.ClearResourceAuthorizations clearResourceAuthorizations
                 )
            throws RemoteAuthorizationManagerServiceUserStoreExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param clearAllUserAuthorization
             * @throws RemoteAuthorizationManagerServiceUserStoreExceptionException : 
         */

        
                public void clearAllUserAuthorization
                (
                  org.wso2.carbon.um.ws.service.ClearAllUserAuthorization clearAllUserAuthorization
                 )
            throws RemoteAuthorizationManagerServiceUserStoreExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param isUserAuthorized
             * @throws RemoteAuthorizationManagerServiceUserStoreExceptionException : 
         */

        
                public org.wso2.carbon.um.ws.service.IsUserAuthorizedResponse isUserAuthorized
                (
                  org.wso2.carbon.um.ws.service.IsUserAuthorized isUserAuthorized
                 )
            throws RemoteAuthorizationManagerServiceUserStoreExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param clearRoleActionOnAllResources
             * @throws RemoteAuthorizationManagerServiceUserStoreExceptionException : 
         */

        
                public void clearRoleActionOnAllResources
                (
                  org.wso2.carbon.um.ws.service.ClearRoleActionOnAllResources clearRoleActionOnAllResources
                 )
            throws RemoteAuthorizationManagerServiceUserStoreExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param clearRoleAuthorization
             * @throws RemoteAuthorizationManagerServiceUserStoreExceptionException : 
         */

        
                public void clearRoleAuthorization
                (
                  org.wso2.carbon.um.ws.service.ClearRoleAuthorization clearRoleAuthorization
                 )
            throws RemoteAuthorizationManagerServiceUserStoreExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param clearAllRoleAuthorization
             * @throws RemoteAuthorizationManagerServiceUserStoreExceptionException : 
         */

        
                public void clearAllRoleAuthorization
                (
                  org.wso2.carbon.um.ws.service.ClearAllRoleAuthorization clearAllRoleAuthorization
                 )
            throws RemoteAuthorizationManagerServiceUserStoreExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getExplicitlyDeniedUsersForResource
             * @throws RemoteAuthorizationManagerServiceUserStoreExceptionException : 
         */

        
                public org.wso2.carbon.um.ws.service.GetExplicitlyDeniedUsersForResourceResponse getExplicitlyDeniedUsersForResource
                (
                  org.wso2.carbon.um.ws.service.GetExplicitlyDeniedUsersForResource getExplicitlyDeniedUsersForResource
                 )
            throws RemoteAuthorizationManagerServiceUserStoreExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param authorizeUser
             * @throws RemoteAuthorizationManagerServiceUserStoreExceptionException : 
         */

        
                public void authorizeUser
                (
                  org.wso2.carbon.um.ws.service.AuthorizeUser authorizeUser
                 )
            throws RemoteAuthorizationManagerServiceUserStoreExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getAllowedRolesForResource
             * @throws RemoteAuthorizationManagerServiceUserStoreExceptionException : 
         */

        
                public org.wso2.carbon.um.ws.service.GetAllowedRolesForResourceResponse getAllowedRolesForResource
                (
                  org.wso2.carbon.um.ws.service.GetAllowedRolesForResource getAllowedRolesForResource
                 )
            throws RemoteAuthorizationManagerServiceUserStoreExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param clearUserAuthorization
             * @throws RemoteAuthorizationManagerServiceUserStoreExceptionException : 
         */

        
                public void clearUserAuthorization
                (
                  org.wso2.carbon.um.ws.service.ClearUserAuthorization clearUserAuthorization
                 )
            throws RemoteAuthorizationManagerServiceUserStoreExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getDeniedRolesForResource
             * @throws RemoteAuthorizationManagerServiceUserStoreExceptionException : 
         */

        
                public org.wso2.carbon.um.ws.service.GetDeniedRolesForResourceResponse getDeniedRolesForResource
                (
                  org.wso2.carbon.um.ws.service.GetDeniedRolesForResource getDeniedRolesForResource
                 )
            throws RemoteAuthorizationManagerServiceUserStoreExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getAllowedUIResourcesForUser
             * @throws RemoteAuthorizationManagerServiceUserStoreExceptionException : 
         */

        
                public org.wso2.carbon.um.ws.service.GetAllowedUIResourcesForUserResponse getAllowedUIResourcesForUser
                (
                  org.wso2.carbon.um.ws.service.GetAllowedUIResourcesForUser getAllowedUIResourcesForUser
                 )
            throws RemoteAuthorizationManagerServiceUserStoreExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param resetPermissionOnUpdateRole
             * @throws RemoteAuthorizationManagerServiceUserStoreExceptionException : 
         */

        
                public void resetPermissionOnUpdateRole
                (
                  org.wso2.carbon.um.ws.service.ResetPermissionOnUpdateRole resetPermissionOnUpdateRole
                 )
            throws RemoteAuthorizationManagerServiceUserStoreExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param denyRole
             * @throws RemoteAuthorizationManagerServiceUserStoreExceptionException : 
         */

        
                public void denyRole
                (
                  org.wso2.carbon.um.ws.service.DenyRole denyRole
                 )
            throws RemoteAuthorizationManagerServiceUserStoreExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getExplicitlyAllowedUsersForResource
             * @throws RemoteAuthorizationManagerServiceUserStoreExceptionException : 
         */

        
                public org.wso2.carbon.um.ws.service.GetExplicitlyAllowedUsersForResourceResponse getExplicitlyAllowedUsersForResource
                (
                  org.wso2.carbon.um.ws.service.GetExplicitlyAllowedUsersForResource getExplicitlyAllowedUsersForResource
                 )
            throws RemoteAuthorizationManagerServiceUserStoreExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param denyUser
             * @throws RemoteAuthorizationManagerServiceUserStoreExceptionException : 
         */

        
                public void denyUser
                (
                  org.wso2.carbon.um.ws.service.DenyUser denyUser
                 )
            throws RemoteAuthorizationManagerServiceUserStoreExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param authorizeRole
             * @throws RemoteAuthorizationManagerServiceUserStoreExceptionException : 
         */

        
                public void authorizeRole
                (
                  org.wso2.carbon.um.ws.service.AuthorizeRole authorizeRole
                 )
            throws RemoteAuthorizationManagerServiceUserStoreExceptionException;
        
         }
    
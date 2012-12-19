
/**
 * UserAdminSkeletonInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */
    package org.wso2.carbon.user.mgt;
    /**
     *  UserAdminSkeletonInterface java skeleton interface for the axisService
     */
    public interface UserAdminSkeletonInterface {
     
         
        /**
         * Auto generated method signature
         * 
                                    * @param listUsers
             * @throws UserAdminUserAdminExceptionException : 
         */

        
                public org.wso2.carbon.user.mgt.ListUsersResponse listUsers
                (
                  org.wso2.carbon.user.mgt.ListUsers listUsers
                 )
            throws UserAdminUserAdminExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param setRoleUIPermission
             * @throws UserAdminUserAdminExceptionException : 
         */

        
                public void setRoleUIPermission
                (
                  org.wso2.carbon.user.mgt.SetRoleUIPermission setRoleUIPermission
                 )
            throws UserAdminUserAdminExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getUserStoreInfo
             * @throws UserAdminUserAdminExceptionException : 
         */

        
                public org.wso2.carbon.user.mgt.GetUserStoreInfoResponse getUserStoreInfo
                (
                  org.wso2.carbon.user.mgt.GetUserStoreInfo getUserStoreInfo
                 )
            throws UserAdminUserAdminExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param changePasswordByUser
             * @throws UserAdminUserAdminExceptionException : 
         */

        
                public void changePasswordByUser
                (
                  org.wso2.carbon.user.mgt.ChangePasswordByUser changePasswordByUser
                 )
            throws UserAdminUserAdminExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param addUser
             * @throws UserAdminUserAdminExceptionException : 
         */

        
                public void addUser
                (
                  org.wso2.carbon.user.mgt.AddUser addUser
                 )
            throws UserAdminUserAdminExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param updateRoleName
             * @throws UserAdminUserAdminExceptionException : 
         */

        
                public void updateRoleName
                (
                  org.wso2.carbon.user.mgt.UpdateRoleName updateRoleName
                 )
            throws UserAdminUserAdminExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getRolesOfUser
             * @throws UserAdminUserAdminExceptionException : 
         */

        
                public org.wso2.carbon.user.mgt.GetRolesOfUserResponse getRolesOfUser
                (
                  org.wso2.carbon.user.mgt.GetRolesOfUser getRolesOfUser
                 )
            throws UserAdminUserAdminExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getRolePermissions
             * @throws UserAdminUserAdminExceptionException : 
         */

        
                public org.wso2.carbon.user.mgt.GetRolePermissionsResponse getRolePermissions
                (
                  org.wso2.carbon.user.mgt.GetRolePermissions getRolePermissions
                 )
            throws UserAdminUserAdminExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param deleteUser
             * @throws UserAdminUserAdminExceptionException : 
         */

        
                public void deleteUser
                (
                  org.wso2.carbon.user.mgt.DeleteUser deleteUser
                 )
            throws UserAdminUserAdminExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param deleteRole
             * @throws UserAdminUserAdminExceptionException : 
         */

        
                public void deleteRole
                (
                  org.wso2.carbon.user.mgt.DeleteRole deleteRole
                 )
            throws UserAdminUserAdminExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param updateRolesOfUser
             * @throws UserAdminUserAdminExceptionException : 
         */

        
                public void updateRolesOfUser
                (
                  org.wso2.carbon.user.mgt.UpdateRolesOfUser updateRolesOfUser
                 )
            throws UserAdminUserAdminExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param updateUsersOfRole
             * @throws UserAdminUserAdminExceptionException : 
         */

        
                public void updateUsersOfRole
                (
                  org.wso2.carbon.user.mgt.UpdateUsersOfRole updateUsersOfRole
                 )
            throws UserAdminUserAdminExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param changePassword
             * @throws UserAdminUserAdminExceptionException : 
         */

        
                public void changePassword
                (
                  org.wso2.carbon.user.mgt.ChangePassword changePassword
                 )
            throws UserAdminUserAdminExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param addRole
             * @throws UserAdminUserAdminExceptionException : 
         */

        
                public void addRole
                (
                  org.wso2.carbon.user.mgt.AddRole addRole
                 )
            throws UserAdminUserAdminExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getAllRolesNames
             * @throws UserAdminUserAdminExceptionException : 
         */

        
                public org.wso2.carbon.user.mgt.GetAllRolesNamesResponse getAllRolesNames
                (
                  org.wso2.carbon.user.mgt.GetAllRolesNames getAllRolesNames
                 )
            throws UserAdminUserAdminExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getUsersOfRole
             * @throws UserAdminUserAdminExceptionException : 
         */

        
                public org.wso2.carbon.user.mgt.GetUsersOfRoleResponse getUsersOfRole
                (
                  org.wso2.carbon.user.mgt.GetUsersOfRole getUsersOfRole
                 )
            throws UserAdminUserAdminExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getAllUIPermissions
             * @throws UserAdminUserAdminExceptionException : 
         */

        
                public org.wso2.carbon.user.mgt.GetAllUIPermissionsResponse getAllUIPermissions
                (
                  org.wso2.carbon.user.mgt.GetAllUIPermissions getAllUIPermissions
                 )
            throws UserAdminUserAdminExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param bulkImportUsers
             * @throws UserAdminUserAdminExceptionException : 
         */

        
                public void bulkImportUsers
                (
                  org.wso2.carbon.user.mgt.BulkImportUsers bulkImportUsers
                 )
            throws UserAdminUserAdminExceptionException;
        
         }
    
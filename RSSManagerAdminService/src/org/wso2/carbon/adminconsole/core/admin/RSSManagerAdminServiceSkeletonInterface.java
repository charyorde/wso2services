
/**
 * RSSManagerAdminServiceSkeletonInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */
    package org.wso2.carbon.adminconsole.core.admin;
    /**
     *  RSSManagerAdminServiceSkeletonInterface java skeleton interface for the axisService
     */
    public interface RSSManagerAdminServiceSkeletonInterface {
     
         
        /**
         * Auto generated method signature
         * 
                                    * @param getDatabaseUserById
             * @throws RSSManagerAdminServiceRSSDAOExceptionException : 
         */

        
                public org.wso2.carbon.adminconsole.core.admin.GetDatabaseUserByIdResponse getDatabaseUserById
                (
                  org.wso2.carbon.adminconsole.core.admin.GetDatabaseUserById getDatabaseUserById
                 )
            throws RSSManagerAdminServiceRSSDAOExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param createPrivilegeGroup
             * @throws RSSManagerAdminServiceRSSDAOExceptionException : 
         */

        
                public void createPrivilegeGroup
                (
                  org.wso2.carbon.adminconsole.core.admin.CreatePrivilegeGroup createPrivilegeGroup
                 )
            throws RSSManagerAdminServiceRSSDAOExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param editRSSInstance
             * @throws RSSManagerAdminServiceRSSDAOExceptionException : 
         */

        
                public void editRSSInstance
                (
                  org.wso2.carbon.adminconsole.core.admin.EditRSSInstance editRSSInstance
                 )
            throws RSSManagerAdminServiceRSSDAOExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param removeRSSInstance
             * @throws RSSManagerAdminServiceRSSDAOExceptionException : 
         */

        
                public void removeRSSInstance
                (
                  org.wso2.carbon.adminconsole.core.admin.RemoveRSSInstance removeRSSInstance
                 )
            throws RSSManagerAdminServiceRSSDAOExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getDatabaseInstanceList
             * @throws RSSManagerAdminServiceRSSDAOExceptionException : 
         */

        
                public org.wso2.carbon.adminconsole.core.admin.GetDatabaseInstanceListResponse getDatabaseInstanceList
                (
                  org.wso2.carbon.adminconsole.core.admin.GetDatabaseInstanceList getDatabaseInstanceList
                 )
            throws RSSManagerAdminServiceRSSDAOExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param createDatabase
             * @throws RSSManagerAdminServiceRSSDAOExceptionException : 
         */

        
                public void createDatabase
                (
                  org.wso2.carbon.adminconsole.core.admin.CreateDatabase createDatabase
                 )
            throws RSSManagerAdminServiceRSSDAOExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getRoundRobinAssignedRSSInstance
             * @throws RSSManagerAdminServiceRSSDAOExceptionException : 
         */

        
                public org.wso2.carbon.adminconsole.core.admin.GetRoundRobinAssignedRSSInstanceResponse getRoundRobinAssignedRSSInstance
                (
                  org.wso2.carbon.adminconsole.core.admin.GetRoundRobinAssignedRSSInstance getRoundRobinAssignedRSSInstance
                 )
            throws RSSManagerAdminServiceRSSDAOExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param editPrivilegeGroup
             * @throws RSSManagerAdminServiceRSSDAOExceptionException : 
         */

        
                public void editPrivilegeGroup
                (
                  org.wso2.carbon.adminconsole.core.admin.EditPrivilegeGroup editPrivilegeGroup
                 )
            throws RSSManagerAdminServiceRSSDAOExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param addRSSInstance
             * @throws RSSManagerAdminServiceRSSDAOExceptionException : 
         */

        
                public void addRSSInstance
                (
                  org.wso2.carbon.adminconsole.core.admin.AddRSSInstance addRSSInstance
                 )
            throws RSSManagerAdminServiceRSSDAOExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param dropUser
             * @throws RSSManagerAdminServiceRSSDAOExceptionException : 
         */

        
                public void dropUser
                (
                  org.wso2.carbon.adminconsole.core.admin.DropUser dropUser
                 )
            throws RSSManagerAdminServiceRSSDAOExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param createCarbonDSFromDatabaseUserEntry
             * @throws RSSManagerAdminServiceRSSDAOExceptionException : 
         */

        
                public org.wso2.carbon.adminconsole.core.admin.CreateCarbonDSFromDatabaseUserEntryResponse createCarbonDSFromDatabaseUserEntry
                (
                  org.wso2.carbon.adminconsole.core.admin.CreateCarbonDSFromDatabaseUserEntry createCarbonDSFromDatabaseUserEntry
                 )
            throws RSSManagerAdminServiceRSSDAOExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getDatabaseInstanceById
             * @throws RSSManagerAdminServiceRSSDAOExceptionException : 
         */

        
                public org.wso2.carbon.adminconsole.core.admin.GetDatabaseInstanceByIdResponse getDatabaseInstanceById
                (
                  org.wso2.carbon.adminconsole.core.admin.GetDatabaseInstanceById getDatabaseInstanceById
                 )
            throws RSSManagerAdminServiceRSSDAOExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param createUser
             * @throws RSSManagerAdminServiceRSSDAOExceptionException : 
         */

        
                public void createUser
                (
                  org.wso2.carbon.adminconsole.core.admin.CreateUser createUser
                 )
            throws RSSManagerAdminServiceRSSDAOExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getRSSInstanceList
             * @throws RSSManagerAdminServiceRSSDAOExceptionException : 
         */

        
                public org.wso2.carbon.adminconsole.core.admin.GetRSSInstanceListResponse getRSSInstanceList
                (
                  org.wso2.carbon.adminconsole.core.admin.GetRSSInstanceList getRSSInstanceList
                 )
            throws RSSManagerAdminServiceRSSDAOExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getUsersByDatabaseInstanceId
             * @throws RSSManagerAdminServiceRSSDAOExceptionException : 
         */

        
                public org.wso2.carbon.adminconsole.core.admin.GetUsersByDatabaseInstanceIdResponse getUsersByDatabaseInstanceId
                (
                  org.wso2.carbon.adminconsole.core.admin.GetUsersByDatabaseInstanceId getUsersByDatabaseInstanceId
                 )
            throws RSSManagerAdminServiceRSSDAOExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getUserDatabasePermissions
             * @throws RSSManagerAdminServiceRSSDAOExceptionException : 
         */

        
                public org.wso2.carbon.adminconsole.core.admin.GetUserDatabasePermissionsResponse getUserDatabasePermissions
                (
                  org.wso2.carbon.adminconsole.core.admin.GetUserDatabasePermissions getUserDatabasePermissions
                 )
            throws RSSManagerAdminServiceRSSDAOExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param dropDatabase
             * @throws RSSManagerAdminServiceRSSDAOExceptionException : 
         */

        
                public void dropDatabase
                (
                  org.wso2.carbon.adminconsole.core.admin.DropDatabase dropDatabase
                 )
            throws RSSManagerAdminServiceRSSDAOExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param testConnection
             * @throws RSSManagerAdminServiceRSSDAOExceptionException : 
         */

        
                public org.wso2.carbon.adminconsole.core.admin.TestConnectionResponse testConnection
                (
                  org.wso2.carbon.adminconsole.core.admin.TestConnection testConnection
                 )
            throws RSSManagerAdminServiceRSSDAOExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getRSSInstanceDataById
             * @throws RSSManagerAdminServiceRSSDAOExceptionException : 
         */

        
                public org.wso2.carbon.adminconsole.core.admin.GetRSSInstanceDataByIdResponse getRSSInstanceDataById
                (
                  org.wso2.carbon.adminconsole.core.admin.GetRSSInstanceDataById getRSSInstanceDataById
                 )
            throws RSSManagerAdminServiceRSSDAOExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getPrivilegeGroupById
             * @throws RSSManagerAdminServiceRSSDAOExceptionException : 
         */

        
                public org.wso2.carbon.adminconsole.core.admin.GetPrivilegeGroupByIdResponse getPrivilegeGroupById
                (
                  org.wso2.carbon.adminconsole.core.admin.GetPrivilegeGroupById getPrivilegeGroupById
                 )
            throws RSSManagerAdminServiceRSSDAOExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getPrivilegeGroups
             * @throws RSSManagerAdminServiceRSSDAOExceptionException : 
         */

        
                public org.wso2.carbon.adminconsole.core.admin.GetPrivilegeGroupsResponse getPrivilegeGroups
                (
                  org.wso2.carbon.adminconsole.core.admin.GetPrivilegeGroups getPrivilegeGroups
                 )
            throws RSSManagerAdminServiceRSSDAOExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param removePrivilegeGroup
             * @throws RSSManagerAdminServiceRSSDAOExceptionException : 
         */

        
                public void removePrivilegeGroup
                (
                  org.wso2.carbon.adminconsole.core.admin.RemovePrivilegeGroup removePrivilegeGroup
                 )
            throws RSSManagerAdminServiceRSSDAOExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param editUserPrivileges
             * @throws RSSManagerAdminServiceRSSDAOExceptionException : 
         */

        
                public void editUserPrivileges
                (
                  org.wso2.carbon.adminconsole.core.admin.EditUserPrivileges editUserPrivileges
                 )
            throws RSSManagerAdminServiceRSSDAOExceptionException;
        
         }
    
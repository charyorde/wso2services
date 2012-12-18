
/**
 * ProfileAdminServiceSkeletonInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */
    package org.wso2.carbon.profiles.mgt;
    /**
     *  ProfileAdminServiceSkeletonInterface java skeleton interface for the axisService
     */
    public interface ProfileAdminServiceSkeletonInterface {
     
         
        /**
         * Auto generated method signature
         * 
                                    * @param isAddProfileEnabled
             * @throws ProfileAdminServiceProfileManagementExceptionException : 
         */

        
                public org.wso2.carbon.profiles.mgt.IsAddProfileEnabledResponse isAddProfileEnabled
                (
                  org.wso2.carbon.profiles.mgt.IsAddProfileEnabled isAddProfileEnabled
                 )
            throws ProfileAdminServiceProfileManagementExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param deleteProfileConfiguraiton
             * @throws ProfileAdminServiceProfileManagementExceptionException : 
         */

        
                public void deleteProfileConfiguraiton
                (
                  org.wso2.carbon.profiles.mgt.DeleteProfileConfiguraiton deleteProfileConfiguraiton
                 )
            throws ProfileAdminServiceProfileManagementExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getClaimConfigurations
             * @throws ProfileAdminServiceProfileManagementExceptionException : 
         */

        
                public org.wso2.carbon.profiles.mgt.GetClaimConfigurationsResponse getClaimConfigurations
                (
                  org.wso2.carbon.profiles.mgt.GetClaimConfigurations getClaimConfigurations
                 )
            throws ProfileAdminServiceProfileManagementExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getDialectsForUserStore
             * @throws ProfileAdminServiceProfileManagementExceptionException : 
         */

        
                public org.wso2.carbon.profiles.mgt.GetDialectsForUserStoreResponse getDialectsForUserStore
                (
                  org.wso2.carbon.profiles.mgt.GetDialectsForUserStore getDialectsForUserStore
                 )
            throws ProfileAdminServiceProfileManagementExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getAllAvailableProfileConfiguraions
             * @throws ProfileAdminServiceProfileManagementExceptionException : 
         */

        
                public org.wso2.carbon.profiles.mgt.GetAllAvailableProfileConfiguraionsResponse getAllAvailableProfileConfiguraions
                (
                  org.wso2.carbon.profiles.mgt.GetAllAvailableProfileConfiguraions getAllAvailableProfileConfiguraions
                 )
            throws ProfileAdminServiceProfileManagementExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getProfileConfiguration
             * @throws ProfileAdminServiceProfileManagementExceptionException : 
         */

        
                public org.wso2.carbon.profiles.mgt.GetProfileConfigurationResponse getProfileConfiguration
                (
                  org.wso2.carbon.profiles.mgt.GetProfileConfiguration getProfileConfiguration
                 )
            throws ProfileAdminServiceProfileManagementExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getAllAvailableProfileConfiguraionsForUserStore
             * @throws ProfileAdminServiceProfileManagementExceptionException : 
         */

        
                public org.wso2.carbon.profiles.mgt.GetAllAvailableProfileConfiguraionsForUserStoreResponse getAllAvailableProfileConfiguraionsForUserStore
                (
                  org.wso2.carbon.profiles.mgt.GetAllAvailableProfileConfiguraionsForUserStore getAllAvailableProfileConfiguraionsForUserStore
                 )
            throws ProfileAdminServiceProfileManagementExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param addProfile
             * @throws ProfileAdminServiceProfileManagementExceptionException : 
         */

        
                public void addProfile
                (
                  org.wso2.carbon.profiles.mgt.AddProfile addProfile
                 )
            throws ProfileAdminServiceProfileManagementExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getDialects
             * @throws ProfileAdminServiceProfileManagementExceptionException : 
         */

        
                public org.wso2.carbon.profiles.mgt.GetDialectsResponse getDialects
                (
                  org.wso2.carbon.profiles.mgt.GetDialects getDialects
                 )
            throws ProfileAdminServiceProfileManagementExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param updateClaimMappingBehavior
             * @throws ProfileAdminServiceProfileManagementExceptionException : 
         */

        
                public void updateClaimMappingBehavior
                (
                  org.wso2.carbon.profiles.mgt.UpdateClaimMappingBehavior updateClaimMappingBehavior
                 )
            throws ProfileAdminServiceProfileManagementExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getAllAvailableProfileConfiguraionsForDialect
             * @throws ProfileAdminServiceProfileManagementExceptionException : 
         */

        
                public org.wso2.carbon.profiles.mgt.GetAllAvailableProfileConfiguraionsForDialectResponse getAllAvailableProfileConfiguraionsForDialect
                (
                  org.wso2.carbon.profiles.mgt.GetAllAvailableProfileConfiguraionsForDialect getAllAvailableProfileConfiguraionsForDialect
                 )
            throws ProfileAdminServiceProfileManagementExceptionException;
        
         }
    
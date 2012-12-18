
/**
 * ProfilesAdminServiceSkeletonInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */
    package org.wso2.carbon.registry.profiles.services;
    /**
     *  ProfilesAdminServiceSkeletonInterface java skeleton interface for the axisService
     */
    public interface ProfilesAdminServiceSkeletonInterface {
     
         
        /**
         * Auto generated method signature
         * 
                                    * @param getUserProfile
             * @throws ProfilesAdminServiceUserStoreExceptionException : 
             * @throws ProfilesAdminServiceRegistryExceptionException : 
         */

        
                public org.wso2.carbon.registry.profiles.services.GetUserProfileResponse getUserProfile
                (
                  org.wso2.carbon.registry.profiles.services.GetUserProfile getUserProfile
                 )
            throws ProfilesAdminServiceUserStoreExceptionException,ProfilesAdminServiceRegistryExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param putUserProfile
             * @throws ProfilesAdminServiceUserStoreExceptionException : 
             * @throws ProfilesAdminServiceRegistryExceptionException : 
         */

        
                public org.wso2.carbon.registry.profiles.services.PutUserProfileResponse putUserProfile
                (
                  org.wso2.carbon.registry.profiles.services.PutUserProfile putUserProfile
                 )
            throws ProfilesAdminServiceUserStoreExceptionException,ProfilesAdminServiceRegistryExceptionException;
        
         }
    
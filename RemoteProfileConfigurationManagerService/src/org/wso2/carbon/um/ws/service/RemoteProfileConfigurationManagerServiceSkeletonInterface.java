
/**
 * RemoteProfileConfigurationManagerServiceSkeletonInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */
    package org.wso2.carbon.um.ws.service;
    /**
     *  RemoteProfileConfigurationManagerServiceSkeletonInterface java skeleton interface for the axisService
     */
    public interface RemoteProfileConfigurationManagerServiceSkeletonInterface {
     
         
        /**
         * Auto generated method signature
         * 
                                    * @param addProfileConfig
             * @throws RemoteProfileConfigurationManagerServiceUserStoreExceptionException : 
         */

        
                public void addProfileConfig
                (
                  org.wso2.carbon.um.ws.service.AddProfileConfig addProfileConfig
                 )
            throws RemoteProfileConfigurationManagerServiceUserStoreExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getProfileConfig
             * @throws RemoteProfileConfigurationManagerServiceUserStoreExceptionException : 
         */

        
                public org.wso2.carbon.um.ws.service.GetProfileConfigResponse getProfileConfig
                (
                  org.wso2.carbon.um.ws.service.GetProfileConfig getProfileConfig
                 )
            throws RemoteProfileConfigurationManagerServiceUserStoreExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getAllProfiles
             * @throws RemoteProfileConfigurationManagerServiceUserStoreExceptionException : 
         */

        
                public org.wso2.carbon.um.ws.service.GetAllProfilesResponse getAllProfiles
                (
                  org.wso2.carbon.um.ws.service.GetAllProfiles getAllProfiles
                 )
            throws RemoteProfileConfigurationManagerServiceUserStoreExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param updateProfileConfig
             * @throws RemoteProfileConfigurationManagerServiceUserStoreExceptionException : 
         */

        
                public void updateProfileConfig
                (
                  org.wso2.carbon.um.ws.service.UpdateProfileConfig updateProfileConfig
                 )
            throws RemoteProfileConfigurationManagerServiceUserStoreExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param deleteProfileConfig
             * @throws RemoteProfileConfigurationManagerServiceUserStoreExceptionException : 
         */

        
                public void deleteProfileConfig
                (
                  org.wso2.carbon.um.ws.service.DeleteProfileConfig deleteProfileConfig
                 )
            throws RemoteProfileConfigurationManagerServiceUserStoreExceptionException;
        
         }
    
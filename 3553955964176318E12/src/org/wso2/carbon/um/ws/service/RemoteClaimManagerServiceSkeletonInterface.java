
/**
 * RemoteClaimManagerServiceSkeletonInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */
    package org.wso2.carbon.um.ws.service;
    /**
     *  RemoteClaimManagerServiceSkeletonInterface java skeleton interface for the axisService
     */
    public interface RemoteClaimManagerServiceSkeletonInterface {
     
         
        /**
         * Auto generated method signature
         * 
                                    * @param addNewClaimMapping
             * @throws RemoteClaimManagerServiceUserStoreExceptionException : 
         */

        
                public void addNewClaimMapping
                (
                  org.wso2.carbon.um.ws.service.AddNewClaimMapping addNewClaimMapping
                 )
            throws RemoteClaimManagerServiceUserStoreExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getAttributeName
             * @throws RemoteClaimManagerServiceUserStoreExceptionException : 
         */

        
                public org.wso2.carbon.um.ws.service.GetAttributeNameResponse getAttributeName
                (
                  org.wso2.carbon.um.ws.service.GetAttributeName getAttributeName
                 )
            throws RemoteClaimManagerServiceUserStoreExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param updateClaimMapping
             * @throws RemoteClaimManagerServiceUserStoreExceptionException : 
         */

        
                public void updateClaimMapping
                (
                  org.wso2.carbon.um.ws.service.UpdateClaimMapping updateClaimMapping
                 )
            throws RemoteClaimManagerServiceUserStoreExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getClaimMapping
             * @throws RemoteClaimManagerServiceUserStoreExceptionException : 
         */

        
                public org.wso2.carbon.um.ws.service.GetClaimMappingResponse getClaimMapping
                (
                  org.wso2.carbon.um.ws.service.GetClaimMapping getClaimMapping
                 )
            throws RemoteClaimManagerServiceUserStoreExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getAllClaims
             * @throws RemoteClaimManagerServiceUserStoreExceptionException : 
         */

        
                public org.wso2.carbon.um.ws.service.GetAllClaimsResponse getAllClaims
                (
                  org.wso2.carbon.um.ws.service.GetAllClaims getAllClaims
                 )
            throws RemoteClaimManagerServiceUserStoreExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getClaim
             * @throws RemoteClaimManagerServiceUserStoreExceptionException : 
         */

        
                public org.wso2.carbon.um.ws.service.GetClaimResponse getClaim
                (
                  org.wso2.carbon.um.ws.service.GetClaim getClaim
                 )
            throws RemoteClaimManagerServiceUserStoreExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getAllClaimUris
             * @throws RemoteClaimManagerServiceUserStoreExceptionException : 
         */

        
                public org.wso2.carbon.um.ws.service.GetAllClaimUrisResponse getAllClaimUris
                (
                  org.wso2.carbon.um.ws.service.GetAllClaimUris getAllClaimUris
                 )
            throws RemoteClaimManagerServiceUserStoreExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getAllSupportClaimsByDefault
             * @throws RemoteClaimManagerServiceUserStoreExceptionException : 
         */

        
                public org.wso2.carbon.um.ws.service.GetAllSupportClaimsByDefaultResponse getAllSupportClaimsByDefault
                (
                  org.wso2.carbon.um.ws.service.GetAllSupportClaimsByDefault getAllSupportClaimsByDefault
                 )
            throws RemoteClaimManagerServiceUserStoreExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getAllRequiredClaims
             * @throws RemoteClaimManagerServiceUserStoreExceptionException : 
         */

        
                public org.wso2.carbon.um.ws.service.GetAllRequiredClaimsResponse getAllRequiredClaims
                (
                  org.wso2.carbon.um.ws.service.GetAllRequiredClaims getAllRequiredClaims
                 )
            throws RemoteClaimManagerServiceUserStoreExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param deleteClaimMapping
             * @throws RemoteClaimManagerServiceUserStoreExceptionException : 
         */

        
                public void deleteClaimMapping
                (
                  org.wso2.carbon.um.ws.service.DeleteClaimMapping deleteClaimMapping
                 )
            throws RemoteClaimManagerServiceUserStoreExceptionException;
        
         }
    
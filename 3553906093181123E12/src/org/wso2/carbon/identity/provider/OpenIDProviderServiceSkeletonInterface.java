
/**
 * OpenIDProviderServiceSkeletonInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */
    package org.wso2.carbon.identity.provider;
    /**
     *  OpenIDProviderServiceSkeletonInterface java skeleton interface for the axisService
     */
    public interface OpenIDProviderServiceSkeletonInterface {
     
         
        /**
         * Auto generated method signature
         * 
                                    * @param retrievePapeInfo
             * @throws OpenIDProviderServiceIdentityProviderException : 
         */

        
                public axis2.apache.org.xsd.RetrievePapeInfoResponse retrievePapeInfo
                (
                  axis2.apache.org.xsd.RetrievePapeInfo retrievePapeInfo
                 )
            throws OpenIDProviderServiceIdentityProviderException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param verify
             * @throws OpenIDProviderServiceException : 
         */

        
                public axis2.apache.org.xsd.VerifyResponse verify
                (
                  axis2.apache.org.xsd.Verify verify
                 )
            throws OpenIDProviderServiceException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param doXMPPBasedMultiFactorAuthForInfocard
             * @throws OpenIDProviderServiceException : 
         */

        
                public axis2.apache.org.xsd.DoXMPPBasedMultiFactorAuthForInfocardResponse doXMPPBasedMultiFactorAuthForInfocard
                (
                  axis2.apache.org.xsd.DoXMPPBasedMultiFactorAuthForInfocard doXMPPBasedMultiFactorAuthForInfocard
                 )
            throws OpenIDProviderServiceException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getUserProfiles
             * @throws OpenIDProviderServiceException : 
         */

        
                public axis2.apache.org.xsd.GetUserProfilesResponse getUserProfiles
                (
                  axis2.apache.org.xsd.GetUserProfiles getUserProfiles
                 )
            throws OpenIDProviderServiceException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getClaimValues
             * @throws OpenIDProviderServiceException : 
         */

        
                public axis2.apache.org.xsd.GetClaimValuesResponse getClaimValues
                (
                  axis2.apache.org.xsd.GetClaimValues getClaimValues
                 )
            throws OpenIDProviderServiceException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getOpenIDAuthResponse
             * @throws OpenIDProviderServiceException : 
         */

        
                public axis2.apache.org.xsd.GetOpenIDAuthResponseResponse getOpenIDAuthResponse
                (
                  axis2.apache.org.xsd.GetOpenIDAuthResponse getOpenIDAuthResponse
                 )
            throws OpenIDProviderServiceException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getOpenIDAssociationResponse
             * @throws OpenIDProviderServiceException : 
         */

        
                public axis2.apache.org.xsd.GetOpenIDAssociationResponseResponse getOpenIDAssociationResponse
                (
                  axis2.apache.org.xsd.GetOpenIDAssociationResponse getOpenIDAssociationResponse
                 )
            throws OpenIDProviderServiceException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getOpenIDProviderInfo
             * @throws OpenIDProviderServiceException : 
         */

        
                public axis2.apache.org.xsd.GetOpenIDProviderInfoResponse getOpenIDProviderInfo
                (
                  axis2.apache.org.xsd.GetOpenIDProviderInfo getOpenIDProviderInfo
                 )
            throws OpenIDProviderServiceException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param authenticateWithOpenID
             * @throws OpenIDProviderServiceException : 
         */

        
                public axis2.apache.org.xsd.AuthenticateWithOpenIDResponse authenticateWithOpenID
                (
                  axis2.apache.org.xsd.AuthenticateWithOpenID authenticateWithOpenID
                 )
            throws OpenIDProviderServiceException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param authenticateWithOpenIDRememberMe
             * @throws OpenIDProviderServiceException : 
         */

        
                public axis2.apache.org.xsd.AuthenticateWithOpenIDRememberMeResponse authenticateWithOpenIDRememberMe
                (
                  axis2.apache.org.xsd.AuthenticateWithOpenIDRememberMe authenticateWithOpenIDRememberMe
                 )
            throws OpenIDProviderServiceException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param signInWithInfoCard
             * @throws OpenIDProviderServiceException : 
         */

        
                public axis2.apache.org.xsd.SignInWithInfoCardResponse signInWithInfoCard
                (
                  axis2.apache.org.xsd.SignInWithInfoCard signInWithInfoCard
                 )
            throws OpenIDProviderServiceException;
        
         }
    
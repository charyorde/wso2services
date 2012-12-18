
/**
 * TokenBasedAuthenticatorSkeletonInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */
    package org.wso2.carbon.identity.authenticator.token;
    /**
     *  TokenBasedAuthenticatorSkeletonInterface java skeleton interface for the axisService
     */
    public interface TokenBasedAuthenticatorSkeletonInterface {
     
         
        /**
         * Auto generated method signature
         * 
                                    * @param isDisabled
         */

        
                public org.wso2.carbon.identity.authenticator.token.IsDisabledResponse isDisabled
                (
                  org.wso2.carbon.identity.authenticator.token.IsDisabled isDisabled
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getPriority
         */

        
                public org.wso2.carbon.identity.authenticator.token.GetPriorityResponse getPriority
                (
                  org.wso2.carbon.identity.authenticator.token.GetPriority getPriority
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param authenticateWithRememberMe
         */

        
                public org.wso2.carbon.identity.authenticator.token.AuthenticateWithRememberMeResponse authenticateWithRememberMe
                (
                  org.wso2.carbon.identity.authenticator.token.AuthenticateWithRememberMe authenticateWithRememberMe
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getAutheticationToken
             * @throws TokenBasedAuthenticatorAuthenticationExceptionException : 
         */

        
                public org.wso2.carbon.identity.authenticator.token.GetAutheticationTokenResponse getAutheticationToken
                (
                  org.wso2.carbon.identity.authenticator.token.GetAutheticationToken getAutheticationToken
                 )
            throws TokenBasedAuthenticatorAuthenticationExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param isAuthenticated
         */

        
                public org.wso2.carbon.identity.authenticator.token.IsAuthenticatedResponse isAuthenticated
                (
                  org.wso2.carbon.identity.authenticator.token.IsAuthenticated isAuthenticated
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getAuthenticatorName
         */

        
                public org.wso2.carbon.identity.authenticator.token.GetAuthenticatorNameResponse getAuthenticatorName
                (
                  org.wso2.carbon.identity.authenticator.token.GetAuthenticatorName getAuthenticatorName
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param isHandle
         */

        
                public org.wso2.carbon.identity.authenticator.token.IsHandleResponse isHandle
                (
                  org.wso2.carbon.identity.authenticator.token.IsHandle isHandle
                 )
            ;
        
         }
    
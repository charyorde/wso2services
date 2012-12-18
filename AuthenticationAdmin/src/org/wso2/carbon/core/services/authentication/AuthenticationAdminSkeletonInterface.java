
/**
 * AuthenticationAdminSkeletonInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */
    package org.wso2.carbon.core.services.authentication;
    /**
     *  AuthenticationAdminSkeletonInterface java skeleton interface for the axisService
     */
    public interface AuthenticationAdminSkeletonInterface {
     
         
        /**
         * Auto generated method signature
         * 
                                    * @param logout
             * @throws AuthenticationAdminAuthenticationExceptionException : 
         */

        
                public void logout
                (
                  org.wso2.carbon.core.services.authentication.Logout logout
                 )
            throws AuthenticationAdminAuthenticationExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param loginWithRememberMeOption
             * @throws AuthenticationAdminAuthenticationExceptionException : 
         */

        
                public org.wso2.carbon.core.services.authentication.LoginWithRememberMeOptionResponse loginWithRememberMeOption
                (
                  org.wso2.carbon.core.services.authentication.LoginWithRememberMeOption loginWithRememberMeOption
                 )
            throws AuthenticationAdminAuthenticationExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param login
             * @throws AuthenticationAdminAuthenticationExceptionException : 
         */

        
                public org.wso2.carbon.core.services.authentication.LoginResponse login
                (
                  org.wso2.carbon.core.services.authentication.Login login
                 )
            throws AuthenticationAdminAuthenticationExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getAuthenticatorName
         */

        
                public org.wso2.carbon.core.services.authentication.GetAuthenticatorNameResponse getAuthenticatorName
                (
                  org.wso2.carbon.core.services.authentication.GetAuthenticatorName getAuthenticatorName
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getPriority
         */

        
                public org.wso2.carbon.core.services.authentication.GetPriorityResponse getPriority
                (
                  org.wso2.carbon.core.services.authentication.GetPriority getPriority
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param isDisabled
         */

        
                public org.wso2.carbon.core.services.authentication.IsDisabledResponse isDisabled
                (
                  org.wso2.carbon.core.services.authentication.IsDisabled isDisabled
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param authenticateWithRememberMe
         */

        
                public org.wso2.carbon.core.services.authentication.AuthenticateWithRememberMeResponse authenticateWithRememberMe
                (
                  org.wso2.carbon.core.services.authentication.AuthenticateWithRememberMe authenticateWithRememberMe
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param loginWithRememberMeCookie
         */

        
                public org.wso2.carbon.core.services.authentication.LoginWithRememberMeCookieResponse loginWithRememberMeCookie
                (
                  org.wso2.carbon.core.services.authentication.LoginWithRememberMeCookie loginWithRememberMeCookie
                 )
            ;
        
         }
    
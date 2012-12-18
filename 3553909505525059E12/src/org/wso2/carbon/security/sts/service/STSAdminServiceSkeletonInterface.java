
/**
 * STSAdminServiceSkeletonInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */
    package org.wso2.carbon.security.sts.service;
    /**
     *  STSAdminServiceSkeletonInterface java skeleton interface for the axisService
     */
    public interface STSAdminServiceSkeletonInterface {
     
         
        /**
         * Auto generated method signature
         * 
                                    * @param removeTrustedService
             * @throws STSAdminServiceSecurityConfigExceptionException : 
         */

        
                public void removeTrustedService
                (
                  org.wso2.carbon.security.sts.service.RemoveTrustedService removeTrustedService
                 )
            throws STSAdminServiceSecurityConfigExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param addTrustedService
             * @throws STSAdminServiceSecurityConfigExceptionException : 
         */

        
                public void addTrustedService
                (
                  org.wso2.carbon.security.sts.service.AddTrustedService addTrustedService
                 )
            throws STSAdminServiceSecurityConfigExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param setProofKeyType
             * @throws STSAdminServiceSecurityConfigExceptionException : 
         */

        
                public void setProofKeyType
                (
                  org.wso2.carbon.security.sts.service.SetProofKeyType setProofKeyType
                 )
            throws STSAdminServiceSecurityConfigExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getProofKeyType
             * @throws STSAdminServiceSecurityConfigExceptionException : 
         */

        
                public org.wso2.carbon.security.sts.service.GetProofKeyTypeResponse getProofKeyType
                (
                  org.wso2.carbon.security.sts.service.GetProofKeyType getProofKeyType
                 )
            throws STSAdminServiceSecurityConfigExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getCertAliasOfPrimaryKeyStore
             * @throws STSAdminServiceSecurityConfigExceptionException : 
         */

        
                public org.wso2.carbon.security.sts.service.GetCertAliasOfPrimaryKeyStoreResponse getCertAliasOfPrimaryKeyStore
                (
                  org.wso2.carbon.security.sts.service.GetCertAliasOfPrimaryKeyStore getCertAliasOfPrimaryKeyStore
                 )
            throws STSAdminServiceSecurityConfigExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getTrustedServices
             * @throws STSAdminServiceSecurityConfigExceptionException : 
         */

        
                public org.wso2.carbon.security.sts.service.GetTrustedServicesResponse getTrustedServices
                (
                  org.wso2.carbon.security.sts.service.GetTrustedServices getTrustedServices
                 )
            throws STSAdminServiceSecurityConfigExceptionException;
        
         }
    

/**
 * KeyStoreAdminServiceSkeletonInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */
    package org.wso2.carbon.security.keystore.service;
    /**
     *  KeyStoreAdminServiceSkeletonInterface java skeleton interface for the axisService
     */
    public interface KeyStoreAdminServiceSkeletonInterface {
     
         
        /**
         * Auto generated method signature
         * 
                                    * @param getStoreEntries
             * @throws KeyStoreAdminServiceSecurityConfigExceptionException : 
         */

        
                public org.wso2.carbon.security.keystore.service.GetStoreEntriesResponse getStoreEntries
                (
                  org.wso2.carbon.security.keystore.service.GetStoreEntries getStoreEntries
                 )
            throws KeyStoreAdminServiceSecurityConfigExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param addKeyStore
             * @throws KeyStoreAdminServiceSecurityConfigExceptionException : 
         */

        
                public void addKeyStore
                (
                  org.wso2.carbon.security.keystore.service.AddKeyStore addKeyStore
                 )
            throws KeyStoreAdminServiceSecurityConfigExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param importCertToStore
             * @throws KeyStoreAdminServiceSecurityConfigExceptionException : 
         */

        
                public void importCertToStore
                (
                  org.wso2.carbon.security.keystore.service.ImportCertToStore importCertToStore
                 )
            throws KeyStoreAdminServiceSecurityConfigExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getKeystoreInfo
             * @throws KeyStoreAdminServiceSecurityConfigExceptionException : 
         */

        
                public org.wso2.carbon.security.keystore.service.GetKeystoreInfoResponse getKeystoreInfo
                (
                  org.wso2.carbon.security.keystore.service.GetKeystoreInfo getKeystoreInfo
                 )
            throws KeyStoreAdminServiceSecurityConfigExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param deleteStore
             * @throws KeyStoreAdminServiceSecurityConfigExceptionException : 
         */

        
                public void deleteStore
                (
                  org.wso2.carbon.security.keystore.service.DeleteStore deleteStore
                 )
            throws KeyStoreAdminServiceSecurityConfigExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getKeyStores
             * @throws KeyStoreAdminServiceSecurityConfigExceptionException : 
         */

        
                public org.wso2.carbon.security.keystore.service.GetKeyStoresResponse getKeyStores
                (
                  org.wso2.carbon.security.keystore.service.GetKeyStores getKeyStores
                 )
            throws KeyStoreAdminServiceSecurityConfigExceptionException;
        
         }
    
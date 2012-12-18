
/**
 * IdentitySAMLSSOConfigServiceSkeletonInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */
    package org.wso2.carbon.identity.sso.saml;
    /**
     *  IdentitySAMLSSOConfigServiceSkeletonInterface java skeleton interface for the axisService
     */
    public interface IdentitySAMLSSOConfigServiceSkeletonInterface {
     
         
        /**
         * Auto generated method signature
         * 
                                    * @param removeServiceProvider
             * @throws IdentitySAMLSSOConfigServiceIdentityException : 
         */

        
                public axis2.apache.org.xsd.RemoveServiceProviderResponse removeServiceProvider
                (
                  axis2.apache.org.xsd.RemoveServiceProvider removeServiceProvider
                 )
            throws IdentitySAMLSSOConfigServiceIdentityException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getServiceProviders
             * @throws IdentitySAMLSSOConfigServiceIdentityException : 
         */

        
                public axis2.apache.org.xsd.GetServiceProvidersResponse getServiceProviders
                (
                  axis2.apache.org.xsd.GetServiceProviders getServiceProviders
                 )
            throws IdentitySAMLSSOConfigServiceIdentityException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getCertAliasOfPrimaryKeyStore
             * @throws IdentitySAMLSSOConfigServiceIdentityException : 
         */

        
                public axis2.apache.org.xsd.GetCertAliasOfPrimaryKeyStoreResponse getCertAliasOfPrimaryKeyStore
                (
                  axis2.apache.org.xsd.GetCertAliasOfPrimaryKeyStore getCertAliasOfPrimaryKeyStore
                 )
            throws IdentitySAMLSSOConfigServiceIdentityException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param addRPServiceProvider
             * @throws IdentitySAMLSSOConfigServiceIdentityException : 
         */

        
                public axis2.apache.org.xsd.AddRPServiceProviderResponse addRPServiceProvider
                (
                  axis2.apache.org.xsd.AddRPServiceProvider addRPServiceProvider
                 )
            throws IdentitySAMLSSOConfigServiceIdentityException;
        
         }
    
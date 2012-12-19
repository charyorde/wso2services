
/**
 * ListMetadataServiceSkeletonInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */
    package org.wso2.carbon.governance.list.services;
    /**
     *  ListMetadataServiceSkeletonInterface java skeleton interface for the axisService
     */
    public interface ListMetadataServiceSkeletonInterface {
     
         
        /**
         * Auto generated method signature
         * 
                                    * @param listschema
             * @throws ListMetadataServiceRegistryExceptionException : 
         */

        
                public org.wso2.carbon.governance.list.services.ListschemaResponse listschema
                (
                  org.wso2.carbon.governance.list.services.Listschema listschema
                 )
            throws ListMetadataServiceRegistryExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param listpolicies
             * @throws ListMetadataServiceRegistryExceptionException : 
         */

        
                public org.wso2.carbon.governance.list.services.ListpoliciesResponse listpolicies
                (
                  org.wso2.carbon.governance.list.services.Listpolicies listpolicies
                 )
            throws ListMetadataServiceRegistryExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param listwsdls
             * @throws ListMetadataServiceRegistryExceptionException : 
         */

        
                public org.wso2.carbon.governance.list.services.ListwsdlsResponse listwsdls
                (
                  org.wso2.carbon.governance.list.services.Listwsdls listwsdls
                 )
            throws ListMetadataServiceRegistryExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param listservices
             * @throws ListMetadataServiceRegistryExceptionException : 
         */

        
                public org.wso2.carbon.governance.list.services.ListservicesResponse listservices
                (
                  org.wso2.carbon.governance.list.services.Listservices listservices
                 )
            throws ListMetadataServiceRegistryExceptionException;
        
         }
    
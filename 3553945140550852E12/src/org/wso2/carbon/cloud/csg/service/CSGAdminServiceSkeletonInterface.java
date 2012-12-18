
/**
 * CSGAdminServiceSkeletonInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */
    package org.wso2.carbon.cloud.csg.service;
    /**
     *  CSGAdminServiceSkeletonInterface java skeleton interface for the axisService
     */
    public interface CSGAdminServiceSkeletonInterface {
     
         
        /**
         * Auto generated method signature
         * 
                                    * @param createOrUpdateServerQpidJNDIFile
             * @throws CSGAdminServiceCSGException : 
         */

        
                public void createOrUpdateServerQpidJNDIFile
                (
                  synapse.apache.org.xsd.CreateOrUpdateServerQpidJNDIFile createOrUpdateServerQpidJNDIFile
                 )
            throws CSGAdminServiceCSGException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param createOrUpdateServerRegistryJNDI
             * @throws CSGAdminServiceCSGException : 
         */

        
                public void createOrUpdateServerRegistryJNDI
                (
                  synapse.apache.org.xsd.CreateOrUpdateServerRegistryJNDI createOrUpdateServerRegistryJNDI
                 )
            throws CSGAdminServiceCSGException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getRemoteConnectionURL
         */

        
                public synapse.apache.org.xsd.GetRemoteConnectionURLResponse getRemoteConnectionURL
                (
                  synapse.apache.org.xsd.GetRemoteConnectionURL getRemoteConnectionURL
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param deployProxy
             * @throws CSGAdminServiceCSGException : 
         */

        
                public void deployProxy
                (
                  synapse.apache.org.xsd.DeployProxy deployProxy
                 )
            throws CSGAdminServiceCSGException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param unDeployProxy
             * @throws CSGAdminServiceCSGException : 
         */

        
                public void unDeployProxy
                (
                  synapse.apache.org.xsd.UnDeployProxy unDeployProxy
                 )
            throws CSGAdminServiceCSGException;
        
         }
    
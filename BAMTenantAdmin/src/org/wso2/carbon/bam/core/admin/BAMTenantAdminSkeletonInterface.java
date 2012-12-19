
/**
 * BAMTenantAdminSkeletonInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */
    package org.wso2.carbon.bam.core.admin;
    /**
     *  BAMTenantAdminSkeletonInterface java skeleton interface for the axisService
     */
    public interface BAMTenantAdminSkeletonInterface {
     
         
        /**
         * Auto generated method signature
         * 
                                    * @param getTenantId
             * @throws BAMTenantAdminBAMException : 
         */

        
                public axis2.apache.org.xsd.GetTenantIdResponse getTenantId
                (
                  axis2.apache.org.xsd.GetTenantId getTenantId
                 )
            throws BAMTenantAdminBAMException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getTenant
             * @throws BAMTenantAdminBAMException : 
         */

        
                public axis2.apache.org.xsd.GetTenantResponse getTenant
                (
                  axis2.apache.org.xsd.GetTenant getTenant
                 )
            throws BAMTenantAdminBAMException;
        
         }
    
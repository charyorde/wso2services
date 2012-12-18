
/**
 * IdentitySTSAdminServiceSkeletonInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */
    package org.wso2.carbon.identity.sts.mgt;
    /**
     *  IdentitySTSAdminServiceSkeletonInterface java skeleton interface for the axisService
     */
    public interface IdentitySTSAdminServiceSkeletonInterface {
     
         
        /**
         * Auto generated method signature
         * 
                                    * @param readCardIssuerConfiguration
             * @throws IdentitySTSAdminServiceException : 
         */

        
                public axis2.apache.org.xsd.ReadCardIssuerConfigurationResponse readCardIssuerConfiguration
                (
                  axis2.apache.org.xsd.ReadCardIssuerConfiguration readCardIssuerConfiguration
                 )
            throws IdentitySTSAdminServiceException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param updateCardIssueConfiguration
             * @throws IdentitySTSAdminServiceException : 
         */

        
                public void updateCardIssueConfiguration
                (
                  axis2.apache.org.xsd.UpdateCardIssueConfiguration updateCardIssueConfiguration
                 )
            throws IdentitySTSAdminServiceException;
        
         }
    
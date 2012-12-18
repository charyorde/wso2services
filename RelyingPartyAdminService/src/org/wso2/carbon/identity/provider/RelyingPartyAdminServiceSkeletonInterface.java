
/**
 * RelyingPartyAdminServiceSkeletonInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */
    package org.wso2.carbon.identity.provider;
    /**
     *  RelyingPartyAdminServiceSkeletonInterface java skeleton interface for the axisService
     */
    public interface RelyingPartyAdminServiceSkeletonInterface {
     
         
        /**
         * Auto generated method signature
         * 
                                    * @param removeUserTrustedRelyingParty
             * @throws RelyingPartyAdminServiceException : 
         */

        
                public void removeUserTrustedRelyingParty
                (
                  axis2.apache.org.xsd.RemoveUserTrustedRelyingParty removeUserTrustedRelyingParty
                 )
            throws RelyingPartyAdminServiceException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getAllUserTrustedRelyingParties
             * @throws RelyingPartyAdminServiceException : 
         */

        
                public axis2.apache.org.xsd.GetAllUserTrustedRelyingPartiesResponse getAllUserTrustedRelyingParties
                (
                  axis2.apache.org.xsd.GetAllUserTrustedRelyingParties getAllUserTrustedRelyingParties
                 )
            throws RelyingPartyAdminServiceException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param createUserTrustedRP
             * @throws RelyingPartyAdminServiceException : 
         */

        
                public void createUserTrustedRP
                (
                  axis2.apache.org.xsd.CreateUserTrustedRP createUserTrustedRP
                 )
            throws RelyingPartyAdminServiceException;
        
         }
    
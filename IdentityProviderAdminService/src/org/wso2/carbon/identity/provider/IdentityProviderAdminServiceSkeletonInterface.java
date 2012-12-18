
/**
 * IdentityProviderAdminServiceSkeletonInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */
    package org.wso2.carbon.identity.provider;
    /**
     *  IdentityProviderAdminServiceSkeletonInterface java skeleton interface for the axisService
     */
    public interface IdentityProviderAdminServiceSkeletonInterface {
     
         
        /**
         * Auto generated method signature
         * 
                                    * @param issueCardForUsername
             * @throws IdentityProviderAdminServiceException : 
         */

        
                public axis2.apache.org.xsd.IssueCardForUsernameResponse issueCardForUsername
                (
                  axis2.apache.org.xsd.IssueCardForUsername issueCardForUsername
                 )
            throws IdentityProviderAdminServiceException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param issueOpenIDInfoCardForUsername
             * @throws IdentityProviderAdminServiceException : 
         */

        
                public axis2.apache.org.xsd.IssueOpenIDInfoCardForUsernameResponse issueOpenIDInfoCardForUsername
                (
                  axis2.apache.org.xsd.IssueOpenIDInfoCardForUsername issueOpenIDInfoCardForUsername
                 )
            throws IdentityProviderAdminServiceException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param issueCardForSelfIssuedCards
             * @throws IdentityProviderAdminServiceException : 
         */

        
                public axis2.apache.org.xsd.IssueCardForSelfIssuedCardsResponse issueCardForSelfIssuedCards
                (
                  axis2.apache.org.xsd.IssueCardForSelfIssuedCards issueCardForSelfIssuedCards
                 )
            throws IdentityProviderAdminServiceException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param extractPrimaryUserName
             * @throws IdentityProviderAdminServiceException : 
         */

        
                public axis2.apache.org.xsd.ExtractPrimaryUserNameResponse extractPrimaryUserName
                (
                  axis2.apache.org.xsd.ExtractPrimaryUserName extractPrimaryUserName
                 )
            throws IdentityProviderAdminServiceException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getAllOpenIDs
             * @throws IdentityProviderAdminServiceException : 
         */

        
                public axis2.apache.org.xsd.GetAllOpenIDsResponse getAllOpenIDs
                (
                  axis2.apache.org.xsd.GetAllOpenIDs getAllOpenIDs
                 )
            throws IdentityProviderAdminServiceException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param removeOpenID
         */

        
                public void removeOpenID
                (
                  axis2.apache.org.xsd.RemoveOpenID removeOpenID
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getPrimaryOpenID
             * @throws IdentityProviderAdminServiceException : 
         */

        
                public axis2.apache.org.xsd.GetPrimaryOpenIDResponse getPrimaryOpenID
                (
                  axis2.apache.org.xsd.GetPrimaryOpenID getPrimaryOpenID
                 )
            throws IdentityProviderAdminServiceException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param issueOpenIDInfoCardForSelfIssuedCard
             * @throws IdentityProviderAdminServiceException : 
         */

        
                public axis2.apache.org.xsd.IssueOpenIDInfoCardForSelfIssuedCardResponse issueOpenIDInfoCardForSelfIssuedCard
                (
                  axis2.apache.org.xsd.IssueOpenIDInfoCardForSelfIssuedCard issueOpenIDInfoCardForSelfIssuedCard
                 )
            throws IdentityProviderAdminServiceException;
        
         }
    
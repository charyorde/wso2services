
/**
 * AccountMgtServiceSkeletonInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */
    package org.wso2.carbon.account.mgt.services;
    /**
     *  AccountMgtServiceSkeletonInterface java skeleton interface for the axisService
     */
    public interface AccountMgtServiceSkeletonInterface {
     
         
        /**
         * Auto generated method signature
         * 
                                    * @param finishedDomainValidation
             * @throws AccountMgtServiceExceptionException : 
         */

        
                public org.wso2.carbon.account.mgt.services.FinishedDomainValidationResponse finishedDomainValidation
                (
                  org.wso2.carbon.account.mgt.services.FinishedDomainValidation finishedDomainValidation
                 )
            throws AccountMgtServiceExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param updateContact
             * @throws AccountMgtServiceExceptionException : 
         */

        
                public void updateContact
                (
                  org.wso2.carbon.account.mgt.services.UpdateContact updateContact
                 )
            throws AccountMgtServiceExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getFullname
             * @throws AccountMgtServiceExceptionException : 
         */

        
                public org.wso2.carbon.account.mgt.services.GetFullnameResponse getFullname
                (
                  org.wso2.carbon.account.mgt.services.GetFullname getFullname
                 )
            throws AccountMgtServiceExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getContact
             * @throws AccountMgtServiceExceptionException : 
         */

        
                public org.wso2.carbon.account.mgt.services.GetContactResponse getContact
                (
                  org.wso2.carbon.account.mgt.services.GetContact getContact
                 )
            throws AccountMgtServiceExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param isEmailValidated
             * @throws AccountMgtServiceExceptionException : 
         */

        
                public org.wso2.carbon.account.mgt.services.IsEmailValidatedResponse isEmailValidated
                (
                  org.wso2.carbon.account.mgt.services.IsEmailValidated isEmailValidated
                 )
            throws AccountMgtServiceExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param isDomainValidated
             * @throws AccountMgtServiceExceptionException : 
         */

        
                public org.wso2.carbon.account.mgt.services.IsDomainValidatedResponse isDomainValidated
                (
                  org.wso2.carbon.account.mgt.services.IsDomainValidated isDomainValidated
                 )
            throws AccountMgtServiceExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param updateFullname
             * @throws AccountMgtServiceExceptionException : 
         */

        
                public org.wso2.carbon.account.mgt.services.UpdateFullnameResponse updateFullname
                (
                  org.wso2.carbon.account.mgt.services.UpdateFullname updateFullname
                 )
            throws AccountMgtServiceExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param deactivate
             * @throws AccountMgtServiceExceptionException : 
         */

        
                public void deactivate
                (
                  org.wso2.carbon.account.mgt.services.Deactivate deactivate
                 )
            throws AccountMgtServiceExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param checkDomainAvailability
             * @throws AccountMgtServiceExceptionException : 
         */

        
                public org.wso2.carbon.account.mgt.services.CheckDomainAvailabilityResponse checkDomainAvailability
                (
                  org.wso2.carbon.account.mgt.services.CheckDomainAvailability checkDomainAvailability
                 )
            throws AccountMgtServiceExceptionException;
        
         }
    
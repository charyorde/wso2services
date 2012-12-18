
/**
 * ValidateDomainServiceSkeletonInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */
    package org.wso2.carbon.validate.domain.services;
    /**
     *  ValidateDomainServiceSkeletonInterface java skeleton interface for the axisService
     */
    public interface ValidateDomainServiceSkeletonInterface {
     
         
        /**
         * Auto generated method signature
         * 
                                    * @param validateByTextInRoot
             * @throws ValidateDomainServiceExceptionException : 
         */

        
                public org.wso2.carbon.validate.domain.services.ValidateByTextInRootResponse validateByTextInRoot
                (
                  org.wso2.carbon.validate.domain.services.ValidateByTextInRoot validateByTextInRoot
                 )
            throws ValidateDomainServiceExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param validateByDNSEntry
             * @throws ValidateDomainServiceExceptionException : 
         */

        
                public org.wso2.carbon.validate.domain.services.ValidateByDNSEntryResponse validateByDNSEntry
                (
                  org.wso2.carbon.validate.domain.services.ValidateByDNSEntry validateByDNSEntry
                 )
            throws ValidateDomainServiceExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getDomainValidationKey
             * @throws ValidateDomainServiceExceptionException : 
         */

        
                public org.wso2.carbon.validate.domain.services.GetDomainValidationKeyResponse getDomainValidationKey
                (
                  org.wso2.carbon.validate.domain.services.GetDomainValidationKey getDomainValidationKey
                 )
            throws ValidateDomainServiceExceptionException;
        
         }
    
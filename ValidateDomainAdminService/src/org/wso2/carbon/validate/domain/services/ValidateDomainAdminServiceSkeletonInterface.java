
/**
 * ValidateDomainAdminServiceSkeletonInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */
    package org.wso2.carbon.validate.domain.services;
    /**
     *  ValidateDomainAdminServiceSkeletonInterface java skeleton interface for the axisService
     */
    public interface ValidateDomainAdminServiceSkeletonInterface {
     
         
        /**
         * Auto generated method signature
         * 
                                    * @param validateByTextInRoot
             * @throws ValidateDomainAdminServiceExceptionException : 
         */

        
                public org.wso2.carbon.validate.domain.services.ValidateByTextInRootResponse validateByTextInRoot
                (
                  org.wso2.carbon.validate.domain.services.ValidateByTextInRoot validateByTextInRoot
                 )
            throws ValidateDomainAdminServiceExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param validateByDNSEntry
             * @throws ValidateDomainAdminServiceExceptionException : 
         */

        
                public org.wso2.carbon.validate.domain.services.ValidateByDNSEntryResponse validateByDNSEntry
                (
                  org.wso2.carbon.validate.domain.services.ValidateByDNSEntry validateByDNSEntry
                 )
            throws ValidateDomainAdminServiceExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getDomainValidationKey
             * @throws ValidateDomainAdminServiceExceptionException : 
         */

        
                public org.wso2.carbon.validate.domain.services.GetDomainValidationKeyResponse getDomainValidationKey
                (
                  org.wso2.carbon.validate.domain.services.GetDomainValidationKey getDomainValidationKey
                 )
            throws ValidateDomainAdminServiceExceptionException;
        
         }
    
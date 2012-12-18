
/**
 * ActivationServiceSkeletonInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */
    package org.wso2.carbon.activation.service;
    /**
     *  ActivationServiceSkeletonInterface java skeleton interface for the axisService
     */
    public interface ActivationServiceSkeletonInterface {
     
         
        /**
         * Auto generated method signature
         * 
                                    * @param isActive
             * @throws ActivationServiceExceptionException : 
         */

        
                public org.wso2.carbon.activation.service.IsActiveResponse isActive
                (
                  org.wso2.carbon.activation.service.IsActive isActive
                 )
            throws ActivationServiceExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param updateActivation
             * @throws ActivationServiceExceptionException : 
         */

        
                public void updateActivation
                (
                  org.wso2.carbon.activation.service.UpdateActivation updateActivation
                 )
            throws ActivationServiceExceptionException;
        
         }
    
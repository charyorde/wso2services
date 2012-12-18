
/**
 * CustomUIAdminServiceSkeletonInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */
    package org.wso2.carbon.registry.custom.services;
    /**
     *  CustomUIAdminServiceSkeletonInterface java skeleton interface for the axisService
     */
    public interface CustomUIAdminServiceSkeletonInterface {
     
         
        /**
         * Auto generated method signature
         * 
                                    * @param getTextContent
             * @throws CustomUIAdminServiceExceptionException : 
         */

        
                public org.wso2.carbon.registry.custom.services.GetTextContentResponse getTextContent
                (
                  org.wso2.carbon.registry.custom.services.GetTextContent getTextContent
                 )
            throws CustomUIAdminServiceExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param isAuthorized
         */

        
                public org.wso2.carbon.registry.custom.services.IsAuthorizedResponse isAuthorized
                (
                  org.wso2.carbon.registry.custom.services.IsAuthorized isAuthorized
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param addTextContent
             * @throws CustomUIAdminServiceExceptionException : 
         */

        
                public org.wso2.carbon.registry.custom.services.AddTextContentResponse addTextContent
                (
                  org.wso2.carbon.registry.custom.services.AddTextContent addTextContent
                 )
            throws CustomUIAdminServiceExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param updateTextContent
             * @throws CustomUIAdminServiceExceptionException : 
         */

        
                public org.wso2.carbon.registry.custom.services.UpdateTextContentResponse updateTextContent
                (
                  org.wso2.carbon.registry.custom.services.UpdateTextContent updateTextContent
                 )
            throws CustomUIAdminServiceExceptionException;
        
         }
    

/**
 * DataServiceFileUploaderSkeletonInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */
    package org.wso2.carbon.dataservices.core.admin;
    /**
     *  DataServiceFileUploaderSkeletonInterface java skeleton interface for the axisService
     */
    public interface DataServiceFileUploaderSkeletonInterface {
     
         
        /**
         * Auto generated method signature
         * 
                                    * @param urlWsdlUpload
             * @throws DataServiceFileUploaderExceptionException : 
         */

        
                public org.wso2.carbon.dataservices.core.admin.UrlWsdlUploadResponse urlWsdlUpload
                (
                  org.wso2.carbon.dataservices.core.admin.UrlWsdlUpload urlWsdlUpload
                 )
            throws DataServiceFileUploaderExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param uploadWSDL
             * @throws DataServiceFileUploaderExceptionException : 
         */

        
                public org.wso2.carbon.dataservices.core.admin.UploadWSDLResponse uploadWSDL
                (
                  org.wso2.carbon.dataservices.core.admin.UploadWSDL uploadWSDL
                 )
            throws DataServiceFileUploaderExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param uploadService
             * @throws DataServiceFileUploaderExceptionException : 
         */

        
                public org.wso2.carbon.dataservices.core.admin.UploadServiceResponse uploadService
                (
                  org.wso2.carbon.dataservices.core.admin.UploadService uploadService
                 )
            throws DataServiceFileUploaderExceptionException;
        
         }
    
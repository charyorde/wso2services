
/**
 * ReportingResourcesSupplierSkeletonInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */
    package org.wso2.carbon.reporting.core.services;
    /**
     *  ReportingResourcesSupplierSkeletonInterface java skeleton interface for the axisService
     */
    public interface ReportingResourcesSupplierSkeletonInterface {
     
         
        /**
         * Auto generated method signature
         * 
                                    * @param deleteReportTemplate
             * @throws ReportingResourcesSupplierReportingExceptionException : 
         */

        
                public void deleteReportTemplate
                (
                  org.wso2.carbon.reporting.core.services.DeleteReportTemplate deleteReportTemplate
                 )
            throws ReportingResourcesSupplierReportingExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getReportParam
             * @throws ReportingResourcesSupplierReportingExceptionException : 
             * @throws ReportingResourcesSupplierXMLStreamExceptionException : 
         */

        
                public org.wso2.carbon.reporting.core.services.GetReportParamResponse getReportParam
                (
                  org.wso2.carbon.reporting.core.services.GetReportParam getReportParam
                 )
            throws ReportingResourcesSupplierReportingExceptionException,ReportingResourcesSupplierXMLStreamExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param updateReport
             * @throws ReportingResourcesSupplierReportingExceptionException : 
             * @throws ReportingResourcesSupplierJRExceptionException : 
         */

        
                public org.wso2.carbon.reporting.core.services.UpdateReportResponse updateReport
                (
                  org.wso2.carbon.reporting.core.services.UpdateReport updateReport
                 )
            throws ReportingResourcesSupplierReportingExceptionException,ReportingResourcesSupplierJRExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getReportResources
             * @throws ReportingResourcesSupplierReportingExceptionException : 
         */

        
                public org.wso2.carbon.reporting.core.services.GetReportResourcesResponse getReportResources
                (
                  org.wso2.carbon.reporting.core.services.GetReportResources getReportResources
                 )
            throws ReportingResourcesSupplierReportingExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getAllReports
             * @throws ReportingResourcesSupplierReportingExceptionException : 
         */

        
                public org.wso2.carbon.reporting.core.services.GetAllReportsResponse getAllReports
                (
                  org.wso2.carbon.reporting.core.services.GetAllReports getAllReports
                 )
            throws ReportingResourcesSupplierReportingExceptionException;
        
         }
    
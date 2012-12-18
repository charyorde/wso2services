
/**
 * OperationAdminSkeletonInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */
    package org.wso2.carbon.operation.mgt;
    /**
     *  OperationAdminSkeletonInterface java skeleton interface for the axisService
     */
    public interface OperationAdminSkeletonInterface {
     
         
        /**
         * Auto generated method signature
         * 
                                    * @param listOperationPhaseHandlers
         */

        
                public axis2.apache.org.xsd.ListOperationPhaseHandlersResponse listOperationPhaseHandlers
                (
                  axis2.apache.org.xsd.ListOperationPhaseHandlers listOperationPhaseHandlers
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param listOperationPhases
         */

        
                public axis2.apache.org.xsd.ListOperationPhasesResponse listOperationPhases
                (
                  axis2.apache.org.xsd.ListOperationPhases listOperationPhases
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param listControlOperations
         */

        
                public axis2.apache.org.xsd.ListControlOperationsResponse listControlOperations
                (
                  axis2.apache.org.xsd.ListControlOperations listControlOperations
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getDeclaredOperationParameters
         */

        
                public axis2.apache.org.xsd.GetDeclaredOperationParametersResponse getDeclaredOperationParameters
                (
                  axis2.apache.org.xsd.GetDeclaredOperationParameters getDeclaredOperationParameters
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param listAllOperations
         */

        
                public axis2.apache.org.xsd.ListAllOperationsResponse listAllOperations
                (
                  axis2.apache.org.xsd.ListAllOperations listAllOperations
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param configureMTOM
         */

        
                public void configureMTOM
                (
                  axis2.apache.org.xsd.ConfigureMTOM configureMTOM
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getOperationMetaData
         */

        
                public axis2.apache.org.xsd.GetOperationMetaDataResponse getOperationMetaData
                (
                  axis2.apache.org.xsd.GetOperationMetaData getOperationMetaData
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getOperationParameters
         */

        
                public axis2.apache.org.xsd.GetOperationParametersResponse getOperationParameters
                (
                  axis2.apache.org.xsd.GetOperationParameters getOperationParameters
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param removeOperationParameter
         */

        
                public void removeOperationParameter
                (
                  axis2.apache.org.xsd.RemoveOperationParameter removeOperationParameter
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getOperationStatistics
         */

        
                public axis2.apache.org.xsd.GetOperationStatisticsResponse getOperationStatistics
                (
                  axis2.apache.org.xsd.GetOperationStatistics getOperationStatistics
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param listPublishedOperations
         */

        
                public axis2.apache.org.xsd.ListPublishedOperationsResponse listPublishedOperations
                (
                  axis2.apache.org.xsd.ListPublishedOperations listPublishedOperations
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param setOperationParameters
         */

        
                public void setOperationParameters
                (
                  axis2.apache.org.xsd.SetOperationParameters setOperationParameters
                 )
            ;
        
         }
    
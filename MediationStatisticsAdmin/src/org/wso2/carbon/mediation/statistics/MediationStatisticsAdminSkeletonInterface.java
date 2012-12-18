
/**
 * MediationStatisticsAdminSkeletonInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */
    package org.wso2.carbon.mediation.statistics;
    /**
     *  MediationStatisticsAdminSkeletonInterface java skeleton interface for the axisService
     */
    public interface MediationStatisticsAdminSkeletonInterface {
     
         
        /**
         * Auto generated method signature
         * 
                                    * @param getEndPointStatistics
         */

        
                public org.wso2.carbon.mediation.statistics.GetEndPointStatisticsResponse getEndPointStatistics
                (
                  org.wso2.carbon.mediation.statistics.GetEndPointStatistics getEndPointStatistics
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getDataForGraph
             * @throws MediationStatisticsAdminMediationStatisticsExceptionException : 
         */

        
                public org.wso2.carbon.mediation.statistics.GetDataForGraphResponse getDataForGraph
                (
                  org.wso2.carbon.mediation.statistics.GetDataForGraph getDataForGraph
                 )
            throws MediationStatisticsAdminMediationStatisticsExceptionException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getServerStatistics
         */

        
                public org.wso2.carbon.mediation.statistics.GetServerStatisticsResponse getServerStatistics
                (
                  org.wso2.carbon.mediation.statistics.GetServerStatistics getServerStatistics
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param listEndPoint
         */

        
                public org.wso2.carbon.mediation.statistics.ListEndPointResponse listEndPoint
                (
                  org.wso2.carbon.mediation.statistics.ListEndPoint listEndPoint
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getSequenceStatistics
         */

        
                public org.wso2.carbon.mediation.statistics.GetSequenceStatisticsResponse getSequenceStatistics
                (
                  org.wso2.carbon.mediation.statistics.GetSequenceStatistics getSequenceStatistics
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param listServers
         */

        
                public org.wso2.carbon.mediation.statistics.ListServersResponse listServers
                (
                  org.wso2.carbon.mediation.statistics.ListServers listServers
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getCategoryStatistics
         */

        
                public org.wso2.carbon.mediation.statistics.GetCategoryStatisticsResponse getCategoryStatistics
                (
                  org.wso2.carbon.mediation.statistics.GetCategoryStatistics getCategoryStatistics
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param listSequence
         */

        
                public org.wso2.carbon.mediation.statistics.ListSequenceResponse listSequence
                (
                  org.wso2.carbon.mediation.statistics.ListSequence listSequence
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param listProxyServices
         */

        
                public org.wso2.carbon.mediation.statistics.ListProxyServicesResponse listProxyServices
                (
                  org.wso2.carbon.mediation.statistics.ListProxyServices listProxyServices
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getProxyServiceStatistics
         */

        
                public org.wso2.carbon.mediation.statistics.GetProxyServiceStatisticsResponse getProxyServiceStatistics
                (
                  org.wso2.carbon.mediation.statistics.GetProxyServiceStatistics getProxyServiceStatistics
                 )
            ;
        
         }
    
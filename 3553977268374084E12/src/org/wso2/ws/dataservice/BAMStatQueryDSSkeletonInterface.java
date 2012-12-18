
/**
 * BAMStatQueryDSSkeletonInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */
    package org.wso2.ws.dataservice;
    /**
     *  BAMStatQueryDSSkeletonInterface java skeleton interface for the axisService
     */
    public interface BAMStatQueryDSSkeletonInterface {
     
         
        /**
         * Auto generated method signature
         * 
                                    * @param getLatestOutFaultCountForProxy
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.FaultCountsE getLatestOutFaultCountForProxy
                (
                  org.wso2.carbon.bam.GetLatestOutFaultCountForProxy getLatestOutFaultCountForProxy
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getOperationsForOperationID
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.OperationsE getOperationsForOperationID
                (
                  org.wso2.carbon.bam.GetOperationsForOperationID getOperationsForOperationID
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getAllOperationsForTimeRange
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.AllActivityMsgOperationsE getAllOperationsForTimeRange
                (
                  org.wso2.carbon.bam.GetAllOperationsForTimeRange getAllOperationsForTimeRange
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getLatestMinimumResponseTimeForOperation
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.TimesE getLatestMinimumResponseTimeForOperation
                (
                  org.wso2.carbon.bam.GetLatestMinimumResponseTimeForOperation getLatestMinimumResponseTimeForOperation
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getActivityDetailsForActivity
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.ActivityGroupsForTimeE getActivityDetailsForActivity
                (
                  org.wso2.carbon.bam.GetActivityDetailsForActivity getActivityDetailsForActivity
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getLatestMinimumResponseTimeForServer
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.TimesE getLatestMinimumResponseTimeForServer
                (
                  org.wso2.carbon.bam.GetLatestMinimumResponseTimeForServer getLatestMinimumResponseTimeForServer
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getLatestMaximumResponseTimeForServer
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.TimesE getLatestMaximumResponseTimeForServer
                (
                  org.wso2.carbon.bam.GetLatestMaximumResponseTimeForServer getLatestMaximumResponseTimeForServer
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getLatestInFaultCountForSequence
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.FaultCountsE getLatestInFaultCountForSequence
                (
                  org.wso2.carbon.bam.GetLatestInFaultCountForSequence getLatestInFaultCountForSequence
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getServerIdForServer
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.ServersE getServerIdForServer
                (
                  org.wso2.carbon.bam.GetServerIdForServer getServerIdForServer
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getCountofChildrenFailedMessages
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.CountofChildrenFailedMessagesE getCountofChildrenFailedMessages
                (
                  org.wso2.carbon.bam.GetCountofChildrenFailedMessages getCountofChildrenFailedMessages
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getAllMessagesForTimeRangeAndActivity
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.AllMessagesForActivitiesE getAllMessagesForTimeRangeAndActivity
                (
                  org.wso2.carbon.bam.GetAllMessagesForTimeRangeAndActivity getAllMessagesForTimeRangeAndActivity
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getOperationIDForMessageID
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.OperationIDsE getOperationIDForMessageID
                (
                  org.wso2.carbon.bam.GetOperationIDForMessageID getOperationIDForMessageID
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getLatestMaximumResponseTimeForOperation
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.TimesE getLatestMaximumResponseTimeForOperation
                (
                  org.wso2.carbon.bam.GetLatestMaximumResponseTimeForOperation getLatestMaximumResponseTimeForOperation
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getOperations
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.OperationsE getOperations
                (
                  org.wso2.carbon.bam.GetOperations getOperations
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getLatestInMinimumProcessingTimeForEndpoint
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.MinimumTimesE getLatestInMinimumProcessingTimeForEndpoint
                (
                  org.wso2.carbon.bam.GetLatestInMinimumProcessingTimeForEndpoint getLatestInMinimumProcessingTimeForEndpoint
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getLatestResponseCountForOperation
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.CountsE getLatestResponseCountForOperation
                (
                  org.wso2.carbon.bam.GetLatestResponseCountForOperation getLatestResponseCountForOperation
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getMaximumOperationsForAnActivityID
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.NumsE getMaximumOperationsForAnActivityID
                (
                  org.wso2.carbon.bam.GetMaximumOperationsForAnActivityID getMaximumOperationsForAnActivityID
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param gettimestampForOperation
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.TimeStampsForOperationE gettimestampForOperation
                (
                  org.wso2.carbon.bam.GettimestampForOperation gettimestampForOperation
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param setParentStatus
             * @throws DataServiceFaultException : 
         */

        
                public void setParentStatus
                (
                  org.wso2.ws.dataservice.SetParentStatus setParentStatus
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getJMXMetricsWindow
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.JmxMetricsInfosE getJMXMetricsWindow
                (
                  org.wso2.carbon.bam.GetJMXMetricsWindow getJMXMetricsWindow
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getLatestInFaultCountForProxy
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.FaultCountsE getLatestInFaultCountForProxy
                (
                  org.wso2.carbon.bam.GetLatestInFaultCountForProxy getLatestInFaultCountForProxy
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getAleauditFailCount
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.AleauditFailCountListE getAleauditFailCount
                (
                  org.wso2.carbon.bam.GetAleauditFailCount getAleauditFailCount
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getLatestInMaximumProcessingTimeForProxy
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.MaximumTimesE getLatestInMaximumProcessingTimeForProxy
                (
                  org.wso2.carbon.bam.GetLatestInMaximumProcessingTimeForProxy getLatestInMaximumProcessingTimeForProxy
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getLatestAverageResponseTimeForService
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.TimesE getLatestAverageResponseTimeForService
                (
                  org.wso2.carbon.bam.GetLatestAverageResponseTimeForService getLatestAverageResponseTimeForService
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getPropertyChildrenForActivity
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.PropertyChildrenForActivityE getPropertyChildrenForActivity
                (
                  org.wso2.carbon.bam.GetPropertyChildrenForActivity getPropertyChildrenForActivity
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getLatestDataForService
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.ServiceDataE getLatestDataForService
                (
                  org.wso2.carbon.bam.GetLatestDataForService getLatestDataForService
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getActivityDetailsForServer
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.ActivitiesForServerE getActivityDetailsForServer
                (
                  org.wso2.carbon.bam.GetActivityDetailsForServer getActivityDetailsForServer
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getDetailsForActivity
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.ActivitiesE getDetailsForActivity
                (
                  org.wso2.carbon.bam.GetDetailsForActivity getDetailsForActivity
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getEndpoints
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.EndpointsE getEndpoints
                (
                  org.wso2.carbon.bam.GetEndpoints getEndpoints
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getLatestOutMinimumProcessingTimeForSequence
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.MinimumTimesE getLatestOutMinimumProcessingTimeForSequence
                (
                  org.wso2.carbon.bam.GetLatestOutMinimumProcessingTimeForSequence getLatestOutMinimumProcessingTimeForSequence
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getActivityDetailsForTimeRange
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.ActivitiesForTimeE getActivityDetailsForTimeRange
                (
                  org.wso2.carbon.bam.GetActivityDetailsForTimeRange getActivityDetailsForTimeRange
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getLatestOutMinimumProcessingTimeForProxy
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.MinimumTimesE getLatestOutMinimumProcessingTimeForProxy
                (
                  org.wso2.carbon.bam.GetLatestOutMinimumProcessingTimeForProxy getLatestOutMinimumProcessingTimeForProxy
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getAleauditMessagesForSAP
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.SAPaleauditsE getAleauditMessagesForSAP
                (
                  org.wso2.carbon.bam.GetAleauditMessagesForSAP getAleauditMessagesForSAP
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getLatestInAverageProcessingTimeForProxy
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.AverageTimesE getLatestInAverageProcessingTimeForProxy
                (
                  org.wso2.carbon.bam.GetLatestInAverageProcessingTimeForProxy getLatestInAverageProcessingTimeForProxy
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getServerListForActivity
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.ServersForActivityE getServerListForActivity
                (
                  org.wso2.carbon.bam.GetServerListForActivity getServerListForActivity
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getMessageCount
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.MessageCountsE getMessageCount
                (
                  org.wso2.carbon.bam.GetMessageCount getMessageCount
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getpropertyBagForActivity
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.PropertyBagsE getpropertyBagForActivity
                (
                  org.wso2.carbon.bam.GetpropertyBagForActivity getpropertyBagForActivity
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getLastMinuteRequestCountSystem
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.CountsE getLastMinuteRequestCountSystem
                (
                  org.wso2.carbon.bam.GetLastMinuteRequestCountSystem getLastMinuteRequestCountSystem
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getLatestInMinimumProcessingTimeForSequence
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.MinimumTimesE getLatestInMinimumProcessingTimeForSequence
                (
                  org.wso2.carbon.bam.GetLatestInMinimumProcessingTimeForSequence getLatestInMinimumProcessingTimeForSequence
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getPropertyValueForStatus
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.StatusListE getPropertyValueForStatus
                (
                  org.wso2.carbon.bam.GetPropertyValueForStatus getPropertyValueForStatus
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getMessagesForStatus
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.MessageIdListE getMessagesForStatus
                (
                  org.wso2.carbon.bam.GetMessagesForStatus getMessagesForStatus
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getLatestOutMaximumProcessingTimeForSequence
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.MaximumTimesE getLatestOutMaximumProcessingTimeForSequence
                (
                  org.wso2.carbon.bam.GetLatestOutMaximumProcessingTimeForSequence getLatestOutMaximumProcessingTimeForSequence
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getLatestResponseCountForServer
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.CountsE getLatestResponseCountForServer
                (
                  org.wso2.carbon.bam.GetLatestResponseCountForServer getLatestResponseCountForServer
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getMaxResponseTimeSystem
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.TimesE getMaxResponseTimeSystem
                (
                  org.wso2.carbon.bam.GetMaxResponseTimeSystem getMaxResponseTimeSystem
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getLatestRequestCountForServer
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.CountsE getLatestRequestCountForServer
                (
                  org.wso2.carbon.bam.GetLatestRequestCountForServer getLatestRequestCountForServer
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getAllActivityDataForTimeRange
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.FullActivityDatasE getAllActivityDataForTimeRange
                (
                  org.wso2.carbon.bam.GetAllActivityDataForTimeRange getAllActivityDataForTimeRange
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getLatestResponseCountForService
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.CountsE getLatestResponseCountForService
                (
                  org.wso2.carbon.bam.GetLatestResponseCountForService getLatestResponseCountForService
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getDirectionForOperation
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.DirectionsForOperationE getDirectionForOperation
                (
                  org.wso2.carbon.bam.GetDirectionForOperation getDirectionForOperation
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getAllIpAddressForTimeRange
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.AllIpAddressesE getAllIpAddressForTimeRange
                (
                  org.wso2.carbon.bam.GetAllIpAddressForTimeRange getAllIpAddressForTimeRange
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getReqResFaultCountForServices
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.ServicesE getReqResFaultCountForServices
                (
                  org.wso2.carbon.bam.GetReqResFaultCountForServices getReqResFaultCountForServices
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getMessageForMessageID
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.MessagesForMessageIDE getMessageForMessageID
                (
                  org.wso2.carbon.bam.GetMessageForMessageID getMessageForMessageID
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getMessagesCountForOperationIDAndActivityID
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.CountMessagessE getMessagesCountForOperationIDAndActivityID
                (
                  org.wso2.carbon.bam.GetMessagesCountForOperationIDAndActivityID getMessagesCountForOperationIDAndActivityID
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getLatestFaultCountForOperation
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.CountsE getLatestFaultCountForOperation
                (
                  org.wso2.carbon.bam.GetLatestFaultCountForOperation getLatestFaultCountForOperation
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getPropertyList
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.PropertiesE getPropertyList
                (
                  org.wso2.carbon.bam.GetPropertyList getPropertyList
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getLatestMaximumResponseTimeForService
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.TimesE getLatestMaximumResponseTimeForService
                (
                  org.wso2.carbon.bam.GetLatestMaximumResponseTimeForService getLatestMaximumResponseTimeForService
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getLatestInFaultCountForEndpoint
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.FaultCountsE getLatestInFaultCountForEndpoint
                (
                  org.wso2.carbon.bam.GetLatestInFaultCountForEndpoint getLatestInFaultCountForEndpoint
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getMessagesForOperationIDAndActivityID
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.MessagesE getMessagesForOperationIDAndActivityID
                (
                  org.wso2.carbon.bam.GetMessagesForOperationIDAndActivityID getMessagesForOperationIDAndActivityID
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getAllMessagesForTimeRange
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.AllMessagesE getAllMessagesForTimeRange
                (
                  org.wso2.carbon.bam.GetAllMessagesForTimeRange getAllMessagesForTimeRange
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getLatestInMaximumProcessingTimeForSequence
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.MaximumTimesE getLatestInMaximumProcessingTimeForSequence
                (
                  org.wso2.carbon.bam.GetLatestInMaximumProcessingTimeForSequence getLatestInMaximumProcessingTimeForSequence
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getActivityInfoForActivityID
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.ActivityInfosE getActivityInfoForActivityID
                (
                  org.wso2.carbon.bam.GetActivityInfoForActivityID getActivityInfoForActivityID
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getOperationForActivityID
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.ActivityOperationsE getOperationForActivityID
                (
                  org.wso2.carbon.bam.GetOperationForActivityID getOperationForActivityID
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getLatestRequestCountForOperation
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.CountsE getLatestRequestCountForOperation
                (
                  org.wso2.carbon.bam.GetLatestRequestCountForOperation getLatestRequestCountForOperation
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getLatestInCumulativeCountForProxy
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.CumulativeCountsE getLatestInCumulativeCountForProxy
                (
                  org.wso2.carbon.bam.GetLatestInCumulativeCountForProxy getLatestInCumulativeCountForProxy
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getLatestInCumulativeCountForEndpoint
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.CumulativeCountsE getLatestInCumulativeCountForEndpoint
                (
                  org.wso2.carbon.bam.GetLatestInCumulativeCountForEndpoint getLatestInCumulativeCountForEndpoint
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getLatestInAverageProcessingTimeForEndpoint
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.AverageTimesE getLatestInAverageProcessingTimeForEndpoint
                (
                  org.wso2.carbon.bam.GetLatestInAverageProcessingTimeForEndpoint getLatestInAverageProcessingTimeForEndpoint
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getLatestOutMaximumProcessingTimeForProxy
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.MaximumTimesE getLatestOutMaximumProcessingTimeForProxy
                (
                  org.wso2.carbon.bam.GetLatestOutMaximumProcessingTimeForProxy getLatestOutMaximumProcessingTimeForProxy
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getMinResponseTime
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.TimesE getMinResponseTime
                (
                  org.wso2.carbon.bam.GetMinResponseTime getMinResponseTime
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getLatestMinimumResponseTimeForService
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.TimesE getLatestMinimumResponseTimeForService
                (
                  org.wso2.carbon.bam.GetLatestMinimumResponseTimeForService getLatestMinimumResponseTimeForService
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getLatestInAverageProcessingTimeForSequence
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.AverageTimesE getLatestInAverageProcessingTimeForSequence
                (
                  org.wso2.carbon.bam.GetLatestInAverageProcessingTimeForSequence getLatestInAverageProcessingTimeForSequence
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getServiceForServer
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.ServicesE getServiceForServer
                (
                  org.wso2.carbon.bam.GetServiceForServer getServiceForServer
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getClientServiceOperation
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.ClientServiceOperationInfosE getClientServiceOperation
                (
                  org.wso2.carbon.bam.GetClientServiceOperation getClientServiceOperation
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getLatestAverageResponseTimeForOperation
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.TimesE getLatestAverageResponseTimeForOperation
                (
                  org.wso2.carbon.bam.GetLatestAverageResponseTimeForOperation getLatestAverageResponseTimeForOperation
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getLatestDataForOperation
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.OperationDataE getLatestDataForOperation
                (
                  org.wso2.carbon.bam.GetLatestDataForOperation getLatestDataForOperation
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getLatestFaultCountForService
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.CountsE getLatestFaultCountForService
                (
                  org.wso2.carbon.bam.GetLatestFaultCountForService getLatestFaultCountForService
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getMessagesForOperation
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.MessagesForOperationE getMessagesForOperation
                (
                  org.wso2.carbon.bam.GetMessagesForOperation getMessagesForOperation
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getLatestOutAverageProcessingTimeForProxy
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.AverageTimesE getLatestOutAverageProcessingTimeForProxy
                (
                  org.wso2.carbon.bam.GetLatestOutAverageProcessingTimeForProxy getLatestOutAverageProcessingTimeForProxy
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getAvgResponseTimeSystem
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.TimesE getAvgResponseTimeSystem
                (
                  org.wso2.carbon.bam.GetAvgResponseTimeSystem getAvgResponseTimeSystem
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getLatestInMinimumProcessingTimeForProxy
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.MinimumTimesE getLatestInMinimumProcessingTimeForProxy
                (
                  org.wso2.carbon.bam.GetLatestInMinimumProcessingTimeForProxy getLatestInMinimumProcessingTimeForProxy
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getLatestInCumulativeCountForSequence
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.CumulativeCountsE getLatestInCumulativeCountForSequence
                (
                  org.wso2.carbon.bam.GetLatestInCumulativeCountForSequence getLatestInCumulativeCountForSequence
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getSequences
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.SequencesE getSequences
                (
                  org.wso2.carbon.bam.GetSequences getSequences
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getLatestFaultCountForServer
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.CountsE getLatestFaultCountForServer
                (
                  org.wso2.carbon.bam.GetLatestFaultCountForServer getLatestFaultCountForServer
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getLatestDataForServer
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.ServerDataE getLatestDataForServer
                (
                  org.wso2.carbon.bam.GetLatestDataForServer getLatestDataForServer
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getAllActivityForTimeRange
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.AllActivitiesE getAllActivityForTimeRange
                (
                  org.wso2.carbon.bam.GetAllActivityForTimeRange getAllActivityForTimeRange
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getLatestOutCumulativeCountForProxy
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.CumulativeCountsE getLatestOutCumulativeCountForProxy
                (
                  org.wso2.carbon.bam.GetLatestOutCumulativeCountForProxy getLatestOutCumulativeCountForProxy
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getOperationNameList
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.OperationsListE getOperationNameList
                (
                  org.wso2.carbon.bam.GetOperationNameList getOperationNameList
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getAllActivityDataForTimeRangeAndOperation
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.ActivityDatasE getAllActivityDataForTimeRangeAndOperation
                (
                  org.wso2.carbon.bam.GetAllActivityDataForTimeRangeAndOperation getAllActivityDataForTimeRangeAndOperation
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getLatestOutAverageProcessingTimeForSequence
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.AverageTimesE getLatestOutAverageProcessingTimeForSequence
                (
                  org.wso2.carbon.bam.GetLatestOutAverageProcessingTimeForSequence getLatestOutAverageProcessingTimeForSequence
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getLatestOutCumulativeCountForSequence
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.CumulativeCountsE getLatestOutCumulativeCountForSequence
                (
                  org.wso2.carbon.bam.GetLatestOutCumulativeCountForSequence getLatestOutCumulativeCountForSequence
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getOperationListForActivity
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.OperationsForServiceE getOperationListForActivity
                (
                  org.wso2.carbon.bam.GetOperationListForActivity getOperationListForActivity
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getProxyServices
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.ProxyServicesE getProxyServices
                (
                  org.wso2.carbon.bam.GetProxyServices getProxyServices
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getMaxResponseTime
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.TimesE getMaxResponseTime
                (
                  org.wso2.carbon.bam.GetMaxResponseTime getMaxResponseTime
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getAllActivityMessagesForTimeRange
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.AllActivityMessagesE getAllActivityMessagesForTimeRange
                (
                  org.wso2.carbon.bam.GetAllActivityMessagesForTimeRange getAllActivityMessagesForTimeRange
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getActivityIDForActivityName
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.ActivityIDsE getActivityIDForActivityName
                (
                  org.wso2.carbon.bam.GetActivityIDForActivityName getActivityIDForActivityName
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getLastMinuteRequestCount
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.CountsE getLastMinuteRequestCount
                (
                  org.wso2.carbon.bam.GetLastMinuteRequestCount getLastMinuteRequestCount
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getReplayedFailRequestCount
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.ReplayedFailRequestCountListE getReplayedFailRequestCount
                (
                  org.wso2.carbon.bam.GetReplayedFailRequestCount getReplayedFailRequestCount
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getLatestAverageResponseTimeForServer
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.TimesE getLatestAverageResponseTimeForServer
                (
                  org.wso2.carbon.bam.GetLatestAverageResponseTimeForServer getLatestAverageResponseTimeForServer
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getServiceListForActivity
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.ServicesForServerE getServiceListForActivity
                (
                  org.wso2.carbon.bam.GetServiceListForActivity getServiceListForActivity
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getMinResponseTimeSystem
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.TimesE getMinResponseTimeSystem
                (
                  org.wso2.carbon.bam.GetMinResponseTimeSystem getMinResponseTimeSystem
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getAllMessages
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.MessageDatasE getAllMessages
                (
                  org.wso2.carbon.bam.GetAllMessages getAllMessages
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getAvgResponseTime
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.TimesE getAvgResponseTime
                (
                  org.wso2.carbon.bam.GetAvgResponseTime getAvgResponseTime
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getChildrenMessagesForSAP
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.SAPchildrenE getChildrenMessagesForSAP
                (
                  org.wso2.carbon.bam.GetChildrenMessagesForSAP getChildrenMessagesForSAP
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getLatestDataForServices
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.ServiceDataE getLatestDataForServices
                (
                  org.wso2.carbon.bam.GetLatestDataForServices getLatestDataForServices
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getOperationInfoForActivityID
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.OperationInfosE getOperationInfoForActivityID
                (
                  org.wso2.carbon.bam.GetOperationInfoForActivityID getOperationInfoForActivityID
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getPropertyKeyForActivity
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.PropertyKeysForActivityE getPropertyKeyForActivity
                (
                  org.wso2.carbon.bam.GetPropertyKeyForActivity getPropertyKeyForActivity
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getMessagesCountForSAP
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.SAPcountsE getMessagesCountForSAP
                (
                  org.wso2.carbon.bam.GetMessagesCountForSAP getMessagesCountForSAP
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getLatestOutFaultCountForSequence
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.FaultCountsE getLatestOutFaultCountForSequence
                (
                  org.wso2.carbon.bam.GetLatestOutFaultCountForSequence getLatestOutFaultCountForSequence
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getLatestInMaximumProcessingTimeForEndpoint
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.MaximumTimesE getLatestInMaximumProcessingTimeForEndpoint
                (
                  org.wso2.carbon.bam.GetLatestInMaximumProcessingTimeForEndpoint getLatestInMaximumProcessingTimeForEndpoint
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getReplayedFailReponseCount
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.ReplayedFailResponseCountListE getReplayedFailReponseCount
                (
                  org.wso2.carbon.bam.GetReplayedFailReponseCount getReplayedFailReponseCount
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getOriginalFailCount
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.OriginalFailCountListE getOriginalFailCount
                (
                  org.wso2.carbon.bam.GetOriginalFailCount getOriginalFailCount
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getLatestRequestCountForService
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.CountsE getLatestRequestCountForService
                (
                  org.wso2.carbon.bam.GetLatestRequestCountForService getLatestRequestCountForService
                 )
            throws DataServiceFaultException;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param getInCumulativeCountsForEndpoint
             * @throws DataServiceFaultException : 
         */

        
                public org.wso2.carbon.bam.CumulativeCountsE getInCumulativeCountsForEndpoint
                (
                  org.wso2.carbon.bam.GetInCumulativeCountsForEndpoint getInCumulativeCountsForEndpoint
                 )
            throws DataServiceFaultException;
        
         }
    
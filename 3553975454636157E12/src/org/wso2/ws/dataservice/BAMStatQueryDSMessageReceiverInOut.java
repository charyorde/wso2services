
/**
 * BAMStatQueryDSMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */
        package org.wso2.ws.dataservice;

        /**
        *  BAMStatQueryDSMessageReceiverInOut message receiver
        */

        public class BAMStatQueryDSMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        BAMStatQueryDSSkeletonInterface skel = (BAMStatQueryDSSkeletonInterface)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){


        

            if("getLatestOutFaultCountForProxy".equals(methodName)){
                
                org.wso2.carbon.bam.FaultCountsE faultCounts270 = null;
	                        org.wso2.carbon.bam.GetLatestOutFaultCountForProxy wrappedParam =
                                                             (org.wso2.carbon.bam.GetLatestOutFaultCountForProxy)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetLatestOutFaultCountForProxy.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               faultCounts270 =
                                                   
                                                   
                                                         skel.getLatestOutFaultCountForProxy(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), faultCounts270, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getLatestOutFaultCountForProxy"));
                                    } else 

            if("getOperationsForOperationID".equals(methodName)){
                
                org.wso2.carbon.bam.OperationsE operations272 = null;
	                        org.wso2.carbon.bam.GetOperationsForOperationID wrappedParam =
                                                             (org.wso2.carbon.bam.GetOperationsForOperationID)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetOperationsForOperationID.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               operations272 =
                                                   
                                                   
                                                         skel.getOperationsForOperationID(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), operations272, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getOperationsForOperationID"));
                                    } else 

            if("getAllOperationsForTimeRange".equals(methodName)){
                
                org.wso2.carbon.bam.AllActivityMsgOperationsE allActivityMsgOperations274 = null;
	                        org.wso2.carbon.bam.GetAllOperationsForTimeRange wrappedParam =
                                                             (org.wso2.carbon.bam.GetAllOperationsForTimeRange)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetAllOperationsForTimeRange.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               allActivityMsgOperations274 =
                                                   
                                                   
                                                         skel.getAllOperationsForTimeRange(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), allActivityMsgOperations274, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getAllOperationsForTimeRange"));
                                    } else 

            if("getLatestMinimumResponseTimeForOperation".equals(methodName)){
                
                org.wso2.carbon.bam.TimesE times276 = null;
	                        org.wso2.carbon.bam.GetLatestMinimumResponseTimeForOperation wrappedParam =
                                                             (org.wso2.carbon.bam.GetLatestMinimumResponseTimeForOperation)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetLatestMinimumResponseTimeForOperation.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               times276 =
                                                   
                                                   
                                                         skel.getLatestMinimumResponseTimeForOperation(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), times276, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getLatestMinimumResponseTimeForOperation"));
                                    } else 

            if("getActivityDetailsForActivity".equals(methodName)){
                
                org.wso2.carbon.bam.ActivityGroupsForTimeE activityGroupsForTime278 = null;
	                        org.wso2.carbon.bam.GetActivityDetailsForActivity wrappedParam =
                                                             (org.wso2.carbon.bam.GetActivityDetailsForActivity)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetActivityDetailsForActivity.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               activityGroupsForTime278 =
                                                   
                                                   
                                                         skel.getActivityDetailsForActivity(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), activityGroupsForTime278, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getActivityDetailsForActivity"));
                                    } else 

            if("getLatestMinimumResponseTimeForServer".equals(methodName)){
                
                org.wso2.carbon.bam.TimesE times280 = null;
	                        org.wso2.carbon.bam.GetLatestMinimumResponseTimeForServer wrappedParam =
                                                             (org.wso2.carbon.bam.GetLatestMinimumResponseTimeForServer)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetLatestMinimumResponseTimeForServer.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               times280 =
                                                   
                                                   
                                                         skel.getLatestMinimumResponseTimeForServer(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), times280, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getLatestMinimumResponseTimeForServer"));
                                    } else 

            if("getLatestMaximumResponseTimeForServer".equals(methodName)){
                
                org.wso2.carbon.bam.TimesE times282 = null;
	                        org.wso2.carbon.bam.GetLatestMaximumResponseTimeForServer wrappedParam =
                                                             (org.wso2.carbon.bam.GetLatestMaximumResponseTimeForServer)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetLatestMaximumResponseTimeForServer.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               times282 =
                                                   
                                                   
                                                         skel.getLatestMaximumResponseTimeForServer(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), times282, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getLatestMaximumResponseTimeForServer"));
                                    } else 

            if("getLatestInFaultCountForSequence".equals(methodName)){
                
                org.wso2.carbon.bam.FaultCountsE faultCounts284 = null;
	                        org.wso2.carbon.bam.GetLatestInFaultCountForSequence wrappedParam =
                                                             (org.wso2.carbon.bam.GetLatestInFaultCountForSequence)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetLatestInFaultCountForSequence.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               faultCounts284 =
                                                   
                                                   
                                                         skel.getLatestInFaultCountForSequence(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), faultCounts284, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getLatestInFaultCountForSequence"));
                                    } else 

            if("getServerIdForServer".equals(methodName)){
                
                org.wso2.carbon.bam.ServersE servers286 = null;
	                        org.wso2.carbon.bam.GetServerIdForServer wrappedParam =
                                                             (org.wso2.carbon.bam.GetServerIdForServer)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetServerIdForServer.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               servers286 =
                                                   
                                                   
                                                         skel.getServerIdForServer(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), servers286, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getServerIdForServer"));
                                    } else 

            if("getCountofChildrenFailedMessages".equals(methodName)){
                
                org.wso2.carbon.bam.CountofChildrenFailedMessagesE countofChildrenFailedMessages288 = null;
	                        org.wso2.carbon.bam.GetCountofChildrenFailedMessages wrappedParam =
                                                             (org.wso2.carbon.bam.GetCountofChildrenFailedMessages)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetCountofChildrenFailedMessages.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               countofChildrenFailedMessages288 =
                                                   
                                                   
                                                         skel.getCountofChildrenFailedMessages(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), countofChildrenFailedMessages288, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getCountofChildrenFailedMessages"));
                                    } else 

            if("getAllMessagesForTimeRangeAndActivity".equals(methodName)){
                
                org.wso2.carbon.bam.AllMessagesForActivitiesE allMessagesForActivities290 = null;
	                        org.wso2.carbon.bam.GetAllMessagesForTimeRangeAndActivity wrappedParam =
                                                             (org.wso2.carbon.bam.GetAllMessagesForTimeRangeAndActivity)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetAllMessagesForTimeRangeAndActivity.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               allMessagesForActivities290 =
                                                   
                                                   
                                                         skel.getAllMessagesForTimeRangeAndActivity(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), allMessagesForActivities290, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getAllMessagesForTimeRangeAndActivity"));
                                    } else 

            if("getOperationIDForMessageID".equals(methodName)){
                
                org.wso2.carbon.bam.OperationIDsE operationIDs292 = null;
	                        org.wso2.carbon.bam.GetOperationIDForMessageID wrappedParam =
                                                             (org.wso2.carbon.bam.GetOperationIDForMessageID)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetOperationIDForMessageID.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               operationIDs292 =
                                                   
                                                   
                                                         skel.getOperationIDForMessageID(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), operationIDs292, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getOperationIDForMessageID"));
                                    } else 

            if("getLatestMaximumResponseTimeForOperation".equals(methodName)){
                
                org.wso2.carbon.bam.TimesE times294 = null;
	                        org.wso2.carbon.bam.GetLatestMaximumResponseTimeForOperation wrappedParam =
                                                             (org.wso2.carbon.bam.GetLatestMaximumResponseTimeForOperation)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetLatestMaximumResponseTimeForOperation.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               times294 =
                                                   
                                                   
                                                         skel.getLatestMaximumResponseTimeForOperation(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), times294, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getLatestMaximumResponseTimeForOperation"));
                                    } else 

            if("getOperations".equals(methodName)){
                
                org.wso2.carbon.bam.OperationsE operations296 = null;
	                        org.wso2.carbon.bam.GetOperations wrappedParam =
                                                             (org.wso2.carbon.bam.GetOperations)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetOperations.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               operations296 =
                                                   
                                                   
                                                         skel.getOperations(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), operations296, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getOperations"));
                                    } else 

            if("getLatestInMinimumProcessingTimeForEndpoint".equals(methodName)){
                
                org.wso2.carbon.bam.MinimumTimesE minimumTimes298 = null;
	                        org.wso2.carbon.bam.GetLatestInMinimumProcessingTimeForEndpoint wrappedParam =
                                                             (org.wso2.carbon.bam.GetLatestInMinimumProcessingTimeForEndpoint)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetLatestInMinimumProcessingTimeForEndpoint.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               minimumTimes298 =
                                                   
                                                   
                                                         skel.getLatestInMinimumProcessingTimeForEndpoint(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), minimumTimes298, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getLatestInMinimumProcessingTimeForEndpoint"));
                                    } else 

            if("getLatestResponseCountForOperation".equals(methodName)){
                
                org.wso2.carbon.bam.CountsE counts300 = null;
	                        org.wso2.carbon.bam.GetLatestResponseCountForOperation wrappedParam =
                                                             (org.wso2.carbon.bam.GetLatestResponseCountForOperation)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetLatestResponseCountForOperation.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               counts300 =
                                                   
                                                   
                                                         skel.getLatestResponseCountForOperation(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), counts300, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getLatestResponseCountForOperation"));
                                    } else 

            if("getMaximumOperationsForAnActivityID".equals(methodName)){
                
                org.wso2.carbon.bam.NumsE nums302 = null;
	                        org.wso2.carbon.bam.GetMaximumOperationsForAnActivityID wrappedParam =
                                                             (org.wso2.carbon.bam.GetMaximumOperationsForAnActivityID)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetMaximumOperationsForAnActivityID.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               nums302 =
                                                   
                                                   
                                                         skel.getMaximumOperationsForAnActivityID(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), nums302, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getMaximumOperationsForAnActivityID"));
                                    } else 

            if("gettimestampForOperation".equals(methodName)){
                
                org.wso2.carbon.bam.TimeStampsForOperationE timeStampsForOperation304 = null;
	                        org.wso2.carbon.bam.GettimestampForOperation wrappedParam =
                                                             (org.wso2.carbon.bam.GettimestampForOperation)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GettimestampForOperation.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               timeStampsForOperation304 =
                                                   
                                                   
                                                         skel.gettimestampForOperation(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), timeStampsForOperation304, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "gettimestampForOperation"));
                                    } else 

            if("getJMXMetricsWindow".equals(methodName)){
                
                org.wso2.carbon.bam.JmxMetricsInfosE jmxMetricsInfos306 = null;
	                        org.wso2.carbon.bam.GetJMXMetricsWindow wrappedParam =
                                                             (org.wso2.carbon.bam.GetJMXMetricsWindow)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetJMXMetricsWindow.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               jmxMetricsInfos306 =
                                                   
                                                   
                                                         skel.getJMXMetricsWindow(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), jmxMetricsInfos306, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getJMXMetricsWindow"));
                                    } else 

            if("getLatestInFaultCountForProxy".equals(methodName)){
                
                org.wso2.carbon.bam.FaultCountsE faultCounts308 = null;
	                        org.wso2.carbon.bam.GetLatestInFaultCountForProxy wrappedParam =
                                                             (org.wso2.carbon.bam.GetLatestInFaultCountForProxy)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetLatestInFaultCountForProxy.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               faultCounts308 =
                                                   
                                                   
                                                         skel.getLatestInFaultCountForProxy(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), faultCounts308, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getLatestInFaultCountForProxy"));
                                    } else 

            if("getAleauditFailCount".equals(methodName)){
                
                org.wso2.carbon.bam.AleauditFailCountListE aleauditFailCountList310 = null;
	                        org.wso2.carbon.bam.GetAleauditFailCount wrappedParam =
                                                             (org.wso2.carbon.bam.GetAleauditFailCount)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetAleauditFailCount.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               aleauditFailCountList310 =
                                                   
                                                   
                                                         skel.getAleauditFailCount(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), aleauditFailCountList310, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getAleauditFailCount"));
                                    } else 

            if("getLatestInMaximumProcessingTimeForProxy".equals(methodName)){
                
                org.wso2.carbon.bam.MaximumTimesE maximumTimes312 = null;
	                        org.wso2.carbon.bam.GetLatestInMaximumProcessingTimeForProxy wrappedParam =
                                                             (org.wso2.carbon.bam.GetLatestInMaximumProcessingTimeForProxy)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetLatestInMaximumProcessingTimeForProxy.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               maximumTimes312 =
                                                   
                                                   
                                                         skel.getLatestInMaximumProcessingTimeForProxy(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), maximumTimes312, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getLatestInMaximumProcessingTimeForProxy"));
                                    } else 

            if("getLatestAverageResponseTimeForService".equals(methodName)){
                
                org.wso2.carbon.bam.TimesE times314 = null;
	                        org.wso2.carbon.bam.GetLatestAverageResponseTimeForService wrappedParam =
                                                             (org.wso2.carbon.bam.GetLatestAverageResponseTimeForService)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetLatestAverageResponseTimeForService.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               times314 =
                                                   
                                                   
                                                         skel.getLatestAverageResponseTimeForService(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), times314, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getLatestAverageResponseTimeForService"));
                                    } else 

            if("getPropertyChildrenForActivity".equals(methodName)){
                
                org.wso2.carbon.bam.PropertyChildrenForActivityE propertyChildrenForActivity316 = null;
	                        org.wso2.carbon.bam.GetPropertyChildrenForActivity wrappedParam =
                                                             (org.wso2.carbon.bam.GetPropertyChildrenForActivity)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetPropertyChildrenForActivity.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               propertyChildrenForActivity316 =
                                                   
                                                   
                                                         skel.getPropertyChildrenForActivity(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), propertyChildrenForActivity316, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getPropertyChildrenForActivity"));
                                    } else 

            if("getLatestDataForService".equals(methodName)){
                
                org.wso2.carbon.bam.ServiceDataE serviceData318 = null;
	                        org.wso2.carbon.bam.GetLatestDataForService wrappedParam =
                                                             (org.wso2.carbon.bam.GetLatestDataForService)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetLatestDataForService.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               serviceData318 =
                                                   
                                                   
                                                         skel.getLatestDataForService(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), serviceData318, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getLatestDataForService"));
                                    } else 

            if("getActivityDetailsForServer".equals(methodName)){
                
                org.wso2.carbon.bam.ActivitiesForServerE activitiesForServer320 = null;
	                        org.wso2.carbon.bam.GetActivityDetailsForServer wrappedParam =
                                                             (org.wso2.carbon.bam.GetActivityDetailsForServer)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetActivityDetailsForServer.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               activitiesForServer320 =
                                                   
                                                   
                                                         skel.getActivityDetailsForServer(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), activitiesForServer320, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getActivityDetailsForServer"));
                                    } else 

            if("getDetailsForActivity".equals(methodName)){
                
                org.wso2.carbon.bam.ActivitiesE activities322 = null;
	                        org.wso2.carbon.bam.GetDetailsForActivity wrappedParam =
                                                             (org.wso2.carbon.bam.GetDetailsForActivity)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetDetailsForActivity.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               activities322 =
                                                   
                                                   
                                                         skel.getDetailsForActivity(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), activities322, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getDetailsForActivity"));
                                    } else 

            if("getEndpoints".equals(methodName)){
                
                org.wso2.carbon.bam.EndpointsE endpoints324 = null;
	                        org.wso2.carbon.bam.GetEndpoints wrappedParam =
                                                             (org.wso2.carbon.bam.GetEndpoints)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetEndpoints.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               endpoints324 =
                                                   
                                                   
                                                         skel.getEndpoints(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), endpoints324, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getEndpoints"));
                                    } else 

            if("getLatestOutMinimumProcessingTimeForSequence".equals(methodName)){
                
                org.wso2.carbon.bam.MinimumTimesE minimumTimes326 = null;
	                        org.wso2.carbon.bam.GetLatestOutMinimumProcessingTimeForSequence wrappedParam =
                                                             (org.wso2.carbon.bam.GetLatestOutMinimumProcessingTimeForSequence)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetLatestOutMinimumProcessingTimeForSequence.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               minimumTimes326 =
                                                   
                                                   
                                                         skel.getLatestOutMinimumProcessingTimeForSequence(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), minimumTimes326, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getLatestOutMinimumProcessingTimeForSequence"));
                                    } else 

            if("getActivityDetailsForTimeRange".equals(methodName)){
                
                org.wso2.carbon.bam.ActivitiesForTimeE activitiesForTime328 = null;
	                        org.wso2.carbon.bam.GetActivityDetailsForTimeRange wrappedParam =
                                                             (org.wso2.carbon.bam.GetActivityDetailsForTimeRange)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetActivityDetailsForTimeRange.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               activitiesForTime328 =
                                                   
                                                   
                                                         skel.getActivityDetailsForTimeRange(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), activitiesForTime328, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getActivityDetailsForTimeRange"));
                                    } else 

            if("getLatestOutMinimumProcessingTimeForProxy".equals(methodName)){
                
                org.wso2.carbon.bam.MinimumTimesE minimumTimes330 = null;
	                        org.wso2.carbon.bam.GetLatestOutMinimumProcessingTimeForProxy wrappedParam =
                                                             (org.wso2.carbon.bam.GetLatestOutMinimumProcessingTimeForProxy)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetLatestOutMinimumProcessingTimeForProxy.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               minimumTimes330 =
                                                   
                                                   
                                                         skel.getLatestOutMinimumProcessingTimeForProxy(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), minimumTimes330, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getLatestOutMinimumProcessingTimeForProxy"));
                                    } else 

            if("getAleauditMessagesForSAP".equals(methodName)){
                
                org.wso2.carbon.bam.SAPaleauditsE sAPaleaudits332 = null;
	                        org.wso2.carbon.bam.GetAleauditMessagesForSAP wrappedParam =
                                                             (org.wso2.carbon.bam.GetAleauditMessagesForSAP)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetAleauditMessagesForSAP.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               sAPaleaudits332 =
                                                   
                                                   
                                                         skel.getAleauditMessagesForSAP(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), sAPaleaudits332, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getAleauditMessagesForSAP"));
                                    } else 

            if("getLatestInAverageProcessingTimeForProxy".equals(methodName)){
                
                org.wso2.carbon.bam.AverageTimesE averageTimes334 = null;
	                        org.wso2.carbon.bam.GetLatestInAverageProcessingTimeForProxy wrappedParam =
                                                             (org.wso2.carbon.bam.GetLatestInAverageProcessingTimeForProxy)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetLatestInAverageProcessingTimeForProxy.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               averageTimes334 =
                                                   
                                                   
                                                         skel.getLatestInAverageProcessingTimeForProxy(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), averageTimes334, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getLatestInAverageProcessingTimeForProxy"));
                                    } else 

            if("getServerListForActivity".equals(methodName)){
                
                org.wso2.carbon.bam.ServersForActivityE serversForActivity336 = null;
	                        org.wso2.carbon.bam.GetServerListForActivity wrappedParam =
                                                             (org.wso2.carbon.bam.GetServerListForActivity)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetServerListForActivity.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               serversForActivity336 =
                                                   
                                                   
                                                         skel.getServerListForActivity(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), serversForActivity336, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getServerListForActivity"));
                                    } else 

            if("getMessageCount".equals(methodName)){
                
                org.wso2.carbon.bam.MessageCountsE messageCounts338 = null;
	                        org.wso2.carbon.bam.GetMessageCount wrappedParam =
                                                             (org.wso2.carbon.bam.GetMessageCount)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetMessageCount.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               messageCounts338 =
                                                   
                                                   
                                                         skel.getMessageCount(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), messageCounts338, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getMessageCount"));
                                    } else 

            if("getpropertyBagForActivity".equals(methodName)){
                
                org.wso2.carbon.bam.PropertyBagsE propertyBags340 = null;
	                        org.wso2.carbon.bam.GetpropertyBagForActivity wrappedParam =
                                                             (org.wso2.carbon.bam.GetpropertyBagForActivity)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetpropertyBagForActivity.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               propertyBags340 =
                                                   
                                                   
                                                         skel.getpropertyBagForActivity(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), propertyBags340, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getpropertyBagForActivity"));
                                    } else 

            if("getLastMinuteRequestCountSystem".equals(methodName)){
                
                org.wso2.carbon.bam.CountsE counts342 = null;
	                        org.wso2.carbon.bam.GetLastMinuteRequestCountSystem wrappedParam =
                                                             (org.wso2.carbon.bam.GetLastMinuteRequestCountSystem)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetLastMinuteRequestCountSystem.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               counts342 =
                                                   
                                                   
                                                         skel.getLastMinuteRequestCountSystem(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), counts342, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getLastMinuteRequestCountSystem"));
                                    } else 

            if("getLatestInMinimumProcessingTimeForSequence".equals(methodName)){
                
                org.wso2.carbon.bam.MinimumTimesE minimumTimes344 = null;
	                        org.wso2.carbon.bam.GetLatestInMinimumProcessingTimeForSequence wrappedParam =
                                                             (org.wso2.carbon.bam.GetLatestInMinimumProcessingTimeForSequence)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetLatestInMinimumProcessingTimeForSequence.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               minimumTimes344 =
                                                   
                                                   
                                                         skel.getLatestInMinimumProcessingTimeForSequence(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), minimumTimes344, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getLatestInMinimumProcessingTimeForSequence"));
                                    } else 

            if("getPropertyValueForStatus".equals(methodName)){
                
                org.wso2.carbon.bam.StatusListE statusList346 = null;
	                        org.wso2.carbon.bam.GetPropertyValueForStatus wrappedParam =
                                                             (org.wso2.carbon.bam.GetPropertyValueForStatus)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetPropertyValueForStatus.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               statusList346 =
                                                   
                                                   
                                                         skel.getPropertyValueForStatus(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), statusList346, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getPropertyValueForStatus"));
                                    } else 

            if("getMessagesForStatus".equals(methodName)){
                
                org.wso2.carbon.bam.MessageIdListE messageIdList348 = null;
	                        org.wso2.carbon.bam.GetMessagesForStatus wrappedParam =
                                                             (org.wso2.carbon.bam.GetMessagesForStatus)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetMessagesForStatus.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               messageIdList348 =
                                                   
                                                   
                                                         skel.getMessagesForStatus(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), messageIdList348, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getMessagesForStatus"));
                                    } else 

            if("getLatestOutMaximumProcessingTimeForSequence".equals(methodName)){
                
                org.wso2.carbon.bam.MaximumTimesE maximumTimes350 = null;
	                        org.wso2.carbon.bam.GetLatestOutMaximumProcessingTimeForSequence wrappedParam =
                                                             (org.wso2.carbon.bam.GetLatestOutMaximumProcessingTimeForSequence)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetLatestOutMaximumProcessingTimeForSequence.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               maximumTimes350 =
                                                   
                                                   
                                                         skel.getLatestOutMaximumProcessingTimeForSequence(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), maximumTimes350, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getLatestOutMaximumProcessingTimeForSequence"));
                                    } else 

            if("getLatestResponseCountForServer".equals(methodName)){
                
                org.wso2.carbon.bam.CountsE counts352 = null;
	                        org.wso2.carbon.bam.GetLatestResponseCountForServer wrappedParam =
                                                             (org.wso2.carbon.bam.GetLatestResponseCountForServer)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetLatestResponseCountForServer.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               counts352 =
                                                   
                                                   
                                                         skel.getLatestResponseCountForServer(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), counts352, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getLatestResponseCountForServer"));
                                    } else 

            if("getMaxResponseTimeSystem".equals(methodName)){
                
                org.wso2.carbon.bam.TimesE times354 = null;
	                        org.wso2.carbon.bam.GetMaxResponseTimeSystem wrappedParam =
                                                             (org.wso2.carbon.bam.GetMaxResponseTimeSystem)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetMaxResponseTimeSystem.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               times354 =
                                                   
                                                   
                                                         skel.getMaxResponseTimeSystem(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), times354, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getMaxResponseTimeSystem"));
                                    } else 

            if("getLatestRequestCountForServer".equals(methodName)){
                
                org.wso2.carbon.bam.CountsE counts356 = null;
	                        org.wso2.carbon.bam.GetLatestRequestCountForServer wrappedParam =
                                                             (org.wso2.carbon.bam.GetLatestRequestCountForServer)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetLatestRequestCountForServer.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               counts356 =
                                                   
                                                   
                                                         skel.getLatestRequestCountForServer(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), counts356, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getLatestRequestCountForServer"));
                                    } else 

            if("getAllActivityDataForTimeRange".equals(methodName)){
                
                org.wso2.carbon.bam.FullActivityDatasE fullActivityDatas358 = null;
	                        org.wso2.carbon.bam.GetAllActivityDataForTimeRange wrappedParam =
                                                             (org.wso2.carbon.bam.GetAllActivityDataForTimeRange)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetAllActivityDataForTimeRange.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               fullActivityDatas358 =
                                                   
                                                   
                                                         skel.getAllActivityDataForTimeRange(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), fullActivityDatas358, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getAllActivityDataForTimeRange"));
                                    } else 

            if("getLatestResponseCountForService".equals(methodName)){
                
                org.wso2.carbon.bam.CountsE counts360 = null;
	                        org.wso2.carbon.bam.GetLatestResponseCountForService wrappedParam =
                                                             (org.wso2.carbon.bam.GetLatestResponseCountForService)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetLatestResponseCountForService.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               counts360 =
                                                   
                                                   
                                                         skel.getLatestResponseCountForService(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), counts360, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getLatestResponseCountForService"));
                                    } else 

            if("getDirectionForOperation".equals(methodName)){
                
                org.wso2.carbon.bam.DirectionsForOperationE directionsForOperation362 = null;
	                        org.wso2.carbon.bam.GetDirectionForOperation wrappedParam =
                                                             (org.wso2.carbon.bam.GetDirectionForOperation)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetDirectionForOperation.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               directionsForOperation362 =
                                                   
                                                   
                                                         skel.getDirectionForOperation(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), directionsForOperation362, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getDirectionForOperation"));
                                    } else 

            if("getAllIpAddressForTimeRange".equals(methodName)){
                
                org.wso2.carbon.bam.AllIpAddressesE allIpAddresses364 = null;
	                        org.wso2.carbon.bam.GetAllIpAddressForTimeRange wrappedParam =
                                                             (org.wso2.carbon.bam.GetAllIpAddressForTimeRange)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetAllIpAddressForTimeRange.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               allIpAddresses364 =
                                                   
                                                   
                                                         skel.getAllIpAddressForTimeRange(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), allIpAddresses364, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getAllIpAddressForTimeRange"));
                                    } else 

            if("getReqResFaultCountForServices".equals(methodName)){
                
                org.wso2.carbon.bam.ServicesE services366 = null;
	                        org.wso2.carbon.bam.GetReqResFaultCountForServices wrappedParam =
                                                             (org.wso2.carbon.bam.GetReqResFaultCountForServices)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetReqResFaultCountForServices.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               services366 =
                                                   
                                                   
                                                         skel.getReqResFaultCountForServices(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), services366, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getReqResFaultCountForServices"));
                                    } else 

            if("getMessageForMessageID".equals(methodName)){
                
                org.wso2.carbon.bam.MessagesForMessageIDE messagesForMessageID368 = null;
	                        org.wso2.carbon.bam.GetMessageForMessageID wrappedParam =
                                                             (org.wso2.carbon.bam.GetMessageForMessageID)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetMessageForMessageID.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               messagesForMessageID368 =
                                                   
                                                   
                                                         skel.getMessageForMessageID(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), messagesForMessageID368, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getMessageForMessageID"));
                                    } else 

            if("getMessagesCountForOperationIDAndActivityID".equals(methodName)){
                
                org.wso2.carbon.bam.CountMessagessE countMessagess370 = null;
	                        org.wso2.carbon.bam.GetMessagesCountForOperationIDAndActivityID wrappedParam =
                                                             (org.wso2.carbon.bam.GetMessagesCountForOperationIDAndActivityID)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetMessagesCountForOperationIDAndActivityID.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               countMessagess370 =
                                                   
                                                   
                                                         skel.getMessagesCountForOperationIDAndActivityID(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), countMessagess370, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getMessagesCountForOperationIDAndActivityID"));
                                    } else 

            if("getLatestFaultCountForOperation".equals(methodName)){
                
                org.wso2.carbon.bam.CountsE counts372 = null;
	                        org.wso2.carbon.bam.GetLatestFaultCountForOperation wrappedParam =
                                                             (org.wso2.carbon.bam.GetLatestFaultCountForOperation)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetLatestFaultCountForOperation.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               counts372 =
                                                   
                                                   
                                                         skel.getLatestFaultCountForOperation(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), counts372, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getLatestFaultCountForOperation"));
                                    } else 

            if("getPropertyList".equals(methodName)){
                
                org.wso2.carbon.bam.PropertiesE properties374 = null;
	                        org.wso2.carbon.bam.GetPropertyList wrappedParam =
                                                             (org.wso2.carbon.bam.GetPropertyList)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetPropertyList.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               properties374 =
                                                   
                                                   
                                                         skel.getPropertyList(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), properties374, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getPropertyList"));
                                    } else 

            if("getLatestMaximumResponseTimeForService".equals(methodName)){
                
                org.wso2.carbon.bam.TimesE times376 = null;
	                        org.wso2.carbon.bam.GetLatestMaximumResponseTimeForService wrappedParam =
                                                             (org.wso2.carbon.bam.GetLatestMaximumResponseTimeForService)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetLatestMaximumResponseTimeForService.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               times376 =
                                                   
                                                   
                                                         skel.getLatestMaximumResponseTimeForService(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), times376, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getLatestMaximumResponseTimeForService"));
                                    } else 

            if("getLatestInFaultCountForEndpoint".equals(methodName)){
                
                org.wso2.carbon.bam.FaultCountsE faultCounts378 = null;
	                        org.wso2.carbon.bam.GetLatestInFaultCountForEndpoint wrappedParam =
                                                             (org.wso2.carbon.bam.GetLatestInFaultCountForEndpoint)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetLatestInFaultCountForEndpoint.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               faultCounts378 =
                                                   
                                                   
                                                         skel.getLatestInFaultCountForEndpoint(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), faultCounts378, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getLatestInFaultCountForEndpoint"));
                                    } else 

            if("getMessagesForOperationIDAndActivityID".equals(methodName)){
                
                org.wso2.carbon.bam.MessagesE messages380 = null;
	                        org.wso2.carbon.bam.GetMessagesForOperationIDAndActivityID wrappedParam =
                                                             (org.wso2.carbon.bam.GetMessagesForOperationIDAndActivityID)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetMessagesForOperationIDAndActivityID.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               messages380 =
                                                   
                                                   
                                                         skel.getMessagesForOperationIDAndActivityID(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), messages380, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getMessagesForOperationIDAndActivityID"));
                                    } else 

            if("getAllMessagesForTimeRange".equals(methodName)){
                
                org.wso2.carbon.bam.AllMessagesE allMessages382 = null;
	                        org.wso2.carbon.bam.GetAllMessagesForTimeRange wrappedParam =
                                                             (org.wso2.carbon.bam.GetAllMessagesForTimeRange)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetAllMessagesForTimeRange.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               allMessages382 =
                                                   
                                                   
                                                         skel.getAllMessagesForTimeRange(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), allMessages382, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getAllMessagesForTimeRange"));
                                    } else 

            if("getLatestInMaximumProcessingTimeForSequence".equals(methodName)){
                
                org.wso2.carbon.bam.MaximumTimesE maximumTimes384 = null;
	                        org.wso2.carbon.bam.GetLatestInMaximumProcessingTimeForSequence wrappedParam =
                                                             (org.wso2.carbon.bam.GetLatestInMaximumProcessingTimeForSequence)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetLatestInMaximumProcessingTimeForSequence.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               maximumTimes384 =
                                                   
                                                   
                                                         skel.getLatestInMaximumProcessingTimeForSequence(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), maximumTimes384, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getLatestInMaximumProcessingTimeForSequence"));
                                    } else 

            if("getActivityInfoForActivityID".equals(methodName)){
                
                org.wso2.carbon.bam.ActivityInfosE activityInfos386 = null;
	                        org.wso2.carbon.bam.GetActivityInfoForActivityID wrappedParam =
                                                             (org.wso2.carbon.bam.GetActivityInfoForActivityID)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetActivityInfoForActivityID.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               activityInfos386 =
                                                   
                                                   
                                                         skel.getActivityInfoForActivityID(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), activityInfos386, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getActivityInfoForActivityID"));
                                    } else 

            if("getOperationForActivityID".equals(methodName)){
                
                org.wso2.carbon.bam.ActivityOperationsE activityOperations388 = null;
	                        org.wso2.carbon.bam.GetOperationForActivityID wrappedParam =
                                                             (org.wso2.carbon.bam.GetOperationForActivityID)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetOperationForActivityID.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               activityOperations388 =
                                                   
                                                   
                                                         skel.getOperationForActivityID(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), activityOperations388, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getOperationForActivityID"));
                                    } else 

            if("getLatestRequestCountForOperation".equals(methodName)){
                
                org.wso2.carbon.bam.CountsE counts390 = null;
	                        org.wso2.carbon.bam.GetLatestRequestCountForOperation wrappedParam =
                                                             (org.wso2.carbon.bam.GetLatestRequestCountForOperation)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetLatestRequestCountForOperation.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               counts390 =
                                                   
                                                   
                                                         skel.getLatestRequestCountForOperation(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), counts390, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getLatestRequestCountForOperation"));
                                    } else 

            if("getLatestInCumulativeCountForProxy".equals(methodName)){
                
                org.wso2.carbon.bam.CumulativeCountsE cumulativeCounts392 = null;
	                        org.wso2.carbon.bam.GetLatestInCumulativeCountForProxy wrappedParam =
                                                             (org.wso2.carbon.bam.GetLatestInCumulativeCountForProxy)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetLatestInCumulativeCountForProxy.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               cumulativeCounts392 =
                                                   
                                                   
                                                         skel.getLatestInCumulativeCountForProxy(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), cumulativeCounts392, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getLatestInCumulativeCountForProxy"));
                                    } else 

            if("getLatestInCumulativeCountForEndpoint".equals(methodName)){
                
                org.wso2.carbon.bam.CumulativeCountsE cumulativeCounts394 = null;
	                        org.wso2.carbon.bam.GetLatestInCumulativeCountForEndpoint wrappedParam =
                                                             (org.wso2.carbon.bam.GetLatestInCumulativeCountForEndpoint)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetLatestInCumulativeCountForEndpoint.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               cumulativeCounts394 =
                                                   
                                                   
                                                         skel.getLatestInCumulativeCountForEndpoint(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), cumulativeCounts394, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getLatestInCumulativeCountForEndpoint"));
                                    } else 

            if("getLatestInAverageProcessingTimeForEndpoint".equals(methodName)){
                
                org.wso2.carbon.bam.AverageTimesE averageTimes396 = null;
	                        org.wso2.carbon.bam.GetLatestInAverageProcessingTimeForEndpoint wrappedParam =
                                                             (org.wso2.carbon.bam.GetLatestInAverageProcessingTimeForEndpoint)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetLatestInAverageProcessingTimeForEndpoint.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               averageTimes396 =
                                                   
                                                   
                                                         skel.getLatestInAverageProcessingTimeForEndpoint(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), averageTimes396, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getLatestInAverageProcessingTimeForEndpoint"));
                                    } else 

            if("getLatestOutMaximumProcessingTimeForProxy".equals(methodName)){
                
                org.wso2.carbon.bam.MaximumTimesE maximumTimes398 = null;
	                        org.wso2.carbon.bam.GetLatestOutMaximumProcessingTimeForProxy wrappedParam =
                                                             (org.wso2.carbon.bam.GetLatestOutMaximumProcessingTimeForProxy)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetLatestOutMaximumProcessingTimeForProxy.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               maximumTimes398 =
                                                   
                                                   
                                                         skel.getLatestOutMaximumProcessingTimeForProxy(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), maximumTimes398, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getLatestOutMaximumProcessingTimeForProxy"));
                                    } else 

            if("getMinResponseTime".equals(methodName)){
                
                org.wso2.carbon.bam.TimesE times400 = null;
	                        org.wso2.carbon.bam.GetMinResponseTime wrappedParam =
                                                             (org.wso2.carbon.bam.GetMinResponseTime)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetMinResponseTime.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               times400 =
                                                   
                                                   
                                                         skel.getMinResponseTime(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), times400, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getMinResponseTime"));
                                    } else 

            if("getLatestMinimumResponseTimeForService".equals(methodName)){
                
                org.wso2.carbon.bam.TimesE times402 = null;
	                        org.wso2.carbon.bam.GetLatestMinimumResponseTimeForService wrappedParam =
                                                             (org.wso2.carbon.bam.GetLatestMinimumResponseTimeForService)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetLatestMinimumResponseTimeForService.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               times402 =
                                                   
                                                   
                                                         skel.getLatestMinimumResponseTimeForService(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), times402, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getLatestMinimumResponseTimeForService"));
                                    } else 

            if("getLatestInAverageProcessingTimeForSequence".equals(methodName)){
                
                org.wso2.carbon.bam.AverageTimesE averageTimes404 = null;
	                        org.wso2.carbon.bam.GetLatestInAverageProcessingTimeForSequence wrappedParam =
                                                             (org.wso2.carbon.bam.GetLatestInAverageProcessingTimeForSequence)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetLatestInAverageProcessingTimeForSequence.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               averageTimes404 =
                                                   
                                                   
                                                         skel.getLatestInAverageProcessingTimeForSequence(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), averageTimes404, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getLatestInAverageProcessingTimeForSequence"));
                                    } else 

            if("getServiceForServer".equals(methodName)){
                
                org.wso2.carbon.bam.ServicesE services406 = null;
	                        org.wso2.carbon.bam.GetServiceForServer wrappedParam =
                                                             (org.wso2.carbon.bam.GetServiceForServer)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetServiceForServer.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               services406 =
                                                   
                                                   
                                                         skel.getServiceForServer(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), services406, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getServiceForServer"));
                                    } else 

            if("getClientServiceOperation".equals(methodName)){
                
                org.wso2.carbon.bam.ClientServiceOperationInfosE clientServiceOperationInfos408 = null;
	                        org.wso2.carbon.bam.GetClientServiceOperation wrappedParam =
                                                             (org.wso2.carbon.bam.GetClientServiceOperation)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetClientServiceOperation.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               clientServiceOperationInfos408 =
                                                   
                                                   
                                                         skel.getClientServiceOperation(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), clientServiceOperationInfos408, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getClientServiceOperation"));
                                    } else 

            if("getLatestAverageResponseTimeForOperation".equals(methodName)){
                
                org.wso2.carbon.bam.TimesE times410 = null;
	                        org.wso2.carbon.bam.GetLatestAverageResponseTimeForOperation wrappedParam =
                                                             (org.wso2.carbon.bam.GetLatestAverageResponseTimeForOperation)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetLatestAverageResponseTimeForOperation.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               times410 =
                                                   
                                                   
                                                         skel.getLatestAverageResponseTimeForOperation(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), times410, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getLatestAverageResponseTimeForOperation"));
                                    } else 

            if("getLatestDataForOperation".equals(methodName)){
                
                org.wso2.carbon.bam.OperationDataE operationData412 = null;
	                        org.wso2.carbon.bam.GetLatestDataForOperation wrappedParam =
                                                             (org.wso2.carbon.bam.GetLatestDataForOperation)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetLatestDataForOperation.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               operationData412 =
                                                   
                                                   
                                                         skel.getLatestDataForOperation(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), operationData412, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getLatestDataForOperation"));
                                    } else 

            if("getLatestFaultCountForService".equals(methodName)){
                
                org.wso2.carbon.bam.CountsE counts414 = null;
	                        org.wso2.carbon.bam.GetLatestFaultCountForService wrappedParam =
                                                             (org.wso2.carbon.bam.GetLatestFaultCountForService)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetLatestFaultCountForService.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               counts414 =
                                                   
                                                   
                                                         skel.getLatestFaultCountForService(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), counts414, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getLatestFaultCountForService"));
                                    } else 

            if("getMessagesForOperation".equals(methodName)){
                
                org.wso2.carbon.bam.MessagesForOperationE messagesForOperation416 = null;
	                        org.wso2.carbon.bam.GetMessagesForOperation wrappedParam =
                                                             (org.wso2.carbon.bam.GetMessagesForOperation)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetMessagesForOperation.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               messagesForOperation416 =
                                                   
                                                   
                                                         skel.getMessagesForOperation(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), messagesForOperation416, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getMessagesForOperation"));
                                    } else 

            if("getLatestOutAverageProcessingTimeForProxy".equals(methodName)){
                
                org.wso2.carbon.bam.AverageTimesE averageTimes418 = null;
	                        org.wso2.carbon.bam.GetLatestOutAverageProcessingTimeForProxy wrappedParam =
                                                             (org.wso2.carbon.bam.GetLatestOutAverageProcessingTimeForProxy)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetLatestOutAverageProcessingTimeForProxy.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               averageTimes418 =
                                                   
                                                   
                                                         skel.getLatestOutAverageProcessingTimeForProxy(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), averageTimes418, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getLatestOutAverageProcessingTimeForProxy"));
                                    } else 

            if("getAvgResponseTimeSystem".equals(methodName)){
                
                org.wso2.carbon.bam.TimesE times420 = null;
	                        org.wso2.carbon.bam.GetAvgResponseTimeSystem wrappedParam =
                                                             (org.wso2.carbon.bam.GetAvgResponseTimeSystem)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetAvgResponseTimeSystem.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               times420 =
                                                   
                                                   
                                                         skel.getAvgResponseTimeSystem(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), times420, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getAvgResponseTimeSystem"));
                                    } else 

            if("getLatestInMinimumProcessingTimeForProxy".equals(methodName)){
                
                org.wso2.carbon.bam.MinimumTimesE minimumTimes422 = null;
	                        org.wso2.carbon.bam.GetLatestInMinimumProcessingTimeForProxy wrappedParam =
                                                             (org.wso2.carbon.bam.GetLatestInMinimumProcessingTimeForProxy)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetLatestInMinimumProcessingTimeForProxy.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               minimumTimes422 =
                                                   
                                                   
                                                         skel.getLatestInMinimumProcessingTimeForProxy(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), minimumTimes422, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getLatestInMinimumProcessingTimeForProxy"));
                                    } else 

            if("getLatestInCumulativeCountForSequence".equals(methodName)){
                
                org.wso2.carbon.bam.CumulativeCountsE cumulativeCounts424 = null;
	                        org.wso2.carbon.bam.GetLatestInCumulativeCountForSequence wrappedParam =
                                                             (org.wso2.carbon.bam.GetLatestInCumulativeCountForSequence)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetLatestInCumulativeCountForSequence.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               cumulativeCounts424 =
                                                   
                                                   
                                                         skel.getLatestInCumulativeCountForSequence(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), cumulativeCounts424, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getLatestInCumulativeCountForSequence"));
                                    } else 

            if("getSequences".equals(methodName)){
                
                org.wso2.carbon.bam.SequencesE sequences426 = null;
	                        org.wso2.carbon.bam.GetSequences wrappedParam =
                                                             (org.wso2.carbon.bam.GetSequences)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetSequences.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               sequences426 =
                                                   
                                                   
                                                         skel.getSequences(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), sequences426, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getSequences"));
                                    } else 

            if("getLatestFaultCountForServer".equals(methodName)){
                
                org.wso2.carbon.bam.CountsE counts428 = null;
	                        org.wso2.carbon.bam.GetLatestFaultCountForServer wrappedParam =
                                                             (org.wso2.carbon.bam.GetLatestFaultCountForServer)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetLatestFaultCountForServer.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               counts428 =
                                                   
                                                   
                                                         skel.getLatestFaultCountForServer(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), counts428, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getLatestFaultCountForServer"));
                                    } else 

            if("getLatestDataForServer".equals(methodName)){
                
                org.wso2.carbon.bam.ServerDataE serverData430 = null;
	                        org.wso2.carbon.bam.GetLatestDataForServer wrappedParam =
                                                             (org.wso2.carbon.bam.GetLatestDataForServer)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetLatestDataForServer.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               serverData430 =
                                                   
                                                   
                                                         skel.getLatestDataForServer(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), serverData430, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getLatestDataForServer"));
                                    } else 

            if("getAllActivityForTimeRange".equals(methodName)){
                
                org.wso2.carbon.bam.AllActivitiesE allActivities432 = null;
	                        org.wso2.carbon.bam.GetAllActivityForTimeRange wrappedParam =
                                                             (org.wso2.carbon.bam.GetAllActivityForTimeRange)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetAllActivityForTimeRange.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               allActivities432 =
                                                   
                                                   
                                                         skel.getAllActivityForTimeRange(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), allActivities432, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getAllActivityForTimeRange"));
                                    } else 

            if("getLatestOutCumulativeCountForProxy".equals(methodName)){
                
                org.wso2.carbon.bam.CumulativeCountsE cumulativeCounts434 = null;
	                        org.wso2.carbon.bam.GetLatestOutCumulativeCountForProxy wrappedParam =
                                                             (org.wso2.carbon.bam.GetLatestOutCumulativeCountForProxy)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetLatestOutCumulativeCountForProxy.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               cumulativeCounts434 =
                                                   
                                                   
                                                         skel.getLatestOutCumulativeCountForProxy(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), cumulativeCounts434, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getLatestOutCumulativeCountForProxy"));
                                    } else 

            if("getOperationNameList".equals(methodName)){
                
                org.wso2.carbon.bam.OperationsListE operationsList436 = null;
	                        org.wso2.carbon.bam.GetOperationNameList wrappedParam =
                                                             (org.wso2.carbon.bam.GetOperationNameList)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetOperationNameList.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               operationsList436 =
                                                   
                                                   
                                                         skel.getOperationNameList(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), operationsList436, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getOperationNameList"));
                                    } else 

            if("getAllActivityDataForTimeRangeAndOperation".equals(methodName)){
                
                org.wso2.carbon.bam.ActivityDatasE activityDatas438 = null;
	                        org.wso2.carbon.bam.GetAllActivityDataForTimeRangeAndOperation wrappedParam =
                                                             (org.wso2.carbon.bam.GetAllActivityDataForTimeRangeAndOperation)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetAllActivityDataForTimeRangeAndOperation.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               activityDatas438 =
                                                   
                                                   
                                                         skel.getAllActivityDataForTimeRangeAndOperation(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), activityDatas438, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getAllActivityDataForTimeRangeAndOperation"));
                                    } else 

            if("getLatestOutAverageProcessingTimeForSequence".equals(methodName)){
                
                org.wso2.carbon.bam.AverageTimesE averageTimes440 = null;
	                        org.wso2.carbon.bam.GetLatestOutAverageProcessingTimeForSequence wrappedParam =
                                                             (org.wso2.carbon.bam.GetLatestOutAverageProcessingTimeForSequence)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetLatestOutAverageProcessingTimeForSequence.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               averageTimes440 =
                                                   
                                                   
                                                         skel.getLatestOutAverageProcessingTimeForSequence(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), averageTimes440, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getLatestOutAverageProcessingTimeForSequence"));
                                    } else 

            if("getLatestOutCumulativeCountForSequence".equals(methodName)){
                
                org.wso2.carbon.bam.CumulativeCountsE cumulativeCounts442 = null;
	                        org.wso2.carbon.bam.GetLatestOutCumulativeCountForSequence wrappedParam =
                                                             (org.wso2.carbon.bam.GetLatestOutCumulativeCountForSequence)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetLatestOutCumulativeCountForSequence.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               cumulativeCounts442 =
                                                   
                                                   
                                                         skel.getLatestOutCumulativeCountForSequence(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), cumulativeCounts442, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getLatestOutCumulativeCountForSequence"));
                                    } else 

            if("getOperationListForActivity".equals(methodName)){
                
                org.wso2.carbon.bam.OperationsForServiceE operationsForService444 = null;
	                        org.wso2.carbon.bam.GetOperationListForActivity wrappedParam =
                                                             (org.wso2.carbon.bam.GetOperationListForActivity)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetOperationListForActivity.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               operationsForService444 =
                                                   
                                                   
                                                         skel.getOperationListForActivity(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), operationsForService444, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getOperationListForActivity"));
                                    } else 

            if("getProxyServices".equals(methodName)){
                
                org.wso2.carbon.bam.ProxyServicesE proxyServices446 = null;
	                        org.wso2.carbon.bam.GetProxyServices wrappedParam =
                                                             (org.wso2.carbon.bam.GetProxyServices)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetProxyServices.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               proxyServices446 =
                                                   
                                                   
                                                         skel.getProxyServices(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), proxyServices446, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getProxyServices"));
                                    } else 

            if("getMaxResponseTime".equals(methodName)){
                
                org.wso2.carbon.bam.TimesE times448 = null;
	                        org.wso2.carbon.bam.GetMaxResponseTime wrappedParam =
                                                             (org.wso2.carbon.bam.GetMaxResponseTime)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetMaxResponseTime.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               times448 =
                                                   
                                                   
                                                         skel.getMaxResponseTime(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), times448, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getMaxResponseTime"));
                                    } else 

            if("getAllActivityMessagesForTimeRange".equals(methodName)){
                
                org.wso2.carbon.bam.AllActivityMessagesE allActivityMessages450 = null;
	                        org.wso2.carbon.bam.GetAllActivityMessagesForTimeRange wrappedParam =
                                                             (org.wso2.carbon.bam.GetAllActivityMessagesForTimeRange)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetAllActivityMessagesForTimeRange.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               allActivityMessages450 =
                                                   
                                                   
                                                         skel.getAllActivityMessagesForTimeRange(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), allActivityMessages450, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getAllActivityMessagesForTimeRange"));
                                    } else 

            if("getActivityIDForActivityName".equals(methodName)){
                
                org.wso2.carbon.bam.ActivityIDsE activityIDs452 = null;
	                        org.wso2.carbon.bam.GetActivityIDForActivityName wrappedParam =
                                                             (org.wso2.carbon.bam.GetActivityIDForActivityName)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetActivityIDForActivityName.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               activityIDs452 =
                                                   
                                                   
                                                         skel.getActivityIDForActivityName(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), activityIDs452, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getActivityIDForActivityName"));
                                    } else 

            if("getLastMinuteRequestCount".equals(methodName)){
                
                org.wso2.carbon.bam.CountsE counts454 = null;
	                        org.wso2.carbon.bam.GetLastMinuteRequestCount wrappedParam =
                                                             (org.wso2.carbon.bam.GetLastMinuteRequestCount)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetLastMinuteRequestCount.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               counts454 =
                                                   
                                                   
                                                         skel.getLastMinuteRequestCount(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), counts454, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getLastMinuteRequestCount"));
                                    } else 

            if("getReplayedFailRequestCount".equals(methodName)){
                
                org.wso2.carbon.bam.ReplayedFailRequestCountListE replayedFailRequestCountList456 = null;
	                        org.wso2.carbon.bam.GetReplayedFailRequestCount wrappedParam =
                                                             (org.wso2.carbon.bam.GetReplayedFailRequestCount)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetReplayedFailRequestCount.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               replayedFailRequestCountList456 =
                                                   
                                                   
                                                         skel.getReplayedFailRequestCount(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), replayedFailRequestCountList456, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getReplayedFailRequestCount"));
                                    } else 

            if("getLatestAverageResponseTimeForServer".equals(methodName)){
                
                org.wso2.carbon.bam.TimesE times458 = null;
	                        org.wso2.carbon.bam.GetLatestAverageResponseTimeForServer wrappedParam =
                                                             (org.wso2.carbon.bam.GetLatestAverageResponseTimeForServer)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetLatestAverageResponseTimeForServer.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               times458 =
                                                   
                                                   
                                                         skel.getLatestAverageResponseTimeForServer(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), times458, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getLatestAverageResponseTimeForServer"));
                                    } else 

            if("getServiceListForActivity".equals(methodName)){
                
                org.wso2.carbon.bam.ServicesForServerE servicesForServer460 = null;
	                        org.wso2.carbon.bam.GetServiceListForActivity wrappedParam =
                                                             (org.wso2.carbon.bam.GetServiceListForActivity)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetServiceListForActivity.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               servicesForServer460 =
                                                   
                                                   
                                                         skel.getServiceListForActivity(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), servicesForServer460, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getServiceListForActivity"));
                                    } else 

            if("getMinResponseTimeSystem".equals(methodName)){
                
                org.wso2.carbon.bam.TimesE times462 = null;
	                        org.wso2.carbon.bam.GetMinResponseTimeSystem wrappedParam =
                                                             (org.wso2.carbon.bam.GetMinResponseTimeSystem)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetMinResponseTimeSystem.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               times462 =
                                                   
                                                   
                                                         skel.getMinResponseTimeSystem(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), times462, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getMinResponseTimeSystem"));
                                    } else 

            if("getAllMessages".equals(methodName)){
                
                org.wso2.carbon.bam.MessageDatasE messageDatas464 = null;
	                        org.wso2.carbon.bam.GetAllMessages wrappedParam =
                                                             (org.wso2.carbon.bam.GetAllMessages)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetAllMessages.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               messageDatas464 =
                                                   
                                                   
                                                         skel.getAllMessages(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), messageDatas464, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getAllMessages"));
                                    } else 

            if("getAvgResponseTime".equals(methodName)){
                
                org.wso2.carbon.bam.TimesE times466 = null;
	                        org.wso2.carbon.bam.GetAvgResponseTime wrappedParam =
                                                             (org.wso2.carbon.bam.GetAvgResponseTime)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetAvgResponseTime.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               times466 =
                                                   
                                                   
                                                         skel.getAvgResponseTime(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), times466, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getAvgResponseTime"));
                                    } else 

            if("getChildrenMessagesForSAP".equals(methodName)){
                
                org.wso2.carbon.bam.SAPchildrenE sAPchildren468 = null;
	                        org.wso2.carbon.bam.GetChildrenMessagesForSAP wrappedParam =
                                                             (org.wso2.carbon.bam.GetChildrenMessagesForSAP)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetChildrenMessagesForSAP.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               sAPchildren468 =
                                                   
                                                   
                                                         skel.getChildrenMessagesForSAP(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), sAPchildren468, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getChildrenMessagesForSAP"));
                                    } else 

            if("getLatestDataForServices".equals(methodName)){
                
                org.wso2.carbon.bam.ServiceDataE serviceData470 = null;
	                        org.wso2.carbon.bam.GetLatestDataForServices wrappedParam =
                                                             (org.wso2.carbon.bam.GetLatestDataForServices)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetLatestDataForServices.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               serviceData470 =
                                                   
                                                   
                                                         skel.getLatestDataForServices(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), serviceData470, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getLatestDataForServices"));
                                    } else 

            if("getOperationInfoForActivityID".equals(methodName)){
                
                org.wso2.carbon.bam.OperationInfosE operationInfos472 = null;
	                        org.wso2.carbon.bam.GetOperationInfoForActivityID wrappedParam =
                                                             (org.wso2.carbon.bam.GetOperationInfoForActivityID)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetOperationInfoForActivityID.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               operationInfos472 =
                                                   
                                                   
                                                         skel.getOperationInfoForActivityID(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), operationInfos472, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getOperationInfoForActivityID"));
                                    } else 

            if("getPropertyKeyForActivity".equals(methodName)){
                
                org.wso2.carbon.bam.PropertyKeysForActivityE propertyKeysForActivity474 = null;
	                        org.wso2.carbon.bam.GetPropertyKeyForActivity wrappedParam =
                                                             (org.wso2.carbon.bam.GetPropertyKeyForActivity)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetPropertyKeyForActivity.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               propertyKeysForActivity474 =
                                                   
                                                   
                                                         skel.getPropertyKeyForActivity(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), propertyKeysForActivity474, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getPropertyKeyForActivity"));
                                    } else 

            if("getMessagesCountForSAP".equals(methodName)){
                
                org.wso2.carbon.bam.SAPcountsE sAPcounts476 = null;
	                        org.wso2.carbon.bam.GetMessagesCountForSAP wrappedParam =
                                                             (org.wso2.carbon.bam.GetMessagesCountForSAP)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetMessagesCountForSAP.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               sAPcounts476 =
                                                   
                                                   
                                                         skel.getMessagesCountForSAP(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), sAPcounts476, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getMessagesCountForSAP"));
                                    } else 

            if("getLatestOutFaultCountForSequence".equals(methodName)){
                
                org.wso2.carbon.bam.FaultCountsE faultCounts478 = null;
	                        org.wso2.carbon.bam.GetLatestOutFaultCountForSequence wrappedParam =
                                                             (org.wso2.carbon.bam.GetLatestOutFaultCountForSequence)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetLatestOutFaultCountForSequence.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               faultCounts478 =
                                                   
                                                   
                                                         skel.getLatestOutFaultCountForSequence(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), faultCounts478, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getLatestOutFaultCountForSequence"));
                                    } else 

            if("getLatestInMaximumProcessingTimeForEndpoint".equals(methodName)){
                
                org.wso2.carbon.bam.MaximumTimesE maximumTimes480 = null;
	                        org.wso2.carbon.bam.GetLatestInMaximumProcessingTimeForEndpoint wrappedParam =
                                                             (org.wso2.carbon.bam.GetLatestInMaximumProcessingTimeForEndpoint)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetLatestInMaximumProcessingTimeForEndpoint.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               maximumTimes480 =
                                                   
                                                   
                                                         skel.getLatestInMaximumProcessingTimeForEndpoint(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), maximumTimes480, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getLatestInMaximumProcessingTimeForEndpoint"));
                                    } else 

            if("getReplayedFailReponseCount".equals(methodName)){
                
                org.wso2.carbon.bam.ReplayedFailResponseCountListE replayedFailResponseCountList482 = null;
	                        org.wso2.carbon.bam.GetReplayedFailReponseCount wrappedParam =
                                                             (org.wso2.carbon.bam.GetReplayedFailReponseCount)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetReplayedFailReponseCount.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               replayedFailResponseCountList482 =
                                                   
                                                   
                                                         skel.getReplayedFailReponseCount(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), replayedFailResponseCountList482, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getReplayedFailReponseCount"));
                                    } else 

            if("getOriginalFailCount".equals(methodName)){
                
                org.wso2.carbon.bam.OriginalFailCountListE originalFailCountList484 = null;
	                        org.wso2.carbon.bam.GetOriginalFailCount wrappedParam =
                                                             (org.wso2.carbon.bam.GetOriginalFailCount)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetOriginalFailCount.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               originalFailCountList484 =
                                                   
                                                   
                                                         skel.getOriginalFailCount(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), originalFailCountList484, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getOriginalFailCount"));
                                    } else 

            if("getLatestRequestCountForService".equals(methodName)){
                
                org.wso2.carbon.bam.CountsE counts486 = null;
	                        org.wso2.carbon.bam.GetLatestRequestCountForService wrappedParam =
                                                             (org.wso2.carbon.bam.GetLatestRequestCountForService)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetLatestRequestCountForService.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               counts486 =
                                                   
                                                   
                                                         skel.getLatestRequestCountForService(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), counts486, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getLatestRequestCountForService"));
                                    } else 

            if("getInCumulativeCountsForEndpoint".equals(methodName)){
                
                org.wso2.carbon.bam.CumulativeCountsE cumulativeCounts488 = null;
	                        org.wso2.carbon.bam.GetInCumulativeCountsForEndpoint wrappedParam =
                                                             (org.wso2.carbon.bam.GetInCumulativeCountsForEndpoint)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetInCumulativeCountsForEndpoint.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               cumulativeCounts488 =
                                                   
                                                   
                                                         skel.getInCumulativeCountsForEndpoint(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), cumulativeCounts488, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getInCumulativeCountsForEndpoint"));
                                    
            } else {
              throw new java.lang.RuntimeException("method not found");
            }
        

        newMsgContext.setEnvelope(envelope);
        }
        } catch (DataServiceFaultException e) {

            msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME,"DataServiceFault");
            org.apache.axis2.AxisFault f = createAxisFault(e);
            if (e.getFaultMessage() != null){
                f.setDetail(toOM(e.getFaultMessage(),false));
            }
            throw f;
            }
        
        catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
        }
        
        //
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetLatestOutFaultCountForProxy param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetLatestOutFaultCountForProxy.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.FaultCountsE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.FaultCountsE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.ws.dataservice.DataServiceFault param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.ws.dataservice.DataServiceFault.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetOperationsForOperationID param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetOperationsForOperationID.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.OperationsE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.OperationsE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetAllOperationsForTimeRange param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetAllOperationsForTimeRange.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.AllActivityMsgOperationsE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.AllActivityMsgOperationsE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetLatestMinimumResponseTimeForOperation param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetLatestMinimumResponseTimeForOperation.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.TimesE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.TimesE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetActivityDetailsForActivity param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetActivityDetailsForActivity.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.ActivityGroupsForTimeE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.ActivityGroupsForTimeE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetLatestMinimumResponseTimeForServer param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetLatestMinimumResponseTimeForServer.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetLatestMaximumResponseTimeForServer param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetLatestMaximumResponseTimeForServer.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetLatestInFaultCountForSequence param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetLatestInFaultCountForSequence.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetServerIdForServer param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetServerIdForServer.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.ServersE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.ServersE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetCountofChildrenFailedMessages param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetCountofChildrenFailedMessages.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.CountofChildrenFailedMessagesE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.CountofChildrenFailedMessagesE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetAllMessagesForTimeRangeAndActivity param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetAllMessagesForTimeRangeAndActivity.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.AllMessagesForActivitiesE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.AllMessagesForActivitiesE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetOperationIDForMessageID param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetOperationIDForMessageID.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.OperationIDsE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.OperationIDsE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetLatestMaximumResponseTimeForOperation param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetLatestMaximumResponseTimeForOperation.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetOperations param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetOperations.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetLatestInMinimumProcessingTimeForEndpoint param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetLatestInMinimumProcessingTimeForEndpoint.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.MinimumTimesE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.MinimumTimesE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetLatestResponseCountForOperation param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetLatestResponseCountForOperation.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.CountsE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.CountsE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetMaximumOperationsForAnActivityID param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetMaximumOperationsForAnActivityID.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.NumsE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.NumsE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GettimestampForOperation param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GettimestampForOperation.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.TimeStampsForOperationE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.TimeStampsForOperationE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.ws.dataservice.SetParentStatus param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.ws.dataservice.SetParentStatus.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetJMXMetricsWindow param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetJMXMetricsWindow.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.JmxMetricsInfosE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.JmxMetricsInfosE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetLatestInFaultCountForProxy param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetLatestInFaultCountForProxy.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetAleauditFailCount param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetAleauditFailCount.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.AleauditFailCountListE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.AleauditFailCountListE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetLatestInMaximumProcessingTimeForProxy param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetLatestInMaximumProcessingTimeForProxy.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.MaximumTimesE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.MaximumTimesE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetLatestAverageResponseTimeForService param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetLatestAverageResponseTimeForService.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetPropertyChildrenForActivity param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetPropertyChildrenForActivity.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.PropertyChildrenForActivityE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.PropertyChildrenForActivityE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetLatestDataForService param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetLatestDataForService.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.ServiceDataE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.ServiceDataE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetActivityDetailsForServer param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetActivityDetailsForServer.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.ActivitiesForServerE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.ActivitiesForServerE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetDetailsForActivity param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetDetailsForActivity.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.ActivitiesE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.ActivitiesE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetEndpoints param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetEndpoints.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.EndpointsE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.EndpointsE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetLatestOutMinimumProcessingTimeForSequence param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetLatestOutMinimumProcessingTimeForSequence.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetActivityDetailsForTimeRange param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetActivityDetailsForTimeRange.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.ActivitiesForTimeE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.ActivitiesForTimeE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetLatestOutMinimumProcessingTimeForProxy param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetLatestOutMinimumProcessingTimeForProxy.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetAleauditMessagesForSAP param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetAleauditMessagesForSAP.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.SAPaleauditsE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.SAPaleauditsE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetLatestInAverageProcessingTimeForProxy param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetLatestInAverageProcessingTimeForProxy.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.AverageTimesE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.AverageTimesE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetServerListForActivity param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetServerListForActivity.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.ServersForActivityE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.ServersForActivityE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetMessageCount param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetMessageCount.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.MessageCountsE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.MessageCountsE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetpropertyBagForActivity param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetpropertyBagForActivity.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.PropertyBagsE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.PropertyBagsE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetLastMinuteRequestCountSystem param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetLastMinuteRequestCountSystem.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetLatestInMinimumProcessingTimeForSequence param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetLatestInMinimumProcessingTimeForSequence.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetPropertyValueForStatus param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetPropertyValueForStatus.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.StatusListE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.StatusListE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetMessagesForStatus param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetMessagesForStatus.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.MessageIdListE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.MessageIdListE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetLatestOutMaximumProcessingTimeForSequence param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetLatestOutMaximumProcessingTimeForSequence.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetLatestResponseCountForServer param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetLatestResponseCountForServer.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetMaxResponseTimeSystem param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetMaxResponseTimeSystem.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetLatestRequestCountForServer param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetLatestRequestCountForServer.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetAllActivityDataForTimeRange param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetAllActivityDataForTimeRange.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.FullActivityDatasE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.FullActivityDatasE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetLatestResponseCountForService param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetLatestResponseCountForService.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetDirectionForOperation param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetDirectionForOperation.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.DirectionsForOperationE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.DirectionsForOperationE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetAllIpAddressForTimeRange param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetAllIpAddressForTimeRange.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.AllIpAddressesE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.AllIpAddressesE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetReqResFaultCountForServices param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetReqResFaultCountForServices.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.ServicesE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.ServicesE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetMessageForMessageID param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetMessageForMessageID.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.MessagesForMessageIDE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.MessagesForMessageIDE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetMessagesCountForOperationIDAndActivityID param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetMessagesCountForOperationIDAndActivityID.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.CountMessagessE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.CountMessagessE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetLatestFaultCountForOperation param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetLatestFaultCountForOperation.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetPropertyList param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetPropertyList.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.PropertiesE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.PropertiesE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetLatestMaximumResponseTimeForService param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetLatestMaximumResponseTimeForService.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetLatestInFaultCountForEndpoint param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetLatestInFaultCountForEndpoint.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetMessagesForOperationIDAndActivityID param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetMessagesForOperationIDAndActivityID.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.MessagesE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.MessagesE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetAllMessagesForTimeRange param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetAllMessagesForTimeRange.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.AllMessagesE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.AllMessagesE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetLatestInMaximumProcessingTimeForSequence param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetLatestInMaximumProcessingTimeForSequence.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetActivityInfoForActivityID param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetActivityInfoForActivityID.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.ActivityInfosE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.ActivityInfosE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetOperationForActivityID param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetOperationForActivityID.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.ActivityOperationsE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.ActivityOperationsE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetLatestRequestCountForOperation param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetLatestRequestCountForOperation.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetLatestInCumulativeCountForProxy param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetLatestInCumulativeCountForProxy.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.CumulativeCountsE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.CumulativeCountsE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetLatestInCumulativeCountForEndpoint param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetLatestInCumulativeCountForEndpoint.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetLatestInAverageProcessingTimeForEndpoint param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetLatestInAverageProcessingTimeForEndpoint.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetLatestOutMaximumProcessingTimeForProxy param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetLatestOutMaximumProcessingTimeForProxy.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetMinResponseTime param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetMinResponseTime.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetLatestMinimumResponseTimeForService param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetLatestMinimumResponseTimeForService.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetLatestInAverageProcessingTimeForSequence param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetLatestInAverageProcessingTimeForSequence.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetServiceForServer param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetServiceForServer.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetClientServiceOperation param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetClientServiceOperation.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.ClientServiceOperationInfosE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.ClientServiceOperationInfosE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetLatestAverageResponseTimeForOperation param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetLatestAverageResponseTimeForOperation.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetLatestDataForOperation param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetLatestDataForOperation.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.OperationDataE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.OperationDataE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetLatestFaultCountForService param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetLatestFaultCountForService.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetMessagesForOperation param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetMessagesForOperation.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.MessagesForOperationE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.MessagesForOperationE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetLatestOutAverageProcessingTimeForProxy param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetLatestOutAverageProcessingTimeForProxy.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetAvgResponseTimeSystem param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetAvgResponseTimeSystem.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetLatestInMinimumProcessingTimeForProxy param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetLatestInMinimumProcessingTimeForProxy.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetLatestInCumulativeCountForSequence param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetLatestInCumulativeCountForSequence.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetSequences param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetSequences.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.SequencesE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.SequencesE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetLatestFaultCountForServer param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetLatestFaultCountForServer.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetLatestDataForServer param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetLatestDataForServer.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.ServerDataE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.ServerDataE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetAllActivityForTimeRange param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetAllActivityForTimeRange.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.AllActivitiesE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.AllActivitiesE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetLatestOutCumulativeCountForProxy param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetLatestOutCumulativeCountForProxy.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetOperationNameList param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetOperationNameList.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.OperationsListE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.OperationsListE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetAllActivityDataForTimeRangeAndOperation param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetAllActivityDataForTimeRangeAndOperation.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.ActivityDatasE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.ActivityDatasE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetLatestOutAverageProcessingTimeForSequence param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetLatestOutAverageProcessingTimeForSequence.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetLatestOutCumulativeCountForSequence param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetLatestOutCumulativeCountForSequence.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetOperationListForActivity param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetOperationListForActivity.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.OperationsForServiceE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.OperationsForServiceE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetProxyServices param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetProxyServices.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.ProxyServicesE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.ProxyServicesE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetMaxResponseTime param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetMaxResponseTime.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetAllActivityMessagesForTimeRange param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetAllActivityMessagesForTimeRange.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.AllActivityMessagesE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.AllActivityMessagesE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetActivityIDForActivityName param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetActivityIDForActivityName.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.ActivityIDsE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.ActivityIDsE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetLastMinuteRequestCount param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetLastMinuteRequestCount.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetReplayedFailRequestCount param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetReplayedFailRequestCount.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.ReplayedFailRequestCountListE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.ReplayedFailRequestCountListE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetLatestAverageResponseTimeForServer param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetLatestAverageResponseTimeForServer.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetServiceListForActivity param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetServiceListForActivity.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.ServicesForServerE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.ServicesForServerE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetMinResponseTimeSystem param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetMinResponseTimeSystem.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetAllMessages param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetAllMessages.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.MessageDatasE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.MessageDatasE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetAvgResponseTime param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetAvgResponseTime.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetChildrenMessagesForSAP param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetChildrenMessagesForSAP.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.SAPchildrenE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.SAPchildrenE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetLatestDataForServices param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetLatestDataForServices.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetOperationInfoForActivityID param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetOperationInfoForActivityID.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.OperationInfosE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.OperationInfosE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetPropertyKeyForActivity param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetPropertyKeyForActivity.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.PropertyKeysForActivityE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.PropertyKeysForActivityE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetMessagesCountForSAP param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetMessagesCountForSAP.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.SAPcountsE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.SAPcountsE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetLatestOutFaultCountForSequence param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetLatestOutFaultCountForSequence.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetLatestInMaximumProcessingTimeForEndpoint param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetLatestInMaximumProcessingTimeForEndpoint.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetReplayedFailReponseCount param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetReplayedFailReponseCount.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.ReplayedFailResponseCountListE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.ReplayedFailResponseCountListE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetOriginalFailCount param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetOriginalFailCount.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.OriginalFailCountListE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.OriginalFailCountListE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetLatestRequestCountForService param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetLatestRequestCountForService.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetInCumulativeCountsForEndpoint param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetInCumulativeCountsForEndpoint.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.bam.FaultCountsE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.bam.FaultCountsE.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.bam.FaultCountsE wrapgetLatestOutFaultCountForProxy(){
                                org.wso2.carbon.bam.FaultCountsE wrappedElement = new org.wso2.carbon.bam.FaultCountsE();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.bam.OperationsE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.bam.OperationsE.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.bam.OperationsE wrapgetOperationsForOperationID(){
                                org.wso2.carbon.bam.OperationsE wrappedElement = new org.wso2.carbon.bam.OperationsE();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.bam.AllActivityMsgOperationsE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.bam.AllActivityMsgOperationsE.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.bam.AllActivityMsgOperationsE wrapgetAllOperationsForTimeRange(){
                                org.wso2.carbon.bam.AllActivityMsgOperationsE wrappedElement = new org.wso2.carbon.bam.AllActivityMsgOperationsE();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.bam.TimesE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.bam.TimesE.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.bam.TimesE wrapgetLatestMinimumResponseTimeForOperation(){
                                org.wso2.carbon.bam.TimesE wrappedElement = new org.wso2.carbon.bam.TimesE();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.bam.ActivityGroupsForTimeE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.bam.ActivityGroupsForTimeE.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.bam.ActivityGroupsForTimeE wrapgetActivityDetailsForActivity(){
                                org.wso2.carbon.bam.ActivityGroupsForTimeE wrappedElement = new org.wso2.carbon.bam.ActivityGroupsForTimeE();
                                return wrappedElement;
                         }
                    
                         private org.wso2.carbon.bam.TimesE wrapgetLatestMinimumResponseTimeForServer(){
                                org.wso2.carbon.bam.TimesE wrappedElement = new org.wso2.carbon.bam.TimesE();
                                return wrappedElement;
                         }
                    
                         private org.wso2.carbon.bam.TimesE wrapgetLatestMaximumResponseTimeForServer(){
                                org.wso2.carbon.bam.TimesE wrappedElement = new org.wso2.carbon.bam.TimesE();
                                return wrappedElement;
                         }
                    
                         private org.wso2.carbon.bam.FaultCountsE wrapgetLatestInFaultCountForSequence(){
                                org.wso2.carbon.bam.FaultCountsE wrappedElement = new org.wso2.carbon.bam.FaultCountsE();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.bam.ServersE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.bam.ServersE.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.bam.ServersE wrapgetServerIdForServer(){
                                org.wso2.carbon.bam.ServersE wrappedElement = new org.wso2.carbon.bam.ServersE();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.bam.CountofChildrenFailedMessagesE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.bam.CountofChildrenFailedMessagesE.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.bam.CountofChildrenFailedMessagesE wrapgetCountofChildrenFailedMessages(){
                                org.wso2.carbon.bam.CountofChildrenFailedMessagesE wrappedElement = new org.wso2.carbon.bam.CountofChildrenFailedMessagesE();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.bam.AllMessagesForActivitiesE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.bam.AllMessagesForActivitiesE.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.bam.AllMessagesForActivitiesE wrapgetAllMessagesForTimeRangeAndActivity(){
                                org.wso2.carbon.bam.AllMessagesForActivitiesE wrappedElement = new org.wso2.carbon.bam.AllMessagesForActivitiesE();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.bam.OperationIDsE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.bam.OperationIDsE.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.bam.OperationIDsE wrapgetOperationIDForMessageID(){
                                org.wso2.carbon.bam.OperationIDsE wrappedElement = new org.wso2.carbon.bam.OperationIDsE();
                                return wrappedElement;
                         }
                    
                         private org.wso2.carbon.bam.TimesE wrapgetLatestMaximumResponseTimeForOperation(){
                                org.wso2.carbon.bam.TimesE wrappedElement = new org.wso2.carbon.bam.TimesE();
                                return wrappedElement;
                         }
                    
                         private org.wso2.carbon.bam.OperationsE wrapgetOperations(){
                                org.wso2.carbon.bam.OperationsE wrappedElement = new org.wso2.carbon.bam.OperationsE();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.bam.MinimumTimesE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.bam.MinimumTimesE.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.bam.MinimumTimesE wrapgetLatestInMinimumProcessingTimeForEndpoint(){
                                org.wso2.carbon.bam.MinimumTimesE wrappedElement = new org.wso2.carbon.bam.MinimumTimesE();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.bam.CountsE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.bam.CountsE.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.bam.CountsE wrapgetLatestResponseCountForOperation(){
                                org.wso2.carbon.bam.CountsE wrappedElement = new org.wso2.carbon.bam.CountsE();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.bam.NumsE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.bam.NumsE.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.bam.NumsE wrapgetMaximumOperationsForAnActivityID(){
                                org.wso2.carbon.bam.NumsE wrappedElement = new org.wso2.carbon.bam.NumsE();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.bam.TimeStampsForOperationE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.bam.TimeStampsForOperationE.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.bam.TimeStampsForOperationE wrapgettimestampForOperation(){
                                org.wso2.carbon.bam.TimeStampsForOperationE wrappedElement = new org.wso2.carbon.bam.TimeStampsForOperationE();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.bam.JmxMetricsInfosE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.bam.JmxMetricsInfosE.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.bam.JmxMetricsInfosE wrapgetJMXMetricsWindow(){
                                org.wso2.carbon.bam.JmxMetricsInfosE wrappedElement = new org.wso2.carbon.bam.JmxMetricsInfosE();
                                return wrappedElement;
                         }
                    
                         private org.wso2.carbon.bam.FaultCountsE wrapgetLatestInFaultCountForProxy(){
                                org.wso2.carbon.bam.FaultCountsE wrappedElement = new org.wso2.carbon.bam.FaultCountsE();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.bam.AleauditFailCountListE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.bam.AleauditFailCountListE.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.bam.AleauditFailCountListE wrapgetAleauditFailCount(){
                                org.wso2.carbon.bam.AleauditFailCountListE wrappedElement = new org.wso2.carbon.bam.AleauditFailCountListE();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.bam.MaximumTimesE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.bam.MaximumTimesE.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.bam.MaximumTimesE wrapgetLatestInMaximumProcessingTimeForProxy(){
                                org.wso2.carbon.bam.MaximumTimesE wrappedElement = new org.wso2.carbon.bam.MaximumTimesE();
                                return wrappedElement;
                         }
                    
                         private org.wso2.carbon.bam.TimesE wrapgetLatestAverageResponseTimeForService(){
                                org.wso2.carbon.bam.TimesE wrappedElement = new org.wso2.carbon.bam.TimesE();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.bam.PropertyChildrenForActivityE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.bam.PropertyChildrenForActivityE.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.bam.PropertyChildrenForActivityE wrapgetPropertyChildrenForActivity(){
                                org.wso2.carbon.bam.PropertyChildrenForActivityE wrappedElement = new org.wso2.carbon.bam.PropertyChildrenForActivityE();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.bam.ServiceDataE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.bam.ServiceDataE.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.bam.ServiceDataE wrapgetLatestDataForService(){
                                org.wso2.carbon.bam.ServiceDataE wrappedElement = new org.wso2.carbon.bam.ServiceDataE();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.bam.ActivitiesForServerE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.bam.ActivitiesForServerE.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.bam.ActivitiesForServerE wrapgetActivityDetailsForServer(){
                                org.wso2.carbon.bam.ActivitiesForServerE wrappedElement = new org.wso2.carbon.bam.ActivitiesForServerE();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.bam.ActivitiesE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.bam.ActivitiesE.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.bam.ActivitiesE wrapgetDetailsForActivity(){
                                org.wso2.carbon.bam.ActivitiesE wrappedElement = new org.wso2.carbon.bam.ActivitiesE();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.bam.EndpointsE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.bam.EndpointsE.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.bam.EndpointsE wrapgetEndpoints(){
                                org.wso2.carbon.bam.EndpointsE wrappedElement = new org.wso2.carbon.bam.EndpointsE();
                                return wrappedElement;
                         }
                    
                         private org.wso2.carbon.bam.MinimumTimesE wrapgetLatestOutMinimumProcessingTimeForSequence(){
                                org.wso2.carbon.bam.MinimumTimesE wrappedElement = new org.wso2.carbon.bam.MinimumTimesE();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.bam.ActivitiesForTimeE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.bam.ActivitiesForTimeE.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.bam.ActivitiesForTimeE wrapgetActivityDetailsForTimeRange(){
                                org.wso2.carbon.bam.ActivitiesForTimeE wrappedElement = new org.wso2.carbon.bam.ActivitiesForTimeE();
                                return wrappedElement;
                         }
                    
                         private org.wso2.carbon.bam.MinimumTimesE wrapgetLatestOutMinimumProcessingTimeForProxy(){
                                org.wso2.carbon.bam.MinimumTimesE wrappedElement = new org.wso2.carbon.bam.MinimumTimesE();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.bam.SAPaleauditsE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.bam.SAPaleauditsE.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.bam.SAPaleauditsE wrapgetAleauditMessagesForSAP(){
                                org.wso2.carbon.bam.SAPaleauditsE wrappedElement = new org.wso2.carbon.bam.SAPaleauditsE();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.bam.AverageTimesE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.bam.AverageTimesE.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.bam.AverageTimesE wrapgetLatestInAverageProcessingTimeForProxy(){
                                org.wso2.carbon.bam.AverageTimesE wrappedElement = new org.wso2.carbon.bam.AverageTimesE();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.bam.ServersForActivityE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.bam.ServersForActivityE.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.bam.ServersForActivityE wrapgetServerListForActivity(){
                                org.wso2.carbon.bam.ServersForActivityE wrappedElement = new org.wso2.carbon.bam.ServersForActivityE();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.bam.MessageCountsE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.bam.MessageCountsE.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.bam.MessageCountsE wrapgetMessageCount(){
                                org.wso2.carbon.bam.MessageCountsE wrappedElement = new org.wso2.carbon.bam.MessageCountsE();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.bam.PropertyBagsE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.bam.PropertyBagsE.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.bam.PropertyBagsE wrapgetpropertyBagForActivity(){
                                org.wso2.carbon.bam.PropertyBagsE wrappedElement = new org.wso2.carbon.bam.PropertyBagsE();
                                return wrappedElement;
                         }
                    
                         private org.wso2.carbon.bam.CountsE wrapgetLastMinuteRequestCountSystem(){
                                org.wso2.carbon.bam.CountsE wrappedElement = new org.wso2.carbon.bam.CountsE();
                                return wrappedElement;
                         }
                    
                         private org.wso2.carbon.bam.MinimumTimesE wrapgetLatestInMinimumProcessingTimeForSequence(){
                                org.wso2.carbon.bam.MinimumTimesE wrappedElement = new org.wso2.carbon.bam.MinimumTimesE();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.bam.StatusListE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.bam.StatusListE.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.bam.StatusListE wrapgetPropertyValueForStatus(){
                                org.wso2.carbon.bam.StatusListE wrappedElement = new org.wso2.carbon.bam.StatusListE();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.bam.MessageIdListE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.bam.MessageIdListE.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.bam.MessageIdListE wrapgetMessagesForStatus(){
                                org.wso2.carbon.bam.MessageIdListE wrappedElement = new org.wso2.carbon.bam.MessageIdListE();
                                return wrappedElement;
                         }
                    
                         private org.wso2.carbon.bam.MaximumTimesE wrapgetLatestOutMaximumProcessingTimeForSequence(){
                                org.wso2.carbon.bam.MaximumTimesE wrappedElement = new org.wso2.carbon.bam.MaximumTimesE();
                                return wrappedElement;
                         }
                    
                         private org.wso2.carbon.bam.CountsE wrapgetLatestResponseCountForServer(){
                                org.wso2.carbon.bam.CountsE wrappedElement = new org.wso2.carbon.bam.CountsE();
                                return wrappedElement;
                         }
                    
                         private org.wso2.carbon.bam.TimesE wrapgetMaxResponseTimeSystem(){
                                org.wso2.carbon.bam.TimesE wrappedElement = new org.wso2.carbon.bam.TimesE();
                                return wrappedElement;
                         }
                    
                         private org.wso2.carbon.bam.CountsE wrapgetLatestRequestCountForServer(){
                                org.wso2.carbon.bam.CountsE wrappedElement = new org.wso2.carbon.bam.CountsE();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.bam.FullActivityDatasE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.bam.FullActivityDatasE.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.bam.FullActivityDatasE wrapgetAllActivityDataForTimeRange(){
                                org.wso2.carbon.bam.FullActivityDatasE wrappedElement = new org.wso2.carbon.bam.FullActivityDatasE();
                                return wrappedElement;
                         }
                    
                         private org.wso2.carbon.bam.CountsE wrapgetLatestResponseCountForService(){
                                org.wso2.carbon.bam.CountsE wrappedElement = new org.wso2.carbon.bam.CountsE();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.bam.DirectionsForOperationE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.bam.DirectionsForOperationE.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.bam.DirectionsForOperationE wrapgetDirectionForOperation(){
                                org.wso2.carbon.bam.DirectionsForOperationE wrappedElement = new org.wso2.carbon.bam.DirectionsForOperationE();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.bam.AllIpAddressesE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.bam.AllIpAddressesE.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.bam.AllIpAddressesE wrapgetAllIpAddressForTimeRange(){
                                org.wso2.carbon.bam.AllIpAddressesE wrappedElement = new org.wso2.carbon.bam.AllIpAddressesE();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.bam.ServicesE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.bam.ServicesE.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.bam.ServicesE wrapgetReqResFaultCountForServices(){
                                org.wso2.carbon.bam.ServicesE wrappedElement = new org.wso2.carbon.bam.ServicesE();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.bam.MessagesForMessageIDE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.bam.MessagesForMessageIDE.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.bam.MessagesForMessageIDE wrapgetMessageForMessageID(){
                                org.wso2.carbon.bam.MessagesForMessageIDE wrappedElement = new org.wso2.carbon.bam.MessagesForMessageIDE();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.bam.CountMessagessE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.bam.CountMessagessE.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.bam.CountMessagessE wrapgetMessagesCountForOperationIDAndActivityID(){
                                org.wso2.carbon.bam.CountMessagessE wrappedElement = new org.wso2.carbon.bam.CountMessagessE();
                                return wrappedElement;
                         }
                    
                         private org.wso2.carbon.bam.CountsE wrapgetLatestFaultCountForOperation(){
                                org.wso2.carbon.bam.CountsE wrappedElement = new org.wso2.carbon.bam.CountsE();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.bam.PropertiesE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.bam.PropertiesE.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.bam.PropertiesE wrapgetPropertyList(){
                                org.wso2.carbon.bam.PropertiesE wrappedElement = new org.wso2.carbon.bam.PropertiesE();
                                return wrappedElement;
                         }
                    
                         private org.wso2.carbon.bam.TimesE wrapgetLatestMaximumResponseTimeForService(){
                                org.wso2.carbon.bam.TimesE wrappedElement = new org.wso2.carbon.bam.TimesE();
                                return wrappedElement;
                         }
                    
                         private org.wso2.carbon.bam.FaultCountsE wrapgetLatestInFaultCountForEndpoint(){
                                org.wso2.carbon.bam.FaultCountsE wrappedElement = new org.wso2.carbon.bam.FaultCountsE();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.bam.MessagesE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.bam.MessagesE.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.bam.MessagesE wrapgetMessagesForOperationIDAndActivityID(){
                                org.wso2.carbon.bam.MessagesE wrappedElement = new org.wso2.carbon.bam.MessagesE();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.bam.AllMessagesE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.bam.AllMessagesE.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.bam.AllMessagesE wrapgetAllMessagesForTimeRange(){
                                org.wso2.carbon.bam.AllMessagesE wrappedElement = new org.wso2.carbon.bam.AllMessagesE();
                                return wrappedElement;
                         }
                    
                         private org.wso2.carbon.bam.MaximumTimesE wrapgetLatestInMaximumProcessingTimeForSequence(){
                                org.wso2.carbon.bam.MaximumTimesE wrappedElement = new org.wso2.carbon.bam.MaximumTimesE();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.bam.ActivityInfosE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.bam.ActivityInfosE.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.bam.ActivityInfosE wrapgetActivityInfoForActivityID(){
                                org.wso2.carbon.bam.ActivityInfosE wrappedElement = new org.wso2.carbon.bam.ActivityInfosE();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.bam.ActivityOperationsE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.bam.ActivityOperationsE.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.bam.ActivityOperationsE wrapgetOperationForActivityID(){
                                org.wso2.carbon.bam.ActivityOperationsE wrappedElement = new org.wso2.carbon.bam.ActivityOperationsE();
                                return wrappedElement;
                         }
                    
                         private org.wso2.carbon.bam.CountsE wrapgetLatestRequestCountForOperation(){
                                org.wso2.carbon.bam.CountsE wrappedElement = new org.wso2.carbon.bam.CountsE();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.bam.CumulativeCountsE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.bam.CumulativeCountsE.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.bam.CumulativeCountsE wrapgetLatestInCumulativeCountForProxy(){
                                org.wso2.carbon.bam.CumulativeCountsE wrappedElement = new org.wso2.carbon.bam.CumulativeCountsE();
                                return wrappedElement;
                         }
                    
                         private org.wso2.carbon.bam.CumulativeCountsE wrapgetLatestInCumulativeCountForEndpoint(){
                                org.wso2.carbon.bam.CumulativeCountsE wrappedElement = new org.wso2.carbon.bam.CumulativeCountsE();
                                return wrappedElement;
                         }
                    
                         private org.wso2.carbon.bam.AverageTimesE wrapgetLatestInAverageProcessingTimeForEndpoint(){
                                org.wso2.carbon.bam.AverageTimesE wrappedElement = new org.wso2.carbon.bam.AverageTimesE();
                                return wrappedElement;
                         }
                    
                         private org.wso2.carbon.bam.MaximumTimesE wrapgetLatestOutMaximumProcessingTimeForProxy(){
                                org.wso2.carbon.bam.MaximumTimesE wrappedElement = new org.wso2.carbon.bam.MaximumTimesE();
                                return wrappedElement;
                         }
                    
                         private org.wso2.carbon.bam.TimesE wrapgetMinResponseTime(){
                                org.wso2.carbon.bam.TimesE wrappedElement = new org.wso2.carbon.bam.TimesE();
                                return wrappedElement;
                         }
                    
                         private org.wso2.carbon.bam.TimesE wrapgetLatestMinimumResponseTimeForService(){
                                org.wso2.carbon.bam.TimesE wrappedElement = new org.wso2.carbon.bam.TimesE();
                                return wrappedElement;
                         }
                    
                         private org.wso2.carbon.bam.AverageTimesE wrapgetLatestInAverageProcessingTimeForSequence(){
                                org.wso2.carbon.bam.AverageTimesE wrappedElement = new org.wso2.carbon.bam.AverageTimesE();
                                return wrappedElement;
                         }
                    
                         private org.wso2.carbon.bam.ServicesE wrapgetServiceForServer(){
                                org.wso2.carbon.bam.ServicesE wrappedElement = new org.wso2.carbon.bam.ServicesE();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.bam.ClientServiceOperationInfosE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.bam.ClientServiceOperationInfosE.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.bam.ClientServiceOperationInfosE wrapgetClientServiceOperation(){
                                org.wso2.carbon.bam.ClientServiceOperationInfosE wrappedElement = new org.wso2.carbon.bam.ClientServiceOperationInfosE();
                                return wrappedElement;
                         }
                    
                         private org.wso2.carbon.bam.TimesE wrapgetLatestAverageResponseTimeForOperation(){
                                org.wso2.carbon.bam.TimesE wrappedElement = new org.wso2.carbon.bam.TimesE();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.bam.OperationDataE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.bam.OperationDataE.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.bam.OperationDataE wrapgetLatestDataForOperation(){
                                org.wso2.carbon.bam.OperationDataE wrappedElement = new org.wso2.carbon.bam.OperationDataE();
                                return wrappedElement;
                         }
                    
                         private org.wso2.carbon.bam.CountsE wrapgetLatestFaultCountForService(){
                                org.wso2.carbon.bam.CountsE wrappedElement = new org.wso2.carbon.bam.CountsE();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.bam.MessagesForOperationE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.bam.MessagesForOperationE.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.bam.MessagesForOperationE wrapgetMessagesForOperation(){
                                org.wso2.carbon.bam.MessagesForOperationE wrappedElement = new org.wso2.carbon.bam.MessagesForOperationE();
                                return wrappedElement;
                         }
                    
                         private org.wso2.carbon.bam.AverageTimesE wrapgetLatestOutAverageProcessingTimeForProxy(){
                                org.wso2.carbon.bam.AverageTimesE wrappedElement = new org.wso2.carbon.bam.AverageTimesE();
                                return wrappedElement;
                         }
                    
                         private org.wso2.carbon.bam.TimesE wrapgetAvgResponseTimeSystem(){
                                org.wso2.carbon.bam.TimesE wrappedElement = new org.wso2.carbon.bam.TimesE();
                                return wrappedElement;
                         }
                    
                         private org.wso2.carbon.bam.MinimumTimesE wrapgetLatestInMinimumProcessingTimeForProxy(){
                                org.wso2.carbon.bam.MinimumTimesE wrappedElement = new org.wso2.carbon.bam.MinimumTimesE();
                                return wrappedElement;
                         }
                    
                         private org.wso2.carbon.bam.CumulativeCountsE wrapgetLatestInCumulativeCountForSequence(){
                                org.wso2.carbon.bam.CumulativeCountsE wrappedElement = new org.wso2.carbon.bam.CumulativeCountsE();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.bam.SequencesE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.bam.SequencesE.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.bam.SequencesE wrapgetSequences(){
                                org.wso2.carbon.bam.SequencesE wrappedElement = new org.wso2.carbon.bam.SequencesE();
                                return wrappedElement;
                         }
                    
                         private org.wso2.carbon.bam.CountsE wrapgetLatestFaultCountForServer(){
                                org.wso2.carbon.bam.CountsE wrappedElement = new org.wso2.carbon.bam.CountsE();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.bam.ServerDataE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.bam.ServerDataE.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.bam.ServerDataE wrapgetLatestDataForServer(){
                                org.wso2.carbon.bam.ServerDataE wrappedElement = new org.wso2.carbon.bam.ServerDataE();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.bam.AllActivitiesE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.bam.AllActivitiesE.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.bam.AllActivitiesE wrapgetAllActivityForTimeRange(){
                                org.wso2.carbon.bam.AllActivitiesE wrappedElement = new org.wso2.carbon.bam.AllActivitiesE();
                                return wrappedElement;
                         }
                    
                         private org.wso2.carbon.bam.CumulativeCountsE wrapgetLatestOutCumulativeCountForProxy(){
                                org.wso2.carbon.bam.CumulativeCountsE wrappedElement = new org.wso2.carbon.bam.CumulativeCountsE();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.bam.OperationsListE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.bam.OperationsListE.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.bam.OperationsListE wrapgetOperationNameList(){
                                org.wso2.carbon.bam.OperationsListE wrappedElement = new org.wso2.carbon.bam.OperationsListE();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.bam.ActivityDatasE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.bam.ActivityDatasE.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.bam.ActivityDatasE wrapgetAllActivityDataForTimeRangeAndOperation(){
                                org.wso2.carbon.bam.ActivityDatasE wrappedElement = new org.wso2.carbon.bam.ActivityDatasE();
                                return wrappedElement;
                         }
                    
                         private org.wso2.carbon.bam.AverageTimesE wrapgetLatestOutAverageProcessingTimeForSequence(){
                                org.wso2.carbon.bam.AverageTimesE wrappedElement = new org.wso2.carbon.bam.AverageTimesE();
                                return wrappedElement;
                         }
                    
                         private org.wso2.carbon.bam.CumulativeCountsE wrapgetLatestOutCumulativeCountForSequence(){
                                org.wso2.carbon.bam.CumulativeCountsE wrappedElement = new org.wso2.carbon.bam.CumulativeCountsE();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.bam.OperationsForServiceE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.bam.OperationsForServiceE.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.bam.OperationsForServiceE wrapgetOperationListForActivity(){
                                org.wso2.carbon.bam.OperationsForServiceE wrappedElement = new org.wso2.carbon.bam.OperationsForServiceE();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.bam.ProxyServicesE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.bam.ProxyServicesE.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.bam.ProxyServicesE wrapgetProxyServices(){
                                org.wso2.carbon.bam.ProxyServicesE wrappedElement = new org.wso2.carbon.bam.ProxyServicesE();
                                return wrappedElement;
                         }
                    
                         private org.wso2.carbon.bam.TimesE wrapgetMaxResponseTime(){
                                org.wso2.carbon.bam.TimesE wrappedElement = new org.wso2.carbon.bam.TimesE();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.bam.AllActivityMessagesE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.bam.AllActivityMessagesE.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.bam.AllActivityMessagesE wrapgetAllActivityMessagesForTimeRange(){
                                org.wso2.carbon.bam.AllActivityMessagesE wrappedElement = new org.wso2.carbon.bam.AllActivityMessagesE();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.bam.ActivityIDsE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.bam.ActivityIDsE.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.bam.ActivityIDsE wrapgetActivityIDForActivityName(){
                                org.wso2.carbon.bam.ActivityIDsE wrappedElement = new org.wso2.carbon.bam.ActivityIDsE();
                                return wrappedElement;
                         }
                    
                         private org.wso2.carbon.bam.CountsE wrapgetLastMinuteRequestCount(){
                                org.wso2.carbon.bam.CountsE wrappedElement = new org.wso2.carbon.bam.CountsE();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.bam.ReplayedFailRequestCountListE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.bam.ReplayedFailRequestCountListE.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.bam.ReplayedFailRequestCountListE wrapgetReplayedFailRequestCount(){
                                org.wso2.carbon.bam.ReplayedFailRequestCountListE wrappedElement = new org.wso2.carbon.bam.ReplayedFailRequestCountListE();
                                return wrappedElement;
                         }
                    
                         private org.wso2.carbon.bam.TimesE wrapgetLatestAverageResponseTimeForServer(){
                                org.wso2.carbon.bam.TimesE wrappedElement = new org.wso2.carbon.bam.TimesE();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.bam.ServicesForServerE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.bam.ServicesForServerE.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.bam.ServicesForServerE wrapgetServiceListForActivity(){
                                org.wso2.carbon.bam.ServicesForServerE wrappedElement = new org.wso2.carbon.bam.ServicesForServerE();
                                return wrappedElement;
                         }
                    
                         private org.wso2.carbon.bam.TimesE wrapgetMinResponseTimeSystem(){
                                org.wso2.carbon.bam.TimesE wrappedElement = new org.wso2.carbon.bam.TimesE();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.bam.MessageDatasE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.bam.MessageDatasE.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.bam.MessageDatasE wrapgetAllMessages(){
                                org.wso2.carbon.bam.MessageDatasE wrappedElement = new org.wso2.carbon.bam.MessageDatasE();
                                return wrappedElement;
                         }
                    
                         private org.wso2.carbon.bam.TimesE wrapgetAvgResponseTime(){
                                org.wso2.carbon.bam.TimesE wrappedElement = new org.wso2.carbon.bam.TimesE();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.bam.SAPchildrenE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.bam.SAPchildrenE.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.bam.SAPchildrenE wrapgetChildrenMessagesForSAP(){
                                org.wso2.carbon.bam.SAPchildrenE wrappedElement = new org.wso2.carbon.bam.SAPchildrenE();
                                return wrappedElement;
                         }
                    
                         private org.wso2.carbon.bam.ServiceDataE wrapgetLatestDataForServices(){
                                org.wso2.carbon.bam.ServiceDataE wrappedElement = new org.wso2.carbon.bam.ServiceDataE();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.bam.OperationInfosE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.bam.OperationInfosE.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.bam.OperationInfosE wrapgetOperationInfoForActivityID(){
                                org.wso2.carbon.bam.OperationInfosE wrappedElement = new org.wso2.carbon.bam.OperationInfosE();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.bam.PropertyKeysForActivityE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.bam.PropertyKeysForActivityE.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.bam.PropertyKeysForActivityE wrapgetPropertyKeyForActivity(){
                                org.wso2.carbon.bam.PropertyKeysForActivityE wrappedElement = new org.wso2.carbon.bam.PropertyKeysForActivityE();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.bam.SAPcountsE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.bam.SAPcountsE.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.bam.SAPcountsE wrapgetMessagesCountForSAP(){
                                org.wso2.carbon.bam.SAPcountsE wrappedElement = new org.wso2.carbon.bam.SAPcountsE();
                                return wrappedElement;
                         }
                    
                         private org.wso2.carbon.bam.FaultCountsE wrapgetLatestOutFaultCountForSequence(){
                                org.wso2.carbon.bam.FaultCountsE wrappedElement = new org.wso2.carbon.bam.FaultCountsE();
                                return wrappedElement;
                         }
                    
                         private org.wso2.carbon.bam.MaximumTimesE wrapgetLatestInMaximumProcessingTimeForEndpoint(){
                                org.wso2.carbon.bam.MaximumTimesE wrappedElement = new org.wso2.carbon.bam.MaximumTimesE();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.bam.ReplayedFailResponseCountListE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.bam.ReplayedFailResponseCountListE.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.bam.ReplayedFailResponseCountListE wrapgetReplayedFailReponseCount(){
                                org.wso2.carbon.bam.ReplayedFailResponseCountListE wrappedElement = new org.wso2.carbon.bam.ReplayedFailResponseCountListE();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.bam.OriginalFailCountListE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.bam.OriginalFailCountListE.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.bam.OriginalFailCountListE wrapgetOriginalFailCount(){
                                org.wso2.carbon.bam.OriginalFailCountListE wrappedElement = new org.wso2.carbon.bam.OriginalFailCountListE();
                                return wrappedElement;
                         }
                    
                         private org.wso2.carbon.bam.CountsE wrapgetLatestRequestCountForService(){
                                org.wso2.carbon.bam.CountsE wrappedElement = new org.wso2.carbon.bam.CountsE();
                                return wrappedElement;
                         }
                    
                         private org.wso2.carbon.bam.CumulativeCountsE wrapgetInCumulativeCountsForEndpoint(){
                                org.wso2.carbon.bam.CumulativeCountsE wrappedElement = new org.wso2.carbon.bam.CumulativeCountsE();
                                return wrappedElement;
                         }
                    


        /**
        *  get the default envelope
        */
        private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory){
        return factory.getDefaultEnvelope();
        }


        private  java.lang.Object fromOM(
        org.apache.axiom.om.OMElement param,
        java.lang.Class type,
        java.util.Map extraNamespaces) throws org.apache.axis2.AxisFault{

        try {
        
                if (org.wso2.carbon.bam.GetLatestOutFaultCountForProxy.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetLatestOutFaultCountForProxy.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.FaultCountsE.class.equals(type)){
                
                           return org.wso2.carbon.bam.FaultCountsE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetOperationsForOperationID.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetOperationsForOperationID.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.OperationsE.class.equals(type)){
                
                           return org.wso2.carbon.bam.OperationsE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetAllOperationsForTimeRange.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetAllOperationsForTimeRange.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.AllActivityMsgOperationsE.class.equals(type)){
                
                           return org.wso2.carbon.bam.AllActivityMsgOperationsE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetLatestMinimumResponseTimeForOperation.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetLatestMinimumResponseTimeForOperation.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.TimesE.class.equals(type)){
                
                           return org.wso2.carbon.bam.TimesE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetActivityDetailsForActivity.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetActivityDetailsForActivity.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.ActivityGroupsForTimeE.class.equals(type)){
                
                           return org.wso2.carbon.bam.ActivityGroupsForTimeE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetLatestMinimumResponseTimeForServer.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetLatestMinimumResponseTimeForServer.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.TimesE.class.equals(type)){
                
                           return org.wso2.carbon.bam.TimesE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetLatestMaximumResponseTimeForServer.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetLatestMaximumResponseTimeForServer.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.TimesE.class.equals(type)){
                
                           return org.wso2.carbon.bam.TimesE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetLatestInFaultCountForSequence.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetLatestInFaultCountForSequence.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.FaultCountsE.class.equals(type)){
                
                           return org.wso2.carbon.bam.FaultCountsE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetServerIdForServer.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetServerIdForServer.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.ServersE.class.equals(type)){
                
                           return org.wso2.carbon.bam.ServersE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetCountofChildrenFailedMessages.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetCountofChildrenFailedMessages.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.CountofChildrenFailedMessagesE.class.equals(type)){
                
                           return org.wso2.carbon.bam.CountofChildrenFailedMessagesE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetAllMessagesForTimeRangeAndActivity.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetAllMessagesForTimeRangeAndActivity.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.AllMessagesForActivitiesE.class.equals(type)){
                
                           return org.wso2.carbon.bam.AllMessagesForActivitiesE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetOperationIDForMessageID.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetOperationIDForMessageID.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.OperationIDsE.class.equals(type)){
                
                           return org.wso2.carbon.bam.OperationIDsE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetLatestMaximumResponseTimeForOperation.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetLatestMaximumResponseTimeForOperation.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.TimesE.class.equals(type)){
                
                           return org.wso2.carbon.bam.TimesE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetOperations.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetOperations.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.OperationsE.class.equals(type)){
                
                           return org.wso2.carbon.bam.OperationsE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetLatestInMinimumProcessingTimeForEndpoint.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetLatestInMinimumProcessingTimeForEndpoint.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.MinimumTimesE.class.equals(type)){
                
                           return org.wso2.carbon.bam.MinimumTimesE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetLatestResponseCountForOperation.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetLatestResponseCountForOperation.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.CountsE.class.equals(type)){
                
                           return org.wso2.carbon.bam.CountsE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetMaximumOperationsForAnActivityID.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetMaximumOperationsForAnActivityID.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.NumsE.class.equals(type)){
                
                           return org.wso2.carbon.bam.NumsE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GettimestampForOperation.class.equals(type)){
                
                           return org.wso2.carbon.bam.GettimestampForOperation.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.TimeStampsForOperationE.class.equals(type)){
                
                           return org.wso2.carbon.bam.TimeStampsForOperationE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.SetParentStatus.class.equals(type)){
                
                           return org.wso2.ws.dataservice.SetParentStatus.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetJMXMetricsWindow.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetJMXMetricsWindow.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.JmxMetricsInfosE.class.equals(type)){
                
                           return org.wso2.carbon.bam.JmxMetricsInfosE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetLatestInFaultCountForProxy.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetLatestInFaultCountForProxy.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.FaultCountsE.class.equals(type)){
                
                           return org.wso2.carbon.bam.FaultCountsE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetAleauditFailCount.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetAleauditFailCount.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.AleauditFailCountListE.class.equals(type)){
                
                           return org.wso2.carbon.bam.AleauditFailCountListE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetLatestInMaximumProcessingTimeForProxy.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetLatestInMaximumProcessingTimeForProxy.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.MaximumTimesE.class.equals(type)){
                
                           return org.wso2.carbon.bam.MaximumTimesE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetLatestAverageResponseTimeForService.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetLatestAverageResponseTimeForService.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.TimesE.class.equals(type)){
                
                           return org.wso2.carbon.bam.TimesE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetPropertyChildrenForActivity.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetPropertyChildrenForActivity.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.PropertyChildrenForActivityE.class.equals(type)){
                
                           return org.wso2.carbon.bam.PropertyChildrenForActivityE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetLatestDataForService.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetLatestDataForService.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.ServiceDataE.class.equals(type)){
                
                           return org.wso2.carbon.bam.ServiceDataE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetActivityDetailsForServer.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetActivityDetailsForServer.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.ActivitiesForServerE.class.equals(type)){
                
                           return org.wso2.carbon.bam.ActivitiesForServerE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetDetailsForActivity.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetDetailsForActivity.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.ActivitiesE.class.equals(type)){
                
                           return org.wso2.carbon.bam.ActivitiesE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetEndpoints.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetEndpoints.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.EndpointsE.class.equals(type)){
                
                           return org.wso2.carbon.bam.EndpointsE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetLatestOutMinimumProcessingTimeForSequence.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetLatestOutMinimumProcessingTimeForSequence.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.MinimumTimesE.class.equals(type)){
                
                           return org.wso2.carbon.bam.MinimumTimesE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetActivityDetailsForTimeRange.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetActivityDetailsForTimeRange.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.ActivitiesForTimeE.class.equals(type)){
                
                           return org.wso2.carbon.bam.ActivitiesForTimeE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetLatestOutMinimumProcessingTimeForProxy.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetLatestOutMinimumProcessingTimeForProxy.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.MinimumTimesE.class.equals(type)){
                
                           return org.wso2.carbon.bam.MinimumTimesE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetAleauditMessagesForSAP.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetAleauditMessagesForSAP.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.SAPaleauditsE.class.equals(type)){
                
                           return org.wso2.carbon.bam.SAPaleauditsE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetLatestInAverageProcessingTimeForProxy.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetLatestInAverageProcessingTimeForProxy.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.AverageTimesE.class.equals(type)){
                
                           return org.wso2.carbon.bam.AverageTimesE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetServerListForActivity.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetServerListForActivity.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.ServersForActivityE.class.equals(type)){
                
                           return org.wso2.carbon.bam.ServersForActivityE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetMessageCount.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetMessageCount.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.MessageCountsE.class.equals(type)){
                
                           return org.wso2.carbon.bam.MessageCountsE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetpropertyBagForActivity.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetpropertyBagForActivity.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.PropertyBagsE.class.equals(type)){
                
                           return org.wso2.carbon.bam.PropertyBagsE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetLastMinuteRequestCountSystem.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetLastMinuteRequestCountSystem.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.CountsE.class.equals(type)){
                
                           return org.wso2.carbon.bam.CountsE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetLatestInMinimumProcessingTimeForSequence.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetLatestInMinimumProcessingTimeForSequence.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.MinimumTimesE.class.equals(type)){
                
                           return org.wso2.carbon.bam.MinimumTimesE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetPropertyValueForStatus.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetPropertyValueForStatus.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.StatusListE.class.equals(type)){
                
                           return org.wso2.carbon.bam.StatusListE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetMessagesForStatus.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetMessagesForStatus.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.MessageIdListE.class.equals(type)){
                
                           return org.wso2.carbon.bam.MessageIdListE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetLatestOutMaximumProcessingTimeForSequence.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetLatestOutMaximumProcessingTimeForSequence.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.MaximumTimesE.class.equals(type)){
                
                           return org.wso2.carbon.bam.MaximumTimesE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetLatestResponseCountForServer.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetLatestResponseCountForServer.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.CountsE.class.equals(type)){
                
                           return org.wso2.carbon.bam.CountsE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetMaxResponseTimeSystem.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetMaxResponseTimeSystem.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.TimesE.class.equals(type)){
                
                           return org.wso2.carbon.bam.TimesE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetLatestRequestCountForServer.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetLatestRequestCountForServer.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.CountsE.class.equals(type)){
                
                           return org.wso2.carbon.bam.CountsE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetAllActivityDataForTimeRange.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetAllActivityDataForTimeRange.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.FullActivityDatasE.class.equals(type)){
                
                           return org.wso2.carbon.bam.FullActivityDatasE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetLatestResponseCountForService.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetLatestResponseCountForService.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.CountsE.class.equals(type)){
                
                           return org.wso2.carbon.bam.CountsE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetDirectionForOperation.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetDirectionForOperation.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.DirectionsForOperationE.class.equals(type)){
                
                           return org.wso2.carbon.bam.DirectionsForOperationE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetAllIpAddressForTimeRange.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetAllIpAddressForTimeRange.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.AllIpAddressesE.class.equals(type)){
                
                           return org.wso2.carbon.bam.AllIpAddressesE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetReqResFaultCountForServices.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetReqResFaultCountForServices.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.ServicesE.class.equals(type)){
                
                           return org.wso2.carbon.bam.ServicesE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetMessageForMessageID.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetMessageForMessageID.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.MessagesForMessageIDE.class.equals(type)){
                
                           return org.wso2.carbon.bam.MessagesForMessageIDE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetMessagesCountForOperationIDAndActivityID.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetMessagesCountForOperationIDAndActivityID.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.CountMessagessE.class.equals(type)){
                
                           return org.wso2.carbon.bam.CountMessagessE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetLatestFaultCountForOperation.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetLatestFaultCountForOperation.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.CountsE.class.equals(type)){
                
                           return org.wso2.carbon.bam.CountsE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetPropertyList.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetPropertyList.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.PropertiesE.class.equals(type)){
                
                           return org.wso2.carbon.bam.PropertiesE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetLatestMaximumResponseTimeForService.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetLatestMaximumResponseTimeForService.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.TimesE.class.equals(type)){
                
                           return org.wso2.carbon.bam.TimesE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetLatestInFaultCountForEndpoint.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetLatestInFaultCountForEndpoint.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.FaultCountsE.class.equals(type)){
                
                           return org.wso2.carbon.bam.FaultCountsE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetMessagesForOperationIDAndActivityID.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetMessagesForOperationIDAndActivityID.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.MessagesE.class.equals(type)){
                
                           return org.wso2.carbon.bam.MessagesE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetAllMessagesForTimeRange.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetAllMessagesForTimeRange.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.AllMessagesE.class.equals(type)){
                
                           return org.wso2.carbon.bam.AllMessagesE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetLatestInMaximumProcessingTimeForSequence.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetLatestInMaximumProcessingTimeForSequence.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.MaximumTimesE.class.equals(type)){
                
                           return org.wso2.carbon.bam.MaximumTimesE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetActivityInfoForActivityID.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetActivityInfoForActivityID.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.ActivityInfosE.class.equals(type)){
                
                           return org.wso2.carbon.bam.ActivityInfosE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetOperationForActivityID.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetOperationForActivityID.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.ActivityOperationsE.class.equals(type)){
                
                           return org.wso2.carbon.bam.ActivityOperationsE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetLatestRequestCountForOperation.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetLatestRequestCountForOperation.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.CountsE.class.equals(type)){
                
                           return org.wso2.carbon.bam.CountsE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetLatestInCumulativeCountForProxy.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetLatestInCumulativeCountForProxy.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.CumulativeCountsE.class.equals(type)){
                
                           return org.wso2.carbon.bam.CumulativeCountsE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetLatestInCumulativeCountForEndpoint.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetLatestInCumulativeCountForEndpoint.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.CumulativeCountsE.class.equals(type)){
                
                           return org.wso2.carbon.bam.CumulativeCountsE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetLatestInAverageProcessingTimeForEndpoint.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetLatestInAverageProcessingTimeForEndpoint.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.AverageTimesE.class.equals(type)){
                
                           return org.wso2.carbon.bam.AverageTimesE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetLatestOutMaximumProcessingTimeForProxy.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetLatestOutMaximumProcessingTimeForProxy.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.MaximumTimesE.class.equals(type)){
                
                           return org.wso2.carbon.bam.MaximumTimesE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetMinResponseTime.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetMinResponseTime.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.TimesE.class.equals(type)){
                
                           return org.wso2.carbon.bam.TimesE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetLatestMinimumResponseTimeForService.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetLatestMinimumResponseTimeForService.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.TimesE.class.equals(type)){
                
                           return org.wso2.carbon.bam.TimesE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetLatestInAverageProcessingTimeForSequence.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetLatestInAverageProcessingTimeForSequence.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.AverageTimesE.class.equals(type)){
                
                           return org.wso2.carbon.bam.AverageTimesE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetServiceForServer.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetServiceForServer.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.ServicesE.class.equals(type)){
                
                           return org.wso2.carbon.bam.ServicesE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetClientServiceOperation.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetClientServiceOperation.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.ClientServiceOperationInfosE.class.equals(type)){
                
                           return org.wso2.carbon.bam.ClientServiceOperationInfosE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetLatestAverageResponseTimeForOperation.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetLatestAverageResponseTimeForOperation.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.TimesE.class.equals(type)){
                
                           return org.wso2.carbon.bam.TimesE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetLatestDataForOperation.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetLatestDataForOperation.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.OperationDataE.class.equals(type)){
                
                           return org.wso2.carbon.bam.OperationDataE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetLatestFaultCountForService.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetLatestFaultCountForService.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.CountsE.class.equals(type)){
                
                           return org.wso2.carbon.bam.CountsE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetMessagesForOperation.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetMessagesForOperation.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.MessagesForOperationE.class.equals(type)){
                
                           return org.wso2.carbon.bam.MessagesForOperationE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetLatestOutAverageProcessingTimeForProxy.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetLatestOutAverageProcessingTimeForProxy.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.AverageTimesE.class.equals(type)){
                
                           return org.wso2.carbon.bam.AverageTimesE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetAvgResponseTimeSystem.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetAvgResponseTimeSystem.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.TimesE.class.equals(type)){
                
                           return org.wso2.carbon.bam.TimesE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetLatestInMinimumProcessingTimeForProxy.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetLatestInMinimumProcessingTimeForProxy.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.MinimumTimesE.class.equals(type)){
                
                           return org.wso2.carbon.bam.MinimumTimesE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetLatestInCumulativeCountForSequence.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetLatestInCumulativeCountForSequence.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.CumulativeCountsE.class.equals(type)){
                
                           return org.wso2.carbon.bam.CumulativeCountsE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetSequences.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetSequences.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.SequencesE.class.equals(type)){
                
                           return org.wso2.carbon.bam.SequencesE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetLatestFaultCountForServer.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetLatestFaultCountForServer.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.CountsE.class.equals(type)){
                
                           return org.wso2.carbon.bam.CountsE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetLatestDataForServer.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetLatestDataForServer.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.ServerDataE.class.equals(type)){
                
                           return org.wso2.carbon.bam.ServerDataE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetAllActivityForTimeRange.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetAllActivityForTimeRange.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.AllActivitiesE.class.equals(type)){
                
                           return org.wso2.carbon.bam.AllActivitiesE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetLatestOutCumulativeCountForProxy.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetLatestOutCumulativeCountForProxy.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.CumulativeCountsE.class.equals(type)){
                
                           return org.wso2.carbon.bam.CumulativeCountsE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetOperationNameList.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetOperationNameList.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.OperationsListE.class.equals(type)){
                
                           return org.wso2.carbon.bam.OperationsListE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetAllActivityDataForTimeRangeAndOperation.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetAllActivityDataForTimeRangeAndOperation.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.ActivityDatasE.class.equals(type)){
                
                           return org.wso2.carbon.bam.ActivityDatasE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetLatestOutAverageProcessingTimeForSequence.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetLatestOutAverageProcessingTimeForSequence.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.AverageTimesE.class.equals(type)){
                
                           return org.wso2.carbon.bam.AverageTimesE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetLatestOutCumulativeCountForSequence.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetLatestOutCumulativeCountForSequence.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.CumulativeCountsE.class.equals(type)){
                
                           return org.wso2.carbon.bam.CumulativeCountsE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetOperationListForActivity.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetOperationListForActivity.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.OperationsForServiceE.class.equals(type)){
                
                           return org.wso2.carbon.bam.OperationsForServiceE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetProxyServices.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetProxyServices.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.ProxyServicesE.class.equals(type)){
                
                           return org.wso2.carbon.bam.ProxyServicesE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetMaxResponseTime.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetMaxResponseTime.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.TimesE.class.equals(type)){
                
                           return org.wso2.carbon.bam.TimesE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetAllActivityMessagesForTimeRange.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetAllActivityMessagesForTimeRange.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.AllActivityMessagesE.class.equals(type)){
                
                           return org.wso2.carbon.bam.AllActivityMessagesE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetActivityIDForActivityName.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetActivityIDForActivityName.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.ActivityIDsE.class.equals(type)){
                
                           return org.wso2.carbon.bam.ActivityIDsE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetLastMinuteRequestCount.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetLastMinuteRequestCount.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.CountsE.class.equals(type)){
                
                           return org.wso2.carbon.bam.CountsE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetReplayedFailRequestCount.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetReplayedFailRequestCount.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.ReplayedFailRequestCountListE.class.equals(type)){
                
                           return org.wso2.carbon.bam.ReplayedFailRequestCountListE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetLatestAverageResponseTimeForServer.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetLatestAverageResponseTimeForServer.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.TimesE.class.equals(type)){
                
                           return org.wso2.carbon.bam.TimesE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetServiceListForActivity.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetServiceListForActivity.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.ServicesForServerE.class.equals(type)){
                
                           return org.wso2.carbon.bam.ServicesForServerE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetMinResponseTimeSystem.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetMinResponseTimeSystem.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.TimesE.class.equals(type)){
                
                           return org.wso2.carbon.bam.TimesE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetAllMessages.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetAllMessages.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.MessageDatasE.class.equals(type)){
                
                           return org.wso2.carbon.bam.MessageDatasE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetAvgResponseTime.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetAvgResponseTime.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.TimesE.class.equals(type)){
                
                           return org.wso2.carbon.bam.TimesE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetChildrenMessagesForSAP.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetChildrenMessagesForSAP.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.SAPchildrenE.class.equals(type)){
                
                           return org.wso2.carbon.bam.SAPchildrenE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetLatestDataForServices.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetLatestDataForServices.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.ServiceDataE.class.equals(type)){
                
                           return org.wso2.carbon.bam.ServiceDataE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetOperationInfoForActivityID.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetOperationInfoForActivityID.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.OperationInfosE.class.equals(type)){
                
                           return org.wso2.carbon.bam.OperationInfosE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetPropertyKeyForActivity.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetPropertyKeyForActivity.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.PropertyKeysForActivityE.class.equals(type)){
                
                           return org.wso2.carbon.bam.PropertyKeysForActivityE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetMessagesCountForSAP.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetMessagesCountForSAP.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.SAPcountsE.class.equals(type)){
                
                           return org.wso2.carbon.bam.SAPcountsE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetLatestOutFaultCountForSequence.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetLatestOutFaultCountForSequence.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.FaultCountsE.class.equals(type)){
                
                           return org.wso2.carbon.bam.FaultCountsE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetLatestInMaximumProcessingTimeForEndpoint.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetLatestInMaximumProcessingTimeForEndpoint.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.MaximumTimesE.class.equals(type)){
                
                           return org.wso2.carbon.bam.MaximumTimesE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetReplayedFailReponseCount.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetReplayedFailReponseCount.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.ReplayedFailResponseCountListE.class.equals(type)){
                
                           return org.wso2.carbon.bam.ReplayedFailResponseCountListE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetOriginalFailCount.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetOriginalFailCount.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.OriginalFailCountListE.class.equals(type)){
                
                           return org.wso2.carbon.bam.OriginalFailCountListE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetLatestRequestCountForService.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetLatestRequestCountForService.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.CountsE.class.equals(type)){
                
                           return org.wso2.carbon.bam.CountsE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetInCumulativeCountsForEndpoint.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetInCumulativeCountsForEndpoint.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.CumulativeCountsE.class.equals(type)){
                
                           return org.wso2.carbon.bam.CumulativeCountsE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
        } catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
           return null;
        }



    

        /**
        *  A utility method that copies the namepaces from the SOAPEnvelope
        */
        private java.util.Map getEnvelopeNamespaces(org.apache.axiom.soap.SOAPEnvelope env){
        java.util.Map returnMap = new java.util.HashMap();
        java.util.Iterator namespaceIterator = env.getAllDeclaredNamespaces();
        while (namespaceIterator.hasNext()) {
        org.apache.axiom.om.OMNamespace ns = (org.apache.axiom.om.OMNamespace) namespaceIterator.next();
        returnMap.put(ns.getPrefix(),ns.getNamespaceURI());
        }
        return returnMap;
        }

        private org.apache.axis2.AxisFault createAxisFault(java.lang.Exception e) {
        org.apache.axis2.AxisFault f;
        Throwable cause = e.getCause();
        if (cause != null) {
            f = new org.apache.axis2.AxisFault(e.getMessage(), cause);
        } else {
            f = new org.apache.axis2.AxisFault(e.getMessage());
        }

        return f;
    }

        }//end of class
    
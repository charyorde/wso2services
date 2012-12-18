
/**
 * TransportStatisticsAdminMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */
        package org.wso2.carbon.statistics.transport.services;

        /**
        *  TransportStatisticsAdminMessageReceiverInOut message receiver
        */

        public class TransportStatisticsAdminMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        TransportStatisticsAdminSkeletonInterface skel = (TransportStatisticsAdminSkeletonInterface)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){


        

            if("getTransportStatistic".equals(methodName)){
                
                axis2.apache.org.xsd.GetTransportStatisticResponse getTransportStatisticResponse49 = null;
	                        axis2.apache.org.xsd.GetTransportStatistic wrappedParam =
                                                             (axis2.apache.org.xsd.GetTransportStatistic)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    axis2.apache.org.xsd.GetTransportStatistic.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getTransportStatisticResponse49 =
                                                   
                                                   
                                                         skel.getTransportStatistic(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getTransportStatisticResponse49, false, new javax.xml.namespace.QName("http://services.transport.statistics.carbon.wso2.org",
                                                    "getTransportStatistic"));
                                    } else 

            if("getBytesSent".equals(methodName)){
                
                axis2.apache.org.xsd.GetBytesSentResponse getBytesSentResponse51 = null;
	                        axis2.apache.org.xsd.GetBytesSent wrappedParam =
                                                             (axis2.apache.org.xsd.GetBytesSent)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    axis2.apache.org.xsd.GetBytesSent.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getBytesSentResponse51 =
                                                   
                                                   
                                                         skel.getBytesSent(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getBytesSentResponse51, false, new javax.xml.namespace.QName("http://services.transport.statistics.carbon.wso2.org",
                                                    "getBytesSent"));
                                    } else 

            if("getLatencyViewStatistics".equals(methodName)){
                
                axis2.apache.org.xsd.GetLatencyViewStatisticsResponse getLatencyViewStatisticsResponse53 = null;
	                        axis2.apache.org.xsd.GetLatencyViewStatistics wrappedParam =
                                                             (axis2.apache.org.xsd.GetLatencyViewStatistics)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    axis2.apache.org.xsd.GetLatencyViewStatistics.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getLatencyViewStatisticsResponse53 =
                                                   
                                                   
                                                         skel.getLatencyViewStatistics(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getLatencyViewStatisticsResponse53, false, new javax.xml.namespace.QName("http://services.transport.statistics.carbon.wso2.org",
                                                    "getLatencyViewStatistics"));
                                    } else 

            if("getTransportClassName".equals(methodName)){
                
                axis2.apache.org.xsd.GetTransportClassNameResponse getTransportClassNameResponse55 = null;
	                        axis2.apache.org.xsd.GetTransportClassName wrappedParam =
                                                             (axis2.apache.org.xsd.GetTransportClassName)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    axis2.apache.org.xsd.GetTransportClassName.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getTransportClassNameResponse55 =
                                                   
                                                   
                                                         skel.getTransportClassName(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getTransportClassNameResponse55, false, new javax.xml.namespace.QName("http://services.transport.statistics.carbon.wso2.org",
                                                    "getTransportClassName"));
                                    } else 

            if("getTimeoutsReceiving".equals(methodName)){
                
                axis2.apache.org.xsd.GetTimeoutsReceivingResponse getTimeoutsReceivingResponse57 = null;
	                        axis2.apache.org.xsd.GetTimeoutsReceiving wrappedParam =
                                                             (axis2.apache.org.xsd.GetTimeoutsReceiving)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    axis2.apache.org.xsd.GetTimeoutsReceiving.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getTimeoutsReceivingResponse57 =
                                                   
                                                   
                                                         skel.getTimeoutsReceiving(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getTimeoutsReceivingResponse57, false, new javax.xml.namespace.QName("http://services.transport.statistics.carbon.wso2.org",
                                                    "getTimeoutsReceiving"));
                                    } else 

            if("getAllTransportStatistics".equals(methodName)){
                
                axis2.apache.org.xsd.GetAllTransportStatisticsResponse getAllTransportStatisticsResponse59 = null;
	                        axis2.apache.org.xsd.GetAllTransportStatistics wrappedParam =
                                                             (axis2.apache.org.xsd.GetAllTransportStatistics)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    axis2.apache.org.xsd.GetAllTransportStatistics.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getAllTransportStatisticsResponse59 =
                                                   
                                                   
                                                         skel.getAllTransportStatistics(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getAllTransportStatisticsResponse59, false, new javax.xml.namespace.QName("http://services.transport.statistics.carbon.wso2.org",
                                                    "getAllTransportStatistics"));
                                    } else 

            if("getBytesReceived".equals(methodName)){
                
                axis2.apache.org.xsd.GetBytesReceivedResponse getBytesReceivedResponse61 = null;
	                        axis2.apache.org.xsd.GetBytesReceived wrappedParam =
                                                             (axis2.apache.org.xsd.GetBytesReceived)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    axis2.apache.org.xsd.GetBytesReceived.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getBytesReceivedResponse61 =
                                                   
                                                   
                                                         skel.getBytesReceived(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getBytesReceivedResponse61, false, new javax.xml.namespace.QName("http://services.transport.statistics.carbon.wso2.org",
                                                    "getBytesReceived"));
                                    } else 

            if("getAvgSizeSent".equals(methodName)){
                
                axis2.apache.org.xsd.GetAvgSizeSentResponse getAvgSizeSentResponse63 = null;
	                        axis2.apache.org.xsd.GetAvgSizeSent wrappedParam =
                                                             (axis2.apache.org.xsd.GetAvgSizeSent)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    axis2.apache.org.xsd.GetAvgSizeSent.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getAvgSizeSentResponse63 =
                                                   
                                                   
                                                         skel.getAvgSizeSent(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getAvgSizeSentResponse63, false, new javax.xml.namespace.QName("http://services.transport.statistics.carbon.wso2.org",
                                                    "getAvgSizeSent"));
                                    } else 

            if("getAvgSizeReceived".equals(methodName)){
                
                axis2.apache.org.xsd.GetAvgSizeReceivedResponse getAvgSizeReceivedResponse65 = null;
	                        axis2.apache.org.xsd.GetAvgSizeReceived wrappedParam =
                                                             (axis2.apache.org.xsd.GetAvgSizeReceived)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    axis2.apache.org.xsd.GetAvgSizeReceived.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getAvgSizeReceivedResponse65 =
                                                   
                                                   
                                                         skel.getAvgSizeReceived(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getAvgSizeReceivedResponse65, false, new javax.xml.namespace.QName("http://services.transport.statistics.carbon.wso2.org",
                                                    "getAvgSizeReceived"));
                                    } else 

            if("getFaultsSending".equals(methodName)){
                
                axis2.apache.org.xsd.GetFaultsSendingResponse getFaultsSendingResponse67 = null;
	                        axis2.apache.org.xsd.GetFaultsSending wrappedParam =
                                                             (axis2.apache.org.xsd.GetFaultsSending)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    axis2.apache.org.xsd.GetFaultsSending.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getFaultsSendingResponse67 =
                                                   
                                                   
                                                         skel.getFaultsSending(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getFaultsSendingResponse67, false, new javax.xml.namespace.QName("http://services.transport.statistics.carbon.wso2.org",
                                                    "getFaultsSending"));
                                    } else 

            if("getMessagesSent".equals(methodName)){
                
                axis2.apache.org.xsd.GetMessagesSentResponse getMessagesSentResponse69 = null;
	                        axis2.apache.org.xsd.GetMessagesSent wrappedParam =
                                                             (axis2.apache.org.xsd.GetMessagesSent)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    axis2.apache.org.xsd.GetMessagesSent.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getMessagesSentResponse69 =
                                                   
                                                   
                                                         skel.getMessagesSent(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getMessagesSentResponse69, false, new javax.xml.namespace.QName("http://services.transport.statistics.carbon.wso2.org",
                                                    "getMessagesSent"));
                                    } else 

            if("getExposedTransports".equals(methodName)){
                
                axis2.apache.org.xsd.GetExposedTransportsResponse getExposedTransportsResponse71 = null;
	                        axis2.apache.org.xsd.GetExposedTransports wrappedParam =
                                                             (axis2.apache.org.xsd.GetExposedTransports)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    axis2.apache.org.xsd.GetExposedTransports.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getExposedTransportsResponse71 =
                                                   
                                                   
                                                         skel.getExposedTransports(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getExposedTransportsResponse71, false, new javax.xml.namespace.QName("http://services.transport.statistics.carbon.wso2.org",
                                                    "getExposedTransports"));
                                    } else 

            if("getMessagesReceived".equals(methodName)){
                
                axis2.apache.org.xsd.GetMessagesReceivedResponse getMessagesReceivedResponse73 = null;
	                        axis2.apache.org.xsd.GetMessagesReceived wrappedParam =
                                                             (axis2.apache.org.xsd.GetMessagesReceived)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    axis2.apache.org.xsd.GetMessagesReceived.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getMessagesReceivedResponse73 =
                                                   
                                                   
                                                         skel.getMessagesReceived(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getMessagesReceivedResponse73, false, new javax.xml.namespace.QName("http://services.transport.statistics.carbon.wso2.org",
                                                    "getMessagesReceived"));
                                    } else 

            if("getMinSizeSent".equals(methodName)){
                
                axis2.apache.org.xsd.GetMinSizeSentResponse getMinSizeSentResponse75 = null;
	                        axis2.apache.org.xsd.GetMinSizeSent wrappedParam =
                                                             (axis2.apache.org.xsd.GetMinSizeSent)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    axis2.apache.org.xsd.GetMinSizeSent.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getMinSizeSentResponse75 =
                                                   
                                                   
                                                         skel.getMinSizeSent(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getMinSizeSentResponse75, false, new javax.xml.namespace.QName("http://services.transport.statistics.carbon.wso2.org",
                                                    "getMinSizeSent"));
                                    } else 

            if("getMaxSizeReceived".equals(methodName)){
                
                axis2.apache.org.xsd.GetMaxSizeReceivedResponse getMaxSizeReceivedResponse77 = null;
	                        axis2.apache.org.xsd.GetMaxSizeReceived wrappedParam =
                                                             (axis2.apache.org.xsd.GetMaxSizeReceived)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    axis2.apache.org.xsd.GetMaxSizeReceived.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getMaxSizeReceivedResponse77 =
                                                   
                                                   
                                                         skel.getMaxSizeReceived(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getMaxSizeReceivedResponse77, false, new javax.xml.namespace.QName("http://services.transport.statistics.carbon.wso2.org",
                                                    "getMaxSizeReceived"));
                                    } else 

            if("getTimeoutsSending".equals(methodName)){
                
                axis2.apache.org.xsd.GetTimeoutsSendingResponse getTimeoutsSendingResponse79 = null;
	                        axis2.apache.org.xsd.GetTimeoutsSending wrappedParam =
                                                             (axis2.apache.org.xsd.GetTimeoutsSending)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    axis2.apache.org.xsd.GetTimeoutsSending.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getTimeoutsSendingResponse79 =
                                                   
                                                   
                                                         skel.getTimeoutsSending(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getTimeoutsSendingResponse79, false, new javax.xml.namespace.QName("http://services.transport.statistics.carbon.wso2.org",
                                                    "getTimeoutsSending"));
                                    } else 

            if("getThreadViewStatistics".equals(methodName)){
                
                axis2.apache.org.xsd.GetThreadViewStatisticsResponse getThreadViewStatisticsResponse81 = null;
	                        axis2.apache.org.xsd.GetThreadViewStatistics wrappedParam =
                                                             (axis2.apache.org.xsd.GetThreadViewStatistics)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    axis2.apache.org.xsd.GetThreadViewStatistics.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getThreadViewStatisticsResponse81 =
                                                   
                                                   
                                                         skel.getThreadViewStatistics(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getThreadViewStatisticsResponse81, false, new javax.xml.namespace.QName("http://services.transport.statistics.carbon.wso2.org",
                                                    "getThreadViewStatistics"));
                                    } else 

            if("getMetricsWindow".equals(methodName)){
                
                axis2.apache.org.xsd.GetMetricsWindowResponse getMetricsWindowResponse83 = null;
	                        axis2.apache.org.xsd.GetMetricsWindow wrappedParam =
                                                             (axis2.apache.org.xsd.GetMetricsWindow)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    axis2.apache.org.xsd.GetMetricsWindow.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getMetricsWindowResponse83 =
                                                   
                                                   
                                                         skel.getMetricsWindow(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getMetricsWindowResponse83, false, new javax.xml.namespace.QName("http://services.transport.statistics.carbon.wso2.org",
                                                    "getMetricsWindow"));
                                    } else 

            if("getQueueSize".equals(methodName)){
                
                axis2.apache.org.xsd.GetQueueSizeResponse getQueueSizeResponse85 = null;
	                        axis2.apache.org.xsd.GetQueueSize wrappedParam =
                                                             (axis2.apache.org.xsd.GetQueueSize)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    axis2.apache.org.xsd.GetQueueSize.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getQueueSizeResponse85 =
                                                   
                                                   
                                                         skel.getQueueSize(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getQueueSizeResponse85, false, new javax.xml.namespace.QName("http://services.transport.statistics.carbon.wso2.org",
                                                    "getQueueSize"));
                                    } else 

            if("getFaultsReceiving".equals(methodName)){
                
                axis2.apache.org.xsd.GetFaultsReceivingResponse getFaultsReceivingResponse87 = null;
	                        axis2.apache.org.xsd.GetFaultsReceiving wrappedParam =
                                                             (axis2.apache.org.xsd.GetFaultsReceiving)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    axis2.apache.org.xsd.GetFaultsReceiving.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getFaultsReceivingResponse87 =
                                                   
                                                   
                                                         skel.getFaultsReceiving(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getFaultsReceivingResponse87, false, new javax.xml.namespace.QName("http://services.transport.statistics.carbon.wso2.org",
                                                    "getFaultsReceiving"));
                                    } else 

            if("getLastResetTime".equals(methodName)){
                
                axis2.apache.org.xsd.GetLastResetTimeResponse getLastResetTimeResponse89 = null;
	                        axis2.apache.org.xsd.GetLastResetTime wrappedParam =
                                                             (axis2.apache.org.xsd.GetLastResetTime)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    axis2.apache.org.xsd.GetLastResetTime.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getLastResetTimeResponse89 =
                                                   
                                                   
                                                         skel.getLastResetTime(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getLastResetTimeResponse89, false, new javax.xml.namespace.QName("http://services.transport.statistics.carbon.wso2.org",
                                                    "getLastResetTime"));
                                    } else 

            if("getActiveThreadCount".equals(methodName)){
                
                axis2.apache.org.xsd.GetActiveThreadCountResponse getActiveThreadCountResponse91 = null;
	                        axis2.apache.org.xsd.GetActiveThreadCount wrappedParam =
                                                             (axis2.apache.org.xsd.GetActiveThreadCount)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    axis2.apache.org.xsd.GetActiveThreadCount.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getActiveThreadCountResponse91 =
                                                   
                                                   
                                                         skel.getActiveThreadCount(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getActiveThreadCountResponse91, false, new javax.xml.namespace.QName("http://services.transport.statistics.carbon.wso2.org",
                                                    "getActiveThreadCount"));
                                    } else 

            if("getMinSizeReceived".equals(methodName)){
                
                axis2.apache.org.xsd.GetMinSizeReceivedResponse getMinSizeReceivedResponse93 = null;
	                        axis2.apache.org.xsd.GetMinSizeReceived wrappedParam =
                                                             (axis2.apache.org.xsd.GetMinSizeReceived)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    axis2.apache.org.xsd.GetMinSizeReceived.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getMinSizeReceivedResponse93 =
                                                   
                                                   
                                                         skel.getMinSizeReceived(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getMinSizeReceivedResponse93, false, new javax.xml.namespace.QName("http://services.transport.statistics.carbon.wso2.org",
                                                    "getMinSizeReceived"));
                                    } else 

            if("getMaxSizeSent".equals(methodName)){
                
                axis2.apache.org.xsd.GetMaxSizeSentResponse getMaxSizeSentResponse95 = null;
	                        axis2.apache.org.xsd.GetMaxSizeSent wrappedParam =
                                                             (axis2.apache.org.xsd.GetMaxSizeSent)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    axis2.apache.org.xsd.GetMaxSizeSent.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getMaxSizeSentResponse95 =
                                                   
                                                   
                                                         skel.getMaxSizeSent(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getMaxSizeSentResponse95, false, new javax.xml.namespace.QName("http://services.transport.statistics.carbon.wso2.org",
                                                    "getMaxSizeSent"));
                                    
            } else {
              throw new java.lang.RuntimeException("method not found");
            }
        

        newMsgContext.setEnvelope(envelope);
        }
        }
        catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
        }
        
        //
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.GetTransportStatistic param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.GetTransportStatistic.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.GetTransportStatisticResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.GetTransportStatisticResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.GetBytesSent param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.GetBytesSent.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.GetBytesSentResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.GetBytesSentResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.GetLatencyViewStatistics param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.GetLatencyViewStatistics.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.GetLatencyViewStatisticsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.GetLatencyViewStatisticsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.GetTransportClassName param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.GetTransportClassName.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.GetTransportClassNameResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.GetTransportClassNameResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.GetTimeoutsReceiving param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.GetTimeoutsReceiving.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.GetTimeoutsReceivingResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.GetTimeoutsReceivingResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.GetAllTransportStatistics param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.GetAllTransportStatistics.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.GetAllTransportStatisticsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.GetAllTransportStatisticsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.GetBytesReceived param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.GetBytesReceived.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.GetBytesReceivedResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.GetBytesReceivedResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.GetAvgSizeSent param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.GetAvgSizeSent.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.GetAvgSizeSentResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.GetAvgSizeSentResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.GetAvgSizeReceived param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.GetAvgSizeReceived.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.GetAvgSizeReceivedResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.GetAvgSizeReceivedResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.GetFaultsSending param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.GetFaultsSending.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.GetFaultsSendingResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.GetFaultsSendingResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.GetMessagesSent param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.GetMessagesSent.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.GetMessagesSentResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.GetMessagesSentResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.GetExposedTransports param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.GetExposedTransports.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.GetExposedTransportsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.GetExposedTransportsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.GetMessagesReceived param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.GetMessagesReceived.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.GetMessagesReceivedResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.GetMessagesReceivedResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.GetMinSizeSent param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.GetMinSizeSent.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.GetMinSizeSentResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.GetMinSizeSentResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.GetMaxSizeReceived param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.GetMaxSizeReceived.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.GetMaxSizeReceivedResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.GetMaxSizeReceivedResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.GetTimeoutsSending param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.GetTimeoutsSending.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.GetTimeoutsSendingResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.GetTimeoutsSendingResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.GetThreadViewStatistics param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.GetThreadViewStatistics.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.GetThreadViewStatisticsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.GetThreadViewStatisticsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.GetMetricsWindow param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.GetMetricsWindow.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.GetMetricsWindowResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.GetMetricsWindowResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.GetQueueSize param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.GetQueueSize.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.GetQueueSizeResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.GetQueueSizeResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.GetFaultsReceiving param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.GetFaultsReceiving.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.GetFaultsReceivingResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.GetFaultsReceivingResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.GetLastResetTime param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.GetLastResetTime.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.GetLastResetTimeResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.GetLastResetTimeResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.GetActiveThreadCount param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.GetActiveThreadCount.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.GetActiveThreadCountResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.GetActiveThreadCountResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.GetMinSizeReceived param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.GetMinSizeReceived.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.GetMinSizeReceivedResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.GetMinSizeReceivedResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.GetMaxSizeSent param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.GetMaxSizeSent.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.GetMaxSizeSentResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.GetMaxSizeSentResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, axis2.apache.org.xsd.GetTransportStatisticResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(axis2.apache.org.xsd.GetTransportStatisticResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private axis2.apache.org.xsd.GetTransportStatisticResponse wrapgetTransportStatistic(){
                                axis2.apache.org.xsd.GetTransportStatisticResponse wrappedElement = new axis2.apache.org.xsd.GetTransportStatisticResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, axis2.apache.org.xsd.GetBytesSentResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(axis2.apache.org.xsd.GetBytesSentResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private axis2.apache.org.xsd.GetBytesSentResponse wrapgetBytesSent(){
                                axis2.apache.org.xsd.GetBytesSentResponse wrappedElement = new axis2.apache.org.xsd.GetBytesSentResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, axis2.apache.org.xsd.GetLatencyViewStatisticsResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(axis2.apache.org.xsd.GetLatencyViewStatisticsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private axis2.apache.org.xsd.GetLatencyViewStatisticsResponse wrapgetLatencyViewStatistics(){
                                axis2.apache.org.xsd.GetLatencyViewStatisticsResponse wrappedElement = new axis2.apache.org.xsd.GetLatencyViewStatisticsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, axis2.apache.org.xsd.GetTransportClassNameResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(axis2.apache.org.xsd.GetTransportClassNameResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private axis2.apache.org.xsd.GetTransportClassNameResponse wrapgetTransportClassName(){
                                axis2.apache.org.xsd.GetTransportClassNameResponse wrappedElement = new axis2.apache.org.xsd.GetTransportClassNameResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, axis2.apache.org.xsd.GetTimeoutsReceivingResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(axis2.apache.org.xsd.GetTimeoutsReceivingResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private axis2.apache.org.xsd.GetTimeoutsReceivingResponse wrapgetTimeoutsReceiving(){
                                axis2.apache.org.xsd.GetTimeoutsReceivingResponse wrappedElement = new axis2.apache.org.xsd.GetTimeoutsReceivingResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, axis2.apache.org.xsd.GetAllTransportStatisticsResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(axis2.apache.org.xsd.GetAllTransportStatisticsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private axis2.apache.org.xsd.GetAllTransportStatisticsResponse wrapgetAllTransportStatistics(){
                                axis2.apache.org.xsd.GetAllTransportStatisticsResponse wrappedElement = new axis2.apache.org.xsd.GetAllTransportStatisticsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, axis2.apache.org.xsd.GetBytesReceivedResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(axis2.apache.org.xsd.GetBytesReceivedResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private axis2.apache.org.xsd.GetBytesReceivedResponse wrapgetBytesReceived(){
                                axis2.apache.org.xsd.GetBytesReceivedResponse wrappedElement = new axis2.apache.org.xsd.GetBytesReceivedResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, axis2.apache.org.xsd.GetAvgSizeSentResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(axis2.apache.org.xsd.GetAvgSizeSentResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private axis2.apache.org.xsd.GetAvgSizeSentResponse wrapgetAvgSizeSent(){
                                axis2.apache.org.xsd.GetAvgSizeSentResponse wrappedElement = new axis2.apache.org.xsd.GetAvgSizeSentResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, axis2.apache.org.xsd.GetAvgSizeReceivedResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(axis2.apache.org.xsd.GetAvgSizeReceivedResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private axis2.apache.org.xsd.GetAvgSizeReceivedResponse wrapgetAvgSizeReceived(){
                                axis2.apache.org.xsd.GetAvgSizeReceivedResponse wrappedElement = new axis2.apache.org.xsd.GetAvgSizeReceivedResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, axis2.apache.org.xsd.GetFaultsSendingResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(axis2.apache.org.xsd.GetFaultsSendingResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private axis2.apache.org.xsd.GetFaultsSendingResponse wrapgetFaultsSending(){
                                axis2.apache.org.xsd.GetFaultsSendingResponse wrappedElement = new axis2.apache.org.xsd.GetFaultsSendingResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, axis2.apache.org.xsd.GetMessagesSentResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(axis2.apache.org.xsd.GetMessagesSentResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private axis2.apache.org.xsd.GetMessagesSentResponse wrapgetMessagesSent(){
                                axis2.apache.org.xsd.GetMessagesSentResponse wrappedElement = new axis2.apache.org.xsd.GetMessagesSentResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, axis2.apache.org.xsd.GetExposedTransportsResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(axis2.apache.org.xsd.GetExposedTransportsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private axis2.apache.org.xsd.GetExposedTransportsResponse wrapgetExposedTransports(){
                                axis2.apache.org.xsd.GetExposedTransportsResponse wrappedElement = new axis2.apache.org.xsd.GetExposedTransportsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, axis2.apache.org.xsd.GetMessagesReceivedResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(axis2.apache.org.xsd.GetMessagesReceivedResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private axis2.apache.org.xsd.GetMessagesReceivedResponse wrapgetMessagesReceived(){
                                axis2.apache.org.xsd.GetMessagesReceivedResponse wrappedElement = new axis2.apache.org.xsd.GetMessagesReceivedResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, axis2.apache.org.xsd.GetMinSizeSentResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(axis2.apache.org.xsd.GetMinSizeSentResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private axis2.apache.org.xsd.GetMinSizeSentResponse wrapgetMinSizeSent(){
                                axis2.apache.org.xsd.GetMinSizeSentResponse wrappedElement = new axis2.apache.org.xsd.GetMinSizeSentResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, axis2.apache.org.xsd.GetMaxSizeReceivedResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(axis2.apache.org.xsd.GetMaxSizeReceivedResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private axis2.apache.org.xsd.GetMaxSizeReceivedResponse wrapgetMaxSizeReceived(){
                                axis2.apache.org.xsd.GetMaxSizeReceivedResponse wrappedElement = new axis2.apache.org.xsd.GetMaxSizeReceivedResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, axis2.apache.org.xsd.GetTimeoutsSendingResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(axis2.apache.org.xsd.GetTimeoutsSendingResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private axis2.apache.org.xsd.GetTimeoutsSendingResponse wrapgetTimeoutsSending(){
                                axis2.apache.org.xsd.GetTimeoutsSendingResponse wrappedElement = new axis2.apache.org.xsd.GetTimeoutsSendingResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, axis2.apache.org.xsd.GetThreadViewStatisticsResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(axis2.apache.org.xsd.GetThreadViewStatisticsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private axis2.apache.org.xsd.GetThreadViewStatisticsResponse wrapgetThreadViewStatistics(){
                                axis2.apache.org.xsd.GetThreadViewStatisticsResponse wrappedElement = new axis2.apache.org.xsd.GetThreadViewStatisticsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, axis2.apache.org.xsd.GetMetricsWindowResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(axis2.apache.org.xsd.GetMetricsWindowResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private axis2.apache.org.xsd.GetMetricsWindowResponse wrapgetMetricsWindow(){
                                axis2.apache.org.xsd.GetMetricsWindowResponse wrappedElement = new axis2.apache.org.xsd.GetMetricsWindowResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, axis2.apache.org.xsd.GetQueueSizeResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(axis2.apache.org.xsd.GetQueueSizeResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private axis2.apache.org.xsd.GetQueueSizeResponse wrapgetQueueSize(){
                                axis2.apache.org.xsd.GetQueueSizeResponse wrappedElement = new axis2.apache.org.xsd.GetQueueSizeResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, axis2.apache.org.xsd.GetFaultsReceivingResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(axis2.apache.org.xsd.GetFaultsReceivingResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private axis2.apache.org.xsd.GetFaultsReceivingResponse wrapgetFaultsReceiving(){
                                axis2.apache.org.xsd.GetFaultsReceivingResponse wrappedElement = new axis2.apache.org.xsd.GetFaultsReceivingResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, axis2.apache.org.xsd.GetLastResetTimeResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(axis2.apache.org.xsd.GetLastResetTimeResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private axis2.apache.org.xsd.GetLastResetTimeResponse wrapgetLastResetTime(){
                                axis2.apache.org.xsd.GetLastResetTimeResponse wrappedElement = new axis2.apache.org.xsd.GetLastResetTimeResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, axis2.apache.org.xsd.GetActiveThreadCountResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(axis2.apache.org.xsd.GetActiveThreadCountResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private axis2.apache.org.xsd.GetActiveThreadCountResponse wrapgetActiveThreadCount(){
                                axis2.apache.org.xsd.GetActiveThreadCountResponse wrappedElement = new axis2.apache.org.xsd.GetActiveThreadCountResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, axis2.apache.org.xsd.GetMinSizeReceivedResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(axis2.apache.org.xsd.GetMinSizeReceivedResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private axis2.apache.org.xsd.GetMinSizeReceivedResponse wrapgetMinSizeReceived(){
                                axis2.apache.org.xsd.GetMinSizeReceivedResponse wrappedElement = new axis2.apache.org.xsd.GetMinSizeReceivedResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, axis2.apache.org.xsd.GetMaxSizeSentResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(axis2.apache.org.xsd.GetMaxSizeSentResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private axis2.apache.org.xsd.GetMaxSizeSentResponse wrapgetMaxSizeSent(){
                                axis2.apache.org.xsd.GetMaxSizeSentResponse wrappedElement = new axis2.apache.org.xsd.GetMaxSizeSentResponse();
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
        
                if (axis2.apache.org.xsd.GetTransportStatistic.class.equals(type)){
                
                           return axis2.apache.org.xsd.GetTransportStatistic.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.GetTransportStatisticResponse.class.equals(type)){
                
                           return axis2.apache.org.xsd.GetTransportStatisticResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.GetBytesSent.class.equals(type)){
                
                           return axis2.apache.org.xsd.GetBytesSent.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.GetBytesSentResponse.class.equals(type)){
                
                           return axis2.apache.org.xsd.GetBytesSentResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.GetLatencyViewStatistics.class.equals(type)){
                
                           return axis2.apache.org.xsd.GetLatencyViewStatistics.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.GetLatencyViewStatisticsResponse.class.equals(type)){
                
                           return axis2.apache.org.xsd.GetLatencyViewStatisticsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.GetTransportClassName.class.equals(type)){
                
                           return axis2.apache.org.xsd.GetTransportClassName.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.GetTransportClassNameResponse.class.equals(type)){
                
                           return axis2.apache.org.xsd.GetTransportClassNameResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.GetTimeoutsReceiving.class.equals(type)){
                
                           return axis2.apache.org.xsd.GetTimeoutsReceiving.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.GetTimeoutsReceivingResponse.class.equals(type)){
                
                           return axis2.apache.org.xsd.GetTimeoutsReceivingResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.GetAllTransportStatistics.class.equals(type)){
                
                           return axis2.apache.org.xsd.GetAllTransportStatistics.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.GetAllTransportStatisticsResponse.class.equals(type)){
                
                           return axis2.apache.org.xsd.GetAllTransportStatisticsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.GetBytesReceived.class.equals(type)){
                
                           return axis2.apache.org.xsd.GetBytesReceived.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.GetBytesReceivedResponse.class.equals(type)){
                
                           return axis2.apache.org.xsd.GetBytesReceivedResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.GetAvgSizeSent.class.equals(type)){
                
                           return axis2.apache.org.xsd.GetAvgSizeSent.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.GetAvgSizeSentResponse.class.equals(type)){
                
                           return axis2.apache.org.xsd.GetAvgSizeSentResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.GetAvgSizeReceived.class.equals(type)){
                
                           return axis2.apache.org.xsd.GetAvgSizeReceived.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.GetAvgSizeReceivedResponse.class.equals(type)){
                
                           return axis2.apache.org.xsd.GetAvgSizeReceivedResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.GetFaultsSending.class.equals(type)){
                
                           return axis2.apache.org.xsd.GetFaultsSending.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.GetFaultsSendingResponse.class.equals(type)){
                
                           return axis2.apache.org.xsd.GetFaultsSendingResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.GetMessagesSent.class.equals(type)){
                
                           return axis2.apache.org.xsd.GetMessagesSent.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.GetMessagesSentResponse.class.equals(type)){
                
                           return axis2.apache.org.xsd.GetMessagesSentResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.GetExposedTransports.class.equals(type)){
                
                           return axis2.apache.org.xsd.GetExposedTransports.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.GetExposedTransportsResponse.class.equals(type)){
                
                           return axis2.apache.org.xsd.GetExposedTransportsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.GetMessagesReceived.class.equals(type)){
                
                           return axis2.apache.org.xsd.GetMessagesReceived.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.GetMessagesReceivedResponse.class.equals(type)){
                
                           return axis2.apache.org.xsd.GetMessagesReceivedResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.GetMinSizeSent.class.equals(type)){
                
                           return axis2.apache.org.xsd.GetMinSizeSent.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.GetMinSizeSentResponse.class.equals(type)){
                
                           return axis2.apache.org.xsd.GetMinSizeSentResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.GetMaxSizeReceived.class.equals(type)){
                
                           return axis2.apache.org.xsd.GetMaxSizeReceived.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.GetMaxSizeReceivedResponse.class.equals(type)){
                
                           return axis2.apache.org.xsd.GetMaxSizeReceivedResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.GetTimeoutsSending.class.equals(type)){
                
                           return axis2.apache.org.xsd.GetTimeoutsSending.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.GetTimeoutsSendingResponse.class.equals(type)){
                
                           return axis2.apache.org.xsd.GetTimeoutsSendingResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.GetThreadViewStatistics.class.equals(type)){
                
                           return axis2.apache.org.xsd.GetThreadViewStatistics.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.GetThreadViewStatisticsResponse.class.equals(type)){
                
                           return axis2.apache.org.xsd.GetThreadViewStatisticsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.GetMetricsWindow.class.equals(type)){
                
                           return axis2.apache.org.xsd.GetMetricsWindow.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.GetMetricsWindowResponse.class.equals(type)){
                
                           return axis2.apache.org.xsd.GetMetricsWindowResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.GetQueueSize.class.equals(type)){
                
                           return axis2.apache.org.xsd.GetQueueSize.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.GetQueueSizeResponse.class.equals(type)){
                
                           return axis2.apache.org.xsd.GetQueueSizeResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.GetFaultsReceiving.class.equals(type)){
                
                           return axis2.apache.org.xsd.GetFaultsReceiving.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.GetFaultsReceivingResponse.class.equals(type)){
                
                           return axis2.apache.org.xsd.GetFaultsReceivingResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.GetLastResetTime.class.equals(type)){
                
                           return axis2.apache.org.xsd.GetLastResetTime.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.GetLastResetTimeResponse.class.equals(type)){
                
                           return axis2.apache.org.xsd.GetLastResetTimeResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.GetActiveThreadCount.class.equals(type)){
                
                           return axis2.apache.org.xsd.GetActiveThreadCount.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.GetActiveThreadCountResponse.class.equals(type)){
                
                           return axis2.apache.org.xsd.GetActiveThreadCountResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.GetMinSizeReceived.class.equals(type)){
                
                           return axis2.apache.org.xsd.GetMinSizeReceived.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.GetMinSizeReceivedResponse.class.equals(type)){
                
                           return axis2.apache.org.xsd.GetMinSizeReceivedResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.GetMaxSizeSent.class.equals(type)){
                
                           return axis2.apache.org.xsd.GetMaxSizeSent.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.GetMaxSizeSentResponse.class.equals(type)){
                
                           return axis2.apache.org.xsd.GetMaxSizeSentResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

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
    

/**
 * BAMSummaryQueryDSMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */
        package org.wso2.ws.dataservice;

        /**
        *  BAMSummaryQueryDSMessageReceiverInOut message receiver
        */

        public class BAMSummaryQueryDSMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        BAMSummaryQueryDSSkeletonInterface skel = (BAMSummaryQueryDSSkeletonInterface)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){


        

            if("getOperationStatQuarterlySummaries".equals(methodName)){
                
                org.wso2.carbon.bam.SummaryStatsE summaryStats89 = null;
	                        org.wso2.carbon.bam.GetOperationStatQuarterlySummaries wrappedParam =
                                                             (org.wso2.carbon.bam.GetOperationStatQuarterlySummaries)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetOperationStatQuarterlySummaries.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               summaryStats89 =
                                                   
                                                   
                                                         skel.getOperationStatQuarterlySummaries(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), summaryStats89, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getOperationStatQuarterlySummaries"));
                                    } else 

            if("getOperationStatMonthlySummaries".equals(methodName)){
                
                org.wso2.carbon.bam.SummaryStatsE summaryStats91 = null;
	                        org.wso2.carbon.bam.GetOperationStatMonthlySummaries wrappedParam =
                                                             (org.wso2.carbon.bam.GetOperationStatMonthlySummaries)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetOperationStatMonthlySummaries.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               summaryStats91 =
                                                   
                                                   
                                                         skel.getOperationStatMonthlySummaries(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), summaryStats91, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getOperationStatMonthlySummaries"));
                                    } else 

            if("getSequenceStatYearlySummaries".equals(methodName)){
                
                org.wso2.carbon.bam.MedSummaryStatsE medSummaryStats93 = null;
	                        org.wso2.carbon.bam.GetSequenceStatYearlySummaries wrappedParam =
                                                             (org.wso2.carbon.bam.GetSequenceStatYearlySummaries)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetSequenceStatYearlySummaries.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               medSummaryStats93 =
                                                   
                                                   
                                                         skel.getSequenceStatYearlySummaries(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), medSummaryStats93, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getSequenceStatYearlySummaries"));
                                    } else 

            if("getProxyStatMonthlySummaries".equals(methodName)){
                
                org.wso2.carbon.bam.MedSummaryStatsE medSummaryStats95 = null;
	                        org.wso2.carbon.bam.GetProxyStatMonthlySummaries wrappedParam =
                                                             (org.wso2.carbon.bam.GetProxyStatMonthlySummaries)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetProxyStatMonthlySummaries.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               medSummaryStats95 =
                                                   
                                                   
                                                         skel.getProxyStatMonthlySummaries(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), medSummaryStats95, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getProxyStatMonthlySummaries"));
                                    } else 

            if("getProxyStatHourlySummaries".equals(methodName)){
                
                org.wso2.carbon.bam.MedSummaryStatsE medSummaryStats97 = null;
	                        org.wso2.carbon.bam.GetProxyStatHourlySummaries wrappedParam =
                                                             (org.wso2.carbon.bam.GetProxyStatHourlySummaries)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetProxyStatHourlySummaries.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               medSummaryStats97 =
                                                   
                                                   
                                                         skel.getProxyStatHourlySummaries(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), medSummaryStats97, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getProxyStatHourlySummaries"));
                                    } else 

            if("getSequenceStatMonthlySummaries".equals(methodName)){
                
                org.wso2.carbon.bam.MedSummaryStatsE medSummaryStats99 = null;
	                        org.wso2.carbon.bam.GetSequenceStatMonthlySummaries wrappedParam =
                                                             (org.wso2.carbon.bam.GetSequenceStatMonthlySummaries)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetSequenceStatMonthlySummaries.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               medSummaryStats99 =
                                                   
                                                   
                                                         skel.getSequenceStatMonthlySummaries(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), medSummaryStats99, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getSequenceStatMonthlySummaries"));
                                    } else 

            if("getSequenceStatHourlySummaries".equals(methodName)){
                
                org.wso2.carbon.bam.MedSummaryStatsE medSummaryStats101 = null;
	                        org.wso2.carbon.bam.GetSequenceStatHourlySummaries wrappedParam =
                                                             (org.wso2.carbon.bam.GetSequenceStatHourlySummaries)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetSequenceStatHourlySummaries.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               medSummaryStats101 =
                                                   
                                                   
                                                         skel.getSequenceStatHourlySummaries(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), medSummaryStats101, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getSequenceStatHourlySummaries"));
                                    } else 

            if("getSequenceStatQuarterlySummaries".equals(methodName)){
                
                org.wso2.carbon.bam.MedSummaryStatsE medSummaryStats103 = null;
	                        org.wso2.carbon.bam.GetSequenceStatQuarterlySummaries wrappedParam =
                                                             (org.wso2.carbon.bam.GetSequenceStatQuarterlySummaries)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetSequenceStatQuarterlySummaries.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               medSummaryStats103 =
                                                   
                                                   
                                                         skel.getSequenceStatQuarterlySummaries(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), medSummaryStats103, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getSequenceStatQuarterlySummaries"));
                                    } else 

            if("getServerStatDailySummaries".equals(methodName)){
                
                org.wso2.carbon.bam.SummaryStatsE summaryStats105 = null;
	                        org.wso2.carbon.bam.GetServerStatDailySummaries wrappedParam =
                                                             (org.wso2.carbon.bam.GetServerStatDailySummaries)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetServerStatDailySummaries.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               summaryStats105 =
                                                   
                                                   
                                                         skel.getServerStatDailySummaries(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), summaryStats105, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getServerStatDailySummaries"));
                                    } else 

            if("getEndpointStatHourlySummaries".equals(methodName)){
                
                org.wso2.carbon.bam.MedSummaryStatsE medSummaryStats107 = null;
	                        org.wso2.carbon.bam.GetEndpointStatHourlySummaries wrappedParam =
                                                             (org.wso2.carbon.bam.GetEndpointStatHourlySummaries)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetEndpointStatHourlySummaries.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               medSummaryStats107 =
                                                   
                                                   
                                                         skel.getEndpointStatHourlySummaries(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), medSummaryStats107, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getEndpointStatHourlySummaries"));
                                    } else 

            if("getServiceStatHourlySummaries".equals(methodName)){
                
                org.wso2.carbon.bam.SummaryStatsE summaryStats109 = null;
	                        org.wso2.carbon.bam.GetServiceStatHourlySummaries wrappedParam =
                                                             (org.wso2.carbon.bam.GetServiceStatHourlySummaries)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetServiceStatHourlySummaries.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               summaryStats109 =
                                                   
                                                   
                                                         skel.getServiceStatHourlySummaries(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), summaryStats109, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getServiceStatHourlySummaries"));
                                    } else 

            if("getServerStatYearlySummaries".equals(methodName)){
                
                org.wso2.carbon.bam.SummaryStatsE summaryStats111 = null;
	                        org.wso2.carbon.bam.GetServerStatYearlySummaries wrappedParam =
                                                             (org.wso2.carbon.bam.GetServerStatYearlySummaries)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetServerStatYearlySummaries.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               summaryStats111 =
                                                   
                                                   
                                                         skel.getServerStatYearlySummaries(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), summaryStats111, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getServerStatYearlySummaries"));
                                    } else 

            if("getOperationStatYearlySummaries".equals(methodName)){
                
                org.wso2.carbon.bam.SummaryStatsE summaryStats113 = null;
	                        org.wso2.carbon.bam.GetOperationStatYearlySummaries wrappedParam =
                                                             (org.wso2.carbon.bam.GetOperationStatYearlySummaries)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetOperationStatYearlySummaries.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               summaryStats113 =
                                                   
                                                   
                                                         skel.getOperationStatYearlySummaries(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), summaryStats113, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getOperationStatYearlySummaries"));
                                    } else 

            if("getEndpointStatYearlySummaries".equals(methodName)){
                
                org.wso2.carbon.bam.MedSummaryStatsE medSummaryStats115 = null;
	                        org.wso2.carbon.bam.GetEndpointStatYearlySummaries wrappedParam =
                                                             (org.wso2.carbon.bam.GetEndpointStatYearlySummaries)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetEndpointStatYearlySummaries.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               medSummaryStats115 =
                                                   
                                                   
                                                         skel.getEndpointStatYearlySummaries(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), medSummaryStats115, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getEndpointStatYearlySummaries"));
                                    } else 

            if("getServiceStatYearlySummaries".equals(methodName)){
                
                org.wso2.carbon.bam.SummaryStatsE summaryStats117 = null;
	                        org.wso2.carbon.bam.GetServiceStatYearlySummaries wrappedParam =
                                                             (org.wso2.carbon.bam.GetServiceStatYearlySummaries)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetServiceStatYearlySummaries.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               summaryStats117 =
                                                   
                                                   
                                                         skel.getServiceStatYearlySummaries(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), summaryStats117, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getServiceStatYearlySummaries"));
                                    } else 

            if("getProxyStatDailySummaries".equals(methodName)){
                
                org.wso2.carbon.bam.MedSummaryStatsE medSummaryStats119 = null;
	                        org.wso2.carbon.bam.GetProxyStatDailySummaries wrappedParam =
                                                             (org.wso2.carbon.bam.GetProxyStatDailySummaries)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetProxyStatDailySummaries.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               medSummaryStats119 =
                                                   
                                                   
                                                         skel.getProxyStatDailySummaries(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), medSummaryStats119, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getProxyStatDailySummaries"));
                                    } else 

            if("getServiceStatMonthlySummaries".equals(methodName)){
                
                org.wso2.carbon.bam.SummaryStatsE summaryStats121 = null;
	                        org.wso2.carbon.bam.GetServiceStatMonthlySummaries wrappedParam =
                                                             (org.wso2.carbon.bam.GetServiceStatMonthlySummaries)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetServiceStatMonthlySummaries.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               summaryStats121 =
                                                   
                                                   
                                                         skel.getServiceStatMonthlySummaries(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), summaryStats121, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getServiceStatMonthlySummaries"));
                                    } else 

            if("getProxyStatQuarterlySummaries".equals(methodName)){
                
                org.wso2.carbon.bam.MedSummaryStatsE medSummaryStats123 = null;
	                        org.wso2.carbon.bam.GetProxyStatQuarterlySummaries wrappedParam =
                                                             (org.wso2.carbon.bam.GetProxyStatQuarterlySummaries)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetProxyStatQuarterlySummaries.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               medSummaryStats123 =
                                                   
                                                   
                                                         skel.getProxyStatQuarterlySummaries(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), medSummaryStats123, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getProxyStatQuarterlySummaries"));
                                    } else 

            if("getEndpointStatDailySummaries".equals(methodName)){
                
                org.wso2.carbon.bam.MedSummaryStatsE medSummaryStats125 = null;
	                        org.wso2.carbon.bam.GetEndpointStatDailySummaries wrappedParam =
                                                             (org.wso2.carbon.bam.GetEndpointStatDailySummaries)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetEndpointStatDailySummaries.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               medSummaryStats125 =
                                                   
                                                   
                                                         skel.getEndpointStatDailySummaries(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), medSummaryStats125, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getEndpointStatDailySummaries"));
                                    } else 

            if("getEndpointStatMonthlySummaries".equals(methodName)){
                
                org.wso2.carbon.bam.MedSummaryStatsE medSummaryStats127 = null;
	                        org.wso2.carbon.bam.GetEndpointStatMonthlySummaries wrappedParam =
                                                             (org.wso2.carbon.bam.GetEndpointStatMonthlySummaries)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetEndpointStatMonthlySummaries.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               medSummaryStats127 =
                                                   
                                                   
                                                         skel.getEndpointStatMonthlySummaries(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), medSummaryStats127, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getEndpointStatMonthlySummaries"));
                                    } else 

            if("getServerStatMonthlySummaries".equals(methodName)){
                
                org.wso2.carbon.bam.SummaryStatsE summaryStats129 = null;
	                        org.wso2.carbon.bam.GetServerStatMonthlySummaries wrappedParam =
                                                             (org.wso2.carbon.bam.GetServerStatMonthlySummaries)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetServerStatMonthlySummaries.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               summaryStats129 =
                                                   
                                                   
                                                         skel.getServerStatMonthlySummaries(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), summaryStats129, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getServerStatMonthlySummaries"));
                                    } else 

            if("getServiceStatDailySummaries".equals(methodName)){
                
                org.wso2.carbon.bam.SummaryStatsE summaryStats131 = null;
	                        org.wso2.carbon.bam.GetServiceStatDailySummaries wrappedParam =
                                                             (org.wso2.carbon.bam.GetServiceStatDailySummaries)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetServiceStatDailySummaries.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               summaryStats131 =
                                                   
                                                   
                                                         skel.getServiceStatDailySummaries(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), summaryStats131, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getServiceStatDailySummaries"));
                                    } else 

            if("getSequenceStatDailySummaries".equals(methodName)){
                
                org.wso2.carbon.bam.MedSummaryStatsE medSummaryStats133 = null;
	                        org.wso2.carbon.bam.GetSequenceStatDailySummaries wrappedParam =
                                                             (org.wso2.carbon.bam.GetSequenceStatDailySummaries)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetSequenceStatDailySummaries.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               medSummaryStats133 =
                                                   
                                                   
                                                         skel.getSequenceStatDailySummaries(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), medSummaryStats133, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getSequenceStatDailySummaries"));
                                    } else 

            if("getOperationStatDailySummaries".equals(methodName)){
                
                org.wso2.carbon.bam.SummaryStatsE summaryStats135 = null;
	                        org.wso2.carbon.bam.GetOperationStatDailySummaries wrappedParam =
                                                             (org.wso2.carbon.bam.GetOperationStatDailySummaries)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetOperationStatDailySummaries.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               summaryStats135 =
                                                   
                                                   
                                                         skel.getOperationStatDailySummaries(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), summaryStats135, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getOperationStatDailySummaries"));
                                    } else 

            if("getOperationStatHourlySummaries".equals(methodName)){
                
                org.wso2.carbon.bam.SummaryStatsE summaryStats137 = null;
	                        org.wso2.carbon.bam.GetOperationStatHourlySummaries wrappedParam =
                                                             (org.wso2.carbon.bam.GetOperationStatHourlySummaries)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetOperationStatHourlySummaries.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               summaryStats137 =
                                                   
                                                   
                                                         skel.getOperationStatHourlySummaries(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), summaryStats137, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getOperationStatHourlySummaries"));
                                    } else 

            if("getServerStatHourlySummaries".equals(methodName)){
                
                org.wso2.carbon.bam.SummaryStatsE summaryStats139 = null;
	                        org.wso2.carbon.bam.GetServerStatHourlySummaries wrappedParam =
                                                             (org.wso2.carbon.bam.GetServerStatHourlySummaries)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetServerStatHourlySummaries.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               summaryStats139 =
                                                   
                                                   
                                                         skel.getServerStatHourlySummaries(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), summaryStats139, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getServerStatHourlySummaries"));
                                    } else 

            if("getServerStatQuarterlySummaries".equals(methodName)){
                
                org.wso2.carbon.bam.SummaryStatsE summaryStats141 = null;
	                        org.wso2.carbon.bam.GetServerStatQuarterlySummaries wrappedParam =
                                                             (org.wso2.carbon.bam.GetServerStatQuarterlySummaries)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetServerStatQuarterlySummaries.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               summaryStats141 =
                                                   
                                                   
                                                         skel.getServerStatQuarterlySummaries(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), summaryStats141, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getServerStatQuarterlySummaries"));
                                    } else 

            if("getProxyStatYearlySummaries".equals(methodName)){
                
                org.wso2.carbon.bam.MedSummaryStatsE medSummaryStats143 = null;
	                        org.wso2.carbon.bam.GetProxyStatYearlySummaries wrappedParam =
                                                             (org.wso2.carbon.bam.GetProxyStatYearlySummaries)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetProxyStatYearlySummaries.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               medSummaryStats143 =
                                                   
                                                   
                                                         skel.getProxyStatYearlySummaries(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), medSummaryStats143, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getProxyStatYearlySummaries"));
                                    } else 

            if("getServiceStatQuarterlySummaries".equals(methodName)){
                
                org.wso2.carbon.bam.SummaryStatsE summaryStats145 = null;
	                        org.wso2.carbon.bam.GetServiceStatQuarterlySummaries wrappedParam =
                                                             (org.wso2.carbon.bam.GetServiceStatQuarterlySummaries)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetServiceStatQuarterlySummaries.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               summaryStats145 =
                                                   
                                                   
                                                         skel.getServiceStatQuarterlySummaries(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), summaryStats145, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getServiceStatQuarterlySummaries"));
                                    } else 

            if("getEndpointStatQuarterlySummaries".equals(methodName)){
                
                org.wso2.carbon.bam.MedSummaryStatsE medSummaryStats147 = null;
	                        org.wso2.carbon.bam.GetEndpointStatQuarterlySummaries wrappedParam =
                                                             (org.wso2.carbon.bam.GetEndpointStatQuarterlySummaries)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetEndpointStatQuarterlySummaries.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               medSummaryStats147 =
                                                   
                                                   
                                                         skel.getEndpointStatQuarterlySummaries(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), medSummaryStats147, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getEndpointStatQuarterlySummaries"));
                                    
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
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetOperationStatQuarterlySummaries param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetOperationStatQuarterlySummaries.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.SummaryStatsE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.SummaryStatsE.MY_QNAME,
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
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetOperationStatMonthlySummaries param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetOperationStatMonthlySummaries.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetSequenceStatYearlySummaries param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetSequenceStatYearlySummaries.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.MedSummaryStatsE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.MedSummaryStatsE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetProxyStatMonthlySummaries param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetProxyStatMonthlySummaries.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetProxyStatHourlySummaries param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetProxyStatHourlySummaries.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetSequenceStatMonthlySummaries param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetSequenceStatMonthlySummaries.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetSequenceStatHourlySummaries param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetSequenceStatHourlySummaries.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetSequenceStatQuarterlySummaries param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetSequenceStatQuarterlySummaries.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetServerStatDailySummaries param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetServerStatDailySummaries.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetEndpointStatHourlySummaries param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetEndpointStatHourlySummaries.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetServiceStatHourlySummaries param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetServiceStatHourlySummaries.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetServerStatYearlySummaries param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetServerStatYearlySummaries.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetOperationStatYearlySummaries param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetOperationStatYearlySummaries.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetEndpointStatYearlySummaries param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetEndpointStatYearlySummaries.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetServiceStatYearlySummaries param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetServiceStatYearlySummaries.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetProxyStatDailySummaries param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetProxyStatDailySummaries.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetServiceStatMonthlySummaries param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetServiceStatMonthlySummaries.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetProxyStatQuarterlySummaries param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetProxyStatQuarterlySummaries.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetEndpointStatDailySummaries param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetEndpointStatDailySummaries.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetEndpointStatMonthlySummaries param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetEndpointStatMonthlySummaries.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetServerStatMonthlySummaries param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetServerStatMonthlySummaries.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetServiceStatDailySummaries param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetServiceStatDailySummaries.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetSequenceStatDailySummaries param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetSequenceStatDailySummaries.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetOperationStatDailySummaries param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetOperationStatDailySummaries.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetOperationStatHourlySummaries param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetOperationStatHourlySummaries.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetServerStatHourlySummaries param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetServerStatHourlySummaries.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetServerStatQuarterlySummaries param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetServerStatQuarterlySummaries.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetProxyStatYearlySummaries param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetProxyStatYearlySummaries.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetServiceStatQuarterlySummaries param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetServiceStatQuarterlySummaries.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetEndpointStatQuarterlySummaries param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetEndpointStatQuarterlySummaries.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.bam.SummaryStatsE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.bam.SummaryStatsE.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.bam.SummaryStatsE wrapgetOperationStatQuarterlySummaries(){
                                org.wso2.carbon.bam.SummaryStatsE wrappedElement = new org.wso2.carbon.bam.SummaryStatsE();
                                return wrappedElement;
                         }
                    
                         private org.wso2.carbon.bam.SummaryStatsE wrapgetOperationStatMonthlySummaries(){
                                org.wso2.carbon.bam.SummaryStatsE wrappedElement = new org.wso2.carbon.bam.SummaryStatsE();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.bam.MedSummaryStatsE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.bam.MedSummaryStatsE.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.bam.MedSummaryStatsE wrapgetSequenceStatYearlySummaries(){
                                org.wso2.carbon.bam.MedSummaryStatsE wrappedElement = new org.wso2.carbon.bam.MedSummaryStatsE();
                                return wrappedElement;
                         }
                    
                         private org.wso2.carbon.bam.MedSummaryStatsE wrapgetProxyStatMonthlySummaries(){
                                org.wso2.carbon.bam.MedSummaryStatsE wrappedElement = new org.wso2.carbon.bam.MedSummaryStatsE();
                                return wrappedElement;
                         }
                    
                         private org.wso2.carbon.bam.MedSummaryStatsE wrapgetProxyStatHourlySummaries(){
                                org.wso2.carbon.bam.MedSummaryStatsE wrappedElement = new org.wso2.carbon.bam.MedSummaryStatsE();
                                return wrappedElement;
                         }
                    
                         private org.wso2.carbon.bam.MedSummaryStatsE wrapgetSequenceStatMonthlySummaries(){
                                org.wso2.carbon.bam.MedSummaryStatsE wrappedElement = new org.wso2.carbon.bam.MedSummaryStatsE();
                                return wrappedElement;
                         }
                    
                         private org.wso2.carbon.bam.MedSummaryStatsE wrapgetSequenceStatHourlySummaries(){
                                org.wso2.carbon.bam.MedSummaryStatsE wrappedElement = new org.wso2.carbon.bam.MedSummaryStatsE();
                                return wrappedElement;
                         }
                    
                         private org.wso2.carbon.bam.MedSummaryStatsE wrapgetSequenceStatQuarterlySummaries(){
                                org.wso2.carbon.bam.MedSummaryStatsE wrappedElement = new org.wso2.carbon.bam.MedSummaryStatsE();
                                return wrappedElement;
                         }
                    
                         private org.wso2.carbon.bam.SummaryStatsE wrapgetServerStatDailySummaries(){
                                org.wso2.carbon.bam.SummaryStatsE wrappedElement = new org.wso2.carbon.bam.SummaryStatsE();
                                return wrappedElement;
                         }
                    
                         private org.wso2.carbon.bam.MedSummaryStatsE wrapgetEndpointStatHourlySummaries(){
                                org.wso2.carbon.bam.MedSummaryStatsE wrappedElement = new org.wso2.carbon.bam.MedSummaryStatsE();
                                return wrappedElement;
                         }
                    
                         private org.wso2.carbon.bam.SummaryStatsE wrapgetServiceStatHourlySummaries(){
                                org.wso2.carbon.bam.SummaryStatsE wrappedElement = new org.wso2.carbon.bam.SummaryStatsE();
                                return wrappedElement;
                         }
                    
                         private org.wso2.carbon.bam.SummaryStatsE wrapgetServerStatYearlySummaries(){
                                org.wso2.carbon.bam.SummaryStatsE wrappedElement = new org.wso2.carbon.bam.SummaryStatsE();
                                return wrappedElement;
                         }
                    
                         private org.wso2.carbon.bam.SummaryStatsE wrapgetOperationStatYearlySummaries(){
                                org.wso2.carbon.bam.SummaryStatsE wrappedElement = new org.wso2.carbon.bam.SummaryStatsE();
                                return wrappedElement;
                         }
                    
                         private org.wso2.carbon.bam.MedSummaryStatsE wrapgetEndpointStatYearlySummaries(){
                                org.wso2.carbon.bam.MedSummaryStatsE wrappedElement = new org.wso2.carbon.bam.MedSummaryStatsE();
                                return wrappedElement;
                         }
                    
                         private org.wso2.carbon.bam.SummaryStatsE wrapgetServiceStatYearlySummaries(){
                                org.wso2.carbon.bam.SummaryStatsE wrappedElement = new org.wso2.carbon.bam.SummaryStatsE();
                                return wrappedElement;
                         }
                    
                         private org.wso2.carbon.bam.MedSummaryStatsE wrapgetProxyStatDailySummaries(){
                                org.wso2.carbon.bam.MedSummaryStatsE wrappedElement = new org.wso2.carbon.bam.MedSummaryStatsE();
                                return wrappedElement;
                         }
                    
                         private org.wso2.carbon.bam.SummaryStatsE wrapgetServiceStatMonthlySummaries(){
                                org.wso2.carbon.bam.SummaryStatsE wrappedElement = new org.wso2.carbon.bam.SummaryStatsE();
                                return wrappedElement;
                         }
                    
                         private org.wso2.carbon.bam.MedSummaryStatsE wrapgetProxyStatQuarterlySummaries(){
                                org.wso2.carbon.bam.MedSummaryStatsE wrappedElement = new org.wso2.carbon.bam.MedSummaryStatsE();
                                return wrappedElement;
                         }
                    
                         private org.wso2.carbon.bam.MedSummaryStatsE wrapgetEndpointStatDailySummaries(){
                                org.wso2.carbon.bam.MedSummaryStatsE wrappedElement = new org.wso2.carbon.bam.MedSummaryStatsE();
                                return wrappedElement;
                         }
                    
                         private org.wso2.carbon.bam.MedSummaryStatsE wrapgetEndpointStatMonthlySummaries(){
                                org.wso2.carbon.bam.MedSummaryStatsE wrappedElement = new org.wso2.carbon.bam.MedSummaryStatsE();
                                return wrappedElement;
                         }
                    
                         private org.wso2.carbon.bam.SummaryStatsE wrapgetServerStatMonthlySummaries(){
                                org.wso2.carbon.bam.SummaryStatsE wrappedElement = new org.wso2.carbon.bam.SummaryStatsE();
                                return wrappedElement;
                         }
                    
                         private org.wso2.carbon.bam.SummaryStatsE wrapgetServiceStatDailySummaries(){
                                org.wso2.carbon.bam.SummaryStatsE wrappedElement = new org.wso2.carbon.bam.SummaryStatsE();
                                return wrappedElement;
                         }
                    
                         private org.wso2.carbon.bam.MedSummaryStatsE wrapgetSequenceStatDailySummaries(){
                                org.wso2.carbon.bam.MedSummaryStatsE wrappedElement = new org.wso2.carbon.bam.MedSummaryStatsE();
                                return wrappedElement;
                         }
                    
                         private org.wso2.carbon.bam.SummaryStatsE wrapgetOperationStatDailySummaries(){
                                org.wso2.carbon.bam.SummaryStatsE wrappedElement = new org.wso2.carbon.bam.SummaryStatsE();
                                return wrappedElement;
                         }
                    
                         private org.wso2.carbon.bam.SummaryStatsE wrapgetOperationStatHourlySummaries(){
                                org.wso2.carbon.bam.SummaryStatsE wrappedElement = new org.wso2.carbon.bam.SummaryStatsE();
                                return wrappedElement;
                         }
                    
                         private org.wso2.carbon.bam.SummaryStatsE wrapgetServerStatHourlySummaries(){
                                org.wso2.carbon.bam.SummaryStatsE wrappedElement = new org.wso2.carbon.bam.SummaryStatsE();
                                return wrappedElement;
                         }
                    
                         private org.wso2.carbon.bam.SummaryStatsE wrapgetServerStatQuarterlySummaries(){
                                org.wso2.carbon.bam.SummaryStatsE wrappedElement = new org.wso2.carbon.bam.SummaryStatsE();
                                return wrappedElement;
                         }
                    
                         private org.wso2.carbon.bam.MedSummaryStatsE wrapgetProxyStatYearlySummaries(){
                                org.wso2.carbon.bam.MedSummaryStatsE wrappedElement = new org.wso2.carbon.bam.MedSummaryStatsE();
                                return wrappedElement;
                         }
                    
                         private org.wso2.carbon.bam.SummaryStatsE wrapgetServiceStatQuarterlySummaries(){
                                org.wso2.carbon.bam.SummaryStatsE wrappedElement = new org.wso2.carbon.bam.SummaryStatsE();
                                return wrappedElement;
                         }
                    
                         private org.wso2.carbon.bam.MedSummaryStatsE wrapgetEndpointStatQuarterlySummaries(){
                                org.wso2.carbon.bam.MedSummaryStatsE wrappedElement = new org.wso2.carbon.bam.MedSummaryStatsE();
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
        
                if (org.wso2.carbon.bam.GetOperationStatQuarterlySummaries.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetOperationStatQuarterlySummaries.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.SummaryStatsE.class.equals(type)){
                
                           return org.wso2.carbon.bam.SummaryStatsE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetOperationStatMonthlySummaries.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetOperationStatMonthlySummaries.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.SummaryStatsE.class.equals(type)){
                
                           return org.wso2.carbon.bam.SummaryStatsE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetSequenceStatYearlySummaries.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetSequenceStatYearlySummaries.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.MedSummaryStatsE.class.equals(type)){
                
                           return org.wso2.carbon.bam.MedSummaryStatsE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetProxyStatMonthlySummaries.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetProxyStatMonthlySummaries.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.MedSummaryStatsE.class.equals(type)){
                
                           return org.wso2.carbon.bam.MedSummaryStatsE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetProxyStatHourlySummaries.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetProxyStatHourlySummaries.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.MedSummaryStatsE.class.equals(type)){
                
                           return org.wso2.carbon.bam.MedSummaryStatsE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetSequenceStatMonthlySummaries.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetSequenceStatMonthlySummaries.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.MedSummaryStatsE.class.equals(type)){
                
                           return org.wso2.carbon.bam.MedSummaryStatsE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetSequenceStatHourlySummaries.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetSequenceStatHourlySummaries.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.MedSummaryStatsE.class.equals(type)){
                
                           return org.wso2.carbon.bam.MedSummaryStatsE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetSequenceStatQuarterlySummaries.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetSequenceStatQuarterlySummaries.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.MedSummaryStatsE.class.equals(type)){
                
                           return org.wso2.carbon.bam.MedSummaryStatsE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetServerStatDailySummaries.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetServerStatDailySummaries.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.SummaryStatsE.class.equals(type)){
                
                           return org.wso2.carbon.bam.SummaryStatsE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetEndpointStatHourlySummaries.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetEndpointStatHourlySummaries.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.MedSummaryStatsE.class.equals(type)){
                
                           return org.wso2.carbon.bam.MedSummaryStatsE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetServiceStatHourlySummaries.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetServiceStatHourlySummaries.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.SummaryStatsE.class.equals(type)){
                
                           return org.wso2.carbon.bam.SummaryStatsE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetServerStatYearlySummaries.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetServerStatYearlySummaries.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.SummaryStatsE.class.equals(type)){
                
                           return org.wso2.carbon.bam.SummaryStatsE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetOperationStatYearlySummaries.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetOperationStatYearlySummaries.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.SummaryStatsE.class.equals(type)){
                
                           return org.wso2.carbon.bam.SummaryStatsE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetEndpointStatYearlySummaries.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetEndpointStatYearlySummaries.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.MedSummaryStatsE.class.equals(type)){
                
                           return org.wso2.carbon.bam.MedSummaryStatsE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetServiceStatYearlySummaries.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetServiceStatYearlySummaries.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.SummaryStatsE.class.equals(type)){
                
                           return org.wso2.carbon.bam.SummaryStatsE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetProxyStatDailySummaries.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetProxyStatDailySummaries.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.MedSummaryStatsE.class.equals(type)){
                
                           return org.wso2.carbon.bam.MedSummaryStatsE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetServiceStatMonthlySummaries.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetServiceStatMonthlySummaries.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.SummaryStatsE.class.equals(type)){
                
                           return org.wso2.carbon.bam.SummaryStatsE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetProxyStatQuarterlySummaries.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetProxyStatQuarterlySummaries.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.MedSummaryStatsE.class.equals(type)){
                
                           return org.wso2.carbon.bam.MedSummaryStatsE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetEndpointStatDailySummaries.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetEndpointStatDailySummaries.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.MedSummaryStatsE.class.equals(type)){
                
                           return org.wso2.carbon.bam.MedSummaryStatsE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetEndpointStatMonthlySummaries.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetEndpointStatMonthlySummaries.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.MedSummaryStatsE.class.equals(type)){
                
                           return org.wso2.carbon.bam.MedSummaryStatsE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetServerStatMonthlySummaries.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetServerStatMonthlySummaries.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.SummaryStatsE.class.equals(type)){
                
                           return org.wso2.carbon.bam.SummaryStatsE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetServiceStatDailySummaries.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetServiceStatDailySummaries.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.SummaryStatsE.class.equals(type)){
                
                           return org.wso2.carbon.bam.SummaryStatsE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetSequenceStatDailySummaries.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetSequenceStatDailySummaries.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.MedSummaryStatsE.class.equals(type)){
                
                           return org.wso2.carbon.bam.MedSummaryStatsE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetOperationStatDailySummaries.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetOperationStatDailySummaries.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.SummaryStatsE.class.equals(type)){
                
                           return org.wso2.carbon.bam.SummaryStatsE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetOperationStatHourlySummaries.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetOperationStatHourlySummaries.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.SummaryStatsE.class.equals(type)){
                
                           return org.wso2.carbon.bam.SummaryStatsE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetServerStatHourlySummaries.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetServerStatHourlySummaries.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.SummaryStatsE.class.equals(type)){
                
                           return org.wso2.carbon.bam.SummaryStatsE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetServerStatQuarterlySummaries.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetServerStatQuarterlySummaries.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.SummaryStatsE.class.equals(type)){
                
                           return org.wso2.carbon.bam.SummaryStatsE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetProxyStatYearlySummaries.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetProxyStatYearlySummaries.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.MedSummaryStatsE.class.equals(type)){
                
                           return org.wso2.carbon.bam.MedSummaryStatsE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetServiceStatQuarterlySummaries.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetServiceStatQuarterlySummaries.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.SummaryStatsE.class.equals(type)){
                
                           return org.wso2.carbon.bam.SummaryStatsE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetEndpointStatQuarterlySummaries.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetEndpointStatQuarterlySummaries.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.MedSummaryStatsE.class.equals(type)){
                
                           return org.wso2.carbon.bam.MedSummaryStatsE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

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
    
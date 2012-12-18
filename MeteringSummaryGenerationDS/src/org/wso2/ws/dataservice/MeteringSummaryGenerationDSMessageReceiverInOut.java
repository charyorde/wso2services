
/**
 * MeteringSummaryGenerationDSMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */
        package org.wso2.ws.dataservice;

        /**
        *  MeteringSummaryGenerationDSMessageReceiverInOut message receiver
        */

        public class MeteringSummaryGenerationDSMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        MeteringSummaryGenerationDSSkeletonInterface skel = (MeteringSummaryGenerationDSSkeletonInterface)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){


        

            if("getDataForYearlySummary".equals(methodName)){
                
                org.wso2.carbon.bam.BandwidthStatValuesE bandwidthStatValues52 = null;
	                        org.wso2.carbon.bam.GetDataForYearlySummary wrappedParam =
                                                             (org.wso2.carbon.bam.GetDataForYearlySummary)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetDataForYearlySummary.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               bandwidthStatValues52 =
                                                   
                                                   
                                                         skel.getDataForYearlySummary(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), bandwidthStatValues52, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getDataForYearlySummary"));
                                    } else 

            if("getRegistryHistoryBandwidthUsage".equals(methodName)){
                
                org.wso2.carbon.bam.BandwidthUsagesE bandwidthUsages54 = null;
	                        org.wso2.carbon.bam.GetRegistryHistoryBandwidthUsage wrappedParam =
                                                             (org.wso2.carbon.bam.GetRegistryHistoryBandwidthUsage)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetRegistryHistoryBandwidthUsage.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               bandwidthUsages54 =
                                                   
                                                   
                                                         skel.getRegistryHistoryBandwidthUsage(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), bandwidthUsages54, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getRegistryHistoryBandwidthUsage"));
                                    } else 

            if("getRegistryBandwidthUsage".equals(methodName)){
                
                org.wso2.carbon.bam.BandwidthUsagesE bandwidthUsages56 = null;
	                        org.wso2.carbon.bam.GetRegistryBandwidthUsage wrappedParam =
                                                             (org.wso2.carbon.bam.GetRegistryBandwidthUsage)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetRegistryBandwidthUsage.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               bandwidthUsages56 =
                                                   
                                                   
                                                         skel.getRegistryBandwidthUsage(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), bandwidthUsages56, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getRegistryBandwidthUsage"));
                                    } else 

            if("getDataForMonthlySummary".equals(methodName)){
                
                org.wso2.carbon.bam.BandwidthStatValuesE bandwidthStatValues58 = null;
	                        org.wso2.carbon.bam.GetDataForMonthlySummary wrappedParam =
                                                             (org.wso2.carbon.bam.GetDataForMonthlySummary)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetDataForMonthlySummary.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               bandwidthStatValues58 =
                                                   
                                                   
                                                         skel.getDataForMonthlySummary(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), bandwidthStatValues58, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getDataForMonthlySummary"));
                                    } else 

            if("getMinimumPeriodId".equals(methodName)){
                
                org.wso2.carbon.bam.SummaryTimesE summaryTimes60 = null;
	                        org.wso2.carbon.bam.GetMinimumPeriodId wrappedParam =
                                                             (org.wso2.carbon.bam.GetMinimumPeriodId)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetMinimumPeriodId.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               summaryTimes60 =
                                                   
                                                   
                                                         skel.getMinimumPeriodId(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), summaryTimes60, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getMinimumPeriodId"));
                                    } else 

            if("getLatestMonthlyBandwidthSummaryPeriodId".equals(methodName)){
                
                org.wso2.carbon.bam.SummaryTimesE summaryTimes62 = null;
	                        org.wso2.carbon.bam.GetLatestMonthlyBandwidthSummaryPeriodId wrappedParam =
                                                             (org.wso2.carbon.bam.GetLatestMonthlyBandwidthSummaryPeriodId)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetLatestMonthlyBandwidthSummaryPeriodId.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               summaryTimes62 =
                                                   
                                                   
                                                         skel.getLatestMonthlyBandwidthSummaryPeriodId(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), summaryTimes62, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getLatestMonthlyBandwidthSummaryPeriodId"));
                                    } else 

            if("getRegistryBandwidthUsageForMonthlySummary".equals(methodName)){
                
                org.wso2.carbon.bam.BandwidthUsageValuesE bandwidthUsageValues64 = null;
	                        org.wso2.carbon.bam.GetRegistryBandwidthUsageForMonthlySummary wrappedParam =
                                                             (org.wso2.carbon.bam.GetRegistryBandwidthUsageForMonthlySummary)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetRegistryBandwidthUsageForMonthlySummary.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               bandwidthUsageValues64 =
                                                   
                                                   
                                                         skel.getRegistryBandwidthUsageForMonthlySummary(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), bandwidthUsageValues64, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getRegistryBandwidthUsageForMonthlySummary"));
                                    } else 

            if("getLatestHourlyBandwidthSummaryPeriodId".equals(methodName)){
                
                org.wso2.carbon.bam.SummaryTimesE summaryTimes66 = null;
	                        org.wso2.carbon.bam.GetLatestHourlyBandwidthSummaryPeriodId wrappedParam =
                                                             (org.wso2.carbon.bam.GetLatestHourlyBandwidthSummaryPeriodId)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetLatestHourlyBandwidthSummaryPeriodId.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               summaryTimes66 =
                                                   
                                                   
                                                         skel.getLatestHourlyBandwidthSummaryPeriodId(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), summaryTimes66, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getLatestHourlyBandwidthSummaryPeriodId"));
                                    } else 

            if("getDataForHourlySummary".equals(methodName)){
                
                org.wso2.carbon.bam.BandwidthHourlyStatValuesE bandwidthHourlyStatValues68 = null;
	                        org.wso2.carbon.bam.GetDataForHourlySummary wrappedParam =
                                                             (org.wso2.carbon.bam.GetDataForHourlySummary)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetDataForHourlySummary.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               bandwidthHourlyStatValues68 =
                                                   
                                                   
                                                         skel.getDataForHourlySummary(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), bandwidthHourlyStatValues68, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getDataForHourlySummary"));
                                    } else 

            if("getLatestMonthlyRegistryBandwidthSummaryPeriodId".equals(methodName)){
                
                org.wso2.carbon.bam.SummaryTimesE summaryTimes70 = null;
	                        org.wso2.carbon.bam.GetLatestMonthlyRegistryBandwidthSummaryPeriodId wrappedParam =
                                                             (org.wso2.carbon.bam.GetLatestMonthlyRegistryBandwidthSummaryPeriodId)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetLatestMonthlyRegistryBandwidthSummaryPeriodId.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               summaryTimes70 =
                                                   
                                                   
                                                         skel.getLatestMonthlyRegistryBandwidthSummaryPeriodId(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), summaryTimes70, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getLatestMonthlyRegistryBandwidthSummaryPeriodId"));
                                    } else 

            if("getDataForQuarterlySummary".equals(methodName)){
                
                org.wso2.carbon.bam.BandwidthStatValuesE bandwidthStatValues72 = null;
	                        org.wso2.carbon.bam.GetDataForQuarterlySummary wrappedParam =
                                                             (org.wso2.carbon.bam.GetDataForQuarterlySummary)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetDataForQuarterlySummary.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               bandwidthStatValues72 =
                                                   
                                                   
                                                         skel.getDataForQuarterlySummary(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), bandwidthStatValues72, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getDataForQuarterlySummary"));
                                    } else 

            if("getLatestDailyRegistryBandwidthSummaryPeriodId".equals(methodName)){
                
                org.wso2.carbon.bam.SummaryTimesE summaryTimes74 = null;
	                        org.wso2.carbon.bam.GetLatestDailyRegistryBandwidthSummaryPeriodId wrappedParam =
                                                             (org.wso2.carbon.bam.GetLatestDailyRegistryBandwidthSummaryPeriodId)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetLatestDailyRegistryBandwidthSummaryPeriodId.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               summaryTimes74 =
                                                   
                                                   
                                                         skel.getLatestDailyRegistryBandwidthSummaryPeriodId(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), summaryTimes74, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getLatestDailyRegistryBandwidthSummaryPeriodId"));
                                    } else 

            if("getDataForDailySummary".equals(methodName)){
                
                org.wso2.carbon.bam.BandwidthStatValuesE bandwidthStatValues76 = null;
	                        org.wso2.carbon.bam.GetDataForDailySummary wrappedParam =
                                                             (org.wso2.carbon.bam.GetDataForDailySummary)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetDataForDailySummary.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               bandwidthStatValues76 =
                                                   
                                                   
                                                         skel.getDataForDailySummary(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), bandwidthStatValues76, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getDataForDailySummary"));
                                    } else 

            if("getLatestYearlyBandwidthSummaryPeriodId".equals(methodName)){
                
                org.wso2.carbon.bam.SummaryTimesE summaryTimes78 = null;
	                        org.wso2.carbon.bam.GetLatestYearlyBandwidthSummaryPeriodId wrappedParam =
                                                             (org.wso2.carbon.bam.GetLatestYearlyBandwidthSummaryPeriodId)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetLatestYearlyBandwidthSummaryPeriodId.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               summaryTimes78 =
                                                   
                                                   
                                                         skel.getLatestYearlyBandwidthSummaryPeriodId(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), summaryTimes78, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getLatestYearlyBandwidthSummaryPeriodId"));
                                    } else 

            if("getLatestQuarterlyBandwidthSummaryPeriodId".equals(methodName)){
                
                org.wso2.carbon.bam.SummaryTimesE summaryTimes80 = null;
	                        org.wso2.carbon.bam.GetLatestQuarterlyBandwidthSummaryPeriodId wrappedParam =
                                                             (org.wso2.carbon.bam.GetLatestQuarterlyBandwidthSummaryPeriodId)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetLatestQuarterlyBandwidthSummaryPeriodId.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               summaryTimes80 =
                                                   
                                                   
                                                         skel.getLatestQuarterlyBandwidthSummaryPeriodId(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), summaryTimes80, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getLatestQuarterlyBandwidthSummaryPeriodId"));
                                    } else 

            if("getLatestDailyBandwidthSummaryPeriodId".equals(methodName)){
                
                org.wso2.carbon.bam.SummaryTimesE summaryTimes82 = null;
	                        org.wso2.carbon.bam.GetLatestDailyBandwidthSummaryPeriodId wrappedParam =
                                                             (org.wso2.carbon.bam.GetLatestDailyBandwidthSummaryPeriodId)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetLatestDailyBandwidthSummaryPeriodId.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               summaryTimes82 =
                                                   
                                                   
                                                         skel.getLatestDailyBandwidthSummaryPeriodId(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), summaryTimes82, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getLatestDailyBandwidthSummaryPeriodId"));
                                    
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
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.ws.dataservice.AddBandwidthStatDailySummary param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.ws.dataservice.AddBandwidthStatDailySummary.MY_QNAME,
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
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetDataForYearlySummary param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetDataForYearlySummary.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.BandwidthStatValuesE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.BandwidthStatValuesE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetRegistryHistoryBandwidthUsage param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetRegistryHistoryBandwidthUsage.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.BandwidthUsagesE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.BandwidthUsagesE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.ws.dataservice.AddBandwidthStatHourlySummary param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.ws.dataservice.AddBandwidthStatHourlySummary.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetRegistryBandwidthUsage param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetRegistryBandwidthUsage.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetDataForMonthlySummary param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetDataForMonthlySummary.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.ws.dataservice.AddBandwidthStatYearlySummary param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.ws.dataservice.AddBandwidthStatYearlySummary.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetMinimumPeriodId param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetMinimumPeriodId.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.SummaryTimesE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.SummaryTimesE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.ws.dataservice.AddBandwidthStatMonthlySummary param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.ws.dataservice.AddBandwidthStatMonthlySummary.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.ws.dataservice.AddRegistryBandwidthUsageDailySummary param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.ws.dataservice.AddRegistryBandwidthUsageDailySummary.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetLatestMonthlyBandwidthSummaryPeriodId param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetLatestMonthlyBandwidthSummaryPeriodId.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.ws.dataservice.DeleteServerUserData param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.ws.dataservice.DeleteServerUserData.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.ws.dataservice.AddRegistryBandwidthUsageMonthlySummary param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.ws.dataservice.AddRegistryBandwidthUsageMonthlySummary.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.ws.dataservice.AddBandwidthStatQuarterlySummary param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.ws.dataservice.AddBandwidthStatQuarterlySummary.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetRegistryBandwidthUsageForMonthlySummary param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetRegistryBandwidthUsageForMonthlySummary.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.BandwidthUsageValuesE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.BandwidthUsageValuesE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetLatestHourlyBandwidthSummaryPeriodId param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetLatestHourlyBandwidthSummaryPeriodId.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetDataForHourlySummary param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetDataForHourlySummary.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.BandwidthHourlyStatValuesE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.BandwidthHourlyStatValuesE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetLatestMonthlyRegistryBandwidthSummaryPeriodId param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetLatestMonthlyRegistryBandwidthSummaryPeriodId.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetDataForQuarterlySummary param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetDataForQuarterlySummary.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetLatestDailyRegistryBandwidthSummaryPeriodId param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetLatestDailyRegistryBandwidthSummaryPeriodId.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetDataForDailySummary param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetDataForDailySummary.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetLatestYearlyBandwidthSummaryPeriodId param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetLatestYearlyBandwidthSummaryPeriodId.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetLatestQuarterlyBandwidthSummaryPeriodId param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetLatestQuarterlyBandwidthSummaryPeriodId.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetLatestDailyBandwidthSummaryPeriodId param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetLatestDailyBandwidthSummaryPeriodId.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.bam.BandwidthStatValuesE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.bam.BandwidthStatValuesE.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.bam.BandwidthStatValuesE wrapgetDataForYearlySummary(){
                                org.wso2.carbon.bam.BandwidthStatValuesE wrappedElement = new org.wso2.carbon.bam.BandwidthStatValuesE();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.bam.BandwidthUsagesE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.bam.BandwidthUsagesE.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.bam.BandwidthUsagesE wrapgetRegistryHistoryBandwidthUsage(){
                                org.wso2.carbon.bam.BandwidthUsagesE wrappedElement = new org.wso2.carbon.bam.BandwidthUsagesE();
                                return wrappedElement;
                         }
                    
                         private org.wso2.carbon.bam.BandwidthUsagesE wrapgetRegistryBandwidthUsage(){
                                org.wso2.carbon.bam.BandwidthUsagesE wrappedElement = new org.wso2.carbon.bam.BandwidthUsagesE();
                                return wrappedElement;
                         }
                    
                         private org.wso2.carbon.bam.BandwidthStatValuesE wrapgetDataForMonthlySummary(){
                                org.wso2.carbon.bam.BandwidthStatValuesE wrappedElement = new org.wso2.carbon.bam.BandwidthStatValuesE();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.bam.SummaryTimesE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.bam.SummaryTimesE.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.bam.SummaryTimesE wrapgetMinimumPeriodId(){
                                org.wso2.carbon.bam.SummaryTimesE wrappedElement = new org.wso2.carbon.bam.SummaryTimesE();
                                return wrappedElement;
                         }
                    
                         private org.wso2.carbon.bam.SummaryTimesE wrapgetLatestMonthlyBandwidthSummaryPeriodId(){
                                org.wso2.carbon.bam.SummaryTimesE wrappedElement = new org.wso2.carbon.bam.SummaryTimesE();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.bam.BandwidthUsageValuesE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.bam.BandwidthUsageValuesE.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.bam.BandwidthUsageValuesE wrapgetRegistryBandwidthUsageForMonthlySummary(){
                                org.wso2.carbon.bam.BandwidthUsageValuesE wrappedElement = new org.wso2.carbon.bam.BandwidthUsageValuesE();
                                return wrappedElement;
                         }
                    
                         private org.wso2.carbon.bam.SummaryTimesE wrapgetLatestHourlyBandwidthSummaryPeriodId(){
                                org.wso2.carbon.bam.SummaryTimesE wrappedElement = new org.wso2.carbon.bam.SummaryTimesE();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.bam.BandwidthHourlyStatValuesE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.bam.BandwidthHourlyStatValuesE.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.bam.BandwidthHourlyStatValuesE wrapgetDataForHourlySummary(){
                                org.wso2.carbon.bam.BandwidthHourlyStatValuesE wrappedElement = new org.wso2.carbon.bam.BandwidthHourlyStatValuesE();
                                return wrappedElement;
                         }
                    
                         private org.wso2.carbon.bam.SummaryTimesE wrapgetLatestMonthlyRegistryBandwidthSummaryPeriodId(){
                                org.wso2.carbon.bam.SummaryTimesE wrappedElement = new org.wso2.carbon.bam.SummaryTimesE();
                                return wrappedElement;
                         }
                    
                         private org.wso2.carbon.bam.BandwidthStatValuesE wrapgetDataForQuarterlySummary(){
                                org.wso2.carbon.bam.BandwidthStatValuesE wrappedElement = new org.wso2.carbon.bam.BandwidthStatValuesE();
                                return wrappedElement;
                         }
                    
                         private org.wso2.carbon.bam.SummaryTimesE wrapgetLatestDailyRegistryBandwidthSummaryPeriodId(){
                                org.wso2.carbon.bam.SummaryTimesE wrappedElement = new org.wso2.carbon.bam.SummaryTimesE();
                                return wrappedElement;
                         }
                    
                         private org.wso2.carbon.bam.BandwidthStatValuesE wrapgetDataForDailySummary(){
                                org.wso2.carbon.bam.BandwidthStatValuesE wrappedElement = new org.wso2.carbon.bam.BandwidthStatValuesE();
                                return wrappedElement;
                         }
                    
                         private org.wso2.carbon.bam.SummaryTimesE wrapgetLatestYearlyBandwidthSummaryPeriodId(){
                                org.wso2.carbon.bam.SummaryTimesE wrappedElement = new org.wso2.carbon.bam.SummaryTimesE();
                                return wrappedElement;
                         }
                    
                         private org.wso2.carbon.bam.SummaryTimesE wrapgetLatestQuarterlyBandwidthSummaryPeriodId(){
                                org.wso2.carbon.bam.SummaryTimesE wrappedElement = new org.wso2.carbon.bam.SummaryTimesE();
                                return wrappedElement;
                         }
                    
                         private org.wso2.carbon.bam.SummaryTimesE wrapgetLatestDailyBandwidthSummaryPeriodId(){
                                org.wso2.carbon.bam.SummaryTimesE wrappedElement = new org.wso2.carbon.bam.SummaryTimesE();
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
        
                if (org.wso2.ws.dataservice.AddBandwidthStatDailySummary.class.equals(type)){
                
                           return org.wso2.ws.dataservice.AddBandwidthStatDailySummary.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetDataForYearlySummary.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetDataForYearlySummary.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.BandwidthStatValuesE.class.equals(type)){
                
                           return org.wso2.carbon.bam.BandwidthStatValuesE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetRegistryHistoryBandwidthUsage.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetRegistryHistoryBandwidthUsage.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.BandwidthUsagesE.class.equals(type)){
                
                           return org.wso2.carbon.bam.BandwidthUsagesE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.AddBandwidthStatHourlySummary.class.equals(type)){
                
                           return org.wso2.ws.dataservice.AddBandwidthStatHourlySummary.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetRegistryBandwidthUsage.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetRegistryBandwidthUsage.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.BandwidthUsagesE.class.equals(type)){
                
                           return org.wso2.carbon.bam.BandwidthUsagesE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetDataForMonthlySummary.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetDataForMonthlySummary.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.BandwidthStatValuesE.class.equals(type)){
                
                           return org.wso2.carbon.bam.BandwidthStatValuesE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.AddBandwidthStatYearlySummary.class.equals(type)){
                
                           return org.wso2.ws.dataservice.AddBandwidthStatYearlySummary.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetMinimumPeriodId.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetMinimumPeriodId.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.SummaryTimesE.class.equals(type)){
                
                           return org.wso2.carbon.bam.SummaryTimesE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.AddBandwidthStatMonthlySummary.class.equals(type)){
                
                           return org.wso2.ws.dataservice.AddBandwidthStatMonthlySummary.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.AddRegistryBandwidthUsageDailySummary.class.equals(type)){
                
                           return org.wso2.ws.dataservice.AddRegistryBandwidthUsageDailySummary.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetLatestMonthlyBandwidthSummaryPeriodId.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetLatestMonthlyBandwidthSummaryPeriodId.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.SummaryTimesE.class.equals(type)){
                
                           return org.wso2.carbon.bam.SummaryTimesE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DeleteServerUserData.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DeleteServerUserData.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.AddRegistryBandwidthUsageMonthlySummary.class.equals(type)){
                
                           return org.wso2.ws.dataservice.AddRegistryBandwidthUsageMonthlySummary.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.AddBandwidthStatQuarterlySummary.class.equals(type)){
                
                           return org.wso2.ws.dataservice.AddBandwidthStatQuarterlySummary.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetRegistryBandwidthUsageForMonthlySummary.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetRegistryBandwidthUsageForMonthlySummary.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.BandwidthUsageValuesE.class.equals(type)){
                
                           return org.wso2.carbon.bam.BandwidthUsageValuesE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetLatestHourlyBandwidthSummaryPeriodId.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetLatestHourlyBandwidthSummaryPeriodId.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.SummaryTimesE.class.equals(type)){
                
                           return org.wso2.carbon.bam.SummaryTimesE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetDataForHourlySummary.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetDataForHourlySummary.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.BandwidthHourlyStatValuesE.class.equals(type)){
                
                           return org.wso2.carbon.bam.BandwidthHourlyStatValuesE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetLatestMonthlyRegistryBandwidthSummaryPeriodId.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetLatestMonthlyRegistryBandwidthSummaryPeriodId.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.SummaryTimesE.class.equals(type)){
                
                           return org.wso2.carbon.bam.SummaryTimesE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetDataForQuarterlySummary.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetDataForQuarterlySummary.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.BandwidthStatValuesE.class.equals(type)){
                
                           return org.wso2.carbon.bam.BandwidthStatValuesE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetLatestDailyRegistryBandwidthSummaryPeriodId.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetLatestDailyRegistryBandwidthSummaryPeriodId.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.SummaryTimesE.class.equals(type)){
                
                           return org.wso2.carbon.bam.SummaryTimesE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetDataForDailySummary.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetDataForDailySummary.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.BandwidthStatValuesE.class.equals(type)){
                
                           return org.wso2.carbon.bam.BandwidthStatValuesE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetLatestYearlyBandwidthSummaryPeriodId.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetLatestYearlyBandwidthSummaryPeriodId.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.SummaryTimesE.class.equals(type)){
                
                           return org.wso2.carbon.bam.SummaryTimesE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetLatestQuarterlyBandwidthSummaryPeriodId.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetLatestQuarterlyBandwidthSummaryPeriodId.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.SummaryTimesE.class.equals(type)){
                
                           return org.wso2.carbon.bam.SummaryTimesE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetLatestDailyBandwidthSummaryPeriodId.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetLatestDailyBandwidthSummaryPeriodId.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.SummaryTimesE.class.equals(type)){
                
                           return org.wso2.carbon.bam.SummaryTimesE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

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
    
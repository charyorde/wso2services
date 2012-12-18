

/**
 * MeteringSummaryGenerationDSMessageReceiverRobustInOnly.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */
        package org.wso2.ws.dataservice;

        /**
        *  MeteringSummaryGenerationDSMessageReceiverRobustInOnly message receiver
        */

        public class MeteringSummaryGenerationDSMessageReceiverRobustInOnly extends org.apache.axis2.receivers.AbstractMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext)
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
     
        
            if("addBandwidthStatDailySummary".equals(methodName)){
            
            
                            //doc style
                            org.wso2.ws.dataservice.AddBandwidthStatDailySummary wrappedParam =
                                                         (org.wso2.ws.dataservice.AddBandwidthStatDailySummary)fromOM(
                                                        msgContext.getEnvelope().getBody().getFirstElement(),
                                                        org.wso2.ws.dataservice.AddBandwidthStatDailySummary.class,
                                                        getEnvelopeNamespaces(msgContext.getEnvelope()));
                                            
                                           
                                                     skel.addBandwidthStatDailySummary(wrappedParam) ;
                                                

                             envelope = getSOAPFactory(msgContext).getDefaultEnvelope();
                        } else 
            if("addBandwidthStatHourlySummary".equals(methodName)){
            
            
                            //doc style
                            org.wso2.ws.dataservice.AddBandwidthStatHourlySummary wrappedParam =
                                                         (org.wso2.ws.dataservice.AddBandwidthStatHourlySummary)fromOM(
                                                        msgContext.getEnvelope().getBody().getFirstElement(),
                                                        org.wso2.ws.dataservice.AddBandwidthStatHourlySummary.class,
                                                        getEnvelopeNamespaces(msgContext.getEnvelope()));
                                            
                                           
                                                     skel.addBandwidthStatHourlySummary(wrappedParam) ;
                                                

                             envelope = getSOAPFactory(msgContext).getDefaultEnvelope();
                        } else 
            if("addBandwidthStatYearlySummary".equals(methodName)){
            
            
                            //doc style
                            org.wso2.ws.dataservice.AddBandwidthStatYearlySummary wrappedParam =
                                                         (org.wso2.ws.dataservice.AddBandwidthStatYearlySummary)fromOM(
                                                        msgContext.getEnvelope().getBody().getFirstElement(),
                                                        org.wso2.ws.dataservice.AddBandwidthStatYearlySummary.class,
                                                        getEnvelopeNamespaces(msgContext.getEnvelope()));
                                            
                                           
                                                     skel.addBandwidthStatYearlySummary(wrappedParam) ;
                                                

                             envelope = getSOAPFactory(msgContext).getDefaultEnvelope();
                        } else 
            if("addBandwidthStatMonthlySummary".equals(methodName)){
            
            
                            //doc style
                            org.wso2.ws.dataservice.AddBandwidthStatMonthlySummary wrappedParam =
                                                         (org.wso2.ws.dataservice.AddBandwidthStatMonthlySummary)fromOM(
                                                        msgContext.getEnvelope().getBody().getFirstElement(),
                                                        org.wso2.ws.dataservice.AddBandwidthStatMonthlySummary.class,
                                                        getEnvelopeNamespaces(msgContext.getEnvelope()));
                                            
                                           
                                                     skel.addBandwidthStatMonthlySummary(wrappedParam) ;
                                                

                             envelope = getSOAPFactory(msgContext).getDefaultEnvelope();
                        } else 
            if("addRegistryBandwidthUsageDailySummary".equals(methodName)){
            
            
                            //doc style
                            org.wso2.ws.dataservice.AddRegistryBandwidthUsageDailySummary wrappedParam =
                                                         (org.wso2.ws.dataservice.AddRegistryBandwidthUsageDailySummary)fromOM(
                                                        msgContext.getEnvelope().getBody().getFirstElement(),
                                                        org.wso2.ws.dataservice.AddRegistryBandwidthUsageDailySummary.class,
                                                        getEnvelopeNamespaces(msgContext.getEnvelope()));
                                            
                                           
                                                     skel.addRegistryBandwidthUsageDailySummary(wrappedParam) ;
                                                

                             envelope = getSOAPFactory(msgContext).getDefaultEnvelope();
                        } else 
            if("deleteServerUserData".equals(methodName)){
            
            
                            //doc style
                            org.wso2.ws.dataservice.DeleteServerUserData wrappedParam =
                                                         (org.wso2.ws.dataservice.DeleteServerUserData)fromOM(
                                                        msgContext.getEnvelope().getBody().getFirstElement(),
                                                        org.wso2.ws.dataservice.DeleteServerUserData.class,
                                                        getEnvelopeNamespaces(msgContext.getEnvelope()));
                                            
                                           
                                                     skel.deleteServerUserData(wrappedParam) ;
                                                

                             envelope = getSOAPFactory(msgContext).getDefaultEnvelope();
                        } else 
            if("addRegistryBandwidthUsageMonthlySummary".equals(methodName)){
            
            
                            //doc style
                            org.wso2.ws.dataservice.AddRegistryBandwidthUsageMonthlySummary wrappedParam =
                                                         (org.wso2.ws.dataservice.AddRegistryBandwidthUsageMonthlySummary)fromOM(
                                                        msgContext.getEnvelope().getBody().getFirstElement(),
                                                        org.wso2.ws.dataservice.AddRegistryBandwidthUsageMonthlySummary.class,
                                                        getEnvelopeNamespaces(msgContext.getEnvelope()));
                                            
                                           
                                                     skel.addRegistryBandwidthUsageMonthlySummary(wrappedParam) ;
                                                

                             envelope = getSOAPFactory(msgContext).getDefaultEnvelope();
                        } else 
            if("addBandwidthStatQuarterlySummary".equals(methodName)){
            
            
                            //doc style
                            org.wso2.ws.dataservice.AddBandwidthStatQuarterlySummary wrappedParam =
                                                         (org.wso2.ws.dataservice.AddBandwidthStatQuarterlySummary)fromOM(
                                                        msgContext.getEnvelope().getBody().getFirstElement(),
                                                        org.wso2.ws.dataservice.AddBandwidthStatQuarterlySummary.class,
                                                        getEnvelopeNamespaces(msgContext.getEnvelope()));
                                            
                                           
                                                     skel.addBandwidthStatQuarterlySummary(wrappedParam) ;
                                                

                             envelope = getSOAPFactory(msgContext).getDefaultEnvelope();
                        
                } else {
                  throw new java.lang.RuntimeException("method not found");
                }
            

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
    

/**
 * StatisticsAdminMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */
        package org.wso2.carbon.statistics.services;

        /**
        *  StatisticsAdminMessageReceiverInOut message receiver
        */

        public class StatisticsAdminMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        StatisticsAdminSkeletonInterface skel = (StatisticsAdminSkeletonInterface)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){


        

            if("getMaxServiceResponseTime".equals(methodName)){
                
                axis2.apache.org.xsd.GetMaxServiceResponseTimeResponse getMaxServiceResponseTimeResponse44 = null;
	                        axis2.apache.org.xsd.GetMaxServiceResponseTime wrappedParam =
                                                             (axis2.apache.org.xsd.GetMaxServiceResponseTime)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    axis2.apache.org.xsd.GetMaxServiceResponseTime.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getMaxServiceResponseTimeResponse44 =
                                                   
                                                   
                                                         skel.getMaxServiceResponseTime(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getMaxServiceResponseTimeResponse44, false, new javax.xml.namespace.QName("http://services.statistics.carbon.wso2.org",
                                                    "getMaxServiceResponseTime"));
                                    } else 

            if("getServiceRequestCount".equals(methodName)){
                
                axis2.apache.org.xsd.GetServiceRequestCountResponse getServiceRequestCountResponse46 = null;
	                        axis2.apache.org.xsd.GetServiceRequestCount wrappedParam =
                                                             (axis2.apache.org.xsd.GetServiceRequestCount)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    axis2.apache.org.xsd.GetServiceRequestCount.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getServiceRequestCountResponse46 =
                                                   
                                                   
                                                         skel.getServiceRequestCount(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getServiceRequestCountResponse46, false, new javax.xml.namespace.QName("http://services.statistics.carbon.wso2.org",
                                                    "getServiceRequestCount"));
                                    } else 

            if("getSystemResponseCount".equals(methodName)){
                
                axis2.apache.org.xsd.GetSystemResponseCountResponse getSystemResponseCountResponse48 = null;
	                        axis2.apache.org.xsd.GetSystemResponseCount wrappedParam =
                                                             (axis2.apache.org.xsd.GetSystemResponseCount)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    axis2.apache.org.xsd.GetSystemResponseCount.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getSystemResponseCountResponse48 =
                                                   
                                                   
                                                         skel.getSystemResponseCount(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getSystemResponseCountResponse48, false, new javax.xml.namespace.QName("http://services.statistics.carbon.wso2.org",
                                                    "getSystemResponseCount"));
                                    } else 

            if("getOperationResponseCount".equals(methodName)){
                
                axis2.apache.org.xsd.GetOperationResponseCountResponse getOperationResponseCountResponse50 = null;
	                        axis2.apache.org.xsd.GetOperationResponseCount wrappedParam =
                                                             (axis2.apache.org.xsd.GetOperationResponseCount)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    axis2.apache.org.xsd.GetOperationResponseCount.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getOperationResponseCountResponse50 =
                                                   
                                                   
                                                         skel.getOperationResponseCount(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getOperationResponseCountResponse50, false, new javax.xml.namespace.QName("http://services.statistics.carbon.wso2.org",
                                                    "getOperationResponseCount"));
                                    } else 

            if("getAvgOperationResponseTime".equals(methodName)){
                
                axis2.apache.org.xsd.GetAvgOperationResponseTimeResponse getAvgOperationResponseTimeResponse52 = null;
	                        axis2.apache.org.xsd.GetAvgOperationResponseTime wrappedParam =
                                                             (axis2.apache.org.xsd.GetAvgOperationResponseTime)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    axis2.apache.org.xsd.GetAvgOperationResponseTime.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getAvgOperationResponseTimeResponse52 =
                                                   
                                                   
                                                         skel.getAvgOperationResponseTime(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getAvgOperationResponseTimeResponse52, false, new javax.xml.namespace.QName("http://services.statistics.carbon.wso2.org",
                                                    "getAvgOperationResponseTime"));
                                    } else 

            if("getOperationStatistics".equals(methodName)){
                
                axis2.apache.org.xsd.GetOperationStatisticsResponse getOperationStatisticsResponse54 = null;
	                        axis2.apache.org.xsd.GetOperationStatistics wrappedParam =
                                                             (axis2.apache.org.xsd.GetOperationStatistics)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    axis2.apache.org.xsd.GetOperationStatistics.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getOperationStatisticsResponse54 =
                                                   
                                                   
                                                         skel.getOperationStatistics(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getOperationStatisticsResponse54, false, new javax.xml.namespace.QName("http://services.statistics.carbon.wso2.org",
                                                    "getOperationStatistics"));
                                    } else 

            if("getMinSystemResponseTime".equals(methodName)){
                
                axis2.apache.org.xsd.GetMinSystemResponseTimeResponse getMinSystemResponseTimeResponse56 = null;
	                        axis2.apache.org.xsd.GetMinSystemResponseTime wrappedParam =
                                                             (axis2.apache.org.xsd.GetMinSystemResponseTime)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    axis2.apache.org.xsd.GetMinSystemResponseTime.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getMinSystemResponseTimeResponse56 =
                                                   
                                                   
                                                         skel.getMinSystemResponseTime(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getMinSystemResponseTimeResponse56, false, new javax.xml.namespace.QName("http://services.statistics.carbon.wso2.org",
                                                    "getMinSystemResponseTime"));
                                    } else 

            if("getSystemFaultCount".equals(methodName)){
                
                axis2.apache.org.xsd.GetSystemFaultCountResponse getSystemFaultCountResponse58 = null;
	                        axis2.apache.org.xsd.GetSystemFaultCount wrappedParam =
                                                             (axis2.apache.org.xsd.GetSystemFaultCount)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    axis2.apache.org.xsd.GetSystemFaultCount.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getSystemFaultCountResponse58 =
                                                   
                                                   
                                                         skel.getSystemFaultCount(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getSystemFaultCountResponse58, false, new javax.xml.namespace.QName("http://services.statistics.carbon.wso2.org",
                                                    "getSystemFaultCount"));
                                    } else 

            if("getMaxSystemResponseTime".equals(methodName)){
                
                axis2.apache.org.xsd.GetMaxSystemResponseTimeResponse getMaxSystemResponseTimeResponse60 = null;
	                        axis2.apache.org.xsd.GetMaxSystemResponseTime wrappedParam =
                                                             (axis2.apache.org.xsd.GetMaxSystemResponseTime)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    axis2.apache.org.xsd.GetMaxSystemResponseTime.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getMaxSystemResponseTimeResponse60 =
                                                   
                                                   
                                                         skel.getMaxSystemResponseTime(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getMaxSystemResponseTimeResponse60, false, new javax.xml.namespace.QName("http://services.statistics.carbon.wso2.org",
                                                    "getMaxSystemResponseTime"));
                                    } else 

            if("getServiceFaultCount".equals(methodName)){
                
                axis2.apache.org.xsd.GetServiceFaultCountResponse getServiceFaultCountResponse62 = null;
	                        axis2.apache.org.xsd.GetServiceFaultCount wrappedParam =
                                                             (axis2.apache.org.xsd.GetServiceFaultCount)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    axis2.apache.org.xsd.GetServiceFaultCount.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getServiceFaultCountResponse62 =
                                                   
                                                   
                                                         skel.getServiceFaultCount(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getServiceFaultCountResponse62, false, new javax.xml.namespace.QName("http://services.statistics.carbon.wso2.org",
                                                    "getServiceFaultCount"));
                                    } else 

            if("getMinServiceResponseTime".equals(methodName)){
                
                axis2.apache.org.xsd.GetMinServiceResponseTimeResponse getMinServiceResponseTimeResponse64 = null;
	                        axis2.apache.org.xsd.GetMinServiceResponseTime wrappedParam =
                                                             (axis2.apache.org.xsd.GetMinServiceResponseTime)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    axis2.apache.org.xsd.GetMinServiceResponseTime.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getMinServiceResponseTimeResponse64 =
                                                   
                                                   
                                                         skel.getMinServiceResponseTime(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getMinServiceResponseTimeResponse64, false, new javax.xml.namespace.QName("http://services.statistics.carbon.wso2.org",
                                                    "getMinServiceResponseTime"));
                                    } else 

            if("getMaxOperationResponseTime".equals(methodName)){
                
                axis2.apache.org.xsd.GetMaxOperationResponseTimeResponse getMaxOperationResponseTimeResponse66 = null;
	                        axis2.apache.org.xsd.GetMaxOperationResponseTime wrappedParam =
                                                             (axis2.apache.org.xsd.GetMaxOperationResponseTime)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    axis2.apache.org.xsd.GetMaxOperationResponseTime.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getMaxOperationResponseTimeResponse66 =
                                                   
                                                   
                                                         skel.getMaxOperationResponseTime(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getMaxOperationResponseTimeResponse66, false, new javax.xml.namespace.QName("http://services.statistics.carbon.wso2.org",
                                                    "getMaxOperationResponseTime"));
                                    } else 

            if("getServiceStatistics".equals(methodName)){
                
                axis2.apache.org.xsd.GetServiceStatisticsResponse getServiceStatisticsResponse68 = null;
	                        axis2.apache.org.xsd.GetServiceStatistics wrappedParam =
                                                             (axis2.apache.org.xsd.GetServiceStatistics)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    axis2.apache.org.xsd.GetServiceStatistics.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getServiceStatisticsResponse68 =
                                                   
                                                   
                                                         skel.getServiceStatistics(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getServiceStatisticsResponse68, false, new javax.xml.namespace.QName("http://services.statistics.carbon.wso2.org",
                                                    "getServiceStatistics"));
                                    } else 

            if("getOperationFaultCount".equals(methodName)){
                
                axis2.apache.org.xsd.GetOperationFaultCountResponse getOperationFaultCountResponse70 = null;
	                        axis2.apache.org.xsd.GetOperationFaultCount wrappedParam =
                                                             (axis2.apache.org.xsd.GetOperationFaultCount)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    axis2.apache.org.xsd.GetOperationFaultCount.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getOperationFaultCountResponse70 =
                                                   
                                                   
                                                         skel.getOperationFaultCount(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getOperationFaultCountResponse70, false, new javax.xml.namespace.QName("http://services.statistics.carbon.wso2.org",
                                                    "getOperationFaultCount"));
                                    } else 

            if("getAvgServiceResponseTime".equals(methodName)){
                
                axis2.apache.org.xsd.GetAvgServiceResponseTimeResponse getAvgServiceResponseTimeResponse72 = null;
	                        axis2.apache.org.xsd.GetAvgServiceResponseTime wrappedParam =
                                                             (axis2.apache.org.xsd.GetAvgServiceResponseTime)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    axis2.apache.org.xsd.GetAvgServiceResponseTime.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getAvgServiceResponseTimeResponse72 =
                                                   
                                                   
                                                         skel.getAvgServiceResponseTime(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getAvgServiceResponseTimeResponse72, false, new javax.xml.namespace.QName("http://services.statistics.carbon.wso2.org",
                                                    "getAvgServiceResponseTime"));
                                    } else 

            if("getServiceResponseCount".equals(methodName)){
                
                axis2.apache.org.xsd.GetServiceResponseCountResponse getServiceResponseCountResponse74 = null;
	                        axis2.apache.org.xsd.GetServiceResponseCount wrappedParam =
                                                             (axis2.apache.org.xsd.GetServiceResponseCount)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    axis2.apache.org.xsd.GetServiceResponseCount.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getServiceResponseCountResponse74 =
                                                   
                                                   
                                                         skel.getServiceResponseCount(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getServiceResponseCountResponse74, false, new javax.xml.namespace.QName("http://services.statistics.carbon.wso2.org",
                                                    "getServiceResponseCount"));
                                    } else 

            if("getSystemRequestCount".equals(methodName)){
                
                axis2.apache.org.xsd.GetSystemRequestCountResponse getSystemRequestCountResponse76 = null;
	                        axis2.apache.org.xsd.GetSystemRequestCount wrappedParam =
                                                             (axis2.apache.org.xsd.GetSystemRequestCount)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    axis2.apache.org.xsd.GetSystemRequestCount.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getSystemRequestCountResponse76 =
                                                   
                                                   
                                                         skel.getSystemRequestCount(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getSystemRequestCountResponse76, false, new javax.xml.namespace.QName("http://services.statistics.carbon.wso2.org",
                                                    "getSystemRequestCount"));
                                    } else 

            if("getMinOperationResponseTime".equals(methodName)){
                
                axis2.apache.org.xsd.GetMinOperationResponseTimeResponse getMinOperationResponseTimeResponse78 = null;
	                        axis2.apache.org.xsd.GetMinOperationResponseTime wrappedParam =
                                                             (axis2.apache.org.xsd.GetMinOperationResponseTime)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    axis2.apache.org.xsd.GetMinOperationResponseTime.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getMinOperationResponseTimeResponse78 =
                                                   
                                                   
                                                         skel.getMinOperationResponseTime(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getMinOperationResponseTimeResponse78, false, new javax.xml.namespace.QName("http://services.statistics.carbon.wso2.org",
                                                    "getMinOperationResponseTime"));
                                    } else 

            if("getAvgSystemResponseTime".equals(methodName)){
                
                axis2.apache.org.xsd.GetAvgSystemResponseTimeResponse getAvgSystemResponseTimeResponse80 = null;
	                        axis2.apache.org.xsd.GetAvgSystemResponseTime wrappedParam =
                                                             (axis2.apache.org.xsd.GetAvgSystemResponseTime)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    axis2.apache.org.xsd.GetAvgSystemResponseTime.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getAvgSystemResponseTimeResponse80 =
                                                   
                                                   
                                                         skel.getAvgSystemResponseTime(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getAvgSystemResponseTimeResponse80, false, new javax.xml.namespace.QName("http://services.statistics.carbon.wso2.org",
                                                    "getAvgSystemResponseTime"));
                                    } else 

            if("getSystemStatistics".equals(methodName)){
                
                axis2.apache.org.xsd.GetSystemStatisticsResponse getSystemStatisticsResponse82 = null;
	                        axis2.apache.org.xsd.GetSystemStatistics wrappedParam =
                                                             (axis2.apache.org.xsd.GetSystemStatistics)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    axis2.apache.org.xsd.GetSystemStatistics.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getSystemStatisticsResponse82 =
                                                   
                                                   
                                                         skel.getSystemStatistics(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getSystemStatisticsResponse82, false, new javax.xml.namespace.QName("http://services.statistics.carbon.wso2.org",
                                                    "getSystemStatistics"));
                                    } else 

            if("getOperationRequestCount".equals(methodName)){
                
                axis2.apache.org.xsd.GetOperationRequestCountResponse getOperationRequestCountResponse84 = null;
	                        axis2.apache.org.xsd.GetOperationRequestCount wrappedParam =
                                                             (axis2.apache.org.xsd.GetOperationRequestCount)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    axis2.apache.org.xsd.GetOperationRequestCount.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getOperationRequestCountResponse84 =
                                                   
                                                   
                                                         skel.getOperationRequestCount(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getOperationRequestCountResponse84, false, new javax.xml.namespace.QName("http://services.statistics.carbon.wso2.org",
                                                    "getOperationRequestCount"));
                                    
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
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.GetMaxServiceResponseTime param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.GetMaxServiceResponseTime.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.GetMaxServiceResponseTimeResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.GetMaxServiceResponseTimeResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.GetServiceRequestCount param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.GetServiceRequestCount.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.GetServiceRequestCountResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.GetServiceRequestCountResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.GetSystemResponseCount param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.GetSystemResponseCount.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.GetSystemResponseCountResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.GetSystemResponseCountResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.GetOperationResponseCount param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.GetOperationResponseCount.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.GetOperationResponseCountResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.GetOperationResponseCountResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.GetAvgOperationResponseTime param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.GetAvgOperationResponseTime.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.GetAvgOperationResponseTimeResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.GetAvgOperationResponseTimeResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.GetOperationStatistics param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.GetOperationStatistics.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.GetOperationStatisticsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.GetOperationStatisticsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.GetMinSystemResponseTime param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.GetMinSystemResponseTime.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.GetMinSystemResponseTimeResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.GetMinSystemResponseTimeResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.GetSystemFaultCount param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.GetSystemFaultCount.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.GetSystemFaultCountResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.GetSystemFaultCountResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.GetMaxSystemResponseTime param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.GetMaxSystemResponseTime.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.GetMaxSystemResponseTimeResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.GetMaxSystemResponseTimeResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.GetServiceFaultCount param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.GetServiceFaultCount.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.GetServiceFaultCountResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.GetServiceFaultCountResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.GetMinServiceResponseTime param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.GetMinServiceResponseTime.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.GetMinServiceResponseTimeResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.GetMinServiceResponseTimeResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.GetMaxOperationResponseTime param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.GetMaxOperationResponseTime.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.GetMaxOperationResponseTimeResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.GetMaxOperationResponseTimeResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.GetServiceStatistics param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.GetServiceStatistics.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.GetServiceStatisticsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.GetServiceStatisticsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.GetOperationFaultCount param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.GetOperationFaultCount.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.GetOperationFaultCountResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.GetOperationFaultCountResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.GetAvgServiceResponseTime param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.GetAvgServiceResponseTime.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.GetAvgServiceResponseTimeResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.GetAvgServiceResponseTimeResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.GetServiceResponseCount param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.GetServiceResponseCount.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.GetServiceResponseCountResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.GetServiceResponseCountResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.GetSystemRequestCount param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.GetSystemRequestCount.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.GetSystemRequestCountResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.GetSystemRequestCountResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.SetConfigurationContext param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.SetConfigurationContext.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.GetMinOperationResponseTime param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.GetMinOperationResponseTime.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.GetMinOperationResponseTimeResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.GetMinOperationResponseTimeResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.GetAvgSystemResponseTime param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.GetAvgSystemResponseTime.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.GetAvgSystemResponseTimeResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.GetAvgSystemResponseTimeResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.GetSystemStatistics param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.GetSystemStatistics.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.GetSystemStatisticsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.GetSystemStatisticsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.GetOperationRequestCount param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.GetOperationRequestCount.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.GetOperationRequestCountResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.GetOperationRequestCountResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, axis2.apache.org.xsd.GetMaxServiceResponseTimeResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(axis2.apache.org.xsd.GetMaxServiceResponseTimeResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private axis2.apache.org.xsd.GetMaxServiceResponseTimeResponse wrapgetMaxServiceResponseTime(){
                                axis2.apache.org.xsd.GetMaxServiceResponseTimeResponse wrappedElement = new axis2.apache.org.xsd.GetMaxServiceResponseTimeResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, axis2.apache.org.xsd.GetServiceRequestCountResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(axis2.apache.org.xsd.GetServiceRequestCountResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private axis2.apache.org.xsd.GetServiceRequestCountResponse wrapgetServiceRequestCount(){
                                axis2.apache.org.xsd.GetServiceRequestCountResponse wrappedElement = new axis2.apache.org.xsd.GetServiceRequestCountResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, axis2.apache.org.xsd.GetSystemResponseCountResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(axis2.apache.org.xsd.GetSystemResponseCountResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private axis2.apache.org.xsd.GetSystemResponseCountResponse wrapgetSystemResponseCount(){
                                axis2.apache.org.xsd.GetSystemResponseCountResponse wrappedElement = new axis2.apache.org.xsd.GetSystemResponseCountResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, axis2.apache.org.xsd.GetOperationResponseCountResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(axis2.apache.org.xsd.GetOperationResponseCountResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private axis2.apache.org.xsd.GetOperationResponseCountResponse wrapgetOperationResponseCount(){
                                axis2.apache.org.xsd.GetOperationResponseCountResponse wrappedElement = new axis2.apache.org.xsd.GetOperationResponseCountResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, axis2.apache.org.xsd.GetAvgOperationResponseTimeResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(axis2.apache.org.xsd.GetAvgOperationResponseTimeResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private axis2.apache.org.xsd.GetAvgOperationResponseTimeResponse wrapgetAvgOperationResponseTime(){
                                axis2.apache.org.xsd.GetAvgOperationResponseTimeResponse wrappedElement = new axis2.apache.org.xsd.GetAvgOperationResponseTimeResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, axis2.apache.org.xsd.GetOperationStatisticsResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(axis2.apache.org.xsd.GetOperationStatisticsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private axis2.apache.org.xsd.GetOperationStatisticsResponse wrapgetOperationStatistics(){
                                axis2.apache.org.xsd.GetOperationStatisticsResponse wrappedElement = new axis2.apache.org.xsd.GetOperationStatisticsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, axis2.apache.org.xsd.GetMinSystemResponseTimeResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(axis2.apache.org.xsd.GetMinSystemResponseTimeResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private axis2.apache.org.xsd.GetMinSystemResponseTimeResponse wrapgetMinSystemResponseTime(){
                                axis2.apache.org.xsd.GetMinSystemResponseTimeResponse wrappedElement = new axis2.apache.org.xsd.GetMinSystemResponseTimeResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, axis2.apache.org.xsd.GetSystemFaultCountResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(axis2.apache.org.xsd.GetSystemFaultCountResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private axis2.apache.org.xsd.GetSystemFaultCountResponse wrapgetSystemFaultCount(){
                                axis2.apache.org.xsd.GetSystemFaultCountResponse wrappedElement = new axis2.apache.org.xsd.GetSystemFaultCountResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, axis2.apache.org.xsd.GetMaxSystemResponseTimeResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(axis2.apache.org.xsd.GetMaxSystemResponseTimeResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private axis2.apache.org.xsd.GetMaxSystemResponseTimeResponse wrapgetMaxSystemResponseTime(){
                                axis2.apache.org.xsd.GetMaxSystemResponseTimeResponse wrappedElement = new axis2.apache.org.xsd.GetMaxSystemResponseTimeResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, axis2.apache.org.xsd.GetServiceFaultCountResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(axis2.apache.org.xsd.GetServiceFaultCountResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private axis2.apache.org.xsd.GetServiceFaultCountResponse wrapgetServiceFaultCount(){
                                axis2.apache.org.xsd.GetServiceFaultCountResponse wrappedElement = new axis2.apache.org.xsd.GetServiceFaultCountResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, axis2.apache.org.xsd.GetMinServiceResponseTimeResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(axis2.apache.org.xsd.GetMinServiceResponseTimeResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private axis2.apache.org.xsd.GetMinServiceResponseTimeResponse wrapgetMinServiceResponseTime(){
                                axis2.apache.org.xsd.GetMinServiceResponseTimeResponse wrappedElement = new axis2.apache.org.xsd.GetMinServiceResponseTimeResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, axis2.apache.org.xsd.GetMaxOperationResponseTimeResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(axis2.apache.org.xsd.GetMaxOperationResponseTimeResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private axis2.apache.org.xsd.GetMaxOperationResponseTimeResponse wrapgetMaxOperationResponseTime(){
                                axis2.apache.org.xsd.GetMaxOperationResponseTimeResponse wrappedElement = new axis2.apache.org.xsd.GetMaxOperationResponseTimeResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, axis2.apache.org.xsd.GetServiceStatisticsResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(axis2.apache.org.xsd.GetServiceStatisticsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private axis2.apache.org.xsd.GetServiceStatisticsResponse wrapgetServiceStatistics(){
                                axis2.apache.org.xsd.GetServiceStatisticsResponse wrappedElement = new axis2.apache.org.xsd.GetServiceStatisticsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, axis2.apache.org.xsd.GetOperationFaultCountResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(axis2.apache.org.xsd.GetOperationFaultCountResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private axis2.apache.org.xsd.GetOperationFaultCountResponse wrapgetOperationFaultCount(){
                                axis2.apache.org.xsd.GetOperationFaultCountResponse wrappedElement = new axis2.apache.org.xsd.GetOperationFaultCountResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, axis2.apache.org.xsd.GetAvgServiceResponseTimeResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(axis2.apache.org.xsd.GetAvgServiceResponseTimeResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private axis2.apache.org.xsd.GetAvgServiceResponseTimeResponse wrapgetAvgServiceResponseTime(){
                                axis2.apache.org.xsd.GetAvgServiceResponseTimeResponse wrappedElement = new axis2.apache.org.xsd.GetAvgServiceResponseTimeResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, axis2.apache.org.xsd.GetServiceResponseCountResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(axis2.apache.org.xsd.GetServiceResponseCountResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private axis2.apache.org.xsd.GetServiceResponseCountResponse wrapgetServiceResponseCount(){
                                axis2.apache.org.xsd.GetServiceResponseCountResponse wrappedElement = new axis2.apache.org.xsd.GetServiceResponseCountResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, axis2.apache.org.xsd.GetSystemRequestCountResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(axis2.apache.org.xsd.GetSystemRequestCountResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private axis2.apache.org.xsd.GetSystemRequestCountResponse wrapgetSystemRequestCount(){
                                axis2.apache.org.xsd.GetSystemRequestCountResponse wrappedElement = new axis2.apache.org.xsd.GetSystemRequestCountResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, axis2.apache.org.xsd.GetMinOperationResponseTimeResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(axis2.apache.org.xsd.GetMinOperationResponseTimeResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private axis2.apache.org.xsd.GetMinOperationResponseTimeResponse wrapgetMinOperationResponseTime(){
                                axis2.apache.org.xsd.GetMinOperationResponseTimeResponse wrappedElement = new axis2.apache.org.xsd.GetMinOperationResponseTimeResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, axis2.apache.org.xsd.GetAvgSystemResponseTimeResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(axis2.apache.org.xsd.GetAvgSystemResponseTimeResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private axis2.apache.org.xsd.GetAvgSystemResponseTimeResponse wrapgetAvgSystemResponseTime(){
                                axis2.apache.org.xsd.GetAvgSystemResponseTimeResponse wrappedElement = new axis2.apache.org.xsd.GetAvgSystemResponseTimeResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, axis2.apache.org.xsd.GetSystemStatisticsResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(axis2.apache.org.xsd.GetSystemStatisticsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private axis2.apache.org.xsd.GetSystemStatisticsResponse wrapgetSystemStatistics(){
                                axis2.apache.org.xsd.GetSystemStatisticsResponse wrappedElement = new axis2.apache.org.xsd.GetSystemStatisticsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, axis2.apache.org.xsd.GetOperationRequestCountResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(axis2.apache.org.xsd.GetOperationRequestCountResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private axis2.apache.org.xsd.GetOperationRequestCountResponse wrapgetOperationRequestCount(){
                                axis2.apache.org.xsd.GetOperationRequestCountResponse wrappedElement = new axis2.apache.org.xsd.GetOperationRequestCountResponse();
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
        
                if (axis2.apache.org.xsd.GetMaxServiceResponseTime.class.equals(type)){
                
                           return axis2.apache.org.xsd.GetMaxServiceResponseTime.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.GetMaxServiceResponseTimeResponse.class.equals(type)){
                
                           return axis2.apache.org.xsd.GetMaxServiceResponseTimeResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.GetServiceRequestCount.class.equals(type)){
                
                           return axis2.apache.org.xsd.GetServiceRequestCount.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.GetServiceRequestCountResponse.class.equals(type)){
                
                           return axis2.apache.org.xsd.GetServiceRequestCountResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.GetSystemResponseCount.class.equals(type)){
                
                           return axis2.apache.org.xsd.GetSystemResponseCount.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.GetSystemResponseCountResponse.class.equals(type)){
                
                           return axis2.apache.org.xsd.GetSystemResponseCountResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.GetOperationResponseCount.class.equals(type)){
                
                           return axis2.apache.org.xsd.GetOperationResponseCount.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.GetOperationResponseCountResponse.class.equals(type)){
                
                           return axis2.apache.org.xsd.GetOperationResponseCountResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.GetAvgOperationResponseTime.class.equals(type)){
                
                           return axis2.apache.org.xsd.GetAvgOperationResponseTime.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.GetAvgOperationResponseTimeResponse.class.equals(type)){
                
                           return axis2.apache.org.xsd.GetAvgOperationResponseTimeResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.GetOperationStatistics.class.equals(type)){
                
                           return axis2.apache.org.xsd.GetOperationStatistics.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.GetOperationStatisticsResponse.class.equals(type)){
                
                           return axis2.apache.org.xsd.GetOperationStatisticsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.GetMinSystemResponseTime.class.equals(type)){
                
                           return axis2.apache.org.xsd.GetMinSystemResponseTime.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.GetMinSystemResponseTimeResponse.class.equals(type)){
                
                           return axis2.apache.org.xsd.GetMinSystemResponseTimeResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.GetSystemFaultCount.class.equals(type)){
                
                           return axis2.apache.org.xsd.GetSystemFaultCount.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.GetSystemFaultCountResponse.class.equals(type)){
                
                           return axis2.apache.org.xsd.GetSystemFaultCountResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.GetMaxSystemResponseTime.class.equals(type)){
                
                           return axis2.apache.org.xsd.GetMaxSystemResponseTime.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.GetMaxSystemResponseTimeResponse.class.equals(type)){
                
                           return axis2.apache.org.xsd.GetMaxSystemResponseTimeResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.GetServiceFaultCount.class.equals(type)){
                
                           return axis2.apache.org.xsd.GetServiceFaultCount.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.GetServiceFaultCountResponse.class.equals(type)){
                
                           return axis2.apache.org.xsd.GetServiceFaultCountResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.GetMinServiceResponseTime.class.equals(type)){
                
                           return axis2.apache.org.xsd.GetMinServiceResponseTime.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.GetMinServiceResponseTimeResponse.class.equals(type)){
                
                           return axis2.apache.org.xsd.GetMinServiceResponseTimeResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.GetMaxOperationResponseTime.class.equals(type)){
                
                           return axis2.apache.org.xsd.GetMaxOperationResponseTime.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.GetMaxOperationResponseTimeResponse.class.equals(type)){
                
                           return axis2.apache.org.xsd.GetMaxOperationResponseTimeResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.GetServiceStatistics.class.equals(type)){
                
                           return axis2.apache.org.xsd.GetServiceStatistics.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.GetServiceStatisticsResponse.class.equals(type)){
                
                           return axis2.apache.org.xsd.GetServiceStatisticsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.GetOperationFaultCount.class.equals(type)){
                
                           return axis2.apache.org.xsd.GetOperationFaultCount.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.GetOperationFaultCountResponse.class.equals(type)){
                
                           return axis2.apache.org.xsd.GetOperationFaultCountResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.GetAvgServiceResponseTime.class.equals(type)){
                
                           return axis2.apache.org.xsd.GetAvgServiceResponseTime.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.GetAvgServiceResponseTimeResponse.class.equals(type)){
                
                           return axis2.apache.org.xsd.GetAvgServiceResponseTimeResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.GetServiceResponseCount.class.equals(type)){
                
                           return axis2.apache.org.xsd.GetServiceResponseCount.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.GetServiceResponseCountResponse.class.equals(type)){
                
                           return axis2.apache.org.xsd.GetServiceResponseCountResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.GetSystemRequestCount.class.equals(type)){
                
                           return axis2.apache.org.xsd.GetSystemRequestCount.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.GetSystemRequestCountResponse.class.equals(type)){
                
                           return axis2.apache.org.xsd.GetSystemRequestCountResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.SetConfigurationContext.class.equals(type)){
                
                           return axis2.apache.org.xsd.SetConfigurationContext.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.GetMinOperationResponseTime.class.equals(type)){
                
                           return axis2.apache.org.xsd.GetMinOperationResponseTime.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.GetMinOperationResponseTimeResponse.class.equals(type)){
                
                           return axis2.apache.org.xsd.GetMinOperationResponseTimeResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.GetAvgSystemResponseTime.class.equals(type)){
                
                           return axis2.apache.org.xsd.GetAvgSystemResponseTime.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.GetAvgSystemResponseTimeResponse.class.equals(type)){
                
                           return axis2.apache.org.xsd.GetAvgSystemResponseTimeResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.GetSystemStatistics.class.equals(type)){
                
                           return axis2.apache.org.xsd.GetSystemStatistics.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.GetSystemStatisticsResponse.class.equals(type)){
                
                           return axis2.apache.org.xsd.GetSystemStatisticsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.GetOperationRequestCount.class.equals(type)){
                
                           return axis2.apache.org.xsd.GetOperationRequestCount.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.GetOperationRequestCountResponse.class.equals(type)){
                
                           return axis2.apache.org.xsd.GetOperationRequestCountResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

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
    
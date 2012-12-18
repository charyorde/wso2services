
/**
 * ProxyServiceAdminMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */
        package org.wso2.carbon.proxyadmin.service;

        /**
        *  ProxyServiceAdminMessageReceiverInOut message receiver
        */

        public class ProxyServiceAdminMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        ProxyServiceAdminSkeletonInterface skel = (ProxyServiceAdminSkeletonInterface)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){


        

            if("disableStatistics".equals(methodName)){
                
                synapse.apache.org.xsd.DisableStatisticsResponse disableStatisticsResponse35 = null;
	                        synapse.apache.org.xsd.DisableStatistics wrappedParam =
                                                             (synapse.apache.org.xsd.DisableStatistics)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    synapse.apache.org.xsd.DisableStatistics.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               disableStatisticsResponse35 =
                                                   
                                                   
                                                         skel.disableStatistics(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), disableStatisticsResponse35, false, new javax.xml.namespace.QName("http://service.proxyadmin.carbon.wso2.org",
                                                    "disableStatistics"));
                                    } else 

            if("getAvailableEndpoints".equals(methodName)){
                
                synapse.apache.org.xsd.GetAvailableEndpointsResponse getAvailableEndpointsResponse37 = null;
	                        synapse.apache.org.xsd.GetAvailableEndpoints wrappedParam =
                                                             (synapse.apache.org.xsd.GetAvailableEndpoints)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    synapse.apache.org.xsd.GetAvailableEndpoints.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getAvailableEndpointsResponse37 =
                                                   
                                                   
                                                         skel.getAvailableEndpoints(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getAvailableEndpointsResponse37, false, new javax.xml.namespace.QName("http://service.proxyadmin.carbon.wso2.org",
                                                    "getAvailableEndpoints"));
                                    } else 

            if("redeployProxyService".equals(methodName)){
                
                synapse.apache.org.xsd.RedeployProxyServiceResponse redeployProxyServiceResponse39 = null;
	                        synapse.apache.org.xsd.RedeployProxyService wrappedParam =
                                                             (synapse.apache.org.xsd.RedeployProxyService)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    synapse.apache.org.xsd.RedeployProxyService.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               redeployProxyServiceResponse39 =
                                                   
                                                   
                                                         skel.redeployProxyService(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), redeployProxyServiceResponse39, false, new javax.xml.namespace.QName("http://service.proxyadmin.carbon.wso2.org",
                                                    "redeployProxyService"));
                                    } else 

            if("addProxy".equals(methodName)){
                
                synapse.apache.org.xsd.AddProxyResponse addProxyResponse41 = null;
	                        synapse.apache.org.xsd.AddProxy wrappedParam =
                                                             (synapse.apache.org.xsd.AddProxy)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    synapse.apache.org.xsd.AddProxy.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               addProxyResponse41 =
                                                   
                                                   
                                                         skel.addProxy(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), addProxyResponse41, false, new javax.xml.namespace.QName("http://service.proxyadmin.carbon.wso2.org",
                                                    "addProxy"));
                                    } else 

            if("modifyProxy".equals(methodName)){
                
                synapse.apache.org.xsd.ModifyProxyResponse modifyProxyResponse43 = null;
	                        synapse.apache.org.xsd.ModifyProxy wrappedParam =
                                                             (synapse.apache.org.xsd.ModifyProxy)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    synapse.apache.org.xsd.ModifyProxy.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               modifyProxyResponse43 =
                                                   
                                                   
                                                         skel.modifyProxy(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), modifyProxyResponse43, false, new javax.xml.namespace.QName("http://service.proxyadmin.carbon.wso2.org",
                                                    "modifyProxy"));
                                    } else 

            if("disableTracing".equals(methodName)){
                
                synapse.apache.org.xsd.DisableTracingResponse disableTracingResponse45 = null;
	                        synapse.apache.org.xsd.DisableTracing wrappedParam =
                                                             (synapse.apache.org.xsd.DisableTracing)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    synapse.apache.org.xsd.DisableTracing.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               disableTracingResponse45 =
                                                   
                                                   
                                                         skel.disableTracing(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), disableTracingResponse45, false, new javax.xml.namespace.QName("http://service.proxyadmin.carbon.wso2.org",
                                                    "disableTracing"));
                                    } else 

            if("getProxy".equals(methodName)){
                
                synapse.apache.org.xsd.GetProxyResponse getProxyResponse47 = null;
	                        synapse.apache.org.xsd.GetProxy wrappedParam =
                                                             (synapse.apache.org.xsd.GetProxy)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    synapse.apache.org.xsd.GetProxy.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getProxyResponse47 =
                                                   
                                                   
                                                         skel.getProxy(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getProxyResponse47, false, new javax.xml.namespace.QName("http://service.proxyadmin.carbon.wso2.org",
                                                    "getProxy"));
                                    } else 

            if("getAvailableTransports".equals(methodName)){
                
                synapse.apache.org.xsd.GetAvailableTransportsResponse getAvailableTransportsResponse49 = null;
	                        synapse.apache.org.xsd.GetAvailableTransports wrappedParam =
                                                             (synapse.apache.org.xsd.GetAvailableTransports)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    synapse.apache.org.xsd.GetAvailableTransports.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getAvailableTransportsResponse49 =
                                                   
                                                   
                                                         skel.getAvailableTransports(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getAvailableTransportsResponse49, false, new javax.xml.namespace.QName("http://service.proxyadmin.carbon.wso2.org",
                                                    "getAvailableTransports"));
                                    } else 

            if("getEndpoint".equals(methodName)){
                
                synapse.apache.org.xsd.GetEndpointResponse getEndpointResponse51 = null;
	                        synapse.apache.org.xsd.GetEndpoint wrappedParam =
                                                             (synapse.apache.org.xsd.GetEndpoint)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    synapse.apache.org.xsd.GetEndpoint.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getEndpointResponse51 =
                                                   
                                                   
                                                         skel.getEndpoint(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getEndpointResponse51, false, new javax.xml.namespace.QName("http://service.proxyadmin.carbon.wso2.org",
                                                    "getEndpoint"));
                                    } else 

            if("startProxyService".equals(methodName)){
                
                synapse.apache.org.xsd.StartProxyServiceResponse startProxyServiceResponse53 = null;
	                        synapse.apache.org.xsd.StartProxyService wrappedParam =
                                                             (synapse.apache.org.xsd.StartProxyService)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    synapse.apache.org.xsd.StartProxyService.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               startProxyServiceResponse53 =
                                                   
                                                   
                                                         skel.startProxyService(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), startProxyServiceResponse53, false, new javax.xml.namespace.QName("http://service.proxyadmin.carbon.wso2.org",
                                                    "startProxyService"));
                                    } else 

            if("getMetaData".equals(methodName)){
                
                synapse.apache.org.xsd.GetMetaDataResponse getMetaDataResponse55 = null;
	                        synapse.apache.org.xsd.GetMetaData wrappedParam =
                                                             (synapse.apache.org.xsd.GetMetaData)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    synapse.apache.org.xsd.GetMetaData.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getMetaDataResponse55 =
                                                   
                                                   
                                                         skel.getMetaData(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getMetaDataResponse55, false, new javax.xml.namespace.QName("http://service.proxyadmin.carbon.wso2.org",
                                                    "getMetaData"));
                                    } else 

            if("enableTracing".equals(methodName)){
                
                synapse.apache.org.xsd.EnableTracingResponse enableTracingResponse57 = null;
	                        synapse.apache.org.xsd.EnableTracing wrappedParam =
                                                             (synapse.apache.org.xsd.EnableTracing)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    synapse.apache.org.xsd.EnableTracing.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               enableTracingResponse57 =
                                                   
                                                   
                                                         skel.enableTracing(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), enableTracingResponse57, false, new javax.xml.namespace.QName("http://service.proxyadmin.carbon.wso2.org",
                                                    "enableTracing"));
                                    } else 

            if("getSourceView".equals(methodName)){
                
                synapse.apache.org.xsd.GetSourceViewResponse getSourceViewResponse59 = null;
	                        synapse.apache.org.xsd.GetSourceView wrappedParam =
                                                             (synapse.apache.org.xsd.GetSourceView)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    synapse.apache.org.xsd.GetSourceView.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getSourceViewResponse59 =
                                                   
                                                   
                                                         skel.getSourceView(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getSourceViewResponse59, false, new javax.xml.namespace.QName("http://service.proxyadmin.carbon.wso2.org",
                                                    "getSourceView"));
                                    } else 

            if("stopProxyService".equals(methodName)){
                
                synapse.apache.org.xsd.StopProxyServiceResponse stopProxyServiceResponse61 = null;
	                        synapse.apache.org.xsd.StopProxyService wrappedParam =
                                                             (synapse.apache.org.xsd.StopProxyService)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    synapse.apache.org.xsd.StopProxyService.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               stopProxyServiceResponse61 =
                                                   
                                                   
                                                         skel.stopProxyService(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), stopProxyServiceResponse61, false, new javax.xml.namespace.QName("http://service.proxyadmin.carbon.wso2.org",
                                                    "stopProxyService"));
                                    } else 

            if("enableStatistics".equals(methodName)){
                
                synapse.apache.org.xsd.EnableStatisticsResponse enableStatisticsResponse63 = null;
	                        synapse.apache.org.xsd.EnableStatistics wrappedParam =
                                                             (synapse.apache.org.xsd.EnableStatistics)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    synapse.apache.org.xsd.EnableStatistics.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               enableStatisticsResponse63 =
                                                   
                                                   
                                                         skel.enableStatistics(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), enableStatisticsResponse63, false, new javax.xml.namespace.QName("http://service.proxyadmin.carbon.wso2.org",
                                                    "enableStatistics"));
                                    } else 

            if("getAvailableSequences".equals(methodName)){
                
                synapse.apache.org.xsd.GetAvailableSequencesResponse getAvailableSequencesResponse65 = null;
	                        synapse.apache.org.xsd.GetAvailableSequences wrappedParam =
                                                             (synapse.apache.org.xsd.GetAvailableSequences)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    synapse.apache.org.xsd.GetAvailableSequences.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getAvailableSequencesResponse65 =
                                                   
                                                   
                                                         skel.getAvailableSequences(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getAvailableSequencesResponse65, false, new javax.xml.namespace.QName("http://service.proxyadmin.carbon.wso2.org",
                                                    "getAvailableSequences"));
                                    } else 

            if("deleteProxyService".equals(methodName)){
                
                synapse.apache.org.xsd.DeleteProxyServiceResponse deleteProxyServiceResponse67 = null;
	                        synapse.apache.org.xsd.DeleteProxyService wrappedParam =
                                                             (synapse.apache.org.xsd.DeleteProxyService)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    synapse.apache.org.xsd.DeleteProxyService.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               deleteProxyServiceResponse67 =
                                                   
                                                   
                                                         skel.deleteProxyService(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), deleteProxyServiceResponse67, false, new javax.xml.namespace.QName("http://service.proxyadmin.carbon.wso2.org",
                                                    "deleteProxyService"));
                                    
            } else {
              throw new java.lang.RuntimeException("method not found");
            }
        

        newMsgContext.setEnvelope(envelope);
        }
        } catch (ProxyServiceAdminProxyAdminException e) {

            msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME,"ProxyServiceAdminProxyAdminException");
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
            private  org.apache.axiom.om.OMElement  toOM(synapse.apache.org.xsd.DisableStatistics param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(synapse.apache.org.xsd.DisableStatistics.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(synapse.apache.org.xsd.DisableStatisticsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(synapse.apache.org.xsd.DisableStatisticsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(synapse.apache.org.xsd.ProxyServiceAdminProxyAdminException param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(synapse.apache.org.xsd.ProxyServiceAdminProxyAdminException.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(synapse.apache.org.xsd.GetAvailableEndpoints param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(synapse.apache.org.xsd.GetAvailableEndpoints.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(synapse.apache.org.xsd.GetAvailableEndpointsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(synapse.apache.org.xsd.GetAvailableEndpointsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(synapse.apache.org.xsd.RedeployProxyService param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(synapse.apache.org.xsd.RedeployProxyService.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(synapse.apache.org.xsd.RedeployProxyServiceResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(synapse.apache.org.xsd.RedeployProxyServiceResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(synapse.apache.org.xsd.AddProxy param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(synapse.apache.org.xsd.AddProxy.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(synapse.apache.org.xsd.AddProxyResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(synapse.apache.org.xsd.AddProxyResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(synapse.apache.org.xsd.ModifyProxy param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(synapse.apache.org.xsd.ModifyProxy.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(synapse.apache.org.xsd.ModifyProxyResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(synapse.apache.org.xsd.ModifyProxyResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(synapse.apache.org.xsd.DisableTracing param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(synapse.apache.org.xsd.DisableTracing.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(synapse.apache.org.xsd.DisableTracingResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(synapse.apache.org.xsd.DisableTracingResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(synapse.apache.org.xsd.GetProxy param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(synapse.apache.org.xsd.GetProxy.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(synapse.apache.org.xsd.GetProxyResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(synapse.apache.org.xsd.GetProxyResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(synapse.apache.org.xsd.GetAvailableTransports param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(synapse.apache.org.xsd.GetAvailableTransports.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(synapse.apache.org.xsd.GetAvailableTransportsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(synapse.apache.org.xsd.GetAvailableTransportsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(synapse.apache.org.xsd.GetEndpoint param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(synapse.apache.org.xsd.GetEndpoint.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(synapse.apache.org.xsd.GetEndpointResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(synapse.apache.org.xsd.GetEndpointResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(synapse.apache.org.xsd.StartProxyService param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(synapse.apache.org.xsd.StartProxyService.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(synapse.apache.org.xsd.StartProxyServiceResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(synapse.apache.org.xsd.StartProxyServiceResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(synapse.apache.org.xsd.GetMetaData param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(synapse.apache.org.xsd.GetMetaData.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(synapse.apache.org.xsd.GetMetaDataResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(synapse.apache.org.xsd.GetMetaDataResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(synapse.apache.org.xsd.EnableTracing param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(synapse.apache.org.xsd.EnableTracing.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(synapse.apache.org.xsd.EnableTracingResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(synapse.apache.org.xsd.EnableTracingResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(synapse.apache.org.xsd.GetSourceView param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(synapse.apache.org.xsd.GetSourceView.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(synapse.apache.org.xsd.GetSourceViewResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(synapse.apache.org.xsd.GetSourceViewResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(synapse.apache.org.xsd.StopProxyService param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(synapse.apache.org.xsd.StopProxyService.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(synapse.apache.org.xsd.StopProxyServiceResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(synapse.apache.org.xsd.StopProxyServiceResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(synapse.apache.org.xsd.EnableStatistics param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(synapse.apache.org.xsd.EnableStatistics.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(synapse.apache.org.xsd.EnableStatisticsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(synapse.apache.org.xsd.EnableStatisticsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(synapse.apache.org.xsd.GetAvailableSequences param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(synapse.apache.org.xsd.GetAvailableSequences.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(synapse.apache.org.xsd.GetAvailableSequencesResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(synapse.apache.org.xsd.GetAvailableSequencesResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(synapse.apache.org.xsd.DeleteProxyService param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(synapse.apache.org.xsd.DeleteProxyService.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(synapse.apache.org.xsd.DeleteProxyServiceResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(synapse.apache.org.xsd.DeleteProxyServiceResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, synapse.apache.org.xsd.DisableStatisticsResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(synapse.apache.org.xsd.DisableStatisticsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private synapse.apache.org.xsd.DisableStatisticsResponse wrapdisableStatistics(){
                                synapse.apache.org.xsd.DisableStatisticsResponse wrappedElement = new synapse.apache.org.xsd.DisableStatisticsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, synapse.apache.org.xsd.GetAvailableEndpointsResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(synapse.apache.org.xsd.GetAvailableEndpointsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private synapse.apache.org.xsd.GetAvailableEndpointsResponse wrapgetAvailableEndpoints(){
                                synapse.apache.org.xsd.GetAvailableEndpointsResponse wrappedElement = new synapse.apache.org.xsd.GetAvailableEndpointsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, synapse.apache.org.xsd.RedeployProxyServiceResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(synapse.apache.org.xsd.RedeployProxyServiceResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private synapse.apache.org.xsd.RedeployProxyServiceResponse wrapredeployProxyService(){
                                synapse.apache.org.xsd.RedeployProxyServiceResponse wrappedElement = new synapse.apache.org.xsd.RedeployProxyServiceResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, synapse.apache.org.xsd.AddProxyResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(synapse.apache.org.xsd.AddProxyResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private synapse.apache.org.xsd.AddProxyResponse wrapaddProxy(){
                                synapse.apache.org.xsd.AddProxyResponse wrappedElement = new synapse.apache.org.xsd.AddProxyResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, synapse.apache.org.xsd.ModifyProxyResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(synapse.apache.org.xsd.ModifyProxyResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private synapse.apache.org.xsd.ModifyProxyResponse wrapmodifyProxy(){
                                synapse.apache.org.xsd.ModifyProxyResponse wrappedElement = new synapse.apache.org.xsd.ModifyProxyResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, synapse.apache.org.xsd.DisableTracingResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(synapse.apache.org.xsd.DisableTracingResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private synapse.apache.org.xsd.DisableTracingResponse wrapdisableTracing(){
                                synapse.apache.org.xsd.DisableTracingResponse wrappedElement = new synapse.apache.org.xsd.DisableTracingResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, synapse.apache.org.xsd.GetProxyResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(synapse.apache.org.xsd.GetProxyResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private synapse.apache.org.xsd.GetProxyResponse wrapgetProxy(){
                                synapse.apache.org.xsd.GetProxyResponse wrappedElement = new synapse.apache.org.xsd.GetProxyResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, synapse.apache.org.xsd.GetAvailableTransportsResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(synapse.apache.org.xsd.GetAvailableTransportsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private synapse.apache.org.xsd.GetAvailableTransportsResponse wrapgetAvailableTransports(){
                                synapse.apache.org.xsd.GetAvailableTransportsResponse wrappedElement = new synapse.apache.org.xsd.GetAvailableTransportsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, synapse.apache.org.xsd.GetEndpointResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(synapse.apache.org.xsd.GetEndpointResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private synapse.apache.org.xsd.GetEndpointResponse wrapgetEndpoint(){
                                synapse.apache.org.xsd.GetEndpointResponse wrappedElement = new synapse.apache.org.xsd.GetEndpointResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, synapse.apache.org.xsd.StartProxyServiceResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(synapse.apache.org.xsd.StartProxyServiceResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private synapse.apache.org.xsd.StartProxyServiceResponse wrapstartProxyService(){
                                synapse.apache.org.xsd.StartProxyServiceResponse wrappedElement = new synapse.apache.org.xsd.StartProxyServiceResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, synapse.apache.org.xsd.GetMetaDataResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(synapse.apache.org.xsd.GetMetaDataResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private synapse.apache.org.xsd.GetMetaDataResponse wrapgetMetaData(){
                                synapse.apache.org.xsd.GetMetaDataResponse wrappedElement = new synapse.apache.org.xsd.GetMetaDataResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, synapse.apache.org.xsd.EnableTracingResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(synapse.apache.org.xsd.EnableTracingResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private synapse.apache.org.xsd.EnableTracingResponse wrapenableTracing(){
                                synapse.apache.org.xsd.EnableTracingResponse wrappedElement = new synapse.apache.org.xsd.EnableTracingResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, synapse.apache.org.xsd.GetSourceViewResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(synapse.apache.org.xsd.GetSourceViewResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private synapse.apache.org.xsd.GetSourceViewResponse wrapgetSourceView(){
                                synapse.apache.org.xsd.GetSourceViewResponse wrappedElement = new synapse.apache.org.xsd.GetSourceViewResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, synapse.apache.org.xsd.StopProxyServiceResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(synapse.apache.org.xsd.StopProxyServiceResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private synapse.apache.org.xsd.StopProxyServiceResponse wrapstopProxyService(){
                                synapse.apache.org.xsd.StopProxyServiceResponse wrappedElement = new synapse.apache.org.xsd.StopProxyServiceResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, synapse.apache.org.xsd.EnableStatisticsResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(synapse.apache.org.xsd.EnableStatisticsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private synapse.apache.org.xsd.EnableStatisticsResponse wrapenableStatistics(){
                                synapse.apache.org.xsd.EnableStatisticsResponse wrappedElement = new synapse.apache.org.xsd.EnableStatisticsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, synapse.apache.org.xsd.GetAvailableSequencesResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(synapse.apache.org.xsd.GetAvailableSequencesResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private synapse.apache.org.xsd.GetAvailableSequencesResponse wrapgetAvailableSequences(){
                                synapse.apache.org.xsd.GetAvailableSequencesResponse wrappedElement = new synapse.apache.org.xsd.GetAvailableSequencesResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, synapse.apache.org.xsd.DeleteProxyServiceResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(synapse.apache.org.xsd.DeleteProxyServiceResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private synapse.apache.org.xsd.DeleteProxyServiceResponse wrapdeleteProxyService(){
                                synapse.apache.org.xsd.DeleteProxyServiceResponse wrappedElement = new synapse.apache.org.xsd.DeleteProxyServiceResponse();
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
        
                if (synapse.apache.org.xsd.DisableStatistics.class.equals(type)){
                
                           return synapse.apache.org.xsd.DisableStatistics.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.DisableStatisticsResponse.class.equals(type)){
                
                           return synapse.apache.org.xsd.DisableStatisticsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.ProxyServiceAdminProxyAdminException.class.equals(type)){
                
                           return synapse.apache.org.xsd.ProxyServiceAdminProxyAdminException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.GetAvailableEndpoints.class.equals(type)){
                
                           return synapse.apache.org.xsd.GetAvailableEndpoints.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.GetAvailableEndpointsResponse.class.equals(type)){
                
                           return synapse.apache.org.xsd.GetAvailableEndpointsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.ProxyServiceAdminProxyAdminException.class.equals(type)){
                
                           return synapse.apache.org.xsd.ProxyServiceAdminProxyAdminException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.RedeployProxyService.class.equals(type)){
                
                           return synapse.apache.org.xsd.RedeployProxyService.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.RedeployProxyServiceResponse.class.equals(type)){
                
                           return synapse.apache.org.xsd.RedeployProxyServiceResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.ProxyServiceAdminProxyAdminException.class.equals(type)){
                
                           return synapse.apache.org.xsd.ProxyServiceAdminProxyAdminException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.AddProxy.class.equals(type)){
                
                           return synapse.apache.org.xsd.AddProxy.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.AddProxyResponse.class.equals(type)){
                
                           return synapse.apache.org.xsd.AddProxyResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.ProxyServiceAdminProxyAdminException.class.equals(type)){
                
                           return synapse.apache.org.xsd.ProxyServiceAdminProxyAdminException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.ModifyProxy.class.equals(type)){
                
                           return synapse.apache.org.xsd.ModifyProxy.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.ModifyProxyResponse.class.equals(type)){
                
                           return synapse.apache.org.xsd.ModifyProxyResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.ProxyServiceAdminProxyAdminException.class.equals(type)){
                
                           return synapse.apache.org.xsd.ProxyServiceAdminProxyAdminException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.DisableTracing.class.equals(type)){
                
                           return synapse.apache.org.xsd.DisableTracing.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.DisableTracingResponse.class.equals(type)){
                
                           return synapse.apache.org.xsd.DisableTracingResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.ProxyServiceAdminProxyAdminException.class.equals(type)){
                
                           return synapse.apache.org.xsd.ProxyServiceAdminProxyAdminException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.GetProxy.class.equals(type)){
                
                           return synapse.apache.org.xsd.GetProxy.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.GetProxyResponse.class.equals(type)){
                
                           return synapse.apache.org.xsd.GetProxyResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.ProxyServiceAdminProxyAdminException.class.equals(type)){
                
                           return synapse.apache.org.xsd.ProxyServiceAdminProxyAdminException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.GetAvailableTransports.class.equals(type)){
                
                           return synapse.apache.org.xsd.GetAvailableTransports.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.GetAvailableTransportsResponse.class.equals(type)){
                
                           return synapse.apache.org.xsd.GetAvailableTransportsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.ProxyServiceAdminProxyAdminException.class.equals(type)){
                
                           return synapse.apache.org.xsd.ProxyServiceAdminProxyAdminException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.GetEndpoint.class.equals(type)){
                
                           return synapse.apache.org.xsd.GetEndpoint.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.GetEndpointResponse.class.equals(type)){
                
                           return synapse.apache.org.xsd.GetEndpointResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.ProxyServiceAdminProxyAdminException.class.equals(type)){
                
                           return synapse.apache.org.xsd.ProxyServiceAdminProxyAdminException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.StartProxyService.class.equals(type)){
                
                           return synapse.apache.org.xsd.StartProxyService.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.StartProxyServiceResponse.class.equals(type)){
                
                           return synapse.apache.org.xsd.StartProxyServiceResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.ProxyServiceAdminProxyAdminException.class.equals(type)){
                
                           return synapse.apache.org.xsd.ProxyServiceAdminProxyAdminException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.GetMetaData.class.equals(type)){
                
                           return synapse.apache.org.xsd.GetMetaData.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.GetMetaDataResponse.class.equals(type)){
                
                           return synapse.apache.org.xsd.GetMetaDataResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.ProxyServiceAdminProxyAdminException.class.equals(type)){
                
                           return synapse.apache.org.xsd.ProxyServiceAdminProxyAdminException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.EnableTracing.class.equals(type)){
                
                           return synapse.apache.org.xsd.EnableTracing.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.EnableTracingResponse.class.equals(type)){
                
                           return synapse.apache.org.xsd.EnableTracingResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.ProxyServiceAdminProxyAdminException.class.equals(type)){
                
                           return synapse.apache.org.xsd.ProxyServiceAdminProxyAdminException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.GetSourceView.class.equals(type)){
                
                           return synapse.apache.org.xsd.GetSourceView.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.GetSourceViewResponse.class.equals(type)){
                
                           return synapse.apache.org.xsd.GetSourceViewResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.ProxyServiceAdminProxyAdminException.class.equals(type)){
                
                           return synapse.apache.org.xsd.ProxyServiceAdminProxyAdminException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.StopProxyService.class.equals(type)){
                
                           return synapse.apache.org.xsd.StopProxyService.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.StopProxyServiceResponse.class.equals(type)){
                
                           return synapse.apache.org.xsd.StopProxyServiceResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.ProxyServiceAdminProxyAdminException.class.equals(type)){
                
                           return synapse.apache.org.xsd.ProxyServiceAdminProxyAdminException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.EnableStatistics.class.equals(type)){
                
                           return synapse.apache.org.xsd.EnableStatistics.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.EnableStatisticsResponse.class.equals(type)){
                
                           return synapse.apache.org.xsd.EnableStatisticsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.ProxyServiceAdminProxyAdminException.class.equals(type)){
                
                           return synapse.apache.org.xsd.ProxyServiceAdminProxyAdminException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.GetAvailableSequences.class.equals(type)){
                
                           return synapse.apache.org.xsd.GetAvailableSequences.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.GetAvailableSequencesResponse.class.equals(type)){
                
                           return synapse.apache.org.xsd.GetAvailableSequencesResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.ProxyServiceAdminProxyAdminException.class.equals(type)){
                
                           return synapse.apache.org.xsd.ProxyServiceAdminProxyAdminException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.DeleteProxyService.class.equals(type)){
                
                           return synapse.apache.org.xsd.DeleteProxyService.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.DeleteProxyServiceResponse.class.equals(type)){
                
                           return synapse.apache.org.xsd.DeleteProxyServiceResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.ProxyServiceAdminProxyAdminException.class.equals(type)){
                
                           return synapse.apache.org.xsd.ProxyServiceAdminProxyAdminException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

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
    
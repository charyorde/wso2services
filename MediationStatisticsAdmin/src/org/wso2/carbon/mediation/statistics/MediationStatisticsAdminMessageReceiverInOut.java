
/**
 * MediationStatisticsAdminMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */
        package org.wso2.carbon.mediation.statistics;

        /**
        *  MediationStatisticsAdminMessageReceiverInOut message receiver
        */

        public class MediationStatisticsAdminMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        MediationStatisticsAdminSkeletonInterface skel = (MediationStatisticsAdminSkeletonInterface)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){


        

            if("getEndPointStatistics".equals(methodName)){
                
                org.wso2.carbon.mediation.statistics.GetEndPointStatisticsResponse getEndPointStatisticsResponse21 = null;
	                        org.wso2.carbon.mediation.statistics.GetEndPointStatistics wrappedParam =
                                                             (org.wso2.carbon.mediation.statistics.GetEndPointStatistics)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.mediation.statistics.GetEndPointStatistics.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getEndPointStatisticsResponse21 =
                                                   
                                                   
                                                         skel.getEndPointStatistics(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getEndPointStatisticsResponse21, false, new javax.xml.namespace.QName("http://statistics.mediation.carbon.wso2.org",
                                                    "getEndPointStatistics"));
                                    } else 

            if("getDataForGraph".equals(methodName)){
                
                org.wso2.carbon.mediation.statistics.GetDataForGraphResponse getDataForGraphResponse23 = null;
	                        org.wso2.carbon.mediation.statistics.GetDataForGraph wrappedParam =
                                                             (org.wso2.carbon.mediation.statistics.GetDataForGraph)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.mediation.statistics.GetDataForGraph.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getDataForGraphResponse23 =
                                                   
                                                   
                                                         skel.getDataForGraph(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getDataForGraphResponse23, false, new javax.xml.namespace.QName("http://statistics.mediation.carbon.wso2.org",
                                                    "getDataForGraph"));
                                    } else 

            if("getServerStatistics".equals(methodName)){
                
                org.wso2.carbon.mediation.statistics.GetServerStatisticsResponse getServerStatisticsResponse25 = null;
	                        org.wso2.carbon.mediation.statistics.GetServerStatistics wrappedParam =
                                                             (org.wso2.carbon.mediation.statistics.GetServerStatistics)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.mediation.statistics.GetServerStatistics.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getServerStatisticsResponse25 =
                                                   
                                                   
                                                         skel.getServerStatistics(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getServerStatisticsResponse25, false, new javax.xml.namespace.QName("http://statistics.mediation.carbon.wso2.org",
                                                    "getServerStatistics"));
                                    } else 

            if("listEndPoint".equals(methodName)){
                
                org.wso2.carbon.mediation.statistics.ListEndPointResponse listEndPointResponse27 = null;
	                        org.wso2.carbon.mediation.statistics.ListEndPoint wrappedParam =
                                                             (org.wso2.carbon.mediation.statistics.ListEndPoint)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.mediation.statistics.ListEndPoint.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               listEndPointResponse27 =
                                                   
                                                   
                                                         skel.listEndPoint(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), listEndPointResponse27, false, new javax.xml.namespace.QName("http://statistics.mediation.carbon.wso2.org",
                                                    "listEndPoint"));
                                    } else 

            if("getSequenceStatistics".equals(methodName)){
                
                org.wso2.carbon.mediation.statistics.GetSequenceStatisticsResponse getSequenceStatisticsResponse29 = null;
	                        org.wso2.carbon.mediation.statistics.GetSequenceStatistics wrappedParam =
                                                             (org.wso2.carbon.mediation.statistics.GetSequenceStatistics)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.mediation.statistics.GetSequenceStatistics.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getSequenceStatisticsResponse29 =
                                                   
                                                   
                                                         skel.getSequenceStatistics(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getSequenceStatisticsResponse29, false, new javax.xml.namespace.QName("http://statistics.mediation.carbon.wso2.org",
                                                    "getSequenceStatistics"));
                                    } else 

            if("listServers".equals(methodName)){
                
                org.wso2.carbon.mediation.statistics.ListServersResponse listServersResponse31 = null;
	                        org.wso2.carbon.mediation.statistics.ListServers wrappedParam =
                                                             (org.wso2.carbon.mediation.statistics.ListServers)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.mediation.statistics.ListServers.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               listServersResponse31 =
                                                   
                                                   
                                                         skel.listServers(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), listServersResponse31, false, new javax.xml.namespace.QName("http://statistics.mediation.carbon.wso2.org",
                                                    "listServers"));
                                    } else 

            if("getCategoryStatistics".equals(methodName)){
                
                org.wso2.carbon.mediation.statistics.GetCategoryStatisticsResponse getCategoryStatisticsResponse33 = null;
	                        org.wso2.carbon.mediation.statistics.GetCategoryStatistics wrappedParam =
                                                             (org.wso2.carbon.mediation.statistics.GetCategoryStatistics)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.mediation.statistics.GetCategoryStatistics.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getCategoryStatisticsResponse33 =
                                                   
                                                   
                                                         skel.getCategoryStatistics(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getCategoryStatisticsResponse33, false, new javax.xml.namespace.QName("http://statistics.mediation.carbon.wso2.org",
                                                    "getCategoryStatistics"));
                                    } else 

            if("listSequence".equals(methodName)){
                
                org.wso2.carbon.mediation.statistics.ListSequenceResponse listSequenceResponse35 = null;
	                        org.wso2.carbon.mediation.statistics.ListSequence wrappedParam =
                                                             (org.wso2.carbon.mediation.statistics.ListSequence)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.mediation.statistics.ListSequence.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               listSequenceResponse35 =
                                                   
                                                   
                                                         skel.listSequence(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), listSequenceResponse35, false, new javax.xml.namespace.QName("http://statistics.mediation.carbon.wso2.org",
                                                    "listSequence"));
                                    } else 

            if("listProxyServices".equals(methodName)){
                
                org.wso2.carbon.mediation.statistics.ListProxyServicesResponse listProxyServicesResponse37 = null;
	                        org.wso2.carbon.mediation.statistics.ListProxyServices wrappedParam =
                                                             (org.wso2.carbon.mediation.statistics.ListProxyServices)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.mediation.statistics.ListProxyServices.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               listProxyServicesResponse37 =
                                                   
                                                   
                                                         skel.listProxyServices(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), listProxyServicesResponse37, false, new javax.xml.namespace.QName("http://statistics.mediation.carbon.wso2.org",
                                                    "listProxyServices"));
                                    } else 

            if("getProxyServiceStatistics".equals(methodName)){
                
                org.wso2.carbon.mediation.statistics.GetProxyServiceStatisticsResponse getProxyServiceStatisticsResponse39 = null;
	                        org.wso2.carbon.mediation.statistics.GetProxyServiceStatistics wrappedParam =
                                                             (org.wso2.carbon.mediation.statistics.GetProxyServiceStatistics)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.mediation.statistics.GetProxyServiceStatistics.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getProxyServiceStatisticsResponse39 =
                                                   
                                                   
                                                         skel.getProxyServiceStatistics(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getProxyServiceStatisticsResponse39, false, new javax.xml.namespace.QName("http://statistics.mediation.carbon.wso2.org",
                                                    "getProxyServiceStatistics"));
                                    
            } else {
              throw new java.lang.RuntimeException("method not found");
            }
        

        newMsgContext.setEnvelope(envelope);
        }
        } catch (MediationStatisticsAdminMediationStatisticsExceptionException e) {

            msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME,"MediationStatisticsAdminMediationStatisticsException");
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
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.mediation.statistics.GetEndPointStatistics param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.mediation.statistics.GetEndPointStatistics.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.mediation.statistics.GetEndPointStatisticsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.mediation.statistics.GetEndPointStatisticsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.mediation.statistics.GetDataForGraph param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.mediation.statistics.GetDataForGraph.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.mediation.statistics.GetDataForGraphResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.mediation.statistics.GetDataForGraphResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.mediation.statistics.MediationStatisticsAdminMediationStatisticsException param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.mediation.statistics.MediationStatisticsAdminMediationStatisticsException.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.mediation.statistics.GetServerStatistics param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.mediation.statistics.GetServerStatistics.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.mediation.statistics.GetServerStatisticsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.mediation.statistics.GetServerStatisticsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.mediation.statistics.ListEndPoint param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.mediation.statistics.ListEndPoint.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.mediation.statistics.ListEndPointResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.mediation.statistics.ListEndPointResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.mediation.statistics.GetSequenceStatistics param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.mediation.statistics.GetSequenceStatistics.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.mediation.statistics.GetSequenceStatisticsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.mediation.statistics.GetSequenceStatisticsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.mediation.statistics.ListServers param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.mediation.statistics.ListServers.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.mediation.statistics.ListServersResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.mediation.statistics.ListServersResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.mediation.statistics.GetCategoryStatistics param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.mediation.statistics.GetCategoryStatistics.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.mediation.statistics.GetCategoryStatisticsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.mediation.statistics.GetCategoryStatisticsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.mediation.statistics.ListSequence param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.mediation.statistics.ListSequence.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.mediation.statistics.ListSequenceResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.mediation.statistics.ListSequenceResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.mediation.statistics.ListProxyServices param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.mediation.statistics.ListProxyServices.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.mediation.statistics.ListProxyServicesResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.mediation.statistics.ListProxyServicesResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.mediation.statistics.GetProxyServiceStatistics param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.mediation.statistics.GetProxyServiceStatistics.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.mediation.statistics.GetProxyServiceStatisticsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.mediation.statistics.GetProxyServiceStatisticsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.mediation.statistics.GetEndPointStatisticsResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.mediation.statistics.GetEndPointStatisticsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.mediation.statistics.GetEndPointStatisticsResponse wrapgetEndPointStatistics(){
                                org.wso2.carbon.mediation.statistics.GetEndPointStatisticsResponse wrappedElement = new org.wso2.carbon.mediation.statistics.GetEndPointStatisticsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.mediation.statistics.GetDataForGraphResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.mediation.statistics.GetDataForGraphResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.mediation.statistics.GetDataForGraphResponse wrapgetDataForGraph(){
                                org.wso2.carbon.mediation.statistics.GetDataForGraphResponse wrappedElement = new org.wso2.carbon.mediation.statistics.GetDataForGraphResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.mediation.statistics.GetServerStatisticsResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.mediation.statistics.GetServerStatisticsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.mediation.statistics.GetServerStatisticsResponse wrapgetServerStatistics(){
                                org.wso2.carbon.mediation.statistics.GetServerStatisticsResponse wrappedElement = new org.wso2.carbon.mediation.statistics.GetServerStatisticsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.mediation.statistics.ListEndPointResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.mediation.statistics.ListEndPointResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.mediation.statistics.ListEndPointResponse wraplistEndPoint(){
                                org.wso2.carbon.mediation.statistics.ListEndPointResponse wrappedElement = new org.wso2.carbon.mediation.statistics.ListEndPointResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.mediation.statistics.GetSequenceStatisticsResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.mediation.statistics.GetSequenceStatisticsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.mediation.statistics.GetSequenceStatisticsResponse wrapgetSequenceStatistics(){
                                org.wso2.carbon.mediation.statistics.GetSequenceStatisticsResponse wrappedElement = new org.wso2.carbon.mediation.statistics.GetSequenceStatisticsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.mediation.statistics.ListServersResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.mediation.statistics.ListServersResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.mediation.statistics.ListServersResponse wraplistServers(){
                                org.wso2.carbon.mediation.statistics.ListServersResponse wrappedElement = new org.wso2.carbon.mediation.statistics.ListServersResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.mediation.statistics.GetCategoryStatisticsResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.mediation.statistics.GetCategoryStatisticsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.mediation.statistics.GetCategoryStatisticsResponse wrapgetCategoryStatistics(){
                                org.wso2.carbon.mediation.statistics.GetCategoryStatisticsResponse wrappedElement = new org.wso2.carbon.mediation.statistics.GetCategoryStatisticsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.mediation.statistics.ListSequenceResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.mediation.statistics.ListSequenceResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.mediation.statistics.ListSequenceResponse wraplistSequence(){
                                org.wso2.carbon.mediation.statistics.ListSequenceResponse wrappedElement = new org.wso2.carbon.mediation.statistics.ListSequenceResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.mediation.statistics.ListProxyServicesResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.mediation.statistics.ListProxyServicesResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.mediation.statistics.ListProxyServicesResponse wraplistProxyServices(){
                                org.wso2.carbon.mediation.statistics.ListProxyServicesResponse wrappedElement = new org.wso2.carbon.mediation.statistics.ListProxyServicesResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.mediation.statistics.GetProxyServiceStatisticsResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.mediation.statistics.GetProxyServiceStatisticsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.mediation.statistics.GetProxyServiceStatisticsResponse wrapgetProxyServiceStatistics(){
                                org.wso2.carbon.mediation.statistics.GetProxyServiceStatisticsResponse wrappedElement = new org.wso2.carbon.mediation.statistics.GetProxyServiceStatisticsResponse();
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
        
                if (org.wso2.carbon.mediation.statistics.GetEndPointStatistics.class.equals(type)){
                
                           return org.wso2.carbon.mediation.statistics.GetEndPointStatistics.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.mediation.statistics.GetEndPointStatisticsResponse.class.equals(type)){
                
                           return org.wso2.carbon.mediation.statistics.GetEndPointStatisticsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.mediation.statistics.GetDataForGraph.class.equals(type)){
                
                           return org.wso2.carbon.mediation.statistics.GetDataForGraph.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.mediation.statistics.GetDataForGraphResponse.class.equals(type)){
                
                           return org.wso2.carbon.mediation.statistics.GetDataForGraphResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.mediation.statistics.MediationStatisticsAdminMediationStatisticsException.class.equals(type)){
                
                           return org.wso2.carbon.mediation.statistics.MediationStatisticsAdminMediationStatisticsException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.mediation.statistics.GetServerStatistics.class.equals(type)){
                
                           return org.wso2.carbon.mediation.statistics.GetServerStatistics.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.mediation.statistics.GetServerStatisticsResponse.class.equals(type)){
                
                           return org.wso2.carbon.mediation.statistics.GetServerStatisticsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.mediation.statistics.ListEndPoint.class.equals(type)){
                
                           return org.wso2.carbon.mediation.statistics.ListEndPoint.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.mediation.statistics.ListEndPointResponse.class.equals(type)){
                
                           return org.wso2.carbon.mediation.statistics.ListEndPointResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.mediation.statistics.GetSequenceStatistics.class.equals(type)){
                
                           return org.wso2.carbon.mediation.statistics.GetSequenceStatistics.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.mediation.statistics.GetSequenceStatisticsResponse.class.equals(type)){
                
                           return org.wso2.carbon.mediation.statistics.GetSequenceStatisticsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.mediation.statistics.ListServers.class.equals(type)){
                
                           return org.wso2.carbon.mediation.statistics.ListServers.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.mediation.statistics.ListServersResponse.class.equals(type)){
                
                           return org.wso2.carbon.mediation.statistics.ListServersResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.mediation.statistics.GetCategoryStatistics.class.equals(type)){
                
                           return org.wso2.carbon.mediation.statistics.GetCategoryStatistics.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.mediation.statistics.GetCategoryStatisticsResponse.class.equals(type)){
                
                           return org.wso2.carbon.mediation.statistics.GetCategoryStatisticsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.mediation.statistics.ListSequence.class.equals(type)){
                
                           return org.wso2.carbon.mediation.statistics.ListSequence.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.mediation.statistics.ListSequenceResponse.class.equals(type)){
                
                           return org.wso2.carbon.mediation.statistics.ListSequenceResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.mediation.statistics.ListProxyServices.class.equals(type)){
                
                           return org.wso2.carbon.mediation.statistics.ListProxyServices.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.mediation.statistics.ListProxyServicesResponse.class.equals(type)){
                
                           return org.wso2.carbon.mediation.statistics.ListProxyServicesResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.mediation.statistics.GetProxyServiceStatistics.class.equals(type)){
                
                           return org.wso2.carbon.mediation.statistics.GetProxyServiceStatistics.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.mediation.statistics.GetProxyServiceStatisticsResponse.class.equals(type)){
                
                           return org.wso2.carbon.mediation.statistics.GetProxyServiceStatisticsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

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
    
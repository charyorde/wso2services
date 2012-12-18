
/**
 * DiscoveryAdminMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */
        package org.wso2.carbon.discovery;

        /**
        *  DiscoveryAdminMessageReceiverInOut message receiver
        */

        public class DiscoveryAdminMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        DiscoveryAdminSkeletonInterface skel = (DiscoveryAdminSkeletonInterface)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){


        

            if("getDiscoveryProxy".equals(methodName)){
                
                synapse.apache.org.xsd.GetDiscoveryProxyResponse getDiscoveryProxyResponse16 = null;
	                        synapse.apache.org.xsd.GetDiscoveryProxy wrappedParam =
                                                             (synapse.apache.org.xsd.GetDiscoveryProxy)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    synapse.apache.org.xsd.GetDiscoveryProxy.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getDiscoveryProxyResponse16 =
                                                   
                                                   
                                                         skel.getDiscoveryProxy(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getDiscoveryProxyResponse16, false, new javax.xml.namespace.QName("http://discovery.carbon.wso2.org",
                                                    "getDiscoveryProxy"));
                                    } else 

            if("resolveTargetService".equals(methodName)){
                
                synapse.apache.org.xsd.ResolveTargetServiceResponse resolveTargetServiceResponse18 = null;
	                        synapse.apache.org.xsd.ResolveTargetService wrappedParam =
                                                             (synapse.apache.org.xsd.ResolveTargetService)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    synapse.apache.org.xsd.ResolveTargetService.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               resolveTargetServiceResponse18 =
                                                   
                                                   
                                                         skel.resolveTargetService(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), resolveTargetServiceResponse18, false, new javax.xml.namespace.QName("http://discovery.carbon.wso2.org",
                                                    "resolveTargetService"));
                                    } else 

            if("getServiceDiscoveryConfig".equals(methodName)){
                
                synapse.apache.org.xsd.GetServiceDiscoveryConfigResponse getServiceDiscoveryConfigResponse20 = null;
	                        synapse.apache.org.xsd.GetServiceDiscoveryConfig wrappedParam =
                                                             (synapse.apache.org.xsd.GetServiceDiscoveryConfig)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    synapse.apache.org.xsd.GetServiceDiscoveryConfig.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getServiceDiscoveryConfigResponse20 =
                                                   
                                                   
                                                         skel.getServiceDiscoveryConfig(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getServiceDiscoveryConfigResponse20, false, new javax.xml.namespace.QName("http://discovery.carbon.wso2.org",
                                                    "getServiceDiscoveryConfig"));
                                    } else 

            if("getDiscoveryProxies".equals(methodName)){
                
                synapse.apache.org.xsd.GetDiscoveryProxiesResponse getDiscoveryProxiesResponse22 = null;
	                        synapse.apache.org.xsd.GetDiscoveryProxies wrappedParam =
                                                             (synapse.apache.org.xsd.GetDiscoveryProxies)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    synapse.apache.org.xsd.GetDiscoveryProxies.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getDiscoveryProxiesResponse22 =
                                                   
                                                   
                                                         skel.getDiscoveryProxies(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getDiscoveryProxiesResponse22, false, new javax.xml.namespace.QName("http://discovery.carbon.wso2.org",
                                                    "getDiscoveryProxies"));
                                    } else 

            if("probeDiscoveryProxy".equals(methodName)){
                
                synapse.apache.org.xsd.ProbeDiscoveryProxyResponse probeDiscoveryProxyResponse24 = null;
	                        synapse.apache.org.xsd.ProbeDiscoveryProxy wrappedParam =
                                                             (synapse.apache.org.xsd.ProbeDiscoveryProxy)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    synapse.apache.org.xsd.ProbeDiscoveryProxy.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               probeDiscoveryProxyResponse24 =
                                                   
                                                   
                                                         skel.probeDiscoveryProxy(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), probeDiscoveryProxyResponse24, false, new javax.xml.namespace.QName("http://discovery.carbon.wso2.org",
                                                    "probeDiscoveryProxy"));
                                    
            } else {
              throw new java.lang.RuntimeException("method not found");
            }
        

        newMsgContext.setEnvelope(envelope);
        }
        } catch (DiscoveryAdminException e) {

            msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME,"DiscoveryAdminException");
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
            private  org.apache.axiom.om.OMElement  toOM(synapse.apache.org.xsd.GetDiscoveryProxy param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(synapse.apache.org.xsd.GetDiscoveryProxy.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(synapse.apache.org.xsd.GetDiscoveryProxyResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(synapse.apache.org.xsd.GetDiscoveryProxyResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(synapse.apache.org.xsd.DiscoveryAdminException param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(synapse.apache.org.xsd.DiscoveryAdminException.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(synapse.apache.org.xsd.ResolveTargetService param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(synapse.apache.org.xsd.ResolveTargetService.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(synapse.apache.org.xsd.ResolveTargetServiceResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(synapse.apache.org.xsd.ResolveTargetServiceResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(synapse.apache.org.xsd.EnableServiceDiscovery param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(synapse.apache.org.xsd.EnableServiceDiscovery.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(synapse.apache.org.xsd.DisableServiceDiscovery param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(synapse.apache.org.xsd.DisableServiceDiscovery.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(synapse.apache.org.xsd.AddDiscoveryProxy param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(synapse.apache.org.xsd.AddDiscoveryProxy.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(synapse.apache.org.xsd.GetServiceDiscoveryConfig param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(synapse.apache.org.xsd.GetServiceDiscoveryConfig.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(synapse.apache.org.xsd.GetServiceDiscoveryConfigResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(synapse.apache.org.xsd.GetServiceDiscoveryConfigResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(synapse.apache.org.xsd.RemoveDiscoveryProxy param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(synapse.apache.org.xsd.RemoveDiscoveryProxy.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(synapse.apache.org.xsd.GetDiscoveryProxies param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(synapse.apache.org.xsd.GetDiscoveryProxies.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(synapse.apache.org.xsd.GetDiscoveryProxiesResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(synapse.apache.org.xsd.GetDiscoveryProxiesResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(synapse.apache.org.xsd.ProbeDiscoveryProxy param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(synapse.apache.org.xsd.ProbeDiscoveryProxy.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(synapse.apache.org.xsd.ProbeDiscoveryProxyResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(synapse.apache.org.xsd.ProbeDiscoveryProxyResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(synapse.apache.org.xsd.UpdateDiscoveryProxy param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(synapse.apache.org.xsd.UpdateDiscoveryProxy.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, synapse.apache.org.xsd.GetDiscoveryProxyResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(synapse.apache.org.xsd.GetDiscoveryProxyResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private synapse.apache.org.xsd.GetDiscoveryProxyResponse wrapgetDiscoveryProxy(){
                                synapse.apache.org.xsd.GetDiscoveryProxyResponse wrappedElement = new synapse.apache.org.xsd.GetDiscoveryProxyResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, synapse.apache.org.xsd.ResolveTargetServiceResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(synapse.apache.org.xsd.ResolveTargetServiceResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private synapse.apache.org.xsd.ResolveTargetServiceResponse wrapresolveTargetService(){
                                synapse.apache.org.xsd.ResolveTargetServiceResponse wrappedElement = new synapse.apache.org.xsd.ResolveTargetServiceResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, synapse.apache.org.xsd.GetServiceDiscoveryConfigResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(synapse.apache.org.xsd.GetServiceDiscoveryConfigResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private synapse.apache.org.xsd.GetServiceDiscoveryConfigResponse wrapgetServiceDiscoveryConfig(){
                                synapse.apache.org.xsd.GetServiceDiscoveryConfigResponse wrappedElement = new synapse.apache.org.xsd.GetServiceDiscoveryConfigResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, synapse.apache.org.xsd.GetDiscoveryProxiesResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(synapse.apache.org.xsd.GetDiscoveryProxiesResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private synapse.apache.org.xsd.GetDiscoveryProxiesResponse wrapgetDiscoveryProxies(){
                                synapse.apache.org.xsd.GetDiscoveryProxiesResponse wrappedElement = new synapse.apache.org.xsd.GetDiscoveryProxiesResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, synapse.apache.org.xsd.ProbeDiscoveryProxyResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(synapse.apache.org.xsd.ProbeDiscoveryProxyResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private synapse.apache.org.xsd.ProbeDiscoveryProxyResponse wrapprobeDiscoveryProxy(){
                                synapse.apache.org.xsd.ProbeDiscoveryProxyResponse wrappedElement = new synapse.apache.org.xsd.ProbeDiscoveryProxyResponse();
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
        
                if (synapse.apache.org.xsd.GetDiscoveryProxy.class.equals(type)){
                
                           return synapse.apache.org.xsd.GetDiscoveryProxy.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.GetDiscoveryProxyResponse.class.equals(type)){
                
                           return synapse.apache.org.xsd.GetDiscoveryProxyResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.DiscoveryAdminException.class.equals(type)){
                
                           return synapse.apache.org.xsd.DiscoveryAdminException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.ResolveTargetService.class.equals(type)){
                
                           return synapse.apache.org.xsd.ResolveTargetService.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.ResolveTargetServiceResponse.class.equals(type)){
                
                           return synapse.apache.org.xsd.ResolveTargetServiceResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.DiscoveryAdminException.class.equals(type)){
                
                           return synapse.apache.org.xsd.DiscoveryAdminException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.EnableServiceDiscovery.class.equals(type)){
                
                           return synapse.apache.org.xsd.EnableServiceDiscovery.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.DiscoveryAdminException.class.equals(type)){
                
                           return synapse.apache.org.xsd.DiscoveryAdminException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.DisableServiceDiscovery.class.equals(type)){
                
                           return synapse.apache.org.xsd.DisableServiceDiscovery.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.DiscoveryAdminException.class.equals(type)){
                
                           return synapse.apache.org.xsd.DiscoveryAdminException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.AddDiscoveryProxy.class.equals(type)){
                
                           return synapse.apache.org.xsd.AddDiscoveryProxy.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.DiscoveryAdminException.class.equals(type)){
                
                           return synapse.apache.org.xsd.DiscoveryAdminException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.GetServiceDiscoveryConfig.class.equals(type)){
                
                           return synapse.apache.org.xsd.GetServiceDiscoveryConfig.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.GetServiceDiscoveryConfigResponse.class.equals(type)){
                
                           return synapse.apache.org.xsd.GetServiceDiscoveryConfigResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.DiscoveryAdminException.class.equals(type)){
                
                           return synapse.apache.org.xsd.DiscoveryAdminException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.RemoveDiscoveryProxy.class.equals(type)){
                
                           return synapse.apache.org.xsd.RemoveDiscoveryProxy.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.DiscoveryAdminException.class.equals(type)){
                
                           return synapse.apache.org.xsd.DiscoveryAdminException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.GetDiscoveryProxies.class.equals(type)){
                
                           return synapse.apache.org.xsd.GetDiscoveryProxies.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.GetDiscoveryProxiesResponse.class.equals(type)){
                
                           return synapse.apache.org.xsd.GetDiscoveryProxiesResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.DiscoveryAdminException.class.equals(type)){
                
                           return synapse.apache.org.xsd.DiscoveryAdminException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.ProbeDiscoveryProxy.class.equals(type)){
                
                           return synapse.apache.org.xsd.ProbeDiscoveryProxy.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.ProbeDiscoveryProxyResponse.class.equals(type)){
                
                           return synapse.apache.org.xsd.ProbeDiscoveryProxyResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.DiscoveryAdminException.class.equals(type)){
                
                           return synapse.apache.org.xsd.DiscoveryAdminException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.UpdateDiscoveryProxy.class.equals(type)){
                
                           return synapse.apache.org.xsd.UpdateDiscoveryProxy.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.DiscoveryAdminException.class.equals(type)){
                
                           return synapse.apache.org.xsd.DiscoveryAdminException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

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
    
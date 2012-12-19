
/**
 * DiscoveryProxyMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */
        package org.wso2.carbon.discovery.proxy;

        /**
        *  DiscoveryProxyMessageReceiverInOut message receiver
        */

        public class DiscoveryProxyMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        DiscoveryProxySkeletonInterface skel = (DiscoveryProxySkeletonInterface)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){


        

            if("hello".equals(methodName)){
                
                org.oasis_open.docs.ws_dd.ns.discovery._2009._01.Hello wrappedParam =
                                                             (org.oasis_open.docs.ws_dd.ns.discovery._2009._01.Hello)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.oasis_open.docs.ws_dd.ns.discovery._2009._01.Hello.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               
                                                         skel.hello(wrappedParam)
                                                    ;
                                            
                                        envelope = getSOAPFactory(msgContext).getDefaultEnvelope();
                                    } else 

            if("probe".equals(methodName)){
                
                org.oasis_open.docs.ws_dd.ns.discovery._2009._01.ProbeResponse probeResponse13 = null;
	                        org.oasis_open.docs.ws_dd.ns.discovery._2009._01.Probe wrappedParam =
                                                             (org.oasis_open.docs.ws_dd.ns.discovery._2009._01.Probe)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.oasis_open.docs.ws_dd.ns.discovery._2009._01.Probe.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               probeResponse13 =
                                                   
                                                   
                                                         skel.probe(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), probeResponse13, false, new javax.xml.namespace.QName("http://proxy.discovery.carbon.wso2.org",
                                                    "probe"));
                                    } else 

            if("bye".equals(methodName)){
                
                org.oasis_open.docs.ws_dd.ns.discovery._2009._01.Bye wrappedParam =
                                                             (org.oasis_open.docs.ws_dd.ns.discovery._2009._01.Bye)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.oasis_open.docs.ws_dd.ns.discovery._2009._01.Bye.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               
                                                         skel.bye(wrappedParam)
                                                    ;
                                            
                                        envelope = getSOAPFactory(msgContext).getDefaultEnvelope();
                                    } else 

            if("resolve".equals(methodName)){
                
                org.oasis_open.docs.ws_dd.ns.discovery._2009._01.ResolveResponse resolveResponse17 = null;
	                        org.oasis_open.docs.ws_dd.ns.discovery._2009._01.Resolve wrappedParam =
                                                             (org.oasis_open.docs.ws_dd.ns.discovery._2009._01.Resolve)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.oasis_open.docs.ws_dd.ns.discovery._2009._01.Resolve.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               resolveResponse17 =
                                                   
                                                   
                                                         skel.resolve(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), resolveResponse17, false, new javax.xml.namespace.QName("http://proxy.discovery.carbon.wso2.org",
                                                    "resolve"));
                                    
            } else {
              throw new java.lang.RuntimeException("method not found");
            }
        

        newMsgContext.setEnvelope(envelope);
        }
        } catch (DiscoveryProxyDiscoveryException e) {

            msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME,"DiscoveryProxyDiscoveryException");
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
            private  org.apache.axiom.om.OMElement  toOM(org.oasis_open.docs.ws_dd.ns.discovery._2009._01.Hello param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.oasis_open.docs.ws_dd.ns.discovery._2009._01.Hello.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.oasis_open.docs.ws_dd.ns.discovery._2009._01.DiscoveryProxyDiscoveryException param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.oasis_open.docs.ws_dd.ns.discovery._2009._01.DiscoveryProxyDiscoveryException.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.oasis_open.docs.ws_dd.ns.discovery._2009._01.Probe param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.oasis_open.docs.ws_dd.ns.discovery._2009._01.Probe.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.oasis_open.docs.ws_dd.ns.discovery._2009._01.ProbeResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.oasis_open.docs.ws_dd.ns.discovery._2009._01.ProbeResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.oasis_open.docs.ws_dd.ns.discovery._2009._01.Bye param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.oasis_open.docs.ws_dd.ns.discovery._2009._01.Bye.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.oasis_open.docs.ws_dd.ns.discovery._2009._01.Resolve param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.oasis_open.docs.ws_dd.ns.discovery._2009._01.Resolve.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.oasis_open.docs.ws_dd.ns.discovery._2009._01.ResolveResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.oasis_open.docs.ws_dd.ns.discovery._2009._01.ResolveResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.oasis_open.docs.ws_dd.ns.discovery._2009._01.ProbeResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.oasis_open.docs.ws_dd.ns.discovery._2009._01.ProbeResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.oasis_open.docs.ws_dd.ns.discovery._2009._01.ProbeResponse wrapProbe(){
                                org.oasis_open.docs.ws_dd.ns.discovery._2009._01.ProbeResponse wrappedElement = new org.oasis_open.docs.ws_dd.ns.discovery._2009._01.ProbeResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.oasis_open.docs.ws_dd.ns.discovery._2009._01.ResolveResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.oasis_open.docs.ws_dd.ns.discovery._2009._01.ResolveResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.oasis_open.docs.ws_dd.ns.discovery._2009._01.ResolveResponse wrapResolve(){
                                org.oasis_open.docs.ws_dd.ns.discovery._2009._01.ResolveResponse wrappedElement = new org.oasis_open.docs.ws_dd.ns.discovery._2009._01.ResolveResponse();
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
        
                if (org.oasis_open.docs.ws_dd.ns.discovery._2009._01.Hello.class.equals(type)){
                
                           return org.oasis_open.docs.ws_dd.ns.discovery._2009._01.Hello.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.oasis_open.docs.ws_dd.ns.discovery._2009._01.DiscoveryProxyDiscoveryException.class.equals(type)){
                
                           return org.oasis_open.docs.ws_dd.ns.discovery._2009._01.DiscoveryProxyDiscoveryException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.oasis_open.docs.ws_dd.ns.discovery._2009._01.Probe.class.equals(type)){
                
                           return org.oasis_open.docs.ws_dd.ns.discovery._2009._01.Probe.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.oasis_open.docs.ws_dd.ns.discovery._2009._01.ProbeResponse.class.equals(type)){
                
                           return org.oasis_open.docs.ws_dd.ns.discovery._2009._01.ProbeResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.oasis_open.docs.ws_dd.ns.discovery._2009._01.DiscoveryProxyDiscoveryException.class.equals(type)){
                
                           return org.oasis_open.docs.ws_dd.ns.discovery._2009._01.DiscoveryProxyDiscoveryException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.oasis_open.docs.ws_dd.ns.discovery._2009._01.Bye.class.equals(type)){
                
                           return org.oasis_open.docs.ws_dd.ns.discovery._2009._01.Bye.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.oasis_open.docs.ws_dd.ns.discovery._2009._01.DiscoveryProxyDiscoveryException.class.equals(type)){
                
                           return org.oasis_open.docs.ws_dd.ns.discovery._2009._01.DiscoveryProxyDiscoveryException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.oasis_open.docs.ws_dd.ns.discovery._2009._01.Resolve.class.equals(type)){
                
                           return org.oasis_open.docs.ws_dd.ns.discovery._2009._01.Resolve.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.oasis_open.docs.ws_dd.ns.discovery._2009._01.ResolveResponse.class.equals(type)){
                
                           return org.oasis_open.docs.ws_dd.ns.discovery._2009._01.ResolveResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.oasis_open.docs.ws_dd.ns.discovery._2009._01.DiscoveryProxyDiscoveryException.class.equals(type)){
                
                           return org.oasis_open.docs.ws_dd.ns.discovery._2009._01.DiscoveryProxyDiscoveryException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

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
    
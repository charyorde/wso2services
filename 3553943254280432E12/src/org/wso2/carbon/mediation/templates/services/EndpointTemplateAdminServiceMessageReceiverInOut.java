
/**
 * EndpointTemplateAdminServiceMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */
        package org.wso2.carbon.mediation.templates.services;

        /**
        *  EndpointTemplateAdminServiceMessageReceiverInOut message receiver
        */

        public class EndpointTemplateAdminServiceMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        EndpointTemplateAdminServiceSkeletonInterface skel = (EndpointTemplateAdminServiceSkeletonInterface)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){


        

            if("getEndpointTemplatesCount".equals(methodName)){
                
                synapse.apache.org.xsd.GetEndpointTemplatesCountResponse getEndpointTemplatesCountResponse17 = null;
	                        synapse.apache.org.xsd.GetEndpointTemplatesCount wrappedParam =
                                                             (synapse.apache.org.xsd.GetEndpointTemplatesCount)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    synapse.apache.org.xsd.GetEndpointTemplatesCount.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getEndpointTemplatesCountResponse17 =
                                                   
                                                   
                                                         skel.getEndpointTemplatesCount(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getEndpointTemplatesCountResponse17, false, new javax.xml.namespace.QName("http://services.templates.mediation.carbon.wso2.org",
                                                    "getEndpointTemplatesCount"));
                                    } else 

            if("getDynamicEndpointTemplatesCount".equals(methodName)){
                
                synapse.apache.org.xsd.GetDynamicEndpointTemplatesCountResponse getDynamicEndpointTemplatesCountResponse19 = null;
	                        synapse.apache.org.xsd.GetDynamicEndpointTemplatesCount wrappedParam =
                                                             (synapse.apache.org.xsd.GetDynamicEndpointTemplatesCount)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    synapse.apache.org.xsd.GetDynamicEndpointTemplatesCount.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getDynamicEndpointTemplatesCountResponse19 =
                                                   
                                                   
                                                         skel.getDynamicEndpointTemplatesCount(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getDynamicEndpointTemplatesCountResponse19, false, new javax.xml.namespace.QName("http://services.templates.mediation.carbon.wso2.org",
                                                    "getDynamicEndpointTemplatesCount"));
                                    } else 

            if("getDynamicEndpointTemplates".equals(methodName)){
                
                synapse.apache.org.xsd.GetDynamicEndpointTemplatesResponse getDynamicEndpointTemplatesResponse21 = null;
	                        synapse.apache.org.xsd.GetDynamicEndpointTemplates wrappedParam =
                                                             (synapse.apache.org.xsd.GetDynamicEndpointTemplates)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    synapse.apache.org.xsd.GetDynamicEndpointTemplates.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getDynamicEndpointTemplatesResponse21 =
                                                   
                                                   
                                                         skel.getDynamicEndpointTemplates(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getDynamicEndpointTemplatesResponse21, false, new javax.xml.namespace.QName("http://services.templates.mediation.carbon.wso2.org",
                                                    "getDynamicEndpointTemplates"));
                                    } else 

            if("getTemplate".equals(methodName)){
                
                synapse.apache.org.xsd.GetTemplateResponse getTemplateResponse23 = null;
	                        synapse.apache.org.xsd.GetTemplate wrappedParam =
                                                             (synapse.apache.org.xsd.GetTemplate)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    synapse.apache.org.xsd.GetTemplate.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getTemplateResponse23 =
                                                   
                                                   
                                                         skel.getTemplate(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getTemplateResponse23, false, new javax.xml.namespace.QName("http://services.templates.mediation.carbon.wso2.org",
                                                    "getTemplate"));
                                    } else 

            if("getEndpointTemplates".equals(methodName)){
                
                synapse.apache.org.xsd.GetEndpointTemplatesResponse getEndpointTemplatesResponse25 = null;
	                        synapse.apache.org.xsd.GetEndpointTemplates wrappedParam =
                                                             (synapse.apache.org.xsd.GetEndpointTemplates)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    synapse.apache.org.xsd.GetEndpointTemplates.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getEndpointTemplatesResponse25 =
                                                   
                                                   
                                                         skel.getEndpointTemplates(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getEndpointTemplatesResponse25, false, new javax.xml.namespace.QName("http://services.templates.mediation.carbon.wso2.org",
                                                    "getEndpointTemplates"));
                                    
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
            private  org.apache.axiom.om.OMElement  toOM(synapse.apache.org.xsd.SaveEndpointTemplate param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(synapse.apache.org.xsd.SaveEndpointTemplate.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(synapse.apache.org.xsd.SaveDynamicEndpointTemplate param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(synapse.apache.org.xsd.SaveDynamicEndpointTemplate.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(synapse.apache.org.xsd.GetEndpointTemplatesCount param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(synapse.apache.org.xsd.GetEndpointTemplatesCount.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(synapse.apache.org.xsd.GetEndpointTemplatesCountResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(synapse.apache.org.xsd.GetEndpointTemplatesCountResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(synapse.apache.org.xsd.DeleteEndpointTemplate param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(synapse.apache.org.xsd.DeleteEndpointTemplate.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(synapse.apache.org.xsd.GetDynamicEndpointTemplatesCount param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(synapse.apache.org.xsd.GetDynamicEndpointTemplatesCount.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(synapse.apache.org.xsd.GetDynamicEndpointTemplatesCountResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(synapse.apache.org.xsd.GetDynamicEndpointTemplatesCountResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(synapse.apache.org.xsd.AddEndpointTemplate param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(synapse.apache.org.xsd.AddEndpointTemplate.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(synapse.apache.org.xsd.DeleteDynamicEndpointTemplate param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(synapse.apache.org.xsd.DeleteDynamicEndpointTemplate.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(synapse.apache.org.xsd.GetDynamicEndpointTemplates param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(synapse.apache.org.xsd.GetDynamicEndpointTemplates.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(synapse.apache.org.xsd.GetDynamicEndpointTemplatesResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(synapse.apache.org.xsd.GetDynamicEndpointTemplatesResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(synapse.apache.org.xsd.GetTemplate param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(synapse.apache.org.xsd.GetTemplate.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(synapse.apache.org.xsd.GetTemplateResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(synapse.apache.org.xsd.GetTemplateResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(synapse.apache.org.xsd.GetEndpointTemplates param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(synapse.apache.org.xsd.GetEndpointTemplates.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(synapse.apache.org.xsd.GetEndpointTemplatesResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(synapse.apache.org.xsd.GetEndpointTemplatesResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(synapse.apache.org.xsd.AddDynamicEndpointTemplate param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(synapse.apache.org.xsd.AddDynamicEndpointTemplate.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, synapse.apache.org.xsd.GetEndpointTemplatesCountResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(synapse.apache.org.xsd.GetEndpointTemplatesCountResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private synapse.apache.org.xsd.GetEndpointTemplatesCountResponse wrapgetEndpointTemplatesCount(){
                                synapse.apache.org.xsd.GetEndpointTemplatesCountResponse wrappedElement = new synapse.apache.org.xsd.GetEndpointTemplatesCountResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, synapse.apache.org.xsd.GetDynamicEndpointTemplatesCountResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(synapse.apache.org.xsd.GetDynamicEndpointTemplatesCountResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private synapse.apache.org.xsd.GetDynamicEndpointTemplatesCountResponse wrapgetDynamicEndpointTemplatesCount(){
                                synapse.apache.org.xsd.GetDynamicEndpointTemplatesCountResponse wrappedElement = new synapse.apache.org.xsd.GetDynamicEndpointTemplatesCountResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, synapse.apache.org.xsd.GetDynamicEndpointTemplatesResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(synapse.apache.org.xsd.GetDynamicEndpointTemplatesResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private synapse.apache.org.xsd.GetDynamicEndpointTemplatesResponse wrapgetDynamicEndpointTemplates(){
                                synapse.apache.org.xsd.GetDynamicEndpointTemplatesResponse wrappedElement = new synapse.apache.org.xsd.GetDynamicEndpointTemplatesResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, synapse.apache.org.xsd.GetTemplateResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(synapse.apache.org.xsd.GetTemplateResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private synapse.apache.org.xsd.GetTemplateResponse wrapgetTemplate(){
                                synapse.apache.org.xsd.GetTemplateResponse wrappedElement = new synapse.apache.org.xsd.GetTemplateResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, synapse.apache.org.xsd.GetEndpointTemplatesResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(synapse.apache.org.xsd.GetEndpointTemplatesResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private synapse.apache.org.xsd.GetEndpointTemplatesResponse wrapgetEndpointTemplates(){
                                synapse.apache.org.xsd.GetEndpointTemplatesResponse wrappedElement = new synapse.apache.org.xsd.GetEndpointTemplatesResponse();
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
        
                if (synapse.apache.org.xsd.SaveEndpointTemplate.class.equals(type)){
                
                           return synapse.apache.org.xsd.SaveEndpointTemplate.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.SaveDynamicEndpointTemplate.class.equals(type)){
                
                           return synapse.apache.org.xsd.SaveDynamicEndpointTemplate.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.GetEndpointTemplatesCount.class.equals(type)){
                
                           return synapse.apache.org.xsd.GetEndpointTemplatesCount.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.GetEndpointTemplatesCountResponse.class.equals(type)){
                
                           return synapse.apache.org.xsd.GetEndpointTemplatesCountResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.DeleteEndpointTemplate.class.equals(type)){
                
                           return synapse.apache.org.xsd.DeleteEndpointTemplate.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.GetDynamicEndpointTemplatesCount.class.equals(type)){
                
                           return synapse.apache.org.xsd.GetDynamicEndpointTemplatesCount.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.GetDynamicEndpointTemplatesCountResponse.class.equals(type)){
                
                           return synapse.apache.org.xsd.GetDynamicEndpointTemplatesCountResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.AddEndpointTemplate.class.equals(type)){
                
                           return synapse.apache.org.xsd.AddEndpointTemplate.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.DeleteDynamicEndpointTemplate.class.equals(type)){
                
                           return synapse.apache.org.xsd.DeleteDynamicEndpointTemplate.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.GetDynamicEndpointTemplates.class.equals(type)){
                
                           return synapse.apache.org.xsd.GetDynamicEndpointTemplates.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.GetDynamicEndpointTemplatesResponse.class.equals(type)){
                
                           return synapse.apache.org.xsd.GetDynamicEndpointTemplatesResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.GetTemplate.class.equals(type)){
                
                           return synapse.apache.org.xsd.GetTemplate.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.GetTemplateResponse.class.equals(type)){
                
                           return synapse.apache.org.xsd.GetTemplateResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.GetEndpointTemplates.class.equals(type)){
                
                           return synapse.apache.org.xsd.GetEndpointTemplates.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.GetEndpointTemplatesResponse.class.equals(type)){
                
                           return synapse.apache.org.xsd.GetEndpointTemplatesResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.AddDynamicEndpointTemplate.class.equals(type)){
                
                           return synapse.apache.org.xsd.AddDynamicEndpointTemplate.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

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
    
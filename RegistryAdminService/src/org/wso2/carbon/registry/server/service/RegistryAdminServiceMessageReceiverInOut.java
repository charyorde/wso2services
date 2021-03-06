
/**
 * RegistryAdminServiceMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */
        package org.wso2.carbon.registry.server.service;

        /**
        *  RegistryAdminServiceMessageReceiverInOut message receiver
        */

        public class RegistryAdminServiceMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        RegistryAdminServiceSkeletonInterface skel = (RegistryAdminServiceSkeletonInterface)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){


        

            if("getHTTPPermalink".equals(methodName)){
                
                org.wso2.carbon.registry.server.service.GetHTTPPermalinkResponse getHTTPPermalinkResponse7 = null;
	                        org.wso2.carbon.registry.server.service.GetHTTPPermalink wrappedParam =
                                                             (org.wso2.carbon.registry.server.service.GetHTTPPermalink)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.registry.server.service.GetHTTPPermalink.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getHTTPPermalinkResponse7 =
                                                   
                                                   
                                                         skel.getHTTPPermalink(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getHTTPPermalinkResponse7, false, new javax.xml.namespace.QName("http://service.server.registry.carbon.wso2.org",
                                                    "getHTTPPermalink"));
                                    } else 

            if("isRegistryReadOnly".equals(methodName)){
                
                org.wso2.carbon.registry.server.service.IsRegistryReadOnlyResponse isRegistryReadOnlyResponse9 = null;
	                        org.wso2.carbon.registry.server.service.IsRegistryReadOnly wrappedParam =
                                                             (org.wso2.carbon.registry.server.service.IsRegistryReadOnly)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.registry.server.service.IsRegistryReadOnly.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               isRegistryReadOnlyResponse9 =
                                                   
                                                   
                                                         skel.isRegistryReadOnly(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), isRegistryReadOnlyResponse9, false, new javax.xml.namespace.QName("http://service.server.registry.carbon.wso2.org",
                                                    "isRegistryReadOnly"));
                                    } else 

            if("getHTTPSPermalink".equals(methodName)){
                
                org.wso2.carbon.registry.server.service.GetHTTPSPermalinkResponse getHTTPSPermalinkResponse11 = null;
	                        org.wso2.carbon.registry.server.service.GetHTTPSPermalink wrappedParam =
                                                             (org.wso2.carbon.registry.server.service.GetHTTPSPermalink)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.registry.server.service.GetHTTPSPermalink.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getHTTPSPermalinkResponse11 =
                                                   
                                                   
                                                         skel.getHTTPSPermalink(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getHTTPSPermalinkResponse11, false, new javax.xml.namespace.QName("http://service.server.registry.carbon.wso2.org",
                                                    "getHTTPSPermalink"));
                                    
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
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.server.service.GetHTTPPermalink param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.server.service.GetHTTPPermalink.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.server.service.GetHTTPPermalinkResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.server.service.GetHTTPPermalinkResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.server.service.IsRegistryReadOnly param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.server.service.IsRegistryReadOnly.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.server.service.IsRegistryReadOnlyResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.server.service.IsRegistryReadOnlyResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.server.service.GetHTTPSPermalink param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.server.service.GetHTTPSPermalink.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.server.service.GetHTTPSPermalinkResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.server.service.GetHTTPSPermalinkResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.registry.server.service.GetHTTPPermalinkResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.registry.server.service.GetHTTPPermalinkResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.registry.server.service.GetHTTPPermalinkResponse wrapgetHTTPPermalink(){
                                org.wso2.carbon.registry.server.service.GetHTTPPermalinkResponse wrappedElement = new org.wso2.carbon.registry.server.service.GetHTTPPermalinkResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.registry.server.service.IsRegistryReadOnlyResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.registry.server.service.IsRegistryReadOnlyResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.registry.server.service.IsRegistryReadOnlyResponse wrapisRegistryReadOnly(){
                                org.wso2.carbon.registry.server.service.IsRegistryReadOnlyResponse wrappedElement = new org.wso2.carbon.registry.server.service.IsRegistryReadOnlyResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.registry.server.service.GetHTTPSPermalinkResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.registry.server.service.GetHTTPSPermalinkResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.registry.server.service.GetHTTPSPermalinkResponse wrapgetHTTPSPermalink(){
                                org.wso2.carbon.registry.server.service.GetHTTPSPermalinkResponse wrappedElement = new org.wso2.carbon.registry.server.service.GetHTTPSPermalinkResponse();
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
        
                if (org.wso2.carbon.registry.server.service.GetHTTPPermalink.class.equals(type)){
                
                           return org.wso2.carbon.registry.server.service.GetHTTPPermalink.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.server.service.GetHTTPPermalinkResponse.class.equals(type)){
                
                           return org.wso2.carbon.registry.server.service.GetHTTPPermalinkResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.server.service.IsRegistryReadOnly.class.equals(type)){
                
                           return org.wso2.carbon.registry.server.service.IsRegistryReadOnly.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.server.service.IsRegistryReadOnlyResponse.class.equals(type)){
                
                           return org.wso2.carbon.registry.server.service.IsRegistryReadOnlyResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.server.service.GetHTTPSPermalink.class.equals(type)){
                
                           return org.wso2.carbon.registry.server.service.GetHTTPSPermalink.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.server.service.GetHTTPSPermalinkResponse.class.equals(type)){
                
                           return org.wso2.carbon.registry.server.service.GetHTTPSPermalinkResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

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
    
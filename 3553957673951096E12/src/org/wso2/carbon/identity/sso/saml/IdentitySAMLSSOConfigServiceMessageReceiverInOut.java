
/**
 * IdentitySAMLSSOConfigServiceMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */
        package org.wso2.carbon.identity.sso.saml;

        /**
        *  IdentitySAMLSSOConfigServiceMessageReceiverInOut message receiver
        */

        public class IdentitySAMLSSOConfigServiceMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        IdentitySAMLSSOConfigServiceSkeletonInterface skel = (IdentitySAMLSSOConfigServiceSkeletonInterface)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){


        

            if("removeServiceProvider".equals(methodName)){
                
                axis2.apache.org.xsd.RemoveServiceProviderResponse removeServiceProviderResponse9 = null;
	                        axis2.apache.org.xsd.RemoveServiceProvider wrappedParam =
                                                             (axis2.apache.org.xsd.RemoveServiceProvider)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    axis2.apache.org.xsd.RemoveServiceProvider.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               removeServiceProviderResponse9 =
                                                   
                                                   
                                                         skel.removeServiceProvider(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), removeServiceProviderResponse9, false, new javax.xml.namespace.QName("http://saml.sso.identity.carbon.wso2.org",
                                                    "removeServiceProvider"));
                                    } else 

            if("getServiceProviders".equals(methodName)){
                
                axis2.apache.org.xsd.GetServiceProvidersResponse getServiceProvidersResponse11 = null;
	                        axis2.apache.org.xsd.GetServiceProviders wrappedParam =
                                                             (axis2.apache.org.xsd.GetServiceProviders)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    axis2.apache.org.xsd.GetServiceProviders.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getServiceProvidersResponse11 =
                                                   
                                                   
                                                         skel.getServiceProviders(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getServiceProvidersResponse11, false, new javax.xml.namespace.QName("http://saml.sso.identity.carbon.wso2.org",
                                                    "getServiceProviders"));
                                    } else 

            if("getCertAliasOfPrimaryKeyStore".equals(methodName)){
                
                axis2.apache.org.xsd.GetCertAliasOfPrimaryKeyStoreResponse getCertAliasOfPrimaryKeyStoreResponse13 = null;
	                        axis2.apache.org.xsd.GetCertAliasOfPrimaryKeyStore wrappedParam =
                                                             (axis2.apache.org.xsd.GetCertAliasOfPrimaryKeyStore)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    axis2.apache.org.xsd.GetCertAliasOfPrimaryKeyStore.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getCertAliasOfPrimaryKeyStoreResponse13 =
                                                   
                                                   
                                                         skel.getCertAliasOfPrimaryKeyStore(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getCertAliasOfPrimaryKeyStoreResponse13, false, new javax.xml.namespace.QName("http://saml.sso.identity.carbon.wso2.org",
                                                    "getCertAliasOfPrimaryKeyStore"));
                                    } else 

            if("addRPServiceProvider".equals(methodName)){
                
                axis2.apache.org.xsd.AddRPServiceProviderResponse addRPServiceProviderResponse15 = null;
	                        axis2.apache.org.xsd.AddRPServiceProvider wrappedParam =
                                                             (axis2.apache.org.xsd.AddRPServiceProvider)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    axis2.apache.org.xsd.AddRPServiceProvider.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               addRPServiceProviderResponse15 =
                                                   
                                                   
                                                         skel.addRPServiceProvider(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), addRPServiceProviderResponse15, false, new javax.xml.namespace.QName("http://saml.sso.identity.carbon.wso2.org",
                                                    "addRPServiceProvider"));
                                    
            } else {
              throw new java.lang.RuntimeException("method not found");
            }
        

        newMsgContext.setEnvelope(envelope);
        }
        } catch (IdentitySAMLSSOConfigServiceIdentityException e) {

            msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME,"IdentitySAMLSSOConfigServiceIdentityException");
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
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.RemoveServiceProvider param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.RemoveServiceProvider.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.RemoveServiceProviderResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.RemoveServiceProviderResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.IdentitySAMLSSOConfigServiceIdentityException param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.IdentitySAMLSSOConfigServiceIdentityException.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.GetServiceProviders param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.GetServiceProviders.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.GetServiceProvidersResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.GetServiceProvidersResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.GetCertAliasOfPrimaryKeyStore param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.GetCertAliasOfPrimaryKeyStore.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.GetCertAliasOfPrimaryKeyStoreResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.GetCertAliasOfPrimaryKeyStoreResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.AddRPServiceProvider param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.AddRPServiceProvider.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.AddRPServiceProviderResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.AddRPServiceProviderResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, axis2.apache.org.xsd.RemoveServiceProviderResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(axis2.apache.org.xsd.RemoveServiceProviderResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private axis2.apache.org.xsd.RemoveServiceProviderResponse wrapremoveServiceProvider(){
                                axis2.apache.org.xsd.RemoveServiceProviderResponse wrappedElement = new axis2.apache.org.xsd.RemoveServiceProviderResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, axis2.apache.org.xsd.GetServiceProvidersResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(axis2.apache.org.xsd.GetServiceProvidersResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private axis2.apache.org.xsd.GetServiceProvidersResponse wrapgetServiceProviders(){
                                axis2.apache.org.xsd.GetServiceProvidersResponse wrappedElement = new axis2.apache.org.xsd.GetServiceProvidersResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, axis2.apache.org.xsd.GetCertAliasOfPrimaryKeyStoreResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(axis2.apache.org.xsd.GetCertAliasOfPrimaryKeyStoreResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private axis2.apache.org.xsd.GetCertAliasOfPrimaryKeyStoreResponse wrapgetCertAliasOfPrimaryKeyStore(){
                                axis2.apache.org.xsd.GetCertAliasOfPrimaryKeyStoreResponse wrappedElement = new axis2.apache.org.xsd.GetCertAliasOfPrimaryKeyStoreResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, axis2.apache.org.xsd.AddRPServiceProviderResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(axis2.apache.org.xsd.AddRPServiceProviderResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private axis2.apache.org.xsd.AddRPServiceProviderResponse wrapaddRPServiceProvider(){
                                axis2.apache.org.xsd.AddRPServiceProviderResponse wrappedElement = new axis2.apache.org.xsd.AddRPServiceProviderResponse();
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
        
                if (axis2.apache.org.xsd.RemoveServiceProvider.class.equals(type)){
                
                           return axis2.apache.org.xsd.RemoveServiceProvider.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.RemoveServiceProviderResponse.class.equals(type)){
                
                           return axis2.apache.org.xsd.RemoveServiceProviderResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.IdentitySAMLSSOConfigServiceIdentityException.class.equals(type)){
                
                           return axis2.apache.org.xsd.IdentitySAMLSSOConfigServiceIdentityException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.GetServiceProviders.class.equals(type)){
                
                           return axis2.apache.org.xsd.GetServiceProviders.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.GetServiceProvidersResponse.class.equals(type)){
                
                           return axis2.apache.org.xsd.GetServiceProvidersResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.IdentitySAMLSSOConfigServiceIdentityException.class.equals(type)){
                
                           return axis2.apache.org.xsd.IdentitySAMLSSOConfigServiceIdentityException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.GetCertAliasOfPrimaryKeyStore.class.equals(type)){
                
                           return axis2.apache.org.xsd.GetCertAliasOfPrimaryKeyStore.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.GetCertAliasOfPrimaryKeyStoreResponse.class.equals(type)){
                
                           return axis2.apache.org.xsd.GetCertAliasOfPrimaryKeyStoreResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.IdentitySAMLSSOConfigServiceIdentityException.class.equals(type)){
                
                           return axis2.apache.org.xsd.IdentitySAMLSSOConfigServiceIdentityException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.AddRPServiceProvider.class.equals(type)){
                
                           return axis2.apache.org.xsd.AddRPServiceProvider.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.AddRPServiceProviderResponse.class.equals(type)){
                
                           return axis2.apache.org.xsd.AddRPServiceProviderResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.IdentitySAMLSSOConfigServiceIdentityException.class.equals(type)){
                
                           return axis2.apache.org.xsd.IdentitySAMLSSOConfigServiceIdentityException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

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
    
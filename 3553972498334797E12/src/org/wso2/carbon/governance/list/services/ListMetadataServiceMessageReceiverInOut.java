
/**
 * ListMetadataServiceMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */
        package org.wso2.carbon.governance.list.services;

        /**
        *  ListMetadataServiceMessageReceiverInOut message receiver
        */

        public class ListMetadataServiceMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        ListMetadataServiceSkeletonInterface skel = (ListMetadataServiceSkeletonInterface)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){


        

            if("listschema".equals(methodName)){
                
                org.wso2.carbon.governance.list.services.ListschemaResponse listschemaResponse9 = null;
	                        org.wso2.carbon.governance.list.services.Listschema wrappedParam =
                                                             (org.wso2.carbon.governance.list.services.Listschema)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.governance.list.services.Listschema.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               listschemaResponse9 =
                                                   
                                                   
                                                         skel.listschema(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), listschemaResponse9, false, new javax.xml.namespace.QName("http://services.list.governance.carbon.wso2.org",
                                                    "listschema"));
                                    } else 

            if("listpolicies".equals(methodName)){
                
                org.wso2.carbon.governance.list.services.ListpoliciesResponse listpoliciesResponse11 = null;
	                        org.wso2.carbon.governance.list.services.Listpolicies wrappedParam =
                                                             (org.wso2.carbon.governance.list.services.Listpolicies)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.governance.list.services.Listpolicies.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               listpoliciesResponse11 =
                                                   
                                                   
                                                         skel.listpolicies(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), listpoliciesResponse11, false, new javax.xml.namespace.QName("http://services.list.governance.carbon.wso2.org",
                                                    "listpolicies"));
                                    } else 

            if("listwsdls".equals(methodName)){
                
                org.wso2.carbon.governance.list.services.ListwsdlsResponse listwsdlsResponse13 = null;
	                        org.wso2.carbon.governance.list.services.Listwsdls wrappedParam =
                                                             (org.wso2.carbon.governance.list.services.Listwsdls)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.governance.list.services.Listwsdls.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               listwsdlsResponse13 =
                                                   
                                                   
                                                         skel.listwsdls(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), listwsdlsResponse13, false, new javax.xml.namespace.QName("http://services.list.governance.carbon.wso2.org",
                                                    "listwsdls"));
                                    } else 

            if("listservices".equals(methodName)){
                
                org.wso2.carbon.governance.list.services.ListservicesResponse listservicesResponse15 = null;
	                        org.wso2.carbon.governance.list.services.Listservices wrappedParam =
                                                             (org.wso2.carbon.governance.list.services.Listservices)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.governance.list.services.Listservices.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               listservicesResponse15 =
                                                   
                                                   
                                                         skel.listservices(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), listservicesResponse15, false, new javax.xml.namespace.QName("http://services.list.governance.carbon.wso2.org",
                                                    "listservices"));
                                    
            } else {
              throw new java.lang.RuntimeException("method not found");
            }
        

        newMsgContext.setEnvelope(envelope);
        }
        } catch (ListMetadataServiceRegistryExceptionException e) {

            msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME,"ListMetadataServiceRegistryException");
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
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.governance.list.services.Listschema param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.governance.list.services.Listschema.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.governance.list.services.ListschemaResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.governance.list.services.ListschemaResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.governance.list.services.ListMetadataServiceRegistryException param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.governance.list.services.ListMetadataServiceRegistryException.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.governance.list.services.Listpolicies param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.governance.list.services.Listpolicies.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.governance.list.services.ListpoliciesResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.governance.list.services.ListpoliciesResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.governance.list.services.Listwsdls param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.governance.list.services.Listwsdls.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.governance.list.services.ListwsdlsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.governance.list.services.ListwsdlsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.governance.list.services.Listservices param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.governance.list.services.Listservices.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.governance.list.services.ListservicesResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.governance.list.services.ListservicesResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.governance.list.services.ListschemaResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.governance.list.services.ListschemaResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.governance.list.services.ListschemaResponse wraplistschema(){
                                org.wso2.carbon.governance.list.services.ListschemaResponse wrappedElement = new org.wso2.carbon.governance.list.services.ListschemaResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.governance.list.services.ListpoliciesResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.governance.list.services.ListpoliciesResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.governance.list.services.ListpoliciesResponse wraplistpolicies(){
                                org.wso2.carbon.governance.list.services.ListpoliciesResponse wrappedElement = new org.wso2.carbon.governance.list.services.ListpoliciesResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.governance.list.services.ListwsdlsResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.governance.list.services.ListwsdlsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.governance.list.services.ListwsdlsResponse wraplistwsdls(){
                                org.wso2.carbon.governance.list.services.ListwsdlsResponse wrappedElement = new org.wso2.carbon.governance.list.services.ListwsdlsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.governance.list.services.ListservicesResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.governance.list.services.ListservicesResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.governance.list.services.ListservicesResponse wraplistservices(){
                                org.wso2.carbon.governance.list.services.ListservicesResponse wrappedElement = new org.wso2.carbon.governance.list.services.ListservicesResponse();
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
        
                if (org.wso2.carbon.governance.list.services.Listschema.class.equals(type)){
                
                           return org.wso2.carbon.governance.list.services.Listschema.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.governance.list.services.ListschemaResponse.class.equals(type)){
                
                           return org.wso2.carbon.governance.list.services.ListschemaResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.governance.list.services.ListMetadataServiceRegistryException.class.equals(type)){
                
                           return org.wso2.carbon.governance.list.services.ListMetadataServiceRegistryException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.governance.list.services.Listpolicies.class.equals(type)){
                
                           return org.wso2.carbon.governance.list.services.Listpolicies.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.governance.list.services.ListpoliciesResponse.class.equals(type)){
                
                           return org.wso2.carbon.governance.list.services.ListpoliciesResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.governance.list.services.ListMetadataServiceRegistryException.class.equals(type)){
                
                           return org.wso2.carbon.governance.list.services.ListMetadataServiceRegistryException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.governance.list.services.Listwsdls.class.equals(type)){
                
                           return org.wso2.carbon.governance.list.services.Listwsdls.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.governance.list.services.ListwsdlsResponse.class.equals(type)){
                
                           return org.wso2.carbon.governance.list.services.ListwsdlsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.governance.list.services.ListMetadataServiceRegistryException.class.equals(type)){
                
                           return org.wso2.carbon.governance.list.services.ListMetadataServiceRegistryException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.governance.list.services.Listservices.class.equals(type)){
                
                           return org.wso2.carbon.governance.list.services.Listservices.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.governance.list.services.ListservicesResponse.class.equals(type)){
                
                           return org.wso2.carbon.governance.list.services.ListservicesResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.governance.list.services.ListMetadataServiceRegistryException.class.equals(type)){
                
                           return org.wso2.carbon.governance.list.services.ListMetadataServiceRegistryException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

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
    
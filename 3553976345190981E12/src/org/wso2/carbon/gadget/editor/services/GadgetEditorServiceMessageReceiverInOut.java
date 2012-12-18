
/**
 * GadgetEditorServiceMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */
        package org.wso2.carbon.gadget.editor.services;

        /**
        *  GadgetEditorServiceMessageReceiverInOut message receiver
        */

        public class GadgetEditorServiceMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        GadgetEditorServiceSkeletonInterface skel = (GadgetEditorServiceSkeletonInterface)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){


        

            if("saveGadget".equals(methodName)){
                
                org.wso2.carbon.gadget.editor.services.SaveGadgetResponse saveGadgetResponse9 = null;
	                        org.wso2.carbon.gadget.editor.services.SaveGadget wrappedParam =
                                                             (org.wso2.carbon.gadget.editor.services.SaveGadget)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.gadget.editor.services.SaveGadget.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               saveGadgetResponse9 =
                                                   
                                                   
                                                         skel.saveGadget(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), saveGadgetResponse9, false, new javax.xml.namespace.QName("http://services.editor.gadget.carbon.wso2.org",
                                                    "saveGadget"));
                                    } else 

            if("openGadget".equals(methodName)){
                
                org.wso2.carbon.gadget.editor.services.OpenGadgetResponse openGadgetResponse11 = null;
	                        org.wso2.carbon.gadget.editor.services.OpenGadget wrappedParam =
                                                             (org.wso2.carbon.gadget.editor.services.OpenGadget)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.gadget.editor.services.OpenGadget.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               openGadgetResponse11 =
                                                   
                                                   
                                                         skel.openGadget(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), openGadgetResponse11, false, new javax.xml.namespace.QName("http://services.editor.gadget.carbon.wso2.org",
                                                    "openGadget"));
                                    } else 

            if("isResourceExist".equals(methodName)){
                
                org.wso2.carbon.gadget.editor.services.IsResourceExistResponse isResourceExistResponse13 = null;
	                        org.wso2.carbon.gadget.editor.services.IsResourceExist wrappedParam =
                                                             (org.wso2.carbon.gadget.editor.services.IsResourceExist)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.gadget.editor.services.IsResourceExist.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               isResourceExistResponse13 =
                                                   
                                                   
                                                         skel.isResourceExist(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), isResourceExistResponse13, false, new javax.xml.namespace.QName("http://services.editor.gadget.carbon.wso2.org",
                                                    "isResourceExist"));
                                    } else 

            if("getImmediateChildResources".equals(methodName)){
                
                org.wso2.carbon.gadget.editor.services.GetImmediateChildResourcesResponse getImmediateChildResourcesResponse15 = null;
	                        org.wso2.carbon.gadget.editor.services.GetImmediateChildResources wrappedParam =
                                                             (org.wso2.carbon.gadget.editor.services.GetImmediateChildResources)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.gadget.editor.services.GetImmediateChildResources.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getImmediateChildResourcesResponse15 =
                                                   
                                                   
                                                         skel.getImmediateChildResources(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getImmediateChildResourcesResponse15, false, new javax.xml.namespace.QName("http://services.editor.gadget.carbon.wso2.org",
                                                    "getImmediateChildResources"));
                                    
            } else {
              throw new java.lang.RuntimeException("method not found");
            }
        

        newMsgContext.setEnvelope(envelope);
        }
        } catch (GadgetEditorServiceRegistryExceptionException e) {

            msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME,"GadgetEditorServiceRegistryException");
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
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.gadget.editor.services.SaveGadget param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.gadget.editor.services.SaveGadget.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.gadget.editor.services.SaveGadgetResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.gadget.editor.services.SaveGadgetResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.gadget.editor.services.GadgetEditorServiceRegistryException param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.gadget.editor.services.GadgetEditorServiceRegistryException.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.gadget.editor.services.OpenGadget param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.gadget.editor.services.OpenGadget.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.gadget.editor.services.OpenGadgetResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.gadget.editor.services.OpenGadgetResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.gadget.editor.services.IsResourceExist param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.gadget.editor.services.IsResourceExist.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.gadget.editor.services.IsResourceExistResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.gadget.editor.services.IsResourceExistResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.gadget.editor.services.GetImmediateChildResources param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.gadget.editor.services.GetImmediateChildResources.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.gadget.editor.services.GetImmediateChildResourcesResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.gadget.editor.services.GetImmediateChildResourcesResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.gadget.editor.services.SaveGadgetResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.gadget.editor.services.SaveGadgetResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.gadget.editor.services.SaveGadgetResponse wrapsaveGadget(){
                                org.wso2.carbon.gadget.editor.services.SaveGadgetResponse wrappedElement = new org.wso2.carbon.gadget.editor.services.SaveGadgetResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.gadget.editor.services.OpenGadgetResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.gadget.editor.services.OpenGadgetResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.gadget.editor.services.OpenGadgetResponse wrapopenGadget(){
                                org.wso2.carbon.gadget.editor.services.OpenGadgetResponse wrappedElement = new org.wso2.carbon.gadget.editor.services.OpenGadgetResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.gadget.editor.services.IsResourceExistResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.gadget.editor.services.IsResourceExistResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.gadget.editor.services.IsResourceExistResponse wrapisResourceExist(){
                                org.wso2.carbon.gadget.editor.services.IsResourceExistResponse wrappedElement = new org.wso2.carbon.gadget.editor.services.IsResourceExistResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.gadget.editor.services.GetImmediateChildResourcesResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.gadget.editor.services.GetImmediateChildResourcesResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.gadget.editor.services.GetImmediateChildResourcesResponse wrapgetImmediateChildResources(){
                                org.wso2.carbon.gadget.editor.services.GetImmediateChildResourcesResponse wrappedElement = new org.wso2.carbon.gadget.editor.services.GetImmediateChildResourcesResponse();
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
        
                if (org.wso2.carbon.gadget.editor.services.SaveGadget.class.equals(type)){
                
                           return org.wso2.carbon.gadget.editor.services.SaveGadget.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.gadget.editor.services.SaveGadgetResponse.class.equals(type)){
                
                           return org.wso2.carbon.gadget.editor.services.SaveGadgetResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.gadget.editor.services.GadgetEditorServiceRegistryException.class.equals(type)){
                
                           return org.wso2.carbon.gadget.editor.services.GadgetEditorServiceRegistryException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.gadget.editor.services.OpenGadget.class.equals(type)){
                
                           return org.wso2.carbon.gadget.editor.services.OpenGadget.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.gadget.editor.services.OpenGadgetResponse.class.equals(type)){
                
                           return org.wso2.carbon.gadget.editor.services.OpenGadgetResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.gadget.editor.services.GadgetEditorServiceRegistryException.class.equals(type)){
                
                           return org.wso2.carbon.gadget.editor.services.GadgetEditorServiceRegistryException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.gadget.editor.services.IsResourceExist.class.equals(type)){
                
                           return org.wso2.carbon.gadget.editor.services.IsResourceExist.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.gadget.editor.services.IsResourceExistResponse.class.equals(type)){
                
                           return org.wso2.carbon.gadget.editor.services.IsResourceExistResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.gadget.editor.services.GetImmediateChildResources.class.equals(type)){
                
                           return org.wso2.carbon.gadget.editor.services.GetImmediateChildResources.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.gadget.editor.services.GetImmediateChildResourcesResponse.class.equals(type)){
                
                           return org.wso2.carbon.gadget.editor.services.GetImmediateChildResourcesResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

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
    
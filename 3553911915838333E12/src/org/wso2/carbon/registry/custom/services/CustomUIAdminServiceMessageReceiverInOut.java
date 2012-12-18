
/**
 * CustomUIAdminServiceMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */
        package org.wso2.carbon.registry.custom.services;

        /**
        *  CustomUIAdminServiceMessageReceiverInOut message receiver
        */

        public class CustomUIAdminServiceMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        CustomUIAdminServiceSkeletonInterface skel = (CustomUIAdminServiceSkeletonInterface)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){


        

            if("getTextContent".equals(methodName)){
                
                org.wso2.carbon.registry.custom.services.GetTextContentResponse getTextContentResponse9 = null;
	                        org.wso2.carbon.registry.custom.services.GetTextContent wrappedParam =
                                                             (org.wso2.carbon.registry.custom.services.GetTextContent)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.registry.custom.services.GetTextContent.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getTextContentResponse9 =
                                                   
                                                   
                                                         skel.getTextContent(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getTextContentResponse9, false, new javax.xml.namespace.QName("http://services.custom.registry.carbon.wso2.org",
                                                    "getTextContent"));
                                    } else 

            if("isAuthorized".equals(methodName)){
                
                org.wso2.carbon.registry.custom.services.IsAuthorizedResponse isAuthorizedResponse11 = null;
	                        org.wso2.carbon.registry.custom.services.IsAuthorized wrappedParam =
                                                             (org.wso2.carbon.registry.custom.services.IsAuthorized)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.registry.custom.services.IsAuthorized.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               isAuthorizedResponse11 =
                                                   
                                                   
                                                         skel.isAuthorized(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), isAuthorizedResponse11, false, new javax.xml.namespace.QName("http://services.custom.registry.carbon.wso2.org",
                                                    "isAuthorized"));
                                    } else 

            if("addTextContent".equals(methodName)){
                
                org.wso2.carbon.registry.custom.services.AddTextContentResponse addTextContentResponse13 = null;
	                        org.wso2.carbon.registry.custom.services.AddTextContent wrappedParam =
                                                             (org.wso2.carbon.registry.custom.services.AddTextContent)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.registry.custom.services.AddTextContent.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               addTextContentResponse13 =
                                                   
                                                   
                                                         skel.addTextContent(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), addTextContentResponse13, false, new javax.xml.namespace.QName("http://services.custom.registry.carbon.wso2.org",
                                                    "addTextContent"));
                                    } else 

            if("updateTextContent".equals(methodName)){
                
                org.wso2.carbon.registry.custom.services.UpdateTextContentResponse updateTextContentResponse15 = null;
	                        org.wso2.carbon.registry.custom.services.UpdateTextContent wrappedParam =
                                                             (org.wso2.carbon.registry.custom.services.UpdateTextContent)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.registry.custom.services.UpdateTextContent.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               updateTextContentResponse15 =
                                                   
                                                   
                                                         skel.updateTextContent(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), updateTextContentResponse15, false, new javax.xml.namespace.QName("http://services.custom.registry.carbon.wso2.org",
                                                    "updateTextContent"));
                                    
            } else {
              throw new java.lang.RuntimeException("method not found");
            }
        

        newMsgContext.setEnvelope(envelope);
        }
        } catch (CustomUIAdminServiceExceptionException e) {

            msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME,"CustomUIAdminServiceException");
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
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.custom.services.GetTextContent param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.custom.services.GetTextContent.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.custom.services.GetTextContentResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.custom.services.GetTextContentResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.custom.services.CustomUIAdminServiceException param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.custom.services.CustomUIAdminServiceException.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.custom.services.IsAuthorized param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.custom.services.IsAuthorized.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.custom.services.IsAuthorizedResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.custom.services.IsAuthorizedResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.custom.services.AddTextContent param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.custom.services.AddTextContent.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.custom.services.AddTextContentResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.custom.services.AddTextContentResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.custom.services.UpdateTextContent param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.custom.services.UpdateTextContent.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.custom.services.UpdateTextContentResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.custom.services.UpdateTextContentResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.registry.custom.services.GetTextContentResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.registry.custom.services.GetTextContentResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.registry.custom.services.GetTextContentResponse wrapgetTextContent(){
                                org.wso2.carbon.registry.custom.services.GetTextContentResponse wrappedElement = new org.wso2.carbon.registry.custom.services.GetTextContentResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.registry.custom.services.IsAuthorizedResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.registry.custom.services.IsAuthorizedResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.registry.custom.services.IsAuthorizedResponse wrapisAuthorized(){
                                org.wso2.carbon.registry.custom.services.IsAuthorizedResponse wrappedElement = new org.wso2.carbon.registry.custom.services.IsAuthorizedResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.registry.custom.services.AddTextContentResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.registry.custom.services.AddTextContentResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.registry.custom.services.AddTextContentResponse wrapaddTextContent(){
                                org.wso2.carbon.registry.custom.services.AddTextContentResponse wrappedElement = new org.wso2.carbon.registry.custom.services.AddTextContentResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.registry.custom.services.UpdateTextContentResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.registry.custom.services.UpdateTextContentResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.registry.custom.services.UpdateTextContentResponse wrapupdateTextContent(){
                                org.wso2.carbon.registry.custom.services.UpdateTextContentResponse wrappedElement = new org.wso2.carbon.registry.custom.services.UpdateTextContentResponse();
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
        
                if (org.wso2.carbon.registry.custom.services.GetTextContent.class.equals(type)){
                
                           return org.wso2.carbon.registry.custom.services.GetTextContent.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.custom.services.GetTextContentResponse.class.equals(type)){
                
                           return org.wso2.carbon.registry.custom.services.GetTextContentResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.custom.services.CustomUIAdminServiceException.class.equals(type)){
                
                           return org.wso2.carbon.registry.custom.services.CustomUIAdminServiceException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.custom.services.IsAuthorized.class.equals(type)){
                
                           return org.wso2.carbon.registry.custom.services.IsAuthorized.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.custom.services.IsAuthorizedResponse.class.equals(type)){
                
                           return org.wso2.carbon.registry.custom.services.IsAuthorizedResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.custom.services.AddTextContent.class.equals(type)){
                
                           return org.wso2.carbon.registry.custom.services.AddTextContent.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.custom.services.AddTextContentResponse.class.equals(type)){
                
                           return org.wso2.carbon.registry.custom.services.AddTextContentResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.custom.services.CustomUIAdminServiceException.class.equals(type)){
                
                           return org.wso2.carbon.registry.custom.services.CustomUIAdminServiceException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.custom.services.UpdateTextContent.class.equals(type)){
                
                           return org.wso2.carbon.registry.custom.services.UpdateTextContent.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.custom.services.UpdateTextContentResponse.class.equals(type)){
                
                           return org.wso2.carbon.registry.custom.services.UpdateTextContentResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.custom.services.CustomUIAdminServiceException.class.equals(type)){
                
                           return org.wso2.carbon.registry.custom.services.CustomUIAdminServiceException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

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
    
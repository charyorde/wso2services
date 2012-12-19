
/**
 * GadgetContentServiceMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */
        package org.wso2.carbon.dashboard;

        /**
        *  GadgetContentServiceMessageReceiverInOut message receiver
        */

        public class GadgetContentServiceMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        GadgetContentServiceSkeletonInterface skel = (GadgetContentServiceSkeletonInterface)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){


        

            if("getContentDownloadBean".equals(methodName)){
                
                wsf.wso2.org.tools.GetContentDownloadBeanResponse getContentDownloadBeanResponse5 = null;
	                        wsf.wso2.org.tools.GetContentDownloadBean wrappedParam =
                                                             (wsf.wso2.org.tools.GetContentDownloadBean)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    wsf.wso2.org.tools.GetContentDownloadBean.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getContentDownloadBeanResponse5 =
                                                   
                                                   
                                                         skel.getContentDownloadBean(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getContentDownloadBeanResponse5, false, new javax.xml.namespace.QName("http://dashboard.carbon.wso2.org",
                                                    "getContentDownloadBean"));
                                    } else 

            if("getRootRegistry".equals(methodName)){
                
                wsf.wso2.org.tools.GetRootRegistryResponse getRootRegistryResponse7 = null;
	                        wsf.wso2.org.tools.GetRootRegistry wrappedParam =
                                                             (wsf.wso2.org.tools.GetRootRegistry)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    wsf.wso2.org.tools.GetRootRegistry.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getRootRegistryResponse7 =
                                                   
                                                   
                                                         skel.getRootRegistry(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getRootRegistryResponse7, false, new javax.xml.namespace.QName("http://dashboard.carbon.wso2.org",
                                                    "getRootRegistry"));
                                    
            } else {
              throw new java.lang.RuntimeException("method not found");
            }
        

        newMsgContext.setEnvelope(envelope);
        }
        } catch (GadgetContentServiceException e) {

            msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME,"GadgetContentServiceException");
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
            private  org.apache.axiom.om.OMElement  toOM(wsf.wso2.org.tools.GetContentDownloadBean param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(wsf.wso2.org.tools.GetContentDownloadBean.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(wsf.wso2.org.tools.GetContentDownloadBeanResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(wsf.wso2.org.tools.GetContentDownloadBeanResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(wsf.wso2.org.tools.GadgetContentServiceException param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(wsf.wso2.org.tools.GadgetContentServiceException.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(wsf.wso2.org.tools.GetRootRegistry param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(wsf.wso2.org.tools.GetRootRegistry.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(wsf.wso2.org.tools.GetRootRegistryResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(wsf.wso2.org.tools.GetRootRegistryResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, wsf.wso2.org.tools.GetContentDownloadBeanResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(wsf.wso2.org.tools.GetContentDownloadBeanResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private wsf.wso2.org.tools.GetContentDownloadBeanResponse wrapgetContentDownloadBean(){
                                wsf.wso2.org.tools.GetContentDownloadBeanResponse wrappedElement = new wsf.wso2.org.tools.GetContentDownloadBeanResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, wsf.wso2.org.tools.GetRootRegistryResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(wsf.wso2.org.tools.GetRootRegistryResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private wsf.wso2.org.tools.GetRootRegistryResponse wrapgetRootRegistry(){
                                wsf.wso2.org.tools.GetRootRegistryResponse wrappedElement = new wsf.wso2.org.tools.GetRootRegistryResponse();
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
        
                if (wsf.wso2.org.tools.GetContentDownloadBean.class.equals(type)){
                
                           return wsf.wso2.org.tools.GetContentDownloadBean.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (wsf.wso2.org.tools.GetContentDownloadBeanResponse.class.equals(type)){
                
                           return wsf.wso2.org.tools.GetContentDownloadBeanResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (wsf.wso2.org.tools.GadgetContentServiceException.class.equals(type)){
                
                           return wsf.wso2.org.tools.GadgetContentServiceException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (wsf.wso2.org.tools.GetRootRegistry.class.equals(type)){
                
                           return wsf.wso2.org.tools.GetRootRegistry.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (wsf.wso2.org.tools.GetRootRegistryResponse.class.equals(type)){
                
                           return wsf.wso2.org.tools.GetRootRegistryResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (wsf.wso2.org.tools.GadgetContentServiceException.class.equals(type)){
                
                           return wsf.wso2.org.tools.GadgetContentServiceException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

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
    
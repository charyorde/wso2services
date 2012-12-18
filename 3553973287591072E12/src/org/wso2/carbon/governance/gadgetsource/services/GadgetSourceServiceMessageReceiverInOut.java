
/**
 * GadgetSourceServiceMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */
        package org.wso2.carbon.governance.gadgetsource.services;

        /**
        *  GadgetSourceServiceMessageReceiverInOut message receiver
        */

        public class GadgetSourceServiceMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        GadgetSourceServiceSkeletonInterface skel = (GadgetSourceServiceSkeletonInterface)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){


        

            if("getLifecyclePiechartGadgetData".equals(methodName)){
                
                org.wso2.carbon.governance.gadgetsource.services.GetLifecyclePiechartGadgetDataResponse getLifecyclePiechartGadgetDataResponse9 = null;
	                        org.wso2.carbon.governance.gadgetsource.services.GetLifecyclePiechartGadgetData wrappedParam =
                                                             (org.wso2.carbon.governance.gadgetsource.services.GetLifecyclePiechartGadgetData)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.governance.gadgetsource.services.GetLifecyclePiechartGadgetData.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getLifecyclePiechartGadgetDataResponse9 =
                                                   
                                                   
                                                         skel.getLifecyclePiechartGadgetData(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getLifecyclePiechartGadgetDataResponse9, false, new javax.xml.namespace.QName("http://services.gadgetsource.governance.carbon.wso2.org",
                                                    "getLifecyclePiechartGadgetData"));
                                    } else 

            if("getServiceInfoGadgetData".equals(methodName)){
                
                org.wso2.carbon.governance.gadgetsource.services.GetServiceInfoGadgetDataResponse getServiceInfoGadgetDataResponse11 = null;
	                        org.wso2.carbon.governance.gadgetsource.services.GetServiceInfoGadgetData wrappedParam =
                                                             (org.wso2.carbon.governance.gadgetsource.services.GetServiceInfoGadgetData)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.governance.gadgetsource.services.GetServiceInfoGadgetData.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getServiceInfoGadgetDataResponse11 =
                                                   
                                                   
                                                         skel.getServiceInfoGadgetData(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getServiceInfoGadgetDataResponse11, false, new javax.xml.namespace.QName("http://services.gadgetsource.governance.carbon.wso2.org",
                                                    "getServiceInfoGadgetData"));
                                    } else 

            if("getSchemaSharingInfoGadgetData".equals(methodName)){
                
                org.wso2.carbon.governance.gadgetsource.services.GetSchemaSharingInfoGadgetDataResponse getSchemaSharingInfoGadgetDataResponse13 = null;
	                        org.wso2.carbon.governance.gadgetsource.services.GetSchemaSharingInfoGadgetData wrappedParam =
                                                             (org.wso2.carbon.governance.gadgetsource.services.GetSchemaSharingInfoGadgetData)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.governance.gadgetsource.services.GetSchemaSharingInfoGadgetData.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getSchemaSharingInfoGadgetDataResponse13 =
                                                   
                                                   
                                                         skel.getSchemaSharingInfoGadgetData(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getSchemaSharingInfoGadgetDataResponse13, false, new javax.xml.namespace.QName("http://services.gadgetsource.governance.carbon.wso2.org",
                                                    "getSchemaSharingInfoGadgetData"));
                                    } else 

            if("getServiceVersionHistogramGadgetData".equals(methodName)){
                
                org.wso2.carbon.governance.gadgetsource.services.GetServiceVersionHistogramGadgetDataResponse getServiceVersionHistogramGadgetDataResponse15 = null;
	                        org.wso2.carbon.governance.gadgetsource.services.GetServiceVersionHistogramGadgetData wrappedParam =
                                                             (org.wso2.carbon.governance.gadgetsource.services.GetServiceVersionHistogramGadgetData)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.governance.gadgetsource.services.GetServiceVersionHistogramGadgetData.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getServiceVersionHistogramGadgetDataResponse15 =
                                                   
                                                   
                                                         skel.getServiceVersionHistogramGadgetData(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getServiceVersionHistogramGadgetDataResponse15, false, new javax.xml.namespace.QName("http://services.gadgetsource.governance.carbon.wso2.org",
                                                    "getServiceVersionHistogramGadgetData"));
                                    
            } else {
              throw new java.lang.RuntimeException("method not found");
            }
        

        newMsgContext.setEnvelope(envelope);
        }
        } catch (GadgetSourceServiceRegistryExceptionException e) {

            msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME,"GadgetSourceServiceRegistryException");
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
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.governance.gadgetsource.services.GetLifecyclePiechartGadgetData param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.governance.gadgetsource.services.GetLifecyclePiechartGadgetData.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.governance.gadgetsource.services.GetLifecyclePiechartGadgetDataResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.governance.gadgetsource.services.GetLifecyclePiechartGadgetDataResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.governance.gadgetsource.services.GadgetSourceServiceRegistryException param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.governance.gadgetsource.services.GadgetSourceServiceRegistryException.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.governance.gadgetsource.services.GetServiceInfoGadgetData param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.governance.gadgetsource.services.GetServiceInfoGadgetData.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.governance.gadgetsource.services.GetServiceInfoGadgetDataResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.governance.gadgetsource.services.GetServiceInfoGadgetDataResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.governance.gadgetsource.services.GetSchemaSharingInfoGadgetData param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.governance.gadgetsource.services.GetSchemaSharingInfoGadgetData.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.governance.gadgetsource.services.GetSchemaSharingInfoGadgetDataResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.governance.gadgetsource.services.GetSchemaSharingInfoGadgetDataResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.governance.gadgetsource.services.GetServiceVersionHistogramGadgetData param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.governance.gadgetsource.services.GetServiceVersionHistogramGadgetData.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.governance.gadgetsource.services.GetServiceVersionHistogramGadgetDataResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.governance.gadgetsource.services.GetServiceVersionHistogramGadgetDataResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.governance.gadgetsource.services.GetLifecyclePiechartGadgetDataResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.governance.gadgetsource.services.GetLifecyclePiechartGadgetDataResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.governance.gadgetsource.services.GetLifecyclePiechartGadgetDataResponse wrapgetLifecyclePiechartGadgetData(){
                                org.wso2.carbon.governance.gadgetsource.services.GetLifecyclePiechartGadgetDataResponse wrappedElement = new org.wso2.carbon.governance.gadgetsource.services.GetLifecyclePiechartGadgetDataResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.governance.gadgetsource.services.GetServiceInfoGadgetDataResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.governance.gadgetsource.services.GetServiceInfoGadgetDataResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.governance.gadgetsource.services.GetServiceInfoGadgetDataResponse wrapgetServiceInfoGadgetData(){
                                org.wso2.carbon.governance.gadgetsource.services.GetServiceInfoGadgetDataResponse wrappedElement = new org.wso2.carbon.governance.gadgetsource.services.GetServiceInfoGadgetDataResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.governance.gadgetsource.services.GetSchemaSharingInfoGadgetDataResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.governance.gadgetsource.services.GetSchemaSharingInfoGadgetDataResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.governance.gadgetsource.services.GetSchemaSharingInfoGadgetDataResponse wrapgetSchemaSharingInfoGadgetData(){
                                org.wso2.carbon.governance.gadgetsource.services.GetSchemaSharingInfoGadgetDataResponse wrappedElement = new org.wso2.carbon.governance.gadgetsource.services.GetSchemaSharingInfoGadgetDataResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.governance.gadgetsource.services.GetServiceVersionHistogramGadgetDataResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.governance.gadgetsource.services.GetServiceVersionHistogramGadgetDataResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.governance.gadgetsource.services.GetServiceVersionHistogramGadgetDataResponse wrapgetServiceVersionHistogramGadgetData(){
                                org.wso2.carbon.governance.gadgetsource.services.GetServiceVersionHistogramGadgetDataResponse wrappedElement = new org.wso2.carbon.governance.gadgetsource.services.GetServiceVersionHistogramGadgetDataResponse();
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
        
                if (org.wso2.carbon.governance.gadgetsource.services.GetLifecyclePiechartGadgetData.class.equals(type)){
                
                           return org.wso2.carbon.governance.gadgetsource.services.GetLifecyclePiechartGadgetData.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.governance.gadgetsource.services.GetLifecyclePiechartGadgetDataResponse.class.equals(type)){
                
                           return org.wso2.carbon.governance.gadgetsource.services.GetLifecyclePiechartGadgetDataResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.governance.gadgetsource.services.GadgetSourceServiceRegistryException.class.equals(type)){
                
                           return org.wso2.carbon.governance.gadgetsource.services.GadgetSourceServiceRegistryException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.governance.gadgetsource.services.GetServiceInfoGadgetData.class.equals(type)){
                
                           return org.wso2.carbon.governance.gadgetsource.services.GetServiceInfoGadgetData.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.governance.gadgetsource.services.GetServiceInfoGadgetDataResponse.class.equals(type)){
                
                           return org.wso2.carbon.governance.gadgetsource.services.GetServiceInfoGadgetDataResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.governance.gadgetsource.services.GetSchemaSharingInfoGadgetData.class.equals(type)){
                
                           return org.wso2.carbon.governance.gadgetsource.services.GetSchemaSharingInfoGadgetData.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.governance.gadgetsource.services.GetSchemaSharingInfoGadgetDataResponse.class.equals(type)){
                
                           return org.wso2.carbon.governance.gadgetsource.services.GetSchemaSharingInfoGadgetDataResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.governance.gadgetsource.services.GetServiceVersionHistogramGadgetData.class.equals(type)){
                
                           return org.wso2.carbon.governance.gadgetsource.services.GetServiceVersionHistogramGadgetData.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.governance.gadgetsource.services.GetServiceVersionHistogramGadgetDataResponse.class.equals(type)){
                
                           return org.wso2.carbon.governance.gadgetsource.services.GetServiceVersionHistogramGadgetDataResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

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
    
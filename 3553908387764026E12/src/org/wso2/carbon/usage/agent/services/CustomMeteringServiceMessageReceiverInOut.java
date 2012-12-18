
/**
 * CustomMeteringServiceMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */
        package org.wso2.carbon.usage.agent.services;

        /**
        *  CustomMeteringServiceMessageReceiverInOut message receiver
        */

        public class CustomMeteringServiceMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        CustomMeteringServiceSkeletonInterface skel = (CustomMeteringServiceSkeletonInterface)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){


        

            if("isUsageEntryExists".equals(methodName)){
                
                org.wso2.carbon.usage.agent.services.IsUsageEntryExistsResponse isUsageEntryExistsResponse10 = null;
	                        org.wso2.carbon.usage.agent.services.IsUsageEntryExists wrappedParam =
                                                             (org.wso2.carbon.usage.agent.services.IsUsageEntryExists)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.usage.agent.services.IsUsageEntryExists.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               isUsageEntryExistsResponse10 =
                                                   
                                                   
                                                         skel.isUsageEntryExists(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), isUsageEntryExistsResponse10, false, new javax.xml.namespace.QName("http://services.agent.usage.carbon.wso2.org",
                                                    "isUsageEntryExists"));
                                    } else 

            if("retrieveUsage".equals(methodName)){
                
                org.wso2.carbon.usage.agent.services.RetrieveUsageResponse retrieveUsageResponse12 = null;
	                        org.wso2.carbon.usage.agent.services.RetrieveUsage wrappedParam =
                                                             (org.wso2.carbon.usage.agent.services.RetrieveUsage)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.usage.agent.services.RetrieveUsage.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               retrieveUsageResponse12 =
                                                   
                                                   
                                                         skel.retrieveUsage(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), retrieveUsageResponse12, false, new javax.xml.namespace.QName("http://services.agent.usage.carbon.wso2.org",
                                                    "retrieveUsage"));
                                    } else 

            if("addUsage".equals(methodName)){
                
                org.wso2.carbon.usage.agent.services.AddUsageResponse addUsageResponse14 = null;
	                        org.wso2.carbon.usage.agent.services.AddUsage wrappedParam =
                                                             (org.wso2.carbon.usage.agent.services.AddUsage)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.usage.agent.services.AddUsage.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               addUsageResponse14 =
                                                   
                                                   
                                                         skel.addUsage(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), addUsageResponse14, false, new javax.xml.namespace.QName("http://services.agent.usage.carbon.wso2.org",
                                                    "addUsage"));
                                    } else 

            if("getRecordedDurations".equals(methodName)){
                
                org.wso2.carbon.usage.agent.services.GetRecordedDurationsResponse getRecordedDurationsResponse16 = null;
	                        org.wso2.carbon.usage.agent.services.GetRecordedDurations wrappedParam =
                                                             (org.wso2.carbon.usage.agent.services.GetRecordedDurations)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.usage.agent.services.GetRecordedDurations.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getRecordedDurationsResponse16 =
                                                   
                                                   
                                                         skel.getRecordedDurations(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getRecordedDurationsResponse16, false, new javax.xml.namespace.QName("http://services.agent.usage.carbon.wso2.org",
                                                    "getRecordedDurations"));
                                    
            } else {
              throw new java.lang.RuntimeException("method not found");
            }
        

        newMsgContext.setEnvelope(envelope);
        }
        } catch (CustomMeteringServiceExceptionException e) {

            msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME,"CustomMeteringServiceException");
            org.apache.axis2.AxisFault f = createAxisFault(e);
            if (e.getFaultMessage() != null){
                f.setDetail(toOM(e.getFaultMessage(),false));
            }
            throw f;
            }
         catch (CustomMeteringServiceUsageExceptionException e) {

            msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME,"CustomMeteringServiceUsageException");
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
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.usage.agent.services.IsUsageEntryExists param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.usage.agent.services.IsUsageEntryExists.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.usage.agent.services.IsUsageEntryExistsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.usage.agent.services.IsUsageEntryExistsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.usage.agent.services.CustomMeteringServiceException param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.usage.agent.services.CustomMeteringServiceException.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.usage.agent.services.RetrieveUsage param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.usage.agent.services.RetrieveUsage.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.usage.agent.services.RetrieveUsageResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.usage.agent.services.RetrieveUsageResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.usage.agent.services.CustomMeteringServiceUsageException param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.usage.agent.services.CustomMeteringServiceUsageException.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.usage.agent.services.AddUsage param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.usage.agent.services.AddUsage.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.usage.agent.services.AddUsageResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.usage.agent.services.AddUsageResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.usage.agent.services.PersistUsage param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.usage.agent.services.PersistUsage.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.usage.agent.services.GetRecordedDurations param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.usage.agent.services.GetRecordedDurations.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.usage.agent.services.GetRecordedDurationsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.usage.agent.services.GetRecordedDurationsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.usage.agent.services.IsUsageEntryExistsResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.usage.agent.services.IsUsageEntryExistsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.usage.agent.services.IsUsageEntryExistsResponse wrapisUsageEntryExists(){
                                org.wso2.carbon.usage.agent.services.IsUsageEntryExistsResponse wrappedElement = new org.wso2.carbon.usage.agent.services.IsUsageEntryExistsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.usage.agent.services.RetrieveUsageResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.usage.agent.services.RetrieveUsageResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.usage.agent.services.RetrieveUsageResponse wrapretrieveUsage(){
                                org.wso2.carbon.usage.agent.services.RetrieveUsageResponse wrappedElement = new org.wso2.carbon.usage.agent.services.RetrieveUsageResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.usage.agent.services.AddUsageResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.usage.agent.services.AddUsageResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.usage.agent.services.AddUsageResponse wrapaddUsage(){
                                org.wso2.carbon.usage.agent.services.AddUsageResponse wrappedElement = new org.wso2.carbon.usage.agent.services.AddUsageResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.usage.agent.services.GetRecordedDurationsResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.usage.agent.services.GetRecordedDurationsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.usage.agent.services.GetRecordedDurationsResponse wrapgetRecordedDurations(){
                                org.wso2.carbon.usage.agent.services.GetRecordedDurationsResponse wrappedElement = new org.wso2.carbon.usage.agent.services.GetRecordedDurationsResponse();
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
        
                if (org.wso2.carbon.usage.agent.services.IsUsageEntryExists.class.equals(type)){
                
                           return org.wso2.carbon.usage.agent.services.IsUsageEntryExists.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.usage.agent.services.IsUsageEntryExistsResponse.class.equals(type)){
                
                           return org.wso2.carbon.usage.agent.services.IsUsageEntryExistsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.usage.agent.services.CustomMeteringServiceException.class.equals(type)){
                
                           return org.wso2.carbon.usage.agent.services.CustomMeteringServiceException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.usage.agent.services.RetrieveUsage.class.equals(type)){
                
                           return org.wso2.carbon.usage.agent.services.RetrieveUsage.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.usage.agent.services.RetrieveUsageResponse.class.equals(type)){
                
                           return org.wso2.carbon.usage.agent.services.RetrieveUsageResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.usage.agent.services.CustomMeteringServiceUsageException.class.equals(type)){
                
                           return org.wso2.carbon.usage.agent.services.CustomMeteringServiceUsageException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.usage.agent.services.AddUsage.class.equals(type)){
                
                           return org.wso2.carbon.usage.agent.services.AddUsage.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.usage.agent.services.AddUsageResponse.class.equals(type)){
                
                           return org.wso2.carbon.usage.agent.services.AddUsageResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.usage.agent.services.CustomMeteringServiceException.class.equals(type)){
                
                           return org.wso2.carbon.usage.agent.services.CustomMeteringServiceException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.usage.agent.services.PersistUsage.class.equals(type)){
                
                           return org.wso2.carbon.usage.agent.services.PersistUsage.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.usage.agent.services.CustomMeteringServiceException.class.equals(type)){
                
                           return org.wso2.carbon.usage.agent.services.CustomMeteringServiceException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.usage.agent.services.GetRecordedDurations.class.equals(type)){
                
                           return org.wso2.carbon.usage.agent.services.GetRecordedDurations.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.usage.agent.services.GetRecordedDurationsResponse.class.equals(type)){
                
                           return org.wso2.carbon.usage.agent.services.GetRecordedDurationsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.usage.agent.services.CustomMeteringServiceException.class.equals(type)){
                
                           return org.wso2.carbon.usage.agent.services.CustomMeteringServiceException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

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
    

/**
 * MediationTracerServiceMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */
        package org.wso2.carbon.mediation.tracer;

        /**
        *  MediationTracerServiceMessageReceiverInOut message receiver
        */

        public class MediationTracerServiceMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        MediationTracerServiceSkeletonInterface skel = (MediationTracerServiceSkeletonInterface)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){


        

            if("searchTraceLog".equals(methodName)){
                
                org.wso2.carbon.mediation.tracer.SearchTraceLogResponse searchTraceLogResponse9 = null;
	                        org.wso2.carbon.mediation.tracer.SearchTraceLog wrappedParam =
                                                             (org.wso2.carbon.mediation.tracer.SearchTraceLog)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.mediation.tracer.SearchTraceLog.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               searchTraceLogResponse9 =
                                                   
                                                   
                                                         skel.searchTraceLog(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), searchTraceLogResponse9, false, new javax.xml.namespace.QName("http://tracer.mediation.carbon.wso2.org",
                                                    "searchTraceLog"));
                                    } else 

            if("getTraceLogs".equals(methodName)){
                
                org.wso2.carbon.mediation.tracer.GetTraceLogsResponse getTraceLogsResponse11 = null;
	                        org.wso2.carbon.mediation.tracer.GetTraceLogs wrappedParam =
                                                             (org.wso2.carbon.mediation.tracer.GetTraceLogs)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.mediation.tracer.GetTraceLogs.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getTraceLogsResponse11 =
                                                   
                                                   
                                                         skel.getTraceLogs(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getTraceLogsResponse11, false, new javax.xml.namespace.QName("http://tracer.mediation.carbon.wso2.org",
                                                    "getTraceLogs"));
                                    } else 

            if("getLogs".equals(methodName)){
                
                org.wso2.carbon.mediation.tracer.GetLogsResponse getLogsResponse13 = null;
	                        org.wso2.carbon.mediation.tracer.GetLogs wrappedParam =
                                                             (org.wso2.carbon.mediation.tracer.GetLogs)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.mediation.tracer.GetLogs.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getLogsResponse13 =
                                                   
                                                   
                                                         skel.getLogs(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getLogsResponse13, false, new javax.xml.namespace.QName("http://tracer.mediation.carbon.wso2.org",
                                                    "getLogs"));
                                    } else 

            if("clearTraceLogs".equals(methodName)){
                
                org.wso2.carbon.mediation.tracer.ClearTraceLogsResponse clearTraceLogsResponse15 = null;
	                        org.wso2.carbon.mediation.tracer.ClearTraceLogs wrappedParam =
                                                             (org.wso2.carbon.mediation.tracer.ClearTraceLogs)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.mediation.tracer.ClearTraceLogs.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               clearTraceLogsResponse15 =
                                                   
                                                   
                                                         skel.clearTraceLogs(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), clearTraceLogsResponse15, false, new javax.xml.namespace.QName("http://tracer.mediation.carbon.wso2.org",
                                                    "clearTraceLogs"));
                                    
            } else {
              throw new java.lang.RuntimeException("method not found");
            }
        

        newMsgContext.setEnvelope(envelope);
        }
        } catch (MediationTracerServiceMediationTracerExceptionException e) {

            msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME,"MediationTracerServiceMediationTracerException");
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
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.mediation.tracer.SearchTraceLog param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.mediation.tracer.SearchTraceLog.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.mediation.tracer.SearchTraceLogResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.mediation.tracer.SearchTraceLogResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.mediation.tracer.MediationTracerServiceMediationTracerException param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.mediation.tracer.MediationTracerServiceMediationTracerException.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.mediation.tracer.GetTraceLogs param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.mediation.tracer.GetTraceLogs.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.mediation.tracer.GetTraceLogsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.mediation.tracer.GetTraceLogsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.mediation.tracer.GetLogs param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.mediation.tracer.GetLogs.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.mediation.tracer.GetLogsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.mediation.tracer.GetLogsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.mediation.tracer.ClearTraceLogs param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.mediation.tracer.ClearTraceLogs.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.mediation.tracer.ClearTraceLogsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.mediation.tracer.ClearTraceLogsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.mediation.tracer.SearchTraceLogResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.mediation.tracer.SearchTraceLogResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.mediation.tracer.SearchTraceLogResponse wrapsearchTraceLog(){
                                org.wso2.carbon.mediation.tracer.SearchTraceLogResponse wrappedElement = new org.wso2.carbon.mediation.tracer.SearchTraceLogResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.mediation.tracer.GetTraceLogsResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.mediation.tracer.GetTraceLogsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.mediation.tracer.GetTraceLogsResponse wrapgetTraceLogs(){
                                org.wso2.carbon.mediation.tracer.GetTraceLogsResponse wrappedElement = new org.wso2.carbon.mediation.tracer.GetTraceLogsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.mediation.tracer.GetLogsResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.mediation.tracer.GetLogsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.mediation.tracer.GetLogsResponse wrapgetLogs(){
                                org.wso2.carbon.mediation.tracer.GetLogsResponse wrappedElement = new org.wso2.carbon.mediation.tracer.GetLogsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.mediation.tracer.ClearTraceLogsResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.mediation.tracer.ClearTraceLogsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.mediation.tracer.ClearTraceLogsResponse wrapclearTraceLogs(){
                                org.wso2.carbon.mediation.tracer.ClearTraceLogsResponse wrappedElement = new org.wso2.carbon.mediation.tracer.ClearTraceLogsResponse();
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
        
                if (org.wso2.carbon.mediation.tracer.SearchTraceLog.class.equals(type)){
                
                           return org.wso2.carbon.mediation.tracer.SearchTraceLog.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.mediation.tracer.SearchTraceLogResponse.class.equals(type)){
                
                           return org.wso2.carbon.mediation.tracer.SearchTraceLogResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.mediation.tracer.MediationTracerServiceMediationTracerException.class.equals(type)){
                
                           return org.wso2.carbon.mediation.tracer.MediationTracerServiceMediationTracerException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.mediation.tracer.GetTraceLogs.class.equals(type)){
                
                           return org.wso2.carbon.mediation.tracer.GetTraceLogs.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.mediation.tracer.GetTraceLogsResponse.class.equals(type)){
                
                           return org.wso2.carbon.mediation.tracer.GetTraceLogsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.mediation.tracer.GetLogs.class.equals(type)){
                
                           return org.wso2.carbon.mediation.tracer.GetLogs.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.mediation.tracer.GetLogsResponse.class.equals(type)){
                
                           return org.wso2.carbon.mediation.tracer.GetLogsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.mediation.tracer.ClearTraceLogs.class.equals(type)){
                
                           return org.wso2.carbon.mediation.tracer.ClearTraceLogs.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.mediation.tracer.ClearTraceLogsResponse.class.equals(type)){
                
                           return org.wso2.carbon.mediation.tracer.ClearTraceLogsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

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
    
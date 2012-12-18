

/**
 * PriorityMediationAdminMessageReceiverInOnly.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */
        package org.wso2.carbon.priority.executors.services;

        /**
        *  PriorityMediationAdminMessageReceiverInOnly message receiver
        */

        public class PriorityMediationAdminMessageReceiverInOnly extends org.apache.axis2.receivers.AbstractInMessageReceiver{

        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext inMessage) throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(inMessage);

        PriorityMediationAdminSkeletonInterface skel = (PriorityMediationAdminSkeletonInterface)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = inMessage.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){

        
            if("update".equals(methodName)){
            
            synapse.apache.org.xsd.Update wrappedParam = (synapse.apache.org.xsd.Update)fromOM(
                                                        inMessage.getEnvelope().getBody().getFirstElement(),
                                                        synapse.apache.org.xsd.Update.class,
                                                        getEnvelopeNamespaces(inMessage.getEnvelope()));
                                            
                                                     skel.update(wrappedParam);
                                                } else 
            if("remove".equals(methodName)){
            
            synapse.apache.org.xsd.Remove wrappedParam = (synapse.apache.org.xsd.Remove)fromOM(
                                                        inMessage.getEnvelope().getBody().getFirstElement(),
                                                        synapse.apache.org.xsd.Remove.class,
                                                        getEnvelopeNamespaces(inMessage.getEnvelope()));
                                            
                                                     skel.remove(wrappedParam);
                                                } else 
            if("add".equals(methodName)){
            
            synapse.apache.org.xsd.Add wrappedParam = (synapse.apache.org.xsd.Add)fromOM(
                                                        inMessage.getEnvelope().getBody().getFirstElement(),
                                                        synapse.apache.org.xsd.Add.class,
                                                        getEnvelopeNamespaces(inMessage.getEnvelope()));
                                            
                                                     skel.add(wrappedParam);
                                                
                } else {
                  throw new java.lang.RuntimeException("method not found");
                }
            

        }
        } catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
        }


        
        //
            private  org.apache.axiom.om.OMElement  toOM(synapse.apache.org.xsd.GetExecutor param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(synapse.apache.org.xsd.GetExecutor.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(synapse.apache.org.xsd.GetExecutorResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(synapse.apache.org.xsd.GetExecutorResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(synapse.apache.org.xsd.GetExecutorList param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(synapse.apache.org.xsd.GetExecutorList.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(synapse.apache.org.xsd.GetExecutorListResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(synapse.apache.org.xsd.GetExecutorListResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(synapse.apache.org.xsd.Update param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(synapse.apache.org.xsd.Update.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(synapse.apache.org.xsd.Remove param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(synapse.apache.org.xsd.Remove.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(synapse.apache.org.xsd.Add param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(synapse.apache.org.xsd.Add.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, synapse.apache.org.xsd.GetExecutorResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(synapse.apache.org.xsd.GetExecutorResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private synapse.apache.org.xsd.GetExecutorResponse wrapgetExecutor(){
                                synapse.apache.org.xsd.GetExecutorResponse wrappedElement = new synapse.apache.org.xsd.GetExecutorResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, synapse.apache.org.xsd.GetExecutorListResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(synapse.apache.org.xsd.GetExecutorListResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private synapse.apache.org.xsd.GetExecutorListResponse wrapgetExecutorList(){
                                synapse.apache.org.xsd.GetExecutorListResponse wrappedElement = new synapse.apache.org.xsd.GetExecutorListResponse();
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
        
                if (synapse.apache.org.xsd.GetExecutor.class.equals(type)){
                
                           return synapse.apache.org.xsd.GetExecutor.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.GetExecutorResponse.class.equals(type)){
                
                           return synapse.apache.org.xsd.GetExecutorResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.GetExecutorList.class.equals(type)){
                
                           return synapse.apache.org.xsd.GetExecutorList.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.GetExecutorListResponse.class.equals(type)){
                
                           return synapse.apache.org.xsd.GetExecutorListResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.Update.class.equals(type)){
                
                           return synapse.apache.org.xsd.Update.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.Remove.class.equals(type)){
                
                           return synapse.apache.org.xsd.Remove.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.Add.class.equals(type)){
                
                           return synapse.apache.org.xsd.Add.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

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



        }//end of class

    
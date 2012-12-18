

/**
 * MessageStoreAdminServiceMessageReceiverInOnly.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */
        package org.wso2.carbon.message.store.service;

        /**
        *  MessageStoreAdminServiceMessageReceiverInOnly message receiver
        */

        public class MessageStoreAdminServiceMessageReceiverInOnly extends org.apache.axis2.receivers.AbstractInMessageReceiver{

        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext inMessage) throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(inMessage);

        MessageStoreAdminServiceSkeletonInterface skel = (MessageStoreAdminServiceSkeletonInterface)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = inMessage.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){

        
            if("modifyMessageStore".equals(methodName)){
            
            synapse.apache.org.xsd.ModifyMessageStore wrappedParam = (synapse.apache.org.xsd.ModifyMessageStore)fromOM(
                                                        inMessage.getEnvelope().getBody().getFirstElement(),
                                                        synapse.apache.org.xsd.ModifyMessageStore.class,
                                                        getEnvelopeNamespaces(inMessage.getEnvelope()));
                                            
                                                     skel.modifyMessageStore(wrappedParam);
                                                } else 
            if("deleteMessage".equals(methodName)){
            
            synapse.apache.org.xsd.DeleteMessage wrappedParam = (synapse.apache.org.xsd.DeleteMessage)fromOM(
                                                        inMessage.getEnvelope().getBody().getFirstElement(),
                                                        synapse.apache.org.xsd.DeleteMessage.class,
                                                        getEnvelopeNamespaces(inMessage.getEnvelope()));
                                            
                                                     skel.deleteMessage(wrappedParam);
                                                } else 
            if("deleteMessageStore".equals(methodName)){
            
            synapse.apache.org.xsd.DeleteMessageStore wrappedParam = (synapse.apache.org.xsd.DeleteMessageStore)fromOM(
                                                        inMessage.getEnvelope().getBody().getFirstElement(),
                                                        synapse.apache.org.xsd.DeleteMessageStore.class,
                                                        getEnvelopeNamespaces(inMessage.getEnvelope()));
                                            
                                                     skel.deleteMessageStore(wrappedParam);
                                                } else 
            if("deleteAllMessages".equals(methodName)){
            
            synapse.apache.org.xsd.DeleteAllMessages wrappedParam = (synapse.apache.org.xsd.DeleteAllMessages)fromOM(
                                                        inMessage.getEnvelope().getBody().getFirstElement(),
                                                        synapse.apache.org.xsd.DeleteAllMessages.class,
                                                        getEnvelopeNamespaces(inMessage.getEnvelope()));
                                            
                                                     skel.deleteAllMessages(wrappedParam);
                                                } else 
            if("addMessageStore".equals(methodName)){
            
            synapse.apache.org.xsd.AddMessageStore wrappedParam = (synapse.apache.org.xsd.AddMessageStore)fromOM(
                                                        inMessage.getEnvelope().getBody().getFirstElement(),
                                                        synapse.apache.org.xsd.AddMessageStore.class,
                                                        getEnvelopeNamespaces(inMessage.getEnvelope()));
                                            
                                                     skel.addMessageStore(wrappedParam);
                                                
                } else {
                  throw new java.lang.RuntimeException("method not found");
                }
            

        }
        } catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
        }


        
        //
            private  org.apache.axiom.om.OMElement  toOM(synapse.apache.org.xsd.ModifyMessageStore param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(synapse.apache.org.xsd.ModifyMessageStore.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(synapse.apache.org.xsd.GetMessageStore param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(synapse.apache.org.xsd.GetMessageStore.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(synapse.apache.org.xsd.GetMessageStoreResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(synapse.apache.org.xsd.GetMessageStoreResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(synapse.apache.org.xsd.GetClassName param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(synapse.apache.org.xsd.GetClassName.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(synapse.apache.org.xsd.GetClassNameResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(synapse.apache.org.xsd.GetClassNameResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(synapse.apache.org.xsd.DeleteMessage param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(synapse.apache.org.xsd.DeleteMessage.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(synapse.apache.org.xsd.GetPaginatedMessages param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(synapse.apache.org.xsd.GetPaginatedMessages.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(synapse.apache.org.xsd.GetPaginatedMessagesResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(synapse.apache.org.xsd.GetPaginatedMessagesResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(synapse.apache.org.xsd.GetEnvelope param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(synapse.apache.org.xsd.GetEnvelope.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(synapse.apache.org.xsd.GetEnvelopeResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(synapse.apache.org.xsd.GetEnvelopeResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(synapse.apache.org.xsd.GetSize param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(synapse.apache.org.xsd.GetSize.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(synapse.apache.org.xsd.GetSizeResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(synapse.apache.org.xsd.GetSizeResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(synapse.apache.org.xsd.DeleteMessageStore param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(synapse.apache.org.xsd.DeleteMessageStore.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(synapse.apache.org.xsd.GetMessageStoreNames param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(synapse.apache.org.xsd.GetMessageStoreNames.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(synapse.apache.org.xsd.GetMessageStoreNamesResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(synapse.apache.org.xsd.GetMessageStoreNamesResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(synapse.apache.org.xsd.GetAllMessages param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(synapse.apache.org.xsd.GetAllMessages.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(synapse.apache.org.xsd.GetAllMessagesResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(synapse.apache.org.xsd.GetAllMessagesResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(synapse.apache.org.xsd.DeleteAllMessages param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(synapse.apache.org.xsd.DeleteAllMessages.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(synapse.apache.org.xsd.AddMessageStore param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(synapse.apache.org.xsd.AddMessageStore.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, synapse.apache.org.xsd.GetMessageStoreResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(synapse.apache.org.xsd.GetMessageStoreResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private synapse.apache.org.xsd.GetMessageStoreResponse wrapgetMessageStore(){
                                synapse.apache.org.xsd.GetMessageStoreResponse wrappedElement = new synapse.apache.org.xsd.GetMessageStoreResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, synapse.apache.org.xsd.GetClassNameResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(synapse.apache.org.xsd.GetClassNameResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private synapse.apache.org.xsd.GetClassNameResponse wrapgetClassName(){
                                synapse.apache.org.xsd.GetClassNameResponse wrappedElement = new synapse.apache.org.xsd.GetClassNameResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, synapse.apache.org.xsd.GetPaginatedMessagesResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(synapse.apache.org.xsd.GetPaginatedMessagesResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private synapse.apache.org.xsd.GetPaginatedMessagesResponse wrapgetPaginatedMessages(){
                                synapse.apache.org.xsd.GetPaginatedMessagesResponse wrappedElement = new synapse.apache.org.xsd.GetPaginatedMessagesResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, synapse.apache.org.xsd.GetEnvelopeResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(synapse.apache.org.xsd.GetEnvelopeResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private synapse.apache.org.xsd.GetEnvelopeResponse wrapgetEnvelope(){
                                synapse.apache.org.xsd.GetEnvelopeResponse wrappedElement = new synapse.apache.org.xsd.GetEnvelopeResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, synapse.apache.org.xsd.GetSizeResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(synapse.apache.org.xsd.GetSizeResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private synapse.apache.org.xsd.GetSizeResponse wrapgetSize(){
                                synapse.apache.org.xsd.GetSizeResponse wrappedElement = new synapse.apache.org.xsd.GetSizeResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, synapse.apache.org.xsd.GetMessageStoreNamesResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(synapse.apache.org.xsd.GetMessageStoreNamesResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private synapse.apache.org.xsd.GetMessageStoreNamesResponse wrapgetMessageStoreNames(){
                                synapse.apache.org.xsd.GetMessageStoreNamesResponse wrappedElement = new synapse.apache.org.xsd.GetMessageStoreNamesResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, synapse.apache.org.xsd.GetAllMessagesResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(synapse.apache.org.xsd.GetAllMessagesResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private synapse.apache.org.xsd.GetAllMessagesResponse wrapgetAllMessages(){
                                synapse.apache.org.xsd.GetAllMessagesResponse wrappedElement = new synapse.apache.org.xsd.GetAllMessagesResponse();
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
        
                if (synapse.apache.org.xsd.ModifyMessageStore.class.equals(type)){
                
                           return synapse.apache.org.xsd.ModifyMessageStore.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.GetMessageStore.class.equals(type)){
                
                           return synapse.apache.org.xsd.GetMessageStore.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.GetMessageStoreResponse.class.equals(type)){
                
                           return synapse.apache.org.xsd.GetMessageStoreResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.GetClassName.class.equals(type)){
                
                           return synapse.apache.org.xsd.GetClassName.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.GetClassNameResponse.class.equals(type)){
                
                           return synapse.apache.org.xsd.GetClassNameResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.DeleteMessage.class.equals(type)){
                
                           return synapse.apache.org.xsd.DeleteMessage.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.GetPaginatedMessages.class.equals(type)){
                
                           return synapse.apache.org.xsd.GetPaginatedMessages.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.GetPaginatedMessagesResponse.class.equals(type)){
                
                           return synapse.apache.org.xsd.GetPaginatedMessagesResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.GetEnvelope.class.equals(type)){
                
                           return synapse.apache.org.xsd.GetEnvelope.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.GetEnvelopeResponse.class.equals(type)){
                
                           return synapse.apache.org.xsd.GetEnvelopeResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.GetSize.class.equals(type)){
                
                           return synapse.apache.org.xsd.GetSize.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.GetSizeResponse.class.equals(type)){
                
                           return synapse.apache.org.xsd.GetSizeResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.DeleteMessageStore.class.equals(type)){
                
                           return synapse.apache.org.xsd.DeleteMessageStore.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.GetMessageStoreNames.class.equals(type)){
                
                           return synapse.apache.org.xsd.GetMessageStoreNames.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.GetMessageStoreNamesResponse.class.equals(type)){
                
                           return synapse.apache.org.xsd.GetMessageStoreNamesResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.GetAllMessages.class.equals(type)){
                
                           return synapse.apache.org.xsd.GetAllMessages.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.GetAllMessagesResponse.class.equals(type)){
                
                           return synapse.apache.org.xsd.GetAllMessagesResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.DeleteAllMessages.class.equals(type)){
                
                           return synapse.apache.org.xsd.DeleteAllMessages.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.AddMessageStore.class.equals(type)){
                
                           return synapse.apache.org.xsd.AddMessageStore.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

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

    
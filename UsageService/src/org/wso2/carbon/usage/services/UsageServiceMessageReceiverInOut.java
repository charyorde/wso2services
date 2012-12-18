
/**
 * UsageServiceMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */
        package org.wso2.carbon.usage.services;

        /**
        *  UsageServiceMessageReceiverInOut message receiver
        */

        public class UsageServiceMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        UsageServiceSkeletonInterface skel = (UsageServiceSkeletonInterface)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){


        

            if("retrievePaginatedInstanceUsage".equals(methodName)){
                
                org.wso2.carbon.usage.services.RetrievePaginatedInstanceUsageResponse retrievePaginatedInstanceUsageResponse15 = null;
	                        org.wso2.carbon.usage.services.RetrievePaginatedInstanceUsage wrappedParam =
                                                             (org.wso2.carbon.usage.services.RetrievePaginatedInstanceUsage)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.usage.services.RetrievePaginatedInstanceUsage.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               retrievePaginatedInstanceUsageResponse15 =
                                                   
                                                   
                                                         skel.retrievePaginatedInstanceUsage(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), retrievePaginatedInstanceUsageResponse15, false, new javax.xml.namespace.QName("http://services.usage.carbon.wso2.org",
                                                    "retrievePaginatedInstanceUsage"));
                                    } else 

            if("retrieveInstanceUsage".equals(methodName)){
                
                org.wso2.carbon.usage.services.RetrieveInstanceUsageResponse retrieveInstanceUsageResponse17 = null;
	                        org.wso2.carbon.usage.services.RetrieveInstanceUsage wrappedParam =
                                                             (org.wso2.carbon.usage.services.RetrieveInstanceUsage)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.usage.services.RetrieveInstanceUsage.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               retrieveInstanceUsageResponse17 =
                                                   
                                                   
                                                         skel.retrieveInstanceUsage(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), retrieveInstanceUsageResponse17, false, new javax.xml.namespace.QName("http://services.usage.carbon.wso2.org",
                                                    "retrieveInstanceUsage"));
                                    } else 

            if("retrieveTenantUsages".equals(methodName)){
                
                org.wso2.carbon.usage.services.RetrieveTenantUsagesResponse retrieveTenantUsagesResponse19 = null;
	                        org.wso2.carbon.usage.services.RetrieveTenantUsages wrappedParam =
                                                             (org.wso2.carbon.usage.services.RetrieveTenantUsages)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.usage.services.RetrieveTenantUsages.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               retrieveTenantUsagesResponse19 =
                                                   
                                                   
                                                         skel.retrieveTenantUsages(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), retrieveTenantUsagesResponse19, false, new javax.xml.namespace.QName("http://services.usage.carbon.wso2.org",
                                                    "retrieveTenantUsages"));
                                    } else 

            if("getValidUsageEntry".equals(methodName)){
                
                org.wso2.carbon.usage.services.GetValidUsageEntryResponse getValidUsageEntryResponse21 = null;
	                        org.wso2.carbon.usage.services.GetValidUsageEntry wrappedParam =
                                                             (org.wso2.carbon.usage.services.GetValidUsageEntry)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.usage.services.GetValidUsageEntry.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getValidUsageEntryResponse21 =
                                                   
                                                   
                                                         skel.getValidUsageEntry(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getValidUsageEntryResponse21, false, new javax.xml.namespace.QName("http://services.usage.carbon.wso2.org",
                                                    "getValidUsageEntry"));
                                    } else 

            if("retrieveCurrentTenantUsage".equals(methodName)){
                
                org.wso2.carbon.usage.services.RetrieveCurrentTenantUsageResponse retrieveCurrentTenantUsageResponse23 = null;
	                        org.wso2.carbon.usage.services.RetrieveCurrentTenantUsage wrappedParam =
                                                             (org.wso2.carbon.usage.services.RetrieveCurrentTenantUsage)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.usage.services.RetrieveCurrentTenantUsage.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               retrieveCurrentTenantUsageResponse23 =
                                                   
                                                   
                                                         skel.retrieveCurrentTenantUsage(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), retrieveCurrentTenantUsageResponse23, false, new javax.xml.namespace.QName("http://services.usage.carbon.wso2.org",
                                                    "retrieveCurrentTenantUsage"));
                                    } else 

            if("retrieveTenantUsage".equals(methodName)){
                
                org.wso2.carbon.usage.services.RetrieveTenantUsageResponse retrieveTenantUsageResponse25 = null;
	                        org.wso2.carbon.usage.services.RetrieveTenantUsage wrappedParam =
                                                             (org.wso2.carbon.usage.services.RetrieveTenantUsage)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.usage.services.RetrieveTenantUsage.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               retrieveTenantUsageResponse25 =
                                                   
                                                   
                                                         skel.retrieveTenantUsage(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), retrieveTenantUsageResponse25, false, new javax.xml.namespace.QName("http://services.usage.carbon.wso2.org",
                                                    "retrieveTenantUsage"));
                                    } else 

            if("retrievePaginatedTenantUsages".equals(methodName)){
                
                org.wso2.carbon.usage.services.RetrievePaginatedTenantUsagesResponse retrievePaginatedTenantUsagesResponse27 = null;
	                        org.wso2.carbon.usage.services.RetrievePaginatedTenantUsages wrappedParam =
                                                             (org.wso2.carbon.usage.services.RetrievePaginatedTenantUsages)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.usage.services.RetrievePaginatedTenantUsages.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               retrievePaginatedTenantUsagesResponse27 =
                                                   
                                                   
                                                         skel.retrievePaginatedTenantUsages(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), retrievePaginatedTenantUsagesResponse27, false, new javax.xml.namespace.QName("http://services.usage.carbon.wso2.org",
                                                    "retrievePaginatedTenantUsages"));
                                    
            } else {
              throw new java.lang.RuntimeException("method not found");
            }
        

        newMsgContext.setEnvelope(envelope);
        }
        } catch (UsageServiceExceptionException e) {

            msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME,"UsageServiceException");
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
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.usage.services.RetrievePaginatedInstanceUsage param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.usage.services.RetrievePaginatedInstanceUsage.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.usage.services.RetrievePaginatedInstanceUsageResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.usage.services.RetrievePaginatedInstanceUsageResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.usage.services.UsageServiceException param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.usage.services.UsageServiceException.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.usage.services.RetrieveInstanceUsage param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.usage.services.RetrieveInstanceUsage.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.usage.services.RetrieveInstanceUsageResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.usage.services.RetrieveInstanceUsageResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.usage.services.RetrieveTenantUsages param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.usage.services.RetrieveTenantUsages.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.usage.services.RetrieveTenantUsagesResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.usage.services.RetrieveTenantUsagesResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.usage.services.GetValidUsageEntry param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.usage.services.GetValidUsageEntry.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.usage.services.GetValidUsageEntryResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.usage.services.GetValidUsageEntryResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.usage.services.RetrieveCurrentTenantUsage param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.usage.services.RetrieveCurrentTenantUsage.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.usage.services.RetrieveCurrentTenantUsageResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.usage.services.RetrieveCurrentTenantUsageResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.usage.services.RetrieveTenantUsage param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.usage.services.RetrieveTenantUsage.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.usage.services.RetrieveTenantUsageResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.usage.services.RetrieveTenantUsageResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.usage.services.RetrievePaginatedTenantUsages param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.usage.services.RetrievePaginatedTenantUsages.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.usage.services.RetrievePaginatedTenantUsagesResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.usage.services.RetrievePaginatedTenantUsagesResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.usage.services.RetrievePaginatedInstanceUsageResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.usage.services.RetrievePaginatedInstanceUsageResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.usage.services.RetrievePaginatedInstanceUsageResponse wrapretrievePaginatedInstanceUsage(){
                                org.wso2.carbon.usage.services.RetrievePaginatedInstanceUsageResponse wrappedElement = new org.wso2.carbon.usage.services.RetrievePaginatedInstanceUsageResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.usage.services.RetrieveInstanceUsageResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.usage.services.RetrieveInstanceUsageResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.usage.services.RetrieveInstanceUsageResponse wrapretrieveInstanceUsage(){
                                org.wso2.carbon.usage.services.RetrieveInstanceUsageResponse wrappedElement = new org.wso2.carbon.usage.services.RetrieveInstanceUsageResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.usage.services.RetrieveTenantUsagesResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.usage.services.RetrieveTenantUsagesResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.usage.services.RetrieveTenantUsagesResponse wrapretrieveTenantUsages(){
                                org.wso2.carbon.usage.services.RetrieveTenantUsagesResponse wrappedElement = new org.wso2.carbon.usage.services.RetrieveTenantUsagesResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.usage.services.GetValidUsageEntryResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.usage.services.GetValidUsageEntryResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.usage.services.GetValidUsageEntryResponse wrapgetValidUsageEntry(){
                                org.wso2.carbon.usage.services.GetValidUsageEntryResponse wrappedElement = new org.wso2.carbon.usage.services.GetValidUsageEntryResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.usage.services.RetrieveCurrentTenantUsageResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.usage.services.RetrieveCurrentTenantUsageResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.usage.services.RetrieveCurrentTenantUsageResponse wrapretrieveCurrentTenantUsage(){
                                org.wso2.carbon.usage.services.RetrieveCurrentTenantUsageResponse wrappedElement = new org.wso2.carbon.usage.services.RetrieveCurrentTenantUsageResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.usage.services.RetrieveTenantUsageResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.usage.services.RetrieveTenantUsageResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.usage.services.RetrieveTenantUsageResponse wrapretrieveTenantUsage(){
                                org.wso2.carbon.usage.services.RetrieveTenantUsageResponse wrappedElement = new org.wso2.carbon.usage.services.RetrieveTenantUsageResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.usage.services.RetrievePaginatedTenantUsagesResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.usage.services.RetrievePaginatedTenantUsagesResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.usage.services.RetrievePaginatedTenantUsagesResponse wrapretrievePaginatedTenantUsages(){
                                org.wso2.carbon.usage.services.RetrievePaginatedTenantUsagesResponse wrappedElement = new org.wso2.carbon.usage.services.RetrievePaginatedTenantUsagesResponse();
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
        
                if (org.wso2.carbon.usage.services.RetrievePaginatedInstanceUsage.class.equals(type)){
                
                           return org.wso2.carbon.usage.services.RetrievePaginatedInstanceUsage.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.usage.services.RetrievePaginatedInstanceUsageResponse.class.equals(type)){
                
                           return org.wso2.carbon.usage.services.RetrievePaginatedInstanceUsageResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.usage.services.UsageServiceException.class.equals(type)){
                
                           return org.wso2.carbon.usage.services.UsageServiceException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.usage.services.RetrieveInstanceUsage.class.equals(type)){
                
                           return org.wso2.carbon.usage.services.RetrieveInstanceUsage.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.usage.services.RetrieveInstanceUsageResponse.class.equals(type)){
                
                           return org.wso2.carbon.usage.services.RetrieveInstanceUsageResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.usage.services.UsageServiceException.class.equals(type)){
                
                           return org.wso2.carbon.usage.services.UsageServiceException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.usage.services.RetrieveTenantUsages.class.equals(type)){
                
                           return org.wso2.carbon.usage.services.RetrieveTenantUsages.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.usage.services.RetrieveTenantUsagesResponse.class.equals(type)){
                
                           return org.wso2.carbon.usage.services.RetrieveTenantUsagesResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.usage.services.UsageServiceException.class.equals(type)){
                
                           return org.wso2.carbon.usage.services.UsageServiceException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.usage.services.GetValidUsageEntry.class.equals(type)){
                
                           return org.wso2.carbon.usage.services.GetValidUsageEntry.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.usage.services.GetValidUsageEntryResponse.class.equals(type)){
                
                           return org.wso2.carbon.usage.services.GetValidUsageEntryResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.usage.services.RetrieveCurrentTenantUsage.class.equals(type)){
                
                           return org.wso2.carbon.usage.services.RetrieveCurrentTenantUsage.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.usage.services.RetrieveCurrentTenantUsageResponse.class.equals(type)){
                
                           return org.wso2.carbon.usage.services.RetrieveCurrentTenantUsageResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.usage.services.UsageServiceException.class.equals(type)){
                
                           return org.wso2.carbon.usage.services.UsageServiceException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.usage.services.RetrieveTenantUsage.class.equals(type)){
                
                           return org.wso2.carbon.usage.services.RetrieveTenantUsage.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.usage.services.RetrieveTenantUsageResponse.class.equals(type)){
                
                           return org.wso2.carbon.usage.services.RetrieveTenantUsageResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.usage.services.UsageServiceException.class.equals(type)){
                
                           return org.wso2.carbon.usage.services.UsageServiceException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.usage.services.RetrievePaginatedTenantUsages.class.equals(type)){
                
                           return org.wso2.carbon.usage.services.RetrievePaginatedTenantUsages.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.usage.services.RetrievePaginatedTenantUsagesResponse.class.equals(type)){
                
                           return org.wso2.carbon.usage.services.RetrievePaginatedTenantUsagesResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.usage.services.UsageServiceException.class.equals(type)){
                
                           return org.wso2.carbon.usage.services.UsageServiceException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

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
    

/**
 * RemoteClaimManagerServiceMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */
        package org.wso2.carbon.um.ws.service;

        /**
        *  RemoteClaimManagerServiceMessageReceiverInOut message receiver
        */

        public class RemoteClaimManagerServiceMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        RemoteClaimManagerServiceSkeletonInterface skel = (RemoteClaimManagerServiceSkeletonInterface)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){


        

            if("getAttributeName".equals(methodName)){
                
                org.wso2.carbon.um.ws.service.GetAttributeNameResponse getAttributeNameResponse18 = null;
	                        org.wso2.carbon.um.ws.service.GetAttributeName wrappedParam =
                                                             (org.wso2.carbon.um.ws.service.GetAttributeName)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.um.ws.service.GetAttributeName.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getAttributeNameResponse18 =
                                                   
                                                   
                                                         skel.getAttributeName(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getAttributeNameResponse18, false, new javax.xml.namespace.QName("http://service.ws.um.carbon.wso2.org",
                                                    "getAttributeName"));
                                    } else 

            if("getClaimMapping".equals(methodName)){
                
                org.wso2.carbon.um.ws.service.GetClaimMappingResponse getClaimMappingResponse20 = null;
	                        org.wso2.carbon.um.ws.service.GetClaimMapping wrappedParam =
                                                             (org.wso2.carbon.um.ws.service.GetClaimMapping)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.um.ws.service.GetClaimMapping.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getClaimMappingResponse20 =
                                                   
                                                   
                                                         skel.getClaimMapping(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getClaimMappingResponse20, false, new javax.xml.namespace.QName("http://service.ws.um.carbon.wso2.org",
                                                    "getClaimMapping"));
                                    } else 

            if("getAllClaims".equals(methodName)){
                
                org.wso2.carbon.um.ws.service.GetAllClaimsResponse getAllClaimsResponse22 = null;
	                        org.wso2.carbon.um.ws.service.GetAllClaims wrappedParam =
                                                             (org.wso2.carbon.um.ws.service.GetAllClaims)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.um.ws.service.GetAllClaims.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getAllClaimsResponse22 =
                                                   
                                                   
                                                         skel.getAllClaims(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getAllClaimsResponse22, false, new javax.xml.namespace.QName("http://service.ws.um.carbon.wso2.org",
                                                    "getAllClaims"));
                                    } else 

            if("getClaim".equals(methodName)){
                
                org.wso2.carbon.um.ws.service.GetClaimResponse getClaimResponse24 = null;
	                        org.wso2.carbon.um.ws.service.GetClaim wrappedParam =
                                                             (org.wso2.carbon.um.ws.service.GetClaim)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.um.ws.service.GetClaim.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getClaimResponse24 =
                                                   
                                                   
                                                         skel.getClaim(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getClaimResponse24, false, new javax.xml.namespace.QName("http://service.ws.um.carbon.wso2.org",
                                                    "getClaim"));
                                    } else 

            if("getAllClaimUris".equals(methodName)){
                
                org.wso2.carbon.um.ws.service.GetAllClaimUrisResponse getAllClaimUrisResponse26 = null;
	                        org.wso2.carbon.um.ws.service.GetAllClaimUris wrappedParam =
                                                             (org.wso2.carbon.um.ws.service.GetAllClaimUris)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.um.ws.service.GetAllClaimUris.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getAllClaimUrisResponse26 =
                                                   
                                                   
                                                         skel.getAllClaimUris(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getAllClaimUrisResponse26, false, new javax.xml.namespace.QName("http://service.ws.um.carbon.wso2.org",
                                                    "getAllClaimUris"));
                                    } else 

            if("getAllSupportClaimsByDefault".equals(methodName)){
                
                org.wso2.carbon.um.ws.service.GetAllSupportClaimsByDefaultResponse getAllSupportClaimsByDefaultResponse28 = null;
	                        org.wso2.carbon.um.ws.service.GetAllSupportClaimsByDefault wrappedParam =
                                                             (org.wso2.carbon.um.ws.service.GetAllSupportClaimsByDefault)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.um.ws.service.GetAllSupportClaimsByDefault.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getAllSupportClaimsByDefaultResponse28 =
                                                   
                                                   
                                                         skel.getAllSupportClaimsByDefault(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getAllSupportClaimsByDefaultResponse28, false, new javax.xml.namespace.QName("http://service.ws.um.carbon.wso2.org",
                                                    "getAllSupportClaimsByDefault"));
                                    } else 

            if("getAllRequiredClaims".equals(methodName)){
                
                org.wso2.carbon.um.ws.service.GetAllRequiredClaimsResponse getAllRequiredClaimsResponse30 = null;
	                        org.wso2.carbon.um.ws.service.GetAllRequiredClaims wrappedParam =
                                                             (org.wso2.carbon.um.ws.service.GetAllRequiredClaims)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.um.ws.service.GetAllRequiredClaims.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getAllRequiredClaimsResponse30 =
                                                   
                                                   
                                                         skel.getAllRequiredClaims(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getAllRequiredClaimsResponse30, false, new javax.xml.namespace.QName("http://service.ws.um.carbon.wso2.org",
                                                    "getAllRequiredClaims"));
                                    
            } else {
              throw new java.lang.RuntimeException("method not found");
            }
        

        newMsgContext.setEnvelope(envelope);
        }
        } catch (RemoteClaimManagerServiceUserStoreExceptionException e) {

            msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME,"RemoteClaimManagerServiceUserStoreException");
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
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.um.ws.service.AddNewClaimMapping param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.um.ws.service.AddNewClaimMapping.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.um.ws.service.RemoteClaimManagerServiceUserStoreException param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.um.ws.service.RemoteClaimManagerServiceUserStoreException.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.um.ws.service.GetAttributeName param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.um.ws.service.GetAttributeName.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.um.ws.service.GetAttributeNameResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.um.ws.service.GetAttributeNameResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.um.ws.service.UpdateClaimMapping param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.um.ws.service.UpdateClaimMapping.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.um.ws.service.GetClaimMapping param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.um.ws.service.GetClaimMapping.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.um.ws.service.GetClaimMappingResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.um.ws.service.GetClaimMappingResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.um.ws.service.GetAllClaims param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.um.ws.service.GetAllClaims.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.um.ws.service.GetAllClaimsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.um.ws.service.GetAllClaimsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.um.ws.service.GetClaim param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.um.ws.service.GetClaim.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.um.ws.service.GetClaimResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.um.ws.service.GetClaimResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.um.ws.service.GetAllClaimUris param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.um.ws.service.GetAllClaimUris.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.um.ws.service.GetAllClaimUrisResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.um.ws.service.GetAllClaimUrisResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.um.ws.service.GetAllSupportClaimsByDefault param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.um.ws.service.GetAllSupportClaimsByDefault.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.um.ws.service.GetAllSupportClaimsByDefaultResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.um.ws.service.GetAllSupportClaimsByDefaultResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.um.ws.service.GetAllRequiredClaims param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.um.ws.service.GetAllRequiredClaims.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.um.ws.service.GetAllRequiredClaimsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.um.ws.service.GetAllRequiredClaimsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.um.ws.service.DeleteClaimMapping param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.um.ws.service.DeleteClaimMapping.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.um.ws.service.GetAttributeNameResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.um.ws.service.GetAttributeNameResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.um.ws.service.GetAttributeNameResponse wrapgetAttributeName(){
                                org.wso2.carbon.um.ws.service.GetAttributeNameResponse wrappedElement = new org.wso2.carbon.um.ws.service.GetAttributeNameResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.um.ws.service.GetClaimMappingResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.um.ws.service.GetClaimMappingResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.um.ws.service.GetClaimMappingResponse wrapgetClaimMapping(){
                                org.wso2.carbon.um.ws.service.GetClaimMappingResponse wrappedElement = new org.wso2.carbon.um.ws.service.GetClaimMappingResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.um.ws.service.GetAllClaimsResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.um.ws.service.GetAllClaimsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.um.ws.service.GetAllClaimsResponse wrapgetAllClaims(){
                                org.wso2.carbon.um.ws.service.GetAllClaimsResponse wrappedElement = new org.wso2.carbon.um.ws.service.GetAllClaimsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.um.ws.service.GetClaimResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.um.ws.service.GetClaimResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.um.ws.service.GetClaimResponse wrapgetClaim(){
                                org.wso2.carbon.um.ws.service.GetClaimResponse wrappedElement = new org.wso2.carbon.um.ws.service.GetClaimResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.um.ws.service.GetAllClaimUrisResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.um.ws.service.GetAllClaimUrisResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.um.ws.service.GetAllClaimUrisResponse wrapgetAllClaimUris(){
                                org.wso2.carbon.um.ws.service.GetAllClaimUrisResponse wrappedElement = new org.wso2.carbon.um.ws.service.GetAllClaimUrisResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.um.ws.service.GetAllSupportClaimsByDefaultResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.um.ws.service.GetAllSupportClaimsByDefaultResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.um.ws.service.GetAllSupportClaimsByDefaultResponse wrapgetAllSupportClaimsByDefault(){
                                org.wso2.carbon.um.ws.service.GetAllSupportClaimsByDefaultResponse wrappedElement = new org.wso2.carbon.um.ws.service.GetAllSupportClaimsByDefaultResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.um.ws.service.GetAllRequiredClaimsResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.um.ws.service.GetAllRequiredClaimsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.um.ws.service.GetAllRequiredClaimsResponse wrapgetAllRequiredClaims(){
                                org.wso2.carbon.um.ws.service.GetAllRequiredClaimsResponse wrappedElement = new org.wso2.carbon.um.ws.service.GetAllRequiredClaimsResponse();
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
        
                if (org.wso2.carbon.um.ws.service.AddNewClaimMapping.class.equals(type)){
                
                           return org.wso2.carbon.um.ws.service.AddNewClaimMapping.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.um.ws.service.RemoteClaimManagerServiceUserStoreException.class.equals(type)){
                
                           return org.wso2.carbon.um.ws.service.RemoteClaimManagerServiceUserStoreException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.um.ws.service.GetAttributeName.class.equals(type)){
                
                           return org.wso2.carbon.um.ws.service.GetAttributeName.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.um.ws.service.GetAttributeNameResponse.class.equals(type)){
                
                           return org.wso2.carbon.um.ws.service.GetAttributeNameResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.um.ws.service.RemoteClaimManagerServiceUserStoreException.class.equals(type)){
                
                           return org.wso2.carbon.um.ws.service.RemoteClaimManagerServiceUserStoreException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.um.ws.service.UpdateClaimMapping.class.equals(type)){
                
                           return org.wso2.carbon.um.ws.service.UpdateClaimMapping.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.um.ws.service.RemoteClaimManagerServiceUserStoreException.class.equals(type)){
                
                           return org.wso2.carbon.um.ws.service.RemoteClaimManagerServiceUserStoreException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.um.ws.service.GetClaimMapping.class.equals(type)){
                
                           return org.wso2.carbon.um.ws.service.GetClaimMapping.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.um.ws.service.GetClaimMappingResponse.class.equals(type)){
                
                           return org.wso2.carbon.um.ws.service.GetClaimMappingResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.um.ws.service.RemoteClaimManagerServiceUserStoreException.class.equals(type)){
                
                           return org.wso2.carbon.um.ws.service.RemoteClaimManagerServiceUserStoreException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.um.ws.service.GetAllClaims.class.equals(type)){
                
                           return org.wso2.carbon.um.ws.service.GetAllClaims.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.um.ws.service.GetAllClaimsResponse.class.equals(type)){
                
                           return org.wso2.carbon.um.ws.service.GetAllClaimsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.um.ws.service.RemoteClaimManagerServiceUserStoreException.class.equals(type)){
                
                           return org.wso2.carbon.um.ws.service.RemoteClaimManagerServiceUserStoreException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.um.ws.service.GetClaim.class.equals(type)){
                
                           return org.wso2.carbon.um.ws.service.GetClaim.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.um.ws.service.GetClaimResponse.class.equals(type)){
                
                           return org.wso2.carbon.um.ws.service.GetClaimResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.um.ws.service.RemoteClaimManagerServiceUserStoreException.class.equals(type)){
                
                           return org.wso2.carbon.um.ws.service.RemoteClaimManagerServiceUserStoreException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.um.ws.service.GetAllClaimUris.class.equals(type)){
                
                           return org.wso2.carbon.um.ws.service.GetAllClaimUris.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.um.ws.service.GetAllClaimUrisResponse.class.equals(type)){
                
                           return org.wso2.carbon.um.ws.service.GetAllClaimUrisResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.um.ws.service.RemoteClaimManagerServiceUserStoreException.class.equals(type)){
                
                           return org.wso2.carbon.um.ws.service.RemoteClaimManagerServiceUserStoreException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.um.ws.service.GetAllSupportClaimsByDefault.class.equals(type)){
                
                           return org.wso2.carbon.um.ws.service.GetAllSupportClaimsByDefault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.um.ws.service.GetAllSupportClaimsByDefaultResponse.class.equals(type)){
                
                           return org.wso2.carbon.um.ws.service.GetAllSupportClaimsByDefaultResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.um.ws.service.RemoteClaimManagerServiceUserStoreException.class.equals(type)){
                
                           return org.wso2.carbon.um.ws.service.RemoteClaimManagerServiceUserStoreException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.um.ws.service.GetAllRequiredClaims.class.equals(type)){
                
                           return org.wso2.carbon.um.ws.service.GetAllRequiredClaims.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.um.ws.service.GetAllRequiredClaimsResponse.class.equals(type)){
                
                           return org.wso2.carbon.um.ws.service.GetAllRequiredClaimsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.um.ws.service.RemoteClaimManagerServiceUserStoreException.class.equals(type)){
                
                           return org.wso2.carbon.um.ws.service.RemoteClaimManagerServiceUserStoreException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.um.ws.service.DeleteClaimMapping.class.equals(type)){
                
                           return org.wso2.carbon.um.ws.service.DeleteClaimMapping.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.um.ws.service.RemoteClaimManagerServiceUserStoreException.class.equals(type)){
                
                           return org.wso2.carbon.um.ws.service.RemoteClaimManagerServiceUserStoreException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

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
    
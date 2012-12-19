
/**
 * ManageGenericArtifactServiceMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */
        package org.wso2.carbon.governance.generic.services;

        /**
        *  ManageGenericArtifactServiceMessageReceiverInOut message receiver
        */

        public class ManageGenericArtifactServiceMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        ManageGenericArtifactServiceSkeletonInterface skel = (ManageGenericArtifactServiceSkeletonInterface)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){


        

            if("setArtifactUIConfiguration".equals(methodName)){
                
                org.wso2.carbon.governance.generic.services.SetArtifactUIConfigurationResponse setArtifactUIConfigurationResponse17 = null;
	                        org.wso2.carbon.governance.generic.services.SetArtifactUIConfiguration wrappedParam =
                                                             (org.wso2.carbon.governance.generic.services.SetArtifactUIConfiguration)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.governance.generic.services.SetArtifactUIConfiguration.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               setArtifactUIConfigurationResponse17 =
                                                   
                                                   
                                                         skel.setArtifactUIConfiguration(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), setArtifactUIConfigurationResponse17, false, new javax.xml.namespace.QName("http://services.generic.governance.carbon.wso2.org",
                                                    "setArtifactUIConfiguration"));
                                    } else 

            if("canChange".equals(methodName)){
                
                org.wso2.carbon.governance.generic.services.CanChangeResponse canChangeResponse19 = null;
	                        org.wso2.carbon.governance.generic.services.CanChange wrappedParam =
                                                             (org.wso2.carbon.governance.generic.services.CanChange)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.governance.generic.services.CanChange.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               canChangeResponse19 =
                                                   
                                                   
                                                         skel.canChange(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), canChangeResponse19, false, new javax.xml.namespace.QName("http://services.generic.governance.carbon.wso2.org",
                                                    "canChange"));
                                    } else 

            if("getArtifactContent".equals(methodName)){
                
                org.wso2.carbon.governance.generic.services.GetArtifactContentResponse getArtifactContentResponse21 = null;
	                        org.wso2.carbon.governance.generic.services.GetArtifactContent wrappedParam =
                                                             (org.wso2.carbon.governance.generic.services.GetArtifactContent)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.governance.generic.services.GetArtifactContent.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getArtifactContentResponse21 =
                                                   
                                                   
                                                         skel.getArtifactContent(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getArtifactContentResponse21, false, new javax.xml.namespace.QName("http://services.generic.governance.carbon.wso2.org",
                                                    "getArtifactContent"));
                                    } else 

            if("getArtifactUIConfiguration".equals(methodName)){
                
                org.wso2.carbon.governance.generic.services.GetArtifactUIConfigurationResponse getArtifactUIConfigurationResponse23 = null;
	                        org.wso2.carbon.governance.generic.services.GetArtifactUIConfiguration wrappedParam =
                                                             (org.wso2.carbon.governance.generic.services.GetArtifactUIConfiguration)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.governance.generic.services.GetArtifactUIConfiguration.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getArtifactUIConfigurationResponse23 =
                                                   
                                                   
                                                         skel.getArtifactUIConfiguration(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getArtifactUIConfigurationResponse23, false, new javax.xml.namespace.QName("http://services.generic.governance.carbon.wso2.org",
                                                    "getArtifactUIConfiguration"));
                                    } else 

            if("listArtifacts".equals(methodName)){
                
                org.wso2.carbon.governance.generic.services.ListArtifactsResponse listArtifactsResponse25 = null;
	                        org.wso2.carbon.governance.generic.services.ListArtifacts wrappedParam =
                                                             (org.wso2.carbon.governance.generic.services.ListArtifacts)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.governance.generic.services.ListArtifacts.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               listArtifactsResponse25 =
                                                   
                                                   
                                                         skel.listArtifacts(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), listArtifactsResponse25, false, new javax.xml.namespace.QName("http://services.generic.governance.carbon.wso2.org",
                                                    "listArtifacts"));
                                    } else 

            if("addArtifact".equals(methodName)){
                
                org.wso2.carbon.governance.generic.services.AddArtifactResponse addArtifactResponse27 = null;
	                        org.wso2.carbon.governance.generic.services.AddArtifact wrappedParam =
                                                             (org.wso2.carbon.governance.generic.services.AddArtifact)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.governance.generic.services.AddArtifact.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               addArtifactResponse27 =
                                                   
                                                   
                                                         skel.addArtifact(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), addArtifactResponse27, false, new javax.xml.namespace.QName("http://services.generic.governance.carbon.wso2.org",
                                                    "addArtifact"));
                                    } else 

            if("editArtifact".equals(methodName)){
                
                org.wso2.carbon.governance.generic.services.EditArtifactResponse editArtifactResponse29 = null;
	                        org.wso2.carbon.governance.generic.services.EditArtifact wrappedParam =
                                                             (org.wso2.carbon.governance.generic.services.EditArtifact)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.governance.generic.services.EditArtifact.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               editArtifactResponse29 =
                                                   
                                                   
                                                         skel.editArtifact(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), editArtifactResponse29, false, new javax.xml.namespace.QName("http://services.generic.governance.carbon.wso2.org",
                                                    "editArtifact"));
                                    } else 

            if("getAvailableAspects".equals(methodName)){
                
                org.wso2.carbon.governance.generic.services.GetAvailableAspectsResponse getAvailableAspectsResponse31 = null;
	                        org.wso2.carbon.governance.generic.services.GetAvailableAspects wrappedParam =
                                                             (org.wso2.carbon.governance.generic.services.GetAvailableAspects)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.governance.generic.services.GetAvailableAspects.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getAvailableAspectsResponse31 =
                                                   
                                                   
                                                         skel.getAvailableAspects(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getAvailableAspectsResponse31, false, new javax.xml.namespace.QName("http://services.generic.governance.carbon.wso2.org",
                                                    "getAvailableAspects"));
                                    
            } else {
              throw new java.lang.RuntimeException("method not found");
            }
        

        newMsgContext.setEnvelope(envelope);
        }
        } catch (ManageGenericArtifactServiceRegistryExceptionException e) {

            msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME,"ManageGenericArtifactServiceRegistryException");
            org.apache.axis2.AxisFault f = createAxisFault(e);
            if (e.getFaultMessage() != null){
                f.setDetail(toOM(e.getFaultMessage(),false));
            }
            throw f;
            }
         catch (ManageGenericArtifactServiceExceptionException e) {

            msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME,"ManageGenericArtifactServiceException");
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
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.governance.generic.services.SetArtifactUIConfiguration param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.governance.generic.services.SetArtifactUIConfiguration.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.governance.generic.services.SetArtifactUIConfigurationResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.governance.generic.services.SetArtifactUIConfigurationResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.governance.generic.services.ManageGenericArtifactServiceRegistryException param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.governance.generic.services.ManageGenericArtifactServiceRegistryException.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.governance.generic.services.CanChange param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.governance.generic.services.CanChange.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.governance.generic.services.CanChangeResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.governance.generic.services.CanChangeResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.governance.generic.services.ManageGenericArtifactServiceException param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.governance.generic.services.ManageGenericArtifactServiceException.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.governance.generic.services.GetArtifactContent param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.governance.generic.services.GetArtifactContent.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.governance.generic.services.GetArtifactContentResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.governance.generic.services.GetArtifactContentResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.governance.generic.services.GetArtifactUIConfiguration param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.governance.generic.services.GetArtifactUIConfiguration.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.governance.generic.services.GetArtifactUIConfigurationResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.governance.generic.services.GetArtifactUIConfigurationResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.governance.generic.services.ListArtifacts param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.governance.generic.services.ListArtifacts.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.governance.generic.services.ListArtifactsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.governance.generic.services.ListArtifactsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.governance.generic.services.AddArtifact param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.governance.generic.services.AddArtifact.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.governance.generic.services.AddArtifactResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.governance.generic.services.AddArtifactResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.governance.generic.services.EditArtifact param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.governance.generic.services.EditArtifact.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.governance.generic.services.EditArtifactResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.governance.generic.services.EditArtifactResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.governance.generic.services.GetAvailableAspects param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.governance.generic.services.GetAvailableAspects.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.governance.generic.services.GetAvailableAspectsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.governance.generic.services.GetAvailableAspectsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.governance.generic.services.SetArtifactUIConfigurationResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.governance.generic.services.SetArtifactUIConfigurationResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.governance.generic.services.SetArtifactUIConfigurationResponse wrapsetArtifactUIConfiguration(){
                                org.wso2.carbon.governance.generic.services.SetArtifactUIConfigurationResponse wrappedElement = new org.wso2.carbon.governance.generic.services.SetArtifactUIConfigurationResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.governance.generic.services.CanChangeResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.governance.generic.services.CanChangeResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.governance.generic.services.CanChangeResponse wrapcanChange(){
                                org.wso2.carbon.governance.generic.services.CanChangeResponse wrappedElement = new org.wso2.carbon.governance.generic.services.CanChangeResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.governance.generic.services.GetArtifactContentResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.governance.generic.services.GetArtifactContentResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.governance.generic.services.GetArtifactContentResponse wrapgetArtifactContent(){
                                org.wso2.carbon.governance.generic.services.GetArtifactContentResponse wrappedElement = new org.wso2.carbon.governance.generic.services.GetArtifactContentResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.governance.generic.services.GetArtifactUIConfigurationResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.governance.generic.services.GetArtifactUIConfigurationResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.governance.generic.services.GetArtifactUIConfigurationResponse wrapgetArtifactUIConfiguration(){
                                org.wso2.carbon.governance.generic.services.GetArtifactUIConfigurationResponse wrappedElement = new org.wso2.carbon.governance.generic.services.GetArtifactUIConfigurationResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.governance.generic.services.ListArtifactsResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.governance.generic.services.ListArtifactsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.governance.generic.services.ListArtifactsResponse wraplistArtifacts(){
                                org.wso2.carbon.governance.generic.services.ListArtifactsResponse wrappedElement = new org.wso2.carbon.governance.generic.services.ListArtifactsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.governance.generic.services.AddArtifactResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.governance.generic.services.AddArtifactResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.governance.generic.services.AddArtifactResponse wrapaddArtifact(){
                                org.wso2.carbon.governance.generic.services.AddArtifactResponse wrappedElement = new org.wso2.carbon.governance.generic.services.AddArtifactResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.governance.generic.services.EditArtifactResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.governance.generic.services.EditArtifactResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.governance.generic.services.EditArtifactResponse wrapeditArtifact(){
                                org.wso2.carbon.governance.generic.services.EditArtifactResponse wrappedElement = new org.wso2.carbon.governance.generic.services.EditArtifactResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.governance.generic.services.GetAvailableAspectsResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.governance.generic.services.GetAvailableAspectsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.governance.generic.services.GetAvailableAspectsResponse wrapgetAvailableAspects(){
                                org.wso2.carbon.governance.generic.services.GetAvailableAspectsResponse wrappedElement = new org.wso2.carbon.governance.generic.services.GetAvailableAspectsResponse();
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
        
                if (org.wso2.carbon.governance.generic.services.SetArtifactUIConfiguration.class.equals(type)){
                
                           return org.wso2.carbon.governance.generic.services.SetArtifactUIConfiguration.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.governance.generic.services.SetArtifactUIConfigurationResponse.class.equals(type)){
                
                           return org.wso2.carbon.governance.generic.services.SetArtifactUIConfigurationResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.governance.generic.services.ManageGenericArtifactServiceRegistryException.class.equals(type)){
                
                           return org.wso2.carbon.governance.generic.services.ManageGenericArtifactServiceRegistryException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.governance.generic.services.CanChange.class.equals(type)){
                
                           return org.wso2.carbon.governance.generic.services.CanChange.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.governance.generic.services.CanChangeResponse.class.equals(type)){
                
                           return org.wso2.carbon.governance.generic.services.CanChangeResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.governance.generic.services.ManageGenericArtifactServiceException.class.equals(type)){
                
                           return org.wso2.carbon.governance.generic.services.ManageGenericArtifactServiceException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.governance.generic.services.GetArtifactContent.class.equals(type)){
                
                           return org.wso2.carbon.governance.generic.services.GetArtifactContent.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.governance.generic.services.GetArtifactContentResponse.class.equals(type)){
                
                           return org.wso2.carbon.governance.generic.services.GetArtifactContentResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.governance.generic.services.ManageGenericArtifactServiceRegistryException.class.equals(type)){
                
                           return org.wso2.carbon.governance.generic.services.ManageGenericArtifactServiceRegistryException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.governance.generic.services.GetArtifactUIConfiguration.class.equals(type)){
                
                           return org.wso2.carbon.governance.generic.services.GetArtifactUIConfiguration.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.governance.generic.services.GetArtifactUIConfigurationResponse.class.equals(type)){
                
                           return org.wso2.carbon.governance.generic.services.GetArtifactUIConfigurationResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.governance.generic.services.ManageGenericArtifactServiceRegistryException.class.equals(type)){
                
                           return org.wso2.carbon.governance.generic.services.ManageGenericArtifactServiceRegistryException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.governance.generic.services.ListArtifacts.class.equals(type)){
                
                           return org.wso2.carbon.governance.generic.services.ListArtifacts.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.governance.generic.services.ListArtifactsResponse.class.equals(type)){
                
                           return org.wso2.carbon.governance.generic.services.ListArtifactsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.governance.generic.services.AddArtifact.class.equals(type)){
                
                           return org.wso2.carbon.governance.generic.services.AddArtifact.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.governance.generic.services.AddArtifactResponse.class.equals(type)){
                
                           return org.wso2.carbon.governance.generic.services.AddArtifactResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.governance.generic.services.ManageGenericArtifactServiceRegistryException.class.equals(type)){
                
                           return org.wso2.carbon.governance.generic.services.ManageGenericArtifactServiceRegistryException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.governance.generic.services.EditArtifact.class.equals(type)){
                
                           return org.wso2.carbon.governance.generic.services.EditArtifact.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.governance.generic.services.EditArtifactResponse.class.equals(type)){
                
                           return org.wso2.carbon.governance.generic.services.EditArtifactResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.governance.generic.services.ManageGenericArtifactServiceRegistryException.class.equals(type)){
                
                           return org.wso2.carbon.governance.generic.services.ManageGenericArtifactServiceRegistryException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.governance.generic.services.GetAvailableAspects.class.equals(type)){
                
                           return org.wso2.carbon.governance.generic.services.GetAvailableAspects.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.governance.generic.services.GetAvailableAspectsResponse.class.equals(type)){
                
                           return org.wso2.carbon.governance.generic.services.GetAvailableAspectsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.governance.generic.services.ManageGenericArtifactServiceException.class.equals(type)){
                
                           return org.wso2.carbon.governance.generic.services.ManageGenericArtifactServiceException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

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
    

/**
 * AddServicesServiceMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */
        package org.wso2.carbon.governance.services.services;

        /**
        *  AddServicesServiceMessageReceiverInOut message receiver
        */

        public class AddServicesServiceMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        AddServicesServiceSkeletonInterface skel = (AddServicesServiceSkeletonInterface)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){


        

            if("getServicePath".equals(methodName)){
                
                org.wso2.carbon.governance.services.services.GetServicePathResponse getServicePathResponse15 = null;
	                        org.wso2.carbon.governance.services.services.GetServicePath wrappedParam =
                                                             (org.wso2.carbon.governance.services.services.GetServicePath)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.governance.services.services.GetServicePath.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getServicePathResponse15 =
                                                   
                                                   
                                                         skel.getServicePath(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getServicePathResponse15, false, new javax.xml.namespace.QName("http://services.services.governance.carbon.wso2.org",
                                                    "getServicePath"));
                                    } else 

            if("saveServiceConfiguration".equals(methodName)){
                
                org.wso2.carbon.governance.services.services.SaveServiceConfigurationResponse saveServiceConfigurationResponse17 = null;
	                        org.wso2.carbon.governance.services.services.SaveServiceConfiguration wrappedParam =
                                                             (org.wso2.carbon.governance.services.services.SaveServiceConfiguration)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.governance.services.services.SaveServiceConfiguration.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               saveServiceConfigurationResponse17 =
                                                   
                                                   
                                                         skel.saveServiceConfiguration(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), saveServiceConfigurationResponse17, false, new javax.xml.namespace.QName("http://services.services.governance.carbon.wso2.org",
                                                    "saveServiceConfiguration"));
                                    } else 

            if("getServiceConfiguration".equals(methodName)){
                
                org.wso2.carbon.governance.services.services.GetServiceConfigurationResponse getServiceConfigurationResponse19 = null;
	                        org.wso2.carbon.governance.services.services.GetServiceConfiguration wrappedParam =
                                                             (org.wso2.carbon.governance.services.services.GetServiceConfiguration)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.governance.services.services.GetServiceConfiguration.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getServiceConfigurationResponse19 =
                                                   
                                                   
                                                         skel.getServiceConfiguration(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getServiceConfigurationResponse19, false, new javax.xml.namespace.QName("http://services.services.governance.carbon.wso2.org",
                                                    "getServiceConfiguration"));
                                    } else 

            if("addService".equals(methodName)){
                
                org.wso2.carbon.governance.services.services.AddServiceResponse addServiceResponse21 = null;
	                        org.wso2.carbon.governance.services.services.AddService wrappedParam =
                                                             (org.wso2.carbon.governance.services.services.AddService)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.governance.services.services.AddService.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               addServiceResponse21 =
                                                   
                                                   
                                                         skel.addService(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), addServiceResponse21, false, new javax.xml.namespace.QName("http://services.services.governance.carbon.wso2.org",
                                                    "addService"));
                                    } else 

            if("canChange".equals(methodName)){
                
                org.wso2.carbon.governance.services.services.CanChangeResponse canChangeResponse23 = null;
	                        org.wso2.carbon.governance.services.services.CanChange wrappedParam =
                                                             (org.wso2.carbon.governance.services.services.CanChange)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.governance.services.services.CanChange.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               canChangeResponse23 =
                                                   
                                                   
                                                         skel.canChange(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), canChangeResponse23, false, new javax.xml.namespace.QName("http://services.services.governance.carbon.wso2.org",
                                                    "canChange"));
                                    } else 

            if("getAvailableAspects".equals(methodName)){
                
                org.wso2.carbon.governance.services.services.GetAvailableAspectsResponse getAvailableAspectsResponse25 = null;
	                        org.wso2.carbon.governance.services.services.GetAvailableAspects wrappedParam =
                                                             (org.wso2.carbon.governance.services.services.GetAvailableAspects)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.governance.services.services.GetAvailableAspects.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getAvailableAspectsResponse25 =
                                                   
                                                   
                                                         skel.getAvailableAspects(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getAvailableAspectsResponse25, false, new javax.xml.namespace.QName("http://services.services.governance.carbon.wso2.org",
                                                    "getAvailableAspects"));
                                    } else 

            if("editService".equals(methodName)){
                
                org.wso2.carbon.governance.services.services.EditServiceResponse editServiceResponse27 = null;
	                        org.wso2.carbon.governance.services.services.EditService wrappedParam =
                                                             (org.wso2.carbon.governance.services.services.EditService)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.governance.services.services.EditService.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               editServiceResponse27 =
                                                   
                                                   
                                                         skel.editService(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), editServiceResponse27, false, new javax.xml.namespace.QName("http://services.services.governance.carbon.wso2.org",
                                                    "editService"));
                                    
            } else {
              throw new java.lang.RuntimeException("method not found");
            }
        

        newMsgContext.setEnvelope(envelope);
        }
        } catch (AddServicesServiceExceptionException e) {

            msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME,"AddServicesServiceException");
            org.apache.axis2.AxisFault f = createAxisFault(e);
            if (e.getFaultMessage() != null){
                f.setDetail(toOM(e.getFaultMessage(),false));
            }
            throw f;
            }
         catch (AddServicesServiceRegistryExceptionException e) {

            msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME,"AddServicesServiceRegistryException");
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
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.governance.services.services.GetServicePath param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.governance.services.services.GetServicePath.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.governance.services.services.GetServicePathResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.governance.services.services.GetServicePathResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.governance.services.services.AddServicesServiceRegistryException param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.governance.services.services.AddServicesServiceRegistryException.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.governance.services.services.SaveServiceConfiguration param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.governance.services.services.SaveServiceConfiguration.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.governance.services.services.SaveServiceConfigurationResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.governance.services.services.SaveServiceConfigurationResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.governance.services.services.GetServiceConfiguration param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.governance.services.services.GetServiceConfiguration.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.governance.services.services.GetServiceConfigurationResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.governance.services.services.GetServiceConfigurationResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.governance.services.services.AddService param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.governance.services.services.AddService.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.governance.services.services.AddServiceResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.governance.services.services.AddServiceResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.governance.services.services.CanChange param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.governance.services.services.CanChange.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.governance.services.services.CanChangeResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.governance.services.services.CanChangeResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.governance.services.services.AddServicesServiceException param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.governance.services.services.AddServicesServiceException.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.governance.services.services.GetAvailableAspects param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.governance.services.services.GetAvailableAspects.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.governance.services.services.GetAvailableAspectsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.governance.services.services.GetAvailableAspectsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.governance.services.services.EditService param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.governance.services.services.EditService.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.governance.services.services.EditServiceResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.governance.services.services.EditServiceResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.governance.services.services.GetServicePathResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.governance.services.services.GetServicePathResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.governance.services.services.GetServicePathResponse wrapgetServicePath(){
                                org.wso2.carbon.governance.services.services.GetServicePathResponse wrappedElement = new org.wso2.carbon.governance.services.services.GetServicePathResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.governance.services.services.SaveServiceConfigurationResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.governance.services.services.SaveServiceConfigurationResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.governance.services.services.SaveServiceConfigurationResponse wrapsaveServiceConfiguration(){
                                org.wso2.carbon.governance.services.services.SaveServiceConfigurationResponse wrappedElement = new org.wso2.carbon.governance.services.services.SaveServiceConfigurationResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.governance.services.services.GetServiceConfigurationResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.governance.services.services.GetServiceConfigurationResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.governance.services.services.GetServiceConfigurationResponse wrapgetServiceConfiguration(){
                                org.wso2.carbon.governance.services.services.GetServiceConfigurationResponse wrappedElement = new org.wso2.carbon.governance.services.services.GetServiceConfigurationResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.governance.services.services.AddServiceResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.governance.services.services.AddServiceResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.governance.services.services.AddServiceResponse wrapaddService(){
                                org.wso2.carbon.governance.services.services.AddServiceResponse wrappedElement = new org.wso2.carbon.governance.services.services.AddServiceResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.governance.services.services.CanChangeResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.governance.services.services.CanChangeResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.governance.services.services.CanChangeResponse wrapcanChange(){
                                org.wso2.carbon.governance.services.services.CanChangeResponse wrappedElement = new org.wso2.carbon.governance.services.services.CanChangeResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.governance.services.services.GetAvailableAspectsResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.governance.services.services.GetAvailableAspectsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.governance.services.services.GetAvailableAspectsResponse wrapgetAvailableAspects(){
                                org.wso2.carbon.governance.services.services.GetAvailableAspectsResponse wrappedElement = new org.wso2.carbon.governance.services.services.GetAvailableAspectsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.governance.services.services.EditServiceResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.governance.services.services.EditServiceResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.governance.services.services.EditServiceResponse wrapeditService(){
                                org.wso2.carbon.governance.services.services.EditServiceResponse wrappedElement = new org.wso2.carbon.governance.services.services.EditServiceResponse();
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
        
                if (org.wso2.carbon.governance.services.services.GetServicePath.class.equals(type)){
                
                           return org.wso2.carbon.governance.services.services.GetServicePath.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.governance.services.services.GetServicePathResponse.class.equals(type)){
                
                           return org.wso2.carbon.governance.services.services.GetServicePathResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.governance.services.services.AddServicesServiceRegistryException.class.equals(type)){
                
                           return org.wso2.carbon.governance.services.services.AddServicesServiceRegistryException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.governance.services.services.SaveServiceConfiguration.class.equals(type)){
                
                           return org.wso2.carbon.governance.services.services.SaveServiceConfiguration.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.governance.services.services.SaveServiceConfigurationResponse.class.equals(type)){
                
                           return org.wso2.carbon.governance.services.services.SaveServiceConfigurationResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.governance.services.services.AddServicesServiceRegistryException.class.equals(type)){
                
                           return org.wso2.carbon.governance.services.services.AddServicesServiceRegistryException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.governance.services.services.GetServiceConfiguration.class.equals(type)){
                
                           return org.wso2.carbon.governance.services.services.GetServiceConfiguration.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.governance.services.services.GetServiceConfigurationResponse.class.equals(type)){
                
                           return org.wso2.carbon.governance.services.services.GetServiceConfigurationResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.governance.services.services.AddServicesServiceRegistryException.class.equals(type)){
                
                           return org.wso2.carbon.governance.services.services.AddServicesServiceRegistryException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.governance.services.services.AddService.class.equals(type)){
                
                           return org.wso2.carbon.governance.services.services.AddService.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.governance.services.services.AddServiceResponse.class.equals(type)){
                
                           return org.wso2.carbon.governance.services.services.AddServiceResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.governance.services.services.AddServicesServiceRegistryException.class.equals(type)){
                
                           return org.wso2.carbon.governance.services.services.AddServicesServiceRegistryException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.governance.services.services.CanChange.class.equals(type)){
                
                           return org.wso2.carbon.governance.services.services.CanChange.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.governance.services.services.CanChangeResponse.class.equals(type)){
                
                           return org.wso2.carbon.governance.services.services.CanChangeResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.governance.services.services.AddServicesServiceException.class.equals(type)){
                
                           return org.wso2.carbon.governance.services.services.AddServicesServiceException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.governance.services.services.GetAvailableAspects.class.equals(type)){
                
                           return org.wso2.carbon.governance.services.services.GetAvailableAspects.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.governance.services.services.GetAvailableAspectsResponse.class.equals(type)){
                
                           return org.wso2.carbon.governance.services.services.GetAvailableAspectsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.governance.services.services.AddServicesServiceException.class.equals(type)){
                
                           return org.wso2.carbon.governance.services.services.AddServicesServiceException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.governance.services.services.EditService.class.equals(type)){
                
                           return org.wso2.carbon.governance.services.services.EditService.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.governance.services.services.EditServiceResponse.class.equals(type)){
                
                           return org.wso2.carbon.governance.services.services.EditServiceResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.governance.services.services.AddServicesServiceRegistryException.class.equals(type)){
                
                           return org.wso2.carbon.governance.services.services.AddServicesServiceRegistryException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

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
    
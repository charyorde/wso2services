
/**
 * AccountMgtServiceMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */
        package org.wso2.carbon.account.mgt.services;

        /**
        *  AccountMgtServiceMessageReceiverInOut message receiver
        */

        public class AccountMgtServiceMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        AccountMgtServiceSkeletonInterface skel = (AccountMgtServiceSkeletonInterface)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){


        

            if("finishedDomainValidation".equals(methodName)){
                
                org.wso2.carbon.account.mgt.services.FinishedDomainValidationResponse finishedDomainValidationResponse21 = null;
	                        org.wso2.carbon.account.mgt.services.FinishedDomainValidation wrappedParam =
                                                             (org.wso2.carbon.account.mgt.services.FinishedDomainValidation)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.account.mgt.services.FinishedDomainValidation.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               finishedDomainValidationResponse21 =
                                                   
                                                   
                                                         skel.finishedDomainValidation(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), finishedDomainValidationResponse21, false, new javax.xml.namespace.QName("http://services.mgt.account.carbon.wso2.org",
                                                    "finishedDomainValidation"));
                                    } else 

            if("updateContact".equals(methodName)){
                
                org.wso2.carbon.account.mgt.services.UpdateContact wrappedParam =
                                                             (org.wso2.carbon.account.mgt.services.UpdateContact)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.account.mgt.services.UpdateContact.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               
                                                         skel.updateContact(wrappedParam)
                                                    ;
                                            
                                        envelope = getSOAPFactory(msgContext).getDefaultEnvelope();
                                    } else 

            if("getFullname".equals(methodName)){
                
                org.wso2.carbon.account.mgt.services.GetFullnameResponse getFullnameResponse25 = null;
	                        org.wso2.carbon.account.mgt.services.GetFullname wrappedParam =
                                                             (org.wso2.carbon.account.mgt.services.GetFullname)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.account.mgt.services.GetFullname.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getFullnameResponse25 =
                                                   
                                                   
                                                         skel.getFullname(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getFullnameResponse25, false, new javax.xml.namespace.QName("http://services.mgt.account.carbon.wso2.org",
                                                    "getFullname"));
                                    } else 

            if("getContact".equals(methodName)){
                
                org.wso2.carbon.account.mgt.services.GetContactResponse getContactResponse27 = null;
	                        org.wso2.carbon.account.mgt.services.GetContact wrappedParam =
                                                             (org.wso2.carbon.account.mgt.services.GetContact)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.account.mgt.services.GetContact.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getContactResponse27 =
                                                   
                                                   
                                                         skel.getContact(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getContactResponse27, false, new javax.xml.namespace.QName("http://services.mgt.account.carbon.wso2.org",
                                                    "getContact"));
                                    } else 

            if("isEmailValidated".equals(methodName)){
                
                org.wso2.carbon.account.mgt.services.IsEmailValidatedResponse isEmailValidatedResponse29 = null;
	                        org.wso2.carbon.account.mgt.services.IsEmailValidated wrappedParam =
                                                             (org.wso2.carbon.account.mgt.services.IsEmailValidated)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.account.mgt.services.IsEmailValidated.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               isEmailValidatedResponse29 =
                                                   
                                                   
                                                         skel.isEmailValidated(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), isEmailValidatedResponse29, false, new javax.xml.namespace.QName("http://services.mgt.account.carbon.wso2.org",
                                                    "isEmailValidated"));
                                    } else 

            if("isDomainValidated".equals(methodName)){
                
                org.wso2.carbon.account.mgt.services.IsDomainValidatedResponse isDomainValidatedResponse31 = null;
	                        org.wso2.carbon.account.mgt.services.IsDomainValidated wrappedParam =
                                                             (org.wso2.carbon.account.mgt.services.IsDomainValidated)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.account.mgt.services.IsDomainValidated.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               isDomainValidatedResponse31 =
                                                   
                                                   
                                                         skel.isDomainValidated(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), isDomainValidatedResponse31, false, new javax.xml.namespace.QName("http://services.mgt.account.carbon.wso2.org",
                                                    "isDomainValidated"));
                                    } else 

            if("updateFullname".equals(methodName)){
                
                org.wso2.carbon.account.mgt.services.UpdateFullnameResponse updateFullnameResponse33 = null;
	                        org.wso2.carbon.account.mgt.services.UpdateFullname wrappedParam =
                                                             (org.wso2.carbon.account.mgt.services.UpdateFullname)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.account.mgt.services.UpdateFullname.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               updateFullnameResponse33 =
                                                   
                                                   
                                                         skel.updateFullname(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), updateFullnameResponse33, false, new javax.xml.namespace.QName("http://services.mgt.account.carbon.wso2.org",
                                                    "updateFullname"));
                                    } else 

            if("deactivate".equals(methodName)){
                
                org.wso2.carbon.account.mgt.services.Deactivate wrappedParam =
                                                             (org.wso2.carbon.account.mgt.services.Deactivate)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.account.mgt.services.Deactivate.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               
                                                         skel.deactivate(wrappedParam)
                                                    ;
                                            
                                        envelope = getSOAPFactory(msgContext).getDefaultEnvelope();
                                    } else 

            if("checkDomainAvailability".equals(methodName)){
                
                org.wso2.carbon.account.mgt.services.CheckDomainAvailabilityResponse checkDomainAvailabilityResponse37 = null;
	                        org.wso2.carbon.account.mgt.services.CheckDomainAvailability wrappedParam =
                                                             (org.wso2.carbon.account.mgt.services.CheckDomainAvailability)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.account.mgt.services.CheckDomainAvailability.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               checkDomainAvailabilityResponse37 =
                                                   
                                                   
                                                         skel.checkDomainAvailability(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), checkDomainAvailabilityResponse37, false, new javax.xml.namespace.QName("http://services.mgt.account.carbon.wso2.org",
                                                    "checkDomainAvailability"));
                                    
            } else {
              throw new java.lang.RuntimeException("method not found");
            }
        

        newMsgContext.setEnvelope(envelope);
        }
        } catch (AccountMgtServiceExceptionException e) {

            msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME,"AccountMgtServiceException");
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
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.account.mgt.services.FinishedDomainValidation param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.account.mgt.services.FinishedDomainValidation.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.account.mgt.services.FinishedDomainValidationResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.account.mgt.services.FinishedDomainValidationResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.account.mgt.services.AccountMgtServiceException param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.account.mgt.services.AccountMgtServiceException.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.account.mgt.services.UpdateContact param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.account.mgt.services.UpdateContact.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.account.mgt.services.GetFullname param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.account.mgt.services.GetFullname.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.account.mgt.services.GetFullnameResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.account.mgt.services.GetFullnameResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.account.mgt.services.GetContact param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.account.mgt.services.GetContact.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.account.mgt.services.GetContactResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.account.mgt.services.GetContactResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.account.mgt.services.IsEmailValidated param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.account.mgt.services.IsEmailValidated.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.account.mgt.services.IsEmailValidatedResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.account.mgt.services.IsEmailValidatedResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.account.mgt.services.IsDomainValidated param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.account.mgt.services.IsDomainValidated.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.account.mgt.services.IsDomainValidatedResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.account.mgt.services.IsDomainValidatedResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.account.mgt.services.UpdateFullname param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.account.mgt.services.UpdateFullname.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.account.mgt.services.UpdateFullnameResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.account.mgt.services.UpdateFullnameResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.account.mgt.services.Deactivate param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.account.mgt.services.Deactivate.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.account.mgt.services.CheckDomainAvailability param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.account.mgt.services.CheckDomainAvailability.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.account.mgt.services.CheckDomainAvailabilityResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.account.mgt.services.CheckDomainAvailabilityResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.account.mgt.services.FinishedDomainValidationResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.account.mgt.services.FinishedDomainValidationResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.account.mgt.services.FinishedDomainValidationResponse wrapfinishedDomainValidation(){
                                org.wso2.carbon.account.mgt.services.FinishedDomainValidationResponse wrappedElement = new org.wso2.carbon.account.mgt.services.FinishedDomainValidationResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.account.mgt.services.GetFullnameResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.account.mgt.services.GetFullnameResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.account.mgt.services.GetFullnameResponse wrapgetFullname(){
                                org.wso2.carbon.account.mgt.services.GetFullnameResponse wrappedElement = new org.wso2.carbon.account.mgt.services.GetFullnameResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.account.mgt.services.GetContactResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.account.mgt.services.GetContactResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.account.mgt.services.GetContactResponse wrapgetContact(){
                                org.wso2.carbon.account.mgt.services.GetContactResponse wrappedElement = new org.wso2.carbon.account.mgt.services.GetContactResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.account.mgt.services.IsEmailValidatedResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.account.mgt.services.IsEmailValidatedResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.account.mgt.services.IsEmailValidatedResponse wrapisEmailValidated(){
                                org.wso2.carbon.account.mgt.services.IsEmailValidatedResponse wrappedElement = new org.wso2.carbon.account.mgt.services.IsEmailValidatedResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.account.mgt.services.IsDomainValidatedResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.account.mgt.services.IsDomainValidatedResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.account.mgt.services.IsDomainValidatedResponse wrapisDomainValidated(){
                                org.wso2.carbon.account.mgt.services.IsDomainValidatedResponse wrappedElement = new org.wso2.carbon.account.mgt.services.IsDomainValidatedResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.account.mgt.services.UpdateFullnameResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.account.mgt.services.UpdateFullnameResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.account.mgt.services.UpdateFullnameResponse wrapupdateFullname(){
                                org.wso2.carbon.account.mgt.services.UpdateFullnameResponse wrappedElement = new org.wso2.carbon.account.mgt.services.UpdateFullnameResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.account.mgt.services.CheckDomainAvailabilityResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.account.mgt.services.CheckDomainAvailabilityResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.account.mgt.services.CheckDomainAvailabilityResponse wrapcheckDomainAvailability(){
                                org.wso2.carbon.account.mgt.services.CheckDomainAvailabilityResponse wrappedElement = new org.wso2.carbon.account.mgt.services.CheckDomainAvailabilityResponse();
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
        
                if (org.wso2.carbon.account.mgt.services.FinishedDomainValidation.class.equals(type)){
                
                           return org.wso2.carbon.account.mgt.services.FinishedDomainValidation.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.account.mgt.services.FinishedDomainValidationResponse.class.equals(type)){
                
                           return org.wso2.carbon.account.mgt.services.FinishedDomainValidationResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.account.mgt.services.AccountMgtServiceException.class.equals(type)){
                
                           return org.wso2.carbon.account.mgt.services.AccountMgtServiceException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.account.mgt.services.UpdateContact.class.equals(type)){
                
                           return org.wso2.carbon.account.mgt.services.UpdateContact.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.account.mgt.services.AccountMgtServiceException.class.equals(type)){
                
                           return org.wso2.carbon.account.mgt.services.AccountMgtServiceException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.account.mgt.services.GetFullname.class.equals(type)){
                
                           return org.wso2.carbon.account.mgt.services.GetFullname.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.account.mgt.services.GetFullnameResponse.class.equals(type)){
                
                           return org.wso2.carbon.account.mgt.services.GetFullnameResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.account.mgt.services.AccountMgtServiceException.class.equals(type)){
                
                           return org.wso2.carbon.account.mgt.services.AccountMgtServiceException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.account.mgt.services.GetContact.class.equals(type)){
                
                           return org.wso2.carbon.account.mgt.services.GetContact.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.account.mgt.services.GetContactResponse.class.equals(type)){
                
                           return org.wso2.carbon.account.mgt.services.GetContactResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.account.mgt.services.AccountMgtServiceException.class.equals(type)){
                
                           return org.wso2.carbon.account.mgt.services.AccountMgtServiceException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.account.mgt.services.IsEmailValidated.class.equals(type)){
                
                           return org.wso2.carbon.account.mgt.services.IsEmailValidated.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.account.mgt.services.IsEmailValidatedResponse.class.equals(type)){
                
                           return org.wso2.carbon.account.mgt.services.IsEmailValidatedResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.account.mgt.services.AccountMgtServiceException.class.equals(type)){
                
                           return org.wso2.carbon.account.mgt.services.AccountMgtServiceException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.account.mgt.services.IsDomainValidated.class.equals(type)){
                
                           return org.wso2.carbon.account.mgt.services.IsDomainValidated.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.account.mgt.services.IsDomainValidatedResponse.class.equals(type)){
                
                           return org.wso2.carbon.account.mgt.services.IsDomainValidatedResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.account.mgt.services.AccountMgtServiceException.class.equals(type)){
                
                           return org.wso2.carbon.account.mgt.services.AccountMgtServiceException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.account.mgt.services.UpdateFullname.class.equals(type)){
                
                           return org.wso2.carbon.account.mgt.services.UpdateFullname.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.account.mgt.services.UpdateFullnameResponse.class.equals(type)){
                
                           return org.wso2.carbon.account.mgt.services.UpdateFullnameResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.account.mgt.services.AccountMgtServiceException.class.equals(type)){
                
                           return org.wso2.carbon.account.mgt.services.AccountMgtServiceException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.account.mgt.services.Deactivate.class.equals(type)){
                
                           return org.wso2.carbon.account.mgt.services.Deactivate.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.account.mgt.services.AccountMgtServiceException.class.equals(type)){
                
                           return org.wso2.carbon.account.mgt.services.AccountMgtServiceException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.account.mgt.services.CheckDomainAvailability.class.equals(type)){
                
                           return org.wso2.carbon.account.mgt.services.CheckDomainAvailability.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.account.mgt.services.CheckDomainAvailabilityResponse.class.equals(type)){
                
                           return org.wso2.carbon.account.mgt.services.CheckDomainAvailabilityResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.account.mgt.services.AccountMgtServiceException.class.equals(type)){
                
                           return org.wso2.carbon.account.mgt.services.AccountMgtServiceException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

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
    
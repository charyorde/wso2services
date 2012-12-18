
/**
 * ValidateDomainAdminServiceMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */
        package org.wso2.carbon.validate.domain.services;

        /**
        *  ValidateDomainAdminServiceMessageReceiverInOut message receiver
        */

        public class ValidateDomainAdminServiceMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        ValidateDomainAdminServiceSkeletonInterface skel = (ValidateDomainAdminServiceSkeletonInterface)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){


        

            if("validateByTextInRoot".equals(methodName)){
                
                org.wso2.carbon.validate.domain.services.ValidateByTextInRootResponse validateByTextInRootResponse7 = null;
	                        org.wso2.carbon.validate.domain.services.ValidateByTextInRoot wrappedParam =
                                                             (org.wso2.carbon.validate.domain.services.ValidateByTextInRoot)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.validate.domain.services.ValidateByTextInRoot.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               validateByTextInRootResponse7 =
                                                   
                                                   
                                                         skel.validateByTextInRoot(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), validateByTextInRootResponse7, false, new javax.xml.namespace.QName("http://services.domain.validate.carbon.wso2.org",
                                                    "validateByTextInRoot"));
                                    } else 

            if("validateByDNSEntry".equals(methodName)){
                
                org.wso2.carbon.validate.domain.services.ValidateByDNSEntryResponse validateByDNSEntryResponse9 = null;
	                        org.wso2.carbon.validate.domain.services.ValidateByDNSEntry wrappedParam =
                                                             (org.wso2.carbon.validate.domain.services.ValidateByDNSEntry)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.validate.domain.services.ValidateByDNSEntry.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               validateByDNSEntryResponse9 =
                                                   
                                                   
                                                         skel.validateByDNSEntry(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), validateByDNSEntryResponse9, false, new javax.xml.namespace.QName("http://services.domain.validate.carbon.wso2.org",
                                                    "validateByDNSEntry"));
                                    } else 

            if("getDomainValidationKey".equals(methodName)){
                
                org.wso2.carbon.validate.domain.services.GetDomainValidationKeyResponse getDomainValidationKeyResponse11 = null;
	                        org.wso2.carbon.validate.domain.services.GetDomainValidationKey wrappedParam =
                                                             (org.wso2.carbon.validate.domain.services.GetDomainValidationKey)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.validate.domain.services.GetDomainValidationKey.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getDomainValidationKeyResponse11 =
                                                   
                                                   
                                                         skel.getDomainValidationKey(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getDomainValidationKeyResponse11, false, new javax.xml.namespace.QName("http://services.domain.validate.carbon.wso2.org",
                                                    "getDomainValidationKey"));
                                    
            } else {
              throw new java.lang.RuntimeException("method not found");
            }
        

        newMsgContext.setEnvelope(envelope);
        }
        } catch (ValidateDomainAdminServiceExceptionException e) {

            msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME,"ValidateDomainAdminServiceException");
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
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.validate.domain.services.ValidateByTextInRoot param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.validate.domain.services.ValidateByTextInRoot.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.validate.domain.services.ValidateByTextInRootResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.validate.domain.services.ValidateByTextInRootResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.validate.domain.services.ValidateDomainAdminServiceException param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.validate.domain.services.ValidateDomainAdminServiceException.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.validate.domain.services.ValidateByDNSEntry param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.validate.domain.services.ValidateByDNSEntry.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.validate.domain.services.ValidateByDNSEntryResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.validate.domain.services.ValidateByDNSEntryResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.validate.domain.services.GetDomainValidationKey param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.validate.domain.services.GetDomainValidationKey.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.validate.domain.services.GetDomainValidationKeyResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.validate.domain.services.GetDomainValidationKeyResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.validate.domain.services.ValidateByTextInRootResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.validate.domain.services.ValidateByTextInRootResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.validate.domain.services.ValidateByTextInRootResponse wrapvalidateByTextInRoot(){
                                org.wso2.carbon.validate.domain.services.ValidateByTextInRootResponse wrappedElement = new org.wso2.carbon.validate.domain.services.ValidateByTextInRootResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.validate.domain.services.ValidateByDNSEntryResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.validate.domain.services.ValidateByDNSEntryResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.validate.domain.services.ValidateByDNSEntryResponse wrapvalidateByDNSEntry(){
                                org.wso2.carbon.validate.domain.services.ValidateByDNSEntryResponse wrappedElement = new org.wso2.carbon.validate.domain.services.ValidateByDNSEntryResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.validate.domain.services.GetDomainValidationKeyResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.validate.domain.services.GetDomainValidationKeyResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.validate.domain.services.GetDomainValidationKeyResponse wrapgetDomainValidationKey(){
                                org.wso2.carbon.validate.domain.services.GetDomainValidationKeyResponse wrappedElement = new org.wso2.carbon.validate.domain.services.GetDomainValidationKeyResponse();
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
        
                if (org.wso2.carbon.validate.domain.services.ValidateByTextInRoot.class.equals(type)){
                
                           return org.wso2.carbon.validate.domain.services.ValidateByTextInRoot.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.validate.domain.services.ValidateByTextInRootResponse.class.equals(type)){
                
                           return org.wso2.carbon.validate.domain.services.ValidateByTextInRootResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.validate.domain.services.ValidateDomainAdminServiceException.class.equals(type)){
                
                           return org.wso2.carbon.validate.domain.services.ValidateDomainAdminServiceException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.validate.domain.services.ValidateByDNSEntry.class.equals(type)){
                
                           return org.wso2.carbon.validate.domain.services.ValidateByDNSEntry.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.validate.domain.services.ValidateByDNSEntryResponse.class.equals(type)){
                
                           return org.wso2.carbon.validate.domain.services.ValidateByDNSEntryResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.validate.domain.services.ValidateDomainAdminServiceException.class.equals(type)){
                
                           return org.wso2.carbon.validate.domain.services.ValidateDomainAdminServiceException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.validate.domain.services.GetDomainValidationKey.class.equals(type)){
                
                           return org.wso2.carbon.validate.domain.services.GetDomainValidationKey.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.validate.domain.services.GetDomainValidationKeyResponse.class.equals(type)){
                
                           return org.wso2.carbon.validate.domain.services.GetDomainValidationKeyResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.validate.domain.services.ValidateDomainAdminServiceException.class.equals(type)){
                
                           return org.wso2.carbon.validate.domain.services.ValidateDomainAdminServiceException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

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
    
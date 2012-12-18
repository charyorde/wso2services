
/**
 * TokenBasedAuthenticatorMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */
        package org.wso2.carbon.identity.authenticator.token;

        /**
        *  TokenBasedAuthenticatorMessageReceiverInOut message receiver
        */

        public class TokenBasedAuthenticatorMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        TokenBasedAuthenticatorSkeletonInterface skel = (TokenBasedAuthenticatorSkeletonInterface)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){


        

            if("isDisabled".equals(methodName)){
                
                org.wso2.carbon.identity.authenticator.token.IsDisabledResponse isDisabledResponse15 = null;
	                        org.wso2.carbon.identity.authenticator.token.IsDisabled wrappedParam =
                                                             (org.wso2.carbon.identity.authenticator.token.IsDisabled)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.identity.authenticator.token.IsDisabled.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               isDisabledResponse15 =
                                                   
                                                   
                                                         skel.isDisabled(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), isDisabledResponse15, false, new javax.xml.namespace.QName("http://token.authenticator.identity.carbon.wso2.org",
                                                    "isDisabled"));
                                    } else 

            if("getPriority".equals(methodName)){
                
                org.wso2.carbon.identity.authenticator.token.GetPriorityResponse getPriorityResponse17 = null;
	                        org.wso2.carbon.identity.authenticator.token.GetPriority wrappedParam =
                                                             (org.wso2.carbon.identity.authenticator.token.GetPriority)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.identity.authenticator.token.GetPriority.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getPriorityResponse17 =
                                                   
                                                   
                                                         skel.getPriority(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getPriorityResponse17, false, new javax.xml.namespace.QName("http://token.authenticator.identity.carbon.wso2.org",
                                                    "getPriority"));
                                    } else 

            if("authenticateWithRememberMe".equals(methodName)){
                
                org.wso2.carbon.identity.authenticator.token.AuthenticateWithRememberMeResponse authenticateWithRememberMeResponse19 = null;
	                        org.wso2.carbon.identity.authenticator.token.AuthenticateWithRememberMe wrappedParam =
                                                             (org.wso2.carbon.identity.authenticator.token.AuthenticateWithRememberMe)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.identity.authenticator.token.AuthenticateWithRememberMe.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               authenticateWithRememberMeResponse19 =
                                                   
                                                   
                                                         skel.authenticateWithRememberMe(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), authenticateWithRememberMeResponse19, false, new javax.xml.namespace.QName("http://token.authenticator.identity.carbon.wso2.org",
                                                    "authenticateWithRememberMe"));
                                    } else 

            if("getAutheticationToken".equals(methodName)){
                
                org.wso2.carbon.identity.authenticator.token.GetAutheticationTokenResponse getAutheticationTokenResponse21 = null;
	                        org.wso2.carbon.identity.authenticator.token.GetAutheticationToken wrappedParam =
                                                             (org.wso2.carbon.identity.authenticator.token.GetAutheticationToken)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.identity.authenticator.token.GetAutheticationToken.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getAutheticationTokenResponse21 =
                                                   
                                                   
                                                         skel.getAutheticationToken(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getAutheticationTokenResponse21, false, new javax.xml.namespace.QName("http://token.authenticator.identity.carbon.wso2.org",
                                                    "getAutheticationToken"));
                                    } else 

            if("isAuthenticated".equals(methodName)){
                
                org.wso2.carbon.identity.authenticator.token.IsAuthenticatedResponse isAuthenticatedResponse23 = null;
	                        org.wso2.carbon.identity.authenticator.token.IsAuthenticated wrappedParam =
                                                             (org.wso2.carbon.identity.authenticator.token.IsAuthenticated)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.identity.authenticator.token.IsAuthenticated.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               isAuthenticatedResponse23 =
                                                   
                                                   
                                                         skel.isAuthenticated(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), isAuthenticatedResponse23, false, new javax.xml.namespace.QName("http://token.authenticator.identity.carbon.wso2.org",
                                                    "isAuthenticated"));
                                    } else 

            if("getAuthenticatorName".equals(methodName)){
                
                org.wso2.carbon.identity.authenticator.token.GetAuthenticatorNameResponse getAuthenticatorNameResponse25 = null;
	                        org.wso2.carbon.identity.authenticator.token.GetAuthenticatorName wrappedParam =
                                                             (org.wso2.carbon.identity.authenticator.token.GetAuthenticatorName)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.identity.authenticator.token.GetAuthenticatorName.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getAuthenticatorNameResponse25 =
                                                   
                                                   
                                                         skel.getAuthenticatorName(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getAuthenticatorNameResponse25, false, new javax.xml.namespace.QName("http://token.authenticator.identity.carbon.wso2.org",
                                                    "getAuthenticatorName"));
                                    } else 

            if("isHandle".equals(methodName)){
                
                org.wso2.carbon.identity.authenticator.token.IsHandleResponse isHandleResponse27 = null;
	                        org.wso2.carbon.identity.authenticator.token.IsHandle wrappedParam =
                                                             (org.wso2.carbon.identity.authenticator.token.IsHandle)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.identity.authenticator.token.IsHandle.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               isHandleResponse27 =
                                                   
                                                   
                                                         skel.isHandle(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), isHandleResponse27, false, new javax.xml.namespace.QName("http://token.authenticator.identity.carbon.wso2.org",
                                                    "isHandle"));
                                    
            } else {
              throw new java.lang.RuntimeException("method not found");
            }
        

        newMsgContext.setEnvelope(envelope);
        }
        } catch (TokenBasedAuthenticatorAuthenticationExceptionException e) {

            msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME,"TokenBasedAuthenticatorAuthenticationException");
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
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.identity.authenticator.token.IsDisabled param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.identity.authenticator.token.IsDisabled.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.identity.authenticator.token.IsDisabledResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.identity.authenticator.token.IsDisabledResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.identity.authenticator.token.GetPriority param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.identity.authenticator.token.GetPriority.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.identity.authenticator.token.GetPriorityResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.identity.authenticator.token.GetPriorityResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.identity.authenticator.token.AuthenticateWithRememberMe param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.identity.authenticator.token.AuthenticateWithRememberMe.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.identity.authenticator.token.AuthenticateWithRememberMeResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.identity.authenticator.token.AuthenticateWithRememberMeResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.identity.authenticator.token.GetAutheticationToken param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.identity.authenticator.token.GetAutheticationToken.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.identity.authenticator.token.GetAutheticationTokenResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.identity.authenticator.token.GetAutheticationTokenResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.identity.authenticator.token.TokenBasedAuthenticatorAuthenticationException param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.identity.authenticator.token.TokenBasedAuthenticatorAuthenticationException.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.identity.authenticator.token.IsAuthenticated param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.identity.authenticator.token.IsAuthenticated.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.identity.authenticator.token.IsAuthenticatedResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.identity.authenticator.token.IsAuthenticatedResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.identity.authenticator.token.GetAuthenticatorName param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.identity.authenticator.token.GetAuthenticatorName.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.identity.authenticator.token.GetAuthenticatorNameResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.identity.authenticator.token.GetAuthenticatorNameResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.identity.authenticator.token.IsHandle param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.identity.authenticator.token.IsHandle.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.identity.authenticator.token.IsHandleResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.identity.authenticator.token.IsHandleResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.identity.authenticator.token.IsDisabledResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.identity.authenticator.token.IsDisabledResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.identity.authenticator.token.IsDisabledResponse wrapisDisabled(){
                                org.wso2.carbon.identity.authenticator.token.IsDisabledResponse wrappedElement = new org.wso2.carbon.identity.authenticator.token.IsDisabledResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.identity.authenticator.token.GetPriorityResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.identity.authenticator.token.GetPriorityResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.identity.authenticator.token.GetPriorityResponse wrapgetPriority(){
                                org.wso2.carbon.identity.authenticator.token.GetPriorityResponse wrappedElement = new org.wso2.carbon.identity.authenticator.token.GetPriorityResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.identity.authenticator.token.AuthenticateWithRememberMeResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.identity.authenticator.token.AuthenticateWithRememberMeResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.identity.authenticator.token.AuthenticateWithRememberMeResponse wrapauthenticateWithRememberMe(){
                                org.wso2.carbon.identity.authenticator.token.AuthenticateWithRememberMeResponse wrappedElement = new org.wso2.carbon.identity.authenticator.token.AuthenticateWithRememberMeResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.identity.authenticator.token.GetAutheticationTokenResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.identity.authenticator.token.GetAutheticationTokenResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.identity.authenticator.token.GetAutheticationTokenResponse wrapgetAutheticationToken(){
                                org.wso2.carbon.identity.authenticator.token.GetAutheticationTokenResponse wrappedElement = new org.wso2.carbon.identity.authenticator.token.GetAutheticationTokenResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.identity.authenticator.token.IsAuthenticatedResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.identity.authenticator.token.IsAuthenticatedResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.identity.authenticator.token.IsAuthenticatedResponse wrapisAuthenticated(){
                                org.wso2.carbon.identity.authenticator.token.IsAuthenticatedResponse wrappedElement = new org.wso2.carbon.identity.authenticator.token.IsAuthenticatedResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.identity.authenticator.token.GetAuthenticatorNameResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.identity.authenticator.token.GetAuthenticatorNameResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.identity.authenticator.token.GetAuthenticatorNameResponse wrapgetAuthenticatorName(){
                                org.wso2.carbon.identity.authenticator.token.GetAuthenticatorNameResponse wrappedElement = new org.wso2.carbon.identity.authenticator.token.GetAuthenticatorNameResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.identity.authenticator.token.IsHandleResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.identity.authenticator.token.IsHandleResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.identity.authenticator.token.IsHandleResponse wrapisHandle(){
                                org.wso2.carbon.identity.authenticator.token.IsHandleResponse wrappedElement = new org.wso2.carbon.identity.authenticator.token.IsHandleResponse();
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
        
                if (org.wso2.carbon.identity.authenticator.token.IsDisabled.class.equals(type)){
                
                           return org.wso2.carbon.identity.authenticator.token.IsDisabled.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.identity.authenticator.token.IsDisabledResponse.class.equals(type)){
                
                           return org.wso2.carbon.identity.authenticator.token.IsDisabledResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.identity.authenticator.token.GetPriority.class.equals(type)){
                
                           return org.wso2.carbon.identity.authenticator.token.GetPriority.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.identity.authenticator.token.GetPriorityResponse.class.equals(type)){
                
                           return org.wso2.carbon.identity.authenticator.token.GetPriorityResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.identity.authenticator.token.AuthenticateWithRememberMe.class.equals(type)){
                
                           return org.wso2.carbon.identity.authenticator.token.AuthenticateWithRememberMe.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.identity.authenticator.token.AuthenticateWithRememberMeResponse.class.equals(type)){
                
                           return org.wso2.carbon.identity.authenticator.token.AuthenticateWithRememberMeResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.identity.authenticator.token.GetAutheticationToken.class.equals(type)){
                
                           return org.wso2.carbon.identity.authenticator.token.GetAutheticationToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.identity.authenticator.token.GetAutheticationTokenResponse.class.equals(type)){
                
                           return org.wso2.carbon.identity.authenticator.token.GetAutheticationTokenResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.identity.authenticator.token.TokenBasedAuthenticatorAuthenticationException.class.equals(type)){
                
                           return org.wso2.carbon.identity.authenticator.token.TokenBasedAuthenticatorAuthenticationException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.identity.authenticator.token.IsAuthenticated.class.equals(type)){
                
                           return org.wso2.carbon.identity.authenticator.token.IsAuthenticated.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.identity.authenticator.token.IsAuthenticatedResponse.class.equals(type)){
                
                           return org.wso2.carbon.identity.authenticator.token.IsAuthenticatedResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.identity.authenticator.token.GetAuthenticatorName.class.equals(type)){
                
                           return org.wso2.carbon.identity.authenticator.token.GetAuthenticatorName.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.identity.authenticator.token.GetAuthenticatorNameResponse.class.equals(type)){
                
                           return org.wso2.carbon.identity.authenticator.token.GetAuthenticatorNameResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.identity.authenticator.token.IsHandle.class.equals(type)){
                
                           return org.wso2.carbon.identity.authenticator.token.IsHandle.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.identity.authenticator.token.IsHandleResponse.class.equals(type)){
                
                           return org.wso2.carbon.identity.authenticator.token.IsHandleResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

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
    
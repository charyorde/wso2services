
/**
 * AuthenticationAdminMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */
        package org.wso2.carbon.core.services.authentication;

        /**
        *  AuthenticationAdminMessageReceiverInOut message receiver
        */

        public class AuthenticationAdminMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        AuthenticationAdminSkeletonInterface skel = (AuthenticationAdminSkeletonInterface)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){


        

            if("loginWithRememberMeOption".equals(methodName)){
                
                org.wso2.carbon.core.services.authentication.LoginWithRememberMeOptionResponse loginWithRememberMeOptionResponse16 = null;
	                        org.wso2.carbon.core.services.authentication.LoginWithRememberMeOption wrappedParam =
                                                             (org.wso2.carbon.core.services.authentication.LoginWithRememberMeOption)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.core.services.authentication.LoginWithRememberMeOption.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               loginWithRememberMeOptionResponse16 =
                                                   
                                                   
                                                         skel.loginWithRememberMeOption(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), loginWithRememberMeOptionResponse16, false, new javax.xml.namespace.QName("http://authentication.services.core.carbon.wso2.org",
                                                    "loginWithRememberMeOption"));
                                    } else 

            if("login".equals(methodName)){
                
                org.wso2.carbon.core.services.authentication.LoginResponse loginResponse18 = null;
	                        org.wso2.carbon.core.services.authentication.Login wrappedParam =
                                                             (org.wso2.carbon.core.services.authentication.Login)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.core.services.authentication.Login.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               loginResponse18 =
                                                   
                                                   
                                                         skel.login(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), loginResponse18, false, new javax.xml.namespace.QName("http://authentication.services.core.carbon.wso2.org",
                                                    "login"));
                                    } else 

            if("getAuthenticatorName".equals(methodName)){
                
                org.wso2.carbon.core.services.authentication.GetAuthenticatorNameResponse getAuthenticatorNameResponse20 = null;
	                        org.wso2.carbon.core.services.authentication.GetAuthenticatorName wrappedParam =
                                                             (org.wso2.carbon.core.services.authentication.GetAuthenticatorName)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.core.services.authentication.GetAuthenticatorName.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getAuthenticatorNameResponse20 =
                                                   
                                                   
                                                         skel.getAuthenticatorName(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getAuthenticatorNameResponse20, false, new javax.xml.namespace.QName("http://authentication.services.core.carbon.wso2.org",
                                                    "getAuthenticatorName"));
                                    } else 

            if("getPriority".equals(methodName)){
                
                org.wso2.carbon.core.services.authentication.GetPriorityResponse getPriorityResponse22 = null;
	                        org.wso2.carbon.core.services.authentication.GetPriority wrappedParam =
                                                             (org.wso2.carbon.core.services.authentication.GetPriority)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.core.services.authentication.GetPriority.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getPriorityResponse22 =
                                                   
                                                   
                                                         skel.getPriority(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getPriorityResponse22, false, new javax.xml.namespace.QName("http://authentication.services.core.carbon.wso2.org",
                                                    "getPriority"));
                                    } else 

            if("isDisabled".equals(methodName)){
                
                org.wso2.carbon.core.services.authentication.IsDisabledResponse isDisabledResponse24 = null;
	                        org.wso2.carbon.core.services.authentication.IsDisabled wrappedParam =
                                                             (org.wso2.carbon.core.services.authentication.IsDisabled)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.core.services.authentication.IsDisabled.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               isDisabledResponse24 =
                                                   
                                                   
                                                         skel.isDisabled(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), isDisabledResponse24, false, new javax.xml.namespace.QName("http://authentication.services.core.carbon.wso2.org",
                                                    "isDisabled"));
                                    } else 

            if("authenticateWithRememberMe".equals(methodName)){
                
                org.wso2.carbon.core.services.authentication.AuthenticateWithRememberMeResponse authenticateWithRememberMeResponse26 = null;
	                        org.wso2.carbon.core.services.authentication.AuthenticateWithRememberMe wrappedParam =
                                                             (org.wso2.carbon.core.services.authentication.AuthenticateWithRememberMe)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.core.services.authentication.AuthenticateWithRememberMe.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               authenticateWithRememberMeResponse26 =
                                                   
                                                   
                                                         skel.authenticateWithRememberMe(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), authenticateWithRememberMeResponse26, false, new javax.xml.namespace.QName("http://authentication.services.core.carbon.wso2.org",
                                                    "authenticateWithRememberMe"));
                                    } else 

            if("loginWithRememberMeCookie".equals(methodName)){
                
                org.wso2.carbon.core.services.authentication.LoginWithRememberMeCookieResponse loginWithRememberMeCookieResponse28 = null;
	                        org.wso2.carbon.core.services.authentication.LoginWithRememberMeCookie wrappedParam =
                                                             (org.wso2.carbon.core.services.authentication.LoginWithRememberMeCookie)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.core.services.authentication.LoginWithRememberMeCookie.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               loginWithRememberMeCookieResponse28 =
                                                   
                                                   
                                                         skel.loginWithRememberMeCookie(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), loginWithRememberMeCookieResponse28, false, new javax.xml.namespace.QName("http://authentication.services.core.carbon.wso2.org",
                                                    "loginWithRememberMeCookie"));
                                    
            } else {
              throw new java.lang.RuntimeException("method not found");
            }
        

        newMsgContext.setEnvelope(envelope);
        }
        } catch (AuthenticationAdminAuthenticationExceptionException e) {

            msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME,"AuthenticationAdminAuthenticationException");
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
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.core.services.authentication.Logout param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.core.services.authentication.Logout.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.core.services.authentication.AuthenticationAdminAuthenticationException param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.core.services.authentication.AuthenticationAdminAuthenticationException.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.core.services.authentication.LoginWithRememberMeOption param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.core.services.authentication.LoginWithRememberMeOption.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.core.services.authentication.LoginWithRememberMeOptionResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.core.services.authentication.LoginWithRememberMeOptionResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.core.services.authentication.Login param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.core.services.authentication.Login.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.core.services.authentication.LoginResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.core.services.authentication.LoginResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.core.services.authentication.GetAuthenticatorName param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.core.services.authentication.GetAuthenticatorName.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.core.services.authentication.GetAuthenticatorNameResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.core.services.authentication.GetAuthenticatorNameResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.core.services.authentication.GetPriority param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.core.services.authentication.GetPriority.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.core.services.authentication.GetPriorityResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.core.services.authentication.GetPriorityResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.core.services.authentication.IsDisabled param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.core.services.authentication.IsDisabled.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.core.services.authentication.IsDisabledResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.core.services.authentication.IsDisabledResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.core.services.authentication.AuthenticateWithRememberMe param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.core.services.authentication.AuthenticateWithRememberMe.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.core.services.authentication.AuthenticateWithRememberMeResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.core.services.authentication.AuthenticateWithRememberMeResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.core.services.authentication.LoginWithRememberMeCookie param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.core.services.authentication.LoginWithRememberMeCookie.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.core.services.authentication.LoginWithRememberMeCookieResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.core.services.authentication.LoginWithRememberMeCookieResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.core.services.authentication.LoginWithRememberMeOptionResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.core.services.authentication.LoginWithRememberMeOptionResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.core.services.authentication.LoginWithRememberMeOptionResponse wraploginWithRememberMeOption(){
                                org.wso2.carbon.core.services.authentication.LoginWithRememberMeOptionResponse wrappedElement = new org.wso2.carbon.core.services.authentication.LoginWithRememberMeOptionResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.core.services.authentication.LoginResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.core.services.authentication.LoginResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.core.services.authentication.LoginResponse wraplogin(){
                                org.wso2.carbon.core.services.authentication.LoginResponse wrappedElement = new org.wso2.carbon.core.services.authentication.LoginResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.core.services.authentication.GetAuthenticatorNameResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.core.services.authentication.GetAuthenticatorNameResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.core.services.authentication.GetAuthenticatorNameResponse wrapgetAuthenticatorName(){
                                org.wso2.carbon.core.services.authentication.GetAuthenticatorNameResponse wrappedElement = new org.wso2.carbon.core.services.authentication.GetAuthenticatorNameResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.core.services.authentication.GetPriorityResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.core.services.authentication.GetPriorityResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.core.services.authentication.GetPriorityResponse wrapgetPriority(){
                                org.wso2.carbon.core.services.authentication.GetPriorityResponse wrappedElement = new org.wso2.carbon.core.services.authentication.GetPriorityResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.core.services.authentication.IsDisabledResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.core.services.authentication.IsDisabledResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.core.services.authentication.IsDisabledResponse wrapisDisabled(){
                                org.wso2.carbon.core.services.authentication.IsDisabledResponse wrappedElement = new org.wso2.carbon.core.services.authentication.IsDisabledResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.core.services.authentication.AuthenticateWithRememberMeResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.core.services.authentication.AuthenticateWithRememberMeResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.core.services.authentication.AuthenticateWithRememberMeResponse wrapauthenticateWithRememberMe(){
                                org.wso2.carbon.core.services.authentication.AuthenticateWithRememberMeResponse wrappedElement = new org.wso2.carbon.core.services.authentication.AuthenticateWithRememberMeResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.core.services.authentication.LoginWithRememberMeCookieResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.core.services.authentication.LoginWithRememberMeCookieResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.core.services.authentication.LoginWithRememberMeCookieResponse wraploginWithRememberMeCookie(){
                                org.wso2.carbon.core.services.authentication.LoginWithRememberMeCookieResponse wrappedElement = new org.wso2.carbon.core.services.authentication.LoginWithRememberMeCookieResponse();
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
        
                if (org.wso2.carbon.core.services.authentication.Logout.class.equals(type)){
                
                           return org.wso2.carbon.core.services.authentication.Logout.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.core.services.authentication.AuthenticationAdminAuthenticationException.class.equals(type)){
                
                           return org.wso2.carbon.core.services.authentication.AuthenticationAdminAuthenticationException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.core.services.authentication.LoginWithRememberMeOption.class.equals(type)){
                
                           return org.wso2.carbon.core.services.authentication.LoginWithRememberMeOption.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.core.services.authentication.LoginWithRememberMeOptionResponse.class.equals(type)){
                
                           return org.wso2.carbon.core.services.authentication.LoginWithRememberMeOptionResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.core.services.authentication.AuthenticationAdminAuthenticationException.class.equals(type)){
                
                           return org.wso2.carbon.core.services.authentication.AuthenticationAdminAuthenticationException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.core.services.authentication.Login.class.equals(type)){
                
                           return org.wso2.carbon.core.services.authentication.Login.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.core.services.authentication.LoginResponse.class.equals(type)){
                
                           return org.wso2.carbon.core.services.authentication.LoginResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.core.services.authentication.AuthenticationAdminAuthenticationException.class.equals(type)){
                
                           return org.wso2.carbon.core.services.authentication.AuthenticationAdminAuthenticationException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.core.services.authentication.GetAuthenticatorName.class.equals(type)){
                
                           return org.wso2.carbon.core.services.authentication.GetAuthenticatorName.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.core.services.authentication.GetAuthenticatorNameResponse.class.equals(type)){
                
                           return org.wso2.carbon.core.services.authentication.GetAuthenticatorNameResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.core.services.authentication.GetPriority.class.equals(type)){
                
                           return org.wso2.carbon.core.services.authentication.GetPriority.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.core.services.authentication.GetPriorityResponse.class.equals(type)){
                
                           return org.wso2.carbon.core.services.authentication.GetPriorityResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.core.services.authentication.IsDisabled.class.equals(type)){
                
                           return org.wso2.carbon.core.services.authentication.IsDisabled.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.core.services.authentication.IsDisabledResponse.class.equals(type)){
                
                           return org.wso2.carbon.core.services.authentication.IsDisabledResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.core.services.authentication.AuthenticateWithRememberMe.class.equals(type)){
                
                           return org.wso2.carbon.core.services.authentication.AuthenticateWithRememberMe.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.core.services.authentication.AuthenticateWithRememberMeResponse.class.equals(type)){
                
                           return org.wso2.carbon.core.services.authentication.AuthenticateWithRememberMeResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.core.services.authentication.LoginWithRememberMeCookie.class.equals(type)){
                
                           return org.wso2.carbon.core.services.authentication.LoginWithRememberMeCookie.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.core.services.authentication.LoginWithRememberMeCookieResponse.class.equals(type)){
                
                           return org.wso2.carbon.core.services.authentication.LoginWithRememberMeCookieResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

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
    
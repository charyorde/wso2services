
/**
 * OpenIDProviderServiceMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */
        package org.wso2.carbon.identity.provider;

        /**
        *  OpenIDProviderServiceMessageReceiverInOut message receiver
        */

        public class OpenIDProviderServiceMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        OpenIDProviderServiceSkeletonInterface skel = (OpenIDProviderServiceSkeletonInterface)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){


        

            if("retrievePapeInfo".equals(methodName)){
                
                axis2.apache.org.xsd.RetrievePapeInfoResponse retrievePapeInfoResponse23 = null;
	                        axis2.apache.org.xsd.RetrievePapeInfo wrappedParam =
                                                             (axis2.apache.org.xsd.RetrievePapeInfo)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    axis2.apache.org.xsd.RetrievePapeInfo.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               retrievePapeInfoResponse23 =
                                                   
                                                   
                                                         skel.retrievePapeInfo(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), retrievePapeInfoResponse23, false, new javax.xml.namespace.QName("http://provider.identity.carbon.wso2.org",
                                                    "retrievePapeInfo"));
                                    } else 

            if("verify".equals(methodName)){
                
                axis2.apache.org.xsd.VerifyResponse verifyResponse25 = null;
	                        axis2.apache.org.xsd.Verify wrappedParam =
                                                             (axis2.apache.org.xsd.Verify)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    axis2.apache.org.xsd.Verify.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               verifyResponse25 =
                                                   
                                                   
                                                         skel.verify(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), verifyResponse25, false, new javax.xml.namespace.QName("http://provider.identity.carbon.wso2.org",
                                                    "verify"));
                                    } else 

            if("doXMPPBasedMultiFactorAuthForInfocard".equals(methodName)){
                
                axis2.apache.org.xsd.DoXMPPBasedMultiFactorAuthForInfocardResponse doXMPPBasedMultiFactorAuthForInfocardResponse27 = null;
	                        axis2.apache.org.xsd.DoXMPPBasedMultiFactorAuthForInfocard wrappedParam =
                                                             (axis2.apache.org.xsd.DoXMPPBasedMultiFactorAuthForInfocard)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    axis2.apache.org.xsd.DoXMPPBasedMultiFactorAuthForInfocard.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               doXMPPBasedMultiFactorAuthForInfocardResponse27 =
                                                   
                                                   
                                                         skel.doXMPPBasedMultiFactorAuthForInfocard(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), doXMPPBasedMultiFactorAuthForInfocardResponse27, false, new javax.xml.namespace.QName("http://provider.identity.carbon.wso2.org",
                                                    "doXMPPBasedMultiFactorAuthForInfocard"));
                                    } else 

            if("getUserProfiles".equals(methodName)){
                
                axis2.apache.org.xsd.GetUserProfilesResponse getUserProfilesResponse29 = null;
	                        axis2.apache.org.xsd.GetUserProfiles wrappedParam =
                                                             (axis2.apache.org.xsd.GetUserProfiles)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    axis2.apache.org.xsd.GetUserProfiles.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getUserProfilesResponse29 =
                                                   
                                                   
                                                         skel.getUserProfiles(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getUserProfilesResponse29, false, new javax.xml.namespace.QName("http://provider.identity.carbon.wso2.org",
                                                    "getUserProfiles"));
                                    } else 

            if("getClaimValues".equals(methodName)){
                
                axis2.apache.org.xsd.GetClaimValuesResponse getClaimValuesResponse31 = null;
	                        axis2.apache.org.xsd.GetClaimValues wrappedParam =
                                                             (axis2.apache.org.xsd.GetClaimValues)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    axis2.apache.org.xsd.GetClaimValues.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getClaimValuesResponse31 =
                                                   
                                                   
                                                         skel.getClaimValues(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getClaimValuesResponse31, false, new javax.xml.namespace.QName("http://provider.identity.carbon.wso2.org",
                                                    "getClaimValues"));
                                    } else 

            if("getOpenIDAuthResponse".equals(methodName)){
                
                axis2.apache.org.xsd.GetOpenIDAuthResponseResponse getOpenIDAuthResponseResponse33 = null;
	                        axis2.apache.org.xsd.GetOpenIDAuthResponse wrappedParam =
                                                             (axis2.apache.org.xsd.GetOpenIDAuthResponse)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    axis2.apache.org.xsd.GetOpenIDAuthResponse.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getOpenIDAuthResponseResponse33 =
                                                   
                                                   
                                                         skel.getOpenIDAuthResponse(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getOpenIDAuthResponseResponse33, false, new javax.xml.namespace.QName("http://provider.identity.carbon.wso2.org",
                                                    "getOpenIDAuthResponse"));
                                    } else 

            if("getOpenIDAssociationResponse".equals(methodName)){
                
                axis2.apache.org.xsd.GetOpenIDAssociationResponseResponse getOpenIDAssociationResponseResponse35 = null;
	                        axis2.apache.org.xsd.GetOpenIDAssociationResponse wrappedParam =
                                                             (axis2.apache.org.xsd.GetOpenIDAssociationResponse)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    axis2.apache.org.xsd.GetOpenIDAssociationResponse.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getOpenIDAssociationResponseResponse35 =
                                                   
                                                   
                                                         skel.getOpenIDAssociationResponse(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getOpenIDAssociationResponseResponse35, false, new javax.xml.namespace.QName("http://provider.identity.carbon.wso2.org",
                                                    "getOpenIDAssociationResponse"));
                                    } else 

            if("getOpenIDProviderInfo".equals(methodName)){
                
                axis2.apache.org.xsd.GetOpenIDProviderInfoResponse getOpenIDProviderInfoResponse37 = null;
	                        axis2.apache.org.xsd.GetOpenIDProviderInfo wrappedParam =
                                                             (axis2.apache.org.xsd.GetOpenIDProviderInfo)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    axis2.apache.org.xsd.GetOpenIDProviderInfo.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getOpenIDProviderInfoResponse37 =
                                                   
                                                   
                                                         skel.getOpenIDProviderInfo(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getOpenIDProviderInfoResponse37, false, new javax.xml.namespace.QName("http://provider.identity.carbon.wso2.org",
                                                    "getOpenIDProviderInfo"));
                                    } else 

            if("authenticateWithOpenID".equals(methodName)){
                
                axis2.apache.org.xsd.AuthenticateWithOpenIDResponse authenticateWithOpenIDResponse39 = null;
	                        axis2.apache.org.xsd.AuthenticateWithOpenID wrappedParam =
                                                             (axis2.apache.org.xsd.AuthenticateWithOpenID)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    axis2.apache.org.xsd.AuthenticateWithOpenID.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               authenticateWithOpenIDResponse39 =
                                                   
                                                   
                                                         skel.authenticateWithOpenID(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), authenticateWithOpenIDResponse39, false, new javax.xml.namespace.QName("http://provider.identity.carbon.wso2.org",
                                                    "authenticateWithOpenID"));
                                    } else 

            if("authenticateWithOpenIDRememberMe".equals(methodName)){
                
                axis2.apache.org.xsd.AuthenticateWithOpenIDRememberMeResponse authenticateWithOpenIDRememberMeResponse41 = null;
	                        axis2.apache.org.xsd.AuthenticateWithOpenIDRememberMe wrappedParam =
                                                             (axis2.apache.org.xsd.AuthenticateWithOpenIDRememberMe)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    axis2.apache.org.xsd.AuthenticateWithOpenIDRememberMe.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               authenticateWithOpenIDRememberMeResponse41 =
                                                   
                                                   
                                                         skel.authenticateWithOpenIDRememberMe(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), authenticateWithOpenIDRememberMeResponse41, false, new javax.xml.namespace.QName("http://provider.identity.carbon.wso2.org",
                                                    "authenticateWithOpenIDRememberMe"));
                                    } else 

            if("signInWithInfoCard".equals(methodName)){
                
                axis2.apache.org.xsd.SignInWithInfoCardResponse signInWithInfoCardResponse43 = null;
	                        axis2.apache.org.xsd.SignInWithInfoCard wrappedParam =
                                                             (axis2.apache.org.xsd.SignInWithInfoCard)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    axis2.apache.org.xsd.SignInWithInfoCard.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               signInWithInfoCardResponse43 =
                                                   
                                                   
                                                         skel.signInWithInfoCard(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), signInWithInfoCardResponse43, false, new javax.xml.namespace.QName("http://provider.identity.carbon.wso2.org",
                                                    "signInWithInfoCard"));
                                    
            } else {
              throw new java.lang.RuntimeException("method not found");
            }
        

        newMsgContext.setEnvelope(envelope);
        }
        } catch (OpenIDProviderServiceException e) {

            msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME,"OpenIDProviderServiceException");
            org.apache.axis2.AxisFault f = createAxisFault(e);
            if (e.getFaultMessage() != null){
                f.setDetail(toOM(e.getFaultMessage(),false));
            }
            throw f;
            }
         catch (OpenIDProviderServiceIdentityProviderException e) {

            msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME,"OpenIDProviderServiceIdentityProviderException");
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
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.RetrievePapeInfo param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.RetrievePapeInfo.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.RetrievePapeInfoResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.RetrievePapeInfoResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.OpenIDProviderServiceIdentityProviderException param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.OpenIDProviderServiceIdentityProviderException.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.Verify param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.Verify.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.VerifyResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.VerifyResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.OpenIDProviderServiceException param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.OpenIDProviderServiceException.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.DoXMPPBasedMultiFactorAuthForInfocard param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.DoXMPPBasedMultiFactorAuthForInfocard.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.DoXMPPBasedMultiFactorAuthForInfocardResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.DoXMPPBasedMultiFactorAuthForInfocardResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.GetUserProfiles param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.GetUserProfiles.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.GetUserProfilesResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.GetUserProfilesResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.GetClaimValues param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.GetClaimValues.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.GetClaimValuesResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.GetClaimValuesResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.GetOpenIDAuthResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.GetOpenIDAuthResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.GetOpenIDAuthResponseResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.GetOpenIDAuthResponseResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.GetOpenIDAssociationResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.GetOpenIDAssociationResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.GetOpenIDAssociationResponseResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.GetOpenIDAssociationResponseResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.GetOpenIDProviderInfo param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.GetOpenIDProviderInfo.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.GetOpenIDProviderInfoResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.GetOpenIDProviderInfoResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.AuthenticateWithOpenID param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.AuthenticateWithOpenID.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.AuthenticateWithOpenIDResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.AuthenticateWithOpenIDResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.AuthenticateWithOpenIDRememberMe param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.AuthenticateWithOpenIDRememberMe.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.AuthenticateWithOpenIDRememberMeResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.AuthenticateWithOpenIDRememberMeResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.SignInWithInfoCard param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.SignInWithInfoCard.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.SignInWithInfoCardResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.SignInWithInfoCardResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, axis2.apache.org.xsd.RetrievePapeInfoResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(axis2.apache.org.xsd.RetrievePapeInfoResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private axis2.apache.org.xsd.RetrievePapeInfoResponse wrapretrievePapeInfo(){
                                axis2.apache.org.xsd.RetrievePapeInfoResponse wrappedElement = new axis2.apache.org.xsd.RetrievePapeInfoResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, axis2.apache.org.xsd.VerifyResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(axis2.apache.org.xsd.VerifyResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private axis2.apache.org.xsd.VerifyResponse wrapverify(){
                                axis2.apache.org.xsd.VerifyResponse wrappedElement = new axis2.apache.org.xsd.VerifyResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, axis2.apache.org.xsd.DoXMPPBasedMultiFactorAuthForInfocardResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(axis2.apache.org.xsd.DoXMPPBasedMultiFactorAuthForInfocardResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private axis2.apache.org.xsd.DoXMPPBasedMultiFactorAuthForInfocardResponse wrapdoXMPPBasedMultiFactorAuthForInfocard(){
                                axis2.apache.org.xsd.DoXMPPBasedMultiFactorAuthForInfocardResponse wrappedElement = new axis2.apache.org.xsd.DoXMPPBasedMultiFactorAuthForInfocardResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, axis2.apache.org.xsd.GetUserProfilesResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(axis2.apache.org.xsd.GetUserProfilesResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private axis2.apache.org.xsd.GetUserProfilesResponse wrapgetUserProfiles(){
                                axis2.apache.org.xsd.GetUserProfilesResponse wrappedElement = new axis2.apache.org.xsd.GetUserProfilesResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, axis2.apache.org.xsd.GetClaimValuesResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(axis2.apache.org.xsd.GetClaimValuesResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private axis2.apache.org.xsd.GetClaimValuesResponse wrapgetClaimValues(){
                                axis2.apache.org.xsd.GetClaimValuesResponse wrappedElement = new axis2.apache.org.xsd.GetClaimValuesResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, axis2.apache.org.xsd.GetOpenIDAuthResponseResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(axis2.apache.org.xsd.GetOpenIDAuthResponseResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private axis2.apache.org.xsd.GetOpenIDAuthResponseResponse wrapgetOpenIDAuthResponse(){
                                axis2.apache.org.xsd.GetOpenIDAuthResponseResponse wrappedElement = new axis2.apache.org.xsd.GetOpenIDAuthResponseResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, axis2.apache.org.xsd.GetOpenIDAssociationResponseResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(axis2.apache.org.xsd.GetOpenIDAssociationResponseResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private axis2.apache.org.xsd.GetOpenIDAssociationResponseResponse wrapgetOpenIDAssociationResponse(){
                                axis2.apache.org.xsd.GetOpenIDAssociationResponseResponse wrappedElement = new axis2.apache.org.xsd.GetOpenIDAssociationResponseResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, axis2.apache.org.xsd.GetOpenIDProviderInfoResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(axis2.apache.org.xsd.GetOpenIDProviderInfoResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private axis2.apache.org.xsd.GetOpenIDProviderInfoResponse wrapgetOpenIDProviderInfo(){
                                axis2.apache.org.xsd.GetOpenIDProviderInfoResponse wrappedElement = new axis2.apache.org.xsd.GetOpenIDProviderInfoResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, axis2.apache.org.xsd.AuthenticateWithOpenIDResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(axis2.apache.org.xsd.AuthenticateWithOpenIDResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private axis2.apache.org.xsd.AuthenticateWithOpenIDResponse wrapauthenticateWithOpenID(){
                                axis2.apache.org.xsd.AuthenticateWithOpenIDResponse wrappedElement = new axis2.apache.org.xsd.AuthenticateWithOpenIDResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, axis2.apache.org.xsd.AuthenticateWithOpenIDRememberMeResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(axis2.apache.org.xsd.AuthenticateWithOpenIDRememberMeResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private axis2.apache.org.xsd.AuthenticateWithOpenIDRememberMeResponse wrapauthenticateWithOpenIDRememberMe(){
                                axis2.apache.org.xsd.AuthenticateWithOpenIDRememberMeResponse wrappedElement = new axis2.apache.org.xsd.AuthenticateWithOpenIDRememberMeResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, axis2.apache.org.xsd.SignInWithInfoCardResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(axis2.apache.org.xsd.SignInWithInfoCardResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private axis2.apache.org.xsd.SignInWithInfoCardResponse wrapsignInWithInfoCard(){
                                axis2.apache.org.xsd.SignInWithInfoCardResponse wrappedElement = new axis2.apache.org.xsd.SignInWithInfoCardResponse();
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
        
                if (axis2.apache.org.xsd.RetrievePapeInfo.class.equals(type)){
                
                           return axis2.apache.org.xsd.RetrievePapeInfo.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.RetrievePapeInfoResponse.class.equals(type)){
                
                           return axis2.apache.org.xsd.RetrievePapeInfoResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.OpenIDProviderServiceIdentityProviderException.class.equals(type)){
                
                           return axis2.apache.org.xsd.OpenIDProviderServiceIdentityProviderException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.Verify.class.equals(type)){
                
                           return axis2.apache.org.xsd.Verify.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.VerifyResponse.class.equals(type)){
                
                           return axis2.apache.org.xsd.VerifyResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.OpenIDProviderServiceException.class.equals(type)){
                
                           return axis2.apache.org.xsd.OpenIDProviderServiceException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.DoXMPPBasedMultiFactorAuthForInfocard.class.equals(type)){
                
                           return axis2.apache.org.xsd.DoXMPPBasedMultiFactorAuthForInfocard.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.DoXMPPBasedMultiFactorAuthForInfocardResponse.class.equals(type)){
                
                           return axis2.apache.org.xsd.DoXMPPBasedMultiFactorAuthForInfocardResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.OpenIDProviderServiceException.class.equals(type)){
                
                           return axis2.apache.org.xsd.OpenIDProviderServiceException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.GetUserProfiles.class.equals(type)){
                
                           return axis2.apache.org.xsd.GetUserProfiles.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.GetUserProfilesResponse.class.equals(type)){
                
                           return axis2.apache.org.xsd.GetUserProfilesResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.OpenIDProviderServiceException.class.equals(type)){
                
                           return axis2.apache.org.xsd.OpenIDProviderServiceException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.GetClaimValues.class.equals(type)){
                
                           return axis2.apache.org.xsd.GetClaimValues.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.GetClaimValuesResponse.class.equals(type)){
                
                           return axis2.apache.org.xsd.GetClaimValuesResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.OpenIDProviderServiceException.class.equals(type)){
                
                           return axis2.apache.org.xsd.OpenIDProviderServiceException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.GetOpenIDAuthResponse.class.equals(type)){
                
                           return axis2.apache.org.xsd.GetOpenIDAuthResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.GetOpenIDAuthResponseResponse.class.equals(type)){
                
                           return axis2.apache.org.xsd.GetOpenIDAuthResponseResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.OpenIDProviderServiceException.class.equals(type)){
                
                           return axis2.apache.org.xsd.OpenIDProviderServiceException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.GetOpenIDAssociationResponse.class.equals(type)){
                
                           return axis2.apache.org.xsd.GetOpenIDAssociationResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.GetOpenIDAssociationResponseResponse.class.equals(type)){
                
                           return axis2.apache.org.xsd.GetOpenIDAssociationResponseResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.OpenIDProviderServiceException.class.equals(type)){
                
                           return axis2.apache.org.xsd.OpenIDProviderServiceException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.GetOpenIDProviderInfo.class.equals(type)){
                
                           return axis2.apache.org.xsd.GetOpenIDProviderInfo.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.GetOpenIDProviderInfoResponse.class.equals(type)){
                
                           return axis2.apache.org.xsd.GetOpenIDProviderInfoResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.OpenIDProviderServiceException.class.equals(type)){
                
                           return axis2.apache.org.xsd.OpenIDProviderServiceException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.AuthenticateWithOpenID.class.equals(type)){
                
                           return axis2.apache.org.xsd.AuthenticateWithOpenID.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.AuthenticateWithOpenIDResponse.class.equals(type)){
                
                           return axis2.apache.org.xsd.AuthenticateWithOpenIDResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.OpenIDProviderServiceException.class.equals(type)){
                
                           return axis2.apache.org.xsd.OpenIDProviderServiceException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.AuthenticateWithOpenIDRememberMe.class.equals(type)){
                
                           return axis2.apache.org.xsd.AuthenticateWithOpenIDRememberMe.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.AuthenticateWithOpenIDRememberMeResponse.class.equals(type)){
                
                           return axis2.apache.org.xsd.AuthenticateWithOpenIDRememberMeResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.OpenIDProviderServiceException.class.equals(type)){
                
                           return axis2.apache.org.xsd.OpenIDProviderServiceException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.SignInWithInfoCard.class.equals(type)){
                
                           return axis2.apache.org.xsd.SignInWithInfoCard.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.SignInWithInfoCardResponse.class.equals(type)){
                
                           return axis2.apache.org.xsd.SignInWithInfoCardResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.OpenIDProviderServiceException.class.equals(type)){
                
                           return axis2.apache.org.xsd.OpenIDProviderServiceException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

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
    
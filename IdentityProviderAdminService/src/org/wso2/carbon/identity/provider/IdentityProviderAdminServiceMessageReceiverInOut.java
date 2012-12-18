
/**
 * IdentityProviderAdminServiceMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */
        package org.wso2.carbon.identity.provider;

        /**
        *  IdentityProviderAdminServiceMessageReceiverInOut message receiver
        */

        public class IdentityProviderAdminServiceMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        IdentityProviderAdminServiceSkeletonInterface skel = (IdentityProviderAdminServiceSkeletonInterface)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){


        

            if("issueCardForUsername".equals(methodName)){
                
                axis2.apache.org.xsd.IssueCardForUsernameResponse issueCardForUsernameResponse16 = null;
	                        axis2.apache.org.xsd.IssueCardForUsername wrappedParam =
                                                             (axis2.apache.org.xsd.IssueCardForUsername)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    axis2.apache.org.xsd.IssueCardForUsername.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               issueCardForUsernameResponse16 =
                                                   
                                                   
                                                         skel.issueCardForUsername(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), issueCardForUsernameResponse16, false, new javax.xml.namespace.QName("http://provider.identity.carbon.wso2.org",
                                                    "issueCardForUsername"));
                                    } else 

            if("issueOpenIDInfoCardForUsername".equals(methodName)){
                
                axis2.apache.org.xsd.IssueOpenIDInfoCardForUsernameResponse issueOpenIDInfoCardForUsernameResponse18 = null;
	                        axis2.apache.org.xsd.IssueOpenIDInfoCardForUsername wrappedParam =
                                                             (axis2.apache.org.xsd.IssueOpenIDInfoCardForUsername)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    axis2.apache.org.xsd.IssueOpenIDInfoCardForUsername.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               issueOpenIDInfoCardForUsernameResponse18 =
                                                   
                                                   
                                                         skel.issueOpenIDInfoCardForUsername(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), issueOpenIDInfoCardForUsernameResponse18, false, new javax.xml.namespace.QName("http://provider.identity.carbon.wso2.org",
                                                    "issueOpenIDInfoCardForUsername"));
                                    } else 

            if("issueCardForSelfIssuedCards".equals(methodName)){
                
                axis2.apache.org.xsd.IssueCardForSelfIssuedCardsResponse issueCardForSelfIssuedCardsResponse20 = null;
	                        axis2.apache.org.xsd.IssueCardForSelfIssuedCards wrappedParam =
                                                             (axis2.apache.org.xsd.IssueCardForSelfIssuedCards)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    axis2.apache.org.xsd.IssueCardForSelfIssuedCards.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               issueCardForSelfIssuedCardsResponse20 =
                                                   
                                                   
                                                         skel.issueCardForSelfIssuedCards(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), issueCardForSelfIssuedCardsResponse20, false, new javax.xml.namespace.QName("http://provider.identity.carbon.wso2.org",
                                                    "issueCardForSelfIssuedCards"));
                                    } else 

            if("extractPrimaryUserName".equals(methodName)){
                
                axis2.apache.org.xsd.ExtractPrimaryUserNameResponse extractPrimaryUserNameResponse22 = null;
	                        axis2.apache.org.xsd.ExtractPrimaryUserName wrappedParam =
                                                             (axis2.apache.org.xsd.ExtractPrimaryUserName)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    axis2.apache.org.xsd.ExtractPrimaryUserName.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               extractPrimaryUserNameResponse22 =
                                                   
                                                   
                                                         skel.extractPrimaryUserName(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), extractPrimaryUserNameResponse22, false, new javax.xml.namespace.QName("http://provider.identity.carbon.wso2.org",
                                                    "extractPrimaryUserName"));
                                    } else 

            if("getAllOpenIDs".equals(methodName)){
                
                axis2.apache.org.xsd.GetAllOpenIDsResponse getAllOpenIDsResponse24 = null;
	                        axis2.apache.org.xsd.GetAllOpenIDs wrappedParam =
                                                             (axis2.apache.org.xsd.GetAllOpenIDs)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    axis2.apache.org.xsd.GetAllOpenIDs.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getAllOpenIDsResponse24 =
                                                   
                                                   
                                                         skel.getAllOpenIDs(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getAllOpenIDsResponse24, false, new javax.xml.namespace.QName("http://provider.identity.carbon.wso2.org",
                                                    "getAllOpenIDs"));
                                    } else 

            if("getPrimaryOpenID".equals(methodName)){
                
                axis2.apache.org.xsd.GetPrimaryOpenIDResponse getPrimaryOpenIDResponse26 = null;
	                        axis2.apache.org.xsd.GetPrimaryOpenID wrappedParam =
                                                             (axis2.apache.org.xsd.GetPrimaryOpenID)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    axis2.apache.org.xsd.GetPrimaryOpenID.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getPrimaryOpenIDResponse26 =
                                                   
                                                   
                                                         skel.getPrimaryOpenID(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getPrimaryOpenIDResponse26, false, new javax.xml.namespace.QName("http://provider.identity.carbon.wso2.org",
                                                    "getPrimaryOpenID"));
                                    } else 

            if("issueOpenIDInfoCardForSelfIssuedCard".equals(methodName)){
                
                axis2.apache.org.xsd.IssueOpenIDInfoCardForSelfIssuedCardResponse issueOpenIDInfoCardForSelfIssuedCardResponse28 = null;
	                        axis2.apache.org.xsd.IssueOpenIDInfoCardForSelfIssuedCard wrappedParam =
                                                             (axis2.apache.org.xsd.IssueOpenIDInfoCardForSelfIssuedCard)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    axis2.apache.org.xsd.IssueOpenIDInfoCardForSelfIssuedCard.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               issueOpenIDInfoCardForSelfIssuedCardResponse28 =
                                                   
                                                   
                                                         skel.issueOpenIDInfoCardForSelfIssuedCard(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), issueOpenIDInfoCardForSelfIssuedCardResponse28, false, new javax.xml.namespace.QName("http://provider.identity.carbon.wso2.org",
                                                    "issueOpenIDInfoCardForSelfIssuedCard"));
                                    
            } else {
              throw new java.lang.RuntimeException("method not found");
            }
        

        newMsgContext.setEnvelope(envelope);
        }
        } catch (IdentityProviderAdminServiceException e) {

            msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME,"IdentityProviderAdminServiceException");
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
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.IssueCardForUsername param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.IssueCardForUsername.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.IssueCardForUsernameResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.IssueCardForUsernameResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.IdentityProviderAdminServiceException param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.IdentityProviderAdminServiceException.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.IssueOpenIDInfoCardForUsername param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.IssueOpenIDInfoCardForUsername.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.IssueOpenIDInfoCardForUsernameResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.IssueOpenIDInfoCardForUsernameResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.IssueCardForSelfIssuedCards param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.IssueCardForSelfIssuedCards.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.IssueCardForSelfIssuedCardsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.IssueCardForSelfIssuedCardsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.ExtractPrimaryUserName param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.ExtractPrimaryUserName.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.ExtractPrimaryUserNameResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.ExtractPrimaryUserNameResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.GetAllOpenIDs param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.GetAllOpenIDs.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.GetAllOpenIDsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.GetAllOpenIDsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.RemoveOpenID param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.RemoveOpenID.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.GetPrimaryOpenID param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.GetPrimaryOpenID.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.GetPrimaryOpenIDResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.GetPrimaryOpenIDResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.IssueOpenIDInfoCardForSelfIssuedCard param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.IssueOpenIDInfoCardForSelfIssuedCard.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.IssueOpenIDInfoCardForSelfIssuedCardResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.IssueOpenIDInfoCardForSelfIssuedCardResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, axis2.apache.org.xsd.IssueCardForUsernameResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(axis2.apache.org.xsd.IssueCardForUsernameResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private axis2.apache.org.xsd.IssueCardForUsernameResponse wrapissueCardForUsername(){
                                axis2.apache.org.xsd.IssueCardForUsernameResponse wrappedElement = new axis2.apache.org.xsd.IssueCardForUsernameResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, axis2.apache.org.xsd.IssueOpenIDInfoCardForUsernameResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(axis2.apache.org.xsd.IssueOpenIDInfoCardForUsernameResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private axis2.apache.org.xsd.IssueOpenIDInfoCardForUsernameResponse wrapissueOpenIDInfoCardForUsername(){
                                axis2.apache.org.xsd.IssueOpenIDInfoCardForUsernameResponse wrappedElement = new axis2.apache.org.xsd.IssueOpenIDInfoCardForUsernameResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, axis2.apache.org.xsd.IssueCardForSelfIssuedCardsResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(axis2.apache.org.xsd.IssueCardForSelfIssuedCardsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private axis2.apache.org.xsd.IssueCardForSelfIssuedCardsResponse wrapissueCardForSelfIssuedCards(){
                                axis2.apache.org.xsd.IssueCardForSelfIssuedCardsResponse wrappedElement = new axis2.apache.org.xsd.IssueCardForSelfIssuedCardsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, axis2.apache.org.xsd.ExtractPrimaryUserNameResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(axis2.apache.org.xsd.ExtractPrimaryUserNameResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private axis2.apache.org.xsd.ExtractPrimaryUserNameResponse wrapextractPrimaryUserName(){
                                axis2.apache.org.xsd.ExtractPrimaryUserNameResponse wrappedElement = new axis2.apache.org.xsd.ExtractPrimaryUserNameResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, axis2.apache.org.xsd.GetAllOpenIDsResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(axis2.apache.org.xsd.GetAllOpenIDsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private axis2.apache.org.xsd.GetAllOpenIDsResponse wrapgetAllOpenIDs(){
                                axis2.apache.org.xsd.GetAllOpenIDsResponse wrappedElement = new axis2.apache.org.xsd.GetAllOpenIDsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, axis2.apache.org.xsd.GetPrimaryOpenIDResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(axis2.apache.org.xsd.GetPrimaryOpenIDResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private axis2.apache.org.xsd.GetPrimaryOpenIDResponse wrapgetPrimaryOpenID(){
                                axis2.apache.org.xsd.GetPrimaryOpenIDResponse wrappedElement = new axis2.apache.org.xsd.GetPrimaryOpenIDResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, axis2.apache.org.xsd.IssueOpenIDInfoCardForSelfIssuedCardResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(axis2.apache.org.xsd.IssueOpenIDInfoCardForSelfIssuedCardResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private axis2.apache.org.xsd.IssueOpenIDInfoCardForSelfIssuedCardResponse wrapissueOpenIDInfoCardForSelfIssuedCard(){
                                axis2.apache.org.xsd.IssueOpenIDInfoCardForSelfIssuedCardResponse wrappedElement = new axis2.apache.org.xsd.IssueOpenIDInfoCardForSelfIssuedCardResponse();
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
        
                if (axis2.apache.org.xsd.IssueCardForUsername.class.equals(type)){
                
                           return axis2.apache.org.xsd.IssueCardForUsername.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.IssueCardForUsernameResponse.class.equals(type)){
                
                           return axis2.apache.org.xsd.IssueCardForUsernameResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.IdentityProviderAdminServiceException.class.equals(type)){
                
                           return axis2.apache.org.xsd.IdentityProviderAdminServiceException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.IssueOpenIDInfoCardForUsername.class.equals(type)){
                
                           return axis2.apache.org.xsd.IssueOpenIDInfoCardForUsername.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.IssueOpenIDInfoCardForUsernameResponse.class.equals(type)){
                
                           return axis2.apache.org.xsd.IssueOpenIDInfoCardForUsernameResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.IdentityProviderAdminServiceException.class.equals(type)){
                
                           return axis2.apache.org.xsd.IdentityProviderAdminServiceException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.IssueCardForSelfIssuedCards.class.equals(type)){
                
                           return axis2.apache.org.xsd.IssueCardForSelfIssuedCards.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.IssueCardForSelfIssuedCardsResponse.class.equals(type)){
                
                           return axis2.apache.org.xsd.IssueCardForSelfIssuedCardsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.IdentityProviderAdminServiceException.class.equals(type)){
                
                           return axis2.apache.org.xsd.IdentityProviderAdminServiceException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.ExtractPrimaryUserName.class.equals(type)){
                
                           return axis2.apache.org.xsd.ExtractPrimaryUserName.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.ExtractPrimaryUserNameResponse.class.equals(type)){
                
                           return axis2.apache.org.xsd.ExtractPrimaryUserNameResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.IdentityProviderAdminServiceException.class.equals(type)){
                
                           return axis2.apache.org.xsd.IdentityProviderAdminServiceException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.GetAllOpenIDs.class.equals(type)){
                
                           return axis2.apache.org.xsd.GetAllOpenIDs.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.GetAllOpenIDsResponse.class.equals(type)){
                
                           return axis2.apache.org.xsd.GetAllOpenIDsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.IdentityProviderAdminServiceException.class.equals(type)){
                
                           return axis2.apache.org.xsd.IdentityProviderAdminServiceException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.RemoveOpenID.class.equals(type)){
                
                           return axis2.apache.org.xsd.RemoveOpenID.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.GetPrimaryOpenID.class.equals(type)){
                
                           return axis2.apache.org.xsd.GetPrimaryOpenID.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.GetPrimaryOpenIDResponse.class.equals(type)){
                
                           return axis2.apache.org.xsd.GetPrimaryOpenIDResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.IdentityProviderAdminServiceException.class.equals(type)){
                
                           return axis2.apache.org.xsd.IdentityProviderAdminServiceException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.IssueOpenIDInfoCardForSelfIssuedCard.class.equals(type)){
                
                           return axis2.apache.org.xsd.IssueOpenIDInfoCardForSelfIssuedCard.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.IssueOpenIDInfoCardForSelfIssuedCardResponse.class.equals(type)){
                
                           return axis2.apache.org.xsd.IssueOpenIDInfoCardForSelfIssuedCardResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.IdentityProviderAdminServiceException.class.equals(type)){
                
                           return axis2.apache.org.xsd.IdentityProviderAdminServiceException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

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
    
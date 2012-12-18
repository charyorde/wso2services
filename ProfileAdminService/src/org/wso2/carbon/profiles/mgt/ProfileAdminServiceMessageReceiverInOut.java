
/**
 * ProfileAdminServiceMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */
        package org.wso2.carbon.profiles.mgt;

        /**
        *  ProfileAdminServiceMessageReceiverInOut message receiver
        */

        public class ProfileAdminServiceMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        ProfileAdminServiceSkeletonInterface skel = (ProfileAdminServiceSkeletonInterface)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){


        

            if("isAddProfileEnabled".equals(methodName)){
                
                org.wso2.carbon.profiles.mgt.IsAddProfileEnabledResponse isAddProfileEnabledResponse20 = null;
	                        org.wso2.carbon.profiles.mgt.IsAddProfileEnabled wrappedParam =
                                                             (org.wso2.carbon.profiles.mgt.IsAddProfileEnabled)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.profiles.mgt.IsAddProfileEnabled.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               isAddProfileEnabledResponse20 =
                                                   
                                                   
                                                         skel.isAddProfileEnabled(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), isAddProfileEnabledResponse20, false, new javax.xml.namespace.QName("http://mgt.profiles.carbon.wso2.org",
                                                    "isAddProfileEnabled"));
                                    } else 

            if("getClaimConfigurations".equals(methodName)){
                
                org.wso2.carbon.profiles.mgt.GetClaimConfigurationsResponse getClaimConfigurationsResponse22 = null;
	                        org.wso2.carbon.profiles.mgt.GetClaimConfigurations wrappedParam =
                                                             (org.wso2.carbon.profiles.mgt.GetClaimConfigurations)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.profiles.mgt.GetClaimConfigurations.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getClaimConfigurationsResponse22 =
                                                   
                                                   
                                                         skel.getClaimConfigurations(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getClaimConfigurationsResponse22, false, new javax.xml.namespace.QName("http://mgt.profiles.carbon.wso2.org",
                                                    "getClaimConfigurations"));
                                    } else 

            if("getDialectsForUserStore".equals(methodName)){
                
                org.wso2.carbon.profiles.mgt.GetDialectsForUserStoreResponse getDialectsForUserStoreResponse24 = null;
	                        org.wso2.carbon.profiles.mgt.GetDialectsForUserStore wrappedParam =
                                                             (org.wso2.carbon.profiles.mgt.GetDialectsForUserStore)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.profiles.mgt.GetDialectsForUserStore.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getDialectsForUserStoreResponse24 =
                                                   
                                                   
                                                         skel.getDialectsForUserStore(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getDialectsForUserStoreResponse24, false, new javax.xml.namespace.QName("http://mgt.profiles.carbon.wso2.org",
                                                    "getDialectsForUserStore"));
                                    } else 

            if("getAllAvailableProfileConfiguraions".equals(methodName)){
                
                org.wso2.carbon.profiles.mgt.GetAllAvailableProfileConfiguraionsResponse getAllAvailableProfileConfiguraionsResponse26 = null;
	                        org.wso2.carbon.profiles.mgt.GetAllAvailableProfileConfiguraions wrappedParam =
                                                             (org.wso2.carbon.profiles.mgt.GetAllAvailableProfileConfiguraions)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.profiles.mgt.GetAllAvailableProfileConfiguraions.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getAllAvailableProfileConfiguraionsResponse26 =
                                                   
                                                   
                                                         skel.getAllAvailableProfileConfiguraions(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getAllAvailableProfileConfiguraionsResponse26, false, new javax.xml.namespace.QName("http://mgt.profiles.carbon.wso2.org",
                                                    "getAllAvailableProfileConfiguraions"));
                                    } else 

            if("getProfileConfiguration".equals(methodName)){
                
                org.wso2.carbon.profiles.mgt.GetProfileConfigurationResponse getProfileConfigurationResponse28 = null;
	                        org.wso2.carbon.profiles.mgt.GetProfileConfiguration wrappedParam =
                                                             (org.wso2.carbon.profiles.mgt.GetProfileConfiguration)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.profiles.mgt.GetProfileConfiguration.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getProfileConfigurationResponse28 =
                                                   
                                                   
                                                         skel.getProfileConfiguration(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getProfileConfigurationResponse28, false, new javax.xml.namespace.QName("http://mgt.profiles.carbon.wso2.org",
                                                    "getProfileConfiguration"));
                                    } else 

            if("getAllAvailableProfileConfiguraionsForUserStore".equals(methodName)){
                
                org.wso2.carbon.profiles.mgt.GetAllAvailableProfileConfiguraionsForUserStoreResponse getAllAvailableProfileConfiguraionsForUserStoreResponse30 = null;
	                        org.wso2.carbon.profiles.mgt.GetAllAvailableProfileConfiguraionsForUserStore wrappedParam =
                                                             (org.wso2.carbon.profiles.mgt.GetAllAvailableProfileConfiguraionsForUserStore)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.profiles.mgt.GetAllAvailableProfileConfiguraionsForUserStore.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getAllAvailableProfileConfiguraionsForUserStoreResponse30 =
                                                   
                                                   
                                                         skel.getAllAvailableProfileConfiguraionsForUserStore(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getAllAvailableProfileConfiguraionsForUserStoreResponse30, false, new javax.xml.namespace.QName("http://mgt.profiles.carbon.wso2.org",
                                                    "getAllAvailableProfileConfiguraionsForUserStore"));
                                    } else 

            if("getDialects".equals(methodName)){
                
                org.wso2.carbon.profiles.mgt.GetDialectsResponse getDialectsResponse32 = null;
	                        org.wso2.carbon.profiles.mgt.GetDialects wrappedParam =
                                                             (org.wso2.carbon.profiles.mgt.GetDialects)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.profiles.mgt.GetDialects.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getDialectsResponse32 =
                                                   
                                                   
                                                         skel.getDialects(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getDialectsResponse32, false, new javax.xml.namespace.QName("http://mgt.profiles.carbon.wso2.org",
                                                    "getDialects"));
                                    } else 

            if("getAllAvailableProfileConfiguraionsForDialect".equals(methodName)){
                
                org.wso2.carbon.profiles.mgt.GetAllAvailableProfileConfiguraionsForDialectResponse getAllAvailableProfileConfiguraionsForDialectResponse34 = null;
	                        org.wso2.carbon.profiles.mgt.GetAllAvailableProfileConfiguraionsForDialect wrappedParam =
                                                             (org.wso2.carbon.profiles.mgt.GetAllAvailableProfileConfiguraionsForDialect)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.profiles.mgt.GetAllAvailableProfileConfiguraionsForDialect.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getAllAvailableProfileConfiguraionsForDialectResponse34 =
                                                   
                                                   
                                                         skel.getAllAvailableProfileConfiguraionsForDialect(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getAllAvailableProfileConfiguraionsForDialectResponse34, false, new javax.xml.namespace.QName("http://mgt.profiles.carbon.wso2.org",
                                                    "getAllAvailableProfileConfiguraionsForDialect"));
                                    
            } else {
              throw new java.lang.RuntimeException("method not found");
            }
        

        newMsgContext.setEnvelope(envelope);
        }
        } catch (ProfileAdminServiceProfileManagementExceptionException e) {

            msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME,"ProfileAdminServiceProfileManagementException");
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
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.profiles.mgt.IsAddProfileEnabled param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.profiles.mgt.IsAddProfileEnabled.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.profiles.mgt.IsAddProfileEnabledResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.profiles.mgt.IsAddProfileEnabledResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.profiles.mgt.ProfileAdminServiceProfileManagementException param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.profiles.mgt.ProfileAdminServiceProfileManagementException.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.profiles.mgt.DeleteProfileConfiguraiton param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.profiles.mgt.DeleteProfileConfiguraiton.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.profiles.mgt.GetClaimConfigurations param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.profiles.mgt.GetClaimConfigurations.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.profiles.mgt.GetClaimConfigurationsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.profiles.mgt.GetClaimConfigurationsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.profiles.mgt.GetDialectsForUserStore param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.profiles.mgt.GetDialectsForUserStore.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.profiles.mgt.GetDialectsForUserStoreResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.profiles.mgt.GetDialectsForUserStoreResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.profiles.mgt.GetAllAvailableProfileConfiguraions param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.profiles.mgt.GetAllAvailableProfileConfiguraions.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.profiles.mgt.GetAllAvailableProfileConfiguraionsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.profiles.mgt.GetAllAvailableProfileConfiguraionsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.profiles.mgt.GetProfileConfiguration param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.profiles.mgt.GetProfileConfiguration.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.profiles.mgt.GetProfileConfigurationResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.profiles.mgt.GetProfileConfigurationResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.profiles.mgt.GetAllAvailableProfileConfiguraionsForUserStore param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.profiles.mgt.GetAllAvailableProfileConfiguraionsForUserStore.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.profiles.mgt.GetAllAvailableProfileConfiguraionsForUserStoreResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.profiles.mgt.GetAllAvailableProfileConfiguraionsForUserStoreResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.profiles.mgt.AddProfile param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.profiles.mgt.AddProfile.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.profiles.mgt.GetDialects param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.profiles.mgt.GetDialects.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.profiles.mgt.GetDialectsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.profiles.mgt.GetDialectsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.profiles.mgt.UpdateClaimMappingBehavior param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.profiles.mgt.UpdateClaimMappingBehavior.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.profiles.mgt.GetAllAvailableProfileConfiguraionsForDialect param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.profiles.mgt.GetAllAvailableProfileConfiguraionsForDialect.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.profiles.mgt.GetAllAvailableProfileConfiguraionsForDialectResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.profiles.mgt.GetAllAvailableProfileConfiguraionsForDialectResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.profiles.mgt.IsAddProfileEnabledResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.profiles.mgt.IsAddProfileEnabledResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.profiles.mgt.IsAddProfileEnabledResponse wrapisAddProfileEnabled(){
                                org.wso2.carbon.profiles.mgt.IsAddProfileEnabledResponse wrappedElement = new org.wso2.carbon.profiles.mgt.IsAddProfileEnabledResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.profiles.mgt.GetClaimConfigurationsResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.profiles.mgt.GetClaimConfigurationsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.profiles.mgt.GetClaimConfigurationsResponse wrapgetClaimConfigurations(){
                                org.wso2.carbon.profiles.mgt.GetClaimConfigurationsResponse wrappedElement = new org.wso2.carbon.profiles.mgt.GetClaimConfigurationsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.profiles.mgt.GetDialectsForUserStoreResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.profiles.mgt.GetDialectsForUserStoreResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.profiles.mgt.GetDialectsForUserStoreResponse wrapgetDialectsForUserStore(){
                                org.wso2.carbon.profiles.mgt.GetDialectsForUserStoreResponse wrappedElement = new org.wso2.carbon.profiles.mgt.GetDialectsForUserStoreResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.profiles.mgt.GetAllAvailableProfileConfiguraionsResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.profiles.mgt.GetAllAvailableProfileConfiguraionsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.profiles.mgt.GetAllAvailableProfileConfiguraionsResponse wrapgetAllAvailableProfileConfiguraions(){
                                org.wso2.carbon.profiles.mgt.GetAllAvailableProfileConfiguraionsResponse wrappedElement = new org.wso2.carbon.profiles.mgt.GetAllAvailableProfileConfiguraionsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.profiles.mgt.GetProfileConfigurationResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.profiles.mgt.GetProfileConfigurationResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.profiles.mgt.GetProfileConfigurationResponse wrapgetProfileConfiguration(){
                                org.wso2.carbon.profiles.mgt.GetProfileConfigurationResponse wrappedElement = new org.wso2.carbon.profiles.mgt.GetProfileConfigurationResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.profiles.mgt.GetAllAvailableProfileConfiguraionsForUserStoreResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.profiles.mgt.GetAllAvailableProfileConfiguraionsForUserStoreResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.profiles.mgt.GetAllAvailableProfileConfiguraionsForUserStoreResponse wrapgetAllAvailableProfileConfiguraionsForUserStore(){
                                org.wso2.carbon.profiles.mgt.GetAllAvailableProfileConfiguraionsForUserStoreResponse wrappedElement = new org.wso2.carbon.profiles.mgt.GetAllAvailableProfileConfiguraionsForUserStoreResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.profiles.mgt.GetDialectsResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.profiles.mgt.GetDialectsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.profiles.mgt.GetDialectsResponse wrapgetDialects(){
                                org.wso2.carbon.profiles.mgt.GetDialectsResponse wrappedElement = new org.wso2.carbon.profiles.mgt.GetDialectsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.profiles.mgt.GetAllAvailableProfileConfiguraionsForDialectResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.profiles.mgt.GetAllAvailableProfileConfiguraionsForDialectResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.profiles.mgt.GetAllAvailableProfileConfiguraionsForDialectResponse wrapgetAllAvailableProfileConfiguraionsForDialect(){
                                org.wso2.carbon.profiles.mgt.GetAllAvailableProfileConfiguraionsForDialectResponse wrappedElement = new org.wso2.carbon.profiles.mgt.GetAllAvailableProfileConfiguraionsForDialectResponse();
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
        
                if (org.wso2.carbon.profiles.mgt.IsAddProfileEnabled.class.equals(type)){
                
                           return org.wso2.carbon.profiles.mgt.IsAddProfileEnabled.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.profiles.mgt.IsAddProfileEnabledResponse.class.equals(type)){
                
                           return org.wso2.carbon.profiles.mgt.IsAddProfileEnabledResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.profiles.mgt.ProfileAdminServiceProfileManagementException.class.equals(type)){
                
                           return org.wso2.carbon.profiles.mgt.ProfileAdminServiceProfileManagementException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.profiles.mgt.DeleteProfileConfiguraiton.class.equals(type)){
                
                           return org.wso2.carbon.profiles.mgt.DeleteProfileConfiguraiton.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.profiles.mgt.ProfileAdminServiceProfileManagementException.class.equals(type)){
                
                           return org.wso2.carbon.profiles.mgt.ProfileAdminServiceProfileManagementException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.profiles.mgt.GetClaimConfigurations.class.equals(type)){
                
                           return org.wso2.carbon.profiles.mgt.GetClaimConfigurations.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.profiles.mgt.GetClaimConfigurationsResponse.class.equals(type)){
                
                           return org.wso2.carbon.profiles.mgt.GetClaimConfigurationsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.profiles.mgt.ProfileAdminServiceProfileManagementException.class.equals(type)){
                
                           return org.wso2.carbon.profiles.mgt.ProfileAdminServiceProfileManagementException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.profiles.mgt.GetDialectsForUserStore.class.equals(type)){
                
                           return org.wso2.carbon.profiles.mgt.GetDialectsForUserStore.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.profiles.mgt.GetDialectsForUserStoreResponse.class.equals(type)){
                
                           return org.wso2.carbon.profiles.mgt.GetDialectsForUserStoreResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.profiles.mgt.ProfileAdminServiceProfileManagementException.class.equals(type)){
                
                           return org.wso2.carbon.profiles.mgt.ProfileAdminServiceProfileManagementException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.profiles.mgt.GetAllAvailableProfileConfiguraions.class.equals(type)){
                
                           return org.wso2.carbon.profiles.mgt.GetAllAvailableProfileConfiguraions.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.profiles.mgt.GetAllAvailableProfileConfiguraionsResponse.class.equals(type)){
                
                           return org.wso2.carbon.profiles.mgt.GetAllAvailableProfileConfiguraionsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.profiles.mgt.ProfileAdminServiceProfileManagementException.class.equals(type)){
                
                           return org.wso2.carbon.profiles.mgt.ProfileAdminServiceProfileManagementException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.profiles.mgt.GetProfileConfiguration.class.equals(type)){
                
                           return org.wso2.carbon.profiles.mgt.GetProfileConfiguration.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.profiles.mgt.GetProfileConfigurationResponse.class.equals(type)){
                
                           return org.wso2.carbon.profiles.mgt.GetProfileConfigurationResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.profiles.mgt.ProfileAdminServiceProfileManagementException.class.equals(type)){
                
                           return org.wso2.carbon.profiles.mgt.ProfileAdminServiceProfileManagementException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.profiles.mgt.GetAllAvailableProfileConfiguraionsForUserStore.class.equals(type)){
                
                           return org.wso2.carbon.profiles.mgt.GetAllAvailableProfileConfiguraionsForUserStore.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.profiles.mgt.GetAllAvailableProfileConfiguraionsForUserStoreResponse.class.equals(type)){
                
                           return org.wso2.carbon.profiles.mgt.GetAllAvailableProfileConfiguraionsForUserStoreResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.profiles.mgt.ProfileAdminServiceProfileManagementException.class.equals(type)){
                
                           return org.wso2.carbon.profiles.mgt.ProfileAdminServiceProfileManagementException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.profiles.mgt.AddProfile.class.equals(type)){
                
                           return org.wso2.carbon.profiles.mgt.AddProfile.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.profiles.mgt.ProfileAdminServiceProfileManagementException.class.equals(type)){
                
                           return org.wso2.carbon.profiles.mgt.ProfileAdminServiceProfileManagementException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.profiles.mgt.GetDialects.class.equals(type)){
                
                           return org.wso2.carbon.profiles.mgt.GetDialects.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.profiles.mgt.GetDialectsResponse.class.equals(type)){
                
                           return org.wso2.carbon.profiles.mgt.GetDialectsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.profiles.mgt.ProfileAdminServiceProfileManagementException.class.equals(type)){
                
                           return org.wso2.carbon.profiles.mgt.ProfileAdminServiceProfileManagementException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.profiles.mgt.UpdateClaimMappingBehavior.class.equals(type)){
                
                           return org.wso2.carbon.profiles.mgt.UpdateClaimMappingBehavior.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.profiles.mgt.ProfileAdminServiceProfileManagementException.class.equals(type)){
                
                           return org.wso2.carbon.profiles.mgt.ProfileAdminServiceProfileManagementException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.profiles.mgt.GetAllAvailableProfileConfiguraionsForDialect.class.equals(type)){
                
                           return org.wso2.carbon.profiles.mgt.GetAllAvailableProfileConfiguraionsForDialect.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.profiles.mgt.GetAllAvailableProfileConfiguraionsForDialectResponse.class.equals(type)){
                
                           return org.wso2.carbon.profiles.mgt.GetAllAvailableProfileConfiguraionsForDialectResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.profiles.mgt.ProfileAdminServiceProfileManagementException.class.equals(type)){
                
                           return org.wso2.carbon.profiles.mgt.ProfileAdminServiceProfileManagementException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

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
    
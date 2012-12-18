
/**
 * TenantMgtAdminServiceMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */
        package org.wso2.carbon.tenant.mgt.services;

        /**
        *  TenantMgtAdminServiceMessageReceiverInOut message receiver
        */

        public class TenantMgtAdminServiceMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        TenantMgtAdminServiceSkeletonInterface skel = (TenantMgtAdminServiceSkeletonInterface)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){


        

            if("updateTenant".equals(methodName)){
                
                org.wso2.carbon.tenant.mgt.services.UpdateTenant wrappedParam =
                                                             (org.wso2.carbon.tenant.mgt.services.UpdateTenant)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.tenant.mgt.services.UpdateTenant.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               
                                                         skel.updateTenant(wrappedParam)
                                                    ;
                                            
                                        envelope = getSOAPFactory(msgContext).getDefaultEnvelope();
                                    } else 

            if("deactivateTenant".equals(methodName)){
                
                org.wso2.carbon.tenant.mgt.services.DeactivateTenant wrappedParam =
                                                             (org.wso2.carbon.tenant.mgt.services.DeactivateTenant)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.tenant.mgt.services.DeactivateTenant.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               
                                                         skel.deactivateTenant(wrappedParam)
                                                    ;
                                            
                                        envelope = getSOAPFactory(msgContext).getDefaultEnvelope();
                                    } else 

            if("activateTenant".equals(methodName)){
                
                org.wso2.carbon.tenant.mgt.services.ActivateTenant wrappedParam =
                                                             (org.wso2.carbon.tenant.mgt.services.ActivateTenant)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.tenant.mgt.services.ActivateTenant.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               
                                                         skel.activateTenant(wrappedParam)
                                                    ;
                                            
                                        envelope = getSOAPFactory(msgContext).getDefaultEnvelope();
                                    } else 

            if("retrieveTenants".equals(methodName)){
                
                org.wso2.carbon.tenant.mgt.services.RetrieveTenantsResponse retrieveTenantsResponse27 = null;
	                        org.wso2.carbon.tenant.mgt.services.RetrieveTenants wrappedParam =
                                                             (org.wso2.carbon.tenant.mgt.services.RetrieveTenants)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.tenant.mgt.services.RetrieveTenants.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               retrieveTenantsResponse27 =
                                                   
                                                   
                                                         skel.retrieveTenants(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), retrieveTenantsResponse27, false, new javax.xml.namespace.QName("http://services.mgt.tenant.carbon.wso2.org",
                                                    "retrieveTenants"));
                                    } else 

            if("getTenant".equals(methodName)){
                
                org.wso2.carbon.tenant.mgt.services.GetTenantResponse getTenantResponse29 = null;
	                        org.wso2.carbon.tenant.mgt.services.GetTenant wrappedParam =
                                                             (org.wso2.carbon.tenant.mgt.services.GetTenant)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.tenant.mgt.services.GetTenant.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getTenantResponse29 =
                                                   
                                                   
                                                         skel.getTenant(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getTenantResponse29, false, new javax.xml.namespace.QName("http://services.mgt.tenant.carbon.wso2.org",
                                                    "getTenant"));
                                    } else 

            if("retrievePaginatedTenants".equals(methodName)){
                
                org.wso2.carbon.tenant.mgt.services.RetrievePaginatedTenantsResponse retrievePaginatedTenantsResponse31 = null;
	                        org.wso2.carbon.tenant.mgt.services.RetrievePaginatedTenants wrappedParam =
                                                             (org.wso2.carbon.tenant.mgt.services.RetrievePaginatedTenants)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.tenant.mgt.services.RetrievePaginatedTenants.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               retrievePaginatedTenantsResponse31 =
                                                   
                                                   
                                                         skel.retrievePaginatedTenants(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), retrievePaginatedTenantsResponse31, false, new javax.xml.namespace.QName("http://services.mgt.tenant.carbon.wso2.org",
                                                    "retrievePaginatedTenants"));
                                    } else 

            if("addTenant".equals(methodName)){
                
                org.wso2.carbon.tenant.mgt.services.AddTenantResponse addTenantResponse33 = null;
	                        org.wso2.carbon.tenant.mgt.services.AddTenant wrappedParam =
                                                             (org.wso2.carbon.tenant.mgt.services.AddTenant)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.tenant.mgt.services.AddTenant.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               addTenantResponse33 =
                                                   
                                                   
                                                         skel.addTenant(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), addTenantResponse33, false, new javax.xml.namespace.QName("http://services.mgt.tenant.carbon.wso2.org",
                                                    "addTenant"));
                                    } else 

            if("updateTenantPassword".equals(methodName)){
                
                org.wso2.carbon.tenant.mgt.services.UpdateTenantPasswordResponse updateTenantPasswordResponse35 = null;
	                        org.wso2.carbon.tenant.mgt.services.UpdateTenantPassword wrappedParam =
                                                             (org.wso2.carbon.tenant.mgt.services.UpdateTenantPassword)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.tenant.mgt.services.UpdateTenantPassword.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               updateTenantPasswordResponse35 =
                                                   
                                                   
                                                         skel.updateTenantPassword(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), updateTenantPasswordResponse35, false, new javax.xml.namespace.QName("http://services.mgt.tenant.carbon.wso2.org",
                                                    "updateTenantPassword"));
                                    
            } else {
              throw new java.lang.RuntimeException("method not found");
            }
        

        newMsgContext.setEnvelope(envelope);
        }
        } catch (TenantMgtAdminServiceExceptionException e) {

            msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME,"TenantMgtAdminServiceException");
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
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.tenant.mgt.services.UpdateTenant param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.tenant.mgt.services.UpdateTenant.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.tenant.mgt.services.TenantMgtAdminServiceException param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.tenant.mgt.services.TenantMgtAdminServiceException.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.tenant.mgt.services.DeactivateTenant param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.tenant.mgt.services.DeactivateTenant.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.tenant.mgt.services.ActivateTenant param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.tenant.mgt.services.ActivateTenant.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.tenant.mgt.services.RetrieveTenants param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.tenant.mgt.services.RetrieveTenants.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.tenant.mgt.services.RetrieveTenantsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.tenant.mgt.services.RetrieveTenantsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.tenant.mgt.services.GetTenant param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.tenant.mgt.services.GetTenant.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.tenant.mgt.services.GetTenantResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.tenant.mgt.services.GetTenantResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.tenant.mgt.services.RetrievePaginatedTenants param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.tenant.mgt.services.RetrievePaginatedTenants.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.tenant.mgt.services.RetrievePaginatedTenantsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.tenant.mgt.services.RetrievePaginatedTenantsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.tenant.mgt.services.RestartTenant param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.tenant.mgt.services.RestartTenant.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.tenant.mgt.services.AddTenant param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.tenant.mgt.services.AddTenant.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.tenant.mgt.services.AddTenantResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.tenant.mgt.services.AddTenantResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.tenant.mgt.services.UpdateTenantPassword param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.tenant.mgt.services.UpdateTenantPassword.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.tenant.mgt.services.UpdateTenantPasswordResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.tenant.mgt.services.UpdateTenantPasswordResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.tenant.mgt.services.RetrieveTenantsResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.tenant.mgt.services.RetrieveTenantsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.tenant.mgt.services.RetrieveTenantsResponse wrapretrieveTenants(){
                                org.wso2.carbon.tenant.mgt.services.RetrieveTenantsResponse wrappedElement = new org.wso2.carbon.tenant.mgt.services.RetrieveTenantsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.tenant.mgt.services.GetTenantResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.tenant.mgt.services.GetTenantResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.tenant.mgt.services.GetTenantResponse wrapgetTenant(){
                                org.wso2.carbon.tenant.mgt.services.GetTenantResponse wrappedElement = new org.wso2.carbon.tenant.mgt.services.GetTenantResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.tenant.mgt.services.RetrievePaginatedTenantsResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.tenant.mgt.services.RetrievePaginatedTenantsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.tenant.mgt.services.RetrievePaginatedTenantsResponse wrapretrievePaginatedTenants(){
                                org.wso2.carbon.tenant.mgt.services.RetrievePaginatedTenantsResponse wrappedElement = new org.wso2.carbon.tenant.mgt.services.RetrievePaginatedTenantsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.tenant.mgt.services.AddTenantResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.tenant.mgt.services.AddTenantResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.tenant.mgt.services.AddTenantResponse wrapaddTenant(){
                                org.wso2.carbon.tenant.mgt.services.AddTenantResponse wrappedElement = new org.wso2.carbon.tenant.mgt.services.AddTenantResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.tenant.mgt.services.UpdateTenantPasswordResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.tenant.mgt.services.UpdateTenantPasswordResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.tenant.mgt.services.UpdateTenantPasswordResponse wrapupdateTenantPassword(){
                                org.wso2.carbon.tenant.mgt.services.UpdateTenantPasswordResponse wrappedElement = new org.wso2.carbon.tenant.mgt.services.UpdateTenantPasswordResponse();
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
        
                if (org.wso2.carbon.tenant.mgt.services.UpdateTenant.class.equals(type)){
                
                           return org.wso2.carbon.tenant.mgt.services.UpdateTenant.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.tenant.mgt.services.TenantMgtAdminServiceException.class.equals(type)){
                
                           return org.wso2.carbon.tenant.mgt.services.TenantMgtAdminServiceException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.tenant.mgt.services.DeactivateTenant.class.equals(type)){
                
                           return org.wso2.carbon.tenant.mgt.services.DeactivateTenant.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.tenant.mgt.services.TenantMgtAdminServiceException.class.equals(type)){
                
                           return org.wso2.carbon.tenant.mgt.services.TenantMgtAdminServiceException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.tenant.mgt.services.ActivateTenant.class.equals(type)){
                
                           return org.wso2.carbon.tenant.mgt.services.ActivateTenant.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.tenant.mgt.services.TenantMgtAdminServiceException.class.equals(type)){
                
                           return org.wso2.carbon.tenant.mgt.services.TenantMgtAdminServiceException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.tenant.mgt.services.RetrieveTenants.class.equals(type)){
                
                           return org.wso2.carbon.tenant.mgt.services.RetrieveTenants.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.tenant.mgt.services.RetrieveTenantsResponse.class.equals(type)){
                
                           return org.wso2.carbon.tenant.mgt.services.RetrieveTenantsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.tenant.mgt.services.TenantMgtAdminServiceException.class.equals(type)){
                
                           return org.wso2.carbon.tenant.mgt.services.TenantMgtAdminServiceException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.tenant.mgt.services.GetTenant.class.equals(type)){
                
                           return org.wso2.carbon.tenant.mgt.services.GetTenant.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.tenant.mgt.services.GetTenantResponse.class.equals(type)){
                
                           return org.wso2.carbon.tenant.mgt.services.GetTenantResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.tenant.mgt.services.TenantMgtAdminServiceException.class.equals(type)){
                
                           return org.wso2.carbon.tenant.mgt.services.TenantMgtAdminServiceException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.tenant.mgt.services.RetrievePaginatedTenants.class.equals(type)){
                
                           return org.wso2.carbon.tenant.mgt.services.RetrievePaginatedTenants.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.tenant.mgt.services.RetrievePaginatedTenantsResponse.class.equals(type)){
                
                           return org.wso2.carbon.tenant.mgt.services.RetrievePaginatedTenantsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.tenant.mgt.services.TenantMgtAdminServiceException.class.equals(type)){
                
                           return org.wso2.carbon.tenant.mgt.services.TenantMgtAdminServiceException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.tenant.mgt.services.RestartTenant.class.equals(type)){
                
                           return org.wso2.carbon.tenant.mgt.services.RestartTenant.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.tenant.mgt.services.TenantMgtAdminServiceException.class.equals(type)){
                
                           return org.wso2.carbon.tenant.mgt.services.TenantMgtAdminServiceException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.tenant.mgt.services.AddTenant.class.equals(type)){
                
                           return org.wso2.carbon.tenant.mgt.services.AddTenant.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.tenant.mgt.services.AddTenantResponse.class.equals(type)){
                
                           return org.wso2.carbon.tenant.mgt.services.AddTenantResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.tenant.mgt.services.TenantMgtAdminServiceException.class.equals(type)){
                
                           return org.wso2.carbon.tenant.mgt.services.TenantMgtAdminServiceException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.tenant.mgt.services.UpdateTenantPassword.class.equals(type)){
                
                           return org.wso2.carbon.tenant.mgt.services.UpdateTenantPassword.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.tenant.mgt.services.UpdateTenantPasswordResponse.class.equals(type)){
                
                           return org.wso2.carbon.tenant.mgt.services.UpdateTenantPasswordResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.tenant.mgt.services.TenantMgtAdminServiceException.class.equals(type)){
                
                           return org.wso2.carbon.tenant.mgt.services.TenantMgtAdminServiceException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

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
    
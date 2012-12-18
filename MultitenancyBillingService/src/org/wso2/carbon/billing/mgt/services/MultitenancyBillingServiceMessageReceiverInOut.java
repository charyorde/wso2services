
/**
 * MultitenancyBillingServiceMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */
        package org.wso2.carbon.billing.mgt.services;

        /**
        *  MultitenancyBillingServiceMessageReceiverInOut message receiver
        */

        public class MultitenancyBillingServiceMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        MultitenancyBillingServiceSkeletonInterface skel = (MultitenancyBillingServiceSkeletonInterface)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){


        

            if("getOutstandingBalance".equals(methodName)){
                
                org.wso2.carbon.billing.mgt.services.GetOutstandingBalanceResponse getOutstandingBalanceResponse13 = null;
	                        org.wso2.carbon.billing.mgt.services.GetOutstandingBalance wrappedParam =
                                                             (org.wso2.carbon.billing.mgt.services.GetOutstandingBalance)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.billing.mgt.services.GetOutstandingBalance.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getOutstandingBalanceResponse13 =
                                                   
                                                   
                                                         skel.getOutstandingBalance(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getOutstandingBalanceResponse13, false, new javax.xml.namespace.QName("http://services.mgt.billing.carbon.wso2.org",
                                                    "getOutstandingBalance"));
                                    } else 

            if("getCurrentInvoice".equals(methodName)){
                
                org.wso2.carbon.billing.mgt.services.GetCurrentInvoiceResponse getCurrentInvoiceResponse15 = null;
	                        org.wso2.carbon.billing.mgt.services.GetCurrentInvoice wrappedParam =
                                                             (org.wso2.carbon.billing.mgt.services.GetCurrentInvoice)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.billing.mgt.services.GetCurrentInvoice.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getCurrentInvoiceResponse15 =
                                                   
                                                   
                                                         skel.getCurrentInvoice(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getCurrentInvoiceResponse15, false, new javax.xml.namespace.QName("http://services.mgt.billing.carbon.wso2.org",
                                                    "getCurrentInvoice"));
                                    } else 

            if("getPastInvoice".equals(methodName)){
                
                org.wso2.carbon.billing.mgt.services.GetPastInvoiceResponse getPastInvoiceResponse17 = null;
	                        org.wso2.carbon.billing.mgt.services.GetPastInvoice wrappedParam =
                                                             (org.wso2.carbon.billing.mgt.services.GetPastInvoice)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.billing.mgt.services.GetPastInvoice.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getPastInvoiceResponse17 =
                                                   
                                                   
                                                         skel.getPastInvoice(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getPastInvoiceResponse17, false, new javax.xml.namespace.QName("http://services.mgt.billing.carbon.wso2.org",
                                                    "getPastInvoice"));
                                    } else 

            if("addPayment".equals(methodName)){
                
                org.wso2.carbon.billing.mgt.services.AddPaymentResponse addPaymentResponse19 = null;
	                        org.wso2.carbon.billing.mgt.services.AddPayment wrappedParam =
                                                             (org.wso2.carbon.billing.mgt.services.AddPayment)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.billing.mgt.services.AddPayment.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               addPaymentResponse19 =
                                                   
                                                   
                                                         skel.addPayment(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), addPaymentResponse19, false, new javax.xml.namespace.QName("http://services.mgt.billing.carbon.wso2.org",
                                                    "addPayment"));
                                    } else 

            if("getAvailableBillingPeriods".equals(methodName)){
                
                org.wso2.carbon.billing.mgt.services.GetAvailableBillingPeriodsResponse getAvailableBillingPeriodsResponse21 = null;
	                        org.wso2.carbon.billing.mgt.services.GetAvailableBillingPeriods wrappedParam =
                                                             (org.wso2.carbon.billing.mgt.services.GetAvailableBillingPeriods)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.billing.mgt.services.GetAvailableBillingPeriods.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getAvailableBillingPeriodsResponse21 =
                                                   
                                                   
                                                         skel.getAvailableBillingPeriods(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getAvailableBillingPeriodsResponse21, false, new javax.xml.namespace.QName("http://services.mgt.billing.carbon.wso2.org",
                                                    "getAvailableBillingPeriods"));
                                    } else 

            if("getPaginatedBalances".equals(methodName)){
                
                org.wso2.carbon.billing.mgt.services.GetPaginatedBalancesResponse getPaginatedBalancesResponse23 = null;
	                        org.wso2.carbon.billing.mgt.services.GetPaginatedBalances wrappedParam =
                                                             (org.wso2.carbon.billing.mgt.services.GetPaginatedBalances)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.billing.mgt.services.GetPaginatedBalances.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getPaginatedBalancesResponse23 =
                                                   
                                                   
                                                         skel.getPaginatedBalances(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getPaginatedBalancesResponse23, false, new javax.xml.namespace.QName("http://services.mgt.billing.carbon.wso2.org",
                                                    "getPaginatedBalances"));
                                    
            } else {
              throw new java.lang.RuntimeException("method not found");
            }
        

        newMsgContext.setEnvelope(envelope);
        }
        } catch (MultitenancyBillingServiceExceptionException e) {

            msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME,"MultitenancyBillingServiceException");
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
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.billing.mgt.services.GetOutstandingBalance param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.billing.mgt.services.GetOutstandingBalance.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.billing.mgt.services.GetOutstandingBalanceResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.billing.mgt.services.GetOutstandingBalanceResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.billing.mgt.services.MultitenancyBillingServiceException param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.billing.mgt.services.MultitenancyBillingServiceException.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.billing.mgt.services.GetCurrentInvoice param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.billing.mgt.services.GetCurrentInvoice.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.billing.mgt.services.GetCurrentInvoiceResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.billing.mgt.services.GetCurrentInvoiceResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.billing.mgt.services.GetPastInvoice param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.billing.mgt.services.GetPastInvoice.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.billing.mgt.services.GetPastInvoiceResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.billing.mgt.services.GetPastInvoiceResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.billing.mgt.services.AddPayment param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.billing.mgt.services.AddPayment.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.billing.mgt.services.AddPaymentResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.billing.mgt.services.AddPaymentResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.billing.mgt.services.GetAvailableBillingPeriods param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.billing.mgt.services.GetAvailableBillingPeriods.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.billing.mgt.services.GetAvailableBillingPeriodsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.billing.mgt.services.GetAvailableBillingPeriodsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.billing.mgt.services.GetPaginatedBalances param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.billing.mgt.services.GetPaginatedBalances.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.billing.mgt.services.GetPaginatedBalancesResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.billing.mgt.services.GetPaginatedBalancesResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.billing.mgt.services.GetOutstandingBalanceResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.billing.mgt.services.GetOutstandingBalanceResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.billing.mgt.services.GetOutstandingBalanceResponse wrapgetOutstandingBalance(){
                                org.wso2.carbon.billing.mgt.services.GetOutstandingBalanceResponse wrappedElement = new org.wso2.carbon.billing.mgt.services.GetOutstandingBalanceResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.billing.mgt.services.GetCurrentInvoiceResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.billing.mgt.services.GetCurrentInvoiceResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.billing.mgt.services.GetCurrentInvoiceResponse wrapgetCurrentInvoice(){
                                org.wso2.carbon.billing.mgt.services.GetCurrentInvoiceResponse wrappedElement = new org.wso2.carbon.billing.mgt.services.GetCurrentInvoiceResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.billing.mgt.services.GetPastInvoiceResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.billing.mgt.services.GetPastInvoiceResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.billing.mgt.services.GetPastInvoiceResponse wrapgetPastInvoice(){
                                org.wso2.carbon.billing.mgt.services.GetPastInvoiceResponse wrappedElement = new org.wso2.carbon.billing.mgt.services.GetPastInvoiceResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.billing.mgt.services.AddPaymentResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.billing.mgt.services.AddPaymentResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.billing.mgt.services.AddPaymentResponse wrapaddPayment(){
                                org.wso2.carbon.billing.mgt.services.AddPaymentResponse wrappedElement = new org.wso2.carbon.billing.mgt.services.AddPaymentResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.billing.mgt.services.GetAvailableBillingPeriodsResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.billing.mgt.services.GetAvailableBillingPeriodsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.billing.mgt.services.GetAvailableBillingPeriodsResponse wrapgetAvailableBillingPeriods(){
                                org.wso2.carbon.billing.mgt.services.GetAvailableBillingPeriodsResponse wrappedElement = new org.wso2.carbon.billing.mgt.services.GetAvailableBillingPeriodsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.billing.mgt.services.GetPaginatedBalancesResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.billing.mgt.services.GetPaginatedBalancesResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.billing.mgt.services.GetPaginatedBalancesResponse wrapgetPaginatedBalances(){
                                org.wso2.carbon.billing.mgt.services.GetPaginatedBalancesResponse wrappedElement = new org.wso2.carbon.billing.mgt.services.GetPaginatedBalancesResponse();
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
        
                if (org.wso2.carbon.billing.mgt.services.GetOutstandingBalance.class.equals(type)){
                
                           return org.wso2.carbon.billing.mgt.services.GetOutstandingBalance.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.billing.mgt.services.GetOutstandingBalanceResponse.class.equals(type)){
                
                           return org.wso2.carbon.billing.mgt.services.GetOutstandingBalanceResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.billing.mgt.services.MultitenancyBillingServiceException.class.equals(type)){
                
                           return org.wso2.carbon.billing.mgt.services.MultitenancyBillingServiceException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.billing.mgt.services.GetCurrentInvoice.class.equals(type)){
                
                           return org.wso2.carbon.billing.mgt.services.GetCurrentInvoice.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.billing.mgt.services.GetCurrentInvoiceResponse.class.equals(type)){
                
                           return org.wso2.carbon.billing.mgt.services.GetCurrentInvoiceResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.billing.mgt.services.MultitenancyBillingServiceException.class.equals(type)){
                
                           return org.wso2.carbon.billing.mgt.services.MultitenancyBillingServiceException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.billing.mgt.services.GetPastInvoice.class.equals(type)){
                
                           return org.wso2.carbon.billing.mgt.services.GetPastInvoice.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.billing.mgt.services.GetPastInvoiceResponse.class.equals(type)){
                
                           return org.wso2.carbon.billing.mgt.services.GetPastInvoiceResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.billing.mgt.services.MultitenancyBillingServiceException.class.equals(type)){
                
                           return org.wso2.carbon.billing.mgt.services.MultitenancyBillingServiceException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.billing.mgt.services.AddPayment.class.equals(type)){
                
                           return org.wso2.carbon.billing.mgt.services.AddPayment.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.billing.mgt.services.AddPaymentResponse.class.equals(type)){
                
                           return org.wso2.carbon.billing.mgt.services.AddPaymentResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.billing.mgt.services.MultitenancyBillingServiceException.class.equals(type)){
                
                           return org.wso2.carbon.billing.mgt.services.MultitenancyBillingServiceException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.billing.mgt.services.GetAvailableBillingPeriods.class.equals(type)){
                
                           return org.wso2.carbon.billing.mgt.services.GetAvailableBillingPeriods.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.billing.mgt.services.GetAvailableBillingPeriodsResponse.class.equals(type)){
                
                           return org.wso2.carbon.billing.mgt.services.GetAvailableBillingPeriodsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.billing.mgt.services.MultitenancyBillingServiceException.class.equals(type)){
                
                           return org.wso2.carbon.billing.mgt.services.MultitenancyBillingServiceException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.billing.mgt.services.GetPaginatedBalances.class.equals(type)){
                
                           return org.wso2.carbon.billing.mgt.services.GetPaginatedBalances.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.billing.mgt.services.GetPaginatedBalancesResponse.class.equals(type)){
                
                           return org.wso2.carbon.billing.mgt.services.GetPaginatedBalancesResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.billing.mgt.services.MultitenancyBillingServiceException.class.equals(type)){
                
                           return org.wso2.carbon.billing.mgt.services.MultitenancyBillingServiceException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

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
    
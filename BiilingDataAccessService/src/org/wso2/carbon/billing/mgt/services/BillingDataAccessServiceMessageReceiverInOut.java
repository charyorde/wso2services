
/**
 * BillingDataAccessServiceMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */
        package org.wso2.carbon.billing.mgt.services;

        /**
        *  BillingDataAccessServiceMessageReceiverInOut message receiver
        */

        public class BillingDataAccessServiceMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        BillingDataAccessServiceSkeletonInterface skel = (BillingDataAccessServiceSkeletonInterface)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){


        

            if("getItemIdWithName".equals(methodName)){
                
                org.wso2.carbon.billing.mgt.services.GetItemIdWithNameResponse getItemIdWithNameResponse19 = null;
	                        org.wso2.carbon.billing.mgt.services.GetItemIdWithName wrappedParam =
                                                             (org.wso2.carbon.billing.mgt.services.GetItemIdWithName)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.billing.mgt.services.GetItemIdWithName.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getItemIdWithNameResponse19 =
                                                   
                                                   
                                                         skel.getItemIdWithName(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getItemIdWithNameResponse19, false, new javax.xml.namespace.QName("http://services.mgt.billing.carbon.wso2.org",
                                                    "getItemIdWithName"));
                                    } else 

            if("addSubscription".equals(methodName)){
                
                org.wso2.carbon.billing.mgt.services.AddSubscriptionResponse addSubscriptionResponse21 = null;
	                        org.wso2.carbon.billing.mgt.services.AddSubscription wrappedParam =
                                                             (org.wso2.carbon.billing.mgt.services.AddSubscription)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.billing.mgt.services.AddSubscription.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               addSubscriptionResponse21 =
                                                   
                                                   
                                                         skel.addSubscription(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), addSubscriptionResponse21, false, new javax.xml.namespace.QName("http://services.mgt.billing.carbon.wso2.org",
                                                    "addSubscription"));
                                    } else 

            if("getCustomerWithName".equals(methodName)){
                
                org.wso2.carbon.billing.mgt.services.GetCustomerWithNameResponse getCustomerWithNameResponse23 = null;
	                        org.wso2.carbon.billing.mgt.services.GetCustomerWithName wrappedParam =
                                                             (org.wso2.carbon.billing.mgt.services.GetCustomerWithName)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.billing.mgt.services.GetCustomerWithName.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getCustomerWithNameResponse23 =
                                                   
                                                   
                                                         skel.getCustomerWithName(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getCustomerWithNameResponse23, false, new javax.xml.namespace.QName("http://services.mgt.billing.carbon.wso2.org",
                                                    "getCustomerWithName"));
                                    } else 

            if("getInactiveSubscriptionsOfCustomer".equals(methodName)){
                
                org.wso2.carbon.billing.mgt.services.GetInactiveSubscriptionsOfCustomerResponse getInactiveSubscriptionsOfCustomerResponse25 = null;
	                        org.wso2.carbon.billing.mgt.services.GetInactiveSubscriptionsOfCustomer wrappedParam =
                                                             (org.wso2.carbon.billing.mgt.services.GetInactiveSubscriptionsOfCustomer)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.billing.mgt.services.GetInactiveSubscriptionsOfCustomer.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getInactiveSubscriptionsOfCustomerResponse25 =
                                                   
                                                   
                                                         skel.getInactiveSubscriptionsOfCustomer(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getInactiveSubscriptionsOfCustomerResponse25, false, new javax.xml.namespace.QName("http://services.mgt.billing.carbon.wso2.org",
                                                    "getInactiveSubscriptionsOfCustomer"));
                                    } else 

            if("deactivateActiveSubscription".equals(methodName)){
                
                org.wso2.carbon.billing.mgt.services.DeactivateActiveSubscriptionResponse deactivateActiveSubscriptionResponse27 = null;
	                        org.wso2.carbon.billing.mgt.services.DeactivateActiveSubscription wrappedParam =
                                                             (org.wso2.carbon.billing.mgt.services.DeactivateActiveSubscription)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.billing.mgt.services.DeactivateActiveSubscription.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               deactivateActiveSubscriptionResponse27 =
                                                   
                                                   
                                                         skel.deactivateActiveSubscription(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), deactivateActiveSubscriptionResponse27, false, new javax.xml.namespace.QName("http://services.mgt.billing.carbon.wso2.org",
                                                    "deactivateActiveSubscription"));
                                    } else 

            if("changeSubscription".equals(methodName)){
                
                org.wso2.carbon.billing.mgt.services.ChangeSubscriptionResponse changeSubscriptionResponse29 = null;
	                        org.wso2.carbon.billing.mgt.services.ChangeSubscription wrappedParam =
                                                             (org.wso2.carbon.billing.mgt.services.ChangeSubscription)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.billing.mgt.services.ChangeSubscription.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               changeSubscriptionResponse29 =
                                                   
                                                   
                                                         skel.changeSubscription(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), changeSubscriptionResponse29, false, new javax.xml.namespace.QName("http://services.mgt.billing.carbon.wso2.org",
                                                    "changeSubscription"));
                                    } else 

            if("getActiveSubscriptionOfCustomer".equals(methodName)){
                
                org.wso2.carbon.billing.mgt.services.GetActiveSubscriptionOfCustomerResponse getActiveSubscriptionOfCustomerResponse31 = null;
	                        org.wso2.carbon.billing.mgt.services.GetActiveSubscriptionOfCustomer wrappedParam =
                                                             (org.wso2.carbon.billing.mgt.services.GetActiveSubscriptionOfCustomer)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.billing.mgt.services.GetActiveSubscriptionOfCustomer.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getActiveSubscriptionOfCustomerResponse31 =
                                                   
                                                   
                                                         skel.getActiveSubscriptionOfCustomer(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getActiveSubscriptionOfCustomerResponse31, false, new javax.xml.namespace.QName("http://services.mgt.billing.carbon.wso2.org",
                                                    "getActiveSubscriptionOfCustomer"));
                                    } else 

            if("getSubscription".equals(methodName)){
                
                org.wso2.carbon.billing.mgt.services.GetSubscriptionResponse getSubscriptionResponse33 = null;
	                        org.wso2.carbon.billing.mgt.services.GetSubscription wrappedParam =
                                                             (org.wso2.carbon.billing.mgt.services.GetSubscription)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.billing.mgt.services.GetSubscription.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getSubscriptionResponse33 =
                                                   
                                                   
                                                         skel.getSubscription(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getSubscriptionResponse33, false, new javax.xml.namespace.QName("http://services.mgt.billing.carbon.wso2.org",
                                                    "getSubscription"));
                                    } else 

            if("activateSubscription".equals(methodName)){
                
                org.wso2.carbon.billing.mgt.services.ActivateSubscriptionResponse activateSubscriptionResponse35 = null;
	                        org.wso2.carbon.billing.mgt.services.ActivateSubscription wrappedParam =
                                                             (org.wso2.carbon.billing.mgt.services.ActivateSubscription)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.billing.mgt.services.ActivateSubscription.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               activateSubscriptionResponse35 =
                                                   
                                                   
                                                         skel.activateSubscription(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), activateSubscriptionResponse35, false, new javax.xml.namespace.QName("http://services.mgt.billing.carbon.wso2.org",
                                                    "activateSubscription"));
                                    
            } else {
              throw new java.lang.RuntimeException("method not found");
            }
        

        newMsgContext.setEnvelope(envelope);
        }
        } catch (BillingDataAccessServiceExceptionException e) {

            msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME,"BillingDataAccessServiceException");
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
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.billing.mgt.services.GetItemIdWithName param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.billing.mgt.services.GetItemIdWithName.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.billing.mgt.services.GetItemIdWithNameResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.billing.mgt.services.GetItemIdWithNameResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.billing.mgt.services.BillingDataAccessServiceException param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.billing.mgt.services.BillingDataAccessServiceException.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.billing.mgt.services.AddSubscription param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.billing.mgt.services.AddSubscription.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.billing.mgt.services.AddSubscriptionResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.billing.mgt.services.AddSubscriptionResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.billing.mgt.services.GetCustomerWithName param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.billing.mgt.services.GetCustomerWithName.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.billing.mgt.services.GetCustomerWithNameResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.billing.mgt.services.GetCustomerWithNameResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.billing.mgt.services.GetInactiveSubscriptionsOfCustomer param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.billing.mgt.services.GetInactiveSubscriptionsOfCustomer.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.billing.mgt.services.GetInactiveSubscriptionsOfCustomerResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.billing.mgt.services.GetInactiveSubscriptionsOfCustomerResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.billing.mgt.services.DeactivateActiveSubscription param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.billing.mgt.services.DeactivateActiveSubscription.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.billing.mgt.services.DeactivateActiveSubscriptionResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.billing.mgt.services.DeactivateActiveSubscriptionResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.billing.mgt.services.ChangeSubscription param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.billing.mgt.services.ChangeSubscription.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.billing.mgt.services.ChangeSubscriptionResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.billing.mgt.services.ChangeSubscriptionResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.billing.mgt.services.GetActiveSubscriptionOfCustomer param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.billing.mgt.services.GetActiveSubscriptionOfCustomer.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.billing.mgt.services.GetActiveSubscriptionOfCustomerResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.billing.mgt.services.GetActiveSubscriptionOfCustomerResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.billing.mgt.services.GetSubscription param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.billing.mgt.services.GetSubscription.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.billing.mgt.services.GetSubscriptionResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.billing.mgt.services.GetSubscriptionResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.billing.mgt.services.ActivateSubscription param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.billing.mgt.services.ActivateSubscription.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.billing.mgt.services.ActivateSubscriptionResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.billing.mgt.services.ActivateSubscriptionResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.billing.mgt.services.GetItemIdWithNameResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.billing.mgt.services.GetItemIdWithNameResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.billing.mgt.services.GetItemIdWithNameResponse wrapgetItemIdWithName(){
                                org.wso2.carbon.billing.mgt.services.GetItemIdWithNameResponse wrappedElement = new org.wso2.carbon.billing.mgt.services.GetItemIdWithNameResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.billing.mgt.services.AddSubscriptionResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.billing.mgt.services.AddSubscriptionResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.billing.mgt.services.AddSubscriptionResponse wrapaddSubscription(){
                                org.wso2.carbon.billing.mgt.services.AddSubscriptionResponse wrappedElement = new org.wso2.carbon.billing.mgt.services.AddSubscriptionResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.billing.mgt.services.GetCustomerWithNameResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.billing.mgt.services.GetCustomerWithNameResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.billing.mgt.services.GetCustomerWithNameResponse wrapgetCustomerWithName(){
                                org.wso2.carbon.billing.mgt.services.GetCustomerWithNameResponse wrappedElement = new org.wso2.carbon.billing.mgt.services.GetCustomerWithNameResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.billing.mgt.services.GetInactiveSubscriptionsOfCustomerResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.billing.mgt.services.GetInactiveSubscriptionsOfCustomerResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.billing.mgt.services.GetInactiveSubscriptionsOfCustomerResponse wrapgetInactiveSubscriptionsOfCustomer(){
                                org.wso2.carbon.billing.mgt.services.GetInactiveSubscriptionsOfCustomerResponse wrappedElement = new org.wso2.carbon.billing.mgt.services.GetInactiveSubscriptionsOfCustomerResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.billing.mgt.services.DeactivateActiveSubscriptionResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.billing.mgt.services.DeactivateActiveSubscriptionResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.billing.mgt.services.DeactivateActiveSubscriptionResponse wrapdeactivateActiveSubscription(){
                                org.wso2.carbon.billing.mgt.services.DeactivateActiveSubscriptionResponse wrappedElement = new org.wso2.carbon.billing.mgt.services.DeactivateActiveSubscriptionResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.billing.mgt.services.ChangeSubscriptionResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.billing.mgt.services.ChangeSubscriptionResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.billing.mgt.services.ChangeSubscriptionResponse wrapchangeSubscription(){
                                org.wso2.carbon.billing.mgt.services.ChangeSubscriptionResponse wrappedElement = new org.wso2.carbon.billing.mgt.services.ChangeSubscriptionResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.billing.mgt.services.GetActiveSubscriptionOfCustomerResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.billing.mgt.services.GetActiveSubscriptionOfCustomerResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.billing.mgt.services.GetActiveSubscriptionOfCustomerResponse wrapgetActiveSubscriptionOfCustomer(){
                                org.wso2.carbon.billing.mgt.services.GetActiveSubscriptionOfCustomerResponse wrappedElement = new org.wso2.carbon.billing.mgt.services.GetActiveSubscriptionOfCustomerResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.billing.mgt.services.GetSubscriptionResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.billing.mgt.services.GetSubscriptionResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.billing.mgt.services.GetSubscriptionResponse wrapgetSubscription(){
                                org.wso2.carbon.billing.mgt.services.GetSubscriptionResponse wrappedElement = new org.wso2.carbon.billing.mgt.services.GetSubscriptionResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.billing.mgt.services.ActivateSubscriptionResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.billing.mgt.services.ActivateSubscriptionResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.billing.mgt.services.ActivateSubscriptionResponse wrapactivateSubscription(){
                                org.wso2.carbon.billing.mgt.services.ActivateSubscriptionResponse wrappedElement = new org.wso2.carbon.billing.mgt.services.ActivateSubscriptionResponse();
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
        
                if (org.wso2.carbon.billing.mgt.services.GetItemIdWithName.class.equals(type)){
                
                           return org.wso2.carbon.billing.mgt.services.GetItemIdWithName.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.billing.mgt.services.GetItemIdWithNameResponse.class.equals(type)){
                
                           return org.wso2.carbon.billing.mgt.services.GetItemIdWithNameResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.billing.mgt.services.BillingDataAccessServiceException.class.equals(type)){
                
                           return org.wso2.carbon.billing.mgt.services.BillingDataAccessServiceException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.billing.mgt.services.AddSubscription.class.equals(type)){
                
                           return org.wso2.carbon.billing.mgt.services.AddSubscription.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.billing.mgt.services.AddSubscriptionResponse.class.equals(type)){
                
                           return org.wso2.carbon.billing.mgt.services.AddSubscriptionResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.billing.mgt.services.BillingDataAccessServiceException.class.equals(type)){
                
                           return org.wso2.carbon.billing.mgt.services.BillingDataAccessServiceException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.billing.mgt.services.GetCustomerWithName.class.equals(type)){
                
                           return org.wso2.carbon.billing.mgt.services.GetCustomerWithName.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.billing.mgt.services.GetCustomerWithNameResponse.class.equals(type)){
                
                           return org.wso2.carbon.billing.mgt.services.GetCustomerWithNameResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.billing.mgt.services.BillingDataAccessServiceException.class.equals(type)){
                
                           return org.wso2.carbon.billing.mgt.services.BillingDataAccessServiceException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.billing.mgt.services.GetInactiveSubscriptionsOfCustomer.class.equals(type)){
                
                           return org.wso2.carbon.billing.mgt.services.GetInactiveSubscriptionsOfCustomer.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.billing.mgt.services.GetInactiveSubscriptionsOfCustomerResponse.class.equals(type)){
                
                           return org.wso2.carbon.billing.mgt.services.GetInactiveSubscriptionsOfCustomerResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.billing.mgt.services.BillingDataAccessServiceException.class.equals(type)){
                
                           return org.wso2.carbon.billing.mgt.services.BillingDataAccessServiceException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.billing.mgt.services.DeactivateActiveSubscription.class.equals(type)){
                
                           return org.wso2.carbon.billing.mgt.services.DeactivateActiveSubscription.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.billing.mgt.services.DeactivateActiveSubscriptionResponse.class.equals(type)){
                
                           return org.wso2.carbon.billing.mgt.services.DeactivateActiveSubscriptionResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.billing.mgt.services.BillingDataAccessServiceException.class.equals(type)){
                
                           return org.wso2.carbon.billing.mgt.services.BillingDataAccessServiceException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.billing.mgt.services.ChangeSubscription.class.equals(type)){
                
                           return org.wso2.carbon.billing.mgt.services.ChangeSubscription.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.billing.mgt.services.ChangeSubscriptionResponse.class.equals(type)){
                
                           return org.wso2.carbon.billing.mgt.services.ChangeSubscriptionResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.billing.mgt.services.BillingDataAccessServiceException.class.equals(type)){
                
                           return org.wso2.carbon.billing.mgt.services.BillingDataAccessServiceException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.billing.mgt.services.GetActiveSubscriptionOfCustomer.class.equals(type)){
                
                           return org.wso2.carbon.billing.mgt.services.GetActiveSubscriptionOfCustomer.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.billing.mgt.services.GetActiveSubscriptionOfCustomerResponse.class.equals(type)){
                
                           return org.wso2.carbon.billing.mgt.services.GetActiveSubscriptionOfCustomerResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.billing.mgt.services.BillingDataAccessServiceException.class.equals(type)){
                
                           return org.wso2.carbon.billing.mgt.services.BillingDataAccessServiceException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.billing.mgt.services.GetSubscription.class.equals(type)){
                
                           return org.wso2.carbon.billing.mgt.services.GetSubscription.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.billing.mgt.services.GetSubscriptionResponse.class.equals(type)){
                
                           return org.wso2.carbon.billing.mgt.services.GetSubscriptionResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.billing.mgt.services.BillingDataAccessServiceException.class.equals(type)){
                
                           return org.wso2.carbon.billing.mgt.services.BillingDataAccessServiceException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.billing.mgt.services.ActivateSubscription.class.equals(type)){
                
                           return org.wso2.carbon.billing.mgt.services.ActivateSubscription.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.billing.mgt.services.ActivateSubscriptionResponse.class.equals(type)){
                
                           return org.wso2.carbon.billing.mgt.services.ActivateSubscriptionResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.billing.mgt.services.BillingDataAccessServiceException.class.equals(type)){
                
                           return org.wso2.carbon.billing.mgt.services.BillingDataAccessServiceException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

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
    
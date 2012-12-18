
/**
 * StratosPaymentMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */
        package org.wso2.carbon.payment.paypal.services;

        /**
        *  StratosPaymentMessageReceiverInOut message receiver
        */

        public class StratosPaymentMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        StratosPaymentSkeletonInterface skel = (StratosPaymentSkeletonInterface)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){


        

            if("doExpressCheckout".equals(methodName)){
                
                org.wso2.carbon.payment.paypal.services.DoExpressCheckoutResponse doExpressCheckoutResponse7 = null;
	                        org.wso2.carbon.payment.paypal.services.DoExpressCheckout wrappedParam =
                                                             (org.wso2.carbon.payment.paypal.services.DoExpressCheckout)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.payment.paypal.services.DoExpressCheckout.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               doExpressCheckoutResponse7 =
                                                   
                                                   
                                                         skel.doExpressCheckout(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), doExpressCheckoutResponse7, false, new javax.xml.namespace.QName("http://services.paypal.payment.carbon.wso2.org",
                                                    "doExpressCheckout"));
                                    } else 

            if("initExpressCheckout".equals(methodName)){
                
                org.wso2.carbon.payment.paypal.services.InitExpressCheckoutResponse initExpressCheckoutResponse9 = null;
	                        org.wso2.carbon.payment.paypal.services.InitExpressCheckout wrappedParam =
                                                             (org.wso2.carbon.payment.paypal.services.InitExpressCheckout)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.payment.paypal.services.InitExpressCheckout.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               initExpressCheckoutResponse9 =
                                                   
                                                   
                                                         skel.initExpressCheckout(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), initExpressCheckoutResponse9, false, new javax.xml.namespace.QName("http://services.paypal.payment.carbon.wso2.org",
                                                    "initExpressCheckout"));
                                    } else 

            if("getExpressCheckoutDetails".equals(methodName)){
                
                org.wso2.carbon.payment.paypal.services.GetExpressCheckoutDetailsResponse getExpressCheckoutDetailsResponse11 = null;
	                        org.wso2.carbon.payment.paypal.services.GetExpressCheckoutDetails wrappedParam =
                                                             (org.wso2.carbon.payment.paypal.services.GetExpressCheckoutDetails)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.payment.paypal.services.GetExpressCheckoutDetails.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getExpressCheckoutDetailsResponse11 =
                                                   
                                                   
                                                         skel.getExpressCheckoutDetails(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getExpressCheckoutDetailsResponse11, false, new javax.xml.namespace.QName("http://services.paypal.payment.carbon.wso2.org",
                                                    "getExpressCheckoutDetails"));
                                    
            } else {
              throw new java.lang.RuntimeException("method not found");
            }
        

        newMsgContext.setEnvelope(envelope);
        }
        } catch (StratosPaymentPayPalExceptionException e) {

            msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME,"StratosPaymentPayPalException");
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
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.payment.paypal.services.DoExpressCheckout param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.payment.paypal.services.DoExpressCheckout.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.payment.paypal.services.DoExpressCheckoutResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.payment.paypal.services.DoExpressCheckoutResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.payment.paypal.services.StratosPaymentPayPalException param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.payment.paypal.services.StratosPaymentPayPalException.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.payment.paypal.services.InitExpressCheckout param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.payment.paypal.services.InitExpressCheckout.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.payment.paypal.services.InitExpressCheckoutResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.payment.paypal.services.InitExpressCheckoutResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.payment.paypal.services.GetExpressCheckoutDetails param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.payment.paypal.services.GetExpressCheckoutDetails.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.payment.paypal.services.GetExpressCheckoutDetailsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.payment.paypal.services.GetExpressCheckoutDetailsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.payment.paypal.services.DoExpressCheckoutResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.payment.paypal.services.DoExpressCheckoutResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.payment.paypal.services.DoExpressCheckoutResponse wrapdoExpressCheckout(){
                                org.wso2.carbon.payment.paypal.services.DoExpressCheckoutResponse wrappedElement = new org.wso2.carbon.payment.paypal.services.DoExpressCheckoutResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.payment.paypal.services.InitExpressCheckoutResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.payment.paypal.services.InitExpressCheckoutResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.payment.paypal.services.InitExpressCheckoutResponse wrapinitExpressCheckout(){
                                org.wso2.carbon.payment.paypal.services.InitExpressCheckoutResponse wrappedElement = new org.wso2.carbon.payment.paypal.services.InitExpressCheckoutResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.payment.paypal.services.GetExpressCheckoutDetailsResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.payment.paypal.services.GetExpressCheckoutDetailsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.payment.paypal.services.GetExpressCheckoutDetailsResponse wrapgetExpressCheckoutDetails(){
                                org.wso2.carbon.payment.paypal.services.GetExpressCheckoutDetailsResponse wrappedElement = new org.wso2.carbon.payment.paypal.services.GetExpressCheckoutDetailsResponse();
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
        
                if (org.wso2.carbon.payment.paypal.services.DoExpressCheckout.class.equals(type)){
                
                           return org.wso2.carbon.payment.paypal.services.DoExpressCheckout.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.payment.paypal.services.DoExpressCheckoutResponse.class.equals(type)){
                
                           return org.wso2.carbon.payment.paypal.services.DoExpressCheckoutResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.payment.paypal.services.StratosPaymentPayPalException.class.equals(type)){
                
                           return org.wso2.carbon.payment.paypal.services.StratosPaymentPayPalException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.payment.paypal.services.InitExpressCheckout.class.equals(type)){
                
                           return org.wso2.carbon.payment.paypal.services.InitExpressCheckout.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.payment.paypal.services.InitExpressCheckoutResponse.class.equals(type)){
                
                           return org.wso2.carbon.payment.paypal.services.InitExpressCheckoutResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.payment.paypal.services.StratosPaymentPayPalException.class.equals(type)){
                
                           return org.wso2.carbon.payment.paypal.services.StratosPaymentPayPalException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.payment.paypal.services.GetExpressCheckoutDetails.class.equals(type)){
                
                           return org.wso2.carbon.payment.paypal.services.GetExpressCheckoutDetails.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.payment.paypal.services.GetExpressCheckoutDetailsResponse.class.equals(type)){
                
                           return org.wso2.carbon.payment.paypal.services.GetExpressCheckoutDetailsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.payment.paypal.services.StratosPaymentPayPalException.class.equals(type)){
                
                           return org.wso2.carbon.payment.paypal.services.StratosPaymentPayPalException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

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
    
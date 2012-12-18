
/**
 * LoginStatisticsAdminMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */
        package org.wso2.carbon.core.services.authentication.stats;

        /**
        *  LoginStatisticsAdminMessageReceiverInOut message receiver
        */

        public class LoginStatisticsAdminMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        LoginStatisticsAdminSkeletonInterface skel = (LoginStatisticsAdminSkeletonInterface)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){


        

            if("getLoginAttempts".equals(methodName)){
                
                org.wso2.carbon.core.services.authentication.stats.GetLoginAttemptsResponse getLoginAttemptsResponse5 = null;
	                        org.wso2.carbon.core.services.authentication.stats.GetLoginAttempts wrappedParam =
                                                             (org.wso2.carbon.core.services.authentication.stats.GetLoginAttempts)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.core.services.authentication.stats.GetLoginAttempts.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getLoginAttemptsResponse5 =
                                                   
                                                   
                                                         skel.getLoginAttempts(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getLoginAttemptsResponse5, false, new javax.xml.namespace.QName("http://stats.authentication.services.core.carbon.wso2.org",
                                                    "getLoginAttempts"));
                                    } else 

            if("getUserBasedLoginAttempts".equals(methodName)){
                
                org.wso2.carbon.core.services.authentication.stats.GetUserBasedLoginAttemptsResponse getUserBasedLoginAttemptsResponse7 = null;
	                        org.wso2.carbon.core.services.authentication.stats.GetUserBasedLoginAttempts wrappedParam =
                                                             (org.wso2.carbon.core.services.authentication.stats.GetUserBasedLoginAttempts)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.core.services.authentication.stats.GetUserBasedLoginAttempts.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getUserBasedLoginAttemptsResponse7 =
                                                   
                                                   
                                                         skel.getUserBasedLoginAttempts(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getUserBasedLoginAttemptsResponse7, false, new javax.xml.namespace.QName("http://stats.authentication.services.core.carbon.wso2.org",
                                                    "getUserBasedLoginAttempts"));
                                    
            } else {
              throw new java.lang.RuntimeException("method not found");
            }
        

        newMsgContext.setEnvelope(envelope);
        }
        }
        catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
        }
        
        //
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.core.services.authentication.stats.GetLoginAttempts param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.core.services.authentication.stats.GetLoginAttempts.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.core.services.authentication.stats.GetLoginAttemptsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.core.services.authentication.stats.GetLoginAttemptsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.core.services.authentication.stats.GetUserBasedLoginAttempts param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.core.services.authentication.stats.GetUserBasedLoginAttempts.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.core.services.authentication.stats.GetUserBasedLoginAttemptsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.core.services.authentication.stats.GetUserBasedLoginAttemptsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.core.services.authentication.stats.GetLoginAttemptsResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.core.services.authentication.stats.GetLoginAttemptsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.core.services.authentication.stats.GetLoginAttemptsResponse wrapgetLoginAttempts(){
                                org.wso2.carbon.core.services.authentication.stats.GetLoginAttemptsResponse wrappedElement = new org.wso2.carbon.core.services.authentication.stats.GetLoginAttemptsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.core.services.authentication.stats.GetUserBasedLoginAttemptsResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.core.services.authentication.stats.GetUserBasedLoginAttemptsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.core.services.authentication.stats.GetUserBasedLoginAttemptsResponse wrapgetUserBasedLoginAttempts(){
                                org.wso2.carbon.core.services.authentication.stats.GetUserBasedLoginAttemptsResponse wrappedElement = new org.wso2.carbon.core.services.authentication.stats.GetUserBasedLoginAttemptsResponse();
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
        
                if (org.wso2.carbon.core.services.authentication.stats.GetLoginAttempts.class.equals(type)){
                
                           return org.wso2.carbon.core.services.authentication.stats.GetLoginAttempts.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.core.services.authentication.stats.GetLoginAttemptsResponse.class.equals(type)){
                
                           return org.wso2.carbon.core.services.authentication.stats.GetLoginAttemptsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.core.services.authentication.stats.GetUserBasedLoginAttempts.class.equals(type)){
                
                           return org.wso2.carbon.core.services.authentication.stats.GetUserBasedLoginAttempts.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.core.services.authentication.stats.GetUserBasedLoginAttemptsResponse.class.equals(type)){
                
                           return org.wso2.carbon.core.services.authentication.stats.GetUserBasedLoginAttemptsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

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
    
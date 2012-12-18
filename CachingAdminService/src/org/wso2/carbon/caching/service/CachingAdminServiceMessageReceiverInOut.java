
/**
 * CachingAdminServiceMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */
        package org.wso2.carbon.caching.service;

        /**
        *  CachingAdminServiceMessageReceiverInOut message receiver
        */

        public class CachingAdminServiceMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        CachingAdminServiceSkeletonInterface skel = (CachingAdminServiceSkeletonInterface)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){


        

            if("isCachingEnabledForService".equals(methodName)){
                
                org.wso2.carbon.caching.service.IsCachingEnabledForServiceResponse isCachingEnabledForServiceResponse25 = null;
	                        org.wso2.carbon.caching.service.IsCachingEnabledForService wrappedParam =
                                                             (org.wso2.carbon.caching.service.IsCachingEnabledForService)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.caching.service.IsCachingEnabledForService.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               isCachingEnabledForServiceResponse25 =
                                                   
                                                   
                                                         skel.isCachingEnabledForService(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), isCachingEnabledForServiceResponse25, false, new javax.xml.namespace.QName("http://service.caching.carbon.wso2.org",
                                                    "isCachingEnabledForService"));
                                    } else 

            if("isCachingEnabledForOperation".equals(methodName)){
                
                org.wso2.carbon.caching.service.IsCachingEnabledForOperationResponse isCachingEnabledForOperationResponse27 = null;
	                        org.wso2.carbon.caching.service.IsCachingEnabledForOperation wrappedParam =
                                                             (org.wso2.carbon.caching.service.IsCachingEnabledForOperation)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.caching.service.IsCachingEnabledForOperation.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               isCachingEnabledForOperationResponse27 =
                                                   
                                                   
                                                         skel.isCachingEnabledForOperation(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), isCachingEnabledForOperationResponse27, false, new javax.xml.namespace.QName("http://service.caching.carbon.wso2.org",
                                                    "isCachingEnabledForOperation"));
                                    } else 

            if("getCachingPolicyForOperation".equals(methodName)){
                
                org.wso2.carbon.caching.service.GetCachingPolicyForOperationResponse getCachingPolicyForOperationResponse29 = null;
	                        org.wso2.carbon.caching.service.GetCachingPolicyForOperation wrappedParam =
                                                             (org.wso2.carbon.caching.service.GetCachingPolicyForOperation)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.caching.service.GetCachingPolicyForOperation.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getCachingPolicyForOperationResponse29 =
                                                   
                                                   
                                                         skel.getCachingPolicyForOperation(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getCachingPolicyForOperationResponse29, false, new javax.xml.namespace.QName("http://service.caching.carbon.wso2.org",
                                                    "getCachingPolicyForOperation"));
                                    } else 

            if("engageCachingForOperation".equals(methodName)){
                
                org.wso2.carbon.caching.service.EngageCachingForOperationResponse engageCachingForOperationResponse31 = null;
	                        org.wso2.carbon.caching.service.EngageCachingForOperation wrappedParam =
                                                             (org.wso2.carbon.caching.service.EngageCachingForOperation)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.caching.service.EngageCachingForOperation.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               engageCachingForOperationResponse31 =
                                                   
                                                   
                                                         skel.engageCachingForOperation(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), engageCachingForOperationResponse31, false, new javax.xml.namespace.QName("http://service.caching.carbon.wso2.org",
                                                    "engageCachingForOperation"));
                                    } else 

            if("getGlobalCachingPolicy".equals(methodName)){
                
                org.wso2.carbon.caching.service.GetGlobalCachingPolicyResponse getGlobalCachingPolicyResponse33 = null;
	                        org.wso2.carbon.caching.service.GetGlobalCachingPolicy wrappedParam =
                                                             (org.wso2.carbon.caching.service.GetGlobalCachingPolicy)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.caching.service.GetGlobalCachingPolicy.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getGlobalCachingPolicyResponse33 =
                                                   
                                                   
                                                         skel.getGlobalCachingPolicy(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getGlobalCachingPolicyResponse33, false, new javax.xml.namespace.QName("http://service.caching.carbon.wso2.org",
                                                    "getGlobalCachingPolicy"));
                                    } else 

            if("disengageCachingForOperation".equals(methodName)){
                
                org.wso2.carbon.caching.service.DisengageCachingForOperationResponse disengageCachingForOperationResponse35 = null;
	                        org.wso2.carbon.caching.service.DisengageCachingForOperation wrappedParam =
                                                             (org.wso2.carbon.caching.service.DisengageCachingForOperation)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.caching.service.DisengageCachingForOperation.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               disengageCachingForOperationResponse35 =
                                                   
                                                   
                                                         skel.disengageCachingForOperation(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), disengageCachingForOperationResponse35, false, new javax.xml.namespace.QName("http://service.caching.carbon.wso2.org",
                                                    "disengageCachingForOperation"));
                                    } else 

            if("getCachingPolicyForService".equals(methodName)){
                
                org.wso2.carbon.caching.service.GetCachingPolicyForServiceResponse getCachingPolicyForServiceResponse37 = null;
	                        org.wso2.carbon.caching.service.GetCachingPolicyForService wrappedParam =
                                                             (org.wso2.carbon.caching.service.GetCachingPolicyForService)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.caching.service.GetCachingPolicyForService.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getCachingPolicyForServiceResponse37 =
                                                   
                                                   
                                                         skel.getCachingPolicyForService(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getCachingPolicyForServiceResponse37, false, new javax.xml.namespace.QName("http://service.caching.carbon.wso2.org",
                                                    "getCachingPolicyForService"));
                                    } else 

            if("disengageGlobalCaching".equals(methodName)){
                
                org.wso2.carbon.caching.service.DisengageGlobalCaching wrappedParam =
                                                             (org.wso2.carbon.caching.service.DisengageGlobalCaching)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.caching.service.DisengageGlobalCaching.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               
                                                         skel.disengageGlobalCaching(wrappedParam)
                                                    ;
                                            
                                        envelope = getSOAPFactory(msgContext).getDefaultEnvelope();
                                    } else 

            if("globallyEngageCaching".equals(methodName)){
                
                org.wso2.carbon.caching.service.GloballyEngageCaching wrappedParam =
                                                             (org.wso2.carbon.caching.service.GloballyEngageCaching)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.caching.service.GloballyEngageCaching.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               
                                                         skel.globallyEngageCaching(wrappedParam)
                                                    ;
                                            
                                        envelope = getSOAPFactory(msgContext).getDefaultEnvelope();
                                    } else 

            if("isCachingGloballyEnabled".equals(methodName)){
                
                org.wso2.carbon.caching.service.IsCachingGloballyEnabledResponse isCachingGloballyEnabledResponse43 = null;
	                        org.wso2.carbon.caching.service.IsCachingGloballyEnabled wrappedParam =
                                                             (org.wso2.carbon.caching.service.IsCachingGloballyEnabled)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.caching.service.IsCachingGloballyEnabled.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               isCachingGloballyEnabledResponse43 =
                                                   
                                                   
                                                         skel.isCachingGloballyEnabled(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), isCachingGloballyEnabledResponse43, false, new javax.xml.namespace.QName("http://service.caching.carbon.wso2.org",
                                                    "isCachingGloballyEnabled"));
                                    
            } else {
              throw new java.lang.RuntimeException("method not found");
            }
        

        newMsgContext.setEnvelope(envelope);
        }
        } catch (CachingAdminServiceCachingComponentExceptionException e) {

            msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME,"CachingAdminServiceCachingComponentException");
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
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.caching.service.IsCachingEnabledForService param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.caching.service.IsCachingEnabledForService.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.caching.service.IsCachingEnabledForServiceResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.caching.service.IsCachingEnabledForServiceResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.caching.service.CachingAdminServiceCachingComponentException param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.caching.service.CachingAdminServiceCachingComponentException.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.caching.service.IsCachingEnabledForOperation param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.caching.service.IsCachingEnabledForOperation.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.caching.service.IsCachingEnabledForOperationResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.caching.service.IsCachingEnabledForOperationResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.caching.service.GetCachingPolicyForOperation param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.caching.service.GetCachingPolicyForOperation.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.caching.service.GetCachingPolicyForOperationResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.caching.service.GetCachingPolicyForOperationResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.caching.service.EngageCachingForOperation param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.caching.service.EngageCachingForOperation.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.caching.service.EngageCachingForOperationResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.caching.service.EngageCachingForOperationResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.caching.service.GetGlobalCachingPolicy param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.caching.service.GetGlobalCachingPolicy.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.caching.service.GetGlobalCachingPolicyResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.caching.service.GetGlobalCachingPolicyResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.caching.service.DisengageCachingForOperation param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.caching.service.DisengageCachingForOperation.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.caching.service.DisengageCachingForOperationResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.caching.service.DisengageCachingForOperationResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.caching.service.DisengageCachingForService param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.caching.service.DisengageCachingForService.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.caching.service.GetCachingPolicyForService param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.caching.service.GetCachingPolicyForService.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.caching.service.GetCachingPolicyForServiceResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.caching.service.GetCachingPolicyForServiceResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.caching.service.DisengageGlobalCaching param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.caching.service.DisengageGlobalCaching.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.caching.service.GloballyEngageCaching param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.caching.service.GloballyEngageCaching.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.caching.service.IsCachingGloballyEnabled param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.caching.service.IsCachingGloballyEnabled.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.caching.service.IsCachingGloballyEnabledResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.caching.service.IsCachingGloballyEnabledResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.caching.service.EngageCachingForService param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.caching.service.EngageCachingForService.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.caching.service.IsCachingEnabledForServiceResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.caching.service.IsCachingEnabledForServiceResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.caching.service.IsCachingEnabledForServiceResponse wrapisCachingEnabledForService(){
                                org.wso2.carbon.caching.service.IsCachingEnabledForServiceResponse wrappedElement = new org.wso2.carbon.caching.service.IsCachingEnabledForServiceResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.caching.service.IsCachingEnabledForOperationResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.caching.service.IsCachingEnabledForOperationResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.caching.service.IsCachingEnabledForOperationResponse wrapisCachingEnabledForOperation(){
                                org.wso2.carbon.caching.service.IsCachingEnabledForOperationResponse wrappedElement = new org.wso2.carbon.caching.service.IsCachingEnabledForOperationResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.caching.service.GetCachingPolicyForOperationResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.caching.service.GetCachingPolicyForOperationResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.caching.service.GetCachingPolicyForOperationResponse wrapgetCachingPolicyForOperation(){
                                org.wso2.carbon.caching.service.GetCachingPolicyForOperationResponse wrappedElement = new org.wso2.carbon.caching.service.GetCachingPolicyForOperationResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.caching.service.EngageCachingForOperationResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.caching.service.EngageCachingForOperationResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.caching.service.EngageCachingForOperationResponse wrapengageCachingForOperation(){
                                org.wso2.carbon.caching.service.EngageCachingForOperationResponse wrappedElement = new org.wso2.carbon.caching.service.EngageCachingForOperationResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.caching.service.GetGlobalCachingPolicyResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.caching.service.GetGlobalCachingPolicyResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.caching.service.GetGlobalCachingPolicyResponse wrapgetGlobalCachingPolicy(){
                                org.wso2.carbon.caching.service.GetGlobalCachingPolicyResponse wrappedElement = new org.wso2.carbon.caching.service.GetGlobalCachingPolicyResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.caching.service.DisengageCachingForOperationResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.caching.service.DisengageCachingForOperationResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.caching.service.DisengageCachingForOperationResponse wrapdisengageCachingForOperation(){
                                org.wso2.carbon.caching.service.DisengageCachingForOperationResponse wrappedElement = new org.wso2.carbon.caching.service.DisengageCachingForOperationResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.caching.service.GetCachingPolicyForServiceResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.caching.service.GetCachingPolicyForServiceResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.caching.service.GetCachingPolicyForServiceResponse wrapgetCachingPolicyForService(){
                                org.wso2.carbon.caching.service.GetCachingPolicyForServiceResponse wrappedElement = new org.wso2.carbon.caching.service.GetCachingPolicyForServiceResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.caching.service.IsCachingGloballyEnabledResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.caching.service.IsCachingGloballyEnabledResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.caching.service.IsCachingGloballyEnabledResponse wrapisCachingGloballyEnabled(){
                                org.wso2.carbon.caching.service.IsCachingGloballyEnabledResponse wrappedElement = new org.wso2.carbon.caching.service.IsCachingGloballyEnabledResponse();
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
        
                if (org.wso2.carbon.caching.service.IsCachingEnabledForService.class.equals(type)){
                
                           return org.wso2.carbon.caching.service.IsCachingEnabledForService.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.caching.service.IsCachingEnabledForServiceResponse.class.equals(type)){
                
                           return org.wso2.carbon.caching.service.IsCachingEnabledForServiceResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.caching.service.CachingAdminServiceCachingComponentException.class.equals(type)){
                
                           return org.wso2.carbon.caching.service.CachingAdminServiceCachingComponentException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.caching.service.IsCachingEnabledForOperation.class.equals(type)){
                
                           return org.wso2.carbon.caching.service.IsCachingEnabledForOperation.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.caching.service.IsCachingEnabledForOperationResponse.class.equals(type)){
                
                           return org.wso2.carbon.caching.service.IsCachingEnabledForOperationResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.caching.service.CachingAdminServiceCachingComponentException.class.equals(type)){
                
                           return org.wso2.carbon.caching.service.CachingAdminServiceCachingComponentException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.caching.service.GetCachingPolicyForOperation.class.equals(type)){
                
                           return org.wso2.carbon.caching.service.GetCachingPolicyForOperation.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.caching.service.GetCachingPolicyForOperationResponse.class.equals(type)){
                
                           return org.wso2.carbon.caching.service.GetCachingPolicyForOperationResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.caching.service.CachingAdminServiceCachingComponentException.class.equals(type)){
                
                           return org.wso2.carbon.caching.service.CachingAdminServiceCachingComponentException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.caching.service.EngageCachingForOperation.class.equals(type)){
                
                           return org.wso2.carbon.caching.service.EngageCachingForOperation.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.caching.service.EngageCachingForOperationResponse.class.equals(type)){
                
                           return org.wso2.carbon.caching.service.EngageCachingForOperationResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.caching.service.CachingAdminServiceCachingComponentException.class.equals(type)){
                
                           return org.wso2.carbon.caching.service.CachingAdminServiceCachingComponentException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.caching.service.GetGlobalCachingPolicy.class.equals(type)){
                
                           return org.wso2.carbon.caching.service.GetGlobalCachingPolicy.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.caching.service.GetGlobalCachingPolicyResponse.class.equals(type)){
                
                           return org.wso2.carbon.caching.service.GetGlobalCachingPolicyResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.caching.service.CachingAdminServiceCachingComponentException.class.equals(type)){
                
                           return org.wso2.carbon.caching.service.CachingAdminServiceCachingComponentException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.caching.service.DisengageCachingForOperation.class.equals(type)){
                
                           return org.wso2.carbon.caching.service.DisengageCachingForOperation.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.caching.service.DisengageCachingForOperationResponse.class.equals(type)){
                
                           return org.wso2.carbon.caching.service.DisengageCachingForOperationResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.caching.service.CachingAdminServiceCachingComponentException.class.equals(type)){
                
                           return org.wso2.carbon.caching.service.CachingAdminServiceCachingComponentException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.caching.service.DisengageCachingForService.class.equals(type)){
                
                           return org.wso2.carbon.caching.service.DisengageCachingForService.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.caching.service.CachingAdminServiceCachingComponentException.class.equals(type)){
                
                           return org.wso2.carbon.caching.service.CachingAdminServiceCachingComponentException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.caching.service.GetCachingPolicyForService.class.equals(type)){
                
                           return org.wso2.carbon.caching.service.GetCachingPolicyForService.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.caching.service.GetCachingPolicyForServiceResponse.class.equals(type)){
                
                           return org.wso2.carbon.caching.service.GetCachingPolicyForServiceResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.caching.service.CachingAdminServiceCachingComponentException.class.equals(type)){
                
                           return org.wso2.carbon.caching.service.CachingAdminServiceCachingComponentException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.caching.service.DisengageGlobalCaching.class.equals(type)){
                
                           return org.wso2.carbon.caching.service.DisengageGlobalCaching.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.caching.service.CachingAdminServiceCachingComponentException.class.equals(type)){
                
                           return org.wso2.carbon.caching.service.CachingAdminServiceCachingComponentException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.caching.service.GloballyEngageCaching.class.equals(type)){
                
                           return org.wso2.carbon.caching.service.GloballyEngageCaching.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.caching.service.CachingAdminServiceCachingComponentException.class.equals(type)){
                
                           return org.wso2.carbon.caching.service.CachingAdminServiceCachingComponentException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.caching.service.IsCachingGloballyEnabled.class.equals(type)){
                
                           return org.wso2.carbon.caching.service.IsCachingGloballyEnabled.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.caching.service.IsCachingGloballyEnabledResponse.class.equals(type)){
                
                           return org.wso2.carbon.caching.service.IsCachingGloballyEnabledResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.caching.service.CachingAdminServiceCachingComponentException.class.equals(type)){
                
                           return org.wso2.carbon.caching.service.CachingAdminServiceCachingComponentException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.caching.service.EngageCachingForService.class.equals(type)){
                
                           return org.wso2.carbon.caching.service.EngageCachingForService.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.caching.service.CachingAdminServiceCachingComponentException.class.equals(type)){
                
                           return org.wso2.carbon.caching.service.CachingAdminServiceCachingComponentException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

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
    
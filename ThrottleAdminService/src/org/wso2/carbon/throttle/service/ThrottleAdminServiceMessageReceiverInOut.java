
/**
 * ThrottleAdminServiceMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */
        package org.wso2.carbon.throttle.service;

        /**
        *  ThrottleAdminServiceMessageReceiverInOut message receiver
        */

        public class ThrottleAdminServiceMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        ThrottleAdminServiceSkeletonInterface skel = (ThrottleAdminServiceSkeletonInterface)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){


        

            if("disengageGlobalThrottling".equals(methodName)){
                
                org.wso2.carbon.throttle.service.DisengageGlobalThrottling wrappedParam =
                                                             (org.wso2.carbon.throttle.service.DisengageGlobalThrottling)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.throttle.service.DisengageGlobalThrottling.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               
                                                         skel.disengageGlobalThrottling(wrappedParam)
                                                    ;
                                            
                                        envelope = getSOAPFactory(msgContext).getDefaultEnvelope();
                                    } else 

            if("getOperationPolicyConfigs".equals(methodName)){
                
                org.wso2.carbon.throttle.service.GetOperationPolicyConfigsResponse getOperationPolicyConfigsResponse25 = null;
	                        org.wso2.carbon.throttle.service.GetOperationPolicyConfigs wrappedParam =
                                                             (org.wso2.carbon.throttle.service.GetOperationPolicyConfigs)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.throttle.service.GetOperationPolicyConfigs.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getOperationPolicyConfigsResponse25 =
                                                   
                                                   
                                                         skel.getOperationPolicyConfigs(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getOperationPolicyConfigsResponse25, false, new javax.xml.namespace.QName("http://service.throttle.carbon.wso2.org",
                                                    "getOperationPolicyConfigs"));
                                    } else 

            if("throttlePolicyToString".equals(methodName)){
                
                org.wso2.carbon.throttle.service.ThrottlePolicyToStringResponse throttlePolicyToStringResponse27 = null;
	                        org.wso2.carbon.throttle.service.ThrottlePolicyToString wrappedParam =
                                                             (org.wso2.carbon.throttle.service.ThrottlePolicyToString)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.throttle.service.ThrottlePolicyToString.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               throttlePolicyToStringResponse27 =
                                                   
                                                   
                                                         skel.throttlePolicyToString(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), throttlePolicyToStringResponse27, false, new javax.xml.namespace.QName("http://service.throttle.carbon.wso2.org",
                                                    "throttlePolicyToString"));
                                    } else 

            if("getPolicyConfigs".equals(methodName)){
                
                org.wso2.carbon.throttle.service.GetPolicyConfigsResponse getPolicyConfigsResponse29 = null;
	                        org.wso2.carbon.throttle.service.GetPolicyConfigs wrappedParam =
                                                             (org.wso2.carbon.throttle.service.GetPolicyConfigs)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.throttle.service.GetPolicyConfigs.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getPolicyConfigsResponse29 =
                                                   
                                                   
                                                         skel.getPolicyConfigs(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getPolicyConfigsResponse29, false, new javax.xml.namespace.QName("http://service.throttle.carbon.wso2.org",
                                                    "getPolicyConfigs"));
                                    } else 

            if("getGlobalPolicyConfigs".equals(methodName)){
                
                org.wso2.carbon.throttle.service.GetGlobalPolicyConfigsResponse getGlobalPolicyConfigsResponse31 = null;
	                        org.wso2.carbon.throttle.service.GetGlobalPolicyConfigs wrappedParam =
                                                             (org.wso2.carbon.throttle.service.GetGlobalPolicyConfigs)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.throttle.service.GetGlobalPolicyConfigs.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getGlobalPolicyConfigsResponse31 =
                                                   
                                                   
                                                         skel.getGlobalPolicyConfigs(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getGlobalPolicyConfigsResponse31, false, new javax.xml.namespace.QName("http://service.throttle.carbon.wso2.org",
                                                    "getGlobalPolicyConfigs"));
                                    } else 

            if("engageThrottlingForOperation".equals(methodName)){
                
                org.wso2.carbon.throttle.service.EngageThrottlingForOperationResponse engageThrottlingForOperationResponse33 = null;
	                        org.wso2.carbon.throttle.service.EngageThrottlingForOperation wrappedParam =
                                                             (org.wso2.carbon.throttle.service.EngageThrottlingForOperation)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.throttle.service.EngageThrottlingForOperation.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               engageThrottlingForOperationResponse33 =
                                                   
                                                   
                                                         skel.engageThrottlingForOperation(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), engageThrottlingForOperationResponse33, false, new javax.xml.namespace.QName("http://service.throttle.carbon.wso2.org",
                                                    "engageThrottlingForOperation"));
                                    } else 

            if("globallyEngageThrottling".equals(methodName)){
                
                org.wso2.carbon.throttle.service.GloballyEngageThrottling wrappedParam =
                                                             (org.wso2.carbon.throttle.service.GloballyEngageThrottling)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.throttle.service.GloballyEngageThrottling.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               
                                                         skel.globallyEngageThrottling(wrappedParam)
                                                    ;
                                            
                                        envelope = getSOAPFactory(msgContext).getDefaultEnvelope();
                                    } else 

            if("toThrottlePolicy".equals(methodName)){
                
                org.wso2.carbon.throttle.service.ToThrottlePolicyResponse toThrottlePolicyResponse37 = null;
	                        org.wso2.carbon.throttle.service.ToThrottlePolicy wrappedParam =
                                                             (org.wso2.carbon.throttle.service.ToThrottlePolicy)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.throttle.service.ToThrottlePolicy.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               toThrottlePolicyResponse37 =
                                                   
                                                   
                                                         skel.toThrottlePolicy(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), toThrottlePolicyResponse37, false, new javax.xml.namespace.QName("http://service.throttle.carbon.wso2.org",
                                                    "toThrottlePolicy"));
                                    } else 

            if("disengageThrottlingForOperation".equals(methodName)){
                
                org.wso2.carbon.throttle.service.DisengageThrottlingForOperationResponse disengageThrottlingForOperationResponse39 = null;
	                        org.wso2.carbon.throttle.service.DisengageThrottlingForOperation wrappedParam =
                                                             (org.wso2.carbon.throttle.service.DisengageThrottlingForOperation)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.throttle.service.DisengageThrottlingForOperation.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               disengageThrottlingForOperationResponse39 =
                                                   
                                                   
                                                         skel.disengageThrottlingForOperation(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), disengageThrottlingForOperationResponse39, false, new javax.xml.namespace.QName("http://service.throttle.carbon.wso2.org",
                                                    "disengageThrottlingForOperation"));
                                    
            } else {
              throw new java.lang.RuntimeException("method not found");
            }
        

        newMsgContext.setEnvelope(envelope);
        }
        } catch (ThrottleAdminServiceThrottleComponentExceptionException e) {

            msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME,"ThrottleAdminServiceThrottleComponentException");
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
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.throttle.service.DisengageGlobalThrottling param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.throttle.service.DisengageGlobalThrottling.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.throttle.service.ThrottleAdminServiceThrottleComponentException param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.throttle.service.ThrottleAdminServiceThrottleComponentException.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.throttle.service.GetOperationPolicyConfigs param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.throttle.service.GetOperationPolicyConfigs.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.throttle.service.GetOperationPolicyConfigsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.throttle.service.GetOperationPolicyConfigsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.throttle.service.EnableThrottling param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.throttle.service.EnableThrottling.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.throttle.service.ThrottlePolicyToString param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.throttle.service.ThrottlePolicyToString.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.throttle.service.ThrottlePolicyToStringResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.throttle.service.ThrottlePolicyToStringResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.throttle.service.GetPolicyConfigs param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.throttle.service.GetPolicyConfigs.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.throttle.service.GetPolicyConfigsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.throttle.service.GetPolicyConfigsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.throttle.service.GetGlobalPolicyConfigs param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.throttle.service.GetGlobalPolicyConfigs.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.throttle.service.GetGlobalPolicyConfigsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.throttle.service.GetGlobalPolicyConfigsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.throttle.service.DisableThrottling param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.throttle.service.DisableThrottling.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.throttle.service.EngageThrottlingForOperation param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.throttle.service.EngageThrottlingForOperation.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.throttle.service.EngageThrottlingForOperationResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.throttle.service.EngageThrottlingForOperationResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.throttle.service.GloballyEngageThrottling param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.throttle.service.GloballyEngageThrottling.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.throttle.service.ToThrottlePolicy param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.throttle.service.ToThrottlePolicy.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.throttle.service.ToThrottlePolicyResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.throttle.service.ToThrottlePolicyResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.throttle.service.DisengageThrottlingForOperation param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.throttle.service.DisengageThrottlingForOperation.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.throttle.service.DisengageThrottlingForOperationResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.throttle.service.DisengageThrottlingForOperationResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.throttle.service.GetOperationPolicyConfigsResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.throttle.service.GetOperationPolicyConfigsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.throttle.service.GetOperationPolicyConfigsResponse wrapgetOperationPolicyConfigs(){
                                org.wso2.carbon.throttle.service.GetOperationPolicyConfigsResponse wrappedElement = new org.wso2.carbon.throttle.service.GetOperationPolicyConfigsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.throttle.service.ThrottlePolicyToStringResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.throttle.service.ThrottlePolicyToStringResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.throttle.service.ThrottlePolicyToStringResponse wrapthrottlePolicyToString(){
                                org.wso2.carbon.throttle.service.ThrottlePolicyToStringResponse wrappedElement = new org.wso2.carbon.throttle.service.ThrottlePolicyToStringResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.throttle.service.GetPolicyConfigsResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.throttle.service.GetPolicyConfigsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.throttle.service.GetPolicyConfigsResponse wrapgetPolicyConfigs(){
                                org.wso2.carbon.throttle.service.GetPolicyConfigsResponse wrappedElement = new org.wso2.carbon.throttle.service.GetPolicyConfigsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.throttle.service.GetGlobalPolicyConfigsResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.throttle.service.GetGlobalPolicyConfigsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.throttle.service.GetGlobalPolicyConfigsResponse wrapgetGlobalPolicyConfigs(){
                                org.wso2.carbon.throttle.service.GetGlobalPolicyConfigsResponse wrappedElement = new org.wso2.carbon.throttle.service.GetGlobalPolicyConfigsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.throttle.service.EngageThrottlingForOperationResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.throttle.service.EngageThrottlingForOperationResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.throttle.service.EngageThrottlingForOperationResponse wrapengageThrottlingForOperation(){
                                org.wso2.carbon.throttle.service.EngageThrottlingForOperationResponse wrappedElement = new org.wso2.carbon.throttle.service.EngageThrottlingForOperationResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.throttle.service.ToThrottlePolicyResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.throttle.service.ToThrottlePolicyResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.throttle.service.ToThrottlePolicyResponse wraptoThrottlePolicy(){
                                org.wso2.carbon.throttle.service.ToThrottlePolicyResponse wrappedElement = new org.wso2.carbon.throttle.service.ToThrottlePolicyResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.throttle.service.DisengageThrottlingForOperationResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.throttle.service.DisengageThrottlingForOperationResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.throttle.service.DisengageThrottlingForOperationResponse wrapdisengageThrottlingForOperation(){
                                org.wso2.carbon.throttle.service.DisengageThrottlingForOperationResponse wrappedElement = new org.wso2.carbon.throttle.service.DisengageThrottlingForOperationResponse();
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
        
                if (org.wso2.carbon.throttle.service.DisengageGlobalThrottling.class.equals(type)){
                
                           return org.wso2.carbon.throttle.service.DisengageGlobalThrottling.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.throttle.service.ThrottleAdminServiceThrottleComponentException.class.equals(type)){
                
                           return org.wso2.carbon.throttle.service.ThrottleAdminServiceThrottleComponentException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.throttle.service.GetOperationPolicyConfigs.class.equals(type)){
                
                           return org.wso2.carbon.throttle.service.GetOperationPolicyConfigs.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.throttle.service.GetOperationPolicyConfigsResponse.class.equals(type)){
                
                           return org.wso2.carbon.throttle.service.GetOperationPolicyConfigsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.throttle.service.ThrottleAdminServiceThrottleComponentException.class.equals(type)){
                
                           return org.wso2.carbon.throttle.service.ThrottleAdminServiceThrottleComponentException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.throttle.service.EnableThrottling.class.equals(type)){
                
                           return org.wso2.carbon.throttle.service.EnableThrottling.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.throttle.service.ThrottleAdminServiceThrottleComponentException.class.equals(type)){
                
                           return org.wso2.carbon.throttle.service.ThrottleAdminServiceThrottleComponentException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.throttle.service.ThrottlePolicyToString.class.equals(type)){
                
                           return org.wso2.carbon.throttle.service.ThrottlePolicyToString.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.throttle.service.ThrottlePolicyToStringResponse.class.equals(type)){
                
                           return org.wso2.carbon.throttle.service.ThrottlePolicyToStringResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.throttle.service.ThrottleAdminServiceThrottleComponentException.class.equals(type)){
                
                           return org.wso2.carbon.throttle.service.ThrottleAdminServiceThrottleComponentException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.throttle.service.GetPolicyConfigs.class.equals(type)){
                
                           return org.wso2.carbon.throttle.service.GetPolicyConfigs.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.throttle.service.GetPolicyConfigsResponse.class.equals(type)){
                
                           return org.wso2.carbon.throttle.service.GetPolicyConfigsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.throttle.service.ThrottleAdminServiceThrottleComponentException.class.equals(type)){
                
                           return org.wso2.carbon.throttle.service.ThrottleAdminServiceThrottleComponentException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.throttle.service.GetGlobalPolicyConfigs.class.equals(type)){
                
                           return org.wso2.carbon.throttle.service.GetGlobalPolicyConfigs.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.throttle.service.GetGlobalPolicyConfigsResponse.class.equals(type)){
                
                           return org.wso2.carbon.throttle.service.GetGlobalPolicyConfigsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.throttle.service.ThrottleAdminServiceThrottleComponentException.class.equals(type)){
                
                           return org.wso2.carbon.throttle.service.ThrottleAdminServiceThrottleComponentException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.throttle.service.DisableThrottling.class.equals(type)){
                
                           return org.wso2.carbon.throttle.service.DisableThrottling.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.throttle.service.ThrottleAdminServiceThrottleComponentException.class.equals(type)){
                
                           return org.wso2.carbon.throttle.service.ThrottleAdminServiceThrottleComponentException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.throttle.service.EngageThrottlingForOperation.class.equals(type)){
                
                           return org.wso2.carbon.throttle.service.EngageThrottlingForOperation.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.throttle.service.EngageThrottlingForOperationResponse.class.equals(type)){
                
                           return org.wso2.carbon.throttle.service.EngageThrottlingForOperationResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.throttle.service.ThrottleAdminServiceThrottleComponentException.class.equals(type)){
                
                           return org.wso2.carbon.throttle.service.ThrottleAdminServiceThrottleComponentException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.throttle.service.GloballyEngageThrottling.class.equals(type)){
                
                           return org.wso2.carbon.throttle.service.GloballyEngageThrottling.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.throttle.service.ThrottleAdminServiceThrottleComponentException.class.equals(type)){
                
                           return org.wso2.carbon.throttle.service.ThrottleAdminServiceThrottleComponentException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.throttle.service.ToThrottlePolicy.class.equals(type)){
                
                           return org.wso2.carbon.throttle.service.ToThrottlePolicy.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.throttle.service.ToThrottlePolicyResponse.class.equals(type)){
                
                           return org.wso2.carbon.throttle.service.ToThrottlePolicyResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.throttle.service.ThrottleAdminServiceThrottleComponentException.class.equals(type)){
                
                           return org.wso2.carbon.throttle.service.ThrottleAdminServiceThrottleComponentException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.throttle.service.DisengageThrottlingForOperation.class.equals(type)){
                
                           return org.wso2.carbon.throttle.service.DisengageThrottlingForOperation.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.throttle.service.DisengageThrottlingForOperationResponse.class.equals(type)){
                
                           return org.wso2.carbon.throttle.service.DisengageThrottlingForOperationResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.throttle.service.ThrottleAdminServiceThrottleComponentException.class.equals(type)){
                
                           return org.wso2.carbon.throttle.service.ThrottleAdminServiceThrottleComponentException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

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
    
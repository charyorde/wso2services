
/**
 * ServiceGroupAdminMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */
        package org.wso2.carbon.service.mgt;

        /**
        *  ServiceGroupAdminMessageReceiverInOut message receiver
        */

        public class ServiceGroupAdminMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        ServiceGroupAdminSkeletonInterface skel = (ServiceGroupAdminSkeletonInterface)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){


        

            if("listServiceGroup".equals(methodName)){
                
                axis2.apache.org.xsd.ListServiceGroupResponse listServiceGroupResponse18 = null;
	                        axis2.apache.org.xsd.ListServiceGroup wrappedParam =
                                                             (axis2.apache.org.xsd.ListServiceGroup)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    axis2.apache.org.xsd.ListServiceGroup.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               listServiceGroupResponse18 =
                                                   
                                                   
                                                         skel.listServiceGroup(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), listServiceGroupResponse18, false, new javax.xml.namespace.QName("http://mgt.service.carbon.wso2.org",
                                                    "listServiceGroup"));
                                    } else 

            if("getServiceGroupParameter".equals(methodName)){
                
                axis2.apache.org.xsd.GetServiceGroupParameterResponse getServiceGroupParameterResponse20 = null;
	                        axis2.apache.org.xsd.GetServiceGroupParameter wrappedParam =
                                                             (axis2.apache.org.xsd.GetServiceGroupParameter)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    axis2.apache.org.xsd.GetServiceGroupParameter.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getServiceGroupParameterResponse20 =
                                                   
                                                   
                                                         skel.getServiceGroupParameter(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getServiceGroupParameterResponse20, false, new javax.xml.namespace.QName("http://mgt.service.carbon.wso2.org",
                                                    "getServiceGroupParameter"));
                                    } else 

            if("configureServiceGroupMTOM".equals(methodName)){
                
                axis2.apache.org.xsd.ConfigureServiceGroupMTOMResponse configureServiceGroupMTOMResponse22 = null;
	                        axis2.apache.org.xsd.ConfigureServiceGroupMTOM wrappedParam =
                                                             (axis2.apache.org.xsd.ConfigureServiceGroupMTOM)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    axis2.apache.org.xsd.ConfigureServiceGroupMTOM.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               configureServiceGroupMTOMResponse22 =
                                                   
                                                   
                                                         skel.configureServiceGroupMTOM(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), configureServiceGroupMTOMResponse22, false, new javax.xml.namespace.QName("http://mgt.service.carbon.wso2.org",
                                                    "configureServiceGroupMTOM"));
                                    } else 

            if("dumpAAR".equals(methodName)){
                
                axis2.apache.org.xsd.DumpAARResponse dumpAARResponse24 = null;
	                        axis2.apache.org.xsd.DumpAAR wrappedParam =
                                                             (axis2.apache.org.xsd.DumpAAR)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    axis2.apache.org.xsd.DumpAAR.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               dumpAARResponse24 =
                                                   
                                                   
                                                         skel.dumpAAR(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), dumpAARResponse24, false, new javax.xml.namespace.QName("http://mgt.service.carbon.wso2.org",
                                                    "dumpAAR"));
                                    } else 

            if("listServiceGroups".equals(methodName)){
                
                axis2.apache.org.xsd.ListServiceGroupsResponse listServiceGroupsResponse26 = null;
	                        axis2.apache.org.xsd.ListServiceGroups wrappedParam =
                                                             (axis2.apache.org.xsd.ListServiceGroups)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    axis2.apache.org.xsd.ListServiceGroups.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               listServiceGroupsResponse26 =
                                                   
                                                   
                                                         skel.listServiceGroups(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), listServiceGroupsResponse26, false, new javax.xml.namespace.QName("http://mgt.service.carbon.wso2.org",
                                                    "listServiceGroups"));
                                    } else 

            if("getServiceGroupParameters".equals(methodName)){
                
                axis2.apache.org.xsd.GetServiceGroupParametersResponse getServiceGroupParametersResponse28 = null;
	                        axis2.apache.org.xsd.GetServiceGroupParameters wrappedParam =
                                                             (axis2.apache.org.xsd.GetServiceGroupParameters)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    axis2.apache.org.xsd.GetServiceGroupParameters.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getServiceGroupParametersResponse28 =
                                                   
                                                   
                                                         skel.getServiceGroupParameters(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getServiceGroupParametersResponse28, false, new javax.xml.namespace.QName("http://mgt.service.carbon.wso2.org",
                                                    "getServiceGroupParameters"));
                                    
            } else {
              throw new java.lang.RuntimeException("method not found");
            }
        

        newMsgContext.setEnvelope(envelope);
        }
        } catch (ServiceGroupAdminServerException e) {

            msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME,"ServiceGroupAdminServerException");
            org.apache.axis2.AxisFault f = createAxisFault(e);
            if (e.getFaultMessage() != null){
                f.setDetail(toOM(e.getFaultMessage(),false));
            }
            throw f;
            }
         catch (ServiceGroupAdminException e) {

            msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME,"ServiceGroupAdminException");
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
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.ListServiceGroup param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.ListServiceGroup.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.ListServiceGroupResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.ListServiceGroupResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.ServiceGroupAdminException param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.ServiceGroupAdminException.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.SetServiceGroupParameters param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.SetServiceGroupParameters.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.GetServiceGroupParameter param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.GetServiceGroupParameter.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.GetServiceGroupParameterResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.GetServiceGroupParameterResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.ServiceGroupAdminServerException param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.ServiceGroupAdminServerException.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.ConfigureServiceGroupMTOM param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.ConfigureServiceGroupMTOM.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.ConfigureServiceGroupMTOMResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.ConfigureServiceGroupMTOMResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.RemoveServiceGroupParameter param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.RemoveServiceGroupParameter.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.UpdateServiceGroupParamters param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.UpdateServiceGroupParamters.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.DumpAAR param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.DumpAAR.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.DumpAARResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.DumpAARResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.SetServiceGroupParameter param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.SetServiceGroupParameter.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.UpdateServiceGroupParameter param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.UpdateServiceGroupParameter.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.ListServiceGroups param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.ListServiceGroups.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.ListServiceGroupsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.ListServiceGroupsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.GetServiceGroupParameters param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.GetServiceGroupParameters.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.GetServiceGroupParametersResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.GetServiceGroupParametersResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, axis2.apache.org.xsd.ListServiceGroupResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(axis2.apache.org.xsd.ListServiceGroupResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private axis2.apache.org.xsd.ListServiceGroupResponse wraplistServiceGroup(){
                                axis2.apache.org.xsd.ListServiceGroupResponse wrappedElement = new axis2.apache.org.xsd.ListServiceGroupResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, axis2.apache.org.xsd.GetServiceGroupParameterResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(axis2.apache.org.xsd.GetServiceGroupParameterResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private axis2.apache.org.xsd.GetServiceGroupParameterResponse wrapgetServiceGroupParameter(){
                                axis2.apache.org.xsd.GetServiceGroupParameterResponse wrappedElement = new axis2.apache.org.xsd.GetServiceGroupParameterResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, axis2.apache.org.xsd.ConfigureServiceGroupMTOMResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(axis2.apache.org.xsd.ConfigureServiceGroupMTOMResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private axis2.apache.org.xsd.ConfigureServiceGroupMTOMResponse wrapconfigureServiceGroupMTOM(){
                                axis2.apache.org.xsd.ConfigureServiceGroupMTOMResponse wrappedElement = new axis2.apache.org.xsd.ConfigureServiceGroupMTOMResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, axis2.apache.org.xsd.DumpAARResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(axis2.apache.org.xsd.DumpAARResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private axis2.apache.org.xsd.DumpAARResponse wrapdumpAAR(){
                                axis2.apache.org.xsd.DumpAARResponse wrappedElement = new axis2.apache.org.xsd.DumpAARResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, axis2.apache.org.xsd.ListServiceGroupsResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(axis2.apache.org.xsd.ListServiceGroupsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private axis2.apache.org.xsd.ListServiceGroupsResponse wraplistServiceGroups(){
                                axis2.apache.org.xsd.ListServiceGroupsResponse wrappedElement = new axis2.apache.org.xsd.ListServiceGroupsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, axis2.apache.org.xsd.GetServiceGroupParametersResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(axis2.apache.org.xsd.GetServiceGroupParametersResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private axis2.apache.org.xsd.GetServiceGroupParametersResponse wrapgetServiceGroupParameters(){
                                axis2.apache.org.xsd.GetServiceGroupParametersResponse wrappedElement = new axis2.apache.org.xsd.GetServiceGroupParametersResponse();
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
        
                if (axis2.apache.org.xsd.ListServiceGroup.class.equals(type)){
                
                           return axis2.apache.org.xsd.ListServiceGroup.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.ListServiceGroupResponse.class.equals(type)){
                
                           return axis2.apache.org.xsd.ListServiceGroupResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.ServiceGroupAdminException.class.equals(type)){
                
                           return axis2.apache.org.xsd.ServiceGroupAdminException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.SetServiceGroupParameters.class.equals(type)){
                
                           return axis2.apache.org.xsd.SetServiceGroupParameters.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.GetServiceGroupParameter.class.equals(type)){
                
                           return axis2.apache.org.xsd.GetServiceGroupParameter.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.GetServiceGroupParameterResponse.class.equals(type)){
                
                           return axis2.apache.org.xsd.GetServiceGroupParameterResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.ServiceGroupAdminServerException.class.equals(type)){
                
                           return axis2.apache.org.xsd.ServiceGroupAdminServerException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.ConfigureServiceGroupMTOM.class.equals(type)){
                
                           return axis2.apache.org.xsd.ConfigureServiceGroupMTOM.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.ConfigureServiceGroupMTOMResponse.class.equals(type)){
                
                           return axis2.apache.org.xsd.ConfigureServiceGroupMTOMResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.ServiceGroupAdminException.class.equals(type)){
                
                           return axis2.apache.org.xsd.ServiceGroupAdminException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.RemoveServiceGroupParameter.class.equals(type)){
                
                           return axis2.apache.org.xsd.RemoveServiceGroupParameter.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.UpdateServiceGroupParamters.class.equals(type)){
                
                           return axis2.apache.org.xsd.UpdateServiceGroupParamters.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.ServiceGroupAdminServerException.class.equals(type)){
                
                           return axis2.apache.org.xsd.ServiceGroupAdminServerException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.DumpAAR.class.equals(type)){
                
                           return axis2.apache.org.xsd.DumpAAR.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.DumpAARResponse.class.equals(type)){
                
                           return axis2.apache.org.xsd.DumpAARResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.SetServiceGroupParameter.class.equals(type)){
                
                           return axis2.apache.org.xsd.SetServiceGroupParameter.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.UpdateServiceGroupParameter.class.equals(type)){
                
                           return axis2.apache.org.xsd.UpdateServiceGroupParameter.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.ServiceGroupAdminServerException.class.equals(type)){
                
                           return axis2.apache.org.xsd.ServiceGroupAdminServerException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.ListServiceGroups.class.equals(type)){
                
                           return axis2.apache.org.xsd.ListServiceGroups.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.ListServiceGroupsResponse.class.equals(type)){
                
                           return axis2.apache.org.xsd.ListServiceGroupsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.GetServiceGroupParameters.class.equals(type)){
                
                           return axis2.apache.org.xsd.GetServiceGroupParameters.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.GetServiceGroupParametersResponse.class.equals(type)){
                
                           return axis2.apache.org.xsd.GetServiceGroupParametersResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.ServiceGroupAdminServerException.class.equals(type)){
                
                           return axis2.apache.org.xsd.ServiceGroupAdminServerException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

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
    
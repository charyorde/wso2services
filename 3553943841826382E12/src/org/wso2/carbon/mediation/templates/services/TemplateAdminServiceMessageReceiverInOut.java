
/**
 * TemplateAdminServiceMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */
        package org.wso2.carbon.mediation.templates.services;

        /**
        *  TemplateAdminServiceMessageReceiverInOut message receiver
        */

        public class TemplateAdminServiceMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        TemplateAdminServiceSkeletonInterface skel = (TemplateAdminServiceSkeletonInterface)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){


        

            if("disableTracing".equals(methodName)){
                
                synapse.apache.org.xsd.DisableTracingResponse disableTracingResponse28 = null;
	                        synapse.apache.org.xsd.DisableTracing wrappedParam =
                                                             (synapse.apache.org.xsd.DisableTracing)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    synapse.apache.org.xsd.DisableTracing.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               disableTracingResponse28 =
                                                   
                                                   
                                                         skel.disableTracing(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), disableTracingResponse28, false, new javax.xml.namespace.QName("http://services.templates.mediation.carbon.wso2.org",
                                                    "disableTracing"));
                                    } else 

            if("getDynamicTemplate".equals(methodName)){
                
                synapse.apache.org.xsd.GetDynamicTemplateResponse getDynamicTemplateResponse30 = null;
	                        synapse.apache.org.xsd.GetDynamicTemplate wrappedParam =
                                                             (synapse.apache.org.xsd.GetDynamicTemplate)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    synapse.apache.org.xsd.GetDynamicTemplate.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getDynamicTemplateResponse30 =
                                                   
                                                   
                                                         skel.getDynamicTemplate(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getDynamicTemplateResponse30, false, new javax.xml.namespace.QName("http://services.templates.mediation.carbon.wso2.org",
                                                    "getDynamicTemplate"));
                                    } else 

            if("disableStatistics".equals(methodName)){
                
                synapse.apache.org.xsd.DisableStatisticsResponse disableStatisticsResponse32 = null;
	                        synapse.apache.org.xsd.DisableStatistics wrappedParam =
                                                             (synapse.apache.org.xsd.DisableStatistics)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    synapse.apache.org.xsd.DisableStatistics.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               disableStatisticsResponse32 =
                                                   
                                                   
                                                         skel.disableStatistics(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), disableStatisticsResponse32, false, new javax.xml.namespace.QName("http://services.templates.mediation.carbon.wso2.org",
                                                    "disableStatistics"));
                                    } else 

            if("getDynamicTemplates".equals(methodName)){
                
                synapse.apache.org.xsd.GetDynamicTemplatesResponse getDynamicTemplatesResponse34 = null;
	                        synapse.apache.org.xsd.GetDynamicTemplates wrappedParam =
                                                             (synapse.apache.org.xsd.GetDynamicTemplates)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    synapse.apache.org.xsd.GetDynamicTemplates.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getDynamicTemplatesResponse34 =
                                                   
                                                   
                                                         skel.getDynamicTemplates(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getDynamicTemplatesResponse34, false, new javax.xml.namespace.QName("http://services.templates.mediation.carbon.wso2.org",
                                                    "getDynamicTemplates"));
                                    } else 

            if("getTemplates".equals(methodName)){
                
                synapse.apache.org.xsd.GetTemplatesResponse getTemplatesResponse36 = null;
	                        synapse.apache.org.xsd.GetTemplates wrappedParam =
                                                             (synapse.apache.org.xsd.GetTemplates)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    synapse.apache.org.xsd.GetTemplates.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getTemplatesResponse36 =
                                                   
                                                   
                                                         skel.getTemplates(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getTemplatesResponse36, false, new javax.xml.namespace.QName("http://services.templates.mediation.carbon.wso2.org",
                                                    "getTemplates"));
                                    } else 

            if("enableStatistics".equals(methodName)){
                
                synapse.apache.org.xsd.EnableStatisticsResponse enableStatisticsResponse38 = null;
	                        synapse.apache.org.xsd.EnableStatistics wrappedParam =
                                                             (synapse.apache.org.xsd.EnableStatistics)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    synapse.apache.org.xsd.EnableStatistics.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               enableStatisticsResponse38 =
                                                   
                                                   
                                                         skel.enableStatistics(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), enableStatisticsResponse38, false, new javax.xml.namespace.QName("http://services.templates.mediation.carbon.wso2.org",
                                                    "enableStatistics"));
                                    } else 

            if("getTemplate".equals(methodName)){
                
                synapse.apache.org.xsd.GetTemplateResponse getTemplateResponse40 = null;
	                        synapse.apache.org.xsd.GetTemplate wrappedParam =
                                                             (synapse.apache.org.xsd.GetTemplate)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    synapse.apache.org.xsd.GetTemplate.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getTemplateResponse40 =
                                                   
                                                   
                                                         skel.getTemplate(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getTemplateResponse40, false, new javax.xml.namespace.QName("http://services.templates.mediation.carbon.wso2.org",
                                                    "getTemplate"));
                                    } else 

            if("enableTracing".equals(methodName)){
                
                synapse.apache.org.xsd.EnableTracingResponse enableTracingResponse42 = null;
	                        synapse.apache.org.xsd.EnableTracing wrappedParam =
                                                             (synapse.apache.org.xsd.EnableTracing)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    synapse.apache.org.xsd.EnableTracing.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               enableTracingResponse42 =
                                                   
                                                   
                                                         skel.enableTracing(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), enableTracingResponse42, false, new javax.xml.namespace.QName("http://services.templates.mediation.carbon.wso2.org",
                                                    "enableTracing"));
                                    } else 

            if("getDynamicTemplateCount".equals(methodName)){
                
                synapse.apache.org.xsd.GetDynamicTemplateCountResponse getDynamicTemplateCountResponse44 = null;
	                        synapse.apache.org.xsd.GetDynamicTemplateCount wrappedParam =
                                                             (synapse.apache.org.xsd.GetDynamicTemplateCount)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    synapse.apache.org.xsd.GetDynamicTemplateCount.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getDynamicTemplateCountResponse44 =
                                                   
                                                   
                                                         skel.getDynamicTemplateCount(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getDynamicTemplateCountResponse44, false, new javax.xml.namespace.QName("http://services.templates.mediation.carbon.wso2.org",
                                                    "getDynamicTemplateCount"));
                                    } else 

            if("getTemplatesCount".equals(methodName)){
                
                synapse.apache.org.xsd.GetTemplatesCountResponse getTemplatesCountResponse46 = null;
	                        synapse.apache.org.xsd.GetTemplatesCount wrappedParam =
                                                             (synapse.apache.org.xsd.GetTemplatesCount)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    synapse.apache.org.xsd.GetTemplatesCount.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getTemplatesCountResponse46 =
                                                   
                                                   
                                                         skel.getTemplatesCount(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getTemplatesCountResponse46, false, new javax.xml.namespace.QName("http://services.templates.mediation.carbon.wso2.org",
                                                    "getTemplatesCount"));
                                    
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
            private  org.apache.axiom.om.OMElement  toOM(synapse.apache.org.xsd.SaveDynamicTemplate param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(synapse.apache.org.xsd.SaveDynamicTemplate.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(synapse.apache.org.xsd.DisableTracing param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(synapse.apache.org.xsd.DisableTracing.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(synapse.apache.org.xsd.DisableTracingResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(synapse.apache.org.xsd.DisableTracingResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(synapse.apache.org.xsd.GetDynamicTemplate param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(synapse.apache.org.xsd.GetDynamicTemplate.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(synapse.apache.org.xsd.GetDynamicTemplateResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(synapse.apache.org.xsd.GetDynamicTemplateResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(synapse.apache.org.xsd.DeleteTemplate param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(synapse.apache.org.xsd.DeleteTemplate.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(synapse.apache.org.xsd.AddTemplate param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(synapse.apache.org.xsd.AddTemplate.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(synapse.apache.org.xsd.DisableStatistics param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(synapse.apache.org.xsd.DisableStatistics.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(synapse.apache.org.xsd.DisableStatisticsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(synapse.apache.org.xsd.DisableStatisticsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(synapse.apache.org.xsd.GetDynamicTemplates param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(synapse.apache.org.xsd.GetDynamicTemplates.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(synapse.apache.org.xsd.GetDynamicTemplatesResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(synapse.apache.org.xsd.GetDynamicTemplatesResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(synapse.apache.org.xsd.AddDynamicTemplate param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(synapse.apache.org.xsd.AddDynamicTemplate.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(synapse.apache.org.xsd.GetTemplates param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(synapse.apache.org.xsd.GetTemplates.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(synapse.apache.org.xsd.GetTemplatesResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(synapse.apache.org.xsd.GetTemplatesResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(synapse.apache.org.xsd.EnableStatistics param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(synapse.apache.org.xsd.EnableStatistics.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(synapse.apache.org.xsd.EnableStatisticsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(synapse.apache.org.xsd.EnableStatisticsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(synapse.apache.org.xsd.DeleteDynamicTemplate param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(synapse.apache.org.xsd.DeleteDynamicTemplate.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(synapse.apache.org.xsd.SaveTemplate param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(synapse.apache.org.xsd.SaveTemplate.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(synapse.apache.org.xsd.GetTemplate param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(synapse.apache.org.xsd.GetTemplate.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(synapse.apache.org.xsd.GetTemplateResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(synapse.apache.org.xsd.GetTemplateResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(synapse.apache.org.xsd.EnableTracing param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(synapse.apache.org.xsd.EnableTracing.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(synapse.apache.org.xsd.EnableTracingResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(synapse.apache.org.xsd.EnableTracingResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(synapse.apache.org.xsd.GetDynamicTemplateCount param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(synapse.apache.org.xsd.GetDynamicTemplateCount.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(synapse.apache.org.xsd.GetDynamicTemplateCountResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(synapse.apache.org.xsd.GetDynamicTemplateCountResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(synapse.apache.org.xsd.GetTemplatesCount param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(synapse.apache.org.xsd.GetTemplatesCount.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(synapse.apache.org.xsd.GetTemplatesCountResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(synapse.apache.org.xsd.GetTemplatesCountResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(synapse.apache.org.xsd.UpdateDynamicTemplate param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(synapse.apache.org.xsd.UpdateDynamicTemplate.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, synapse.apache.org.xsd.DisableTracingResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(synapse.apache.org.xsd.DisableTracingResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private synapse.apache.org.xsd.DisableTracingResponse wrapdisableTracing(){
                                synapse.apache.org.xsd.DisableTracingResponse wrappedElement = new synapse.apache.org.xsd.DisableTracingResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, synapse.apache.org.xsd.GetDynamicTemplateResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(synapse.apache.org.xsd.GetDynamicTemplateResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private synapse.apache.org.xsd.GetDynamicTemplateResponse wrapgetDynamicTemplate(){
                                synapse.apache.org.xsd.GetDynamicTemplateResponse wrappedElement = new synapse.apache.org.xsd.GetDynamicTemplateResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, synapse.apache.org.xsd.DisableStatisticsResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(synapse.apache.org.xsd.DisableStatisticsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private synapse.apache.org.xsd.DisableStatisticsResponse wrapdisableStatistics(){
                                synapse.apache.org.xsd.DisableStatisticsResponse wrappedElement = new synapse.apache.org.xsd.DisableStatisticsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, synapse.apache.org.xsd.GetDynamicTemplatesResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(synapse.apache.org.xsd.GetDynamicTemplatesResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private synapse.apache.org.xsd.GetDynamicTemplatesResponse wrapgetDynamicTemplates(){
                                synapse.apache.org.xsd.GetDynamicTemplatesResponse wrappedElement = new synapse.apache.org.xsd.GetDynamicTemplatesResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, synapse.apache.org.xsd.GetTemplatesResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(synapse.apache.org.xsd.GetTemplatesResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private synapse.apache.org.xsd.GetTemplatesResponse wrapgetTemplates(){
                                synapse.apache.org.xsd.GetTemplatesResponse wrappedElement = new synapse.apache.org.xsd.GetTemplatesResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, synapse.apache.org.xsd.EnableStatisticsResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(synapse.apache.org.xsd.EnableStatisticsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private synapse.apache.org.xsd.EnableStatisticsResponse wrapenableStatistics(){
                                synapse.apache.org.xsd.EnableStatisticsResponse wrappedElement = new synapse.apache.org.xsd.EnableStatisticsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, synapse.apache.org.xsd.GetTemplateResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(synapse.apache.org.xsd.GetTemplateResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private synapse.apache.org.xsd.GetTemplateResponse wrapgetTemplate(){
                                synapse.apache.org.xsd.GetTemplateResponse wrappedElement = new synapse.apache.org.xsd.GetTemplateResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, synapse.apache.org.xsd.EnableTracingResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(synapse.apache.org.xsd.EnableTracingResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private synapse.apache.org.xsd.EnableTracingResponse wrapenableTracing(){
                                synapse.apache.org.xsd.EnableTracingResponse wrappedElement = new synapse.apache.org.xsd.EnableTracingResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, synapse.apache.org.xsd.GetDynamicTemplateCountResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(synapse.apache.org.xsd.GetDynamicTemplateCountResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private synapse.apache.org.xsd.GetDynamicTemplateCountResponse wrapgetDynamicTemplateCount(){
                                synapse.apache.org.xsd.GetDynamicTemplateCountResponse wrappedElement = new synapse.apache.org.xsd.GetDynamicTemplateCountResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, synapse.apache.org.xsd.GetTemplatesCountResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(synapse.apache.org.xsd.GetTemplatesCountResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private synapse.apache.org.xsd.GetTemplatesCountResponse wrapgetTemplatesCount(){
                                synapse.apache.org.xsd.GetTemplatesCountResponse wrappedElement = new synapse.apache.org.xsd.GetTemplatesCountResponse();
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
        
                if (synapse.apache.org.xsd.SaveDynamicTemplate.class.equals(type)){
                
                           return synapse.apache.org.xsd.SaveDynamicTemplate.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.DisableTracing.class.equals(type)){
                
                           return synapse.apache.org.xsd.DisableTracing.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.DisableTracingResponse.class.equals(type)){
                
                           return synapse.apache.org.xsd.DisableTracingResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.GetDynamicTemplate.class.equals(type)){
                
                           return synapse.apache.org.xsd.GetDynamicTemplate.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.GetDynamicTemplateResponse.class.equals(type)){
                
                           return synapse.apache.org.xsd.GetDynamicTemplateResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.DeleteTemplate.class.equals(type)){
                
                           return synapse.apache.org.xsd.DeleteTemplate.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.AddTemplate.class.equals(type)){
                
                           return synapse.apache.org.xsd.AddTemplate.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.DisableStatistics.class.equals(type)){
                
                           return synapse.apache.org.xsd.DisableStatistics.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.DisableStatisticsResponse.class.equals(type)){
                
                           return synapse.apache.org.xsd.DisableStatisticsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.GetDynamicTemplates.class.equals(type)){
                
                           return synapse.apache.org.xsd.GetDynamicTemplates.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.GetDynamicTemplatesResponse.class.equals(type)){
                
                           return synapse.apache.org.xsd.GetDynamicTemplatesResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.AddDynamicTemplate.class.equals(type)){
                
                           return synapse.apache.org.xsd.AddDynamicTemplate.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.GetTemplates.class.equals(type)){
                
                           return synapse.apache.org.xsd.GetTemplates.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.GetTemplatesResponse.class.equals(type)){
                
                           return synapse.apache.org.xsd.GetTemplatesResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.EnableStatistics.class.equals(type)){
                
                           return synapse.apache.org.xsd.EnableStatistics.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.EnableStatisticsResponse.class.equals(type)){
                
                           return synapse.apache.org.xsd.EnableStatisticsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.DeleteDynamicTemplate.class.equals(type)){
                
                           return synapse.apache.org.xsd.DeleteDynamicTemplate.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.SaveTemplate.class.equals(type)){
                
                           return synapse.apache.org.xsd.SaveTemplate.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.GetTemplate.class.equals(type)){
                
                           return synapse.apache.org.xsd.GetTemplate.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.GetTemplateResponse.class.equals(type)){
                
                           return synapse.apache.org.xsd.GetTemplateResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.EnableTracing.class.equals(type)){
                
                           return synapse.apache.org.xsd.EnableTracing.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.EnableTracingResponse.class.equals(type)){
                
                           return synapse.apache.org.xsd.EnableTracingResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.GetDynamicTemplateCount.class.equals(type)){
                
                           return synapse.apache.org.xsd.GetDynamicTemplateCount.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.GetDynamicTemplateCountResponse.class.equals(type)){
                
                           return synapse.apache.org.xsd.GetDynamicTemplateCountResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.GetTemplatesCount.class.equals(type)){
                
                           return synapse.apache.org.xsd.GetTemplatesCount.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.GetTemplatesCountResponse.class.equals(type)){
                
                           return synapse.apache.org.xsd.GetTemplatesCountResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.UpdateDynamicTemplate.class.equals(type)){
                
                           return synapse.apache.org.xsd.UpdateDynamicTemplate.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

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
    
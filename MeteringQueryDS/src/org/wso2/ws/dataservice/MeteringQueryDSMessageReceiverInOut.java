
/**
 * MeteringQueryDSMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */
        package org.wso2.ws.dataservice;

        /**
        *  MeteringQueryDSMessageReceiverInOut message receiver
        */

        public class MeteringQueryDSMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        MeteringQueryDSSkeletonInterface skel = (MeteringQueryDSSkeletonInterface)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){


        

            if("getRegistryBandwidthUsageStats".equals(methodName)){
                
                org.wso2.carbon.bam.RegBandwidthStatsE regBandwidthStats18 = null;
	                        org.wso2.carbon.bam.GetRegistryBandwidthUsageStats wrappedParam =
                                                             (org.wso2.carbon.bam.GetRegistryBandwidthUsageStats)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetRegistryBandwidthUsageStats.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               regBandwidthStats18 =
                                                   
                                                   
                                                         skel.getRegistryBandwidthUsageStats(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), regBandwidthStats18, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getRegistryBandwidthUsageStats"));
                                    } else 

            if("getHourlyServiceRequestStats".equals(methodName)){
                
                org.wso2.carbon.bam.ServiceRequestStatsE serviceRequestStats20 = null;
	                        org.wso2.carbon.bam.GetHourlyServiceRequestStats wrappedParam =
                                                             (org.wso2.carbon.bam.GetHourlyServiceRequestStats)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetHourlyServiceRequestStats.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               serviceRequestStats20 =
                                                   
                                                   
                                                         skel.getHourlyServiceRequestStats(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), serviceRequestStats20, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getHourlyServiceRequestStats"));
                                    } else 

            if("getDailyRegistryBandwidthUsageStats".equals(methodName)){
                
                org.wso2.carbon.bam.RegBandwidthStatsE regBandwidthStats22 = null;
	                        org.wso2.carbon.bam.GetDailyRegistryBandwidthUsageStats wrappedParam =
                                                             (org.wso2.carbon.bam.GetDailyRegistryBandwidthUsageStats)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetDailyRegistryBandwidthUsageStats.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               regBandwidthStats22 =
                                                   
                                                   
                                                         skel.getDailyRegistryBandwidthUsageStats(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), regBandwidthStats22, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getDailyRegistryBandwidthUsageStats"));
                                    } else 

            if("getHourlyBandwidthStats".equals(methodName)){
                
                org.wso2.carbon.bam.BandwidthStatsE bandwidthStats24 = null;
	                        org.wso2.carbon.bam.GetHourlyBandwidthStats wrappedParam =
                                                             (org.wso2.carbon.bam.GetHourlyBandwidthStats)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetHourlyBandwidthStats.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               bandwidthStats24 =
                                                   
                                                   
                                                         skel.getHourlyBandwidthStats(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), bandwidthStats24, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getHourlyBandwidthStats"));
                                    } else 

            if("getInstanceUsageStats".equals(methodName)){
                
                org.wso2.carbon.bam.InstanceUsageStatsE instanceUsageStats26 = null;
	                        org.wso2.carbon.bam.GetInstanceUsageStats wrappedParam =
                                                             (org.wso2.carbon.bam.GetInstanceUsageStats)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetInstanceUsageStats.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               instanceUsageStats26 =
                                                   
                                                   
                                                         skel.getInstanceUsageStats(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), instanceUsageStats26, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getInstanceUsageStats"));
                                    } else 

            if("getBandwidthStats".equals(methodName)){
                
                org.wso2.carbon.bam.BandwidthStatsE bandwidthStats28 = null;
	                        org.wso2.carbon.bam.GetBandwidthStats wrappedParam =
                                                             (org.wso2.carbon.bam.GetBandwidthStats)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetBandwidthStats.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               bandwidthStats28 =
                                                   
                                                   
                                                         skel.getBandwidthStats(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), bandwidthStats28, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getBandwidthStats"));
                                    } else 

            if("getServiceRequestStats".equals(methodName)){
                
                org.wso2.carbon.bam.ServiceRequestStatsE serviceRequestStats30 = null;
	                        org.wso2.carbon.bam.GetServiceRequestStats wrappedParam =
                                                             (org.wso2.carbon.bam.GetServiceRequestStats)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetServiceRequestStats.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               serviceRequestStats30 =
                                                   
                                                   
                                                         skel.getServiceRequestStats(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), serviceRequestStats30, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getServiceRequestStats"));
                                    
            } else {
              throw new java.lang.RuntimeException("method not found");
            }
        

        newMsgContext.setEnvelope(envelope);
        }
        } catch (DataServiceFaultException e) {

            msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME,"DataServiceFault");
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
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetRegistryBandwidthUsageStats param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetRegistryBandwidthUsageStats.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.RegBandwidthStatsE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.RegBandwidthStatsE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.ws.dataservice.DataServiceFault param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.ws.dataservice.DataServiceFault.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetHourlyServiceRequestStats param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetHourlyServiceRequestStats.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.ServiceRequestStatsE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.ServiceRequestStatsE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetDailyRegistryBandwidthUsageStats param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetDailyRegistryBandwidthUsageStats.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetHourlyBandwidthStats param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetHourlyBandwidthStats.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.BandwidthStatsE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.BandwidthStatsE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetInstanceUsageStats param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetInstanceUsageStats.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.InstanceUsageStatsE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.InstanceUsageStatsE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetBandwidthStats param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetBandwidthStats.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetServiceRequestStats param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetServiceRequestStats.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.bam.RegBandwidthStatsE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.bam.RegBandwidthStatsE.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.bam.RegBandwidthStatsE wrapgetRegistryBandwidthUsageStats(){
                                org.wso2.carbon.bam.RegBandwidthStatsE wrappedElement = new org.wso2.carbon.bam.RegBandwidthStatsE();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.bam.ServiceRequestStatsE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.bam.ServiceRequestStatsE.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.bam.ServiceRequestStatsE wrapgetHourlyServiceRequestStats(){
                                org.wso2.carbon.bam.ServiceRequestStatsE wrappedElement = new org.wso2.carbon.bam.ServiceRequestStatsE();
                                return wrappedElement;
                         }
                    
                         private org.wso2.carbon.bam.RegBandwidthStatsE wrapgetDailyRegistryBandwidthUsageStats(){
                                org.wso2.carbon.bam.RegBandwidthStatsE wrappedElement = new org.wso2.carbon.bam.RegBandwidthStatsE();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.bam.BandwidthStatsE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.bam.BandwidthStatsE.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.bam.BandwidthStatsE wrapgetHourlyBandwidthStats(){
                                org.wso2.carbon.bam.BandwidthStatsE wrappedElement = new org.wso2.carbon.bam.BandwidthStatsE();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.bam.InstanceUsageStatsE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.bam.InstanceUsageStatsE.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.bam.InstanceUsageStatsE wrapgetInstanceUsageStats(){
                                org.wso2.carbon.bam.InstanceUsageStatsE wrappedElement = new org.wso2.carbon.bam.InstanceUsageStatsE();
                                return wrappedElement;
                         }
                    
                         private org.wso2.carbon.bam.BandwidthStatsE wrapgetBandwidthStats(){
                                org.wso2.carbon.bam.BandwidthStatsE wrappedElement = new org.wso2.carbon.bam.BandwidthStatsE();
                                return wrappedElement;
                         }
                    
                         private org.wso2.carbon.bam.ServiceRequestStatsE wrapgetServiceRequestStats(){
                                org.wso2.carbon.bam.ServiceRequestStatsE wrappedElement = new org.wso2.carbon.bam.ServiceRequestStatsE();
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
        
                if (org.wso2.carbon.bam.GetRegistryBandwidthUsageStats.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetRegistryBandwidthUsageStats.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.RegBandwidthStatsE.class.equals(type)){
                
                           return org.wso2.carbon.bam.RegBandwidthStatsE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetHourlyServiceRequestStats.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetHourlyServiceRequestStats.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.ServiceRequestStatsE.class.equals(type)){
                
                           return org.wso2.carbon.bam.ServiceRequestStatsE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetDailyRegistryBandwidthUsageStats.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetDailyRegistryBandwidthUsageStats.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.RegBandwidthStatsE.class.equals(type)){
                
                           return org.wso2.carbon.bam.RegBandwidthStatsE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetHourlyBandwidthStats.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetHourlyBandwidthStats.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.BandwidthStatsE.class.equals(type)){
                
                           return org.wso2.carbon.bam.BandwidthStatsE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetInstanceUsageStats.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetInstanceUsageStats.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.InstanceUsageStatsE.class.equals(type)){
                
                           return org.wso2.carbon.bam.InstanceUsageStatsE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetBandwidthStats.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetBandwidthStats.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.BandwidthStatsE.class.equals(type)){
                
                           return org.wso2.carbon.bam.BandwidthStatsE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetServiceRequestStats.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetServiceRequestStats.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.ServiceRequestStatsE.class.equals(type)){
                
                           return org.wso2.carbon.bam.ServiceRequestStatsE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

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
    
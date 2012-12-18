
/**
 * BAMServerUserDataQueryDSMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */
        package org.wso2.ws.dataservice;

        /**
        *  BAMServerUserDataQueryDSMessageReceiverInOut message receiver
        */

        public class BAMServerUserDataQueryDSMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        BAMServerUserDataQueryDSSkeletonInterface skel = (BAMServerUserDataQueryDSSkeletonInterface)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){


        

            if("queryServerUserDataWithThreeANDedConditionsForServer".equals(methodName)){
                
                org.wso2.carbon.bam.ValuesE values30 = null;
	                        org.wso2.carbon.bam.QueryServerUserDataWithThreeANDedConditionsForServer wrappedParam =
                                                             (org.wso2.carbon.bam.QueryServerUserDataWithThreeANDedConditionsForServer)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.QueryServerUserDataWithThreeANDedConditionsForServer.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               values30 =
                                                   
                                                   
                                                         skel.queryServerUserDataWithThreeANDedConditionsForServer(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), values30, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "queryServerUserDataWithThreeANDedConditionsForServer"));
                                    } else 

            if("queryServerUserDataWithOneConditionForServerDistinct".equals(methodName)){
                
                org.wso2.carbon.bam.ValuesE values32 = null;
	                        org.wso2.carbon.bam.QueryServerUserDataWithOneConditionForServerDistinct wrappedParam =
                                                             (org.wso2.carbon.bam.QueryServerUserDataWithOneConditionForServerDistinct)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.QueryServerUserDataWithOneConditionForServerDistinct.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               values32 =
                                                   
                                                   
                                                         skel.queryServerUserDataWithOneConditionForServerDistinct(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), values32, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "queryServerUserDataWithOneConditionForServerDistinct"));
                                    } else 

            if("queryServerUserDataWithThreeORedConditionsForServerDistinct".equals(methodName)){
                
                org.wso2.carbon.bam.ValuesE values34 = null;
	                        org.wso2.carbon.bam.QueryServerUserDataWithThreeORedConditionsForServerDistinct wrappedParam =
                                                             (org.wso2.carbon.bam.QueryServerUserDataWithThreeORedConditionsForServerDistinct)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.QueryServerUserDataWithThreeORedConditionsForServerDistinct.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               values34 =
                                                   
                                                   
                                                         skel.queryServerUserDataWithThreeORedConditionsForServerDistinct(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), values34, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "queryServerUserDataWithThreeORedConditionsForServerDistinct"));
                                    } else 

            if("queryServerUserDataWithTwoANDedConditionsForServer".equals(methodName)){
                
                org.wso2.carbon.bam.ValuesE values36 = null;
	                        org.wso2.carbon.bam.QueryServerUserDataWithTwoANDedConditionsForServer wrappedParam =
                                                             (org.wso2.carbon.bam.QueryServerUserDataWithTwoANDedConditionsForServer)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.QueryServerUserDataWithTwoANDedConditionsForServer.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               values36 =
                                                   
                                                   
                                                         skel.queryServerUserDataWithTwoANDedConditionsForServer(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), values36, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "queryServerUserDataWithTwoANDedConditionsForServer"));
                                    } else 

            if("queryServerUserDataWithThreeORedConditionsForServer".equals(methodName)){
                
                org.wso2.carbon.bam.ValuesE values38 = null;
	                        org.wso2.carbon.bam.QueryServerUserDataWithThreeORedConditionsForServer wrappedParam =
                                                             (org.wso2.carbon.bam.QueryServerUserDataWithThreeORedConditionsForServer)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.QueryServerUserDataWithThreeORedConditionsForServer.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               values38 =
                                                   
                                                   
                                                         skel.queryServerUserDataWithThreeORedConditionsForServer(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), values38, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "queryServerUserDataWithThreeORedConditionsForServer"));
                                    } else 

            if("queryServerUserDataWithOneConditionForServer".equals(methodName)){
                
                org.wso2.carbon.bam.ValuesE values40 = null;
	                        org.wso2.carbon.bam.QueryServerUserDataWithOneConditionForServer wrappedParam =
                                                             (org.wso2.carbon.bam.QueryServerUserDataWithOneConditionForServer)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.QueryServerUserDataWithOneConditionForServer.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               values40 =
                                                   
                                                   
                                                         skel.queryServerUserDataWithOneConditionForServer(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), values40, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "queryServerUserDataWithOneConditionForServer"));
                                    } else 

            if("queryServerUserDataWithTwoANDedConditionsForServerDistinct".equals(methodName)){
                
                org.wso2.carbon.bam.ValuesE values42 = null;
	                        org.wso2.carbon.bam.QueryServerUserDataWithTwoANDedConditionsForServerDistinct wrappedParam =
                                                             (org.wso2.carbon.bam.QueryServerUserDataWithTwoANDedConditionsForServerDistinct)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.QueryServerUserDataWithTwoANDedConditionsForServerDistinct.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               values42 =
                                                   
                                                   
                                                         skel.queryServerUserDataWithTwoANDedConditionsForServerDistinct(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), values42, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "queryServerUserDataWithTwoANDedConditionsForServerDistinct"));
                                    } else 

            if("queryServerUserDataWithTwoORedConditionsForServerDistinct".equals(methodName)){
                
                org.wso2.carbon.bam.ValuesE values44 = null;
	                        org.wso2.carbon.bam.QueryServerUserDataWithTwoORedConditionsForServerDistinct wrappedParam =
                                                             (org.wso2.carbon.bam.QueryServerUserDataWithTwoORedConditionsForServerDistinct)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.QueryServerUserDataWithTwoORedConditionsForServerDistinct.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               values44 =
                                                   
                                                   
                                                         skel.queryServerUserDataWithTwoORedConditionsForServerDistinct(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), values44, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "queryServerUserDataWithTwoORedConditionsForServerDistinct"));
                                    } else 

            if("queryServerUserDataWithTwoORedConditionsForServer".equals(methodName)){
                
                org.wso2.carbon.bam.ValuesE values46 = null;
	                        org.wso2.carbon.bam.QueryServerUserDataWithTwoORedConditionsForServer wrappedParam =
                                                             (org.wso2.carbon.bam.QueryServerUserDataWithTwoORedConditionsForServer)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.QueryServerUserDataWithTwoORedConditionsForServer.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               values46 =
                                                   
                                                   
                                                         skel.queryServerUserDataWithTwoORedConditionsForServer(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), values46, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "queryServerUserDataWithTwoORedConditionsForServer"));
                                    } else 

            if("queryServerUserDataWithThreeANDedConditionsForServerDistinct".equals(methodName)){
                
                org.wso2.carbon.bam.ValuesE values48 = null;
	                        org.wso2.carbon.bam.QueryServerUserDataWithThreeANDedConditionsForServerDistinct wrappedParam =
                                                             (org.wso2.carbon.bam.QueryServerUserDataWithThreeANDedConditionsForServerDistinct)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.QueryServerUserDataWithThreeANDedConditionsForServerDistinct.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               values48 =
                                                   
                                                   
                                                         skel.queryServerUserDataWithThreeANDedConditionsForServerDistinct(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), values48, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "queryServerUserDataWithThreeANDedConditionsForServerDistinct"));
                                    
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
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.QueryServerUserDataWithThreeANDedConditionsForServer param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.QueryServerUserDataWithThreeANDedConditionsForServer.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.ValuesE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.ValuesE.MY_QNAME,
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
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.QueryServerUserDataWithOneConditionForServerDistinct param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.QueryServerUserDataWithOneConditionForServerDistinct.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.QueryServerUserDataWithThreeORedConditionsForServerDistinct param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.QueryServerUserDataWithThreeORedConditionsForServerDistinct.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.QueryServerUserDataWithTwoANDedConditionsForServer param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.QueryServerUserDataWithTwoANDedConditionsForServer.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.QueryServerUserDataWithThreeORedConditionsForServer param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.QueryServerUserDataWithThreeORedConditionsForServer.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.QueryServerUserDataWithOneConditionForServer param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.QueryServerUserDataWithOneConditionForServer.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.QueryServerUserDataWithTwoANDedConditionsForServerDistinct param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.QueryServerUserDataWithTwoANDedConditionsForServerDistinct.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.QueryServerUserDataWithTwoORedConditionsForServerDistinct param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.QueryServerUserDataWithTwoORedConditionsForServerDistinct.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.QueryServerUserDataWithTwoORedConditionsForServer param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.QueryServerUserDataWithTwoORedConditionsForServer.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.QueryServerUserDataWithThreeANDedConditionsForServerDistinct param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.QueryServerUserDataWithThreeANDedConditionsForServerDistinct.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.bam.ValuesE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.bam.ValuesE.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.bam.ValuesE wrapqueryServerUserDataWithThreeANDedConditionsForServer(){
                                org.wso2.carbon.bam.ValuesE wrappedElement = new org.wso2.carbon.bam.ValuesE();
                                return wrappedElement;
                         }
                    
                         private org.wso2.carbon.bam.ValuesE wrapqueryServerUserDataWithOneConditionForServerDistinct(){
                                org.wso2.carbon.bam.ValuesE wrappedElement = new org.wso2.carbon.bam.ValuesE();
                                return wrappedElement;
                         }
                    
                         private org.wso2.carbon.bam.ValuesE wrapqueryServerUserDataWithThreeORedConditionsForServerDistinct(){
                                org.wso2.carbon.bam.ValuesE wrappedElement = new org.wso2.carbon.bam.ValuesE();
                                return wrappedElement;
                         }
                    
                         private org.wso2.carbon.bam.ValuesE wrapqueryServerUserDataWithTwoANDedConditionsForServer(){
                                org.wso2.carbon.bam.ValuesE wrappedElement = new org.wso2.carbon.bam.ValuesE();
                                return wrappedElement;
                         }
                    
                         private org.wso2.carbon.bam.ValuesE wrapqueryServerUserDataWithThreeORedConditionsForServer(){
                                org.wso2.carbon.bam.ValuesE wrappedElement = new org.wso2.carbon.bam.ValuesE();
                                return wrappedElement;
                         }
                    
                         private org.wso2.carbon.bam.ValuesE wrapqueryServerUserDataWithOneConditionForServer(){
                                org.wso2.carbon.bam.ValuesE wrappedElement = new org.wso2.carbon.bam.ValuesE();
                                return wrappedElement;
                         }
                    
                         private org.wso2.carbon.bam.ValuesE wrapqueryServerUserDataWithTwoANDedConditionsForServerDistinct(){
                                org.wso2.carbon.bam.ValuesE wrappedElement = new org.wso2.carbon.bam.ValuesE();
                                return wrappedElement;
                         }
                    
                         private org.wso2.carbon.bam.ValuesE wrapqueryServerUserDataWithTwoORedConditionsForServerDistinct(){
                                org.wso2.carbon.bam.ValuesE wrappedElement = new org.wso2.carbon.bam.ValuesE();
                                return wrappedElement;
                         }
                    
                         private org.wso2.carbon.bam.ValuesE wrapqueryServerUserDataWithTwoORedConditionsForServer(){
                                org.wso2.carbon.bam.ValuesE wrappedElement = new org.wso2.carbon.bam.ValuesE();
                                return wrappedElement;
                         }
                    
                         private org.wso2.carbon.bam.ValuesE wrapqueryServerUserDataWithThreeANDedConditionsForServerDistinct(){
                                org.wso2.carbon.bam.ValuesE wrappedElement = new org.wso2.carbon.bam.ValuesE();
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
        
                if (org.wso2.carbon.bam.QueryServerUserDataWithThreeANDedConditionsForServer.class.equals(type)){
                
                           return org.wso2.carbon.bam.QueryServerUserDataWithThreeANDedConditionsForServer.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.ValuesE.class.equals(type)){
                
                           return org.wso2.carbon.bam.ValuesE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.QueryServerUserDataWithOneConditionForServerDistinct.class.equals(type)){
                
                           return org.wso2.carbon.bam.QueryServerUserDataWithOneConditionForServerDistinct.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.ValuesE.class.equals(type)){
                
                           return org.wso2.carbon.bam.ValuesE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.QueryServerUserDataWithThreeORedConditionsForServerDistinct.class.equals(type)){
                
                           return org.wso2.carbon.bam.QueryServerUserDataWithThreeORedConditionsForServerDistinct.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.ValuesE.class.equals(type)){
                
                           return org.wso2.carbon.bam.ValuesE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.QueryServerUserDataWithTwoANDedConditionsForServer.class.equals(type)){
                
                           return org.wso2.carbon.bam.QueryServerUserDataWithTwoANDedConditionsForServer.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.ValuesE.class.equals(type)){
                
                           return org.wso2.carbon.bam.ValuesE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.QueryServerUserDataWithThreeORedConditionsForServer.class.equals(type)){
                
                           return org.wso2.carbon.bam.QueryServerUserDataWithThreeORedConditionsForServer.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.ValuesE.class.equals(type)){
                
                           return org.wso2.carbon.bam.ValuesE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.QueryServerUserDataWithOneConditionForServer.class.equals(type)){
                
                           return org.wso2.carbon.bam.QueryServerUserDataWithOneConditionForServer.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.ValuesE.class.equals(type)){
                
                           return org.wso2.carbon.bam.ValuesE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.QueryServerUserDataWithTwoANDedConditionsForServerDistinct.class.equals(type)){
                
                           return org.wso2.carbon.bam.QueryServerUserDataWithTwoANDedConditionsForServerDistinct.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.ValuesE.class.equals(type)){
                
                           return org.wso2.carbon.bam.ValuesE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.QueryServerUserDataWithTwoORedConditionsForServerDistinct.class.equals(type)){
                
                           return org.wso2.carbon.bam.QueryServerUserDataWithTwoORedConditionsForServerDistinct.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.ValuesE.class.equals(type)){
                
                           return org.wso2.carbon.bam.ValuesE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.QueryServerUserDataWithTwoORedConditionsForServer.class.equals(type)){
                
                           return org.wso2.carbon.bam.QueryServerUserDataWithTwoORedConditionsForServer.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.ValuesE.class.equals(type)){
                
                           return org.wso2.carbon.bam.ValuesE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.QueryServerUserDataWithThreeANDedConditionsForServerDistinct.class.equals(type)){
                
                           return org.wso2.carbon.bam.QueryServerUserDataWithThreeANDedConditionsForServerDistinct.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.ValuesE.class.equals(type)){
                
                           return org.wso2.carbon.bam.ValuesE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

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
    

/**
 * LocalEntryAdminMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */
        package org.wso2.carbon.localentry.service;

        /**
        *  LocalEntryAdminMessageReceiverInOut message receiver
        */

        public class LocalEntryAdminMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        LocalEntryAdminSkeletonInterface skel = (LocalEntryAdminSkeletonInterface)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){


        

            if("paginatedEntryData".equals(methodName)){
                
                axis2.apache.org.xsd.PaginatedEntryDataResponse paginatedEntryDataResponse21 = null;
	                        axis2.apache.org.xsd.PaginatedEntryData wrappedParam =
                                                             (axis2.apache.org.xsd.PaginatedEntryData)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    axis2.apache.org.xsd.PaginatedEntryData.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               paginatedEntryDataResponse21 =
                                                   
                                                   
                                                         skel.paginatedEntryData(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), paginatedEntryDataResponse21, false, new javax.xml.namespace.QName("http://service.localentry.carbon.wso2.org",
                                                    "paginatedEntryData"));
                                    } else 

            if("getEntryNamesString".equals(methodName)){
                
                axis2.apache.org.xsd.GetEntryNamesStringResponse getEntryNamesStringResponse23 = null;
	                        axis2.apache.org.xsd.GetEntryNamesString wrappedParam =
                                                             (axis2.apache.org.xsd.GetEntryNamesString)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    axis2.apache.org.xsd.GetEntryNamesString.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getEntryNamesStringResponse23 =
                                                   
                                                   
                                                         skel.getEntryNamesString(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getEntryNamesStringResponse23, false, new javax.xml.namespace.QName("http://service.localentry.carbon.wso2.org",
                                                    "getEntryNamesString"));
                                    } else 

            if("getEntryNames".equals(methodName)){
                
                axis2.apache.org.xsd.GetEntryNamesResponse getEntryNamesResponse25 = null;
	                        axis2.apache.org.xsd.GetEntryNames wrappedParam =
                                                             (axis2.apache.org.xsd.GetEntryNames)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    axis2.apache.org.xsd.GetEntryNames.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getEntryNamesResponse25 =
                                                   
                                                   
                                                         skel.getEntryNames(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getEntryNamesResponse25, false, new javax.xml.namespace.QName("http://service.localentry.carbon.wso2.org",
                                                    "getEntryNames"));
                                    } else 

            if("addEntry".equals(methodName)){
                
                axis2.apache.org.xsd.AddEntryResponse addEntryResponse27 = null;
	                        axis2.apache.org.xsd.AddEntry wrappedParam =
                                                             (axis2.apache.org.xsd.AddEntry)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    axis2.apache.org.xsd.AddEntry.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               addEntryResponse27 =
                                                   
                                                   
                                                         skel.addEntry(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), addEntryResponse27, false, new javax.xml.namespace.QName("http://service.localentry.carbon.wso2.org",
                                                    "addEntry"));
                                    } else 

            if("getDependents".equals(methodName)){
                
                axis2.apache.org.xsd.GetDependentsResponse getDependentsResponse29 = null;
	                        axis2.apache.org.xsd.GetDependents wrappedParam =
                                                             (axis2.apache.org.xsd.GetDependents)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    axis2.apache.org.xsd.GetDependents.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getDependentsResponse29 =
                                                   
                                                   
                                                         skel.getDependents(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getDependentsResponse29, false, new javax.xml.namespace.QName("http://service.localentry.carbon.wso2.org",
                                                    "getDependents"));
                                    } else 

            if("saveEntry".equals(methodName)){
                
                axis2.apache.org.xsd.SaveEntryResponse saveEntryResponse31 = null;
	                        axis2.apache.org.xsd.SaveEntry wrappedParam =
                                                             (axis2.apache.org.xsd.SaveEntry)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    axis2.apache.org.xsd.SaveEntry.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               saveEntryResponse31 =
                                                   
                                                   
                                                         skel.saveEntry(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), saveEntryResponse31, false, new javax.xml.namespace.QName("http://service.localentry.carbon.wso2.org",
                                                    "saveEntry"));
                                    } else 

            if("entryData".equals(methodName)){
                
                axis2.apache.org.xsd.EntryDataResponse entryDataResponse33 = null;
	                        axis2.apache.org.xsd.EntryDataE wrappedParam =
                                                             (axis2.apache.org.xsd.EntryDataE)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    axis2.apache.org.xsd.EntryDataE.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               entryDataResponse33 =
                                                   
                                                   
                                                         skel.entryData(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), entryDataResponse33, false, new javax.xml.namespace.QName("http://service.localentry.carbon.wso2.org",
                                                    "entryData"));
                                    } else 

            if("getEntry".equals(methodName)){
                
                axis2.apache.org.xsd.GetEntryResponse getEntryResponse35 = null;
	                        axis2.apache.org.xsd.GetEntry wrappedParam =
                                                             (axis2.apache.org.xsd.GetEntry)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    axis2.apache.org.xsd.GetEntry.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getEntryResponse35 =
                                                   
                                                   
                                                         skel.getEntry(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getEntryResponse35, false, new javax.xml.namespace.QName("http://service.localentry.carbon.wso2.org",
                                                    "getEntry"));
                                    } else 

            if("getEntryDataCount".equals(methodName)){
                
                axis2.apache.org.xsd.GetEntryDataCountResponse getEntryDataCountResponse37 = null;
	                        axis2.apache.org.xsd.GetEntryDataCount wrappedParam =
                                                             (axis2.apache.org.xsd.GetEntryDataCount)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    axis2.apache.org.xsd.GetEntryDataCount.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getEntryDataCountResponse37 =
                                                   
                                                   
                                                         skel.getEntryDataCount(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getEntryDataCountResponse37, false, new javax.xml.namespace.QName("http://service.localentry.carbon.wso2.org",
                                                    "getEntryDataCount"));
                                    } else 

            if("deleteEntry".equals(methodName)){
                
                axis2.apache.org.xsd.DeleteEntryResponse deleteEntryResponse39 = null;
	                        axis2.apache.org.xsd.DeleteEntry wrappedParam =
                                                             (axis2.apache.org.xsd.DeleteEntry)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    axis2.apache.org.xsd.DeleteEntry.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               deleteEntryResponse39 =
                                                   
                                                   
                                                         skel.deleteEntry(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), deleteEntryResponse39, false, new javax.xml.namespace.QName("http://service.localentry.carbon.wso2.org",
                                                    "deleteEntry"));
                                    
            } else {
              throw new java.lang.RuntimeException("method not found");
            }
        

        newMsgContext.setEnvelope(envelope);
        }
        } catch (LocalEntryAdminLocalEntryAdminException e) {

            msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME,"LocalEntryAdminLocalEntryAdminException");
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
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.PaginatedEntryData param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.PaginatedEntryData.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.PaginatedEntryDataResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.PaginatedEntryDataResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.LocalEntryAdminLocalEntryAdminException param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.LocalEntryAdminLocalEntryAdminException.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.GetEntryNamesString param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.GetEntryNamesString.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.GetEntryNamesStringResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.GetEntryNamesStringResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.GetEntryNames param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.GetEntryNames.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.GetEntryNamesResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.GetEntryNamesResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.AddEntry param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.AddEntry.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.AddEntryResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.AddEntryResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.GetDependents param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.GetDependents.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.GetDependentsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.GetDependentsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.SaveEntry param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.SaveEntry.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.SaveEntryResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.SaveEntryResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.EntryDataE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.EntryDataE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.EntryDataResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.EntryDataResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.GetEntry param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.GetEntry.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.GetEntryResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.GetEntryResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.GetEntryDataCount param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.GetEntryDataCount.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.GetEntryDataCountResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.GetEntryDataCountResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.DeleteEntry param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.DeleteEntry.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.DeleteEntryResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.DeleteEntryResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, axis2.apache.org.xsd.PaginatedEntryDataResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(axis2.apache.org.xsd.PaginatedEntryDataResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private axis2.apache.org.xsd.PaginatedEntryDataResponse wrappaginatedEntryData(){
                                axis2.apache.org.xsd.PaginatedEntryDataResponse wrappedElement = new axis2.apache.org.xsd.PaginatedEntryDataResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, axis2.apache.org.xsd.GetEntryNamesStringResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(axis2.apache.org.xsd.GetEntryNamesStringResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private axis2.apache.org.xsd.GetEntryNamesStringResponse wrapgetEntryNamesString(){
                                axis2.apache.org.xsd.GetEntryNamesStringResponse wrappedElement = new axis2.apache.org.xsd.GetEntryNamesStringResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, axis2.apache.org.xsd.GetEntryNamesResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(axis2.apache.org.xsd.GetEntryNamesResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private axis2.apache.org.xsd.GetEntryNamesResponse wrapgetEntryNames(){
                                axis2.apache.org.xsd.GetEntryNamesResponse wrappedElement = new axis2.apache.org.xsd.GetEntryNamesResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, axis2.apache.org.xsd.AddEntryResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(axis2.apache.org.xsd.AddEntryResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private axis2.apache.org.xsd.AddEntryResponse wrapaddEntry(){
                                axis2.apache.org.xsd.AddEntryResponse wrappedElement = new axis2.apache.org.xsd.AddEntryResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, axis2.apache.org.xsd.GetDependentsResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(axis2.apache.org.xsd.GetDependentsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private axis2.apache.org.xsd.GetDependentsResponse wrapgetDependents(){
                                axis2.apache.org.xsd.GetDependentsResponse wrappedElement = new axis2.apache.org.xsd.GetDependentsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, axis2.apache.org.xsd.SaveEntryResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(axis2.apache.org.xsd.SaveEntryResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private axis2.apache.org.xsd.SaveEntryResponse wrapsaveEntry(){
                                axis2.apache.org.xsd.SaveEntryResponse wrappedElement = new axis2.apache.org.xsd.SaveEntryResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, axis2.apache.org.xsd.EntryDataResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(axis2.apache.org.xsd.EntryDataResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private axis2.apache.org.xsd.EntryDataResponse wrapentryData(){
                                axis2.apache.org.xsd.EntryDataResponse wrappedElement = new axis2.apache.org.xsd.EntryDataResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, axis2.apache.org.xsd.GetEntryResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(axis2.apache.org.xsd.GetEntryResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private axis2.apache.org.xsd.GetEntryResponse wrapgetEntry(){
                                axis2.apache.org.xsd.GetEntryResponse wrappedElement = new axis2.apache.org.xsd.GetEntryResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, axis2.apache.org.xsd.GetEntryDataCountResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(axis2.apache.org.xsd.GetEntryDataCountResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private axis2.apache.org.xsd.GetEntryDataCountResponse wrapgetEntryDataCount(){
                                axis2.apache.org.xsd.GetEntryDataCountResponse wrappedElement = new axis2.apache.org.xsd.GetEntryDataCountResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, axis2.apache.org.xsd.DeleteEntryResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(axis2.apache.org.xsd.DeleteEntryResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private axis2.apache.org.xsd.DeleteEntryResponse wrapdeleteEntry(){
                                axis2.apache.org.xsd.DeleteEntryResponse wrappedElement = new axis2.apache.org.xsd.DeleteEntryResponse();
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
        
                if (axis2.apache.org.xsd.PaginatedEntryData.class.equals(type)){
                
                           return axis2.apache.org.xsd.PaginatedEntryData.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.PaginatedEntryDataResponse.class.equals(type)){
                
                           return axis2.apache.org.xsd.PaginatedEntryDataResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.LocalEntryAdminLocalEntryAdminException.class.equals(type)){
                
                           return axis2.apache.org.xsd.LocalEntryAdminLocalEntryAdminException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.GetEntryNamesString.class.equals(type)){
                
                           return axis2.apache.org.xsd.GetEntryNamesString.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.GetEntryNamesStringResponse.class.equals(type)){
                
                           return axis2.apache.org.xsd.GetEntryNamesStringResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.LocalEntryAdminLocalEntryAdminException.class.equals(type)){
                
                           return axis2.apache.org.xsd.LocalEntryAdminLocalEntryAdminException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.GetEntryNames.class.equals(type)){
                
                           return axis2.apache.org.xsd.GetEntryNames.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.GetEntryNamesResponse.class.equals(type)){
                
                           return axis2.apache.org.xsd.GetEntryNamesResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.LocalEntryAdminLocalEntryAdminException.class.equals(type)){
                
                           return axis2.apache.org.xsd.LocalEntryAdminLocalEntryAdminException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.AddEntry.class.equals(type)){
                
                           return axis2.apache.org.xsd.AddEntry.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.AddEntryResponse.class.equals(type)){
                
                           return axis2.apache.org.xsd.AddEntryResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.LocalEntryAdminLocalEntryAdminException.class.equals(type)){
                
                           return axis2.apache.org.xsd.LocalEntryAdminLocalEntryAdminException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.GetDependents.class.equals(type)){
                
                           return axis2.apache.org.xsd.GetDependents.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.GetDependentsResponse.class.equals(type)){
                
                           return axis2.apache.org.xsd.GetDependentsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.SaveEntry.class.equals(type)){
                
                           return axis2.apache.org.xsd.SaveEntry.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.SaveEntryResponse.class.equals(type)){
                
                           return axis2.apache.org.xsd.SaveEntryResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.LocalEntryAdminLocalEntryAdminException.class.equals(type)){
                
                           return axis2.apache.org.xsd.LocalEntryAdminLocalEntryAdminException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.EntryDataE.class.equals(type)){
                
                           return axis2.apache.org.xsd.EntryDataE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.EntryDataResponse.class.equals(type)){
                
                           return axis2.apache.org.xsd.EntryDataResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.LocalEntryAdminLocalEntryAdminException.class.equals(type)){
                
                           return axis2.apache.org.xsd.LocalEntryAdminLocalEntryAdminException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.GetEntry.class.equals(type)){
                
                           return axis2.apache.org.xsd.GetEntry.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.GetEntryResponse.class.equals(type)){
                
                           return axis2.apache.org.xsd.GetEntryResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.LocalEntryAdminLocalEntryAdminException.class.equals(type)){
                
                           return axis2.apache.org.xsd.LocalEntryAdminLocalEntryAdminException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.GetEntryDataCount.class.equals(type)){
                
                           return axis2.apache.org.xsd.GetEntryDataCount.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.GetEntryDataCountResponse.class.equals(type)){
                
                           return axis2.apache.org.xsd.GetEntryDataCountResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.LocalEntryAdminLocalEntryAdminException.class.equals(type)){
                
                           return axis2.apache.org.xsd.LocalEntryAdminLocalEntryAdminException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.DeleteEntry.class.equals(type)){
                
                           return axis2.apache.org.xsd.DeleteEntry.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.DeleteEntryResponse.class.equals(type)){
                
                           return axis2.apache.org.xsd.DeleteEntryResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.LocalEntryAdminLocalEntryAdminException.class.equals(type)){
                
                           return axis2.apache.org.xsd.LocalEntryAdminLocalEntryAdminException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

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
    
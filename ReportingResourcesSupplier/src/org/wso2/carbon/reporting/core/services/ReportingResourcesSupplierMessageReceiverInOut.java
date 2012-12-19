
/**
 * ReportingResourcesSupplierMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */
        package org.wso2.carbon.reporting.core.services;

        /**
        *  ReportingResourcesSupplierMessageReceiverInOut message receiver
        */

        public class ReportingResourcesSupplierMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        ReportingResourcesSupplierSkeletonInterface skel = (ReportingResourcesSupplierSkeletonInterface)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){


        

            if("getReportParam".equals(methodName)){
                
                org.wso2.carbon.reporting.core.services.GetReportParamResponse getReportParamResponse10 = null;
	                        org.wso2.carbon.reporting.core.services.GetReportParam wrappedParam =
                                                             (org.wso2.carbon.reporting.core.services.GetReportParam)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.reporting.core.services.GetReportParam.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getReportParamResponse10 =
                                                   
                                                   
                                                         skel.getReportParam(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getReportParamResponse10, false, new javax.xml.namespace.QName("http://services.core.reporting.carbon.wso2.org",
                                                    "getReportParam"));
                                    } else 

            if("updateReport".equals(methodName)){
                
                org.wso2.carbon.reporting.core.services.UpdateReportResponse updateReportResponse12 = null;
	                        org.wso2.carbon.reporting.core.services.UpdateReport wrappedParam =
                                                             (org.wso2.carbon.reporting.core.services.UpdateReport)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.reporting.core.services.UpdateReport.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               updateReportResponse12 =
                                                   
                                                   
                                                         skel.updateReport(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), updateReportResponse12, false, new javax.xml.namespace.QName("http://services.core.reporting.carbon.wso2.org",
                                                    "updateReport"));
                                    } else 

            if("getReportResources".equals(methodName)){
                
                org.wso2.carbon.reporting.core.services.GetReportResourcesResponse getReportResourcesResponse14 = null;
	                        org.wso2.carbon.reporting.core.services.GetReportResources wrappedParam =
                                                             (org.wso2.carbon.reporting.core.services.GetReportResources)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.reporting.core.services.GetReportResources.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getReportResourcesResponse14 =
                                                   
                                                   
                                                         skel.getReportResources(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getReportResourcesResponse14, false, new javax.xml.namespace.QName("http://services.core.reporting.carbon.wso2.org",
                                                    "getReportResources"));
                                    } else 

            if("getAllReports".equals(methodName)){
                
                org.wso2.carbon.reporting.core.services.GetAllReportsResponse getAllReportsResponse16 = null;
	                        org.wso2.carbon.reporting.core.services.GetAllReports wrappedParam =
                                                             (org.wso2.carbon.reporting.core.services.GetAllReports)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.reporting.core.services.GetAllReports.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getAllReportsResponse16 =
                                                   
                                                   
                                                         skel.getAllReports(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getAllReportsResponse16, false, new javax.xml.namespace.QName("http://services.core.reporting.carbon.wso2.org",
                                                    "getAllReports"));
                                    
            } else {
              throw new java.lang.RuntimeException("method not found");
            }
        

        newMsgContext.setEnvelope(envelope);
        }
        } catch (ReportingResourcesSupplierReportingExceptionException e) {

            msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME,"ReportingResourcesSupplierReportingException");
            org.apache.axis2.AxisFault f = createAxisFault(e);
            if (e.getFaultMessage() != null){
                f.setDetail(toOM(e.getFaultMessage(),false));
            }
            throw f;
            }
         catch (ReportingResourcesSupplierJRExceptionException e) {

            msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME,"ReportingResourcesSupplierJRException");
            org.apache.axis2.AxisFault f = createAxisFault(e);
            if (e.getFaultMessage() != null){
                f.setDetail(toOM(e.getFaultMessage(),false));
            }
            throw f;
            }
         catch (ReportingResourcesSupplierXMLStreamExceptionException e) {

            msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME,"ReportingResourcesSupplierXMLStreamException");
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
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.reporting.core.services.DeleteReportTemplate param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.reporting.core.services.DeleteReportTemplate.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.reporting.core.services.ReportingResourcesSupplierReportingException param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.reporting.core.services.ReportingResourcesSupplierReportingException.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.reporting.core.services.GetReportParam param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.reporting.core.services.GetReportParam.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.reporting.core.services.GetReportParamResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.reporting.core.services.GetReportParamResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.reporting.core.services.ReportingResourcesSupplierXMLStreamException param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.reporting.core.services.ReportingResourcesSupplierXMLStreamException.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.reporting.core.services.UpdateReport param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.reporting.core.services.UpdateReport.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.reporting.core.services.UpdateReportResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.reporting.core.services.UpdateReportResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.reporting.core.services.ReportingResourcesSupplierJRException param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.reporting.core.services.ReportingResourcesSupplierJRException.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.reporting.core.services.GetReportResources param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.reporting.core.services.GetReportResources.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.reporting.core.services.GetReportResourcesResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.reporting.core.services.GetReportResourcesResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.reporting.core.services.GetAllReports param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.reporting.core.services.GetAllReports.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.reporting.core.services.GetAllReportsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.reporting.core.services.GetAllReportsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.reporting.core.services.GetReportParamResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.reporting.core.services.GetReportParamResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.reporting.core.services.GetReportParamResponse wrapgetReportParam(){
                                org.wso2.carbon.reporting.core.services.GetReportParamResponse wrappedElement = new org.wso2.carbon.reporting.core.services.GetReportParamResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.reporting.core.services.UpdateReportResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.reporting.core.services.UpdateReportResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.reporting.core.services.UpdateReportResponse wrapupdateReport(){
                                org.wso2.carbon.reporting.core.services.UpdateReportResponse wrappedElement = new org.wso2.carbon.reporting.core.services.UpdateReportResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.reporting.core.services.GetReportResourcesResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.reporting.core.services.GetReportResourcesResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.reporting.core.services.GetReportResourcesResponse wrapgetReportResources(){
                                org.wso2.carbon.reporting.core.services.GetReportResourcesResponse wrappedElement = new org.wso2.carbon.reporting.core.services.GetReportResourcesResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.reporting.core.services.GetAllReportsResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.reporting.core.services.GetAllReportsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.reporting.core.services.GetAllReportsResponse wrapgetAllReports(){
                                org.wso2.carbon.reporting.core.services.GetAllReportsResponse wrappedElement = new org.wso2.carbon.reporting.core.services.GetAllReportsResponse();
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
        
                if (org.wso2.carbon.reporting.core.services.DeleteReportTemplate.class.equals(type)){
                
                           return org.wso2.carbon.reporting.core.services.DeleteReportTemplate.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.reporting.core.services.ReportingResourcesSupplierReportingException.class.equals(type)){
                
                           return org.wso2.carbon.reporting.core.services.ReportingResourcesSupplierReportingException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.reporting.core.services.GetReportParam.class.equals(type)){
                
                           return org.wso2.carbon.reporting.core.services.GetReportParam.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.reporting.core.services.GetReportParamResponse.class.equals(type)){
                
                           return org.wso2.carbon.reporting.core.services.GetReportParamResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.reporting.core.services.ReportingResourcesSupplierReportingException.class.equals(type)){
                
                           return org.wso2.carbon.reporting.core.services.ReportingResourcesSupplierReportingException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.reporting.core.services.ReportingResourcesSupplierXMLStreamException.class.equals(type)){
                
                           return org.wso2.carbon.reporting.core.services.ReportingResourcesSupplierXMLStreamException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.reporting.core.services.UpdateReport.class.equals(type)){
                
                           return org.wso2.carbon.reporting.core.services.UpdateReport.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.reporting.core.services.UpdateReportResponse.class.equals(type)){
                
                           return org.wso2.carbon.reporting.core.services.UpdateReportResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.reporting.core.services.ReportingResourcesSupplierReportingException.class.equals(type)){
                
                           return org.wso2.carbon.reporting.core.services.ReportingResourcesSupplierReportingException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.reporting.core.services.ReportingResourcesSupplierJRException.class.equals(type)){
                
                           return org.wso2.carbon.reporting.core.services.ReportingResourcesSupplierJRException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.reporting.core.services.GetReportResources.class.equals(type)){
                
                           return org.wso2.carbon.reporting.core.services.GetReportResources.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.reporting.core.services.GetReportResourcesResponse.class.equals(type)){
                
                           return org.wso2.carbon.reporting.core.services.GetReportResourcesResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.reporting.core.services.ReportingResourcesSupplierReportingException.class.equals(type)){
                
                           return org.wso2.carbon.reporting.core.services.ReportingResourcesSupplierReportingException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.reporting.core.services.GetAllReports.class.equals(type)){
                
                           return org.wso2.carbon.reporting.core.services.GetAllReports.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.reporting.core.services.GetAllReportsResponse.class.equals(type)){
                
                           return org.wso2.carbon.reporting.core.services.GetAllReportsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.reporting.core.services.ReportingResourcesSupplierReportingException.class.equals(type)){
                
                           return org.wso2.carbon.reporting.core.services.ReportingResourcesSupplierReportingException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

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
    
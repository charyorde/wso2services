
/**
 * DataServiceFileUploaderMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */
        package org.wso2.carbon.dataservices.core.admin;

        /**
        *  DataServiceFileUploaderMessageReceiverInOut message receiver
        */

        public class DataServiceFileUploaderMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        DataServiceFileUploaderSkeletonInterface skel = (DataServiceFileUploaderSkeletonInterface)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){


        

            if("urlWsdlUpload".equals(methodName)){
                
                org.wso2.carbon.dataservices.core.admin.UrlWsdlUploadResponse urlWsdlUploadResponse7 = null;
	                        org.wso2.carbon.dataservices.core.admin.UrlWsdlUpload wrappedParam =
                                                             (org.wso2.carbon.dataservices.core.admin.UrlWsdlUpload)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.dataservices.core.admin.UrlWsdlUpload.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               urlWsdlUploadResponse7 =
                                                   
                                                   
                                                         skel.urlWsdlUpload(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), urlWsdlUploadResponse7, false, new javax.xml.namespace.QName("http://admin.core.dataservices.carbon.wso2.org",
                                                    "urlWsdlUpload"));
                                    } else 

            if("uploadWSDL".equals(methodName)){
                
                org.wso2.carbon.dataservices.core.admin.UploadWSDLResponse uploadWSDLResponse9 = null;
	                        org.wso2.carbon.dataservices.core.admin.UploadWSDL wrappedParam =
                                                             (org.wso2.carbon.dataservices.core.admin.UploadWSDL)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.dataservices.core.admin.UploadWSDL.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               uploadWSDLResponse9 =
                                                   
                                                   
                                                         skel.uploadWSDL(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), uploadWSDLResponse9, false, new javax.xml.namespace.QName("http://admin.core.dataservices.carbon.wso2.org",
                                                    "uploadWSDL"));
                                    } else 

            if("uploadService".equals(methodName)){
                
                org.wso2.carbon.dataservices.core.admin.UploadServiceResponse uploadServiceResponse11 = null;
	                        org.wso2.carbon.dataservices.core.admin.UploadService wrappedParam =
                                                             (org.wso2.carbon.dataservices.core.admin.UploadService)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.dataservices.core.admin.UploadService.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               uploadServiceResponse11 =
                                                   
                                                   
                                                         skel.uploadService(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), uploadServiceResponse11, false, new javax.xml.namespace.QName("http://admin.core.dataservices.carbon.wso2.org",
                                                    "uploadService"));
                                    
            } else {
              throw new java.lang.RuntimeException("method not found");
            }
        

        newMsgContext.setEnvelope(envelope);
        }
        } catch (DataServiceFileUploaderExceptionException e) {

            msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME,"DataServiceFileUploaderException");
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
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.dataservices.core.admin.UrlWsdlUpload param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.dataservices.core.admin.UrlWsdlUpload.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.dataservices.core.admin.UrlWsdlUploadResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.dataservices.core.admin.UrlWsdlUploadResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.dataservices.core.admin.DataServiceFileUploaderException param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.dataservices.core.admin.DataServiceFileUploaderException.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.dataservices.core.admin.UploadWSDL param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.dataservices.core.admin.UploadWSDL.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.dataservices.core.admin.UploadWSDLResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.dataservices.core.admin.UploadWSDLResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.dataservices.core.admin.UploadService param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.dataservices.core.admin.UploadService.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.dataservices.core.admin.UploadServiceResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.dataservices.core.admin.UploadServiceResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.dataservices.core.admin.UrlWsdlUploadResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.dataservices.core.admin.UrlWsdlUploadResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.dataservices.core.admin.UrlWsdlUploadResponse wrapurlWsdlUpload(){
                                org.wso2.carbon.dataservices.core.admin.UrlWsdlUploadResponse wrappedElement = new org.wso2.carbon.dataservices.core.admin.UrlWsdlUploadResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.dataservices.core.admin.UploadWSDLResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.dataservices.core.admin.UploadWSDLResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.dataservices.core.admin.UploadWSDLResponse wrapuploadWSDL(){
                                org.wso2.carbon.dataservices.core.admin.UploadWSDLResponse wrappedElement = new org.wso2.carbon.dataservices.core.admin.UploadWSDLResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.dataservices.core.admin.UploadServiceResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.dataservices.core.admin.UploadServiceResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.dataservices.core.admin.UploadServiceResponse wrapuploadService(){
                                org.wso2.carbon.dataservices.core.admin.UploadServiceResponse wrappedElement = new org.wso2.carbon.dataservices.core.admin.UploadServiceResponse();
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
        
                if (org.wso2.carbon.dataservices.core.admin.UrlWsdlUpload.class.equals(type)){
                
                           return org.wso2.carbon.dataservices.core.admin.UrlWsdlUpload.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.dataservices.core.admin.UrlWsdlUploadResponse.class.equals(type)){
                
                           return org.wso2.carbon.dataservices.core.admin.UrlWsdlUploadResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.dataservices.core.admin.DataServiceFileUploaderException.class.equals(type)){
                
                           return org.wso2.carbon.dataservices.core.admin.DataServiceFileUploaderException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.dataservices.core.admin.UploadWSDL.class.equals(type)){
                
                           return org.wso2.carbon.dataservices.core.admin.UploadWSDL.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.dataservices.core.admin.UploadWSDLResponse.class.equals(type)){
                
                           return org.wso2.carbon.dataservices.core.admin.UploadWSDLResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.dataservices.core.admin.DataServiceFileUploaderException.class.equals(type)){
                
                           return org.wso2.carbon.dataservices.core.admin.DataServiceFileUploaderException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.dataservices.core.admin.UploadService.class.equals(type)){
                
                           return org.wso2.carbon.dataservices.core.admin.UploadService.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.dataservices.core.admin.UploadServiceResponse.class.equals(type)){
                
                           return org.wso2.carbon.dataservices.core.admin.UploadServiceResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.dataservices.core.admin.DataServiceFileUploaderException.class.equals(type)){
                
                           return org.wso2.carbon.dataservices.core.admin.DataServiceFileUploaderException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

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
    
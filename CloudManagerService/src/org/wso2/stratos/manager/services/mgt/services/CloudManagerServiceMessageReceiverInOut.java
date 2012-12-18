
/**
 * CloudManagerServiceMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */
        package org.wso2.stratos.manager.services.mgt.services;

        /**
        *  CloudManagerServiceMessageReceiverInOut message receiver
        */

        public class CloudManagerServiceMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        CloudManagerServiceSkeletonInterface skel = (CloudManagerServiceSkeletonInterface)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){


        

            if("deactivate".equals(methodName)){
                
                org.wso2.stratos.manager.services.mgt.services.Deactivate wrappedParam =
                                                             (org.wso2.stratos.manager.services.mgt.services.Deactivate)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.stratos.manager.services.mgt.services.Deactivate.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               
                                                         skel.deactivate(wrappedParam)
                                                    ;
                                            
                                        envelope = getSOAPFactory(msgContext).getDefaultEnvelope();
                                    } else 

            if("retrieveCloudServiceInfo".equals(methodName)){
                
                org.wso2.stratos.manager.services.mgt.services.RetrieveCloudServiceInfoResponse retrieveCloudServiceInfoResponse14 = null;
	                        org.wso2.stratos.manager.services.mgt.services.RetrieveCloudServiceInfo wrappedParam =
                                                             (org.wso2.stratos.manager.services.mgt.services.RetrieveCloudServiceInfo)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.stratos.manager.services.mgt.services.RetrieveCloudServiceInfo.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               retrieveCloudServiceInfoResponse14 =
                                                   
                                                   
                                                         skel.retrieveCloudServiceInfo(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), retrieveCloudServiceInfoResponse14, false, new javax.xml.namespace.QName("http://services.mgt.services.manager.stratos.wso2.org",
                                                    "retrieveCloudServiceInfo"));
                                    } else 

            if("activate".equals(methodName)){
                
                org.wso2.stratos.manager.services.mgt.services.Activate wrappedParam =
                                                             (org.wso2.stratos.manager.services.mgt.services.Activate)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.stratos.manager.services.mgt.services.Activate.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               
                                                         skel.activate(wrappedParam)
                                                    ;
                                            
                                        envelope = getSOAPFactory(msgContext).getDefaultEnvelope();
                                    } else 

            if("saveCloudServicesActivity".equals(methodName)){
                
                org.wso2.stratos.manager.services.mgt.services.SaveCloudServicesActivity wrappedParam =
                                                             (org.wso2.stratos.manager.services.mgt.services.SaveCloudServicesActivity)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.stratos.manager.services.mgt.services.SaveCloudServicesActivity.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               
                                                         skel.saveCloudServicesActivity(wrappedParam)
                                                    ;
                                            
                                        envelope = getSOAPFactory(msgContext).getDefaultEnvelope();
                                    
            } else {
              throw new java.lang.RuntimeException("method not found");
            }
        

        newMsgContext.setEnvelope(envelope);
        }
        } catch (CloudManagerServiceExceptionException e) {

            msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME,"CloudManagerServiceException");
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
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.stratos.manager.services.mgt.services.Deactivate param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.stratos.manager.services.mgt.services.Deactivate.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.stratos.manager.services.mgt.services.CloudManagerServiceException param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.stratos.manager.services.mgt.services.CloudManagerServiceException.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.stratos.manager.services.mgt.services.RetrieveCloudServiceInfo param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.stratos.manager.services.mgt.services.RetrieveCloudServiceInfo.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.stratos.manager.services.mgt.services.RetrieveCloudServiceInfoResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.stratos.manager.services.mgt.services.RetrieveCloudServiceInfoResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.stratos.manager.services.mgt.services.Activate param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.stratos.manager.services.mgt.services.Activate.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.stratos.manager.services.mgt.services.SaveCloudServicesActivity param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.stratos.manager.services.mgt.services.SaveCloudServicesActivity.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.stratos.manager.services.mgt.services.RetrieveCloudServiceInfoResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.stratos.manager.services.mgt.services.RetrieveCloudServiceInfoResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.stratos.manager.services.mgt.services.RetrieveCloudServiceInfoResponse wrapretrieveCloudServiceInfo(){
                                org.wso2.stratos.manager.services.mgt.services.RetrieveCloudServiceInfoResponse wrappedElement = new org.wso2.stratos.manager.services.mgt.services.RetrieveCloudServiceInfoResponse();
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
        
                if (org.wso2.stratos.manager.services.mgt.services.Deactivate.class.equals(type)){
                
                           return org.wso2.stratos.manager.services.mgt.services.Deactivate.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.stratos.manager.services.mgt.services.CloudManagerServiceException.class.equals(type)){
                
                           return org.wso2.stratos.manager.services.mgt.services.CloudManagerServiceException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.stratos.manager.services.mgt.services.RetrieveCloudServiceInfo.class.equals(type)){
                
                           return org.wso2.stratos.manager.services.mgt.services.RetrieveCloudServiceInfo.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.stratos.manager.services.mgt.services.RetrieveCloudServiceInfoResponse.class.equals(type)){
                
                           return org.wso2.stratos.manager.services.mgt.services.RetrieveCloudServiceInfoResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.stratos.manager.services.mgt.services.CloudManagerServiceException.class.equals(type)){
                
                           return org.wso2.stratos.manager.services.mgt.services.CloudManagerServiceException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.stratos.manager.services.mgt.services.Activate.class.equals(type)){
                
                           return org.wso2.stratos.manager.services.mgt.services.Activate.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.stratos.manager.services.mgt.services.CloudManagerServiceException.class.equals(type)){
                
                           return org.wso2.stratos.manager.services.mgt.services.CloudManagerServiceException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.stratos.manager.services.mgt.services.SaveCloudServicesActivity.class.equals(type)){
                
                           return org.wso2.stratos.manager.services.mgt.services.SaveCloudServicesActivity.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.stratos.manager.services.mgt.services.CloudManagerServiceException.class.equals(type)){
                
                           return org.wso2.stratos.manager.services.mgt.services.CloudManagerServiceException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

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
    
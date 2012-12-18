
/**
 * RemoteProfileConfigurationManagerServiceMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */
        package org.wso2.carbon.um.ws.service;

        /**
        *  RemoteProfileConfigurationManagerServiceMessageReceiverInOut message receiver
        */

        public class RemoteProfileConfigurationManagerServiceMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        RemoteProfileConfigurationManagerServiceSkeletonInterface skel = (RemoteProfileConfigurationManagerServiceSkeletonInterface)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){


        

            if("getProfileConfig".equals(methodName)){
                
                org.wso2.carbon.um.ws.service.GetProfileConfigResponse getProfileConfigResponse8 = null;
	                        org.wso2.carbon.um.ws.service.GetProfileConfig wrappedParam =
                                                             (org.wso2.carbon.um.ws.service.GetProfileConfig)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.um.ws.service.GetProfileConfig.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getProfileConfigResponse8 =
                                                   
                                                   
                                                         skel.getProfileConfig(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getProfileConfigResponse8, false, new javax.xml.namespace.QName("http://service.ws.um.carbon.wso2.org",
                                                    "getProfileConfig"));
                                    } else 

            if("getAllProfiles".equals(methodName)){
                
                org.wso2.carbon.um.ws.service.GetAllProfilesResponse getAllProfilesResponse10 = null;
	                        org.wso2.carbon.um.ws.service.GetAllProfiles wrappedParam =
                                                             (org.wso2.carbon.um.ws.service.GetAllProfiles)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.um.ws.service.GetAllProfiles.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getAllProfilesResponse10 =
                                                   
                                                   
                                                         skel.getAllProfiles(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getAllProfilesResponse10, false, new javax.xml.namespace.QName("http://service.ws.um.carbon.wso2.org",
                                                    "getAllProfiles"));
                                    
            } else {
              throw new java.lang.RuntimeException("method not found");
            }
        

        newMsgContext.setEnvelope(envelope);
        }
        } catch (RemoteProfileConfigurationManagerServiceUserStoreExceptionException e) {

            msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME,"RemoteProfileConfigurationManagerServiceUserStoreException");
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
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.um.ws.service.AddProfileConfig param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.um.ws.service.AddProfileConfig.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.um.ws.service.RemoteProfileConfigurationManagerServiceUserStoreException param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.um.ws.service.RemoteProfileConfigurationManagerServiceUserStoreException.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.um.ws.service.GetProfileConfig param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.um.ws.service.GetProfileConfig.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.um.ws.service.GetProfileConfigResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.um.ws.service.GetProfileConfigResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.um.ws.service.GetAllProfiles param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.um.ws.service.GetAllProfiles.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.um.ws.service.GetAllProfilesResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.um.ws.service.GetAllProfilesResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.um.ws.service.UpdateProfileConfig param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.um.ws.service.UpdateProfileConfig.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.um.ws.service.DeleteProfileConfig param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.um.ws.service.DeleteProfileConfig.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.um.ws.service.GetProfileConfigResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.um.ws.service.GetProfileConfigResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.um.ws.service.GetProfileConfigResponse wrapgetProfileConfig(){
                                org.wso2.carbon.um.ws.service.GetProfileConfigResponse wrappedElement = new org.wso2.carbon.um.ws.service.GetProfileConfigResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.um.ws.service.GetAllProfilesResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.um.ws.service.GetAllProfilesResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.um.ws.service.GetAllProfilesResponse wrapgetAllProfiles(){
                                org.wso2.carbon.um.ws.service.GetAllProfilesResponse wrappedElement = new org.wso2.carbon.um.ws.service.GetAllProfilesResponse();
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
        
                if (org.wso2.carbon.um.ws.service.AddProfileConfig.class.equals(type)){
                
                           return org.wso2.carbon.um.ws.service.AddProfileConfig.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.um.ws.service.RemoteProfileConfigurationManagerServiceUserStoreException.class.equals(type)){
                
                           return org.wso2.carbon.um.ws.service.RemoteProfileConfigurationManagerServiceUserStoreException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.um.ws.service.GetProfileConfig.class.equals(type)){
                
                           return org.wso2.carbon.um.ws.service.GetProfileConfig.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.um.ws.service.GetProfileConfigResponse.class.equals(type)){
                
                           return org.wso2.carbon.um.ws.service.GetProfileConfigResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.um.ws.service.RemoteProfileConfigurationManagerServiceUserStoreException.class.equals(type)){
                
                           return org.wso2.carbon.um.ws.service.RemoteProfileConfigurationManagerServiceUserStoreException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.um.ws.service.GetAllProfiles.class.equals(type)){
                
                           return org.wso2.carbon.um.ws.service.GetAllProfiles.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.um.ws.service.GetAllProfilesResponse.class.equals(type)){
                
                           return org.wso2.carbon.um.ws.service.GetAllProfilesResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.um.ws.service.RemoteProfileConfigurationManagerServiceUserStoreException.class.equals(type)){
                
                           return org.wso2.carbon.um.ws.service.RemoteProfileConfigurationManagerServiceUserStoreException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.um.ws.service.UpdateProfileConfig.class.equals(type)){
                
                           return org.wso2.carbon.um.ws.service.UpdateProfileConfig.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.um.ws.service.RemoteProfileConfigurationManagerServiceUserStoreException.class.equals(type)){
                
                           return org.wso2.carbon.um.ws.service.RemoteProfileConfigurationManagerServiceUserStoreException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.um.ws.service.DeleteProfileConfig.class.equals(type)){
                
                           return org.wso2.carbon.um.ws.service.DeleteProfileConfig.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.um.ws.service.RemoteProfileConfigurationManagerServiceUserStoreException.class.equals(type)){
                
                           return org.wso2.carbon.um.ws.service.RemoteProfileConfigurationManagerServiceUserStoreException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

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
    

/**
 * ProfilesAdminServiceMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */
        package org.wso2.carbon.registry.profiles.services;

        /**
        *  ProfilesAdminServiceMessageReceiverInOut message receiver
        */

        public class ProfilesAdminServiceMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        ProfilesAdminServiceSkeletonInterface skel = (ProfilesAdminServiceSkeletonInterface)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){


        

            if("getUserProfile".equals(methodName)){
                
                org.wso2.carbon.registry.profiles.services.GetUserProfileResponse getUserProfileResponse5 = null;
	                        org.wso2.carbon.registry.profiles.services.GetUserProfile wrappedParam =
                                                             (org.wso2.carbon.registry.profiles.services.GetUserProfile)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.registry.profiles.services.GetUserProfile.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getUserProfileResponse5 =
                                                   
                                                   
                                                         skel.getUserProfile(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getUserProfileResponse5, false, new javax.xml.namespace.QName("http://services.profiles.registry.carbon.wso2.org",
                                                    "getUserProfile"));
                                    } else 

            if("putUserProfile".equals(methodName)){
                
                org.wso2.carbon.registry.profiles.services.PutUserProfileResponse putUserProfileResponse7 = null;
	                        org.wso2.carbon.registry.profiles.services.PutUserProfile wrappedParam =
                                                             (org.wso2.carbon.registry.profiles.services.PutUserProfile)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.registry.profiles.services.PutUserProfile.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               putUserProfileResponse7 =
                                                   
                                                   
                                                         skel.putUserProfile(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), putUserProfileResponse7, false, new javax.xml.namespace.QName("http://services.profiles.registry.carbon.wso2.org",
                                                    "putUserProfile"));
                                    
            } else {
              throw new java.lang.RuntimeException("method not found");
            }
        

        newMsgContext.setEnvelope(envelope);
        }
        } catch (ProfilesAdminServiceUserStoreExceptionException e) {

            msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME,"ProfilesAdminServiceUserStoreException");
            org.apache.axis2.AxisFault f = createAxisFault(e);
            if (e.getFaultMessage() != null){
                f.setDetail(toOM(e.getFaultMessage(),false));
            }
            throw f;
            }
         catch (ProfilesAdminServiceRegistryExceptionException e) {

            msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME,"ProfilesAdminServiceRegistryException");
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
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.profiles.services.GetUserProfile param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.profiles.services.GetUserProfile.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.profiles.services.GetUserProfileResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.profiles.services.GetUserProfileResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.profiles.services.ProfilesAdminServiceUserStoreException param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.profiles.services.ProfilesAdminServiceUserStoreException.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.profiles.services.ProfilesAdminServiceRegistryException param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.profiles.services.ProfilesAdminServiceRegistryException.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.profiles.services.PutUserProfile param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.profiles.services.PutUserProfile.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.profiles.services.PutUserProfileResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.profiles.services.PutUserProfileResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.registry.profiles.services.GetUserProfileResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.registry.profiles.services.GetUserProfileResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.registry.profiles.services.GetUserProfileResponse wrapgetUserProfile(){
                                org.wso2.carbon.registry.profiles.services.GetUserProfileResponse wrappedElement = new org.wso2.carbon.registry.profiles.services.GetUserProfileResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.registry.profiles.services.PutUserProfileResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.registry.profiles.services.PutUserProfileResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.registry.profiles.services.PutUserProfileResponse wrapputUserProfile(){
                                org.wso2.carbon.registry.profiles.services.PutUserProfileResponse wrappedElement = new org.wso2.carbon.registry.profiles.services.PutUserProfileResponse();
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
        
                if (org.wso2.carbon.registry.profiles.services.GetUserProfile.class.equals(type)){
                
                           return org.wso2.carbon.registry.profiles.services.GetUserProfile.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.profiles.services.GetUserProfileResponse.class.equals(type)){
                
                           return org.wso2.carbon.registry.profiles.services.GetUserProfileResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.profiles.services.ProfilesAdminServiceUserStoreException.class.equals(type)){
                
                           return org.wso2.carbon.registry.profiles.services.ProfilesAdminServiceUserStoreException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.profiles.services.ProfilesAdminServiceRegistryException.class.equals(type)){
                
                           return org.wso2.carbon.registry.profiles.services.ProfilesAdminServiceRegistryException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.profiles.services.PutUserProfile.class.equals(type)){
                
                           return org.wso2.carbon.registry.profiles.services.PutUserProfile.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.profiles.services.PutUserProfileResponse.class.equals(type)){
                
                           return org.wso2.carbon.registry.profiles.services.PutUserProfileResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.profiles.services.ProfilesAdminServiceUserStoreException.class.equals(type)){
                
                           return org.wso2.carbon.registry.profiles.services.ProfilesAdminServiceUserStoreException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.profiles.services.ProfilesAdminServiceRegistryException.class.equals(type)){
                
                           return org.wso2.carbon.registry.profiles.services.ProfilesAdminServiceRegistryException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

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
    
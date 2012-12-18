

/**
 * STSAdminServiceMessageReceiverRobustInOnly.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */
        package org.wso2.carbon.security.sts.service;

        /**
        *  STSAdminServiceMessageReceiverRobustInOnly message receiver
        */

        public class STSAdminServiceMessageReceiverRobustInOnly extends org.apache.axis2.receivers.AbstractMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        STSAdminServiceSkeletonInterface skel = (STSAdminServiceSkeletonInterface)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){
     
        
            if("removeTrustedService".equals(methodName)){
            
            
                            //doc style
                            org.wso2.carbon.security.sts.service.RemoveTrustedService wrappedParam =
                                                         (org.wso2.carbon.security.sts.service.RemoveTrustedService)fromOM(
                                                        msgContext.getEnvelope().getBody().getFirstElement(),
                                                        org.wso2.carbon.security.sts.service.RemoveTrustedService.class,
                                                        getEnvelopeNamespaces(msgContext.getEnvelope()));
                                            
                                           
                                                     skel.removeTrustedService(wrappedParam) ;
                                                

                             envelope = getSOAPFactory(msgContext).getDefaultEnvelope();
                        } else 
            if("addTrustedService".equals(methodName)){
            
            
                            //doc style
                            org.wso2.carbon.security.sts.service.AddTrustedService wrappedParam =
                                                         (org.wso2.carbon.security.sts.service.AddTrustedService)fromOM(
                                                        msgContext.getEnvelope().getBody().getFirstElement(),
                                                        org.wso2.carbon.security.sts.service.AddTrustedService.class,
                                                        getEnvelopeNamespaces(msgContext.getEnvelope()));
                                            
                                           
                                                     skel.addTrustedService(wrappedParam) ;
                                                

                             envelope = getSOAPFactory(msgContext).getDefaultEnvelope();
                        } else 
            if("setProofKeyType".equals(methodName)){
            
            
                            //doc style
                            org.wso2.carbon.security.sts.service.SetProofKeyType wrappedParam =
                                                         (org.wso2.carbon.security.sts.service.SetProofKeyType)fromOM(
                                                        msgContext.getEnvelope().getBody().getFirstElement(),
                                                        org.wso2.carbon.security.sts.service.SetProofKeyType.class,
                                                        getEnvelopeNamespaces(msgContext.getEnvelope()));
                                            
                                           
                                                     skel.setProofKeyType(wrappedParam) ;
                                                

                             envelope = getSOAPFactory(msgContext).getDefaultEnvelope();
                        
                } else {
                  throw new java.lang.RuntimeException("method not found");
                }
            

        }
        } catch (STSAdminServiceSecurityConfigExceptionException e) {
            msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME,"STSAdminServiceSecurityConfigException");
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
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.security.sts.service.RemoveTrustedService param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.security.sts.service.RemoveTrustedService.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.security.sts.service.STSAdminServiceSecurityConfigException param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.security.sts.service.STSAdminServiceSecurityConfigException.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.security.sts.service.AddTrustedService param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.security.sts.service.AddTrustedService.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.security.sts.service.SetProofKeyType param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.security.sts.service.SetProofKeyType.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.security.sts.service.GetProofKeyType param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.security.sts.service.GetProofKeyType.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.security.sts.service.GetProofKeyTypeResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.security.sts.service.GetProofKeyTypeResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.security.sts.service.GetCertAliasOfPrimaryKeyStore param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.security.sts.service.GetCertAliasOfPrimaryKeyStore.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.security.sts.service.GetCertAliasOfPrimaryKeyStoreResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.security.sts.service.GetCertAliasOfPrimaryKeyStoreResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.security.sts.service.GetTrustedServices param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.security.sts.service.GetTrustedServices.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.security.sts.service.GetTrustedServicesResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.security.sts.service.GetTrustedServicesResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.security.sts.service.GetProofKeyTypeResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.security.sts.service.GetProofKeyTypeResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.security.sts.service.GetProofKeyTypeResponse wrapgetProofKeyType(){
                                org.wso2.carbon.security.sts.service.GetProofKeyTypeResponse wrappedElement = new org.wso2.carbon.security.sts.service.GetProofKeyTypeResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.security.sts.service.GetCertAliasOfPrimaryKeyStoreResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.security.sts.service.GetCertAliasOfPrimaryKeyStoreResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.security.sts.service.GetCertAliasOfPrimaryKeyStoreResponse wrapgetCertAliasOfPrimaryKeyStore(){
                                org.wso2.carbon.security.sts.service.GetCertAliasOfPrimaryKeyStoreResponse wrappedElement = new org.wso2.carbon.security.sts.service.GetCertAliasOfPrimaryKeyStoreResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.security.sts.service.GetTrustedServicesResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.security.sts.service.GetTrustedServicesResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.security.sts.service.GetTrustedServicesResponse wrapgetTrustedServices(){
                                org.wso2.carbon.security.sts.service.GetTrustedServicesResponse wrappedElement = new org.wso2.carbon.security.sts.service.GetTrustedServicesResponse();
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
        
                if (org.wso2.carbon.security.sts.service.RemoveTrustedService.class.equals(type)){
                
                           return org.wso2.carbon.security.sts.service.RemoveTrustedService.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.security.sts.service.STSAdminServiceSecurityConfigException.class.equals(type)){
                
                           return org.wso2.carbon.security.sts.service.STSAdminServiceSecurityConfigException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.security.sts.service.AddTrustedService.class.equals(type)){
                
                           return org.wso2.carbon.security.sts.service.AddTrustedService.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.security.sts.service.STSAdminServiceSecurityConfigException.class.equals(type)){
                
                           return org.wso2.carbon.security.sts.service.STSAdminServiceSecurityConfigException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.security.sts.service.SetProofKeyType.class.equals(type)){
                
                           return org.wso2.carbon.security.sts.service.SetProofKeyType.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.security.sts.service.STSAdminServiceSecurityConfigException.class.equals(type)){
                
                           return org.wso2.carbon.security.sts.service.STSAdminServiceSecurityConfigException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.security.sts.service.GetProofKeyType.class.equals(type)){
                
                           return org.wso2.carbon.security.sts.service.GetProofKeyType.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.security.sts.service.GetProofKeyTypeResponse.class.equals(type)){
                
                           return org.wso2.carbon.security.sts.service.GetProofKeyTypeResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.security.sts.service.STSAdminServiceSecurityConfigException.class.equals(type)){
                
                           return org.wso2.carbon.security.sts.service.STSAdminServiceSecurityConfigException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.security.sts.service.GetCertAliasOfPrimaryKeyStore.class.equals(type)){
                
                           return org.wso2.carbon.security.sts.service.GetCertAliasOfPrimaryKeyStore.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.security.sts.service.GetCertAliasOfPrimaryKeyStoreResponse.class.equals(type)){
                
                           return org.wso2.carbon.security.sts.service.GetCertAliasOfPrimaryKeyStoreResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.security.sts.service.STSAdminServiceSecurityConfigException.class.equals(type)){
                
                           return org.wso2.carbon.security.sts.service.STSAdminServiceSecurityConfigException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.security.sts.service.GetTrustedServices.class.equals(type)){
                
                           return org.wso2.carbon.security.sts.service.GetTrustedServices.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.security.sts.service.GetTrustedServicesResponse.class.equals(type)){
                
                           return org.wso2.carbon.security.sts.service.GetTrustedServicesResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.security.sts.service.STSAdminServiceSecurityConfigException.class.equals(type)){
                
                           return org.wso2.carbon.security.sts.service.STSAdminServiceSecurityConfigException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

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
    
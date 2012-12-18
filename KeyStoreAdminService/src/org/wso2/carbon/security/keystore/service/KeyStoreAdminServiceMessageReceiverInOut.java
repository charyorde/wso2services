
/**
 * KeyStoreAdminServiceMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */
        package org.wso2.carbon.security.keystore.service;

        /**
        *  KeyStoreAdminServiceMessageReceiverInOut message receiver
        */

        public class KeyStoreAdminServiceMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        KeyStoreAdminServiceSkeletonInterface skel = (KeyStoreAdminServiceSkeletonInterface)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){


        

            if("getStoreEntries".equals(methodName)){
                
                org.wso2.carbon.security.keystore.service.GetStoreEntriesResponse getStoreEntriesResponse10 = null;
	                        org.wso2.carbon.security.keystore.service.GetStoreEntries wrappedParam =
                                                             (org.wso2.carbon.security.keystore.service.GetStoreEntries)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.security.keystore.service.GetStoreEntries.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getStoreEntriesResponse10 =
                                                   
                                                   
                                                         skel.getStoreEntries(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getStoreEntriesResponse10, false, new javax.xml.namespace.QName("http://service.keystore.security.carbon.wso2.org",
                                                    "getStoreEntries"));
                                    } else 

            if("getKeystoreInfo".equals(methodName)){
                
                org.wso2.carbon.security.keystore.service.GetKeystoreInfoResponse getKeystoreInfoResponse12 = null;
	                        org.wso2.carbon.security.keystore.service.GetKeystoreInfo wrappedParam =
                                                             (org.wso2.carbon.security.keystore.service.GetKeystoreInfo)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.security.keystore.service.GetKeystoreInfo.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getKeystoreInfoResponse12 =
                                                   
                                                   
                                                         skel.getKeystoreInfo(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getKeystoreInfoResponse12, false, new javax.xml.namespace.QName("http://service.keystore.security.carbon.wso2.org",
                                                    "getKeystoreInfo"));
                                    } else 

            if("getKeyStores".equals(methodName)){
                
                org.wso2.carbon.security.keystore.service.GetKeyStoresResponse getKeyStoresResponse14 = null;
	                        org.wso2.carbon.security.keystore.service.GetKeyStores wrappedParam =
                                                             (org.wso2.carbon.security.keystore.service.GetKeyStores)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.security.keystore.service.GetKeyStores.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getKeyStoresResponse14 =
                                                   
                                                   
                                                         skel.getKeyStores(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getKeyStoresResponse14, false, new javax.xml.namespace.QName("http://service.keystore.security.carbon.wso2.org",
                                                    "getKeyStores"));
                                    
            } else {
              throw new java.lang.RuntimeException("method not found");
            }
        

        newMsgContext.setEnvelope(envelope);
        }
        } catch (KeyStoreAdminServiceSecurityConfigExceptionException e) {

            msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME,"KeyStoreAdminServiceSecurityConfigException");
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
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.security.keystore.service.GetStoreEntries param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.security.keystore.service.GetStoreEntries.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.security.keystore.service.GetStoreEntriesResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.security.keystore.service.GetStoreEntriesResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.security.keystore.service.KeyStoreAdminServiceSecurityConfigException param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.security.keystore.service.KeyStoreAdminServiceSecurityConfigException.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.security.keystore.service.AddKeyStore param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.security.keystore.service.AddKeyStore.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.security.keystore.service.ImportCertToStore param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.security.keystore.service.ImportCertToStore.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.security.keystore.service.GetKeystoreInfo param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.security.keystore.service.GetKeystoreInfo.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.security.keystore.service.GetKeystoreInfoResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.security.keystore.service.GetKeystoreInfoResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.security.keystore.service.DeleteStore param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.security.keystore.service.DeleteStore.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.security.keystore.service.GetKeyStores param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.security.keystore.service.GetKeyStores.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.security.keystore.service.GetKeyStoresResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.security.keystore.service.GetKeyStoresResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.security.keystore.service.GetStoreEntriesResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.security.keystore.service.GetStoreEntriesResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.security.keystore.service.GetStoreEntriesResponse wrapgetStoreEntries(){
                                org.wso2.carbon.security.keystore.service.GetStoreEntriesResponse wrappedElement = new org.wso2.carbon.security.keystore.service.GetStoreEntriesResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.security.keystore.service.GetKeystoreInfoResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.security.keystore.service.GetKeystoreInfoResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.security.keystore.service.GetKeystoreInfoResponse wrapgetKeystoreInfo(){
                                org.wso2.carbon.security.keystore.service.GetKeystoreInfoResponse wrappedElement = new org.wso2.carbon.security.keystore.service.GetKeystoreInfoResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.security.keystore.service.GetKeyStoresResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.security.keystore.service.GetKeyStoresResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.security.keystore.service.GetKeyStoresResponse wrapgetKeyStores(){
                                org.wso2.carbon.security.keystore.service.GetKeyStoresResponse wrappedElement = new org.wso2.carbon.security.keystore.service.GetKeyStoresResponse();
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
        
                if (org.wso2.carbon.security.keystore.service.GetStoreEntries.class.equals(type)){
                
                           return org.wso2.carbon.security.keystore.service.GetStoreEntries.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.security.keystore.service.GetStoreEntriesResponse.class.equals(type)){
                
                           return org.wso2.carbon.security.keystore.service.GetStoreEntriesResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.security.keystore.service.KeyStoreAdminServiceSecurityConfigException.class.equals(type)){
                
                           return org.wso2.carbon.security.keystore.service.KeyStoreAdminServiceSecurityConfigException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.security.keystore.service.AddKeyStore.class.equals(type)){
                
                           return org.wso2.carbon.security.keystore.service.AddKeyStore.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.security.keystore.service.KeyStoreAdminServiceSecurityConfigException.class.equals(type)){
                
                           return org.wso2.carbon.security.keystore.service.KeyStoreAdminServiceSecurityConfigException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.security.keystore.service.ImportCertToStore.class.equals(type)){
                
                           return org.wso2.carbon.security.keystore.service.ImportCertToStore.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.security.keystore.service.KeyStoreAdminServiceSecurityConfigException.class.equals(type)){
                
                           return org.wso2.carbon.security.keystore.service.KeyStoreAdminServiceSecurityConfigException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.security.keystore.service.GetKeystoreInfo.class.equals(type)){
                
                           return org.wso2.carbon.security.keystore.service.GetKeystoreInfo.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.security.keystore.service.GetKeystoreInfoResponse.class.equals(type)){
                
                           return org.wso2.carbon.security.keystore.service.GetKeystoreInfoResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.security.keystore.service.KeyStoreAdminServiceSecurityConfigException.class.equals(type)){
                
                           return org.wso2.carbon.security.keystore.service.KeyStoreAdminServiceSecurityConfigException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.security.keystore.service.DeleteStore.class.equals(type)){
                
                           return org.wso2.carbon.security.keystore.service.DeleteStore.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.security.keystore.service.KeyStoreAdminServiceSecurityConfigException.class.equals(type)){
                
                           return org.wso2.carbon.security.keystore.service.KeyStoreAdminServiceSecurityConfigException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.security.keystore.service.GetKeyStores.class.equals(type)){
                
                           return org.wso2.carbon.security.keystore.service.GetKeyStores.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.security.keystore.service.GetKeyStoresResponse.class.equals(type)){
                
                           return org.wso2.carbon.security.keystore.service.GetKeyStoresResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.security.keystore.service.KeyStoreAdminServiceSecurityConfigException.class.equals(type)){
                
                           return org.wso2.carbon.security.keystore.service.KeyStoreAdminServiceSecurityConfigException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

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
    
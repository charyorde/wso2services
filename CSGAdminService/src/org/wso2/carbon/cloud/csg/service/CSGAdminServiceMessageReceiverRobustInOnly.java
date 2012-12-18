

/**
 * CSGAdminServiceMessageReceiverRobustInOnly.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */
        package org.wso2.carbon.cloud.csg.service;

        /**
        *  CSGAdminServiceMessageReceiverRobustInOnly message receiver
        */

        public class CSGAdminServiceMessageReceiverRobustInOnly extends org.apache.axis2.receivers.AbstractMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        CSGAdminServiceSkeletonInterface skel = (CSGAdminServiceSkeletonInterface)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){
     
        
            if("createOrUpdateServerQpidJNDIFile".equals(methodName)){
            
            
                            //doc style
                            synapse.apache.org.xsd.CreateOrUpdateServerQpidJNDIFile wrappedParam =
                                                         (synapse.apache.org.xsd.CreateOrUpdateServerQpidJNDIFile)fromOM(
                                                        msgContext.getEnvelope().getBody().getFirstElement(),
                                                        synapse.apache.org.xsd.CreateOrUpdateServerQpidJNDIFile.class,
                                                        getEnvelopeNamespaces(msgContext.getEnvelope()));
                                            
                                           
                                                     skel.createOrUpdateServerQpidJNDIFile(wrappedParam) ;
                                                

                             envelope = getSOAPFactory(msgContext).getDefaultEnvelope();
                        } else 
            if("createOrUpdateServerRegistryJNDI".equals(methodName)){
            
            
                            //doc style
                            synapse.apache.org.xsd.CreateOrUpdateServerRegistryJNDI wrappedParam =
                                                         (synapse.apache.org.xsd.CreateOrUpdateServerRegistryJNDI)fromOM(
                                                        msgContext.getEnvelope().getBody().getFirstElement(),
                                                        synapse.apache.org.xsd.CreateOrUpdateServerRegistryJNDI.class,
                                                        getEnvelopeNamespaces(msgContext.getEnvelope()));
                                            
                                           
                                                     skel.createOrUpdateServerRegistryJNDI(wrappedParam) ;
                                                

                             envelope = getSOAPFactory(msgContext).getDefaultEnvelope();
                        } else 
            if("deployProxy".equals(methodName)){
            
            
                            //doc style
                            synapse.apache.org.xsd.DeployProxy wrappedParam =
                                                         (synapse.apache.org.xsd.DeployProxy)fromOM(
                                                        msgContext.getEnvelope().getBody().getFirstElement(),
                                                        synapse.apache.org.xsd.DeployProxy.class,
                                                        getEnvelopeNamespaces(msgContext.getEnvelope()));
                                            
                                           
                                                     skel.deployProxy(wrappedParam) ;
                                                

                             envelope = getSOAPFactory(msgContext).getDefaultEnvelope();
                        } else 
            if("unDeployProxy".equals(methodName)){
            
            
                            //doc style
                            synapse.apache.org.xsd.UnDeployProxy wrappedParam =
                                                         (synapse.apache.org.xsd.UnDeployProxy)fromOM(
                                                        msgContext.getEnvelope().getBody().getFirstElement(),
                                                        synapse.apache.org.xsd.UnDeployProxy.class,
                                                        getEnvelopeNamespaces(msgContext.getEnvelope()));
                                            
                                           
                                                     skel.unDeployProxy(wrappedParam) ;
                                                

                             envelope = getSOAPFactory(msgContext).getDefaultEnvelope();
                        
                } else {
                  throw new java.lang.RuntimeException("method not found");
                }
            

        }
        } catch (CSGAdminServiceCSGException e) {
            msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME,"CSGAdminServiceCSGException");
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
            private  org.apache.axiom.om.OMElement  toOM(synapse.apache.org.xsd.CreateOrUpdateServerQpidJNDIFile param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(synapse.apache.org.xsd.CreateOrUpdateServerQpidJNDIFile.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(synapse.apache.org.xsd.CSGAdminServiceCSGException param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(synapse.apache.org.xsd.CSGAdminServiceCSGException.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(synapse.apache.org.xsd.CreateOrUpdateServerRegistryJNDI param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(synapse.apache.org.xsd.CreateOrUpdateServerRegistryJNDI.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(synapse.apache.org.xsd.GetRemoteConnectionURL param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(synapse.apache.org.xsd.GetRemoteConnectionURL.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(synapse.apache.org.xsd.GetRemoteConnectionURLResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(synapse.apache.org.xsd.GetRemoteConnectionURLResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(synapse.apache.org.xsd.DeployProxy param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(synapse.apache.org.xsd.DeployProxy.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(synapse.apache.org.xsd.UnDeployProxy param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(synapse.apache.org.xsd.UnDeployProxy.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, synapse.apache.org.xsd.GetRemoteConnectionURLResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(synapse.apache.org.xsd.GetRemoteConnectionURLResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private synapse.apache.org.xsd.GetRemoteConnectionURLResponse wrapgetRemoteConnectionURL(){
                                synapse.apache.org.xsd.GetRemoteConnectionURLResponse wrappedElement = new synapse.apache.org.xsd.GetRemoteConnectionURLResponse();
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
        
                if (synapse.apache.org.xsd.CreateOrUpdateServerQpidJNDIFile.class.equals(type)){
                
                           return synapse.apache.org.xsd.CreateOrUpdateServerQpidJNDIFile.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.CSGAdminServiceCSGException.class.equals(type)){
                
                           return synapse.apache.org.xsd.CSGAdminServiceCSGException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.CreateOrUpdateServerRegistryJNDI.class.equals(type)){
                
                           return synapse.apache.org.xsd.CreateOrUpdateServerRegistryJNDI.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.CSGAdminServiceCSGException.class.equals(type)){
                
                           return synapse.apache.org.xsd.CSGAdminServiceCSGException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.GetRemoteConnectionURL.class.equals(type)){
                
                           return synapse.apache.org.xsd.GetRemoteConnectionURL.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.GetRemoteConnectionURLResponse.class.equals(type)){
                
                           return synapse.apache.org.xsd.GetRemoteConnectionURLResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.DeployProxy.class.equals(type)){
                
                           return synapse.apache.org.xsd.DeployProxy.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.CSGAdminServiceCSGException.class.equals(type)){
                
                           return synapse.apache.org.xsd.CSGAdminServiceCSGException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.UnDeployProxy.class.equals(type)){
                
                           return synapse.apache.org.xsd.UnDeployProxy.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (synapse.apache.org.xsd.CSGAdminServiceCSGException.class.equals(type)){
                
                           return synapse.apache.org.xsd.CSGAdminServiceCSGException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

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
    
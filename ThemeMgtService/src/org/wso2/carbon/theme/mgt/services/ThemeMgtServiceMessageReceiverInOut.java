
/**
 * ThemeMgtServiceMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */
        package org.wso2.carbon.theme.mgt.services;

        /**
        *  ThemeMgtServiceMessageReceiverInOut message receiver
        */

        public class ThemeMgtServiceMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        ThemeMgtServiceSkeletonInterface skel = (ThemeMgtServiceSkeletonInterface)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){


        

            if("renameResource".equals(methodName)){
                
                org.wso2.carbon.theme.mgt.services.RenameResource wrappedParam =
                                                             (org.wso2.carbon.theme.mgt.services.RenameResource)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.theme.mgt.services.RenameResource.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               
                                                         skel.renameResource(wrappedParam)
                                                    ;
                                            
                                        envelope = getSOAPFactory(msgContext).getDefaultEnvelope();
                                    } else 

            if("delete".equals(methodName)){
                
                org.wso2.carbon.theme.mgt.services.Delete wrappedParam =
                                                             (org.wso2.carbon.theme.mgt.services.Delete)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.theme.mgt.services.Delete.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               
                                                         skel.delete(wrappedParam)
                                                    ;
                                            
                                        envelope = getSOAPFactory(msgContext).getDefaultEnvelope();
                                    } else 

            if("getMetadata".equals(methodName)){
                
                org.wso2.carbon.theme.mgt.services.GetMetadataResponse getMetadataResponse48 = null;
	                        org.wso2.carbon.theme.mgt.services.GetMetadata wrappedParam =
                                                             (org.wso2.carbon.theme.mgt.services.GetMetadata)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.theme.mgt.services.GetMetadata.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getMetadataResponse48 =
                                                   
                                                   
                                                         skel.getMetadata(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getMetadataResponse48, false, new javax.xml.namespace.QName("http://services.mgt.theme.carbon.wso2.org",
                                                    "getMetadata"));
                                    } else 

            if("getContentDownloadBean".equals(methodName)){
                
                org.wso2.carbon.theme.mgt.services.GetContentDownloadBeanResponse getContentDownloadBeanResponse50 = null;
	                        org.wso2.carbon.theme.mgt.services.GetContentDownloadBean wrappedParam =
                                                             (org.wso2.carbon.theme.mgt.services.GetContentDownloadBean)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.theme.mgt.services.GetContentDownloadBean.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getContentDownloadBeanResponse50 =
                                                   
                                                   
                                                         skel.getContentDownloadBean(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getContentDownloadBeanResponse50, false, new javax.xml.namespace.QName("http://services.mgt.theme.carbon.wso2.org",
                                                    "getContentDownloadBean"));
                                    } else 

            if("addResource".equals(methodName)){
                
                org.wso2.carbon.theme.mgt.services.AddResource wrappedParam =
                                                             (org.wso2.carbon.theme.mgt.services.AddResource)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.theme.mgt.services.AddResource.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               
                                                         skel.addResource(wrappedParam)
                                                    ;
                                            
                                        envelope = getSOAPFactory(msgContext).getDefaultEnvelope();
                                    } else 

            if("addCollection".equals(methodName)){
                
                org.wso2.carbon.theme.mgt.services.AddCollectionResponse addCollectionResponse54 = null;
	                        org.wso2.carbon.theme.mgt.services.AddCollection wrappedParam =
                                                             (org.wso2.carbon.theme.mgt.services.AddCollection)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.theme.mgt.services.AddCollection.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               addCollectionResponse54 =
                                                   
                                                   
                                                         skel.addCollection(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), addCollectionResponse54, false, new javax.xml.namespace.QName("http://services.mgt.theme.carbon.wso2.org",
                                                    "addCollection"));
                                    } else 

            if("getAllThemes".equals(methodName)){
                
                org.wso2.carbon.theme.mgt.services.GetAllThemesResponse getAllThemesResponse56 = null;
	                        org.wso2.carbon.theme.mgt.services.GetAllThemes wrappedParam =
                                                             (org.wso2.carbon.theme.mgt.services.GetAllThemes)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.theme.mgt.services.GetAllThemes.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getAllThemesResponse56 =
                                                   
                                                   
                                                         skel.getAllThemes(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getAllThemesResponse56, false, new javax.xml.namespace.QName("http://services.mgt.theme.carbon.wso2.org",
                                                    "getAllThemes"));
                                    } else 

            if("updateTextContent".equals(methodName)){
                
                org.wso2.carbon.theme.mgt.services.UpdateTextContent wrappedParam =
                                                             (org.wso2.carbon.theme.mgt.services.UpdateTextContent)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.theme.mgt.services.UpdateTextContent.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               
                                                         skel.updateTextContent(wrappedParam)
                                                    ;
                                            
                                        envelope = getSOAPFactory(msgContext).getDefaultEnvelope();
                                    } else 

            if("getContentBean".equals(methodName)){
                
                org.wso2.carbon.theme.mgt.services.GetContentBeanResponse getContentBeanResponse60 = null;
	                        org.wso2.carbon.theme.mgt.services.GetContentBean wrappedParam =
                                                             (org.wso2.carbon.theme.mgt.services.GetContentBean)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.theme.mgt.services.GetContentBean.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getContentBeanResponse60 =
                                                   
                                                   
                                                         skel.getContentBean(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getContentBeanResponse60, false, new javax.xml.namespace.QName("http://services.mgt.theme.carbon.wso2.org",
                                                    "getContentBean"));
                                    } else 

            if("applyTheme".equals(methodName)){
                
                org.wso2.carbon.theme.mgt.services.ApplyTheme wrappedParam =
                                                             (org.wso2.carbon.theme.mgt.services.ApplyTheme)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.theme.mgt.services.ApplyTheme.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               
                                                         skel.applyTheme(wrappedParam)
                                                    ;
                                            
                                        envelope = getSOAPFactory(msgContext).getDefaultEnvelope();
                                    } else 

            if("getAllPaths".equals(methodName)){
                
                org.wso2.carbon.theme.mgt.services.GetAllPathsResponse getAllPathsResponse64 = null;
	                        org.wso2.carbon.theme.mgt.services.GetAllPaths wrappedParam =
                                                             (org.wso2.carbon.theme.mgt.services.GetAllPaths)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.theme.mgt.services.GetAllPaths.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getAllPathsResponse64 =
                                                   
                                                   
                                                         skel.getAllPaths(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getAllPathsResponse64, false, new javax.xml.namespace.QName("http://services.mgt.theme.carbon.wso2.org",
                                                    "getAllPaths"));
                                    } else 

            if("getSessionResourcePath".equals(methodName)){
                
                org.wso2.carbon.theme.mgt.services.GetSessionResourcePathResponse getSessionResourcePathResponse66 = null;
	                        org.wso2.carbon.theme.mgt.services.GetSessionResourcePath wrappedParam =
                                                             (org.wso2.carbon.theme.mgt.services.GetSessionResourcePath)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.theme.mgt.services.GetSessionResourcePath.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getSessionResourcePathResponse66 =
                                                   
                                                   
                                                         skel.getSessionResourcePath(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getSessionResourcePathResponse66, false, new javax.xml.namespace.QName("http://services.mgt.theme.carbon.wso2.org",
                                                    "getSessionResourcePath"));
                                    } else 

            if("importResource".equals(methodName)){
                
                org.wso2.carbon.theme.mgt.services.ImportResource wrappedParam =
                                                             (org.wso2.carbon.theme.mgt.services.ImportResource)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.theme.mgt.services.ImportResource.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               
                                                         skel.importResource(wrappedParam)
                                                    ;
                                            
                                        envelope = getSOAPFactory(msgContext).getDefaultEnvelope();
                                    } else 

            if("getResourceData".equals(methodName)){
                
                org.wso2.carbon.theme.mgt.services.GetResourceDataResponse getResourceDataResponse70 = null;
	                        org.wso2.carbon.theme.mgt.services.GetResourceData wrappedParam =
                                                             (org.wso2.carbon.theme.mgt.services.GetResourceData)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.theme.mgt.services.GetResourceData.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getResourceDataResponse70 =
                                                   
                                                   
                                                         skel.getResourceData(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getResourceDataResponse70, false, new javax.xml.namespace.QName("http://services.mgt.theme.carbon.wso2.org",
                                                    "getResourceData"));
                                    } else 

            if("getCollectionContent".equals(methodName)){
                
                org.wso2.carbon.theme.mgt.services.GetCollectionContentResponse getCollectionContentResponse72 = null;
	                        org.wso2.carbon.theme.mgt.services.GetCollectionContent wrappedParam =
                                                             (org.wso2.carbon.theme.mgt.services.GetCollectionContent)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.theme.mgt.services.GetCollectionContent.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getCollectionContentResponse72 =
                                                   
                                                   
                                                         skel.getCollectionContent(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getCollectionContentResponse72, false, new javax.xml.namespace.QName("http://services.mgt.theme.carbon.wso2.org",
                                                    "getCollectionContent"));
                                    } else 

            if("addTextResource".equals(methodName)){
                
                org.wso2.carbon.theme.mgt.services.AddTextResource wrappedParam =
                                                             (org.wso2.carbon.theme.mgt.services.AddTextResource)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.theme.mgt.services.AddTextResource.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               
                                                         skel.addTextResource(wrappedParam)
                                                    ;
                                            
                                        envelope = getSOAPFactory(msgContext).getDefaultEnvelope();
                                    } else 

            if("getTextContent".equals(methodName)){
                
                org.wso2.carbon.theme.mgt.services.GetTextContentResponse getTextContentResponse76 = null;
	                        org.wso2.carbon.theme.mgt.services.GetTextContent wrappedParam =
                                                             (org.wso2.carbon.theme.mgt.services.GetTextContent)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.theme.mgt.services.GetTextContent.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getTextContentResponse76 =
                                                   
                                                   
                                                         skel.getTextContent(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getTextContentResponse76, false, new javax.xml.namespace.QName("http://services.mgt.theme.carbon.wso2.org",
                                                    "getTextContent"));
                                    } else 

            if("getResourceTreeEntry".equals(methodName)){
                
                org.wso2.carbon.theme.mgt.services.GetResourceTreeEntryResponse getResourceTreeEntryResponse78 = null;
	                        org.wso2.carbon.theme.mgt.services.GetResourceTreeEntry wrappedParam =
                                                             (org.wso2.carbon.theme.mgt.services.GetResourceTreeEntry)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.theme.mgt.services.GetResourceTreeEntry.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getResourceTreeEntryResponse78 =
                                                   
                                                   
                                                         skel.getResourceTreeEntry(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getResourceTreeEntryResponse78, false, new javax.xml.namespace.QName("http://services.mgt.theme.carbon.wso2.org",
                                                    "getResourceTreeEntry"));
                                    
            } else {
              throw new java.lang.RuntimeException("method not found");
            }
        

        newMsgContext.setEnvelope(envelope);
        }
        } catch (ThemeMgtServiceExceptionException e) {

            msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME,"ThemeMgtServiceException");
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
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.theme.mgt.services.RenameResource param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.theme.mgt.services.RenameResource.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.theme.mgt.services.ThemeMgtServiceException param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.theme.mgt.services.ThemeMgtServiceException.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.theme.mgt.services.Delete param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.theme.mgt.services.Delete.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.theme.mgt.services.GetMetadata param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.theme.mgt.services.GetMetadata.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.theme.mgt.services.GetMetadataResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.theme.mgt.services.GetMetadataResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.theme.mgt.services.GetContentDownloadBean param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.theme.mgt.services.GetContentDownloadBean.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.theme.mgt.services.GetContentDownloadBeanResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.theme.mgt.services.GetContentDownloadBeanResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.theme.mgt.services.AddResource param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.theme.mgt.services.AddResource.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.theme.mgt.services.AddCollection param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.theme.mgt.services.AddCollection.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.theme.mgt.services.AddCollectionResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.theme.mgt.services.AddCollectionResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.theme.mgt.services.GetAllThemes param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.theme.mgt.services.GetAllThemes.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.theme.mgt.services.GetAllThemesResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.theme.mgt.services.GetAllThemesResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.theme.mgt.services.UpdateTextContent param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.theme.mgt.services.UpdateTextContent.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.theme.mgt.services.GetContentBean param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.theme.mgt.services.GetContentBean.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.theme.mgt.services.GetContentBeanResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.theme.mgt.services.GetContentBeanResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.theme.mgt.services.ApplyTheme param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.theme.mgt.services.ApplyTheme.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.theme.mgt.services.GetAllPaths param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.theme.mgt.services.GetAllPaths.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.theme.mgt.services.GetAllPathsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.theme.mgt.services.GetAllPathsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.theme.mgt.services.GetSessionResourcePath param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.theme.mgt.services.GetSessionResourcePath.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.theme.mgt.services.GetSessionResourcePathResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.theme.mgt.services.GetSessionResourcePathResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.theme.mgt.services.ImportResource param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.theme.mgt.services.ImportResource.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.theme.mgt.services.GetResourceData param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.theme.mgt.services.GetResourceData.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.theme.mgt.services.GetResourceDataResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.theme.mgt.services.GetResourceDataResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.theme.mgt.services.GetCollectionContent param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.theme.mgt.services.GetCollectionContent.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.theme.mgt.services.GetCollectionContentResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.theme.mgt.services.GetCollectionContentResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.theme.mgt.services.AddTextResource param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.theme.mgt.services.AddTextResource.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.theme.mgt.services.GetTextContent param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.theme.mgt.services.GetTextContent.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.theme.mgt.services.GetTextContentResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.theme.mgt.services.GetTextContentResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.theme.mgt.services.GetResourceTreeEntry param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.theme.mgt.services.GetResourceTreeEntry.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.theme.mgt.services.GetResourceTreeEntryResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.theme.mgt.services.GetResourceTreeEntryResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.theme.mgt.services.GetMetadataResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.theme.mgt.services.GetMetadataResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.theme.mgt.services.GetMetadataResponse wrapgetMetadata(){
                                org.wso2.carbon.theme.mgt.services.GetMetadataResponse wrappedElement = new org.wso2.carbon.theme.mgt.services.GetMetadataResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.theme.mgt.services.GetContentDownloadBeanResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.theme.mgt.services.GetContentDownloadBeanResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.theme.mgt.services.GetContentDownloadBeanResponse wrapgetContentDownloadBean(){
                                org.wso2.carbon.theme.mgt.services.GetContentDownloadBeanResponse wrappedElement = new org.wso2.carbon.theme.mgt.services.GetContentDownloadBeanResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.theme.mgt.services.AddCollectionResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.theme.mgt.services.AddCollectionResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.theme.mgt.services.AddCollectionResponse wrapaddCollection(){
                                org.wso2.carbon.theme.mgt.services.AddCollectionResponse wrappedElement = new org.wso2.carbon.theme.mgt.services.AddCollectionResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.theme.mgt.services.GetAllThemesResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.theme.mgt.services.GetAllThemesResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.theme.mgt.services.GetAllThemesResponse wrapgetAllThemes(){
                                org.wso2.carbon.theme.mgt.services.GetAllThemesResponse wrappedElement = new org.wso2.carbon.theme.mgt.services.GetAllThemesResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.theme.mgt.services.GetContentBeanResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.theme.mgt.services.GetContentBeanResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.theme.mgt.services.GetContentBeanResponse wrapgetContentBean(){
                                org.wso2.carbon.theme.mgt.services.GetContentBeanResponse wrappedElement = new org.wso2.carbon.theme.mgt.services.GetContentBeanResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.theme.mgt.services.GetAllPathsResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.theme.mgt.services.GetAllPathsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.theme.mgt.services.GetAllPathsResponse wrapgetAllPaths(){
                                org.wso2.carbon.theme.mgt.services.GetAllPathsResponse wrappedElement = new org.wso2.carbon.theme.mgt.services.GetAllPathsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.theme.mgt.services.GetSessionResourcePathResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.theme.mgt.services.GetSessionResourcePathResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.theme.mgt.services.GetSessionResourcePathResponse wrapgetSessionResourcePath(){
                                org.wso2.carbon.theme.mgt.services.GetSessionResourcePathResponse wrappedElement = new org.wso2.carbon.theme.mgt.services.GetSessionResourcePathResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.theme.mgt.services.GetResourceDataResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.theme.mgt.services.GetResourceDataResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.theme.mgt.services.GetResourceDataResponse wrapgetResourceData(){
                                org.wso2.carbon.theme.mgt.services.GetResourceDataResponse wrappedElement = new org.wso2.carbon.theme.mgt.services.GetResourceDataResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.theme.mgt.services.GetCollectionContentResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.theme.mgt.services.GetCollectionContentResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.theme.mgt.services.GetCollectionContentResponse wrapgetCollectionContent(){
                                org.wso2.carbon.theme.mgt.services.GetCollectionContentResponse wrappedElement = new org.wso2.carbon.theme.mgt.services.GetCollectionContentResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.theme.mgt.services.GetTextContentResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.theme.mgt.services.GetTextContentResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.theme.mgt.services.GetTextContentResponse wrapgetTextContent(){
                                org.wso2.carbon.theme.mgt.services.GetTextContentResponse wrappedElement = new org.wso2.carbon.theme.mgt.services.GetTextContentResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.theme.mgt.services.GetResourceTreeEntryResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.theme.mgt.services.GetResourceTreeEntryResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.theme.mgt.services.GetResourceTreeEntryResponse wrapgetResourceTreeEntry(){
                                org.wso2.carbon.theme.mgt.services.GetResourceTreeEntryResponse wrappedElement = new org.wso2.carbon.theme.mgt.services.GetResourceTreeEntryResponse();
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
        
                if (org.wso2.carbon.theme.mgt.services.RenameResource.class.equals(type)){
                
                           return org.wso2.carbon.theme.mgt.services.RenameResource.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.theme.mgt.services.ThemeMgtServiceException.class.equals(type)){
                
                           return org.wso2.carbon.theme.mgt.services.ThemeMgtServiceException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.theme.mgt.services.Delete.class.equals(type)){
                
                           return org.wso2.carbon.theme.mgt.services.Delete.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.theme.mgt.services.ThemeMgtServiceException.class.equals(type)){
                
                           return org.wso2.carbon.theme.mgt.services.ThemeMgtServiceException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.theme.mgt.services.GetMetadata.class.equals(type)){
                
                           return org.wso2.carbon.theme.mgt.services.GetMetadata.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.theme.mgt.services.GetMetadataResponse.class.equals(type)){
                
                           return org.wso2.carbon.theme.mgt.services.GetMetadataResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.theme.mgt.services.ThemeMgtServiceException.class.equals(type)){
                
                           return org.wso2.carbon.theme.mgt.services.ThemeMgtServiceException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.theme.mgt.services.GetContentDownloadBean.class.equals(type)){
                
                           return org.wso2.carbon.theme.mgt.services.GetContentDownloadBean.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.theme.mgt.services.GetContentDownloadBeanResponse.class.equals(type)){
                
                           return org.wso2.carbon.theme.mgt.services.GetContentDownloadBeanResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.theme.mgt.services.ThemeMgtServiceException.class.equals(type)){
                
                           return org.wso2.carbon.theme.mgt.services.ThemeMgtServiceException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.theme.mgt.services.AddResource.class.equals(type)){
                
                           return org.wso2.carbon.theme.mgt.services.AddResource.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.theme.mgt.services.ThemeMgtServiceException.class.equals(type)){
                
                           return org.wso2.carbon.theme.mgt.services.ThemeMgtServiceException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.theme.mgt.services.AddCollection.class.equals(type)){
                
                           return org.wso2.carbon.theme.mgt.services.AddCollection.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.theme.mgt.services.AddCollectionResponse.class.equals(type)){
                
                           return org.wso2.carbon.theme.mgt.services.AddCollectionResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.theme.mgt.services.ThemeMgtServiceException.class.equals(type)){
                
                           return org.wso2.carbon.theme.mgt.services.ThemeMgtServiceException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.theme.mgt.services.GetAllThemes.class.equals(type)){
                
                           return org.wso2.carbon.theme.mgt.services.GetAllThemes.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.theme.mgt.services.GetAllThemesResponse.class.equals(type)){
                
                           return org.wso2.carbon.theme.mgt.services.GetAllThemesResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.theme.mgt.services.ThemeMgtServiceException.class.equals(type)){
                
                           return org.wso2.carbon.theme.mgt.services.ThemeMgtServiceException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.theme.mgt.services.UpdateTextContent.class.equals(type)){
                
                           return org.wso2.carbon.theme.mgt.services.UpdateTextContent.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.theme.mgt.services.ThemeMgtServiceException.class.equals(type)){
                
                           return org.wso2.carbon.theme.mgt.services.ThemeMgtServiceException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.theme.mgt.services.GetContentBean.class.equals(type)){
                
                           return org.wso2.carbon.theme.mgt.services.GetContentBean.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.theme.mgt.services.GetContentBeanResponse.class.equals(type)){
                
                           return org.wso2.carbon.theme.mgt.services.GetContentBeanResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.theme.mgt.services.ThemeMgtServiceException.class.equals(type)){
                
                           return org.wso2.carbon.theme.mgt.services.ThemeMgtServiceException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.theme.mgt.services.ApplyTheme.class.equals(type)){
                
                           return org.wso2.carbon.theme.mgt.services.ApplyTheme.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.theme.mgt.services.ThemeMgtServiceException.class.equals(type)){
                
                           return org.wso2.carbon.theme.mgt.services.ThemeMgtServiceException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.theme.mgt.services.GetAllPaths.class.equals(type)){
                
                           return org.wso2.carbon.theme.mgt.services.GetAllPaths.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.theme.mgt.services.GetAllPathsResponse.class.equals(type)){
                
                           return org.wso2.carbon.theme.mgt.services.GetAllPathsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.theme.mgt.services.ThemeMgtServiceException.class.equals(type)){
                
                           return org.wso2.carbon.theme.mgt.services.ThemeMgtServiceException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.theme.mgt.services.GetSessionResourcePath.class.equals(type)){
                
                           return org.wso2.carbon.theme.mgt.services.GetSessionResourcePath.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.theme.mgt.services.GetSessionResourcePathResponse.class.equals(type)){
                
                           return org.wso2.carbon.theme.mgt.services.GetSessionResourcePathResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.theme.mgt.services.ThemeMgtServiceException.class.equals(type)){
                
                           return org.wso2.carbon.theme.mgt.services.ThemeMgtServiceException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.theme.mgt.services.ImportResource.class.equals(type)){
                
                           return org.wso2.carbon.theme.mgt.services.ImportResource.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.theme.mgt.services.ThemeMgtServiceException.class.equals(type)){
                
                           return org.wso2.carbon.theme.mgt.services.ThemeMgtServiceException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.theme.mgt.services.GetResourceData.class.equals(type)){
                
                           return org.wso2.carbon.theme.mgt.services.GetResourceData.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.theme.mgt.services.GetResourceDataResponse.class.equals(type)){
                
                           return org.wso2.carbon.theme.mgt.services.GetResourceDataResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.theme.mgt.services.ThemeMgtServiceException.class.equals(type)){
                
                           return org.wso2.carbon.theme.mgt.services.ThemeMgtServiceException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.theme.mgt.services.GetCollectionContent.class.equals(type)){
                
                           return org.wso2.carbon.theme.mgt.services.GetCollectionContent.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.theme.mgt.services.GetCollectionContentResponse.class.equals(type)){
                
                           return org.wso2.carbon.theme.mgt.services.GetCollectionContentResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.theme.mgt.services.ThemeMgtServiceException.class.equals(type)){
                
                           return org.wso2.carbon.theme.mgt.services.ThemeMgtServiceException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.theme.mgt.services.AddTextResource.class.equals(type)){
                
                           return org.wso2.carbon.theme.mgt.services.AddTextResource.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.theme.mgt.services.ThemeMgtServiceException.class.equals(type)){
                
                           return org.wso2.carbon.theme.mgt.services.ThemeMgtServiceException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.theme.mgt.services.GetTextContent.class.equals(type)){
                
                           return org.wso2.carbon.theme.mgt.services.GetTextContent.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.theme.mgt.services.GetTextContentResponse.class.equals(type)){
                
                           return org.wso2.carbon.theme.mgt.services.GetTextContentResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.theme.mgt.services.ThemeMgtServiceException.class.equals(type)){
                
                           return org.wso2.carbon.theme.mgt.services.ThemeMgtServiceException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.theme.mgt.services.GetResourceTreeEntry.class.equals(type)){
                
                           return org.wso2.carbon.theme.mgt.services.GetResourceTreeEntry.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.theme.mgt.services.GetResourceTreeEntryResponse.class.equals(type)){
                
                           return org.wso2.carbon.theme.mgt.services.GetResourceTreeEntryResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.theme.mgt.services.ThemeMgtServiceException.class.equals(type)){
                
                           return org.wso2.carbon.theme.mgt.services.ThemeMgtServiceException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

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
    
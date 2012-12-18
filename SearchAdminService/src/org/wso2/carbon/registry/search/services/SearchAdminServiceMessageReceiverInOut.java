
/**
 * SearchAdminServiceMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */
        package org.wso2.carbon.registry.search.services;

        /**
        *  SearchAdminServiceMessageReceiverInOut message receiver
        */

        public class SearchAdminServiceMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        SearchAdminServiceSkeletonInterface skel = (SearchAdminServiceSkeletonInterface)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){


        

            if("getMediaTypeSearch".equals(methodName)){
                
                org.wso2.carbon.registry.search.services.GetMediaTypeSearchResponse getMediaTypeSearchResponse13 = null;
	                        org.wso2.carbon.registry.search.services.GetMediaTypeSearch wrappedParam =
                                                             (org.wso2.carbon.registry.search.services.GetMediaTypeSearch)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.registry.search.services.GetMediaTypeSearch.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getMediaTypeSearchResponse13 =
                                                   
                                                   
                                                         skel.getMediaTypeSearch(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getMediaTypeSearchResponse13, false, new javax.xml.namespace.QName("http://services.search.registry.carbon.wso2.org",
                                                    "getMediaTypeSearch"));
                                    } else 

            if("getSavedFilters".equals(methodName)){
                
                org.wso2.carbon.registry.search.services.GetSavedFiltersResponse getSavedFiltersResponse15 = null;
	                        org.wso2.carbon.registry.search.services.GetSavedFilters wrappedParam =
                                                             (org.wso2.carbon.registry.search.services.GetSavedFilters)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.registry.search.services.GetSavedFilters.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getSavedFiltersResponse15 =
                                                   
                                                   
                                                         skel.getSavedFilters(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getSavedFiltersResponse15, false, new javax.xml.namespace.QName("http://services.search.registry.carbon.wso2.org",
                                                    "getSavedFilters"));
                                    } else 

            if("getSearchResults".equals(methodName)){
                
                org.wso2.carbon.registry.search.services.GetSearchResultsResponse getSearchResultsResponse17 = null;
	                        org.wso2.carbon.registry.search.services.GetSearchResults wrappedParam =
                                                             (org.wso2.carbon.registry.search.services.GetSearchResults)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.registry.search.services.GetSearchResults.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getSearchResultsResponse17 =
                                                   
                                                   
                                                         skel.getSearchResults(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getSearchResultsResponse17, false, new javax.xml.namespace.QName("http://services.search.registry.carbon.wso2.org",
                                                    "getSearchResults"));
                                    } else 

            if("getAdvancedSearchResults".equals(methodName)){
                
                org.wso2.carbon.registry.search.services.GetAdvancedSearchResultsResponse getAdvancedSearchResultsResponse19 = null;
	                        org.wso2.carbon.registry.search.services.GetAdvancedSearchResults wrappedParam =
                                                             (org.wso2.carbon.registry.search.services.GetAdvancedSearchResults)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.registry.search.services.GetAdvancedSearchResults.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getAdvancedSearchResultsResponse19 =
                                                   
                                                   
                                                         skel.getAdvancedSearchResults(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getAdvancedSearchResultsResponse19, false, new javax.xml.namespace.QName("http://services.search.registry.carbon.wso2.org",
                                                    "getAdvancedSearchResults"));
                                    } else 

            if("getAdvancedSearchFilter".equals(methodName)){
                
                org.wso2.carbon.registry.search.services.GetAdvancedSearchFilterResponse getAdvancedSearchFilterResponse21 = null;
	                        org.wso2.carbon.registry.search.services.GetAdvancedSearchFilter wrappedParam =
                                                             (org.wso2.carbon.registry.search.services.GetAdvancedSearchFilter)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.registry.search.services.GetAdvancedSearchFilter.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getAdvancedSearchFilterResponse21 =
                                                   
                                                   
                                                         skel.getAdvancedSearchFilter(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getAdvancedSearchFilterResponse21, false, new javax.xml.namespace.QName("http://services.search.registry.carbon.wso2.org",
                                                    "getAdvancedSearchFilter"));
                                    
            } else {
              throw new java.lang.RuntimeException("method not found");
            }
        

        newMsgContext.setEnvelope(envelope);
        }
        } catch (SearchAdminServiceRegistryExceptionException e) {

            msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME,"SearchAdminServiceRegistryException");
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
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.search.services.GetMediaTypeSearch param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.search.services.GetMediaTypeSearch.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.search.services.GetMediaTypeSearchResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.search.services.GetMediaTypeSearchResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.search.services.SearchAdminServiceRegistryException param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.search.services.SearchAdminServiceRegistryException.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.search.services.GetSavedFilters param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.search.services.GetSavedFilters.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.search.services.GetSavedFiltersResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.search.services.GetSavedFiltersResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.search.services.DeleteFilter param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.search.services.DeleteFilter.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.search.services.SaveAdvancedSearchFilter param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.search.services.SaveAdvancedSearchFilter.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.search.services.GetSearchResults param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.search.services.GetSearchResults.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.search.services.GetSearchResultsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.search.services.GetSearchResultsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.search.services.GetAdvancedSearchResults param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.search.services.GetAdvancedSearchResults.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.search.services.GetAdvancedSearchResultsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.search.services.GetAdvancedSearchResultsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.search.services.GetAdvancedSearchFilter param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.search.services.GetAdvancedSearchFilter.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.search.services.GetAdvancedSearchFilterResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.search.services.GetAdvancedSearchFilterResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.registry.search.services.GetMediaTypeSearchResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.registry.search.services.GetMediaTypeSearchResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.registry.search.services.GetMediaTypeSearchResponse wrapgetMediaTypeSearch(){
                                org.wso2.carbon.registry.search.services.GetMediaTypeSearchResponse wrappedElement = new org.wso2.carbon.registry.search.services.GetMediaTypeSearchResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.registry.search.services.GetSavedFiltersResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.registry.search.services.GetSavedFiltersResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.registry.search.services.GetSavedFiltersResponse wrapgetSavedFilters(){
                                org.wso2.carbon.registry.search.services.GetSavedFiltersResponse wrappedElement = new org.wso2.carbon.registry.search.services.GetSavedFiltersResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.registry.search.services.GetSearchResultsResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.registry.search.services.GetSearchResultsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.registry.search.services.GetSearchResultsResponse wrapgetSearchResults(){
                                org.wso2.carbon.registry.search.services.GetSearchResultsResponse wrappedElement = new org.wso2.carbon.registry.search.services.GetSearchResultsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.registry.search.services.GetAdvancedSearchResultsResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.registry.search.services.GetAdvancedSearchResultsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.registry.search.services.GetAdvancedSearchResultsResponse wrapgetAdvancedSearchResults(){
                                org.wso2.carbon.registry.search.services.GetAdvancedSearchResultsResponse wrappedElement = new org.wso2.carbon.registry.search.services.GetAdvancedSearchResultsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.registry.search.services.GetAdvancedSearchFilterResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.registry.search.services.GetAdvancedSearchFilterResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.registry.search.services.GetAdvancedSearchFilterResponse wrapgetAdvancedSearchFilter(){
                                org.wso2.carbon.registry.search.services.GetAdvancedSearchFilterResponse wrappedElement = new org.wso2.carbon.registry.search.services.GetAdvancedSearchFilterResponse();
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
        
                if (org.wso2.carbon.registry.search.services.GetMediaTypeSearch.class.equals(type)){
                
                           return org.wso2.carbon.registry.search.services.GetMediaTypeSearch.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.search.services.GetMediaTypeSearchResponse.class.equals(type)){
                
                           return org.wso2.carbon.registry.search.services.GetMediaTypeSearchResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.search.services.SearchAdminServiceRegistryException.class.equals(type)){
                
                           return org.wso2.carbon.registry.search.services.SearchAdminServiceRegistryException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.search.services.GetSavedFilters.class.equals(type)){
                
                           return org.wso2.carbon.registry.search.services.GetSavedFilters.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.search.services.GetSavedFiltersResponse.class.equals(type)){
                
                           return org.wso2.carbon.registry.search.services.GetSavedFiltersResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.search.services.SearchAdminServiceRegistryException.class.equals(type)){
                
                           return org.wso2.carbon.registry.search.services.SearchAdminServiceRegistryException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.search.services.DeleteFilter.class.equals(type)){
                
                           return org.wso2.carbon.registry.search.services.DeleteFilter.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.search.services.SearchAdminServiceRegistryException.class.equals(type)){
                
                           return org.wso2.carbon.registry.search.services.SearchAdminServiceRegistryException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.search.services.SaveAdvancedSearchFilter.class.equals(type)){
                
                           return org.wso2.carbon.registry.search.services.SaveAdvancedSearchFilter.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.search.services.SearchAdminServiceRegistryException.class.equals(type)){
                
                           return org.wso2.carbon.registry.search.services.SearchAdminServiceRegistryException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.search.services.GetSearchResults.class.equals(type)){
                
                           return org.wso2.carbon.registry.search.services.GetSearchResults.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.search.services.GetSearchResultsResponse.class.equals(type)){
                
                           return org.wso2.carbon.registry.search.services.GetSearchResultsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.search.services.SearchAdminServiceRegistryException.class.equals(type)){
                
                           return org.wso2.carbon.registry.search.services.SearchAdminServiceRegistryException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.search.services.GetAdvancedSearchResults.class.equals(type)){
                
                           return org.wso2.carbon.registry.search.services.GetAdvancedSearchResults.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.search.services.GetAdvancedSearchResultsResponse.class.equals(type)){
                
                           return org.wso2.carbon.registry.search.services.GetAdvancedSearchResultsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.search.services.SearchAdminServiceRegistryException.class.equals(type)){
                
                           return org.wso2.carbon.registry.search.services.SearchAdminServiceRegistryException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.search.services.GetAdvancedSearchFilter.class.equals(type)){
                
                           return org.wso2.carbon.registry.search.services.GetAdvancedSearchFilter.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.search.services.GetAdvancedSearchFilterResponse.class.equals(type)){
                
                           return org.wso2.carbon.registry.search.services.GetAdvancedSearchFilterResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.search.services.SearchAdminServiceRegistryException.class.equals(type)){
                
                           return org.wso2.carbon.registry.search.services.SearchAdminServiceRegistryException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

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
    

/**
 * WSRegistryServiceMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */
        package org.wso2.carbon.registry.ws.api;

        /**
        *  WSRegistryServiceMessageReceiverInOut message receiver
        */

        public class WSRegistryServiceMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        WSRegistryServiceSkeletonInterface skel = (WSRegistryServiceSkeletonInterface)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){


        

            if("copy".equals(methodName)){
                
                org.wso2.carbon.registry.ws.api.CopyResponse copyResponse85 = null;
	                        org.wso2.carbon.registry.ws.api.Copy wrappedParam =
                                                             (org.wso2.carbon.registry.ws.api.Copy)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.registry.ws.api.Copy.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               copyResponse85 =
                                                   
                                                   
                                                         skel.copy(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), copyResponse85, false, new javax.xml.namespace.QName("http://api.ws.registry.carbon.wso2.org",
                                                    "copy"));
                                    } else 

            if("wSget".equals(methodName)){
                
                org.wso2.carbon.registry.ws.api.WSgetResponse wSgetResponse87 = null;
	                        org.wso2.carbon.registry.ws.api.WSget wrappedParam =
                                                             (org.wso2.carbon.registry.ws.api.WSget)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.registry.ws.api.WSget.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               wSgetResponse87 =
                                                   
                                                   
                                                         skel.wSget(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), wSgetResponse87, false, new javax.xml.namespace.QName("http://api.ws.registry.carbon.wso2.org",
                                                    "wSget"));
                                    } else 

            if("move".equals(methodName)){
                
                org.wso2.carbon.registry.ws.api.MoveResponse moveResponse89 = null;
	                        org.wso2.carbon.registry.ws.api.Move wrappedParam =
                                                             (org.wso2.carbon.registry.ws.api.Move)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.registry.ws.api.Move.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               moveResponse89 =
                                                   
                                                   
                                                         skel.move(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), moveResponse89, false, new javax.xml.namespace.QName("http://api.ws.registry.carbon.wso2.org",
                                                    "move"));
                                    } else 

            if("getAverageRating".equals(methodName)){
                
                org.wso2.carbon.registry.ws.api.GetAverageRatingResponse getAverageRatingResponse91 = null;
	                        org.wso2.carbon.registry.ws.api.GetAverageRating wrappedParam =
                                                             (org.wso2.carbon.registry.ws.api.GetAverageRating)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.registry.ws.api.GetAverageRating.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getAverageRatingResponse91 =
                                                   
                                                   
                                                         skel.getAverageRating(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getAverageRatingResponse91, false, new javax.xml.namespace.QName("http://api.ws.registry.carbon.wso2.org",
                                                    "getAverageRating"));
                                    } else 

            if("wSsearchContent".equals(methodName)){
                
                org.wso2.carbon.registry.ws.api.WSsearchContentResponse wSsearchContentResponse93 = null;
	                        org.wso2.carbon.registry.ws.api.WSsearchContent wrappedParam =
                                                             (org.wso2.carbon.registry.ws.api.WSsearchContent)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.registry.ws.api.WSsearchContent.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               wSsearchContentResponse93 =
                                                   
                                                   
                                                         skel.wSsearchContent(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), wSsearchContentResponse93, false, new javax.xml.namespace.QName("http://api.ws.registry.carbon.wso2.org",
                                                    "wSsearchContent"));
                                    } else 

            if("wSgetChildCollection".equals(methodName)){
                
                org.wso2.carbon.registry.ws.api.WSgetChildCollectionResponse wSgetChildCollectionResponse95 = null;
	                        org.wso2.carbon.registry.ws.api.WSgetChildCollection wrappedParam =
                                                             (org.wso2.carbon.registry.ws.api.WSgetChildCollection)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.registry.ws.api.WSgetChildCollection.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               wSgetChildCollectionResponse95 =
                                                   
                                                   
                                                         skel.wSgetChildCollection(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), wSgetChildCollectionResponse95, false, new javax.xml.namespace.QName("http://api.ws.registry.carbon.wso2.org",
                                                    "wSgetChildCollection"));
                                    } else 

            if("getAspectActions".equals(methodName)){
                
                org.wso2.carbon.registry.ws.api.GetAspectActionsResponse getAspectActionsResponse97 = null;
	                        org.wso2.carbon.registry.ws.api.GetAspectActions wrappedParam =
                                                             (org.wso2.carbon.registry.ws.api.GetAspectActions)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.registry.ws.api.GetAspectActions.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getAspectActionsResponse97 =
                                                   
                                                   
                                                         skel.getAspectActions(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getAspectActionsResponse97, false, new javax.xml.namespace.QName("http://api.ws.registry.carbon.wso2.org",
                                                    "getAspectActions"));
                                    } else 

            if("rename".equals(methodName)){
                
                org.wso2.carbon.registry.ws.api.RenameResponse renameResponse99 = null;
	                        org.wso2.carbon.registry.ws.api.Rename wrappedParam =
                                                             (org.wso2.carbon.registry.ws.api.Rename)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.registry.ws.api.Rename.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               renameResponse99 =
                                                   
                                                   
                                                         skel.rename(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), renameResponse99, false, new javax.xml.namespace.QName("http://api.ws.registry.carbon.wso2.org",
                                                    "rename"));
                                    } else 

            if("wSgetSingleComment".equals(methodName)){
                
                org.wso2.carbon.registry.ws.api.WSgetSingleCommentResponse wSgetSingleCommentResponse101 = null;
	                        org.wso2.carbon.registry.ws.api.WSgetSingleComment wrappedParam =
                                                             (org.wso2.carbon.registry.ws.api.WSgetSingleComment)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.registry.ws.api.WSgetSingleComment.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               wSgetSingleCommentResponse101 =
                                                   
                                                   
                                                         skel.wSgetSingleComment(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), wSgetSingleCommentResponse101, false, new javax.xml.namespace.QName("http://api.ws.registry.carbon.wso2.org",
                                                    "wSgetSingleComment"));
                                    } else 

            if("wSgetAssociations".equals(methodName)){
                
                org.wso2.carbon.registry.ws.api.WSgetAssociationsResponse wSgetAssociationsResponse103 = null;
	                        org.wso2.carbon.registry.ws.api.WSgetAssociations wrappedParam =
                                                             (org.wso2.carbon.registry.ws.api.WSgetAssociations)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.registry.ws.api.WSgetAssociations.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               wSgetAssociationsResponse103 =
                                                   
                                                   
                                                         skel.wSgetAssociations(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), wSgetAssociationsResponse103, false, new javax.xml.namespace.QName("http://api.ws.registry.carbon.wso2.org",
                                                    "wSgetAssociations"));
                                    } else 

            if("getContent".equals(methodName)){
                
                org.wso2.carbon.registry.ws.api.GetContentResponse getContentResponse105 = null;
	                        org.wso2.carbon.registry.ws.api.GetContent wrappedParam =
                                                             (org.wso2.carbon.registry.ws.api.GetContent)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.registry.ws.api.GetContent.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getContentResponse105 =
                                                   
                                                   
                                                         skel.getContent(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getContentResponse105, false, new javax.xml.namespace.QName("http://api.ws.registry.carbon.wso2.org",
                                                    "getContent"));
                                    } else 

            if("wSput".equals(methodName)){
                
                org.wso2.carbon.registry.ws.api.WSputResponse wSputResponse107 = null;
	                        org.wso2.carbon.registry.ws.api.WSput wrappedParam =
                                                             (org.wso2.carbon.registry.ws.api.WSput)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.registry.ws.api.WSput.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               wSputResponse107 =
                                                   
                                                   
                                                         skel.wSput(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), wSputResponse107, false, new javax.xml.namespace.QName("http://api.ws.registry.carbon.wso2.org",
                                                    "wSput"));
                                    } else 

            if("wsDump".equals(methodName)){
                
                org.wso2.carbon.registry.ws.api.WsDumpResponse wsDumpResponse109 = null;
	                        org.wso2.carbon.registry.ws.api.WsDump wrappedParam =
                                                             (org.wso2.carbon.registry.ws.api.WsDump)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.registry.ws.api.WsDump.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               wsDumpResponse109 =
                                                   
                                                   
                                                         skel.wsDump(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), wsDumpResponse109, false, new javax.xml.namespace.QName("http://api.ws.registry.carbon.wso2.org",
                                                    "wsDump"));
                                    } else 

            if("getChildCount".equals(methodName)){
                
                org.wso2.carbon.registry.ws.api.GetChildCountResponse getChildCountResponse111 = null;
	                        org.wso2.carbon.registry.ws.api.GetChildCount wrappedParam =
                                                             (org.wso2.carbon.registry.ws.api.GetChildCount)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.registry.ws.api.GetChildCount.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getChildCountResponse111 =
                                                   
                                                   
                                                         skel.getChildCount(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getChildCountResponse111, false, new javax.xml.namespace.QName("http://api.ws.registry.carbon.wso2.org",
                                                    "getChildCount"));
                                    } else 

            if("getAvailableAspects".equals(methodName)){
                
                org.wso2.carbon.registry.ws.api.GetAvailableAspectsResponse getAvailableAspectsResponse113 = null;
	                        org.wso2.carbon.registry.ws.api.GetAvailableAspects wrappedParam =
                                                             (org.wso2.carbon.registry.ws.api.GetAvailableAspects)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.registry.ws.api.GetAvailableAspects.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getAvailableAspectsResponse113 =
                                                   
                                                   
                                                         skel.getAvailableAspects(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getAvailableAspectsResponse113, false, new javax.xml.namespace.QName("http://api.ws.registry.carbon.wso2.org",
                                                    "getAvailableAspects"));
                                    } else 

            if("getRating".equals(methodName)){
                
                org.wso2.carbon.registry.ws.api.GetRatingResponse getRatingResponse115 = null;
	                        org.wso2.carbon.registry.ws.api.GetRating wrappedParam =
                                                             (org.wso2.carbon.registry.ws.api.GetRating)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.registry.ws.api.GetRating.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getRatingResponse115 =
                                                   
                                                   
                                                         skel.getRating(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getRatingResponse115, false, new javax.xml.namespace.QName("http://api.ws.registry.carbon.wso2.org",
                                                    "getRating"));
                                    } else 

            if("wSgetLogs".equals(methodName)){
                
                org.wso2.carbon.registry.ws.api.WSgetLogsResponse wSgetLogsResponse117 = null;
	                        org.wso2.carbon.registry.ws.api.WSgetLogs wrappedParam =
                                                             (org.wso2.carbon.registry.ws.api.WSgetLogs)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.registry.ws.api.WSgetLogs.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               wSgetLogsResponse117 =
                                                   
                                                   
                                                         skel.wSgetLogs(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), wSgetLogsResponse117, false, new javax.xml.namespace.QName("http://api.ws.registry.carbon.wso2.org",
                                                    "wSgetLogs"));
                                    } else 

            if("getCollectionContent".equals(methodName)){
                
                org.wso2.carbon.registry.ws.api.GetCollectionContentResponse getCollectionContentResponse119 = null;
	                        org.wso2.carbon.registry.ws.api.GetCollectionContent wrappedParam =
                                                             (org.wso2.carbon.registry.ws.api.GetCollectionContent)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.registry.ws.api.GetCollectionContent.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getCollectionContentResponse119 =
                                                   
                                                   
                                                         skel.getCollectionContent(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getCollectionContentResponse119, false, new javax.xml.namespace.QName("http://api.ws.registry.carbon.wso2.org",
                                                    "getCollectionContent"));
                                    } else 

            if("getVersions".equals(methodName)){
                
                org.wso2.carbon.registry.ws.api.GetVersionsResponse getVersionsResponse121 = null;
	                        org.wso2.carbon.registry.ws.api.GetVersions wrappedParam =
                                                             (org.wso2.carbon.registry.ws.api.GetVersions)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.registry.ws.api.GetVersions.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getVersionsResponse121 =
                                                   
                                                   
                                                         skel.getVersions(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getVersionsResponse121, false, new javax.xml.namespace.QName("http://api.ws.registry.carbon.wso2.org",
                                                    "getVersions"));
                                    } else 

            if("wSnewResource".equals(methodName)){
                
                org.wso2.carbon.registry.ws.api.WSnewResourceResponse wSnewResourceResponse123 = null;
	                        org.wso2.carbon.registry.ws.api.WSnewResource wrappedParam =
                                                             (org.wso2.carbon.registry.ws.api.WSnewResource)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.registry.ws.api.WSnewResource.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               wSnewResourceResponse123 =
                                                   
                                                   
                                                         skel.wSnewResource(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), wSnewResourceResponse123, false, new javax.xml.namespace.QName("http://api.ws.registry.carbon.wso2.org",
                                                    "wSnewResource"));
                                    } else 

            if("wSaddComment".equals(methodName)){
                
                org.wso2.carbon.registry.ws.api.WSaddCommentResponse wSaddCommentResponse125 = null;
	                        org.wso2.carbon.registry.ws.api.WSaddComment wrappedParam =
                                                             (org.wso2.carbon.registry.ws.api.WSaddComment)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.registry.ws.api.WSaddComment.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               wSaddCommentResponse125 =
                                                   
                                                   
                                                         skel.wSaddComment(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), wSaddCommentResponse125, false, new javax.xml.namespace.QName("http://api.ws.registry.carbon.wso2.org",
                                                    "wSaddComment"));
                                    } else 

            if("removeAspect".equals(methodName)){
                
                org.wso2.carbon.registry.ws.api.RemoveAspectResponse removeAspectResponse127 = null;
	                        org.wso2.carbon.registry.ws.api.RemoveAspect wrappedParam =
                                                             (org.wso2.carbon.registry.ws.api.RemoveAspect)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.registry.ws.api.RemoveAspect.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               removeAspectResponse127 =
                                                   
                                                   
                                                         skel.removeAspect(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), removeAspectResponse127, false, new javax.xml.namespace.QName("http://api.ws.registry.carbon.wso2.org",
                                                    "removeAspect"));
                                    } else 

            if("wSnewCollection".equals(methodName)){
                
                org.wso2.carbon.registry.ws.api.WSnewCollectionResponse wSnewCollectionResponse129 = null;
	                        org.wso2.carbon.registry.ws.api.WSnewCollection wrappedParam =
                                                             (org.wso2.carbon.registry.ws.api.WSnewCollection)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.registry.ws.api.WSnewCollection.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               wSnewCollectionResponse129 =
                                                   
                                                   
                                                         skel.wSnewCollection(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), wSnewCollectionResponse129, false, new javax.xml.namespace.QName("http://api.ws.registry.carbon.wso2.org",
                                                    "wSnewCollection"));
                                    } else 

            if("wSgetMetaData".equals(methodName)){
                
                org.wso2.carbon.registry.ws.api.WSgetMetaDataResponse wSgetMetaDataResponse131 = null;
	                        org.wso2.carbon.registry.ws.api.WSgetMetaData wrappedParam =
                                                             (org.wso2.carbon.registry.ws.api.WSgetMetaData)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.registry.ws.api.WSgetMetaData.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               wSgetMetaDataResponse131 =
                                                   
                                                   
                                                         skel.wSgetMetaData(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), wSgetMetaDataResponse131, false, new javax.xml.namespace.QName("http://api.ws.registry.carbon.wso2.org",
                                                    "wSgetMetaData"));
                                    } else 

            if("wSgetAllAssociations".equals(methodName)){
                
                org.wso2.carbon.registry.ws.api.WSgetAllAssociationsResponse wSgetAllAssociationsResponse133 = null;
	                        org.wso2.carbon.registry.ws.api.WSgetAllAssociations wrappedParam =
                                                             (org.wso2.carbon.registry.ws.api.WSgetAllAssociations)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.registry.ws.api.WSgetAllAssociations.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               wSgetAllAssociationsResponse133 =
                                                   
                                                   
                                                         skel.wSgetAllAssociations(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), wSgetAllAssociationsResponse133, false, new javax.xml.namespace.QName("http://api.ws.registry.carbon.wso2.org",
                                                    "wSgetAllAssociations"));
                                    } else 

            if("resourceExists".equals(methodName)){
                
                org.wso2.carbon.registry.ws.api.ResourceExistsResponse resourceExistsResponse135 = null;
	                        org.wso2.carbon.registry.ws.api.ResourceExists wrappedParam =
                                                             (org.wso2.carbon.registry.ws.api.ResourceExists)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.registry.ws.api.ResourceExists.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               resourceExistsResponse135 =
                                                   
                                                   
                                                         skel.resourceExists(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), resourceExistsResponse135, false, new javax.xml.namespace.QName("http://api.ws.registry.carbon.wso2.org",
                                                    "resourceExists"));
                                    } else 

            if("wSgetComments".equals(methodName)){
                
                org.wso2.carbon.registry.ws.api.WSgetCommentsResponse wSgetCommentsResponse137 = null;
	                        org.wso2.carbon.registry.ws.api.WSgetComments wrappedParam =
                                                             (org.wso2.carbon.registry.ws.api.WSgetComments)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.registry.ws.api.WSgetComments.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               wSgetCommentsResponse137 =
                                                   
                                                   
                                                         skel.wSgetComments(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), wSgetCommentsResponse137, false, new javax.xml.namespace.QName("http://api.ws.registry.carbon.wso2.org",
                                                    "wSgetComments"));
                                    } else 

            if("wSimportResource".equals(methodName)){
                
                org.wso2.carbon.registry.ws.api.WSimportResourceResponse wSimportResourceResponse139 = null;
	                        org.wso2.carbon.registry.ws.api.WSimportResource wrappedParam =
                                                             (org.wso2.carbon.registry.ws.api.WSimportResource)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.registry.ws.api.WSimportResource.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               wSimportResourceResponse139 =
                                                   
                                                   
                                                         skel.wSimportResource(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), wSimportResourceResponse139, false, new javax.xml.namespace.QName("http://api.ws.registry.carbon.wso2.org",
                                                    "wSimportResource"));
                                    } else 

            if("getEventingServiceURL".equals(methodName)){
                
                org.wso2.carbon.registry.ws.api.GetEventingServiceURLResponse getEventingServiceURLResponse141 = null;
	                        org.wso2.carbon.registry.ws.api.GetEventingServiceURL wrappedParam =
                                                             (org.wso2.carbon.registry.ws.api.GetEventingServiceURL)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.registry.ws.api.GetEventingServiceURL.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getEventingServiceURLResponse141 =
                                                   
                                                   
                                                         skel.getEventingServiceURL(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getEventingServiceURLResponse141, false, new javax.xml.namespace.QName("http://api.ws.registry.carbon.wso2.org",
                                                    "getEventingServiceURL"));
                                    } else 

            if("wSgetTags".equals(methodName)){
                
                org.wso2.carbon.registry.ws.api.WSgetTagsResponse wSgetTagsResponse143 = null;
	                        org.wso2.carbon.registry.ws.api.WSgetTags wrappedParam =
                                                             (org.wso2.carbon.registry.ws.api.WSgetTags)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.registry.ws.api.WSgetTags.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               wSgetTagsResponse143 =
                                                   
                                                   
                                                         skel.wSgetTags(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), wSgetTagsResponse143, false, new javax.xml.namespace.QName("http://api.ws.registry.carbon.wso2.org",
                                                    "wSgetTags"));
                                    } else 

            if("wSgetResourcePathsWithTag".equals(methodName)){
                
                org.wso2.carbon.registry.ws.api.WSgetResourcePathsWithTagResponse wSgetResourcePathsWithTagResponse145 = null;
	                        org.wso2.carbon.registry.ws.api.WSgetResourcePathsWithTag wrappedParam =
                                                             (org.wso2.carbon.registry.ws.api.WSgetResourcePathsWithTag)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.registry.ws.api.WSgetResourcePathsWithTag.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               wSgetResourcePathsWithTagResponse145 =
                                                   
                                                   
                                                         skel.wSgetResourcePathsWithTag(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), wSgetResourcePathsWithTagResponse145, false, new javax.xml.namespace.QName("http://api.ws.registry.carbon.wso2.org",
                                                    "wSgetResourcePathsWithTag"));
                                    } else 

            if("wSgetWithPageSize".equals(methodName)){
                
                org.wso2.carbon.registry.ws.api.WSgetWithPageSizeResponse wSgetWithPageSizeResponse147 = null;
	                        org.wso2.carbon.registry.ws.api.WSgetWithPageSize wrappedParam =
                                                             (org.wso2.carbon.registry.ws.api.WSgetWithPageSize)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.registry.ws.api.WSgetWithPageSize.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               wSgetWithPageSizeResponse147 =
                                                   
                                                   
                                                         skel.wSgetWithPageSize(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), wSgetWithPageSizeResponse147, false, new javax.xml.namespace.QName("http://api.ws.registry.carbon.wso2.org",
                                                    "wSgetWithPageSize"));
                                    } else 

            if("wSexecuteQuery".equals(methodName)){
                
                org.wso2.carbon.registry.ws.api.WSexecuteQueryResponse wSexecuteQueryResponse149 = null;
	                        org.wso2.carbon.registry.ws.api.WSexecuteQuery wrappedParam =
                                                             (org.wso2.carbon.registry.ws.api.WSexecuteQuery)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.registry.ws.api.WSexecuteQuery.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               wSexecuteQueryResponse149 =
                                                   
                                                   
                                                         skel.wSexecuteQuery(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), wSexecuteQueryResponse149, false, new javax.xml.namespace.QName("http://api.ws.registry.carbon.wso2.org",
                                                    "wSexecuteQuery"));
                                    
            } else {
              throw new java.lang.RuntimeException("method not found");
            }
        

        newMsgContext.setEnvelope(envelope);
        }
        } catch (WSRegistryServiceRegistryExceptionException e) {

            msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME,"WSRegistryServiceRegistryException");
            org.apache.axis2.AxisFault f = createAxisFault(e);
            if (e.getFaultMessage() != null){
                f.setDetail(toOM(e.getFaultMessage(),false));
            }
            throw f;
            }
         catch (WSRegistryServiceIOExceptionException e) {

            msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME,"WSRegistryServiceIOException");
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
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.ws.api.CreateVersion param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.ws.api.CreateVersion.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.ws.api.WSRegistryServiceRegistryException param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.ws.api.WSRegistryServiceRegistryException.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.ws.api.Copy param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.ws.api.Copy.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.ws.api.CopyResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.ws.api.CopyResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.ws.api.RemoveComment param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.ws.api.RemoveComment.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.ws.api.WSget param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.ws.api.WSget.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.ws.api.WSgetResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.ws.api.WSgetResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.ws.api.Move param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.ws.api.Move.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.ws.api.MoveResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.ws.api.MoveResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.ws.api.GetAverageRating param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.ws.api.GetAverageRating.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.ws.api.GetAverageRatingResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.ws.api.GetAverageRatingResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.ws.api.AssociateAspect param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.ws.api.AssociateAspect.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.ws.api.WSsearchContent param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.ws.api.WSsearchContent.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.ws.api.WSsearchContentResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.ws.api.WSsearchContentResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.ws.api.WSgetChildCollection param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.ws.api.WSgetChildCollection.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.ws.api.WSgetChildCollectionResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.ws.api.WSgetChildCollectionResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.ws.api.GetAspectActions param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.ws.api.GetAspectActions.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.ws.api.GetAspectActionsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.ws.api.GetAspectActionsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.ws.api.Rename param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.ws.api.Rename.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.ws.api.RenameResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.ws.api.RenameResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.ws.api.WSgetSingleComment param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.ws.api.WSgetSingleComment.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.ws.api.WSgetSingleCommentResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.ws.api.WSgetSingleCommentResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.ws.api.WSgetAssociations param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.ws.api.WSgetAssociations.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.ws.api.WSgetAssociationsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.ws.api.WSgetAssociationsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.ws.api.GetContent param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.ws.api.GetContent.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.ws.api.GetContentResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.ws.api.GetContentResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.ws.api.WSput param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.ws.api.WSput.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.ws.api.WSputResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.ws.api.WSputResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.ws.api.WSRegistryServiceIOException param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.ws.api.WSRegistryServiceIOException.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.ws.api.WsDump param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.ws.api.WsDump.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.ws.api.WsDumpResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.ws.api.WsDumpResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.ws.api.GetChildCount param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.ws.api.GetChildCount.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.ws.api.GetChildCountResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.ws.api.GetChildCountResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.ws.api.RemoveTag param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.ws.api.RemoveTag.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.ws.api.GetAvailableAspects param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.ws.api.GetAvailableAspects.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.ws.api.GetAvailableAspectsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.ws.api.GetAvailableAspectsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.ws.api.WsRestore param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.ws.api.WsRestore.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.ws.api.GetRating param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.ws.api.GetRating.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.ws.api.GetRatingResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.ws.api.GetRatingResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.ws.api.WSgetLogs param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.ws.api.WSgetLogs.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.ws.api.WSgetLogsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.ws.api.WSgetLogsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.ws.api.GetCollectionContent param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.ws.api.GetCollectionContent.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.ws.api.GetCollectionContentResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.ws.api.GetCollectionContentResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.ws.api.GetVersions param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.ws.api.GetVersions.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.ws.api.GetVersionsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.ws.api.GetVersionsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.ws.api.WSnewResource param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.ws.api.WSnewResource.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.ws.api.WSnewResourceResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.ws.api.WSnewResourceResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.ws.api.RemoveLink param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.ws.api.RemoveLink.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.ws.api.WSaddComment param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.ws.api.WSaddComment.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.ws.api.WSaddCommentResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.ws.api.WSaddCommentResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.ws.api.ApplyTag param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.ws.api.ApplyTag.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.ws.api.SetTenantId param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.ws.api.SetTenantId.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.ws.api.RateResource param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.ws.api.RateResource.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.ws.api.RemoveAspect param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.ws.api.RemoveAspect.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.ws.api.RemoveAspectResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.ws.api.RemoveAspectResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.ws.api.WSnewCollection param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.ws.api.WSnewCollection.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.ws.api.WSnewCollectionResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.ws.api.WSnewCollectionResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.ws.api.WSgetMetaData param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.ws.api.WSgetMetaData.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.ws.api.WSgetMetaDataResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.ws.api.WSgetMetaDataResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.ws.api.RemoveAssociation param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.ws.api.RemoveAssociation.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.ws.api.EditComment param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.ws.api.EditComment.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.ws.api.Delete param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.ws.api.Delete.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.ws.api.WSgetAllAssociations param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.ws.api.WSgetAllAssociations.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.ws.api.WSgetAllAssociationsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.ws.api.WSgetAllAssociationsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.ws.api.ResourceExists param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.ws.api.ResourceExists.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.ws.api.ResourceExistsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.ws.api.ResourceExistsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.ws.api.SetEventingServiceURL param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.ws.api.SetEventingServiceURL.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.ws.api.InvokeAspectNoParam param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.ws.api.InvokeAspectNoParam.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.ws.api.WSgetComments param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.ws.api.WSgetComments.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.ws.api.WSgetCommentsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.ws.api.WSgetCommentsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.ws.api.WSimportResource param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.ws.api.WSimportResource.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.ws.api.WSimportResourceResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.ws.api.WSimportResourceResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.ws.api.GetEventingServiceURL param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.ws.api.GetEventingServiceURL.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.ws.api.GetEventingServiceURLResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.ws.api.GetEventingServiceURLResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.ws.api.WSgetTags param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.ws.api.WSgetTags.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.ws.api.WSgetTagsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.ws.api.WSgetTagsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.ws.api.WSgetResourcePathsWithTag param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.ws.api.WSgetResourcePathsWithTag.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.ws.api.WSgetResourcePathsWithTagResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.ws.api.WSgetResourcePathsWithTagResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.ws.api.InvokeAspectWithParam param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.ws.api.InvokeAspectWithParam.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.ws.api.CreateLinkWithSubTarget param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.ws.api.CreateLinkWithSubTarget.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.ws.api.RestoreVersion param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.ws.api.RestoreVersion.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.ws.api.WSgetWithPageSize param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.ws.api.WSgetWithPageSize.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.ws.api.WSgetWithPageSizeResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.ws.api.WSgetWithPageSizeResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.ws.api.AddAssociation param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.ws.api.AddAssociation.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.ws.api.WSexecuteQuery param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.ws.api.WSexecuteQuery.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.ws.api.WSexecuteQueryResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.ws.api.WSexecuteQueryResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.registry.ws.api.CopyResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.registry.ws.api.CopyResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.registry.ws.api.CopyResponse wrapcopy(){
                                org.wso2.carbon.registry.ws.api.CopyResponse wrappedElement = new org.wso2.carbon.registry.ws.api.CopyResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.registry.ws.api.WSgetResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.registry.ws.api.WSgetResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.registry.ws.api.WSgetResponse wrapWSget(){
                                org.wso2.carbon.registry.ws.api.WSgetResponse wrappedElement = new org.wso2.carbon.registry.ws.api.WSgetResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.registry.ws.api.MoveResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.registry.ws.api.MoveResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.registry.ws.api.MoveResponse wrapmove(){
                                org.wso2.carbon.registry.ws.api.MoveResponse wrappedElement = new org.wso2.carbon.registry.ws.api.MoveResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.registry.ws.api.GetAverageRatingResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.registry.ws.api.GetAverageRatingResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.registry.ws.api.GetAverageRatingResponse wrapgetAverageRating(){
                                org.wso2.carbon.registry.ws.api.GetAverageRatingResponse wrappedElement = new org.wso2.carbon.registry.ws.api.GetAverageRatingResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.registry.ws.api.WSsearchContentResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.registry.ws.api.WSsearchContentResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.registry.ws.api.WSsearchContentResponse wrapWSsearchContent(){
                                org.wso2.carbon.registry.ws.api.WSsearchContentResponse wrappedElement = new org.wso2.carbon.registry.ws.api.WSsearchContentResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.registry.ws.api.WSgetChildCollectionResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.registry.ws.api.WSgetChildCollectionResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.registry.ws.api.WSgetChildCollectionResponse wrapWSgetChildCollection(){
                                org.wso2.carbon.registry.ws.api.WSgetChildCollectionResponse wrappedElement = new org.wso2.carbon.registry.ws.api.WSgetChildCollectionResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.registry.ws.api.GetAspectActionsResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.registry.ws.api.GetAspectActionsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.registry.ws.api.GetAspectActionsResponse wrapgetAspectActions(){
                                org.wso2.carbon.registry.ws.api.GetAspectActionsResponse wrappedElement = new org.wso2.carbon.registry.ws.api.GetAspectActionsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.registry.ws.api.RenameResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.registry.ws.api.RenameResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.registry.ws.api.RenameResponse wraprename(){
                                org.wso2.carbon.registry.ws.api.RenameResponse wrappedElement = new org.wso2.carbon.registry.ws.api.RenameResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.registry.ws.api.WSgetSingleCommentResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.registry.ws.api.WSgetSingleCommentResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.registry.ws.api.WSgetSingleCommentResponse wrapWSgetSingleComment(){
                                org.wso2.carbon.registry.ws.api.WSgetSingleCommentResponse wrappedElement = new org.wso2.carbon.registry.ws.api.WSgetSingleCommentResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.registry.ws.api.WSgetAssociationsResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.registry.ws.api.WSgetAssociationsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.registry.ws.api.WSgetAssociationsResponse wrapWSgetAssociations(){
                                org.wso2.carbon.registry.ws.api.WSgetAssociationsResponse wrappedElement = new org.wso2.carbon.registry.ws.api.WSgetAssociationsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.registry.ws.api.GetContentResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.registry.ws.api.GetContentResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.registry.ws.api.GetContentResponse wrapgetContent(){
                                org.wso2.carbon.registry.ws.api.GetContentResponse wrappedElement = new org.wso2.carbon.registry.ws.api.GetContentResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.registry.ws.api.WSputResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.registry.ws.api.WSputResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.registry.ws.api.WSputResponse wrapWSput(){
                                org.wso2.carbon.registry.ws.api.WSputResponse wrappedElement = new org.wso2.carbon.registry.ws.api.WSputResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.registry.ws.api.WsDumpResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.registry.ws.api.WsDumpResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.registry.ws.api.WsDumpResponse wrapwsDump(){
                                org.wso2.carbon.registry.ws.api.WsDumpResponse wrappedElement = new org.wso2.carbon.registry.ws.api.WsDumpResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.registry.ws.api.GetChildCountResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.registry.ws.api.GetChildCountResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.registry.ws.api.GetChildCountResponse wrapgetChildCount(){
                                org.wso2.carbon.registry.ws.api.GetChildCountResponse wrappedElement = new org.wso2.carbon.registry.ws.api.GetChildCountResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.registry.ws.api.GetAvailableAspectsResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.registry.ws.api.GetAvailableAspectsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.registry.ws.api.GetAvailableAspectsResponse wrapgetAvailableAspects(){
                                org.wso2.carbon.registry.ws.api.GetAvailableAspectsResponse wrappedElement = new org.wso2.carbon.registry.ws.api.GetAvailableAspectsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.registry.ws.api.GetRatingResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.registry.ws.api.GetRatingResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.registry.ws.api.GetRatingResponse wrapgetRating(){
                                org.wso2.carbon.registry.ws.api.GetRatingResponse wrappedElement = new org.wso2.carbon.registry.ws.api.GetRatingResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.registry.ws.api.WSgetLogsResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.registry.ws.api.WSgetLogsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.registry.ws.api.WSgetLogsResponse wrapWSgetLogs(){
                                org.wso2.carbon.registry.ws.api.WSgetLogsResponse wrappedElement = new org.wso2.carbon.registry.ws.api.WSgetLogsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.registry.ws.api.GetCollectionContentResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.registry.ws.api.GetCollectionContentResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.registry.ws.api.GetCollectionContentResponse wrapgetCollectionContent(){
                                org.wso2.carbon.registry.ws.api.GetCollectionContentResponse wrappedElement = new org.wso2.carbon.registry.ws.api.GetCollectionContentResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.registry.ws.api.GetVersionsResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.registry.ws.api.GetVersionsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.registry.ws.api.GetVersionsResponse wrapgetVersions(){
                                org.wso2.carbon.registry.ws.api.GetVersionsResponse wrappedElement = new org.wso2.carbon.registry.ws.api.GetVersionsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.registry.ws.api.WSnewResourceResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.registry.ws.api.WSnewResourceResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.registry.ws.api.WSnewResourceResponse wrapWSnewResource(){
                                org.wso2.carbon.registry.ws.api.WSnewResourceResponse wrappedElement = new org.wso2.carbon.registry.ws.api.WSnewResourceResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.registry.ws.api.WSaddCommentResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.registry.ws.api.WSaddCommentResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.registry.ws.api.WSaddCommentResponse wrapWSaddComment(){
                                org.wso2.carbon.registry.ws.api.WSaddCommentResponse wrappedElement = new org.wso2.carbon.registry.ws.api.WSaddCommentResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.registry.ws.api.RemoveAspectResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.registry.ws.api.RemoveAspectResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.registry.ws.api.RemoveAspectResponse wrapremoveAspect(){
                                org.wso2.carbon.registry.ws.api.RemoveAspectResponse wrappedElement = new org.wso2.carbon.registry.ws.api.RemoveAspectResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.registry.ws.api.WSnewCollectionResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.registry.ws.api.WSnewCollectionResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.registry.ws.api.WSnewCollectionResponse wrapWSnewCollection(){
                                org.wso2.carbon.registry.ws.api.WSnewCollectionResponse wrappedElement = new org.wso2.carbon.registry.ws.api.WSnewCollectionResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.registry.ws.api.WSgetMetaDataResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.registry.ws.api.WSgetMetaDataResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.registry.ws.api.WSgetMetaDataResponse wrapWSgetMetaData(){
                                org.wso2.carbon.registry.ws.api.WSgetMetaDataResponse wrappedElement = new org.wso2.carbon.registry.ws.api.WSgetMetaDataResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.registry.ws.api.WSgetAllAssociationsResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.registry.ws.api.WSgetAllAssociationsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.registry.ws.api.WSgetAllAssociationsResponse wrapWSgetAllAssociations(){
                                org.wso2.carbon.registry.ws.api.WSgetAllAssociationsResponse wrappedElement = new org.wso2.carbon.registry.ws.api.WSgetAllAssociationsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.registry.ws.api.ResourceExistsResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.registry.ws.api.ResourceExistsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.registry.ws.api.ResourceExistsResponse wrapresourceExists(){
                                org.wso2.carbon.registry.ws.api.ResourceExistsResponse wrappedElement = new org.wso2.carbon.registry.ws.api.ResourceExistsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.registry.ws.api.WSgetCommentsResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.registry.ws.api.WSgetCommentsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.registry.ws.api.WSgetCommentsResponse wrapWSgetComments(){
                                org.wso2.carbon.registry.ws.api.WSgetCommentsResponse wrappedElement = new org.wso2.carbon.registry.ws.api.WSgetCommentsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.registry.ws.api.WSimportResourceResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.registry.ws.api.WSimportResourceResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.registry.ws.api.WSimportResourceResponse wrapWSimportResource(){
                                org.wso2.carbon.registry.ws.api.WSimportResourceResponse wrappedElement = new org.wso2.carbon.registry.ws.api.WSimportResourceResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.registry.ws.api.GetEventingServiceURLResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.registry.ws.api.GetEventingServiceURLResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.registry.ws.api.GetEventingServiceURLResponse wrapgetEventingServiceURL(){
                                org.wso2.carbon.registry.ws.api.GetEventingServiceURLResponse wrappedElement = new org.wso2.carbon.registry.ws.api.GetEventingServiceURLResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.registry.ws.api.WSgetTagsResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.registry.ws.api.WSgetTagsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.registry.ws.api.WSgetTagsResponse wrapWSgetTags(){
                                org.wso2.carbon.registry.ws.api.WSgetTagsResponse wrappedElement = new org.wso2.carbon.registry.ws.api.WSgetTagsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.registry.ws.api.WSgetResourcePathsWithTagResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.registry.ws.api.WSgetResourcePathsWithTagResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.registry.ws.api.WSgetResourcePathsWithTagResponse wrapWSgetResourcePathsWithTag(){
                                org.wso2.carbon.registry.ws.api.WSgetResourcePathsWithTagResponse wrappedElement = new org.wso2.carbon.registry.ws.api.WSgetResourcePathsWithTagResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.registry.ws.api.WSgetWithPageSizeResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.registry.ws.api.WSgetWithPageSizeResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.registry.ws.api.WSgetWithPageSizeResponse wrapWSgetWithPageSize(){
                                org.wso2.carbon.registry.ws.api.WSgetWithPageSizeResponse wrappedElement = new org.wso2.carbon.registry.ws.api.WSgetWithPageSizeResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.registry.ws.api.WSexecuteQueryResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.registry.ws.api.WSexecuteQueryResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.registry.ws.api.WSexecuteQueryResponse wrapWSexecuteQuery(){
                                org.wso2.carbon.registry.ws.api.WSexecuteQueryResponse wrappedElement = new org.wso2.carbon.registry.ws.api.WSexecuteQueryResponse();
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
        
                if (org.wso2.carbon.registry.ws.api.CreateVersion.class.equals(type)){
                
                           return org.wso2.carbon.registry.ws.api.CreateVersion.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.ws.api.WSRegistryServiceRegistryException.class.equals(type)){
                
                           return org.wso2.carbon.registry.ws.api.WSRegistryServiceRegistryException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.ws.api.Copy.class.equals(type)){
                
                           return org.wso2.carbon.registry.ws.api.Copy.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.ws.api.CopyResponse.class.equals(type)){
                
                           return org.wso2.carbon.registry.ws.api.CopyResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.ws.api.WSRegistryServiceRegistryException.class.equals(type)){
                
                           return org.wso2.carbon.registry.ws.api.WSRegistryServiceRegistryException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.ws.api.RemoveComment.class.equals(type)){
                
                           return org.wso2.carbon.registry.ws.api.RemoveComment.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.ws.api.WSRegistryServiceRegistryException.class.equals(type)){
                
                           return org.wso2.carbon.registry.ws.api.WSRegistryServiceRegistryException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.ws.api.WSget.class.equals(type)){
                
                           return org.wso2.carbon.registry.ws.api.WSget.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.ws.api.WSgetResponse.class.equals(type)){
                
                           return org.wso2.carbon.registry.ws.api.WSgetResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.ws.api.WSRegistryServiceRegistryException.class.equals(type)){
                
                           return org.wso2.carbon.registry.ws.api.WSRegistryServiceRegistryException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.ws.api.Move.class.equals(type)){
                
                           return org.wso2.carbon.registry.ws.api.Move.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.ws.api.MoveResponse.class.equals(type)){
                
                           return org.wso2.carbon.registry.ws.api.MoveResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.ws.api.WSRegistryServiceRegistryException.class.equals(type)){
                
                           return org.wso2.carbon.registry.ws.api.WSRegistryServiceRegistryException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.ws.api.GetAverageRating.class.equals(type)){
                
                           return org.wso2.carbon.registry.ws.api.GetAverageRating.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.ws.api.GetAverageRatingResponse.class.equals(type)){
                
                           return org.wso2.carbon.registry.ws.api.GetAverageRatingResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.ws.api.WSRegistryServiceRegistryException.class.equals(type)){
                
                           return org.wso2.carbon.registry.ws.api.WSRegistryServiceRegistryException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.ws.api.AssociateAspect.class.equals(type)){
                
                           return org.wso2.carbon.registry.ws.api.AssociateAspect.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.ws.api.WSRegistryServiceRegistryException.class.equals(type)){
                
                           return org.wso2.carbon.registry.ws.api.WSRegistryServiceRegistryException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.ws.api.WSsearchContent.class.equals(type)){
                
                           return org.wso2.carbon.registry.ws.api.WSsearchContent.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.ws.api.WSsearchContentResponse.class.equals(type)){
                
                           return org.wso2.carbon.registry.ws.api.WSsearchContentResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.ws.api.WSRegistryServiceRegistryException.class.equals(type)){
                
                           return org.wso2.carbon.registry.ws.api.WSRegistryServiceRegistryException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.ws.api.WSgetChildCollection.class.equals(type)){
                
                           return org.wso2.carbon.registry.ws.api.WSgetChildCollection.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.ws.api.WSgetChildCollectionResponse.class.equals(type)){
                
                           return org.wso2.carbon.registry.ws.api.WSgetChildCollectionResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.ws.api.WSRegistryServiceRegistryException.class.equals(type)){
                
                           return org.wso2.carbon.registry.ws.api.WSRegistryServiceRegistryException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.ws.api.GetAspectActions.class.equals(type)){
                
                           return org.wso2.carbon.registry.ws.api.GetAspectActions.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.ws.api.GetAspectActionsResponse.class.equals(type)){
                
                           return org.wso2.carbon.registry.ws.api.GetAspectActionsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.ws.api.WSRegistryServiceRegistryException.class.equals(type)){
                
                           return org.wso2.carbon.registry.ws.api.WSRegistryServiceRegistryException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.ws.api.Rename.class.equals(type)){
                
                           return org.wso2.carbon.registry.ws.api.Rename.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.ws.api.RenameResponse.class.equals(type)){
                
                           return org.wso2.carbon.registry.ws.api.RenameResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.ws.api.WSRegistryServiceRegistryException.class.equals(type)){
                
                           return org.wso2.carbon.registry.ws.api.WSRegistryServiceRegistryException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.ws.api.WSgetSingleComment.class.equals(type)){
                
                           return org.wso2.carbon.registry.ws.api.WSgetSingleComment.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.ws.api.WSgetSingleCommentResponse.class.equals(type)){
                
                           return org.wso2.carbon.registry.ws.api.WSgetSingleCommentResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.ws.api.WSRegistryServiceRegistryException.class.equals(type)){
                
                           return org.wso2.carbon.registry.ws.api.WSRegistryServiceRegistryException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.ws.api.WSgetAssociations.class.equals(type)){
                
                           return org.wso2.carbon.registry.ws.api.WSgetAssociations.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.ws.api.WSgetAssociationsResponse.class.equals(type)){
                
                           return org.wso2.carbon.registry.ws.api.WSgetAssociationsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.ws.api.WSRegistryServiceRegistryException.class.equals(type)){
                
                           return org.wso2.carbon.registry.ws.api.WSRegistryServiceRegistryException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.ws.api.GetContent.class.equals(type)){
                
                           return org.wso2.carbon.registry.ws.api.GetContent.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.ws.api.GetContentResponse.class.equals(type)){
                
                           return org.wso2.carbon.registry.ws.api.GetContentResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.ws.api.WSRegistryServiceRegistryException.class.equals(type)){
                
                           return org.wso2.carbon.registry.ws.api.WSRegistryServiceRegistryException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.ws.api.WSput.class.equals(type)){
                
                           return org.wso2.carbon.registry.ws.api.WSput.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.ws.api.WSputResponse.class.equals(type)){
                
                           return org.wso2.carbon.registry.ws.api.WSputResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.ws.api.WSRegistryServiceRegistryException.class.equals(type)){
                
                           return org.wso2.carbon.registry.ws.api.WSRegistryServiceRegistryException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.ws.api.WSRegistryServiceIOException.class.equals(type)){
                
                           return org.wso2.carbon.registry.ws.api.WSRegistryServiceIOException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.ws.api.WsDump.class.equals(type)){
                
                           return org.wso2.carbon.registry.ws.api.WsDump.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.ws.api.WsDumpResponse.class.equals(type)){
                
                           return org.wso2.carbon.registry.ws.api.WsDumpResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.ws.api.WSRegistryServiceRegistryException.class.equals(type)){
                
                           return org.wso2.carbon.registry.ws.api.WSRegistryServiceRegistryException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.ws.api.GetChildCount.class.equals(type)){
                
                           return org.wso2.carbon.registry.ws.api.GetChildCount.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.ws.api.GetChildCountResponse.class.equals(type)){
                
                           return org.wso2.carbon.registry.ws.api.GetChildCountResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.ws.api.WSRegistryServiceRegistryException.class.equals(type)){
                
                           return org.wso2.carbon.registry.ws.api.WSRegistryServiceRegistryException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.ws.api.RemoveTag.class.equals(type)){
                
                           return org.wso2.carbon.registry.ws.api.RemoveTag.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.ws.api.WSRegistryServiceRegistryException.class.equals(type)){
                
                           return org.wso2.carbon.registry.ws.api.WSRegistryServiceRegistryException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.ws.api.GetAvailableAspects.class.equals(type)){
                
                           return org.wso2.carbon.registry.ws.api.GetAvailableAspects.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.ws.api.GetAvailableAspectsResponse.class.equals(type)){
                
                           return org.wso2.carbon.registry.ws.api.GetAvailableAspectsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.ws.api.WsRestore.class.equals(type)){
                
                           return org.wso2.carbon.registry.ws.api.WsRestore.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.ws.api.WSRegistryServiceRegistryException.class.equals(type)){
                
                           return org.wso2.carbon.registry.ws.api.WSRegistryServiceRegistryException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.ws.api.GetRating.class.equals(type)){
                
                           return org.wso2.carbon.registry.ws.api.GetRating.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.ws.api.GetRatingResponse.class.equals(type)){
                
                           return org.wso2.carbon.registry.ws.api.GetRatingResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.ws.api.WSRegistryServiceRegistryException.class.equals(type)){
                
                           return org.wso2.carbon.registry.ws.api.WSRegistryServiceRegistryException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.ws.api.WSgetLogs.class.equals(type)){
                
                           return org.wso2.carbon.registry.ws.api.WSgetLogs.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.ws.api.WSgetLogsResponse.class.equals(type)){
                
                           return org.wso2.carbon.registry.ws.api.WSgetLogsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.ws.api.WSRegistryServiceRegistryException.class.equals(type)){
                
                           return org.wso2.carbon.registry.ws.api.WSRegistryServiceRegistryException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.ws.api.GetCollectionContent.class.equals(type)){
                
                           return org.wso2.carbon.registry.ws.api.GetCollectionContent.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.ws.api.GetCollectionContentResponse.class.equals(type)){
                
                           return org.wso2.carbon.registry.ws.api.GetCollectionContentResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.ws.api.WSRegistryServiceRegistryException.class.equals(type)){
                
                           return org.wso2.carbon.registry.ws.api.WSRegistryServiceRegistryException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.ws.api.GetVersions.class.equals(type)){
                
                           return org.wso2.carbon.registry.ws.api.GetVersions.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.ws.api.GetVersionsResponse.class.equals(type)){
                
                           return org.wso2.carbon.registry.ws.api.GetVersionsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.ws.api.WSRegistryServiceRegistryException.class.equals(type)){
                
                           return org.wso2.carbon.registry.ws.api.WSRegistryServiceRegistryException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.ws.api.WSnewResource.class.equals(type)){
                
                           return org.wso2.carbon.registry.ws.api.WSnewResource.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.ws.api.WSnewResourceResponse.class.equals(type)){
                
                           return org.wso2.carbon.registry.ws.api.WSnewResourceResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.ws.api.WSRegistryServiceRegistryException.class.equals(type)){
                
                           return org.wso2.carbon.registry.ws.api.WSRegistryServiceRegistryException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.ws.api.RemoveLink.class.equals(type)){
                
                           return org.wso2.carbon.registry.ws.api.RemoveLink.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.ws.api.WSRegistryServiceRegistryException.class.equals(type)){
                
                           return org.wso2.carbon.registry.ws.api.WSRegistryServiceRegistryException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.ws.api.WSaddComment.class.equals(type)){
                
                           return org.wso2.carbon.registry.ws.api.WSaddComment.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.ws.api.WSaddCommentResponse.class.equals(type)){
                
                           return org.wso2.carbon.registry.ws.api.WSaddCommentResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.ws.api.WSRegistryServiceRegistryException.class.equals(type)){
                
                           return org.wso2.carbon.registry.ws.api.WSRegistryServiceRegistryException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.ws.api.ApplyTag.class.equals(type)){
                
                           return org.wso2.carbon.registry.ws.api.ApplyTag.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.ws.api.WSRegistryServiceRegistryException.class.equals(type)){
                
                           return org.wso2.carbon.registry.ws.api.WSRegistryServiceRegistryException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.ws.api.SetTenantId.class.equals(type)){
                
                           return org.wso2.carbon.registry.ws.api.SetTenantId.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.ws.api.WSRegistryServiceRegistryException.class.equals(type)){
                
                           return org.wso2.carbon.registry.ws.api.WSRegistryServiceRegistryException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.ws.api.RateResource.class.equals(type)){
                
                           return org.wso2.carbon.registry.ws.api.RateResource.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.ws.api.WSRegistryServiceRegistryException.class.equals(type)){
                
                           return org.wso2.carbon.registry.ws.api.WSRegistryServiceRegistryException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.ws.api.RemoveAspect.class.equals(type)){
                
                           return org.wso2.carbon.registry.ws.api.RemoveAspect.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.ws.api.RemoveAspectResponse.class.equals(type)){
                
                           return org.wso2.carbon.registry.ws.api.RemoveAspectResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.ws.api.WSRegistryServiceRegistryException.class.equals(type)){
                
                           return org.wso2.carbon.registry.ws.api.WSRegistryServiceRegistryException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.ws.api.WSnewCollection.class.equals(type)){
                
                           return org.wso2.carbon.registry.ws.api.WSnewCollection.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.ws.api.WSnewCollectionResponse.class.equals(type)){
                
                           return org.wso2.carbon.registry.ws.api.WSnewCollectionResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.ws.api.WSRegistryServiceRegistryException.class.equals(type)){
                
                           return org.wso2.carbon.registry.ws.api.WSRegistryServiceRegistryException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.ws.api.WSgetMetaData.class.equals(type)){
                
                           return org.wso2.carbon.registry.ws.api.WSgetMetaData.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.ws.api.WSgetMetaDataResponse.class.equals(type)){
                
                           return org.wso2.carbon.registry.ws.api.WSgetMetaDataResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.ws.api.WSRegistryServiceRegistryException.class.equals(type)){
                
                           return org.wso2.carbon.registry.ws.api.WSRegistryServiceRegistryException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.ws.api.RemoveAssociation.class.equals(type)){
                
                           return org.wso2.carbon.registry.ws.api.RemoveAssociation.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.ws.api.WSRegistryServiceRegistryException.class.equals(type)){
                
                           return org.wso2.carbon.registry.ws.api.WSRegistryServiceRegistryException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.ws.api.EditComment.class.equals(type)){
                
                           return org.wso2.carbon.registry.ws.api.EditComment.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.ws.api.WSRegistryServiceRegistryException.class.equals(type)){
                
                           return org.wso2.carbon.registry.ws.api.WSRegistryServiceRegistryException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.ws.api.Delete.class.equals(type)){
                
                           return org.wso2.carbon.registry.ws.api.Delete.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.ws.api.WSRegistryServiceRegistryException.class.equals(type)){
                
                           return org.wso2.carbon.registry.ws.api.WSRegistryServiceRegistryException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.ws.api.WSgetAllAssociations.class.equals(type)){
                
                           return org.wso2.carbon.registry.ws.api.WSgetAllAssociations.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.ws.api.WSgetAllAssociationsResponse.class.equals(type)){
                
                           return org.wso2.carbon.registry.ws.api.WSgetAllAssociationsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.ws.api.WSRegistryServiceRegistryException.class.equals(type)){
                
                           return org.wso2.carbon.registry.ws.api.WSRegistryServiceRegistryException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.ws.api.ResourceExists.class.equals(type)){
                
                           return org.wso2.carbon.registry.ws.api.ResourceExists.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.ws.api.ResourceExistsResponse.class.equals(type)){
                
                           return org.wso2.carbon.registry.ws.api.ResourceExistsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.ws.api.WSRegistryServiceRegistryException.class.equals(type)){
                
                           return org.wso2.carbon.registry.ws.api.WSRegistryServiceRegistryException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.ws.api.SetEventingServiceURL.class.equals(type)){
                
                           return org.wso2.carbon.registry.ws.api.SetEventingServiceURL.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.ws.api.WSRegistryServiceRegistryException.class.equals(type)){
                
                           return org.wso2.carbon.registry.ws.api.WSRegistryServiceRegistryException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.ws.api.InvokeAspectNoParam.class.equals(type)){
                
                           return org.wso2.carbon.registry.ws.api.InvokeAspectNoParam.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.ws.api.WSRegistryServiceRegistryException.class.equals(type)){
                
                           return org.wso2.carbon.registry.ws.api.WSRegistryServiceRegistryException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.ws.api.WSgetComments.class.equals(type)){
                
                           return org.wso2.carbon.registry.ws.api.WSgetComments.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.ws.api.WSgetCommentsResponse.class.equals(type)){
                
                           return org.wso2.carbon.registry.ws.api.WSgetCommentsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.ws.api.WSRegistryServiceRegistryException.class.equals(type)){
                
                           return org.wso2.carbon.registry.ws.api.WSRegistryServiceRegistryException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.ws.api.WSimportResource.class.equals(type)){
                
                           return org.wso2.carbon.registry.ws.api.WSimportResource.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.ws.api.WSimportResourceResponse.class.equals(type)){
                
                           return org.wso2.carbon.registry.ws.api.WSimportResourceResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.ws.api.WSRegistryServiceRegistryException.class.equals(type)){
                
                           return org.wso2.carbon.registry.ws.api.WSRegistryServiceRegistryException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.ws.api.GetEventingServiceURL.class.equals(type)){
                
                           return org.wso2.carbon.registry.ws.api.GetEventingServiceURL.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.ws.api.GetEventingServiceURLResponse.class.equals(type)){
                
                           return org.wso2.carbon.registry.ws.api.GetEventingServiceURLResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.ws.api.WSRegistryServiceRegistryException.class.equals(type)){
                
                           return org.wso2.carbon.registry.ws.api.WSRegistryServiceRegistryException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.ws.api.WSgetTags.class.equals(type)){
                
                           return org.wso2.carbon.registry.ws.api.WSgetTags.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.ws.api.WSgetTagsResponse.class.equals(type)){
                
                           return org.wso2.carbon.registry.ws.api.WSgetTagsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.ws.api.WSRegistryServiceRegistryException.class.equals(type)){
                
                           return org.wso2.carbon.registry.ws.api.WSRegistryServiceRegistryException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.ws.api.WSgetResourcePathsWithTag.class.equals(type)){
                
                           return org.wso2.carbon.registry.ws.api.WSgetResourcePathsWithTag.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.ws.api.WSgetResourcePathsWithTagResponse.class.equals(type)){
                
                           return org.wso2.carbon.registry.ws.api.WSgetResourcePathsWithTagResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.ws.api.WSRegistryServiceRegistryException.class.equals(type)){
                
                           return org.wso2.carbon.registry.ws.api.WSRegistryServiceRegistryException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.ws.api.InvokeAspectWithParam.class.equals(type)){
                
                           return org.wso2.carbon.registry.ws.api.InvokeAspectWithParam.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.ws.api.WSRegistryServiceRegistryException.class.equals(type)){
                
                           return org.wso2.carbon.registry.ws.api.WSRegistryServiceRegistryException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.ws.api.CreateLinkWithSubTarget.class.equals(type)){
                
                           return org.wso2.carbon.registry.ws.api.CreateLinkWithSubTarget.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.ws.api.WSRegistryServiceRegistryException.class.equals(type)){
                
                           return org.wso2.carbon.registry.ws.api.WSRegistryServiceRegistryException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.ws.api.RestoreVersion.class.equals(type)){
                
                           return org.wso2.carbon.registry.ws.api.RestoreVersion.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.ws.api.WSRegistryServiceRegistryException.class.equals(type)){
                
                           return org.wso2.carbon.registry.ws.api.WSRegistryServiceRegistryException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.ws.api.WSgetWithPageSize.class.equals(type)){
                
                           return org.wso2.carbon.registry.ws.api.WSgetWithPageSize.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.ws.api.WSgetWithPageSizeResponse.class.equals(type)){
                
                           return org.wso2.carbon.registry.ws.api.WSgetWithPageSizeResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.ws.api.WSRegistryServiceRegistryException.class.equals(type)){
                
                           return org.wso2.carbon.registry.ws.api.WSRegistryServiceRegistryException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.ws.api.AddAssociation.class.equals(type)){
                
                           return org.wso2.carbon.registry.ws.api.AddAssociation.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.ws.api.WSRegistryServiceRegistryException.class.equals(type)){
                
                           return org.wso2.carbon.registry.ws.api.WSRegistryServiceRegistryException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.ws.api.WSexecuteQuery.class.equals(type)){
                
                           return org.wso2.carbon.registry.ws.api.WSexecuteQuery.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.ws.api.WSexecuteQueryResponse.class.equals(type)){
                
                           return org.wso2.carbon.registry.ws.api.WSexecuteQueryResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.ws.api.WSRegistryServiceRegistryException.class.equals(type)){
                
                           return org.wso2.carbon.registry.ws.api.WSRegistryServiceRegistryException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

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
    
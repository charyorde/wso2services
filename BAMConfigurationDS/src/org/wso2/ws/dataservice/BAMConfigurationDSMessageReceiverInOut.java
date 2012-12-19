
/**
 * BAMConfigurationDSMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */
        package org.wso2.ws.dataservice;

        /**
        *  BAMConfigurationDSMessageReceiverInOut message receiver
        */

        public class BAMConfigurationDSMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        BAMConfigurationDSSkeletonInterface skel = (BAMConfigurationDSSkeletonInterface)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){


        

            if("getMessageDataForActivityKeyIDandMessageKeyID".equals(methodName)){
                
                org.wso2.carbon.bam.MessagedatasE messagedatas116 = null;
	                        org.wso2.carbon.bam.GetMessageDataForActivityKeyIDandMessageKeyID wrappedParam =
                                                             (org.wso2.carbon.bam.GetMessageDataForActivityKeyIDandMessageKeyID)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetMessageDataForActivityKeyIDandMessageKeyID.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               messagedatas116 =
                                                   
                                                   
                                                         skel.getMessageDataForActivityKeyIDandMessageKeyID(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), messagedatas116, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getMessageDataForActivityKeyIDandMessageKeyID"));
                                    } else 

            if("getMessage".equals(methodName)){
                
                org.wso2.carbon.bam.MessagesE messages118 = null;
	                        org.wso2.carbon.bam.GetMessage wrappedParam =
                                                             (org.wso2.carbon.bam.GetMessage)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetMessage.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               messages118 =
                                                   
                                                   
                                                         skel.getMessage(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), messages118, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getMessage"));
                                    } else 

            if("getAllServersWithCategory".equals(methodName)){
                
                org.wso2.carbon.bam.ServersWithCategoryE serversWithCategory120 = null;
	                        org.wso2.carbon.bam.GetAllServersWithCategory wrappedParam =
                                                             (org.wso2.carbon.bam.GetAllServersWithCategory)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetAllServersWithCategory.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               serversWithCategory120 =
                                                   
                                                   
                                                         skel.getAllServersWithCategory(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), serversWithCategory120, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getAllServersWithCategory"));
                                    } else 

            if("getAllOperationsForService".equals(methodName)){
                
                org.wso2.carbon.bam.OperationsE operations122 = null;
	                        org.wso2.carbon.bam.GetAllOperationsForService wrappedParam =
                                                             (org.wso2.carbon.bam.GetAllOperationsForService)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetAllOperationsForService.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               operations122 =
                                                   
                                                   
                                                         skel.getAllOperationsForService(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), operations122, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getAllOperationsForService"));
                                    } else 

            if("getServersForTenant".equals(methodName)){
                
                org.wso2.carbon.bam.ServersE servers124 = null;
	                        org.wso2.carbon.bam.GetServersForTenant wrappedParam =
                                                             (org.wso2.carbon.bam.GetServersForTenant)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetServersForTenant.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               servers124 =
                                                   
                                                   
                                                         skel.getServersForTenant(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), servers124, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getServersForTenant"));
                                    } else 

            if("getOperationFromName".equals(methodName)){
                
                org.wso2.carbon.bam.OperationsE operations126 = null;
	                        org.wso2.carbon.bam.GetOperationFromName wrappedParam =
                                                             (org.wso2.carbon.bam.GetOperationFromName)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetOperationFromName.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               operations126 =
                                                   
                                                   
                                                         skel.getOperationFromName(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), operations126, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getOperationFromName"));
                                    } else 

            if("getAllMessagesForOperationID".equals(methodName)){
                
                org.wso2.carbon.bam.MessagesE messages128 = null;
	                        org.wso2.carbon.bam.GetAllMessagesForOperationID wrappedParam =
                                                             (org.wso2.carbon.bam.GetAllMessagesForOperationID)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetAllMessagesForOperationID.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               messages128 =
                                                   
                                                   
                                                         skel.getAllMessagesForOperationID(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), messages128, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getAllMessagesForOperationID"));
                                    } else 

            if("getAllOperations".equals(methodName)){
                
                org.wso2.carbon.bam.OperationsE operations130 = null;
	                        org.wso2.carbon.bam.GetAllOperations wrappedParam =
                                                             (org.wso2.carbon.bam.GetAllOperations)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetAllOperations.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               operations130 =
                                                   
                                                   
                                                         skel.getAllOperations(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), operations130, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getAllOperations"));
                                    } else 

            if("getMessageForMessageandOperationandActivity".equals(methodName)){
                
                org.wso2.carbon.bam.MessagesE messages132 = null;
	                        org.wso2.carbon.bam.GetMessageForMessageandOperationandActivity wrappedParam =
                                                             (org.wso2.carbon.bam.GetMessageForMessageandOperationandActivity)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetMessageForMessageandOperationandActivity.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               messages132 =
                                                   
                                                   
                                                         skel.getMessageForMessageandOperationandActivity(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), messages132, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getMessageForMessageandOperationandActivity"));
                                    } else 

            if("getEndpoints".equals(methodName)){
                
                org.wso2.carbon.bam.EndpointsE endpoints134 = null;
	                        org.wso2.carbon.bam.GetEndpoints wrappedParam =
                                                             (org.wso2.carbon.bam.GetEndpoints)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetEndpoints.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               endpoints134 =
                                                   
                                                   
                                                         skel.getEndpoints(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), endpoints134, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getEndpoints"));
                                    } else 

            if("getTenent".equals(methodName)){
                
                org.wso2.carbon.bam.TenentsE tenents136 = null;
	                        org.wso2.carbon.bam.GetTenent wrappedParam =
                                                             (org.wso2.carbon.bam.GetTenent)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetTenent.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               tenents136 =
                                                   
                                                   
                                                         skel.getTenent(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), tenents136, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getTenent"));
                                    } else 

            if("getAllMessagesForActivityKeyId".equals(methodName)){
                
                org.wso2.carbon.bam.MessagesE messages138 = null;
	                        org.wso2.carbon.bam.GetAllMessagesForActivityKeyId wrappedParam =
                                                             (org.wso2.carbon.bam.GetAllMessagesForActivityKeyId)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetAllMessagesForActivityKeyId.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               messages138 =
                                                   
                                                   
                                                         skel.getAllMessagesForActivityKeyId(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), messages138, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getAllMessagesForActivityKeyId"));
                                    } else 

            if("getActivityForActivityID".equals(methodName)){
                
                org.wso2.carbon.bam.ActivitiesE activities140 = null;
	                        org.wso2.carbon.bam.GetActivityForActivityID wrappedParam =
                                                             (org.wso2.carbon.bam.GetActivityForActivityID)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetActivityForActivityID.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               activities140 =
                                                   
                                                   
                                                         skel.getActivityForActivityID(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), activities140, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getActivityForActivityID"));
                                    } else 

            if("getAllXpathData".equals(methodName)){
                
                org.wso2.carbon.bam.AllXpathsE allXpaths142 = null;
	                        org.wso2.carbon.bam.GetAllXpathData wrappedParam =
                                                             (org.wso2.carbon.bam.GetAllXpathData)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetAllXpathData.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               allXpaths142 =
                                                   
                                                   
                                                         skel.getAllXpathData(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), allXpaths142, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getAllXpathData"));
                                    } else 

            if("getAllServices".equals(methodName)){
                
                org.wso2.carbon.bam.ServicesE services144 = null;
	                        org.wso2.carbon.bam.GetAllServices wrappedParam =
                                                             (org.wso2.carbon.bam.GetAllServices)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetAllServices.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               services144 =
                                                   
                                                   
                                                         skel.getAllServices(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), services144, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getAllServices"));
                                    } else 

            if("getAllServersWithCategoryForTenent".equals(methodName)){
                
                org.wso2.carbon.bam.ServersWithCategoryE serversWithCategory146 = null;
	                        org.wso2.carbon.bam.GetAllServersWithCategoryForTenent wrappedParam =
                                                             (org.wso2.carbon.bam.GetAllServersWithCategoryForTenent)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetAllServersWithCategoryForTenent.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               serversWithCategory146 =
                                                   
                                                   
                                                         skel.getAllServersWithCategoryForTenent(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), serversWithCategory146, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getAllServersWithCategoryForTenent"));
                                    } else 

            if("getServerFromURL".equals(methodName)){
                
                org.wso2.carbon.bam.ServersE servers148 = null;
	                        org.wso2.carbon.bam.GetServerFromURL wrappedParam =
                                                             (org.wso2.carbon.bam.GetServerFromURL)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetServerFromURL.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               servers148 =
                                                   
                                                   
                                                         skel.getServerFromURL(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), servers148, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getServerFromURL"));
                                    } else 

            if("getServersForServerType".equals(methodName)){
                
                org.wso2.carbon.bam.ServersE servers150 = null;
	                        org.wso2.carbon.bam.GetServersForServerType wrappedParam =
                                                             (org.wso2.carbon.bam.GetServersForServerType)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetServersForServerType.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               servers150 =
                                                   
                                                   
                                                         skel.getServersForServerType(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), servers150, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getServersForServerType"));
                                    } else 

            if("selectXpathData".equals(methodName)){
                
                org.wso2.carbon.bam.XpathsE xpaths152 = null;
	                        org.wso2.carbon.bam.SelectXpathData wrappedParam =
                                                             (org.wso2.carbon.bam.SelectXpathData)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.SelectXpathData.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               xpaths152 =
                                                   
                                                   
                                                         skel.selectXpathData(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), xpaths152, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "selectXpathData"));
                                    } else 

            if("getActivity".equals(methodName)){
                
                org.wso2.carbon.bam.ActivitiesE activities154 = null;
	                        org.wso2.carbon.bam.GetActivity wrappedParam =
                                                             (org.wso2.carbon.bam.GetActivity)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetActivity.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               activities154 =
                                                   
                                                   
                                                         skel.getActivity(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), activities154, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getActivity"));
                                    } else 

            if("getServerFromURLAndTenantID".equals(methodName)){
                
                org.wso2.carbon.bam.ServersE servers156 = null;
	                        org.wso2.carbon.bam.GetServerFromURLAndTenantID wrappedParam =
                                                             (org.wso2.carbon.bam.GetServerFromURLAndTenantID)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetServerFromURLAndTenantID.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               servers156 =
                                                   
                                                   
                                                         skel.getServerFromURLAndTenantID(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), servers156, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getServerFromURLAndTenantID"));
                                    } else 

            if("selectNamespaceData".equals(methodName)){
                
                org.wso2.carbon.bam.NamespacesE namespaces158 = null;
	                        org.wso2.carbon.bam.SelectNamespaceData wrappedParam =
                                                             (org.wso2.carbon.bam.SelectNamespaceData)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.SelectNamespaceData.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               namespaces158 =
                                                   
                                                   
                                                         skel.selectNamespaceData(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), namespaces158, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "selectNamespaceData"));
                                    } else 

            if("getAllServers".equals(methodName)){
                
                org.wso2.carbon.bam.ServersE servers160 = null;
	                        org.wso2.carbon.bam.GetAllServers wrappedParam =
                                                             (org.wso2.carbon.bam.GetAllServers)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetAllServers.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               servers160 =
                                                   
                                                   
                                                         skel.getAllServers(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), servers160, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getAllServers"));
                                    } else 

            if("getServiceForServer".equals(methodName)){
                
                org.wso2.carbon.bam.ServicesE services162 = null;
	                        org.wso2.carbon.bam.GetServiceForServer wrappedParam =
                                                             (org.wso2.carbon.bam.GetServiceForServer)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetServiceForServer.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               services162 =
                                                   
                                                   
                                                         skel.getServiceForServer(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), services162, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getServiceForServer"));
                                    } else 

            if("getServerFromBAMDB".equals(methodName)){
                
                org.wso2.carbon.bam.ServersE servers164 = null;
	                        org.wso2.carbon.bam.GetServerFromBAMDB wrappedParam =
                                                             (org.wso2.carbon.bam.GetServerFromBAMDB)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetServerFromBAMDB.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               servers164 =
                                                   
                                                   
                                                         skel.getServerFromBAMDB(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), servers164, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getServerFromBAMDB"));
                                    } else 

            if("getMessageProperty".equals(methodName)){
                
                org.wso2.carbon.bam.MessagepropertiessE messagepropertiess166 = null;
	                        org.wso2.carbon.bam.GetMessageProperty wrappedParam =
                                                             (org.wso2.carbon.bam.GetMessageProperty)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetMessageProperty.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               messagepropertiess166 =
                                                   
                                                   
                                                         skel.getMessageProperty(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), messagepropertiess166, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getMessageProperty"));
                                    } else 

            if("getSequences".equals(methodName)){
                
                org.wso2.carbon.bam.SequencesE sequences168 = null;
	                        org.wso2.carbon.bam.GetSequences wrappedParam =
                                                             (org.wso2.carbon.bam.GetSequences)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetSequences.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               sequences168 =
                                                   
                                                   
                                                         skel.getSequences(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), sequences168, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getSequences"));
                                    } else 

            if("getAllTenents".equals(methodName)){
                
                org.wso2.carbon.bam.TenentsE tenents170 = null;
	                        org.wso2.carbon.bam.GetAllTenents wrappedParam =
                                                             (org.wso2.carbon.bam.GetAllTenents)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetAllTenents.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               tenents170 =
                                                   
                                                   
                                                         skel.getAllTenents(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), tenents170, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getAllTenents"));
                                    } else 

            if("getProxyServices".equals(methodName)){
                
                org.wso2.carbon.bam.ProxyServicesE proxyServices172 = null;
	                        org.wso2.carbon.bam.GetProxyServices wrappedParam =
                                                             (org.wso2.carbon.bam.GetProxyServices)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetProxyServices.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               proxyServices172 =
                                                   
                                                   
                                                         skel.getProxyServices(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), proxyServices172, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getProxyServices"));
                                    } else 

            if("getService".equals(methodName)){
                
                org.wso2.carbon.bam.ServicesE services174 = null;
	                        org.wso2.carbon.bam.GetService wrappedParam =
                                                             (org.wso2.carbon.bam.GetService)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetService.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               services174 =
                                                   
                                                   
                                                         skel.getService(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), services174, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getService"));
                                    } else 

            if("getAllClients".equals(methodName)){
                
                org.wso2.carbon.bam.ClientsE clients176 = null;
	                        org.wso2.carbon.bam.GetAllClients wrappedParam =
                                                             (org.wso2.carbon.bam.GetAllClients)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetAllClients.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               clients176 =
                                                   
                                                   
                                                         skel.getAllClients(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), clients176, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getAllClients"));
                                    } else 

            if("getAllMessages".equals(methodName)){
                
                org.wso2.carbon.bam.MessagesE messages178 = null;
	                        org.wso2.carbon.bam.GetAllMessages wrappedParam =
                                                             (org.wso2.carbon.bam.GetAllMessages)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetAllMessages.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               messages178 =
                                                   
                                                   
                                                         skel.getAllMessages(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), messages178, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getAllMessages"));
                                    } else 

            if("getAllActivities".equals(methodName)){
                
                org.wso2.carbon.bam.ActivitiesE activities180 = null;
	                        org.wso2.carbon.bam.GetAllActivities wrappedParam =
                                                             (org.wso2.carbon.bam.GetAllActivities)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetAllActivities.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               activities180 =
                                                   
                                                   
                                                         skel.getAllActivities(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), activities180, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getAllActivities"));
                                    } else 

            if("getServer".equals(methodName)){
                
                org.wso2.carbon.bam.ServersE servers182 = null;
	                        org.wso2.carbon.bam.GetServer wrappedParam =
                                                             (org.wso2.carbon.bam.GetServer)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetServer.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               servers182 =
                                                   
                                                   
                                                         skel.getServer(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), servers182, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getServer"));
                                    } else 

            if("getOperation".equals(methodName)){
                
                org.wso2.carbon.bam.OperationsE operations184 = null;
	                        org.wso2.carbon.bam.GetOperation wrappedParam =
                                                             (org.wso2.carbon.bam.GetOperation)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.GetOperation.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               operations184 =
                                                   
                                                   
                                                         skel.getOperation(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), operations184, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "getOperation"));
                                    } else 

            if("addServer".equals(methodName)){
                
                org.wso2.carbon.bam.server.dss.ServerIDsE serverIDs186 = null;
	                        org.wso2.carbon.bam.server.dss.AddServer wrappedParam =
                                                             (org.wso2.carbon.bam.server.dss.AddServer)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.bam.server.dss.AddServer.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               serverIDs186 =
                                                   
                                                   
                                                         skel.addServer(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), serverIDs186, false, new javax.xml.namespace.QName("http://ws.wso2.org/dataservice",
                                                    "addServer"));
                                    
            } else {
              throw new java.lang.RuntimeException("method not found");
            }
        

        newMsgContext.setEnvelope(envelope);
        }
        } catch (DataServiceFaultException e) {

            msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME,"DataServiceFault");
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
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetMessageDataForActivityKeyIDandMessageKeyID param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetMessageDataForActivityKeyIDandMessageKeyID.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.MessagedatasE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.MessagedatasE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.ws.dataservice.DataServiceFault param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.ws.dataservice.DataServiceFault.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetMessage param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetMessage.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.MessagesE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.MessagesE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.ws.dataservice.AddService param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.ws.dataservice.AddService.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetAllServersWithCategory param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetAllServersWithCategory.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.ServersWithCategoryE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.ServersWithCategoryE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.ws.dataservice.DeactivateServer param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.ws.dataservice.DeactivateServer.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetAllOperationsForService param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetAllOperationsForService.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.OperationsE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.OperationsE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetServersForTenant param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetServersForTenant.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.ServersE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.ServersE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetOperationFromName param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetOperationFromName.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetAllMessagesForOperationID param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetAllMessagesForOperationID.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetAllOperations param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetAllOperations.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetMessageForMessageandOperationandActivity param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetMessageForMessageandOperationandActivity.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.ws.dataservice.DeleteTenet param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.ws.dataservice.DeleteTenet.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetEndpoints param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetEndpoints.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.EndpointsE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.EndpointsE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetTenent param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetTenent.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.TenentsE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.TenentsE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetAllMessagesForActivityKeyId param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetAllMessagesForActivityKeyId.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetActivityForActivityID param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetActivityForActivityID.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.ActivitiesE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.ActivitiesE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetAllXpathData param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetAllXpathData.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.AllXpathsE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.AllXpathsE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetAllServices param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetAllServices.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.ServicesE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.ServicesE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.ws.dataservice.AddNamespaceData param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.ws.dataservice.AddNamespaceData.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetAllServersWithCategoryForTenent param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetAllServersWithCategoryForTenent.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetServerFromURL param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetServerFromURL.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.ws.dataservice.UpdateMessageProperty param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.ws.dataservice.UpdateMessageProperty.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetServersForServerType param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetServersForServerType.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.SelectXpathData param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.SelectXpathData.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.XpathsE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.XpathsE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetActivity param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetActivity.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetServerFromURLAndTenantID param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetServerFromURLAndTenantID.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.SelectNamespaceData param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.SelectNamespaceData.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.NamespacesE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.NamespacesE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetAllServers param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetAllServers.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.ws.dataservice.AddTenent param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.ws.dataservice.AddTenent.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.ws.dataservice.AddOperation param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.ws.dataservice.AddOperation.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.ws.dataservice.ActivateServer param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.ws.dataservice.ActivateServer.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.ws.dataservice.DeleteNamespaceData param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.ws.dataservice.DeleteNamespaceData.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetServiceForServer param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetServiceForServer.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.ws.dataservice.UpdateServer param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.ws.dataservice.UpdateServer.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.ws.dataservice.DeleteMessage param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.ws.dataservice.DeleteMessage.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.ws.dataservice.AddXpathData param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.ws.dataservice.AddXpathData.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetServerFromBAMDB param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetServerFromBAMDB.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetMessageProperty param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetMessageProperty.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.MessagepropertiessE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.MessagepropertiessE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetSequences param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetSequences.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.SequencesE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.SequencesE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.ws.dataservice.DeleteServer param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.ws.dataservice.DeleteServer.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.ws.dataservice.UpdateMessageDump param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.ws.dataservice.UpdateMessageDump.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.ws.dataservice.UpdateMessageStatus param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.ws.dataservice.UpdateMessageStatus.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetAllTenents param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetAllTenents.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetProxyServices param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetProxyServices.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.ProxyServicesE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.ProxyServicesE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.ws.dataservice.AddMessage param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.ws.dataservice.AddMessage.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetService param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetService.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.ws.dataservice.UpdateXpathData param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.ws.dataservice.UpdateXpathData.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.ws.dataservice.UpdateNamespaceData param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.ws.dataservice.UpdateNamespaceData.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetAllClients param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetAllClients.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.ClientsE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.ClientsE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetAllMessages param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetAllMessages.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.ws.dataservice.AddActivityData param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.ws.dataservice.AddActivityData.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetAllActivities param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetAllActivities.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetServer param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetServer.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.ws.dataservice.DeleteOperation param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.ws.dataservice.DeleteOperation.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.GetOperation param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.GetOperation.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.server.dss.AddServer param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.server.dss.AddServer.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.bam.server.dss.ServerIDsE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.bam.server.dss.ServerIDsE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.ws.dataservice.DeleteService param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.ws.dataservice.DeleteService.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.ws.dataservice.UpdateActivity param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.ws.dataservice.UpdateActivity.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.ws.dataservice.DeleteActivity param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.ws.dataservice.DeleteActivity.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.ws.dataservice.UpdateServerWithSubscription param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.ws.dataservice.UpdateServerWithSubscription.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.bam.MessagedatasE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.bam.MessagedatasE.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.bam.MessagedatasE wrapgetMessageDataForActivityKeyIDandMessageKeyID(){
                                org.wso2.carbon.bam.MessagedatasE wrappedElement = new org.wso2.carbon.bam.MessagedatasE();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.bam.MessagesE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.bam.MessagesE.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.bam.MessagesE wrapgetMessage(){
                                org.wso2.carbon.bam.MessagesE wrappedElement = new org.wso2.carbon.bam.MessagesE();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.bam.ServersWithCategoryE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.bam.ServersWithCategoryE.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.bam.ServersWithCategoryE wrapgetAllServersWithCategory(){
                                org.wso2.carbon.bam.ServersWithCategoryE wrappedElement = new org.wso2.carbon.bam.ServersWithCategoryE();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.bam.OperationsE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.bam.OperationsE.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.bam.OperationsE wrapgetAllOperationsForService(){
                                org.wso2.carbon.bam.OperationsE wrappedElement = new org.wso2.carbon.bam.OperationsE();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.bam.ServersE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.bam.ServersE.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.bam.ServersE wrapgetServersForTenant(){
                                org.wso2.carbon.bam.ServersE wrappedElement = new org.wso2.carbon.bam.ServersE();
                                return wrappedElement;
                         }
                    
                         private org.wso2.carbon.bam.OperationsE wrapgetOperationFromName(){
                                org.wso2.carbon.bam.OperationsE wrappedElement = new org.wso2.carbon.bam.OperationsE();
                                return wrappedElement;
                         }
                    
                         private org.wso2.carbon.bam.MessagesE wrapgetAllMessagesForOperationID(){
                                org.wso2.carbon.bam.MessagesE wrappedElement = new org.wso2.carbon.bam.MessagesE();
                                return wrappedElement;
                         }
                    
                         private org.wso2.carbon.bam.OperationsE wrapgetAllOperations(){
                                org.wso2.carbon.bam.OperationsE wrappedElement = new org.wso2.carbon.bam.OperationsE();
                                return wrappedElement;
                         }
                    
                         private org.wso2.carbon.bam.MessagesE wrapgetMessageForMessageandOperationandActivity(){
                                org.wso2.carbon.bam.MessagesE wrappedElement = new org.wso2.carbon.bam.MessagesE();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.bam.EndpointsE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.bam.EndpointsE.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.bam.EndpointsE wrapgetEndpoints(){
                                org.wso2.carbon.bam.EndpointsE wrappedElement = new org.wso2.carbon.bam.EndpointsE();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.bam.TenentsE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.bam.TenentsE.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.bam.TenentsE wrapgetTenent(){
                                org.wso2.carbon.bam.TenentsE wrappedElement = new org.wso2.carbon.bam.TenentsE();
                                return wrappedElement;
                         }
                    
                         private org.wso2.carbon.bam.MessagesE wrapgetAllMessagesForActivityKeyId(){
                                org.wso2.carbon.bam.MessagesE wrappedElement = new org.wso2.carbon.bam.MessagesE();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.bam.ActivitiesE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.bam.ActivitiesE.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.bam.ActivitiesE wrapgetActivityForActivityID(){
                                org.wso2.carbon.bam.ActivitiesE wrappedElement = new org.wso2.carbon.bam.ActivitiesE();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.bam.AllXpathsE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.bam.AllXpathsE.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.bam.AllXpathsE wrapgetAllXpathData(){
                                org.wso2.carbon.bam.AllXpathsE wrappedElement = new org.wso2.carbon.bam.AllXpathsE();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.bam.ServicesE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.bam.ServicesE.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.bam.ServicesE wrapgetAllServices(){
                                org.wso2.carbon.bam.ServicesE wrappedElement = new org.wso2.carbon.bam.ServicesE();
                                return wrappedElement;
                         }
                    
                         private org.wso2.carbon.bam.ServersWithCategoryE wrapgetAllServersWithCategoryForTenent(){
                                org.wso2.carbon.bam.ServersWithCategoryE wrappedElement = new org.wso2.carbon.bam.ServersWithCategoryE();
                                return wrappedElement;
                         }
                    
                         private org.wso2.carbon.bam.ServersE wrapgetServerFromURL(){
                                org.wso2.carbon.bam.ServersE wrappedElement = new org.wso2.carbon.bam.ServersE();
                                return wrappedElement;
                         }
                    
                         private org.wso2.carbon.bam.ServersE wrapgetServersForServerType(){
                                org.wso2.carbon.bam.ServersE wrappedElement = new org.wso2.carbon.bam.ServersE();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.bam.XpathsE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.bam.XpathsE.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.bam.XpathsE wrapselectXpathData(){
                                org.wso2.carbon.bam.XpathsE wrappedElement = new org.wso2.carbon.bam.XpathsE();
                                return wrappedElement;
                         }
                    
                         private org.wso2.carbon.bam.ActivitiesE wrapgetActivity(){
                                org.wso2.carbon.bam.ActivitiesE wrappedElement = new org.wso2.carbon.bam.ActivitiesE();
                                return wrappedElement;
                         }
                    
                         private org.wso2.carbon.bam.ServersE wrapgetServerFromURLAndTenantID(){
                                org.wso2.carbon.bam.ServersE wrappedElement = new org.wso2.carbon.bam.ServersE();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.bam.NamespacesE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.bam.NamespacesE.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.bam.NamespacesE wrapselectNamespaceData(){
                                org.wso2.carbon.bam.NamespacesE wrappedElement = new org.wso2.carbon.bam.NamespacesE();
                                return wrappedElement;
                         }
                    
                         private org.wso2.carbon.bam.ServersE wrapgetAllServers(){
                                org.wso2.carbon.bam.ServersE wrappedElement = new org.wso2.carbon.bam.ServersE();
                                return wrappedElement;
                         }
                    
                         private org.wso2.carbon.bam.ServicesE wrapgetServiceForServer(){
                                org.wso2.carbon.bam.ServicesE wrappedElement = new org.wso2.carbon.bam.ServicesE();
                                return wrappedElement;
                         }
                    
                         private org.wso2.carbon.bam.ServersE wrapgetServerFromBAMDB(){
                                org.wso2.carbon.bam.ServersE wrappedElement = new org.wso2.carbon.bam.ServersE();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.bam.MessagepropertiessE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.bam.MessagepropertiessE.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.bam.MessagepropertiessE wrapgetMessageProperty(){
                                org.wso2.carbon.bam.MessagepropertiessE wrappedElement = new org.wso2.carbon.bam.MessagepropertiessE();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.bam.SequencesE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.bam.SequencesE.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.bam.SequencesE wrapgetSequences(){
                                org.wso2.carbon.bam.SequencesE wrappedElement = new org.wso2.carbon.bam.SequencesE();
                                return wrappedElement;
                         }
                    
                         private org.wso2.carbon.bam.TenentsE wrapgetAllTenents(){
                                org.wso2.carbon.bam.TenentsE wrappedElement = new org.wso2.carbon.bam.TenentsE();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.bam.ProxyServicesE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.bam.ProxyServicesE.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.bam.ProxyServicesE wrapgetProxyServices(){
                                org.wso2.carbon.bam.ProxyServicesE wrappedElement = new org.wso2.carbon.bam.ProxyServicesE();
                                return wrappedElement;
                         }
                    
                         private org.wso2.carbon.bam.ServicesE wrapgetService(){
                                org.wso2.carbon.bam.ServicesE wrappedElement = new org.wso2.carbon.bam.ServicesE();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.bam.ClientsE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.bam.ClientsE.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.bam.ClientsE wrapgetAllClients(){
                                org.wso2.carbon.bam.ClientsE wrappedElement = new org.wso2.carbon.bam.ClientsE();
                                return wrappedElement;
                         }
                    
                         private org.wso2.carbon.bam.MessagesE wrapgetAllMessages(){
                                org.wso2.carbon.bam.MessagesE wrappedElement = new org.wso2.carbon.bam.MessagesE();
                                return wrappedElement;
                         }
                    
                         private org.wso2.carbon.bam.ActivitiesE wrapgetAllActivities(){
                                org.wso2.carbon.bam.ActivitiesE wrappedElement = new org.wso2.carbon.bam.ActivitiesE();
                                return wrappedElement;
                         }
                    
                         private org.wso2.carbon.bam.ServersE wrapgetServer(){
                                org.wso2.carbon.bam.ServersE wrappedElement = new org.wso2.carbon.bam.ServersE();
                                return wrappedElement;
                         }
                    
                         private org.wso2.carbon.bam.OperationsE wrapgetOperation(){
                                org.wso2.carbon.bam.OperationsE wrappedElement = new org.wso2.carbon.bam.OperationsE();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.bam.server.dss.ServerIDsE param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.bam.server.dss.ServerIDsE.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.bam.server.dss.ServerIDsE wrapaddServer(){
                                org.wso2.carbon.bam.server.dss.ServerIDsE wrappedElement = new org.wso2.carbon.bam.server.dss.ServerIDsE();
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
        
                if (org.wso2.carbon.bam.GetMessageDataForActivityKeyIDandMessageKeyID.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetMessageDataForActivityKeyIDandMessageKeyID.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.MessagedatasE.class.equals(type)){
                
                           return org.wso2.carbon.bam.MessagedatasE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetMessage.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetMessage.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.MessagesE.class.equals(type)){
                
                           return org.wso2.carbon.bam.MessagesE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.AddService.class.equals(type)){
                
                           return org.wso2.ws.dataservice.AddService.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetAllServersWithCategory.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetAllServersWithCategory.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.ServersWithCategoryE.class.equals(type)){
                
                           return org.wso2.carbon.bam.ServersWithCategoryE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DeactivateServer.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DeactivateServer.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetAllOperationsForService.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetAllOperationsForService.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.OperationsE.class.equals(type)){
                
                           return org.wso2.carbon.bam.OperationsE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetServersForTenant.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetServersForTenant.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.ServersE.class.equals(type)){
                
                           return org.wso2.carbon.bam.ServersE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetOperationFromName.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetOperationFromName.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.OperationsE.class.equals(type)){
                
                           return org.wso2.carbon.bam.OperationsE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetAllMessagesForOperationID.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetAllMessagesForOperationID.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.MessagesE.class.equals(type)){
                
                           return org.wso2.carbon.bam.MessagesE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetAllOperations.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetAllOperations.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.OperationsE.class.equals(type)){
                
                           return org.wso2.carbon.bam.OperationsE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetMessageForMessageandOperationandActivity.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetMessageForMessageandOperationandActivity.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.MessagesE.class.equals(type)){
                
                           return org.wso2.carbon.bam.MessagesE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DeleteTenet.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DeleteTenet.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetEndpoints.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetEndpoints.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.EndpointsE.class.equals(type)){
                
                           return org.wso2.carbon.bam.EndpointsE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetTenent.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetTenent.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.TenentsE.class.equals(type)){
                
                           return org.wso2.carbon.bam.TenentsE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetAllMessagesForActivityKeyId.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetAllMessagesForActivityKeyId.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.MessagesE.class.equals(type)){
                
                           return org.wso2.carbon.bam.MessagesE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetActivityForActivityID.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetActivityForActivityID.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.ActivitiesE.class.equals(type)){
                
                           return org.wso2.carbon.bam.ActivitiesE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetAllXpathData.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetAllXpathData.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.AllXpathsE.class.equals(type)){
                
                           return org.wso2.carbon.bam.AllXpathsE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetAllServices.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetAllServices.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.ServicesE.class.equals(type)){
                
                           return org.wso2.carbon.bam.ServicesE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.AddNamespaceData.class.equals(type)){
                
                           return org.wso2.ws.dataservice.AddNamespaceData.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetAllServersWithCategoryForTenent.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetAllServersWithCategoryForTenent.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.ServersWithCategoryE.class.equals(type)){
                
                           return org.wso2.carbon.bam.ServersWithCategoryE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetServerFromURL.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetServerFromURL.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.ServersE.class.equals(type)){
                
                           return org.wso2.carbon.bam.ServersE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.UpdateMessageProperty.class.equals(type)){
                
                           return org.wso2.ws.dataservice.UpdateMessageProperty.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetServersForServerType.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetServersForServerType.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.ServersE.class.equals(type)){
                
                           return org.wso2.carbon.bam.ServersE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.SelectXpathData.class.equals(type)){
                
                           return org.wso2.carbon.bam.SelectXpathData.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.XpathsE.class.equals(type)){
                
                           return org.wso2.carbon.bam.XpathsE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetActivity.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetActivity.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.ActivitiesE.class.equals(type)){
                
                           return org.wso2.carbon.bam.ActivitiesE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetServerFromURLAndTenantID.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetServerFromURLAndTenantID.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.ServersE.class.equals(type)){
                
                           return org.wso2.carbon.bam.ServersE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.SelectNamespaceData.class.equals(type)){
                
                           return org.wso2.carbon.bam.SelectNamespaceData.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.NamespacesE.class.equals(type)){
                
                           return org.wso2.carbon.bam.NamespacesE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetAllServers.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetAllServers.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.ServersE.class.equals(type)){
                
                           return org.wso2.carbon.bam.ServersE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.AddTenent.class.equals(type)){
                
                           return org.wso2.ws.dataservice.AddTenent.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.AddOperation.class.equals(type)){
                
                           return org.wso2.ws.dataservice.AddOperation.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.ActivateServer.class.equals(type)){
                
                           return org.wso2.ws.dataservice.ActivateServer.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DeleteNamespaceData.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DeleteNamespaceData.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetServiceForServer.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetServiceForServer.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.ServicesE.class.equals(type)){
                
                           return org.wso2.carbon.bam.ServicesE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.UpdateServer.class.equals(type)){
                
                           return org.wso2.ws.dataservice.UpdateServer.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DeleteMessage.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DeleteMessage.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.AddXpathData.class.equals(type)){
                
                           return org.wso2.ws.dataservice.AddXpathData.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetServerFromBAMDB.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetServerFromBAMDB.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.ServersE.class.equals(type)){
                
                           return org.wso2.carbon.bam.ServersE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetMessageProperty.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetMessageProperty.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.MessagepropertiessE.class.equals(type)){
                
                           return org.wso2.carbon.bam.MessagepropertiessE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetSequences.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetSequences.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.SequencesE.class.equals(type)){
                
                           return org.wso2.carbon.bam.SequencesE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DeleteServer.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DeleteServer.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.UpdateMessageDump.class.equals(type)){
                
                           return org.wso2.ws.dataservice.UpdateMessageDump.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.UpdateMessageStatus.class.equals(type)){
                
                           return org.wso2.ws.dataservice.UpdateMessageStatus.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetAllTenents.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetAllTenents.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.TenentsE.class.equals(type)){
                
                           return org.wso2.carbon.bam.TenentsE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetProxyServices.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetProxyServices.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.ProxyServicesE.class.equals(type)){
                
                           return org.wso2.carbon.bam.ProxyServicesE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.AddMessage.class.equals(type)){
                
                           return org.wso2.ws.dataservice.AddMessage.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetService.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetService.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.ServicesE.class.equals(type)){
                
                           return org.wso2.carbon.bam.ServicesE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.UpdateXpathData.class.equals(type)){
                
                           return org.wso2.ws.dataservice.UpdateXpathData.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.UpdateNamespaceData.class.equals(type)){
                
                           return org.wso2.ws.dataservice.UpdateNamespaceData.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetAllClients.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetAllClients.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.ClientsE.class.equals(type)){
                
                           return org.wso2.carbon.bam.ClientsE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetAllMessages.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetAllMessages.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.MessagesE.class.equals(type)){
                
                           return org.wso2.carbon.bam.MessagesE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.AddActivityData.class.equals(type)){
                
                           return org.wso2.ws.dataservice.AddActivityData.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetAllActivities.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetAllActivities.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.ActivitiesE.class.equals(type)){
                
                           return org.wso2.carbon.bam.ActivitiesE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetServer.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetServer.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.ServersE.class.equals(type)){
                
                           return org.wso2.carbon.bam.ServersE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DeleteOperation.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DeleteOperation.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.GetOperation.class.equals(type)){
                
                           return org.wso2.carbon.bam.GetOperation.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.OperationsE.class.equals(type)){
                
                           return org.wso2.carbon.bam.OperationsE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.server.dss.AddServer.class.equals(type)){
                
                           return org.wso2.carbon.bam.server.dss.AddServer.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.bam.server.dss.ServerIDsE.class.equals(type)){
                
                           return org.wso2.carbon.bam.server.dss.ServerIDsE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DeleteService.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DeleteService.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.UpdateActivity.class.equals(type)){
                
                           return org.wso2.ws.dataservice.UpdateActivity.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DeleteActivity.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DeleteActivity.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.UpdateServerWithSubscription.class.equals(type)){
                
                           return org.wso2.ws.dataservice.UpdateServerWithSubscription.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.ws.dataservice.DataServiceFault.class.equals(type)){
                
                           return org.wso2.ws.dataservice.DataServiceFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

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
    
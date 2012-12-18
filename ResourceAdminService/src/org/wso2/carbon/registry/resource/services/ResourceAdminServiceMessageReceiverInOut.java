
/**
 * ResourceAdminServiceMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */
        package org.wso2.carbon.registry.resource.services;

        /**
        *  ResourceAdminServiceMessageReceiverInOut message receiver
        */

        public class ResourceAdminServiceMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        ResourceAdminServiceSkeletonInterface skel = (ResourceAdminServiceSkeletonInterface)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){


        

            if("createVersion".equals(methodName)){
                
                org.wso2.carbon.registry.resource.services.CreateVersionResponse createVersionResponse75 = null;
	                        org.wso2.carbon.registry.resource.services.CreateVersion wrappedParam =
                                                             (org.wso2.carbon.registry.resource.services.CreateVersion)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.registry.resource.services.CreateVersion.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               createVersionResponse75 =
                                                   
                                                   
                                                         skel.createVersion(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), createVersionResponse75, false, new javax.xml.namespace.QName("http://services.resource.registry.carbon.wso2.org",
                                                    "createVersion"));
                                    } else 

            if("moveResource".equals(methodName)){
                
                org.wso2.carbon.registry.resource.services.MoveResourceResponse moveResourceResponse77 = null;
	                        org.wso2.carbon.registry.resource.services.MoveResource wrappedParam =
                                                             (org.wso2.carbon.registry.resource.services.MoveResource)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.registry.resource.services.MoveResource.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               moveResourceResponse77 =
                                                   
                                                   
                                                         skel.moveResource(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), moveResourceResponse77, false, new javax.xml.namespace.QName("http://services.resource.registry.carbon.wso2.org",
                                                    "moveResource"));
                                    } else 

            if("getMetadata".equals(methodName)){
                
                org.wso2.carbon.registry.resource.services.GetMetadataResponse getMetadataResponse79 = null;
	                        org.wso2.carbon.registry.resource.services.GetMetadata wrappedParam =
                                                             (org.wso2.carbon.registry.resource.services.GetMetadata)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.registry.resource.services.GetMetadata.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getMetadataResponse79 =
                                                   
                                                   
                                                         skel.getMetadata(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getMetadataResponse79, false, new javax.xml.namespace.QName("http://services.resource.registry.carbon.wso2.org",
                                                    "getMetadata"));
                                    } else 

            if("getProperty".equals(methodName)){
                
                org.wso2.carbon.registry.resource.services.GetPropertyResponse getPropertyResponse81 = null;
	                        org.wso2.carbon.registry.resource.services.GetProperty wrappedParam =
                                                             (org.wso2.carbon.registry.resource.services.GetProperty)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.registry.resource.services.GetProperty.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getPropertyResponse81 =
                                                   
                                                   
                                                         skel.getProperty(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getPropertyResponse81, false, new javax.xml.namespace.QName("http://services.resource.registry.carbon.wso2.org",
                                                    "getProperty"));
                                    } else 

            if("addExtension".equals(methodName)){
                
                org.wso2.carbon.registry.resource.services.AddExtensionResponse addExtensionResponse83 = null;
	                        org.wso2.carbon.registry.resource.services.AddExtension wrappedParam =
                                                             (org.wso2.carbon.registry.resource.services.AddExtension)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.registry.resource.services.AddExtension.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               addExtensionResponse83 =
                                                   
                                                   
                                                         skel.addExtension(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), addExtensionResponse83, false, new javax.xml.namespace.QName("http://services.resource.registry.carbon.wso2.org",
                                                    "addExtension"));
                                    } else 

            if("delete".equals(methodName)){
                
                org.wso2.carbon.registry.resource.services.DeleteResponse deleteResponse85 = null;
	                        org.wso2.carbon.registry.resource.services.Delete wrappedParam =
                                                             (org.wso2.carbon.registry.resource.services.Delete)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.registry.resource.services.Delete.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               deleteResponse85 =
                                                   
                                                   
                                                         skel.delete(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), deleteResponse85, false, new javax.xml.namespace.QName("http://services.resource.registry.carbon.wso2.org",
                                                    "delete"));
                                    } else 

            if("addTextResource".equals(methodName)){
                
                org.wso2.carbon.registry.resource.services.AddTextResourceResponse addTextResourceResponse87 = null;
	                        org.wso2.carbon.registry.resource.services.AddTextResource wrappedParam =
                                                             (org.wso2.carbon.registry.resource.services.AddTextResource)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.registry.resource.services.AddTextResource.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               addTextResourceResponse87 =
                                                   
                                                   
                                                         skel.addTextResource(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), addTextResourceResponse87, false, new javax.xml.namespace.QName("http://services.resource.registry.carbon.wso2.org",
                                                    "addTextResource"));
                                    } else 

            if("getMediatypeDefinitions".equals(methodName)){
                
                org.wso2.carbon.registry.resource.services.GetMediatypeDefinitionsResponse getMediatypeDefinitionsResponse89 = null;
	                        org.wso2.carbon.registry.resource.services.GetMediatypeDefinitions wrappedParam =
                                                             (org.wso2.carbon.registry.resource.services.GetMediatypeDefinitions)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.registry.resource.services.GetMediatypeDefinitions.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getMediatypeDefinitionsResponse89 =
                                                   
                                                   
                                                         skel.getMediatypeDefinitions(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getMediatypeDefinitionsResponse89, false, new javax.xml.namespace.QName("http://services.resource.registry.carbon.wso2.org",
                                                    "getMediatypeDefinitions"));
                                    } else 

            if("importResource".equals(methodName)){
                
                org.wso2.carbon.registry.resource.services.ImportResourceResponse importResourceResponse91 = null;
	                        org.wso2.carbon.registry.resource.services.ImportResource wrappedParam =
                                                             (org.wso2.carbon.registry.resource.services.ImportResource)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.registry.resource.services.ImportResource.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               importResourceResponse91 =
                                                   
                                                   
                                                         skel.importResource(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), importResourceResponse91, false, new javax.xml.namespace.QName("http://services.resource.registry.carbon.wso2.org",
                                                    "importResource"));
                                    } else 

            if("copyResource".equals(methodName)){
                
                org.wso2.carbon.registry.resource.services.CopyResourceResponse copyResourceResponse93 = null;
	                        org.wso2.carbon.registry.resource.services.CopyResource wrappedParam =
                                                             (org.wso2.carbon.registry.resource.services.CopyResource)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.registry.resource.services.CopyResource.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               copyResourceResponse93 =
                                                   
                                                   
                                                         skel.copyResource(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), copyResourceResponse93, false, new javax.xml.namespace.QName("http://services.resource.registry.carbon.wso2.org",
                                                    "copyResource"));
                                    } else 

            if("listExtensions".equals(methodName)){
                
                org.wso2.carbon.registry.resource.services.ListExtensionsResponse listExtensionsResponse95 = null;
	                        org.wso2.carbon.registry.resource.services.ListExtensions wrappedParam =
                                                             (org.wso2.carbon.registry.resource.services.ListExtensions)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.registry.resource.services.ListExtensions.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               listExtensionsResponse95 =
                                                   
                                                   
                                                         skel.listExtensions(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), listExtensionsResponse95, false, new javax.xml.namespace.QName("http://services.resource.registry.carbon.wso2.org",
                                                    "listExtensions"));
                                    } else 

            if("addResource".equals(methodName)){
                
                org.wso2.carbon.registry.resource.services.AddResourceResponse addResourceResponse97 = null;
	                        org.wso2.carbon.registry.resource.services.AddResource wrappedParam =
                                                             (org.wso2.carbon.registry.resource.services.AddResource)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.registry.resource.services.AddResource.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               addResourceResponse97 =
                                                   
                                                   
                                                         skel.addResource(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), addResourceResponse97, false, new javax.xml.namespace.QName("http://services.resource.registry.carbon.wso2.org",
                                                    "addResource"));
                                    } else 

            if("getResourceTreeEntry".equals(methodName)){
                
                org.wso2.carbon.registry.resource.services.GetResourceTreeEntryResponse getResourceTreeEntryResponse99 = null;
	                        org.wso2.carbon.registry.resource.services.GetResourceTreeEntry wrappedParam =
                                                             (org.wso2.carbon.registry.resource.services.GetResourceTreeEntry)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.registry.resource.services.GetResourceTreeEntry.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getResourceTreeEntryResponse99 =
                                                   
                                                   
                                                         skel.getResourceTreeEntry(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getResourceTreeEntryResponse99, false, new javax.xml.namespace.QName("http://services.resource.registry.carbon.wso2.org",
                                                    "getResourceTreeEntry"));
                                    } else 

            if("getCustomUIMediatypeDefinitions".equals(methodName)){
                
                org.wso2.carbon.registry.resource.services.GetCustomUIMediatypeDefinitionsResponse getCustomUIMediatypeDefinitionsResponse101 = null;
	                        org.wso2.carbon.registry.resource.services.GetCustomUIMediatypeDefinitions wrappedParam =
                                                             (org.wso2.carbon.registry.resource.services.GetCustomUIMediatypeDefinitions)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.registry.resource.services.GetCustomUIMediatypeDefinitions.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getCustomUIMediatypeDefinitionsResponse101 =
                                                   
                                                   
                                                         skel.getCustomUIMediatypeDefinitions(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getCustomUIMediatypeDefinitionsResponse101, false, new javax.xml.namespace.QName("http://services.resource.registry.carbon.wso2.org",
                                                    "getCustomUIMediatypeDefinitions"));
                                    } else 

            if("getPermissions".equals(methodName)){
                
                org.wso2.carbon.registry.resource.services.GetPermissionsResponse getPermissionsResponse103 = null;
	                        org.wso2.carbon.registry.resource.services.GetPermissions wrappedParam =
                                                             (org.wso2.carbon.registry.resource.services.GetPermissions)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.registry.resource.services.GetPermissions.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getPermissionsResponse103 =
                                                   
                                                   
                                                         skel.getPermissions(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getPermissionsResponse103, false, new javax.xml.namespace.QName("http://services.resource.registry.carbon.wso2.org",
                                                    "getPermissions"));
                                    } else 

            if("updateTextContent".equals(methodName)){
                
                org.wso2.carbon.registry.resource.services.UpdateTextContentResponse updateTextContentResponse105 = null;
	                        org.wso2.carbon.registry.resource.services.UpdateTextContent wrappedParam =
                                                             (org.wso2.carbon.registry.resource.services.UpdateTextContent)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.registry.resource.services.UpdateTextContent.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               updateTextContentResponse105 =
                                                   
                                                   
                                                         skel.updateTextContent(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), updateTextContentResponse105, false, new javax.xml.namespace.QName("http://services.resource.registry.carbon.wso2.org",
                                                    "updateTextContent"));
                                    } else 

            if("changeUserPermissions".equals(methodName)){
                
                org.wso2.carbon.registry.resource.services.ChangeUserPermissionsResponse changeUserPermissionsResponse107 = null;
	                        org.wso2.carbon.registry.resource.services.ChangeUserPermissions wrappedParam =
                                                             (org.wso2.carbon.registry.resource.services.ChangeUserPermissions)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.registry.resource.services.ChangeUserPermissions.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               changeUserPermissionsResponse107 =
                                                   
                                                   
                                                         skel.changeUserPermissions(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), changeUserPermissionsResponse107, false, new javax.xml.namespace.QName("http://services.resource.registry.carbon.wso2.org",
                                                    "changeUserPermissions"));
                                    } else 

            if("restoreVersion".equals(methodName)){
                
                org.wso2.carbon.registry.resource.services.RestoreVersionResponse restoreVersionResponse109 = null;
	                        org.wso2.carbon.registry.resource.services.RestoreVersion wrappedParam =
                                                             (org.wso2.carbon.registry.resource.services.RestoreVersion)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.registry.resource.services.RestoreVersion.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               restoreVersionResponse109 =
                                                   
                                                   
                                                         skel.restoreVersion(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), restoreVersionResponse109, false, new javax.xml.namespace.QName("http://services.resource.registry.carbon.wso2.org",
                                                    "restoreVersion"));
                                    } else 

            if("getHumanReadableMediaTypes".equals(methodName)){
                
                org.wso2.carbon.registry.resource.services.GetHumanReadableMediaTypesResponse getHumanReadableMediaTypesResponse111 = null;
	                        org.wso2.carbon.registry.resource.services.GetHumanReadableMediaTypes wrappedParam =
                                                             (org.wso2.carbon.registry.resource.services.GetHumanReadableMediaTypes)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.registry.resource.services.GetHumanReadableMediaTypes.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getHumanReadableMediaTypesResponse111 =
                                                   
                                                   
                                                         skel.getHumanReadableMediaTypes(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getHumanReadableMediaTypesResponse111, false, new javax.xml.namespace.QName("http://services.resource.registry.carbon.wso2.org",
                                                    "getHumanReadableMediaTypes"));
                                    } else 

            if("getVersionsBean".equals(methodName)){
                
                org.wso2.carbon.registry.resource.services.GetVersionsBeanResponse getVersionsBeanResponse113 = null;
	                        org.wso2.carbon.registry.resource.services.GetVersionsBean wrappedParam =
                                                             (org.wso2.carbon.registry.resource.services.GetVersionsBean)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.registry.resource.services.GetVersionsBean.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getVersionsBeanResponse113 =
                                                   
                                                   
                                                         skel.getVersionsBean(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getVersionsBeanResponse113, false, new javax.xml.namespace.QName("http://services.resource.registry.carbon.wso2.org",
                                                    "getVersionsBean"));
                                    } else 

            if("renameResource".equals(methodName)){
                
                org.wso2.carbon.registry.resource.services.RenameResourceResponse renameResourceResponse115 = null;
	                        org.wso2.carbon.registry.resource.services.RenameResource wrappedParam =
                                                             (org.wso2.carbon.registry.resource.services.RenameResource)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.registry.resource.services.RenameResource.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               renameResourceResponse115 =
                                                   
                                                   
                                                         skel.renameResource(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), renameResourceResponse115, false, new javax.xml.namespace.QName("http://services.resource.registry.carbon.wso2.org",
                                                    "renameResource"));
                                    } else 

            if("getResourceData".equals(methodName)){
                
                org.wso2.carbon.registry.resource.services.GetResourceDataResponse getResourceDataResponse117 = null;
	                        org.wso2.carbon.registry.resource.services.GetResourceData wrappedParam =
                                                             (org.wso2.carbon.registry.resource.services.GetResourceData)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.registry.resource.services.GetResourceData.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getResourceDataResponse117 =
                                                   
                                                   
                                                         skel.getResourceData(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getResourceDataResponse117, false, new javax.xml.namespace.QName("http://services.resource.registry.carbon.wso2.org",
                                                    "getResourceData"));
                                    } else 

            if("removeExtension".equals(methodName)){
                
                org.wso2.carbon.registry.resource.services.RemoveExtensionResponse removeExtensionResponse119 = null;
	                        org.wso2.carbon.registry.resource.services.RemoveExtension wrappedParam =
                                                             (org.wso2.carbon.registry.resource.services.RemoveExtension)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.registry.resource.services.RemoveExtension.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               removeExtensionResponse119 =
                                                   
                                                   
                                                         skel.removeExtension(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), removeExtensionResponse119, false, new javax.xml.namespace.QName("http://services.resource.registry.carbon.wso2.org",
                                                    "removeExtension"));
                                    } else 

            if("getSessionResourcePath".equals(methodName)){
                
                org.wso2.carbon.registry.resource.services.GetSessionResourcePathResponse getSessionResourcePathResponse121 = null;
	                        org.wso2.carbon.registry.resource.services.GetSessionResourcePath wrappedParam =
                                                             (org.wso2.carbon.registry.resource.services.GetSessionResourcePath)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.registry.resource.services.GetSessionResourcePath.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getSessionResourcePathResponse121 =
                                                   
                                                   
                                                         skel.getSessionResourcePath(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getSessionResourcePathResponse121, false, new javax.xml.namespace.QName("http://services.resource.registry.carbon.wso2.org",
                                                    "getSessionResourcePath"));
                                    } else 

            if("getContentDownloadBean".equals(methodName)){
                
                org.wso2.carbon.registry.resource.services.GetContentDownloadBeanResponse getContentDownloadBeanResponse123 = null;
	                        org.wso2.carbon.registry.resource.services.GetContentDownloadBean wrappedParam =
                                                             (org.wso2.carbon.registry.resource.services.GetContentDownloadBean)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.registry.resource.services.GetContentDownloadBean.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getContentDownloadBeanResponse123 =
                                                   
                                                   
                                                         skel.getContentDownloadBean(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getContentDownloadBeanResponse123, false, new javax.xml.namespace.QName("http://services.resource.registry.carbon.wso2.org",
                                                    "getContentDownloadBean"));
                                    } else 

            if("addUserPermission".equals(methodName)){
                
                org.wso2.carbon.registry.resource.services.AddUserPermissionResponse addUserPermissionResponse125 = null;
	                        org.wso2.carbon.registry.resource.services.AddUserPermission wrappedParam =
                                                             (org.wso2.carbon.registry.resource.services.AddUserPermission)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.registry.resource.services.AddUserPermission.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               addUserPermissionResponse125 =
                                                   
                                                   
                                                         skel.addUserPermission(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), addUserPermissionResponse125, false, new javax.xml.namespace.QName("http://services.resource.registry.carbon.wso2.org",
                                                    "addUserPermission"));
                                    } else 

            if("getCollectionMediatypeDefinitions".equals(methodName)){
                
                org.wso2.carbon.registry.resource.services.GetCollectionMediatypeDefinitionsResponse getCollectionMediatypeDefinitionsResponse127 = null;
	                        org.wso2.carbon.registry.resource.services.GetCollectionMediatypeDefinitions wrappedParam =
                                                             (org.wso2.carbon.registry.resource.services.GetCollectionMediatypeDefinitions)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.registry.resource.services.GetCollectionMediatypeDefinitions.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getCollectionMediatypeDefinitionsResponse127 =
                                                   
                                                   
                                                         skel.getCollectionMediatypeDefinitions(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getCollectionMediatypeDefinitionsResponse127, false, new javax.xml.namespace.QName("http://services.resource.registry.carbon.wso2.org",
                                                    "getCollectionMediatypeDefinitions"));
                                    } else 

            if("addTextContent".equals(methodName)){
                
                org.wso2.carbon.registry.resource.services.AddTextContentResponse addTextContentResponse129 = null;
	                        org.wso2.carbon.registry.resource.services.AddTextContent wrappedParam =
                                                             (org.wso2.carbon.registry.resource.services.AddTextContent)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.registry.resource.services.AddTextContent.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               addTextContentResponse129 =
                                                   
                                                   
                                                         skel.addTextContent(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), addTextContentResponse129, false, new javax.xml.namespace.QName("http://services.resource.registry.carbon.wso2.org",
                                                    "addTextContent"));
                                    } else 

            if("addCollection".equals(methodName)){
                
                org.wso2.carbon.registry.resource.services.AddCollectionResponse addCollectionResponse131 = null;
	                        org.wso2.carbon.registry.resource.services.AddCollection wrappedParam =
                                                             (org.wso2.carbon.registry.resource.services.AddCollection)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.registry.resource.services.AddCollection.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               addCollectionResponse131 =
                                                   
                                                   
                                                         skel.addCollection(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), addCollectionResponse131, false, new javax.xml.namespace.QName("http://services.resource.registry.carbon.wso2.org",
                                                    "addCollection"));
                                    } else 

            if("getTextContent".equals(methodName)){
                
                org.wso2.carbon.registry.resource.services.GetTextContentResponse getTextContentResponse133 = null;
	                        org.wso2.carbon.registry.resource.services.GetTextContent wrappedParam =
                                                             (org.wso2.carbon.registry.resource.services.GetTextContent)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.registry.resource.services.GetTextContent.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getTextContentResponse133 =
                                                   
                                                   
                                                         skel.getTextContent(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getTextContentResponse133, false, new javax.xml.namespace.QName("http://services.resource.registry.carbon.wso2.org",
                                                    "getTextContent"));
                                    } else 

            if("getMimeTypeFromHuman".equals(methodName)){
                
                org.wso2.carbon.registry.resource.services.GetMimeTypeFromHumanResponse getMimeTypeFromHumanResponse135 = null;
	                        org.wso2.carbon.registry.resource.services.GetMimeTypeFromHuman wrappedParam =
                                                             (org.wso2.carbon.registry.resource.services.GetMimeTypeFromHuman)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.registry.resource.services.GetMimeTypeFromHuman.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getMimeTypeFromHumanResponse135 =
                                                   
                                                   
                                                         skel.getMimeTypeFromHuman(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getMimeTypeFromHumanResponse135, false, new javax.xml.namespace.QName("http://services.resource.registry.carbon.wso2.org",
                                                    "getMimeTypeFromHuman"));
                                    } else 

            if("changeRolePermissions".equals(methodName)){
                
                org.wso2.carbon.registry.resource.services.ChangeRolePermissionsResponse changeRolePermissionsResponse137 = null;
	                        org.wso2.carbon.registry.resource.services.ChangeRolePermissions wrappedParam =
                                                             (org.wso2.carbon.registry.resource.services.ChangeRolePermissions)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.registry.resource.services.ChangeRolePermissions.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               changeRolePermissionsResponse137 =
                                                   
                                                   
                                                         skel.changeRolePermissions(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), changeRolePermissionsResponse137, false, new javax.xml.namespace.QName("http://services.resource.registry.carbon.wso2.org",
                                                    "changeRolePermissions"));
                                    } else 

            if("getContentBean".equals(methodName)){
                
                org.wso2.carbon.registry.resource.services.GetContentBeanResponse getContentBeanResponse139 = null;
	                        org.wso2.carbon.registry.resource.services.GetContentBean wrappedParam =
                                                             (org.wso2.carbon.registry.resource.services.GetContentBean)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.registry.resource.services.GetContentBean.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getContentBeanResponse139 =
                                                   
                                                   
                                                         skel.getContentBean(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getContentBeanResponse139, false, new javax.xml.namespace.QName("http://services.resource.registry.carbon.wso2.org",
                                                    "getContentBean"));
                                    } else 

            if("getCollectionContent".equals(methodName)){
                
                org.wso2.carbon.registry.resource.services.GetCollectionContentResponse getCollectionContentResponse141 = null;
	                        org.wso2.carbon.registry.resource.services.GetCollectionContent wrappedParam =
                                                             (org.wso2.carbon.registry.resource.services.GetCollectionContent)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.registry.resource.services.GetCollectionContent.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getCollectionContentResponse141 =
                                                   
                                                   
                                                         skel.getCollectionContent(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getCollectionContentResponse141, false, new javax.xml.namespace.QName("http://services.resource.registry.carbon.wso2.org",
                                                    "getCollectionContent"));
                                    } else 

            if("addRolePermission".equals(methodName)){
                
                org.wso2.carbon.registry.resource.services.AddRolePermissionResponse addRolePermissionResponse143 = null;
	                        org.wso2.carbon.registry.resource.services.AddRolePermission wrappedParam =
                                                             (org.wso2.carbon.registry.resource.services.AddRolePermission)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.wso2.carbon.registry.resource.services.AddRolePermission.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               addRolePermissionResponse143 =
                                                   
                                                   
                                                         skel.addRolePermission(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), addRolePermissionResponse143, false, new javax.xml.namespace.QName("http://services.resource.registry.carbon.wso2.org",
                                                    "addRolePermission"));
                                    
            } else {
              throw new java.lang.RuntimeException("method not found");
            }
        

        newMsgContext.setEnvelope(envelope);
        }
        } catch (ResourceAdminServiceExceptionException e) {

            msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME,"ResourceAdminServiceException");
            org.apache.axis2.AxisFault f = createAxisFault(e);
            if (e.getFaultMessage() != null){
                f.setDetail(toOM(e.getFaultMessage(),false));
            }
            throw f;
            }
         catch (ResourceAdminServiceResourceServiceExceptionException e) {

            msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME,"ResourceAdminServiceResourceServiceException");
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
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.resource.services.CreateVersion param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.resource.services.CreateVersion.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.resource.services.CreateVersionResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.resource.services.CreateVersionResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.resource.services.ResourceAdminServiceException param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.resource.services.ResourceAdminServiceException.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.resource.services.MoveResource param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.resource.services.MoveResource.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.resource.services.MoveResourceResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.resource.services.MoveResourceResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.resource.services.GetMetadata param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.resource.services.GetMetadata.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.resource.services.GetMetadataResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.resource.services.GetMetadataResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.resource.services.GetProperty param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.resource.services.GetProperty.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.resource.services.GetPropertyResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.resource.services.GetPropertyResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.resource.services.AddExtension param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.resource.services.AddExtension.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.resource.services.AddExtensionResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.resource.services.AddExtensionResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.resource.services.Delete param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.resource.services.Delete.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.resource.services.DeleteResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.resource.services.DeleteResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.resource.services.AddTextResource param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.resource.services.AddTextResource.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.resource.services.AddTextResourceResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.resource.services.AddTextResourceResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.resource.services.SetSessionResourcePath param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.resource.services.SetSessionResourcePath.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.resource.services.AddSymbolicLink param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.resource.services.AddSymbolicLink.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.resource.services.GetMediatypeDefinitions param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.resource.services.GetMediatypeDefinitions.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.resource.services.GetMediatypeDefinitionsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.resource.services.GetMediatypeDefinitionsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.resource.services.ImportResource param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.resource.services.ImportResource.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.resource.services.ImportResourceResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.resource.services.ImportResourceResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.resource.services.CopyResource param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.resource.services.CopyResource.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.resource.services.CopyResourceResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.resource.services.CopyResourceResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.resource.services.ListExtensions param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.resource.services.ListExtensions.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.resource.services.ListExtensionsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.resource.services.ListExtensionsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.resource.services.AddResource param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.resource.services.AddResource.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.resource.services.AddResourceResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.resource.services.AddResourceResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.resource.services.GetResourceTreeEntry param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.resource.services.GetResourceTreeEntry.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.resource.services.GetResourceTreeEntryResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.resource.services.GetResourceTreeEntryResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.resource.services.GetCustomUIMediatypeDefinitions param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.resource.services.GetCustomUIMediatypeDefinitions.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.resource.services.GetCustomUIMediatypeDefinitionsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.resource.services.GetCustomUIMediatypeDefinitionsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.resource.services.GetPermissions param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.resource.services.GetPermissions.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.resource.services.GetPermissionsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.resource.services.GetPermissionsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.resource.services.UpdateTextContent param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.resource.services.UpdateTextContent.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.resource.services.UpdateTextContentResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.resource.services.UpdateTextContentResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.resource.services.AddRemoteLink param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.resource.services.AddRemoteLink.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.resource.services.ChangeUserPermissions param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.resource.services.ChangeUserPermissions.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.resource.services.ChangeUserPermissionsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.resource.services.ChangeUserPermissionsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.resource.services.RestoreVersion param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.resource.services.RestoreVersion.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.resource.services.RestoreVersionResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.resource.services.RestoreVersionResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.resource.services.GetHumanReadableMediaTypes param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.resource.services.GetHumanReadableMediaTypes.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.resource.services.GetHumanReadableMediaTypesResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.resource.services.GetHumanReadableMediaTypesResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.resource.services.GetVersionsBean param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.resource.services.GetVersionsBean.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.resource.services.GetVersionsBeanResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.resource.services.GetVersionsBeanResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.resource.services.RenameResource param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.resource.services.RenameResource.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.resource.services.RenameResourceResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.resource.services.RenameResourceResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.resource.services.GetResourceData param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.resource.services.GetResourceData.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.resource.services.GetResourceDataResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.resource.services.GetResourceDataResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.resource.services.RemoveExtension param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.resource.services.RemoveExtension.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.resource.services.RemoveExtensionResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.resource.services.RemoveExtensionResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.resource.services.GetSessionResourcePath param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.resource.services.GetSessionResourcePath.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.resource.services.GetSessionResourcePathResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.resource.services.GetSessionResourcePathResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.resource.services.GetContentDownloadBean param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.resource.services.GetContentDownloadBean.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.resource.services.GetContentDownloadBeanResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.resource.services.GetContentDownloadBeanResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.resource.services.AddUserPermission param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.resource.services.AddUserPermission.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.resource.services.AddUserPermissionResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.resource.services.AddUserPermissionResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.resource.services.ResourceAdminServiceResourceServiceException param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.resource.services.ResourceAdminServiceResourceServiceException.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.resource.services.GetCollectionMediatypeDefinitions param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.resource.services.GetCollectionMediatypeDefinitions.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.resource.services.GetCollectionMediatypeDefinitionsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.resource.services.GetCollectionMediatypeDefinitionsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.resource.services.AddTextContent param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.resource.services.AddTextContent.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.resource.services.AddTextContentResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.resource.services.AddTextContentResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.resource.services.AddCollection param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.resource.services.AddCollection.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.resource.services.AddCollectionResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.resource.services.AddCollectionResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.resource.services.GetTextContent param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.resource.services.GetTextContent.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.resource.services.GetTextContentResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.resource.services.GetTextContentResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.resource.services.GetMimeTypeFromHuman param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.resource.services.GetMimeTypeFromHuman.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.resource.services.GetMimeTypeFromHumanResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.resource.services.GetMimeTypeFromHumanResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.resource.services.SetDescription param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.resource.services.SetDescription.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.resource.services.ChangeRolePermissions param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.resource.services.ChangeRolePermissions.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.resource.services.ChangeRolePermissionsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.resource.services.ChangeRolePermissionsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.resource.services.GetContentBean param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.resource.services.GetContentBean.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.resource.services.GetContentBeanResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.resource.services.GetContentBeanResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.resource.services.GetCollectionContent param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.resource.services.GetCollectionContent.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.resource.services.GetCollectionContentResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.resource.services.GetCollectionContentResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.resource.services.AddRolePermission param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.resource.services.AddRolePermission.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.registry.resource.services.AddRolePermissionResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.registry.resource.services.AddRolePermissionResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.registry.resource.services.CreateVersionResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.registry.resource.services.CreateVersionResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.registry.resource.services.CreateVersionResponse wrapcreateVersion(){
                                org.wso2.carbon.registry.resource.services.CreateVersionResponse wrappedElement = new org.wso2.carbon.registry.resource.services.CreateVersionResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.registry.resource.services.MoveResourceResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.registry.resource.services.MoveResourceResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.registry.resource.services.MoveResourceResponse wrapmoveResource(){
                                org.wso2.carbon.registry.resource.services.MoveResourceResponse wrappedElement = new org.wso2.carbon.registry.resource.services.MoveResourceResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.registry.resource.services.GetMetadataResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.registry.resource.services.GetMetadataResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.registry.resource.services.GetMetadataResponse wrapgetMetadata(){
                                org.wso2.carbon.registry.resource.services.GetMetadataResponse wrappedElement = new org.wso2.carbon.registry.resource.services.GetMetadataResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.registry.resource.services.GetPropertyResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.registry.resource.services.GetPropertyResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.registry.resource.services.GetPropertyResponse wrapgetProperty(){
                                org.wso2.carbon.registry.resource.services.GetPropertyResponse wrappedElement = new org.wso2.carbon.registry.resource.services.GetPropertyResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.registry.resource.services.AddExtensionResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.registry.resource.services.AddExtensionResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.registry.resource.services.AddExtensionResponse wrapaddExtension(){
                                org.wso2.carbon.registry.resource.services.AddExtensionResponse wrappedElement = new org.wso2.carbon.registry.resource.services.AddExtensionResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.registry.resource.services.DeleteResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.registry.resource.services.DeleteResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.registry.resource.services.DeleteResponse wrapdelete(){
                                org.wso2.carbon.registry.resource.services.DeleteResponse wrappedElement = new org.wso2.carbon.registry.resource.services.DeleteResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.registry.resource.services.AddTextResourceResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.registry.resource.services.AddTextResourceResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.registry.resource.services.AddTextResourceResponse wrapaddTextResource(){
                                org.wso2.carbon.registry.resource.services.AddTextResourceResponse wrappedElement = new org.wso2.carbon.registry.resource.services.AddTextResourceResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.registry.resource.services.GetMediatypeDefinitionsResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.registry.resource.services.GetMediatypeDefinitionsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.registry.resource.services.GetMediatypeDefinitionsResponse wrapgetMediatypeDefinitions(){
                                org.wso2.carbon.registry.resource.services.GetMediatypeDefinitionsResponse wrappedElement = new org.wso2.carbon.registry.resource.services.GetMediatypeDefinitionsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.registry.resource.services.ImportResourceResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.registry.resource.services.ImportResourceResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.registry.resource.services.ImportResourceResponse wrapimportResource(){
                                org.wso2.carbon.registry.resource.services.ImportResourceResponse wrappedElement = new org.wso2.carbon.registry.resource.services.ImportResourceResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.registry.resource.services.CopyResourceResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.registry.resource.services.CopyResourceResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.registry.resource.services.CopyResourceResponse wrapcopyResource(){
                                org.wso2.carbon.registry.resource.services.CopyResourceResponse wrappedElement = new org.wso2.carbon.registry.resource.services.CopyResourceResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.registry.resource.services.ListExtensionsResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.registry.resource.services.ListExtensionsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.registry.resource.services.ListExtensionsResponse wraplistExtensions(){
                                org.wso2.carbon.registry.resource.services.ListExtensionsResponse wrappedElement = new org.wso2.carbon.registry.resource.services.ListExtensionsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.registry.resource.services.AddResourceResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.registry.resource.services.AddResourceResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.registry.resource.services.AddResourceResponse wrapaddResource(){
                                org.wso2.carbon.registry.resource.services.AddResourceResponse wrappedElement = new org.wso2.carbon.registry.resource.services.AddResourceResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.registry.resource.services.GetResourceTreeEntryResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.registry.resource.services.GetResourceTreeEntryResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.registry.resource.services.GetResourceTreeEntryResponse wrapgetResourceTreeEntry(){
                                org.wso2.carbon.registry.resource.services.GetResourceTreeEntryResponse wrappedElement = new org.wso2.carbon.registry.resource.services.GetResourceTreeEntryResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.registry.resource.services.GetCustomUIMediatypeDefinitionsResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.registry.resource.services.GetCustomUIMediatypeDefinitionsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.registry.resource.services.GetCustomUIMediatypeDefinitionsResponse wrapgetCustomUIMediatypeDefinitions(){
                                org.wso2.carbon.registry.resource.services.GetCustomUIMediatypeDefinitionsResponse wrappedElement = new org.wso2.carbon.registry.resource.services.GetCustomUIMediatypeDefinitionsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.registry.resource.services.GetPermissionsResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.registry.resource.services.GetPermissionsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.registry.resource.services.GetPermissionsResponse wrapgetPermissions(){
                                org.wso2.carbon.registry.resource.services.GetPermissionsResponse wrappedElement = new org.wso2.carbon.registry.resource.services.GetPermissionsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.registry.resource.services.UpdateTextContentResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.registry.resource.services.UpdateTextContentResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.registry.resource.services.UpdateTextContentResponse wrapupdateTextContent(){
                                org.wso2.carbon.registry.resource.services.UpdateTextContentResponse wrappedElement = new org.wso2.carbon.registry.resource.services.UpdateTextContentResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.registry.resource.services.ChangeUserPermissionsResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.registry.resource.services.ChangeUserPermissionsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.registry.resource.services.ChangeUserPermissionsResponse wrapchangeUserPermissions(){
                                org.wso2.carbon.registry.resource.services.ChangeUserPermissionsResponse wrappedElement = new org.wso2.carbon.registry.resource.services.ChangeUserPermissionsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.registry.resource.services.RestoreVersionResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.registry.resource.services.RestoreVersionResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.registry.resource.services.RestoreVersionResponse wraprestoreVersion(){
                                org.wso2.carbon.registry.resource.services.RestoreVersionResponse wrappedElement = new org.wso2.carbon.registry.resource.services.RestoreVersionResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.registry.resource.services.GetHumanReadableMediaTypesResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.registry.resource.services.GetHumanReadableMediaTypesResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.registry.resource.services.GetHumanReadableMediaTypesResponse wrapgetHumanReadableMediaTypes(){
                                org.wso2.carbon.registry.resource.services.GetHumanReadableMediaTypesResponse wrappedElement = new org.wso2.carbon.registry.resource.services.GetHumanReadableMediaTypesResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.registry.resource.services.GetVersionsBeanResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.registry.resource.services.GetVersionsBeanResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.registry.resource.services.GetVersionsBeanResponse wrapgetVersionsBean(){
                                org.wso2.carbon.registry.resource.services.GetVersionsBeanResponse wrappedElement = new org.wso2.carbon.registry.resource.services.GetVersionsBeanResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.registry.resource.services.RenameResourceResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.registry.resource.services.RenameResourceResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.registry.resource.services.RenameResourceResponse wraprenameResource(){
                                org.wso2.carbon.registry.resource.services.RenameResourceResponse wrappedElement = new org.wso2.carbon.registry.resource.services.RenameResourceResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.registry.resource.services.GetResourceDataResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.registry.resource.services.GetResourceDataResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.registry.resource.services.GetResourceDataResponse wrapgetResourceData(){
                                org.wso2.carbon.registry.resource.services.GetResourceDataResponse wrappedElement = new org.wso2.carbon.registry.resource.services.GetResourceDataResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.registry.resource.services.RemoveExtensionResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.registry.resource.services.RemoveExtensionResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.registry.resource.services.RemoveExtensionResponse wrapremoveExtension(){
                                org.wso2.carbon.registry.resource.services.RemoveExtensionResponse wrappedElement = new org.wso2.carbon.registry.resource.services.RemoveExtensionResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.registry.resource.services.GetSessionResourcePathResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.registry.resource.services.GetSessionResourcePathResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.registry.resource.services.GetSessionResourcePathResponse wrapgetSessionResourcePath(){
                                org.wso2.carbon.registry.resource.services.GetSessionResourcePathResponse wrappedElement = new org.wso2.carbon.registry.resource.services.GetSessionResourcePathResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.registry.resource.services.GetContentDownloadBeanResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.registry.resource.services.GetContentDownloadBeanResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.registry.resource.services.GetContentDownloadBeanResponse wrapgetContentDownloadBean(){
                                org.wso2.carbon.registry.resource.services.GetContentDownloadBeanResponse wrappedElement = new org.wso2.carbon.registry.resource.services.GetContentDownloadBeanResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.registry.resource.services.AddUserPermissionResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.registry.resource.services.AddUserPermissionResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.registry.resource.services.AddUserPermissionResponse wrapaddUserPermission(){
                                org.wso2.carbon.registry.resource.services.AddUserPermissionResponse wrappedElement = new org.wso2.carbon.registry.resource.services.AddUserPermissionResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.registry.resource.services.GetCollectionMediatypeDefinitionsResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.registry.resource.services.GetCollectionMediatypeDefinitionsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.registry.resource.services.GetCollectionMediatypeDefinitionsResponse wrapgetCollectionMediatypeDefinitions(){
                                org.wso2.carbon.registry.resource.services.GetCollectionMediatypeDefinitionsResponse wrappedElement = new org.wso2.carbon.registry.resource.services.GetCollectionMediatypeDefinitionsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.registry.resource.services.AddTextContentResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.registry.resource.services.AddTextContentResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.registry.resource.services.AddTextContentResponse wrapaddTextContent(){
                                org.wso2.carbon.registry.resource.services.AddTextContentResponse wrappedElement = new org.wso2.carbon.registry.resource.services.AddTextContentResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.registry.resource.services.AddCollectionResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.registry.resource.services.AddCollectionResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.registry.resource.services.AddCollectionResponse wrapaddCollection(){
                                org.wso2.carbon.registry.resource.services.AddCollectionResponse wrappedElement = new org.wso2.carbon.registry.resource.services.AddCollectionResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.registry.resource.services.GetTextContentResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.registry.resource.services.GetTextContentResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.registry.resource.services.GetTextContentResponse wrapgetTextContent(){
                                org.wso2.carbon.registry.resource.services.GetTextContentResponse wrappedElement = new org.wso2.carbon.registry.resource.services.GetTextContentResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.registry.resource.services.GetMimeTypeFromHumanResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.registry.resource.services.GetMimeTypeFromHumanResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.registry.resource.services.GetMimeTypeFromHumanResponse wrapgetMimeTypeFromHuman(){
                                org.wso2.carbon.registry.resource.services.GetMimeTypeFromHumanResponse wrappedElement = new org.wso2.carbon.registry.resource.services.GetMimeTypeFromHumanResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.registry.resource.services.ChangeRolePermissionsResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.registry.resource.services.ChangeRolePermissionsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.registry.resource.services.ChangeRolePermissionsResponse wrapchangeRolePermissions(){
                                org.wso2.carbon.registry.resource.services.ChangeRolePermissionsResponse wrappedElement = new org.wso2.carbon.registry.resource.services.ChangeRolePermissionsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.registry.resource.services.GetContentBeanResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.registry.resource.services.GetContentBeanResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.registry.resource.services.GetContentBeanResponse wrapgetContentBean(){
                                org.wso2.carbon.registry.resource.services.GetContentBeanResponse wrappedElement = new org.wso2.carbon.registry.resource.services.GetContentBeanResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.registry.resource.services.GetCollectionContentResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.registry.resource.services.GetCollectionContentResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.registry.resource.services.GetCollectionContentResponse wrapgetCollectionContent(){
                                org.wso2.carbon.registry.resource.services.GetCollectionContentResponse wrappedElement = new org.wso2.carbon.registry.resource.services.GetCollectionContentResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.registry.resource.services.AddRolePermissionResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.registry.resource.services.AddRolePermissionResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.registry.resource.services.AddRolePermissionResponse wrapaddRolePermission(){
                                org.wso2.carbon.registry.resource.services.AddRolePermissionResponse wrappedElement = new org.wso2.carbon.registry.resource.services.AddRolePermissionResponse();
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
        
                if (org.wso2.carbon.registry.resource.services.CreateVersion.class.equals(type)){
                
                           return org.wso2.carbon.registry.resource.services.CreateVersion.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.resource.services.CreateVersionResponse.class.equals(type)){
                
                           return org.wso2.carbon.registry.resource.services.CreateVersionResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.resource.services.ResourceAdminServiceException.class.equals(type)){
                
                           return org.wso2.carbon.registry.resource.services.ResourceAdminServiceException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.resource.services.MoveResource.class.equals(type)){
                
                           return org.wso2.carbon.registry.resource.services.MoveResource.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.resource.services.MoveResourceResponse.class.equals(type)){
                
                           return org.wso2.carbon.registry.resource.services.MoveResourceResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.resource.services.ResourceAdminServiceException.class.equals(type)){
                
                           return org.wso2.carbon.registry.resource.services.ResourceAdminServiceException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.resource.services.GetMetadata.class.equals(type)){
                
                           return org.wso2.carbon.registry.resource.services.GetMetadata.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.resource.services.GetMetadataResponse.class.equals(type)){
                
                           return org.wso2.carbon.registry.resource.services.GetMetadataResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.resource.services.ResourceAdminServiceException.class.equals(type)){
                
                           return org.wso2.carbon.registry.resource.services.ResourceAdminServiceException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.resource.services.GetProperty.class.equals(type)){
                
                           return org.wso2.carbon.registry.resource.services.GetProperty.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.resource.services.GetPropertyResponse.class.equals(type)){
                
                           return org.wso2.carbon.registry.resource.services.GetPropertyResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.resource.services.ResourceAdminServiceException.class.equals(type)){
                
                           return org.wso2.carbon.registry.resource.services.ResourceAdminServiceException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.resource.services.AddExtension.class.equals(type)){
                
                           return org.wso2.carbon.registry.resource.services.AddExtension.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.resource.services.AddExtensionResponse.class.equals(type)){
                
                           return org.wso2.carbon.registry.resource.services.AddExtensionResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.resource.services.ResourceAdminServiceException.class.equals(type)){
                
                           return org.wso2.carbon.registry.resource.services.ResourceAdminServiceException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.resource.services.Delete.class.equals(type)){
                
                           return org.wso2.carbon.registry.resource.services.Delete.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.resource.services.DeleteResponse.class.equals(type)){
                
                           return org.wso2.carbon.registry.resource.services.DeleteResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.resource.services.ResourceAdminServiceException.class.equals(type)){
                
                           return org.wso2.carbon.registry.resource.services.ResourceAdminServiceException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.resource.services.AddTextResource.class.equals(type)){
                
                           return org.wso2.carbon.registry.resource.services.AddTextResource.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.resource.services.AddTextResourceResponse.class.equals(type)){
                
                           return org.wso2.carbon.registry.resource.services.AddTextResourceResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.resource.services.ResourceAdminServiceException.class.equals(type)){
                
                           return org.wso2.carbon.registry.resource.services.ResourceAdminServiceException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.resource.services.SetSessionResourcePath.class.equals(type)){
                
                           return org.wso2.carbon.registry.resource.services.SetSessionResourcePath.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.resource.services.ResourceAdminServiceException.class.equals(type)){
                
                           return org.wso2.carbon.registry.resource.services.ResourceAdminServiceException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.resource.services.AddSymbolicLink.class.equals(type)){
                
                           return org.wso2.carbon.registry.resource.services.AddSymbolicLink.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.resource.services.ResourceAdminServiceException.class.equals(type)){
                
                           return org.wso2.carbon.registry.resource.services.ResourceAdminServiceException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.resource.services.GetMediatypeDefinitions.class.equals(type)){
                
                           return org.wso2.carbon.registry.resource.services.GetMediatypeDefinitions.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.resource.services.GetMediatypeDefinitionsResponse.class.equals(type)){
                
                           return org.wso2.carbon.registry.resource.services.GetMediatypeDefinitionsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.resource.services.ResourceAdminServiceException.class.equals(type)){
                
                           return org.wso2.carbon.registry.resource.services.ResourceAdminServiceException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.resource.services.ImportResource.class.equals(type)){
                
                           return org.wso2.carbon.registry.resource.services.ImportResource.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.resource.services.ImportResourceResponse.class.equals(type)){
                
                           return org.wso2.carbon.registry.resource.services.ImportResourceResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.resource.services.ResourceAdminServiceException.class.equals(type)){
                
                           return org.wso2.carbon.registry.resource.services.ResourceAdminServiceException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.resource.services.CopyResource.class.equals(type)){
                
                           return org.wso2.carbon.registry.resource.services.CopyResource.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.resource.services.CopyResourceResponse.class.equals(type)){
                
                           return org.wso2.carbon.registry.resource.services.CopyResourceResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.resource.services.ResourceAdminServiceException.class.equals(type)){
                
                           return org.wso2.carbon.registry.resource.services.ResourceAdminServiceException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.resource.services.ListExtensions.class.equals(type)){
                
                           return org.wso2.carbon.registry.resource.services.ListExtensions.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.resource.services.ListExtensionsResponse.class.equals(type)){
                
                           return org.wso2.carbon.registry.resource.services.ListExtensionsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.resource.services.ResourceAdminServiceException.class.equals(type)){
                
                           return org.wso2.carbon.registry.resource.services.ResourceAdminServiceException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.resource.services.AddResource.class.equals(type)){
                
                           return org.wso2.carbon.registry.resource.services.AddResource.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.resource.services.AddResourceResponse.class.equals(type)){
                
                           return org.wso2.carbon.registry.resource.services.AddResourceResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.resource.services.ResourceAdminServiceException.class.equals(type)){
                
                           return org.wso2.carbon.registry.resource.services.ResourceAdminServiceException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.resource.services.GetResourceTreeEntry.class.equals(type)){
                
                           return org.wso2.carbon.registry.resource.services.GetResourceTreeEntry.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.resource.services.GetResourceTreeEntryResponse.class.equals(type)){
                
                           return org.wso2.carbon.registry.resource.services.GetResourceTreeEntryResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.resource.services.ResourceAdminServiceException.class.equals(type)){
                
                           return org.wso2.carbon.registry.resource.services.ResourceAdminServiceException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.resource.services.GetCustomUIMediatypeDefinitions.class.equals(type)){
                
                           return org.wso2.carbon.registry.resource.services.GetCustomUIMediatypeDefinitions.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.resource.services.GetCustomUIMediatypeDefinitionsResponse.class.equals(type)){
                
                           return org.wso2.carbon.registry.resource.services.GetCustomUIMediatypeDefinitionsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.resource.services.ResourceAdminServiceException.class.equals(type)){
                
                           return org.wso2.carbon.registry.resource.services.ResourceAdminServiceException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.resource.services.GetPermissions.class.equals(type)){
                
                           return org.wso2.carbon.registry.resource.services.GetPermissions.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.resource.services.GetPermissionsResponse.class.equals(type)){
                
                           return org.wso2.carbon.registry.resource.services.GetPermissionsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.resource.services.ResourceAdminServiceException.class.equals(type)){
                
                           return org.wso2.carbon.registry.resource.services.ResourceAdminServiceException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.resource.services.UpdateTextContent.class.equals(type)){
                
                           return org.wso2.carbon.registry.resource.services.UpdateTextContent.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.resource.services.UpdateTextContentResponse.class.equals(type)){
                
                           return org.wso2.carbon.registry.resource.services.UpdateTextContentResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.resource.services.ResourceAdminServiceException.class.equals(type)){
                
                           return org.wso2.carbon.registry.resource.services.ResourceAdminServiceException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.resource.services.AddRemoteLink.class.equals(type)){
                
                           return org.wso2.carbon.registry.resource.services.AddRemoteLink.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.resource.services.ResourceAdminServiceException.class.equals(type)){
                
                           return org.wso2.carbon.registry.resource.services.ResourceAdminServiceException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.resource.services.ChangeUserPermissions.class.equals(type)){
                
                           return org.wso2.carbon.registry.resource.services.ChangeUserPermissions.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.resource.services.ChangeUserPermissionsResponse.class.equals(type)){
                
                           return org.wso2.carbon.registry.resource.services.ChangeUserPermissionsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.resource.services.ResourceAdminServiceException.class.equals(type)){
                
                           return org.wso2.carbon.registry.resource.services.ResourceAdminServiceException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.resource.services.RestoreVersion.class.equals(type)){
                
                           return org.wso2.carbon.registry.resource.services.RestoreVersion.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.resource.services.RestoreVersionResponse.class.equals(type)){
                
                           return org.wso2.carbon.registry.resource.services.RestoreVersionResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.resource.services.ResourceAdminServiceException.class.equals(type)){
                
                           return org.wso2.carbon.registry.resource.services.ResourceAdminServiceException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.resource.services.GetHumanReadableMediaTypes.class.equals(type)){
                
                           return org.wso2.carbon.registry.resource.services.GetHumanReadableMediaTypes.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.resource.services.GetHumanReadableMediaTypesResponse.class.equals(type)){
                
                           return org.wso2.carbon.registry.resource.services.GetHumanReadableMediaTypesResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.resource.services.ResourceAdminServiceException.class.equals(type)){
                
                           return org.wso2.carbon.registry.resource.services.ResourceAdminServiceException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.resource.services.GetVersionsBean.class.equals(type)){
                
                           return org.wso2.carbon.registry.resource.services.GetVersionsBean.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.resource.services.GetVersionsBeanResponse.class.equals(type)){
                
                           return org.wso2.carbon.registry.resource.services.GetVersionsBeanResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.resource.services.ResourceAdminServiceException.class.equals(type)){
                
                           return org.wso2.carbon.registry.resource.services.ResourceAdminServiceException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.resource.services.RenameResource.class.equals(type)){
                
                           return org.wso2.carbon.registry.resource.services.RenameResource.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.resource.services.RenameResourceResponse.class.equals(type)){
                
                           return org.wso2.carbon.registry.resource.services.RenameResourceResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.resource.services.ResourceAdminServiceException.class.equals(type)){
                
                           return org.wso2.carbon.registry.resource.services.ResourceAdminServiceException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.resource.services.GetResourceData.class.equals(type)){
                
                           return org.wso2.carbon.registry.resource.services.GetResourceData.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.resource.services.GetResourceDataResponse.class.equals(type)){
                
                           return org.wso2.carbon.registry.resource.services.GetResourceDataResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.resource.services.ResourceAdminServiceException.class.equals(type)){
                
                           return org.wso2.carbon.registry.resource.services.ResourceAdminServiceException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.resource.services.RemoveExtension.class.equals(type)){
                
                           return org.wso2.carbon.registry.resource.services.RemoveExtension.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.resource.services.RemoveExtensionResponse.class.equals(type)){
                
                           return org.wso2.carbon.registry.resource.services.RemoveExtensionResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.resource.services.ResourceAdminServiceException.class.equals(type)){
                
                           return org.wso2.carbon.registry.resource.services.ResourceAdminServiceException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.resource.services.GetSessionResourcePath.class.equals(type)){
                
                           return org.wso2.carbon.registry.resource.services.GetSessionResourcePath.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.resource.services.GetSessionResourcePathResponse.class.equals(type)){
                
                           return org.wso2.carbon.registry.resource.services.GetSessionResourcePathResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.resource.services.ResourceAdminServiceException.class.equals(type)){
                
                           return org.wso2.carbon.registry.resource.services.ResourceAdminServiceException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.resource.services.GetContentDownloadBean.class.equals(type)){
                
                           return org.wso2.carbon.registry.resource.services.GetContentDownloadBean.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.resource.services.GetContentDownloadBeanResponse.class.equals(type)){
                
                           return org.wso2.carbon.registry.resource.services.GetContentDownloadBeanResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.resource.services.ResourceAdminServiceException.class.equals(type)){
                
                           return org.wso2.carbon.registry.resource.services.ResourceAdminServiceException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.resource.services.AddUserPermission.class.equals(type)){
                
                           return org.wso2.carbon.registry.resource.services.AddUserPermission.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.resource.services.AddUserPermissionResponse.class.equals(type)){
                
                           return org.wso2.carbon.registry.resource.services.AddUserPermissionResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.resource.services.ResourceAdminServiceResourceServiceException.class.equals(type)){
                
                           return org.wso2.carbon.registry.resource.services.ResourceAdminServiceResourceServiceException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.resource.services.GetCollectionMediatypeDefinitions.class.equals(type)){
                
                           return org.wso2.carbon.registry.resource.services.GetCollectionMediatypeDefinitions.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.resource.services.GetCollectionMediatypeDefinitionsResponse.class.equals(type)){
                
                           return org.wso2.carbon.registry.resource.services.GetCollectionMediatypeDefinitionsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.resource.services.ResourceAdminServiceException.class.equals(type)){
                
                           return org.wso2.carbon.registry.resource.services.ResourceAdminServiceException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.resource.services.AddTextContent.class.equals(type)){
                
                           return org.wso2.carbon.registry.resource.services.AddTextContent.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.resource.services.AddTextContentResponse.class.equals(type)){
                
                           return org.wso2.carbon.registry.resource.services.AddTextContentResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.resource.services.ResourceAdminServiceException.class.equals(type)){
                
                           return org.wso2.carbon.registry.resource.services.ResourceAdminServiceException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.resource.services.AddCollection.class.equals(type)){
                
                           return org.wso2.carbon.registry.resource.services.AddCollection.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.resource.services.AddCollectionResponse.class.equals(type)){
                
                           return org.wso2.carbon.registry.resource.services.AddCollectionResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.resource.services.ResourceAdminServiceException.class.equals(type)){
                
                           return org.wso2.carbon.registry.resource.services.ResourceAdminServiceException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.resource.services.GetTextContent.class.equals(type)){
                
                           return org.wso2.carbon.registry.resource.services.GetTextContent.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.resource.services.GetTextContentResponse.class.equals(type)){
                
                           return org.wso2.carbon.registry.resource.services.GetTextContentResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.resource.services.ResourceAdminServiceException.class.equals(type)){
                
                           return org.wso2.carbon.registry.resource.services.ResourceAdminServiceException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.resource.services.GetMimeTypeFromHuman.class.equals(type)){
                
                           return org.wso2.carbon.registry.resource.services.GetMimeTypeFromHuman.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.resource.services.GetMimeTypeFromHumanResponse.class.equals(type)){
                
                           return org.wso2.carbon.registry.resource.services.GetMimeTypeFromHumanResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.resource.services.ResourceAdminServiceException.class.equals(type)){
                
                           return org.wso2.carbon.registry.resource.services.ResourceAdminServiceException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.resource.services.SetDescription.class.equals(type)){
                
                           return org.wso2.carbon.registry.resource.services.SetDescription.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.resource.services.ResourceAdminServiceException.class.equals(type)){
                
                           return org.wso2.carbon.registry.resource.services.ResourceAdminServiceException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.resource.services.ChangeRolePermissions.class.equals(type)){
                
                           return org.wso2.carbon.registry.resource.services.ChangeRolePermissions.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.resource.services.ChangeRolePermissionsResponse.class.equals(type)){
                
                           return org.wso2.carbon.registry.resource.services.ChangeRolePermissionsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.resource.services.ResourceAdminServiceException.class.equals(type)){
                
                           return org.wso2.carbon.registry.resource.services.ResourceAdminServiceException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.resource.services.GetContentBean.class.equals(type)){
                
                           return org.wso2.carbon.registry.resource.services.GetContentBean.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.resource.services.GetContentBeanResponse.class.equals(type)){
                
                           return org.wso2.carbon.registry.resource.services.GetContentBeanResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.resource.services.ResourceAdminServiceException.class.equals(type)){
                
                           return org.wso2.carbon.registry.resource.services.ResourceAdminServiceException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.resource.services.GetCollectionContent.class.equals(type)){
                
                           return org.wso2.carbon.registry.resource.services.GetCollectionContent.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.resource.services.GetCollectionContentResponse.class.equals(type)){
                
                           return org.wso2.carbon.registry.resource.services.GetCollectionContentResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.resource.services.ResourceAdminServiceException.class.equals(type)){
                
                           return org.wso2.carbon.registry.resource.services.ResourceAdminServiceException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.resource.services.AddRolePermission.class.equals(type)){
                
                           return org.wso2.carbon.registry.resource.services.AddRolePermission.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.resource.services.AddRolePermissionResponse.class.equals(type)){
                
                           return org.wso2.carbon.registry.resource.services.AddRolePermissionResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.registry.resource.services.ResourceAdminServiceResourceServiceException.class.equals(type)){
                
                           return org.wso2.carbon.registry.resource.services.ResourceAdminServiceResourceServiceException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

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
    
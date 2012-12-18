
/**
 * DashboardServiceMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */
        package org.wso2.carbon.dashboard;

        /**
        *  DashboardServiceMessageReceiverInOut message receiver
        */

        public class DashboardServiceMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        DashboardServiceSkeletonInterface skel = (DashboardServiceSkeletonInterface)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){


        

            if("duplicateTab".equals(methodName)){
                
                wsf.wso2.org.tools.DuplicateTabResponse duplicateTabResponse57 = null;
	                        wsf.wso2.org.tools.DuplicateTab wrappedParam =
                                                             (wsf.wso2.org.tools.DuplicateTab)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    wsf.wso2.org.tools.DuplicateTab.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               duplicateTabResponse57 =
                                                   
                                                   
                                                         skel.duplicateTab(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), duplicateTabResponse57, false, new javax.xml.namespace.QName("http://dashboard.carbon.wso2.org",
                                                    "duplicateTab"));
                                    } else 

            if("getBackendHttpPort".equals(methodName)){
                
                wsf.wso2.org.tools.GetBackendHttpPortResponse getBackendHttpPortResponse59 = null;
	                        wsf.wso2.org.tools.GetBackendHttpPort wrappedParam =
                                                             (wsf.wso2.org.tools.GetBackendHttpPort)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    wsf.wso2.org.tools.GetBackendHttpPort.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getBackendHttpPortResponse59 =
                                                   
                                                   
                                                         skel.getBackendHttpPort(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getBackendHttpPortResponse59, false, new javax.xml.namespace.QName("http://dashboard.carbon.wso2.org",
                                                    "getBackendHttpPort"));
                                    } else 

            if("getTabContentAsJson".equals(methodName)){
                
                wsf.wso2.org.tools.GetTabContentAsJsonResponse getTabContentAsJsonResponse61 = null;
	                        wsf.wso2.org.tools.GetTabContentAsJson wrappedParam =
                                                             (wsf.wso2.org.tools.GetTabContentAsJson)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    wsf.wso2.org.tools.GetTabContentAsJson.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getTabContentAsJsonResponse61 =
                                                   
                                                   
                                                         skel.getTabContentAsJson(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getTabContentAsJsonResponse61, false, new javax.xml.namespace.QName("http://dashboard.carbon.wso2.org",
                                                    "getTabContentAsJson"));
                                    } else 

            if("getTabTitle".equals(methodName)){
                
                wsf.wso2.org.tools.GetTabTitleResponse getTabTitleResponse63 = null;
	                        wsf.wso2.org.tools.GetTabTitle wrappedParam =
                                                             (wsf.wso2.org.tools.GetTabTitle)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    wsf.wso2.org.tools.GetTabTitle.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getTabTitleResponse63 =
                                                   
                                                   
                                                         skel.getTabTitle(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getTabTitleResponse63, false, new javax.xml.namespace.QName("http://dashboard.carbon.wso2.org",
                                                    "getTabTitle"));
                                    } else 

            if("copyGadget".equals(methodName)){
                
                wsf.wso2.org.tools.CopyGadgetResponse copyGadgetResponse65 = null;
	                        wsf.wso2.org.tools.CopyGadget wrappedParam =
                                                             (wsf.wso2.org.tools.CopyGadget)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    wsf.wso2.org.tools.CopyGadget.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               copyGadgetResponse65 =
                                                   
                                                   
                                                         skel.copyGadget(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), copyGadgetResponse65, false, new javax.xml.namespace.QName("http://dashboard.carbon.wso2.org",
                                                    "copyGadget"));
                                    } else 

            if("setGadgetLayout".equals(methodName)){
                
                wsf.wso2.org.tools.SetGadgetLayoutResponse setGadgetLayoutResponse67 = null;
	                        wsf.wso2.org.tools.SetGadgetLayout wrappedParam =
                                                             (wsf.wso2.org.tools.SetGadgetLayout)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    wsf.wso2.org.tools.SetGadgetLayout.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               setGadgetLayoutResponse67 =
                                                   
                                                   
                                                         skel.setGadgetLayout(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), setGadgetLayoutResponse67, false, new javax.xml.namespace.QName("http://dashboard.carbon.wso2.org",
                                                    "setGadgetLayout"));
                                    } else 

            if("populateDefaultThreeColumnLayout".equals(methodName)){
                
                wsf.wso2.org.tools.PopulateDefaultThreeColumnLayoutResponse populateDefaultThreeColumnLayoutResponse69 = null;
	                        wsf.wso2.org.tools.PopulateDefaultThreeColumnLayout wrappedParam =
                                                             (wsf.wso2.org.tools.PopulateDefaultThreeColumnLayout)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    wsf.wso2.org.tools.PopulateDefaultThreeColumnLayout.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               populateDefaultThreeColumnLayoutResponse69 =
                                                   
                                                   
                                                         skel.populateDefaultThreeColumnLayout(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), populateDefaultThreeColumnLayoutResponse69, false, new javax.xml.namespace.QName("http://dashboard.carbon.wso2.org",
                                                    "populateDefaultThreeColumnLayout"));
                                    } else 

            if("moveGadgetToTab".equals(methodName)){
                
                wsf.wso2.org.tools.MoveGadgetToTabResponse moveGadgetToTabResponse71 = null;
	                        wsf.wso2.org.tools.MoveGadgetToTab wrappedParam =
                                                             (wsf.wso2.org.tools.MoveGadgetToTab)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    wsf.wso2.org.tools.MoveGadgetToTab.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               moveGadgetToTabResponse71 =
                                                   
                                                   
                                                         skel.moveGadgetToTab(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), moveGadgetToTabResponse71, false, new javax.xml.namespace.QName("http://dashboard.carbon.wso2.org",
                                                    "moveGadgetToTab"));
                                    } else 

            if("getDashboardContent".equals(methodName)){
                
                wsf.wso2.org.tools.GetDashboardContentResponse getDashboardContentResponse73 = null;
	                        wsf.wso2.org.tools.GetDashboardContent wrappedParam =
                                                             (wsf.wso2.org.tools.GetDashboardContent)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    wsf.wso2.org.tools.GetDashboardContent.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getDashboardContentResponse73 =
                                                   
                                                   
                                                         skel.getDashboardContent(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getDashboardContentResponse73, false, new javax.xml.namespace.QName("http://dashboard.carbon.wso2.org",
                                                    "getDashboardContent"));
                                    } else 

            if("getPortalStylesUrl".equals(methodName)){
                
                wsf.wso2.org.tools.GetPortalStylesUrlResponse getPortalStylesUrlResponse75 = null;
	                        wsf.wso2.org.tools.GetPortalStylesUrl wrappedParam =
                                                             (wsf.wso2.org.tools.GetPortalStylesUrl)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    wsf.wso2.org.tools.GetPortalStylesUrl.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getPortalStylesUrlResponse75 =
                                                   
                                                   
                                                         skel.getPortalStylesUrl(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getPortalStylesUrlResponse75, false, new javax.xml.namespace.QName("http://dashboard.carbon.wso2.org",
                                                    "getPortalStylesUrl"));
                                    } else 

            if("getGadgetUrlsToLayout".equals(methodName)){
                
                wsf.wso2.org.tools.GetGadgetUrlsToLayoutResponse getGadgetUrlsToLayoutResponse77 = null;
	                        wsf.wso2.org.tools.GetGadgetUrlsToLayout wrappedParam =
                                                             (wsf.wso2.org.tools.GetGadgetUrlsToLayout)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    wsf.wso2.org.tools.GetGadgetUrlsToLayout.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getGadgetUrlsToLayoutResponse77 =
                                                   
                                                   
                                                         skel.getGadgetUrlsToLayout(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getGadgetUrlsToLayoutResponse77, false, new javax.xml.namespace.QName("http://dashboard.carbon.wso2.org",
                                                    "getGadgetUrlsToLayout"));
                                    } else 

            if("getTabLayout".equals(methodName)){
                
                wsf.wso2.org.tools.GetTabLayoutResponse getTabLayoutResponse79 = null;
	                        wsf.wso2.org.tools.GetTabLayout wrappedParam =
                                                             (wsf.wso2.org.tools.GetTabLayout)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    wsf.wso2.org.tools.GetTabLayout.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getTabLayoutResponse79 =
                                                   
                                                   
                                                         skel.getTabLayout(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getTabLayoutResponse79, false, new javax.xml.namespace.QName("http://dashboard.carbon.wso2.org",
                                                    "getTabLayout"));
                                    } else 

            if("populateCustomLayouts".equals(methodName)){
                
                wsf.wso2.org.tools.PopulateCustomLayoutsResponse populateCustomLayoutsResponse81 = null;
	                        wsf.wso2.org.tools.PopulateCustomLayouts wrappedParam =
                                                             (wsf.wso2.org.tools.PopulateCustomLayouts)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    wsf.wso2.org.tools.PopulateCustomLayouts.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               populateCustomLayoutsResponse81 =
                                                   
                                                   
                                                         skel.populateCustomLayouts(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), populateCustomLayoutsResponse81, false, new javax.xml.namespace.QName("http://dashboard.carbon.wso2.org",
                                                    "populateCustomLayouts"));
                                    } else 

            if("getGadgetLayout".equals(methodName)){
                
                wsf.wso2.org.tools.GetGadgetLayoutResponse getGadgetLayoutResponse83 = null;
	                        wsf.wso2.org.tools.GetGadgetLayout wrappedParam =
                                                             (wsf.wso2.org.tools.GetGadgetLayout)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    wsf.wso2.org.tools.GetGadgetLayout.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getGadgetLayoutResponse83 =
                                                   
                                                   
                                                         skel.getGadgetLayout(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getGadgetLayoutResponse83, false, new javax.xml.namespace.QName("http://dashboard.carbon.wso2.org",
                                                    "getGadgetLayout"));
                                    } else 

            if("addGadgetToUser".equals(methodName)){
                
                wsf.wso2.org.tools.AddGadgetToUserResponse addGadgetToUserResponse85 = null;
	                        wsf.wso2.org.tools.AddGadgetToUser wrappedParam =
                                                             (wsf.wso2.org.tools.AddGadgetToUser)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    wsf.wso2.org.tools.AddGadgetToUser.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               addGadgetToUserResponse85 =
                                                   
                                                   
                                                         skel.addGadgetToUser(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), addGadgetToUserResponse85, false, new javax.xml.namespace.QName("http://dashboard.carbon.wso2.org",
                                                    "addGadgetToUser"));
                                    } else 

            if("isSelfRegistrationEnabled".equals(methodName)){
                
                wsf.wso2.org.tools.IsSelfRegistrationEnabledResponse isSelfRegistrationEnabledResponse87 = null;
	                        wsf.wso2.org.tools.IsSelfRegistrationEnabled wrappedParam =
                                                             (wsf.wso2.org.tools.IsSelfRegistrationEnabled)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    wsf.wso2.org.tools.IsSelfRegistrationEnabled.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               isSelfRegistrationEnabledResponse87 =
                                                   
                                                   
                                                         skel.isSelfRegistrationEnabled(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), isSelfRegistrationEnabledResponse87, false, new javax.xml.namespace.QName("http://dashboard.carbon.wso2.org",
                                                    "isSelfRegistrationEnabled"));
                                    } else 

            if("removeGadget".equals(methodName)){
                
                wsf.wso2.org.tools.RemoveGadgetResponse removeGadgetResponse89 = null;
	                        wsf.wso2.org.tools.RemoveGadget wrappedParam =
                                                             (wsf.wso2.org.tools.RemoveGadget)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    wsf.wso2.org.tools.RemoveGadget.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               removeGadgetResponse89 =
                                                   
                                                   
                                                         skel.removeGadget(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), removeGadgetResponse89, false, new javax.xml.namespace.QName("http://dashboard.carbon.wso2.org",
                                                    "removeGadget"));
                                    } else 

            if("addNewTab".equals(methodName)){
                
                wsf.wso2.org.tools.AddNewTabResponse addNewTabResponse91 = null;
	                        wsf.wso2.org.tools.AddNewTab wrappedParam =
                                                             (wsf.wso2.org.tools.AddNewTab)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    wsf.wso2.org.tools.AddNewTab.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               addNewTabResponse91 =
                                                   
                                                   
                                                         skel.addNewTab(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), addNewTabResponse91, false, new javax.xml.namespace.QName("http://dashboard.carbon.wso2.org",
                                                    "addNewTab"));
                                    } else 

            if("isExternalGadgetAdditionEnabled".equals(methodName)){
                
                wsf.wso2.org.tools.IsExternalGadgetAdditionEnabledResponse isExternalGadgetAdditionEnabledResponse93 = null;
	                        wsf.wso2.org.tools.IsExternalGadgetAdditionEnabled wrappedParam =
                                                             (wsf.wso2.org.tools.IsExternalGadgetAdditionEnabled)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    wsf.wso2.org.tools.IsExternalGadgetAdditionEnabled.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               isExternalGadgetAdditionEnabledResponse93 =
                                                   
                                                   
                                                         skel.isExternalGadgetAdditionEnabled(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), isExternalGadgetAdditionEnabledResponse93, false, new javax.xml.namespace.QName("http://dashboard.carbon.wso2.org",
                                                    "isExternalGadgetAdditionEnabled"));
                                    } else 

            if("isSessionValid".equals(methodName)){
                
                wsf.wso2.org.tools.IsSessionValidResponse isSessionValidResponse95 = null;
	                        wsf.wso2.org.tools.IsSessionValid wrappedParam =
                                                             (wsf.wso2.org.tools.IsSessionValid)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    wsf.wso2.org.tools.IsSessionValid.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               isSessionValidResponse95 =
                                                   
                                                   
                                                         skel.isSessionValid(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), isSessionValidResponse95, false, new javax.xml.namespace.QName("http://dashboard.carbon.wso2.org",
                                                    "isSessionValid"));
                                    } else 

            if("removeTab".equals(methodName)){
                
                wsf.wso2.org.tools.RemoveTabResponse removeTabResponse97 = null;
	                        wsf.wso2.org.tools.RemoveTab wrappedParam =
                                                             (wsf.wso2.org.tools.RemoveTab)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    wsf.wso2.org.tools.RemoveTab.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               removeTabResponse97 =
                                                   
                                                   
                                                         skel.removeTab(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), removeTabResponse97, false, new javax.xml.namespace.QName("http://dashboard.carbon.wso2.org",
                                                    "removeTab"));
                                    } else 

            if("getDefaultGadgetUrlSet".equals(methodName)){
                
                wsf.wso2.org.tools.GetDefaultGadgetUrlSetResponse getDefaultGadgetUrlSetResponse99 = null;
	                        wsf.wso2.org.tools.GetDefaultGadgetUrlSet wrappedParam =
                                                             (wsf.wso2.org.tools.GetDefaultGadgetUrlSet)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    wsf.wso2.org.tools.GetDefaultGadgetUrlSet.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getDefaultGadgetUrlSetResponse99 =
                                                   
                                                   
                                                         skel.getDefaultGadgetUrlSet(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getDefaultGadgetUrlSetResponse99, false, new javax.xml.namespace.QName("http://dashboard.carbon.wso2.org",
                                                    "getDefaultGadgetUrlSet"));
                                    } else 

            if("getGadgetPrefs".equals(methodName)){
                
                wsf.wso2.org.tools.GetGadgetPrefsResponse getGadgetPrefsResponse101 = null;
	                        wsf.wso2.org.tools.GetGadgetPrefs wrappedParam =
                                                             (wsf.wso2.org.tools.GetGadgetPrefs)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    wsf.wso2.org.tools.GetGadgetPrefs.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getGadgetPrefsResponse101 =
                                                   
                                                   
                                                         skel.getGadgetPrefs(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getGadgetPrefsResponse101, false, new javax.xml.namespace.QName("http://dashboard.carbon.wso2.org",
                                                    "getGadgetPrefs"));
                                    } else 

            if("getTabLayoutWithNames".equals(methodName)){
                
                wsf.wso2.org.tools.GetTabLayoutWithNamesResponse getTabLayoutWithNamesResponse103 = null;
	                        wsf.wso2.org.tools.GetTabLayoutWithNames wrappedParam =
                                                             (wsf.wso2.org.tools.GetTabLayoutWithNames)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    wsf.wso2.org.tools.GetTabLayoutWithNames.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getTabLayoutWithNamesResponse103 =
                                                   
                                                   
                                                         skel.getTabLayoutWithNames(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getTabLayoutWithNamesResponse103, false, new javax.xml.namespace.QName("http://dashboard.carbon.wso2.org",
                                                    "getTabLayoutWithNames"));
                                    } else 

            if("setGadgetPrefs".equals(methodName)){
                
                wsf.wso2.org.tools.SetGadgetPrefsResponse setGadgetPrefsResponse105 = null;
	                        wsf.wso2.org.tools.SetGadgetPrefs wrappedParam =
                                                             (wsf.wso2.org.tools.SetGadgetPrefs)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    wsf.wso2.org.tools.SetGadgetPrefs.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               setGadgetPrefsResponse105 =
                                                   
                                                   
                                                         skel.setGadgetPrefs(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), setGadgetPrefsResponse105, false, new javax.xml.namespace.QName("http://dashboard.carbon.wso2.org",
                                                    "setGadgetPrefs"));
                                    } else 

            if("getDashboardContentAsJson".equals(methodName)){
                
                wsf.wso2.org.tools.GetDashboardContentAsJsonResponse getDashboardContentAsJsonResponse107 = null;
	                        wsf.wso2.org.tools.GetDashboardContentAsJson wrappedParam =
                                                             (wsf.wso2.org.tools.GetDashboardContentAsJson)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    wsf.wso2.org.tools.GetDashboardContentAsJson.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getDashboardContentAsJsonResponse107 =
                                                   
                                                   
                                                         skel.getDashboardContentAsJson(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getDashboardContentAsJsonResponse107, false, new javax.xml.namespace.QName("http://dashboard.carbon.wso2.org",
                                                    "getDashboardContentAsJson"));
                                    } else 

            if("populateDashboardTab".equals(methodName)){
                
                wsf.wso2.org.tools.PopulateDashboardTabResponse populateDashboardTabResponse109 = null;
	                        wsf.wso2.org.tools.PopulateDashboardTab wrappedParam =
                                                             (wsf.wso2.org.tools.PopulateDashboardTab)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    wsf.wso2.org.tools.PopulateDashboardTab.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               populateDashboardTabResponse109 =
                                                   
                                                   
                                                         skel.populateDashboardTab(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), populateDashboardTabResponse109, false, new javax.xml.namespace.QName("http://dashboard.carbon.wso2.org",
                                                    "populateDashboardTab"));
                                    } else 

            if("isReadOnlyMode".equals(methodName)){
                
                wsf.wso2.org.tools.IsReadOnlyModeResponse isReadOnlyModeResponse111 = null;
	                        wsf.wso2.org.tools.IsReadOnlyMode wrappedParam =
                                                             (wsf.wso2.org.tools.IsReadOnlyMode)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    wsf.wso2.org.tools.IsReadOnlyMode.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               isReadOnlyModeResponse111 =
                                                   
                                                   
                                                         skel.isReadOnlyMode(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), isReadOnlyModeResponse111, false, new javax.xml.namespace.QName("http://dashboard.carbon.wso2.org",
                                                    "isReadOnlyMode"));
                                    
            } else {
              throw new java.lang.RuntimeException("method not found");
            }
        

        newMsgContext.setEnvelope(envelope);
        }
        }
        catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
        }
        
        //
            private  org.apache.axiom.om.OMElement  toOM(wsf.wso2.org.tools.DuplicateTab param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(wsf.wso2.org.tools.DuplicateTab.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(wsf.wso2.org.tools.DuplicateTabResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(wsf.wso2.org.tools.DuplicateTabResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(wsf.wso2.org.tools.GetBackendHttpPort param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(wsf.wso2.org.tools.GetBackendHttpPort.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(wsf.wso2.org.tools.GetBackendHttpPortResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(wsf.wso2.org.tools.GetBackendHttpPortResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(wsf.wso2.org.tools.GetTabContentAsJson param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(wsf.wso2.org.tools.GetTabContentAsJson.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(wsf.wso2.org.tools.GetTabContentAsJsonResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(wsf.wso2.org.tools.GetTabContentAsJsonResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(wsf.wso2.org.tools.GetTabTitle param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(wsf.wso2.org.tools.GetTabTitle.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(wsf.wso2.org.tools.GetTabTitleResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(wsf.wso2.org.tools.GetTabTitleResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(wsf.wso2.org.tools.CopyGadget param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(wsf.wso2.org.tools.CopyGadget.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(wsf.wso2.org.tools.CopyGadgetResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(wsf.wso2.org.tools.CopyGadgetResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(wsf.wso2.org.tools.SetGadgetLayout param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(wsf.wso2.org.tools.SetGadgetLayout.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(wsf.wso2.org.tools.SetGadgetLayoutResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(wsf.wso2.org.tools.SetGadgetLayoutResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(wsf.wso2.org.tools.PopulateDefaultThreeColumnLayout param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(wsf.wso2.org.tools.PopulateDefaultThreeColumnLayout.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(wsf.wso2.org.tools.PopulateDefaultThreeColumnLayoutResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(wsf.wso2.org.tools.PopulateDefaultThreeColumnLayoutResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(wsf.wso2.org.tools.MoveGadgetToTab param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(wsf.wso2.org.tools.MoveGadgetToTab.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(wsf.wso2.org.tools.MoveGadgetToTabResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(wsf.wso2.org.tools.MoveGadgetToTabResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(wsf.wso2.org.tools.GetDashboardContent param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(wsf.wso2.org.tools.GetDashboardContent.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(wsf.wso2.org.tools.GetDashboardContentResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(wsf.wso2.org.tools.GetDashboardContentResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(wsf.wso2.org.tools.GetPortalStylesUrl param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(wsf.wso2.org.tools.GetPortalStylesUrl.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(wsf.wso2.org.tools.GetPortalStylesUrlResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(wsf.wso2.org.tools.GetPortalStylesUrlResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(wsf.wso2.org.tools.GetGadgetUrlsToLayout param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(wsf.wso2.org.tools.GetGadgetUrlsToLayout.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(wsf.wso2.org.tools.GetGadgetUrlsToLayoutResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(wsf.wso2.org.tools.GetGadgetUrlsToLayoutResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(wsf.wso2.org.tools.GetTabLayout param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(wsf.wso2.org.tools.GetTabLayout.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(wsf.wso2.org.tools.GetTabLayoutResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(wsf.wso2.org.tools.GetTabLayoutResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(wsf.wso2.org.tools.PopulateCustomLayouts param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(wsf.wso2.org.tools.PopulateCustomLayouts.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(wsf.wso2.org.tools.PopulateCustomLayoutsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(wsf.wso2.org.tools.PopulateCustomLayoutsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(wsf.wso2.org.tools.GetGadgetLayout param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(wsf.wso2.org.tools.GetGadgetLayout.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(wsf.wso2.org.tools.GetGadgetLayoutResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(wsf.wso2.org.tools.GetGadgetLayoutResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(wsf.wso2.org.tools.AddGadgetToUser param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(wsf.wso2.org.tools.AddGadgetToUser.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(wsf.wso2.org.tools.AddGadgetToUserResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(wsf.wso2.org.tools.AddGadgetToUserResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(wsf.wso2.org.tools.IsSelfRegistrationEnabled param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(wsf.wso2.org.tools.IsSelfRegistrationEnabled.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(wsf.wso2.org.tools.IsSelfRegistrationEnabledResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(wsf.wso2.org.tools.IsSelfRegistrationEnabledResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(wsf.wso2.org.tools.RemoveGadget param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(wsf.wso2.org.tools.RemoveGadget.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(wsf.wso2.org.tools.RemoveGadgetResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(wsf.wso2.org.tools.RemoveGadgetResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(wsf.wso2.org.tools.AddNewTab param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(wsf.wso2.org.tools.AddNewTab.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(wsf.wso2.org.tools.AddNewTabResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(wsf.wso2.org.tools.AddNewTabResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(wsf.wso2.org.tools.IsExternalGadgetAdditionEnabled param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(wsf.wso2.org.tools.IsExternalGadgetAdditionEnabled.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(wsf.wso2.org.tools.IsExternalGadgetAdditionEnabledResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(wsf.wso2.org.tools.IsExternalGadgetAdditionEnabledResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(wsf.wso2.org.tools.IsSessionValid param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(wsf.wso2.org.tools.IsSessionValid.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(wsf.wso2.org.tools.IsSessionValidResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(wsf.wso2.org.tools.IsSessionValidResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(wsf.wso2.org.tools.RemoveTab param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(wsf.wso2.org.tools.RemoveTab.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(wsf.wso2.org.tools.RemoveTabResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(wsf.wso2.org.tools.RemoveTabResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(wsf.wso2.org.tools.GetDefaultGadgetUrlSet param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(wsf.wso2.org.tools.GetDefaultGadgetUrlSet.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(wsf.wso2.org.tools.GetDefaultGadgetUrlSetResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(wsf.wso2.org.tools.GetDefaultGadgetUrlSetResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(wsf.wso2.org.tools.GetGadgetPrefs param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(wsf.wso2.org.tools.GetGadgetPrefs.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(wsf.wso2.org.tools.GetGadgetPrefsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(wsf.wso2.org.tools.GetGadgetPrefsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(wsf.wso2.org.tools.GetTabLayoutWithNames param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(wsf.wso2.org.tools.GetTabLayoutWithNames.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(wsf.wso2.org.tools.GetTabLayoutWithNamesResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(wsf.wso2.org.tools.GetTabLayoutWithNamesResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(wsf.wso2.org.tools.SetGadgetPrefs param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(wsf.wso2.org.tools.SetGadgetPrefs.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(wsf.wso2.org.tools.SetGadgetPrefsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(wsf.wso2.org.tools.SetGadgetPrefsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(wsf.wso2.org.tools.GetDashboardContentAsJson param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(wsf.wso2.org.tools.GetDashboardContentAsJson.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(wsf.wso2.org.tools.GetDashboardContentAsJsonResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(wsf.wso2.org.tools.GetDashboardContentAsJsonResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(wsf.wso2.org.tools.PopulateDashboardTab param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(wsf.wso2.org.tools.PopulateDashboardTab.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(wsf.wso2.org.tools.PopulateDashboardTabResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(wsf.wso2.org.tools.PopulateDashboardTabResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(wsf.wso2.org.tools.IsReadOnlyMode param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(wsf.wso2.org.tools.IsReadOnlyMode.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(wsf.wso2.org.tools.IsReadOnlyModeResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(wsf.wso2.org.tools.IsReadOnlyModeResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, wsf.wso2.org.tools.DuplicateTabResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(wsf.wso2.org.tools.DuplicateTabResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private wsf.wso2.org.tools.DuplicateTabResponse wrapduplicateTab(){
                                wsf.wso2.org.tools.DuplicateTabResponse wrappedElement = new wsf.wso2.org.tools.DuplicateTabResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, wsf.wso2.org.tools.GetBackendHttpPortResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(wsf.wso2.org.tools.GetBackendHttpPortResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private wsf.wso2.org.tools.GetBackendHttpPortResponse wrapgetBackendHttpPort(){
                                wsf.wso2.org.tools.GetBackendHttpPortResponse wrappedElement = new wsf.wso2.org.tools.GetBackendHttpPortResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, wsf.wso2.org.tools.GetTabContentAsJsonResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(wsf.wso2.org.tools.GetTabContentAsJsonResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private wsf.wso2.org.tools.GetTabContentAsJsonResponse wrapgetTabContentAsJson(){
                                wsf.wso2.org.tools.GetTabContentAsJsonResponse wrappedElement = new wsf.wso2.org.tools.GetTabContentAsJsonResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, wsf.wso2.org.tools.GetTabTitleResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(wsf.wso2.org.tools.GetTabTitleResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private wsf.wso2.org.tools.GetTabTitleResponse wrapgetTabTitle(){
                                wsf.wso2.org.tools.GetTabTitleResponse wrappedElement = new wsf.wso2.org.tools.GetTabTitleResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, wsf.wso2.org.tools.CopyGadgetResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(wsf.wso2.org.tools.CopyGadgetResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private wsf.wso2.org.tools.CopyGadgetResponse wrapcopyGadget(){
                                wsf.wso2.org.tools.CopyGadgetResponse wrappedElement = new wsf.wso2.org.tools.CopyGadgetResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, wsf.wso2.org.tools.SetGadgetLayoutResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(wsf.wso2.org.tools.SetGadgetLayoutResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private wsf.wso2.org.tools.SetGadgetLayoutResponse wrapsetGadgetLayout(){
                                wsf.wso2.org.tools.SetGadgetLayoutResponse wrappedElement = new wsf.wso2.org.tools.SetGadgetLayoutResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, wsf.wso2.org.tools.PopulateDefaultThreeColumnLayoutResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(wsf.wso2.org.tools.PopulateDefaultThreeColumnLayoutResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private wsf.wso2.org.tools.PopulateDefaultThreeColumnLayoutResponse wrappopulateDefaultThreeColumnLayout(){
                                wsf.wso2.org.tools.PopulateDefaultThreeColumnLayoutResponse wrappedElement = new wsf.wso2.org.tools.PopulateDefaultThreeColumnLayoutResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, wsf.wso2.org.tools.MoveGadgetToTabResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(wsf.wso2.org.tools.MoveGadgetToTabResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private wsf.wso2.org.tools.MoveGadgetToTabResponse wrapmoveGadgetToTab(){
                                wsf.wso2.org.tools.MoveGadgetToTabResponse wrappedElement = new wsf.wso2.org.tools.MoveGadgetToTabResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, wsf.wso2.org.tools.GetDashboardContentResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(wsf.wso2.org.tools.GetDashboardContentResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private wsf.wso2.org.tools.GetDashboardContentResponse wrapgetDashboardContent(){
                                wsf.wso2.org.tools.GetDashboardContentResponse wrappedElement = new wsf.wso2.org.tools.GetDashboardContentResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, wsf.wso2.org.tools.GetPortalStylesUrlResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(wsf.wso2.org.tools.GetPortalStylesUrlResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private wsf.wso2.org.tools.GetPortalStylesUrlResponse wrapgetPortalStylesUrl(){
                                wsf.wso2.org.tools.GetPortalStylesUrlResponse wrappedElement = new wsf.wso2.org.tools.GetPortalStylesUrlResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, wsf.wso2.org.tools.GetGadgetUrlsToLayoutResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(wsf.wso2.org.tools.GetGadgetUrlsToLayoutResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private wsf.wso2.org.tools.GetGadgetUrlsToLayoutResponse wrapgetGadgetUrlsToLayout(){
                                wsf.wso2.org.tools.GetGadgetUrlsToLayoutResponse wrappedElement = new wsf.wso2.org.tools.GetGadgetUrlsToLayoutResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, wsf.wso2.org.tools.GetTabLayoutResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(wsf.wso2.org.tools.GetTabLayoutResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private wsf.wso2.org.tools.GetTabLayoutResponse wrapgetTabLayout(){
                                wsf.wso2.org.tools.GetTabLayoutResponse wrappedElement = new wsf.wso2.org.tools.GetTabLayoutResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, wsf.wso2.org.tools.PopulateCustomLayoutsResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(wsf.wso2.org.tools.PopulateCustomLayoutsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private wsf.wso2.org.tools.PopulateCustomLayoutsResponse wrappopulateCustomLayouts(){
                                wsf.wso2.org.tools.PopulateCustomLayoutsResponse wrappedElement = new wsf.wso2.org.tools.PopulateCustomLayoutsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, wsf.wso2.org.tools.GetGadgetLayoutResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(wsf.wso2.org.tools.GetGadgetLayoutResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private wsf.wso2.org.tools.GetGadgetLayoutResponse wrapgetGadgetLayout(){
                                wsf.wso2.org.tools.GetGadgetLayoutResponse wrappedElement = new wsf.wso2.org.tools.GetGadgetLayoutResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, wsf.wso2.org.tools.AddGadgetToUserResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(wsf.wso2.org.tools.AddGadgetToUserResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private wsf.wso2.org.tools.AddGadgetToUserResponse wrapaddGadgetToUser(){
                                wsf.wso2.org.tools.AddGadgetToUserResponse wrappedElement = new wsf.wso2.org.tools.AddGadgetToUserResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, wsf.wso2.org.tools.IsSelfRegistrationEnabledResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(wsf.wso2.org.tools.IsSelfRegistrationEnabledResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private wsf.wso2.org.tools.IsSelfRegistrationEnabledResponse wrapisSelfRegistrationEnabled(){
                                wsf.wso2.org.tools.IsSelfRegistrationEnabledResponse wrappedElement = new wsf.wso2.org.tools.IsSelfRegistrationEnabledResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, wsf.wso2.org.tools.RemoveGadgetResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(wsf.wso2.org.tools.RemoveGadgetResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private wsf.wso2.org.tools.RemoveGadgetResponse wrapremoveGadget(){
                                wsf.wso2.org.tools.RemoveGadgetResponse wrappedElement = new wsf.wso2.org.tools.RemoveGadgetResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, wsf.wso2.org.tools.AddNewTabResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(wsf.wso2.org.tools.AddNewTabResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private wsf.wso2.org.tools.AddNewTabResponse wrapaddNewTab(){
                                wsf.wso2.org.tools.AddNewTabResponse wrappedElement = new wsf.wso2.org.tools.AddNewTabResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, wsf.wso2.org.tools.IsExternalGadgetAdditionEnabledResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(wsf.wso2.org.tools.IsExternalGadgetAdditionEnabledResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private wsf.wso2.org.tools.IsExternalGadgetAdditionEnabledResponse wrapisExternalGadgetAdditionEnabled(){
                                wsf.wso2.org.tools.IsExternalGadgetAdditionEnabledResponse wrappedElement = new wsf.wso2.org.tools.IsExternalGadgetAdditionEnabledResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, wsf.wso2.org.tools.IsSessionValidResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(wsf.wso2.org.tools.IsSessionValidResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private wsf.wso2.org.tools.IsSessionValidResponse wrapisSessionValid(){
                                wsf.wso2.org.tools.IsSessionValidResponse wrappedElement = new wsf.wso2.org.tools.IsSessionValidResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, wsf.wso2.org.tools.RemoveTabResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(wsf.wso2.org.tools.RemoveTabResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private wsf.wso2.org.tools.RemoveTabResponse wrapremoveTab(){
                                wsf.wso2.org.tools.RemoveTabResponse wrappedElement = new wsf.wso2.org.tools.RemoveTabResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, wsf.wso2.org.tools.GetDefaultGadgetUrlSetResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(wsf.wso2.org.tools.GetDefaultGadgetUrlSetResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private wsf.wso2.org.tools.GetDefaultGadgetUrlSetResponse wrapgetDefaultGadgetUrlSet(){
                                wsf.wso2.org.tools.GetDefaultGadgetUrlSetResponse wrappedElement = new wsf.wso2.org.tools.GetDefaultGadgetUrlSetResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, wsf.wso2.org.tools.GetGadgetPrefsResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(wsf.wso2.org.tools.GetGadgetPrefsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private wsf.wso2.org.tools.GetGadgetPrefsResponse wrapgetGadgetPrefs(){
                                wsf.wso2.org.tools.GetGadgetPrefsResponse wrappedElement = new wsf.wso2.org.tools.GetGadgetPrefsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, wsf.wso2.org.tools.GetTabLayoutWithNamesResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(wsf.wso2.org.tools.GetTabLayoutWithNamesResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private wsf.wso2.org.tools.GetTabLayoutWithNamesResponse wrapgetTabLayoutWithNames(){
                                wsf.wso2.org.tools.GetTabLayoutWithNamesResponse wrappedElement = new wsf.wso2.org.tools.GetTabLayoutWithNamesResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, wsf.wso2.org.tools.SetGadgetPrefsResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(wsf.wso2.org.tools.SetGadgetPrefsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private wsf.wso2.org.tools.SetGadgetPrefsResponse wrapsetGadgetPrefs(){
                                wsf.wso2.org.tools.SetGadgetPrefsResponse wrappedElement = new wsf.wso2.org.tools.SetGadgetPrefsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, wsf.wso2.org.tools.GetDashboardContentAsJsonResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(wsf.wso2.org.tools.GetDashboardContentAsJsonResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private wsf.wso2.org.tools.GetDashboardContentAsJsonResponse wrapgetDashboardContentAsJson(){
                                wsf.wso2.org.tools.GetDashboardContentAsJsonResponse wrappedElement = new wsf.wso2.org.tools.GetDashboardContentAsJsonResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, wsf.wso2.org.tools.PopulateDashboardTabResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(wsf.wso2.org.tools.PopulateDashboardTabResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private wsf.wso2.org.tools.PopulateDashboardTabResponse wrappopulateDashboardTab(){
                                wsf.wso2.org.tools.PopulateDashboardTabResponse wrappedElement = new wsf.wso2.org.tools.PopulateDashboardTabResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, wsf.wso2.org.tools.IsReadOnlyModeResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(wsf.wso2.org.tools.IsReadOnlyModeResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private wsf.wso2.org.tools.IsReadOnlyModeResponse wrapisReadOnlyMode(){
                                wsf.wso2.org.tools.IsReadOnlyModeResponse wrappedElement = new wsf.wso2.org.tools.IsReadOnlyModeResponse();
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
        
                if (wsf.wso2.org.tools.DuplicateTab.class.equals(type)){
                
                           return wsf.wso2.org.tools.DuplicateTab.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (wsf.wso2.org.tools.DuplicateTabResponse.class.equals(type)){
                
                           return wsf.wso2.org.tools.DuplicateTabResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (wsf.wso2.org.tools.GetBackendHttpPort.class.equals(type)){
                
                           return wsf.wso2.org.tools.GetBackendHttpPort.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (wsf.wso2.org.tools.GetBackendHttpPortResponse.class.equals(type)){
                
                           return wsf.wso2.org.tools.GetBackendHttpPortResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (wsf.wso2.org.tools.GetTabContentAsJson.class.equals(type)){
                
                           return wsf.wso2.org.tools.GetTabContentAsJson.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (wsf.wso2.org.tools.GetTabContentAsJsonResponse.class.equals(type)){
                
                           return wsf.wso2.org.tools.GetTabContentAsJsonResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (wsf.wso2.org.tools.GetTabTitle.class.equals(type)){
                
                           return wsf.wso2.org.tools.GetTabTitle.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (wsf.wso2.org.tools.GetTabTitleResponse.class.equals(type)){
                
                           return wsf.wso2.org.tools.GetTabTitleResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (wsf.wso2.org.tools.CopyGadget.class.equals(type)){
                
                           return wsf.wso2.org.tools.CopyGadget.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (wsf.wso2.org.tools.CopyGadgetResponse.class.equals(type)){
                
                           return wsf.wso2.org.tools.CopyGadgetResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (wsf.wso2.org.tools.SetGadgetLayout.class.equals(type)){
                
                           return wsf.wso2.org.tools.SetGadgetLayout.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (wsf.wso2.org.tools.SetGadgetLayoutResponse.class.equals(type)){
                
                           return wsf.wso2.org.tools.SetGadgetLayoutResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (wsf.wso2.org.tools.PopulateDefaultThreeColumnLayout.class.equals(type)){
                
                           return wsf.wso2.org.tools.PopulateDefaultThreeColumnLayout.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (wsf.wso2.org.tools.PopulateDefaultThreeColumnLayoutResponse.class.equals(type)){
                
                           return wsf.wso2.org.tools.PopulateDefaultThreeColumnLayoutResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (wsf.wso2.org.tools.MoveGadgetToTab.class.equals(type)){
                
                           return wsf.wso2.org.tools.MoveGadgetToTab.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (wsf.wso2.org.tools.MoveGadgetToTabResponse.class.equals(type)){
                
                           return wsf.wso2.org.tools.MoveGadgetToTabResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (wsf.wso2.org.tools.GetDashboardContent.class.equals(type)){
                
                           return wsf.wso2.org.tools.GetDashboardContent.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (wsf.wso2.org.tools.GetDashboardContentResponse.class.equals(type)){
                
                           return wsf.wso2.org.tools.GetDashboardContentResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (wsf.wso2.org.tools.GetPortalStylesUrl.class.equals(type)){
                
                           return wsf.wso2.org.tools.GetPortalStylesUrl.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (wsf.wso2.org.tools.GetPortalStylesUrlResponse.class.equals(type)){
                
                           return wsf.wso2.org.tools.GetPortalStylesUrlResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (wsf.wso2.org.tools.GetGadgetUrlsToLayout.class.equals(type)){
                
                           return wsf.wso2.org.tools.GetGadgetUrlsToLayout.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (wsf.wso2.org.tools.GetGadgetUrlsToLayoutResponse.class.equals(type)){
                
                           return wsf.wso2.org.tools.GetGadgetUrlsToLayoutResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (wsf.wso2.org.tools.GetTabLayout.class.equals(type)){
                
                           return wsf.wso2.org.tools.GetTabLayout.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (wsf.wso2.org.tools.GetTabLayoutResponse.class.equals(type)){
                
                           return wsf.wso2.org.tools.GetTabLayoutResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (wsf.wso2.org.tools.PopulateCustomLayouts.class.equals(type)){
                
                           return wsf.wso2.org.tools.PopulateCustomLayouts.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (wsf.wso2.org.tools.PopulateCustomLayoutsResponse.class.equals(type)){
                
                           return wsf.wso2.org.tools.PopulateCustomLayoutsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (wsf.wso2.org.tools.GetGadgetLayout.class.equals(type)){
                
                           return wsf.wso2.org.tools.GetGadgetLayout.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (wsf.wso2.org.tools.GetGadgetLayoutResponse.class.equals(type)){
                
                           return wsf.wso2.org.tools.GetGadgetLayoutResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (wsf.wso2.org.tools.AddGadgetToUser.class.equals(type)){
                
                           return wsf.wso2.org.tools.AddGadgetToUser.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (wsf.wso2.org.tools.AddGadgetToUserResponse.class.equals(type)){
                
                           return wsf.wso2.org.tools.AddGadgetToUserResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (wsf.wso2.org.tools.IsSelfRegistrationEnabled.class.equals(type)){
                
                           return wsf.wso2.org.tools.IsSelfRegistrationEnabled.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (wsf.wso2.org.tools.IsSelfRegistrationEnabledResponse.class.equals(type)){
                
                           return wsf.wso2.org.tools.IsSelfRegistrationEnabledResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (wsf.wso2.org.tools.RemoveGadget.class.equals(type)){
                
                           return wsf.wso2.org.tools.RemoveGadget.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (wsf.wso2.org.tools.RemoveGadgetResponse.class.equals(type)){
                
                           return wsf.wso2.org.tools.RemoveGadgetResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (wsf.wso2.org.tools.AddNewTab.class.equals(type)){
                
                           return wsf.wso2.org.tools.AddNewTab.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (wsf.wso2.org.tools.AddNewTabResponse.class.equals(type)){
                
                           return wsf.wso2.org.tools.AddNewTabResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (wsf.wso2.org.tools.IsExternalGadgetAdditionEnabled.class.equals(type)){
                
                           return wsf.wso2.org.tools.IsExternalGadgetAdditionEnabled.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (wsf.wso2.org.tools.IsExternalGadgetAdditionEnabledResponse.class.equals(type)){
                
                           return wsf.wso2.org.tools.IsExternalGadgetAdditionEnabledResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (wsf.wso2.org.tools.IsSessionValid.class.equals(type)){
                
                           return wsf.wso2.org.tools.IsSessionValid.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (wsf.wso2.org.tools.IsSessionValidResponse.class.equals(type)){
                
                           return wsf.wso2.org.tools.IsSessionValidResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (wsf.wso2.org.tools.RemoveTab.class.equals(type)){
                
                           return wsf.wso2.org.tools.RemoveTab.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (wsf.wso2.org.tools.RemoveTabResponse.class.equals(type)){
                
                           return wsf.wso2.org.tools.RemoveTabResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (wsf.wso2.org.tools.GetDefaultGadgetUrlSet.class.equals(type)){
                
                           return wsf.wso2.org.tools.GetDefaultGadgetUrlSet.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (wsf.wso2.org.tools.GetDefaultGadgetUrlSetResponse.class.equals(type)){
                
                           return wsf.wso2.org.tools.GetDefaultGadgetUrlSetResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (wsf.wso2.org.tools.GetGadgetPrefs.class.equals(type)){
                
                           return wsf.wso2.org.tools.GetGadgetPrefs.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (wsf.wso2.org.tools.GetGadgetPrefsResponse.class.equals(type)){
                
                           return wsf.wso2.org.tools.GetGadgetPrefsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (wsf.wso2.org.tools.GetTabLayoutWithNames.class.equals(type)){
                
                           return wsf.wso2.org.tools.GetTabLayoutWithNames.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (wsf.wso2.org.tools.GetTabLayoutWithNamesResponse.class.equals(type)){
                
                           return wsf.wso2.org.tools.GetTabLayoutWithNamesResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (wsf.wso2.org.tools.SetGadgetPrefs.class.equals(type)){
                
                           return wsf.wso2.org.tools.SetGadgetPrefs.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (wsf.wso2.org.tools.SetGadgetPrefsResponse.class.equals(type)){
                
                           return wsf.wso2.org.tools.SetGadgetPrefsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (wsf.wso2.org.tools.GetDashboardContentAsJson.class.equals(type)){
                
                           return wsf.wso2.org.tools.GetDashboardContentAsJson.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (wsf.wso2.org.tools.GetDashboardContentAsJsonResponse.class.equals(type)){
                
                           return wsf.wso2.org.tools.GetDashboardContentAsJsonResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (wsf.wso2.org.tools.PopulateDashboardTab.class.equals(type)){
                
                           return wsf.wso2.org.tools.PopulateDashboardTab.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (wsf.wso2.org.tools.PopulateDashboardTabResponse.class.equals(type)){
                
                           return wsf.wso2.org.tools.PopulateDashboardTabResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (wsf.wso2.org.tools.IsReadOnlyMode.class.equals(type)){
                
                           return wsf.wso2.org.tools.IsReadOnlyMode.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (wsf.wso2.org.tools.IsReadOnlyModeResponse.class.equals(type)){
                
                           return wsf.wso2.org.tools.IsReadOnlyModeResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

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
    
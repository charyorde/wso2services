

/**
 * RSSManagerAdminServiceMessageReceiverRobustInOnly.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */
        package org.wso2.carbon.adminconsole.core.admin;

        /**
        *  RSSManagerAdminServiceMessageReceiverRobustInOnly message receiver
        */

        public class RSSManagerAdminServiceMessageReceiverRobustInOnly extends org.apache.axis2.receivers.AbstractMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        RSSManagerAdminServiceSkeletonInterface skel = (RSSManagerAdminServiceSkeletonInterface)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){
     
        
            if("createPrivilegeGroup".equals(methodName)){
            
            
                            //doc style
                            org.wso2.carbon.adminconsole.core.admin.CreatePrivilegeGroup wrappedParam =
                                                         (org.wso2.carbon.adminconsole.core.admin.CreatePrivilegeGroup)fromOM(
                                                        msgContext.getEnvelope().getBody().getFirstElement(),
                                                        org.wso2.carbon.adminconsole.core.admin.CreatePrivilegeGroup.class,
                                                        getEnvelopeNamespaces(msgContext.getEnvelope()));
                                            
                                           
                                                     skel.createPrivilegeGroup(wrappedParam) ;
                                                

                             envelope = getSOAPFactory(msgContext).getDefaultEnvelope();
                        } else 
            if("editRSSInstance".equals(methodName)){
            
            
                            //doc style
                            org.wso2.carbon.adminconsole.core.admin.EditRSSInstance wrappedParam =
                                                         (org.wso2.carbon.adminconsole.core.admin.EditRSSInstance)fromOM(
                                                        msgContext.getEnvelope().getBody().getFirstElement(),
                                                        org.wso2.carbon.adminconsole.core.admin.EditRSSInstance.class,
                                                        getEnvelopeNamespaces(msgContext.getEnvelope()));
                                            
                                           
                                                     skel.editRSSInstance(wrappedParam) ;
                                                

                             envelope = getSOAPFactory(msgContext).getDefaultEnvelope();
                        } else 
            if("removeRSSInstance".equals(methodName)){
            
            
                            //doc style
                            org.wso2.carbon.adminconsole.core.admin.RemoveRSSInstance wrappedParam =
                                                         (org.wso2.carbon.adminconsole.core.admin.RemoveRSSInstance)fromOM(
                                                        msgContext.getEnvelope().getBody().getFirstElement(),
                                                        org.wso2.carbon.adminconsole.core.admin.RemoveRSSInstance.class,
                                                        getEnvelopeNamespaces(msgContext.getEnvelope()));
                                            
                                           
                                                     skel.removeRSSInstance(wrappedParam) ;
                                                

                             envelope = getSOAPFactory(msgContext).getDefaultEnvelope();
                        } else 
            if("createDatabase".equals(methodName)){
            
            
                            //doc style
                            org.wso2.carbon.adminconsole.core.admin.CreateDatabase wrappedParam =
                                                         (org.wso2.carbon.adminconsole.core.admin.CreateDatabase)fromOM(
                                                        msgContext.getEnvelope().getBody().getFirstElement(),
                                                        org.wso2.carbon.adminconsole.core.admin.CreateDatabase.class,
                                                        getEnvelopeNamespaces(msgContext.getEnvelope()));
                                            
                                           
                                                     skel.createDatabase(wrappedParam) ;
                                                

                             envelope = getSOAPFactory(msgContext).getDefaultEnvelope();
                        } else 
            if("editPrivilegeGroup".equals(methodName)){
            
            
                            //doc style
                            org.wso2.carbon.adminconsole.core.admin.EditPrivilegeGroup wrappedParam =
                                                         (org.wso2.carbon.adminconsole.core.admin.EditPrivilegeGroup)fromOM(
                                                        msgContext.getEnvelope().getBody().getFirstElement(),
                                                        org.wso2.carbon.adminconsole.core.admin.EditPrivilegeGroup.class,
                                                        getEnvelopeNamespaces(msgContext.getEnvelope()));
                                            
                                           
                                                     skel.editPrivilegeGroup(wrappedParam) ;
                                                

                             envelope = getSOAPFactory(msgContext).getDefaultEnvelope();
                        } else 
            if("addRSSInstance".equals(methodName)){
            
            
                            //doc style
                            org.wso2.carbon.adminconsole.core.admin.AddRSSInstance wrappedParam =
                                                         (org.wso2.carbon.adminconsole.core.admin.AddRSSInstance)fromOM(
                                                        msgContext.getEnvelope().getBody().getFirstElement(),
                                                        org.wso2.carbon.adminconsole.core.admin.AddRSSInstance.class,
                                                        getEnvelopeNamespaces(msgContext.getEnvelope()));
                                            
                                           
                                                     skel.addRSSInstance(wrappedParam) ;
                                                

                             envelope = getSOAPFactory(msgContext).getDefaultEnvelope();
                        } else 
            if("dropUser".equals(methodName)){
            
            
                            //doc style
                            org.wso2.carbon.adminconsole.core.admin.DropUser wrappedParam =
                                                         (org.wso2.carbon.adminconsole.core.admin.DropUser)fromOM(
                                                        msgContext.getEnvelope().getBody().getFirstElement(),
                                                        org.wso2.carbon.adminconsole.core.admin.DropUser.class,
                                                        getEnvelopeNamespaces(msgContext.getEnvelope()));
                                            
                                           
                                                     skel.dropUser(wrappedParam) ;
                                                

                             envelope = getSOAPFactory(msgContext).getDefaultEnvelope();
                        } else 
            if("createUser".equals(methodName)){
            
            
                            //doc style
                            org.wso2.carbon.adminconsole.core.admin.CreateUser wrappedParam =
                                                         (org.wso2.carbon.adminconsole.core.admin.CreateUser)fromOM(
                                                        msgContext.getEnvelope().getBody().getFirstElement(),
                                                        org.wso2.carbon.adminconsole.core.admin.CreateUser.class,
                                                        getEnvelopeNamespaces(msgContext.getEnvelope()));
                                            
                                           
                                                     skel.createUser(wrappedParam) ;
                                                

                             envelope = getSOAPFactory(msgContext).getDefaultEnvelope();
                        } else 
            if("dropDatabase".equals(methodName)){
            
            
                            //doc style
                            org.wso2.carbon.adminconsole.core.admin.DropDatabase wrappedParam =
                                                         (org.wso2.carbon.adminconsole.core.admin.DropDatabase)fromOM(
                                                        msgContext.getEnvelope().getBody().getFirstElement(),
                                                        org.wso2.carbon.adminconsole.core.admin.DropDatabase.class,
                                                        getEnvelopeNamespaces(msgContext.getEnvelope()));
                                            
                                           
                                                     skel.dropDatabase(wrappedParam) ;
                                                

                             envelope = getSOAPFactory(msgContext).getDefaultEnvelope();
                        } else 
            if("removePrivilegeGroup".equals(methodName)){
            
            
                            //doc style
                            org.wso2.carbon.adminconsole.core.admin.RemovePrivilegeGroup wrappedParam =
                                                         (org.wso2.carbon.adminconsole.core.admin.RemovePrivilegeGroup)fromOM(
                                                        msgContext.getEnvelope().getBody().getFirstElement(),
                                                        org.wso2.carbon.adminconsole.core.admin.RemovePrivilegeGroup.class,
                                                        getEnvelopeNamespaces(msgContext.getEnvelope()));
                                            
                                           
                                                     skel.removePrivilegeGroup(wrappedParam) ;
                                                

                             envelope = getSOAPFactory(msgContext).getDefaultEnvelope();
                        } else 
            if("editUserPrivileges".equals(methodName)){
            
            
                            //doc style
                            org.wso2.carbon.adminconsole.core.admin.EditUserPrivileges wrappedParam =
                                                         (org.wso2.carbon.adminconsole.core.admin.EditUserPrivileges)fromOM(
                                                        msgContext.getEnvelope().getBody().getFirstElement(),
                                                        org.wso2.carbon.adminconsole.core.admin.EditUserPrivileges.class,
                                                        getEnvelopeNamespaces(msgContext.getEnvelope()));
                                            
                                           
                                                     skel.editUserPrivileges(wrappedParam) ;
                                                

                             envelope = getSOAPFactory(msgContext).getDefaultEnvelope();
                        
                } else {
                  throw new java.lang.RuntimeException("method not found");
                }
            

        }
        } catch (RSSManagerAdminServiceRSSDAOExceptionException e) {
            msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME,"RSSManagerAdminServiceRSSDAOException");
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
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.adminconsole.core.admin.GetDatabaseUserById param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.adminconsole.core.admin.GetDatabaseUserById.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.adminconsole.core.admin.GetDatabaseUserByIdResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.adminconsole.core.admin.GetDatabaseUserByIdResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.adminconsole.core.admin.RSSManagerAdminServiceRSSDAOException param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.adminconsole.core.admin.RSSManagerAdminServiceRSSDAOException.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.adminconsole.core.admin.CreatePrivilegeGroup param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.adminconsole.core.admin.CreatePrivilegeGroup.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.adminconsole.core.admin.EditRSSInstance param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.adminconsole.core.admin.EditRSSInstance.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.adminconsole.core.admin.RemoveRSSInstance param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.adminconsole.core.admin.RemoveRSSInstance.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.adminconsole.core.admin.GetDatabaseInstanceList param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.adminconsole.core.admin.GetDatabaseInstanceList.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.adminconsole.core.admin.GetDatabaseInstanceListResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.adminconsole.core.admin.GetDatabaseInstanceListResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.adminconsole.core.admin.CreateDatabase param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.adminconsole.core.admin.CreateDatabase.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.adminconsole.core.admin.GetRoundRobinAssignedRSSInstance param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.adminconsole.core.admin.GetRoundRobinAssignedRSSInstance.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.adminconsole.core.admin.GetRoundRobinAssignedRSSInstanceResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.adminconsole.core.admin.GetRoundRobinAssignedRSSInstanceResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.adminconsole.core.admin.EditPrivilegeGroup param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.adminconsole.core.admin.EditPrivilegeGroup.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.adminconsole.core.admin.AddRSSInstance param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.adminconsole.core.admin.AddRSSInstance.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.adminconsole.core.admin.DropUser param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.adminconsole.core.admin.DropUser.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.adminconsole.core.admin.CreateCarbonDSFromDatabaseUserEntry param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.adminconsole.core.admin.CreateCarbonDSFromDatabaseUserEntry.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.adminconsole.core.admin.CreateCarbonDSFromDatabaseUserEntryResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.adminconsole.core.admin.CreateCarbonDSFromDatabaseUserEntryResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.adminconsole.core.admin.GetDatabaseInstanceById param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.adminconsole.core.admin.GetDatabaseInstanceById.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.adminconsole.core.admin.GetDatabaseInstanceByIdResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.adminconsole.core.admin.GetDatabaseInstanceByIdResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.adminconsole.core.admin.CreateUser param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.adminconsole.core.admin.CreateUser.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.adminconsole.core.admin.GetRSSInstanceList param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.adminconsole.core.admin.GetRSSInstanceList.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.adminconsole.core.admin.GetRSSInstanceListResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.adminconsole.core.admin.GetRSSInstanceListResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.adminconsole.core.admin.GetUsersByDatabaseInstanceId param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.adminconsole.core.admin.GetUsersByDatabaseInstanceId.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.adminconsole.core.admin.GetUsersByDatabaseInstanceIdResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.adminconsole.core.admin.GetUsersByDatabaseInstanceIdResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.adminconsole.core.admin.GetUserDatabasePermissions param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.adminconsole.core.admin.GetUserDatabasePermissions.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.adminconsole.core.admin.GetUserDatabasePermissionsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.adminconsole.core.admin.GetUserDatabasePermissionsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.adminconsole.core.admin.DropDatabase param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.adminconsole.core.admin.DropDatabase.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.adminconsole.core.admin.TestConnection param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.adminconsole.core.admin.TestConnection.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.adminconsole.core.admin.TestConnectionResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.adminconsole.core.admin.TestConnectionResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.adminconsole.core.admin.GetRSSInstanceDataById param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.adminconsole.core.admin.GetRSSInstanceDataById.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.adminconsole.core.admin.GetRSSInstanceDataByIdResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.adminconsole.core.admin.GetRSSInstanceDataByIdResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.adminconsole.core.admin.GetPrivilegeGroupById param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.adminconsole.core.admin.GetPrivilegeGroupById.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.adminconsole.core.admin.GetPrivilegeGroupByIdResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.adminconsole.core.admin.GetPrivilegeGroupByIdResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.adminconsole.core.admin.GetPrivilegeGroups param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.adminconsole.core.admin.GetPrivilegeGroups.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.adminconsole.core.admin.GetPrivilegeGroupsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.adminconsole.core.admin.GetPrivilegeGroupsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.adminconsole.core.admin.RemovePrivilegeGroup param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.adminconsole.core.admin.RemovePrivilegeGroup.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.adminconsole.core.admin.EditUserPrivileges param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.adminconsole.core.admin.EditUserPrivileges.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.adminconsole.core.admin.GetDatabaseUserByIdResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.adminconsole.core.admin.GetDatabaseUserByIdResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.adminconsole.core.admin.GetDatabaseUserByIdResponse wrapgetDatabaseUserById(){
                                org.wso2.carbon.adminconsole.core.admin.GetDatabaseUserByIdResponse wrappedElement = new org.wso2.carbon.adminconsole.core.admin.GetDatabaseUserByIdResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.adminconsole.core.admin.GetDatabaseInstanceListResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.adminconsole.core.admin.GetDatabaseInstanceListResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.adminconsole.core.admin.GetDatabaseInstanceListResponse wrapgetDatabaseInstanceList(){
                                org.wso2.carbon.adminconsole.core.admin.GetDatabaseInstanceListResponse wrappedElement = new org.wso2.carbon.adminconsole.core.admin.GetDatabaseInstanceListResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.adminconsole.core.admin.GetRoundRobinAssignedRSSInstanceResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.adminconsole.core.admin.GetRoundRobinAssignedRSSInstanceResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.adminconsole.core.admin.GetRoundRobinAssignedRSSInstanceResponse wrapgetRoundRobinAssignedRSSInstance(){
                                org.wso2.carbon.adminconsole.core.admin.GetRoundRobinAssignedRSSInstanceResponse wrappedElement = new org.wso2.carbon.adminconsole.core.admin.GetRoundRobinAssignedRSSInstanceResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.adminconsole.core.admin.CreateCarbonDSFromDatabaseUserEntryResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.adminconsole.core.admin.CreateCarbonDSFromDatabaseUserEntryResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.adminconsole.core.admin.CreateCarbonDSFromDatabaseUserEntryResponse wrapcreateCarbonDSFromDatabaseUserEntry(){
                                org.wso2.carbon.adminconsole.core.admin.CreateCarbonDSFromDatabaseUserEntryResponse wrappedElement = new org.wso2.carbon.adminconsole.core.admin.CreateCarbonDSFromDatabaseUserEntryResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.adminconsole.core.admin.GetDatabaseInstanceByIdResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.adminconsole.core.admin.GetDatabaseInstanceByIdResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.adminconsole.core.admin.GetDatabaseInstanceByIdResponse wrapgetDatabaseInstanceById(){
                                org.wso2.carbon.adminconsole.core.admin.GetDatabaseInstanceByIdResponse wrappedElement = new org.wso2.carbon.adminconsole.core.admin.GetDatabaseInstanceByIdResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.adminconsole.core.admin.GetRSSInstanceListResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.adminconsole.core.admin.GetRSSInstanceListResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.adminconsole.core.admin.GetRSSInstanceListResponse wrapgetRSSInstanceList(){
                                org.wso2.carbon.adminconsole.core.admin.GetRSSInstanceListResponse wrappedElement = new org.wso2.carbon.adminconsole.core.admin.GetRSSInstanceListResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.adminconsole.core.admin.GetUsersByDatabaseInstanceIdResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.adminconsole.core.admin.GetUsersByDatabaseInstanceIdResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.adminconsole.core.admin.GetUsersByDatabaseInstanceIdResponse wrapgetUsersByDatabaseInstanceId(){
                                org.wso2.carbon.adminconsole.core.admin.GetUsersByDatabaseInstanceIdResponse wrappedElement = new org.wso2.carbon.adminconsole.core.admin.GetUsersByDatabaseInstanceIdResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.adminconsole.core.admin.GetUserDatabasePermissionsResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.adminconsole.core.admin.GetUserDatabasePermissionsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.adminconsole.core.admin.GetUserDatabasePermissionsResponse wrapgetUserDatabasePermissions(){
                                org.wso2.carbon.adminconsole.core.admin.GetUserDatabasePermissionsResponse wrappedElement = new org.wso2.carbon.adminconsole.core.admin.GetUserDatabasePermissionsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.adminconsole.core.admin.TestConnectionResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.adminconsole.core.admin.TestConnectionResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.adminconsole.core.admin.TestConnectionResponse wraptestConnection(){
                                org.wso2.carbon.adminconsole.core.admin.TestConnectionResponse wrappedElement = new org.wso2.carbon.adminconsole.core.admin.TestConnectionResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.adminconsole.core.admin.GetRSSInstanceDataByIdResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.adminconsole.core.admin.GetRSSInstanceDataByIdResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.adminconsole.core.admin.GetRSSInstanceDataByIdResponse wrapgetRSSInstanceDataById(){
                                org.wso2.carbon.adminconsole.core.admin.GetRSSInstanceDataByIdResponse wrappedElement = new org.wso2.carbon.adminconsole.core.admin.GetRSSInstanceDataByIdResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.adminconsole.core.admin.GetPrivilegeGroupByIdResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.adminconsole.core.admin.GetPrivilegeGroupByIdResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.adminconsole.core.admin.GetPrivilegeGroupByIdResponse wrapgetPrivilegeGroupById(){
                                org.wso2.carbon.adminconsole.core.admin.GetPrivilegeGroupByIdResponse wrappedElement = new org.wso2.carbon.adminconsole.core.admin.GetPrivilegeGroupByIdResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.adminconsole.core.admin.GetPrivilegeGroupsResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.adminconsole.core.admin.GetPrivilegeGroupsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.adminconsole.core.admin.GetPrivilegeGroupsResponse wrapgetPrivilegeGroups(){
                                org.wso2.carbon.adminconsole.core.admin.GetPrivilegeGroupsResponse wrappedElement = new org.wso2.carbon.adminconsole.core.admin.GetPrivilegeGroupsResponse();
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
        
                if (org.wso2.carbon.adminconsole.core.admin.GetDatabaseUserById.class.equals(type)){
                
                           return org.wso2.carbon.adminconsole.core.admin.GetDatabaseUserById.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.adminconsole.core.admin.GetDatabaseUserByIdResponse.class.equals(type)){
                
                           return org.wso2.carbon.adminconsole.core.admin.GetDatabaseUserByIdResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.adminconsole.core.admin.RSSManagerAdminServiceRSSDAOException.class.equals(type)){
                
                           return org.wso2.carbon.adminconsole.core.admin.RSSManagerAdminServiceRSSDAOException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.adminconsole.core.admin.CreatePrivilegeGroup.class.equals(type)){
                
                           return org.wso2.carbon.adminconsole.core.admin.CreatePrivilegeGroup.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.adminconsole.core.admin.RSSManagerAdminServiceRSSDAOException.class.equals(type)){
                
                           return org.wso2.carbon.adminconsole.core.admin.RSSManagerAdminServiceRSSDAOException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.adminconsole.core.admin.EditRSSInstance.class.equals(type)){
                
                           return org.wso2.carbon.adminconsole.core.admin.EditRSSInstance.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.adminconsole.core.admin.RSSManagerAdminServiceRSSDAOException.class.equals(type)){
                
                           return org.wso2.carbon.adminconsole.core.admin.RSSManagerAdminServiceRSSDAOException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.adminconsole.core.admin.RemoveRSSInstance.class.equals(type)){
                
                           return org.wso2.carbon.adminconsole.core.admin.RemoveRSSInstance.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.adminconsole.core.admin.RSSManagerAdminServiceRSSDAOException.class.equals(type)){
                
                           return org.wso2.carbon.adminconsole.core.admin.RSSManagerAdminServiceRSSDAOException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.adminconsole.core.admin.GetDatabaseInstanceList.class.equals(type)){
                
                           return org.wso2.carbon.adminconsole.core.admin.GetDatabaseInstanceList.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.adminconsole.core.admin.GetDatabaseInstanceListResponse.class.equals(type)){
                
                           return org.wso2.carbon.adminconsole.core.admin.GetDatabaseInstanceListResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.adminconsole.core.admin.RSSManagerAdminServiceRSSDAOException.class.equals(type)){
                
                           return org.wso2.carbon.adminconsole.core.admin.RSSManagerAdminServiceRSSDAOException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.adminconsole.core.admin.CreateDatabase.class.equals(type)){
                
                           return org.wso2.carbon.adminconsole.core.admin.CreateDatabase.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.adminconsole.core.admin.RSSManagerAdminServiceRSSDAOException.class.equals(type)){
                
                           return org.wso2.carbon.adminconsole.core.admin.RSSManagerAdminServiceRSSDAOException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.adminconsole.core.admin.GetRoundRobinAssignedRSSInstance.class.equals(type)){
                
                           return org.wso2.carbon.adminconsole.core.admin.GetRoundRobinAssignedRSSInstance.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.adminconsole.core.admin.GetRoundRobinAssignedRSSInstanceResponse.class.equals(type)){
                
                           return org.wso2.carbon.adminconsole.core.admin.GetRoundRobinAssignedRSSInstanceResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.adminconsole.core.admin.RSSManagerAdminServiceRSSDAOException.class.equals(type)){
                
                           return org.wso2.carbon.adminconsole.core.admin.RSSManagerAdminServiceRSSDAOException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.adminconsole.core.admin.EditPrivilegeGroup.class.equals(type)){
                
                           return org.wso2.carbon.adminconsole.core.admin.EditPrivilegeGroup.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.adminconsole.core.admin.RSSManagerAdminServiceRSSDAOException.class.equals(type)){
                
                           return org.wso2.carbon.adminconsole.core.admin.RSSManagerAdminServiceRSSDAOException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.adminconsole.core.admin.AddRSSInstance.class.equals(type)){
                
                           return org.wso2.carbon.adminconsole.core.admin.AddRSSInstance.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.adminconsole.core.admin.RSSManagerAdminServiceRSSDAOException.class.equals(type)){
                
                           return org.wso2.carbon.adminconsole.core.admin.RSSManagerAdminServiceRSSDAOException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.adminconsole.core.admin.DropUser.class.equals(type)){
                
                           return org.wso2.carbon.adminconsole.core.admin.DropUser.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.adminconsole.core.admin.RSSManagerAdminServiceRSSDAOException.class.equals(type)){
                
                           return org.wso2.carbon.adminconsole.core.admin.RSSManagerAdminServiceRSSDAOException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.adminconsole.core.admin.CreateCarbonDSFromDatabaseUserEntry.class.equals(type)){
                
                           return org.wso2.carbon.adminconsole.core.admin.CreateCarbonDSFromDatabaseUserEntry.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.adminconsole.core.admin.CreateCarbonDSFromDatabaseUserEntryResponse.class.equals(type)){
                
                           return org.wso2.carbon.adminconsole.core.admin.CreateCarbonDSFromDatabaseUserEntryResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.adminconsole.core.admin.RSSManagerAdminServiceRSSDAOException.class.equals(type)){
                
                           return org.wso2.carbon.adminconsole.core.admin.RSSManagerAdminServiceRSSDAOException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.adminconsole.core.admin.GetDatabaseInstanceById.class.equals(type)){
                
                           return org.wso2.carbon.adminconsole.core.admin.GetDatabaseInstanceById.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.adminconsole.core.admin.GetDatabaseInstanceByIdResponse.class.equals(type)){
                
                           return org.wso2.carbon.adminconsole.core.admin.GetDatabaseInstanceByIdResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.adminconsole.core.admin.RSSManagerAdminServiceRSSDAOException.class.equals(type)){
                
                           return org.wso2.carbon.adminconsole.core.admin.RSSManagerAdminServiceRSSDAOException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.adminconsole.core.admin.CreateUser.class.equals(type)){
                
                           return org.wso2.carbon.adminconsole.core.admin.CreateUser.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.adminconsole.core.admin.RSSManagerAdminServiceRSSDAOException.class.equals(type)){
                
                           return org.wso2.carbon.adminconsole.core.admin.RSSManagerAdminServiceRSSDAOException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.adminconsole.core.admin.GetRSSInstanceList.class.equals(type)){
                
                           return org.wso2.carbon.adminconsole.core.admin.GetRSSInstanceList.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.adminconsole.core.admin.GetRSSInstanceListResponse.class.equals(type)){
                
                           return org.wso2.carbon.adminconsole.core.admin.GetRSSInstanceListResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.adminconsole.core.admin.RSSManagerAdminServiceRSSDAOException.class.equals(type)){
                
                           return org.wso2.carbon.adminconsole.core.admin.RSSManagerAdminServiceRSSDAOException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.adminconsole.core.admin.GetUsersByDatabaseInstanceId.class.equals(type)){
                
                           return org.wso2.carbon.adminconsole.core.admin.GetUsersByDatabaseInstanceId.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.adminconsole.core.admin.GetUsersByDatabaseInstanceIdResponse.class.equals(type)){
                
                           return org.wso2.carbon.adminconsole.core.admin.GetUsersByDatabaseInstanceIdResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.adminconsole.core.admin.RSSManagerAdminServiceRSSDAOException.class.equals(type)){
                
                           return org.wso2.carbon.adminconsole.core.admin.RSSManagerAdminServiceRSSDAOException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.adminconsole.core.admin.GetUserDatabasePermissions.class.equals(type)){
                
                           return org.wso2.carbon.adminconsole.core.admin.GetUserDatabasePermissions.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.adminconsole.core.admin.GetUserDatabasePermissionsResponse.class.equals(type)){
                
                           return org.wso2.carbon.adminconsole.core.admin.GetUserDatabasePermissionsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.adminconsole.core.admin.RSSManagerAdminServiceRSSDAOException.class.equals(type)){
                
                           return org.wso2.carbon.adminconsole.core.admin.RSSManagerAdminServiceRSSDAOException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.adminconsole.core.admin.DropDatabase.class.equals(type)){
                
                           return org.wso2.carbon.adminconsole.core.admin.DropDatabase.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.adminconsole.core.admin.RSSManagerAdminServiceRSSDAOException.class.equals(type)){
                
                           return org.wso2.carbon.adminconsole.core.admin.RSSManagerAdminServiceRSSDAOException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.adminconsole.core.admin.TestConnection.class.equals(type)){
                
                           return org.wso2.carbon.adminconsole.core.admin.TestConnection.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.adminconsole.core.admin.TestConnectionResponse.class.equals(type)){
                
                           return org.wso2.carbon.adminconsole.core.admin.TestConnectionResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.adminconsole.core.admin.RSSManagerAdminServiceRSSDAOException.class.equals(type)){
                
                           return org.wso2.carbon.adminconsole.core.admin.RSSManagerAdminServiceRSSDAOException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.adminconsole.core.admin.GetRSSInstanceDataById.class.equals(type)){
                
                           return org.wso2.carbon.adminconsole.core.admin.GetRSSInstanceDataById.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.adminconsole.core.admin.GetRSSInstanceDataByIdResponse.class.equals(type)){
                
                           return org.wso2.carbon.adminconsole.core.admin.GetRSSInstanceDataByIdResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.adminconsole.core.admin.RSSManagerAdminServiceRSSDAOException.class.equals(type)){
                
                           return org.wso2.carbon.adminconsole.core.admin.RSSManagerAdminServiceRSSDAOException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.adminconsole.core.admin.GetPrivilegeGroupById.class.equals(type)){
                
                           return org.wso2.carbon.adminconsole.core.admin.GetPrivilegeGroupById.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.adminconsole.core.admin.GetPrivilegeGroupByIdResponse.class.equals(type)){
                
                           return org.wso2.carbon.adminconsole.core.admin.GetPrivilegeGroupByIdResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.adminconsole.core.admin.RSSManagerAdminServiceRSSDAOException.class.equals(type)){
                
                           return org.wso2.carbon.adminconsole.core.admin.RSSManagerAdminServiceRSSDAOException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.adminconsole.core.admin.GetPrivilegeGroups.class.equals(type)){
                
                           return org.wso2.carbon.adminconsole.core.admin.GetPrivilegeGroups.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.adminconsole.core.admin.GetPrivilegeGroupsResponse.class.equals(type)){
                
                           return org.wso2.carbon.adminconsole.core.admin.GetPrivilegeGroupsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.adminconsole.core.admin.RSSManagerAdminServiceRSSDAOException.class.equals(type)){
                
                           return org.wso2.carbon.adminconsole.core.admin.RSSManagerAdminServiceRSSDAOException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.adminconsole.core.admin.RemovePrivilegeGroup.class.equals(type)){
                
                           return org.wso2.carbon.adminconsole.core.admin.RemovePrivilegeGroup.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.adminconsole.core.admin.RSSManagerAdminServiceRSSDAOException.class.equals(type)){
                
                           return org.wso2.carbon.adminconsole.core.admin.RSSManagerAdminServiceRSSDAOException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.adminconsole.core.admin.EditUserPrivileges.class.equals(type)){
                
                           return org.wso2.carbon.adminconsole.core.admin.EditUserPrivileges.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.adminconsole.core.admin.RSSManagerAdminServiceRSSDAOException.class.equals(type)){
                
                           return org.wso2.carbon.adminconsole.core.admin.RSSManagerAdminServiceRSSDAOException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

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
    
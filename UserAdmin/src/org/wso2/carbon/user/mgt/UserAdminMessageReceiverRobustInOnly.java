

/**
 * UserAdminMessageReceiverRobustInOnly.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */
        package org.wso2.carbon.user.mgt;

        /**
        *  UserAdminMessageReceiverRobustInOnly message receiver
        */

        public class UserAdminMessageReceiverRobustInOnly extends org.apache.axis2.receivers.AbstractMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        UserAdminSkeletonInterface skel = (UserAdminSkeletonInterface)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){
     
        
            if("setRoleUIPermission".equals(methodName)){
            
            
                            //doc style
                            org.wso2.carbon.user.mgt.SetRoleUIPermission wrappedParam =
                                                         (org.wso2.carbon.user.mgt.SetRoleUIPermission)fromOM(
                                                        msgContext.getEnvelope().getBody().getFirstElement(),
                                                        org.wso2.carbon.user.mgt.SetRoleUIPermission.class,
                                                        getEnvelopeNamespaces(msgContext.getEnvelope()));
                                            
                                           
                                                     skel.setRoleUIPermission(wrappedParam) ;
                                                

                             envelope = getSOAPFactory(msgContext).getDefaultEnvelope();
                        } else 
            if("addUser".equals(methodName)){
            
            
                            //doc style
                            org.wso2.carbon.user.mgt.AddUser wrappedParam =
                                                         (org.wso2.carbon.user.mgt.AddUser)fromOM(
                                                        msgContext.getEnvelope().getBody().getFirstElement(),
                                                        org.wso2.carbon.user.mgt.AddUser.class,
                                                        getEnvelopeNamespaces(msgContext.getEnvelope()));
                                            
                                           
                                                     skel.addUser(wrappedParam) ;
                                                

                             envelope = getSOAPFactory(msgContext).getDefaultEnvelope();
                        } else 
            if("updateRoleName".equals(methodName)){
            
            
                            //doc style
                            org.wso2.carbon.user.mgt.UpdateRoleName wrappedParam =
                                                         (org.wso2.carbon.user.mgt.UpdateRoleName)fromOM(
                                                        msgContext.getEnvelope().getBody().getFirstElement(),
                                                        org.wso2.carbon.user.mgt.UpdateRoleName.class,
                                                        getEnvelopeNamespaces(msgContext.getEnvelope()));
                                            
                                           
                                                     skel.updateRoleName(wrappedParam) ;
                                                

                             envelope = getSOAPFactory(msgContext).getDefaultEnvelope();
                        } else 
            if("deleteUser".equals(methodName)){
            
            
                            //doc style
                            org.wso2.carbon.user.mgt.DeleteUser wrappedParam =
                                                         (org.wso2.carbon.user.mgt.DeleteUser)fromOM(
                                                        msgContext.getEnvelope().getBody().getFirstElement(),
                                                        org.wso2.carbon.user.mgt.DeleteUser.class,
                                                        getEnvelopeNamespaces(msgContext.getEnvelope()));
                                            
                                           
                                                     skel.deleteUser(wrappedParam) ;
                                                

                             envelope = getSOAPFactory(msgContext).getDefaultEnvelope();
                        } else 
            if("deleteRole".equals(methodName)){
            
            
                            //doc style
                            org.wso2.carbon.user.mgt.DeleteRole wrappedParam =
                                                         (org.wso2.carbon.user.mgt.DeleteRole)fromOM(
                                                        msgContext.getEnvelope().getBody().getFirstElement(),
                                                        org.wso2.carbon.user.mgt.DeleteRole.class,
                                                        getEnvelopeNamespaces(msgContext.getEnvelope()));
                                            
                                           
                                                     skel.deleteRole(wrappedParam) ;
                                                

                             envelope = getSOAPFactory(msgContext).getDefaultEnvelope();
                        } else 
            if("updateRolesOfUser".equals(methodName)){
            
            
                            //doc style
                            org.wso2.carbon.user.mgt.UpdateRolesOfUser wrappedParam =
                                                         (org.wso2.carbon.user.mgt.UpdateRolesOfUser)fromOM(
                                                        msgContext.getEnvelope().getBody().getFirstElement(),
                                                        org.wso2.carbon.user.mgt.UpdateRolesOfUser.class,
                                                        getEnvelopeNamespaces(msgContext.getEnvelope()));
                                            
                                           
                                                     skel.updateRolesOfUser(wrappedParam) ;
                                                

                             envelope = getSOAPFactory(msgContext).getDefaultEnvelope();
                        } else 
            if("changePassword".equals(methodName)){
            
            
                            //doc style
                            org.wso2.carbon.user.mgt.ChangePassword wrappedParam =
                                                         (org.wso2.carbon.user.mgt.ChangePassword)fromOM(
                                                        msgContext.getEnvelope().getBody().getFirstElement(),
                                                        org.wso2.carbon.user.mgt.ChangePassword.class,
                                                        getEnvelopeNamespaces(msgContext.getEnvelope()));
                                            
                                           
                                                     skel.changePassword(wrappedParam) ;
                                                

                             envelope = getSOAPFactory(msgContext).getDefaultEnvelope();
                        } else 
            if("addRole".equals(methodName)){
            
            
                            //doc style
                            org.wso2.carbon.user.mgt.AddRole wrappedParam =
                                                         (org.wso2.carbon.user.mgt.AddRole)fromOM(
                                                        msgContext.getEnvelope().getBody().getFirstElement(),
                                                        org.wso2.carbon.user.mgt.AddRole.class,
                                                        getEnvelopeNamespaces(msgContext.getEnvelope()));
                                            
                                           
                                                     skel.addRole(wrappedParam) ;
                                                

                             envelope = getSOAPFactory(msgContext).getDefaultEnvelope();
                        } else 
            if("bulkImportUsers".equals(methodName)){
            
            
                            //doc style
                            org.wso2.carbon.user.mgt.BulkImportUsers wrappedParam =
                                                         (org.wso2.carbon.user.mgt.BulkImportUsers)fromOM(
                                                        msgContext.getEnvelope().getBody().getFirstElement(),
                                                        org.wso2.carbon.user.mgt.BulkImportUsers.class,
                                                        getEnvelopeNamespaces(msgContext.getEnvelope()));
                                            
                                           
                                                     skel.bulkImportUsers(wrappedParam) ;
                                                

                             envelope = getSOAPFactory(msgContext).getDefaultEnvelope();
                        
                } else {
                  throw new java.lang.RuntimeException("method not found");
                }
            

        }
        } catch (UserAdminUserAdminExceptionException e) {
            msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME,"UserAdminUserAdminException");
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
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.user.mgt.ListUsers param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.user.mgt.ListUsers.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.user.mgt.ListUsersResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.user.mgt.ListUsersResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.user.mgt.UserAdminUserAdminException param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.user.mgt.UserAdminUserAdminException.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.user.mgt.SetRoleUIPermission param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.user.mgt.SetRoleUIPermission.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.user.mgt.GetUserStoreInfo param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.user.mgt.GetUserStoreInfo.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.user.mgt.GetUserStoreInfoResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.user.mgt.GetUserStoreInfoResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.user.mgt.ChangePasswordByUser param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.user.mgt.ChangePasswordByUser.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.user.mgt.AddUser param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.user.mgt.AddUser.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.user.mgt.UpdateRoleName param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.user.mgt.UpdateRoleName.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.user.mgt.GetRolesOfUser param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.user.mgt.GetRolesOfUser.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.user.mgt.GetRolesOfUserResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.user.mgt.GetRolesOfUserResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.user.mgt.GetRolePermissions param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.user.mgt.GetRolePermissions.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.user.mgt.GetRolePermissionsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.user.mgt.GetRolePermissionsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.user.mgt.DeleteUser param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.user.mgt.DeleteUser.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.user.mgt.DeleteRole param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.user.mgt.DeleteRole.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.user.mgt.UpdateRolesOfUser param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.user.mgt.UpdateRolesOfUser.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.user.mgt.UpdateUsersOfRole param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.user.mgt.UpdateUsersOfRole.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.user.mgt.ChangePassword param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.user.mgt.ChangePassword.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.user.mgt.AddRole param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.user.mgt.AddRole.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.user.mgt.GetAllRolesNames param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.user.mgt.GetAllRolesNames.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.user.mgt.GetAllRolesNamesResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.user.mgt.GetAllRolesNamesResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.user.mgt.GetUsersOfRole param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.user.mgt.GetUsersOfRole.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.user.mgt.GetUsersOfRoleResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.user.mgt.GetUsersOfRoleResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.user.mgt.GetAllUIPermissions param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.user.mgt.GetAllUIPermissions.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.user.mgt.GetAllUIPermissionsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.user.mgt.GetAllUIPermissionsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.user.mgt.BulkImportUsers param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.user.mgt.BulkImportUsers.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.user.mgt.ListUsersResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.user.mgt.ListUsersResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.user.mgt.ListUsersResponse wraplistUsers(){
                                org.wso2.carbon.user.mgt.ListUsersResponse wrappedElement = new org.wso2.carbon.user.mgt.ListUsersResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.user.mgt.GetUserStoreInfoResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.user.mgt.GetUserStoreInfoResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.user.mgt.GetUserStoreInfoResponse wrapgetUserStoreInfo(){
                                org.wso2.carbon.user.mgt.GetUserStoreInfoResponse wrappedElement = new org.wso2.carbon.user.mgt.GetUserStoreInfoResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.user.mgt.GetRolesOfUserResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.user.mgt.GetRolesOfUserResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.user.mgt.GetRolesOfUserResponse wrapgetRolesOfUser(){
                                org.wso2.carbon.user.mgt.GetRolesOfUserResponse wrappedElement = new org.wso2.carbon.user.mgt.GetRolesOfUserResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.user.mgt.GetRolePermissionsResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.user.mgt.GetRolePermissionsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.user.mgt.GetRolePermissionsResponse wrapgetRolePermissions(){
                                org.wso2.carbon.user.mgt.GetRolePermissionsResponse wrappedElement = new org.wso2.carbon.user.mgt.GetRolePermissionsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.user.mgt.GetAllRolesNamesResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.user.mgt.GetAllRolesNamesResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.user.mgt.GetAllRolesNamesResponse wrapgetAllRolesNames(){
                                org.wso2.carbon.user.mgt.GetAllRolesNamesResponse wrappedElement = new org.wso2.carbon.user.mgt.GetAllRolesNamesResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.user.mgt.GetUsersOfRoleResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.user.mgt.GetUsersOfRoleResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.user.mgt.GetUsersOfRoleResponse wrapgetUsersOfRole(){
                                org.wso2.carbon.user.mgt.GetUsersOfRoleResponse wrappedElement = new org.wso2.carbon.user.mgt.GetUsersOfRoleResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.user.mgt.GetAllUIPermissionsResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.user.mgt.GetAllUIPermissionsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.user.mgt.GetAllUIPermissionsResponse wrapgetAllUIPermissions(){
                                org.wso2.carbon.user.mgt.GetAllUIPermissionsResponse wrappedElement = new org.wso2.carbon.user.mgt.GetAllUIPermissionsResponse();
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
        
                if (org.wso2.carbon.user.mgt.ListUsers.class.equals(type)){
                
                           return org.wso2.carbon.user.mgt.ListUsers.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.user.mgt.ListUsersResponse.class.equals(type)){
                
                           return org.wso2.carbon.user.mgt.ListUsersResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.user.mgt.UserAdminUserAdminException.class.equals(type)){
                
                           return org.wso2.carbon.user.mgt.UserAdminUserAdminException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.user.mgt.SetRoleUIPermission.class.equals(type)){
                
                           return org.wso2.carbon.user.mgt.SetRoleUIPermission.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.user.mgt.UserAdminUserAdminException.class.equals(type)){
                
                           return org.wso2.carbon.user.mgt.UserAdminUserAdminException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.user.mgt.GetUserStoreInfo.class.equals(type)){
                
                           return org.wso2.carbon.user.mgt.GetUserStoreInfo.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.user.mgt.GetUserStoreInfoResponse.class.equals(type)){
                
                           return org.wso2.carbon.user.mgt.GetUserStoreInfoResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.user.mgt.UserAdminUserAdminException.class.equals(type)){
                
                           return org.wso2.carbon.user.mgt.UserAdminUserAdminException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.user.mgt.ChangePasswordByUser.class.equals(type)){
                
                           return org.wso2.carbon.user.mgt.ChangePasswordByUser.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.user.mgt.UserAdminUserAdminException.class.equals(type)){
                
                           return org.wso2.carbon.user.mgt.UserAdminUserAdminException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.user.mgt.AddUser.class.equals(type)){
                
                           return org.wso2.carbon.user.mgt.AddUser.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.user.mgt.UserAdminUserAdminException.class.equals(type)){
                
                           return org.wso2.carbon.user.mgt.UserAdminUserAdminException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.user.mgt.UpdateRoleName.class.equals(type)){
                
                           return org.wso2.carbon.user.mgt.UpdateRoleName.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.user.mgt.UserAdminUserAdminException.class.equals(type)){
                
                           return org.wso2.carbon.user.mgt.UserAdminUserAdminException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.user.mgt.GetRolesOfUser.class.equals(type)){
                
                           return org.wso2.carbon.user.mgt.GetRolesOfUser.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.user.mgt.GetRolesOfUserResponse.class.equals(type)){
                
                           return org.wso2.carbon.user.mgt.GetRolesOfUserResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.user.mgt.UserAdminUserAdminException.class.equals(type)){
                
                           return org.wso2.carbon.user.mgt.UserAdminUserAdminException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.user.mgt.GetRolePermissions.class.equals(type)){
                
                           return org.wso2.carbon.user.mgt.GetRolePermissions.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.user.mgt.GetRolePermissionsResponse.class.equals(type)){
                
                           return org.wso2.carbon.user.mgt.GetRolePermissionsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.user.mgt.UserAdminUserAdminException.class.equals(type)){
                
                           return org.wso2.carbon.user.mgt.UserAdminUserAdminException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.user.mgt.DeleteUser.class.equals(type)){
                
                           return org.wso2.carbon.user.mgt.DeleteUser.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.user.mgt.UserAdminUserAdminException.class.equals(type)){
                
                           return org.wso2.carbon.user.mgt.UserAdminUserAdminException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.user.mgt.DeleteRole.class.equals(type)){
                
                           return org.wso2.carbon.user.mgt.DeleteRole.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.user.mgt.UserAdminUserAdminException.class.equals(type)){
                
                           return org.wso2.carbon.user.mgt.UserAdminUserAdminException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.user.mgt.UpdateRolesOfUser.class.equals(type)){
                
                           return org.wso2.carbon.user.mgt.UpdateRolesOfUser.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.user.mgt.UserAdminUserAdminException.class.equals(type)){
                
                           return org.wso2.carbon.user.mgt.UserAdminUserAdminException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.user.mgt.UpdateUsersOfRole.class.equals(type)){
                
                           return org.wso2.carbon.user.mgt.UpdateUsersOfRole.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.user.mgt.UserAdminUserAdminException.class.equals(type)){
                
                           return org.wso2.carbon.user.mgt.UserAdminUserAdminException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.user.mgt.ChangePassword.class.equals(type)){
                
                           return org.wso2.carbon.user.mgt.ChangePassword.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.user.mgt.UserAdminUserAdminException.class.equals(type)){
                
                           return org.wso2.carbon.user.mgt.UserAdminUserAdminException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.user.mgt.AddRole.class.equals(type)){
                
                           return org.wso2.carbon.user.mgt.AddRole.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.user.mgt.UserAdminUserAdminException.class.equals(type)){
                
                           return org.wso2.carbon.user.mgt.UserAdminUserAdminException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.user.mgt.GetAllRolesNames.class.equals(type)){
                
                           return org.wso2.carbon.user.mgt.GetAllRolesNames.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.user.mgt.GetAllRolesNamesResponse.class.equals(type)){
                
                           return org.wso2.carbon.user.mgt.GetAllRolesNamesResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.user.mgt.UserAdminUserAdminException.class.equals(type)){
                
                           return org.wso2.carbon.user.mgt.UserAdminUserAdminException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.user.mgt.GetUsersOfRole.class.equals(type)){
                
                           return org.wso2.carbon.user.mgt.GetUsersOfRole.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.user.mgt.GetUsersOfRoleResponse.class.equals(type)){
                
                           return org.wso2.carbon.user.mgt.GetUsersOfRoleResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.user.mgt.UserAdminUserAdminException.class.equals(type)){
                
                           return org.wso2.carbon.user.mgt.UserAdminUserAdminException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.user.mgt.GetAllUIPermissions.class.equals(type)){
                
                           return org.wso2.carbon.user.mgt.GetAllUIPermissions.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.user.mgt.GetAllUIPermissionsResponse.class.equals(type)){
                
                           return org.wso2.carbon.user.mgt.GetAllUIPermissionsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.user.mgt.UserAdminUserAdminException.class.equals(type)){
                
                           return org.wso2.carbon.user.mgt.UserAdminUserAdminException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.user.mgt.BulkImportUsers.class.equals(type)){
                
                           return org.wso2.carbon.user.mgt.BulkImportUsers.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.user.mgt.UserAdminUserAdminException.class.equals(type)){
                
                           return org.wso2.carbon.user.mgt.UserAdminUserAdminException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

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
    
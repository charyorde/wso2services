

/**
 * RemoteUserStoreManagerServiceMessageReceiverRobustInOnly.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */
        package org.wso2.carbon.um.ws.service;

        /**
        *  RemoteUserStoreManagerServiceMessageReceiverRobustInOnly message receiver
        */

        public class RemoteUserStoreManagerServiceMessageReceiverRobustInOnly extends org.apache.axis2.receivers.AbstractMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        RemoteUserStoreManagerServiceSkeletonInterface skel = (RemoteUserStoreManagerServiceSkeletonInterface)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){
     
        
            if("setUserClaimValues".equals(methodName)){
            
            
                            //doc style
                            org.wso2.carbon.um.ws.service.SetUserClaimValues wrappedParam =
                                                         (org.wso2.carbon.um.ws.service.SetUserClaimValues)fromOM(
                                                        msgContext.getEnvelope().getBody().getFirstElement(),
                                                        org.wso2.carbon.um.ws.service.SetUserClaimValues.class,
                                                        getEnvelopeNamespaces(msgContext.getEnvelope()));
                                            
                                           
                                                     skel.setUserClaimValues(wrappedParam) ;
                                                

                             envelope = getSOAPFactory(msgContext).getDefaultEnvelope();
                        } else 
            if("deleteUser".equals(methodName)){
            
            
                            //doc style
                            org.wso2.carbon.um.ws.service.DeleteUser wrappedParam =
                                                         (org.wso2.carbon.um.ws.service.DeleteUser)fromOM(
                                                        msgContext.getEnvelope().getBody().getFirstElement(),
                                                        org.wso2.carbon.um.ws.service.DeleteUser.class,
                                                        getEnvelopeNamespaces(msgContext.getEnvelope()));
                                            
                                           
                                                     skel.deleteUser(wrappedParam) ;
                                                

                             envelope = getSOAPFactory(msgContext).getDefaultEnvelope();
                        } else 
            if("updateRoleListOfUser".equals(methodName)){
            
            
                            //doc style
                            org.wso2.carbon.um.ws.service.UpdateRoleListOfUser wrappedParam =
                                                         (org.wso2.carbon.um.ws.service.UpdateRoleListOfUser)fromOM(
                                                        msgContext.getEnvelope().getBody().getFirstElement(),
                                                        org.wso2.carbon.um.ws.service.UpdateRoleListOfUser.class,
                                                        getEnvelopeNamespaces(msgContext.getEnvelope()));
                                            
                                           
                                                     skel.updateRoleListOfUser(wrappedParam) ;
                                                

                             envelope = getSOAPFactory(msgContext).getDefaultEnvelope();
                        } else 
            if("addRole".equals(methodName)){
            
            
                            //doc style
                            org.wso2.carbon.um.ws.service.AddRole wrappedParam =
                                                         (org.wso2.carbon.um.ws.service.AddRole)fromOM(
                                                        msgContext.getEnvelope().getBody().getFirstElement(),
                                                        org.wso2.carbon.um.ws.service.AddRole.class,
                                                        getEnvelopeNamespaces(msgContext.getEnvelope()));
                                            
                                           
                                                     skel.addRole(wrappedParam) ;
                                                

                             envelope = getSOAPFactory(msgContext).getDefaultEnvelope();
                        } else 
            if("addUser".equals(methodName)){
            
            
                            //doc style
                            org.wso2.carbon.um.ws.service.AddUser wrappedParam =
                                                         (org.wso2.carbon.um.ws.service.AddUser)fromOM(
                                                        msgContext.getEnvelope().getBody().getFirstElement(),
                                                        org.wso2.carbon.um.ws.service.AddUser.class,
                                                        getEnvelopeNamespaces(msgContext.getEnvelope()));
                                            
                                           
                                                     skel.addUser(wrappedParam) ;
                                                

                             envelope = getSOAPFactory(msgContext).getDefaultEnvelope();
                        } else 
            if("deleteUserClaimValue".equals(methodName)){
            
            
                            //doc style
                            org.wso2.carbon.um.ws.service.DeleteUserClaimValue wrappedParam =
                                                         (org.wso2.carbon.um.ws.service.DeleteUserClaimValue)fromOM(
                                                        msgContext.getEnvelope().getBody().getFirstElement(),
                                                        org.wso2.carbon.um.ws.service.DeleteUserClaimValue.class,
                                                        getEnvelopeNamespaces(msgContext.getEnvelope()));
                                            
                                           
                                                     skel.deleteUserClaimValue(wrappedParam) ;
                                                

                             envelope = getSOAPFactory(msgContext).getDefaultEnvelope();
                        } else 
            if("updateUserListOfRole".equals(methodName)){
            
            
                            //doc style
                            org.wso2.carbon.um.ws.service.UpdateUserListOfRole wrappedParam =
                                                         (org.wso2.carbon.um.ws.service.UpdateUserListOfRole)fromOM(
                                                        msgContext.getEnvelope().getBody().getFirstElement(),
                                                        org.wso2.carbon.um.ws.service.UpdateUserListOfRole.class,
                                                        getEnvelopeNamespaces(msgContext.getEnvelope()));
                                            
                                           
                                                     skel.updateUserListOfRole(wrappedParam) ;
                                                

                             envelope = getSOAPFactory(msgContext).getDefaultEnvelope();
                        } else 
            if("updateRoleName".equals(methodName)){
            
            
                            //doc style
                            org.wso2.carbon.um.ws.service.UpdateRoleName wrappedParam =
                                                         (org.wso2.carbon.um.ws.service.UpdateRoleName)fromOM(
                                                        msgContext.getEnvelope().getBody().getFirstElement(),
                                                        org.wso2.carbon.um.ws.service.UpdateRoleName.class,
                                                        getEnvelopeNamespaces(msgContext.getEnvelope()));
                                            
                                           
                                                     skel.updateRoleName(wrappedParam) ;
                                                

                             envelope = getSOAPFactory(msgContext).getDefaultEnvelope();
                        } else 
            if("deleteUserClaimValues".equals(methodName)){
            
            
                            //doc style
                            org.wso2.carbon.um.ws.service.DeleteUserClaimValues wrappedParam =
                                                         (org.wso2.carbon.um.ws.service.DeleteUserClaimValues)fromOM(
                                                        msgContext.getEnvelope().getBody().getFirstElement(),
                                                        org.wso2.carbon.um.ws.service.DeleteUserClaimValues.class,
                                                        getEnvelopeNamespaces(msgContext.getEnvelope()));
                                            
                                           
                                                     skel.deleteUserClaimValues(wrappedParam) ;
                                                

                             envelope = getSOAPFactory(msgContext).getDefaultEnvelope();
                        } else 
            if("deleteRole".equals(methodName)){
            
            
                            //doc style
                            org.wso2.carbon.um.ws.service.DeleteRole wrappedParam =
                                                         (org.wso2.carbon.um.ws.service.DeleteRole)fromOM(
                                                        msgContext.getEnvelope().getBody().getFirstElement(),
                                                        org.wso2.carbon.um.ws.service.DeleteRole.class,
                                                        getEnvelopeNamespaces(msgContext.getEnvelope()));
                                            
                                           
                                                     skel.deleteRole(wrappedParam) ;
                                                

                             envelope = getSOAPFactory(msgContext).getDefaultEnvelope();
                        } else 
            if("setUserClaimValue".equals(methodName)){
            
            
                            //doc style
                            org.wso2.carbon.um.ws.service.SetUserClaimValue wrappedParam =
                                                         (org.wso2.carbon.um.ws.service.SetUserClaimValue)fromOM(
                                                        msgContext.getEnvelope().getBody().getFirstElement(),
                                                        org.wso2.carbon.um.ws.service.SetUserClaimValue.class,
                                                        getEnvelopeNamespaces(msgContext.getEnvelope()));
                                            
                                           
                                                     skel.setUserClaimValue(wrappedParam) ;
                                                

                             envelope = getSOAPFactory(msgContext).getDefaultEnvelope();
                        } else 
            if("updateCredential".equals(methodName)){
            
            
                            //doc style
                            org.wso2.carbon.um.ws.service.UpdateCredential wrappedParam =
                                                         (org.wso2.carbon.um.ws.service.UpdateCredential)fromOM(
                                                        msgContext.getEnvelope().getBody().getFirstElement(),
                                                        org.wso2.carbon.um.ws.service.UpdateCredential.class,
                                                        getEnvelopeNamespaces(msgContext.getEnvelope()));
                                            
                                           
                                                     skel.updateCredential(wrappedParam) ;
                                                

                             envelope = getSOAPFactory(msgContext).getDefaultEnvelope();
                        } else 
            if("updateCredentialByAdmin".equals(methodName)){
            
            
                            //doc style
                            org.wso2.carbon.um.ws.service.UpdateCredentialByAdmin wrappedParam =
                                                         (org.wso2.carbon.um.ws.service.UpdateCredentialByAdmin)fromOM(
                                                        msgContext.getEnvelope().getBody().getFirstElement(),
                                                        org.wso2.carbon.um.ws.service.UpdateCredentialByAdmin.class,
                                                        getEnvelopeNamespaces(msgContext.getEnvelope()));
                                            
                                           
                                                     skel.updateCredentialByAdmin(wrappedParam) ;
                                                

                             envelope = getSOAPFactory(msgContext).getDefaultEnvelope();
                        
                } else {
                  throw new java.lang.RuntimeException("method not found");
                }
            

        }
        } catch (RemoteUserStoreManagerServiceUserStoreExceptionException e) {
            msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME,"RemoteUserStoreManagerServiceUserStoreException");
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
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.um.ws.service.SetUserClaimValues param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.um.ws.service.SetUserClaimValues.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreException param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreException.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.um.ws.service.GetUserClaimValuesForClaims param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.um.ws.service.GetUserClaimValuesForClaims.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.um.ws.service.GetUserClaimValuesForClaimsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.um.ws.service.GetUserClaimValuesForClaimsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.um.ws.service.DeleteUser param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.um.ws.service.DeleteUser.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.um.ws.service.IsExistingRole param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.um.ws.service.IsExistingRole.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.um.ws.service.IsExistingRoleResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.um.ws.service.IsExistingRoleResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.um.ws.service.UpdateRoleListOfUser param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.um.ws.service.UpdateRoleListOfUser.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.um.ws.service.AddRole param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.um.ws.service.AddRole.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.um.ws.service.GetAllProfileNames param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.um.ws.service.GetAllProfileNames.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.um.ws.service.GetAllProfileNamesResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.um.ws.service.GetAllProfileNamesResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.um.ws.service.IsExistingUser param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.um.ws.service.IsExistingUser.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.um.ws.service.IsExistingUserResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.um.ws.service.IsExistingUserResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.um.ws.service.AddUser param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.um.ws.service.AddUser.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.um.ws.service.DeleteUserClaimValue param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.um.ws.service.DeleteUserClaimValue.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.um.ws.service.GetRoleNames param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.um.ws.service.GetRoleNames.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.um.ws.service.GetRoleNamesResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.um.ws.service.GetRoleNamesResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.um.ws.service.GetProfileNames param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.um.ws.service.GetProfileNames.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.um.ws.service.GetProfileNamesResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.um.ws.service.GetProfileNamesResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.um.ws.service.UpdateUserListOfRole param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.um.ws.service.UpdateUserListOfRole.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.um.ws.service.UpdateRoleName param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.um.ws.service.UpdateRoleName.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.um.ws.service.GetHybridRoles param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.um.ws.service.GetHybridRoles.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.um.ws.service.GetHybridRolesResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.um.ws.service.GetHybridRolesResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.um.ws.service.DeleteUserClaimValues param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.um.ws.service.DeleteUserClaimValues.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.um.ws.service.Authenticate param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.um.ws.service.Authenticate.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.um.ws.service.AuthenticateResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.um.ws.service.AuthenticateResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.um.ws.service.GetUserId param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.um.ws.service.GetUserId.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.um.ws.service.GetUserIdResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.um.ws.service.GetUserIdResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.um.ws.service.DeleteRole param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.um.ws.service.DeleteRole.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.um.ws.service.GetUserClaimValues param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.um.ws.service.GetUserClaimValues.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.um.ws.service.GetUserClaimValuesResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.um.ws.service.GetUserClaimValuesResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.um.ws.service.GetUserListOfRole param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.um.ws.service.GetUserListOfRole.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.um.ws.service.GetUserListOfRoleResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.um.ws.service.GetUserListOfRoleResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.um.ws.service.GetRoleListOfUser param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.um.ws.service.GetRoleListOfUser.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.um.ws.service.GetRoleListOfUserResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.um.ws.service.GetRoleListOfUserResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.um.ws.service.SetUserClaimValue param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.um.ws.service.SetUserClaimValue.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.um.ws.service.UpdateCredential param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.um.ws.service.UpdateCredential.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.um.ws.service.GetProperties param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.um.ws.service.GetProperties.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.um.ws.service.GetPropertiesResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.um.ws.service.GetPropertiesResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.um.ws.service.IsReadOnly param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.um.ws.service.IsReadOnly.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.um.ws.service.IsReadOnlyResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.um.ws.service.IsReadOnlyResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.um.ws.service.GetUserClaimValue param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.um.ws.service.GetUserClaimValue.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.um.ws.service.GetUserClaimValueResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.um.ws.service.GetUserClaimValueResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.um.ws.service.GetTenantIdofUser param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.um.ws.service.GetTenantIdofUser.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.um.ws.service.GetTenantIdofUserResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.um.ws.service.GetTenantIdofUserResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.um.ws.service.ListUsers param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.um.ws.service.ListUsers.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.um.ws.service.ListUsersResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.um.ws.service.ListUsersResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.um.ws.service.GetPasswordExpirationTime param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.um.ws.service.GetPasswordExpirationTime.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.um.ws.service.GetPasswordExpirationTimeResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.um.ws.service.GetPasswordExpirationTimeResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.um.ws.service.UpdateCredentialByAdmin param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.um.ws.service.UpdateCredentialByAdmin.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.um.ws.service.GetTenantId param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.um.ws.service.GetTenantId.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.um.ws.service.GetTenantIdResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.um.ws.service.GetTenantIdResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.um.ws.service.GetUserClaimValuesForClaimsResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.um.ws.service.GetUserClaimValuesForClaimsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.um.ws.service.GetUserClaimValuesForClaimsResponse wrapgetUserClaimValuesForClaims(){
                                org.wso2.carbon.um.ws.service.GetUserClaimValuesForClaimsResponse wrappedElement = new org.wso2.carbon.um.ws.service.GetUserClaimValuesForClaimsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.um.ws.service.IsExistingRoleResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.um.ws.service.IsExistingRoleResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.um.ws.service.IsExistingRoleResponse wrapisExistingRole(){
                                org.wso2.carbon.um.ws.service.IsExistingRoleResponse wrappedElement = new org.wso2.carbon.um.ws.service.IsExistingRoleResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.um.ws.service.GetAllProfileNamesResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.um.ws.service.GetAllProfileNamesResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.um.ws.service.GetAllProfileNamesResponse wrapgetAllProfileNames(){
                                org.wso2.carbon.um.ws.service.GetAllProfileNamesResponse wrappedElement = new org.wso2.carbon.um.ws.service.GetAllProfileNamesResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.um.ws.service.IsExistingUserResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.um.ws.service.IsExistingUserResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.um.ws.service.IsExistingUserResponse wrapisExistingUser(){
                                org.wso2.carbon.um.ws.service.IsExistingUserResponse wrappedElement = new org.wso2.carbon.um.ws.service.IsExistingUserResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.um.ws.service.GetRoleNamesResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.um.ws.service.GetRoleNamesResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.um.ws.service.GetRoleNamesResponse wrapgetRoleNames(){
                                org.wso2.carbon.um.ws.service.GetRoleNamesResponse wrappedElement = new org.wso2.carbon.um.ws.service.GetRoleNamesResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.um.ws.service.GetProfileNamesResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.um.ws.service.GetProfileNamesResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.um.ws.service.GetProfileNamesResponse wrapgetProfileNames(){
                                org.wso2.carbon.um.ws.service.GetProfileNamesResponse wrappedElement = new org.wso2.carbon.um.ws.service.GetProfileNamesResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.um.ws.service.GetHybridRolesResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.um.ws.service.GetHybridRolesResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.um.ws.service.GetHybridRolesResponse wrapgetHybridRoles(){
                                org.wso2.carbon.um.ws.service.GetHybridRolesResponse wrappedElement = new org.wso2.carbon.um.ws.service.GetHybridRolesResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.um.ws.service.AuthenticateResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.um.ws.service.AuthenticateResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.um.ws.service.AuthenticateResponse wrapauthenticate(){
                                org.wso2.carbon.um.ws.service.AuthenticateResponse wrappedElement = new org.wso2.carbon.um.ws.service.AuthenticateResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.um.ws.service.GetUserIdResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.um.ws.service.GetUserIdResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.um.ws.service.GetUserIdResponse wrapgetUserId(){
                                org.wso2.carbon.um.ws.service.GetUserIdResponse wrappedElement = new org.wso2.carbon.um.ws.service.GetUserIdResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.um.ws.service.GetUserClaimValuesResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.um.ws.service.GetUserClaimValuesResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.um.ws.service.GetUserClaimValuesResponse wrapgetUserClaimValues(){
                                org.wso2.carbon.um.ws.service.GetUserClaimValuesResponse wrappedElement = new org.wso2.carbon.um.ws.service.GetUserClaimValuesResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.um.ws.service.GetUserListOfRoleResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.um.ws.service.GetUserListOfRoleResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.um.ws.service.GetUserListOfRoleResponse wrapgetUserListOfRole(){
                                org.wso2.carbon.um.ws.service.GetUserListOfRoleResponse wrappedElement = new org.wso2.carbon.um.ws.service.GetUserListOfRoleResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.um.ws.service.GetRoleListOfUserResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.um.ws.service.GetRoleListOfUserResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.um.ws.service.GetRoleListOfUserResponse wrapgetRoleListOfUser(){
                                org.wso2.carbon.um.ws.service.GetRoleListOfUserResponse wrappedElement = new org.wso2.carbon.um.ws.service.GetRoleListOfUserResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.um.ws.service.GetPropertiesResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.um.ws.service.GetPropertiesResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.um.ws.service.GetPropertiesResponse wrapgetProperties(){
                                org.wso2.carbon.um.ws.service.GetPropertiesResponse wrappedElement = new org.wso2.carbon.um.ws.service.GetPropertiesResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.um.ws.service.IsReadOnlyResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.um.ws.service.IsReadOnlyResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.um.ws.service.IsReadOnlyResponse wrapisReadOnly(){
                                org.wso2.carbon.um.ws.service.IsReadOnlyResponse wrappedElement = new org.wso2.carbon.um.ws.service.IsReadOnlyResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.um.ws.service.GetUserClaimValueResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.um.ws.service.GetUserClaimValueResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.um.ws.service.GetUserClaimValueResponse wrapgetUserClaimValue(){
                                org.wso2.carbon.um.ws.service.GetUserClaimValueResponse wrappedElement = new org.wso2.carbon.um.ws.service.GetUserClaimValueResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.um.ws.service.GetTenantIdofUserResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.um.ws.service.GetTenantIdofUserResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.um.ws.service.GetTenantIdofUserResponse wrapgetTenantIdofUser(){
                                org.wso2.carbon.um.ws.service.GetTenantIdofUserResponse wrappedElement = new org.wso2.carbon.um.ws.service.GetTenantIdofUserResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.um.ws.service.ListUsersResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.um.ws.service.ListUsersResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.um.ws.service.ListUsersResponse wraplistUsers(){
                                org.wso2.carbon.um.ws.service.ListUsersResponse wrappedElement = new org.wso2.carbon.um.ws.service.ListUsersResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.um.ws.service.GetPasswordExpirationTimeResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.um.ws.service.GetPasswordExpirationTimeResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.um.ws.service.GetPasswordExpirationTimeResponse wrapgetPasswordExpirationTime(){
                                org.wso2.carbon.um.ws.service.GetPasswordExpirationTimeResponse wrappedElement = new org.wso2.carbon.um.ws.service.GetPasswordExpirationTimeResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.um.ws.service.GetTenantIdResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.um.ws.service.GetTenantIdResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.um.ws.service.GetTenantIdResponse wrapgetTenantId(){
                                org.wso2.carbon.um.ws.service.GetTenantIdResponse wrappedElement = new org.wso2.carbon.um.ws.service.GetTenantIdResponse();
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
        
                if (org.wso2.carbon.um.ws.service.SetUserClaimValues.class.equals(type)){
                
                           return org.wso2.carbon.um.ws.service.SetUserClaimValues.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreException.class.equals(type)){
                
                           return org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.um.ws.service.GetUserClaimValuesForClaims.class.equals(type)){
                
                           return org.wso2.carbon.um.ws.service.GetUserClaimValuesForClaims.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.um.ws.service.GetUserClaimValuesForClaimsResponse.class.equals(type)){
                
                           return org.wso2.carbon.um.ws.service.GetUserClaimValuesForClaimsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreException.class.equals(type)){
                
                           return org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.um.ws.service.DeleteUser.class.equals(type)){
                
                           return org.wso2.carbon.um.ws.service.DeleteUser.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreException.class.equals(type)){
                
                           return org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.um.ws.service.IsExistingRole.class.equals(type)){
                
                           return org.wso2.carbon.um.ws.service.IsExistingRole.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.um.ws.service.IsExistingRoleResponse.class.equals(type)){
                
                           return org.wso2.carbon.um.ws.service.IsExistingRoleResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreException.class.equals(type)){
                
                           return org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.um.ws.service.UpdateRoleListOfUser.class.equals(type)){
                
                           return org.wso2.carbon.um.ws.service.UpdateRoleListOfUser.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreException.class.equals(type)){
                
                           return org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.um.ws.service.AddRole.class.equals(type)){
                
                           return org.wso2.carbon.um.ws.service.AddRole.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreException.class.equals(type)){
                
                           return org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.um.ws.service.GetAllProfileNames.class.equals(type)){
                
                           return org.wso2.carbon.um.ws.service.GetAllProfileNames.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.um.ws.service.GetAllProfileNamesResponse.class.equals(type)){
                
                           return org.wso2.carbon.um.ws.service.GetAllProfileNamesResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreException.class.equals(type)){
                
                           return org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.um.ws.service.IsExistingUser.class.equals(type)){
                
                           return org.wso2.carbon.um.ws.service.IsExistingUser.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.um.ws.service.IsExistingUserResponse.class.equals(type)){
                
                           return org.wso2.carbon.um.ws.service.IsExistingUserResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreException.class.equals(type)){
                
                           return org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.um.ws.service.AddUser.class.equals(type)){
                
                           return org.wso2.carbon.um.ws.service.AddUser.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreException.class.equals(type)){
                
                           return org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.um.ws.service.DeleteUserClaimValue.class.equals(type)){
                
                           return org.wso2.carbon.um.ws.service.DeleteUserClaimValue.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreException.class.equals(type)){
                
                           return org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.um.ws.service.GetRoleNames.class.equals(type)){
                
                           return org.wso2.carbon.um.ws.service.GetRoleNames.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.um.ws.service.GetRoleNamesResponse.class.equals(type)){
                
                           return org.wso2.carbon.um.ws.service.GetRoleNamesResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreException.class.equals(type)){
                
                           return org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.um.ws.service.GetProfileNames.class.equals(type)){
                
                           return org.wso2.carbon.um.ws.service.GetProfileNames.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.um.ws.service.GetProfileNamesResponse.class.equals(type)){
                
                           return org.wso2.carbon.um.ws.service.GetProfileNamesResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreException.class.equals(type)){
                
                           return org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.um.ws.service.UpdateUserListOfRole.class.equals(type)){
                
                           return org.wso2.carbon.um.ws.service.UpdateUserListOfRole.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreException.class.equals(type)){
                
                           return org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.um.ws.service.UpdateRoleName.class.equals(type)){
                
                           return org.wso2.carbon.um.ws.service.UpdateRoleName.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreException.class.equals(type)){
                
                           return org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.um.ws.service.GetHybridRoles.class.equals(type)){
                
                           return org.wso2.carbon.um.ws.service.GetHybridRoles.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.um.ws.service.GetHybridRolesResponse.class.equals(type)){
                
                           return org.wso2.carbon.um.ws.service.GetHybridRolesResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreException.class.equals(type)){
                
                           return org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.um.ws.service.DeleteUserClaimValues.class.equals(type)){
                
                           return org.wso2.carbon.um.ws.service.DeleteUserClaimValues.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreException.class.equals(type)){
                
                           return org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.um.ws.service.Authenticate.class.equals(type)){
                
                           return org.wso2.carbon.um.ws.service.Authenticate.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.um.ws.service.AuthenticateResponse.class.equals(type)){
                
                           return org.wso2.carbon.um.ws.service.AuthenticateResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreException.class.equals(type)){
                
                           return org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.um.ws.service.GetUserId.class.equals(type)){
                
                           return org.wso2.carbon.um.ws.service.GetUserId.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.um.ws.service.GetUserIdResponse.class.equals(type)){
                
                           return org.wso2.carbon.um.ws.service.GetUserIdResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreException.class.equals(type)){
                
                           return org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.um.ws.service.DeleteRole.class.equals(type)){
                
                           return org.wso2.carbon.um.ws.service.DeleteRole.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreException.class.equals(type)){
                
                           return org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.um.ws.service.GetUserClaimValues.class.equals(type)){
                
                           return org.wso2.carbon.um.ws.service.GetUserClaimValues.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.um.ws.service.GetUserClaimValuesResponse.class.equals(type)){
                
                           return org.wso2.carbon.um.ws.service.GetUserClaimValuesResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreException.class.equals(type)){
                
                           return org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.um.ws.service.GetUserListOfRole.class.equals(type)){
                
                           return org.wso2.carbon.um.ws.service.GetUserListOfRole.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.um.ws.service.GetUserListOfRoleResponse.class.equals(type)){
                
                           return org.wso2.carbon.um.ws.service.GetUserListOfRoleResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreException.class.equals(type)){
                
                           return org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.um.ws.service.GetRoleListOfUser.class.equals(type)){
                
                           return org.wso2.carbon.um.ws.service.GetRoleListOfUser.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.um.ws.service.GetRoleListOfUserResponse.class.equals(type)){
                
                           return org.wso2.carbon.um.ws.service.GetRoleListOfUserResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreException.class.equals(type)){
                
                           return org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.um.ws.service.SetUserClaimValue.class.equals(type)){
                
                           return org.wso2.carbon.um.ws.service.SetUserClaimValue.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreException.class.equals(type)){
                
                           return org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.um.ws.service.UpdateCredential.class.equals(type)){
                
                           return org.wso2.carbon.um.ws.service.UpdateCredential.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreException.class.equals(type)){
                
                           return org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.um.ws.service.GetProperties.class.equals(type)){
                
                           return org.wso2.carbon.um.ws.service.GetProperties.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.um.ws.service.GetPropertiesResponse.class.equals(type)){
                
                           return org.wso2.carbon.um.ws.service.GetPropertiesResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreException.class.equals(type)){
                
                           return org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.um.ws.service.IsReadOnly.class.equals(type)){
                
                           return org.wso2.carbon.um.ws.service.IsReadOnly.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.um.ws.service.IsReadOnlyResponse.class.equals(type)){
                
                           return org.wso2.carbon.um.ws.service.IsReadOnlyResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreException.class.equals(type)){
                
                           return org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.um.ws.service.GetUserClaimValue.class.equals(type)){
                
                           return org.wso2.carbon.um.ws.service.GetUserClaimValue.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.um.ws.service.GetUserClaimValueResponse.class.equals(type)){
                
                           return org.wso2.carbon.um.ws.service.GetUserClaimValueResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreException.class.equals(type)){
                
                           return org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.um.ws.service.GetTenantIdofUser.class.equals(type)){
                
                           return org.wso2.carbon.um.ws.service.GetTenantIdofUser.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.um.ws.service.GetTenantIdofUserResponse.class.equals(type)){
                
                           return org.wso2.carbon.um.ws.service.GetTenantIdofUserResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreException.class.equals(type)){
                
                           return org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.um.ws.service.ListUsers.class.equals(type)){
                
                           return org.wso2.carbon.um.ws.service.ListUsers.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.um.ws.service.ListUsersResponse.class.equals(type)){
                
                           return org.wso2.carbon.um.ws.service.ListUsersResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreException.class.equals(type)){
                
                           return org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.um.ws.service.GetPasswordExpirationTime.class.equals(type)){
                
                           return org.wso2.carbon.um.ws.service.GetPasswordExpirationTime.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.um.ws.service.GetPasswordExpirationTimeResponse.class.equals(type)){
                
                           return org.wso2.carbon.um.ws.service.GetPasswordExpirationTimeResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreException.class.equals(type)){
                
                           return org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.um.ws.service.UpdateCredentialByAdmin.class.equals(type)){
                
                           return org.wso2.carbon.um.ws.service.UpdateCredentialByAdmin.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreException.class.equals(type)){
                
                           return org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.um.ws.service.GetTenantId.class.equals(type)){
                
                           return org.wso2.carbon.um.ws.service.GetTenantId.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.um.ws.service.GetTenantIdResponse.class.equals(type)){
                
                           return org.wso2.carbon.um.ws.service.GetTenantIdResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreException.class.equals(type)){
                
                           return org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

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
    
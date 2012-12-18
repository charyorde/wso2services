

/**
 * TaskManagementAdminServiceMessageReceiverInOnly.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */
        package org.wso2.carbon.dataservices.taskscheduler.services;

        /**
        *  TaskManagementAdminServiceMessageReceiverInOnly message receiver
        */

        public class TaskManagementAdminServiceMessageReceiverInOnly extends org.apache.axis2.receivers.AbstractInMessageReceiver{

        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext inMessage) throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(inMessage);

        TaskManagementAdminServiceSkeletonInterface skel = (TaskManagementAdminServiceSkeletonInterface)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = inMessage.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){

        
            if("editTaskDescription".equals(methodName)){
            
            org.wso2.carbon.dataservices.taskscheduler.services.EditTaskDescription wrappedParam = (org.wso2.carbon.dataservices.taskscheduler.services.EditTaskDescription)fromOM(
                                                        inMessage.getEnvelope().getBody().getFirstElement(),
                                                        org.wso2.carbon.dataservices.taskscheduler.services.EditTaskDescription.class,
                                                        getEnvelopeNamespaces(inMessage.getEnvelope()));
                                            
                                                     skel.editTaskDescription(wrappedParam);
                                                } else 
            if("addSerializedTaskDescription".equals(methodName)){
            
            org.wso2.carbon.dataservices.taskscheduler.services.AddSerializedTaskDescription wrappedParam = (org.wso2.carbon.dataservices.taskscheduler.services.AddSerializedTaskDescription)fromOM(
                                                        inMessage.getEnvelope().getBody().getFirstElement(),
                                                        org.wso2.carbon.dataservices.taskscheduler.services.AddSerializedTaskDescription.class,
                                                        getEnvelopeNamespaces(inMessage.getEnvelope()));
                                            
                                                     skel.addSerializedTaskDescription(wrappedParam);
                                                } else 
            if("deleteTaskDescription".equals(methodName)){
            
            org.wso2.carbon.dataservices.taskscheduler.services.DeleteTaskDescription wrappedParam = (org.wso2.carbon.dataservices.taskscheduler.services.DeleteTaskDescription)fromOM(
                                                        inMessage.getEnvelope().getBody().getFirstElement(),
                                                        org.wso2.carbon.dataservices.taskscheduler.services.DeleteTaskDescription.class,
                                                        getEnvelopeNamespaces(inMessage.getEnvelope()));
                                            
                                                     skel.deleteTaskDescription(wrappedParam);
                                                } else 
            if("addTaskDescription".equals(methodName)){
            
            org.wso2.carbon.dataservices.taskscheduler.services.AddTaskDescription wrappedParam = (org.wso2.carbon.dataservices.taskscheduler.services.AddTaskDescription)fromOM(
                                                        inMessage.getEnvelope().getBody().getFirstElement(),
                                                        org.wso2.carbon.dataservices.taskscheduler.services.AddTaskDescription.class,
                                                        getEnvelopeNamespaces(inMessage.getEnvelope()));
                                            
                                                     skel.addTaskDescription(wrappedParam);
                                                } else 
            if("editSerializedTaskDescription".equals(methodName)){
            
            org.wso2.carbon.dataservices.taskscheduler.services.EditSerializedTaskDescription wrappedParam = (org.wso2.carbon.dataservices.taskscheduler.services.EditSerializedTaskDescription)fromOM(
                                                        inMessage.getEnvelope().getBody().getFirstElement(),
                                                        org.wso2.carbon.dataservices.taskscheduler.services.EditSerializedTaskDescription.class,
                                                        getEnvelopeNamespaces(inMessage.getEnvelope()));
                                            
                                                     skel.editSerializedTaskDescription(wrappedParam);
                                                
                } else {
                  throw new java.lang.RuntimeException("method not found");
                }
            

        }
        } catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
        }


        
        //
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.dataservices.taskscheduler.services.IsContains param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.dataservices.taskscheduler.services.IsContains.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.dataservices.taskscheduler.services.IsContainsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.dataservices.taskscheduler.services.IsContainsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.dataservices.taskscheduler.services.EditTaskDescription param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.dataservices.taskscheduler.services.EditTaskDescription.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.dataservices.taskscheduler.services.AddSerializedTaskDescription param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.dataservices.taskscheduler.services.AddSerializedTaskDescription.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.dataservices.taskscheduler.services.GetOperations param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.dataservices.taskscheduler.services.GetOperations.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.dataservices.taskscheduler.services.GetOperationsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.dataservices.taskscheduler.services.GetOperationsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.dataservices.taskscheduler.services.GetPropertyNames param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.dataservices.taskscheduler.services.GetPropertyNames.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.dataservices.taskscheduler.services.GetPropertyNamesResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.dataservices.taskscheduler.services.GetPropertyNamesResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.dataservices.taskscheduler.services.GetAllTaskDescriptions param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.dataservices.taskscheduler.services.GetAllTaskDescriptions.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.dataservices.taskscheduler.services.GetAllTaskDescriptionsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.dataservices.taskscheduler.services.GetAllTaskDescriptionsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.dataservices.taskscheduler.services.DeleteTaskDescription param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.dataservices.taskscheduler.services.DeleteTaskDescription.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.dataservices.taskscheduler.services.GetTaskDescription param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.dataservices.taskscheduler.services.GetTaskDescription.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.dataservices.taskscheduler.services.GetTaskDescriptionResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.dataservices.taskscheduler.services.GetTaskDescriptionResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.dataservices.taskscheduler.services.GetAllJobGroups param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.dataservices.taskscheduler.services.GetAllJobGroups.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.dataservices.taskscheduler.services.GetAllJobGroupsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.dataservices.taskscheduler.services.GetAllJobGroupsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.dataservices.taskscheduler.services.GetServicesList param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.dataservices.taskscheduler.services.GetServicesList.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.dataservices.taskscheduler.services.GetServicesListResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.dataservices.taskscheduler.services.GetServicesListResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.dataservices.taskscheduler.services.AddTaskDescription param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.dataservices.taskscheduler.services.AddTaskDescription.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.dataservices.taskscheduler.services.EditSerializedTaskDescription param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.dataservices.taskscheduler.services.EditSerializedTaskDescription.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.dataservices.taskscheduler.services.GetAllSerializedTaskDescriptions param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.dataservices.taskscheduler.services.GetAllSerializedTaskDescriptions.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.dataservices.taskscheduler.services.GetAllSerializedTaskDescriptionsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.dataservices.taskscheduler.services.GetAllSerializedTaskDescriptionsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.dataservices.taskscheduler.services.GetSerializedTaskDescription param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.dataservices.taskscheduler.services.GetSerializedTaskDescription.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.dataservices.taskscheduler.services.GetSerializedTaskDescriptionResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.dataservices.taskscheduler.services.GetSerializedTaskDescriptionResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.dataservices.taskscheduler.services.IsContainsResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.dataservices.taskscheduler.services.IsContainsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.dataservices.taskscheduler.services.IsContainsResponse wrapisContains(){
                                org.wso2.carbon.dataservices.taskscheduler.services.IsContainsResponse wrappedElement = new org.wso2.carbon.dataservices.taskscheduler.services.IsContainsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.dataservices.taskscheduler.services.GetOperationsResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.dataservices.taskscheduler.services.GetOperationsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.dataservices.taskscheduler.services.GetOperationsResponse wrapgetOperations(){
                                org.wso2.carbon.dataservices.taskscheduler.services.GetOperationsResponse wrappedElement = new org.wso2.carbon.dataservices.taskscheduler.services.GetOperationsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.dataservices.taskscheduler.services.GetPropertyNamesResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.dataservices.taskscheduler.services.GetPropertyNamesResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.dataservices.taskscheduler.services.GetPropertyNamesResponse wrapgetPropertyNames(){
                                org.wso2.carbon.dataservices.taskscheduler.services.GetPropertyNamesResponse wrappedElement = new org.wso2.carbon.dataservices.taskscheduler.services.GetPropertyNamesResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.dataservices.taskscheduler.services.GetAllTaskDescriptionsResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.dataservices.taskscheduler.services.GetAllTaskDescriptionsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.dataservices.taskscheduler.services.GetAllTaskDescriptionsResponse wrapgetAllTaskDescriptions(){
                                org.wso2.carbon.dataservices.taskscheduler.services.GetAllTaskDescriptionsResponse wrappedElement = new org.wso2.carbon.dataservices.taskscheduler.services.GetAllTaskDescriptionsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.dataservices.taskscheduler.services.GetTaskDescriptionResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.dataservices.taskscheduler.services.GetTaskDescriptionResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.dataservices.taskscheduler.services.GetTaskDescriptionResponse wrapgetTaskDescription(){
                                org.wso2.carbon.dataservices.taskscheduler.services.GetTaskDescriptionResponse wrappedElement = new org.wso2.carbon.dataservices.taskscheduler.services.GetTaskDescriptionResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.dataservices.taskscheduler.services.GetAllJobGroupsResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.dataservices.taskscheduler.services.GetAllJobGroupsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.dataservices.taskscheduler.services.GetAllJobGroupsResponse wrapgetAllJobGroups(){
                                org.wso2.carbon.dataservices.taskscheduler.services.GetAllJobGroupsResponse wrappedElement = new org.wso2.carbon.dataservices.taskscheduler.services.GetAllJobGroupsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.dataservices.taskscheduler.services.GetServicesListResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.dataservices.taskscheduler.services.GetServicesListResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.dataservices.taskscheduler.services.GetServicesListResponse wrapgetServicesList(){
                                org.wso2.carbon.dataservices.taskscheduler.services.GetServicesListResponse wrappedElement = new org.wso2.carbon.dataservices.taskscheduler.services.GetServicesListResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.dataservices.taskscheduler.services.GetAllSerializedTaskDescriptionsResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.dataservices.taskscheduler.services.GetAllSerializedTaskDescriptionsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.dataservices.taskscheduler.services.GetAllSerializedTaskDescriptionsResponse wrapgetAllSerializedTaskDescriptions(){
                                org.wso2.carbon.dataservices.taskscheduler.services.GetAllSerializedTaskDescriptionsResponse wrappedElement = new org.wso2.carbon.dataservices.taskscheduler.services.GetAllSerializedTaskDescriptionsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.wso2.carbon.dataservices.taskscheduler.services.GetSerializedTaskDescriptionResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.wso2.carbon.dataservices.taskscheduler.services.GetSerializedTaskDescriptionResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.wso2.carbon.dataservices.taskscheduler.services.GetSerializedTaskDescriptionResponse wrapgetSerializedTaskDescription(){
                                org.wso2.carbon.dataservices.taskscheduler.services.GetSerializedTaskDescriptionResponse wrappedElement = new org.wso2.carbon.dataservices.taskscheduler.services.GetSerializedTaskDescriptionResponse();
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
        
                if (org.wso2.carbon.dataservices.taskscheduler.services.IsContains.class.equals(type)){
                
                           return org.wso2.carbon.dataservices.taskscheduler.services.IsContains.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.dataservices.taskscheduler.services.IsContainsResponse.class.equals(type)){
                
                           return org.wso2.carbon.dataservices.taskscheduler.services.IsContainsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.dataservices.taskscheduler.services.EditTaskDescription.class.equals(type)){
                
                           return org.wso2.carbon.dataservices.taskscheduler.services.EditTaskDescription.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.dataservices.taskscheduler.services.AddSerializedTaskDescription.class.equals(type)){
                
                           return org.wso2.carbon.dataservices.taskscheduler.services.AddSerializedTaskDescription.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.dataservices.taskscheduler.services.GetOperations.class.equals(type)){
                
                           return org.wso2.carbon.dataservices.taskscheduler.services.GetOperations.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.dataservices.taskscheduler.services.GetOperationsResponse.class.equals(type)){
                
                           return org.wso2.carbon.dataservices.taskscheduler.services.GetOperationsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.dataservices.taskscheduler.services.GetPropertyNames.class.equals(type)){
                
                           return org.wso2.carbon.dataservices.taskscheduler.services.GetPropertyNames.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.dataservices.taskscheduler.services.GetPropertyNamesResponse.class.equals(type)){
                
                           return org.wso2.carbon.dataservices.taskscheduler.services.GetPropertyNamesResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.dataservices.taskscheduler.services.GetAllTaskDescriptions.class.equals(type)){
                
                           return org.wso2.carbon.dataservices.taskscheduler.services.GetAllTaskDescriptions.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.dataservices.taskscheduler.services.GetAllTaskDescriptionsResponse.class.equals(type)){
                
                           return org.wso2.carbon.dataservices.taskscheduler.services.GetAllTaskDescriptionsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.dataservices.taskscheduler.services.DeleteTaskDescription.class.equals(type)){
                
                           return org.wso2.carbon.dataservices.taskscheduler.services.DeleteTaskDescription.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.dataservices.taskscheduler.services.GetTaskDescription.class.equals(type)){
                
                           return org.wso2.carbon.dataservices.taskscheduler.services.GetTaskDescription.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.dataservices.taskscheduler.services.GetTaskDescriptionResponse.class.equals(type)){
                
                           return org.wso2.carbon.dataservices.taskscheduler.services.GetTaskDescriptionResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.dataservices.taskscheduler.services.GetAllJobGroups.class.equals(type)){
                
                           return org.wso2.carbon.dataservices.taskscheduler.services.GetAllJobGroups.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.dataservices.taskscheduler.services.GetAllJobGroupsResponse.class.equals(type)){
                
                           return org.wso2.carbon.dataservices.taskscheduler.services.GetAllJobGroupsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.dataservices.taskscheduler.services.GetServicesList.class.equals(type)){
                
                           return org.wso2.carbon.dataservices.taskscheduler.services.GetServicesList.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.dataservices.taskscheduler.services.GetServicesListResponse.class.equals(type)){
                
                           return org.wso2.carbon.dataservices.taskscheduler.services.GetServicesListResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.dataservices.taskscheduler.services.AddTaskDescription.class.equals(type)){
                
                           return org.wso2.carbon.dataservices.taskscheduler.services.AddTaskDescription.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.dataservices.taskscheduler.services.EditSerializedTaskDescription.class.equals(type)){
                
                           return org.wso2.carbon.dataservices.taskscheduler.services.EditSerializedTaskDescription.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.dataservices.taskscheduler.services.GetAllSerializedTaskDescriptions.class.equals(type)){
                
                           return org.wso2.carbon.dataservices.taskscheduler.services.GetAllSerializedTaskDescriptions.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.dataservices.taskscheduler.services.GetAllSerializedTaskDescriptionsResponse.class.equals(type)){
                
                           return org.wso2.carbon.dataservices.taskscheduler.services.GetAllSerializedTaskDescriptionsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.dataservices.taskscheduler.services.GetSerializedTaskDescription.class.equals(type)){
                
                           return org.wso2.carbon.dataservices.taskscheduler.services.GetSerializedTaskDescription.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.dataservices.taskscheduler.services.GetSerializedTaskDescriptionResponse.class.equals(type)){
                
                           return org.wso2.carbon.dataservices.taskscheduler.services.GetSerializedTaskDescriptionResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

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



        }//end of class

    
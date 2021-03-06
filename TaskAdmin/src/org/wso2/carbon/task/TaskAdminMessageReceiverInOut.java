
/**
 * TaskAdminMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */
        package org.wso2.carbon.task;

        /**
        *  TaskAdminMessageReceiverInOut message receiver
        */

        public class TaskAdminMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        TaskAdminSkeletonInterface skel = (TaskAdminSkeletonInterface)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){


        

            if("getTaskDescription".equals(methodName)){
                
                axis2.apache.org.xsd.GetTaskDescriptionResponse getTaskDescriptionResponse14 = null;
	                        axis2.apache.org.xsd.GetTaskDescription wrappedParam =
                                                             (axis2.apache.org.xsd.GetTaskDescription)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    axis2.apache.org.xsd.GetTaskDescription.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getTaskDescriptionResponse14 =
                                                   
                                                   
                                                         skel.getTaskDescription(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getTaskDescriptionResponse14, false, new javax.xml.namespace.QName("http://task.carbon.wso2.org",
                                                    "getTaskDescription"));
                                    } else 

            if("getAllTaskDescriptions".equals(methodName)){
                
                axis2.apache.org.xsd.GetAllTaskDescriptionsResponse getAllTaskDescriptionsResponse16 = null;
	                        axis2.apache.org.xsd.GetAllTaskDescriptions wrappedParam =
                                                             (axis2.apache.org.xsd.GetAllTaskDescriptions)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    axis2.apache.org.xsd.GetAllTaskDescriptions.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getAllTaskDescriptionsResponse16 =
                                                   
                                                   
                                                         skel.getAllTaskDescriptions(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getAllTaskDescriptionsResponse16, false, new javax.xml.namespace.QName("http://task.carbon.wso2.org",
                                                    "getAllTaskDescriptions"));
                                    } else 

            if("isContains".equals(methodName)){
                
                axis2.apache.org.xsd.IsContainsResponse isContainsResponse18 = null;
	                        axis2.apache.org.xsd.IsContains wrappedParam =
                                                             (axis2.apache.org.xsd.IsContains)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    axis2.apache.org.xsd.IsContains.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               isContainsResponse18 =
                                                   
                                                   
                                                         skel.isContains(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), isContainsResponse18, false, new javax.xml.namespace.QName("http://task.carbon.wso2.org",
                                                    "isContains"));
                                    } else 

            if("getAllJobGroups".equals(methodName)){
                
                axis2.apache.org.xsd.GetAllJobGroupsResponse getAllJobGroupsResponse20 = null;
	                        axis2.apache.org.xsd.GetAllJobGroups wrappedParam =
                                                             (axis2.apache.org.xsd.GetAllJobGroups)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    axis2.apache.org.xsd.GetAllJobGroups.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getAllJobGroupsResponse20 =
                                                   
                                                   
                                                         skel.getAllJobGroups(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getAllJobGroupsResponse20, false, new javax.xml.namespace.QName("http://task.carbon.wso2.org",
                                                    "getAllJobGroups"));
                                    } else 

            if("loadTaskClassProperties".equals(methodName)){
                
                axis2.apache.org.xsd.LoadTaskClassPropertiesResponse loadTaskClassPropertiesResponse22 = null;
	                        axis2.apache.org.xsd.LoadTaskClassProperties wrappedParam =
                                                             (axis2.apache.org.xsd.LoadTaskClassProperties)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    axis2.apache.org.xsd.LoadTaskClassProperties.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               loadTaskClassPropertiesResponse22 =
                                                   
                                                   
                                                         skel.loadTaskClassProperties(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), loadTaskClassPropertiesResponse22, false, new javax.xml.namespace.QName("http://task.carbon.wso2.org",
                                                    "loadTaskClassProperties"));
                                    
            } else {
              throw new java.lang.RuntimeException("method not found");
            }
        

        newMsgContext.setEnvelope(envelope);
        }
        } catch (TaskAdminTaskManagementException e) {

            msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME,"TaskAdminTaskManagementException");
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
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.GetTaskDescription param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.GetTaskDescription.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.GetTaskDescriptionResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.GetTaskDescriptionResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.TaskAdminTaskManagementException param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.TaskAdminTaskManagementException.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.GetAllTaskDescriptions param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.GetAllTaskDescriptions.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.GetAllTaskDescriptionsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.GetAllTaskDescriptionsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.IsContains param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.IsContains.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.IsContainsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.IsContainsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.GetAllJobGroups param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.GetAllJobGroups.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.GetAllJobGroupsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.GetAllJobGroupsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.EditTaskDescription param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.EditTaskDescription.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.DeleteTaskDescription param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.DeleteTaskDescription.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.LoadTaskClassProperties param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.LoadTaskClassProperties.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.LoadTaskClassPropertiesResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.LoadTaskClassPropertiesResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(axis2.apache.org.xsd.AddTaskDescription param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(axis2.apache.org.xsd.AddTaskDescription.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, axis2.apache.org.xsd.GetTaskDescriptionResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(axis2.apache.org.xsd.GetTaskDescriptionResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private axis2.apache.org.xsd.GetTaskDescriptionResponse wrapgetTaskDescription(){
                                axis2.apache.org.xsd.GetTaskDescriptionResponse wrappedElement = new axis2.apache.org.xsd.GetTaskDescriptionResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, axis2.apache.org.xsd.GetAllTaskDescriptionsResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(axis2.apache.org.xsd.GetAllTaskDescriptionsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private axis2.apache.org.xsd.GetAllTaskDescriptionsResponse wrapgetAllTaskDescriptions(){
                                axis2.apache.org.xsd.GetAllTaskDescriptionsResponse wrappedElement = new axis2.apache.org.xsd.GetAllTaskDescriptionsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, axis2.apache.org.xsd.IsContainsResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(axis2.apache.org.xsd.IsContainsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private axis2.apache.org.xsd.IsContainsResponse wrapisContains(){
                                axis2.apache.org.xsd.IsContainsResponse wrappedElement = new axis2.apache.org.xsd.IsContainsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, axis2.apache.org.xsd.GetAllJobGroupsResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(axis2.apache.org.xsd.GetAllJobGroupsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private axis2.apache.org.xsd.GetAllJobGroupsResponse wrapgetAllJobGroups(){
                                axis2.apache.org.xsd.GetAllJobGroupsResponse wrappedElement = new axis2.apache.org.xsd.GetAllJobGroupsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, axis2.apache.org.xsd.LoadTaskClassPropertiesResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(axis2.apache.org.xsd.LoadTaskClassPropertiesResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private axis2.apache.org.xsd.LoadTaskClassPropertiesResponse wraploadTaskClassProperties(){
                                axis2.apache.org.xsd.LoadTaskClassPropertiesResponse wrappedElement = new axis2.apache.org.xsd.LoadTaskClassPropertiesResponse();
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
        
                if (axis2.apache.org.xsd.GetTaskDescription.class.equals(type)){
                
                           return axis2.apache.org.xsd.GetTaskDescription.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.GetTaskDescriptionResponse.class.equals(type)){
                
                           return axis2.apache.org.xsd.GetTaskDescriptionResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.TaskAdminTaskManagementException.class.equals(type)){
                
                           return axis2.apache.org.xsd.TaskAdminTaskManagementException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.GetAllTaskDescriptions.class.equals(type)){
                
                           return axis2.apache.org.xsd.GetAllTaskDescriptions.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.GetAllTaskDescriptionsResponse.class.equals(type)){
                
                           return axis2.apache.org.xsd.GetAllTaskDescriptionsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.TaskAdminTaskManagementException.class.equals(type)){
                
                           return axis2.apache.org.xsd.TaskAdminTaskManagementException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.IsContains.class.equals(type)){
                
                           return axis2.apache.org.xsd.IsContains.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.IsContainsResponse.class.equals(type)){
                
                           return axis2.apache.org.xsd.IsContainsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.TaskAdminTaskManagementException.class.equals(type)){
                
                           return axis2.apache.org.xsd.TaskAdminTaskManagementException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.GetAllJobGroups.class.equals(type)){
                
                           return axis2.apache.org.xsd.GetAllJobGroups.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.GetAllJobGroupsResponse.class.equals(type)){
                
                           return axis2.apache.org.xsd.GetAllJobGroupsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.EditTaskDescription.class.equals(type)){
                
                           return axis2.apache.org.xsd.EditTaskDescription.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.TaskAdminTaskManagementException.class.equals(type)){
                
                           return axis2.apache.org.xsd.TaskAdminTaskManagementException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.DeleteTaskDescription.class.equals(type)){
                
                           return axis2.apache.org.xsd.DeleteTaskDescription.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.TaskAdminTaskManagementException.class.equals(type)){
                
                           return axis2.apache.org.xsd.TaskAdminTaskManagementException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.LoadTaskClassProperties.class.equals(type)){
                
                           return axis2.apache.org.xsd.LoadTaskClassProperties.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.LoadTaskClassPropertiesResponse.class.equals(type)){
                
                           return axis2.apache.org.xsd.LoadTaskClassPropertiesResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.TaskAdminTaskManagementException.class.equals(type)){
                
                           return axis2.apache.org.xsd.TaskAdminTaskManagementException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.AddTaskDescription.class.equals(type)){
                
                           return axis2.apache.org.xsd.AddTaskDescription.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (axis2.apache.org.xsd.TaskAdminTaskManagementException.class.equals(type)){
                
                           return axis2.apache.org.xsd.TaskAdminTaskManagementException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

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
    
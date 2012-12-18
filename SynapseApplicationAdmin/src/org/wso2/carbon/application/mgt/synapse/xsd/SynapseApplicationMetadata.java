
/**
 * SynapseApplicationMetadata.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v3  Built on : Oct 26, 2011 (07:42:27 PDT)
 */

            
                package org.wso2.carbon.application.mgt.synapse.xsd;
            

            /**
            *  SynapseApplicationMetadata bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class SynapseApplicationMetadata
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = SynapseApplicationMetadata
                Namespace URI = http://synapse.mgt.application.carbon.wso2.org/xsd
                Namespace Prefix = ns40
                */
            

                        /**
                        * field for AppName
                        */

                        
                                    protected java.lang.String localAppName ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAppNameTracker = false ;

                           public boolean isAppNameSpecified(){
                               return localAppNameTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getAppName(){
                               return localAppName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AppName
                               */
                               public void setAppName(java.lang.String param){
                            localAppNameTracker = true;
                                   
                                            this.localAppName=param;
                                    

                               }
                            

                        /**
                        * field for Endpoints
                        * This was an Array!
                        */

                        
                                    protected org.wso2.carbon.application.mgt.synapse.xsd.EndpointMetadata[] localEndpoints ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localEndpointsTracker = false ;

                           public boolean isEndpointsSpecified(){
                               return localEndpointsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return org.wso2.carbon.application.mgt.synapse.xsd.EndpointMetadata[]
                           */
                           public  org.wso2.carbon.application.mgt.synapse.xsd.EndpointMetadata[] getEndpoints(){
                               return localEndpoints;
                           }

                           
                        


                               
                              /**
                               * validate the array for Endpoints
                               */
                              protected void validateEndpoints(org.wso2.carbon.application.mgt.synapse.xsd.EndpointMetadata[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param Endpoints
                              */
                              public void setEndpoints(org.wso2.carbon.application.mgt.synapse.xsd.EndpointMetadata[] param){
                              
                                   validateEndpoints(param);

                               localEndpointsTracker = true;
                                      
                                      this.localEndpoints=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param org.wso2.carbon.application.mgt.synapse.xsd.EndpointMetadata
                             */
                             public void addEndpoints(org.wso2.carbon.application.mgt.synapse.xsd.EndpointMetadata param){
                                   if (localEndpoints == null){
                                   localEndpoints = new org.wso2.carbon.application.mgt.synapse.xsd.EndpointMetadata[]{};
                                   }

                            
                                 //update the setting tracker
                                localEndpointsTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localEndpoints);
                               list.add(param);
                               this.localEndpoints =
                             (org.wso2.carbon.application.mgt.synapse.xsd.EndpointMetadata[])list.toArray(
                            new org.wso2.carbon.application.mgt.synapse.xsd.EndpointMetadata[list.size()]);

                             }
                             

                        /**
                        * field for Events
                        * This was an Array!
                        */

                        
                                    protected java.lang.String[] localEvents ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localEventsTracker = false ;

                           public boolean isEventsSpecified(){
                               return localEventsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String[]
                           */
                           public  java.lang.String[] getEvents(){
                               return localEvents;
                           }

                           
                        


                               
                              /**
                               * validate the array for Events
                               */
                              protected void validateEvents(java.lang.String[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param Events
                              */
                              public void setEvents(java.lang.String[] param){
                              
                                   validateEvents(param);

                               localEventsTracker = true;
                                      
                                      this.localEvents=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param java.lang.String
                             */
                             public void addEvents(java.lang.String param){
                                   if (localEvents == null){
                                   localEvents = new java.lang.String[]{};
                                   }

                            
                                 //update the setting tracker
                                localEventsTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localEvents);
                               list.add(param);
                               this.localEvents =
                             (java.lang.String[])list.toArray(
                            new java.lang.String[list.size()]);

                             }
                             

                        /**
                        * field for LocalEntries
                        * This was an Array!
                        */

                        
                                    protected java.lang.String[] localLocalEntries ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localLocalEntriesTracker = false ;

                           public boolean isLocalEntriesSpecified(){
                               return localLocalEntriesTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String[]
                           */
                           public  java.lang.String[] getLocalEntries(){
                               return localLocalEntries;
                           }

                           
                        


                               
                              /**
                               * validate the array for LocalEntries
                               */
                              protected void validateLocalEntries(java.lang.String[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param LocalEntries
                              */
                              public void setLocalEntries(java.lang.String[] param){
                              
                                   validateLocalEntries(param);

                               localLocalEntriesTracker = true;
                                      
                                      this.localLocalEntries=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param java.lang.String
                             */
                             public void addLocalEntries(java.lang.String param){
                                   if (localLocalEntries == null){
                                   localLocalEntries = new java.lang.String[]{};
                                   }

                            
                                 //update the setting tracker
                                localLocalEntriesTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localLocalEntries);
                               list.add(param);
                               this.localLocalEntries =
                             (java.lang.String[])list.toArray(
                            new java.lang.String[list.size()]);

                             }
                             

                        /**
                        * field for Mediators
                        * This was an Array!
                        */

                        
                                    protected java.lang.String[] localMediators ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localMediatorsTracker = false ;

                           public boolean isMediatorsSpecified(){
                               return localMediatorsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String[]
                           */
                           public  java.lang.String[] getMediators(){
                               return localMediators;
                           }

                           
                        


                               
                              /**
                               * validate the array for Mediators
                               */
                              protected void validateMediators(java.lang.String[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param Mediators
                              */
                              public void setMediators(java.lang.String[] param){
                              
                                   validateMediators(param);

                               localMediatorsTracker = true;
                                      
                                      this.localMediators=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param java.lang.String
                             */
                             public void addMediators(java.lang.String param){
                                   if (localMediators == null){
                                   localMediators = new java.lang.String[]{};
                                   }

                            
                                 //update the setting tracker
                                localMediatorsTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localMediators);
                               list.add(param);
                               this.localMediators =
                             (java.lang.String[])list.toArray(
                            new java.lang.String[list.size()]);

                             }
                             

                        /**
                        * field for ProxyServices
                        * This was an Array!
                        */

                        
                                    protected java.lang.String[] localProxyServices ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localProxyServicesTracker = false ;

                           public boolean isProxyServicesSpecified(){
                               return localProxyServicesTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String[]
                           */
                           public  java.lang.String[] getProxyServices(){
                               return localProxyServices;
                           }

                           
                        


                               
                              /**
                               * validate the array for ProxyServices
                               */
                              protected void validateProxyServices(java.lang.String[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param ProxyServices
                              */
                              public void setProxyServices(java.lang.String[] param){
                              
                                   validateProxyServices(param);

                               localProxyServicesTracker = true;
                                      
                                      this.localProxyServices=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param java.lang.String
                             */
                             public void addProxyServices(java.lang.String param){
                                   if (localProxyServices == null){
                                   localProxyServices = new java.lang.String[]{};
                                   }

                            
                                 //update the setting tracker
                                localProxyServicesTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localProxyServices);
                               list.add(param);
                               this.localProxyServices =
                             (java.lang.String[])list.toArray(
                            new java.lang.String[list.size()]);

                             }
                             

                        /**
                        * field for Sequences
                        * This was an Array!
                        */

                        
                                    protected java.lang.String[] localSequences ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSequencesTracker = false ;

                           public boolean isSequencesSpecified(){
                               return localSequencesTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String[]
                           */
                           public  java.lang.String[] getSequences(){
                               return localSequences;
                           }

                           
                        


                               
                              /**
                               * validate the array for Sequences
                               */
                              protected void validateSequences(java.lang.String[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param Sequences
                              */
                              public void setSequences(java.lang.String[] param){
                              
                                   validateSequences(param);

                               localSequencesTracker = true;
                                      
                                      this.localSequences=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param java.lang.String
                             */
                             public void addSequences(java.lang.String param){
                                   if (localSequences == null){
                                   localSequences = new java.lang.String[]{};
                                   }

                            
                                 //update the setting tracker
                                localSequencesTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localSequences);
                               list.add(param);
                               this.localSequences =
                             (java.lang.String[])list.toArray(
                            new java.lang.String[list.size()]);

                             }
                             

                        /**
                        * field for Tasks
                        * This was an Array!
                        */

                        
                                    protected org.wso2.carbon.application.mgt.synapse.xsd.TaskMetadata[] localTasks ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTasksTracker = false ;

                           public boolean isTasksSpecified(){
                               return localTasksTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return org.wso2.carbon.application.mgt.synapse.xsd.TaskMetadata[]
                           */
                           public  org.wso2.carbon.application.mgt.synapse.xsd.TaskMetadata[] getTasks(){
                               return localTasks;
                           }

                           
                        


                               
                              /**
                               * validate the array for Tasks
                               */
                              protected void validateTasks(org.wso2.carbon.application.mgt.synapse.xsd.TaskMetadata[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param Tasks
                              */
                              public void setTasks(org.wso2.carbon.application.mgt.synapse.xsd.TaskMetadata[] param){
                              
                                   validateTasks(param);

                               localTasksTracker = true;
                                      
                                      this.localTasks=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param org.wso2.carbon.application.mgt.synapse.xsd.TaskMetadata
                             */
                             public void addTasks(org.wso2.carbon.application.mgt.synapse.xsd.TaskMetadata param){
                                   if (localTasks == null){
                                   localTasks = new org.wso2.carbon.application.mgt.synapse.xsd.TaskMetadata[]{};
                                   }

                            
                                 //update the setting tracker
                                localTasksTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localTasks);
                               list.add(param);
                               this.localTasks =
                             (org.wso2.carbon.application.mgt.synapse.xsd.TaskMetadata[])list.toArray(
                            new org.wso2.carbon.application.mgt.synapse.xsd.TaskMetadata[list.size()]);

                             }
                             

     
     
        /**
        *
        * @param parentQName
        * @param factory
        * @return org.apache.axiom.om.OMElement
        */
       public org.apache.axiom.om.OMElement getOMElement (
               final javax.xml.namespace.QName parentQName,
               final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{


        
               org.apache.axiom.om.OMDataSource dataSource =
                       new org.apache.axis2.databinding.ADBDataSource(this,parentQName);
               return factory.createOMElement(dataSource,parentQName);
            
        }

         public void serialize(final javax.xml.namespace.QName parentQName,
                                       javax.xml.stream.XMLStreamWriter xmlWriter)
                                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
                           serialize(parentQName,xmlWriter,false);
         }

         public void serialize(final javax.xml.namespace.QName parentQName,
                               javax.xml.stream.XMLStreamWriter xmlWriter,
                               boolean serializeType)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
            
                


                java.lang.String prefix = null;
                java.lang.String namespace = null;
                

                    prefix = parentQName.getPrefix();
                    namespace = parentQName.getNamespaceURI();
                    writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);
                
                  if (serializeType){
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://synapse.mgt.application.carbon.wso2.org/xsd");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":SynapseApplicationMetadata",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "SynapseApplicationMetadata",
                           xmlWriter);
                   }

               
                   }
                if (localAppNameTracker){
                                    namespace = "http://synapse.mgt.application.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "appName", xmlWriter);
                             

                                          if (localAppName==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localAppName);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localEndpointsTracker){
                                       if (localEndpoints!=null){
                                            for (int i = 0;i < localEndpoints.length;i++){
                                                if (localEndpoints[i] != null){
                                                 localEndpoints[i].serialize(new javax.xml.namespace.QName("http://synapse.mgt.application.carbon.wso2.org/xsd","endpoints"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                            writeStartElement(null, "http://synapse.mgt.application.carbon.wso2.org/xsd", "endpoints", xmlWriter);

                                                           // write the nil attribute
                                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                           xmlWriter.writeEndElement();
                                                    
                                                }

                                            }
                                     } else {
                                        
                                                writeStartElement(null, "http://synapse.mgt.application.carbon.wso2.org/xsd", "endpoints", xmlWriter);

                                               // write the nil attribute
                                               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                               xmlWriter.writeEndElement();
                                        
                                    }
                                 } if (localEventsTracker){
                             if (localEvents!=null) {
                                   namespace = "http://synapse.mgt.application.carbon.wso2.org/xsd";
                                   for (int i = 0;i < localEvents.length;i++){
                                        
                                            if (localEvents[i] != null){
                                        
                                                writeStartElement(null, namespace, "events", xmlWriter);

                                            
                                                        xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEvents[i]));
                                                    
                                                xmlWriter.writeEndElement();
                                              
                                                } else {
                                                   
                                                           // write null attribute
                                                            namespace = "http://synapse.mgt.application.carbon.wso2.org/xsd";
                                                            writeStartElement(null, namespace, "events", xmlWriter);
                                                            writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                            xmlWriter.writeEndElement();
                                                       
                                                }

                                   }
                             } else {
                                 
                                         // write the null attribute
                                        // write null attribute
                                           writeStartElement(null, "http://synapse.mgt.application.carbon.wso2.org/xsd", "events", xmlWriter);

                                           // write the nil attribute
                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                           xmlWriter.writeEndElement();
                                    
                             }

                        } if (localLocalEntriesTracker){
                             if (localLocalEntries!=null) {
                                   namespace = "http://synapse.mgt.application.carbon.wso2.org/xsd";
                                   for (int i = 0;i < localLocalEntries.length;i++){
                                        
                                            if (localLocalEntries[i] != null){
                                        
                                                writeStartElement(null, namespace, "localEntries", xmlWriter);

                                            
                                                        xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLocalEntries[i]));
                                                    
                                                xmlWriter.writeEndElement();
                                              
                                                } else {
                                                   
                                                           // write null attribute
                                                            namespace = "http://synapse.mgt.application.carbon.wso2.org/xsd";
                                                            writeStartElement(null, namespace, "localEntries", xmlWriter);
                                                            writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                            xmlWriter.writeEndElement();
                                                       
                                                }

                                   }
                             } else {
                                 
                                         // write the null attribute
                                        // write null attribute
                                           writeStartElement(null, "http://synapse.mgt.application.carbon.wso2.org/xsd", "localEntries", xmlWriter);

                                           // write the nil attribute
                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                           xmlWriter.writeEndElement();
                                    
                             }

                        } if (localMediatorsTracker){
                             if (localMediators!=null) {
                                   namespace = "http://synapse.mgt.application.carbon.wso2.org/xsd";
                                   for (int i = 0;i < localMediators.length;i++){
                                        
                                            if (localMediators[i] != null){
                                        
                                                writeStartElement(null, namespace, "mediators", xmlWriter);

                                            
                                                        xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMediators[i]));
                                                    
                                                xmlWriter.writeEndElement();
                                              
                                                } else {
                                                   
                                                           // write null attribute
                                                            namespace = "http://synapse.mgt.application.carbon.wso2.org/xsd";
                                                            writeStartElement(null, namespace, "mediators", xmlWriter);
                                                            writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                            xmlWriter.writeEndElement();
                                                       
                                                }

                                   }
                             } else {
                                 
                                         // write the null attribute
                                        // write null attribute
                                           writeStartElement(null, "http://synapse.mgt.application.carbon.wso2.org/xsd", "mediators", xmlWriter);

                                           // write the nil attribute
                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                           xmlWriter.writeEndElement();
                                    
                             }

                        } if (localProxyServicesTracker){
                             if (localProxyServices!=null) {
                                   namespace = "http://synapse.mgt.application.carbon.wso2.org/xsd";
                                   for (int i = 0;i < localProxyServices.length;i++){
                                        
                                            if (localProxyServices[i] != null){
                                        
                                                writeStartElement(null, namespace, "proxyServices", xmlWriter);

                                            
                                                        xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localProxyServices[i]));
                                                    
                                                xmlWriter.writeEndElement();
                                              
                                                } else {
                                                   
                                                           // write null attribute
                                                            namespace = "http://synapse.mgt.application.carbon.wso2.org/xsd";
                                                            writeStartElement(null, namespace, "proxyServices", xmlWriter);
                                                            writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                            xmlWriter.writeEndElement();
                                                       
                                                }

                                   }
                             } else {
                                 
                                         // write the null attribute
                                        // write null attribute
                                           writeStartElement(null, "http://synapse.mgt.application.carbon.wso2.org/xsd", "proxyServices", xmlWriter);

                                           // write the nil attribute
                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                           xmlWriter.writeEndElement();
                                    
                             }

                        } if (localSequencesTracker){
                             if (localSequences!=null) {
                                   namespace = "http://synapse.mgt.application.carbon.wso2.org/xsd";
                                   for (int i = 0;i < localSequences.length;i++){
                                        
                                            if (localSequences[i] != null){
                                        
                                                writeStartElement(null, namespace, "sequences", xmlWriter);

                                            
                                                        xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSequences[i]));
                                                    
                                                xmlWriter.writeEndElement();
                                              
                                                } else {
                                                   
                                                           // write null attribute
                                                            namespace = "http://synapse.mgt.application.carbon.wso2.org/xsd";
                                                            writeStartElement(null, namespace, "sequences", xmlWriter);
                                                            writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                            xmlWriter.writeEndElement();
                                                       
                                                }

                                   }
                             } else {
                                 
                                         // write the null attribute
                                        // write null attribute
                                           writeStartElement(null, "http://synapse.mgt.application.carbon.wso2.org/xsd", "sequences", xmlWriter);

                                           // write the nil attribute
                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                           xmlWriter.writeEndElement();
                                    
                             }

                        } if (localTasksTracker){
                                       if (localTasks!=null){
                                            for (int i = 0;i < localTasks.length;i++){
                                                if (localTasks[i] != null){
                                                 localTasks[i].serialize(new javax.xml.namespace.QName("http://synapse.mgt.application.carbon.wso2.org/xsd","tasks"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                            writeStartElement(null, "http://synapse.mgt.application.carbon.wso2.org/xsd", "tasks", xmlWriter);

                                                           // write the nil attribute
                                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                           xmlWriter.writeEndElement();
                                                    
                                                }

                                            }
                                     } else {
                                        
                                                writeStartElement(null, "http://synapse.mgt.application.carbon.wso2.org/xsd", "tasks", xmlWriter);

                                               // write the nil attribute
                                               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                               xmlWriter.writeEndElement();
                                        
                                    }
                                 }
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://synapse.mgt.application.carbon.wso2.org/xsd")){
                return "ns40";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }
        
        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                                    java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace,attName,attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                                    java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName,attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace,attName,attValue);
            }
        }


           /**
             * Util method to write an attribute without the ns prefix
             */
            private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                             javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

                java.lang.String attributeNamespace = qname.getNamespaceURI();
                java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
                if (attributePrefix == null) {
                    attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
                }
                java.lang.String attributeValue;
                if (attributePrefix.trim().length() > 0) {
                    attributeValue = attributePrefix + ":" + qname.getLocalPart();
                } else {
                    attributeValue = qname.getLocalPart();
                }

                if (namespace.equals("")) {
                    xmlWriter.writeAttribute(attName, attributeValue);
                } else {
                    registerPrefix(xmlWriter, namespace);
                    xmlWriter.writeAttribute(namespace, attName, attributeValue);
                }
            }
        /**
         *  method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }

                if (prefix.trim().length() > 0){
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix,namespaceURI);
                        }

                        if (prefix.trim().length() > 0){
                            stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                while (xmlWriter.getNamespaceContext().getNamespaceURI(prefix) != null) {
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }


  
        /**
        * databinding method to get an XML representation of this object
        *
        */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                    throws org.apache.axis2.databinding.ADBException{


        
                 java.util.ArrayList elementList = new java.util.ArrayList();
                 java.util.ArrayList attribList = new java.util.ArrayList();

                 if (localAppNameTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://synapse.mgt.application.carbon.wso2.org/xsd",
                                                                      "appName"));
                                 
                                         elementList.add(localAppName==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAppName));
                                    } if (localEndpointsTracker){
                             if (localEndpoints!=null) {
                                 for (int i = 0;i < localEndpoints.length;i++){

                                    if (localEndpoints[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://synapse.mgt.application.carbon.wso2.org/xsd",
                                                                          "endpoints"));
                                         elementList.add(localEndpoints[i]);
                                    } else {
                                        
                                                elementList.add(new javax.xml.namespace.QName("http://synapse.mgt.application.carbon.wso2.org/xsd",
                                                                          "endpoints"));
                                                elementList.add(null);
                                            
                                    }

                                 }
                             } else {
                                 
                                        elementList.add(new javax.xml.namespace.QName("http://synapse.mgt.application.carbon.wso2.org/xsd",
                                                                          "endpoints"));
                                        elementList.add(localEndpoints);
                                    
                             }

                        } if (localEventsTracker){
                            if (localEvents!=null){
                                  for (int i = 0;i < localEvents.length;i++){
                                      
                                         if (localEvents[i] != null){
                                          elementList.add(new javax.xml.namespace.QName("http://synapse.mgt.application.carbon.wso2.org/xsd",
                                                                              "events"));
                                          elementList.add(
                                          org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEvents[i]));
                                          } else {
                                             
                                                    elementList.add(new javax.xml.namespace.QName("http://synapse.mgt.application.carbon.wso2.org/xsd",
                                                                              "events"));
                                                    elementList.add(null);
                                                
                                          }
                                      

                                  }
                            } else {
                              
                                    elementList.add(new javax.xml.namespace.QName("http://synapse.mgt.application.carbon.wso2.org/xsd",
                                                                              "events"));
                                    elementList.add(null);
                                
                            }

                        } if (localLocalEntriesTracker){
                            if (localLocalEntries!=null){
                                  for (int i = 0;i < localLocalEntries.length;i++){
                                      
                                         if (localLocalEntries[i] != null){
                                          elementList.add(new javax.xml.namespace.QName("http://synapse.mgt.application.carbon.wso2.org/xsd",
                                                                              "localEntries"));
                                          elementList.add(
                                          org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLocalEntries[i]));
                                          } else {
                                             
                                                    elementList.add(new javax.xml.namespace.QName("http://synapse.mgt.application.carbon.wso2.org/xsd",
                                                                              "localEntries"));
                                                    elementList.add(null);
                                                
                                          }
                                      

                                  }
                            } else {
                              
                                    elementList.add(new javax.xml.namespace.QName("http://synapse.mgt.application.carbon.wso2.org/xsd",
                                                                              "localEntries"));
                                    elementList.add(null);
                                
                            }

                        } if (localMediatorsTracker){
                            if (localMediators!=null){
                                  for (int i = 0;i < localMediators.length;i++){
                                      
                                         if (localMediators[i] != null){
                                          elementList.add(new javax.xml.namespace.QName("http://synapse.mgt.application.carbon.wso2.org/xsd",
                                                                              "mediators"));
                                          elementList.add(
                                          org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMediators[i]));
                                          } else {
                                             
                                                    elementList.add(new javax.xml.namespace.QName("http://synapse.mgt.application.carbon.wso2.org/xsd",
                                                                              "mediators"));
                                                    elementList.add(null);
                                                
                                          }
                                      

                                  }
                            } else {
                              
                                    elementList.add(new javax.xml.namespace.QName("http://synapse.mgt.application.carbon.wso2.org/xsd",
                                                                              "mediators"));
                                    elementList.add(null);
                                
                            }

                        } if (localProxyServicesTracker){
                            if (localProxyServices!=null){
                                  for (int i = 0;i < localProxyServices.length;i++){
                                      
                                         if (localProxyServices[i] != null){
                                          elementList.add(new javax.xml.namespace.QName("http://synapse.mgt.application.carbon.wso2.org/xsd",
                                                                              "proxyServices"));
                                          elementList.add(
                                          org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localProxyServices[i]));
                                          } else {
                                             
                                                    elementList.add(new javax.xml.namespace.QName("http://synapse.mgt.application.carbon.wso2.org/xsd",
                                                                              "proxyServices"));
                                                    elementList.add(null);
                                                
                                          }
                                      

                                  }
                            } else {
                              
                                    elementList.add(new javax.xml.namespace.QName("http://synapse.mgt.application.carbon.wso2.org/xsd",
                                                                              "proxyServices"));
                                    elementList.add(null);
                                
                            }

                        } if (localSequencesTracker){
                            if (localSequences!=null){
                                  for (int i = 0;i < localSequences.length;i++){
                                      
                                         if (localSequences[i] != null){
                                          elementList.add(new javax.xml.namespace.QName("http://synapse.mgt.application.carbon.wso2.org/xsd",
                                                                              "sequences"));
                                          elementList.add(
                                          org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSequences[i]));
                                          } else {
                                             
                                                    elementList.add(new javax.xml.namespace.QName("http://synapse.mgt.application.carbon.wso2.org/xsd",
                                                                              "sequences"));
                                                    elementList.add(null);
                                                
                                          }
                                      

                                  }
                            } else {
                              
                                    elementList.add(new javax.xml.namespace.QName("http://synapse.mgt.application.carbon.wso2.org/xsd",
                                                                              "sequences"));
                                    elementList.add(null);
                                
                            }

                        } if (localTasksTracker){
                             if (localTasks!=null) {
                                 for (int i = 0;i < localTasks.length;i++){

                                    if (localTasks[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://synapse.mgt.application.carbon.wso2.org/xsd",
                                                                          "tasks"));
                                         elementList.add(localTasks[i]);
                                    } else {
                                        
                                                elementList.add(new javax.xml.namespace.QName("http://synapse.mgt.application.carbon.wso2.org/xsd",
                                                                          "tasks"));
                                                elementList.add(null);
                                            
                                    }

                                 }
                             } else {
                                 
                                        elementList.add(new javax.xml.namespace.QName("http://synapse.mgt.application.carbon.wso2.org/xsd",
                                                                          "tasks"));
                                        elementList.add(localTasks);
                                    
                             }

                        }

                return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
            
            

        }

  

     /**
      *  Factory class that keeps the parse method
      */
    public static class Factory{

        
        

        /**
        * static method to create the object
        * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
        *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
        * Postcondition: If this object is an element, the reader is positioned at its end element
        *                If this object is a complex type, the reader is positioned at the end element of its outer element
        */
        public static SynapseApplicationMetadata parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            SynapseApplicationMetadata object =
                new SynapseApplicationMetadata();

            int event;
            java.lang.String nillableValue = null;
            java.lang.String prefix ="";
            java.lang.String namespaceuri ="";
            try {
                
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                
                if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
                  java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                        "type");
                  if (fullTypeName!=null){
                    java.lang.String nsPrefix = null;
                    if (fullTypeName.indexOf(":") > -1){
                        nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
                    }
                    nsPrefix = nsPrefix==null?"":nsPrefix;

                    java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
                    
                            if (!"SynapseApplicationMetadata".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (SynapseApplicationMetadata)org.wso2.carbon.application.mgt.synapse.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                        java.util.ArrayList list2 = new java.util.ArrayList();
                    
                        java.util.ArrayList list3 = new java.util.ArrayList();
                    
                        java.util.ArrayList list4 = new java.util.ArrayList();
                    
                        java.util.ArrayList list5 = new java.util.ArrayList();
                    
                        java.util.ArrayList list6 = new java.util.ArrayList();
                    
                        java.util.ArrayList list7 = new java.util.ArrayList();
                    
                        java.util.ArrayList list8 = new java.util.ArrayList();
                    
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://synapse.mgt.application.carbon.wso2.org/xsd","appName").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setAppName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://synapse.mgt.application.carbon.wso2.org/xsd","endpoints").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list2.add(null);
                                                              reader.next();
                                                          } else {
                                                        list2.add(org.wso2.carbon.application.mgt.synapse.xsd.EndpointMetadata.Factory.parse(reader));
                                                                }
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone2 = false;
                                                        while(!loopDone2){
                                                            // We should be at the end element, but make sure
                                                            while (!reader.isEndElement())
                                                                reader.next();
                                                            // Step out of this element
                                                            reader.next();
                                                            // Step to next element event.
                                                            while (!reader.isStartElement() && !reader.isEndElement())
                                                                reader.next();
                                                            if (reader.isEndElement()){
                                                                //two continuous end elements means we are exiting the xml structure
                                                                loopDone2 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://synapse.mgt.application.carbon.wso2.org/xsd","endpoints").equals(reader.getName())){
                                                                    
                                                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                                          list2.add(null);
                                                                          reader.next();
                                                                      } else {
                                                                    list2.add(org.wso2.carbon.application.mgt.synapse.xsd.EndpointMetadata.Factory.parse(reader));
                                                                        }
                                                                }else{
                                                                    loopDone2 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setEndpoints((org.wso2.carbon.application.mgt.synapse.xsd.EndpointMetadata[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                org.wso2.carbon.application.mgt.synapse.xsd.EndpointMetadata.class,
                                                                list2));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://synapse.mgt.application.carbon.wso2.org/xsd","events").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                              nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                              if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                  list3.add(null);
                                                       
                                                  reader.next();
                                              } else {
                                            list3.add(reader.getElementText());
                                            }
                                            //loop until we find a start element that is not part of this array
                                            boolean loopDone3 = false;
                                            while(!loopDone3){
                                                // Ensure we are at the EndElement
                                                while (!reader.isEndElement()){
                                                    reader.next();
                                                }
                                                // Step out of this element
                                                reader.next();
                                                // Step to next element event.
                                                while (!reader.isStartElement() && !reader.isEndElement())
                                                    reader.next();
                                                if (reader.isEndElement()){
                                                    //two continuous end elements means we are exiting the xml structure
                                                    loopDone3 = true;
                                                } else {
                                                    if (new javax.xml.namespace.QName("http://synapse.mgt.application.carbon.wso2.org/xsd","events").equals(reader.getName())){
                                                         
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list3.add(null);
                                                                   
                                                              reader.next();
                                                          } else {
                                                        list3.add(reader.getElementText());
                                                        }
                                                    }else{
                                                        loopDone3 = true;
                                                    }
                                                }
                                            }
                                            // call the converter utility  to convert and set the array
                                            
                                                    object.setEvents((java.lang.String[])
                                                        list3.toArray(new java.lang.String[list3.size()]));
                                                
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://synapse.mgt.application.carbon.wso2.org/xsd","localEntries").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                              nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                              if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                  list4.add(null);
                                                       
                                                  reader.next();
                                              } else {
                                            list4.add(reader.getElementText());
                                            }
                                            //loop until we find a start element that is not part of this array
                                            boolean loopDone4 = false;
                                            while(!loopDone4){
                                                // Ensure we are at the EndElement
                                                while (!reader.isEndElement()){
                                                    reader.next();
                                                }
                                                // Step out of this element
                                                reader.next();
                                                // Step to next element event.
                                                while (!reader.isStartElement() && !reader.isEndElement())
                                                    reader.next();
                                                if (reader.isEndElement()){
                                                    //two continuous end elements means we are exiting the xml structure
                                                    loopDone4 = true;
                                                } else {
                                                    if (new javax.xml.namespace.QName("http://synapse.mgt.application.carbon.wso2.org/xsd","localEntries").equals(reader.getName())){
                                                         
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list4.add(null);
                                                                   
                                                              reader.next();
                                                          } else {
                                                        list4.add(reader.getElementText());
                                                        }
                                                    }else{
                                                        loopDone4 = true;
                                                    }
                                                }
                                            }
                                            // call the converter utility  to convert and set the array
                                            
                                                    object.setLocalEntries((java.lang.String[])
                                                        list4.toArray(new java.lang.String[list4.size()]));
                                                
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://synapse.mgt.application.carbon.wso2.org/xsd","mediators").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                              nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                              if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                  list5.add(null);
                                                       
                                                  reader.next();
                                              } else {
                                            list5.add(reader.getElementText());
                                            }
                                            //loop until we find a start element that is not part of this array
                                            boolean loopDone5 = false;
                                            while(!loopDone5){
                                                // Ensure we are at the EndElement
                                                while (!reader.isEndElement()){
                                                    reader.next();
                                                }
                                                // Step out of this element
                                                reader.next();
                                                // Step to next element event.
                                                while (!reader.isStartElement() && !reader.isEndElement())
                                                    reader.next();
                                                if (reader.isEndElement()){
                                                    //two continuous end elements means we are exiting the xml structure
                                                    loopDone5 = true;
                                                } else {
                                                    if (new javax.xml.namespace.QName("http://synapse.mgt.application.carbon.wso2.org/xsd","mediators").equals(reader.getName())){
                                                         
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list5.add(null);
                                                                   
                                                              reader.next();
                                                          } else {
                                                        list5.add(reader.getElementText());
                                                        }
                                                    }else{
                                                        loopDone5 = true;
                                                    }
                                                }
                                            }
                                            // call the converter utility  to convert and set the array
                                            
                                                    object.setMediators((java.lang.String[])
                                                        list5.toArray(new java.lang.String[list5.size()]));
                                                
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://synapse.mgt.application.carbon.wso2.org/xsd","proxyServices").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                              nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                              if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                  list6.add(null);
                                                       
                                                  reader.next();
                                              } else {
                                            list6.add(reader.getElementText());
                                            }
                                            //loop until we find a start element that is not part of this array
                                            boolean loopDone6 = false;
                                            while(!loopDone6){
                                                // Ensure we are at the EndElement
                                                while (!reader.isEndElement()){
                                                    reader.next();
                                                }
                                                // Step out of this element
                                                reader.next();
                                                // Step to next element event.
                                                while (!reader.isStartElement() && !reader.isEndElement())
                                                    reader.next();
                                                if (reader.isEndElement()){
                                                    //two continuous end elements means we are exiting the xml structure
                                                    loopDone6 = true;
                                                } else {
                                                    if (new javax.xml.namespace.QName("http://synapse.mgt.application.carbon.wso2.org/xsd","proxyServices").equals(reader.getName())){
                                                         
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list6.add(null);
                                                                   
                                                              reader.next();
                                                          } else {
                                                        list6.add(reader.getElementText());
                                                        }
                                                    }else{
                                                        loopDone6 = true;
                                                    }
                                                }
                                            }
                                            // call the converter utility  to convert and set the array
                                            
                                                    object.setProxyServices((java.lang.String[])
                                                        list6.toArray(new java.lang.String[list6.size()]));
                                                
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://synapse.mgt.application.carbon.wso2.org/xsd","sequences").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                              nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                              if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                  list7.add(null);
                                                       
                                                  reader.next();
                                              } else {
                                            list7.add(reader.getElementText());
                                            }
                                            //loop until we find a start element that is not part of this array
                                            boolean loopDone7 = false;
                                            while(!loopDone7){
                                                // Ensure we are at the EndElement
                                                while (!reader.isEndElement()){
                                                    reader.next();
                                                }
                                                // Step out of this element
                                                reader.next();
                                                // Step to next element event.
                                                while (!reader.isStartElement() && !reader.isEndElement())
                                                    reader.next();
                                                if (reader.isEndElement()){
                                                    //two continuous end elements means we are exiting the xml structure
                                                    loopDone7 = true;
                                                } else {
                                                    if (new javax.xml.namespace.QName("http://synapse.mgt.application.carbon.wso2.org/xsd","sequences").equals(reader.getName())){
                                                         
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list7.add(null);
                                                                   
                                                              reader.next();
                                                          } else {
                                                        list7.add(reader.getElementText());
                                                        }
                                                    }else{
                                                        loopDone7 = true;
                                                    }
                                                }
                                            }
                                            // call the converter utility  to convert and set the array
                                            
                                                    object.setSequences((java.lang.String[])
                                                        list7.toArray(new java.lang.String[list7.size()]));
                                                
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://synapse.mgt.application.carbon.wso2.org/xsd","tasks").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list8.add(null);
                                                              reader.next();
                                                          } else {
                                                        list8.add(org.wso2.carbon.application.mgt.synapse.xsd.TaskMetadata.Factory.parse(reader));
                                                                }
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone8 = false;
                                                        while(!loopDone8){
                                                            // We should be at the end element, but make sure
                                                            while (!reader.isEndElement())
                                                                reader.next();
                                                            // Step out of this element
                                                            reader.next();
                                                            // Step to next element event.
                                                            while (!reader.isStartElement() && !reader.isEndElement())
                                                                reader.next();
                                                            if (reader.isEndElement()){
                                                                //two continuous end elements means we are exiting the xml structure
                                                                loopDone8 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://synapse.mgt.application.carbon.wso2.org/xsd","tasks").equals(reader.getName())){
                                                                    
                                                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                                          list8.add(null);
                                                                          reader.next();
                                                                      } else {
                                                                    list8.add(org.wso2.carbon.application.mgt.synapse.xsd.TaskMetadata.Factory.parse(reader));
                                                                        }
                                                                }else{
                                                                    loopDone8 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setTasks((org.wso2.carbon.application.mgt.synapse.xsd.TaskMetadata[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                org.wso2.carbon.application.mgt.synapse.xsd.TaskMetadata.class,
                                                                list8));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                  
                            while (!reader.isStartElement() && !reader.isEndElement())
                                reader.next();
                            
                                if (reader.isStartElement())
                                // A start element we are not expecting indicates a trailing invalid property
                                throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                            



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
    
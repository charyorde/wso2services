
/**
 * TaskDescription.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v3  Built on : Oct 26, 2011 (07:42:27 PDT)
 */

            
                package org.apache.synapse.task.xsd;
            

            /**
            *  TaskDescription bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class TaskDescription
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = TaskDescription
                Namespace URI = http://task.synapse.apache.org/xsd
                Namespace Prefix = ns3
                */
            

                        /**
                        * field for Count
                        */

                        
                                    protected int localCount ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCountTracker = false ;

                           public boolean isCountSpecified(){
                               return localCountTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getCount(){
                               return localCount;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Count
                               */
                               public void setCount(int param){
                            
                                       // setting primitive attribute tracker to true
                                       localCountTracker =
                                       param != java.lang.Integer.MIN_VALUE;
                                   
                                            this.localCount=param;
                                    

                               }
                            

                        /**
                        * field for Cron
                        */

                        
                                    protected java.lang.String localCron ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCronTracker = false ;

                           public boolean isCronSpecified(){
                               return localCronTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getCron(){
                               return localCron;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Cron
                               */
                               public void setCron(java.lang.String param){
                            localCronTracker = true;
                                   
                                            this.localCron=param;
                                    

                               }
                            

                        /**
                        * field for Description
                        */

                        
                                    protected java.lang.String localDescription ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDescriptionTracker = false ;

                           public boolean isDescriptionSpecified(){
                               return localDescriptionTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getDescription(){
                               return localDescription;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Description
                               */
                               public void setDescription(java.lang.String param){
                            localDescriptionTracker = true;
                                   
                                            this.localDescription=param;
                                    

                               }
                            

                        /**
                        * field for EndTime
                        */

                        
                                    protected java.util.Date localEndTime ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localEndTimeTracker = false ;

                           public boolean isEndTimeSpecified(){
                               return localEndTimeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.util.Date
                           */
                           public  java.util.Date getEndTime(){
                               return localEndTime;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param EndTime
                               */
                               public void setEndTime(java.util.Date param){
                            localEndTimeTracker = true;
                                   
                                            this.localEndTime=param;
                                    

                               }
                            

                        /**
                        * field for Group
                        */

                        
                                    protected java.lang.String localGroup ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGroupTracker = false ;

                           public boolean isGroupSpecified(){
                               return localGroupTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getGroup(){
                               return localGroup;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Group
                               */
                               public void setGroup(java.lang.String param){
                            localGroupTracker = true;
                                   
                                            this.localGroup=param;
                                    

                               }
                            

                        /**
                        * field for Interval
                        */

                        
                                    protected long localInterval ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localIntervalTracker = false ;

                           public boolean isIntervalSpecified(){
                               return localIntervalTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return long
                           */
                           public  long getInterval(){
                               return localInterval;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Interval
                               */
                               public void setInterval(long param){
                            
                                       // setting primitive attribute tracker to true
                                       localIntervalTracker =
                                       param != java.lang.Long.MIN_VALUE;
                                   
                                            this.localInterval=param;
                                    

                               }
                            

                        /**
                        * field for Name
                        */

                        
                                    protected java.lang.String localName ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localNameTracker = false ;

                           public boolean isNameSpecified(){
                               return localNameTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getName(){
                               return localName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Name
                               */
                               public void setName(java.lang.String param){
                            localNameTracker = true;
                                   
                                            this.localName=param;
                                    

                               }
                            

                        /**
                        * field for PinnedServers
                        * This was an Array!
                        */

                        
                                    protected java.lang.String[] localPinnedServers ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPinnedServersTracker = false ;

                           public boolean isPinnedServersSpecified(){
                               return localPinnedServersTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String[]
                           */
                           public  java.lang.String[] getPinnedServers(){
                               return localPinnedServers;
                           }

                           
                        


                               
                              /**
                               * validate the array for PinnedServers
                               */
                              protected void validatePinnedServers(java.lang.String[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param PinnedServers
                              */
                              public void setPinnedServers(java.lang.String[] param){
                              
                                   validatePinnedServers(param);

                               localPinnedServersTracker = true;
                                      
                                      this.localPinnedServers=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param java.lang.String
                             */
                             public void addPinnedServers(java.lang.String param){
                                   if (localPinnedServers == null){
                                   localPinnedServers = new java.lang.String[]{};
                                   }

                            
                                 //update the setting tracker
                                localPinnedServersTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localPinnedServers);
                               list.add(param);
                               this.localPinnedServers =
                             (java.lang.String[])list.toArray(
                            new java.lang.String[list.size()]);

                             }
                             

                        /**
                        * field for Properties
                        */

                        
                                    protected java.util.xsd.Set localProperties ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPropertiesTracker = false ;

                           public boolean isPropertiesSpecified(){
                               return localPropertiesTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.util.xsd.Set
                           */
                           public  java.util.xsd.Set getProperties(){
                               return localProperties;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Properties
                               */
                               public void setProperties(java.util.xsd.Set param){
                            localPropertiesTracker = true;
                                   
                                            this.localProperties=param;
                                    

                               }
                            

                        /**
                        * field for StartTime
                        */

                        
                                    protected java.util.Date localStartTime ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localStartTimeTracker = false ;

                           public boolean isStartTimeSpecified(){
                               return localStartTimeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.util.Date
                           */
                           public  java.util.Date getStartTime(){
                               return localStartTime;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param StartTime
                               */
                               public void setStartTime(java.util.Date param){
                            localStartTimeTracker = true;
                                   
                                            this.localStartTime=param;
                                    

                               }
                            

                        /**
                        * field for TaskClass
                        */

                        
                                    protected java.lang.String localTaskClass ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTaskClassTracker = false ;

                           public boolean isTaskClassSpecified(){
                               return localTaskClassTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getTaskClass(){
                               return localTaskClass;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TaskClass
                               */
                               public void setTaskClass(java.lang.String param){
                            localTaskClassTracker = true;
                                   
                                            this.localTaskClass=param;
                                    

                               }
                            

                        /**
                        * field for Volatility
                        */

                        
                                    protected boolean localVolatility ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localVolatilityTracker = false ;

                           public boolean isVolatilitySpecified(){
                               return localVolatilityTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getVolatility(){
                               return localVolatility;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Volatility
                               */
                               public void setVolatility(boolean param){
                            
                                       // setting primitive attribute tracker to true
                                       localVolatilityTracker =
                                       true;
                                   
                                            this.localVolatility=param;
                                    

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
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://task.synapse.apache.org/xsd");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":TaskDescription",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "TaskDescription",
                           xmlWriter);
                   }

               
                   }
                if (localCountTracker){
                                    namespace = "http://task.synapse.apache.org/xsd";
                                    writeStartElement(null, namespace, "count", xmlWriter);
                             
                                               if (localCount==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("count cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCount));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCronTracker){
                                    namespace = "http://task.synapse.apache.org/xsd";
                                    writeStartElement(null, namespace, "cron", xmlWriter);
                             

                                          if (localCron==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localCron);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localDescriptionTracker){
                                    namespace = "http://task.synapse.apache.org/xsd";
                                    writeStartElement(null, namespace, "description", xmlWriter);
                             

                                          if (localDescription==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localDescription);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localEndTimeTracker){
                                    namespace = "http://task.synapse.apache.org/xsd";
                                    writeStartElement(null, namespace, "endTime", xmlWriter);
                             

                                          if (localEndTime==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEndTime));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localGroupTracker){
                                    namespace = "http://task.synapse.apache.org/xsd";
                                    writeStartElement(null, namespace, "group", xmlWriter);
                             

                                          if (localGroup==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localGroup);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localIntervalTracker){
                                    namespace = "http://task.synapse.apache.org/xsd";
                                    writeStartElement(null, namespace, "interval", xmlWriter);
                             
                                               if (localInterval==java.lang.Long.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("interval cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localInterval));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localNameTracker){
                                    namespace = "http://task.synapse.apache.org/xsd";
                                    writeStartElement(null, namespace, "name", xmlWriter);
                             

                                          if (localName==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localName);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPinnedServersTracker){
                             if (localPinnedServers!=null) {
                                   namespace = "http://task.synapse.apache.org/xsd";
                                   for (int i = 0;i < localPinnedServers.length;i++){
                                        
                                            if (localPinnedServers[i] != null){
                                        
                                                writeStartElement(null, namespace, "pinnedServers", xmlWriter);

                                            
                                                        xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPinnedServers[i]));
                                                    
                                                xmlWriter.writeEndElement();
                                              
                                                } else {
                                                   
                                                           // write null attribute
                                                            namespace = "http://task.synapse.apache.org/xsd";
                                                            writeStartElement(null, namespace, "pinnedServers", xmlWriter);
                                                            writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                            xmlWriter.writeEndElement();
                                                       
                                                }

                                   }
                             } else {
                                 
                                         // write the null attribute
                                        // write null attribute
                                           writeStartElement(null, "http://task.synapse.apache.org/xsd", "pinnedServers", xmlWriter);

                                           // write the nil attribute
                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                           xmlWriter.writeEndElement();
                                    
                             }

                        } if (localPropertiesTracker){
                                    if (localProperties==null){

                                        writeStartElement(null, "http://task.synapse.apache.org/xsd", "properties", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localProperties.serialize(new javax.xml.namespace.QName("http://task.synapse.apache.org/xsd","properties"),
                                        xmlWriter);
                                    }
                                } if (localStartTimeTracker){
                                    namespace = "http://task.synapse.apache.org/xsd";
                                    writeStartElement(null, namespace, "startTime", xmlWriter);
                             

                                          if (localStartTime==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localStartTime));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localTaskClassTracker){
                                    namespace = "http://task.synapse.apache.org/xsd";
                                    writeStartElement(null, namespace, "taskClass", xmlWriter);
                             

                                          if (localTaskClass==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localTaskClass);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localVolatilityTracker){
                                    namespace = "http://task.synapse.apache.org/xsd";
                                    writeStartElement(null, namespace, "volatility", xmlWriter);
                             
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("volatility cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localVolatility));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             }
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://task.synapse.apache.org/xsd")){
                return "ns3";
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

                 if (localCountTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://task.synapse.apache.org/xsd",
                                                                      "count"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCount));
                            } if (localCronTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://task.synapse.apache.org/xsd",
                                                                      "cron"));
                                 
                                         elementList.add(localCron==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCron));
                                    } if (localDescriptionTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://task.synapse.apache.org/xsd",
                                                                      "description"));
                                 
                                         elementList.add(localDescription==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDescription));
                                    } if (localEndTimeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://task.synapse.apache.org/xsd",
                                                                      "endTime"));
                                 
                                         elementList.add(localEndTime==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEndTime));
                                    } if (localGroupTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://task.synapse.apache.org/xsd",
                                                                      "group"));
                                 
                                         elementList.add(localGroup==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGroup));
                                    } if (localIntervalTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://task.synapse.apache.org/xsd",
                                                                      "interval"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localInterval));
                            } if (localNameTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://task.synapse.apache.org/xsd",
                                                                      "name"));
                                 
                                         elementList.add(localName==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localName));
                                    } if (localPinnedServersTracker){
                            if (localPinnedServers!=null){
                                  for (int i = 0;i < localPinnedServers.length;i++){
                                      
                                         if (localPinnedServers[i] != null){
                                          elementList.add(new javax.xml.namespace.QName("http://task.synapse.apache.org/xsd",
                                                                              "pinnedServers"));
                                          elementList.add(
                                          org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPinnedServers[i]));
                                          } else {
                                             
                                                    elementList.add(new javax.xml.namespace.QName("http://task.synapse.apache.org/xsd",
                                                                              "pinnedServers"));
                                                    elementList.add(null);
                                                
                                          }
                                      

                                  }
                            } else {
                              
                                    elementList.add(new javax.xml.namespace.QName("http://task.synapse.apache.org/xsd",
                                                                              "pinnedServers"));
                                    elementList.add(null);
                                
                            }

                        } if (localPropertiesTracker){
                            elementList.add(new javax.xml.namespace.QName("http://task.synapse.apache.org/xsd",
                                                                      "properties"));
                            
                            
                                    elementList.add(localProperties==null?null:
                                    localProperties);
                                } if (localStartTimeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://task.synapse.apache.org/xsd",
                                                                      "startTime"));
                                 
                                         elementList.add(localStartTime==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localStartTime));
                                    } if (localTaskClassTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://task.synapse.apache.org/xsd",
                                                                      "taskClass"));
                                 
                                         elementList.add(localTaskClass==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTaskClass));
                                    } if (localVolatilityTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://task.synapse.apache.org/xsd",
                                                                      "volatility"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localVolatility));
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
        public static TaskDescription parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            TaskDescription object =
                new TaskDescription();

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
                    
                            if (!"TaskDescription".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (TaskDescription)java.util.xsd.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                        java.util.ArrayList list8 = new java.util.ArrayList();
                    
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://task.synapse.apache.org/xsd","count").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"count" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCount(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setCount(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://task.synapse.apache.org/xsd","cron").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCron(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://task.synapse.apache.org/xsd","description").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setDescription(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://task.synapse.apache.org/xsd","endTime").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setEndTime(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDate(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://task.synapse.apache.org/xsd","group").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setGroup(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://task.synapse.apache.org/xsd","interval").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"interval" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setInterval(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setInterval(java.lang.Long.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://task.synapse.apache.org/xsd","name").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://task.synapse.apache.org/xsd","pinnedServers").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                              nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                              if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                  list8.add(null);
                                                       
                                                  reader.next();
                                              } else {
                                            list8.add(reader.getElementText());
                                            }
                                            //loop until we find a start element that is not part of this array
                                            boolean loopDone8 = false;
                                            while(!loopDone8){
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
                                                    loopDone8 = true;
                                                } else {
                                                    if (new javax.xml.namespace.QName("http://task.synapse.apache.org/xsd","pinnedServers").equals(reader.getName())){
                                                         
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list8.add(null);
                                                                   
                                                              reader.next();
                                                          } else {
                                                        list8.add(reader.getElementText());
                                                        }
                                                    }else{
                                                        loopDone8 = true;
                                                    }
                                                }
                                            }
                                            // call the converter utility  to convert and set the array
                                            
                                                    object.setPinnedServers((java.lang.String[])
                                                        list8.toArray(new java.lang.String[list8.size()]));
                                                
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://task.synapse.apache.org/xsd","properties").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setProperties(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setProperties(java.util.xsd.Set.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://task.synapse.apache.org/xsd","startTime").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setStartTime(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDate(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://task.synapse.apache.org/xsd","taskClass").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTaskClass(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://task.synapse.apache.org/xsd","volatility").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"volatility" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setVolatility(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
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
           
    

/**
 * LogData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v3  Built on : Oct 26, 2011 (07:42:27 PDT)
 */

            
                package org.wso2.carbon.logging.service.data.xsd;
            

            /**
            *  LogData bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class LogData
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = LogData
                Namespace URI = http://data.service.logging.carbon.wso2.org/xsd
                Namespace Prefix = ns8
                */
            

                        /**
                        * field for AppenderData
                        * This was an Array!
                        */

                        
                                    protected org.wso2.carbon.logging.service.data.xsd.AppenderData[] localAppenderData ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAppenderDataTracker = false ;

                           public boolean isAppenderDataSpecified(){
                               return localAppenderDataTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return org.wso2.carbon.logging.service.data.xsd.AppenderData[]
                           */
                           public  org.wso2.carbon.logging.service.data.xsd.AppenderData[] getAppenderData(){
                               return localAppenderData;
                           }

                           
                        


                               
                              /**
                               * validate the array for AppenderData
                               */
                              protected void validateAppenderData(org.wso2.carbon.logging.service.data.xsd.AppenderData[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param AppenderData
                              */
                              public void setAppenderData(org.wso2.carbon.logging.service.data.xsd.AppenderData[] param){
                              
                                   validateAppenderData(param);

                               localAppenderDataTracker = true;
                                      
                                      this.localAppenderData=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param org.wso2.carbon.logging.service.data.xsd.AppenderData
                             */
                             public void addAppenderData(org.wso2.carbon.logging.service.data.xsd.AppenderData param){
                                   if (localAppenderData == null){
                                   localAppenderData = new org.wso2.carbon.logging.service.data.xsd.AppenderData[]{};
                                   }

                            
                                 //update the setting tracker
                                localAppenderDataTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localAppenderData);
                               list.add(param);
                               this.localAppenderData =
                             (org.wso2.carbon.logging.service.data.xsd.AppenderData[])list.toArray(
                            new org.wso2.carbon.logging.service.data.xsd.AppenderData[list.size()]);

                             }
                             

                        /**
                        * field for LogFile
                        */

                        
                                    protected java.lang.String localLogFile ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localLogFileTracker = false ;

                           public boolean isLogFileSpecified(){
                               return localLogFileTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getLogFile(){
                               return localLogFile;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param LogFile
                               */
                               public void setLogFile(java.lang.String param){
                            localLogFileTracker = true;
                                   
                                            this.localLogFile=param;
                                    

                               }
                            

                        /**
                        * field for LogLevel
                        */

                        
                                    protected java.lang.String localLogLevel ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localLogLevelTracker = false ;

                           public boolean isLogLevelSpecified(){
                               return localLogLevelTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getLogLevel(){
                               return localLogLevel;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param LogLevel
                               */
                               public void setLogLevel(java.lang.String param){
                            localLogLevelTracker = true;
                                   
                                            this.localLogLevel=param;
                                    

                               }
                            

                        /**
                        * field for LogPattern
                        */

                        
                                    protected java.lang.String localLogPattern ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localLogPatternTracker = false ;

                           public boolean isLogPatternSpecified(){
                               return localLogPatternTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getLogPattern(){
                               return localLogPattern;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param LogPattern
                               */
                               public void setLogPattern(java.lang.String param){
                            localLogPatternTracker = true;
                                   
                                            this.localLogPattern=param;
                                    

                               }
                            

                        /**
                        * field for LoggerData
                        * This was an Array!
                        */

                        
                                    protected org.wso2.carbon.logging.service.data.xsd.LoggerData[] localLoggerData ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localLoggerDataTracker = false ;

                           public boolean isLoggerDataSpecified(){
                               return localLoggerDataTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return org.wso2.carbon.logging.service.data.xsd.LoggerData[]
                           */
                           public  org.wso2.carbon.logging.service.data.xsd.LoggerData[] getLoggerData(){
                               return localLoggerData;
                           }

                           
                        


                               
                              /**
                               * validate the array for LoggerData
                               */
                              protected void validateLoggerData(org.wso2.carbon.logging.service.data.xsd.LoggerData[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param LoggerData
                              */
                              public void setLoggerData(org.wso2.carbon.logging.service.data.xsd.LoggerData[] param){
                              
                                   validateLoggerData(param);

                               localLoggerDataTracker = true;
                                      
                                      this.localLoggerData=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param org.wso2.carbon.logging.service.data.xsd.LoggerData
                             */
                             public void addLoggerData(org.wso2.carbon.logging.service.data.xsd.LoggerData param){
                                   if (localLoggerData == null){
                                   localLoggerData = new org.wso2.carbon.logging.service.data.xsd.LoggerData[]{};
                                   }

                            
                                 //update the setting tracker
                                localLoggerDataTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localLoggerData);
                               list.add(param);
                               this.localLoggerData =
                             (org.wso2.carbon.logging.service.data.xsd.LoggerData[])list.toArray(
                            new org.wso2.carbon.logging.service.data.xsd.LoggerData[list.size()]);

                             }
                             

                        /**
                        * field for SelectedAppenderData
                        */

                        
                                    protected org.wso2.carbon.logging.service.data.xsd.AppenderData localSelectedAppenderData ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSelectedAppenderDataTracker = false ;

                           public boolean isSelectedAppenderDataSpecified(){
                               return localSelectedAppenderDataTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return org.wso2.carbon.logging.service.data.xsd.AppenderData
                           */
                           public  org.wso2.carbon.logging.service.data.xsd.AppenderData getSelectedAppenderData(){
                               return localSelectedAppenderData;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SelectedAppenderData
                               */
                               public void setSelectedAppenderData(org.wso2.carbon.logging.service.data.xsd.AppenderData param){
                            localSelectedAppenderDataTracker = true;
                                   
                                            this.localSelectedAppenderData=param;
                                    

                               }
                            

                        /**
                        * field for SelectedLoggerData
                        */

                        
                                    protected org.wso2.carbon.logging.service.data.xsd.LoggerData localSelectedLoggerData ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSelectedLoggerDataTracker = false ;

                           public boolean isSelectedLoggerDataSpecified(){
                               return localSelectedLoggerDataTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return org.wso2.carbon.logging.service.data.xsd.LoggerData
                           */
                           public  org.wso2.carbon.logging.service.data.xsd.LoggerData getSelectedLoggerData(){
                               return localSelectedLoggerData;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SelectedLoggerData
                               */
                               public void setSelectedLoggerData(org.wso2.carbon.logging.service.data.xsd.LoggerData param){
                            localSelectedLoggerDataTracker = true;
                                   
                                            this.localSelectedLoggerData=param;
                                    

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
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://data.service.logging.carbon.wso2.org/xsd");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":LogData",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "LogData",
                           xmlWriter);
                   }

               
                   }
                if (localAppenderDataTracker){
                                       if (localAppenderData!=null){
                                            for (int i = 0;i < localAppenderData.length;i++){
                                                if (localAppenderData[i] != null){
                                                 localAppenderData[i].serialize(new javax.xml.namespace.QName("http://data.service.logging.carbon.wso2.org/xsd","appenderData"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                            writeStartElement(null, "http://data.service.logging.carbon.wso2.org/xsd", "appenderData", xmlWriter);

                                                           // write the nil attribute
                                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                           xmlWriter.writeEndElement();
                                                    
                                                }

                                            }
                                     } else {
                                        
                                                writeStartElement(null, "http://data.service.logging.carbon.wso2.org/xsd", "appenderData", xmlWriter);

                                               // write the nil attribute
                                               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                               xmlWriter.writeEndElement();
                                        
                                    }
                                 } if (localLogFileTracker){
                                    namespace = "http://data.service.logging.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "logFile", xmlWriter);
                             

                                          if (localLogFile==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localLogFile);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localLogLevelTracker){
                                    namespace = "http://data.service.logging.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "logLevel", xmlWriter);
                             

                                          if (localLogLevel==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localLogLevel);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localLogPatternTracker){
                                    namespace = "http://data.service.logging.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "logPattern", xmlWriter);
                             

                                          if (localLogPattern==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localLogPattern);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localLoggerDataTracker){
                                       if (localLoggerData!=null){
                                            for (int i = 0;i < localLoggerData.length;i++){
                                                if (localLoggerData[i] != null){
                                                 localLoggerData[i].serialize(new javax.xml.namespace.QName("http://data.service.logging.carbon.wso2.org/xsd","loggerData"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                            writeStartElement(null, "http://data.service.logging.carbon.wso2.org/xsd", "loggerData", xmlWriter);

                                                           // write the nil attribute
                                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                           xmlWriter.writeEndElement();
                                                    
                                                }

                                            }
                                     } else {
                                        
                                                writeStartElement(null, "http://data.service.logging.carbon.wso2.org/xsd", "loggerData", xmlWriter);

                                               // write the nil attribute
                                               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                               xmlWriter.writeEndElement();
                                        
                                    }
                                 } if (localSelectedAppenderDataTracker){
                                    if (localSelectedAppenderData==null){

                                        writeStartElement(null, "http://data.service.logging.carbon.wso2.org/xsd", "selectedAppenderData", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localSelectedAppenderData.serialize(new javax.xml.namespace.QName("http://data.service.logging.carbon.wso2.org/xsd","selectedAppenderData"),
                                        xmlWriter);
                                    }
                                } if (localSelectedLoggerDataTracker){
                                    if (localSelectedLoggerData==null){

                                        writeStartElement(null, "http://data.service.logging.carbon.wso2.org/xsd", "selectedLoggerData", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localSelectedLoggerData.serialize(new javax.xml.namespace.QName("http://data.service.logging.carbon.wso2.org/xsd","selectedLoggerData"),
                                        xmlWriter);
                                    }
                                }
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://data.service.logging.carbon.wso2.org/xsd")){
                return "ns8";
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

                 if (localAppenderDataTracker){
                             if (localAppenderData!=null) {
                                 for (int i = 0;i < localAppenderData.length;i++){

                                    if (localAppenderData[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://data.service.logging.carbon.wso2.org/xsd",
                                                                          "appenderData"));
                                         elementList.add(localAppenderData[i]);
                                    } else {
                                        
                                                elementList.add(new javax.xml.namespace.QName("http://data.service.logging.carbon.wso2.org/xsd",
                                                                          "appenderData"));
                                                elementList.add(null);
                                            
                                    }

                                 }
                             } else {
                                 
                                        elementList.add(new javax.xml.namespace.QName("http://data.service.logging.carbon.wso2.org/xsd",
                                                                          "appenderData"));
                                        elementList.add(localAppenderData);
                                    
                             }

                        } if (localLogFileTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://data.service.logging.carbon.wso2.org/xsd",
                                                                      "logFile"));
                                 
                                         elementList.add(localLogFile==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLogFile));
                                    } if (localLogLevelTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://data.service.logging.carbon.wso2.org/xsd",
                                                                      "logLevel"));
                                 
                                         elementList.add(localLogLevel==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLogLevel));
                                    } if (localLogPatternTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://data.service.logging.carbon.wso2.org/xsd",
                                                                      "logPattern"));
                                 
                                         elementList.add(localLogPattern==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLogPattern));
                                    } if (localLoggerDataTracker){
                             if (localLoggerData!=null) {
                                 for (int i = 0;i < localLoggerData.length;i++){

                                    if (localLoggerData[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://data.service.logging.carbon.wso2.org/xsd",
                                                                          "loggerData"));
                                         elementList.add(localLoggerData[i]);
                                    } else {
                                        
                                                elementList.add(new javax.xml.namespace.QName("http://data.service.logging.carbon.wso2.org/xsd",
                                                                          "loggerData"));
                                                elementList.add(null);
                                            
                                    }

                                 }
                             } else {
                                 
                                        elementList.add(new javax.xml.namespace.QName("http://data.service.logging.carbon.wso2.org/xsd",
                                                                          "loggerData"));
                                        elementList.add(localLoggerData);
                                    
                             }

                        } if (localSelectedAppenderDataTracker){
                            elementList.add(new javax.xml.namespace.QName("http://data.service.logging.carbon.wso2.org/xsd",
                                                                      "selectedAppenderData"));
                            
                            
                                    elementList.add(localSelectedAppenderData==null?null:
                                    localSelectedAppenderData);
                                } if (localSelectedLoggerDataTracker){
                            elementList.add(new javax.xml.namespace.QName("http://data.service.logging.carbon.wso2.org/xsd",
                                                                      "selectedLoggerData"));
                            
                            
                                    elementList.add(localSelectedLoggerData==null?null:
                                    localSelectedLoggerData);
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
        public static LogData parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            LogData object =
                new LogData();

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
                    
                            if (!"LogData".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (LogData)org.wso2.carbon.logging.service.xsd.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                        java.util.ArrayList list1 = new java.util.ArrayList();
                    
                        java.util.ArrayList list5 = new java.util.ArrayList();
                    
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://data.service.logging.carbon.wso2.org/xsd","appenderData").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list1.add(null);
                                                              reader.next();
                                                          } else {
                                                        list1.add(org.wso2.carbon.logging.service.data.xsd.AppenderData.Factory.parse(reader));
                                                                }
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone1 = false;
                                                        while(!loopDone1){
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
                                                                loopDone1 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://data.service.logging.carbon.wso2.org/xsd","appenderData").equals(reader.getName())){
                                                                    
                                                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                                          list1.add(null);
                                                                          reader.next();
                                                                      } else {
                                                                    list1.add(org.wso2.carbon.logging.service.data.xsd.AppenderData.Factory.parse(reader));
                                                                        }
                                                                }else{
                                                                    loopDone1 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setAppenderData((org.wso2.carbon.logging.service.data.xsd.AppenderData[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                org.wso2.carbon.logging.service.data.xsd.AppenderData.class,
                                                                list1));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://data.service.logging.carbon.wso2.org/xsd","logFile").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setLogFile(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://data.service.logging.carbon.wso2.org/xsd","logLevel").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setLogLevel(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://data.service.logging.carbon.wso2.org/xsd","logPattern").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setLogPattern(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://data.service.logging.carbon.wso2.org/xsd","loggerData").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list5.add(null);
                                                              reader.next();
                                                          } else {
                                                        list5.add(org.wso2.carbon.logging.service.data.xsd.LoggerData.Factory.parse(reader));
                                                                }
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone5 = false;
                                                        while(!loopDone5){
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
                                                                loopDone5 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://data.service.logging.carbon.wso2.org/xsd","loggerData").equals(reader.getName())){
                                                                    
                                                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                                          list5.add(null);
                                                                          reader.next();
                                                                      } else {
                                                                    list5.add(org.wso2.carbon.logging.service.data.xsd.LoggerData.Factory.parse(reader));
                                                                        }
                                                                }else{
                                                                    loopDone5 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setLoggerData((org.wso2.carbon.logging.service.data.xsd.LoggerData[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                org.wso2.carbon.logging.service.data.xsd.LoggerData.class,
                                                                list5));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://data.service.logging.carbon.wso2.org/xsd","selectedAppenderData").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setSelectedAppenderData(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setSelectedAppenderData(org.wso2.carbon.logging.service.data.xsd.AppenderData.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://data.service.logging.carbon.wso2.org/xsd","selectedLoggerData").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setSelectedLoggerData(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setSelectedLoggerData(org.wso2.carbon.logging.service.data.xsd.LoggerData.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
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
           
    
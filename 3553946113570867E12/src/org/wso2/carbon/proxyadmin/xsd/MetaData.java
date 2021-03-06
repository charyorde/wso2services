
/**
 * MetaData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v3  Built on : Oct 26, 2011 (07:42:27 PDT)
 */

            
                package org.wso2.carbon.proxyadmin.xsd;
            

            /**
            *  MetaData bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class MetaData
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = MetaData
                Namespace URI = http://proxyadmin.carbon.wso2.org/xsd
                Namespace Prefix = ns42
                */
            

                        /**
                        * field for Endpoints
                        * This was an Array!
                        */

                        
                                    protected java.lang.String[] localEndpoints ;
                                
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
                           * @return java.lang.String[]
                           */
                           public  java.lang.String[] getEndpoints(){
                               return localEndpoints;
                           }

                           
                        


                               
                              /**
                               * validate the array for Endpoints
                               */
                              protected void validateEndpoints(java.lang.String[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param Endpoints
                              */
                              public void setEndpoints(java.lang.String[] param){
                              
                                   validateEndpoints(param);

                               localEndpointsTracker = true;
                                      
                                      this.localEndpoints=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param java.lang.String
                             */
                             public void addEndpoints(java.lang.String param){
                                   if (localEndpoints == null){
                                   localEndpoints = new java.lang.String[]{};
                                   }

                            
                                 //update the setting tracker
                                localEndpointsTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localEndpoints);
                               list.add(param);
                               this.localEndpoints =
                             (java.lang.String[])list.toArray(
                            new java.lang.String[list.size()]);

                             }
                             

                        /**
                        * field for EndpointsAvailable
                        */

                        
                                    protected boolean localEndpointsAvailable ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localEndpointsAvailableTracker = false ;

                           public boolean isEndpointsAvailableSpecified(){
                               return localEndpointsAvailableTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getEndpointsAvailable(){
                               return localEndpointsAvailable;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param EndpointsAvailable
                               */
                               public void setEndpointsAvailable(boolean param){
                            
                                       // setting primitive attribute tracker to true
                                       localEndpointsAvailableTracker =
                                       true;
                                   
                                            this.localEndpointsAvailable=param;
                                    

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
                        * field for SequencesAvailable
                        */

                        
                                    protected boolean localSequencesAvailable ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSequencesAvailableTracker = false ;

                           public boolean isSequencesAvailableSpecified(){
                               return localSequencesAvailableTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getSequencesAvailable(){
                               return localSequencesAvailable;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SequencesAvailable
                               */
                               public void setSequencesAvailable(boolean param){
                            
                                       // setting primitive attribute tracker to true
                                       localSequencesAvailableTracker =
                                       true;
                                   
                                            this.localSequencesAvailable=param;
                                    

                               }
                            

                        /**
                        * field for Transports
                        * This was an Array!
                        */

                        
                                    protected java.lang.String[] localTransports ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTransportsTracker = false ;

                           public boolean isTransportsSpecified(){
                               return localTransportsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String[]
                           */
                           public  java.lang.String[] getTransports(){
                               return localTransports;
                           }

                           
                        


                               
                              /**
                               * validate the array for Transports
                               */
                              protected void validateTransports(java.lang.String[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param Transports
                              */
                              public void setTransports(java.lang.String[] param){
                              
                                   validateTransports(param);

                               localTransportsTracker = true;
                                      
                                      this.localTransports=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param java.lang.String
                             */
                             public void addTransports(java.lang.String param){
                                   if (localTransports == null){
                                   localTransports = new java.lang.String[]{};
                                   }

                            
                                 //update the setting tracker
                                localTransportsTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localTransports);
                               list.add(param);
                               this.localTransports =
                             (java.lang.String[])list.toArray(
                            new java.lang.String[list.size()]);

                             }
                             

                        /**
                        * field for TransportsAvailable
                        */

                        
                                    protected boolean localTransportsAvailable ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTransportsAvailableTracker = false ;

                           public boolean isTransportsAvailableSpecified(){
                               return localTransportsAvailableTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getTransportsAvailable(){
                               return localTransportsAvailable;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TransportsAvailable
                               */
                               public void setTransportsAvailable(boolean param){
                            
                                       // setting primitive attribute tracker to true
                                       localTransportsAvailableTracker =
                                       true;
                                   
                                            this.localTransportsAvailable=param;
                                    

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
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://proxyadmin.carbon.wso2.org/xsd");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":MetaData",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "MetaData",
                           xmlWriter);
                   }

               
                   }
                if (localEndpointsTracker){
                             if (localEndpoints!=null) {
                                   namespace = "http://proxyadmin.carbon.wso2.org/xsd";
                                   for (int i = 0;i < localEndpoints.length;i++){
                                        
                                            if (localEndpoints[i] != null){
                                        
                                                writeStartElement(null, namespace, "endpoints", xmlWriter);

                                            
                                                        xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEndpoints[i]));
                                                    
                                                xmlWriter.writeEndElement();
                                              
                                                } else {
                                                   
                                                           // write null attribute
                                                            namespace = "http://proxyadmin.carbon.wso2.org/xsd";
                                                            writeStartElement(null, namespace, "endpoints", xmlWriter);
                                                            writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                            xmlWriter.writeEndElement();
                                                       
                                                }

                                   }
                             } else {
                                 
                                         // write the null attribute
                                        // write null attribute
                                           writeStartElement(null, "http://proxyadmin.carbon.wso2.org/xsd", "endpoints", xmlWriter);

                                           // write the nil attribute
                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                           xmlWriter.writeEndElement();
                                    
                             }

                        } if (localEndpointsAvailableTracker){
                                    namespace = "http://proxyadmin.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "endpointsAvailable", xmlWriter);
                             
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("endpointsAvailable cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEndpointsAvailable));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localSequencesTracker){
                             if (localSequences!=null) {
                                   namespace = "http://proxyadmin.carbon.wso2.org/xsd";
                                   for (int i = 0;i < localSequences.length;i++){
                                        
                                            if (localSequences[i] != null){
                                        
                                                writeStartElement(null, namespace, "sequences", xmlWriter);

                                            
                                                        xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSequences[i]));
                                                    
                                                xmlWriter.writeEndElement();
                                              
                                                } else {
                                                   
                                                           // write null attribute
                                                            namespace = "http://proxyadmin.carbon.wso2.org/xsd";
                                                            writeStartElement(null, namespace, "sequences", xmlWriter);
                                                            writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                            xmlWriter.writeEndElement();
                                                       
                                                }

                                   }
                             } else {
                                 
                                         // write the null attribute
                                        // write null attribute
                                           writeStartElement(null, "http://proxyadmin.carbon.wso2.org/xsd", "sequences", xmlWriter);

                                           // write the nil attribute
                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                           xmlWriter.writeEndElement();
                                    
                             }

                        } if (localSequencesAvailableTracker){
                                    namespace = "http://proxyadmin.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "sequencesAvailable", xmlWriter);
                             
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("sequencesAvailable cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSequencesAvailable));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localTransportsTracker){
                             if (localTransports!=null) {
                                   namespace = "http://proxyadmin.carbon.wso2.org/xsd";
                                   for (int i = 0;i < localTransports.length;i++){
                                        
                                            if (localTransports[i] != null){
                                        
                                                writeStartElement(null, namespace, "transports", xmlWriter);

                                            
                                                        xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTransports[i]));
                                                    
                                                xmlWriter.writeEndElement();
                                              
                                                } else {
                                                   
                                                           // write null attribute
                                                            namespace = "http://proxyadmin.carbon.wso2.org/xsd";
                                                            writeStartElement(null, namespace, "transports", xmlWriter);
                                                            writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                            xmlWriter.writeEndElement();
                                                       
                                                }

                                   }
                             } else {
                                 
                                         // write the null attribute
                                        // write null attribute
                                           writeStartElement(null, "http://proxyadmin.carbon.wso2.org/xsd", "transports", xmlWriter);

                                           // write the nil attribute
                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                           xmlWriter.writeEndElement();
                                    
                             }

                        } if (localTransportsAvailableTracker){
                                    namespace = "http://proxyadmin.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "transportsAvailable", xmlWriter);
                             
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("transportsAvailable cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTransportsAvailable));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             }
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://proxyadmin.carbon.wso2.org/xsd")){
                return "ns42";
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

                 if (localEndpointsTracker){
                            if (localEndpoints!=null){
                                  for (int i = 0;i < localEndpoints.length;i++){
                                      
                                         if (localEndpoints[i] != null){
                                          elementList.add(new javax.xml.namespace.QName("http://proxyadmin.carbon.wso2.org/xsd",
                                                                              "endpoints"));
                                          elementList.add(
                                          org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEndpoints[i]));
                                          } else {
                                             
                                                    elementList.add(new javax.xml.namespace.QName("http://proxyadmin.carbon.wso2.org/xsd",
                                                                              "endpoints"));
                                                    elementList.add(null);
                                                
                                          }
                                      

                                  }
                            } else {
                              
                                    elementList.add(new javax.xml.namespace.QName("http://proxyadmin.carbon.wso2.org/xsd",
                                                                              "endpoints"));
                                    elementList.add(null);
                                
                            }

                        } if (localEndpointsAvailableTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://proxyadmin.carbon.wso2.org/xsd",
                                                                      "endpointsAvailable"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEndpointsAvailable));
                            } if (localSequencesTracker){
                            if (localSequences!=null){
                                  for (int i = 0;i < localSequences.length;i++){
                                      
                                         if (localSequences[i] != null){
                                          elementList.add(new javax.xml.namespace.QName("http://proxyadmin.carbon.wso2.org/xsd",
                                                                              "sequences"));
                                          elementList.add(
                                          org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSequences[i]));
                                          } else {
                                             
                                                    elementList.add(new javax.xml.namespace.QName("http://proxyadmin.carbon.wso2.org/xsd",
                                                                              "sequences"));
                                                    elementList.add(null);
                                                
                                          }
                                      

                                  }
                            } else {
                              
                                    elementList.add(new javax.xml.namespace.QName("http://proxyadmin.carbon.wso2.org/xsd",
                                                                              "sequences"));
                                    elementList.add(null);
                                
                            }

                        } if (localSequencesAvailableTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://proxyadmin.carbon.wso2.org/xsd",
                                                                      "sequencesAvailable"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSequencesAvailable));
                            } if (localTransportsTracker){
                            if (localTransports!=null){
                                  for (int i = 0;i < localTransports.length;i++){
                                      
                                         if (localTransports[i] != null){
                                          elementList.add(new javax.xml.namespace.QName("http://proxyadmin.carbon.wso2.org/xsd",
                                                                              "transports"));
                                          elementList.add(
                                          org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTransports[i]));
                                          } else {
                                             
                                                    elementList.add(new javax.xml.namespace.QName("http://proxyadmin.carbon.wso2.org/xsd",
                                                                              "transports"));
                                                    elementList.add(null);
                                                
                                          }
                                      

                                  }
                            } else {
                              
                                    elementList.add(new javax.xml.namespace.QName("http://proxyadmin.carbon.wso2.org/xsd",
                                                                              "transports"));
                                    elementList.add(null);
                                
                            }

                        } if (localTransportsAvailableTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://proxyadmin.carbon.wso2.org/xsd",
                                                                      "transportsAvailable"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTransportsAvailable));
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
        public static MetaData parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            MetaData object =
                new MetaData();

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
                    
                            if (!"MetaData".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (MetaData)org.wso2.carbon.proxyadmin.xsd.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                        java.util.ArrayList list1 = new java.util.ArrayList();
                    
                        java.util.ArrayList list3 = new java.util.ArrayList();
                    
                        java.util.ArrayList list5 = new java.util.ArrayList();
                    
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://proxyadmin.carbon.wso2.org/xsd","endpoints").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                              nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                              if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                  list1.add(null);
                                                       
                                                  reader.next();
                                              } else {
                                            list1.add(reader.getElementText());
                                            }
                                            //loop until we find a start element that is not part of this array
                                            boolean loopDone1 = false;
                                            while(!loopDone1){
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
                                                    loopDone1 = true;
                                                } else {
                                                    if (new javax.xml.namespace.QName("http://proxyadmin.carbon.wso2.org/xsd","endpoints").equals(reader.getName())){
                                                         
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list1.add(null);
                                                                   
                                                              reader.next();
                                                          } else {
                                                        list1.add(reader.getElementText());
                                                        }
                                                    }else{
                                                        loopDone1 = true;
                                                    }
                                                }
                                            }
                                            // call the converter utility  to convert and set the array
                                            
                                                    object.setEndpoints((java.lang.String[])
                                                        list1.toArray(new java.lang.String[list1.size()]));
                                                
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://proxyadmin.carbon.wso2.org/xsd","endpointsAvailable").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"endpointsAvailable" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setEndpointsAvailable(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://proxyadmin.carbon.wso2.org/xsd","sequences").equals(reader.getName())){
                                
                                    
                                    
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
                                                    if (new javax.xml.namespace.QName("http://proxyadmin.carbon.wso2.org/xsd","sequences").equals(reader.getName())){
                                                         
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
                                            
                                                    object.setSequences((java.lang.String[])
                                                        list3.toArray(new java.lang.String[list3.size()]));
                                                
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://proxyadmin.carbon.wso2.org/xsd","sequencesAvailable").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"sequencesAvailable" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSequencesAvailable(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://proxyadmin.carbon.wso2.org/xsd","transports").equals(reader.getName())){
                                
                                    
                                    
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
                                                    if (new javax.xml.namespace.QName("http://proxyadmin.carbon.wso2.org/xsd","transports").equals(reader.getName())){
                                                         
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
                                            
                                                    object.setTransports((java.lang.String[])
                                                        list5.toArray(new java.lang.String[list5.size()]));
                                                
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://proxyadmin.carbon.wso2.org/xsd","transportsAvailable").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"transportsAvailable" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTransportsAvailable(
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
           
    
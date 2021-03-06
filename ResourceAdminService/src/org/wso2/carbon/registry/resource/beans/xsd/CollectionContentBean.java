
/**
 * CollectionContentBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v3  Built on : Oct 26, 2011 (07:42:27 PDT)
 */

            
                package org.wso2.carbon.registry.resource.beans.xsd;
            

            /**
            *  CollectionContentBean bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class CollectionContentBean
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = CollectionContentBean
                Namespace URI = http://beans.resource.registry.carbon.wso2.org/xsd
                Namespace Prefix = ns22
                */
            

                        /**
                        * field for ChildCount
                        */

                        
                                    protected int localChildCount ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localChildCountTracker = false ;

                           public boolean isChildCountSpecified(){
                               return localChildCountTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getChildCount(){
                               return localChildCount;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ChildCount
                               */
                               public void setChildCount(int param){
                            
                                       // setting primitive attribute tracker to true
                                       localChildCountTracker =
                                       param != java.lang.Integer.MIN_VALUE;
                                   
                                            this.localChildCount=param;
                                    

                               }
                            

                        /**
                        * field for ChildPaths
                        * This was an Array!
                        */

                        
                                    protected java.lang.String[] localChildPaths ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localChildPathsTracker = false ;

                           public boolean isChildPathsSpecified(){
                               return localChildPathsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String[]
                           */
                           public  java.lang.String[] getChildPaths(){
                               return localChildPaths;
                           }

                           
                        


                               
                              /**
                               * validate the array for ChildPaths
                               */
                              protected void validateChildPaths(java.lang.String[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param ChildPaths
                              */
                              public void setChildPaths(java.lang.String[] param){
                              
                                   validateChildPaths(param);

                               localChildPathsTracker = true;
                                      
                                      this.localChildPaths=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param java.lang.String
                             */
                             public void addChildPaths(java.lang.String param){
                                   if (localChildPaths == null){
                                   localChildPaths = new java.lang.String[]{};
                                   }

                            
                                 //update the setting tracker
                                localChildPathsTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localChildPaths);
                               list.add(param);
                               this.localChildPaths =
                             (java.lang.String[])list.toArray(
                            new java.lang.String[list.size()]);

                             }
                             

                        /**
                        * field for CollectionTypes
                        * This was an Array!
                        */

                        
                                    protected java.lang.String[] localCollectionTypes ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCollectionTypesTracker = false ;

                           public boolean isCollectionTypesSpecified(){
                               return localCollectionTypesTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String[]
                           */
                           public  java.lang.String[] getCollectionTypes(){
                               return localCollectionTypes;
                           }

                           
                        


                               
                              /**
                               * validate the array for CollectionTypes
                               */
                              protected void validateCollectionTypes(java.lang.String[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param CollectionTypes
                              */
                              public void setCollectionTypes(java.lang.String[] param){
                              
                                   validateCollectionTypes(param);

                               localCollectionTypesTracker = true;
                                      
                                      this.localCollectionTypes=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param java.lang.String
                             */
                             public void addCollectionTypes(java.lang.String param){
                                   if (localCollectionTypes == null){
                                   localCollectionTypes = new java.lang.String[]{};
                                   }

                            
                                 //update the setting tracker
                                localCollectionTypesTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localCollectionTypes);
                               list.add(param);
                               this.localCollectionTypes =
                             (java.lang.String[])list.toArray(
                            new java.lang.String[list.size()]);

                             }
                             

                        /**
                        * field for PathWithVersion
                        */

                        
                                    protected java.lang.String localPathWithVersion ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPathWithVersionTracker = false ;

                           public boolean isPathWithVersionSpecified(){
                               return localPathWithVersionTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getPathWithVersion(){
                               return localPathWithVersion;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PathWithVersion
                               */
                               public void setPathWithVersion(java.lang.String param){
                            localPathWithVersionTracker = true;
                                   
                                            this.localPathWithVersion=param;
                                    

                               }
                            

                        /**
                        * field for RemoteInstances
                        * This was an Array!
                        */

                        
                                    protected java.lang.String[] localRemoteInstances ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRemoteInstancesTracker = false ;

                           public boolean isRemoteInstancesSpecified(){
                               return localRemoteInstancesTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String[]
                           */
                           public  java.lang.String[] getRemoteInstances(){
                               return localRemoteInstances;
                           }

                           
                        


                               
                              /**
                               * validate the array for RemoteInstances
                               */
                              protected void validateRemoteInstances(java.lang.String[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param RemoteInstances
                              */
                              public void setRemoteInstances(java.lang.String[] param){
                              
                                   validateRemoteInstances(param);

                               localRemoteInstancesTracker = true;
                                      
                                      this.localRemoteInstances=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param java.lang.String
                             */
                             public void addRemoteInstances(java.lang.String param){
                                   if (localRemoteInstances == null){
                                   localRemoteInstances = new java.lang.String[]{};
                                   }

                            
                                 //update the setting tracker
                                localRemoteInstancesTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localRemoteInstances);
                               list.add(param);
                               this.localRemoteInstances =
                             (java.lang.String[])list.toArray(
                            new java.lang.String[list.size()]);

                             }
                             

                        /**
                        * field for VersionView
                        */

                        
                                    protected boolean localVersionView ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localVersionViewTracker = false ;

                           public boolean isVersionViewSpecified(){
                               return localVersionViewTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getVersionView(){
                               return localVersionView;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param VersionView
                               */
                               public void setVersionView(boolean param){
                            
                                       // setting primitive attribute tracker to true
                                       localVersionViewTracker =
                                       true;
                                   
                                            this.localVersionView=param;
                                    

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
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://beans.resource.registry.carbon.wso2.org/xsd");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":CollectionContentBean",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "CollectionContentBean",
                           xmlWriter);
                   }

               
                   }
                if (localChildCountTracker){
                                    namespace = "http://beans.resource.registry.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "childCount", xmlWriter);
                             
                                               if (localChildCount==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("childCount cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localChildCount));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localChildPathsTracker){
                             if (localChildPaths!=null) {
                                   namespace = "http://beans.resource.registry.carbon.wso2.org/xsd";
                                   for (int i = 0;i < localChildPaths.length;i++){
                                        
                                            if (localChildPaths[i] != null){
                                        
                                                writeStartElement(null, namespace, "childPaths", xmlWriter);

                                            
                                                        xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localChildPaths[i]));
                                                    
                                                xmlWriter.writeEndElement();
                                              
                                                } else {
                                                   
                                                           // write null attribute
                                                            namespace = "http://beans.resource.registry.carbon.wso2.org/xsd";
                                                            writeStartElement(null, namespace, "childPaths", xmlWriter);
                                                            writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                            xmlWriter.writeEndElement();
                                                       
                                                }

                                   }
                             } else {
                                 
                                         // write the null attribute
                                        // write null attribute
                                           writeStartElement(null, "http://beans.resource.registry.carbon.wso2.org/xsd", "childPaths", xmlWriter);

                                           // write the nil attribute
                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                           xmlWriter.writeEndElement();
                                    
                             }

                        } if (localCollectionTypesTracker){
                             if (localCollectionTypes!=null) {
                                   namespace = "http://beans.resource.registry.carbon.wso2.org/xsd";
                                   for (int i = 0;i < localCollectionTypes.length;i++){
                                        
                                            if (localCollectionTypes[i] != null){
                                        
                                                writeStartElement(null, namespace, "collectionTypes", xmlWriter);

                                            
                                                        xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCollectionTypes[i]));
                                                    
                                                xmlWriter.writeEndElement();
                                              
                                                } else {
                                                   
                                                           // write null attribute
                                                            namespace = "http://beans.resource.registry.carbon.wso2.org/xsd";
                                                            writeStartElement(null, namespace, "collectionTypes", xmlWriter);
                                                            writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                            xmlWriter.writeEndElement();
                                                       
                                                }

                                   }
                             } else {
                                 
                                         // write the null attribute
                                        // write null attribute
                                           writeStartElement(null, "http://beans.resource.registry.carbon.wso2.org/xsd", "collectionTypes", xmlWriter);

                                           // write the nil attribute
                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                           xmlWriter.writeEndElement();
                                    
                             }

                        } if (localPathWithVersionTracker){
                                    namespace = "http://beans.resource.registry.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "pathWithVersion", xmlWriter);
                             

                                          if (localPathWithVersion==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localPathWithVersion);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localRemoteInstancesTracker){
                             if (localRemoteInstances!=null) {
                                   namespace = "http://beans.resource.registry.carbon.wso2.org/xsd";
                                   for (int i = 0;i < localRemoteInstances.length;i++){
                                        
                                            if (localRemoteInstances[i] != null){
                                        
                                                writeStartElement(null, namespace, "remoteInstances", xmlWriter);

                                            
                                                        xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRemoteInstances[i]));
                                                    
                                                xmlWriter.writeEndElement();
                                              
                                                } else {
                                                   
                                                           // write null attribute
                                                            namespace = "http://beans.resource.registry.carbon.wso2.org/xsd";
                                                            writeStartElement(null, namespace, "remoteInstances", xmlWriter);
                                                            writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                            xmlWriter.writeEndElement();
                                                       
                                                }

                                   }
                             } else {
                                 
                                         // write the null attribute
                                        // write null attribute
                                           writeStartElement(null, "http://beans.resource.registry.carbon.wso2.org/xsd", "remoteInstances", xmlWriter);

                                           // write the nil attribute
                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                           xmlWriter.writeEndElement();
                                    
                             }

                        } if (localVersionViewTracker){
                                    namespace = "http://beans.resource.registry.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "versionView", xmlWriter);
                             
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("versionView cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localVersionView));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             }
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://beans.resource.registry.carbon.wso2.org/xsd")){
                return "ns22";
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

                 if (localChildCountTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://beans.resource.registry.carbon.wso2.org/xsd",
                                                                      "childCount"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localChildCount));
                            } if (localChildPathsTracker){
                            if (localChildPaths!=null){
                                  for (int i = 0;i < localChildPaths.length;i++){
                                      
                                         if (localChildPaths[i] != null){
                                          elementList.add(new javax.xml.namespace.QName("http://beans.resource.registry.carbon.wso2.org/xsd",
                                                                              "childPaths"));
                                          elementList.add(
                                          org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localChildPaths[i]));
                                          } else {
                                             
                                                    elementList.add(new javax.xml.namespace.QName("http://beans.resource.registry.carbon.wso2.org/xsd",
                                                                              "childPaths"));
                                                    elementList.add(null);
                                                
                                          }
                                      

                                  }
                            } else {
                              
                                    elementList.add(new javax.xml.namespace.QName("http://beans.resource.registry.carbon.wso2.org/xsd",
                                                                              "childPaths"));
                                    elementList.add(null);
                                
                            }

                        } if (localCollectionTypesTracker){
                            if (localCollectionTypes!=null){
                                  for (int i = 0;i < localCollectionTypes.length;i++){
                                      
                                         if (localCollectionTypes[i] != null){
                                          elementList.add(new javax.xml.namespace.QName("http://beans.resource.registry.carbon.wso2.org/xsd",
                                                                              "collectionTypes"));
                                          elementList.add(
                                          org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCollectionTypes[i]));
                                          } else {
                                             
                                                    elementList.add(new javax.xml.namespace.QName("http://beans.resource.registry.carbon.wso2.org/xsd",
                                                                              "collectionTypes"));
                                                    elementList.add(null);
                                                
                                          }
                                      

                                  }
                            } else {
                              
                                    elementList.add(new javax.xml.namespace.QName("http://beans.resource.registry.carbon.wso2.org/xsd",
                                                                              "collectionTypes"));
                                    elementList.add(null);
                                
                            }

                        } if (localPathWithVersionTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://beans.resource.registry.carbon.wso2.org/xsd",
                                                                      "pathWithVersion"));
                                 
                                         elementList.add(localPathWithVersion==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPathWithVersion));
                                    } if (localRemoteInstancesTracker){
                            if (localRemoteInstances!=null){
                                  for (int i = 0;i < localRemoteInstances.length;i++){
                                      
                                         if (localRemoteInstances[i] != null){
                                          elementList.add(new javax.xml.namespace.QName("http://beans.resource.registry.carbon.wso2.org/xsd",
                                                                              "remoteInstances"));
                                          elementList.add(
                                          org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRemoteInstances[i]));
                                          } else {
                                             
                                                    elementList.add(new javax.xml.namespace.QName("http://beans.resource.registry.carbon.wso2.org/xsd",
                                                                              "remoteInstances"));
                                                    elementList.add(null);
                                                
                                          }
                                      

                                  }
                            } else {
                              
                                    elementList.add(new javax.xml.namespace.QName("http://beans.resource.registry.carbon.wso2.org/xsd",
                                                                              "remoteInstances"));
                                    elementList.add(null);
                                
                            }

                        } if (localVersionViewTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://beans.resource.registry.carbon.wso2.org/xsd",
                                                                      "versionView"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localVersionView));
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
        public static CollectionContentBean parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            CollectionContentBean object =
                new CollectionContentBean();

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
                    
                            if (!"CollectionContentBean".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (CollectionContentBean)org.wso2.carbon.registry.resource.beans.xsd.ExtensionMapper.getTypeObject(
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
                    
                        java.util.ArrayList list5 = new java.util.ArrayList();
                    
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://beans.resource.registry.carbon.wso2.org/xsd","childCount").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"childCount" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setChildCount(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setChildCount(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://beans.resource.registry.carbon.wso2.org/xsd","childPaths").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                              nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                              if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                  list2.add(null);
                                                       
                                                  reader.next();
                                              } else {
                                            list2.add(reader.getElementText());
                                            }
                                            //loop until we find a start element that is not part of this array
                                            boolean loopDone2 = false;
                                            while(!loopDone2){
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
                                                    loopDone2 = true;
                                                } else {
                                                    if (new javax.xml.namespace.QName("http://beans.resource.registry.carbon.wso2.org/xsd","childPaths").equals(reader.getName())){
                                                         
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list2.add(null);
                                                                   
                                                              reader.next();
                                                          } else {
                                                        list2.add(reader.getElementText());
                                                        }
                                                    }else{
                                                        loopDone2 = true;
                                                    }
                                                }
                                            }
                                            // call the converter utility  to convert and set the array
                                            
                                                    object.setChildPaths((java.lang.String[])
                                                        list2.toArray(new java.lang.String[list2.size()]));
                                                
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://beans.resource.registry.carbon.wso2.org/xsd","collectionTypes").equals(reader.getName())){
                                
                                    
                                    
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
                                                    if (new javax.xml.namespace.QName("http://beans.resource.registry.carbon.wso2.org/xsd","collectionTypes").equals(reader.getName())){
                                                         
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
                                            
                                                    object.setCollectionTypes((java.lang.String[])
                                                        list3.toArray(new java.lang.String[list3.size()]));
                                                
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://beans.resource.registry.carbon.wso2.org/xsd","pathWithVersion").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPathWithVersion(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://beans.resource.registry.carbon.wso2.org/xsd","remoteInstances").equals(reader.getName())){
                                
                                    
                                    
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
                                                    if (new javax.xml.namespace.QName("http://beans.resource.registry.carbon.wso2.org/xsd","remoteInstances").equals(reader.getName())){
                                                         
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
                                            
                                                    object.setRemoteInstances((java.lang.String[])
                                                        list5.toArray(new java.lang.String[list5.size()]));
                                                
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://beans.resource.registry.carbon.wso2.org/xsd","versionView").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"versionView" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setVersionView(
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
           
    
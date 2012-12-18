
/**
 * JdbcDirectorySettings.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v3  Built on : Oct 26, 2011 (07:42:27 PDT)
 */

            
                package org.apache.lucene.store.jdbc.xsd;
            

            /**
            *  JdbcDirectorySettings bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class JdbcDirectorySettings
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = JdbcDirectorySettings
                Namespace URI = http://jdbc.store.lucene.apache.org/xsd
                Namespace Prefix = ns87
                */
            

                        /**
                        * field for DefaultFileEntrySettings
                        */

                        
                                    protected org.apache.lucene.store.jdbc.xsd.JdbcFileEntrySettings localDefaultFileEntrySettings ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDefaultFileEntrySettingsTracker = false ;

                           public boolean isDefaultFileEntrySettingsSpecified(){
                               return localDefaultFileEntrySettingsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return org.apache.lucene.store.jdbc.xsd.JdbcFileEntrySettings
                           */
                           public  org.apache.lucene.store.jdbc.xsd.JdbcFileEntrySettings getDefaultFileEntrySettings(){
                               return localDefaultFileEntrySettings;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param DefaultFileEntrySettings
                               */
                               public void setDefaultFileEntrySettings(org.apache.lucene.store.jdbc.xsd.JdbcFileEntrySettings param){
                            localDefaultFileEntrySettingsTracker = true;
                                   
                                            this.localDefaultFileEntrySettings=param;
                                    

                               }
                            

                        /**
                        * field for DeleteMarkDeletedDelta
                        */

                        
                                    protected long localDeleteMarkDeletedDelta ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDeleteMarkDeletedDeltaTracker = false ;

                           public boolean isDeleteMarkDeletedDeltaSpecified(){
                               return localDeleteMarkDeletedDeltaTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return long
                           */
                           public  long getDeleteMarkDeletedDelta(){
                               return localDeleteMarkDeletedDelta;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param DeleteMarkDeletedDelta
                               */
                               public void setDeleteMarkDeletedDelta(long param){
                            
                                       // setting primitive attribute tracker to true
                                       localDeleteMarkDeletedDeltaTracker =
                                       param != java.lang.Long.MIN_VALUE;
                                   
                                            this.localDeleteMarkDeletedDelta=param;
                                    

                               }
                            

                        /**
                        * field for DeletedColumnName
                        */

                        
                                    protected java.lang.String localDeletedColumnName ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDeletedColumnNameTracker = false ;

                           public boolean isDeletedColumnNameSpecified(){
                               return localDeletedColumnNameTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getDeletedColumnName(){
                               return localDeletedColumnName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param DeletedColumnName
                               */
                               public void setDeletedColumnName(java.lang.String param){
                            localDeletedColumnNameTracker = true;
                                   
                                            this.localDeletedColumnName=param;
                                    

                               }
                            

                        /**
                        * field for FileEntrySettings
                        */

                        
                                    protected java.util.xsd.Map localFileEntrySettings ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localFileEntrySettingsTracker = false ;

                           public boolean isFileEntrySettingsSpecified(){
                               return localFileEntrySettingsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.util.xsd.Map
                           */
                           public  java.util.xsd.Map getFileEntrySettings(){
                               return localFileEntrySettings;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param FileEntrySettings
                               */
                               public void setFileEntrySettings(java.util.xsd.Map param){
                            localFileEntrySettingsTracker = true;
                                   
                                            this.localFileEntrySettings=param;
                                    

                               }
                            

                        /**
                        * field for LastModifiedColumnName
                        */

                        
                                    protected java.lang.String localLastModifiedColumnName ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localLastModifiedColumnNameTracker = false ;

                           public boolean isLastModifiedColumnNameSpecified(){
                               return localLastModifiedColumnNameTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getLastModifiedColumnName(){
                               return localLastModifiedColumnName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param LastModifiedColumnName
                               */
                               public void setLastModifiedColumnName(java.lang.String param){
                            localLastModifiedColumnNameTracker = true;
                                   
                                            this.localLastModifiedColumnName=param;
                                    

                               }
                            

                        /**
                        * field for LockClass
                        */

                        
                                    protected java.lang.Object localLockClass ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localLockClassTracker = false ;

                           public boolean isLockClassSpecified(){
                               return localLockClassTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.Object
                           */
                           public  java.lang.Object getLockClass(){
                               return localLockClass;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param LockClass
                               */
                               public void setLockClass(java.lang.Object param){
                            localLockClassTracker = true;
                                   
                                            this.localLockClass=param;
                                    

                               }
                            

                        /**
                        * field for NameColumnLength
                        */

                        
                                    protected int localNameColumnLength ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localNameColumnLengthTracker = false ;

                           public boolean isNameColumnLengthSpecified(){
                               return localNameColumnLengthTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getNameColumnLength(){
                               return localNameColumnLength;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param NameColumnLength
                               */
                               public void setNameColumnLength(int param){
                            
                                       // setting primitive attribute tracker to true
                                       localNameColumnLengthTracker =
                                       param != java.lang.Integer.MIN_VALUE;
                                   
                                            this.localNameColumnLength=param;
                                    

                               }
                            

                        /**
                        * field for NameColumnName
                        */

                        
                                    protected java.lang.String localNameColumnName ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localNameColumnNameTracker = false ;

                           public boolean isNameColumnNameSpecified(){
                               return localNameColumnNameTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getNameColumnName(){
                               return localNameColumnName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param NameColumnName
                               */
                               public void setNameColumnName(java.lang.String param){
                            localNameColumnNameTracker = true;
                                   
                                            this.localNameColumnName=param;
                                    

                               }
                            

                        /**
                        * field for QueryTimeout
                        */

                        
                                    protected int localQueryTimeout ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localQueryTimeoutTracker = false ;

                           public boolean isQueryTimeoutSpecified(){
                               return localQueryTimeoutTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getQueryTimeout(){
                               return localQueryTimeout;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param QueryTimeout
                               */
                               public void setQueryTimeout(int param){
                            
                                       // setting primitive attribute tracker to true
                                       localQueryTimeoutTracker =
                                       param != java.lang.Integer.MIN_VALUE;
                                   
                                            this.localQueryTimeout=param;
                                    

                               }
                            

                        /**
                        * field for SizeColumnName
                        */

                        
                                    protected java.lang.String localSizeColumnName ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSizeColumnNameTracker = false ;

                           public boolean isSizeColumnNameSpecified(){
                               return localSizeColumnNameTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getSizeColumnName(){
                               return localSizeColumnName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SizeColumnName
                               */
                               public void setSizeColumnName(java.lang.String param){
                            localSizeColumnNameTracker = true;
                                   
                                            this.localSizeColumnName=param;
                                    

                               }
                            

                        /**
                        * field for ValueColumnLengthInK
                        */

                        
                                    protected int localValueColumnLengthInK ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localValueColumnLengthInKTracker = false ;

                           public boolean isValueColumnLengthInKSpecified(){
                               return localValueColumnLengthInKTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getValueColumnLengthInK(){
                               return localValueColumnLengthInK;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ValueColumnLengthInK
                               */
                               public void setValueColumnLengthInK(int param){
                            
                                       // setting primitive attribute tracker to true
                                       localValueColumnLengthInKTracker =
                                       param != java.lang.Integer.MIN_VALUE;
                                   
                                            this.localValueColumnLengthInK=param;
                                    

                               }
                            

                        /**
                        * field for ValueColumnName
                        */

                        
                                    protected java.lang.String localValueColumnName ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localValueColumnNameTracker = false ;

                           public boolean isValueColumnNameSpecified(){
                               return localValueColumnNameTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getValueColumnName(){
                               return localValueColumnName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ValueColumnName
                               */
                               public void setValueColumnName(java.lang.String param){
                            localValueColumnNameTracker = true;
                                   
                                            this.localValueColumnName=param;
                                    

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
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://jdbc.store.lucene.apache.org/xsd");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":JdbcDirectorySettings",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "JdbcDirectorySettings",
                           xmlWriter);
                   }

               
                   }
                if (localDefaultFileEntrySettingsTracker){
                                    if (localDefaultFileEntrySettings==null){

                                        writeStartElement(null, "http://jdbc.store.lucene.apache.org/xsd", "defaultFileEntrySettings", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localDefaultFileEntrySettings.serialize(new javax.xml.namespace.QName("http://jdbc.store.lucene.apache.org/xsd","defaultFileEntrySettings"),
                                        xmlWriter);
                                    }
                                } if (localDeleteMarkDeletedDeltaTracker){
                                    namespace = "http://jdbc.store.lucene.apache.org/xsd";
                                    writeStartElement(null, namespace, "deleteMarkDeletedDelta", xmlWriter);
                             
                                               if (localDeleteMarkDeletedDelta==java.lang.Long.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("deleteMarkDeletedDelta cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDeleteMarkDeletedDelta));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localDeletedColumnNameTracker){
                                    namespace = "http://jdbc.store.lucene.apache.org/xsd";
                                    writeStartElement(null, namespace, "deletedColumnName", xmlWriter);
                             

                                          if (localDeletedColumnName==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localDeletedColumnName);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localFileEntrySettingsTracker){
                                    if (localFileEntrySettings==null){

                                        writeStartElement(null, "http://jdbc.store.lucene.apache.org/xsd", "fileEntrySettings", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localFileEntrySettings.serialize(new javax.xml.namespace.QName("http://jdbc.store.lucene.apache.org/xsd","fileEntrySettings"),
                                        xmlWriter);
                                    }
                                } if (localLastModifiedColumnNameTracker){
                                    namespace = "http://jdbc.store.lucene.apache.org/xsd";
                                    writeStartElement(null, namespace, "lastModifiedColumnName", xmlWriter);
                             

                                          if (localLastModifiedColumnName==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localLastModifiedColumnName);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localLockClassTracker){
                            
                            if (localLockClass!=null){
                                if (localLockClass instanceof org.apache.axis2.databinding.ADBBean){
                                    ((org.apache.axis2.databinding.ADBBean)localLockClass).serialize(
                                               new javax.xml.namespace.QName("http://jdbc.store.lucene.apache.org/xsd","lockClass"),
                                               xmlWriter,true);
                                 } else {
                                    writeStartElement(null, "http://jdbc.store.lucene.apache.org/xsd", "lockClass", xmlWriter);
                                    org.apache.axis2.databinding.utils.ConverterUtil.serializeAnyType(localLockClass, xmlWriter);
                                    xmlWriter.writeEndElement();
                                 }
                            } else {
                                
                                        // write null attribute
                                           writeStartElement(null, "http://jdbc.store.lucene.apache.org/xsd", "lockClass", xmlWriter);

                                           // write the nil attribute
                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                           xmlWriter.writeEndElement();
                                    
                            }


                        } if (localNameColumnLengthTracker){
                                    namespace = "http://jdbc.store.lucene.apache.org/xsd";
                                    writeStartElement(null, namespace, "nameColumnLength", xmlWriter);
                             
                                               if (localNameColumnLength==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("nameColumnLength cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNameColumnLength));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localNameColumnNameTracker){
                                    namespace = "http://jdbc.store.lucene.apache.org/xsd";
                                    writeStartElement(null, namespace, "nameColumnName", xmlWriter);
                             

                                          if (localNameColumnName==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localNameColumnName);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localQueryTimeoutTracker){
                                    namespace = "http://jdbc.store.lucene.apache.org/xsd";
                                    writeStartElement(null, namespace, "queryTimeout", xmlWriter);
                             
                                               if (localQueryTimeout==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("queryTimeout cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localQueryTimeout));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localSizeColumnNameTracker){
                                    namespace = "http://jdbc.store.lucene.apache.org/xsd";
                                    writeStartElement(null, namespace, "sizeColumnName", xmlWriter);
                             

                                          if (localSizeColumnName==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localSizeColumnName);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localValueColumnLengthInKTracker){
                                    namespace = "http://jdbc.store.lucene.apache.org/xsd";
                                    writeStartElement(null, namespace, "valueColumnLengthInK", xmlWriter);
                             
                                               if (localValueColumnLengthInK==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("valueColumnLengthInK cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localValueColumnLengthInK));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localValueColumnNameTracker){
                                    namespace = "http://jdbc.store.lucene.apache.org/xsd";
                                    writeStartElement(null, namespace, "valueColumnName", xmlWriter);
                             

                                          if (localValueColumnName==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localValueColumnName);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             }
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://jdbc.store.lucene.apache.org/xsd")){
                return "ns87";
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

                 if (localDefaultFileEntrySettingsTracker){
                            elementList.add(new javax.xml.namespace.QName("http://jdbc.store.lucene.apache.org/xsd",
                                                                      "defaultFileEntrySettings"));
                            
                            
                                    elementList.add(localDefaultFileEntrySettings==null?null:
                                    localDefaultFileEntrySettings);
                                } if (localDeleteMarkDeletedDeltaTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://jdbc.store.lucene.apache.org/xsd",
                                                                      "deleteMarkDeletedDelta"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDeleteMarkDeletedDelta));
                            } if (localDeletedColumnNameTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://jdbc.store.lucene.apache.org/xsd",
                                                                      "deletedColumnName"));
                                 
                                         elementList.add(localDeletedColumnName==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDeletedColumnName));
                                    } if (localFileEntrySettingsTracker){
                            elementList.add(new javax.xml.namespace.QName("http://jdbc.store.lucene.apache.org/xsd",
                                                                      "fileEntrySettings"));
                            
                            
                                    elementList.add(localFileEntrySettings==null?null:
                                    localFileEntrySettings);
                                } if (localLastModifiedColumnNameTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://jdbc.store.lucene.apache.org/xsd",
                                                                      "lastModifiedColumnName"));
                                 
                                         elementList.add(localLastModifiedColumnName==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLastModifiedColumnName));
                                    } if (localLockClassTracker){
                            elementList.add(new javax.xml.namespace.QName("http://jdbc.store.lucene.apache.org/xsd",
                                                                      "lockClass"));
                            
                            
                                    elementList.add(localLockClass==null?null:
                                    localLockClass);
                                } if (localNameColumnLengthTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://jdbc.store.lucene.apache.org/xsd",
                                                                      "nameColumnLength"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNameColumnLength));
                            } if (localNameColumnNameTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://jdbc.store.lucene.apache.org/xsd",
                                                                      "nameColumnName"));
                                 
                                         elementList.add(localNameColumnName==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNameColumnName));
                                    } if (localQueryTimeoutTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://jdbc.store.lucene.apache.org/xsd",
                                                                      "queryTimeout"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localQueryTimeout));
                            } if (localSizeColumnNameTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://jdbc.store.lucene.apache.org/xsd",
                                                                      "sizeColumnName"));
                                 
                                         elementList.add(localSizeColumnName==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSizeColumnName));
                                    } if (localValueColumnLengthInKTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://jdbc.store.lucene.apache.org/xsd",
                                                                      "valueColumnLengthInK"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localValueColumnLengthInK));
                            } if (localValueColumnNameTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://jdbc.store.lucene.apache.org/xsd",
                                                                      "valueColumnName"));
                                 
                                         elementList.add(localValueColumnName==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localValueColumnName));
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
        public static JdbcDirectorySettings parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            JdbcDirectorySettings object =
                new JdbcDirectorySettings();

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
                    
                            if (!"JdbcDirectorySettings".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (JdbcDirectorySettings)org.wso2.carbon.registry.core.jdbc.xsd.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://jdbc.store.lucene.apache.org/xsd","defaultFileEntrySettings").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setDefaultFileEntrySettings(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setDefaultFileEntrySettings(org.apache.lucene.store.jdbc.xsd.JdbcFileEntrySettings.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://jdbc.store.lucene.apache.org/xsd","deleteMarkDeletedDelta").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"deleteMarkDeletedDelta" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setDeleteMarkDeletedDelta(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setDeleteMarkDeletedDelta(java.lang.Long.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://jdbc.store.lucene.apache.org/xsd","deletedColumnName").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setDeletedColumnName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://jdbc.store.lucene.apache.org/xsd","fileEntrySettings").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setFileEntrySettings(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setFileEntrySettings(java.util.xsd.Map.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://jdbc.store.lucene.apache.org/xsd","lastModifiedColumnName").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setLastModifiedColumnName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://jdbc.store.lucene.apache.org/xsd","lockClass").equals(reader.getName())){
                                
                                     object.setLockClass(org.apache.axis2.databinding.utils.ConverterUtil.getAnyTypeObject(reader,
                                                org.wso2.carbon.registry.core.jdbc.xsd.ExtensionMapper.class));
                                       
                                         reader.next();
                                     
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://jdbc.store.lucene.apache.org/xsd","nameColumnLength").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"nameColumnLength" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setNameColumnLength(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setNameColumnLength(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://jdbc.store.lucene.apache.org/xsd","nameColumnName").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setNameColumnName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://jdbc.store.lucene.apache.org/xsd","queryTimeout").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"queryTimeout" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setQueryTimeout(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setQueryTimeout(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://jdbc.store.lucene.apache.org/xsd","sizeColumnName").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSizeColumnName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://jdbc.store.lucene.apache.org/xsd","valueColumnLengthInK").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"valueColumnLengthInK" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setValueColumnLengthInK(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setValueColumnLengthInK(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://jdbc.store.lucene.apache.org/xsd","valueColumnName").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setValueColumnName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
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
           
    
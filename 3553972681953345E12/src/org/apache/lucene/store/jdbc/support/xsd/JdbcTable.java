
/**
 * JdbcTable.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v3  Built on : Oct 26, 2011 (07:42:27 PDT)
 */

            
                package org.apache.lucene.store.jdbc.support.xsd;
            

            /**
            *  JdbcTable bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class JdbcTable
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = JdbcTable
                Namespace URI = http://support.jdbc.store.lucene.apache.org/xsd
                Namespace Prefix = ns86
                */
            

                        /**
                        * field for Catalog
                        */

                        
                                    protected java.lang.String localCatalog ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCatalogTracker = false ;

                           public boolean isCatalogSpecified(){
                               return localCatalogTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getCatalog(){
                               return localCatalog;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Catalog
                               */
                               public void setCatalog(java.lang.String param){
                            localCatalogTracker = true;
                                   
                                            this.localCatalog=param;
                                    

                               }
                            

                        /**
                        * field for DeletedColumn
                        */

                        
                                    protected org.apache.lucene.store.jdbc.support.xsd.JdbcColumn localDeletedColumn ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDeletedColumnTracker = false ;

                           public boolean isDeletedColumnSpecified(){
                               return localDeletedColumnTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return org.apache.lucene.store.jdbc.support.xsd.JdbcColumn
                           */
                           public  org.apache.lucene.store.jdbc.support.xsd.JdbcColumn getDeletedColumn(){
                               return localDeletedColumn;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param DeletedColumn
                               */
                               public void setDeletedColumn(org.apache.lucene.store.jdbc.support.xsd.JdbcColumn param){
                            localDeletedColumnTracker = true;
                                   
                                            this.localDeletedColumn=param;
                                    

                               }
                            

                        /**
                        * field for Dialect
                        */

                        
                                    protected org.apache.lucene.store.jdbc.dialect.xsd.Dialect localDialect ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDialectTracker = false ;

                           public boolean isDialectSpecified(){
                               return localDialectTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return org.apache.lucene.store.jdbc.dialect.xsd.Dialect
                           */
                           public  org.apache.lucene.store.jdbc.dialect.xsd.Dialect getDialect(){
                               return localDialect;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Dialect
                               */
                               public void setDialect(org.apache.lucene.store.jdbc.dialect.xsd.Dialect param){
                            localDialectTracker = true;
                                   
                                            this.localDialect=param;
                                    

                               }
                            

                        /**
                        * field for LastModifiedColumn
                        */

                        
                                    protected org.apache.lucene.store.jdbc.support.xsd.JdbcColumn localLastModifiedColumn ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localLastModifiedColumnTracker = false ;

                           public boolean isLastModifiedColumnSpecified(){
                               return localLastModifiedColumnTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return org.apache.lucene.store.jdbc.support.xsd.JdbcColumn
                           */
                           public  org.apache.lucene.store.jdbc.support.xsd.JdbcColumn getLastModifiedColumn(){
                               return localLastModifiedColumn;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param LastModifiedColumn
                               */
                               public void setLastModifiedColumn(org.apache.lucene.store.jdbc.support.xsd.JdbcColumn param){
                            localLastModifiedColumnTracker = true;
                                   
                                            this.localLastModifiedColumn=param;
                                    

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
                        * field for NameColumn
                        */

                        
                                    protected org.apache.lucene.store.jdbc.support.xsd.JdbcColumn localNameColumn ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localNameColumnTracker = false ;

                           public boolean isNameColumnSpecified(){
                               return localNameColumnTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return org.apache.lucene.store.jdbc.support.xsd.JdbcColumn
                           */
                           public  org.apache.lucene.store.jdbc.support.xsd.JdbcColumn getNameColumn(){
                               return localNameColumn;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param NameColumn
                               */
                               public void setNameColumn(org.apache.lucene.store.jdbc.support.xsd.JdbcColumn param){
                            localNameColumnTracker = true;
                                   
                                            this.localNameColumn=param;
                                    

                               }
                            

                        /**
                        * field for QualifiedName
                        */

                        
                                    protected java.lang.String localQualifiedName ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localQualifiedNameTracker = false ;

                           public boolean isQualifiedNameSpecified(){
                               return localQualifiedNameTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getQualifiedName(){
                               return localQualifiedName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param QualifiedName
                               */
                               public void setQualifiedName(java.lang.String param){
                            localQualifiedNameTracker = true;
                                   
                                            this.localQualifiedName=param;
                                    

                               }
                            

                        /**
                        * field for QuotedName
                        */

                        
                                    protected java.lang.String localQuotedName ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localQuotedNameTracker = false ;

                           public boolean isQuotedNameSpecified(){
                               return localQuotedNameTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getQuotedName(){
                               return localQuotedName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param QuotedName
                               */
                               public void setQuotedName(java.lang.String param){
                            localQuotedNameTracker = true;
                                   
                                            this.localQuotedName=param;
                                    

                               }
                            

                        /**
                        * field for QuotedSchema
                        */

                        
                                    protected java.lang.String localQuotedSchema ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localQuotedSchemaTracker = false ;

                           public boolean isQuotedSchemaSpecified(){
                               return localQuotedSchemaTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getQuotedSchema(){
                               return localQuotedSchema;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param QuotedSchema
                               */
                               public void setQuotedSchema(java.lang.String param){
                            localQuotedSchemaTracker = true;
                                   
                                            this.localQuotedSchema=param;
                                    

                               }
                            

                        /**
                        * field for Schema
                        */

                        
                                    protected java.lang.String localSchema ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSchemaTracker = false ;

                           public boolean isSchemaSpecified(){
                               return localSchemaTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getSchema(){
                               return localSchema;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Schema
                               */
                               public void setSchema(java.lang.String param){
                            localSchemaTracker = true;
                                   
                                            this.localSchema=param;
                                    

                               }
                            

                        /**
                        * field for Settings
                        */

                        
                                    protected org.apache.lucene.store.jdbc.xsd.JdbcDirectorySettings localSettings ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSettingsTracker = false ;

                           public boolean isSettingsSpecified(){
                               return localSettingsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return org.apache.lucene.store.jdbc.xsd.JdbcDirectorySettings
                           */
                           public  org.apache.lucene.store.jdbc.xsd.JdbcDirectorySettings getSettings(){
                               return localSettings;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Settings
                               */
                               public void setSettings(org.apache.lucene.store.jdbc.xsd.JdbcDirectorySettings param){
                            localSettingsTracker = true;
                                   
                                            this.localSettings=param;
                                    

                               }
                            

                        /**
                        * field for SizeColumn
                        */

                        
                                    protected org.apache.lucene.store.jdbc.support.xsd.JdbcColumn localSizeColumn ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSizeColumnTracker = false ;

                           public boolean isSizeColumnSpecified(){
                               return localSizeColumnTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return org.apache.lucene.store.jdbc.support.xsd.JdbcColumn
                           */
                           public  org.apache.lucene.store.jdbc.support.xsd.JdbcColumn getSizeColumn(){
                               return localSizeColumn;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SizeColumn
                               */
                               public void setSizeColumn(org.apache.lucene.store.jdbc.support.xsd.JdbcColumn param){
                            localSizeColumnTracker = true;
                                   
                                            this.localSizeColumn=param;
                                    

                               }
                            

                        /**
                        * field for ValueColumn
                        */

                        
                                    protected org.apache.lucene.store.jdbc.support.xsd.JdbcColumn localValueColumn ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localValueColumnTracker = false ;

                           public boolean isValueColumnSpecified(){
                               return localValueColumnTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return org.apache.lucene.store.jdbc.support.xsd.JdbcColumn
                           */
                           public  org.apache.lucene.store.jdbc.support.xsd.JdbcColumn getValueColumn(){
                               return localValueColumn;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ValueColumn
                               */
                               public void setValueColumn(org.apache.lucene.store.jdbc.support.xsd.JdbcColumn param){
                            localValueColumnTracker = true;
                                   
                                            this.localValueColumn=param;
                                    

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
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://support.jdbc.store.lucene.apache.org/xsd");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":JdbcTable",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "JdbcTable",
                           xmlWriter);
                   }

               
                   }
                if (localCatalogTracker){
                                    namespace = "http://support.jdbc.store.lucene.apache.org/xsd";
                                    writeStartElement(null, namespace, "catalog", xmlWriter);
                             

                                          if (localCatalog==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localCatalog);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localDeletedColumnTracker){
                                    if (localDeletedColumn==null){

                                        writeStartElement(null, "http://support.jdbc.store.lucene.apache.org/xsd", "deletedColumn", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localDeletedColumn.serialize(new javax.xml.namespace.QName("http://support.jdbc.store.lucene.apache.org/xsd","deletedColumn"),
                                        xmlWriter);
                                    }
                                } if (localDialectTracker){
                                    if (localDialect==null){

                                        writeStartElement(null, "http://support.jdbc.store.lucene.apache.org/xsd", "dialect", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localDialect.serialize(new javax.xml.namespace.QName("http://support.jdbc.store.lucene.apache.org/xsd","dialect"),
                                        xmlWriter);
                                    }
                                } if (localLastModifiedColumnTracker){
                                    if (localLastModifiedColumn==null){

                                        writeStartElement(null, "http://support.jdbc.store.lucene.apache.org/xsd", "lastModifiedColumn", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localLastModifiedColumn.serialize(new javax.xml.namespace.QName("http://support.jdbc.store.lucene.apache.org/xsd","lastModifiedColumn"),
                                        xmlWriter);
                                    }
                                } if (localNameTracker){
                                    namespace = "http://support.jdbc.store.lucene.apache.org/xsd";
                                    writeStartElement(null, namespace, "name", xmlWriter);
                             

                                          if (localName==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localName);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localNameColumnTracker){
                                    if (localNameColumn==null){

                                        writeStartElement(null, "http://support.jdbc.store.lucene.apache.org/xsd", "nameColumn", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localNameColumn.serialize(new javax.xml.namespace.QName("http://support.jdbc.store.lucene.apache.org/xsd","nameColumn"),
                                        xmlWriter);
                                    }
                                } if (localQualifiedNameTracker){
                                    namespace = "http://support.jdbc.store.lucene.apache.org/xsd";
                                    writeStartElement(null, namespace, "qualifiedName", xmlWriter);
                             

                                          if (localQualifiedName==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localQualifiedName);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localQuotedNameTracker){
                                    namespace = "http://support.jdbc.store.lucene.apache.org/xsd";
                                    writeStartElement(null, namespace, "quotedName", xmlWriter);
                             

                                          if (localQuotedName==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localQuotedName);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localQuotedSchemaTracker){
                                    namespace = "http://support.jdbc.store.lucene.apache.org/xsd";
                                    writeStartElement(null, namespace, "quotedSchema", xmlWriter);
                             

                                          if (localQuotedSchema==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localQuotedSchema);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localSchemaTracker){
                                    namespace = "http://support.jdbc.store.lucene.apache.org/xsd";
                                    writeStartElement(null, namespace, "schema", xmlWriter);
                             

                                          if (localSchema==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localSchema);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localSettingsTracker){
                                    if (localSettings==null){

                                        writeStartElement(null, "http://support.jdbc.store.lucene.apache.org/xsd", "settings", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localSettings.serialize(new javax.xml.namespace.QName("http://support.jdbc.store.lucene.apache.org/xsd","settings"),
                                        xmlWriter);
                                    }
                                } if (localSizeColumnTracker){
                                    if (localSizeColumn==null){

                                        writeStartElement(null, "http://support.jdbc.store.lucene.apache.org/xsd", "sizeColumn", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localSizeColumn.serialize(new javax.xml.namespace.QName("http://support.jdbc.store.lucene.apache.org/xsd","sizeColumn"),
                                        xmlWriter);
                                    }
                                } if (localValueColumnTracker){
                                    if (localValueColumn==null){

                                        writeStartElement(null, "http://support.jdbc.store.lucene.apache.org/xsd", "valueColumn", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localValueColumn.serialize(new javax.xml.namespace.QName("http://support.jdbc.store.lucene.apache.org/xsd","valueColumn"),
                                        xmlWriter);
                                    }
                                }
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://support.jdbc.store.lucene.apache.org/xsd")){
                return "ns86";
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

                 if (localCatalogTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://support.jdbc.store.lucene.apache.org/xsd",
                                                                      "catalog"));
                                 
                                         elementList.add(localCatalog==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCatalog));
                                    } if (localDeletedColumnTracker){
                            elementList.add(new javax.xml.namespace.QName("http://support.jdbc.store.lucene.apache.org/xsd",
                                                                      "deletedColumn"));
                            
                            
                                    elementList.add(localDeletedColumn==null?null:
                                    localDeletedColumn);
                                } if (localDialectTracker){
                            elementList.add(new javax.xml.namespace.QName("http://support.jdbc.store.lucene.apache.org/xsd",
                                                                      "dialect"));
                            
                            
                                    elementList.add(localDialect==null?null:
                                    localDialect);
                                } if (localLastModifiedColumnTracker){
                            elementList.add(new javax.xml.namespace.QName("http://support.jdbc.store.lucene.apache.org/xsd",
                                                                      "lastModifiedColumn"));
                            
                            
                                    elementList.add(localLastModifiedColumn==null?null:
                                    localLastModifiedColumn);
                                } if (localNameTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://support.jdbc.store.lucene.apache.org/xsd",
                                                                      "name"));
                                 
                                         elementList.add(localName==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localName));
                                    } if (localNameColumnTracker){
                            elementList.add(new javax.xml.namespace.QName("http://support.jdbc.store.lucene.apache.org/xsd",
                                                                      "nameColumn"));
                            
                            
                                    elementList.add(localNameColumn==null?null:
                                    localNameColumn);
                                } if (localQualifiedNameTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://support.jdbc.store.lucene.apache.org/xsd",
                                                                      "qualifiedName"));
                                 
                                         elementList.add(localQualifiedName==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localQualifiedName));
                                    } if (localQuotedNameTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://support.jdbc.store.lucene.apache.org/xsd",
                                                                      "quotedName"));
                                 
                                         elementList.add(localQuotedName==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localQuotedName));
                                    } if (localQuotedSchemaTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://support.jdbc.store.lucene.apache.org/xsd",
                                                                      "quotedSchema"));
                                 
                                         elementList.add(localQuotedSchema==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localQuotedSchema));
                                    } if (localSchemaTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://support.jdbc.store.lucene.apache.org/xsd",
                                                                      "schema"));
                                 
                                         elementList.add(localSchema==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSchema));
                                    } if (localSettingsTracker){
                            elementList.add(new javax.xml.namespace.QName("http://support.jdbc.store.lucene.apache.org/xsd",
                                                                      "settings"));
                            
                            
                                    elementList.add(localSettings==null?null:
                                    localSettings);
                                } if (localSizeColumnTracker){
                            elementList.add(new javax.xml.namespace.QName("http://support.jdbc.store.lucene.apache.org/xsd",
                                                                      "sizeColumn"));
                            
                            
                                    elementList.add(localSizeColumn==null?null:
                                    localSizeColumn);
                                } if (localValueColumnTracker){
                            elementList.add(new javax.xml.namespace.QName("http://support.jdbc.store.lucene.apache.org/xsd",
                                                                      "valueColumn"));
                            
                            
                                    elementList.add(localValueColumn==null?null:
                                    localValueColumn);
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
        public static JdbcTable parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            JdbcTable object =
                new JdbcTable();

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
                    
                            if (!"JdbcTable".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (JdbcTable)org.wso2.carbon.registry.core.jdbc.xsd.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://support.jdbc.store.lucene.apache.org/xsd","catalog").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCatalog(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://support.jdbc.store.lucene.apache.org/xsd","deletedColumn").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setDeletedColumn(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setDeletedColumn(org.apache.lucene.store.jdbc.support.xsd.JdbcColumn.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://support.jdbc.store.lucene.apache.org/xsd","dialect").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setDialect(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setDialect(org.apache.lucene.store.jdbc.dialect.xsd.Dialect.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://support.jdbc.store.lucene.apache.org/xsd","lastModifiedColumn").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setLastModifiedColumn(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setLastModifiedColumn(org.apache.lucene.store.jdbc.support.xsd.JdbcColumn.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://support.jdbc.store.lucene.apache.org/xsd","name").equals(reader.getName())){
                                
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://support.jdbc.store.lucene.apache.org/xsd","nameColumn").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setNameColumn(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setNameColumn(org.apache.lucene.store.jdbc.support.xsd.JdbcColumn.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://support.jdbc.store.lucene.apache.org/xsd","qualifiedName").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setQualifiedName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://support.jdbc.store.lucene.apache.org/xsd","quotedName").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setQuotedName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://support.jdbc.store.lucene.apache.org/xsd","quotedSchema").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setQuotedSchema(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://support.jdbc.store.lucene.apache.org/xsd","schema").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSchema(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://support.jdbc.store.lucene.apache.org/xsd","settings").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setSettings(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setSettings(org.apache.lucene.store.jdbc.xsd.JdbcDirectorySettings.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://support.jdbc.store.lucene.apache.org/xsd","sizeColumn").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setSizeColumn(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setSizeColumn(org.apache.lucene.store.jdbc.support.xsd.JdbcColumn.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://support.jdbc.store.lucene.apache.org/xsd","valueColumn").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setValueColumn(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setValueColumn(org.apache.lucene.store.jdbc.support.xsd.JdbcColumn.Factory.parse(reader));
                                              
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
           
    
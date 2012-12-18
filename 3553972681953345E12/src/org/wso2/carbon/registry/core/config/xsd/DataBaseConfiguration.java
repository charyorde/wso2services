
/**
 * DataBaseConfiguration.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v3  Built on : Oct 26, 2011 (07:42:27 PDT)
 */

            
                package org.wso2.carbon.registry.core.config.xsd;
            

            /**
            *  DataBaseConfiguration bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class DataBaseConfiguration
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = DataBaseConfiguration
                Namespace URI = http://config.core.registry.carbon.wso2.org/xsd
                Namespace Prefix = ns77
                */
            

                        /**
                        * field for ConfigName
                        */

                        
                                    protected java.lang.String localConfigName ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localConfigNameTracker = false ;

                           public boolean isConfigNameSpecified(){
                               return localConfigNameTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getConfigName(){
                               return localConfigName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ConfigName
                               */
                               public void setConfigName(java.lang.String param){
                            localConfigNameTracker = true;
                                   
                                            this.localConfigName=param;
                                    

                               }
                            

                        /**
                        * field for DataSourceName
                        */

                        
                                    protected java.lang.String localDataSourceName ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDataSourceNameTracker = false ;

                           public boolean isDataSourceNameSpecified(){
                               return localDataSourceNameTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getDataSourceName(){
                               return localDataSourceName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param DataSourceName
                               */
                               public void setDataSourceName(java.lang.String param){
                            localDataSourceNameTracker = true;
                                   
                                            this.localDataSourceName=param;
                                    

                               }
                            

                        /**
                        * field for DbUrl
                        */

                        
                                    protected java.lang.String localDbUrl ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDbUrlTracker = false ;

                           public boolean isDbUrlSpecified(){
                               return localDbUrlTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getDbUrl(){
                               return localDbUrl;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param DbUrl
                               */
                               public void setDbUrl(java.lang.String param){
                            localDbUrlTracker = true;
                                   
                                            this.localDbUrl=param;
                                    

                               }
                            

                        /**
                        * field for DriverName
                        */

                        
                                    protected java.lang.String localDriverName ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDriverNameTracker = false ;

                           public boolean isDriverNameSpecified(){
                               return localDriverNameTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getDriverName(){
                               return localDriverName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param DriverName
                               */
                               public void setDriverName(java.lang.String param){
                            localDriverNameTracker = true;
                                   
                                            this.localDriverName=param;
                                    

                               }
                            

                        /**
                        * field for MaxActive
                        */

                        
                                    protected java.lang.String localMaxActive ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localMaxActiveTracker = false ;

                           public boolean isMaxActiveSpecified(){
                               return localMaxActiveTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getMaxActive(){
                               return localMaxActive;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MaxActive
                               */
                               public void setMaxActive(java.lang.String param){
                            localMaxActiveTracker = true;
                                   
                                            this.localMaxActive=param;
                                    

                               }
                            

                        /**
                        * field for MaxIdle
                        */

                        
                                    protected java.lang.String localMaxIdle ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localMaxIdleTracker = false ;

                           public boolean isMaxIdleSpecified(){
                               return localMaxIdleTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getMaxIdle(){
                               return localMaxIdle;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MaxIdle
                               */
                               public void setMaxIdle(java.lang.String param){
                            localMaxIdleTracker = true;
                                   
                                            this.localMaxIdle=param;
                                    

                               }
                            

                        /**
                        * field for MaxWait
                        */

                        
                                    protected java.lang.String localMaxWait ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localMaxWaitTracker = false ;

                           public boolean isMaxWaitSpecified(){
                               return localMaxWaitTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getMaxWait(){
                               return localMaxWait;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MaxWait
                               */
                               public void setMaxWait(java.lang.String param){
                            localMaxWaitTracker = true;
                                   
                                            this.localMaxWait=param;
                                    

                               }
                            

                        /**
                        * field for MinIdle
                        */

                        
                                    protected java.lang.String localMinIdle ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localMinIdleTracker = false ;

                           public boolean isMinIdleSpecified(){
                               return localMinIdleTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getMinIdle(){
                               return localMinIdle;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MinIdle
                               */
                               public void setMinIdle(java.lang.String param){
                            localMinIdleTracker = true;
                                   
                                            this.localMinIdle=param;
                                    

                               }
                            

                        /**
                        * field for PassWord
                        */

                        
                                    protected java.lang.String localPassWord ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPassWordTracker = false ;

                           public boolean isPassWordSpecified(){
                               return localPassWordTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getPassWord(){
                               return localPassWord;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PassWord
                               */
                               public void setPassWord(java.lang.String param){
                            localPassWordTracker = true;
                                   
                                            this.localPassWord=param;
                                    

                               }
                            

                        /**
                        * field for PasswordManager
                        */

                        
                                    protected org.wso2.securevault.xsd.SecretResolver localPasswordManager ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPasswordManagerTracker = false ;

                           public boolean isPasswordManagerSpecified(){
                               return localPasswordManagerTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return org.wso2.securevault.xsd.SecretResolver
                           */
                           public  org.wso2.securevault.xsd.SecretResolver getPasswordManager(){
                               return localPasswordManager;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PasswordManager
                               */
                               public void setPasswordManager(org.wso2.securevault.xsd.SecretResolver param){
                            localPasswordManagerTracker = true;
                                   
                                            this.localPasswordManager=param;
                                    

                               }
                            

                        /**
                        * field for ResolvedPassword
                        */

                        
                                    protected java.lang.String localResolvedPassword ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localResolvedPasswordTracker = false ;

                           public boolean isResolvedPasswordSpecified(){
                               return localResolvedPasswordTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getResolvedPassword(){
                               return localResolvedPassword;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ResolvedPassword
                               */
                               public void setResolvedPassword(java.lang.String param){
                            localResolvedPasswordTracker = true;
                                   
                                            this.localResolvedPassword=param;
                                    

                               }
                            

                        /**
                        * field for UserName
                        */

                        
                                    protected java.lang.String localUserName ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localUserNameTracker = false ;

                           public boolean isUserNameSpecified(){
                               return localUserNameTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getUserName(){
                               return localUserName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param UserName
                               */
                               public void setUserName(java.lang.String param){
                            localUserNameTracker = true;
                                   
                                            this.localUserName=param;
                                    

                               }
                            

                        /**
                        * field for ValidationQuery
                        */

                        
                                    protected java.lang.String localValidationQuery ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localValidationQueryTracker = false ;

                           public boolean isValidationQuerySpecified(){
                               return localValidationQueryTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getValidationQuery(){
                               return localValidationQuery;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ValidationQuery
                               */
                               public void setValidationQuery(java.lang.String param){
                            localValidationQueryTracker = true;
                                   
                                            this.localValidationQuery=param;
                                    

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
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://config.core.registry.carbon.wso2.org/xsd");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":DataBaseConfiguration",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "DataBaseConfiguration",
                           xmlWriter);
                   }

               
                   }
                if (localConfigNameTracker){
                                    namespace = "http://config.core.registry.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "configName", xmlWriter);
                             

                                          if (localConfigName==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localConfigName);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localDataSourceNameTracker){
                                    namespace = "http://config.core.registry.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "dataSourceName", xmlWriter);
                             

                                          if (localDataSourceName==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localDataSourceName);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localDbUrlTracker){
                                    namespace = "http://config.core.registry.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "dbUrl", xmlWriter);
                             

                                          if (localDbUrl==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localDbUrl);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localDriverNameTracker){
                                    namespace = "http://config.core.registry.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "driverName", xmlWriter);
                             

                                          if (localDriverName==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localDriverName);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localMaxActiveTracker){
                                    namespace = "http://config.core.registry.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "maxActive", xmlWriter);
                             

                                          if (localMaxActive==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localMaxActive);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localMaxIdleTracker){
                                    namespace = "http://config.core.registry.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "maxIdle", xmlWriter);
                             

                                          if (localMaxIdle==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localMaxIdle);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localMaxWaitTracker){
                                    namespace = "http://config.core.registry.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "maxWait", xmlWriter);
                             

                                          if (localMaxWait==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localMaxWait);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localMinIdleTracker){
                                    namespace = "http://config.core.registry.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "minIdle", xmlWriter);
                             

                                          if (localMinIdle==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localMinIdle);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPassWordTracker){
                                    namespace = "http://config.core.registry.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "passWord", xmlWriter);
                             

                                          if (localPassWord==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localPassWord);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPasswordManagerTracker){
                                    if (localPasswordManager==null){

                                        writeStartElement(null, "http://config.core.registry.carbon.wso2.org/xsd", "passwordManager", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localPasswordManager.serialize(new javax.xml.namespace.QName("http://config.core.registry.carbon.wso2.org/xsd","passwordManager"),
                                        xmlWriter);
                                    }
                                } if (localResolvedPasswordTracker){
                                    namespace = "http://config.core.registry.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "resolvedPassword", xmlWriter);
                             

                                          if (localResolvedPassword==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localResolvedPassword);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localUserNameTracker){
                                    namespace = "http://config.core.registry.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "userName", xmlWriter);
                             

                                          if (localUserName==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localUserName);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localValidationQueryTracker){
                                    namespace = "http://config.core.registry.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "validationQuery", xmlWriter);
                             

                                          if (localValidationQuery==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localValidationQuery);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             }
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://config.core.registry.carbon.wso2.org/xsd")){
                return "ns77";
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

                 if (localConfigNameTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://config.core.registry.carbon.wso2.org/xsd",
                                                                      "configName"));
                                 
                                         elementList.add(localConfigName==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localConfigName));
                                    } if (localDataSourceNameTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://config.core.registry.carbon.wso2.org/xsd",
                                                                      "dataSourceName"));
                                 
                                         elementList.add(localDataSourceName==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDataSourceName));
                                    } if (localDbUrlTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://config.core.registry.carbon.wso2.org/xsd",
                                                                      "dbUrl"));
                                 
                                         elementList.add(localDbUrl==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDbUrl));
                                    } if (localDriverNameTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://config.core.registry.carbon.wso2.org/xsd",
                                                                      "driverName"));
                                 
                                         elementList.add(localDriverName==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDriverName));
                                    } if (localMaxActiveTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://config.core.registry.carbon.wso2.org/xsd",
                                                                      "maxActive"));
                                 
                                         elementList.add(localMaxActive==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMaxActive));
                                    } if (localMaxIdleTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://config.core.registry.carbon.wso2.org/xsd",
                                                                      "maxIdle"));
                                 
                                         elementList.add(localMaxIdle==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMaxIdle));
                                    } if (localMaxWaitTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://config.core.registry.carbon.wso2.org/xsd",
                                                                      "maxWait"));
                                 
                                         elementList.add(localMaxWait==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMaxWait));
                                    } if (localMinIdleTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://config.core.registry.carbon.wso2.org/xsd",
                                                                      "minIdle"));
                                 
                                         elementList.add(localMinIdle==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMinIdle));
                                    } if (localPassWordTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://config.core.registry.carbon.wso2.org/xsd",
                                                                      "passWord"));
                                 
                                         elementList.add(localPassWord==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPassWord));
                                    } if (localPasswordManagerTracker){
                            elementList.add(new javax.xml.namespace.QName("http://config.core.registry.carbon.wso2.org/xsd",
                                                                      "passwordManager"));
                            
                            
                                    elementList.add(localPasswordManager==null?null:
                                    localPasswordManager);
                                } if (localResolvedPasswordTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://config.core.registry.carbon.wso2.org/xsd",
                                                                      "resolvedPassword"));
                                 
                                         elementList.add(localResolvedPassword==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localResolvedPassword));
                                    } if (localUserNameTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://config.core.registry.carbon.wso2.org/xsd",
                                                                      "userName"));
                                 
                                         elementList.add(localUserName==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUserName));
                                    } if (localValidationQueryTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://config.core.registry.carbon.wso2.org/xsd",
                                                                      "validationQuery"));
                                 
                                         elementList.add(localValidationQuery==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localValidationQuery));
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
        public static DataBaseConfiguration parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            DataBaseConfiguration object =
                new DataBaseConfiguration();

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
                    
                            if (!"DataBaseConfiguration".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (DataBaseConfiguration)org.wso2.carbon.registry.core.jdbc.xsd.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://config.core.registry.carbon.wso2.org/xsd","configName").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setConfigName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://config.core.registry.carbon.wso2.org/xsd","dataSourceName").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setDataSourceName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://config.core.registry.carbon.wso2.org/xsd","dbUrl").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setDbUrl(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://config.core.registry.carbon.wso2.org/xsd","driverName").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setDriverName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://config.core.registry.carbon.wso2.org/xsd","maxActive").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setMaxActive(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://config.core.registry.carbon.wso2.org/xsd","maxIdle").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setMaxIdle(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://config.core.registry.carbon.wso2.org/xsd","maxWait").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setMaxWait(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://config.core.registry.carbon.wso2.org/xsd","minIdle").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setMinIdle(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://config.core.registry.carbon.wso2.org/xsd","passWord").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPassWord(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://config.core.registry.carbon.wso2.org/xsd","passwordManager").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setPasswordManager(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setPasswordManager(org.wso2.securevault.xsd.SecretResolver.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://config.core.registry.carbon.wso2.org/xsd","resolvedPassword").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setResolvedPassword(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://config.core.registry.carbon.wso2.org/xsd","userName").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setUserName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://config.core.registry.carbon.wso2.org/xsd","validationQuery").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setValidationQuery(
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
           
    
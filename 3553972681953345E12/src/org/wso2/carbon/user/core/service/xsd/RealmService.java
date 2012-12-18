
/**
 * RealmService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v3  Built on : Oct 26, 2011 (07:42:27 PDT)
 */

            
                package org.wso2.carbon.user.core.service.xsd;
            

            /**
            *  RealmService bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public abstract class RealmService
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = RealmService
                Namespace URI = http://service.core.user.carbon.wso2.org/xsd
                Namespace Prefix = ns93
                */
            

                        /**
                        * field for BootstrapRealm
                        */

                        
                                    protected org.wso2.carbon.user.core.xsd.UserRealm localBootstrapRealm ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localBootstrapRealmTracker = false ;

                           public boolean isBootstrapRealmSpecified(){
                               return localBootstrapRealmTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return org.wso2.carbon.user.core.xsd.UserRealm
                           */
                           public  org.wso2.carbon.user.core.xsd.UserRealm getBootstrapRealm(){
                               return localBootstrapRealm;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param BootstrapRealm
                               */
                               public void setBootstrapRealm(org.wso2.carbon.user.core.xsd.UserRealm param){
                            localBootstrapRealmTracker = true;
                                   
                                            this.localBootstrapRealm=param;
                                    

                               }
                            

                        /**
                        * field for BootstrapRealmConfiguration
                        */

                        
                                    protected org.wso2.carbon.user.api.xsd.RealmConfiguration localBootstrapRealmConfiguration ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localBootstrapRealmConfigurationTracker = false ;

                           public boolean isBootstrapRealmConfigurationSpecified(){
                               return localBootstrapRealmConfigurationTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return org.wso2.carbon.user.api.xsd.RealmConfiguration
                           */
                           public  org.wso2.carbon.user.api.xsd.RealmConfiguration getBootstrapRealmConfiguration(){
                               return localBootstrapRealmConfiguration;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param BootstrapRealmConfiguration
                               */
                               public void setBootstrapRealmConfiguration(org.wso2.carbon.user.api.xsd.RealmConfiguration param){
                            localBootstrapRealmConfigurationTracker = true;
                                   
                                            this.localBootstrapRealmConfiguration=param;
                                    

                               }
                            

                        /**
                        * field for MultiTenantRealmConfigBuilder
                        */

                        
                                    protected org.wso2.carbon.user.core.config.multitenancy.xsd.MultiTenantRealmConfigBuilder localMultiTenantRealmConfigBuilder ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localMultiTenantRealmConfigBuilderTracker = false ;

                           public boolean isMultiTenantRealmConfigBuilderSpecified(){
                               return localMultiTenantRealmConfigBuilderTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return org.wso2.carbon.user.core.config.multitenancy.xsd.MultiTenantRealmConfigBuilder
                           */
                           public  org.wso2.carbon.user.core.config.multitenancy.xsd.MultiTenantRealmConfigBuilder getMultiTenantRealmConfigBuilder(){
                               return localMultiTenantRealmConfigBuilder;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MultiTenantRealmConfigBuilder
                               */
                               public void setMultiTenantRealmConfigBuilder(org.wso2.carbon.user.core.config.multitenancy.xsd.MultiTenantRealmConfigBuilder param){
                            localMultiTenantRealmConfigBuilderTracker = true;
                                   
                                            this.localMultiTenantRealmConfigBuilder=param;
                                    

                               }
                            

                        /**
                        * field for TenantManager
                        */

                        
                                    protected org.wso2.carbon.user.core.tenant.xsd.TenantManager localTenantManager ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTenantManagerTracker = false ;

                           public boolean isTenantManagerSpecified(){
                               return localTenantManagerTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return org.wso2.carbon.user.core.tenant.xsd.TenantManager
                           */
                           public  org.wso2.carbon.user.core.tenant.xsd.TenantManager getTenantManager(){
                               return localTenantManager;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TenantManager
                               */
                               public void setTenantManager(org.wso2.carbon.user.core.tenant.xsd.TenantManager param){
                            localTenantManagerTracker = true;
                                   
                                            this.localTenantManager=param;
                                    

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
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://service.core.user.carbon.wso2.org/xsd");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":RealmService",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "RealmService",
                           xmlWriter);
                   }

               
                   }
                if (localBootstrapRealmTracker){
                                    if (localBootstrapRealm==null){

                                        writeStartElement(null, "http://service.core.user.carbon.wso2.org/xsd", "bootstrapRealm", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localBootstrapRealm.serialize(new javax.xml.namespace.QName("http://service.core.user.carbon.wso2.org/xsd","bootstrapRealm"),
                                        xmlWriter);
                                    }
                                } if (localBootstrapRealmConfigurationTracker){
                                    if (localBootstrapRealmConfiguration==null){

                                        writeStartElement(null, "http://service.core.user.carbon.wso2.org/xsd", "bootstrapRealmConfiguration", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localBootstrapRealmConfiguration.serialize(new javax.xml.namespace.QName("http://service.core.user.carbon.wso2.org/xsd","bootstrapRealmConfiguration"),
                                        xmlWriter);
                                    }
                                } if (localMultiTenantRealmConfigBuilderTracker){
                                    if (localMultiTenantRealmConfigBuilder==null){

                                        writeStartElement(null, "http://service.core.user.carbon.wso2.org/xsd", "multiTenantRealmConfigBuilder", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localMultiTenantRealmConfigBuilder.serialize(new javax.xml.namespace.QName("http://service.core.user.carbon.wso2.org/xsd","multiTenantRealmConfigBuilder"),
                                        xmlWriter);
                                    }
                                } if (localTenantManagerTracker){
                                    if (localTenantManager==null){

                                        writeStartElement(null, "http://service.core.user.carbon.wso2.org/xsd", "tenantManager", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localTenantManager.serialize(new javax.xml.namespace.QName("http://service.core.user.carbon.wso2.org/xsd","tenantManager"),
                                        xmlWriter);
                                    }
                                }
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://service.core.user.carbon.wso2.org/xsd")){
                return "ns93";
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

                 if (localBootstrapRealmTracker){
                            elementList.add(new javax.xml.namespace.QName("http://service.core.user.carbon.wso2.org/xsd",
                                                                      "bootstrapRealm"));
                            
                            
                                    elementList.add(localBootstrapRealm==null?null:
                                    localBootstrapRealm);
                                } if (localBootstrapRealmConfigurationTracker){
                            elementList.add(new javax.xml.namespace.QName("http://service.core.user.carbon.wso2.org/xsd",
                                                                      "bootstrapRealmConfiguration"));
                            
                            
                                    elementList.add(localBootstrapRealmConfiguration==null?null:
                                    localBootstrapRealmConfiguration);
                                } if (localMultiTenantRealmConfigBuilderTracker){
                            elementList.add(new javax.xml.namespace.QName("http://service.core.user.carbon.wso2.org/xsd",
                                                                      "multiTenantRealmConfigBuilder"));
                            
                            
                                    elementList.add(localMultiTenantRealmConfigBuilder==null?null:
                                    localMultiTenantRealmConfigBuilder);
                                } if (localTenantManagerTracker){
                            elementList.add(new javax.xml.namespace.QName("http://service.core.user.carbon.wso2.org/xsd",
                                                                      "tenantManager"));
                            
                            
                                    elementList.add(localTenantManager==null?null:
                                    localTenantManager);
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
        public static RealmService parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            RealmService object =
                null;

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
                    
                            if (!"RealmService".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (RealmService)org.wso2.carbon.registry.core.jdbc.xsd.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        
                        throw new org.apache.axis2.databinding.ADBException("The an abstract class can not be instantiated !!!");
                    

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://service.core.user.carbon.wso2.org/xsd","bootstrapRealm").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setBootstrapRealm(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setBootstrapRealm(org.wso2.carbon.user.core.xsd.UserRealm.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://service.core.user.carbon.wso2.org/xsd","bootstrapRealmConfiguration").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setBootstrapRealmConfiguration(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setBootstrapRealmConfiguration(org.wso2.carbon.user.api.xsd.RealmConfiguration.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://service.core.user.carbon.wso2.org/xsd","multiTenantRealmConfigBuilder").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setMultiTenantRealmConfigBuilder(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setMultiTenantRealmConfigBuilder(org.wso2.carbon.user.core.config.multitenancy.xsd.MultiTenantRealmConfigBuilder.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://service.core.user.carbon.wso2.org/xsd","tenantManager").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setTenantManager(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setTenantManager(org.wso2.carbon.user.core.tenant.xsd.TenantManager.Factory.parse(reader));
                                              
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
           
    

/**
 * EmbeddedRegistryService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v3  Built on : Oct 26, 2011 (07:42:27 PDT)
 */

            
                package org.wso2.carbon.registry.core.jdbc.xsd;
            

            /**
            *  EmbeddedRegistryService bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class EmbeddedRegistryService
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = EmbeddedRegistryService
                Namespace URI = http://jdbc.core.registry.carbon.wso2.org/xsd
                Namespace Prefix = ns83
                */
            

                        /**
                        * field for ConfigUserRegistry
                        */

                        
                                    protected org.wso2.carbon.registry.api.xsd.RegistryE localConfigUserRegistry ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localConfigUserRegistryTracker = false ;

                           public boolean isConfigUserRegistrySpecified(){
                               return localConfigUserRegistryTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return org.wso2.carbon.registry.api.xsd.RegistryE
                           */
                           public  org.wso2.carbon.registry.api.xsd.RegistryE getConfigUserRegistry(){
                               return localConfigUserRegistry;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ConfigUserRegistry
                               */
                               public void setConfigUserRegistry(org.wso2.carbon.registry.api.xsd.RegistryE param){
                            localConfigUserRegistryTracker = true;
                                   
                                            this.localConfigUserRegistry=param;
                                    

                               }
                            

                        /**
                        * field for GovernanceUserRegistry
                        */

                        
                                    protected org.wso2.carbon.registry.api.xsd.RegistryE localGovernanceUserRegistry ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGovernanceUserRegistryTracker = false ;

                           public boolean isGovernanceUserRegistrySpecified(){
                               return localGovernanceUserRegistryTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return org.wso2.carbon.registry.api.xsd.RegistryE
                           */
                           public  org.wso2.carbon.registry.api.xsd.RegistryE getGovernanceUserRegistry(){
                               return localGovernanceUserRegistry;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GovernanceUserRegistry
                               */
                               public void setGovernanceUserRegistry(org.wso2.carbon.registry.api.xsd.RegistryE param){
                            localGovernanceUserRegistryTracker = true;
                                   
                                            this.localGovernanceUserRegistry=param;
                                    

                               }
                            

                        /**
                        * field for Registry
                        */

                        
                                    protected org.wso2.carbon.registry.api.xsd.RegistryE localRegistry ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRegistryTracker = false ;

                           public boolean isRegistrySpecified(){
                               return localRegistryTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return org.wso2.carbon.registry.api.xsd.RegistryE
                           */
                           public  org.wso2.carbon.registry.api.xsd.RegistryE getRegistry(){
                               return localRegistry;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Registry
                               */
                               public void setRegistry(org.wso2.carbon.registry.api.xsd.RegistryE param){
                            localRegistryTracker = true;
                                   
                                            this.localRegistry=param;
                                    

                               }
                            

                        /**
                        * field for UserRegistry
                        */

                        
                                    protected org.wso2.carbon.registry.core.session.xsd.UserRegistry localUserRegistry ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localUserRegistryTracker = false ;

                           public boolean isUserRegistrySpecified(){
                               return localUserRegistryTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return org.wso2.carbon.registry.core.session.xsd.UserRegistry
                           */
                           public  org.wso2.carbon.registry.core.session.xsd.UserRegistry getUserRegistry(){
                               return localUserRegistry;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param UserRegistry
                               */
                               public void setUserRegistry(org.wso2.carbon.registry.core.session.xsd.UserRegistry param){
                            localUserRegistryTracker = true;
                                   
                                            this.localUserRegistry=param;
                                    

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
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://jdbc.core.registry.carbon.wso2.org/xsd");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":EmbeddedRegistryService",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "EmbeddedRegistryService",
                           xmlWriter);
                   }

               
                   }
                if (localConfigUserRegistryTracker){
                                    if (localConfigUserRegistry==null){

                                        writeStartElement(null, "http://jdbc.core.registry.carbon.wso2.org/xsd", "configUserRegistry", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localConfigUserRegistry.serialize(new javax.xml.namespace.QName("http://jdbc.core.registry.carbon.wso2.org/xsd","configUserRegistry"),
                                        xmlWriter);
                                    }
                                } if (localGovernanceUserRegistryTracker){
                                    if (localGovernanceUserRegistry==null){

                                        writeStartElement(null, "http://jdbc.core.registry.carbon.wso2.org/xsd", "governanceUserRegistry", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localGovernanceUserRegistry.serialize(new javax.xml.namespace.QName("http://jdbc.core.registry.carbon.wso2.org/xsd","governanceUserRegistry"),
                                        xmlWriter);
                                    }
                                } if (localRegistryTracker){
                                    if (localRegistry==null){

                                        writeStartElement(null, "http://jdbc.core.registry.carbon.wso2.org/xsd", "registry", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localRegistry.serialize(new javax.xml.namespace.QName("http://jdbc.core.registry.carbon.wso2.org/xsd","registry"),
                                        xmlWriter);
                                    }
                                } if (localUserRegistryTracker){
                                    if (localUserRegistry==null){

                                        writeStartElement(null, "http://jdbc.core.registry.carbon.wso2.org/xsd", "userRegistry", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localUserRegistry.serialize(new javax.xml.namespace.QName("http://jdbc.core.registry.carbon.wso2.org/xsd","userRegistry"),
                                        xmlWriter);
                                    }
                                }
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://jdbc.core.registry.carbon.wso2.org/xsd")){
                return "ns83";
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

                 if (localConfigUserRegistryTracker){
                            elementList.add(new javax.xml.namespace.QName("http://jdbc.core.registry.carbon.wso2.org/xsd",
                                                                      "configUserRegistry"));
                            
                            
                                    elementList.add(localConfigUserRegistry==null?null:
                                    localConfigUserRegistry);
                                } if (localGovernanceUserRegistryTracker){
                            elementList.add(new javax.xml.namespace.QName("http://jdbc.core.registry.carbon.wso2.org/xsd",
                                                                      "governanceUserRegistry"));
                            
                            
                                    elementList.add(localGovernanceUserRegistry==null?null:
                                    localGovernanceUserRegistry);
                                } if (localRegistryTracker){
                            elementList.add(new javax.xml.namespace.QName("http://jdbc.core.registry.carbon.wso2.org/xsd",
                                                                      "registry"));
                            
                            
                                    elementList.add(localRegistry==null?null:
                                    localRegistry);
                                } if (localUserRegistryTracker){
                            elementList.add(new javax.xml.namespace.QName("http://jdbc.core.registry.carbon.wso2.org/xsd",
                                                                      "userRegistry"));
                            
                            
                                    elementList.add(localUserRegistry==null?null:
                                    localUserRegistry);
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
        public static EmbeddedRegistryService parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            EmbeddedRegistryService object =
                new EmbeddedRegistryService();

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
                    
                            if (!"EmbeddedRegistryService".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (EmbeddedRegistryService)org.wso2.carbon.registry.core.jdbc.xsd.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://jdbc.core.registry.carbon.wso2.org/xsd","configUserRegistry").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setConfigUserRegistry(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setConfigUserRegistry(org.wso2.carbon.registry.api.xsd.RegistryE.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://jdbc.core.registry.carbon.wso2.org/xsd","governanceUserRegistry").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setGovernanceUserRegistry(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setGovernanceUserRegistry(org.wso2.carbon.registry.api.xsd.RegistryE.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://jdbc.core.registry.carbon.wso2.org/xsd","registry").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setRegistry(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setRegistry(org.wso2.carbon.registry.api.xsd.RegistryE.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://jdbc.core.registry.carbon.wso2.org/xsd","userRegistry").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setUserRegistry(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setUserRegistry(org.wso2.carbon.registry.core.session.xsd.UserRegistry.Factory.parse(reader));
                                              
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
           
    
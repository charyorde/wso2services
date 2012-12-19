
/**
 * UserRealm.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v3  Built on : Oct 26, 2011 (07:42:27 PDT)
 */

            
                package org.wso2.carbon.user.core.xsd;
            

            /**
            *  UserRealm bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public abstract class UserRealm
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = UserRealm
                Namespace URI = http://core.user.carbon.wso2.org/xsd
                Namespace Prefix = ns47
                */
            

                        /**
                        * field for AuthorizationManager
                        */

                        
                                    protected org.wso2.carbon.user.core.xsd.AuthorizationManager localAuthorizationManager ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAuthorizationManagerTracker = false ;

                           public boolean isAuthorizationManagerSpecified(){
                               return localAuthorizationManagerTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return org.wso2.carbon.user.core.xsd.AuthorizationManager
                           */
                           public  org.wso2.carbon.user.core.xsd.AuthorizationManager getAuthorizationManager(){
                               return localAuthorizationManager;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AuthorizationManager
                               */
                               public void setAuthorizationManager(org.wso2.carbon.user.core.xsd.AuthorizationManager param){
                            localAuthorizationManagerTracker = true;
                                   
                                            this.localAuthorizationManager=param;
                                    

                               }
                            

                        /**
                        * field for ClaimManager
                        */

                        
                                    protected org.wso2.carbon.user.core.claim.xsd.ClaimManager localClaimManager ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localClaimManagerTracker = false ;

                           public boolean isClaimManagerSpecified(){
                               return localClaimManagerTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return org.wso2.carbon.user.core.claim.xsd.ClaimManager
                           */
                           public  org.wso2.carbon.user.core.claim.xsd.ClaimManager getClaimManager(){
                               return localClaimManager;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ClaimManager
                               */
                               public void setClaimManager(org.wso2.carbon.user.core.claim.xsd.ClaimManager param){
                            localClaimManagerTracker = true;
                                   
                                            this.localClaimManager=param;
                                    

                               }
                            

                        /**
                        * field for ProfileConfigurationManager
                        */

                        
                                    protected org.wso2.carbon.user.core.profile.xsd.ProfileConfigurationManager localProfileConfigurationManager ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localProfileConfigurationManagerTracker = false ;

                           public boolean isProfileConfigurationManagerSpecified(){
                               return localProfileConfigurationManagerTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return org.wso2.carbon.user.core.profile.xsd.ProfileConfigurationManager
                           */
                           public  org.wso2.carbon.user.core.profile.xsd.ProfileConfigurationManager getProfileConfigurationManager(){
                               return localProfileConfigurationManager;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ProfileConfigurationManager
                               */
                               public void setProfileConfigurationManager(org.wso2.carbon.user.core.profile.xsd.ProfileConfigurationManager param){
                            localProfileConfigurationManagerTracker = true;
                                   
                                            this.localProfileConfigurationManager=param;
                                    

                               }
                            

                        /**
                        * field for RealmConfiguration
                        */

                        
                                    protected org.wso2.carbon.user.api.xsd.RealmConfiguration localRealmConfiguration ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRealmConfigurationTracker = false ;

                           public boolean isRealmConfigurationSpecified(){
                               return localRealmConfigurationTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return org.wso2.carbon.user.api.xsd.RealmConfiguration
                           */
                           public  org.wso2.carbon.user.api.xsd.RealmConfiguration getRealmConfiguration(){
                               return localRealmConfiguration;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RealmConfiguration
                               */
                               public void setRealmConfiguration(org.wso2.carbon.user.api.xsd.RealmConfiguration param){
                            localRealmConfigurationTracker = true;
                                   
                                            this.localRealmConfiguration=param;
                                    

                               }
                            

                        /**
                        * field for UserStoreManager
                        */

                        
                                    protected org.wso2.carbon.user.core.xsd.UserStoreManager localUserStoreManager ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localUserStoreManagerTracker = false ;

                           public boolean isUserStoreManagerSpecified(){
                               return localUserStoreManagerTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return org.wso2.carbon.user.core.xsd.UserStoreManager
                           */
                           public  org.wso2.carbon.user.core.xsd.UserStoreManager getUserStoreManager(){
                               return localUserStoreManager;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param UserStoreManager
                               */
                               public void setUserStoreManager(org.wso2.carbon.user.core.xsd.UserStoreManager param){
                            localUserStoreManagerTracker = true;
                                   
                                            this.localUserStoreManager=param;
                                    

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
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://core.user.carbon.wso2.org/xsd");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":UserRealm",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "UserRealm",
                           xmlWriter);
                   }

               
                   }
                if (localAuthorizationManagerTracker){
                                    if (localAuthorizationManager==null){

                                        writeStartElement(null, "http://core.user.carbon.wso2.org/xsd", "authorizationManager", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localAuthorizationManager.serialize(new javax.xml.namespace.QName("http://core.user.carbon.wso2.org/xsd","authorizationManager"),
                                        xmlWriter);
                                    }
                                } if (localClaimManagerTracker){
                                    if (localClaimManager==null){

                                        writeStartElement(null, "http://core.user.carbon.wso2.org/xsd", "claimManager", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localClaimManager.serialize(new javax.xml.namespace.QName("http://core.user.carbon.wso2.org/xsd","claimManager"),
                                        xmlWriter);
                                    }
                                } if (localProfileConfigurationManagerTracker){
                                    if (localProfileConfigurationManager==null){

                                        writeStartElement(null, "http://core.user.carbon.wso2.org/xsd", "profileConfigurationManager", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localProfileConfigurationManager.serialize(new javax.xml.namespace.QName("http://core.user.carbon.wso2.org/xsd","profileConfigurationManager"),
                                        xmlWriter);
                                    }
                                } if (localRealmConfigurationTracker){
                                    if (localRealmConfiguration==null){

                                        writeStartElement(null, "http://core.user.carbon.wso2.org/xsd", "realmConfiguration", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localRealmConfiguration.serialize(new javax.xml.namespace.QName("http://core.user.carbon.wso2.org/xsd","realmConfiguration"),
                                        xmlWriter);
                                    }
                                } if (localUserStoreManagerTracker){
                                    if (localUserStoreManager==null){

                                        writeStartElement(null, "http://core.user.carbon.wso2.org/xsd", "userStoreManager", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localUserStoreManager.serialize(new javax.xml.namespace.QName("http://core.user.carbon.wso2.org/xsd","userStoreManager"),
                                        xmlWriter);
                                    }
                                }
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://core.user.carbon.wso2.org/xsd")){
                return "ns47";
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

                 if (localAuthorizationManagerTracker){
                            elementList.add(new javax.xml.namespace.QName("http://core.user.carbon.wso2.org/xsd",
                                                                      "authorizationManager"));
                            
                            
                                    elementList.add(localAuthorizationManager==null?null:
                                    localAuthorizationManager);
                                } if (localClaimManagerTracker){
                            elementList.add(new javax.xml.namespace.QName("http://core.user.carbon.wso2.org/xsd",
                                                                      "claimManager"));
                            
                            
                                    elementList.add(localClaimManager==null?null:
                                    localClaimManager);
                                } if (localProfileConfigurationManagerTracker){
                            elementList.add(new javax.xml.namespace.QName("http://core.user.carbon.wso2.org/xsd",
                                                                      "profileConfigurationManager"));
                            
                            
                                    elementList.add(localProfileConfigurationManager==null?null:
                                    localProfileConfigurationManager);
                                } if (localRealmConfigurationTracker){
                            elementList.add(new javax.xml.namespace.QName("http://core.user.carbon.wso2.org/xsd",
                                                                      "realmConfiguration"));
                            
                            
                                    elementList.add(localRealmConfiguration==null?null:
                                    localRealmConfiguration);
                                } if (localUserStoreManagerTracker){
                            elementList.add(new javax.xml.namespace.QName("http://core.user.carbon.wso2.org/xsd",
                                                                      "userStoreManager"));
                            
                            
                                    elementList.add(localUserStoreManager==null?null:
                                    localUserStoreManager);
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
        public static UserRealm parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            UserRealm object =
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
                    
                            if (!"UserRealm".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (UserRealm)org.wso2.carbon.registry.core.jdbc.xsd.ExtensionMapper.getTypeObject(
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://core.user.carbon.wso2.org/xsd","authorizationManager").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setAuthorizationManager(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setAuthorizationManager(org.wso2.carbon.user.core.xsd.AuthorizationManager.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://core.user.carbon.wso2.org/xsd","claimManager").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setClaimManager(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setClaimManager(org.wso2.carbon.user.core.claim.xsd.ClaimManager.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://core.user.carbon.wso2.org/xsd","profileConfigurationManager").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setProfileConfigurationManager(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setProfileConfigurationManager(org.wso2.carbon.user.core.profile.xsd.ProfileConfigurationManager.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://core.user.carbon.wso2.org/xsd","realmConfiguration").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setRealmConfiguration(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setRealmConfiguration(org.wso2.carbon.user.api.xsd.RealmConfiguration.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://core.user.carbon.wso2.org/xsd","userStoreManager").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setUserStoreManager(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setUserStoreManager(org.wso2.carbon.user.core.xsd.UserStoreManager.Factory.parse(reader));
                                              
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
           
    
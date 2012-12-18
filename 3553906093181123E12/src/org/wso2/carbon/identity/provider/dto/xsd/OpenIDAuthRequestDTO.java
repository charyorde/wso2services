
/**
 * OpenIDAuthRequestDTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v3  Built on : Oct 26, 2011 (07:42:27 PDT)
 */

            
                package org.wso2.carbon.identity.provider.dto.xsd;
            

            /**
            *  OpenIDAuthRequestDTO bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class OpenIDAuthRequestDTO
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = OpenIDAuthRequestDTO
                Namespace URI = http://dto.provider.identity.carbon.wso2.org/xsd
                Namespace Prefix = ns43
                */
            

                        /**
                        * field for Authenticated
                        */

                        
                                    protected boolean localAuthenticated ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAuthenticatedTracker = false ;

                           public boolean isAuthenticatedSpecified(){
                               return localAuthenticatedTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getAuthenticated(){
                               return localAuthenticated;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Authenticated
                               */
                               public void setAuthenticated(boolean param){
                            
                                       // setting primitive attribute tracker to true
                                       localAuthenticatedTracker =
                                       true;
                                   
                                            this.localAuthenticated=param;
                                    

                               }
                            

                        /**
                        * field for MultiFactorAuthRequested
                        */

                        
                                    protected boolean localMultiFactorAuthRequested ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localMultiFactorAuthRequestedTracker = false ;

                           public boolean isMultiFactorAuthRequestedSpecified(){
                               return localMultiFactorAuthRequestedTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getMultiFactorAuthRequested(){
                               return localMultiFactorAuthRequested;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MultiFactorAuthRequested
                               */
                               public void setMultiFactorAuthRequested(boolean param){
                            
                                       // setting primitive attribute tracker to true
                                       localMultiFactorAuthRequestedTracker =
                                       true;
                                   
                                            this.localMultiFactorAuthRequested=param;
                                    

                               }
                            

                        /**
                        * field for OpLocalId
                        */

                        
                                    protected java.lang.String localOpLocalId ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localOpLocalIdTracker = false ;

                           public boolean isOpLocalIdSpecified(){
                               return localOpLocalIdTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getOpLocalId(){
                               return localOpLocalId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param OpLocalId
                               */
                               public void setOpLocalId(java.lang.String param){
                            localOpLocalIdTracker = true;
                                   
                                            this.localOpLocalId=param;
                                    

                               }
                            

                        /**
                        * field for OpenID
                        */

                        
                                    protected java.lang.String localOpenID ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localOpenIDTracker = false ;

                           public boolean isOpenIDSpecified(){
                               return localOpenIDTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getOpenID(){
                               return localOpenID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param OpenID
                               */
                               public void setOpenID(java.lang.String param){
                            localOpenIDTracker = true;
                                   
                                            this.localOpenID=param;
                                    

                               }
                            

                        /**
                        * field for Params
                        * This was an Array!
                        */

                        
                                    protected org.wso2.carbon.identity.provider.dto.xsd.OpenIDParameterDTO[] localParams ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localParamsTracker = false ;

                           public boolean isParamsSpecified(){
                               return localParamsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return org.wso2.carbon.identity.provider.dto.xsd.OpenIDParameterDTO[]
                           */
                           public  org.wso2.carbon.identity.provider.dto.xsd.OpenIDParameterDTO[] getParams(){
                               return localParams;
                           }

                           
                        


                               
                              /**
                               * validate the array for Params
                               */
                              protected void validateParams(org.wso2.carbon.identity.provider.dto.xsd.OpenIDParameterDTO[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param Params
                              */
                              public void setParams(org.wso2.carbon.identity.provider.dto.xsd.OpenIDParameterDTO[] param){
                              
                                   validateParams(param);

                               localParamsTracker = true;
                                      
                                      this.localParams=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param org.wso2.carbon.identity.provider.dto.xsd.OpenIDParameterDTO
                             */
                             public void addParams(org.wso2.carbon.identity.provider.dto.xsd.OpenIDParameterDTO param){
                                   if (localParams == null){
                                   localParams = new org.wso2.carbon.identity.provider.dto.xsd.OpenIDParameterDTO[]{};
                                   }

                            
                                 //update the setting tracker
                                localParamsTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localParams);
                               list.add(param);
                               this.localParams =
                             (org.wso2.carbon.identity.provider.dto.xsd.OpenIDParameterDTO[])list.toArray(
                            new org.wso2.carbon.identity.provider.dto.xsd.OpenIDParameterDTO[list.size()]);

                             }
                             

                        /**
                        * field for PhishiingResistanceAuthRequest
                        */

                        
                                    protected boolean localPhishiingResistanceAuthRequest ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPhishiingResistanceAuthRequestTracker = false ;

                           public boolean isPhishiingResistanceAuthRequestSpecified(){
                               return localPhishiingResistanceAuthRequestTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getPhishiingResistanceAuthRequest(){
                               return localPhishiingResistanceAuthRequest;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PhishiingResistanceAuthRequest
                               */
                               public void setPhishiingResistanceAuthRequest(boolean param){
                            
                                       // setting primitive attribute tracker to true
                                       localPhishiingResistanceAuthRequestTracker =
                                       true;
                                   
                                            this.localPhishiingResistanceAuthRequest=param;
                                    

                               }
                            

                        /**
                        * field for ProfileName
                        */

                        
                                    protected java.lang.String localProfileName ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localProfileNameTracker = false ;

                           public boolean isProfileNameSpecified(){
                               return localProfileNameTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getProfileName(){
                               return localProfileName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ProfileName
                               */
                               public void setProfileName(java.lang.String param){
                            localProfileNameTracker = true;
                                   
                                            this.localProfileName=param;
                                    

                               }
                            

                        /**
                        * field for UserSelectedClaimedId
                        */

                        
                                    protected java.lang.String localUserSelectedClaimedId ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localUserSelectedClaimedIdTracker = false ;

                           public boolean isUserSelectedClaimedIdSpecified(){
                               return localUserSelectedClaimedIdTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getUserSelectedClaimedId(){
                               return localUserSelectedClaimedId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param UserSelectedClaimedId
                               */
                               public void setUserSelectedClaimedId(java.lang.String param){
                            localUserSelectedClaimedIdTracker = true;
                                   
                                            this.localUserSelectedClaimedId=param;
                                    

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
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://dto.provider.identity.carbon.wso2.org/xsd");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":OpenIDAuthRequestDTO",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "OpenIDAuthRequestDTO",
                           xmlWriter);
                   }

               
                   }
                if (localAuthenticatedTracker){
                                    namespace = "http://dto.provider.identity.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "authenticated", xmlWriter);
                             
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("authenticated cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAuthenticated));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localMultiFactorAuthRequestedTracker){
                                    namespace = "http://dto.provider.identity.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "multiFactorAuthRequested", xmlWriter);
                             
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("multiFactorAuthRequested cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMultiFactorAuthRequested));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localOpLocalIdTracker){
                                    namespace = "http://dto.provider.identity.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "opLocalId", xmlWriter);
                             

                                          if (localOpLocalId==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localOpLocalId);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localOpenIDTracker){
                                    namespace = "http://dto.provider.identity.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "openID", xmlWriter);
                             

                                          if (localOpenID==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localOpenID);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localParamsTracker){
                                       if (localParams!=null){
                                            for (int i = 0;i < localParams.length;i++){
                                                if (localParams[i] != null){
                                                 localParams[i].serialize(new javax.xml.namespace.QName("http://dto.provider.identity.carbon.wso2.org/xsd","params"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                            writeStartElement(null, "http://dto.provider.identity.carbon.wso2.org/xsd", "params", xmlWriter);

                                                           // write the nil attribute
                                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                           xmlWriter.writeEndElement();
                                                    
                                                }

                                            }
                                     } else {
                                        
                                                writeStartElement(null, "http://dto.provider.identity.carbon.wso2.org/xsd", "params", xmlWriter);

                                               // write the nil attribute
                                               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                               xmlWriter.writeEndElement();
                                        
                                    }
                                 } if (localPhishiingResistanceAuthRequestTracker){
                                    namespace = "http://dto.provider.identity.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "phishiingResistanceAuthRequest", xmlWriter);
                             
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("phishiingResistanceAuthRequest cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPhishiingResistanceAuthRequest));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localProfileNameTracker){
                                    namespace = "http://dto.provider.identity.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "profileName", xmlWriter);
                             

                                          if (localProfileName==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localProfileName);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localUserSelectedClaimedIdTracker){
                                    namespace = "http://dto.provider.identity.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "userSelectedClaimedId", xmlWriter);
                             

                                          if (localUserSelectedClaimedId==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localUserSelectedClaimedId);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             }
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://dto.provider.identity.carbon.wso2.org/xsd")){
                return "ns43";
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

                 if (localAuthenticatedTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://dto.provider.identity.carbon.wso2.org/xsd",
                                                                      "authenticated"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAuthenticated));
                            } if (localMultiFactorAuthRequestedTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://dto.provider.identity.carbon.wso2.org/xsd",
                                                                      "multiFactorAuthRequested"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMultiFactorAuthRequested));
                            } if (localOpLocalIdTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://dto.provider.identity.carbon.wso2.org/xsd",
                                                                      "opLocalId"));
                                 
                                         elementList.add(localOpLocalId==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOpLocalId));
                                    } if (localOpenIDTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://dto.provider.identity.carbon.wso2.org/xsd",
                                                                      "openID"));
                                 
                                         elementList.add(localOpenID==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOpenID));
                                    } if (localParamsTracker){
                             if (localParams!=null) {
                                 for (int i = 0;i < localParams.length;i++){

                                    if (localParams[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://dto.provider.identity.carbon.wso2.org/xsd",
                                                                          "params"));
                                         elementList.add(localParams[i]);
                                    } else {
                                        
                                                elementList.add(new javax.xml.namespace.QName("http://dto.provider.identity.carbon.wso2.org/xsd",
                                                                          "params"));
                                                elementList.add(null);
                                            
                                    }

                                 }
                             } else {
                                 
                                        elementList.add(new javax.xml.namespace.QName("http://dto.provider.identity.carbon.wso2.org/xsd",
                                                                          "params"));
                                        elementList.add(localParams);
                                    
                             }

                        } if (localPhishiingResistanceAuthRequestTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://dto.provider.identity.carbon.wso2.org/xsd",
                                                                      "phishiingResistanceAuthRequest"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPhishiingResistanceAuthRequest));
                            } if (localProfileNameTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://dto.provider.identity.carbon.wso2.org/xsd",
                                                                      "profileName"));
                                 
                                         elementList.add(localProfileName==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localProfileName));
                                    } if (localUserSelectedClaimedIdTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://dto.provider.identity.carbon.wso2.org/xsd",
                                                                      "userSelectedClaimedId"));
                                 
                                         elementList.add(localUserSelectedClaimedId==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUserSelectedClaimedId));
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
        public static OpenIDAuthRequestDTO parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            OpenIDAuthRequestDTO object =
                new OpenIDAuthRequestDTO();

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
                    
                            if (!"OpenIDAuthRequestDTO".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (OpenIDAuthRequestDTO)axis2.apache.org.xsd.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                        java.util.ArrayList list5 = new java.util.ArrayList();
                    
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://dto.provider.identity.carbon.wso2.org/xsd","authenticated").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"authenticated" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setAuthenticated(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://dto.provider.identity.carbon.wso2.org/xsd","multiFactorAuthRequested").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"multiFactorAuthRequested" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setMultiFactorAuthRequested(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://dto.provider.identity.carbon.wso2.org/xsd","opLocalId").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setOpLocalId(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://dto.provider.identity.carbon.wso2.org/xsd","openID").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setOpenID(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://dto.provider.identity.carbon.wso2.org/xsd","params").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list5.add(null);
                                                              reader.next();
                                                          } else {
                                                        list5.add(org.wso2.carbon.identity.provider.dto.xsd.OpenIDParameterDTO.Factory.parse(reader));
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
                                                                if (new javax.xml.namespace.QName("http://dto.provider.identity.carbon.wso2.org/xsd","params").equals(reader.getName())){
                                                                    
                                                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                                          list5.add(null);
                                                                          reader.next();
                                                                      } else {
                                                                    list5.add(org.wso2.carbon.identity.provider.dto.xsd.OpenIDParameterDTO.Factory.parse(reader));
                                                                        }
                                                                }else{
                                                                    loopDone5 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setParams((org.wso2.carbon.identity.provider.dto.xsd.OpenIDParameterDTO[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                org.wso2.carbon.identity.provider.dto.xsd.OpenIDParameterDTO.class,
                                                                list5));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://dto.provider.identity.carbon.wso2.org/xsd","phishiingResistanceAuthRequest").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"phishiingResistanceAuthRequest" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPhishiingResistanceAuthRequest(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://dto.provider.identity.carbon.wso2.org/xsd","profileName").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setProfileName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://dto.provider.identity.carbon.wso2.org/xsd","userSelectedClaimedId").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setUserSelectedClaimedId(
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
           
    

/**
 * ServiceMetaData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v3  Built on : Oct 26, 2011 (07:42:27 PDT)
 */

            
                package org.wso2.carbon.cloud.csg.common.xsd;
            

            /**
            *  ServiceMetaData bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ServiceMetaData
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = ServiceMetaData
                Namespace URI = http://common.csg.cloud.carbon.wso2.org/xsd
                Namespace Prefix = ns33
                */
            

                        /**
                        * field for Endpoint
                        */

                        
                                    protected java.lang.String localEndpoint ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localEndpointTracker = false ;

                           public boolean isEndpointSpecified(){
                               return localEndpointTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getEndpoint(){
                               return localEndpoint;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Endpoint
                               */
                               public void setEndpoint(java.lang.String param){
                            localEndpointTracker = true;
                                   
                                            this.localEndpoint=param;
                                    

                               }
                            

                        /**
                        * field for HasInOutMEP
                        */

                        
                                    protected boolean localHasInOutMEP ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localHasInOutMEPTracker = false ;

                           public boolean isHasInOutMEPSpecified(){
                               return localHasInOutMEPTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getHasInOutMEP(){
                               return localHasInOutMEP;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param HasInOutMEP
                               */
                               public void setHasInOutMEP(boolean param){
                            
                                       // setting primitive attribute tracker to true
                                       localHasInOutMEPTracker =
                                       true;
                                   
                                            this.localHasInOutMEP=param;
                                    

                               }
                            

                        /**
                        * field for InLineWSDL
                        */

                        
                                    protected java.lang.String localInLineWSDL ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localInLineWSDLTracker = false ;

                           public boolean isInLineWSDLSpecified(){
                               return localInLineWSDLTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getInLineWSDL(){
                               return localInLineWSDL;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param InLineWSDL
                               */
                               public void setInLineWSDL(java.lang.String param){
                            localInLineWSDLTracker = true;
                                   
                                            this.localInLineWSDL=param;
                                    

                               }
                            

                        /**
                        * field for RmPolicy
                        */

                        
                                    protected java.lang.String localRmPolicy ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRmPolicyTracker = false ;

                           public boolean isRmPolicySpecified(){
                               return localRmPolicyTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getRmPolicy(){
                               return localRmPolicy;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RmPolicy
                               */
                               public void setRmPolicy(java.lang.String param){
                            localRmPolicyTracker = true;
                                   
                                            this.localRmPolicy=param;
                                    

                               }
                            

                        /**
                        * field for SecPolicy
                        */

                        
                                    protected java.lang.String localSecPolicy ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSecPolicyTracker = false ;

                           public boolean isSecPolicySpecified(){
                               return localSecPolicyTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getSecPolicy(){
                               return localSecPolicy;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SecPolicy
                               */
                               public void setSecPolicy(java.lang.String param){
                            localSecPolicyTracker = true;
                                   
                                            this.localSecPolicy=param;
                                    

                               }
                            

                        /**
                        * field for ServiceName
                        */

                        
                                    protected java.lang.String localServiceName ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localServiceNameTracker = false ;

                           public boolean isServiceNameSpecified(){
                               return localServiceNameTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getServiceName(){
                               return localServiceName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ServiceName
                               */
                               public void setServiceName(java.lang.String param){
                            localServiceNameTracker = true;
                                   
                                            this.localServiceName=param;
                                    

                               }
                            

                        /**
                        * field for WsRmEnabled
                        */

                        
                                    protected boolean localWsRmEnabled ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localWsRmEnabledTracker = false ;

                           public boolean isWsRmEnabledSpecified(){
                               return localWsRmEnabledTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getWsRmEnabled(){
                               return localWsRmEnabled;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param WsRmEnabled
                               */
                               public void setWsRmEnabled(boolean param){
                            
                                       // setting primitive attribute tracker to true
                                       localWsRmEnabledTracker =
                                       true;
                                   
                                            this.localWsRmEnabled=param;
                                    

                               }
                            

                        /**
                        * field for WsSecEnabled
                        */

                        
                                    protected boolean localWsSecEnabled ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localWsSecEnabledTracker = false ;

                           public boolean isWsSecEnabledSpecified(){
                               return localWsSecEnabledTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getWsSecEnabled(){
                               return localWsSecEnabled;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param WsSecEnabled
                               */
                               public void setWsSecEnabled(boolean param){
                            
                                       // setting primitive attribute tracker to true
                                       localWsSecEnabledTracker =
                                       true;
                                   
                                            this.localWsSecEnabled=param;
                                    

                               }
                            

                        /**
                        * field for WsdlLocation
                        */

                        
                                    protected java.lang.String localWsdlLocation ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localWsdlLocationTracker = false ;

                           public boolean isWsdlLocationSpecified(){
                               return localWsdlLocationTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getWsdlLocation(){
                               return localWsdlLocation;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param WsdlLocation
                               */
                               public void setWsdlLocation(java.lang.String param){
                            localWsdlLocationTracker = true;
                                   
                                            this.localWsdlLocation=param;
                                    

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
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://common.csg.cloud.carbon.wso2.org/xsd");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":ServiceMetaData",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "ServiceMetaData",
                           xmlWriter);
                   }

               
                   }
                if (localEndpointTracker){
                                    namespace = "http://common.csg.cloud.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "endpoint", xmlWriter);
                             

                                          if (localEndpoint==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localEndpoint);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localHasInOutMEPTracker){
                                    namespace = "http://common.csg.cloud.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "hasInOutMEP", xmlWriter);
                             
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("hasInOutMEP cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localHasInOutMEP));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localInLineWSDLTracker){
                                    namespace = "http://common.csg.cloud.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "inLineWSDL", xmlWriter);
                             

                                          if (localInLineWSDL==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localInLineWSDL);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localRmPolicyTracker){
                                    namespace = "http://common.csg.cloud.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "rmPolicy", xmlWriter);
                             

                                          if (localRmPolicy==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localRmPolicy);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localSecPolicyTracker){
                                    namespace = "http://common.csg.cloud.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "secPolicy", xmlWriter);
                             

                                          if (localSecPolicy==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localSecPolicy);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localServiceNameTracker){
                                    namespace = "http://common.csg.cloud.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "serviceName", xmlWriter);
                             

                                          if (localServiceName==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localServiceName);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localWsRmEnabledTracker){
                                    namespace = "http://common.csg.cloud.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "wsRmEnabled", xmlWriter);
                             
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("wsRmEnabled cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localWsRmEnabled));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localWsSecEnabledTracker){
                                    namespace = "http://common.csg.cloud.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "wsSecEnabled", xmlWriter);
                             
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("wsSecEnabled cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localWsSecEnabled));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localWsdlLocationTracker){
                                    namespace = "http://common.csg.cloud.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "wsdlLocation", xmlWriter);
                             

                                          if (localWsdlLocation==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localWsdlLocation);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             }
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://common.csg.cloud.carbon.wso2.org/xsd")){
                return "ns33";
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

                 if (localEndpointTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://common.csg.cloud.carbon.wso2.org/xsd",
                                                                      "endpoint"));
                                 
                                         elementList.add(localEndpoint==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEndpoint));
                                    } if (localHasInOutMEPTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://common.csg.cloud.carbon.wso2.org/xsd",
                                                                      "hasInOutMEP"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localHasInOutMEP));
                            } if (localInLineWSDLTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://common.csg.cloud.carbon.wso2.org/xsd",
                                                                      "inLineWSDL"));
                                 
                                         elementList.add(localInLineWSDL==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localInLineWSDL));
                                    } if (localRmPolicyTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://common.csg.cloud.carbon.wso2.org/xsd",
                                                                      "rmPolicy"));
                                 
                                         elementList.add(localRmPolicy==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRmPolicy));
                                    } if (localSecPolicyTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://common.csg.cloud.carbon.wso2.org/xsd",
                                                                      "secPolicy"));
                                 
                                         elementList.add(localSecPolicy==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSecPolicy));
                                    } if (localServiceNameTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://common.csg.cloud.carbon.wso2.org/xsd",
                                                                      "serviceName"));
                                 
                                         elementList.add(localServiceName==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localServiceName));
                                    } if (localWsRmEnabledTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://common.csg.cloud.carbon.wso2.org/xsd",
                                                                      "wsRmEnabled"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localWsRmEnabled));
                            } if (localWsSecEnabledTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://common.csg.cloud.carbon.wso2.org/xsd",
                                                                      "wsSecEnabled"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localWsSecEnabled));
                            } if (localWsdlLocationTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://common.csg.cloud.carbon.wso2.org/xsd",
                                                                      "wsdlLocation"));
                                 
                                         elementList.add(localWsdlLocation==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localWsdlLocation));
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
        public static ServiceMetaData parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            ServiceMetaData object =
                new ServiceMetaData();

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
                    
                            if (!"ServiceMetaData".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (ServiceMetaData)org.wso2.carbon.cloud.csg.common.xsd.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://common.csg.cloud.carbon.wso2.org/xsd","endpoint").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setEndpoint(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://common.csg.cloud.carbon.wso2.org/xsd","hasInOutMEP").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"hasInOutMEP" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setHasInOutMEP(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://common.csg.cloud.carbon.wso2.org/xsd","inLineWSDL").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setInLineWSDL(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://common.csg.cloud.carbon.wso2.org/xsd","rmPolicy").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setRmPolicy(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://common.csg.cloud.carbon.wso2.org/xsd","secPolicy").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSecPolicy(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://common.csg.cloud.carbon.wso2.org/xsd","serviceName").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setServiceName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://common.csg.cloud.carbon.wso2.org/xsd","wsRmEnabled").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"wsRmEnabled" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setWsRmEnabled(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://common.csg.cloud.carbon.wso2.org/xsd","wsSecEnabled").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"wsSecEnabled" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setWsSecEnabled(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://common.csg.cloud.carbon.wso2.org/xsd","wsdlLocation").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setWsdlLocation(
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
           
    
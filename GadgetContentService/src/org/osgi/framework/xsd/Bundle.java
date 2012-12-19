
/**
 * Bundle.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v3  Built on : Oct 26, 2011 (07:42:27 PDT)
 */

            
                package org.osgi.framework.xsd;
            

            /**
            *  Bundle bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public abstract class Bundle
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = Bundle
                Namespace URI = http://framework.osgi.org/xsd
                Namespace Prefix = ns91
                */
            

                        /**
                        * field for BundleContext
                        */

                        
                                    protected org.osgi.framework.xsd.BundleContext localBundleContext ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localBundleContextTracker = false ;

                           public boolean isBundleContextSpecified(){
                               return localBundleContextTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return org.osgi.framework.xsd.BundleContext
                           */
                           public  org.osgi.framework.xsd.BundleContext getBundleContext(){
                               return localBundleContext;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param BundleContext
                               */
                               public void setBundleContext(org.osgi.framework.xsd.BundleContext param){
                            localBundleContextTracker = true;
                                   
                                            this.localBundleContext=param;
                                    

                               }
                            

                        /**
                        * field for BundleId
                        */

                        
                                    protected long localBundleId ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localBundleIdTracker = false ;

                           public boolean isBundleIdSpecified(){
                               return localBundleIdTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return long
                           */
                           public  long getBundleId(){
                               return localBundleId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param BundleId
                               */
                               public void setBundleId(long param){
                            
                                       // setting primitive attribute tracker to true
                                       localBundleIdTracker =
                                       param != java.lang.Long.MIN_VALUE;
                                   
                                            this.localBundleId=param;
                                    

                               }
                            

                        /**
                        * field for Headers
                        */

                        
                                    protected java.util.xsd.Dictionary localHeaders ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localHeadersTracker = false ;

                           public boolean isHeadersSpecified(){
                               return localHeadersTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.util.xsd.Dictionary
                           */
                           public  java.util.xsd.Dictionary getHeaders(){
                               return localHeaders;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Headers
                               */
                               public void setHeaders(java.util.xsd.Dictionary param){
                            localHeadersTracker = true;
                                   
                                            this.localHeaders=param;
                                    

                               }
                            

                        /**
                        * field for LastModified
                        */

                        
                                    protected long localLastModified ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localLastModifiedTracker = false ;

                           public boolean isLastModifiedSpecified(){
                               return localLastModifiedTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return long
                           */
                           public  long getLastModified(){
                               return localLastModified;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param LastModified
                               */
                               public void setLastModified(long param){
                            
                                       // setting primitive attribute tracker to true
                                       localLastModifiedTracker =
                                       param != java.lang.Long.MIN_VALUE;
                                   
                                            this.localLastModified=param;
                                    

                               }
                            

                        /**
                        * field for Location
                        */

                        
                                    protected java.lang.String localLocation ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localLocationTracker = false ;

                           public boolean isLocationSpecified(){
                               return localLocationTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getLocation(){
                               return localLocation;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Location
                               */
                               public void setLocation(java.lang.String param){
                            localLocationTracker = true;
                                   
                                            this.localLocation=param;
                                    

                               }
                            

                        /**
                        * field for RegisteredServices
                        * This was an Array!
                        */

                        
                                    protected org.osgi.framework.xsd.ServiceReference[] localRegisteredServices ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRegisteredServicesTracker = false ;

                           public boolean isRegisteredServicesSpecified(){
                               return localRegisteredServicesTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return org.osgi.framework.xsd.ServiceReference[]
                           */
                           public  org.osgi.framework.xsd.ServiceReference[] getRegisteredServices(){
                               return localRegisteredServices;
                           }

                           
                        


                               
                              /**
                               * validate the array for RegisteredServices
                               */
                              protected void validateRegisteredServices(org.osgi.framework.xsd.ServiceReference[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param RegisteredServices
                              */
                              public void setRegisteredServices(org.osgi.framework.xsd.ServiceReference[] param){
                              
                                   validateRegisteredServices(param);

                               localRegisteredServicesTracker = true;
                                      
                                      this.localRegisteredServices=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param org.osgi.framework.xsd.ServiceReference
                             */
                             public void addRegisteredServices(org.osgi.framework.xsd.ServiceReference param){
                                   if (localRegisteredServices == null){
                                   localRegisteredServices = new org.osgi.framework.xsd.ServiceReference[]{};
                                   }

                            
                                 //update the setting tracker
                                localRegisteredServicesTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localRegisteredServices);
                               list.add(param);
                               this.localRegisteredServices =
                             (org.osgi.framework.xsd.ServiceReference[])list.toArray(
                            new org.osgi.framework.xsd.ServiceReference[list.size()]);

                             }
                             

                        /**
                        * field for ServicesInUse
                        * This was an Array!
                        */

                        
                                    protected org.osgi.framework.xsd.ServiceReference[] localServicesInUse ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localServicesInUseTracker = false ;

                           public boolean isServicesInUseSpecified(){
                               return localServicesInUseTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return org.osgi.framework.xsd.ServiceReference[]
                           */
                           public  org.osgi.framework.xsd.ServiceReference[] getServicesInUse(){
                               return localServicesInUse;
                           }

                           
                        


                               
                              /**
                               * validate the array for ServicesInUse
                               */
                              protected void validateServicesInUse(org.osgi.framework.xsd.ServiceReference[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param ServicesInUse
                              */
                              public void setServicesInUse(org.osgi.framework.xsd.ServiceReference[] param){
                              
                                   validateServicesInUse(param);

                               localServicesInUseTracker = true;
                                      
                                      this.localServicesInUse=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param org.osgi.framework.xsd.ServiceReference
                             */
                             public void addServicesInUse(org.osgi.framework.xsd.ServiceReference param){
                                   if (localServicesInUse == null){
                                   localServicesInUse = new org.osgi.framework.xsd.ServiceReference[]{};
                                   }

                            
                                 //update the setting tracker
                                localServicesInUseTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localServicesInUse);
                               list.add(param);
                               this.localServicesInUse =
                             (org.osgi.framework.xsd.ServiceReference[])list.toArray(
                            new org.osgi.framework.xsd.ServiceReference[list.size()]);

                             }
                             

                        /**
                        * field for State
                        */

                        
                                    protected int localState ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localStateTracker = false ;

                           public boolean isStateSpecified(){
                               return localStateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getState(){
                               return localState;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param State
                               */
                               public void setState(int param){
                            
                                       // setting primitive attribute tracker to true
                                       localStateTracker =
                                       param != java.lang.Integer.MIN_VALUE;
                                   
                                            this.localState=param;
                                    

                               }
                            

                        /**
                        * field for SymbolicName
                        */

                        
                                    protected java.lang.String localSymbolicName ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSymbolicNameTracker = false ;

                           public boolean isSymbolicNameSpecified(){
                               return localSymbolicNameTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getSymbolicName(){
                               return localSymbolicName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SymbolicName
                               */
                               public void setSymbolicName(java.lang.String param){
                            localSymbolicNameTracker = true;
                                   
                                            this.localSymbolicName=param;
                                    

                               }
                            

                        /**
                        * field for Version
                        */

                        
                                    protected org.osgi.framework.xsd.Version localVersion ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localVersionTracker = false ;

                           public boolean isVersionSpecified(){
                               return localVersionTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return org.osgi.framework.xsd.Version
                           */
                           public  org.osgi.framework.xsd.Version getVersion(){
                               return localVersion;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Version
                               */
                               public void setVersion(org.osgi.framework.xsd.Version param){
                            localVersionTracker = true;
                                   
                                            this.localVersion=param;
                                    

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
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://framework.osgi.org/xsd");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":Bundle",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "Bundle",
                           xmlWriter);
                   }

               
                   }
                if (localBundleContextTracker){
                                    if (localBundleContext==null){

                                        writeStartElement(null, "http://framework.osgi.org/xsd", "bundleContext", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localBundleContext.serialize(new javax.xml.namespace.QName("http://framework.osgi.org/xsd","bundleContext"),
                                        xmlWriter);
                                    }
                                } if (localBundleIdTracker){
                                    namespace = "http://framework.osgi.org/xsd";
                                    writeStartElement(null, namespace, "bundleId", xmlWriter);
                             
                                               if (localBundleId==java.lang.Long.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("bundleId cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localBundleId));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localHeadersTracker){
                                    if (localHeaders==null){

                                        writeStartElement(null, "http://framework.osgi.org/xsd", "headers", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localHeaders.serialize(new javax.xml.namespace.QName("http://framework.osgi.org/xsd","headers"),
                                        xmlWriter);
                                    }
                                } if (localLastModifiedTracker){
                                    namespace = "http://framework.osgi.org/xsd";
                                    writeStartElement(null, namespace, "lastModified", xmlWriter);
                             
                                               if (localLastModified==java.lang.Long.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("lastModified cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLastModified));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localLocationTracker){
                                    namespace = "http://framework.osgi.org/xsd";
                                    writeStartElement(null, namespace, "location", xmlWriter);
                             

                                          if (localLocation==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localLocation);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localRegisteredServicesTracker){
                                       if (localRegisteredServices!=null){
                                            for (int i = 0;i < localRegisteredServices.length;i++){
                                                if (localRegisteredServices[i] != null){
                                                 localRegisteredServices[i].serialize(new javax.xml.namespace.QName("http://framework.osgi.org/xsd","registeredServices"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                            writeStartElement(null, "http://framework.osgi.org/xsd", "registeredServices", xmlWriter);

                                                           // write the nil attribute
                                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                           xmlWriter.writeEndElement();
                                                    
                                                }

                                            }
                                     } else {
                                        
                                                writeStartElement(null, "http://framework.osgi.org/xsd", "registeredServices", xmlWriter);

                                               // write the nil attribute
                                               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                               xmlWriter.writeEndElement();
                                        
                                    }
                                 } if (localServicesInUseTracker){
                                       if (localServicesInUse!=null){
                                            for (int i = 0;i < localServicesInUse.length;i++){
                                                if (localServicesInUse[i] != null){
                                                 localServicesInUse[i].serialize(new javax.xml.namespace.QName("http://framework.osgi.org/xsd","servicesInUse"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                            writeStartElement(null, "http://framework.osgi.org/xsd", "servicesInUse", xmlWriter);

                                                           // write the nil attribute
                                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                           xmlWriter.writeEndElement();
                                                    
                                                }

                                            }
                                     } else {
                                        
                                                writeStartElement(null, "http://framework.osgi.org/xsd", "servicesInUse", xmlWriter);

                                               // write the nil attribute
                                               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                               xmlWriter.writeEndElement();
                                        
                                    }
                                 } if (localStateTracker){
                                    namespace = "http://framework.osgi.org/xsd";
                                    writeStartElement(null, namespace, "state", xmlWriter);
                             
                                               if (localState==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("state cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localState));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localSymbolicNameTracker){
                                    namespace = "http://framework.osgi.org/xsd";
                                    writeStartElement(null, namespace, "symbolicName", xmlWriter);
                             

                                          if (localSymbolicName==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localSymbolicName);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localVersionTracker){
                                    if (localVersion==null){

                                        writeStartElement(null, "http://framework.osgi.org/xsd", "version", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localVersion.serialize(new javax.xml.namespace.QName("http://framework.osgi.org/xsd","version"),
                                        xmlWriter);
                                    }
                                }
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://framework.osgi.org/xsd")){
                return "ns91";
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

                 if (localBundleContextTracker){
                            elementList.add(new javax.xml.namespace.QName("http://framework.osgi.org/xsd",
                                                                      "bundleContext"));
                            
                            
                                    elementList.add(localBundleContext==null?null:
                                    localBundleContext);
                                } if (localBundleIdTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://framework.osgi.org/xsd",
                                                                      "bundleId"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localBundleId));
                            } if (localHeadersTracker){
                            elementList.add(new javax.xml.namespace.QName("http://framework.osgi.org/xsd",
                                                                      "headers"));
                            
                            
                                    elementList.add(localHeaders==null?null:
                                    localHeaders);
                                } if (localLastModifiedTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://framework.osgi.org/xsd",
                                                                      "lastModified"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLastModified));
                            } if (localLocationTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://framework.osgi.org/xsd",
                                                                      "location"));
                                 
                                         elementList.add(localLocation==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLocation));
                                    } if (localRegisteredServicesTracker){
                             if (localRegisteredServices!=null) {
                                 for (int i = 0;i < localRegisteredServices.length;i++){

                                    if (localRegisteredServices[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://framework.osgi.org/xsd",
                                                                          "registeredServices"));
                                         elementList.add(localRegisteredServices[i]);
                                    } else {
                                        
                                                elementList.add(new javax.xml.namespace.QName("http://framework.osgi.org/xsd",
                                                                          "registeredServices"));
                                                elementList.add(null);
                                            
                                    }

                                 }
                             } else {
                                 
                                        elementList.add(new javax.xml.namespace.QName("http://framework.osgi.org/xsd",
                                                                          "registeredServices"));
                                        elementList.add(localRegisteredServices);
                                    
                             }

                        } if (localServicesInUseTracker){
                             if (localServicesInUse!=null) {
                                 for (int i = 0;i < localServicesInUse.length;i++){

                                    if (localServicesInUse[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://framework.osgi.org/xsd",
                                                                          "servicesInUse"));
                                         elementList.add(localServicesInUse[i]);
                                    } else {
                                        
                                                elementList.add(new javax.xml.namespace.QName("http://framework.osgi.org/xsd",
                                                                          "servicesInUse"));
                                                elementList.add(null);
                                            
                                    }

                                 }
                             } else {
                                 
                                        elementList.add(new javax.xml.namespace.QName("http://framework.osgi.org/xsd",
                                                                          "servicesInUse"));
                                        elementList.add(localServicesInUse);
                                    
                             }

                        } if (localStateTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://framework.osgi.org/xsd",
                                                                      "state"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localState));
                            } if (localSymbolicNameTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://framework.osgi.org/xsd",
                                                                      "symbolicName"));
                                 
                                         elementList.add(localSymbolicName==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSymbolicName));
                                    } if (localVersionTracker){
                            elementList.add(new javax.xml.namespace.QName("http://framework.osgi.org/xsd",
                                                                      "version"));
                            
                            
                                    elementList.add(localVersion==null?null:
                                    localVersion);
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
        public static Bundle parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            Bundle object =
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
                    
                            if (!"Bundle".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (Bundle)org.wso2.carbon.registry.core.jdbc.xsd.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        
                        throw new org.apache.axis2.databinding.ADBException("The an abstract class can not be instantiated !!!");
                    

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                        java.util.ArrayList list6 = new java.util.ArrayList();
                    
                        java.util.ArrayList list7 = new java.util.ArrayList();
                    
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://framework.osgi.org/xsd","bundleContext").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setBundleContext(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setBundleContext(org.osgi.framework.xsd.BundleContext.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://framework.osgi.org/xsd","bundleId").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"bundleId" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setBundleId(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setBundleId(java.lang.Long.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://framework.osgi.org/xsd","headers").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setHeaders(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setHeaders(java.util.xsd.Dictionary.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://framework.osgi.org/xsd","lastModified").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"lastModified" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setLastModified(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setLastModified(java.lang.Long.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://framework.osgi.org/xsd","location").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setLocation(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://framework.osgi.org/xsd","registeredServices").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list6.add(null);
                                                              reader.next();
                                                          } else {
                                                        list6.add(org.osgi.framework.xsd.ServiceReference.Factory.parse(reader));
                                                                }
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone6 = false;
                                                        while(!loopDone6){
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
                                                                loopDone6 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://framework.osgi.org/xsd","registeredServices").equals(reader.getName())){
                                                                    
                                                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                                          list6.add(null);
                                                                          reader.next();
                                                                      } else {
                                                                    list6.add(org.osgi.framework.xsd.ServiceReference.Factory.parse(reader));
                                                                        }
                                                                }else{
                                                                    loopDone6 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setRegisteredServices((org.osgi.framework.xsd.ServiceReference[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                org.osgi.framework.xsd.ServiceReference.class,
                                                                list6));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://framework.osgi.org/xsd","servicesInUse").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list7.add(null);
                                                              reader.next();
                                                          } else {
                                                        list7.add(org.osgi.framework.xsd.ServiceReference.Factory.parse(reader));
                                                                }
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone7 = false;
                                                        while(!loopDone7){
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
                                                                loopDone7 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://framework.osgi.org/xsd","servicesInUse").equals(reader.getName())){
                                                                    
                                                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                                          list7.add(null);
                                                                          reader.next();
                                                                      } else {
                                                                    list7.add(org.osgi.framework.xsd.ServiceReference.Factory.parse(reader));
                                                                        }
                                                                }else{
                                                                    loopDone7 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setServicesInUse((org.osgi.framework.xsd.ServiceReference[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                org.osgi.framework.xsd.ServiceReference.class,
                                                                list7));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://framework.osgi.org/xsd","state").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"state" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setState(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setState(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://framework.osgi.org/xsd","symbolicName").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSymbolicName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://framework.osgi.org/xsd","version").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setVersion(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setVersion(org.osgi.framework.xsd.Version.Factory.parse(reader));
                                              
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
           
    
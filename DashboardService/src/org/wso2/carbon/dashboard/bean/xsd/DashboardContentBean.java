
/**
 * DashboardContentBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v3  Built on : Oct 26, 2011 (07:42:27 PDT)
 */

            
                package org.wso2.carbon.dashboard.bean.xsd;
            

            /**
            *  DashboardContentBean bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class DashboardContentBean
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = DashboardContentBean
                Namespace URI = http://bean.dashboard.carbon.wso2.org/xsd
                Namespace Prefix = ns125
                */
            

                        /**
                        * field for BackendHttpPort
                        */

                        
                                    protected java.lang.String localBackendHttpPort ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localBackendHttpPortTracker = false ;

                           public boolean isBackendHttpPortSpecified(){
                               return localBackendHttpPortTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getBackendHttpPort(){
                               return localBackendHttpPort;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param BackendHttpPort
                               */
                               public void setBackendHttpPort(java.lang.String param){
                            localBackendHttpPortTracker = true;
                                   
                                            this.localBackendHttpPort=param;
                                    

                               }
                            

                        /**
                        * field for DefaultGadgetUrlSet
                        * This was an Array!
                        */

                        
                                    protected java.lang.String[] localDefaultGadgetUrlSet ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDefaultGadgetUrlSetTracker = false ;

                           public boolean isDefaultGadgetUrlSetSpecified(){
                               return localDefaultGadgetUrlSetTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String[]
                           */
                           public  java.lang.String[] getDefaultGadgetUrlSet(){
                               return localDefaultGadgetUrlSet;
                           }

                           
                        


                               
                              /**
                               * validate the array for DefaultGadgetUrlSet
                               */
                              protected void validateDefaultGadgetUrlSet(java.lang.String[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param DefaultGadgetUrlSet
                              */
                              public void setDefaultGadgetUrlSet(java.lang.String[] param){
                              
                                   validateDefaultGadgetUrlSet(param);

                               localDefaultGadgetUrlSetTracker = true;
                                      
                                      this.localDefaultGadgetUrlSet=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param java.lang.String
                             */
                             public void addDefaultGadgetUrlSet(java.lang.String param){
                                   if (localDefaultGadgetUrlSet == null){
                                   localDefaultGadgetUrlSet = new java.lang.String[]{};
                                   }

                            
                                 //update the setting tracker
                                localDefaultGadgetUrlSetTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localDefaultGadgetUrlSet);
                               list.add(param);
                               this.localDefaultGadgetUrlSet =
                             (java.lang.String[])list.toArray(
                            new java.lang.String[list.size()]);

                             }
                             

                        /**
                        * field for PortalCss
                        */

                        
                                    protected java.lang.String localPortalCss ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPortalCssTracker = false ;

                           public boolean isPortalCssSpecified(){
                               return localPortalCssTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getPortalCss(){
                               return localPortalCss;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PortalCss
                               */
                               public void setPortalCss(java.lang.String param){
                            localPortalCssTracker = true;
                                   
                                            this.localPortalCss=param;
                                    

                               }
                            

                        /**
                        * field for ReadOnlyMode
                        */

                        
                                    protected boolean localReadOnlyMode ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localReadOnlyModeTracker = false ;

                           public boolean isReadOnlyModeSpecified(){
                               return localReadOnlyModeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getReadOnlyMode(){
                               return localReadOnlyMode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ReadOnlyMode
                               */
                               public void setReadOnlyMode(boolean param){
                            
                                       // setting primitive attribute tracker to true
                                       localReadOnlyModeTracker =
                                       true;
                                   
                                            this.localReadOnlyMode=param;
                                    

                               }
                            

                        /**
                        * field for TabLayout
                        */

                        
                                    protected java.lang.String localTabLayout ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTabLayoutTracker = false ;

                           public boolean isTabLayoutSpecified(){
                               return localTabLayoutTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getTabLayout(){
                               return localTabLayout;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TabLayout
                               */
                               public void setTabLayout(java.lang.String param){
                            localTabLayoutTracker = true;
                                   
                                            this.localTabLayout=param;
                                    

                               }
                            

                        /**
                        * field for Tabs
                        * This was an Array!
                        */

                        
                                    protected org.wso2.carbon.dashboard.common.bean.xsd.Tab[] localTabs ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTabsTracker = false ;

                           public boolean isTabsSpecified(){
                               return localTabsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return org.wso2.carbon.dashboard.common.bean.xsd.Tab[]
                           */
                           public  org.wso2.carbon.dashboard.common.bean.xsd.Tab[] getTabs(){
                               return localTabs;
                           }

                           
                        


                               
                              /**
                               * validate the array for Tabs
                               */
                              protected void validateTabs(org.wso2.carbon.dashboard.common.bean.xsd.Tab[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param Tabs
                              */
                              public void setTabs(org.wso2.carbon.dashboard.common.bean.xsd.Tab[] param){
                              
                                   validateTabs(param);

                               localTabsTracker = true;
                                      
                                      this.localTabs=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param org.wso2.carbon.dashboard.common.bean.xsd.Tab
                             */
                             public void addTabs(org.wso2.carbon.dashboard.common.bean.xsd.Tab param){
                                   if (localTabs == null){
                                   localTabs = new org.wso2.carbon.dashboard.common.bean.xsd.Tab[]{};
                                   }

                            
                                 //update the setting tracker
                                localTabsTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localTabs);
                               list.add(param);
                               this.localTabs =
                             (org.wso2.carbon.dashboard.common.bean.xsd.Tab[])list.toArray(
                            new org.wso2.carbon.dashboard.common.bean.xsd.Tab[list.size()]);

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
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://bean.dashboard.carbon.wso2.org/xsd");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":DashboardContentBean",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "DashboardContentBean",
                           xmlWriter);
                   }

               
                   }
                if (localBackendHttpPortTracker){
                                    namespace = "http://bean.dashboard.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "backendHttpPort", xmlWriter);
                             

                                          if (localBackendHttpPort==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localBackendHttpPort);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localDefaultGadgetUrlSetTracker){
                             if (localDefaultGadgetUrlSet!=null) {
                                   namespace = "http://bean.dashboard.carbon.wso2.org/xsd";
                                   for (int i = 0;i < localDefaultGadgetUrlSet.length;i++){
                                        
                                            if (localDefaultGadgetUrlSet[i] != null){
                                        
                                                writeStartElement(null, namespace, "defaultGadgetUrlSet", xmlWriter);

                                            
                                                        xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDefaultGadgetUrlSet[i]));
                                                    
                                                xmlWriter.writeEndElement();
                                              
                                                } else {
                                                   
                                                           // write null attribute
                                                            namespace = "http://bean.dashboard.carbon.wso2.org/xsd";
                                                            writeStartElement(null, namespace, "defaultGadgetUrlSet", xmlWriter);
                                                            writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                            xmlWriter.writeEndElement();
                                                       
                                                }

                                   }
                             } else {
                                 
                                         // write the null attribute
                                        // write null attribute
                                           writeStartElement(null, "http://bean.dashboard.carbon.wso2.org/xsd", "defaultGadgetUrlSet", xmlWriter);

                                           // write the nil attribute
                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                           xmlWriter.writeEndElement();
                                    
                             }

                        } if (localPortalCssTracker){
                                    namespace = "http://bean.dashboard.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "portalCss", xmlWriter);
                             

                                          if (localPortalCss==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localPortalCss);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localReadOnlyModeTracker){
                                    namespace = "http://bean.dashboard.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "readOnlyMode", xmlWriter);
                             
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("readOnlyMode cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReadOnlyMode));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localTabLayoutTracker){
                                    namespace = "http://bean.dashboard.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "tabLayout", xmlWriter);
                             

                                          if (localTabLayout==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localTabLayout);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localTabsTracker){
                                       if (localTabs!=null){
                                            for (int i = 0;i < localTabs.length;i++){
                                                if (localTabs[i] != null){
                                                 localTabs[i].serialize(new javax.xml.namespace.QName("http://bean.dashboard.carbon.wso2.org/xsd","tabs"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                            writeStartElement(null, "http://bean.dashboard.carbon.wso2.org/xsd", "tabs", xmlWriter);

                                                           // write the nil attribute
                                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                           xmlWriter.writeEndElement();
                                                    
                                                }

                                            }
                                     } else {
                                        
                                                writeStartElement(null, "http://bean.dashboard.carbon.wso2.org/xsd", "tabs", xmlWriter);

                                               // write the nil attribute
                                               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                               xmlWriter.writeEndElement();
                                        
                                    }
                                 }
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://bean.dashboard.carbon.wso2.org/xsd")){
                return "ns125";
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

                 if (localBackendHttpPortTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://bean.dashboard.carbon.wso2.org/xsd",
                                                                      "backendHttpPort"));
                                 
                                         elementList.add(localBackendHttpPort==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localBackendHttpPort));
                                    } if (localDefaultGadgetUrlSetTracker){
                            if (localDefaultGadgetUrlSet!=null){
                                  for (int i = 0;i < localDefaultGadgetUrlSet.length;i++){
                                      
                                         if (localDefaultGadgetUrlSet[i] != null){
                                          elementList.add(new javax.xml.namespace.QName("http://bean.dashboard.carbon.wso2.org/xsd",
                                                                              "defaultGadgetUrlSet"));
                                          elementList.add(
                                          org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDefaultGadgetUrlSet[i]));
                                          } else {
                                             
                                                    elementList.add(new javax.xml.namespace.QName("http://bean.dashboard.carbon.wso2.org/xsd",
                                                                              "defaultGadgetUrlSet"));
                                                    elementList.add(null);
                                                
                                          }
                                      

                                  }
                            } else {
                              
                                    elementList.add(new javax.xml.namespace.QName("http://bean.dashboard.carbon.wso2.org/xsd",
                                                                              "defaultGadgetUrlSet"));
                                    elementList.add(null);
                                
                            }

                        } if (localPortalCssTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://bean.dashboard.carbon.wso2.org/xsd",
                                                                      "portalCss"));
                                 
                                         elementList.add(localPortalCss==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPortalCss));
                                    } if (localReadOnlyModeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://bean.dashboard.carbon.wso2.org/xsd",
                                                                      "readOnlyMode"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReadOnlyMode));
                            } if (localTabLayoutTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://bean.dashboard.carbon.wso2.org/xsd",
                                                                      "tabLayout"));
                                 
                                         elementList.add(localTabLayout==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTabLayout));
                                    } if (localTabsTracker){
                             if (localTabs!=null) {
                                 for (int i = 0;i < localTabs.length;i++){

                                    if (localTabs[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://bean.dashboard.carbon.wso2.org/xsd",
                                                                          "tabs"));
                                         elementList.add(localTabs[i]);
                                    } else {
                                        
                                                elementList.add(new javax.xml.namespace.QName("http://bean.dashboard.carbon.wso2.org/xsd",
                                                                          "tabs"));
                                                elementList.add(null);
                                            
                                    }

                                 }
                             } else {
                                 
                                        elementList.add(new javax.xml.namespace.QName("http://bean.dashboard.carbon.wso2.org/xsd",
                                                                          "tabs"));
                                        elementList.add(localTabs);
                                    
                             }

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
        public static DashboardContentBean parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            DashboardContentBean object =
                new DashboardContentBean();

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
                    
                            if (!"DashboardContentBean".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (DashboardContentBean)org.wso2.carbon.dashboard.bean.xsd.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                        java.util.ArrayList list2 = new java.util.ArrayList();
                    
                        java.util.ArrayList list6 = new java.util.ArrayList();
                    
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://bean.dashboard.carbon.wso2.org/xsd","backendHttpPort").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setBackendHttpPort(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://bean.dashboard.carbon.wso2.org/xsd","defaultGadgetUrlSet").equals(reader.getName())){
                                
                                    
                                    
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
                                                    if (new javax.xml.namespace.QName("http://bean.dashboard.carbon.wso2.org/xsd","defaultGadgetUrlSet").equals(reader.getName())){
                                                         
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
                                            
                                                    object.setDefaultGadgetUrlSet((java.lang.String[])
                                                        list2.toArray(new java.lang.String[list2.size()]));
                                                
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://bean.dashboard.carbon.wso2.org/xsd","portalCss").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPortalCss(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://bean.dashboard.carbon.wso2.org/xsd","readOnlyMode").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"readOnlyMode" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setReadOnlyMode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://bean.dashboard.carbon.wso2.org/xsd","tabLayout").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTabLayout(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://bean.dashboard.carbon.wso2.org/xsd","tabs").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list6.add(null);
                                                              reader.next();
                                                          } else {
                                                        list6.add(org.wso2.carbon.dashboard.common.bean.xsd.Tab.Factory.parse(reader));
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
                                                                if (new javax.xml.namespace.QName("http://bean.dashboard.carbon.wso2.org/xsd","tabs").equals(reader.getName())){
                                                                    
                                                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                                          list6.add(null);
                                                                          reader.next();
                                                                      } else {
                                                                    list6.add(org.wso2.carbon.dashboard.common.bean.xsd.Tab.Factory.parse(reader));
                                                                        }
                                                                }else{
                                                                    loopDone6 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setTabs((org.wso2.carbon.dashboard.common.bean.xsd.Tab[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                org.wso2.carbon.dashboard.common.bean.xsd.Tab.class,
                                                                list6));
                                                            
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
           
    
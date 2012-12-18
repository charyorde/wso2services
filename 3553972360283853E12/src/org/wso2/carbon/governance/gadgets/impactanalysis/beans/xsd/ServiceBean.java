
/**
 * ServiceBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v3  Built on : Oct 26, 2011 (07:42:27 PDT)
 */

            
                package org.wso2.carbon.governance.gadgets.impactanalysis.beans.xsd;
            

            /**
            *  ServiceBean bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ServiceBean
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = ServiceBean
                Namespace URI = http://beans.impactanalysis.gadgets.governance.carbon.wso2.org/xsd
                Namespace Prefix = ns70
                */
            

                        /**
                        * field for Id
                        */

                        
                                    protected java.lang.String localId ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localIdTracker = false ;

                           public boolean isIdSpecified(){
                               return localIdTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getId(){
                               return localId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Id
                               */
                               public void setId(java.lang.String param){
                            localIdTracker = true;
                                   
                                            this.localId=param;
                                    

                               }
                            

                        /**
                        * field for Path
                        */

                        
                                    protected java.lang.String localPath ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPathTracker = false ;

                           public boolean isPathSpecified(){
                               return localPathTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getPath(){
                               return localPath;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Path
                               */
                               public void setPath(java.lang.String param){
                            localPathTracker = true;
                                   
                                            this.localPath=param;
                                    

                               }
                            

                        /**
                        * field for PolicyBeans
                        * This was an Array!
                        */

                        
                                    protected org.wso2.carbon.governance.gadgets.impactanalysis.beans.xsd.PolicyBean[] localPolicyBeans ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPolicyBeansTracker = false ;

                           public boolean isPolicyBeansSpecified(){
                               return localPolicyBeansTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return org.wso2.carbon.governance.gadgets.impactanalysis.beans.xsd.PolicyBean[]
                           */
                           public  org.wso2.carbon.governance.gadgets.impactanalysis.beans.xsd.PolicyBean[] getPolicyBeans(){
                               return localPolicyBeans;
                           }

                           
                        


                               
                              /**
                               * validate the array for PolicyBeans
                               */
                              protected void validatePolicyBeans(org.wso2.carbon.governance.gadgets.impactanalysis.beans.xsd.PolicyBean[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param PolicyBeans
                              */
                              public void setPolicyBeans(org.wso2.carbon.governance.gadgets.impactanalysis.beans.xsd.PolicyBean[] param){
                              
                                   validatePolicyBeans(param);

                               localPolicyBeansTracker = true;
                                      
                                      this.localPolicyBeans=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param org.wso2.carbon.governance.gadgets.impactanalysis.beans.xsd.PolicyBean
                             */
                             public void addPolicyBeans(org.wso2.carbon.governance.gadgets.impactanalysis.beans.xsd.PolicyBean param){
                                   if (localPolicyBeans == null){
                                   localPolicyBeans = new org.wso2.carbon.governance.gadgets.impactanalysis.beans.xsd.PolicyBean[]{};
                                   }

                            
                                 //update the setting tracker
                                localPolicyBeansTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localPolicyBeans);
                               list.add(param);
                               this.localPolicyBeans =
                             (org.wso2.carbon.governance.gadgets.impactanalysis.beans.xsd.PolicyBean[])list.toArray(
                            new org.wso2.carbon.governance.gadgets.impactanalysis.beans.xsd.PolicyBean[list.size()]);

                             }
                             

                        /**
                        * field for QName
                        */

                        
                                    protected java.lang.String localQName ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localQNameTracker = false ;

                           public boolean isQNameSpecified(){
                               return localQNameTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getQName(){
                               return localQName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param QName
                               */
                               public void setQName(java.lang.String param){
                            localQNameTracker = true;
                                   
                                            this.localQName=param;
                                    

                               }
                            

                        /**
                        * field for SchemaBeans
                        * This was an Array!
                        */

                        
                                    protected org.wso2.carbon.governance.gadgets.impactanalysis.beans.xsd.SchemaBean[] localSchemaBeans ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSchemaBeansTracker = false ;

                           public boolean isSchemaBeansSpecified(){
                               return localSchemaBeansTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return org.wso2.carbon.governance.gadgets.impactanalysis.beans.xsd.SchemaBean[]
                           */
                           public  org.wso2.carbon.governance.gadgets.impactanalysis.beans.xsd.SchemaBean[] getSchemaBeans(){
                               return localSchemaBeans;
                           }

                           
                        


                               
                              /**
                               * validate the array for SchemaBeans
                               */
                              protected void validateSchemaBeans(org.wso2.carbon.governance.gadgets.impactanalysis.beans.xsd.SchemaBean[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param SchemaBeans
                              */
                              public void setSchemaBeans(org.wso2.carbon.governance.gadgets.impactanalysis.beans.xsd.SchemaBean[] param){
                              
                                   validateSchemaBeans(param);

                               localSchemaBeansTracker = true;
                                      
                                      this.localSchemaBeans=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param org.wso2.carbon.governance.gadgets.impactanalysis.beans.xsd.SchemaBean
                             */
                             public void addSchemaBeans(org.wso2.carbon.governance.gadgets.impactanalysis.beans.xsd.SchemaBean param){
                                   if (localSchemaBeans == null){
                                   localSchemaBeans = new org.wso2.carbon.governance.gadgets.impactanalysis.beans.xsd.SchemaBean[]{};
                                   }

                            
                                 //update the setting tracker
                                localSchemaBeansTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localSchemaBeans);
                               list.add(param);
                               this.localSchemaBeans =
                             (org.wso2.carbon.governance.gadgets.impactanalysis.beans.xsd.SchemaBean[])list.toArray(
                            new org.wso2.carbon.governance.gadgets.impactanalysis.beans.xsd.SchemaBean[list.size()]);

                             }
                             

                        /**
                        * field for WsdlBeans
                        * This was an Array!
                        */

                        
                                    protected org.wso2.carbon.governance.gadgets.impactanalysis.beans.xsd.WSDLBean[] localWsdlBeans ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localWsdlBeansTracker = false ;

                           public boolean isWsdlBeansSpecified(){
                               return localWsdlBeansTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return org.wso2.carbon.governance.gadgets.impactanalysis.beans.xsd.WSDLBean[]
                           */
                           public  org.wso2.carbon.governance.gadgets.impactanalysis.beans.xsd.WSDLBean[] getWsdlBeans(){
                               return localWsdlBeans;
                           }

                           
                        


                               
                              /**
                               * validate the array for WsdlBeans
                               */
                              protected void validateWsdlBeans(org.wso2.carbon.governance.gadgets.impactanalysis.beans.xsd.WSDLBean[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param WsdlBeans
                              */
                              public void setWsdlBeans(org.wso2.carbon.governance.gadgets.impactanalysis.beans.xsd.WSDLBean[] param){
                              
                                   validateWsdlBeans(param);

                               localWsdlBeansTracker = true;
                                      
                                      this.localWsdlBeans=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param org.wso2.carbon.governance.gadgets.impactanalysis.beans.xsd.WSDLBean
                             */
                             public void addWsdlBeans(org.wso2.carbon.governance.gadgets.impactanalysis.beans.xsd.WSDLBean param){
                                   if (localWsdlBeans == null){
                                   localWsdlBeans = new org.wso2.carbon.governance.gadgets.impactanalysis.beans.xsd.WSDLBean[]{};
                                   }

                            
                                 //update the setting tracker
                                localWsdlBeansTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localWsdlBeans);
                               list.add(param);
                               this.localWsdlBeans =
                             (org.wso2.carbon.governance.gadgets.impactanalysis.beans.xsd.WSDLBean[])list.toArray(
                            new org.wso2.carbon.governance.gadgets.impactanalysis.beans.xsd.WSDLBean[list.size()]);

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
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://beans.impactanalysis.gadgets.governance.carbon.wso2.org/xsd");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":ServiceBean",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "ServiceBean",
                           xmlWriter);
                   }

               
                   }
                if (localIdTracker){
                                    namespace = "http://beans.impactanalysis.gadgets.governance.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "id", xmlWriter);
                             

                                          if (localId==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localId);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPathTracker){
                                    namespace = "http://beans.impactanalysis.gadgets.governance.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "path", xmlWriter);
                             

                                          if (localPath==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localPath);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPolicyBeansTracker){
                                       if (localPolicyBeans!=null){
                                            for (int i = 0;i < localPolicyBeans.length;i++){
                                                if (localPolicyBeans[i] != null){
                                                 localPolicyBeans[i].serialize(new javax.xml.namespace.QName("http://beans.impactanalysis.gadgets.governance.carbon.wso2.org/xsd","policyBeans"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                            writeStartElement(null, "http://beans.impactanalysis.gadgets.governance.carbon.wso2.org/xsd", "policyBeans", xmlWriter);

                                                           // write the nil attribute
                                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                           xmlWriter.writeEndElement();
                                                    
                                                }

                                            }
                                     } else {
                                        
                                                writeStartElement(null, "http://beans.impactanalysis.gadgets.governance.carbon.wso2.org/xsd", "policyBeans", xmlWriter);

                                               // write the nil attribute
                                               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                               xmlWriter.writeEndElement();
                                        
                                    }
                                 } if (localQNameTracker){
                                    namespace = "http://beans.impactanalysis.gadgets.governance.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "qName", xmlWriter);
                             

                                          if (localQName==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localQName);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localSchemaBeansTracker){
                                       if (localSchemaBeans!=null){
                                            for (int i = 0;i < localSchemaBeans.length;i++){
                                                if (localSchemaBeans[i] != null){
                                                 localSchemaBeans[i].serialize(new javax.xml.namespace.QName("http://beans.impactanalysis.gadgets.governance.carbon.wso2.org/xsd","schemaBeans"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                            writeStartElement(null, "http://beans.impactanalysis.gadgets.governance.carbon.wso2.org/xsd", "schemaBeans", xmlWriter);

                                                           // write the nil attribute
                                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                           xmlWriter.writeEndElement();
                                                    
                                                }

                                            }
                                     } else {
                                        
                                                writeStartElement(null, "http://beans.impactanalysis.gadgets.governance.carbon.wso2.org/xsd", "schemaBeans", xmlWriter);

                                               // write the nil attribute
                                               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                               xmlWriter.writeEndElement();
                                        
                                    }
                                 } if (localWsdlBeansTracker){
                                       if (localWsdlBeans!=null){
                                            for (int i = 0;i < localWsdlBeans.length;i++){
                                                if (localWsdlBeans[i] != null){
                                                 localWsdlBeans[i].serialize(new javax.xml.namespace.QName("http://beans.impactanalysis.gadgets.governance.carbon.wso2.org/xsd","wsdlBeans"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                            writeStartElement(null, "http://beans.impactanalysis.gadgets.governance.carbon.wso2.org/xsd", "wsdlBeans", xmlWriter);

                                                           // write the nil attribute
                                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                           xmlWriter.writeEndElement();
                                                    
                                                }

                                            }
                                     } else {
                                        
                                                writeStartElement(null, "http://beans.impactanalysis.gadgets.governance.carbon.wso2.org/xsd", "wsdlBeans", xmlWriter);

                                               // write the nil attribute
                                               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                               xmlWriter.writeEndElement();
                                        
                                    }
                                 }
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://beans.impactanalysis.gadgets.governance.carbon.wso2.org/xsd")){
                return "ns70";
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

                 if (localIdTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://beans.impactanalysis.gadgets.governance.carbon.wso2.org/xsd",
                                                                      "id"));
                                 
                                         elementList.add(localId==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localId));
                                    } if (localPathTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://beans.impactanalysis.gadgets.governance.carbon.wso2.org/xsd",
                                                                      "path"));
                                 
                                         elementList.add(localPath==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPath));
                                    } if (localPolicyBeansTracker){
                             if (localPolicyBeans!=null) {
                                 for (int i = 0;i < localPolicyBeans.length;i++){

                                    if (localPolicyBeans[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://beans.impactanalysis.gadgets.governance.carbon.wso2.org/xsd",
                                                                          "policyBeans"));
                                         elementList.add(localPolicyBeans[i]);
                                    } else {
                                        
                                                elementList.add(new javax.xml.namespace.QName("http://beans.impactanalysis.gadgets.governance.carbon.wso2.org/xsd",
                                                                          "policyBeans"));
                                                elementList.add(null);
                                            
                                    }

                                 }
                             } else {
                                 
                                        elementList.add(new javax.xml.namespace.QName("http://beans.impactanalysis.gadgets.governance.carbon.wso2.org/xsd",
                                                                          "policyBeans"));
                                        elementList.add(localPolicyBeans);
                                    
                             }

                        } if (localQNameTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://beans.impactanalysis.gadgets.governance.carbon.wso2.org/xsd",
                                                                      "qName"));
                                 
                                         elementList.add(localQName==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localQName));
                                    } if (localSchemaBeansTracker){
                             if (localSchemaBeans!=null) {
                                 for (int i = 0;i < localSchemaBeans.length;i++){

                                    if (localSchemaBeans[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://beans.impactanalysis.gadgets.governance.carbon.wso2.org/xsd",
                                                                          "schemaBeans"));
                                         elementList.add(localSchemaBeans[i]);
                                    } else {
                                        
                                                elementList.add(new javax.xml.namespace.QName("http://beans.impactanalysis.gadgets.governance.carbon.wso2.org/xsd",
                                                                          "schemaBeans"));
                                                elementList.add(null);
                                            
                                    }

                                 }
                             } else {
                                 
                                        elementList.add(new javax.xml.namespace.QName("http://beans.impactanalysis.gadgets.governance.carbon.wso2.org/xsd",
                                                                          "schemaBeans"));
                                        elementList.add(localSchemaBeans);
                                    
                             }

                        } if (localWsdlBeansTracker){
                             if (localWsdlBeans!=null) {
                                 for (int i = 0;i < localWsdlBeans.length;i++){

                                    if (localWsdlBeans[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://beans.impactanalysis.gadgets.governance.carbon.wso2.org/xsd",
                                                                          "wsdlBeans"));
                                         elementList.add(localWsdlBeans[i]);
                                    } else {
                                        
                                                elementList.add(new javax.xml.namespace.QName("http://beans.impactanalysis.gadgets.governance.carbon.wso2.org/xsd",
                                                                          "wsdlBeans"));
                                                elementList.add(null);
                                            
                                    }

                                 }
                             } else {
                                 
                                        elementList.add(new javax.xml.namespace.QName("http://beans.impactanalysis.gadgets.governance.carbon.wso2.org/xsd",
                                                                          "wsdlBeans"));
                                        elementList.add(localWsdlBeans);
                                    
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
        public static ServiceBean parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            ServiceBean object =
                new ServiceBean();

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
                    
                            if (!"ServiceBean".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (ServiceBean)axis2.apache.org.xsd.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                        java.util.ArrayList list3 = new java.util.ArrayList();
                    
                        java.util.ArrayList list5 = new java.util.ArrayList();
                    
                        java.util.ArrayList list6 = new java.util.ArrayList();
                    
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://beans.impactanalysis.gadgets.governance.carbon.wso2.org/xsd","id").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setId(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://beans.impactanalysis.gadgets.governance.carbon.wso2.org/xsd","path").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPath(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://beans.impactanalysis.gadgets.governance.carbon.wso2.org/xsd","policyBeans").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list3.add(null);
                                                              reader.next();
                                                          } else {
                                                        list3.add(org.wso2.carbon.governance.gadgets.impactanalysis.beans.xsd.PolicyBean.Factory.parse(reader));
                                                                }
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone3 = false;
                                                        while(!loopDone3){
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
                                                                loopDone3 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://beans.impactanalysis.gadgets.governance.carbon.wso2.org/xsd","policyBeans").equals(reader.getName())){
                                                                    
                                                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                                          list3.add(null);
                                                                          reader.next();
                                                                      } else {
                                                                    list3.add(org.wso2.carbon.governance.gadgets.impactanalysis.beans.xsd.PolicyBean.Factory.parse(reader));
                                                                        }
                                                                }else{
                                                                    loopDone3 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setPolicyBeans((org.wso2.carbon.governance.gadgets.impactanalysis.beans.xsd.PolicyBean[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                org.wso2.carbon.governance.gadgets.impactanalysis.beans.xsd.PolicyBean.class,
                                                                list3));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://beans.impactanalysis.gadgets.governance.carbon.wso2.org/xsd","qName").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setQName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://beans.impactanalysis.gadgets.governance.carbon.wso2.org/xsd","schemaBeans").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list5.add(null);
                                                              reader.next();
                                                          } else {
                                                        list5.add(org.wso2.carbon.governance.gadgets.impactanalysis.beans.xsd.SchemaBean.Factory.parse(reader));
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
                                                                if (new javax.xml.namespace.QName("http://beans.impactanalysis.gadgets.governance.carbon.wso2.org/xsd","schemaBeans").equals(reader.getName())){
                                                                    
                                                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                                          list5.add(null);
                                                                          reader.next();
                                                                      } else {
                                                                    list5.add(org.wso2.carbon.governance.gadgets.impactanalysis.beans.xsd.SchemaBean.Factory.parse(reader));
                                                                        }
                                                                }else{
                                                                    loopDone5 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setSchemaBeans((org.wso2.carbon.governance.gadgets.impactanalysis.beans.xsd.SchemaBean[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                org.wso2.carbon.governance.gadgets.impactanalysis.beans.xsd.SchemaBean.class,
                                                                list5));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://beans.impactanalysis.gadgets.governance.carbon.wso2.org/xsd","wsdlBeans").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list6.add(null);
                                                              reader.next();
                                                          } else {
                                                        list6.add(org.wso2.carbon.governance.gadgets.impactanalysis.beans.xsd.WSDLBean.Factory.parse(reader));
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
                                                                if (new javax.xml.namespace.QName("http://beans.impactanalysis.gadgets.governance.carbon.wso2.org/xsd","wsdlBeans").equals(reader.getName())){
                                                                    
                                                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                                          list6.add(null);
                                                                          reader.next();
                                                                      } else {
                                                                    list6.add(org.wso2.carbon.governance.gadgets.impactanalysis.beans.xsd.WSDLBean.Factory.parse(reader));
                                                                        }
                                                                }else{
                                                                    loopDone6 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setWsdlBeans((org.wso2.carbon.governance.gadgets.impactanalysis.beans.xsd.WSDLBean[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                org.wso2.carbon.governance.gadgets.impactanalysis.beans.xsd.WSDLBean.class,
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
           
    
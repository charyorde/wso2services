
/**
 * WSDLBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v3  Built on : Oct 26, 2011 (07:42:27 PDT)
 */

            
                package org.wso2.carbon.governance.gadgets.impactanalysis.beans.xsd;
            

            /**
            *  WSDLBean bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class WSDLBean
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = WSDLBean
                Namespace URI = http://beans.impactanalysis.gadgets.governance.carbon.wso2.org/xsd
                Namespace Prefix = ns70
                */
            

                        /**
                        * field for AttachedPolicies
                        * This was an Array!
                        */

                        
                                    protected org.wso2.carbon.governance.gadgets.impactanalysis.beans.xsd.PolicyBean[] localAttachedPolicies ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAttachedPoliciesTracker = false ;

                           public boolean isAttachedPoliciesSpecified(){
                               return localAttachedPoliciesTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return org.wso2.carbon.governance.gadgets.impactanalysis.beans.xsd.PolicyBean[]
                           */
                           public  org.wso2.carbon.governance.gadgets.impactanalysis.beans.xsd.PolicyBean[] getAttachedPolicies(){
                               return localAttachedPolicies;
                           }

                           
                        


                               
                              /**
                               * validate the array for AttachedPolicies
                               */
                              protected void validateAttachedPolicies(org.wso2.carbon.governance.gadgets.impactanalysis.beans.xsd.PolicyBean[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param AttachedPolicies
                              */
                              public void setAttachedPolicies(org.wso2.carbon.governance.gadgets.impactanalysis.beans.xsd.PolicyBean[] param){
                              
                                   validateAttachedPolicies(param);

                               localAttachedPoliciesTracker = true;
                                      
                                      this.localAttachedPolicies=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param org.wso2.carbon.governance.gadgets.impactanalysis.beans.xsd.PolicyBean
                             */
                             public void addAttachedPolicies(org.wso2.carbon.governance.gadgets.impactanalysis.beans.xsd.PolicyBean param){
                                   if (localAttachedPolicies == null){
                                   localAttachedPolicies = new org.wso2.carbon.governance.gadgets.impactanalysis.beans.xsd.PolicyBean[]{};
                                   }

                            
                                 //update the setting tracker
                                localAttachedPoliciesTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localAttachedPolicies);
                               list.add(param);
                               this.localAttachedPolicies =
                             (org.wso2.carbon.governance.gadgets.impactanalysis.beans.xsd.PolicyBean[])list.toArray(
                            new org.wso2.carbon.governance.gadgets.impactanalysis.beans.xsd.PolicyBean[list.size()]);

                             }
                             

                        /**
                        * field for AttachedSchemas
                        * This was an Array!
                        */

                        
                                    protected org.wso2.carbon.governance.gadgets.impactanalysis.beans.xsd.SchemaBean[] localAttachedSchemas ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAttachedSchemasTracker = false ;

                           public boolean isAttachedSchemasSpecified(){
                               return localAttachedSchemasTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return org.wso2.carbon.governance.gadgets.impactanalysis.beans.xsd.SchemaBean[]
                           */
                           public  org.wso2.carbon.governance.gadgets.impactanalysis.beans.xsd.SchemaBean[] getAttachedSchemas(){
                               return localAttachedSchemas;
                           }

                           
                        


                               
                              /**
                               * validate the array for AttachedSchemas
                               */
                              protected void validateAttachedSchemas(org.wso2.carbon.governance.gadgets.impactanalysis.beans.xsd.SchemaBean[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param AttachedSchemas
                              */
                              public void setAttachedSchemas(org.wso2.carbon.governance.gadgets.impactanalysis.beans.xsd.SchemaBean[] param){
                              
                                   validateAttachedSchemas(param);

                               localAttachedSchemasTracker = true;
                                      
                                      this.localAttachedSchemas=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param org.wso2.carbon.governance.gadgets.impactanalysis.beans.xsd.SchemaBean
                             */
                             public void addAttachedSchemas(org.wso2.carbon.governance.gadgets.impactanalysis.beans.xsd.SchemaBean param){
                                   if (localAttachedSchemas == null){
                                   localAttachedSchemas = new org.wso2.carbon.governance.gadgets.impactanalysis.beans.xsd.SchemaBean[]{};
                                   }

                            
                                 //update the setting tracker
                                localAttachedSchemasTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localAttachedSchemas);
                               list.add(param);
                               this.localAttachedSchemas =
                             (org.wso2.carbon.governance.gadgets.impactanalysis.beans.xsd.SchemaBean[])list.toArray(
                            new org.wso2.carbon.governance.gadgets.impactanalysis.beans.xsd.SchemaBean[list.size()]);

                             }
                             

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
                           namespacePrefix+":WSDLBean",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "WSDLBean",
                           xmlWriter);
                   }

               
                   }
                if (localAttachedPoliciesTracker){
                                       if (localAttachedPolicies!=null){
                                            for (int i = 0;i < localAttachedPolicies.length;i++){
                                                if (localAttachedPolicies[i] != null){
                                                 localAttachedPolicies[i].serialize(new javax.xml.namespace.QName("http://beans.impactanalysis.gadgets.governance.carbon.wso2.org/xsd","attachedPolicies"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                            writeStartElement(null, "http://beans.impactanalysis.gadgets.governance.carbon.wso2.org/xsd", "attachedPolicies", xmlWriter);

                                                           // write the nil attribute
                                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                           xmlWriter.writeEndElement();
                                                    
                                                }

                                            }
                                     } else {
                                        
                                                writeStartElement(null, "http://beans.impactanalysis.gadgets.governance.carbon.wso2.org/xsd", "attachedPolicies", xmlWriter);

                                               // write the nil attribute
                                               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                               xmlWriter.writeEndElement();
                                        
                                    }
                                 } if (localAttachedSchemasTracker){
                                       if (localAttachedSchemas!=null){
                                            for (int i = 0;i < localAttachedSchemas.length;i++){
                                                if (localAttachedSchemas[i] != null){
                                                 localAttachedSchemas[i].serialize(new javax.xml.namespace.QName("http://beans.impactanalysis.gadgets.governance.carbon.wso2.org/xsd","attachedSchemas"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                            writeStartElement(null, "http://beans.impactanalysis.gadgets.governance.carbon.wso2.org/xsd", "attachedSchemas", xmlWriter);

                                                           // write the nil attribute
                                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                           xmlWriter.writeEndElement();
                                                    
                                                }

                                            }
                                     } else {
                                        
                                                writeStartElement(null, "http://beans.impactanalysis.gadgets.governance.carbon.wso2.org/xsd", "attachedSchemas", xmlWriter);

                                               // write the nil attribute
                                               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                               xmlWriter.writeEndElement();
                                        
                                    }
                                 } if (localIdTracker){
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

                 if (localAttachedPoliciesTracker){
                             if (localAttachedPolicies!=null) {
                                 for (int i = 0;i < localAttachedPolicies.length;i++){

                                    if (localAttachedPolicies[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://beans.impactanalysis.gadgets.governance.carbon.wso2.org/xsd",
                                                                          "attachedPolicies"));
                                         elementList.add(localAttachedPolicies[i]);
                                    } else {
                                        
                                                elementList.add(new javax.xml.namespace.QName("http://beans.impactanalysis.gadgets.governance.carbon.wso2.org/xsd",
                                                                          "attachedPolicies"));
                                                elementList.add(null);
                                            
                                    }

                                 }
                             } else {
                                 
                                        elementList.add(new javax.xml.namespace.QName("http://beans.impactanalysis.gadgets.governance.carbon.wso2.org/xsd",
                                                                          "attachedPolicies"));
                                        elementList.add(localAttachedPolicies);
                                    
                             }

                        } if (localAttachedSchemasTracker){
                             if (localAttachedSchemas!=null) {
                                 for (int i = 0;i < localAttachedSchemas.length;i++){

                                    if (localAttachedSchemas[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://beans.impactanalysis.gadgets.governance.carbon.wso2.org/xsd",
                                                                          "attachedSchemas"));
                                         elementList.add(localAttachedSchemas[i]);
                                    } else {
                                        
                                                elementList.add(new javax.xml.namespace.QName("http://beans.impactanalysis.gadgets.governance.carbon.wso2.org/xsd",
                                                                          "attachedSchemas"));
                                                elementList.add(null);
                                            
                                    }

                                 }
                             } else {
                                 
                                        elementList.add(new javax.xml.namespace.QName("http://beans.impactanalysis.gadgets.governance.carbon.wso2.org/xsd",
                                                                          "attachedSchemas"));
                                        elementList.add(localAttachedSchemas);
                                    
                             }

                        } if (localIdTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://beans.impactanalysis.gadgets.governance.carbon.wso2.org/xsd",
                                                                      "id"));
                                 
                                         elementList.add(localId==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localId));
                                    } if (localPathTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://beans.impactanalysis.gadgets.governance.carbon.wso2.org/xsd",
                                                                      "path"));
                                 
                                         elementList.add(localPath==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPath));
                                    } if (localQNameTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://beans.impactanalysis.gadgets.governance.carbon.wso2.org/xsd",
                                                                      "qName"));
                                 
                                         elementList.add(localQName==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localQName));
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
        public static WSDLBean parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            WSDLBean object =
                new WSDLBean();

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
                    
                            if (!"WSDLBean".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (WSDLBean)axis2.apache.org.xsd.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                        java.util.ArrayList list1 = new java.util.ArrayList();
                    
                        java.util.ArrayList list2 = new java.util.ArrayList();
                    
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://beans.impactanalysis.gadgets.governance.carbon.wso2.org/xsd","attachedPolicies").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list1.add(null);
                                                              reader.next();
                                                          } else {
                                                        list1.add(org.wso2.carbon.governance.gadgets.impactanalysis.beans.xsd.PolicyBean.Factory.parse(reader));
                                                                }
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone1 = false;
                                                        while(!loopDone1){
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
                                                                loopDone1 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://beans.impactanalysis.gadgets.governance.carbon.wso2.org/xsd","attachedPolicies").equals(reader.getName())){
                                                                    
                                                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                                          list1.add(null);
                                                                          reader.next();
                                                                      } else {
                                                                    list1.add(org.wso2.carbon.governance.gadgets.impactanalysis.beans.xsd.PolicyBean.Factory.parse(reader));
                                                                        }
                                                                }else{
                                                                    loopDone1 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setAttachedPolicies((org.wso2.carbon.governance.gadgets.impactanalysis.beans.xsd.PolicyBean[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                org.wso2.carbon.governance.gadgets.impactanalysis.beans.xsd.PolicyBean.class,
                                                                list1));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://beans.impactanalysis.gadgets.governance.carbon.wso2.org/xsd","attachedSchemas").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list2.add(null);
                                                              reader.next();
                                                          } else {
                                                        list2.add(org.wso2.carbon.governance.gadgets.impactanalysis.beans.xsd.SchemaBean.Factory.parse(reader));
                                                                }
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone2 = false;
                                                        while(!loopDone2){
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
                                                                loopDone2 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://beans.impactanalysis.gadgets.governance.carbon.wso2.org/xsd","attachedSchemas").equals(reader.getName())){
                                                                    
                                                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                                          list2.add(null);
                                                                          reader.next();
                                                                      } else {
                                                                    list2.add(org.wso2.carbon.governance.gadgets.impactanalysis.beans.xsd.SchemaBean.Factory.parse(reader));
                                                                        }
                                                                }else{
                                                                    loopDone2 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setAttachedSchemas((org.wso2.carbon.governance.gadgets.impactanalysis.beans.xsd.SchemaBean[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                org.wso2.carbon.governance.gadgets.impactanalysis.beans.xsd.SchemaBean.class,
                                                                list2));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
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
           
    
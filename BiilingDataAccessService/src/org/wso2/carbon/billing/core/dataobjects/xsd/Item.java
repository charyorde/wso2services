
/**
 * Item.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v3  Built on : Oct 26, 2011 (07:42:27 PDT)
 */

            
                package org.wso2.carbon.billing.core.dataobjects.xsd;
            

            /**
            *  Item bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class Item
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = Item
                Namespace URI = http://dataobjects.core.billing.carbon.wso2.org/xsd
                Namespace Prefix = ns3
                */
            

                        /**
                        * field for BandwidthLimit
                        */

                        
                                    protected int localBandwidthLimit ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localBandwidthLimitTracker = false ;

                           public boolean isBandwidthLimitSpecified(){
                               return localBandwidthLimitTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getBandwidthLimit(){
                               return localBandwidthLimit;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param BandwidthLimit
                               */
                               public void setBandwidthLimit(int param){
                            
                                       // setting primitive attribute tracker to true
                                       localBandwidthLimitTracker =
                                       param != java.lang.Integer.MIN_VALUE;
                                   
                                            this.localBandwidthLimit=param;
                                    

                               }
                            

                        /**
                        * field for BandwidthOveruseCharge
                        */

                        
                                    protected org.wso2.carbon.billing.core.dataobjects.xsd.Cash localBandwidthOveruseCharge ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localBandwidthOveruseChargeTracker = false ;

                           public boolean isBandwidthOveruseChargeSpecified(){
                               return localBandwidthOveruseChargeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return org.wso2.carbon.billing.core.dataobjects.xsd.Cash
                           */
                           public  org.wso2.carbon.billing.core.dataobjects.xsd.Cash getBandwidthOveruseCharge(){
                               return localBandwidthOveruseCharge;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param BandwidthOveruseCharge
                               */
                               public void setBandwidthOveruseCharge(org.wso2.carbon.billing.core.dataobjects.xsd.Cash param){
                            localBandwidthOveruseChargeTracker = true;
                                   
                                            this.localBandwidthOveruseCharge=param;
                                    

                               }
                            

                        /**
                        * field for Children
                        */

                        
                                    protected java.lang.Object localChildren ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localChildrenTracker = false ;

                           public boolean isChildrenSpecified(){
                               return localChildrenTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.Object
                           */
                           public  java.lang.Object getChildren(){
                               return localChildren;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Children
                               */
                               public void setChildren(java.lang.Object param){
                            localChildrenTracker = true;
                                   
                                            this.localChildren=param;
                                    

                               }
                            

                        /**
                        * field for Cost
                        */

                        
                                    protected org.wso2.carbon.billing.core.dataobjects.xsd.Cash localCost ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCostTracker = false ;

                           public boolean isCostSpecified(){
                               return localCostTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return org.wso2.carbon.billing.core.dataobjects.xsd.Cash
                           */
                           public  org.wso2.carbon.billing.core.dataobjects.xsd.Cash getCost(){
                               return localCost;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Cost
                               */
                               public void setCost(org.wso2.carbon.billing.core.dataobjects.xsd.Cash param){
                            localCostTracker = true;
                                   
                                            this.localCost=param;
                                    

                               }
                            

                        /**
                        * field for CreditLimit
                        */

                        
                                    protected org.wso2.carbon.billing.core.dataobjects.xsd.Cash localCreditLimit ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCreditLimitTracker = false ;

                           public boolean isCreditLimitSpecified(){
                               return localCreditLimitTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return org.wso2.carbon.billing.core.dataobjects.xsd.Cash
                           */
                           public  org.wso2.carbon.billing.core.dataobjects.xsd.Cash getCreditLimit(){
                               return localCreditLimit;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CreditLimit
                               */
                               public void setCreditLimit(org.wso2.carbon.billing.core.dataobjects.xsd.Cash param){
                            localCreditLimitTracker = true;
                                   
                                            this.localCreditLimit=param;
                                    

                               }
                            

                        /**
                        * field for Description
                        */

                        
                                    protected java.lang.String localDescription ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDescriptionTracker = false ;

                           public boolean isDescriptionSpecified(){
                               return localDescriptionTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getDescription(){
                               return localDescription;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Description
                               */
                               public void setDescription(java.lang.String param){
                            localDescriptionTracker = true;
                                   
                                            this.localDescription=param;
                                    

                               }
                            

                        /**
                        * field for Id
                        */

                        
                                    protected int localId ;
                                
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
                           * @return int
                           */
                           public  int getId(){
                               return localId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Id
                               */
                               public void setId(int param){
                            
                                       // setting primitive attribute tracker to true
                                       localIdTracker =
                                       param != java.lang.Integer.MIN_VALUE;
                                   
                                            this.localId=param;
                                    

                               }
                            

                        /**
                        * field for Name
                        */

                        
                                    protected java.lang.String localName ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localNameTracker = false ;

                           public boolean isNameSpecified(){
                               return localNameTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getName(){
                               return localName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Name
                               */
                               public void setName(java.lang.String param){
                            localNameTracker = true;
                                   
                                            this.localName=param;
                                    

                               }
                            

                        /**
                        * field for Parent
                        */

                        
                                    protected org.wso2.carbon.billing.core.dataobjects.xsd.Item localParent ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localParentTracker = false ;

                           public boolean isParentSpecified(){
                               return localParentTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return org.wso2.carbon.billing.core.dataobjects.xsd.Item
                           */
                           public  org.wso2.carbon.billing.core.dataobjects.xsd.Item getParent(){
                               return localParent;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Parent
                               */
                               public void setParent(org.wso2.carbon.billing.core.dataobjects.xsd.Item param){
                            localParentTracker = true;
                                   
                                            this.localParent=param;
                                    

                               }
                            

                        /**
                        * field for ResourceVolumeLimit
                        */

                        
                                    protected int localResourceVolumeLimit ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localResourceVolumeLimitTracker = false ;

                           public boolean isResourceVolumeLimitSpecified(){
                               return localResourceVolumeLimitTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getResourceVolumeLimit(){
                               return localResourceVolumeLimit;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ResourceVolumeLimit
                               */
                               public void setResourceVolumeLimit(int param){
                            
                                       // setting primitive attribute tracker to true
                                       localResourceVolumeLimitTracker =
                                       param != java.lang.Integer.MIN_VALUE;
                                   
                                            this.localResourceVolumeLimit=param;
                                    

                               }
                            

                        /**
                        * field for ResourceVolumeOveruseCharge
                        */

                        
                                    protected org.wso2.carbon.billing.core.dataobjects.xsd.Cash localResourceVolumeOveruseCharge ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localResourceVolumeOveruseChargeTracker = false ;

                           public boolean isResourceVolumeOveruseChargeSpecified(){
                               return localResourceVolumeOveruseChargeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return org.wso2.carbon.billing.core.dataobjects.xsd.Cash
                           */
                           public  org.wso2.carbon.billing.core.dataobjects.xsd.Cash getResourceVolumeOveruseCharge(){
                               return localResourceVolumeOveruseCharge;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ResourceVolumeOveruseCharge
                               */
                               public void setResourceVolumeOveruseCharge(org.wso2.carbon.billing.core.dataobjects.xsd.Cash param){
                            localResourceVolumeOveruseChargeTracker = true;
                                   
                                            this.localResourceVolumeOveruseCharge=param;
                                    

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
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://dataobjects.core.billing.carbon.wso2.org/xsd");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":Item",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "Item",
                           xmlWriter);
                   }

               
                   }
                if (localBandwidthLimitTracker){
                                    namespace = "http://dataobjects.core.billing.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "bandwidthLimit", xmlWriter);
                             
                                               if (localBandwidthLimit==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("bandwidthLimit cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localBandwidthLimit));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localBandwidthOveruseChargeTracker){
                                    if (localBandwidthOveruseCharge==null){

                                        writeStartElement(null, "http://dataobjects.core.billing.carbon.wso2.org/xsd", "bandwidthOveruseCharge", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localBandwidthOveruseCharge.serialize(new javax.xml.namespace.QName("http://dataobjects.core.billing.carbon.wso2.org/xsd","bandwidthOveruseCharge"),
                                        xmlWriter);
                                    }
                                } if (localChildrenTracker){
                            
                            if (localChildren!=null){
                                if (localChildren instanceof org.apache.axis2.databinding.ADBBean){
                                    ((org.apache.axis2.databinding.ADBBean)localChildren).serialize(
                                               new javax.xml.namespace.QName("http://dataobjects.core.billing.carbon.wso2.org/xsd","children"),
                                               xmlWriter,true);
                                 } else {
                                    writeStartElement(null, "http://dataobjects.core.billing.carbon.wso2.org/xsd", "children", xmlWriter);
                                    org.apache.axis2.databinding.utils.ConverterUtil.serializeAnyType(localChildren, xmlWriter);
                                    xmlWriter.writeEndElement();
                                 }
                            } else {
                                
                                        // write null attribute
                                           writeStartElement(null, "http://dataobjects.core.billing.carbon.wso2.org/xsd", "children", xmlWriter);

                                           // write the nil attribute
                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                           xmlWriter.writeEndElement();
                                    
                            }


                        } if (localCostTracker){
                                    if (localCost==null){

                                        writeStartElement(null, "http://dataobjects.core.billing.carbon.wso2.org/xsd", "cost", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localCost.serialize(new javax.xml.namespace.QName("http://dataobjects.core.billing.carbon.wso2.org/xsd","cost"),
                                        xmlWriter);
                                    }
                                } if (localCreditLimitTracker){
                                    if (localCreditLimit==null){

                                        writeStartElement(null, "http://dataobjects.core.billing.carbon.wso2.org/xsd", "creditLimit", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localCreditLimit.serialize(new javax.xml.namespace.QName("http://dataobjects.core.billing.carbon.wso2.org/xsd","creditLimit"),
                                        xmlWriter);
                                    }
                                } if (localDescriptionTracker){
                                    namespace = "http://dataobjects.core.billing.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "description", xmlWriter);
                             

                                          if (localDescription==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localDescription);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localIdTracker){
                                    namespace = "http://dataobjects.core.billing.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "id", xmlWriter);
                             
                                               if (localId==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("id cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localId));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localNameTracker){
                                    namespace = "http://dataobjects.core.billing.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "name", xmlWriter);
                             

                                          if (localName==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localName);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localParentTracker){
                                    if (localParent==null){

                                        writeStartElement(null, "http://dataobjects.core.billing.carbon.wso2.org/xsd", "parent", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localParent.serialize(new javax.xml.namespace.QName("http://dataobjects.core.billing.carbon.wso2.org/xsd","parent"),
                                        xmlWriter);
                                    }
                                } if (localResourceVolumeLimitTracker){
                                    namespace = "http://dataobjects.core.billing.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "resourceVolumeLimit", xmlWriter);
                             
                                               if (localResourceVolumeLimit==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("resourceVolumeLimit cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localResourceVolumeLimit));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localResourceVolumeOveruseChargeTracker){
                                    if (localResourceVolumeOveruseCharge==null){

                                        writeStartElement(null, "http://dataobjects.core.billing.carbon.wso2.org/xsd", "resourceVolumeOveruseCharge", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localResourceVolumeOveruseCharge.serialize(new javax.xml.namespace.QName("http://dataobjects.core.billing.carbon.wso2.org/xsd","resourceVolumeOveruseCharge"),
                                        xmlWriter);
                                    }
                                }
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://dataobjects.core.billing.carbon.wso2.org/xsd")){
                return "ns3";
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

                 if (localBandwidthLimitTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://dataobjects.core.billing.carbon.wso2.org/xsd",
                                                                      "bandwidthLimit"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localBandwidthLimit));
                            } if (localBandwidthOveruseChargeTracker){
                            elementList.add(new javax.xml.namespace.QName("http://dataobjects.core.billing.carbon.wso2.org/xsd",
                                                                      "bandwidthOveruseCharge"));
                            
                            
                                    elementList.add(localBandwidthOveruseCharge==null?null:
                                    localBandwidthOveruseCharge);
                                } if (localChildrenTracker){
                            elementList.add(new javax.xml.namespace.QName("http://dataobjects.core.billing.carbon.wso2.org/xsd",
                                                                      "children"));
                            
                            
                                    elementList.add(localChildren==null?null:
                                    localChildren);
                                } if (localCostTracker){
                            elementList.add(new javax.xml.namespace.QName("http://dataobjects.core.billing.carbon.wso2.org/xsd",
                                                                      "cost"));
                            
                            
                                    elementList.add(localCost==null?null:
                                    localCost);
                                } if (localCreditLimitTracker){
                            elementList.add(new javax.xml.namespace.QName("http://dataobjects.core.billing.carbon.wso2.org/xsd",
                                                                      "creditLimit"));
                            
                            
                                    elementList.add(localCreditLimit==null?null:
                                    localCreditLimit);
                                } if (localDescriptionTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://dataobjects.core.billing.carbon.wso2.org/xsd",
                                                                      "description"));
                                 
                                         elementList.add(localDescription==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDescription));
                                    } if (localIdTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://dataobjects.core.billing.carbon.wso2.org/xsd",
                                                                      "id"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localId));
                            } if (localNameTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://dataobjects.core.billing.carbon.wso2.org/xsd",
                                                                      "name"));
                                 
                                         elementList.add(localName==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localName));
                                    } if (localParentTracker){
                            elementList.add(new javax.xml.namespace.QName("http://dataobjects.core.billing.carbon.wso2.org/xsd",
                                                                      "parent"));
                            
                            
                                    elementList.add(localParent==null?null:
                                    localParent);
                                } if (localResourceVolumeLimitTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://dataobjects.core.billing.carbon.wso2.org/xsd",
                                                                      "resourceVolumeLimit"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localResourceVolumeLimit));
                            } if (localResourceVolumeOveruseChargeTracker){
                            elementList.add(new javax.xml.namespace.QName("http://dataobjects.core.billing.carbon.wso2.org/xsd",
                                                                      "resourceVolumeOveruseCharge"));
                            
                            
                                    elementList.add(localResourceVolumeOveruseCharge==null?null:
                                    localResourceVolumeOveruseCharge);
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
        public static Item parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            Item object =
                new Item();

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
                    
                            if (!"Item".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (Item)org.wso2.carbon.billing.mgt.services.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://dataobjects.core.billing.carbon.wso2.org/xsd","bandwidthLimit").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"bandwidthLimit" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setBandwidthLimit(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setBandwidthLimit(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://dataobjects.core.billing.carbon.wso2.org/xsd","bandwidthOveruseCharge").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setBandwidthOveruseCharge(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setBandwidthOveruseCharge(org.wso2.carbon.billing.core.dataobjects.xsd.Cash.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://dataobjects.core.billing.carbon.wso2.org/xsd","children").equals(reader.getName())){
                                
                                     object.setChildren(org.apache.axis2.databinding.utils.ConverterUtil.getAnyTypeObject(reader,
                                                org.wso2.carbon.billing.mgt.services.ExtensionMapper.class));
                                       
                                         reader.next();
                                     
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://dataobjects.core.billing.carbon.wso2.org/xsd","cost").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setCost(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setCost(org.wso2.carbon.billing.core.dataobjects.xsd.Cash.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://dataobjects.core.billing.carbon.wso2.org/xsd","creditLimit").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setCreditLimit(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setCreditLimit(org.wso2.carbon.billing.core.dataobjects.xsd.Cash.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://dataobjects.core.billing.carbon.wso2.org/xsd","description").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setDescription(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://dataobjects.core.billing.carbon.wso2.org/xsd","id").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"id" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setId(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setId(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://dataobjects.core.billing.carbon.wso2.org/xsd","name").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://dataobjects.core.billing.carbon.wso2.org/xsd","parent").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setParent(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setParent(org.wso2.carbon.billing.core.dataobjects.xsd.Item.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://dataobjects.core.billing.carbon.wso2.org/xsd","resourceVolumeLimit").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"resourceVolumeLimit" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setResourceVolumeLimit(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setResourceVolumeLimit(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://dataobjects.core.billing.carbon.wso2.org/xsd","resourceVolumeOveruseCharge").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setResourceVolumeOveruseCharge(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setResourceVolumeOveruseCharge(org.wso2.carbon.billing.core.dataobjects.xsd.Cash.Factory.parse(reader));
                                              
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
           
    
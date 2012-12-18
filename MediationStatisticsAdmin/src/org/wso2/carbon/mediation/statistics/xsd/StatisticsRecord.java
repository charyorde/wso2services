
/**
 * StatisticsRecord.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v3  Built on : Oct 26, 2011 (07:42:27 PDT)
 */

            
                package org.wso2.carbon.mediation.statistics.xsd;
            

            /**
            *  StatisticsRecord bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class StatisticsRecord
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = StatisticsRecord
                Namespace URI = http://statistics.mediation.carbon.wso2.org/xsd
                Namespace Prefix = ns36
                */
            

                        /**
                        * field for AvgTime
                        */

                        
                                    protected double localAvgTime ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAvgTimeTracker = false ;

                           public boolean isAvgTimeSpecified(){
                               return localAvgTimeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return double
                           */
                           public  double getAvgTime(){
                               return localAvgTime;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AvgTime
                               */
                               public void setAvgTime(double param){
                            
                                       // setting primitive attribute tracker to true
                                       localAvgTimeTracker =
                                       !java.lang.Double.isNaN(param);
                                   
                                            this.localAvgTime=param;
                                    

                               }
                            

                        /**
                        * field for FaultCount
                        */

                        
                                    protected int localFaultCount ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localFaultCountTracker = false ;

                           public boolean isFaultCountSpecified(){
                               return localFaultCountTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getFaultCount(){
                               return localFaultCount;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param FaultCount
                               */
                               public void setFaultCount(int param){
                            
                                       // setting primitive attribute tracker to true
                                       localFaultCountTracker =
                                       param != java.lang.Integer.MIN_VALUE;
                                   
                                            this.localFaultCount=param;
                                    

                               }
                            

                        /**
                        * field for InStatistic
                        */

                        
                                    protected boolean localInStatistic ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localInStatisticTracker = false ;

                           public boolean isInStatisticSpecified(){
                               return localInStatisticTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getInStatistic(){
                               return localInStatistic;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param InStatistic
                               */
                               public void setInStatistic(boolean param){
                            
                                       // setting primitive attribute tracker to true
                                       localInStatisticTracker =
                                       true;
                                   
                                            this.localInStatistic=param;
                                    

                               }
                            

                        /**
                        * field for MaxTime
                        */

                        
                                    protected long localMaxTime ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localMaxTimeTracker = false ;

                           public boolean isMaxTimeSpecified(){
                               return localMaxTimeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return long
                           */
                           public  long getMaxTime(){
                               return localMaxTime;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MaxTime
                               */
                               public void setMaxTime(long param){
                            
                                       // setting primitive attribute tracker to true
                                       localMaxTimeTracker =
                                       param != java.lang.Long.MIN_VALUE;
                                   
                                            this.localMaxTime=param;
                                    

                               }
                            

                        /**
                        * field for MinTime
                        */

                        
                                    protected long localMinTime ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localMinTimeTracker = false ;

                           public boolean isMinTimeSpecified(){
                               return localMinTimeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return long
                           */
                           public  long getMinTime(){
                               return localMinTime;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MinTime
                               */
                               public void setMinTime(long param){
                            
                                       // setting primitive attribute tracker to true
                                       localMinTimeTracker =
                                       param != java.lang.Long.MIN_VALUE;
                                   
                                            this.localMinTime=param;
                                    

                               }
                            

                        /**
                        * field for ResourceId
                        */

                        
                                    protected java.lang.String localResourceId ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localResourceIdTracker = false ;

                           public boolean isResourceIdSpecified(){
                               return localResourceIdTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getResourceId(){
                               return localResourceId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ResourceId
                               */
                               public void setResourceId(java.lang.String param){
                            localResourceIdTracker = true;
                                   
                                            this.localResourceId=param;
                                    

                               }
                            

                        /**
                        * field for TotalCount
                        */

                        
                                    protected int localTotalCount ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTotalCountTracker = false ;

                           public boolean isTotalCountSpecified(){
                               return localTotalCountTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getTotalCount(){
                               return localTotalCount;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TotalCount
                               */
                               public void setTotalCount(int param){
                            
                                       // setting primitive attribute tracker to true
                                       localTotalCountTracker =
                                       param != java.lang.Integer.MIN_VALUE;
                                   
                                            this.localTotalCount=param;
                                    

                               }
                            

                        /**
                        * field for Type
                        */

                        
                                    protected org.apache.synapse.aspects.xsd.ComponentType localType ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTypeTracker = false ;

                           public boolean isTypeSpecified(){
                               return localTypeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return org.apache.synapse.aspects.xsd.ComponentType
                           */
                           public  org.apache.synapse.aspects.xsd.ComponentType getType(){
                               return localType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Type
                               */
                               public void setType(org.apache.synapse.aspects.xsd.ComponentType param){
                            localTypeTracker = true;
                                   
                                            this.localType=param;
                                    

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
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://statistics.mediation.carbon.wso2.org/xsd");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":StatisticsRecord",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "StatisticsRecord",
                           xmlWriter);
                   }

               
                   }
                if (localAvgTimeTracker){
                                    namespace = "http://statistics.mediation.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "avgTime", xmlWriter);
                             
                                               if (java.lang.Double.isNaN(localAvgTime)) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("avgTime cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAvgTime));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localFaultCountTracker){
                                    namespace = "http://statistics.mediation.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "faultCount", xmlWriter);
                             
                                               if (localFaultCount==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("faultCount cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFaultCount));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localInStatisticTracker){
                                    namespace = "http://statistics.mediation.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "inStatistic", xmlWriter);
                             
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("inStatistic cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localInStatistic));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localMaxTimeTracker){
                                    namespace = "http://statistics.mediation.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "maxTime", xmlWriter);
                             
                                               if (localMaxTime==java.lang.Long.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("maxTime cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMaxTime));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localMinTimeTracker){
                                    namespace = "http://statistics.mediation.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "minTime", xmlWriter);
                             
                                               if (localMinTime==java.lang.Long.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("minTime cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMinTime));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localResourceIdTracker){
                                    namespace = "http://statistics.mediation.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "resourceId", xmlWriter);
                             

                                          if (localResourceId==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localResourceId);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localTotalCountTracker){
                                    namespace = "http://statistics.mediation.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "totalCount", xmlWriter);
                             
                                               if (localTotalCount==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("totalCount cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTotalCount));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localTypeTracker){
                                    if (localType==null){

                                        writeStartElement(null, "http://statistics.mediation.carbon.wso2.org/xsd", "type", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localType.serialize(new javax.xml.namespace.QName("http://statistics.mediation.carbon.wso2.org/xsd","type"),
                                        xmlWriter);
                                    }
                                }
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://statistics.mediation.carbon.wso2.org/xsd")){
                return "ns36";
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

                 if (localAvgTimeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://statistics.mediation.carbon.wso2.org/xsd",
                                                                      "avgTime"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAvgTime));
                            } if (localFaultCountTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://statistics.mediation.carbon.wso2.org/xsd",
                                                                      "faultCount"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFaultCount));
                            } if (localInStatisticTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://statistics.mediation.carbon.wso2.org/xsd",
                                                                      "inStatistic"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localInStatistic));
                            } if (localMaxTimeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://statistics.mediation.carbon.wso2.org/xsd",
                                                                      "maxTime"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMaxTime));
                            } if (localMinTimeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://statistics.mediation.carbon.wso2.org/xsd",
                                                                      "minTime"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMinTime));
                            } if (localResourceIdTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://statistics.mediation.carbon.wso2.org/xsd",
                                                                      "resourceId"));
                                 
                                         elementList.add(localResourceId==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localResourceId));
                                    } if (localTotalCountTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://statistics.mediation.carbon.wso2.org/xsd",
                                                                      "totalCount"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTotalCount));
                            } if (localTypeTracker){
                            elementList.add(new javax.xml.namespace.QName("http://statistics.mediation.carbon.wso2.org/xsd",
                                                                      "type"));
                            
                            
                                    elementList.add(localType==null?null:
                                    localType);
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
        public static StatisticsRecord parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            StatisticsRecord object =
                new StatisticsRecord();

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
                    
                            if (!"StatisticsRecord".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (StatisticsRecord)org.wso2.carbon.mediation.statistics.xsd.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://statistics.mediation.carbon.wso2.org/xsd","avgTime").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"avgTime" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setAvgTime(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setAvgTime(java.lang.Double.NaN);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://statistics.mediation.carbon.wso2.org/xsd","faultCount").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"faultCount" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setFaultCount(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setFaultCount(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://statistics.mediation.carbon.wso2.org/xsd","inStatistic").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"inStatistic" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setInStatistic(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://statistics.mediation.carbon.wso2.org/xsd","maxTime").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"maxTime" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setMaxTime(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setMaxTime(java.lang.Long.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://statistics.mediation.carbon.wso2.org/xsd","minTime").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"minTime" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setMinTime(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setMinTime(java.lang.Long.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://statistics.mediation.carbon.wso2.org/xsd","resourceId").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setResourceId(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://statistics.mediation.carbon.wso2.org/xsd","totalCount").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"totalCount" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTotalCount(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setTotalCount(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://statistics.mediation.carbon.wso2.org/xsd","type").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setType(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setType(org.apache.synapse.aspects.xsd.ComponentType.Factory.parse(reader));
                                              
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
           
    
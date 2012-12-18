
/**
 * ColumnFamilyStats.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v3  Built on : Oct 26, 2011 (07:42:27 PDT)
 */

            
                package org.wso2.carbon.cassandra.mgt.xsd;
            

            /**
            *  ColumnFamilyStats bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ColumnFamilyStats
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = ColumnFamilyStats
                Namespace URI = http://mgt.cassandra.carbon.wso2.org/xsd
                Namespace Prefix = ns13
                */
            

                        /**
                        * field for LiveDiskSpaceUsed
                        */

                        
                                    protected long localLiveDiskSpaceUsed ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localLiveDiskSpaceUsedTracker = false ;

                           public boolean isLiveDiskSpaceUsedSpecified(){
                               return localLiveDiskSpaceUsedTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return long
                           */
                           public  long getLiveDiskSpaceUsed(){
                               return localLiveDiskSpaceUsed;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param LiveDiskSpaceUsed
                               */
                               public void setLiveDiskSpaceUsed(long param){
                            
                                       // setting primitive attribute tracker to true
                                       localLiveDiskSpaceUsedTracker =
                                       param != java.lang.Long.MIN_VALUE;
                                   
                                            this.localLiveDiskSpaceUsed=param;
                                    

                               }
                            

                        /**
                        * field for LiveSSTableCount
                        */

                        
                                    protected int localLiveSSTableCount ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localLiveSSTableCountTracker = false ;

                           public boolean isLiveSSTableCountSpecified(){
                               return localLiveSSTableCountTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getLiveSSTableCount(){
                               return localLiveSSTableCount;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param LiveSSTableCount
                               */
                               public void setLiveSSTableCount(int param){
                            
                                       // setting primitive attribute tracker to true
                                       localLiveSSTableCountTracker =
                                       param != java.lang.Integer.MIN_VALUE;
                                   
                                            this.localLiveSSTableCount=param;
                                    

                               }
                            

                        /**
                        * field for MemtableColumnsCount
                        */

                        
                                    protected int localMemtableColumnsCount ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localMemtableColumnsCountTracker = false ;

                           public boolean isMemtableColumnsCountSpecified(){
                               return localMemtableColumnsCountTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getMemtableColumnsCount(){
                               return localMemtableColumnsCount;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MemtableColumnsCount
                               */
                               public void setMemtableColumnsCount(int param){
                            
                                       // setting primitive attribute tracker to true
                                       localMemtableColumnsCountTracker =
                                       param != java.lang.Integer.MIN_VALUE;
                                   
                                            this.localMemtableColumnsCount=param;
                                    

                               }
                            

                        /**
                        * field for MemtableDataSize
                        */

                        
                                    protected int localMemtableDataSize ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localMemtableDataSizeTracker = false ;

                           public boolean isMemtableDataSizeSpecified(){
                               return localMemtableDataSizeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getMemtableDataSize(){
                               return localMemtableDataSize;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MemtableDataSize
                               */
                               public void setMemtableDataSize(int param){
                            
                                       // setting primitive attribute tracker to true
                                       localMemtableDataSizeTracker =
                                       param != java.lang.Integer.MIN_VALUE;
                                   
                                            this.localMemtableDataSize=param;
                                    

                               }
                            

                        /**
                        * field for MemtableSwitchCount
                        */

                        
                                    protected int localMemtableSwitchCount ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localMemtableSwitchCountTracker = false ;

                           public boolean isMemtableSwitchCountSpecified(){
                               return localMemtableSwitchCountTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getMemtableSwitchCount(){
                               return localMemtableSwitchCount;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MemtableSwitchCount
                               */
                               public void setMemtableSwitchCount(int param){
                            
                                       // setting primitive attribute tracker to true
                                       localMemtableSwitchCountTracker =
                                       param != java.lang.Integer.MIN_VALUE;
                                   
                                            this.localMemtableSwitchCount=param;
                                    

                               }
                            

                        /**
                        * field for PendingTasks
                        */

                        
                                    protected int localPendingTasks ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPendingTasksTracker = false ;

                           public boolean isPendingTasksSpecified(){
                               return localPendingTasksTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getPendingTasks(){
                               return localPendingTasks;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PendingTasks
                               */
                               public void setPendingTasks(int param){
                            
                                       // setting primitive attribute tracker to true
                                       localPendingTasksTracker =
                                       param != java.lang.Integer.MIN_VALUE;
                                   
                                            this.localPendingTasks=param;
                                    

                               }
                            

                        /**
                        * field for ReadCount
                        */

                        
                                    protected long localReadCount ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localReadCountTracker = false ;

                           public boolean isReadCountSpecified(){
                               return localReadCountTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return long
                           */
                           public  long getReadCount(){
                               return localReadCount;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ReadCount
                               */
                               public void setReadCount(long param){
                            
                                       // setting primitive attribute tracker to true
                                       localReadCountTracker =
                                       param != java.lang.Long.MIN_VALUE;
                                   
                                            this.localReadCount=param;
                                    

                               }
                            

                        /**
                        * field for ReadLatency
                        */

                        
                                    protected double localReadLatency ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localReadLatencyTracker = false ;

                           public boolean isReadLatencySpecified(){
                               return localReadLatencyTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return double
                           */
                           public  double getReadLatency(){
                               return localReadLatency;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ReadLatency
                               */
                               public void setReadLatency(double param){
                            
                                       // setting primitive attribute tracker to true
                                       localReadLatencyTracker =
                                       !java.lang.Double.isNaN(param);
                                   
                                            this.localReadLatency=param;
                                    

                               }
                            

                        /**
                        * field for TotalDiskSpaceUsed
                        */

                        
                                    protected long localTotalDiskSpaceUsed ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTotalDiskSpaceUsedTracker = false ;

                           public boolean isTotalDiskSpaceUsedSpecified(){
                               return localTotalDiskSpaceUsedTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return long
                           */
                           public  long getTotalDiskSpaceUsed(){
                               return localTotalDiskSpaceUsed;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TotalDiskSpaceUsed
                               */
                               public void setTotalDiskSpaceUsed(long param){
                            
                                       // setting primitive attribute tracker to true
                                       localTotalDiskSpaceUsedTracker =
                                       param != java.lang.Long.MIN_VALUE;
                                   
                                            this.localTotalDiskSpaceUsed=param;
                                    

                               }
                            

                        /**
                        * field for WriteCount
                        */

                        
                                    protected long localWriteCount ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localWriteCountTracker = false ;

                           public boolean isWriteCountSpecified(){
                               return localWriteCountTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return long
                           */
                           public  long getWriteCount(){
                               return localWriteCount;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param WriteCount
                               */
                               public void setWriteCount(long param){
                            
                                       // setting primitive attribute tracker to true
                                       localWriteCountTracker =
                                       param != java.lang.Long.MIN_VALUE;
                                   
                                            this.localWriteCount=param;
                                    

                               }
                            

                        /**
                        * field for WriteLatency
                        */

                        
                                    protected double localWriteLatency ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localWriteLatencyTracker = false ;

                           public boolean isWriteLatencySpecified(){
                               return localWriteLatencyTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return double
                           */
                           public  double getWriteLatency(){
                               return localWriteLatency;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param WriteLatency
                               */
                               public void setWriteLatency(double param){
                            
                                       // setting primitive attribute tracker to true
                                       localWriteLatencyTracker =
                                       !java.lang.Double.isNaN(param);
                                   
                                            this.localWriteLatency=param;
                                    

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
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://mgt.cassandra.carbon.wso2.org/xsd");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":ColumnFamilyStats",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "ColumnFamilyStats",
                           xmlWriter);
                   }

               
                   }
                if (localLiveDiskSpaceUsedTracker){
                                    namespace = "http://mgt.cassandra.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "liveDiskSpaceUsed", xmlWriter);
                             
                                               if (localLiveDiskSpaceUsed==java.lang.Long.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("liveDiskSpaceUsed cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLiveDiskSpaceUsed));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localLiveSSTableCountTracker){
                                    namespace = "http://mgt.cassandra.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "liveSSTableCount", xmlWriter);
                             
                                               if (localLiveSSTableCount==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("liveSSTableCount cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLiveSSTableCount));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localMemtableColumnsCountTracker){
                                    namespace = "http://mgt.cassandra.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "memtableColumnsCount", xmlWriter);
                             
                                               if (localMemtableColumnsCount==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("memtableColumnsCount cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMemtableColumnsCount));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localMemtableDataSizeTracker){
                                    namespace = "http://mgt.cassandra.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "memtableDataSize", xmlWriter);
                             
                                               if (localMemtableDataSize==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("memtableDataSize cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMemtableDataSize));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localMemtableSwitchCountTracker){
                                    namespace = "http://mgt.cassandra.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "memtableSwitchCount", xmlWriter);
                             
                                               if (localMemtableSwitchCount==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("memtableSwitchCount cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMemtableSwitchCount));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPendingTasksTracker){
                                    namespace = "http://mgt.cassandra.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "pendingTasks", xmlWriter);
                             
                                               if (localPendingTasks==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("pendingTasks cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPendingTasks));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localReadCountTracker){
                                    namespace = "http://mgt.cassandra.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "readCount", xmlWriter);
                             
                                               if (localReadCount==java.lang.Long.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("readCount cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReadCount));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localReadLatencyTracker){
                                    namespace = "http://mgt.cassandra.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "readLatency", xmlWriter);
                             
                                               if (java.lang.Double.isNaN(localReadLatency)) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("readLatency cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReadLatency));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localTotalDiskSpaceUsedTracker){
                                    namespace = "http://mgt.cassandra.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "totalDiskSpaceUsed", xmlWriter);
                             
                                               if (localTotalDiskSpaceUsed==java.lang.Long.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("totalDiskSpaceUsed cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTotalDiskSpaceUsed));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localWriteCountTracker){
                                    namespace = "http://mgt.cassandra.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "writeCount", xmlWriter);
                             
                                               if (localWriteCount==java.lang.Long.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("writeCount cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localWriteCount));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localWriteLatencyTracker){
                                    namespace = "http://mgt.cassandra.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "writeLatency", xmlWriter);
                             
                                               if (java.lang.Double.isNaN(localWriteLatency)) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("writeLatency cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localWriteLatency));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             }
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://mgt.cassandra.carbon.wso2.org/xsd")){
                return "ns13";
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

                 if (localLiveDiskSpaceUsedTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://mgt.cassandra.carbon.wso2.org/xsd",
                                                                      "liveDiskSpaceUsed"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLiveDiskSpaceUsed));
                            } if (localLiveSSTableCountTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://mgt.cassandra.carbon.wso2.org/xsd",
                                                                      "liveSSTableCount"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLiveSSTableCount));
                            } if (localMemtableColumnsCountTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://mgt.cassandra.carbon.wso2.org/xsd",
                                                                      "memtableColumnsCount"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMemtableColumnsCount));
                            } if (localMemtableDataSizeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://mgt.cassandra.carbon.wso2.org/xsd",
                                                                      "memtableDataSize"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMemtableDataSize));
                            } if (localMemtableSwitchCountTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://mgt.cassandra.carbon.wso2.org/xsd",
                                                                      "memtableSwitchCount"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMemtableSwitchCount));
                            } if (localPendingTasksTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://mgt.cassandra.carbon.wso2.org/xsd",
                                                                      "pendingTasks"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPendingTasks));
                            } if (localReadCountTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://mgt.cassandra.carbon.wso2.org/xsd",
                                                                      "readCount"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReadCount));
                            } if (localReadLatencyTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://mgt.cassandra.carbon.wso2.org/xsd",
                                                                      "readLatency"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReadLatency));
                            } if (localTotalDiskSpaceUsedTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://mgt.cassandra.carbon.wso2.org/xsd",
                                                                      "totalDiskSpaceUsed"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTotalDiskSpaceUsed));
                            } if (localWriteCountTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://mgt.cassandra.carbon.wso2.org/xsd",
                                                                      "writeCount"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localWriteCount));
                            } if (localWriteLatencyTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://mgt.cassandra.carbon.wso2.org/xsd",
                                                                      "writeLatency"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localWriteLatency));
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
        public static ColumnFamilyStats parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            ColumnFamilyStats object =
                new ColumnFamilyStats();

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
                    
                            if (!"ColumnFamilyStats".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (ColumnFamilyStats)axis2.apache.org.xsd.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://mgt.cassandra.carbon.wso2.org/xsd","liveDiskSpaceUsed").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"liveDiskSpaceUsed" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setLiveDiskSpaceUsed(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setLiveDiskSpaceUsed(java.lang.Long.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://mgt.cassandra.carbon.wso2.org/xsd","liveSSTableCount").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"liveSSTableCount" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setLiveSSTableCount(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setLiveSSTableCount(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://mgt.cassandra.carbon.wso2.org/xsd","memtableColumnsCount").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"memtableColumnsCount" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setMemtableColumnsCount(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setMemtableColumnsCount(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://mgt.cassandra.carbon.wso2.org/xsd","memtableDataSize").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"memtableDataSize" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setMemtableDataSize(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setMemtableDataSize(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://mgt.cassandra.carbon.wso2.org/xsd","memtableSwitchCount").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"memtableSwitchCount" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setMemtableSwitchCount(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setMemtableSwitchCount(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://mgt.cassandra.carbon.wso2.org/xsd","pendingTasks").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"pendingTasks" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPendingTasks(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setPendingTasks(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://mgt.cassandra.carbon.wso2.org/xsd","readCount").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"readCount" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setReadCount(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setReadCount(java.lang.Long.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://mgt.cassandra.carbon.wso2.org/xsd","readLatency").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"readLatency" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setReadLatency(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setReadLatency(java.lang.Double.NaN);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://mgt.cassandra.carbon.wso2.org/xsd","totalDiskSpaceUsed").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"totalDiskSpaceUsed" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTotalDiskSpaceUsed(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setTotalDiskSpaceUsed(java.lang.Long.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://mgt.cassandra.carbon.wso2.org/xsd","writeCount").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"writeCount" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setWriteCount(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setWriteCount(java.lang.Long.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://mgt.cassandra.carbon.wso2.org/xsd","writeLatency").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"writeLatency" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setWriteLatency(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setWriteLatency(java.lang.Double.NaN);
                                           
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
           
    
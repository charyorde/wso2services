
/**
 * RMParameterBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v3  Built on : Oct 26, 2011 (07:42:27 PDT)
 */

            
                package org.wso2.carbon.rm.global.xsd;
            

            /**
            *  RMParameterBean bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class RMParameterBean
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = RMParameterBean
                Namespace URI = http://global.rm.carbon.wso2.org/xsd
                Namespace Prefix = ns71
                */
            

                        /**
                        * field for AcknowledgementInterval
                        */

                        
                                    protected long localAcknowledgementInterval ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAcknowledgementIntervalTracker = false ;

                           public boolean isAcknowledgementIntervalSpecified(){
                               return localAcknowledgementIntervalTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return long
                           */
                           public  long getAcknowledgementInterval(){
                               return localAcknowledgementInterval;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AcknowledgementInterval
                               */
                               public void setAcknowledgementInterval(long param){
                            
                                       // setting primitive attribute tracker to true
                                       localAcknowledgementIntervalTracker =
                                       param != java.lang.Long.MIN_VALUE;
                                   
                                            this.localAcknowledgementInterval=param;
                                    

                               }
                            

                        /**
                        * field for ConnectionString
                        */

                        
                                    protected java.lang.String localConnectionString ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localConnectionStringTracker = false ;

                           public boolean isConnectionStringSpecified(){
                               return localConnectionStringTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getConnectionString(){
                               return localConnectionString;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ConnectionString
                               */
                               public void setConnectionString(java.lang.String param){
                            localConnectionStringTracker = true;
                                   
                                            this.localConnectionString=param;
                                    

                               }
                            

                        /**
                        * field for DriverName
                        */

                        
                                    protected java.lang.String localDriverName ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDriverNameTracker = false ;

                           public boolean isDriverNameSpecified(){
                               return localDriverNameTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getDriverName(){
                               return localDriverName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param DriverName
                               */
                               public void setDriverName(java.lang.String param){
                            localDriverNameTracker = true;
                                   
                                            this.localDriverName=param;
                                    

                               }
                            

                        /**
                        * field for ExponentialBackoff
                        */

                        
                                    protected boolean localExponentialBackoff ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localExponentialBackoffTracker = false ;

                           public boolean isExponentialBackoffSpecified(){
                               return localExponentialBackoffTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getExponentialBackoff(){
                               return localExponentialBackoff;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ExponentialBackoff
                               */
                               public void setExponentialBackoff(boolean param){
                            
                                       // setting primitive attribute tracker to true
                                       localExponentialBackoffTracker =
                                       true;
                                   
                                            this.localExponentialBackoff=param;
                                    

                               }
                            

                        /**
                        * field for InactiveTimeoutValue
                        */

                        
                                    protected long localInactiveTimeoutValue ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localInactiveTimeoutValueTracker = false ;

                           public boolean isInactiveTimeoutValueSpecified(){
                               return localInactiveTimeoutValueTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return long
                           */
                           public  long getInactiveTimeoutValue(){
                               return localInactiveTimeoutValue;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param InactiveTimeoutValue
                               */
                               public void setInactiveTimeoutValue(long param){
                            
                                       // setting primitive attribute tracker to true
                                       localInactiveTimeoutValueTracker =
                                       param != java.lang.Long.MIN_VALUE;
                                   
                                            this.localInactiveTimeoutValue=param;
                                    

                               }
                            

                        /**
                        * field for InactivityTimeoutInterval
                        */

                        
                                    protected long localInactivityTimeoutInterval ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localInactivityTimeoutIntervalTracker = false ;

                           public boolean isInactivityTimeoutIntervalSpecified(){
                               return localInactivityTimeoutIntervalTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return long
                           */
                           public  long getInactivityTimeoutInterval(){
                               return localInactivityTimeoutInterval;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param InactivityTimeoutInterval
                               */
                               public void setInactivityTimeoutInterval(long param){
                            
                                       // setting primitive attribute tracker to true
                                       localInactivityTimeoutIntervalTracker =
                                       param != java.lang.Long.MIN_VALUE;
                                   
                                            this.localInactivityTimeoutInterval=param;
                                    

                               }
                            

                        /**
                        * field for InactivityTimeoutMeasure
                        */

                        
                                    protected java.lang.String localInactivityTimeoutMeasure ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localInactivityTimeoutMeasureTracker = false ;

                           public boolean isInactivityTimeoutMeasureSpecified(){
                               return localInactivityTimeoutMeasureTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getInactivityTimeoutMeasure(){
                               return localInactivityTimeoutMeasure;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param InactivityTimeoutMeasure
                               */
                               public void setInactivityTimeoutMeasure(java.lang.String param){
                            localInactivityTimeoutMeasureTracker = true;
                                   
                                            this.localInactivityTimeoutMeasure=param;
                                    

                               }
                            

                        /**
                        * field for MaximumRetransmissionCount
                        */

                        
                                    protected int localMaximumRetransmissionCount ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localMaximumRetransmissionCountTracker = false ;

                           public boolean isMaximumRetransmissionCountSpecified(){
                               return localMaximumRetransmissionCountTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getMaximumRetransmissionCount(){
                               return localMaximumRetransmissionCount;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MaximumRetransmissionCount
                               */
                               public void setMaximumRetransmissionCount(int param){
                            
                                       // setting primitive attribute tracker to true
                                       localMaximumRetransmissionCountTracker =
                                       param != java.lang.Integer.MIN_VALUE;
                                   
                                            this.localMaximumRetransmissionCount=param;
                                    

                               }
                            

                        /**
                        * field for Password
                        */

                        
                                    protected java.lang.String localPassword ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPasswordTracker = false ;

                           public boolean isPasswordSpecified(){
                               return localPasswordTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getPassword(){
                               return localPassword;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Password
                               */
                               public void setPassword(java.lang.String param){
                            localPasswordTracker = true;
                                   
                                            this.localPassword=param;
                                    

                               }
                            

                        /**
                        * field for RetransmissionInterval
                        */

                        
                                    protected long localRetransmissionInterval ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRetransmissionIntervalTracker = false ;

                           public boolean isRetransmissionIntervalSpecified(){
                               return localRetransmissionIntervalTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return long
                           */
                           public  long getRetransmissionInterval(){
                               return localRetransmissionInterval;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RetransmissionInterval
                               */
                               public void setRetransmissionInterval(long param){
                            
                                       // setting primitive attribute tracker to true
                                       localRetransmissionIntervalTracker =
                                       param != java.lang.Long.MIN_VALUE;
                                   
                                            this.localRetransmissionInterval=param;
                                    

                               }
                            

                        /**
                        * field for SequenceRemovalTimeoutInterval
                        */

                        
                                    protected long localSequenceRemovalTimeoutInterval ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSequenceRemovalTimeoutIntervalTracker = false ;

                           public boolean isSequenceRemovalTimeoutIntervalSpecified(){
                               return localSequenceRemovalTimeoutIntervalTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return long
                           */
                           public  long getSequenceRemovalTimeoutInterval(){
                               return localSequenceRemovalTimeoutInterval;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SequenceRemovalTimeoutInterval
                               */
                               public void setSequenceRemovalTimeoutInterval(long param){
                            
                                       // setting primitive attribute tracker to true
                                       localSequenceRemovalTimeoutIntervalTracker =
                                       param != java.lang.Long.MIN_VALUE;
                                   
                                            this.localSequenceRemovalTimeoutInterval=param;
                                    

                               }
                            

                        /**
                        * field for SequenceRemovalTimeoutMeasure
                        */

                        
                                    protected java.lang.String localSequenceRemovalTimeoutMeasure ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSequenceRemovalTimeoutMeasureTracker = false ;

                           public boolean isSequenceRemovalTimeoutMeasureSpecified(){
                               return localSequenceRemovalTimeoutMeasureTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getSequenceRemovalTimeoutMeasure(){
                               return localSequenceRemovalTimeoutMeasure;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SequenceRemovalTimeoutMeasure
                               */
                               public void setSequenceRemovalTimeoutMeasure(java.lang.String param){
                            localSequenceRemovalTimeoutMeasureTracker = true;
                                   
                                            this.localSequenceRemovalTimeoutMeasure=param;
                                    

                               }
                            

                        /**
                        * field for SequenceRemovalTimeoutValue
                        */

                        
                                    protected long localSequenceRemovalTimeoutValue ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSequenceRemovalTimeoutValueTracker = false ;

                           public boolean isSequenceRemovalTimeoutValueSpecified(){
                               return localSequenceRemovalTimeoutValueTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return long
                           */
                           public  long getSequenceRemovalTimeoutValue(){
                               return localSequenceRemovalTimeoutValue;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SequenceRemovalTimeoutValue
                               */
                               public void setSequenceRemovalTimeoutValue(long param){
                            
                                       // setting primitive attribute tracker to true
                                       localSequenceRemovalTimeoutValueTracker =
                                       param != java.lang.Long.MIN_VALUE;
                                   
                                            this.localSequenceRemovalTimeoutValue=param;
                                    

                               }
                            

                        /**
                        * field for StorageManager
                        */

                        
                                    protected java.lang.String localStorageManager ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localStorageManagerTracker = false ;

                           public boolean isStorageManagerSpecified(){
                               return localStorageManagerTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getStorageManager(){
                               return localStorageManager;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param StorageManager
                               */
                               public void setStorageManager(java.lang.String param){
                            localStorageManagerTracker = true;
                                   
                                            this.localStorageManager=param;
                                    

                               }
                            

                        /**
                        * field for UserName
                        */

                        
                                    protected java.lang.String localUserName ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localUserNameTracker = false ;

                           public boolean isUserNameSpecified(){
                               return localUserNameTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getUserName(){
                               return localUserName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param UserName
                               */
                               public void setUserName(java.lang.String param){
                            localUserNameTracker = true;
                                   
                                            this.localUserName=param;
                                    

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
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://global.rm.carbon.wso2.org/xsd");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":RMParameterBean",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "RMParameterBean",
                           xmlWriter);
                   }

               
                   }
                if (localAcknowledgementIntervalTracker){
                                    namespace = "http://global.rm.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "acknowledgementInterval", xmlWriter);
                             
                                               if (localAcknowledgementInterval==java.lang.Long.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("acknowledgementInterval cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAcknowledgementInterval));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localConnectionStringTracker){
                                    namespace = "http://global.rm.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "connectionString", xmlWriter);
                             

                                          if (localConnectionString==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localConnectionString);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localDriverNameTracker){
                                    namespace = "http://global.rm.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "driverName", xmlWriter);
                             

                                          if (localDriverName==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localDriverName);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localExponentialBackoffTracker){
                                    namespace = "http://global.rm.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "exponentialBackoff", xmlWriter);
                             
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("exponentialBackoff cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localExponentialBackoff));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localInactiveTimeoutValueTracker){
                                    namespace = "http://global.rm.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "inactiveTimeoutValue", xmlWriter);
                             
                                               if (localInactiveTimeoutValue==java.lang.Long.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("inactiveTimeoutValue cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localInactiveTimeoutValue));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localInactivityTimeoutIntervalTracker){
                                    namespace = "http://global.rm.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "inactivityTimeoutInterval", xmlWriter);
                             
                                               if (localInactivityTimeoutInterval==java.lang.Long.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("inactivityTimeoutInterval cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localInactivityTimeoutInterval));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localInactivityTimeoutMeasureTracker){
                                    namespace = "http://global.rm.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "inactivityTimeoutMeasure", xmlWriter);
                             

                                          if (localInactivityTimeoutMeasure==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localInactivityTimeoutMeasure);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localMaximumRetransmissionCountTracker){
                                    namespace = "http://global.rm.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "maximumRetransmissionCount", xmlWriter);
                             
                                               if (localMaximumRetransmissionCount==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("maximumRetransmissionCount cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMaximumRetransmissionCount));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPasswordTracker){
                                    namespace = "http://global.rm.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "password", xmlWriter);
                             

                                          if (localPassword==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localPassword);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localRetransmissionIntervalTracker){
                                    namespace = "http://global.rm.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "retransmissionInterval", xmlWriter);
                             
                                               if (localRetransmissionInterval==java.lang.Long.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("retransmissionInterval cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRetransmissionInterval));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localSequenceRemovalTimeoutIntervalTracker){
                                    namespace = "http://global.rm.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "sequenceRemovalTimeoutInterval", xmlWriter);
                             
                                               if (localSequenceRemovalTimeoutInterval==java.lang.Long.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("sequenceRemovalTimeoutInterval cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSequenceRemovalTimeoutInterval));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localSequenceRemovalTimeoutMeasureTracker){
                                    namespace = "http://global.rm.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "sequenceRemovalTimeoutMeasure", xmlWriter);
                             

                                          if (localSequenceRemovalTimeoutMeasure==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localSequenceRemovalTimeoutMeasure);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localSequenceRemovalTimeoutValueTracker){
                                    namespace = "http://global.rm.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "sequenceRemovalTimeoutValue", xmlWriter);
                             
                                               if (localSequenceRemovalTimeoutValue==java.lang.Long.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("sequenceRemovalTimeoutValue cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSequenceRemovalTimeoutValue));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localStorageManagerTracker){
                                    namespace = "http://global.rm.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "storageManager", xmlWriter);
                             

                                          if (localStorageManager==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localStorageManager);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localUserNameTracker){
                                    namespace = "http://global.rm.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "userName", xmlWriter);
                             

                                          if (localUserName==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localUserName);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             }
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://global.rm.carbon.wso2.org/xsd")){
                return "ns71";
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

                 if (localAcknowledgementIntervalTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://global.rm.carbon.wso2.org/xsd",
                                                                      "acknowledgementInterval"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAcknowledgementInterval));
                            } if (localConnectionStringTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://global.rm.carbon.wso2.org/xsd",
                                                                      "connectionString"));
                                 
                                         elementList.add(localConnectionString==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localConnectionString));
                                    } if (localDriverNameTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://global.rm.carbon.wso2.org/xsd",
                                                                      "driverName"));
                                 
                                         elementList.add(localDriverName==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDriverName));
                                    } if (localExponentialBackoffTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://global.rm.carbon.wso2.org/xsd",
                                                                      "exponentialBackoff"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localExponentialBackoff));
                            } if (localInactiveTimeoutValueTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://global.rm.carbon.wso2.org/xsd",
                                                                      "inactiveTimeoutValue"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localInactiveTimeoutValue));
                            } if (localInactivityTimeoutIntervalTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://global.rm.carbon.wso2.org/xsd",
                                                                      "inactivityTimeoutInterval"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localInactivityTimeoutInterval));
                            } if (localInactivityTimeoutMeasureTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://global.rm.carbon.wso2.org/xsd",
                                                                      "inactivityTimeoutMeasure"));
                                 
                                         elementList.add(localInactivityTimeoutMeasure==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localInactivityTimeoutMeasure));
                                    } if (localMaximumRetransmissionCountTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://global.rm.carbon.wso2.org/xsd",
                                                                      "maximumRetransmissionCount"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMaximumRetransmissionCount));
                            } if (localPasswordTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://global.rm.carbon.wso2.org/xsd",
                                                                      "password"));
                                 
                                         elementList.add(localPassword==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPassword));
                                    } if (localRetransmissionIntervalTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://global.rm.carbon.wso2.org/xsd",
                                                                      "retransmissionInterval"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRetransmissionInterval));
                            } if (localSequenceRemovalTimeoutIntervalTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://global.rm.carbon.wso2.org/xsd",
                                                                      "sequenceRemovalTimeoutInterval"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSequenceRemovalTimeoutInterval));
                            } if (localSequenceRemovalTimeoutMeasureTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://global.rm.carbon.wso2.org/xsd",
                                                                      "sequenceRemovalTimeoutMeasure"));
                                 
                                         elementList.add(localSequenceRemovalTimeoutMeasure==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSequenceRemovalTimeoutMeasure));
                                    } if (localSequenceRemovalTimeoutValueTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://global.rm.carbon.wso2.org/xsd",
                                                                      "sequenceRemovalTimeoutValue"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSequenceRemovalTimeoutValue));
                            } if (localStorageManagerTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://global.rm.carbon.wso2.org/xsd",
                                                                      "storageManager"));
                                 
                                         elementList.add(localStorageManager==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localStorageManager));
                                    } if (localUserNameTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://global.rm.carbon.wso2.org/xsd",
                                                                      "userName"));
                                 
                                         elementList.add(localUserName==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUserName));
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
        public static RMParameterBean parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            RMParameterBean object =
                new RMParameterBean();

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
                    
                            if (!"RMParameterBean".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (RMParameterBean)org.wso2.carbon.rm.global.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://global.rm.carbon.wso2.org/xsd","acknowledgementInterval").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"acknowledgementInterval" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setAcknowledgementInterval(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setAcknowledgementInterval(java.lang.Long.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://global.rm.carbon.wso2.org/xsd","connectionString").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setConnectionString(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://global.rm.carbon.wso2.org/xsd","driverName").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setDriverName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://global.rm.carbon.wso2.org/xsd","exponentialBackoff").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"exponentialBackoff" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setExponentialBackoff(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://global.rm.carbon.wso2.org/xsd","inactiveTimeoutValue").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"inactiveTimeoutValue" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setInactiveTimeoutValue(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setInactiveTimeoutValue(java.lang.Long.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://global.rm.carbon.wso2.org/xsd","inactivityTimeoutInterval").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"inactivityTimeoutInterval" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setInactivityTimeoutInterval(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setInactivityTimeoutInterval(java.lang.Long.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://global.rm.carbon.wso2.org/xsd","inactivityTimeoutMeasure").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setInactivityTimeoutMeasure(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://global.rm.carbon.wso2.org/xsd","maximumRetransmissionCount").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"maximumRetransmissionCount" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setMaximumRetransmissionCount(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setMaximumRetransmissionCount(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://global.rm.carbon.wso2.org/xsd","password").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPassword(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://global.rm.carbon.wso2.org/xsd","retransmissionInterval").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"retransmissionInterval" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setRetransmissionInterval(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setRetransmissionInterval(java.lang.Long.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://global.rm.carbon.wso2.org/xsd","sequenceRemovalTimeoutInterval").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"sequenceRemovalTimeoutInterval" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSequenceRemovalTimeoutInterval(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setSequenceRemovalTimeoutInterval(java.lang.Long.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://global.rm.carbon.wso2.org/xsd","sequenceRemovalTimeoutMeasure").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSequenceRemovalTimeoutMeasure(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://global.rm.carbon.wso2.org/xsd","sequenceRemovalTimeoutValue").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"sequenceRemovalTimeoutValue" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSequenceRemovalTimeoutValue(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setSequenceRemovalTimeoutValue(java.lang.Long.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://global.rm.carbon.wso2.org/xsd","storageManager").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setStorageManager(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://global.rm.carbon.wso2.org/xsd","userName").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setUserName(
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
           
    
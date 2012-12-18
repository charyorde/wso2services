
/**
 * LatencyViewStatistics.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v3  Built on : Oct 26, 2011 (07:42:27 PDT)
 */

            
                package org.wso2.carbon.statistics.transport.services.util.xsd;
            

            /**
            *  LatencyViewStatistics bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class LatencyViewStatistics
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = LatencyViewStatistics
                Namespace URI = http://util.services.transport.statistics.carbon.wso2.org/xsd
                Namespace Prefix = ns19
                */
            

                        /**
                        * field for NioHttpAllTimeAvgLatency
                        */

                        
                                    protected double localNioHttpAllTimeAvgLatency ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localNioHttpAllTimeAvgLatencyTracker = false ;

                           public boolean isNioHttpAllTimeAvgLatencySpecified(){
                               return localNioHttpAllTimeAvgLatencyTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return double
                           */
                           public  double getNioHttpAllTimeAvgLatency(){
                               return localNioHttpAllTimeAvgLatency;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param NioHttpAllTimeAvgLatency
                               */
                               public void setNioHttpAllTimeAvgLatency(double param){
                            
                                       // setting primitive attribute tracker to true
                                       localNioHttpAllTimeAvgLatencyTracker =
                                       !java.lang.Double.isNaN(param);
                                   
                                            this.localNioHttpAllTimeAvgLatency=param;
                                    

                               }
                            

                        /**
                        * field for NioHttpLast15MinuteAvgLatency
                        */

                        
                                    protected double localNioHttpLast15MinuteAvgLatency ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localNioHttpLast15MinuteAvgLatencyTracker = false ;

                           public boolean isNioHttpLast15MinuteAvgLatencySpecified(){
                               return localNioHttpLast15MinuteAvgLatencyTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return double
                           */
                           public  double getNioHttpLast15MinuteAvgLatency(){
                               return localNioHttpLast15MinuteAvgLatency;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param NioHttpLast15MinuteAvgLatency
                               */
                               public void setNioHttpLast15MinuteAvgLatency(double param){
                            
                                       // setting primitive attribute tracker to true
                                       localNioHttpLast15MinuteAvgLatencyTracker =
                                       !java.lang.Double.isNaN(param);
                                   
                                            this.localNioHttpLast15MinuteAvgLatency=param;
                                    

                               }
                            

                        /**
                        * field for NioHttpLast24HourAvgLatency
                        */

                        
                                    protected double localNioHttpLast24HourAvgLatency ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localNioHttpLast24HourAvgLatencyTracker = false ;

                           public boolean isNioHttpLast24HourAvgLatencySpecified(){
                               return localNioHttpLast24HourAvgLatencyTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return double
                           */
                           public  double getNioHttpLast24HourAvgLatency(){
                               return localNioHttpLast24HourAvgLatency;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param NioHttpLast24HourAvgLatency
                               */
                               public void setNioHttpLast24HourAvgLatency(double param){
                            
                                       // setting primitive attribute tracker to true
                                       localNioHttpLast24HourAvgLatencyTracker =
                                       !java.lang.Double.isNaN(param);
                                   
                                            this.localNioHttpLast24HourAvgLatency=param;
                                    

                               }
                            

                        /**
                        * field for NioHttpLast5MinuteAvgLatency
                        */

                        
                                    protected double localNioHttpLast5MinuteAvgLatency ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localNioHttpLast5MinuteAvgLatencyTracker = false ;

                           public boolean isNioHttpLast5MinuteAvgLatencySpecified(){
                               return localNioHttpLast5MinuteAvgLatencyTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return double
                           */
                           public  double getNioHttpLast5MinuteAvgLatency(){
                               return localNioHttpLast5MinuteAvgLatency;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param NioHttpLast5MinuteAvgLatency
                               */
                               public void setNioHttpLast5MinuteAvgLatency(double param){
                            
                                       // setting primitive attribute tracker to true
                                       localNioHttpLast5MinuteAvgLatencyTracker =
                                       !java.lang.Double.isNaN(param);
                                   
                                            this.localNioHttpLast5MinuteAvgLatency=param;
                                    

                               }
                            

                        /**
                        * field for NioHttpLast8HourAvgLatency
                        */

                        
                                    protected double localNioHttpLast8HourAvgLatency ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localNioHttpLast8HourAvgLatencyTracker = false ;

                           public boolean isNioHttpLast8HourAvgLatencySpecified(){
                               return localNioHttpLast8HourAvgLatencyTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return double
                           */
                           public  double getNioHttpLast8HourAvgLatency(){
                               return localNioHttpLast8HourAvgLatency;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param NioHttpLast8HourAvgLatency
                               */
                               public void setNioHttpLast8HourAvgLatency(double param){
                            
                                       // setting primitive attribute tracker to true
                                       localNioHttpLast8HourAvgLatencyTracker =
                                       !java.lang.Double.isNaN(param);
                                   
                                            this.localNioHttpLast8HourAvgLatency=param;
                                    

                               }
                            

                        /**
                        * field for NioHttpLastHourAvgLatency
                        */

                        
                                    protected double localNioHttpLastHourAvgLatency ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localNioHttpLastHourAvgLatencyTracker = false ;

                           public boolean isNioHttpLastHourAvgLatencySpecified(){
                               return localNioHttpLastHourAvgLatencyTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return double
                           */
                           public  double getNioHttpLastHourAvgLatency(){
                               return localNioHttpLastHourAvgLatency;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param NioHttpLastHourAvgLatency
                               */
                               public void setNioHttpLastHourAvgLatency(double param){
                            
                                       // setting primitive attribute tracker to true
                                       localNioHttpLastHourAvgLatencyTracker =
                                       !java.lang.Double.isNaN(param);
                                   
                                            this.localNioHttpLastHourAvgLatency=param;
                                    

                               }
                            

                        /**
                        * field for NioHttpLastMinuteAvgLatency
                        */

                        
                                    protected double localNioHttpLastMinuteAvgLatency ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localNioHttpLastMinuteAvgLatencyTracker = false ;

                           public boolean isNioHttpLastMinuteAvgLatencySpecified(){
                               return localNioHttpLastMinuteAvgLatencyTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return double
                           */
                           public  double getNioHttpLastMinuteAvgLatency(){
                               return localNioHttpLastMinuteAvgLatency;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param NioHttpLastMinuteAvgLatency
                               */
                               public void setNioHttpLastMinuteAvgLatency(double param){
                            
                                       // setting primitive attribute tracker to true
                                       localNioHttpLastMinuteAvgLatencyTracker =
                                       !java.lang.Double.isNaN(param);
                                   
                                            this.localNioHttpLastMinuteAvgLatency=param;
                                    

                               }
                            

                        /**
                        * field for NioHttpLastResetTime
                        */

                        
                                    protected java.lang.String localNioHttpLastResetTime ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localNioHttpLastResetTimeTracker = false ;

                           public boolean isNioHttpLastResetTimeSpecified(){
                               return localNioHttpLastResetTimeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getNioHttpLastResetTime(){
                               return localNioHttpLastResetTime;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param NioHttpLastResetTime
                               */
                               public void setNioHttpLastResetTime(java.lang.String param){
                            localNioHttpLastResetTimeTracker = true;
                                   
                                            this.localNioHttpLastResetTime=param;
                                    

                               }
                            

                        /**
                        * field for NioHttpsAllTimeAvgLatency
                        */

                        
                                    protected double localNioHttpsAllTimeAvgLatency ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localNioHttpsAllTimeAvgLatencyTracker = false ;

                           public boolean isNioHttpsAllTimeAvgLatencySpecified(){
                               return localNioHttpsAllTimeAvgLatencyTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return double
                           */
                           public  double getNioHttpsAllTimeAvgLatency(){
                               return localNioHttpsAllTimeAvgLatency;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param NioHttpsAllTimeAvgLatency
                               */
                               public void setNioHttpsAllTimeAvgLatency(double param){
                            
                                       // setting primitive attribute tracker to true
                                       localNioHttpsAllTimeAvgLatencyTracker =
                                       !java.lang.Double.isNaN(param);
                                   
                                            this.localNioHttpsAllTimeAvgLatency=param;
                                    

                               }
                            

                        /**
                        * field for NioHttpsLast15MinuteAvgLatency
                        */

                        
                                    protected double localNioHttpsLast15MinuteAvgLatency ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localNioHttpsLast15MinuteAvgLatencyTracker = false ;

                           public boolean isNioHttpsLast15MinuteAvgLatencySpecified(){
                               return localNioHttpsLast15MinuteAvgLatencyTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return double
                           */
                           public  double getNioHttpsLast15MinuteAvgLatency(){
                               return localNioHttpsLast15MinuteAvgLatency;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param NioHttpsLast15MinuteAvgLatency
                               */
                               public void setNioHttpsLast15MinuteAvgLatency(double param){
                            
                                       // setting primitive attribute tracker to true
                                       localNioHttpsLast15MinuteAvgLatencyTracker =
                                       !java.lang.Double.isNaN(param);
                                   
                                            this.localNioHttpsLast15MinuteAvgLatency=param;
                                    

                               }
                            

                        /**
                        * field for NioHttpsLast24HourAvgLatency
                        */

                        
                                    protected double localNioHttpsLast24HourAvgLatency ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localNioHttpsLast24HourAvgLatencyTracker = false ;

                           public boolean isNioHttpsLast24HourAvgLatencySpecified(){
                               return localNioHttpsLast24HourAvgLatencyTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return double
                           */
                           public  double getNioHttpsLast24HourAvgLatency(){
                               return localNioHttpsLast24HourAvgLatency;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param NioHttpsLast24HourAvgLatency
                               */
                               public void setNioHttpsLast24HourAvgLatency(double param){
                            
                                       // setting primitive attribute tracker to true
                                       localNioHttpsLast24HourAvgLatencyTracker =
                                       !java.lang.Double.isNaN(param);
                                   
                                            this.localNioHttpsLast24HourAvgLatency=param;
                                    

                               }
                            

                        /**
                        * field for NioHttpsLast5MinuteAvgLatency
                        */

                        
                                    protected double localNioHttpsLast5MinuteAvgLatency ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localNioHttpsLast5MinuteAvgLatencyTracker = false ;

                           public boolean isNioHttpsLast5MinuteAvgLatencySpecified(){
                               return localNioHttpsLast5MinuteAvgLatencyTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return double
                           */
                           public  double getNioHttpsLast5MinuteAvgLatency(){
                               return localNioHttpsLast5MinuteAvgLatency;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param NioHttpsLast5MinuteAvgLatency
                               */
                               public void setNioHttpsLast5MinuteAvgLatency(double param){
                            
                                       // setting primitive attribute tracker to true
                                       localNioHttpsLast5MinuteAvgLatencyTracker =
                                       !java.lang.Double.isNaN(param);
                                   
                                            this.localNioHttpsLast5MinuteAvgLatency=param;
                                    

                               }
                            

                        /**
                        * field for NioHttpsLast8HourAvgLatency
                        */

                        
                                    protected double localNioHttpsLast8HourAvgLatency ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localNioHttpsLast8HourAvgLatencyTracker = false ;

                           public boolean isNioHttpsLast8HourAvgLatencySpecified(){
                               return localNioHttpsLast8HourAvgLatencyTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return double
                           */
                           public  double getNioHttpsLast8HourAvgLatency(){
                               return localNioHttpsLast8HourAvgLatency;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param NioHttpsLast8HourAvgLatency
                               */
                               public void setNioHttpsLast8HourAvgLatency(double param){
                            
                                       // setting primitive attribute tracker to true
                                       localNioHttpsLast8HourAvgLatencyTracker =
                                       !java.lang.Double.isNaN(param);
                                   
                                            this.localNioHttpsLast8HourAvgLatency=param;
                                    

                               }
                            

                        /**
                        * field for NioHttpsLastHourAvgLatency
                        */

                        
                                    protected double localNioHttpsLastHourAvgLatency ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localNioHttpsLastHourAvgLatencyTracker = false ;

                           public boolean isNioHttpsLastHourAvgLatencySpecified(){
                               return localNioHttpsLastHourAvgLatencyTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return double
                           */
                           public  double getNioHttpsLastHourAvgLatency(){
                               return localNioHttpsLastHourAvgLatency;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param NioHttpsLastHourAvgLatency
                               */
                               public void setNioHttpsLastHourAvgLatency(double param){
                            
                                       // setting primitive attribute tracker to true
                                       localNioHttpsLastHourAvgLatencyTracker =
                                       !java.lang.Double.isNaN(param);
                                   
                                            this.localNioHttpsLastHourAvgLatency=param;
                                    

                               }
                            

                        /**
                        * field for NioHttpsLastMinuteAvgLatency
                        */

                        
                                    protected double localNioHttpsLastMinuteAvgLatency ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localNioHttpsLastMinuteAvgLatencyTracker = false ;

                           public boolean isNioHttpsLastMinuteAvgLatencySpecified(){
                               return localNioHttpsLastMinuteAvgLatencyTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return double
                           */
                           public  double getNioHttpsLastMinuteAvgLatency(){
                               return localNioHttpsLastMinuteAvgLatency;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param NioHttpsLastMinuteAvgLatency
                               */
                               public void setNioHttpsLastMinuteAvgLatency(double param){
                            
                                       // setting primitive attribute tracker to true
                                       localNioHttpsLastMinuteAvgLatencyTracker =
                                       !java.lang.Double.isNaN(param);
                                   
                                            this.localNioHttpsLastMinuteAvgLatency=param;
                                    

                               }
                            

                        /**
                        * field for NioHttpsLastResetTime
                        */

                        
                                    protected java.lang.String localNioHttpsLastResetTime ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localNioHttpsLastResetTimeTracker = false ;

                           public boolean isNioHttpsLastResetTimeSpecified(){
                               return localNioHttpsLastResetTimeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getNioHttpsLastResetTime(){
                               return localNioHttpsLastResetTime;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param NioHttpsLastResetTime
                               */
                               public void setNioHttpsLastResetTime(java.lang.String param){
                            localNioHttpsLastResetTimeTracker = true;
                                   
                                            this.localNioHttpsLastResetTime=param;
                                    

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
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://util.services.transport.statistics.carbon.wso2.org/xsd");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":LatencyViewStatistics",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "LatencyViewStatistics",
                           xmlWriter);
                   }

               
                   }
                if (localNioHttpAllTimeAvgLatencyTracker){
                                    namespace = "http://util.services.transport.statistics.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "nioHttpAllTimeAvgLatency", xmlWriter);
                             
                                               if (java.lang.Double.isNaN(localNioHttpAllTimeAvgLatency)) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("nioHttpAllTimeAvgLatency cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNioHttpAllTimeAvgLatency));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localNioHttpLast15MinuteAvgLatencyTracker){
                                    namespace = "http://util.services.transport.statistics.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "nioHttpLast15MinuteAvgLatency", xmlWriter);
                             
                                               if (java.lang.Double.isNaN(localNioHttpLast15MinuteAvgLatency)) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("nioHttpLast15MinuteAvgLatency cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNioHttpLast15MinuteAvgLatency));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localNioHttpLast24HourAvgLatencyTracker){
                                    namespace = "http://util.services.transport.statistics.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "nioHttpLast24HourAvgLatency", xmlWriter);
                             
                                               if (java.lang.Double.isNaN(localNioHttpLast24HourAvgLatency)) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("nioHttpLast24HourAvgLatency cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNioHttpLast24HourAvgLatency));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localNioHttpLast5MinuteAvgLatencyTracker){
                                    namespace = "http://util.services.transport.statistics.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "nioHttpLast5MinuteAvgLatency", xmlWriter);
                             
                                               if (java.lang.Double.isNaN(localNioHttpLast5MinuteAvgLatency)) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("nioHttpLast5MinuteAvgLatency cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNioHttpLast5MinuteAvgLatency));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localNioHttpLast8HourAvgLatencyTracker){
                                    namespace = "http://util.services.transport.statistics.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "nioHttpLast8HourAvgLatency", xmlWriter);
                             
                                               if (java.lang.Double.isNaN(localNioHttpLast8HourAvgLatency)) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("nioHttpLast8HourAvgLatency cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNioHttpLast8HourAvgLatency));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localNioHttpLastHourAvgLatencyTracker){
                                    namespace = "http://util.services.transport.statistics.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "nioHttpLastHourAvgLatency", xmlWriter);
                             
                                               if (java.lang.Double.isNaN(localNioHttpLastHourAvgLatency)) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("nioHttpLastHourAvgLatency cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNioHttpLastHourAvgLatency));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localNioHttpLastMinuteAvgLatencyTracker){
                                    namespace = "http://util.services.transport.statistics.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "nioHttpLastMinuteAvgLatency", xmlWriter);
                             
                                               if (java.lang.Double.isNaN(localNioHttpLastMinuteAvgLatency)) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("nioHttpLastMinuteAvgLatency cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNioHttpLastMinuteAvgLatency));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localNioHttpLastResetTimeTracker){
                                    namespace = "http://util.services.transport.statistics.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "nioHttpLastResetTime", xmlWriter);
                             

                                          if (localNioHttpLastResetTime==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localNioHttpLastResetTime);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localNioHttpsAllTimeAvgLatencyTracker){
                                    namespace = "http://util.services.transport.statistics.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "nioHttpsAllTimeAvgLatency", xmlWriter);
                             
                                               if (java.lang.Double.isNaN(localNioHttpsAllTimeAvgLatency)) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("nioHttpsAllTimeAvgLatency cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNioHttpsAllTimeAvgLatency));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localNioHttpsLast15MinuteAvgLatencyTracker){
                                    namespace = "http://util.services.transport.statistics.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "nioHttpsLast15MinuteAvgLatency", xmlWriter);
                             
                                               if (java.lang.Double.isNaN(localNioHttpsLast15MinuteAvgLatency)) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("nioHttpsLast15MinuteAvgLatency cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNioHttpsLast15MinuteAvgLatency));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localNioHttpsLast24HourAvgLatencyTracker){
                                    namespace = "http://util.services.transport.statistics.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "nioHttpsLast24HourAvgLatency", xmlWriter);
                             
                                               if (java.lang.Double.isNaN(localNioHttpsLast24HourAvgLatency)) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("nioHttpsLast24HourAvgLatency cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNioHttpsLast24HourAvgLatency));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localNioHttpsLast5MinuteAvgLatencyTracker){
                                    namespace = "http://util.services.transport.statistics.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "nioHttpsLast5MinuteAvgLatency", xmlWriter);
                             
                                               if (java.lang.Double.isNaN(localNioHttpsLast5MinuteAvgLatency)) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("nioHttpsLast5MinuteAvgLatency cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNioHttpsLast5MinuteAvgLatency));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localNioHttpsLast8HourAvgLatencyTracker){
                                    namespace = "http://util.services.transport.statistics.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "nioHttpsLast8HourAvgLatency", xmlWriter);
                             
                                               if (java.lang.Double.isNaN(localNioHttpsLast8HourAvgLatency)) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("nioHttpsLast8HourAvgLatency cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNioHttpsLast8HourAvgLatency));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localNioHttpsLastHourAvgLatencyTracker){
                                    namespace = "http://util.services.transport.statistics.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "nioHttpsLastHourAvgLatency", xmlWriter);
                             
                                               if (java.lang.Double.isNaN(localNioHttpsLastHourAvgLatency)) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("nioHttpsLastHourAvgLatency cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNioHttpsLastHourAvgLatency));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localNioHttpsLastMinuteAvgLatencyTracker){
                                    namespace = "http://util.services.transport.statistics.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "nioHttpsLastMinuteAvgLatency", xmlWriter);
                             
                                               if (java.lang.Double.isNaN(localNioHttpsLastMinuteAvgLatency)) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("nioHttpsLastMinuteAvgLatency cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNioHttpsLastMinuteAvgLatency));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localNioHttpsLastResetTimeTracker){
                                    namespace = "http://util.services.transport.statistics.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "nioHttpsLastResetTime", xmlWriter);
                             

                                          if (localNioHttpsLastResetTime==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localNioHttpsLastResetTime);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             }
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://util.services.transport.statistics.carbon.wso2.org/xsd")){
                return "ns19";
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

                 if (localNioHttpAllTimeAvgLatencyTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd",
                                                                      "nioHttpAllTimeAvgLatency"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNioHttpAllTimeAvgLatency));
                            } if (localNioHttpLast15MinuteAvgLatencyTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd",
                                                                      "nioHttpLast15MinuteAvgLatency"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNioHttpLast15MinuteAvgLatency));
                            } if (localNioHttpLast24HourAvgLatencyTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd",
                                                                      "nioHttpLast24HourAvgLatency"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNioHttpLast24HourAvgLatency));
                            } if (localNioHttpLast5MinuteAvgLatencyTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd",
                                                                      "nioHttpLast5MinuteAvgLatency"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNioHttpLast5MinuteAvgLatency));
                            } if (localNioHttpLast8HourAvgLatencyTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd",
                                                                      "nioHttpLast8HourAvgLatency"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNioHttpLast8HourAvgLatency));
                            } if (localNioHttpLastHourAvgLatencyTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd",
                                                                      "nioHttpLastHourAvgLatency"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNioHttpLastHourAvgLatency));
                            } if (localNioHttpLastMinuteAvgLatencyTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd",
                                                                      "nioHttpLastMinuteAvgLatency"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNioHttpLastMinuteAvgLatency));
                            } if (localNioHttpLastResetTimeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd",
                                                                      "nioHttpLastResetTime"));
                                 
                                         elementList.add(localNioHttpLastResetTime==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNioHttpLastResetTime));
                                    } if (localNioHttpsAllTimeAvgLatencyTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd",
                                                                      "nioHttpsAllTimeAvgLatency"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNioHttpsAllTimeAvgLatency));
                            } if (localNioHttpsLast15MinuteAvgLatencyTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd",
                                                                      "nioHttpsLast15MinuteAvgLatency"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNioHttpsLast15MinuteAvgLatency));
                            } if (localNioHttpsLast24HourAvgLatencyTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd",
                                                                      "nioHttpsLast24HourAvgLatency"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNioHttpsLast24HourAvgLatency));
                            } if (localNioHttpsLast5MinuteAvgLatencyTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd",
                                                                      "nioHttpsLast5MinuteAvgLatency"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNioHttpsLast5MinuteAvgLatency));
                            } if (localNioHttpsLast8HourAvgLatencyTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd",
                                                                      "nioHttpsLast8HourAvgLatency"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNioHttpsLast8HourAvgLatency));
                            } if (localNioHttpsLastHourAvgLatencyTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd",
                                                                      "nioHttpsLastHourAvgLatency"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNioHttpsLastHourAvgLatency));
                            } if (localNioHttpsLastMinuteAvgLatencyTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd",
                                                                      "nioHttpsLastMinuteAvgLatency"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNioHttpsLastMinuteAvgLatency));
                            } if (localNioHttpsLastResetTimeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd",
                                                                      "nioHttpsLastResetTime"));
                                 
                                         elementList.add(localNioHttpsLastResetTime==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNioHttpsLastResetTime));
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
        public static LatencyViewStatistics parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            LatencyViewStatistics object =
                new LatencyViewStatistics();

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
                    
                            if (!"LatencyViewStatistics".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (LatencyViewStatistics)axis2.apache.org.xsd.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd","nioHttpAllTimeAvgLatency").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"nioHttpAllTimeAvgLatency" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setNioHttpAllTimeAvgLatency(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setNioHttpAllTimeAvgLatency(java.lang.Double.NaN);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd","nioHttpLast15MinuteAvgLatency").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"nioHttpLast15MinuteAvgLatency" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setNioHttpLast15MinuteAvgLatency(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setNioHttpLast15MinuteAvgLatency(java.lang.Double.NaN);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd","nioHttpLast24HourAvgLatency").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"nioHttpLast24HourAvgLatency" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setNioHttpLast24HourAvgLatency(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setNioHttpLast24HourAvgLatency(java.lang.Double.NaN);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd","nioHttpLast5MinuteAvgLatency").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"nioHttpLast5MinuteAvgLatency" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setNioHttpLast5MinuteAvgLatency(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setNioHttpLast5MinuteAvgLatency(java.lang.Double.NaN);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd","nioHttpLast8HourAvgLatency").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"nioHttpLast8HourAvgLatency" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setNioHttpLast8HourAvgLatency(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setNioHttpLast8HourAvgLatency(java.lang.Double.NaN);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd","nioHttpLastHourAvgLatency").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"nioHttpLastHourAvgLatency" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setNioHttpLastHourAvgLatency(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setNioHttpLastHourAvgLatency(java.lang.Double.NaN);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd","nioHttpLastMinuteAvgLatency").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"nioHttpLastMinuteAvgLatency" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setNioHttpLastMinuteAvgLatency(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setNioHttpLastMinuteAvgLatency(java.lang.Double.NaN);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd","nioHttpLastResetTime").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setNioHttpLastResetTime(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd","nioHttpsAllTimeAvgLatency").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"nioHttpsAllTimeAvgLatency" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setNioHttpsAllTimeAvgLatency(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setNioHttpsAllTimeAvgLatency(java.lang.Double.NaN);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd","nioHttpsLast15MinuteAvgLatency").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"nioHttpsLast15MinuteAvgLatency" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setNioHttpsLast15MinuteAvgLatency(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setNioHttpsLast15MinuteAvgLatency(java.lang.Double.NaN);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd","nioHttpsLast24HourAvgLatency").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"nioHttpsLast24HourAvgLatency" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setNioHttpsLast24HourAvgLatency(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setNioHttpsLast24HourAvgLatency(java.lang.Double.NaN);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd","nioHttpsLast5MinuteAvgLatency").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"nioHttpsLast5MinuteAvgLatency" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setNioHttpsLast5MinuteAvgLatency(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setNioHttpsLast5MinuteAvgLatency(java.lang.Double.NaN);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd","nioHttpsLast8HourAvgLatency").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"nioHttpsLast8HourAvgLatency" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setNioHttpsLast8HourAvgLatency(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setNioHttpsLast8HourAvgLatency(java.lang.Double.NaN);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd","nioHttpsLastHourAvgLatency").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"nioHttpsLastHourAvgLatency" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setNioHttpsLastHourAvgLatency(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setNioHttpsLastHourAvgLatency(java.lang.Double.NaN);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd","nioHttpsLastMinuteAvgLatency").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"nioHttpsLastMinuteAvgLatency" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setNioHttpsLastMinuteAvgLatency(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setNioHttpsLastMinuteAvgLatency(java.lang.Double.NaN);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd","nioHttpsLastResetTime").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setNioHttpsLastResetTime(
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
           
    
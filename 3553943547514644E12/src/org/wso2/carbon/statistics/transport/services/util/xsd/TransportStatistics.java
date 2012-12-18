
/**
 * TransportStatistics.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v3  Built on : Oct 26, 2011 (07:42:27 PDT)
 */

            
                package org.wso2.carbon.statistics.transport.services.util.xsd;
            

            /**
            *  TransportStatistics bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class TransportStatistics
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = TransportStatistics
                Namespace URI = http://util.services.transport.statistics.carbon.wso2.org/xsd
                Namespace Prefix = ns19
                */
            

                        /**
                        * field for TransportListenerActiveThreadCount
                        */

                        
                                    protected int localTransportListenerActiveThreadCount ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTransportListenerActiveThreadCountTracker = false ;

                           public boolean isTransportListenerActiveThreadCountSpecified(){
                               return localTransportListenerActiveThreadCountTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getTransportListenerActiveThreadCount(){
                               return localTransportListenerActiveThreadCount;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TransportListenerActiveThreadCount
                               */
                               public void setTransportListenerActiveThreadCount(int param){
                            
                                       // setting primitive attribute tracker to true
                                       localTransportListenerActiveThreadCountTracker =
                                       param != java.lang.Integer.MIN_VALUE;
                                   
                                            this.localTransportListenerActiveThreadCount=param;
                                    

                               }
                            

                        /**
                        * field for TransportListenerAvgSizeReceived
                        */

                        
                                    protected double localTransportListenerAvgSizeReceived ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTransportListenerAvgSizeReceivedTracker = false ;

                           public boolean isTransportListenerAvgSizeReceivedSpecified(){
                               return localTransportListenerAvgSizeReceivedTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return double
                           */
                           public  double getTransportListenerAvgSizeReceived(){
                               return localTransportListenerAvgSizeReceived;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TransportListenerAvgSizeReceived
                               */
                               public void setTransportListenerAvgSizeReceived(double param){
                            
                                       // setting primitive attribute tracker to true
                                       localTransportListenerAvgSizeReceivedTracker =
                                       !java.lang.Double.isNaN(param);
                                   
                                            this.localTransportListenerAvgSizeReceived=param;
                                    

                               }
                            

                        /**
                        * field for TransportListenerAvgSizeSent
                        */

                        
                                    protected double localTransportListenerAvgSizeSent ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTransportListenerAvgSizeSentTracker = false ;

                           public boolean isTransportListenerAvgSizeSentSpecified(){
                               return localTransportListenerAvgSizeSentTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return double
                           */
                           public  double getTransportListenerAvgSizeSent(){
                               return localTransportListenerAvgSizeSent;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TransportListenerAvgSizeSent
                               */
                               public void setTransportListenerAvgSizeSent(double param){
                            
                                       // setting primitive attribute tracker to true
                                       localTransportListenerAvgSizeSentTracker =
                                       !java.lang.Double.isNaN(param);
                                   
                                            this.localTransportListenerAvgSizeSent=param;
                                    

                               }
                            

                        /**
                        * field for TransportListenerBytesReceived
                        */

                        
                                    protected long localTransportListenerBytesReceived ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTransportListenerBytesReceivedTracker = false ;

                           public boolean isTransportListenerBytesReceivedSpecified(){
                               return localTransportListenerBytesReceivedTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return long
                           */
                           public  long getTransportListenerBytesReceived(){
                               return localTransportListenerBytesReceived;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TransportListenerBytesReceived
                               */
                               public void setTransportListenerBytesReceived(long param){
                            
                                       // setting primitive attribute tracker to true
                                       localTransportListenerBytesReceivedTracker =
                                       param != java.lang.Long.MIN_VALUE;
                                   
                                            this.localTransportListenerBytesReceived=param;
                                    

                               }
                            

                        /**
                        * field for TransportListenerBytesSent
                        */

                        
                                    protected long localTransportListenerBytesSent ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTransportListenerBytesSentTracker = false ;

                           public boolean isTransportListenerBytesSentSpecified(){
                               return localTransportListenerBytesSentTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return long
                           */
                           public  long getTransportListenerBytesSent(){
                               return localTransportListenerBytesSent;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TransportListenerBytesSent
                               */
                               public void setTransportListenerBytesSent(long param){
                            
                                       // setting primitive attribute tracker to true
                                       localTransportListenerBytesSentTracker =
                                       param != java.lang.Long.MIN_VALUE;
                                   
                                            this.localTransportListenerBytesSent=param;
                                    

                               }
                            

                        /**
                        * field for TransportListenerClassName
                        */

                        
                                    protected java.lang.String localTransportListenerClassName ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTransportListenerClassNameTracker = false ;

                           public boolean isTransportListenerClassNameSpecified(){
                               return localTransportListenerClassNameTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getTransportListenerClassName(){
                               return localTransportListenerClassName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TransportListenerClassName
                               */
                               public void setTransportListenerClassName(java.lang.String param){
                            localTransportListenerClassNameTracker = true;
                                   
                                            this.localTransportListenerClassName=param;
                                    

                               }
                            

                        /**
                        * field for TransportListenerFaultsReceiving
                        */

                        
                                    protected long localTransportListenerFaultsReceiving ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTransportListenerFaultsReceivingTracker = false ;

                           public boolean isTransportListenerFaultsReceivingSpecified(){
                               return localTransportListenerFaultsReceivingTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return long
                           */
                           public  long getTransportListenerFaultsReceiving(){
                               return localTransportListenerFaultsReceiving;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TransportListenerFaultsReceiving
                               */
                               public void setTransportListenerFaultsReceiving(long param){
                            
                                       // setting primitive attribute tracker to true
                                       localTransportListenerFaultsReceivingTracker =
                                       param != java.lang.Long.MIN_VALUE;
                                   
                                            this.localTransportListenerFaultsReceiving=param;
                                    

                               }
                            

                        /**
                        * field for TransportListenerFaultsSending
                        */

                        
                                    protected long localTransportListenerFaultsSending ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTransportListenerFaultsSendingTracker = false ;

                           public boolean isTransportListenerFaultsSendingSpecified(){
                               return localTransportListenerFaultsSendingTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return long
                           */
                           public  long getTransportListenerFaultsSending(){
                               return localTransportListenerFaultsSending;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TransportListenerFaultsSending
                               */
                               public void setTransportListenerFaultsSending(long param){
                            
                                       // setting primitive attribute tracker to true
                                       localTransportListenerFaultsSendingTracker =
                                       param != java.lang.Long.MIN_VALUE;
                                   
                                            this.localTransportListenerFaultsSending=param;
                                    

                               }
                            

                        /**
                        * field for TransportListenerLastResetTime
                        */

                        
                                    protected long localTransportListenerLastResetTime ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTransportListenerLastResetTimeTracker = false ;

                           public boolean isTransportListenerLastResetTimeSpecified(){
                               return localTransportListenerLastResetTimeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return long
                           */
                           public  long getTransportListenerLastResetTime(){
                               return localTransportListenerLastResetTime;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TransportListenerLastResetTime
                               */
                               public void setTransportListenerLastResetTime(long param){
                            
                                       // setting primitive attribute tracker to true
                                       localTransportListenerLastResetTimeTracker =
                                       param != java.lang.Long.MIN_VALUE;
                                   
                                            this.localTransportListenerLastResetTime=param;
                                    

                               }
                            

                        /**
                        * field for TransportListenerMaxSizeReceived
                        */

                        
                                    protected long localTransportListenerMaxSizeReceived ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTransportListenerMaxSizeReceivedTracker = false ;

                           public boolean isTransportListenerMaxSizeReceivedSpecified(){
                               return localTransportListenerMaxSizeReceivedTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return long
                           */
                           public  long getTransportListenerMaxSizeReceived(){
                               return localTransportListenerMaxSizeReceived;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TransportListenerMaxSizeReceived
                               */
                               public void setTransportListenerMaxSizeReceived(long param){
                            
                                       // setting primitive attribute tracker to true
                                       localTransportListenerMaxSizeReceivedTracker =
                                       param != java.lang.Long.MIN_VALUE;
                                   
                                            this.localTransportListenerMaxSizeReceived=param;
                                    

                               }
                            

                        /**
                        * field for TransportListenerMaxSizeSent
                        */

                        
                                    protected long localTransportListenerMaxSizeSent ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTransportListenerMaxSizeSentTracker = false ;

                           public boolean isTransportListenerMaxSizeSentSpecified(){
                               return localTransportListenerMaxSizeSentTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return long
                           */
                           public  long getTransportListenerMaxSizeSent(){
                               return localTransportListenerMaxSizeSent;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TransportListenerMaxSizeSent
                               */
                               public void setTransportListenerMaxSizeSent(long param){
                            
                                       // setting primitive attribute tracker to true
                                       localTransportListenerMaxSizeSentTracker =
                                       param != java.lang.Long.MIN_VALUE;
                                   
                                            this.localTransportListenerMaxSizeSent=param;
                                    

                               }
                            

                        /**
                        * field for TransportListenerMessagesReceived
                        */

                        
                                    protected long localTransportListenerMessagesReceived ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTransportListenerMessagesReceivedTracker = false ;

                           public boolean isTransportListenerMessagesReceivedSpecified(){
                               return localTransportListenerMessagesReceivedTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return long
                           */
                           public  long getTransportListenerMessagesReceived(){
                               return localTransportListenerMessagesReceived;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TransportListenerMessagesReceived
                               */
                               public void setTransportListenerMessagesReceived(long param){
                            
                                       // setting primitive attribute tracker to true
                                       localTransportListenerMessagesReceivedTracker =
                                       param != java.lang.Long.MIN_VALUE;
                                   
                                            this.localTransportListenerMessagesReceived=param;
                                    

                               }
                            

                        /**
                        * field for TransportListenerMessagesSent
                        */

                        
                                    protected long localTransportListenerMessagesSent ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTransportListenerMessagesSentTracker = false ;

                           public boolean isTransportListenerMessagesSentSpecified(){
                               return localTransportListenerMessagesSentTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return long
                           */
                           public  long getTransportListenerMessagesSent(){
                               return localTransportListenerMessagesSent;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TransportListenerMessagesSent
                               */
                               public void setTransportListenerMessagesSent(long param){
                            
                                       // setting primitive attribute tracker to true
                                       localTransportListenerMessagesSentTracker =
                                       param != java.lang.Long.MIN_VALUE;
                                   
                                            this.localTransportListenerMessagesSent=param;
                                    

                               }
                            

                        /**
                        * field for TransportListenerMetricsWindow
                        */

                        
                                    protected long localTransportListenerMetricsWindow ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTransportListenerMetricsWindowTracker = false ;

                           public boolean isTransportListenerMetricsWindowSpecified(){
                               return localTransportListenerMetricsWindowTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return long
                           */
                           public  long getTransportListenerMetricsWindow(){
                               return localTransportListenerMetricsWindow;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TransportListenerMetricsWindow
                               */
                               public void setTransportListenerMetricsWindow(long param){
                            
                                       // setting primitive attribute tracker to true
                                       localTransportListenerMetricsWindowTracker =
                                       param != java.lang.Long.MIN_VALUE;
                                   
                                            this.localTransportListenerMetricsWindow=param;
                                    

                               }
                            

                        /**
                        * field for TransportListenerMinSizeReceived
                        */

                        
                                    protected long localTransportListenerMinSizeReceived ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTransportListenerMinSizeReceivedTracker = false ;

                           public boolean isTransportListenerMinSizeReceivedSpecified(){
                               return localTransportListenerMinSizeReceivedTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return long
                           */
                           public  long getTransportListenerMinSizeReceived(){
                               return localTransportListenerMinSizeReceived;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TransportListenerMinSizeReceived
                               */
                               public void setTransportListenerMinSizeReceived(long param){
                            
                                       // setting primitive attribute tracker to true
                                       localTransportListenerMinSizeReceivedTracker =
                                       param != java.lang.Long.MIN_VALUE;
                                   
                                            this.localTransportListenerMinSizeReceived=param;
                                    

                               }
                            

                        /**
                        * field for TransportListenerMinSizeSent
                        */

                        
                                    protected long localTransportListenerMinSizeSent ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTransportListenerMinSizeSentTracker = false ;

                           public boolean isTransportListenerMinSizeSentSpecified(){
                               return localTransportListenerMinSizeSentTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return long
                           */
                           public  long getTransportListenerMinSizeSent(){
                               return localTransportListenerMinSizeSent;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TransportListenerMinSizeSent
                               */
                               public void setTransportListenerMinSizeSent(long param){
                            
                                       // setting primitive attribute tracker to true
                                       localTransportListenerMinSizeSentTracker =
                                       param != java.lang.Long.MIN_VALUE;
                                   
                                            this.localTransportListenerMinSizeSent=param;
                                    

                               }
                            

                        /**
                        * field for TransportListenerQueueSize
                        */

                        
                                    protected int localTransportListenerQueueSize ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTransportListenerQueueSizeTracker = false ;

                           public boolean isTransportListenerQueueSizeSpecified(){
                               return localTransportListenerQueueSizeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getTransportListenerQueueSize(){
                               return localTransportListenerQueueSize;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TransportListenerQueueSize
                               */
                               public void setTransportListenerQueueSize(int param){
                            
                                       // setting primitive attribute tracker to true
                                       localTransportListenerQueueSizeTracker =
                                       param != java.lang.Integer.MIN_VALUE;
                                   
                                            this.localTransportListenerQueueSize=param;
                                    

                               }
                            

                        /**
                        * field for TransportListenerTimeoutsReceiving
                        */

                        
                                    protected long localTransportListenerTimeoutsReceiving ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTransportListenerTimeoutsReceivingTracker = false ;

                           public boolean isTransportListenerTimeoutsReceivingSpecified(){
                               return localTransportListenerTimeoutsReceivingTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return long
                           */
                           public  long getTransportListenerTimeoutsReceiving(){
                               return localTransportListenerTimeoutsReceiving;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TransportListenerTimeoutsReceiving
                               */
                               public void setTransportListenerTimeoutsReceiving(long param){
                            
                                       // setting primitive attribute tracker to true
                                       localTransportListenerTimeoutsReceivingTracker =
                                       param != java.lang.Long.MIN_VALUE;
                                   
                                            this.localTransportListenerTimeoutsReceiving=param;
                                    

                               }
                            

                        /**
                        * field for TransportListenerTimeoutsSending
                        */

                        
                                    protected long localTransportListenerTimeoutsSending ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTransportListenerTimeoutsSendingTracker = false ;

                           public boolean isTransportListenerTimeoutsSendingSpecified(){
                               return localTransportListenerTimeoutsSendingTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return long
                           */
                           public  long getTransportListenerTimeoutsSending(){
                               return localTransportListenerTimeoutsSending;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TransportListenerTimeoutsSending
                               */
                               public void setTransportListenerTimeoutsSending(long param){
                            
                                       // setting primitive attribute tracker to true
                                       localTransportListenerTimeoutsSendingTracker =
                                       param != java.lang.Long.MIN_VALUE;
                                   
                                            this.localTransportListenerTimeoutsSending=param;
                                    

                               }
                            

                        /**
                        * field for TransportSenderActiveThreadCount
                        */

                        
                                    protected int localTransportSenderActiveThreadCount ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTransportSenderActiveThreadCountTracker = false ;

                           public boolean isTransportSenderActiveThreadCountSpecified(){
                               return localTransportSenderActiveThreadCountTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getTransportSenderActiveThreadCount(){
                               return localTransportSenderActiveThreadCount;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TransportSenderActiveThreadCount
                               */
                               public void setTransportSenderActiveThreadCount(int param){
                            
                                       // setting primitive attribute tracker to true
                                       localTransportSenderActiveThreadCountTracker =
                                       param != java.lang.Integer.MIN_VALUE;
                                   
                                            this.localTransportSenderActiveThreadCount=param;
                                    

                               }
                            

                        /**
                        * field for TransportSenderAvgSizeReceived
                        */

                        
                                    protected double localTransportSenderAvgSizeReceived ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTransportSenderAvgSizeReceivedTracker = false ;

                           public boolean isTransportSenderAvgSizeReceivedSpecified(){
                               return localTransportSenderAvgSizeReceivedTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return double
                           */
                           public  double getTransportSenderAvgSizeReceived(){
                               return localTransportSenderAvgSizeReceived;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TransportSenderAvgSizeReceived
                               */
                               public void setTransportSenderAvgSizeReceived(double param){
                            
                                       // setting primitive attribute tracker to true
                                       localTransportSenderAvgSizeReceivedTracker =
                                       !java.lang.Double.isNaN(param);
                                   
                                            this.localTransportSenderAvgSizeReceived=param;
                                    

                               }
                            

                        /**
                        * field for TransportSenderAvgSizeSent
                        */

                        
                                    protected double localTransportSenderAvgSizeSent ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTransportSenderAvgSizeSentTracker = false ;

                           public boolean isTransportSenderAvgSizeSentSpecified(){
                               return localTransportSenderAvgSizeSentTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return double
                           */
                           public  double getTransportSenderAvgSizeSent(){
                               return localTransportSenderAvgSizeSent;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TransportSenderAvgSizeSent
                               */
                               public void setTransportSenderAvgSizeSent(double param){
                            
                                       // setting primitive attribute tracker to true
                                       localTransportSenderAvgSizeSentTracker =
                                       !java.lang.Double.isNaN(param);
                                   
                                            this.localTransportSenderAvgSizeSent=param;
                                    

                               }
                            

                        /**
                        * field for TransportSenderBytesReceived
                        */

                        
                                    protected long localTransportSenderBytesReceived ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTransportSenderBytesReceivedTracker = false ;

                           public boolean isTransportSenderBytesReceivedSpecified(){
                               return localTransportSenderBytesReceivedTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return long
                           */
                           public  long getTransportSenderBytesReceived(){
                               return localTransportSenderBytesReceived;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TransportSenderBytesReceived
                               */
                               public void setTransportSenderBytesReceived(long param){
                            
                                       // setting primitive attribute tracker to true
                                       localTransportSenderBytesReceivedTracker =
                                       param != java.lang.Long.MIN_VALUE;
                                   
                                            this.localTransportSenderBytesReceived=param;
                                    

                               }
                            

                        /**
                        * field for TransportSenderBytesSent
                        */

                        
                                    protected long localTransportSenderBytesSent ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTransportSenderBytesSentTracker = false ;

                           public boolean isTransportSenderBytesSentSpecified(){
                               return localTransportSenderBytesSentTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return long
                           */
                           public  long getTransportSenderBytesSent(){
                               return localTransportSenderBytesSent;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TransportSenderBytesSent
                               */
                               public void setTransportSenderBytesSent(long param){
                            
                                       // setting primitive attribute tracker to true
                                       localTransportSenderBytesSentTracker =
                                       param != java.lang.Long.MIN_VALUE;
                                   
                                            this.localTransportSenderBytesSent=param;
                                    

                               }
                            

                        /**
                        * field for TransportSenderClassName
                        */

                        
                                    protected java.lang.String localTransportSenderClassName ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTransportSenderClassNameTracker = false ;

                           public boolean isTransportSenderClassNameSpecified(){
                               return localTransportSenderClassNameTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getTransportSenderClassName(){
                               return localTransportSenderClassName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TransportSenderClassName
                               */
                               public void setTransportSenderClassName(java.lang.String param){
                            localTransportSenderClassNameTracker = true;
                                   
                                            this.localTransportSenderClassName=param;
                                    

                               }
                            

                        /**
                        * field for TransportSenderFaultsReceiving
                        */

                        
                                    protected long localTransportSenderFaultsReceiving ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTransportSenderFaultsReceivingTracker = false ;

                           public boolean isTransportSenderFaultsReceivingSpecified(){
                               return localTransportSenderFaultsReceivingTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return long
                           */
                           public  long getTransportSenderFaultsReceiving(){
                               return localTransportSenderFaultsReceiving;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TransportSenderFaultsReceiving
                               */
                               public void setTransportSenderFaultsReceiving(long param){
                            
                                       // setting primitive attribute tracker to true
                                       localTransportSenderFaultsReceivingTracker =
                                       param != java.lang.Long.MIN_VALUE;
                                   
                                            this.localTransportSenderFaultsReceiving=param;
                                    

                               }
                            

                        /**
                        * field for TransportSenderFaultsSending
                        */

                        
                                    protected long localTransportSenderFaultsSending ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTransportSenderFaultsSendingTracker = false ;

                           public boolean isTransportSenderFaultsSendingSpecified(){
                               return localTransportSenderFaultsSendingTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return long
                           */
                           public  long getTransportSenderFaultsSending(){
                               return localTransportSenderFaultsSending;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TransportSenderFaultsSending
                               */
                               public void setTransportSenderFaultsSending(long param){
                            
                                       // setting primitive attribute tracker to true
                                       localTransportSenderFaultsSendingTracker =
                                       param != java.lang.Long.MIN_VALUE;
                                   
                                            this.localTransportSenderFaultsSending=param;
                                    

                               }
                            

                        /**
                        * field for TransportSenderLastResetTime
                        */

                        
                                    protected long localTransportSenderLastResetTime ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTransportSenderLastResetTimeTracker = false ;

                           public boolean isTransportSenderLastResetTimeSpecified(){
                               return localTransportSenderLastResetTimeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return long
                           */
                           public  long getTransportSenderLastResetTime(){
                               return localTransportSenderLastResetTime;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TransportSenderLastResetTime
                               */
                               public void setTransportSenderLastResetTime(long param){
                            
                                       // setting primitive attribute tracker to true
                                       localTransportSenderLastResetTimeTracker =
                                       param != java.lang.Long.MIN_VALUE;
                                   
                                            this.localTransportSenderLastResetTime=param;
                                    

                               }
                            

                        /**
                        * field for TransportSenderMaxSizeReceived
                        */

                        
                                    protected long localTransportSenderMaxSizeReceived ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTransportSenderMaxSizeReceivedTracker = false ;

                           public boolean isTransportSenderMaxSizeReceivedSpecified(){
                               return localTransportSenderMaxSizeReceivedTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return long
                           */
                           public  long getTransportSenderMaxSizeReceived(){
                               return localTransportSenderMaxSizeReceived;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TransportSenderMaxSizeReceived
                               */
                               public void setTransportSenderMaxSizeReceived(long param){
                            
                                       // setting primitive attribute tracker to true
                                       localTransportSenderMaxSizeReceivedTracker =
                                       param != java.lang.Long.MIN_VALUE;
                                   
                                            this.localTransportSenderMaxSizeReceived=param;
                                    

                               }
                            

                        /**
                        * field for TransportSenderMaxSizeSent
                        */

                        
                                    protected long localTransportSenderMaxSizeSent ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTransportSenderMaxSizeSentTracker = false ;

                           public boolean isTransportSenderMaxSizeSentSpecified(){
                               return localTransportSenderMaxSizeSentTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return long
                           */
                           public  long getTransportSenderMaxSizeSent(){
                               return localTransportSenderMaxSizeSent;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TransportSenderMaxSizeSent
                               */
                               public void setTransportSenderMaxSizeSent(long param){
                            
                                       // setting primitive attribute tracker to true
                                       localTransportSenderMaxSizeSentTracker =
                                       param != java.lang.Long.MIN_VALUE;
                                   
                                            this.localTransportSenderMaxSizeSent=param;
                                    

                               }
                            

                        /**
                        * field for TransportSenderMessagesReceived
                        */

                        
                                    protected long localTransportSenderMessagesReceived ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTransportSenderMessagesReceivedTracker = false ;

                           public boolean isTransportSenderMessagesReceivedSpecified(){
                               return localTransportSenderMessagesReceivedTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return long
                           */
                           public  long getTransportSenderMessagesReceived(){
                               return localTransportSenderMessagesReceived;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TransportSenderMessagesReceived
                               */
                               public void setTransportSenderMessagesReceived(long param){
                            
                                       // setting primitive attribute tracker to true
                                       localTransportSenderMessagesReceivedTracker =
                                       param != java.lang.Long.MIN_VALUE;
                                   
                                            this.localTransportSenderMessagesReceived=param;
                                    

                               }
                            

                        /**
                        * field for TransportSenderMessagesSent
                        */

                        
                                    protected long localTransportSenderMessagesSent ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTransportSenderMessagesSentTracker = false ;

                           public boolean isTransportSenderMessagesSentSpecified(){
                               return localTransportSenderMessagesSentTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return long
                           */
                           public  long getTransportSenderMessagesSent(){
                               return localTransportSenderMessagesSent;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TransportSenderMessagesSent
                               */
                               public void setTransportSenderMessagesSent(long param){
                            
                                       // setting primitive attribute tracker to true
                                       localTransportSenderMessagesSentTracker =
                                       param != java.lang.Long.MIN_VALUE;
                                   
                                            this.localTransportSenderMessagesSent=param;
                                    

                               }
                            

                        /**
                        * field for TransportSenderMetricsWindow
                        */

                        
                                    protected long localTransportSenderMetricsWindow ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTransportSenderMetricsWindowTracker = false ;

                           public boolean isTransportSenderMetricsWindowSpecified(){
                               return localTransportSenderMetricsWindowTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return long
                           */
                           public  long getTransportSenderMetricsWindow(){
                               return localTransportSenderMetricsWindow;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TransportSenderMetricsWindow
                               */
                               public void setTransportSenderMetricsWindow(long param){
                            
                                       // setting primitive attribute tracker to true
                                       localTransportSenderMetricsWindowTracker =
                                       param != java.lang.Long.MIN_VALUE;
                                   
                                            this.localTransportSenderMetricsWindow=param;
                                    

                               }
                            

                        /**
                        * field for TransportSenderMinSizeReceived
                        */

                        
                                    protected long localTransportSenderMinSizeReceived ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTransportSenderMinSizeReceivedTracker = false ;

                           public boolean isTransportSenderMinSizeReceivedSpecified(){
                               return localTransportSenderMinSizeReceivedTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return long
                           */
                           public  long getTransportSenderMinSizeReceived(){
                               return localTransportSenderMinSizeReceived;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TransportSenderMinSizeReceived
                               */
                               public void setTransportSenderMinSizeReceived(long param){
                            
                                       // setting primitive attribute tracker to true
                                       localTransportSenderMinSizeReceivedTracker =
                                       param != java.lang.Long.MIN_VALUE;
                                   
                                            this.localTransportSenderMinSizeReceived=param;
                                    

                               }
                            

                        /**
                        * field for TransportSenderMinSizeSent
                        */

                        
                                    protected long localTransportSenderMinSizeSent ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTransportSenderMinSizeSentTracker = false ;

                           public boolean isTransportSenderMinSizeSentSpecified(){
                               return localTransportSenderMinSizeSentTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return long
                           */
                           public  long getTransportSenderMinSizeSent(){
                               return localTransportSenderMinSizeSent;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TransportSenderMinSizeSent
                               */
                               public void setTransportSenderMinSizeSent(long param){
                            
                                       // setting primitive attribute tracker to true
                                       localTransportSenderMinSizeSentTracker =
                                       param != java.lang.Long.MIN_VALUE;
                                   
                                            this.localTransportSenderMinSizeSent=param;
                                    

                               }
                            

                        /**
                        * field for TransportSenderQueueSize
                        */

                        
                                    protected int localTransportSenderQueueSize ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTransportSenderQueueSizeTracker = false ;

                           public boolean isTransportSenderQueueSizeSpecified(){
                               return localTransportSenderQueueSizeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getTransportSenderQueueSize(){
                               return localTransportSenderQueueSize;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TransportSenderQueueSize
                               */
                               public void setTransportSenderQueueSize(int param){
                            
                                       // setting primitive attribute tracker to true
                                       localTransportSenderQueueSizeTracker =
                                       param != java.lang.Integer.MIN_VALUE;
                                   
                                            this.localTransportSenderQueueSize=param;
                                    

                               }
                            

                        /**
                        * field for TransportSenderTimeoutsReceiving
                        */

                        
                                    protected long localTransportSenderTimeoutsReceiving ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTransportSenderTimeoutsReceivingTracker = false ;

                           public boolean isTransportSenderTimeoutsReceivingSpecified(){
                               return localTransportSenderTimeoutsReceivingTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return long
                           */
                           public  long getTransportSenderTimeoutsReceiving(){
                               return localTransportSenderTimeoutsReceiving;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TransportSenderTimeoutsReceiving
                               */
                               public void setTransportSenderTimeoutsReceiving(long param){
                            
                                       // setting primitive attribute tracker to true
                                       localTransportSenderTimeoutsReceivingTracker =
                                       param != java.lang.Long.MIN_VALUE;
                                   
                                            this.localTransportSenderTimeoutsReceiving=param;
                                    

                               }
                            

                        /**
                        * field for TransportSenderTimeoutsSending
                        */

                        
                                    protected long localTransportSenderTimeoutsSending ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTransportSenderTimeoutsSendingTracker = false ;

                           public boolean isTransportSenderTimeoutsSendingSpecified(){
                               return localTransportSenderTimeoutsSendingTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return long
                           */
                           public  long getTransportSenderTimeoutsSending(){
                               return localTransportSenderTimeoutsSending;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TransportSenderTimeoutsSending
                               */
                               public void setTransportSenderTimeoutsSending(long param){
                            
                                       // setting primitive attribute tracker to true
                                       localTransportSenderTimeoutsSendingTracker =
                                       param != java.lang.Long.MIN_VALUE;
                                   
                                            this.localTransportSenderTimeoutsSending=param;
                                    

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
                           namespacePrefix+":TransportStatistics",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "TransportStatistics",
                           xmlWriter);
                   }

               
                   }
                if (localTransportListenerActiveThreadCountTracker){
                                    namespace = "http://util.services.transport.statistics.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "transportListenerActiveThreadCount", xmlWriter);
                             
                                               if (localTransportListenerActiveThreadCount==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("transportListenerActiveThreadCount cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTransportListenerActiveThreadCount));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localTransportListenerAvgSizeReceivedTracker){
                                    namespace = "http://util.services.transport.statistics.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "transportListenerAvgSizeReceived", xmlWriter);
                             
                                               if (java.lang.Double.isNaN(localTransportListenerAvgSizeReceived)) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("transportListenerAvgSizeReceived cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTransportListenerAvgSizeReceived));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localTransportListenerAvgSizeSentTracker){
                                    namespace = "http://util.services.transport.statistics.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "transportListenerAvgSizeSent", xmlWriter);
                             
                                               if (java.lang.Double.isNaN(localTransportListenerAvgSizeSent)) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("transportListenerAvgSizeSent cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTransportListenerAvgSizeSent));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localTransportListenerBytesReceivedTracker){
                                    namespace = "http://util.services.transport.statistics.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "transportListenerBytesReceived", xmlWriter);
                             
                                               if (localTransportListenerBytesReceived==java.lang.Long.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("transportListenerBytesReceived cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTransportListenerBytesReceived));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localTransportListenerBytesSentTracker){
                                    namespace = "http://util.services.transport.statistics.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "transportListenerBytesSent", xmlWriter);
                             
                                               if (localTransportListenerBytesSent==java.lang.Long.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("transportListenerBytesSent cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTransportListenerBytesSent));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localTransportListenerClassNameTracker){
                                    namespace = "http://util.services.transport.statistics.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "transportListenerClassName", xmlWriter);
                             

                                          if (localTransportListenerClassName==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localTransportListenerClassName);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localTransportListenerFaultsReceivingTracker){
                                    namespace = "http://util.services.transport.statistics.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "transportListenerFaultsReceiving", xmlWriter);
                             
                                               if (localTransportListenerFaultsReceiving==java.lang.Long.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("transportListenerFaultsReceiving cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTransportListenerFaultsReceiving));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localTransportListenerFaultsSendingTracker){
                                    namespace = "http://util.services.transport.statistics.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "transportListenerFaultsSending", xmlWriter);
                             
                                               if (localTransportListenerFaultsSending==java.lang.Long.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("transportListenerFaultsSending cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTransportListenerFaultsSending));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localTransportListenerLastResetTimeTracker){
                                    namespace = "http://util.services.transport.statistics.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "transportListenerLastResetTime", xmlWriter);
                             
                                               if (localTransportListenerLastResetTime==java.lang.Long.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("transportListenerLastResetTime cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTransportListenerLastResetTime));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localTransportListenerMaxSizeReceivedTracker){
                                    namespace = "http://util.services.transport.statistics.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "transportListenerMaxSizeReceived", xmlWriter);
                             
                                               if (localTransportListenerMaxSizeReceived==java.lang.Long.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("transportListenerMaxSizeReceived cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTransportListenerMaxSizeReceived));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localTransportListenerMaxSizeSentTracker){
                                    namespace = "http://util.services.transport.statistics.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "transportListenerMaxSizeSent", xmlWriter);
                             
                                               if (localTransportListenerMaxSizeSent==java.lang.Long.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("transportListenerMaxSizeSent cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTransportListenerMaxSizeSent));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localTransportListenerMessagesReceivedTracker){
                                    namespace = "http://util.services.transport.statistics.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "transportListenerMessagesReceived", xmlWriter);
                             
                                               if (localTransportListenerMessagesReceived==java.lang.Long.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("transportListenerMessagesReceived cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTransportListenerMessagesReceived));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localTransportListenerMessagesSentTracker){
                                    namespace = "http://util.services.transport.statistics.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "transportListenerMessagesSent", xmlWriter);
                             
                                               if (localTransportListenerMessagesSent==java.lang.Long.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("transportListenerMessagesSent cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTransportListenerMessagesSent));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localTransportListenerMetricsWindowTracker){
                                    namespace = "http://util.services.transport.statistics.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "transportListenerMetricsWindow", xmlWriter);
                             
                                               if (localTransportListenerMetricsWindow==java.lang.Long.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("transportListenerMetricsWindow cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTransportListenerMetricsWindow));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localTransportListenerMinSizeReceivedTracker){
                                    namespace = "http://util.services.transport.statistics.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "transportListenerMinSizeReceived", xmlWriter);
                             
                                               if (localTransportListenerMinSizeReceived==java.lang.Long.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("transportListenerMinSizeReceived cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTransportListenerMinSizeReceived));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localTransportListenerMinSizeSentTracker){
                                    namespace = "http://util.services.transport.statistics.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "transportListenerMinSizeSent", xmlWriter);
                             
                                               if (localTransportListenerMinSizeSent==java.lang.Long.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("transportListenerMinSizeSent cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTransportListenerMinSizeSent));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localTransportListenerQueueSizeTracker){
                                    namespace = "http://util.services.transport.statistics.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "transportListenerQueueSize", xmlWriter);
                             
                                               if (localTransportListenerQueueSize==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("transportListenerQueueSize cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTransportListenerQueueSize));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localTransportListenerTimeoutsReceivingTracker){
                                    namespace = "http://util.services.transport.statistics.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "transportListenerTimeoutsReceiving", xmlWriter);
                             
                                               if (localTransportListenerTimeoutsReceiving==java.lang.Long.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("transportListenerTimeoutsReceiving cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTransportListenerTimeoutsReceiving));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localTransportListenerTimeoutsSendingTracker){
                                    namespace = "http://util.services.transport.statistics.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "transportListenerTimeoutsSending", xmlWriter);
                             
                                               if (localTransportListenerTimeoutsSending==java.lang.Long.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("transportListenerTimeoutsSending cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTransportListenerTimeoutsSending));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localTransportSenderActiveThreadCountTracker){
                                    namespace = "http://util.services.transport.statistics.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "transportSenderActiveThreadCount", xmlWriter);
                             
                                               if (localTransportSenderActiveThreadCount==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("transportSenderActiveThreadCount cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTransportSenderActiveThreadCount));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localTransportSenderAvgSizeReceivedTracker){
                                    namespace = "http://util.services.transport.statistics.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "transportSenderAvgSizeReceived", xmlWriter);
                             
                                               if (java.lang.Double.isNaN(localTransportSenderAvgSizeReceived)) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("transportSenderAvgSizeReceived cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTransportSenderAvgSizeReceived));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localTransportSenderAvgSizeSentTracker){
                                    namespace = "http://util.services.transport.statistics.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "transportSenderAvgSizeSent", xmlWriter);
                             
                                               if (java.lang.Double.isNaN(localTransportSenderAvgSizeSent)) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("transportSenderAvgSizeSent cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTransportSenderAvgSizeSent));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localTransportSenderBytesReceivedTracker){
                                    namespace = "http://util.services.transport.statistics.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "transportSenderBytesReceived", xmlWriter);
                             
                                               if (localTransportSenderBytesReceived==java.lang.Long.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("transportSenderBytesReceived cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTransportSenderBytesReceived));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localTransportSenderBytesSentTracker){
                                    namespace = "http://util.services.transport.statistics.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "transportSenderBytesSent", xmlWriter);
                             
                                               if (localTransportSenderBytesSent==java.lang.Long.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("transportSenderBytesSent cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTransportSenderBytesSent));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localTransportSenderClassNameTracker){
                                    namespace = "http://util.services.transport.statistics.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "transportSenderClassName", xmlWriter);
                             

                                          if (localTransportSenderClassName==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localTransportSenderClassName);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localTransportSenderFaultsReceivingTracker){
                                    namespace = "http://util.services.transport.statistics.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "transportSenderFaultsReceiving", xmlWriter);
                             
                                               if (localTransportSenderFaultsReceiving==java.lang.Long.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("transportSenderFaultsReceiving cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTransportSenderFaultsReceiving));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localTransportSenderFaultsSendingTracker){
                                    namespace = "http://util.services.transport.statistics.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "transportSenderFaultsSending", xmlWriter);
                             
                                               if (localTransportSenderFaultsSending==java.lang.Long.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("transportSenderFaultsSending cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTransportSenderFaultsSending));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localTransportSenderLastResetTimeTracker){
                                    namespace = "http://util.services.transport.statistics.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "transportSenderLastResetTime", xmlWriter);
                             
                                               if (localTransportSenderLastResetTime==java.lang.Long.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("transportSenderLastResetTime cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTransportSenderLastResetTime));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localTransportSenderMaxSizeReceivedTracker){
                                    namespace = "http://util.services.transport.statistics.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "transportSenderMaxSizeReceived", xmlWriter);
                             
                                               if (localTransportSenderMaxSizeReceived==java.lang.Long.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("transportSenderMaxSizeReceived cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTransportSenderMaxSizeReceived));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localTransportSenderMaxSizeSentTracker){
                                    namespace = "http://util.services.transport.statistics.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "transportSenderMaxSizeSent", xmlWriter);
                             
                                               if (localTransportSenderMaxSizeSent==java.lang.Long.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("transportSenderMaxSizeSent cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTransportSenderMaxSizeSent));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localTransportSenderMessagesReceivedTracker){
                                    namespace = "http://util.services.transport.statistics.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "transportSenderMessagesReceived", xmlWriter);
                             
                                               if (localTransportSenderMessagesReceived==java.lang.Long.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("transportSenderMessagesReceived cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTransportSenderMessagesReceived));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localTransportSenderMessagesSentTracker){
                                    namespace = "http://util.services.transport.statistics.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "transportSenderMessagesSent", xmlWriter);
                             
                                               if (localTransportSenderMessagesSent==java.lang.Long.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("transportSenderMessagesSent cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTransportSenderMessagesSent));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localTransportSenderMetricsWindowTracker){
                                    namespace = "http://util.services.transport.statistics.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "transportSenderMetricsWindow", xmlWriter);
                             
                                               if (localTransportSenderMetricsWindow==java.lang.Long.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("transportSenderMetricsWindow cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTransportSenderMetricsWindow));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localTransportSenderMinSizeReceivedTracker){
                                    namespace = "http://util.services.transport.statistics.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "transportSenderMinSizeReceived", xmlWriter);
                             
                                               if (localTransportSenderMinSizeReceived==java.lang.Long.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("transportSenderMinSizeReceived cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTransportSenderMinSizeReceived));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localTransportSenderMinSizeSentTracker){
                                    namespace = "http://util.services.transport.statistics.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "transportSenderMinSizeSent", xmlWriter);
                             
                                               if (localTransportSenderMinSizeSent==java.lang.Long.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("transportSenderMinSizeSent cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTransportSenderMinSizeSent));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localTransportSenderQueueSizeTracker){
                                    namespace = "http://util.services.transport.statistics.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "transportSenderQueueSize", xmlWriter);
                             
                                               if (localTransportSenderQueueSize==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("transportSenderQueueSize cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTransportSenderQueueSize));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localTransportSenderTimeoutsReceivingTracker){
                                    namespace = "http://util.services.transport.statistics.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "transportSenderTimeoutsReceiving", xmlWriter);
                             
                                               if (localTransportSenderTimeoutsReceiving==java.lang.Long.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("transportSenderTimeoutsReceiving cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTransportSenderTimeoutsReceiving));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localTransportSenderTimeoutsSendingTracker){
                                    namespace = "http://util.services.transport.statistics.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "transportSenderTimeoutsSending", xmlWriter);
                             
                                               if (localTransportSenderTimeoutsSending==java.lang.Long.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("transportSenderTimeoutsSending cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTransportSenderTimeoutsSending));
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

                 if (localTransportListenerActiveThreadCountTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd",
                                                                      "transportListenerActiveThreadCount"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTransportListenerActiveThreadCount));
                            } if (localTransportListenerAvgSizeReceivedTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd",
                                                                      "transportListenerAvgSizeReceived"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTransportListenerAvgSizeReceived));
                            } if (localTransportListenerAvgSizeSentTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd",
                                                                      "transportListenerAvgSizeSent"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTransportListenerAvgSizeSent));
                            } if (localTransportListenerBytesReceivedTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd",
                                                                      "transportListenerBytesReceived"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTransportListenerBytesReceived));
                            } if (localTransportListenerBytesSentTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd",
                                                                      "transportListenerBytesSent"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTransportListenerBytesSent));
                            } if (localTransportListenerClassNameTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd",
                                                                      "transportListenerClassName"));
                                 
                                         elementList.add(localTransportListenerClassName==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTransportListenerClassName));
                                    } if (localTransportListenerFaultsReceivingTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd",
                                                                      "transportListenerFaultsReceiving"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTransportListenerFaultsReceiving));
                            } if (localTransportListenerFaultsSendingTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd",
                                                                      "transportListenerFaultsSending"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTransportListenerFaultsSending));
                            } if (localTransportListenerLastResetTimeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd",
                                                                      "transportListenerLastResetTime"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTransportListenerLastResetTime));
                            } if (localTransportListenerMaxSizeReceivedTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd",
                                                                      "transportListenerMaxSizeReceived"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTransportListenerMaxSizeReceived));
                            } if (localTransportListenerMaxSizeSentTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd",
                                                                      "transportListenerMaxSizeSent"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTransportListenerMaxSizeSent));
                            } if (localTransportListenerMessagesReceivedTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd",
                                                                      "transportListenerMessagesReceived"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTransportListenerMessagesReceived));
                            } if (localTransportListenerMessagesSentTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd",
                                                                      "transportListenerMessagesSent"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTransportListenerMessagesSent));
                            } if (localTransportListenerMetricsWindowTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd",
                                                                      "transportListenerMetricsWindow"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTransportListenerMetricsWindow));
                            } if (localTransportListenerMinSizeReceivedTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd",
                                                                      "transportListenerMinSizeReceived"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTransportListenerMinSizeReceived));
                            } if (localTransportListenerMinSizeSentTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd",
                                                                      "transportListenerMinSizeSent"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTransportListenerMinSizeSent));
                            } if (localTransportListenerQueueSizeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd",
                                                                      "transportListenerQueueSize"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTransportListenerQueueSize));
                            } if (localTransportListenerTimeoutsReceivingTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd",
                                                                      "transportListenerTimeoutsReceiving"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTransportListenerTimeoutsReceiving));
                            } if (localTransportListenerTimeoutsSendingTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd",
                                                                      "transportListenerTimeoutsSending"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTransportListenerTimeoutsSending));
                            } if (localTransportSenderActiveThreadCountTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd",
                                                                      "transportSenderActiveThreadCount"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTransportSenderActiveThreadCount));
                            } if (localTransportSenderAvgSizeReceivedTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd",
                                                                      "transportSenderAvgSizeReceived"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTransportSenderAvgSizeReceived));
                            } if (localTransportSenderAvgSizeSentTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd",
                                                                      "transportSenderAvgSizeSent"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTransportSenderAvgSizeSent));
                            } if (localTransportSenderBytesReceivedTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd",
                                                                      "transportSenderBytesReceived"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTransportSenderBytesReceived));
                            } if (localTransportSenderBytesSentTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd",
                                                                      "transportSenderBytesSent"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTransportSenderBytesSent));
                            } if (localTransportSenderClassNameTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd",
                                                                      "transportSenderClassName"));
                                 
                                         elementList.add(localTransportSenderClassName==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTransportSenderClassName));
                                    } if (localTransportSenderFaultsReceivingTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd",
                                                                      "transportSenderFaultsReceiving"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTransportSenderFaultsReceiving));
                            } if (localTransportSenderFaultsSendingTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd",
                                                                      "transportSenderFaultsSending"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTransportSenderFaultsSending));
                            } if (localTransportSenderLastResetTimeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd",
                                                                      "transportSenderLastResetTime"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTransportSenderLastResetTime));
                            } if (localTransportSenderMaxSizeReceivedTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd",
                                                                      "transportSenderMaxSizeReceived"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTransportSenderMaxSizeReceived));
                            } if (localTransportSenderMaxSizeSentTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd",
                                                                      "transportSenderMaxSizeSent"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTransportSenderMaxSizeSent));
                            } if (localTransportSenderMessagesReceivedTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd",
                                                                      "transportSenderMessagesReceived"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTransportSenderMessagesReceived));
                            } if (localTransportSenderMessagesSentTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd",
                                                                      "transportSenderMessagesSent"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTransportSenderMessagesSent));
                            } if (localTransportSenderMetricsWindowTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd",
                                                                      "transportSenderMetricsWindow"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTransportSenderMetricsWindow));
                            } if (localTransportSenderMinSizeReceivedTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd",
                                                                      "transportSenderMinSizeReceived"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTransportSenderMinSizeReceived));
                            } if (localTransportSenderMinSizeSentTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd",
                                                                      "transportSenderMinSizeSent"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTransportSenderMinSizeSent));
                            } if (localTransportSenderQueueSizeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd",
                                                                      "transportSenderQueueSize"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTransportSenderQueueSize));
                            } if (localTransportSenderTimeoutsReceivingTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd",
                                                                      "transportSenderTimeoutsReceiving"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTransportSenderTimeoutsReceiving));
                            } if (localTransportSenderTimeoutsSendingTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd",
                                                                      "transportSenderTimeoutsSending"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTransportSenderTimeoutsSending));
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
        public static TransportStatistics parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            TransportStatistics object =
                new TransportStatistics();

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
                    
                            if (!"TransportStatistics".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (TransportStatistics)axis2.apache.org.xsd.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd","transportListenerActiveThreadCount").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"transportListenerActiveThreadCount" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTransportListenerActiveThreadCount(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setTransportListenerActiveThreadCount(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd","transportListenerAvgSizeReceived").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"transportListenerAvgSizeReceived" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTransportListenerAvgSizeReceived(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setTransportListenerAvgSizeReceived(java.lang.Double.NaN);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd","transportListenerAvgSizeSent").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"transportListenerAvgSizeSent" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTransportListenerAvgSizeSent(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setTransportListenerAvgSizeSent(java.lang.Double.NaN);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd","transportListenerBytesReceived").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"transportListenerBytesReceived" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTransportListenerBytesReceived(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setTransportListenerBytesReceived(java.lang.Long.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd","transportListenerBytesSent").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"transportListenerBytesSent" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTransportListenerBytesSent(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setTransportListenerBytesSent(java.lang.Long.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd","transportListenerClassName").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTransportListenerClassName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd","transportListenerFaultsReceiving").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"transportListenerFaultsReceiving" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTransportListenerFaultsReceiving(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setTransportListenerFaultsReceiving(java.lang.Long.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd","transportListenerFaultsSending").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"transportListenerFaultsSending" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTransportListenerFaultsSending(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setTransportListenerFaultsSending(java.lang.Long.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd","transportListenerLastResetTime").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"transportListenerLastResetTime" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTransportListenerLastResetTime(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setTransportListenerLastResetTime(java.lang.Long.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd","transportListenerMaxSizeReceived").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"transportListenerMaxSizeReceived" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTransportListenerMaxSizeReceived(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setTransportListenerMaxSizeReceived(java.lang.Long.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd","transportListenerMaxSizeSent").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"transportListenerMaxSizeSent" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTransportListenerMaxSizeSent(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setTransportListenerMaxSizeSent(java.lang.Long.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd","transportListenerMessagesReceived").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"transportListenerMessagesReceived" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTransportListenerMessagesReceived(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setTransportListenerMessagesReceived(java.lang.Long.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd","transportListenerMessagesSent").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"transportListenerMessagesSent" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTransportListenerMessagesSent(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setTransportListenerMessagesSent(java.lang.Long.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd","transportListenerMetricsWindow").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"transportListenerMetricsWindow" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTransportListenerMetricsWindow(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setTransportListenerMetricsWindow(java.lang.Long.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd","transportListenerMinSizeReceived").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"transportListenerMinSizeReceived" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTransportListenerMinSizeReceived(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setTransportListenerMinSizeReceived(java.lang.Long.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd","transportListenerMinSizeSent").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"transportListenerMinSizeSent" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTransportListenerMinSizeSent(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setTransportListenerMinSizeSent(java.lang.Long.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd","transportListenerQueueSize").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"transportListenerQueueSize" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTransportListenerQueueSize(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setTransportListenerQueueSize(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd","transportListenerTimeoutsReceiving").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"transportListenerTimeoutsReceiving" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTransportListenerTimeoutsReceiving(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setTransportListenerTimeoutsReceiving(java.lang.Long.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd","transportListenerTimeoutsSending").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"transportListenerTimeoutsSending" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTransportListenerTimeoutsSending(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setTransportListenerTimeoutsSending(java.lang.Long.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd","transportSenderActiveThreadCount").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"transportSenderActiveThreadCount" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTransportSenderActiveThreadCount(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setTransportSenderActiveThreadCount(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd","transportSenderAvgSizeReceived").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"transportSenderAvgSizeReceived" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTransportSenderAvgSizeReceived(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setTransportSenderAvgSizeReceived(java.lang.Double.NaN);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd","transportSenderAvgSizeSent").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"transportSenderAvgSizeSent" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTransportSenderAvgSizeSent(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setTransportSenderAvgSizeSent(java.lang.Double.NaN);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd","transportSenderBytesReceived").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"transportSenderBytesReceived" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTransportSenderBytesReceived(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setTransportSenderBytesReceived(java.lang.Long.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd","transportSenderBytesSent").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"transportSenderBytesSent" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTransportSenderBytesSent(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setTransportSenderBytesSent(java.lang.Long.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd","transportSenderClassName").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTransportSenderClassName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd","transportSenderFaultsReceiving").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"transportSenderFaultsReceiving" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTransportSenderFaultsReceiving(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setTransportSenderFaultsReceiving(java.lang.Long.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd","transportSenderFaultsSending").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"transportSenderFaultsSending" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTransportSenderFaultsSending(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setTransportSenderFaultsSending(java.lang.Long.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd","transportSenderLastResetTime").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"transportSenderLastResetTime" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTransportSenderLastResetTime(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setTransportSenderLastResetTime(java.lang.Long.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd","transportSenderMaxSizeReceived").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"transportSenderMaxSizeReceived" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTransportSenderMaxSizeReceived(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setTransportSenderMaxSizeReceived(java.lang.Long.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd","transportSenderMaxSizeSent").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"transportSenderMaxSizeSent" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTransportSenderMaxSizeSent(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setTransportSenderMaxSizeSent(java.lang.Long.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd","transportSenderMessagesReceived").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"transportSenderMessagesReceived" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTransportSenderMessagesReceived(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setTransportSenderMessagesReceived(java.lang.Long.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd","transportSenderMessagesSent").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"transportSenderMessagesSent" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTransportSenderMessagesSent(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setTransportSenderMessagesSent(java.lang.Long.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd","transportSenderMetricsWindow").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"transportSenderMetricsWindow" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTransportSenderMetricsWindow(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setTransportSenderMetricsWindow(java.lang.Long.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd","transportSenderMinSizeReceived").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"transportSenderMinSizeReceived" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTransportSenderMinSizeReceived(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setTransportSenderMinSizeReceived(java.lang.Long.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd","transportSenderMinSizeSent").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"transportSenderMinSizeSent" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTransportSenderMinSizeSent(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setTransportSenderMinSizeSent(java.lang.Long.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd","transportSenderQueueSize").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"transportSenderQueueSize" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTransportSenderQueueSize(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setTransportSenderQueueSize(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd","transportSenderTimeoutsReceiving").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"transportSenderTimeoutsReceiving" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTransportSenderTimeoutsReceiving(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setTransportSenderTimeoutsReceiving(java.lang.Long.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd","transportSenderTimeoutsSending").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"transportSenderTimeoutsSending" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTransportSenderTimeoutsSending(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setTransportSenderTimeoutsSending(java.lang.Long.MIN_VALUE);
                                           
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
           
    
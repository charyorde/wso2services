
/**
 * ThreadViewStatistics.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v3  Built on : Oct 26, 2011 (07:42:27 PDT)
 */

            
                package org.wso2.carbon.statistics.transport.services.util.xsd;
            

            /**
            *  ThreadViewStatistics bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ThreadViewStatistics
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = ThreadViewStatistics
                Namespace URI = http://util.services.transport.statistics.carbon.wso2.org/xsd
                Namespace Prefix = ns19
                */
            

                        /**
                        * field for ClientWorkerAvgBlockedWorkerPercentage
                        */

                        
                                    protected double localClientWorkerAvgBlockedWorkerPercentage ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localClientWorkerAvgBlockedWorkerPercentageTracker = false ;

                           public boolean isClientWorkerAvgBlockedWorkerPercentageSpecified(){
                               return localClientWorkerAvgBlockedWorkerPercentageTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return double
                           */
                           public  double getClientWorkerAvgBlockedWorkerPercentage(){
                               return localClientWorkerAvgBlockedWorkerPercentage;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ClientWorkerAvgBlockedWorkerPercentage
                               */
                               public void setClientWorkerAvgBlockedWorkerPercentage(double param){
                            
                                       // setting primitive attribute tracker to true
                                       localClientWorkerAvgBlockedWorkerPercentageTracker =
                                       !java.lang.Double.isNaN(param);
                                   
                                            this.localClientWorkerAvgBlockedWorkerPercentage=param;
                                    

                               }
                            

                        /**
                        * field for ClientWorkerAvgUnblockedWorkerPercentage
                        */

                        
                                    protected double localClientWorkerAvgUnblockedWorkerPercentage ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localClientWorkerAvgUnblockedWorkerPercentageTracker = false ;

                           public boolean isClientWorkerAvgUnblockedWorkerPercentageSpecified(){
                               return localClientWorkerAvgUnblockedWorkerPercentageTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return double
                           */
                           public  double getClientWorkerAvgUnblockedWorkerPercentage(){
                               return localClientWorkerAvgUnblockedWorkerPercentage;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ClientWorkerAvgUnblockedWorkerPercentage
                               */
                               public void setClientWorkerAvgUnblockedWorkerPercentage(double param){
                            
                                       // setting primitive attribute tracker to true
                                       localClientWorkerAvgUnblockedWorkerPercentageTracker =
                                       !java.lang.Double.isNaN(param);
                                   
                                            this.localClientWorkerAvgUnblockedWorkerPercentage=param;
                                    

                               }
                            

                        /**
                        * field for ClientWorkerDeadLockedWorkers
                        */

                        
                                    protected int localClientWorkerDeadLockedWorkers ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localClientWorkerDeadLockedWorkersTracker = false ;

                           public boolean isClientWorkerDeadLockedWorkersSpecified(){
                               return localClientWorkerDeadLockedWorkersTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getClientWorkerDeadLockedWorkers(){
                               return localClientWorkerDeadLockedWorkers;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ClientWorkerDeadLockedWorkers
                               */
                               public void setClientWorkerDeadLockedWorkers(int param){
                            
                                       // setting primitive attribute tracker to true
                                       localClientWorkerDeadLockedWorkersTracker =
                                       param != java.lang.Integer.MIN_VALUE;
                                   
                                            this.localClientWorkerDeadLockedWorkers=param;
                                    

                               }
                            

                        /**
                        * field for ClientWorkerLast15MinuteBlockedWorkerPercentage
                        */

                        
                                    protected double localClientWorkerLast15MinuteBlockedWorkerPercentage ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localClientWorkerLast15MinuteBlockedWorkerPercentageTracker = false ;

                           public boolean isClientWorkerLast15MinuteBlockedWorkerPercentageSpecified(){
                               return localClientWorkerLast15MinuteBlockedWorkerPercentageTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return double
                           */
                           public  double getClientWorkerLast15MinuteBlockedWorkerPercentage(){
                               return localClientWorkerLast15MinuteBlockedWorkerPercentage;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ClientWorkerLast15MinuteBlockedWorkerPercentage
                               */
                               public void setClientWorkerLast15MinuteBlockedWorkerPercentage(double param){
                            
                                       // setting primitive attribute tracker to true
                                       localClientWorkerLast15MinuteBlockedWorkerPercentageTracker =
                                       !java.lang.Double.isNaN(param);
                                   
                                            this.localClientWorkerLast15MinuteBlockedWorkerPercentage=param;
                                    

                               }
                            

                        /**
                        * field for ClientWorkerLast24HourBlockedWorkerPercentage
                        */

                        
                                    protected double localClientWorkerLast24HourBlockedWorkerPercentage ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localClientWorkerLast24HourBlockedWorkerPercentageTracker = false ;

                           public boolean isClientWorkerLast24HourBlockedWorkerPercentageSpecified(){
                               return localClientWorkerLast24HourBlockedWorkerPercentageTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return double
                           */
                           public  double getClientWorkerLast24HourBlockedWorkerPercentage(){
                               return localClientWorkerLast24HourBlockedWorkerPercentage;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ClientWorkerLast24HourBlockedWorkerPercentage
                               */
                               public void setClientWorkerLast24HourBlockedWorkerPercentage(double param){
                            
                                       // setting primitive attribute tracker to true
                                       localClientWorkerLast24HourBlockedWorkerPercentageTracker =
                                       !java.lang.Double.isNaN(param);
                                   
                                            this.localClientWorkerLast24HourBlockedWorkerPercentage=param;
                                    

                               }
                            

                        /**
                        * field for ClientWorkerLast5MinuteBlockedWorkerPercentage
                        */

                        
                                    protected double localClientWorkerLast5MinuteBlockedWorkerPercentage ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localClientWorkerLast5MinuteBlockedWorkerPercentageTracker = false ;

                           public boolean isClientWorkerLast5MinuteBlockedWorkerPercentageSpecified(){
                               return localClientWorkerLast5MinuteBlockedWorkerPercentageTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return double
                           */
                           public  double getClientWorkerLast5MinuteBlockedWorkerPercentage(){
                               return localClientWorkerLast5MinuteBlockedWorkerPercentage;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ClientWorkerLast5MinuteBlockedWorkerPercentage
                               */
                               public void setClientWorkerLast5MinuteBlockedWorkerPercentage(double param){
                            
                                       // setting primitive attribute tracker to true
                                       localClientWorkerLast5MinuteBlockedWorkerPercentageTracker =
                                       !java.lang.Double.isNaN(param);
                                   
                                            this.localClientWorkerLast5MinuteBlockedWorkerPercentage=param;
                                    

                               }
                            

                        /**
                        * field for ClientWorkerLast8HourBlockedWorkerPercentage
                        */

                        
                                    protected double localClientWorkerLast8HourBlockedWorkerPercentage ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localClientWorkerLast8HourBlockedWorkerPercentageTracker = false ;

                           public boolean isClientWorkerLast8HourBlockedWorkerPercentageSpecified(){
                               return localClientWorkerLast8HourBlockedWorkerPercentageTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return double
                           */
                           public  double getClientWorkerLast8HourBlockedWorkerPercentage(){
                               return localClientWorkerLast8HourBlockedWorkerPercentage;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ClientWorkerLast8HourBlockedWorkerPercentage
                               */
                               public void setClientWorkerLast8HourBlockedWorkerPercentage(double param){
                            
                                       // setting primitive attribute tracker to true
                                       localClientWorkerLast8HourBlockedWorkerPercentageTracker =
                                       !java.lang.Double.isNaN(param);
                                   
                                            this.localClientWorkerLast8HourBlockedWorkerPercentage=param;
                                    

                               }
                            

                        /**
                        * field for ClientWorkerLastHourBlockedWorkerPercentage
                        */

                        
                                    protected double localClientWorkerLastHourBlockedWorkerPercentage ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localClientWorkerLastHourBlockedWorkerPercentageTracker = false ;

                           public boolean isClientWorkerLastHourBlockedWorkerPercentageSpecified(){
                               return localClientWorkerLastHourBlockedWorkerPercentageTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return double
                           */
                           public  double getClientWorkerLastHourBlockedWorkerPercentage(){
                               return localClientWorkerLastHourBlockedWorkerPercentage;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ClientWorkerLastHourBlockedWorkerPercentage
                               */
                               public void setClientWorkerLastHourBlockedWorkerPercentage(double param){
                            
                                       // setting primitive attribute tracker to true
                                       localClientWorkerLastHourBlockedWorkerPercentageTracker =
                                       !java.lang.Double.isNaN(param);
                                   
                                            this.localClientWorkerLastHourBlockedWorkerPercentage=param;
                                    

                               }
                            

                        /**
                        * field for ClientWorkerLastMinuteBlockedWorkerPercentage
                        */

                        
                                    protected double localClientWorkerLastMinuteBlockedWorkerPercentage ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localClientWorkerLastMinuteBlockedWorkerPercentageTracker = false ;

                           public boolean isClientWorkerLastMinuteBlockedWorkerPercentageSpecified(){
                               return localClientWorkerLastMinuteBlockedWorkerPercentageTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return double
                           */
                           public  double getClientWorkerLastMinuteBlockedWorkerPercentage(){
                               return localClientWorkerLastMinuteBlockedWorkerPercentage;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ClientWorkerLastMinuteBlockedWorkerPercentage
                               */
                               public void setClientWorkerLastMinuteBlockedWorkerPercentage(double param){
                            
                                       // setting primitive attribute tracker to true
                                       localClientWorkerLastMinuteBlockedWorkerPercentageTracker =
                                       !java.lang.Double.isNaN(param);
                                   
                                            this.localClientWorkerLastMinuteBlockedWorkerPercentage=param;
                                    

                               }
                            

                        /**
                        * field for ClientWorkerLastResetTime
                        */

                        
                                    protected java.lang.String localClientWorkerLastResetTime ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localClientWorkerLastResetTimeTracker = false ;

                           public boolean isClientWorkerLastResetTimeSpecified(){
                               return localClientWorkerLastResetTimeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getClientWorkerLastResetTime(){
                               return localClientWorkerLastResetTime;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ClientWorkerLastResetTime
                               */
                               public void setClientWorkerLastResetTime(java.lang.String param){
                            localClientWorkerLastResetTimeTracker = true;
                                   
                                            this.localClientWorkerLastResetTime=param;
                                    

                               }
                            

                        /**
                        * field for ClientWorkerTotalWorkerCount
                        */

                        
                                    protected int localClientWorkerTotalWorkerCount ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localClientWorkerTotalWorkerCountTracker = false ;

                           public boolean isClientWorkerTotalWorkerCountSpecified(){
                               return localClientWorkerTotalWorkerCountTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getClientWorkerTotalWorkerCount(){
                               return localClientWorkerTotalWorkerCount;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ClientWorkerTotalWorkerCount
                               */
                               public void setClientWorkerTotalWorkerCount(int param){
                            
                                       // setting primitive attribute tracker to true
                                       localClientWorkerTotalWorkerCountTracker =
                                       param != java.lang.Integer.MIN_VALUE;
                                   
                                            this.localClientWorkerTotalWorkerCount=param;
                                    

                               }
                            

                        /**
                        * field for ServerWorkerAvgBlockedWorkerPercentage
                        */

                        
                                    protected double localServerWorkerAvgBlockedWorkerPercentage ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localServerWorkerAvgBlockedWorkerPercentageTracker = false ;

                           public boolean isServerWorkerAvgBlockedWorkerPercentageSpecified(){
                               return localServerWorkerAvgBlockedWorkerPercentageTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return double
                           */
                           public  double getServerWorkerAvgBlockedWorkerPercentage(){
                               return localServerWorkerAvgBlockedWorkerPercentage;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ServerWorkerAvgBlockedWorkerPercentage
                               */
                               public void setServerWorkerAvgBlockedWorkerPercentage(double param){
                            
                                       // setting primitive attribute tracker to true
                                       localServerWorkerAvgBlockedWorkerPercentageTracker =
                                       !java.lang.Double.isNaN(param);
                                   
                                            this.localServerWorkerAvgBlockedWorkerPercentage=param;
                                    

                               }
                            

                        /**
                        * field for ServerWorkerAvgUnblockedWorkerPercentage
                        */

                        
                                    protected double localServerWorkerAvgUnblockedWorkerPercentage ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localServerWorkerAvgUnblockedWorkerPercentageTracker = false ;

                           public boolean isServerWorkerAvgUnblockedWorkerPercentageSpecified(){
                               return localServerWorkerAvgUnblockedWorkerPercentageTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return double
                           */
                           public  double getServerWorkerAvgUnblockedWorkerPercentage(){
                               return localServerWorkerAvgUnblockedWorkerPercentage;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ServerWorkerAvgUnblockedWorkerPercentage
                               */
                               public void setServerWorkerAvgUnblockedWorkerPercentage(double param){
                            
                                       // setting primitive attribute tracker to true
                                       localServerWorkerAvgUnblockedWorkerPercentageTracker =
                                       !java.lang.Double.isNaN(param);
                                   
                                            this.localServerWorkerAvgUnblockedWorkerPercentage=param;
                                    

                               }
                            

                        /**
                        * field for ServerWorkerDeadLockedWorkers
                        */

                        
                                    protected int localServerWorkerDeadLockedWorkers ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localServerWorkerDeadLockedWorkersTracker = false ;

                           public boolean isServerWorkerDeadLockedWorkersSpecified(){
                               return localServerWorkerDeadLockedWorkersTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getServerWorkerDeadLockedWorkers(){
                               return localServerWorkerDeadLockedWorkers;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ServerWorkerDeadLockedWorkers
                               */
                               public void setServerWorkerDeadLockedWorkers(int param){
                            
                                       // setting primitive attribute tracker to true
                                       localServerWorkerDeadLockedWorkersTracker =
                                       param != java.lang.Integer.MIN_VALUE;
                                   
                                            this.localServerWorkerDeadLockedWorkers=param;
                                    

                               }
                            

                        /**
                        * field for ServerWorkerLast15MinuteBlockedWorkerPercentage
                        */

                        
                                    protected double localServerWorkerLast15MinuteBlockedWorkerPercentage ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localServerWorkerLast15MinuteBlockedWorkerPercentageTracker = false ;

                           public boolean isServerWorkerLast15MinuteBlockedWorkerPercentageSpecified(){
                               return localServerWorkerLast15MinuteBlockedWorkerPercentageTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return double
                           */
                           public  double getServerWorkerLast15MinuteBlockedWorkerPercentage(){
                               return localServerWorkerLast15MinuteBlockedWorkerPercentage;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ServerWorkerLast15MinuteBlockedWorkerPercentage
                               */
                               public void setServerWorkerLast15MinuteBlockedWorkerPercentage(double param){
                            
                                       // setting primitive attribute tracker to true
                                       localServerWorkerLast15MinuteBlockedWorkerPercentageTracker =
                                       !java.lang.Double.isNaN(param);
                                   
                                            this.localServerWorkerLast15MinuteBlockedWorkerPercentage=param;
                                    

                               }
                            

                        /**
                        * field for ServerWorkerLast24HourBlockedWorkerPercentage
                        */

                        
                                    protected double localServerWorkerLast24HourBlockedWorkerPercentage ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localServerWorkerLast24HourBlockedWorkerPercentageTracker = false ;

                           public boolean isServerWorkerLast24HourBlockedWorkerPercentageSpecified(){
                               return localServerWorkerLast24HourBlockedWorkerPercentageTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return double
                           */
                           public  double getServerWorkerLast24HourBlockedWorkerPercentage(){
                               return localServerWorkerLast24HourBlockedWorkerPercentage;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ServerWorkerLast24HourBlockedWorkerPercentage
                               */
                               public void setServerWorkerLast24HourBlockedWorkerPercentage(double param){
                            
                                       // setting primitive attribute tracker to true
                                       localServerWorkerLast24HourBlockedWorkerPercentageTracker =
                                       !java.lang.Double.isNaN(param);
                                   
                                            this.localServerWorkerLast24HourBlockedWorkerPercentage=param;
                                    

                               }
                            

                        /**
                        * field for ServerWorkerLast5MinuteBlockedWorkerPercentage
                        */

                        
                                    protected double localServerWorkerLast5MinuteBlockedWorkerPercentage ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localServerWorkerLast5MinuteBlockedWorkerPercentageTracker = false ;

                           public boolean isServerWorkerLast5MinuteBlockedWorkerPercentageSpecified(){
                               return localServerWorkerLast5MinuteBlockedWorkerPercentageTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return double
                           */
                           public  double getServerWorkerLast5MinuteBlockedWorkerPercentage(){
                               return localServerWorkerLast5MinuteBlockedWorkerPercentage;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ServerWorkerLast5MinuteBlockedWorkerPercentage
                               */
                               public void setServerWorkerLast5MinuteBlockedWorkerPercentage(double param){
                            
                                       // setting primitive attribute tracker to true
                                       localServerWorkerLast5MinuteBlockedWorkerPercentageTracker =
                                       !java.lang.Double.isNaN(param);
                                   
                                            this.localServerWorkerLast5MinuteBlockedWorkerPercentage=param;
                                    

                               }
                            

                        /**
                        * field for ServerWorkerLast8HourBlockedWorkerPercentage
                        */

                        
                                    protected double localServerWorkerLast8HourBlockedWorkerPercentage ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localServerWorkerLast8HourBlockedWorkerPercentageTracker = false ;

                           public boolean isServerWorkerLast8HourBlockedWorkerPercentageSpecified(){
                               return localServerWorkerLast8HourBlockedWorkerPercentageTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return double
                           */
                           public  double getServerWorkerLast8HourBlockedWorkerPercentage(){
                               return localServerWorkerLast8HourBlockedWorkerPercentage;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ServerWorkerLast8HourBlockedWorkerPercentage
                               */
                               public void setServerWorkerLast8HourBlockedWorkerPercentage(double param){
                            
                                       // setting primitive attribute tracker to true
                                       localServerWorkerLast8HourBlockedWorkerPercentageTracker =
                                       !java.lang.Double.isNaN(param);
                                   
                                            this.localServerWorkerLast8HourBlockedWorkerPercentage=param;
                                    

                               }
                            

                        /**
                        * field for ServerWorkerLastHourBlockedWorkerPercentage
                        */

                        
                                    protected double localServerWorkerLastHourBlockedWorkerPercentage ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localServerWorkerLastHourBlockedWorkerPercentageTracker = false ;

                           public boolean isServerWorkerLastHourBlockedWorkerPercentageSpecified(){
                               return localServerWorkerLastHourBlockedWorkerPercentageTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return double
                           */
                           public  double getServerWorkerLastHourBlockedWorkerPercentage(){
                               return localServerWorkerLastHourBlockedWorkerPercentage;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ServerWorkerLastHourBlockedWorkerPercentage
                               */
                               public void setServerWorkerLastHourBlockedWorkerPercentage(double param){
                            
                                       // setting primitive attribute tracker to true
                                       localServerWorkerLastHourBlockedWorkerPercentageTracker =
                                       !java.lang.Double.isNaN(param);
                                   
                                            this.localServerWorkerLastHourBlockedWorkerPercentage=param;
                                    

                               }
                            

                        /**
                        * field for ServerWorkerLastMinuteBlockedWorkerPercentage
                        */

                        
                                    protected double localServerWorkerLastMinuteBlockedWorkerPercentage ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localServerWorkerLastMinuteBlockedWorkerPercentageTracker = false ;

                           public boolean isServerWorkerLastMinuteBlockedWorkerPercentageSpecified(){
                               return localServerWorkerLastMinuteBlockedWorkerPercentageTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return double
                           */
                           public  double getServerWorkerLastMinuteBlockedWorkerPercentage(){
                               return localServerWorkerLastMinuteBlockedWorkerPercentage;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ServerWorkerLastMinuteBlockedWorkerPercentage
                               */
                               public void setServerWorkerLastMinuteBlockedWorkerPercentage(double param){
                            
                                       // setting primitive attribute tracker to true
                                       localServerWorkerLastMinuteBlockedWorkerPercentageTracker =
                                       !java.lang.Double.isNaN(param);
                                   
                                            this.localServerWorkerLastMinuteBlockedWorkerPercentage=param;
                                    

                               }
                            

                        /**
                        * field for ServerWorkerLastResetTime
                        */

                        
                                    protected java.lang.String localServerWorkerLastResetTime ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localServerWorkerLastResetTimeTracker = false ;

                           public boolean isServerWorkerLastResetTimeSpecified(){
                               return localServerWorkerLastResetTimeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getServerWorkerLastResetTime(){
                               return localServerWorkerLastResetTime;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ServerWorkerLastResetTime
                               */
                               public void setServerWorkerLastResetTime(java.lang.String param){
                            localServerWorkerLastResetTimeTracker = true;
                                   
                                            this.localServerWorkerLastResetTime=param;
                                    

                               }
                            

                        /**
                        * field for ServerWorkerTotalWorkerCount
                        */

                        
                                    protected int localServerWorkerTotalWorkerCount ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localServerWorkerTotalWorkerCountTracker = false ;

                           public boolean isServerWorkerTotalWorkerCountSpecified(){
                               return localServerWorkerTotalWorkerCountTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getServerWorkerTotalWorkerCount(){
                               return localServerWorkerTotalWorkerCount;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ServerWorkerTotalWorkerCount
                               */
                               public void setServerWorkerTotalWorkerCount(int param){
                            
                                       // setting primitive attribute tracker to true
                                       localServerWorkerTotalWorkerCountTracker =
                                       param != java.lang.Integer.MIN_VALUE;
                                   
                                            this.localServerWorkerTotalWorkerCount=param;
                                    

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
                           namespacePrefix+":ThreadViewStatistics",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "ThreadViewStatistics",
                           xmlWriter);
                   }

               
                   }
                if (localClientWorkerAvgBlockedWorkerPercentageTracker){
                                    namespace = "http://util.services.transport.statistics.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "clientWorkerAvgBlockedWorkerPercentage", xmlWriter);
                             
                                               if (java.lang.Double.isNaN(localClientWorkerAvgBlockedWorkerPercentage)) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("clientWorkerAvgBlockedWorkerPercentage cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localClientWorkerAvgBlockedWorkerPercentage));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localClientWorkerAvgUnblockedWorkerPercentageTracker){
                                    namespace = "http://util.services.transport.statistics.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "clientWorkerAvgUnblockedWorkerPercentage", xmlWriter);
                             
                                               if (java.lang.Double.isNaN(localClientWorkerAvgUnblockedWorkerPercentage)) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("clientWorkerAvgUnblockedWorkerPercentage cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localClientWorkerAvgUnblockedWorkerPercentage));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localClientWorkerDeadLockedWorkersTracker){
                                    namespace = "http://util.services.transport.statistics.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "clientWorkerDeadLockedWorkers", xmlWriter);
                             
                                               if (localClientWorkerDeadLockedWorkers==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("clientWorkerDeadLockedWorkers cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localClientWorkerDeadLockedWorkers));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localClientWorkerLast15MinuteBlockedWorkerPercentageTracker){
                                    namespace = "http://util.services.transport.statistics.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "clientWorkerLast15MinuteBlockedWorkerPercentage", xmlWriter);
                             
                                               if (java.lang.Double.isNaN(localClientWorkerLast15MinuteBlockedWorkerPercentage)) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("clientWorkerLast15MinuteBlockedWorkerPercentage cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localClientWorkerLast15MinuteBlockedWorkerPercentage));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localClientWorkerLast24HourBlockedWorkerPercentageTracker){
                                    namespace = "http://util.services.transport.statistics.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "clientWorkerLast24HourBlockedWorkerPercentage", xmlWriter);
                             
                                               if (java.lang.Double.isNaN(localClientWorkerLast24HourBlockedWorkerPercentage)) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("clientWorkerLast24HourBlockedWorkerPercentage cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localClientWorkerLast24HourBlockedWorkerPercentage));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localClientWorkerLast5MinuteBlockedWorkerPercentageTracker){
                                    namespace = "http://util.services.transport.statistics.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "clientWorkerLast5MinuteBlockedWorkerPercentage", xmlWriter);
                             
                                               if (java.lang.Double.isNaN(localClientWorkerLast5MinuteBlockedWorkerPercentage)) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("clientWorkerLast5MinuteBlockedWorkerPercentage cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localClientWorkerLast5MinuteBlockedWorkerPercentage));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localClientWorkerLast8HourBlockedWorkerPercentageTracker){
                                    namespace = "http://util.services.transport.statistics.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "clientWorkerLast8HourBlockedWorkerPercentage", xmlWriter);
                             
                                               if (java.lang.Double.isNaN(localClientWorkerLast8HourBlockedWorkerPercentage)) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("clientWorkerLast8HourBlockedWorkerPercentage cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localClientWorkerLast8HourBlockedWorkerPercentage));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localClientWorkerLastHourBlockedWorkerPercentageTracker){
                                    namespace = "http://util.services.transport.statistics.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "clientWorkerLastHourBlockedWorkerPercentage", xmlWriter);
                             
                                               if (java.lang.Double.isNaN(localClientWorkerLastHourBlockedWorkerPercentage)) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("clientWorkerLastHourBlockedWorkerPercentage cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localClientWorkerLastHourBlockedWorkerPercentage));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localClientWorkerLastMinuteBlockedWorkerPercentageTracker){
                                    namespace = "http://util.services.transport.statistics.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "clientWorkerLastMinuteBlockedWorkerPercentage", xmlWriter);
                             
                                               if (java.lang.Double.isNaN(localClientWorkerLastMinuteBlockedWorkerPercentage)) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("clientWorkerLastMinuteBlockedWorkerPercentage cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localClientWorkerLastMinuteBlockedWorkerPercentage));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localClientWorkerLastResetTimeTracker){
                                    namespace = "http://util.services.transport.statistics.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "clientWorkerLastResetTime", xmlWriter);
                             

                                          if (localClientWorkerLastResetTime==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localClientWorkerLastResetTime);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localClientWorkerTotalWorkerCountTracker){
                                    namespace = "http://util.services.transport.statistics.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "clientWorkerTotalWorkerCount", xmlWriter);
                             
                                               if (localClientWorkerTotalWorkerCount==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("clientWorkerTotalWorkerCount cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localClientWorkerTotalWorkerCount));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localServerWorkerAvgBlockedWorkerPercentageTracker){
                                    namespace = "http://util.services.transport.statistics.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "serverWorkerAvgBlockedWorkerPercentage", xmlWriter);
                             
                                               if (java.lang.Double.isNaN(localServerWorkerAvgBlockedWorkerPercentage)) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("serverWorkerAvgBlockedWorkerPercentage cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localServerWorkerAvgBlockedWorkerPercentage));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localServerWorkerAvgUnblockedWorkerPercentageTracker){
                                    namespace = "http://util.services.transport.statistics.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "serverWorkerAvgUnblockedWorkerPercentage", xmlWriter);
                             
                                               if (java.lang.Double.isNaN(localServerWorkerAvgUnblockedWorkerPercentage)) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("serverWorkerAvgUnblockedWorkerPercentage cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localServerWorkerAvgUnblockedWorkerPercentage));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localServerWorkerDeadLockedWorkersTracker){
                                    namespace = "http://util.services.transport.statistics.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "serverWorkerDeadLockedWorkers", xmlWriter);
                             
                                               if (localServerWorkerDeadLockedWorkers==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("serverWorkerDeadLockedWorkers cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localServerWorkerDeadLockedWorkers));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localServerWorkerLast15MinuteBlockedWorkerPercentageTracker){
                                    namespace = "http://util.services.transport.statistics.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "serverWorkerLast15MinuteBlockedWorkerPercentage", xmlWriter);
                             
                                               if (java.lang.Double.isNaN(localServerWorkerLast15MinuteBlockedWorkerPercentage)) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("serverWorkerLast15MinuteBlockedWorkerPercentage cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localServerWorkerLast15MinuteBlockedWorkerPercentage));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localServerWorkerLast24HourBlockedWorkerPercentageTracker){
                                    namespace = "http://util.services.transport.statistics.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "serverWorkerLast24HourBlockedWorkerPercentage", xmlWriter);
                             
                                               if (java.lang.Double.isNaN(localServerWorkerLast24HourBlockedWorkerPercentage)) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("serverWorkerLast24HourBlockedWorkerPercentage cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localServerWorkerLast24HourBlockedWorkerPercentage));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localServerWorkerLast5MinuteBlockedWorkerPercentageTracker){
                                    namespace = "http://util.services.transport.statistics.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "serverWorkerLast5MinuteBlockedWorkerPercentage", xmlWriter);
                             
                                               if (java.lang.Double.isNaN(localServerWorkerLast5MinuteBlockedWorkerPercentage)) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("serverWorkerLast5MinuteBlockedWorkerPercentage cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localServerWorkerLast5MinuteBlockedWorkerPercentage));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localServerWorkerLast8HourBlockedWorkerPercentageTracker){
                                    namespace = "http://util.services.transport.statistics.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "serverWorkerLast8HourBlockedWorkerPercentage", xmlWriter);
                             
                                               if (java.lang.Double.isNaN(localServerWorkerLast8HourBlockedWorkerPercentage)) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("serverWorkerLast8HourBlockedWorkerPercentage cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localServerWorkerLast8HourBlockedWorkerPercentage));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localServerWorkerLastHourBlockedWorkerPercentageTracker){
                                    namespace = "http://util.services.transport.statistics.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "serverWorkerLastHourBlockedWorkerPercentage", xmlWriter);
                             
                                               if (java.lang.Double.isNaN(localServerWorkerLastHourBlockedWorkerPercentage)) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("serverWorkerLastHourBlockedWorkerPercentage cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localServerWorkerLastHourBlockedWorkerPercentage));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localServerWorkerLastMinuteBlockedWorkerPercentageTracker){
                                    namespace = "http://util.services.transport.statistics.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "serverWorkerLastMinuteBlockedWorkerPercentage", xmlWriter);
                             
                                               if (java.lang.Double.isNaN(localServerWorkerLastMinuteBlockedWorkerPercentage)) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("serverWorkerLastMinuteBlockedWorkerPercentage cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localServerWorkerLastMinuteBlockedWorkerPercentage));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localServerWorkerLastResetTimeTracker){
                                    namespace = "http://util.services.transport.statistics.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "serverWorkerLastResetTime", xmlWriter);
                             

                                          if (localServerWorkerLastResetTime==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localServerWorkerLastResetTime);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localServerWorkerTotalWorkerCountTracker){
                                    namespace = "http://util.services.transport.statistics.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "serverWorkerTotalWorkerCount", xmlWriter);
                             
                                               if (localServerWorkerTotalWorkerCount==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("serverWorkerTotalWorkerCount cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localServerWorkerTotalWorkerCount));
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

                 if (localClientWorkerAvgBlockedWorkerPercentageTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd",
                                                                      "clientWorkerAvgBlockedWorkerPercentage"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localClientWorkerAvgBlockedWorkerPercentage));
                            } if (localClientWorkerAvgUnblockedWorkerPercentageTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd",
                                                                      "clientWorkerAvgUnblockedWorkerPercentage"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localClientWorkerAvgUnblockedWorkerPercentage));
                            } if (localClientWorkerDeadLockedWorkersTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd",
                                                                      "clientWorkerDeadLockedWorkers"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localClientWorkerDeadLockedWorkers));
                            } if (localClientWorkerLast15MinuteBlockedWorkerPercentageTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd",
                                                                      "clientWorkerLast15MinuteBlockedWorkerPercentage"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localClientWorkerLast15MinuteBlockedWorkerPercentage));
                            } if (localClientWorkerLast24HourBlockedWorkerPercentageTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd",
                                                                      "clientWorkerLast24HourBlockedWorkerPercentage"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localClientWorkerLast24HourBlockedWorkerPercentage));
                            } if (localClientWorkerLast5MinuteBlockedWorkerPercentageTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd",
                                                                      "clientWorkerLast5MinuteBlockedWorkerPercentage"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localClientWorkerLast5MinuteBlockedWorkerPercentage));
                            } if (localClientWorkerLast8HourBlockedWorkerPercentageTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd",
                                                                      "clientWorkerLast8HourBlockedWorkerPercentage"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localClientWorkerLast8HourBlockedWorkerPercentage));
                            } if (localClientWorkerLastHourBlockedWorkerPercentageTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd",
                                                                      "clientWorkerLastHourBlockedWorkerPercentage"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localClientWorkerLastHourBlockedWorkerPercentage));
                            } if (localClientWorkerLastMinuteBlockedWorkerPercentageTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd",
                                                                      "clientWorkerLastMinuteBlockedWorkerPercentage"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localClientWorkerLastMinuteBlockedWorkerPercentage));
                            } if (localClientWorkerLastResetTimeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd",
                                                                      "clientWorkerLastResetTime"));
                                 
                                         elementList.add(localClientWorkerLastResetTime==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localClientWorkerLastResetTime));
                                    } if (localClientWorkerTotalWorkerCountTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd",
                                                                      "clientWorkerTotalWorkerCount"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localClientWorkerTotalWorkerCount));
                            } if (localServerWorkerAvgBlockedWorkerPercentageTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd",
                                                                      "serverWorkerAvgBlockedWorkerPercentage"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localServerWorkerAvgBlockedWorkerPercentage));
                            } if (localServerWorkerAvgUnblockedWorkerPercentageTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd",
                                                                      "serverWorkerAvgUnblockedWorkerPercentage"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localServerWorkerAvgUnblockedWorkerPercentage));
                            } if (localServerWorkerDeadLockedWorkersTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd",
                                                                      "serverWorkerDeadLockedWorkers"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localServerWorkerDeadLockedWorkers));
                            } if (localServerWorkerLast15MinuteBlockedWorkerPercentageTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd",
                                                                      "serverWorkerLast15MinuteBlockedWorkerPercentage"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localServerWorkerLast15MinuteBlockedWorkerPercentage));
                            } if (localServerWorkerLast24HourBlockedWorkerPercentageTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd",
                                                                      "serverWorkerLast24HourBlockedWorkerPercentage"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localServerWorkerLast24HourBlockedWorkerPercentage));
                            } if (localServerWorkerLast5MinuteBlockedWorkerPercentageTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd",
                                                                      "serverWorkerLast5MinuteBlockedWorkerPercentage"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localServerWorkerLast5MinuteBlockedWorkerPercentage));
                            } if (localServerWorkerLast8HourBlockedWorkerPercentageTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd",
                                                                      "serverWorkerLast8HourBlockedWorkerPercentage"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localServerWorkerLast8HourBlockedWorkerPercentage));
                            } if (localServerWorkerLastHourBlockedWorkerPercentageTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd",
                                                                      "serverWorkerLastHourBlockedWorkerPercentage"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localServerWorkerLastHourBlockedWorkerPercentage));
                            } if (localServerWorkerLastMinuteBlockedWorkerPercentageTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd",
                                                                      "serverWorkerLastMinuteBlockedWorkerPercentage"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localServerWorkerLastMinuteBlockedWorkerPercentage));
                            } if (localServerWorkerLastResetTimeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd",
                                                                      "serverWorkerLastResetTime"));
                                 
                                         elementList.add(localServerWorkerLastResetTime==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localServerWorkerLastResetTime));
                                    } if (localServerWorkerTotalWorkerCountTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd",
                                                                      "serverWorkerTotalWorkerCount"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localServerWorkerTotalWorkerCount));
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
        public static ThreadViewStatistics parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            ThreadViewStatistics object =
                new ThreadViewStatistics();

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
                    
                            if (!"ThreadViewStatistics".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (ThreadViewStatistics)axis2.apache.org.xsd.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd","clientWorkerAvgBlockedWorkerPercentage").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"clientWorkerAvgBlockedWorkerPercentage" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setClientWorkerAvgBlockedWorkerPercentage(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setClientWorkerAvgBlockedWorkerPercentage(java.lang.Double.NaN);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd","clientWorkerAvgUnblockedWorkerPercentage").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"clientWorkerAvgUnblockedWorkerPercentage" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setClientWorkerAvgUnblockedWorkerPercentage(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setClientWorkerAvgUnblockedWorkerPercentage(java.lang.Double.NaN);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd","clientWorkerDeadLockedWorkers").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"clientWorkerDeadLockedWorkers" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setClientWorkerDeadLockedWorkers(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setClientWorkerDeadLockedWorkers(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd","clientWorkerLast15MinuteBlockedWorkerPercentage").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"clientWorkerLast15MinuteBlockedWorkerPercentage" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setClientWorkerLast15MinuteBlockedWorkerPercentage(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setClientWorkerLast15MinuteBlockedWorkerPercentage(java.lang.Double.NaN);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd","clientWorkerLast24HourBlockedWorkerPercentage").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"clientWorkerLast24HourBlockedWorkerPercentage" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setClientWorkerLast24HourBlockedWorkerPercentage(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setClientWorkerLast24HourBlockedWorkerPercentage(java.lang.Double.NaN);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd","clientWorkerLast5MinuteBlockedWorkerPercentage").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"clientWorkerLast5MinuteBlockedWorkerPercentage" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setClientWorkerLast5MinuteBlockedWorkerPercentage(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setClientWorkerLast5MinuteBlockedWorkerPercentage(java.lang.Double.NaN);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd","clientWorkerLast8HourBlockedWorkerPercentage").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"clientWorkerLast8HourBlockedWorkerPercentage" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setClientWorkerLast8HourBlockedWorkerPercentage(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setClientWorkerLast8HourBlockedWorkerPercentage(java.lang.Double.NaN);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd","clientWorkerLastHourBlockedWorkerPercentage").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"clientWorkerLastHourBlockedWorkerPercentage" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setClientWorkerLastHourBlockedWorkerPercentage(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setClientWorkerLastHourBlockedWorkerPercentage(java.lang.Double.NaN);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd","clientWorkerLastMinuteBlockedWorkerPercentage").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"clientWorkerLastMinuteBlockedWorkerPercentage" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setClientWorkerLastMinuteBlockedWorkerPercentage(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setClientWorkerLastMinuteBlockedWorkerPercentage(java.lang.Double.NaN);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd","clientWorkerLastResetTime").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setClientWorkerLastResetTime(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd","clientWorkerTotalWorkerCount").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"clientWorkerTotalWorkerCount" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setClientWorkerTotalWorkerCount(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setClientWorkerTotalWorkerCount(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd","serverWorkerAvgBlockedWorkerPercentage").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"serverWorkerAvgBlockedWorkerPercentage" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setServerWorkerAvgBlockedWorkerPercentage(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setServerWorkerAvgBlockedWorkerPercentage(java.lang.Double.NaN);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd","serverWorkerAvgUnblockedWorkerPercentage").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"serverWorkerAvgUnblockedWorkerPercentage" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setServerWorkerAvgUnblockedWorkerPercentage(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setServerWorkerAvgUnblockedWorkerPercentage(java.lang.Double.NaN);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd","serverWorkerDeadLockedWorkers").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"serverWorkerDeadLockedWorkers" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setServerWorkerDeadLockedWorkers(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setServerWorkerDeadLockedWorkers(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd","serverWorkerLast15MinuteBlockedWorkerPercentage").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"serverWorkerLast15MinuteBlockedWorkerPercentage" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setServerWorkerLast15MinuteBlockedWorkerPercentage(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setServerWorkerLast15MinuteBlockedWorkerPercentage(java.lang.Double.NaN);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd","serverWorkerLast24HourBlockedWorkerPercentage").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"serverWorkerLast24HourBlockedWorkerPercentage" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setServerWorkerLast24HourBlockedWorkerPercentage(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setServerWorkerLast24HourBlockedWorkerPercentage(java.lang.Double.NaN);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd","serverWorkerLast5MinuteBlockedWorkerPercentage").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"serverWorkerLast5MinuteBlockedWorkerPercentage" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setServerWorkerLast5MinuteBlockedWorkerPercentage(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setServerWorkerLast5MinuteBlockedWorkerPercentage(java.lang.Double.NaN);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd","serverWorkerLast8HourBlockedWorkerPercentage").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"serverWorkerLast8HourBlockedWorkerPercentage" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setServerWorkerLast8HourBlockedWorkerPercentage(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setServerWorkerLast8HourBlockedWorkerPercentage(java.lang.Double.NaN);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd","serverWorkerLastHourBlockedWorkerPercentage").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"serverWorkerLastHourBlockedWorkerPercentage" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setServerWorkerLastHourBlockedWorkerPercentage(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setServerWorkerLastHourBlockedWorkerPercentage(java.lang.Double.NaN);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd","serverWorkerLastMinuteBlockedWorkerPercentage").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"serverWorkerLastMinuteBlockedWorkerPercentage" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setServerWorkerLastMinuteBlockedWorkerPercentage(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setServerWorkerLastMinuteBlockedWorkerPercentage(java.lang.Double.NaN);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd","serverWorkerLastResetTime").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setServerWorkerLastResetTime(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://util.services.transport.statistics.carbon.wso2.org/xsd","serverWorkerTotalWorkerCount").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"serverWorkerTotalWorkerCount" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setServerWorkerTotalWorkerCount(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setServerWorkerTotalWorkerCount(java.lang.Integer.MIN_VALUE);
                                           
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
           
    

/**
 * TenantUsage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v3  Built on : Oct 26, 2011 (07:42:27 PDT)
 */

            
                package org.wso2.carbon.usage.beans.xsd;
            

            /**
            *  TenantUsage bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class TenantUsage
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = TenantUsage
                Namespace URI = http://beans.usage.carbon.wso2.org/xsd
                Namespace Prefix = ns14
                */
            

                        /**
                        * field for Domain
                        */

                        
                                    protected java.lang.String localDomain ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDomainTracker = false ;

                           public boolean isDomainSpecified(){
                               return localDomainTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getDomain(){
                               return localDomain;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Domain
                               */
                               public void setDomain(java.lang.String param){
                            localDomainTracker = true;
                                   
                                            this.localDomain=param;
                                    

                               }
                            

                        /**
                        * field for NumberOfUsers
                        */

                        
                                    protected int localNumberOfUsers ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localNumberOfUsersTracker = false ;

                           public boolean isNumberOfUsersSpecified(){
                               return localNumberOfUsersTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getNumberOfUsers(){
                               return localNumberOfUsers;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param NumberOfUsers
                               */
                               public void setNumberOfUsers(int param){
                            
                                       // setting primitive attribute tracker to true
                                       localNumberOfUsersTracker =
                                       param != java.lang.Integer.MIN_VALUE;
                                   
                                            this.localNumberOfUsers=param;
                                    

                               }
                            

                        /**
                        * field for RegistryBandwidthStatistics
                        * This was an Array!
                        */

                        
                                    protected org.wso2.carbon.usage.beans.xsd.BandwidthStatistics[] localRegistryBandwidthStatistics ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRegistryBandwidthStatisticsTracker = false ;

                           public boolean isRegistryBandwidthStatisticsSpecified(){
                               return localRegistryBandwidthStatisticsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return org.wso2.carbon.usage.beans.xsd.BandwidthStatistics[]
                           */
                           public  org.wso2.carbon.usage.beans.xsd.BandwidthStatistics[] getRegistryBandwidthStatistics(){
                               return localRegistryBandwidthStatistics;
                           }

                           
                        


                               
                              /**
                               * validate the array for RegistryBandwidthStatistics
                               */
                              protected void validateRegistryBandwidthStatistics(org.wso2.carbon.usage.beans.xsd.BandwidthStatistics[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param RegistryBandwidthStatistics
                              */
                              public void setRegistryBandwidthStatistics(org.wso2.carbon.usage.beans.xsd.BandwidthStatistics[] param){
                              
                                   validateRegistryBandwidthStatistics(param);

                               localRegistryBandwidthStatisticsTracker = true;
                                      
                                      this.localRegistryBandwidthStatistics=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param org.wso2.carbon.usage.beans.xsd.BandwidthStatistics
                             */
                             public void addRegistryBandwidthStatistics(org.wso2.carbon.usage.beans.xsd.BandwidthStatistics param){
                                   if (localRegistryBandwidthStatistics == null){
                                   localRegistryBandwidthStatistics = new org.wso2.carbon.usage.beans.xsd.BandwidthStatistics[]{};
                                   }

                            
                                 //update the setting tracker
                                localRegistryBandwidthStatisticsTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localRegistryBandwidthStatistics);
                               list.add(param);
                               this.localRegistryBandwidthStatistics =
                             (org.wso2.carbon.usage.beans.xsd.BandwidthStatistics[])list.toArray(
                            new org.wso2.carbon.usage.beans.xsd.BandwidthStatistics[list.size()]);

                             }
                             

                        /**
                        * field for RegistryCapacity
                        */

                        
                                    protected org.wso2.carbon.usage.beans.xsd.TenantDataCapacity localRegistryCapacity ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRegistryCapacityTracker = false ;

                           public boolean isRegistryCapacitySpecified(){
                               return localRegistryCapacityTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return org.wso2.carbon.usage.beans.xsd.TenantDataCapacity
                           */
                           public  org.wso2.carbon.usage.beans.xsd.TenantDataCapacity getRegistryCapacity(){
                               return localRegistryCapacity;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RegistryCapacity
                               */
                               public void setRegistryCapacity(org.wso2.carbon.usage.beans.xsd.TenantDataCapacity param){
                            localRegistryCapacityTracker = true;
                                   
                                            this.localRegistryCapacity=param;
                                    

                               }
                            

                        /**
                        * field for RegistryContentCapacity
                        */

                        
                                    protected long localRegistryContentCapacity ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRegistryContentCapacityTracker = false ;

                           public boolean isRegistryContentCapacitySpecified(){
                               return localRegistryContentCapacityTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return long
                           */
                           public  long getRegistryContentCapacity(){
                               return localRegistryContentCapacity;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RegistryContentCapacity
                               */
                               public void setRegistryContentCapacity(long param){
                            
                                       // setting primitive attribute tracker to true
                                       localRegistryContentCapacityTracker =
                                       param != java.lang.Long.MIN_VALUE;
                                   
                                            this.localRegistryContentCapacity=param;
                                    

                               }
                            

                        /**
                        * field for RegistryContentHistoryCapacity
                        */

                        
                                    protected long localRegistryContentHistoryCapacity ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRegistryContentHistoryCapacityTracker = false ;

                           public boolean isRegistryContentHistoryCapacitySpecified(){
                               return localRegistryContentHistoryCapacityTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return long
                           */
                           public  long getRegistryContentHistoryCapacity(){
                               return localRegistryContentHistoryCapacity;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RegistryContentHistoryCapacity
                               */
                               public void setRegistryContentHistoryCapacity(long param){
                            
                                       // setting primitive attribute tracker to true
                                       localRegistryContentHistoryCapacityTracker =
                                       param != java.lang.Long.MIN_VALUE;
                                   
                                            this.localRegistryContentHistoryCapacity=param;
                                    

                               }
                            

                        /**
                        * field for RequestStatistics
                        * This was an Array!
                        */

                        
                                    protected org.wso2.carbon.usage.beans.xsd.RequestStatistics[] localRequestStatistics ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRequestStatisticsTracker = false ;

                           public boolean isRequestStatisticsSpecified(){
                               return localRequestStatisticsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return org.wso2.carbon.usage.beans.xsd.RequestStatistics[]
                           */
                           public  org.wso2.carbon.usage.beans.xsd.RequestStatistics[] getRequestStatistics(){
                               return localRequestStatistics;
                           }

                           
                        


                               
                              /**
                               * validate the array for RequestStatistics
                               */
                              protected void validateRequestStatistics(org.wso2.carbon.usage.beans.xsd.RequestStatistics[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param RequestStatistics
                              */
                              public void setRequestStatistics(org.wso2.carbon.usage.beans.xsd.RequestStatistics[] param){
                              
                                   validateRequestStatistics(param);

                               localRequestStatisticsTracker = true;
                                      
                                      this.localRequestStatistics=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param org.wso2.carbon.usage.beans.xsd.RequestStatistics
                             */
                             public void addRequestStatistics(org.wso2.carbon.usage.beans.xsd.RequestStatistics param){
                                   if (localRequestStatistics == null){
                                   localRequestStatistics = new org.wso2.carbon.usage.beans.xsd.RequestStatistics[]{};
                                   }

                            
                                 //update the setting tracker
                                localRequestStatisticsTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localRequestStatistics);
                               list.add(param);
                               this.localRequestStatistics =
                             (org.wso2.carbon.usage.beans.xsd.RequestStatistics[])list.toArray(
                            new org.wso2.carbon.usage.beans.xsd.RequestStatistics[list.size()]);

                             }
                             

                        /**
                        * field for ServiceBandwidthStatistics
                        * This was an Array!
                        */

                        
                                    protected org.wso2.carbon.usage.beans.xsd.BandwidthStatistics[] localServiceBandwidthStatistics ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localServiceBandwidthStatisticsTracker = false ;

                           public boolean isServiceBandwidthStatisticsSpecified(){
                               return localServiceBandwidthStatisticsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return org.wso2.carbon.usage.beans.xsd.BandwidthStatistics[]
                           */
                           public  org.wso2.carbon.usage.beans.xsd.BandwidthStatistics[] getServiceBandwidthStatistics(){
                               return localServiceBandwidthStatistics;
                           }

                           
                        


                               
                              /**
                               * validate the array for ServiceBandwidthStatistics
                               */
                              protected void validateServiceBandwidthStatistics(org.wso2.carbon.usage.beans.xsd.BandwidthStatistics[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param ServiceBandwidthStatistics
                              */
                              public void setServiceBandwidthStatistics(org.wso2.carbon.usage.beans.xsd.BandwidthStatistics[] param){
                              
                                   validateServiceBandwidthStatistics(param);

                               localServiceBandwidthStatisticsTracker = true;
                                      
                                      this.localServiceBandwidthStatistics=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param org.wso2.carbon.usage.beans.xsd.BandwidthStatistics
                             */
                             public void addServiceBandwidthStatistics(org.wso2.carbon.usage.beans.xsd.BandwidthStatistics param){
                                   if (localServiceBandwidthStatistics == null){
                                   localServiceBandwidthStatistics = new org.wso2.carbon.usage.beans.xsd.BandwidthStatistics[]{};
                                   }

                            
                                 //update the setting tracker
                                localServiceBandwidthStatisticsTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localServiceBandwidthStatistics);
                               list.add(param);
                               this.localServiceBandwidthStatistics =
                             (org.wso2.carbon.usage.beans.xsd.BandwidthStatistics[])list.toArray(
                            new org.wso2.carbon.usage.beans.xsd.BandwidthStatistics[list.size()]);

                             }
                             

                        /**
                        * field for TenantId
                        */

                        
                                    protected int localTenantId ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTenantIdTracker = false ;

                           public boolean isTenantIdSpecified(){
                               return localTenantIdTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getTenantId(){
                               return localTenantId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TenantId
                               */
                               public void setTenantId(int param){
                            
                                       // setting primitive attribute tracker to true
                                       localTenantIdTracker =
                                       param != java.lang.Integer.MIN_VALUE;
                                   
                                            this.localTenantId=param;
                                    

                               }
                            

                        /**
                        * field for TotalIncomingBandwidth
                        */

                        
                                    protected long localTotalIncomingBandwidth ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTotalIncomingBandwidthTracker = false ;

                           public boolean isTotalIncomingBandwidthSpecified(){
                               return localTotalIncomingBandwidthTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return long
                           */
                           public  long getTotalIncomingBandwidth(){
                               return localTotalIncomingBandwidth;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TotalIncomingBandwidth
                               */
                               public void setTotalIncomingBandwidth(long param){
                            
                                       // setting primitive attribute tracker to true
                                       localTotalIncomingBandwidthTracker =
                                       param != java.lang.Long.MIN_VALUE;
                                   
                                            this.localTotalIncomingBandwidth=param;
                                    

                               }
                            

                        /**
                        * field for TotalOutgoingBandwidth
                        */

                        
                                    protected long localTotalOutgoingBandwidth ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTotalOutgoingBandwidthTracker = false ;

                           public boolean isTotalOutgoingBandwidthSpecified(){
                               return localTotalOutgoingBandwidthTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return long
                           */
                           public  long getTotalOutgoingBandwidth(){
                               return localTotalOutgoingBandwidth;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TotalOutgoingBandwidth
                               */
                               public void setTotalOutgoingBandwidth(long param){
                            
                                       // setting primitive attribute tracker to true
                                       localTotalOutgoingBandwidthTracker =
                                       param != java.lang.Long.MIN_VALUE;
                                   
                                            this.localTotalOutgoingBandwidth=param;
                                    

                               }
                            

                        /**
                        * field for TotalRegistryBandwidth
                        */

                        
                                    protected org.wso2.carbon.usage.beans.xsd.BandwidthStatistics localTotalRegistryBandwidth ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTotalRegistryBandwidthTracker = false ;

                           public boolean isTotalRegistryBandwidthSpecified(){
                               return localTotalRegistryBandwidthTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return org.wso2.carbon.usage.beans.xsd.BandwidthStatistics
                           */
                           public  org.wso2.carbon.usage.beans.xsd.BandwidthStatistics getTotalRegistryBandwidth(){
                               return localTotalRegistryBandwidth;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TotalRegistryBandwidth
                               */
                               public void setTotalRegistryBandwidth(org.wso2.carbon.usage.beans.xsd.BandwidthStatistics param){
                            localTotalRegistryBandwidthTracker = true;
                                   
                                            this.localTotalRegistryBandwidth=param;
                                    

                               }
                            

                        /**
                        * field for TotalRequestStatistics
                        */

                        
                                    protected org.wso2.carbon.usage.beans.xsd.RequestStatistics localTotalRequestStatistics ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTotalRequestStatisticsTracker = false ;

                           public boolean isTotalRequestStatisticsSpecified(){
                               return localTotalRequestStatisticsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return org.wso2.carbon.usage.beans.xsd.RequestStatistics
                           */
                           public  org.wso2.carbon.usage.beans.xsd.RequestStatistics getTotalRequestStatistics(){
                               return localTotalRequestStatistics;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TotalRequestStatistics
                               */
                               public void setTotalRequestStatistics(org.wso2.carbon.usage.beans.xsd.RequestStatistics param){
                            localTotalRequestStatisticsTracker = true;
                                   
                                            this.localTotalRequestStatistics=param;
                                    

                               }
                            

                        /**
                        * field for TotalServiceBandwidth
                        */

                        
                                    protected org.wso2.carbon.usage.beans.xsd.BandwidthStatistics localTotalServiceBandwidth ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTotalServiceBandwidthTracker = false ;

                           public boolean isTotalServiceBandwidthSpecified(){
                               return localTotalServiceBandwidthTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return org.wso2.carbon.usage.beans.xsd.BandwidthStatistics
                           */
                           public  org.wso2.carbon.usage.beans.xsd.BandwidthStatistics getTotalServiceBandwidth(){
                               return localTotalServiceBandwidth;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TotalServiceBandwidth
                               */
                               public void setTotalServiceBandwidth(org.wso2.carbon.usage.beans.xsd.BandwidthStatistics param){
                            localTotalServiceBandwidthTracker = true;
                                   
                                            this.localTotalServiceBandwidth=param;
                                    

                               }
                            

                        /**
                        * field for TotalWebappBandwidth
                        */

                        
                                    protected org.wso2.carbon.usage.beans.xsd.BandwidthStatistics localTotalWebappBandwidth ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTotalWebappBandwidthTracker = false ;

                           public boolean isTotalWebappBandwidthSpecified(){
                               return localTotalWebappBandwidthTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return org.wso2.carbon.usage.beans.xsd.BandwidthStatistics
                           */
                           public  org.wso2.carbon.usage.beans.xsd.BandwidthStatistics getTotalWebappBandwidth(){
                               return localTotalWebappBandwidth;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TotalWebappBandwidth
                               */
                               public void setTotalWebappBandwidth(org.wso2.carbon.usage.beans.xsd.BandwidthStatistics param){
                            localTotalWebappBandwidthTracker = true;
                                   
                                            this.localTotalWebappBandwidth=param;
                                    

                               }
                            

                        /**
                        * field for UsageEntries
                        * This was an Array!
                        */

                        
                                    protected org.wso2.carbon.usage.beans.xsd.UsageEntry[] localUsageEntries ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localUsageEntriesTracker = false ;

                           public boolean isUsageEntriesSpecified(){
                               return localUsageEntriesTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return org.wso2.carbon.usage.beans.xsd.UsageEntry[]
                           */
                           public  org.wso2.carbon.usage.beans.xsd.UsageEntry[] getUsageEntries(){
                               return localUsageEntries;
                           }

                           
                        


                               
                              /**
                               * validate the array for UsageEntries
                               */
                              protected void validateUsageEntries(org.wso2.carbon.usage.beans.xsd.UsageEntry[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param UsageEntries
                              */
                              public void setUsageEntries(org.wso2.carbon.usage.beans.xsd.UsageEntry[] param){
                              
                                   validateUsageEntries(param);

                               localUsageEntriesTracker = true;
                                      
                                      this.localUsageEntries=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param org.wso2.carbon.usage.beans.xsd.UsageEntry
                             */
                             public void addUsageEntries(org.wso2.carbon.usage.beans.xsd.UsageEntry param){
                                   if (localUsageEntries == null){
                                   localUsageEntries = new org.wso2.carbon.usage.beans.xsd.UsageEntry[]{};
                                   }

                            
                                 //update the setting tracker
                                localUsageEntriesTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localUsageEntries);
                               list.add(param);
                               this.localUsageEntries =
                             (org.wso2.carbon.usage.beans.xsd.UsageEntry[])list.toArray(
                            new org.wso2.carbon.usage.beans.xsd.UsageEntry[list.size()]);

                             }
                             

                        /**
                        * field for WebappBandwidthStatistics
                        * This was an Array!
                        */

                        
                                    protected org.wso2.carbon.usage.beans.xsd.BandwidthStatistics[] localWebappBandwidthStatistics ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localWebappBandwidthStatisticsTracker = false ;

                           public boolean isWebappBandwidthStatisticsSpecified(){
                               return localWebappBandwidthStatisticsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return org.wso2.carbon.usage.beans.xsd.BandwidthStatistics[]
                           */
                           public  org.wso2.carbon.usage.beans.xsd.BandwidthStatistics[] getWebappBandwidthStatistics(){
                               return localWebappBandwidthStatistics;
                           }

                           
                        


                               
                              /**
                               * validate the array for WebappBandwidthStatistics
                               */
                              protected void validateWebappBandwidthStatistics(org.wso2.carbon.usage.beans.xsd.BandwidthStatistics[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param WebappBandwidthStatistics
                              */
                              public void setWebappBandwidthStatistics(org.wso2.carbon.usage.beans.xsd.BandwidthStatistics[] param){
                              
                                   validateWebappBandwidthStatistics(param);

                               localWebappBandwidthStatisticsTracker = true;
                                      
                                      this.localWebappBandwidthStatistics=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param org.wso2.carbon.usage.beans.xsd.BandwidthStatistics
                             */
                             public void addWebappBandwidthStatistics(org.wso2.carbon.usage.beans.xsd.BandwidthStatistics param){
                                   if (localWebappBandwidthStatistics == null){
                                   localWebappBandwidthStatistics = new org.wso2.carbon.usage.beans.xsd.BandwidthStatistics[]{};
                                   }

                            
                                 //update the setting tracker
                                localWebappBandwidthStatisticsTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localWebappBandwidthStatistics);
                               list.add(param);
                               this.localWebappBandwidthStatistics =
                             (org.wso2.carbon.usage.beans.xsd.BandwidthStatistics[])list.toArray(
                            new org.wso2.carbon.usage.beans.xsd.BandwidthStatistics[list.size()]);

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
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://beans.usage.carbon.wso2.org/xsd");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":TenantUsage",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "TenantUsage",
                           xmlWriter);
                   }

               
                   }
                if (localDomainTracker){
                                    namespace = "http://beans.usage.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "domain", xmlWriter);
                             

                                          if (localDomain==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localDomain);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localNumberOfUsersTracker){
                                    namespace = "http://beans.usage.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "numberOfUsers", xmlWriter);
                             
                                               if (localNumberOfUsers==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("numberOfUsers cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumberOfUsers));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localRegistryBandwidthStatisticsTracker){
                                       if (localRegistryBandwidthStatistics!=null){
                                            for (int i = 0;i < localRegistryBandwidthStatistics.length;i++){
                                                if (localRegistryBandwidthStatistics[i] != null){
                                                 localRegistryBandwidthStatistics[i].serialize(new javax.xml.namespace.QName("http://beans.usage.carbon.wso2.org/xsd","registryBandwidthStatistics"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                            writeStartElement(null, "http://beans.usage.carbon.wso2.org/xsd", "registryBandwidthStatistics", xmlWriter);

                                                           // write the nil attribute
                                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                           xmlWriter.writeEndElement();
                                                    
                                                }

                                            }
                                     } else {
                                        
                                                writeStartElement(null, "http://beans.usage.carbon.wso2.org/xsd", "registryBandwidthStatistics", xmlWriter);

                                               // write the nil attribute
                                               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                               xmlWriter.writeEndElement();
                                        
                                    }
                                 } if (localRegistryCapacityTracker){
                                    if (localRegistryCapacity==null){

                                        writeStartElement(null, "http://beans.usage.carbon.wso2.org/xsd", "registryCapacity", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localRegistryCapacity.serialize(new javax.xml.namespace.QName("http://beans.usage.carbon.wso2.org/xsd","registryCapacity"),
                                        xmlWriter);
                                    }
                                } if (localRegistryContentCapacityTracker){
                                    namespace = "http://beans.usage.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "registryContentCapacity", xmlWriter);
                             
                                               if (localRegistryContentCapacity==java.lang.Long.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("registryContentCapacity cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRegistryContentCapacity));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localRegistryContentHistoryCapacityTracker){
                                    namespace = "http://beans.usage.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "registryContentHistoryCapacity", xmlWriter);
                             
                                               if (localRegistryContentHistoryCapacity==java.lang.Long.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("registryContentHistoryCapacity cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRegistryContentHistoryCapacity));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localRequestStatisticsTracker){
                                       if (localRequestStatistics!=null){
                                            for (int i = 0;i < localRequestStatistics.length;i++){
                                                if (localRequestStatistics[i] != null){
                                                 localRequestStatistics[i].serialize(new javax.xml.namespace.QName("http://beans.usage.carbon.wso2.org/xsd","requestStatistics"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                            writeStartElement(null, "http://beans.usage.carbon.wso2.org/xsd", "requestStatistics", xmlWriter);

                                                           // write the nil attribute
                                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                           xmlWriter.writeEndElement();
                                                    
                                                }

                                            }
                                     } else {
                                        
                                                writeStartElement(null, "http://beans.usage.carbon.wso2.org/xsd", "requestStatistics", xmlWriter);

                                               // write the nil attribute
                                               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                               xmlWriter.writeEndElement();
                                        
                                    }
                                 } if (localServiceBandwidthStatisticsTracker){
                                       if (localServiceBandwidthStatistics!=null){
                                            for (int i = 0;i < localServiceBandwidthStatistics.length;i++){
                                                if (localServiceBandwidthStatistics[i] != null){
                                                 localServiceBandwidthStatistics[i].serialize(new javax.xml.namespace.QName("http://beans.usage.carbon.wso2.org/xsd","serviceBandwidthStatistics"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                            writeStartElement(null, "http://beans.usage.carbon.wso2.org/xsd", "serviceBandwidthStatistics", xmlWriter);

                                                           // write the nil attribute
                                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                           xmlWriter.writeEndElement();
                                                    
                                                }

                                            }
                                     } else {
                                        
                                                writeStartElement(null, "http://beans.usage.carbon.wso2.org/xsd", "serviceBandwidthStatistics", xmlWriter);

                                               // write the nil attribute
                                               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                               xmlWriter.writeEndElement();
                                        
                                    }
                                 } if (localTenantIdTracker){
                                    namespace = "http://beans.usage.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "tenantId", xmlWriter);
                             
                                               if (localTenantId==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("tenantId cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTenantId));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localTotalIncomingBandwidthTracker){
                                    namespace = "http://beans.usage.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "totalIncomingBandwidth", xmlWriter);
                             
                                               if (localTotalIncomingBandwidth==java.lang.Long.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("totalIncomingBandwidth cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTotalIncomingBandwidth));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localTotalOutgoingBandwidthTracker){
                                    namespace = "http://beans.usage.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "totalOutgoingBandwidth", xmlWriter);
                             
                                               if (localTotalOutgoingBandwidth==java.lang.Long.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("totalOutgoingBandwidth cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTotalOutgoingBandwidth));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localTotalRegistryBandwidthTracker){
                                    if (localTotalRegistryBandwidth==null){

                                        writeStartElement(null, "http://beans.usage.carbon.wso2.org/xsd", "totalRegistryBandwidth", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localTotalRegistryBandwidth.serialize(new javax.xml.namespace.QName("http://beans.usage.carbon.wso2.org/xsd","totalRegistryBandwidth"),
                                        xmlWriter);
                                    }
                                } if (localTotalRequestStatisticsTracker){
                                    if (localTotalRequestStatistics==null){

                                        writeStartElement(null, "http://beans.usage.carbon.wso2.org/xsd", "totalRequestStatistics", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localTotalRequestStatistics.serialize(new javax.xml.namespace.QName("http://beans.usage.carbon.wso2.org/xsd","totalRequestStatistics"),
                                        xmlWriter);
                                    }
                                } if (localTotalServiceBandwidthTracker){
                                    if (localTotalServiceBandwidth==null){

                                        writeStartElement(null, "http://beans.usage.carbon.wso2.org/xsd", "totalServiceBandwidth", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localTotalServiceBandwidth.serialize(new javax.xml.namespace.QName("http://beans.usage.carbon.wso2.org/xsd","totalServiceBandwidth"),
                                        xmlWriter);
                                    }
                                } if (localTotalWebappBandwidthTracker){
                                    if (localTotalWebappBandwidth==null){

                                        writeStartElement(null, "http://beans.usage.carbon.wso2.org/xsd", "totalWebappBandwidth", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localTotalWebappBandwidth.serialize(new javax.xml.namespace.QName("http://beans.usage.carbon.wso2.org/xsd","totalWebappBandwidth"),
                                        xmlWriter);
                                    }
                                } if (localUsageEntriesTracker){
                                       if (localUsageEntries!=null){
                                            for (int i = 0;i < localUsageEntries.length;i++){
                                                if (localUsageEntries[i] != null){
                                                 localUsageEntries[i].serialize(new javax.xml.namespace.QName("http://beans.usage.carbon.wso2.org/xsd","usageEntries"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                            writeStartElement(null, "http://beans.usage.carbon.wso2.org/xsd", "usageEntries", xmlWriter);

                                                           // write the nil attribute
                                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                           xmlWriter.writeEndElement();
                                                    
                                                }

                                            }
                                     } else {
                                        
                                                writeStartElement(null, "http://beans.usage.carbon.wso2.org/xsd", "usageEntries", xmlWriter);

                                               // write the nil attribute
                                               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                               xmlWriter.writeEndElement();
                                        
                                    }
                                 } if (localWebappBandwidthStatisticsTracker){
                                       if (localWebappBandwidthStatistics!=null){
                                            for (int i = 0;i < localWebappBandwidthStatistics.length;i++){
                                                if (localWebappBandwidthStatistics[i] != null){
                                                 localWebappBandwidthStatistics[i].serialize(new javax.xml.namespace.QName("http://beans.usage.carbon.wso2.org/xsd","webappBandwidthStatistics"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                            writeStartElement(null, "http://beans.usage.carbon.wso2.org/xsd", "webappBandwidthStatistics", xmlWriter);

                                                           // write the nil attribute
                                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                           xmlWriter.writeEndElement();
                                                    
                                                }

                                            }
                                     } else {
                                        
                                                writeStartElement(null, "http://beans.usage.carbon.wso2.org/xsd", "webappBandwidthStatistics", xmlWriter);

                                               // write the nil attribute
                                               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                               xmlWriter.writeEndElement();
                                        
                                    }
                                 }
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://beans.usage.carbon.wso2.org/xsd")){
                return "ns14";
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

                 if (localDomainTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://beans.usage.carbon.wso2.org/xsd",
                                                                      "domain"));
                                 
                                         elementList.add(localDomain==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDomain));
                                    } if (localNumberOfUsersTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://beans.usage.carbon.wso2.org/xsd",
                                                                      "numberOfUsers"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumberOfUsers));
                            } if (localRegistryBandwidthStatisticsTracker){
                             if (localRegistryBandwidthStatistics!=null) {
                                 for (int i = 0;i < localRegistryBandwidthStatistics.length;i++){

                                    if (localRegistryBandwidthStatistics[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://beans.usage.carbon.wso2.org/xsd",
                                                                          "registryBandwidthStatistics"));
                                         elementList.add(localRegistryBandwidthStatistics[i]);
                                    } else {
                                        
                                                elementList.add(new javax.xml.namespace.QName("http://beans.usage.carbon.wso2.org/xsd",
                                                                          "registryBandwidthStatistics"));
                                                elementList.add(null);
                                            
                                    }

                                 }
                             } else {
                                 
                                        elementList.add(new javax.xml.namespace.QName("http://beans.usage.carbon.wso2.org/xsd",
                                                                          "registryBandwidthStatistics"));
                                        elementList.add(localRegistryBandwidthStatistics);
                                    
                             }

                        } if (localRegistryCapacityTracker){
                            elementList.add(new javax.xml.namespace.QName("http://beans.usage.carbon.wso2.org/xsd",
                                                                      "registryCapacity"));
                            
                            
                                    elementList.add(localRegistryCapacity==null?null:
                                    localRegistryCapacity);
                                } if (localRegistryContentCapacityTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://beans.usage.carbon.wso2.org/xsd",
                                                                      "registryContentCapacity"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRegistryContentCapacity));
                            } if (localRegistryContentHistoryCapacityTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://beans.usage.carbon.wso2.org/xsd",
                                                                      "registryContentHistoryCapacity"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRegistryContentHistoryCapacity));
                            } if (localRequestStatisticsTracker){
                             if (localRequestStatistics!=null) {
                                 for (int i = 0;i < localRequestStatistics.length;i++){

                                    if (localRequestStatistics[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://beans.usage.carbon.wso2.org/xsd",
                                                                          "requestStatistics"));
                                         elementList.add(localRequestStatistics[i]);
                                    } else {
                                        
                                                elementList.add(new javax.xml.namespace.QName("http://beans.usage.carbon.wso2.org/xsd",
                                                                          "requestStatistics"));
                                                elementList.add(null);
                                            
                                    }

                                 }
                             } else {
                                 
                                        elementList.add(new javax.xml.namespace.QName("http://beans.usage.carbon.wso2.org/xsd",
                                                                          "requestStatistics"));
                                        elementList.add(localRequestStatistics);
                                    
                             }

                        } if (localServiceBandwidthStatisticsTracker){
                             if (localServiceBandwidthStatistics!=null) {
                                 for (int i = 0;i < localServiceBandwidthStatistics.length;i++){

                                    if (localServiceBandwidthStatistics[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://beans.usage.carbon.wso2.org/xsd",
                                                                          "serviceBandwidthStatistics"));
                                         elementList.add(localServiceBandwidthStatistics[i]);
                                    } else {
                                        
                                                elementList.add(new javax.xml.namespace.QName("http://beans.usage.carbon.wso2.org/xsd",
                                                                          "serviceBandwidthStatistics"));
                                                elementList.add(null);
                                            
                                    }

                                 }
                             } else {
                                 
                                        elementList.add(new javax.xml.namespace.QName("http://beans.usage.carbon.wso2.org/xsd",
                                                                          "serviceBandwidthStatistics"));
                                        elementList.add(localServiceBandwidthStatistics);
                                    
                             }

                        } if (localTenantIdTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://beans.usage.carbon.wso2.org/xsd",
                                                                      "tenantId"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTenantId));
                            } if (localTotalIncomingBandwidthTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://beans.usage.carbon.wso2.org/xsd",
                                                                      "totalIncomingBandwidth"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTotalIncomingBandwidth));
                            } if (localTotalOutgoingBandwidthTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://beans.usage.carbon.wso2.org/xsd",
                                                                      "totalOutgoingBandwidth"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTotalOutgoingBandwidth));
                            } if (localTotalRegistryBandwidthTracker){
                            elementList.add(new javax.xml.namespace.QName("http://beans.usage.carbon.wso2.org/xsd",
                                                                      "totalRegistryBandwidth"));
                            
                            
                                    elementList.add(localTotalRegistryBandwidth==null?null:
                                    localTotalRegistryBandwidth);
                                } if (localTotalRequestStatisticsTracker){
                            elementList.add(new javax.xml.namespace.QName("http://beans.usage.carbon.wso2.org/xsd",
                                                                      "totalRequestStatistics"));
                            
                            
                                    elementList.add(localTotalRequestStatistics==null?null:
                                    localTotalRequestStatistics);
                                } if (localTotalServiceBandwidthTracker){
                            elementList.add(new javax.xml.namespace.QName("http://beans.usage.carbon.wso2.org/xsd",
                                                                      "totalServiceBandwidth"));
                            
                            
                                    elementList.add(localTotalServiceBandwidth==null?null:
                                    localTotalServiceBandwidth);
                                } if (localTotalWebappBandwidthTracker){
                            elementList.add(new javax.xml.namespace.QName("http://beans.usage.carbon.wso2.org/xsd",
                                                                      "totalWebappBandwidth"));
                            
                            
                                    elementList.add(localTotalWebappBandwidth==null?null:
                                    localTotalWebappBandwidth);
                                } if (localUsageEntriesTracker){
                             if (localUsageEntries!=null) {
                                 for (int i = 0;i < localUsageEntries.length;i++){

                                    if (localUsageEntries[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://beans.usage.carbon.wso2.org/xsd",
                                                                          "usageEntries"));
                                         elementList.add(localUsageEntries[i]);
                                    } else {
                                        
                                                elementList.add(new javax.xml.namespace.QName("http://beans.usage.carbon.wso2.org/xsd",
                                                                          "usageEntries"));
                                                elementList.add(null);
                                            
                                    }

                                 }
                             } else {
                                 
                                        elementList.add(new javax.xml.namespace.QName("http://beans.usage.carbon.wso2.org/xsd",
                                                                          "usageEntries"));
                                        elementList.add(localUsageEntries);
                                    
                             }

                        } if (localWebappBandwidthStatisticsTracker){
                             if (localWebappBandwidthStatistics!=null) {
                                 for (int i = 0;i < localWebappBandwidthStatistics.length;i++){

                                    if (localWebappBandwidthStatistics[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://beans.usage.carbon.wso2.org/xsd",
                                                                          "webappBandwidthStatistics"));
                                         elementList.add(localWebappBandwidthStatistics[i]);
                                    } else {
                                        
                                                elementList.add(new javax.xml.namespace.QName("http://beans.usage.carbon.wso2.org/xsd",
                                                                          "webappBandwidthStatistics"));
                                                elementList.add(null);
                                            
                                    }

                                 }
                             } else {
                                 
                                        elementList.add(new javax.xml.namespace.QName("http://beans.usage.carbon.wso2.org/xsd",
                                                                          "webappBandwidthStatistics"));
                                        elementList.add(localWebappBandwidthStatistics);
                                    
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
        public static TenantUsage parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            TenantUsage object =
                new TenantUsage();

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
                    
                            if (!"TenantUsage".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (TenantUsage)org.wso2.carbon.usage.beans.xsd.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                        java.util.ArrayList list3 = new java.util.ArrayList();
                    
                        java.util.ArrayList list7 = new java.util.ArrayList();
                    
                        java.util.ArrayList list8 = new java.util.ArrayList();
                    
                        java.util.ArrayList list16 = new java.util.ArrayList();
                    
                        java.util.ArrayList list17 = new java.util.ArrayList();
                    
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://beans.usage.carbon.wso2.org/xsd","domain").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setDomain(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://beans.usage.carbon.wso2.org/xsd","numberOfUsers").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"numberOfUsers" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setNumberOfUsers(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setNumberOfUsers(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://beans.usage.carbon.wso2.org/xsd","registryBandwidthStatistics").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list3.add(null);
                                                              reader.next();
                                                          } else {
                                                        list3.add(org.wso2.carbon.usage.beans.xsd.BandwidthStatistics.Factory.parse(reader));
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
                                                                if (new javax.xml.namespace.QName("http://beans.usage.carbon.wso2.org/xsd","registryBandwidthStatistics").equals(reader.getName())){
                                                                    
                                                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                                          list3.add(null);
                                                                          reader.next();
                                                                      } else {
                                                                    list3.add(org.wso2.carbon.usage.beans.xsd.BandwidthStatistics.Factory.parse(reader));
                                                                        }
                                                                }else{
                                                                    loopDone3 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setRegistryBandwidthStatistics((org.wso2.carbon.usage.beans.xsd.BandwidthStatistics[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                org.wso2.carbon.usage.beans.xsd.BandwidthStatistics.class,
                                                                list3));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://beans.usage.carbon.wso2.org/xsd","registryCapacity").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setRegistryCapacity(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setRegistryCapacity(org.wso2.carbon.usage.beans.xsd.TenantDataCapacity.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://beans.usage.carbon.wso2.org/xsd","registryContentCapacity").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"registryContentCapacity" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setRegistryContentCapacity(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setRegistryContentCapacity(java.lang.Long.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://beans.usage.carbon.wso2.org/xsd","registryContentHistoryCapacity").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"registryContentHistoryCapacity" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setRegistryContentHistoryCapacity(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setRegistryContentHistoryCapacity(java.lang.Long.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://beans.usage.carbon.wso2.org/xsd","requestStatistics").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list7.add(null);
                                                              reader.next();
                                                          } else {
                                                        list7.add(org.wso2.carbon.usage.beans.xsd.RequestStatistics.Factory.parse(reader));
                                                                }
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone7 = false;
                                                        while(!loopDone7){
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
                                                                loopDone7 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://beans.usage.carbon.wso2.org/xsd","requestStatistics").equals(reader.getName())){
                                                                    
                                                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                                          list7.add(null);
                                                                          reader.next();
                                                                      } else {
                                                                    list7.add(org.wso2.carbon.usage.beans.xsd.RequestStatistics.Factory.parse(reader));
                                                                        }
                                                                }else{
                                                                    loopDone7 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setRequestStatistics((org.wso2.carbon.usage.beans.xsd.RequestStatistics[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                org.wso2.carbon.usage.beans.xsd.RequestStatistics.class,
                                                                list7));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://beans.usage.carbon.wso2.org/xsd","serviceBandwidthStatistics").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list8.add(null);
                                                              reader.next();
                                                          } else {
                                                        list8.add(org.wso2.carbon.usage.beans.xsd.BandwidthStatistics.Factory.parse(reader));
                                                                }
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone8 = false;
                                                        while(!loopDone8){
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
                                                                loopDone8 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://beans.usage.carbon.wso2.org/xsd","serviceBandwidthStatistics").equals(reader.getName())){
                                                                    
                                                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                                          list8.add(null);
                                                                          reader.next();
                                                                      } else {
                                                                    list8.add(org.wso2.carbon.usage.beans.xsd.BandwidthStatistics.Factory.parse(reader));
                                                                        }
                                                                }else{
                                                                    loopDone8 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setServiceBandwidthStatistics((org.wso2.carbon.usage.beans.xsd.BandwidthStatistics[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                org.wso2.carbon.usage.beans.xsd.BandwidthStatistics.class,
                                                                list8));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://beans.usage.carbon.wso2.org/xsd","tenantId").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"tenantId" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTenantId(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setTenantId(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://beans.usage.carbon.wso2.org/xsd","totalIncomingBandwidth").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"totalIncomingBandwidth" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTotalIncomingBandwidth(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setTotalIncomingBandwidth(java.lang.Long.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://beans.usage.carbon.wso2.org/xsd","totalOutgoingBandwidth").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"totalOutgoingBandwidth" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTotalOutgoingBandwidth(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setTotalOutgoingBandwidth(java.lang.Long.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://beans.usage.carbon.wso2.org/xsd","totalRegistryBandwidth").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setTotalRegistryBandwidth(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setTotalRegistryBandwidth(org.wso2.carbon.usage.beans.xsd.BandwidthStatistics.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://beans.usage.carbon.wso2.org/xsd","totalRequestStatistics").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setTotalRequestStatistics(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setTotalRequestStatistics(org.wso2.carbon.usage.beans.xsd.RequestStatistics.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://beans.usage.carbon.wso2.org/xsd","totalServiceBandwidth").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setTotalServiceBandwidth(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setTotalServiceBandwidth(org.wso2.carbon.usage.beans.xsd.BandwidthStatistics.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://beans.usage.carbon.wso2.org/xsd","totalWebappBandwidth").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setTotalWebappBandwidth(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setTotalWebappBandwidth(org.wso2.carbon.usage.beans.xsd.BandwidthStatistics.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://beans.usage.carbon.wso2.org/xsd","usageEntries").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list16.add(null);
                                                              reader.next();
                                                          } else {
                                                        list16.add(org.wso2.carbon.usage.beans.xsd.UsageEntry.Factory.parse(reader));
                                                                }
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone16 = false;
                                                        while(!loopDone16){
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
                                                                loopDone16 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://beans.usage.carbon.wso2.org/xsd","usageEntries").equals(reader.getName())){
                                                                    
                                                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                                          list16.add(null);
                                                                          reader.next();
                                                                      } else {
                                                                    list16.add(org.wso2.carbon.usage.beans.xsd.UsageEntry.Factory.parse(reader));
                                                                        }
                                                                }else{
                                                                    loopDone16 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setUsageEntries((org.wso2.carbon.usage.beans.xsd.UsageEntry[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                org.wso2.carbon.usage.beans.xsd.UsageEntry.class,
                                                                list16));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://beans.usage.carbon.wso2.org/xsd","webappBandwidthStatistics").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list17.add(null);
                                                              reader.next();
                                                          } else {
                                                        list17.add(org.wso2.carbon.usage.beans.xsd.BandwidthStatistics.Factory.parse(reader));
                                                                }
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone17 = false;
                                                        while(!loopDone17){
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
                                                                loopDone17 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://beans.usage.carbon.wso2.org/xsd","webappBandwidthStatistics").equals(reader.getName())){
                                                                    
                                                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                                          list17.add(null);
                                                                          reader.next();
                                                                      } else {
                                                                    list17.add(org.wso2.carbon.usage.beans.xsd.BandwidthStatistics.Factory.parse(reader));
                                                                        }
                                                                }else{
                                                                    loopDone17 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setWebappBandwidthStatistics((org.wso2.carbon.usage.beans.xsd.BandwidthStatistics[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                org.wso2.carbon.usage.beans.xsd.BandwidthStatistics.class,
                                                                list17));
                                                            
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
           
    
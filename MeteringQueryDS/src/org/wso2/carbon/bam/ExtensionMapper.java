
/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v3  Built on : Oct 26, 2011 (07:42:27 PDT)
 */

        
            package org.wso2.carbon.bam;
        
            /**
            *  ExtensionMapper class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ExtensionMapper{

          public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
                                                       java.lang.String typeName,
                                                       javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{

              
                  if (
                  "http://bam.carbon.wso2.org".equals(namespaceURI) &&
                  "serviceRequestStat".equals(typeName)){
                   
                            return  org.wso2.carbon.bam.ServiceRequestStat.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://bam.carbon.wso2.org".equals(namespaceURI) &&
                  "instanceUsageStat".equals(typeName)){
                   
                            return  org.wso2.carbon.bam.InstanceUsageStat.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://bam.carbon.wso2.org".equals(namespaceURI) &&
                  "regBandwidthStats".equals(typeName)){
                   
                            return  org.wso2.carbon.bam.RegBandwidthStats.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://bam.carbon.wso2.org".equals(namespaceURI) &&
                  "serviceRequestStats".equals(typeName)){
                   
                            return  org.wso2.carbon.bam.ServiceRequestStats.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://bam.carbon.wso2.org".equals(namespaceURI) &&
                  "instanceUsageStats".equals(typeName)){
                   
                            return  org.wso2.carbon.bam.InstanceUsageStats.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://bam.carbon.wso2.org".equals(namespaceURI) &&
                  "bandwidthStats".equals(typeName)){
                   
                            return  org.wso2.carbon.bam.BandwidthStats.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://bam.carbon.wso2.org".equals(namespaceURI) &&
                  "BandwidthStat".equals(typeName)){
                   
                            return  org.wso2.carbon.bam.BandwidthStat.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://bam.carbon.wso2.org".equals(namespaceURI) &&
                  "regBandwidthStat".equals(typeName)){
                   
                            return  org.wso2.carbon.bam.RegBandwidthStat.Factory.parse(reader);
                        

                  }

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    
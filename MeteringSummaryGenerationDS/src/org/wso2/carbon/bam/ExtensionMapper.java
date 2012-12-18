
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
                  "bandwidthHourlyStatValues".equals(typeName)){
                   
                            return  org.wso2.carbon.bam.BandwidthHourlyStatValues.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://bam.carbon.wso2.org".equals(namespaceURI) &&
                  "bandwidthUsageValue".equals(typeName)){
                   
                            return  org.wso2.carbon.bam.BandwidthUsageValue.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://bam.carbon.wso2.org".equals(namespaceURI) &&
                  "bandwidthUsageValues".equals(typeName)){
                   
                            return  org.wso2.carbon.bam.BandwidthUsageValues.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://bam.carbon.wso2.org".equals(namespaceURI) &&
                  "bandwidthStatValues".equals(typeName)){
                   
                            return  org.wso2.carbon.bam.BandwidthStatValues.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://bam.carbon.wso2.org".equals(namespaceURI) &&
                  "summaryTime".equals(typeName)){
                   
                            return  org.wso2.carbon.bam.SummaryTime.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://bam.carbon.wso2.org".equals(namespaceURI) &&
                  "bandwidthUsages".equals(typeName)){
                   
                            return  org.wso2.carbon.bam.BandwidthUsages.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://bam.carbon.wso2.org".equals(namespaceURI) &&
                  "bandwidthUsage".equals(typeName)){
                   
                            return  org.wso2.carbon.bam.BandwidthUsage.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://bam.carbon.wso2.org".equals(namespaceURI) &&
                  "summaryTimes".equals(typeName)){
                   
                            return  org.wso2.carbon.bam.SummaryTimes.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://bam.carbon.wso2.org".equals(namespaceURI) &&
                  "bandwidthStatValue".equals(typeName)){
                   
                            return  org.wso2.carbon.bam.BandwidthStatValue.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://bam.carbon.wso2.org".equals(namespaceURI) &&
                  "bandwidthHourlyStatValue".equals(typeName)){
                   
                            return  org.wso2.carbon.bam.BandwidthHourlyStatValue.Factory.parse(reader);
                        

                  }

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    
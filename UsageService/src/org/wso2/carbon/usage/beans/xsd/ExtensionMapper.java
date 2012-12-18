
/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v3  Built on : Oct 26, 2011 (07:42:27 PDT)
 */

        
            package org.wso2.carbon.usage.beans.xsd;
        
            /**
            *  ExtensionMapper class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ExtensionMapper{

          public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
                                                       java.lang.String typeName,
                                                       javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{

              
                  if (
                  "http://beans.usage.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "TenantUsage".equals(typeName)){
                   
                            return  org.wso2.carbon.usage.beans.xsd.TenantUsage.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://beans.usage.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "BandwidthStatistics".equals(typeName)){
                   
                            return  org.wso2.carbon.usage.beans.xsd.BandwidthStatistics.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://beans.usage.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "UsageEntry".equals(typeName)){
                   
                            return  org.wso2.carbon.usage.beans.xsd.UsageEntry.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://beans.usage.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "PaginatedTenantUsageInfo".equals(typeName)){
                   
                            return  org.wso2.carbon.usage.beans.xsd.PaginatedTenantUsageInfo.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://beans.usage.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "InstanceUsageStatics".equals(typeName)){
                   
                            return  org.wso2.carbon.usage.beans.xsd.InstanceUsageStatics.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://services.usage.carbon.wso2.org".equals(namespaceURI) &&
                  "Exception".equals(typeName)){
                   
                            return  org.wso2.carbon.usage.services.Exception.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://beans.usage.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "PaginatedInstanceUsage".equals(typeName)){
                   
                            return  org.wso2.carbon.usage.beans.xsd.PaginatedInstanceUsage.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://beans.usage.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "RequestStatistics".equals(typeName)){
                   
                            return  org.wso2.carbon.usage.beans.xsd.RequestStatistics.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://beans.usage.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "TenantDataCapacity".equals(typeName)){
                   
                            return  org.wso2.carbon.usage.beans.xsd.TenantDataCapacity.Factory.parse(reader);
                        

                  }

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    
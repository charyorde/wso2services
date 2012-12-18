
/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v3  Built on : Oct 26, 2011 (07:42:27 PDT)
 */

        
            package org.wso2.carbon.mediation.statistics.xsd;
        
            /**
            *  ExtensionMapper class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ExtensionMapper{

          public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
                                                       java.lang.String typeName,
                                                       javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{

              
                  if (
                  "http://statistics.mediation.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "InOutStatisticsRecord".equals(typeName)){
                   
                            return  org.wso2.carbon.mediation.statistics.xsd.InOutStatisticsRecord.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://statistics.mediation.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "GraphData".equals(typeName)){
                   
                            return  org.wso2.carbon.mediation.statistics.xsd.GraphData.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://aspects.synapse.apache.org/xsd".equals(namespaceURI) &&
                  "ComponentType".equals(typeName)){
                   
                            return  org.apache.synapse.aspects.xsd.ComponentType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://statistics.mediation.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "MediationStatisticsException".equals(typeName)){
                   
                            return  org.wso2.carbon.mediation.statistics.xsd.MediationStatisticsException.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://statistics.mediation.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "StatisticsRecord".equals(typeName)){
                   
                            return  org.wso2.carbon.mediation.statistics.xsd.StatisticsRecord.Factory.parse(reader);
                        

                  }

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    
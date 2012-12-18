
/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v3  Built on : Oct 26, 2011 (07:42:27 PDT)
 */

        
            package axis2.apache.org.xsd;
        
            /**
            *  ExtensionMapper class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ExtensionMapper{

          public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
                                                       java.lang.String typeName,
                                                       javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{

              
                  if (
                  "http://util.services.transport.statistics.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "ThreadViewStatistics".equals(typeName)){
                   
                            return  org.wso2.carbon.statistics.transport.services.util.xsd.ThreadViewStatistics.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://util.services.transport.statistics.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "SystemTransportStatistics".equals(typeName)){
                   
                            return  org.wso2.carbon.statistics.transport.services.util.xsd.SystemTransportStatistics.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://util.services.transport.statistics.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "TransportStatistics".equals(typeName)){
                   
                            return  org.wso2.carbon.statistics.transport.services.util.xsd.TransportStatistics.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://util.services.transport.statistics.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "LatencyViewStatistics".equals(typeName)){
                   
                            return  org.wso2.carbon.statistics.transport.services.util.xsd.LatencyViewStatistics.Factory.parse(reader);
                        

                  }

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    
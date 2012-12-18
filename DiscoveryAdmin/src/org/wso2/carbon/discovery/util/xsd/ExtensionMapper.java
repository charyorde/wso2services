
/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v3  Built on : Oct 26, 2011 (07:42:27 PDT)
 */

        
            package org.wso2.carbon.discovery.util.xsd;
        
            /**
            *  ExtensionMapper class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ExtensionMapper{

          public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
                                                       java.lang.String typeName,
                                                       javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{

              
                  if (
                  "http://util.discovery.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "DiscoveryProxyDetails".equals(typeName)){
                   
                            return  org.wso2.carbon.discovery.util.xsd.DiscoveryProxyDetails.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://org.apache.synapse/xsd".equals(namespaceURI) &&
                  "Exception".equals(typeName)){
                   
                            return  synapse.apache.org.xsd.Exception.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://util.discovery.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "TargetServiceDetails".equals(typeName)){
                   
                            return  org.wso2.carbon.discovery.util.xsd.TargetServiceDetails.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://util.discovery.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "ProbeDetails".equals(typeName)){
                   
                            return  org.wso2.carbon.discovery.util.xsd.ProbeDetails.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://util.discovery.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "ServiceDiscoveryConfig".equals(typeName)){
                   
                            return  org.wso2.carbon.discovery.util.xsd.ServiceDiscoveryConfig.Factory.parse(reader);
                        

                  }

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    
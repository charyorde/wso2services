
/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v3  Built on : Oct 26, 2011 (07:42:27 PDT)
 */

        
            package org.wso2.carbon.registry.ws.api.xsd;
        
            /**
            *  ExtensionMapper class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ExtensionMapper{

          public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
                                                       java.lang.String typeName,
                                                       javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{

              
                  if (
                  "http://io.java/xsd".equals(namespaceURI) &&
                  "IOException".equals(typeName)){
                   
                            return  java.io.xsd.IOException.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://exceptions.core.registry.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "RegistryException".equals(typeName)){
                   
                            return  org.wso2.carbon.registry.core.exceptions.xsd.RegistryException.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://api.ws.registry.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "WSLogEntry".equals(typeName)){
                   
                            return  org.wso2.carbon.registry.ws.api.xsd.WSLogEntry.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://api.ws.registry.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "WSCollection".equals(typeName)){
                   
                            return  org.wso2.carbon.registry.ws.api.xsd.WSCollection.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://api.ws.registry.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "WSComment".equals(typeName)){
                   
                            return  org.wso2.carbon.registry.ws.api.xsd.WSComment.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://api.ws.registry.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "WSProperty".equals(typeName)){
                   
                            return  org.wso2.carbon.registry.ws.api.xsd.WSProperty.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://api.ws.registry.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "WSTag".equals(typeName)){
                   
                            return  org.wso2.carbon.registry.ws.api.xsd.WSTag.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://api.ws.registry.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "WSAssociation".equals(typeName)){
                   
                            return  org.wso2.carbon.registry.ws.api.xsd.WSAssociation.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://api.ws.registry.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "WSMap".equals(typeName)){
                   
                            return  org.wso2.carbon.registry.ws.api.xsd.WSMap.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://api.ws.registry.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "WSTaggedResourcePath".equals(typeName)){
                   
                            return  org.wso2.carbon.registry.ws.api.xsd.WSTaggedResourcePath.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://api.ws.registry.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "WSResource".equals(typeName)){
                   
                            return  org.wso2.carbon.registry.ws.api.xsd.WSResource.Factory.parse(reader);
                        

                  }

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    
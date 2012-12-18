
/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v3  Built on : Oct 26, 2011 (07:42:27 PDT)
 */

        
            package org.wso2.carbon.throttle.service;
        
            /**
            *  ExtensionMapper class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ExtensionMapper{

          public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
                                                       java.lang.String typeName,
                                                       javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{

              
                  if (
                  "http://throttle.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "ThrottleComponentException".equals(typeName)){
                   
                            return  org.wso2.carbon.throttle.xsd.ThrottleComponentException.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://throttle.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "InternalData".equals(typeName)){
                   
                            return  org.wso2.carbon.throttle.xsd.InternalData.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://throttle.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "ThrottlePolicy".equals(typeName)){
                   
                            return  org.wso2.carbon.throttle.xsd.ThrottlePolicy.Factory.parse(reader);
                        

                  }

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    
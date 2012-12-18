
/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v3  Built on : Oct 26, 2011 (07:42:27 PDT)
 */

        
            package org.wso2.carbon.proxyadmin.xsd;
        
            /**
            *  ExtensionMapper class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ExtensionMapper{

          public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
                                                       java.lang.String typeName,
                                                       javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{

              
                  if (
                  "http://proxyadmin.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "ProxyAdminException".equals(typeName)){
                   
                            return  org.wso2.carbon.proxyadmin.xsd.ProxyAdminException.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://proxyadmin.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "ProxyData".equals(typeName)){
                   
                            return  org.wso2.carbon.proxyadmin.xsd.ProxyData.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://proxyadmin.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "ProxyServicePolicyInfo".equals(typeName)){
                   
                            return  org.wso2.carbon.proxyadmin.xsd.ProxyServicePolicyInfo.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://proxyadmin.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "Entry".equals(typeName)){
                   
                            return  org.wso2.carbon.proxyadmin.xsd.Entry.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://proxyadmin.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "MetaData".equals(typeName)){
                   
                            return  org.wso2.carbon.proxyadmin.xsd.MetaData.Factory.parse(reader);
                        

                  }

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    
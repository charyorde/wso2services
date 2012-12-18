
/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v3  Built on : Oct 26, 2011 (07:42:27 PDT)
 */

        
            package org.wso2.carbon.logging.service.xsd;
        
            /**
            *  ExtensionMapper class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ExtensionMapper{

          public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
                                                       java.lang.String typeName,
                                                       javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{

              
                  if (
                  "http://data.service.logging.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "AppenderData".equals(typeName)){
                   
                            return  org.wso2.carbon.logging.service.data.xsd.AppenderData.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://data.service.logging.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "SyslogData".equals(typeName)){
                   
                            return  org.wso2.carbon.logging.service.data.xsd.SyslogData.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://data.service.logging.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "LoggerData".equals(typeName)){
                   
                            return  org.wso2.carbon.logging.service.data.xsd.LoggerData.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://data.service.logging.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "LogData".equals(typeName)){
                   
                            return  org.wso2.carbon.logging.service.data.xsd.LogData.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://service.logging.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "LoggingAdminException".equals(typeName)){
                   
                            return  org.wso2.carbon.logging.service.xsd.LoggingAdminException.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://org.apache.axis2/xsd".equals(namespaceURI) &&
                  "Exception".equals(typeName)){
                   
                            return  axis2.apache.org.xsd.Exception.Factory.parse(reader);
                        

                  }

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    
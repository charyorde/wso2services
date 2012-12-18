
/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v3  Built on : Oct 26, 2011 (07:42:27 PDT)
 */

        
            package org.wso2.carbon.core.services.authentication.stats;
        
            /**
            *  ExtensionMapper class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ExtensionMapper{

          public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
                                                       java.lang.String typeName,
                                                       javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{

              
                  if (
                  "http://stats.authentication.services.core.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "LoginAttempts".equals(typeName)){
                   
                            return  org.wso2.carbon.core.services.authentication.stats.xsd.LoginAttempts.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://stats.authentication.services.core.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "UserAttempts".equals(typeName)){
                   
                            return  org.wso2.carbon.core.services.authentication.stats.xsd.UserAttempts.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://stats.authentication.services.core.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "LoginAttempt".equals(typeName)){
                   
                            return  org.wso2.carbon.core.services.authentication.stats.xsd.LoginAttempt.Factory.parse(reader);
                        

                  }

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    
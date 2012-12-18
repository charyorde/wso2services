
/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v3  Built on : Oct 26, 2011 (07:42:27 PDT)
 */

        
            package org.wso2.carbon.security.sts.service.util.xsd;
        
            /**
            *  ExtensionMapper class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ExtensionMapper{

          public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
                                                       java.lang.String typeName,
                                                       javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{

              
                  if (
                  "http://util.service.sts.security.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "TrustedServiceData".equals(typeName)){
                   
                            return  org.wso2.carbon.security.sts.service.util.xsd.TrustedServiceData.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://security.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "SecurityConfigException".equals(typeName)){
                   
                            return  org.wso2.carbon.security.xsd.SecurityConfigException.Factory.parse(reader);
                        

                  }

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    
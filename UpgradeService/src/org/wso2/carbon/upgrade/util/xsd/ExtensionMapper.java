
/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v3  Built on : Oct 26, 2011 (07:42:27 PDT)
 */

        
            package org.wso2.carbon.upgrade.util.xsd;
        
            /**
            *  ExtensionMapper class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ExtensionMapper{

          public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
                                                       java.lang.String typeName,
                                                       javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{

              
                  if (
                  "http://util.upgrade.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "PackageInfoBean".equals(typeName)){
                   
                            return  org.wso2.carbon.upgrade.util.xsd.PackageInfoBean.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://services.upgrade.carbon.wso2.org".equals(namespaceURI) &&
                  "Exception".equals(typeName)){
                   
                            return  org.wso2.carbon.upgrade.services.Exception.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://util.upgrade.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "SubscriptionInfoBean".equals(typeName)){
                   
                            return  org.wso2.carbon.upgrade.util.xsd.SubscriptionInfoBean.Factory.parse(reader);
                        

                  }

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    
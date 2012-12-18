
/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v3  Built on : Oct 26, 2011 (07:42:27 PDT)
 */

        
            package org.wso2.carbon.registry.core.exceptions.xsd;
        
            /**
            *  ExtensionMapper class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ExtensionMapper{

          public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
                                                       java.lang.String typeName,
                                                       javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{

              
                  if (
                  "http://beans.list.governance.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "PolicyBean".equals(typeName)){
                   
                            return  org.wso2.carbon.governance.list.beans.xsd.PolicyBean.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://exceptions.core.registry.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "RegistryException".equals(typeName)){
                   
                            return  org.wso2.carbon.registry.core.exceptions.xsd.RegistryException.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://beans.list.governance.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "SchemaBean".equals(typeName)){
                   
                            return  org.wso2.carbon.governance.list.beans.xsd.SchemaBean.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://beans.list.governance.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "WSDLBean".equals(typeName)){
                   
                            return  org.wso2.carbon.governance.list.beans.xsd.WSDLBean.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://beans.list.governance.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "ServiceBean".equals(typeName)){
                   
                            return  org.wso2.carbon.governance.list.beans.xsd.ServiceBean.Factory.parse(reader);
                        

                  }

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    
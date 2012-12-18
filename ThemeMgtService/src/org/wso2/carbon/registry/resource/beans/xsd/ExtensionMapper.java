
/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v3  Built on : Oct 26, 2011 (07:42:27 PDT)
 */

        
            package org.wso2.carbon.registry.resource.beans.xsd;
        
            /**
            *  ExtensionMapper class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ExtensionMapper{

          public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
                                                       java.lang.String typeName,
                                                       javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{

              
                  if (
                  "http://common.registry.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "ResourceData".equals(typeName)){
                   
                            return  org.wso2.carbon.registry.common.xsd.ResourceData.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://common.registry.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "TagCount".equals(typeName)){
                   
                            return  org.wso2.carbon.registry.common.xsd.TagCount.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://beans.resource.registry.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "ContentDownloadBean".equals(typeName)){
                   
                            return  org.wso2.carbon.registry.resource.beans.xsd.ContentDownloadBean.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://common.registry.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "WebResourcePath".equals(typeName)){
                   
                            return  org.wso2.carbon.registry.common.xsd.WebResourcePath.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://beans.resource.registry.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "ContentBean".equals(typeName)){
                   
                            return  org.wso2.carbon.registry.resource.beans.xsd.ContentBean.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://beans.resource.registry.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "MetadataBean".equals(typeName)){
                   
                            return  org.wso2.carbon.registry.resource.beans.xsd.MetadataBean.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://beans.resource.registry.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "CollectionContentBean".equals(typeName)){
                   
                            return  org.wso2.carbon.registry.resource.beans.xsd.CollectionContentBean.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://beans.resource.registry.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "ResourceTreeEntryBean".equals(typeName)){
                   
                            return  org.wso2.carbon.registry.resource.beans.xsd.ResourceTreeEntryBean.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://services.mgt.theme.carbon.wso2.org".equals(namespaceURI) &&
                  "Exception".equals(typeName)){
                   
                            return  org.wso2.carbon.theme.mgt.services.Exception.Factory.parse(reader);
                        

                  }

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    
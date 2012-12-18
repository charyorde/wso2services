
/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v3  Built on : Oct 26, 2011 (07:42:27 PDT)
 */

        
            package org.wso2.carbon.registry.common.xsd;
        
            /**
            *  ExtensionMapper class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ExtensionMapper{

          public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
                                                       java.lang.String typeName,
                                                       javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{

              
                  if (
                  "http://exceptions.core.registry.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "RegistryException".equals(typeName)){
                   
                            return  org.wso2.carbon.registry.core.exceptions.xsd.RegistryException.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://beans.search.registry.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "CustomSearchParameterBean".equals(typeName)){
                   
                            return  org.wso2.carbon.registry.search.beans.xsd.CustomSearchParameterBean.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://beans.search.registry.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "SearchResultsBean".equals(typeName)){
                   
                            return  org.wso2.carbon.registry.search.beans.xsd.SearchResultsBean.Factory.parse(reader);
                        

                  }

              
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
                  "http://beans.search.registry.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "AdvancedSearchResultsBean".equals(typeName)){
                   
                            return  org.wso2.carbon.registry.search.beans.xsd.AdvancedSearchResultsBean.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://beans.search.registry.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "MediaTypeValueList".equals(typeName)){
                   
                            return  org.wso2.carbon.registry.search.beans.xsd.MediaTypeValueList.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://beans.search.registry.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "ArrayOfString".equals(typeName)){
                   
                            return  org.wso2.carbon.registry.search.beans.xsd.ArrayOfString.Factory.parse(reader);
                        

                  }

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    
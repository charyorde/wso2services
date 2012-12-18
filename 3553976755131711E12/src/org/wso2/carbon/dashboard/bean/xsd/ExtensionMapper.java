
/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v3  Built on : Oct 26, 2011 (07:42:27 PDT)
 */

        
            package org.wso2.carbon.dashboard.bean.xsd;
        
            /**
            *  ExtensionMapper class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ExtensionMapper{

          public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
                                                       java.lang.String typeName,
                                                       javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{

              
                  if (
                  "http://bean.common.dashboard.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "Gadget".equals(typeName)){
                   
                            return  org.wso2.carbon.dashboard.common.bean.xsd.Gadget.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://bean.common.dashboard.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "Comment".equals(typeName)){
                   
                            return  org.wso2.carbon.dashboard.common.bean.xsd.Comment.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://bean.dashboard.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "DashboardContentBean".equals(typeName)){
                   
                            return  org.wso2.carbon.dashboard.bean.xsd.DashboardContentBean.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://bean.common.dashboard.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "Tab".equals(typeName)){
                   
                            return  org.wso2.carbon.dashboard.common.bean.xsd.Tab.Factory.parse(reader);
                        

                  }

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    

/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v3  Built on : Oct 26, 2011 (07:42:27 PDT)
 */

        
            package org.wso2.carbon.governance.gadgetsource.services;
        
            /**
            *  ExtensionMapper class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ExtensionMapper{

          public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
                                                       java.lang.String typeName,
                                                       javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{

              
                  if (
                  "http://beans.gadgetsource.governance.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "LifecyclePiechartGadgetBean".equals(typeName)){
                   
                            return  org.wso2.carbon.governance.gadgetsource.beans.xsd.LifecyclePiechartGadgetBean.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://exceptions.core.registry.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "RegistryException".equals(typeName)){
                   
                            return  org.wso2.carbon.registry.core.exceptions.xsd.RegistryException.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://beans.gadgetsource.governance.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "LifecycleStageInfoBean".equals(typeName)){
                   
                            return  org.wso2.carbon.governance.gadgetsource.beans.xsd.LifecycleStageInfoBean.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://beans.gadgetsource.governance.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "ServiceVersionHistogramGadgetBean".equals(typeName)){
                   
                            return  org.wso2.carbon.governance.gadgetsource.beans.xsd.ServiceVersionHistogramGadgetBean.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://beans.gadgetsource.governance.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "SchemaSharingInfoGadgetBean".equals(typeName)){
                   
                            return  org.wso2.carbon.governance.gadgetsource.beans.xsd.SchemaSharingInfoGadgetBean.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://beans.gadgetsource.governance.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "ServiceInfoGadgetBean".equals(typeName)){
                   
                            return  org.wso2.carbon.governance.gadgetsource.beans.xsd.ServiceInfoGadgetBean.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://beans.gadgetsource.governance.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "LifecycleInfoBean".equals(typeName)){
                   
                            return  org.wso2.carbon.governance.gadgetsource.beans.xsd.LifecycleInfoBean.Factory.parse(reader);
                        

                  }

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    

/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v3  Built on : Oct 26, 2011 (07:42:27 PDT)
 */

        
            package org.wso2.carbon.bam.common.dataobjects.service.xsd;
        
            /**
            *  ExtensionMapper class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ExtensionMapper{

          public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
                                                       java.lang.String typeName,
                                                       javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{

              
                  if (
                  "http://common.dataobjects.common.bam.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "MonitoredServerDTO".equals(typeName)){
                   
                            return  org.wso2.carbon.bam.common.dataobjects.common.xsd.MonitoredServerDTO.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://util.bam.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "BAMException".equals(typeName)){
                   
                            return  org.wso2.carbon.bam.util.xsd.BAMException.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://service.dataobjects.common.bam.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "ServerDO".equals(typeName)){
                   
                            return  org.wso2.carbon.bam.common.dataobjects.service.xsd.ServerDO.Factory.parse(reader);
                        

                  }

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    
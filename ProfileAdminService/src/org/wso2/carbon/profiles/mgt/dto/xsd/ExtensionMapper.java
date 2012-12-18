
/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v3  Built on : Oct 26, 2011 (07:42:27 PDT)
 */

        
            package org.wso2.carbon.profiles.mgt.dto.xsd;
        
            /**
            *  ExtensionMapper class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ExtensionMapper{

          public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
                                                       java.lang.String typeName,
                                                       javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{

              
                  if (
                  "http://dto.mgt.profiles.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "ClaimConfigurationDTO".equals(typeName)){
                   
                            return  org.wso2.carbon.profiles.mgt.dto.xsd.ClaimConfigurationDTO.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://dto.mgt.profiles.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "DialectDTO".equals(typeName)){
                   
                            return  org.wso2.carbon.profiles.mgt.dto.xsd.DialectDTO.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://dto.mgt.profiles.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "AvailableProfileConfigurationDTO".equals(typeName)){
                   
                            return  org.wso2.carbon.profiles.mgt.dto.xsd.AvailableProfileConfigurationDTO.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://dto.mgt.profiles.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "DetailedProfileConfigurationDTO".equals(typeName)){
                   
                            return  org.wso2.carbon.profiles.mgt.dto.xsd.DetailedProfileConfigurationDTO.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://mgt.profiles.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "ProfileManagementException".equals(typeName)){
                   
                            return  org.wso2.carbon.profiles.mgt.xsd.ProfileManagementException.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://dto.mgt.profiles.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "ProfileConfigurationDTO".equals(typeName)){
                   
                            return  org.wso2.carbon.profiles.mgt.dto.xsd.ProfileConfigurationDTO.Factory.parse(reader);
                        

                  }

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    

/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v3  Built on : Oct 26, 2011 (07:42:27 PDT)
 */

        
            package axis2.apache.org.xsd;
        
            /**
            *  ExtensionMapper class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ExtensionMapper{

          public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
                                                       java.lang.String typeName,
                                                       javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{

              
                  if (
                  "http://dto.provider.identity.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "OpenIDAuthRequestDTO".equals(typeName)){
                   
                            return  org.wso2.carbon.identity.provider.dto.xsd.OpenIDAuthRequestDTO.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://dto.provider.identity.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "InfoCardSignInDTO".equals(typeName)){
                   
                            return  org.wso2.carbon.identity.provider.dto.xsd.InfoCardSignInDTO.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://dto.provider.identity.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "PapeInfoResponseDTO".equals(typeName)){
                   
                            return  org.wso2.carbon.identity.provider.dto.xsd.PapeInfoResponseDTO.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://provider.identity.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "IdentityProviderException".equals(typeName)){
                   
                            return  org.wso2.carbon.identity.provider.xsd.IdentityProviderException.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://dto.provider.identity.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "OpenIDAuthResponseDTO".equals(typeName)){
                   
                            return  org.wso2.carbon.identity.provider.dto.xsd.OpenIDAuthResponseDTO.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://dto.provider.identity.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "OpenIDUserProfileDTO".equals(typeName)){
                   
                            return  org.wso2.carbon.identity.provider.dto.xsd.OpenIDUserProfileDTO.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://dto.provider.identity.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "OpenIDRememberMeDTO".equals(typeName)){
                   
                            return  org.wso2.carbon.identity.provider.dto.xsd.OpenIDRememberMeDTO.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://org.apache.axis2/xsd".equals(namespaceURI) &&
                  "Exception".equals(typeName)){
                   
                            return  axis2.apache.org.xsd.Exception.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://dto.provider.identity.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "OpenIDClaimDTO".equals(typeName)){
                   
                            return  org.wso2.carbon.identity.provider.dto.xsd.OpenIDClaimDTO.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://dto.provider.identity.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "OpenIDProviderInfoDTO".equals(typeName)){
                   
                            return  org.wso2.carbon.identity.provider.dto.xsd.OpenIDProviderInfoDTO.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://dto.provider.identity.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "InfoCardDTO".equals(typeName)){
                   
                            return  org.wso2.carbon.identity.provider.dto.xsd.InfoCardDTO.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://dto.provider.identity.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "PapeInfoRequestDTO".equals(typeName)){
                   
                            return  org.wso2.carbon.identity.provider.dto.xsd.PapeInfoRequestDTO.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://dto.provider.identity.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "OpenIDParameterDTO".equals(typeName)){
                   
                            return  org.wso2.carbon.identity.provider.dto.xsd.OpenIDParameterDTO.Factory.parse(reader);
                        

                  }

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    
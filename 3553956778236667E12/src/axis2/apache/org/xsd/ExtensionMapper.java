
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
                  "http://dto.mgt.sts.identity.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "CardIssuerTokenDTO".equals(typeName)){
                   
                            return  org.wso2.carbon.identity.sts.mgt.dto.xsd.CardIssuerTokenDTO.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://dto.mgt.sts.identity.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "CardIssuerDTO".equals(typeName)){
                   
                            return  org.wso2.carbon.identity.sts.mgt.dto.xsd.CardIssuerDTO.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://org.apache.axis2/xsd".equals(namespaceURI) &&
                  "Exception".equals(typeName)){
                   
                            return  axis2.apache.org.xsd.Exception.Factory.parse(reader);
                        

                  }

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    
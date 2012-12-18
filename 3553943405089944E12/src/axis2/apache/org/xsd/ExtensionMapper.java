
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
                  "http://localentry.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "LocalEntryAdminException".equals(typeName)){
                   
                            return  org.wso2.carbon.localentry.xsd.LocalEntryAdminException.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://dos.localentry.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "EntryData".equals(typeName)){
                   
                            return  org.wso2.carbon.localentry.dos.xsd.EntryData.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://mgt.dependency.mediation.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "ConfigurationObject".equals(typeName)){
                   
                            return  org.wso2.carbon.mediation.dependency.mgt.xsd.ConfigurationObject.Factory.parse(reader);
                        

                  }

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    
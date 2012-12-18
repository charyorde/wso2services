
/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v3  Built on : Oct 26, 2011 (07:42:27 PDT)
 */

        
            package org.wso2.ws.dataservice;
        
            /**
            *  ExtensionMapper class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ExtensionMapper{

          public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
                                                       java.lang.String typeName,
                                                       javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{

              
                  if (
                  "http://ws.wso2.org/dataservice".equals(namespaceURI) &&
                  "addServerUserData_type0".equals(typeName)){
                   
                            return  org.wso2.ws.dataservice.AddServerUserData_type0.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://ws.wso2.org/dataservice".equals(namespaceURI) &&
                  "addServerUserLoginData_type0".equals(typeName)){
                   
                            return  org.wso2.ws.dataservice.AddServerUserLoginData_type0.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://ws.wso2.org/dataservice".equals(namespaceURI) &&
                  "addMessageData_type0".equals(typeName)){
                   
                            return  org.wso2.ws.dataservice.AddMessageData_type0.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://ws.wso2.org/dataservice".equals(namespaceURI) &&
                  "addActivityData_type0".equals(typeName)){
                   
                            return  org.wso2.ws.dataservice.AddActivityData_type0.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://ws.wso2.org/dataservice".equals(namespaceURI) &&
                  "addMessageProperty_type0".equals(typeName)){
                   
                            return  org.wso2.ws.dataservice.AddMessageProperty_type0.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://ws.wso2.org/dataservice".equals(namespaceURI) &&
                  "addServerData_type0".equals(typeName)){
                   
                            return  org.wso2.ws.dataservice.AddServerData_type0.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://ws.wso2.org/dataservice".equals(namespaceURI) &&
                  "addMessageUserData_type0".equals(typeName)){
                   
                            return  org.wso2.ws.dataservice.AddMessageUserData_type0.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://ws.wso2.org/dataservice".equals(namespaceURI) &&
                  "addServiceData_type0".equals(typeName)){
                   
                            return  org.wso2.ws.dataservice.AddServiceData_type0.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://ws.wso2.org/dataservice".equals(namespaceURI) &&
                  "addOperationUserData_type0".equals(typeName)){
                   
                            return  org.wso2.ws.dataservice.AddOperationUserData_type0.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://ws.wso2.org/dataservice".equals(namespaceURI) &&
                  "addServerLoginData_type0".equals(typeName)){
                   
                            return  org.wso2.ws.dataservice.AddServerLoginData_type0.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://ws.wso2.org/dataservice".equals(namespaceURI) &&
                  "addServiceUserData_type0".equals(typeName)){
                   
                            return  org.wso2.ws.dataservice.AddServiceUserData_type0.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://ws.wso2.org/dataservice".equals(namespaceURI) &&
                  "addMessageDataDump_type0".equals(typeName)){
                   
                            return  org.wso2.ws.dataservice.AddMessageDataDump_type0.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://ws.wso2.org/dataservice".equals(namespaceURI) &&
                  "addOperationData_type0".equals(typeName)){
                   
                            return  org.wso2.ws.dataservice.AddOperationData_type0.Factory.parse(reader);
                        

                  }

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    
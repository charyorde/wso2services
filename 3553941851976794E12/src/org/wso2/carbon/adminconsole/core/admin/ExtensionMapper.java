
/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v3  Built on : Oct 26, 2011 (07:42:27 PDT)
 */

        
            package org.wso2.carbon.adminconsole.core.admin;
        
            /**
            *  ExtensionMapper class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ExtensionMapper{

          public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
                                                       java.lang.String typeName,
                                                       javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{

              
                  if (
                  "http://description.core.adminconsole.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "DatabaseInstanceEntry".equals(typeName)){
                   
                            return  org.wso2.carbon.adminconsole.core.description.xsd.DatabaseInstanceEntry.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://description.core.adminconsole.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "RSSInstanceEntry".equals(typeName)){
                   
                            return  org.wso2.carbon.adminconsole.core.description.xsd.RSSInstanceEntry.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://description.core.adminconsole.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "PrivilegeGroup".equals(typeName)){
                   
                            return  org.wso2.carbon.adminconsole.core.description.xsd.PrivilegeGroup.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://description.core.adminconsole.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "RSSInstance".equals(typeName)){
                   
                            return  org.wso2.carbon.adminconsole.core.description.xsd.RSSInstance.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://exception.core.adminconsole.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "RSSDAOException".equals(typeName)){
                   
                            return  org.wso2.carbon.adminconsole.core.exception.xsd.RSSDAOException.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://description.core.adminconsole.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "DatabaseUser".equals(typeName)){
                   
                            return  org.wso2.carbon.adminconsole.core.description.xsd.DatabaseUser.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://description.core.adminconsole.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "DatabasePrivilege".equals(typeName)){
                   
                            return  org.wso2.carbon.adminconsole.core.description.xsd.DatabasePrivilege.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://description.core.adminconsole.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "DatabaseUserEntry".equals(typeName)){
                   
                            return  org.wso2.carbon.adminconsole.core.description.xsd.DatabaseUserEntry.Factory.parse(reader);
                        

                  }

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    
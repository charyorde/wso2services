
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
                  "http://mgt.cassandra.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "NodeInformation".equals(typeName)){
                   
                            return  org.wso2.carbon.cassandra.mgt.xsd.NodeInformation.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://mgt.cassandra.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "ColumnFamilyStats".equals(typeName)){
                   
                            return  org.wso2.carbon.cassandra.mgt.xsd.ColumnFamilyStats.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://mgt.cassandra.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "CassandraServerManagementException".equals(typeName)){
                   
                            return  org.wso2.carbon.cassandra.mgt.xsd.CassandraServerManagementException.Factory.parse(reader);
                        

                  }

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    
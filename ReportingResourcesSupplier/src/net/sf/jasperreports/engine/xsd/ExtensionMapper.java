
/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v3  Built on : Oct 26, 2011 (07:42:27 PDT)
 */

        
            package net.sf.jasperreports.engine.xsd;
        
            /**
            *  ExtensionMapper class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ExtensionMapper{

          public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
                                                       java.lang.String typeName,
                                                       javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{

              
                  if (
                  "http://engine.jasperreports.sf.net/xsd".equals(namespaceURI) &&
                  "JRException".equals(typeName)){
                   
                            return  net.sf.jasperreports.engine.xsd.JRException.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://api.reporting.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "ReportingException".equals(typeName)){
                   
                            return  org.wso2.carbon.reporting.api.xsd.ReportingException.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://core.reporting.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "ReportParameters".equals(typeName)){
                   
                            return  org.wso2.carbon.reporting.core.xsd.ReportParameters.Factory.parse(reader);
                        

                  }

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    
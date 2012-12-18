
/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v3  Built on : Oct 26, 2011 (07:42:27 PDT)
 */

        
            package org.wso2.carbon.billing.mgt.services;
        
            /**
            *  ExtensionMapper class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ExtensionMapper{

          public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
                                                       java.lang.String typeName,
                                                       javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{

              
                  if (
                  "http://dataobjects.core.billing.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "Subscription".equals(typeName)){
                   
                            return  org.wso2.carbon.billing.core.dataobjects.xsd.Subscription.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://dataobjects.core.billing.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "Item".equals(typeName)){
                   
                            return  org.wso2.carbon.billing.core.dataobjects.xsd.Item.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://dataobjects.core.billing.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "Customer".equals(typeName)){
                   
                            return  org.wso2.carbon.billing.core.dataobjects.xsd.Customer.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://dataobjects.core.billing.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "Cash_Sign".equals(typeName)){
                   
                            return  org.wso2.carbon.billing.core.dataobjects.xsd.Cash_Sign.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://dataobjects.core.billing.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "Invoice".equals(typeName)){
                   
                            return  org.wso2.carbon.billing.core.dataobjects.xsd.Invoice.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://dataobjects.core.billing.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "Cash".equals(typeName)){
                   
                            return  org.wso2.carbon.billing.core.dataobjects.xsd.Cash.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://services.mgt.billing.carbon.wso2.org".equals(namespaceURI) &&
                  "Exception".equals(typeName)){
                   
                            return  org.wso2.carbon.billing.mgt.services.Exception.Factory.parse(reader);
                        

                  }

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    
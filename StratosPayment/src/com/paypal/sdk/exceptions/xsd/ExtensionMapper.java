
/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v3  Built on : Oct 26, 2011 (07:42:27 PDT)
 */

        
            package com.paypal.sdk.exceptions.xsd;
        
            /**
            *  ExtensionMapper class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ExtensionMapper{

          public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
                                                       java.lang.String typeName,
                                                       javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{

              
                  if (
                  "http://dto.paypal.payment.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "Address".equals(typeName)){
                   
                            return  org.wso2.carbon.payment.paypal.dto.xsd.Address.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://dto.paypal.payment.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "PaypalError".equals(typeName)){
                   
                            return  org.wso2.carbon.payment.paypal.dto.xsd.PaypalError.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://dto.paypal.payment.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "TransactionResponse".equals(typeName)){
                   
                            return  org.wso2.carbon.payment.paypal.dto.xsd.TransactionResponse.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://exceptions.sdk.paypal.com/xsd".equals(namespaceURI) &&
                  "PayPalException".equals(typeName)){
                   
                            return  com.paypal.sdk.exceptions.xsd.PayPalException.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://dto.paypal.payment.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "ECResponse".equals(typeName)){
                   
                            return  org.wso2.carbon.payment.paypal.dto.xsd.ECResponse.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://dto.paypal.payment.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "ECDetailResponse".equals(typeName)){
                   
                            return  org.wso2.carbon.payment.paypal.dto.xsd.ECDetailResponse.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://dto.paypal.payment.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "Payer".equals(typeName)){
                   
                            return  org.wso2.carbon.payment.paypal.dto.xsd.Payer.Factory.parse(reader);
                        

                  }

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    

/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v3  Built on : Oct 26, 2011 (07:42:27 PDT)
 */

        
            package org.wso2.carbon.billing.mgt.beans.xsd;
        
            /**
            *  ExtensionMapper class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ExtensionMapper{

          public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
                                                       java.lang.String typeName,
                                                       javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{

              
                  if (
                  "http://beans.core.billing.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "OutstandingBalanceInfoBean".equals(typeName)){
                   
                            return  org.wso2.carbon.billing.core.beans.xsd.OutstandingBalanceInfoBean.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://beans.core.billing.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "PaginatedBalanceInfoBean".equals(typeName)){
                   
                            return  org.wso2.carbon.billing.core.beans.xsd.PaginatedBalanceInfoBean.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://beans.mgt.billing.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "MultitenancyPurchaseOrder".equals(typeName)){
                   
                            return  org.wso2.carbon.billing.mgt.beans.xsd.MultitenancyPurchaseOrder.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://beans.mgt.billing.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "MultitenancyInvoice".equals(typeName)){
                   
                            return  org.wso2.carbon.billing.mgt.beans.xsd.MultitenancyInvoice.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://dataobjects.core.billing.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "Customer".equals(typeName)){
                   
                            return  org.wso2.carbon.billing.core.dataobjects.xsd.Customer.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://beans.mgt.billing.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "BilledEntry".equals(typeName)){
                   
                            return  org.wso2.carbon.billing.mgt.beans.xsd.BilledEntry.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://dataobjects.core.billing.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "Cash_Sign".equals(typeName)){
                   
                            return  org.wso2.carbon.billing.core.dataobjects.xsd.Cash_Sign.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://dataobjects.core.billing.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "Payment".equals(typeName)){
                   
                            return  org.wso2.carbon.billing.core.dataobjects.xsd.Payment.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://beans.mgt.billing.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "MultitenancySubscription".equals(typeName)){
                   
                            return  org.wso2.carbon.billing.mgt.beans.xsd.MultitenancySubscription.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://dataobjects.core.billing.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "Invoice".equals(typeName)){
                   
                            return  org.wso2.carbon.billing.core.dataobjects.xsd.Invoice.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://services.mgt.billing.carbon.wso2.org".equals(namespaceURI) &&
                  "Exception".equals(typeName)){
                   
                            return  org.wso2.carbon.billing.mgt.services.Exception.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://beans.mgt.billing.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "BillingPeriod".equals(typeName)){
                   
                            return  org.wso2.carbon.billing.mgt.beans.xsd.BillingPeriod.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://dataobjects.core.billing.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "Cash".equals(typeName)){
                   
                            return  org.wso2.carbon.billing.core.dataobjects.xsd.Cash.Factory.parse(reader);
                        

                  }

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    

/**
 * MultitenancyInvoice.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v3  Built on : Oct 26, 2011 (07:42:27 PDT)
 */

            
                package org.wso2.carbon.billing.mgt.beans.xsd;
            

            /**
            *  MultitenancyInvoice bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class MultitenancyInvoice
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = MultitenancyInvoice
                Namespace URI = http://beans.mgt.billing.carbon.wso2.org/xsd
                Namespace Prefix = ns6
                */
            

                        /**
                        * field for BillingDate
                        */

                        
                                    protected java.util.Date localBillingDate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localBillingDateTracker = false ;

                           public boolean isBillingDateSpecified(){
                               return localBillingDateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.util.Date
                           */
                           public  java.util.Date getBillingDate(){
                               return localBillingDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param BillingDate
                               */
                               public void setBillingDate(java.util.Date param){
                            localBillingDateTracker = true;
                                   
                                            this.localBillingDate=param;
                                    

                               }
                            

                        /**
                        * field for BoughtForward
                        */

                        
                                    protected java.lang.String localBoughtForward ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localBoughtForwardTracker = false ;

                           public boolean isBoughtForwardSpecified(){
                               return localBoughtForwardTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getBoughtForward(){
                               return localBoughtForward;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param BoughtForward
                               */
                               public void setBoughtForward(java.lang.String param){
                            localBoughtForwardTracker = true;
                                   
                                            this.localBoughtForward=param;
                                    

                               }
                            

                        /**
                        * field for CarriedForward
                        */

                        
                                    protected java.lang.String localCarriedForward ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCarriedForwardTracker = false ;

                           public boolean isCarriedForwardSpecified(){
                               return localCarriedForwardTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getCarriedForward(){
                               return localCarriedForward;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CarriedForward
                               */
                               public void setCarriedForward(java.lang.String param){
                            localCarriedForwardTracker = true;
                                   
                                            this.localCarriedForward=param;
                                    

                               }
                            

                        /**
                        * field for EndDate
                        */

                        
                                    protected java.util.Date localEndDate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localEndDateTracker = false ;

                           public boolean isEndDateSpecified(){
                               return localEndDateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.util.Date
                           */
                           public  java.util.Date getEndDate(){
                               return localEndDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param EndDate
                               */
                               public void setEndDate(java.util.Date param){
                            localEndDateTracker = true;
                                   
                                            this.localEndDate=param;
                                    

                               }
                            

                        /**
                        * field for InvoiceId
                        */

                        
                                    protected int localInvoiceId ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localInvoiceIdTracker = false ;

                           public boolean isInvoiceIdSpecified(){
                               return localInvoiceIdTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getInvoiceId(){
                               return localInvoiceId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param InvoiceId
                               */
                               public void setInvoiceId(int param){
                            
                                       // setting primitive attribute tracker to true
                                       localInvoiceIdTracker =
                                       param != java.lang.Integer.MIN_VALUE;
                                   
                                            this.localInvoiceId=param;
                                    

                               }
                            

                        /**
                        * field for LastInvoice
                        */

                        
                                    protected boolean localLastInvoice ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localLastInvoiceTracker = false ;

                           public boolean isLastInvoiceSpecified(){
                               return localLastInvoiceTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getLastInvoice(){
                               return localLastInvoice;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param LastInvoice
                               */
                               public void setLastInvoice(boolean param){
                            
                                       // setting primitive attribute tracker to true
                                       localLastInvoiceTracker =
                                       true;
                                   
                                            this.localLastInvoice=param;
                                    

                               }
                            

                        /**
                        * field for PurchaseOrders
                        * This was an Array!
                        */

                        
                                    protected org.wso2.carbon.billing.mgt.beans.xsd.MultitenancyPurchaseOrder[] localPurchaseOrders ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPurchaseOrdersTracker = false ;

                           public boolean isPurchaseOrdersSpecified(){
                               return localPurchaseOrdersTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return org.wso2.carbon.billing.mgt.beans.xsd.MultitenancyPurchaseOrder[]
                           */
                           public  org.wso2.carbon.billing.mgt.beans.xsd.MultitenancyPurchaseOrder[] getPurchaseOrders(){
                               return localPurchaseOrders;
                           }

                           
                        


                               
                              /**
                               * validate the array for PurchaseOrders
                               */
                              protected void validatePurchaseOrders(org.wso2.carbon.billing.mgt.beans.xsd.MultitenancyPurchaseOrder[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param PurchaseOrders
                              */
                              public void setPurchaseOrders(org.wso2.carbon.billing.mgt.beans.xsd.MultitenancyPurchaseOrder[] param){
                              
                                   validatePurchaseOrders(param);

                               localPurchaseOrdersTracker = true;
                                      
                                      this.localPurchaseOrders=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param org.wso2.carbon.billing.mgt.beans.xsd.MultitenancyPurchaseOrder
                             */
                             public void addPurchaseOrders(org.wso2.carbon.billing.mgt.beans.xsd.MultitenancyPurchaseOrder param){
                                   if (localPurchaseOrders == null){
                                   localPurchaseOrders = new org.wso2.carbon.billing.mgt.beans.xsd.MultitenancyPurchaseOrder[]{};
                                   }

                            
                                 //update the setting tracker
                                localPurchaseOrdersTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localPurchaseOrders);
                               list.add(param);
                               this.localPurchaseOrders =
                             (org.wso2.carbon.billing.mgt.beans.xsd.MultitenancyPurchaseOrder[])list.toArray(
                            new org.wso2.carbon.billing.mgt.beans.xsd.MultitenancyPurchaseOrder[list.size()]);

                             }
                             

                        /**
                        * field for StartDate
                        */

                        
                                    protected java.util.Date localStartDate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localStartDateTracker = false ;

                           public boolean isStartDateSpecified(){
                               return localStartDateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.util.Date
                           */
                           public  java.util.Date getStartDate(){
                               return localStartDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param StartDate
                               */
                               public void setStartDate(java.util.Date param){
                            localStartDateTracker = true;
                                   
                                            this.localStartDate=param;
                                    

                               }
                            

                        /**
                        * field for Subscriptions
                        * This was an Array!
                        */

                        
                                    protected org.wso2.carbon.billing.mgt.beans.xsd.MultitenancySubscription[] localSubscriptions ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSubscriptionsTracker = false ;

                           public boolean isSubscriptionsSpecified(){
                               return localSubscriptionsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return org.wso2.carbon.billing.mgt.beans.xsd.MultitenancySubscription[]
                           */
                           public  org.wso2.carbon.billing.mgt.beans.xsd.MultitenancySubscription[] getSubscriptions(){
                               return localSubscriptions;
                           }

                           
                        


                               
                              /**
                               * validate the array for Subscriptions
                               */
                              protected void validateSubscriptions(org.wso2.carbon.billing.mgt.beans.xsd.MultitenancySubscription[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param Subscriptions
                              */
                              public void setSubscriptions(org.wso2.carbon.billing.mgt.beans.xsd.MultitenancySubscription[] param){
                              
                                   validateSubscriptions(param);

                               localSubscriptionsTracker = true;
                                      
                                      this.localSubscriptions=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param org.wso2.carbon.billing.mgt.beans.xsd.MultitenancySubscription
                             */
                             public void addSubscriptions(org.wso2.carbon.billing.mgt.beans.xsd.MultitenancySubscription param){
                                   if (localSubscriptions == null){
                                   localSubscriptions = new org.wso2.carbon.billing.mgt.beans.xsd.MultitenancySubscription[]{};
                                   }

                            
                                 //update the setting tracker
                                localSubscriptionsTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localSubscriptions);
                               list.add(param);
                               this.localSubscriptions =
                             (org.wso2.carbon.billing.mgt.beans.xsd.MultitenancySubscription[])list.toArray(
                            new org.wso2.carbon.billing.mgt.beans.xsd.MultitenancySubscription[list.size()]);

                             }
                             

                        /**
                        * field for TotalCost
                        */

                        
                                    protected java.lang.String localTotalCost ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTotalCostTracker = false ;

                           public boolean isTotalCostSpecified(){
                               return localTotalCostTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getTotalCost(){
                               return localTotalCost;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TotalCost
                               */
                               public void setTotalCost(java.lang.String param){
                            localTotalCostTracker = true;
                                   
                                            this.localTotalCost=param;
                                    

                               }
                            

                        /**
                        * field for TotalPayments
                        */

                        
                                    protected java.lang.String localTotalPayments ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTotalPaymentsTracker = false ;

                           public boolean isTotalPaymentsSpecified(){
                               return localTotalPaymentsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getTotalPayments(){
                               return localTotalPayments;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TotalPayments
                               */
                               public void setTotalPayments(java.lang.String param){
                            localTotalPaymentsTracker = true;
                                   
                                            this.localTotalPayments=param;
                                    

                               }
                            

     
     
        /**
        *
        * @param parentQName
        * @param factory
        * @return org.apache.axiom.om.OMElement
        */
       public org.apache.axiom.om.OMElement getOMElement (
               final javax.xml.namespace.QName parentQName,
               final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{


        
               org.apache.axiom.om.OMDataSource dataSource =
                       new org.apache.axis2.databinding.ADBDataSource(this,parentQName);
               return factory.createOMElement(dataSource,parentQName);
            
        }

         public void serialize(final javax.xml.namespace.QName parentQName,
                                       javax.xml.stream.XMLStreamWriter xmlWriter)
                                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
                           serialize(parentQName,xmlWriter,false);
         }

         public void serialize(final javax.xml.namespace.QName parentQName,
                               javax.xml.stream.XMLStreamWriter xmlWriter,
                               boolean serializeType)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
            
                


                java.lang.String prefix = null;
                java.lang.String namespace = null;
                

                    prefix = parentQName.getPrefix();
                    namespace = parentQName.getNamespaceURI();
                    writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);
                
                  if (serializeType){
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://beans.mgt.billing.carbon.wso2.org/xsd");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":MultitenancyInvoice",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "MultitenancyInvoice",
                           xmlWriter);
                   }

               
                   }
                if (localBillingDateTracker){
                                    namespace = "http://beans.mgt.billing.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "billingDate", xmlWriter);
                             

                                          if (localBillingDate==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localBillingDate));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localBoughtForwardTracker){
                                    namespace = "http://beans.mgt.billing.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "boughtForward", xmlWriter);
                             

                                          if (localBoughtForward==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localBoughtForward);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCarriedForwardTracker){
                                    namespace = "http://beans.mgt.billing.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "carriedForward", xmlWriter);
                             

                                          if (localCarriedForward==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localCarriedForward);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localEndDateTracker){
                                    namespace = "http://beans.mgt.billing.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "endDate", xmlWriter);
                             

                                          if (localEndDate==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEndDate));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localInvoiceIdTracker){
                                    namespace = "http://beans.mgt.billing.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "invoiceId", xmlWriter);
                             
                                               if (localInvoiceId==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("invoiceId cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localInvoiceId));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localLastInvoiceTracker){
                                    namespace = "http://beans.mgt.billing.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "lastInvoice", xmlWriter);
                             
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("lastInvoice cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLastInvoice));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPurchaseOrdersTracker){
                                       if (localPurchaseOrders!=null){
                                            for (int i = 0;i < localPurchaseOrders.length;i++){
                                                if (localPurchaseOrders[i] != null){
                                                 localPurchaseOrders[i].serialize(new javax.xml.namespace.QName("http://beans.mgt.billing.carbon.wso2.org/xsd","purchaseOrders"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                            writeStartElement(null, "http://beans.mgt.billing.carbon.wso2.org/xsd", "purchaseOrders", xmlWriter);

                                                           // write the nil attribute
                                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                           xmlWriter.writeEndElement();
                                                    
                                                }

                                            }
                                     } else {
                                        
                                                writeStartElement(null, "http://beans.mgt.billing.carbon.wso2.org/xsd", "purchaseOrders", xmlWriter);

                                               // write the nil attribute
                                               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                               xmlWriter.writeEndElement();
                                        
                                    }
                                 } if (localStartDateTracker){
                                    namespace = "http://beans.mgt.billing.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "startDate", xmlWriter);
                             

                                          if (localStartDate==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localStartDate));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localSubscriptionsTracker){
                                       if (localSubscriptions!=null){
                                            for (int i = 0;i < localSubscriptions.length;i++){
                                                if (localSubscriptions[i] != null){
                                                 localSubscriptions[i].serialize(new javax.xml.namespace.QName("http://beans.mgt.billing.carbon.wso2.org/xsd","subscriptions"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                            writeStartElement(null, "http://beans.mgt.billing.carbon.wso2.org/xsd", "subscriptions", xmlWriter);

                                                           // write the nil attribute
                                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                           xmlWriter.writeEndElement();
                                                    
                                                }

                                            }
                                     } else {
                                        
                                                writeStartElement(null, "http://beans.mgt.billing.carbon.wso2.org/xsd", "subscriptions", xmlWriter);

                                               // write the nil attribute
                                               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                               xmlWriter.writeEndElement();
                                        
                                    }
                                 } if (localTotalCostTracker){
                                    namespace = "http://beans.mgt.billing.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "totalCost", xmlWriter);
                             

                                          if (localTotalCost==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localTotalCost);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localTotalPaymentsTracker){
                                    namespace = "http://beans.mgt.billing.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "totalPayments", xmlWriter);
                             

                                          if (localTotalPayments==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localTotalPayments);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             }
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://beans.mgt.billing.carbon.wso2.org/xsd")){
                return "ns6";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }
        
        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                                    java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace,attName,attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                                    java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName,attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace,attName,attValue);
            }
        }


           /**
             * Util method to write an attribute without the ns prefix
             */
            private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                             javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

                java.lang.String attributeNamespace = qname.getNamespaceURI();
                java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
                if (attributePrefix == null) {
                    attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
                }
                java.lang.String attributeValue;
                if (attributePrefix.trim().length() > 0) {
                    attributeValue = attributePrefix + ":" + qname.getLocalPart();
                } else {
                    attributeValue = qname.getLocalPart();
                }

                if (namespace.equals("")) {
                    xmlWriter.writeAttribute(attName, attributeValue);
                } else {
                    registerPrefix(xmlWriter, namespace);
                    xmlWriter.writeAttribute(namespace, attName, attributeValue);
                }
            }
        /**
         *  method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }

                if (prefix.trim().length() > 0){
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix,namespaceURI);
                        }

                        if (prefix.trim().length() > 0){
                            stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                while (xmlWriter.getNamespaceContext().getNamespaceURI(prefix) != null) {
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }


  
        /**
        * databinding method to get an XML representation of this object
        *
        */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                    throws org.apache.axis2.databinding.ADBException{


        
                 java.util.ArrayList elementList = new java.util.ArrayList();
                 java.util.ArrayList attribList = new java.util.ArrayList();

                 if (localBillingDateTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://beans.mgt.billing.carbon.wso2.org/xsd",
                                                                      "billingDate"));
                                 
                                         elementList.add(localBillingDate==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localBillingDate));
                                    } if (localBoughtForwardTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://beans.mgt.billing.carbon.wso2.org/xsd",
                                                                      "boughtForward"));
                                 
                                         elementList.add(localBoughtForward==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localBoughtForward));
                                    } if (localCarriedForwardTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://beans.mgt.billing.carbon.wso2.org/xsd",
                                                                      "carriedForward"));
                                 
                                         elementList.add(localCarriedForward==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCarriedForward));
                                    } if (localEndDateTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://beans.mgt.billing.carbon.wso2.org/xsd",
                                                                      "endDate"));
                                 
                                         elementList.add(localEndDate==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEndDate));
                                    } if (localInvoiceIdTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://beans.mgt.billing.carbon.wso2.org/xsd",
                                                                      "invoiceId"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localInvoiceId));
                            } if (localLastInvoiceTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://beans.mgt.billing.carbon.wso2.org/xsd",
                                                                      "lastInvoice"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLastInvoice));
                            } if (localPurchaseOrdersTracker){
                             if (localPurchaseOrders!=null) {
                                 for (int i = 0;i < localPurchaseOrders.length;i++){

                                    if (localPurchaseOrders[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://beans.mgt.billing.carbon.wso2.org/xsd",
                                                                          "purchaseOrders"));
                                         elementList.add(localPurchaseOrders[i]);
                                    } else {
                                        
                                                elementList.add(new javax.xml.namespace.QName("http://beans.mgt.billing.carbon.wso2.org/xsd",
                                                                          "purchaseOrders"));
                                                elementList.add(null);
                                            
                                    }

                                 }
                             } else {
                                 
                                        elementList.add(new javax.xml.namespace.QName("http://beans.mgt.billing.carbon.wso2.org/xsd",
                                                                          "purchaseOrders"));
                                        elementList.add(localPurchaseOrders);
                                    
                             }

                        } if (localStartDateTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://beans.mgt.billing.carbon.wso2.org/xsd",
                                                                      "startDate"));
                                 
                                         elementList.add(localStartDate==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localStartDate));
                                    } if (localSubscriptionsTracker){
                             if (localSubscriptions!=null) {
                                 for (int i = 0;i < localSubscriptions.length;i++){

                                    if (localSubscriptions[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://beans.mgt.billing.carbon.wso2.org/xsd",
                                                                          "subscriptions"));
                                         elementList.add(localSubscriptions[i]);
                                    } else {
                                        
                                                elementList.add(new javax.xml.namespace.QName("http://beans.mgt.billing.carbon.wso2.org/xsd",
                                                                          "subscriptions"));
                                                elementList.add(null);
                                            
                                    }

                                 }
                             } else {
                                 
                                        elementList.add(new javax.xml.namespace.QName("http://beans.mgt.billing.carbon.wso2.org/xsd",
                                                                          "subscriptions"));
                                        elementList.add(localSubscriptions);
                                    
                             }

                        } if (localTotalCostTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://beans.mgt.billing.carbon.wso2.org/xsd",
                                                                      "totalCost"));
                                 
                                         elementList.add(localTotalCost==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTotalCost));
                                    } if (localTotalPaymentsTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://beans.mgt.billing.carbon.wso2.org/xsd",
                                                                      "totalPayments"));
                                 
                                         elementList.add(localTotalPayments==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTotalPayments));
                                    }

                return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
            
            

        }

  

     /**
      *  Factory class that keeps the parse method
      */
    public static class Factory{

        
        

        /**
        * static method to create the object
        * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
        *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
        * Postcondition: If this object is an element, the reader is positioned at its end element
        *                If this object is a complex type, the reader is positioned at the end element of its outer element
        */
        public static MultitenancyInvoice parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            MultitenancyInvoice object =
                new MultitenancyInvoice();

            int event;
            java.lang.String nillableValue = null;
            java.lang.String prefix ="";
            java.lang.String namespaceuri ="";
            try {
                
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                
                if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
                  java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                        "type");
                  if (fullTypeName!=null){
                    java.lang.String nsPrefix = null;
                    if (fullTypeName.indexOf(":") > -1){
                        nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
                    }
                    nsPrefix = nsPrefix==null?"":nsPrefix;

                    java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
                    
                            if (!"MultitenancyInvoice".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (MultitenancyInvoice)org.wso2.carbon.billing.mgt.beans.xsd.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                        java.util.ArrayList list7 = new java.util.ArrayList();
                    
                        java.util.ArrayList list9 = new java.util.ArrayList();
                    
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://beans.mgt.billing.carbon.wso2.org/xsd","billingDate").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setBillingDate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDate(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://beans.mgt.billing.carbon.wso2.org/xsd","boughtForward").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setBoughtForward(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://beans.mgt.billing.carbon.wso2.org/xsd","carriedForward").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCarriedForward(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://beans.mgt.billing.carbon.wso2.org/xsd","endDate").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setEndDate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDate(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://beans.mgt.billing.carbon.wso2.org/xsd","invoiceId").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"invoiceId" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setInvoiceId(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setInvoiceId(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://beans.mgt.billing.carbon.wso2.org/xsd","lastInvoice").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"lastInvoice" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setLastInvoice(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://beans.mgt.billing.carbon.wso2.org/xsd","purchaseOrders").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list7.add(null);
                                                              reader.next();
                                                          } else {
                                                        list7.add(org.wso2.carbon.billing.mgt.beans.xsd.MultitenancyPurchaseOrder.Factory.parse(reader));
                                                                }
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone7 = false;
                                                        while(!loopDone7){
                                                            // We should be at the end element, but make sure
                                                            while (!reader.isEndElement())
                                                                reader.next();
                                                            // Step out of this element
                                                            reader.next();
                                                            // Step to next element event.
                                                            while (!reader.isStartElement() && !reader.isEndElement())
                                                                reader.next();
                                                            if (reader.isEndElement()){
                                                                //two continuous end elements means we are exiting the xml structure
                                                                loopDone7 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://beans.mgt.billing.carbon.wso2.org/xsd","purchaseOrders").equals(reader.getName())){
                                                                    
                                                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                                          list7.add(null);
                                                                          reader.next();
                                                                      } else {
                                                                    list7.add(org.wso2.carbon.billing.mgt.beans.xsd.MultitenancyPurchaseOrder.Factory.parse(reader));
                                                                        }
                                                                }else{
                                                                    loopDone7 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setPurchaseOrders((org.wso2.carbon.billing.mgt.beans.xsd.MultitenancyPurchaseOrder[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                org.wso2.carbon.billing.mgt.beans.xsd.MultitenancyPurchaseOrder.class,
                                                                list7));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://beans.mgt.billing.carbon.wso2.org/xsd","startDate").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setStartDate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDate(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://beans.mgt.billing.carbon.wso2.org/xsd","subscriptions").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list9.add(null);
                                                              reader.next();
                                                          } else {
                                                        list9.add(org.wso2.carbon.billing.mgt.beans.xsd.MultitenancySubscription.Factory.parse(reader));
                                                                }
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone9 = false;
                                                        while(!loopDone9){
                                                            // We should be at the end element, but make sure
                                                            while (!reader.isEndElement())
                                                                reader.next();
                                                            // Step out of this element
                                                            reader.next();
                                                            // Step to next element event.
                                                            while (!reader.isStartElement() && !reader.isEndElement())
                                                                reader.next();
                                                            if (reader.isEndElement()){
                                                                //two continuous end elements means we are exiting the xml structure
                                                                loopDone9 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://beans.mgt.billing.carbon.wso2.org/xsd","subscriptions").equals(reader.getName())){
                                                                    
                                                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                                          list9.add(null);
                                                                          reader.next();
                                                                      } else {
                                                                    list9.add(org.wso2.carbon.billing.mgt.beans.xsd.MultitenancySubscription.Factory.parse(reader));
                                                                        }
                                                                }else{
                                                                    loopDone9 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setSubscriptions((org.wso2.carbon.billing.mgt.beans.xsd.MultitenancySubscription[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                org.wso2.carbon.billing.mgt.beans.xsd.MultitenancySubscription.class,
                                                                list9));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://beans.mgt.billing.carbon.wso2.org/xsd","totalCost").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTotalCost(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://beans.mgt.billing.carbon.wso2.org/xsd","totalPayments").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTotalPayments(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                  
                            while (!reader.isStartElement() && !reader.isEndElement())
                                reader.next();
                            
                                if (reader.isStartElement())
                                // A start element we are not expecting indicates a trailing invalid property
                                throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                            



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
    
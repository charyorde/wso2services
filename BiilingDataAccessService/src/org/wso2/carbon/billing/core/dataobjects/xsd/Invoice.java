
/**
 * Invoice.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v3  Built on : Oct 26, 2011 (07:42:27 PDT)
 */

            
                package org.wso2.carbon.billing.core.dataobjects.xsd;
            

            /**
            *  Invoice bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class Invoice
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = Invoice
                Namespace URI = http://dataobjects.core.billing.carbon.wso2.org/xsd
                Namespace Prefix = ns3
                */
            

                        /**
                        * field for BoughtForward
                        */

                        
                                    protected org.wso2.carbon.billing.core.dataobjects.xsd.Cash localBoughtForward ;
                                
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
                           * @return org.wso2.carbon.billing.core.dataobjects.xsd.Cash
                           */
                           public  org.wso2.carbon.billing.core.dataobjects.xsd.Cash getBoughtForward(){
                               return localBoughtForward;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param BoughtForward
                               */
                               public void setBoughtForward(org.wso2.carbon.billing.core.dataobjects.xsd.Cash param){
                            localBoughtForwardTracker = true;
                                   
                                            this.localBoughtForward=param;
                                    

                               }
                            

                        /**
                        * field for CarriedForward
                        */

                        
                                    protected org.wso2.carbon.billing.core.dataobjects.xsd.Cash localCarriedForward ;
                                
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
                           * @return org.wso2.carbon.billing.core.dataobjects.xsd.Cash
                           */
                           public  org.wso2.carbon.billing.core.dataobjects.xsd.Cash getCarriedForward(){
                               return localCarriedForward;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CarriedForward
                               */
                               public void setCarriedForward(org.wso2.carbon.billing.core.dataobjects.xsd.Cash param){
                            localCarriedForwardTracker = true;
                                   
                                            this.localCarriedForward=param;
                                    

                               }
                            

                        /**
                        * field for Customer
                        */

                        
                                    protected org.wso2.carbon.billing.core.dataobjects.xsd.Customer localCustomer ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCustomerTracker = false ;

                           public boolean isCustomerSpecified(){
                               return localCustomerTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return org.wso2.carbon.billing.core.dataobjects.xsd.Customer
                           */
                           public  org.wso2.carbon.billing.core.dataobjects.xsd.Customer getCustomer(){
                               return localCustomer;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Customer
                               */
                               public void setCustomer(org.wso2.carbon.billing.core.dataobjects.xsd.Customer param){
                            localCustomerTracker = true;
                                   
                                            this.localCustomer=param;
                                    

                               }
                            

                        /**
                        * field for Date
                        */

                        
                                    protected java.util.Date localDate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDateTracker = false ;

                           public boolean isDateSpecified(){
                               return localDateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.util.Date
                           */
                           public  java.util.Date getDate(){
                               return localDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Date
                               */
                               public void setDate(java.util.Date param){
                            localDateTracker = true;
                                   
                                            this.localDate=param;
                                    

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
                        * field for Id
                        */

                        
                                    protected int localId ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localIdTracker = false ;

                           public boolean isIdSpecified(){
                               return localIdTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getId(){
                               return localId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Id
                               */
                               public void setId(int param){
                            
                                       // setting primitive attribute tracker to true
                                       localIdTracker =
                                       param != java.lang.Integer.MIN_VALUE;
                                   
                                            this.localId=param;
                                    

                               }
                            

                        /**
                        * field for Payments
                        */

                        
                                    protected java.lang.Object localPayments ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPaymentsTracker = false ;

                           public boolean isPaymentsSpecified(){
                               return localPaymentsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.Object
                           */
                           public  java.lang.Object getPayments(){
                               return localPayments;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Payments
                               */
                               public void setPayments(java.lang.Object param){
                            localPaymentsTracker = true;
                                   
                                            this.localPayments=param;
                                    

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
                        */

                        
                                    protected java.lang.Object localSubscriptions ;
                                
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
                           * @return java.lang.Object
                           */
                           public  java.lang.Object getSubscriptions(){
                               return localSubscriptions;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Subscriptions
                               */
                               public void setSubscriptions(java.lang.Object param){
                            localSubscriptionsTracker = true;
                                   
                                            this.localSubscriptions=param;
                                    

                               }
                            

                        /**
                        * field for TotalCost
                        */

                        
                                    protected org.wso2.carbon.billing.core.dataobjects.xsd.Cash localTotalCost ;
                                
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
                           * @return org.wso2.carbon.billing.core.dataobjects.xsd.Cash
                           */
                           public  org.wso2.carbon.billing.core.dataobjects.xsd.Cash getTotalCost(){
                               return localTotalCost;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TotalCost
                               */
                               public void setTotalCost(org.wso2.carbon.billing.core.dataobjects.xsd.Cash param){
                            localTotalCostTracker = true;
                                   
                                            this.localTotalCost=param;
                                    

                               }
                            

                        /**
                        * field for TotalPayment
                        */

                        
                                    protected org.wso2.carbon.billing.core.dataobjects.xsd.Cash localTotalPayment ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTotalPaymentTracker = false ;

                           public boolean isTotalPaymentSpecified(){
                               return localTotalPaymentTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return org.wso2.carbon.billing.core.dataobjects.xsd.Cash
                           */
                           public  org.wso2.carbon.billing.core.dataobjects.xsd.Cash getTotalPayment(){
                               return localTotalPayment;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TotalPayment
                               */
                               public void setTotalPayment(org.wso2.carbon.billing.core.dataobjects.xsd.Cash param){
                            localTotalPaymentTracker = true;
                                   
                                            this.localTotalPayment=param;
                                    

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
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://dataobjects.core.billing.carbon.wso2.org/xsd");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":Invoice",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "Invoice",
                           xmlWriter);
                   }

               
                   }
                if (localBoughtForwardTracker){
                                    if (localBoughtForward==null){

                                        writeStartElement(null, "http://dataobjects.core.billing.carbon.wso2.org/xsd", "boughtForward", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localBoughtForward.serialize(new javax.xml.namespace.QName("http://dataobjects.core.billing.carbon.wso2.org/xsd","boughtForward"),
                                        xmlWriter);
                                    }
                                } if (localCarriedForwardTracker){
                                    if (localCarriedForward==null){

                                        writeStartElement(null, "http://dataobjects.core.billing.carbon.wso2.org/xsd", "carriedForward", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localCarriedForward.serialize(new javax.xml.namespace.QName("http://dataobjects.core.billing.carbon.wso2.org/xsd","carriedForward"),
                                        xmlWriter);
                                    }
                                } if (localCustomerTracker){
                                    if (localCustomer==null){

                                        writeStartElement(null, "http://dataobjects.core.billing.carbon.wso2.org/xsd", "customer", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localCustomer.serialize(new javax.xml.namespace.QName("http://dataobjects.core.billing.carbon.wso2.org/xsd","customer"),
                                        xmlWriter);
                                    }
                                } if (localDateTracker){
                                    namespace = "http://dataobjects.core.billing.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "date", xmlWriter);
                             

                                          if (localDate==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDate));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localEndDateTracker){
                                    namespace = "http://dataobjects.core.billing.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "endDate", xmlWriter);
                             

                                          if (localEndDate==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEndDate));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localIdTracker){
                                    namespace = "http://dataobjects.core.billing.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "id", xmlWriter);
                             
                                               if (localId==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("id cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localId));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPaymentsTracker){
                            
                            if (localPayments!=null){
                                if (localPayments instanceof org.apache.axis2.databinding.ADBBean){
                                    ((org.apache.axis2.databinding.ADBBean)localPayments).serialize(
                                               new javax.xml.namespace.QName("http://dataobjects.core.billing.carbon.wso2.org/xsd","payments"),
                                               xmlWriter,true);
                                 } else {
                                    writeStartElement(null, "http://dataobjects.core.billing.carbon.wso2.org/xsd", "payments", xmlWriter);
                                    org.apache.axis2.databinding.utils.ConverterUtil.serializeAnyType(localPayments, xmlWriter);
                                    xmlWriter.writeEndElement();
                                 }
                            } else {
                                
                                        // write null attribute
                                           writeStartElement(null, "http://dataobjects.core.billing.carbon.wso2.org/xsd", "payments", xmlWriter);

                                           // write the nil attribute
                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                           xmlWriter.writeEndElement();
                                    
                            }


                        } if (localStartDateTracker){
                                    namespace = "http://dataobjects.core.billing.carbon.wso2.org/xsd";
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
                                if (localSubscriptions instanceof org.apache.axis2.databinding.ADBBean){
                                    ((org.apache.axis2.databinding.ADBBean)localSubscriptions).serialize(
                                               new javax.xml.namespace.QName("http://dataobjects.core.billing.carbon.wso2.org/xsd","subscriptions"),
                                               xmlWriter,true);
                                 } else {
                                    writeStartElement(null, "http://dataobjects.core.billing.carbon.wso2.org/xsd", "subscriptions", xmlWriter);
                                    org.apache.axis2.databinding.utils.ConverterUtil.serializeAnyType(localSubscriptions, xmlWriter);
                                    xmlWriter.writeEndElement();
                                 }
                            } else {
                                
                                        // write null attribute
                                           writeStartElement(null, "http://dataobjects.core.billing.carbon.wso2.org/xsd", "subscriptions", xmlWriter);

                                           // write the nil attribute
                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                           xmlWriter.writeEndElement();
                                    
                            }


                        } if (localTotalCostTracker){
                                    if (localTotalCost==null){

                                        writeStartElement(null, "http://dataobjects.core.billing.carbon.wso2.org/xsd", "totalCost", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localTotalCost.serialize(new javax.xml.namespace.QName("http://dataobjects.core.billing.carbon.wso2.org/xsd","totalCost"),
                                        xmlWriter);
                                    }
                                } if (localTotalPaymentTracker){
                                    if (localTotalPayment==null){

                                        writeStartElement(null, "http://dataobjects.core.billing.carbon.wso2.org/xsd", "totalPayment", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localTotalPayment.serialize(new javax.xml.namespace.QName("http://dataobjects.core.billing.carbon.wso2.org/xsd","totalPayment"),
                                        xmlWriter);
                                    }
                                }
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://dataobjects.core.billing.carbon.wso2.org/xsd")){
                return "ns3";
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

                 if (localBoughtForwardTracker){
                            elementList.add(new javax.xml.namespace.QName("http://dataobjects.core.billing.carbon.wso2.org/xsd",
                                                                      "boughtForward"));
                            
                            
                                    elementList.add(localBoughtForward==null?null:
                                    localBoughtForward);
                                } if (localCarriedForwardTracker){
                            elementList.add(new javax.xml.namespace.QName("http://dataobjects.core.billing.carbon.wso2.org/xsd",
                                                                      "carriedForward"));
                            
                            
                                    elementList.add(localCarriedForward==null?null:
                                    localCarriedForward);
                                } if (localCustomerTracker){
                            elementList.add(new javax.xml.namespace.QName("http://dataobjects.core.billing.carbon.wso2.org/xsd",
                                                                      "customer"));
                            
                            
                                    elementList.add(localCustomer==null?null:
                                    localCustomer);
                                } if (localDateTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://dataobjects.core.billing.carbon.wso2.org/xsd",
                                                                      "date"));
                                 
                                         elementList.add(localDate==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDate));
                                    } if (localEndDateTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://dataobjects.core.billing.carbon.wso2.org/xsd",
                                                                      "endDate"));
                                 
                                         elementList.add(localEndDate==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEndDate));
                                    } if (localIdTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://dataobjects.core.billing.carbon.wso2.org/xsd",
                                                                      "id"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localId));
                            } if (localPaymentsTracker){
                            elementList.add(new javax.xml.namespace.QName("http://dataobjects.core.billing.carbon.wso2.org/xsd",
                                                                      "payments"));
                            
                            
                                    elementList.add(localPayments==null?null:
                                    localPayments);
                                } if (localStartDateTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://dataobjects.core.billing.carbon.wso2.org/xsd",
                                                                      "startDate"));
                                 
                                         elementList.add(localStartDate==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localStartDate));
                                    } if (localSubscriptionsTracker){
                            elementList.add(new javax.xml.namespace.QName("http://dataobjects.core.billing.carbon.wso2.org/xsd",
                                                                      "subscriptions"));
                            
                            
                                    elementList.add(localSubscriptions==null?null:
                                    localSubscriptions);
                                } if (localTotalCostTracker){
                            elementList.add(new javax.xml.namespace.QName("http://dataobjects.core.billing.carbon.wso2.org/xsd",
                                                                      "totalCost"));
                            
                            
                                    elementList.add(localTotalCost==null?null:
                                    localTotalCost);
                                } if (localTotalPaymentTracker){
                            elementList.add(new javax.xml.namespace.QName("http://dataobjects.core.billing.carbon.wso2.org/xsd",
                                                                      "totalPayment"));
                            
                            
                                    elementList.add(localTotalPayment==null?null:
                                    localTotalPayment);
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
        public static Invoice parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            Invoice object =
                new Invoice();

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
                    
                            if (!"Invoice".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (Invoice)org.wso2.carbon.billing.mgt.services.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://dataobjects.core.billing.carbon.wso2.org/xsd","boughtForward").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setBoughtForward(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setBoughtForward(org.wso2.carbon.billing.core.dataobjects.xsd.Cash.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://dataobjects.core.billing.carbon.wso2.org/xsd","carriedForward").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setCarriedForward(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setCarriedForward(org.wso2.carbon.billing.core.dataobjects.xsd.Cash.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://dataobjects.core.billing.carbon.wso2.org/xsd","customer").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setCustomer(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setCustomer(org.wso2.carbon.billing.core.dataobjects.xsd.Customer.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://dataobjects.core.billing.carbon.wso2.org/xsd","date").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setDate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDate(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://dataobjects.core.billing.carbon.wso2.org/xsd","endDate").equals(reader.getName())){
                                
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://dataobjects.core.billing.carbon.wso2.org/xsd","id").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"id" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setId(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setId(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://dataobjects.core.billing.carbon.wso2.org/xsd","payments").equals(reader.getName())){
                                
                                     object.setPayments(org.apache.axis2.databinding.utils.ConverterUtil.getAnyTypeObject(reader,
                                                org.wso2.carbon.billing.mgt.services.ExtensionMapper.class));
                                       
                                         reader.next();
                                     
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://dataobjects.core.billing.carbon.wso2.org/xsd","startDate").equals(reader.getName())){
                                
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://dataobjects.core.billing.carbon.wso2.org/xsd","subscriptions").equals(reader.getName())){
                                
                                     object.setSubscriptions(org.apache.axis2.databinding.utils.ConverterUtil.getAnyTypeObject(reader,
                                                org.wso2.carbon.billing.mgt.services.ExtensionMapper.class));
                                       
                                         reader.next();
                                     
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://dataobjects.core.billing.carbon.wso2.org/xsd","totalCost").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setTotalCost(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setTotalCost(org.wso2.carbon.billing.core.dataobjects.xsd.Cash.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://dataobjects.core.billing.carbon.wso2.org/xsd","totalPayment").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setTotalPayment(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setTotalPayment(org.wso2.carbon.billing.core.dataobjects.xsd.Cash.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
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
           
    
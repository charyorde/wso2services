
/**
 * Gadget.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v3  Built on : Oct 26, 2011 (07:42:27 PDT)
 */

            
                package org.wso2.carbon.dashboard.common.bean.xsd;
            

            /**
            *  Gadget bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class Gadget
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = Gadget
                Namespace URI = http://bean.common.dashboard.carbon.wso2.org/xsd
                Namespace Prefix = ns126
                */
            

                        /**
                        * field for Comments
                        * This was an Array!
                        */

                        
                                    protected org.wso2.carbon.dashboard.common.bean.xsd.Comment[] localComments ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCommentsTracker = false ;

                           public boolean isCommentsSpecified(){
                               return localCommentsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return org.wso2.carbon.dashboard.common.bean.xsd.Comment[]
                           */
                           public  org.wso2.carbon.dashboard.common.bean.xsd.Comment[] getComments(){
                               return localComments;
                           }

                           
                        


                               
                              /**
                               * validate the array for Comments
                               */
                              protected void validateComments(org.wso2.carbon.dashboard.common.bean.xsd.Comment[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param Comments
                              */
                              public void setComments(org.wso2.carbon.dashboard.common.bean.xsd.Comment[] param){
                              
                                   validateComments(param);

                               localCommentsTracker = true;
                                      
                                      this.localComments=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param org.wso2.carbon.dashboard.common.bean.xsd.Comment
                             */
                             public void addComments(org.wso2.carbon.dashboard.common.bean.xsd.Comment param){
                                   if (localComments == null){
                                   localComments = new org.wso2.carbon.dashboard.common.bean.xsd.Comment[]{};
                                   }

                            
                                 //update the setting tracker
                                localCommentsTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localComments);
                               list.add(param);
                               this.localComments =
                             (org.wso2.carbon.dashboard.common.bean.xsd.Comment[])list.toArray(
                            new org.wso2.carbon.dashboard.common.bean.xsd.Comment[list.size()]);

                             }
                             

                        /**
                        * field for DefaultGadget
                        */

                        
                                    protected java.lang.String localDefaultGadget ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDefaultGadgetTracker = false ;

                           public boolean isDefaultGadgetSpecified(){
                               return localDefaultGadgetTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getDefaultGadget(){
                               return localDefaultGadget;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param DefaultGadget
                               */
                               public void setDefaultGadget(java.lang.String param){
                            localDefaultGadgetTracker = true;
                                   
                                            this.localDefaultGadget=param;
                                    

                               }
                            

                        /**
                        * field for GadgetDesc
                        */

                        
                                    protected java.lang.String localGadgetDesc ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGadgetDescTracker = false ;

                           public boolean isGadgetDescSpecified(){
                               return localGadgetDescTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getGadgetDesc(){
                               return localGadgetDesc;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GadgetDesc
                               */
                               public void setGadgetDesc(java.lang.String param){
                            localGadgetDescTracker = true;
                                   
                                            this.localGadgetDesc=param;
                                    

                               }
                            

                        /**
                        * field for GadgetId
                        */

                        
                                    protected java.lang.String localGadgetId ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGadgetIdTracker = false ;

                           public boolean isGadgetIdSpecified(){
                               return localGadgetIdTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getGadgetId(){
                               return localGadgetId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GadgetId
                               */
                               public void setGadgetId(java.lang.String param){
                            localGadgetIdTracker = true;
                                   
                                            this.localGadgetId=param;
                                    

                               }
                            

                        /**
                        * field for GadgetName
                        */

                        
                                    protected java.lang.String localGadgetName ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGadgetNameTracker = false ;

                           public boolean isGadgetNameSpecified(){
                               return localGadgetNameTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getGadgetName(){
                               return localGadgetName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GadgetName
                               */
                               public void setGadgetName(java.lang.String param){
                            localGadgetNameTracker = true;
                                   
                                            this.localGadgetName=param;
                                    

                               }
                            

                        /**
                        * field for GadgetPath
                        */

                        
                                    protected java.lang.String localGadgetPath ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGadgetPathTracker = false ;

                           public boolean isGadgetPathSpecified(){
                               return localGadgetPathTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getGadgetPath(){
                               return localGadgetPath;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GadgetPath
                               */
                               public void setGadgetPath(java.lang.String param){
                            localGadgetPathTracker = true;
                                   
                                            this.localGadgetPath=param;
                                    

                               }
                            

                        /**
                        * field for GadgetPrefs
                        */

                        
                                    protected java.lang.String localGadgetPrefs ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGadgetPrefsTracker = false ;

                           public boolean isGadgetPrefsSpecified(){
                               return localGadgetPrefsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getGadgetPrefs(){
                               return localGadgetPrefs;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GadgetPrefs
                               */
                               public void setGadgetPrefs(java.lang.String param){
                            localGadgetPrefsTracker = true;
                                   
                                            this.localGadgetPrefs=param;
                                    

                               }
                            

                        /**
                        * field for GadgetScreenBase64
                        */

                        
                                    protected java.lang.String localGadgetScreenBase64 ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGadgetScreenBase64Tracker = false ;

                           public boolean isGadgetScreenBase64Specified(){
                               return localGadgetScreenBase64Tracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getGadgetScreenBase64(){
                               return localGadgetScreenBase64;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GadgetScreenBase64
                               */
                               public void setGadgetScreenBase64(java.lang.String param){
                            localGadgetScreenBase64Tracker = true;
                                   
                                            this.localGadgetScreenBase64=param;
                                    

                               }
                            

                        /**
                        * field for GadgetUrl
                        */

                        
                                    protected java.lang.String localGadgetUrl ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGadgetUrlTracker = false ;

                           public boolean isGadgetUrlSpecified(){
                               return localGadgetUrlTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getGadgetUrl(){
                               return localGadgetUrl;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GadgetUrl
                               */
                               public void setGadgetUrl(java.lang.String param){
                            localGadgetUrlTracker = true;
                                   
                                            this.localGadgetUrl=param;
                                    

                               }
                            

                        /**
                        * field for Rating
                        */

                        
                                    protected float localRating ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRatingTracker = false ;

                           public boolean isRatingSpecified(){
                               return localRatingTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return float
                           */
                           public  float getRating(){
                               return localRating;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Rating
                               */
                               public void setRating(float param){
                            localRatingTracker = true;
                                   
                                            this.localRating=param;
                                    

                               }
                            

                        /**
                        * field for ThumbUrl
                        */

                        
                                    protected java.lang.String localThumbUrl ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localThumbUrlTracker = false ;

                           public boolean isThumbUrlSpecified(){
                               return localThumbUrlTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getThumbUrl(){
                               return localThumbUrl;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ThumbUrl
                               */
                               public void setThumbUrl(java.lang.String param){
                            localThumbUrlTracker = true;
                                   
                                            this.localThumbUrl=param;
                                    

                               }
                            

                        /**
                        * field for UnsignedUserGadget
                        */

                        
                                    protected java.lang.String localUnsignedUserGadget ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localUnsignedUserGadgetTracker = false ;

                           public boolean isUnsignedUserGadgetSpecified(){
                               return localUnsignedUserGadgetTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getUnsignedUserGadget(){
                               return localUnsignedUserGadget;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param UnsignedUserGadget
                               */
                               public void setUnsignedUserGadget(java.lang.String param){
                            localUnsignedUserGadgetTracker = true;
                                   
                                            this.localUnsignedUserGadget=param;
                                    

                               }
                            

                        /**
                        * field for UserCount
                        */

                        
                                    protected java.lang.String localUserCount ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localUserCountTracker = false ;

                           public boolean isUserCountSpecified(){
                               return localUserCountTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getUserCount(){
                               return localUserCount;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param UserCount
                               */
                               public void setUserCount(java.lang.String param){
                            localUserCountTracker = true;
                                   
                                            this.localUserCount=param;
                                    

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
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://bean.common.dashboard.carbon.wso2.org/xsd");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":Gadget",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "Gadget",
                           xmlWriter);
                   }

               
                   }
                if (localCommentsTracker){
                                       if (localComments!=null){
                                            for (int i = 0;i < localComments.length;i++){
                                                if (localComments[i] != null){
                                                 localComments[i].serialize(new javax.xml.namespace.QName("http://bean.common.dashboard.carbon.wso2.org/xsd","comments"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                            writeStartElement(null, "http://bean.common.dashboard.carbon.wso2.org/xsd", "comments", xmlWriter);

                                                           // write the nil attribute
                                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                           xmlWriter.writeEndElement();
                                                    
                                                }

                                            }
                                     } else {
                                        
                                                writeStartElement(null, "http://bean.common.dashboard.carbon.wso2.org/xsd", "comments", xmlWriter);

                                               // write the nil attribute
                                               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                               xmlWriter.writeEndElement();
                                        
                                    }
                                 } if (localDefaultGadgetTracker){
                                    namespace = "http://bean.common.dashboard.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "defaultGadget", xmlWriter);
                             

                                          if (localDefaultGadget==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localDefaultGadget);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localGadgetDescTracker){
                                    namespace = "http://bean.common.dashboard.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "gadgetDesc", xmlWriter);
                             

                                          if (localGadgetDesc==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localGadgetDesc);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localGadgetIdTracker){
                                    namespace = "http://bean.common.dashboard.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "gadgetId", xmlWriter);
                             

                                          if (localGadgetId==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localGadgetId);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localGadgetNameTracker){
                                    namespace = "http://bean.common.dashboard.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "gadgetName", xmlWriter);
                             

                                          if (localGadgetName==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localGadgetName);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localGadgetPathTracker){
                                    namespace = "http://bean.common.dashboard.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "gadgetPath", xmlWriter);
                             

                                          if (localGadgetPath==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localGadgetPath);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localGadgetPrefsTracker){
                                    namespace = "http://bean.common.dashboard.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "gadgetPrefs", xmlWriter);
                             

                                          if (localGadgetPrefs==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localGadgetPrefs);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localGadgetScreenBase64Tracker){
                                    namespace = "http://bean.common.dashboard.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "gadgetScreenBase64", xmlWriter);
                             

                                          if (localGadgetScreenBase64==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localGadgetScreenBase64);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localGadgetUrlTracker){
                                    namespace = "http://bean.common.dashboard.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "gadgetUrl", xmlWriter);
                             

                                          if (localGadgetUrl==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localGadgetUrl);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localRatingTracker){
                                    namespace = "http://bean.common.dashboard.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "rating", xmlWriter);
                             
                                               if (java.lang.Float.isNaN(localRating)) {
                                           
                                                         writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRating));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localThumbUrlTracker){
                                    namespace = "http://bean.common.dashboard.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "thumbUrl", xmlWriter);
                             

                                          if (localThumbUrl==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localThumbUrl);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localUnsignedUserGadgetTracker){
                                    namespace = "http://bean.common.dashboard.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "unsignedUserGadget", xmlWriter);
                             

                                          if (localUnsignedUserGadget==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localUnsignedUserGadget);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localUserCountTracker){
                                    namespace = "http://bean.common.dashboard.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "userCount", xmlWriter);
                             

                                          if (localUserCount==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localUserCount);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             }
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://bean.common.dashboard.carbon.wso2.org/xsd")){
                return "ns126";
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

                 if (localCommentsTracker){
                             if (localComments!=null) {
                                 for (int i = 0;i < localComments.length;i++){

                                    if (localComments[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://bean.common.dashboard.carbon.wso2.org/xsd",
                                                                          "comments"));
                                         elementList.add(localComments[i]);
                                    } else {
                                        
                                                elementList.add(new javax.xml.namespace.QName("http://bean.common.dashboard.carbon.wso2.org/xsd",
                                                                          "comments"));
                                                elementList.add(null);
                                            
                                    }

                                 }
                             } else {
                                 
                                        elementList.add(new javax.xml.namespace.QName("http://bean.common.dashboard.carbon.wso2.org/xsd",
                                                                          "comments"));
                                        elementList.add(localComments);
                                    
                             }

                        } if (localDefaultGadgetTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://bean.common.dashboard.carbon.wso2.org/xsd",
                                                                      "defaultGadget"));
                                 
                                         elementList.add(localDefaultGadget==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDefaultGadget));
                                    } if (localGadgetDescTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://bean.common.dashboard.carbon.wso2.org/xsd",
                                                                      "gadgetDesc"));
                                 
                                         elementList.add(localGadgetDesc==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGadgetDesc));
                                    } if (localGadgetIdTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://bean.common.dashboard.carbon.wso2.org/xsd",
                                                                      "gadgetId"));
                                 
                                         elementList.add(localGadgetId==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGadgetId));
                                    } if (localGadgetNameTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://bean.common.dashboard.carbon.wso2.org/xsd",
                                                                      "gadgetName"));
                                 
                                         elementList.add(localGadgetName==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGadgetName));
                                    } if (localGadgetPathTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://bean.common.dashboard.carbon.wso2.org/xsd",
                                                                      "gadgetPath"));
                                 
                                         elementList.add(localGadgetPath==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGadgetPath));
                                    } if (localGadgetPrefsTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://bean.common.dashboard.carbon.wso2.org/xsd",
                                                                      "gadgetPrefs"));
                                 
                                         elementList.add(localGadgetPrefs==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGadgetPrefs));
                                    } if (localGadgetScreenBase64Tracker){
                                      elementList.add(new javax.xml.namespace.QName("http://bean.common.dashboard.carbon.wso2.org/xsd",
                                                                      "gadgetScreenBase64"));
                                 
                                         elementList.add(localGadgetScreenBase64==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGadgetScreenBase64));
                                    } if (localGadgetUrlTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://bean.common.dashboard.carbon.wso2.org/xsd",
                                                                      "gadgetUrl"));
                                 
                                         elementList.add(localGadgetUrl==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGadgetUrl));
                                    } if (localRatingTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://bean.common.dashboard.carbon.wso2.org/xsd",
                                                                      "rating"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRating));
                            } if (localThumbUrlTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://bean.common.dashboard.carbon.wso2.org/xsd",
                                                                      "thumbUrl"));
                                 
                                         elementList.add(localThumbUrl==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localThumbUrl));
                                    } if (localUnsignedUserGadgetTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://bean.common.dashboard.carbon.wso2.org/xsd",
                                                                      "unsignedUserGadget"));
                                 
                                         elementList.add(localUnsignedUserGadget==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUnsignedUserGadget));
                                    } if (localUserCountTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://bean.common.dashboard.carbon.wso2.org/xsd",
                                                                      "userCount"));
                                 
                                         elementList.add(localUserCount==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUserCount));
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
        public static Gadget parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            Gadget object =
                new Gadget();

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
                    
                            if (!"Gadget".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (Gadget)org.wso2.carbon.dashboard.bean.xsd.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                        java.util.ArrayList list1 = new java.util.ArrayList();
                    
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://bean.common.dashboard.carbon.wso2.org/xsd","comments").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list1.add(null);
                                                              reader.next();
                                                          } else {
                                                        list1.add(org.wso2.carbon.dashboard.common.bean.xsd.Comment.Factory.parse(reader));
                                                                }
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone1 = false;
                                                        while(!loopDone1){
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
                                                                loopDone1 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://bean.common.dashboard.carbon.wso2.org/xsd","comments").equals(reader.getName())){
                                                                    
                                                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                                          list1.add(null);
                                                                          reader.next();
                                                                      } else {
                                                                    list1.add(org.wso2.carbon.dashboard.common.bean.xsd.Comment.Factory.parse(reader));
                                                                        }
                                                                }else{
                                                                    loopDone1 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setComments((org.wso2.carbon.dashboard.common.bean.xsd.Comment[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                org.wso2.carbon.dashboard.common.bean.xsd.Comment.class,
                                                                list1));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://bean.common.dashboard.carbon.wso2.org/xsd","defaultGadget").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setDefaultGadget(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://bean.common.dashboard.carbon.wso2.org/xsd","gadgetDesc").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setGadgetDesc(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://bean.common.dashboard.carbon.wso2.org/xsd","gadgetId").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setGadgetId(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://bean.common.dashboard.carbon.wso2.org/xsd","gadgetName").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setGadgetName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://bean.common.dashboard.carbon.wso2.org/xsd","gadgetPath").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setGadgetPath(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://bean.common.dashboard.carbon.wso2.org/xsd","gadgetPrefs").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setGadgetPrefs(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://bean.common.dashboard.carbon.wso2.org/xsd","gadgetScreenBase64").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setGadgetScreenBase64(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://bean.common.dashboard.carbon.wso2.org/xsd","gadgetUrl").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setGadgetUrl(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://bean.common.dashboard.carbon.wso2.org/xsd","rating").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setRating(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToFloat(content));
                                            
                                       } else {
                                           
                                           
                                                   object.setRating(java.lang.Float.NaN);
                                               
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setRating(java.lang.Float.NaN);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://bean.common.dashboard.carbon.wso2.org/xsd","thumbUrl").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setThumbUrl(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://bean.common.dashboard.carbon.wso2.org/xsd","unsignedUserGadget").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setUnsignedUserGadget(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://bean.common.dashboard.carbon.wso2.org/xsd","userCount").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setUserCount(
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
           
    
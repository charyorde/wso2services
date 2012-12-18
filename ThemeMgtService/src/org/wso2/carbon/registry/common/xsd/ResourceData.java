
/**
 * ResourceData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v3  Built on : Oct 26, 2011 (07:42:27 PDT)
 */

            
                package org.wso2.carbon.registry.common.xsd;
            

            /**
            *  ResourceData bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ResourceData
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = ResourceData
                Namespace URI = http://common.registry.carbon.wso2.org/xsd
                Namespace Prefix = ns18
                */
            

                        /**
                        * field for Absent
                        */

                        
                                    protected java.lang.String localAbsent ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAbsentTracker = false ;

                           public boolean isAbsentSpecified(){
                               return localAbsentTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getAbsent(){
                               return localAbsent;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Absent
                               */
                               public void setAbsent(java.lang.String param){
                            localAbsentTracker = true;
                                   
                                            this.localAbsent=param;
                                    

                               }
                            

                        /**
                        * field for AuthorUserName
                        */

                        
                                    protected java.lang.String localAuthorUserName ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAuthorUserNameTracker = false ;

                           public boolean isAuthorUserNameSpecified(){
                               return localAuthorUserNameTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getAuthorUserName(){
                               return localAuthorUserName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AuthorUserName
                               */
                               public void setAuthorUserName(java.lang.String param){
                            localAuthorUserNameTracker = true;
                                   
                                            this.localAuthorUserName=param;
                                    

                               }
                            

                        /**
                        * field for AverageRating
                        */

                        
                                    protected float localAverageRating ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAverageRatingTracker = false ;

                           public boolean isAverageRatingSpecified(){
                               return localAverageRatingTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return float
                           */
                           public  float getAverageRating(){
                               return localAverageRating;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AverageRating
                               */
                               public void setAverageRating(float param){
                            
                                       // setting primitive attribute tracker to true
                                       localAverageRatingTracker =
                                       !java.lang.Float.isNaN(param);
                                   
                                            this.localAverageRating=param;
                                    

                               }
                            

                        /**
                        * field for AverageStars
                        * This was an Array!
                        */

                        
                                    protected java.lang.String[] localAverageStars ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAverageStarsTracker = false ;

                           public boolean isAverageStarsSpecified(){
                               return localAverageStarsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String[]
                           */
                           public  java.lang.String[] getAverageStars(){
                               return localAverageStars;
                           }

                           
                        


                               
                              /**
                               * validate the array for AverageStars
                               */
                              protected void validateAverageStars(java.lang.String[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param AverageStars
                              */
                              public void setAverageStars(java.lang.String[] param){
                              
                                   validateAverageStars(param);

                               localAverageStarsTracker = true;
                                      
                                      this.localAverageStars=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param java.lang.String
                             */
                             public void addAverageStars(java.lang.String param){
                                   if (localAverageStars == null){
                                   localAverageStars = new java.lang.String[]{};
                                   }

                            
                                 //update the setting tracker
                                localAverageStarsTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localAverageStars);
                               list.add(param);
                               this.localAverageStars =
                             (java.lang.String[])list.toArray(
                            new java.lang.String[list.size()]);

                             }
                             

                        /**
                        * field for CreatedOn
                        */

                        
                                    protected java.util.Calendar localCreatedOn ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCreatedOnTracker = false ;

                           public boolean isCreatedOnSpecified(){
                               return localCreatedOnTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.util.Calendar
                           */
                           public  java.util.Calendar getCreatedOn(){
                               return localCreatedOn;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CreatedOn
                               */
                               public void setCreatedOn(java.util.Calendar param){
                            localCreatedOnTracker = true;
                                   
                                            this.localCreatedOn=param;
                                    

                               }
                            

                        /**
                        * field for DeleteAllowed
                        */

                        
                                    protected boolean localDeleteAllowed ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDeleteAllowedTracker = false ;

                           public boolean isDeleteAllowedSpecified(){
                               return localDeleteAllowedTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getDeleteAllowed(){
                               return localDeleteAllowed;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param DeleteAllowed
                               */
                               public void setDeleteAllowed(boolean param){
                            
                                       // setting primitive attribute tracker to true
                                       localDeleteAllowedTracker =
                                       true;
                                   
                                            this.localDeleteAllowed=param;
                                    

                               }
                            

                        /**
                        * field for Description
                        */

                        
                                    protected java.lang.String localDescription ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDescriptionTracker = false ;

                           public boolean isDescriptionSpecified(){
                               return localDescriptionTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getDescription(){
                               return localDescription;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Description
                               */
                               public void setDescription(java.lang.String param){
                            localDescriptionTracker = true;
                                   
                                            this.localDescription=param;
                                    

                               }
                            

                        /**
                        * field for ExternalLink
                        */

                        
                                    protected boolean localExternalLink ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localExternalLinkTracker = false ;

                           public boolean isExternalLinkSpecified(){
                               return localExternalLinkTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getExternalLink(){
                               return localExternalLink;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ExternalLink
                               */
                               public void setExternalLink(boolean param){
                            
                                       // setting primitive attribute tracker to true
                                       localExternalLinkTracker =
                                       true;
                                   
                                            this.localExternalLink=param;
                                    

                               }
                            

                        /**
                        * field for FormattedCreatedOn
                        */

                        
                                    protected java.lang.String localFormattedCreatedOn ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localFormattedCreatedOnTracker = false ;

                           public boolean isFormattedCreatedOnSpecified(){
                               return localFormattedCreatedOnTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getFormattedCreatedOn(){
                               return localFormattedCreatedOn;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param FormattedCreatedOn
                               */
                               public void setFormattedCreatedOn(java.lang.String param){
                            localFormattedCreatedOnTracker = true;
                                   
                                            this.localFormattedCreatedOn=param;
                                    

                               }
                            

                        /**
                        * field for GetAllowed
                        */

                        
                                    protected boolean localGetAllowed ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGetAllowedTracker = false ;

                           public boolean isGetAllowedSpecified(){
                               return localGetAllowedTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getGetAllowed(){
                               return localGetAllowed;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GetAllowed
                               */
                               public void setGetAllowed(boolean param){
                            
                                       // setting primitive attribute tracker to true
                                       localGetAllowedTracker =
                                       true;
                                   
                                            this.localGetAllowed=param;
                                    

                               }
                            

                        /**
                        * field for Link
                        */

                        
                                    protected boolean localLink ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localLinkTracker = false ;

                           public boolean isLinkSpecified(){
                               return localLinkTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getLink(){
                               return localLink;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Link
                               */
                               public void setLink(boolean param){
                            
                                       // setting primitive attribute tracker to true
                                       localLinkTracker =
                                       true;
                                   
                                            this.localLink=param;
                                    

                               }
                            

                        /**
                        * field for Mounted
                        */

                        
                                    protected boolean localMounted ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localMountedTracker = false ;

                           public boolean isMountedSpecified(){
                               return localMountedTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getMounted(){
                               return localMounted;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Mounted
                               */
                               public void setMounted(boolean param){
                            
                                       // setting primitive attribute tracker to true
                                       localMountedTracker =
                                       true;
                                   
                                            this.localMounted=param;
                                    

                               }
                            

                        /**
                        * field for Name
                        */

                        
                                    protected java.lang.String localName ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localNameTracker = false ;

                           public boolean isNameSpecified(){
                               return localNameTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getName(){
                               return localName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Name
                               */
                               public void setName(java.lang.String param){
                            localNameTracker = true;
                                   
                                            this.localName=param;
                                    

                               }
                            

                        /**
                        * field for PutAllowed
                        */

                        
                                    protected boolean localPutAllowed ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPutAllowedTracker = false ;

                           public boolean isPutAllowedSpecified(){
                               return localPutAllowedTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getPutAllowed(){
                               return localPutAllowed;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PutAllowed
                               */
                               public void setPutAllowed(boolean param){
                            
                                       // setting primitive attribute tracker to true
                                       localPutAllowedTracker =
                                       true;
                                   
                                            this.localPutAllowed=param;
                                    

                               }
                            

                        /**
                        * field for RealPath
                        */

                        
                                    protected java.lang.String localRealPath ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRealPathTracker = false ;

                           public boolean isRealPathSpecified(){
                               return localRealPathTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getRealPath(){
                               return localRealPath;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RealPath
                               */
                               public void setRealPath(java.lang.String param){
                            localRealPathTracker = true;
                                   
                                            this.localRealPath=param;
                                    

                               }
                            

                        /**
                        * field for RelativePath
                        */

                        
                                    protected java.lang.String localRelativePath ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRelativePathTracker = false ;

                           public boolean isRelativePathSpecified(){
                               return localRelativePathTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getRelativePath(){
                               return localRelativePath;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RelativePath
                               */
                               public void setRelativePath(java.lang.String param){
                            localRelativePathTracker = true;
                                   
                                            this.localRelativePath=param;
                                    

                               }
                            

                        /**
                        * field for ResourcePath
                        */

                        
                                    protected java.lang.String localResourcePath ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localResourcePathTracker = false ;

                           public boolean isResourcePathSpecified(){
                               return localResourcePathTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getResourcePath(){
                               return localResourcePath;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ResourcePath
                               */
                               public void setResourcePath(java.lang.String param){
                            localResourcePathTracker = true;
                                   
                                            this.localResourcePath=param;
                                    

                               }
                            

                        /**
                        * field for ResourceType
                        */

                        
                                    protected java.lang.String localResourceType ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localResourceTypeTracker = false ;

                           public boolean isResourceTypeSpecified(){
                               return localResourceTypeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getResourceType(){
                               return localResourceType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ResourceType
                               */
                               public void setResourceType(java.lang.String param){
                            localResourceTypeTracker = true;
                                   
                                            this.localResourceType=param;
                                    

                               }
                            

                        /**
                        * field for TagCounts
                        * This was an Array!
                        */

                        
                                    protected org.wso2.carbon.registry.common.xsd.TagCount[] localTagCounts ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTagCountsTracker = false ;

                           public boolean isTagCountsSpecified(){
                               return localTagCountsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return org.wso2.carbon.registry.common.xsd.TagCount[]
                           */
                           public  org.wso2.carbon.registry.common.xsd.TagCount[] getTagCounts(){
                               return localTagCounts;
                           }

                           
                        


                               
                              /**
                               * validate the array for TagCounts
                               */
                              protected void validateTagCounts(org.wso2.carbon.registry.common.xsd.TagCount[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param TagCounts
                              */
                              public void setTagCounts(org.wso2.carbon.registry.common.xsd.TagCount[] param){
                              
                                   validateTagCounts(param);

                               localTagCountsTracker = true;
                                      
                                      this.localTagCounts=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param org.wso2.carbon.registry.common.xsd.TagCount
                             */
                             public void addTagCounts(org.wso2.carbon.registry.common.xsd.TagCount param){
                                   if (localTagCounts == null){
                                   localTagCounts = new org.wso2.carbon.registry.common.xsd.TagCount[]{};
                                   }

                            
                                 //update the setting tracker
                                localTagCountsTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localTagCounts);
                               list.add(param);
                               this.localTagCounts =
                             (org.wso2.carbon.registry.common.xsd.TagCount[])list.toArray(
                            new org.wso2.carbon.registry.common.xsd.TagCount[list.size()]);

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
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://common.registry.carbon.wso2.org/xsd");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":ResourceData",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "ResourceData",
                           xmlWriter);
                   }

               
                   }
                if (localAbsentTracker){
                                    namespace = "http://common.registry.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "absent", xmlWriter);
                             

                                          if (localAbsent==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localAbsent);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localAuthorUserNameTracker){
                                    namespace = "http://common.registry.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "authorUserName", xmlWriter);
                             

                                          if (localAuthorUserName==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localAuthorUserName);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localAverageRatingTracker){
                                    namespace = "http://common.registry.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "averageRating", xmlWriter);
                             
                                               if (java.lang.Float.isNaN(localAverageRating)) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("averageRating cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAverageRating));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localAverageStarsTracker){
                             if (localAverageStars!=null) {
                                   namespace = "http://common.registry.carbon.wso2.org/xsd";
                                   for (int i = 0;i < localAverageStars.length;i++){
                                        
                                            if (localAverageStars[i] != null){
                                        
                                                writeStartElement(null, namespace, "averageStars", xmlWriter);

                                            
                                                        xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAverageStars[i]));
                                                    
                                                xmlWriter.writeEndElement();
                                              
                                                } else {
                                                   
                                                           // write null attribute
                                                            namespace = "http://common.registry.carbon.wso2.org/xsd";
                                                            writeStartElement(null, namespace, "averageStars", xmlWriter);
                                                            writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                            xmlWriter.writeEndElement();
                                                       
                                                }

                                   }
                             } else {
                                 
                                         // write the null attribute
                                        // write null attribute
                                           writeStartElement(null, "http://common.registry.carbon.wso2.org/xsd", "averageStars", xmlWriter);

                                           // write the nil attribute
                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                           xmlWriter.writeEndElement();
                                    
                             }

                        } if (localCreatedOnTracker){
                                    namespace = "http://common.registry.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "createdOn", xmlWriter);
                             

                                          if (localCreatedOn==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCreatedOn));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localDeleteAllowedTracker){
                                    namespace = "http://common.registry.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "deleteAllowed", xmlWriter);
                             
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("deleteAllowed cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDeleteAllowed));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localDescriptionTracker){
                                    namespace = "http://common.registry.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "description", xmlWriter);
                             

                                          if (localDescription==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localDescription);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localExternalLinkTracker){
                                    namespace = "http://common.registry.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "externalLink", xmlWriter);
                             
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("externalLink cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localExternalLink));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localFormattedCreatedOnTracker){
                                    namespace = "http://common.registry.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "formattedCreatedOn", xmlWriter);
                             

                                          if (localFormattedCreatedOn==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localFormattedCreatedOn);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localGetAllowedTracker){
                                    namespace = "http://common.registry.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "getAllowed", xmlWriter);
                             
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("getAllowed cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGetAllowed));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localLinkTracker){
                                    namespace = "http://common.registry.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "link", xmlWriter);
                             
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("link cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLink));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localMountedTracker){
                                    namespace = "http://common.registry.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "mounted", xmlWriter);
                             
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("mounted cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMounted));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localNameTracker){
                                    namespace = "http://common.registry.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "name", xmlWriter);
                             

                                          if (localName==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localName);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPutAllowedTracker){
                                    namespace = "http://common.registry.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "putAllowed", xmlWriter);
                             
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("putAllowed cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPutAllowed));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localRealPathTracker){
                                    namespace = "http://common.registry.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "realPath", xmlWriter);
                             

                                          if (localRealPath==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localRealPath);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localRelativePathTracker){
                                    namespace = "http://common.registry.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "relativePath", xmlWriter);
                             

                                          if (localRelativePath==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localRelativePath);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localResourcePathTracker){
                                    namespace = "http://common.registry.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "resourcePath", xmlWriter);
                             

                                          if (localResourcePath==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localResourcePath);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localResourceTypeTracker){
                                    namespace = "http://common.registry.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "resourceType", xmlWriter);
                             

                                          if (localResourceType==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localResourceType);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localTagCountsTracker){
                                       if (localTagCounts!=null){
                                            for (int i = 0;i < localTagCounts.length;i++){
                                                if (localTagCounts[i] != null){
                                                 localTagCounts[i].serialize(new javax.xml.namespace.QName("http://common.registry.carbon.wso2.org/xsd","tagCounts"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                            writeStartElement(null, "http://common.registry.carbon.wso2.org/xsd", "tagCounts", xmlWriter);

                                                           // write the nil attribute
                                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                           xmlWriter.writeEndElement();
                                                    
                                                }

                                            }
                                     } else {
                                        
                                                writeStartElement(null, "http://common.registry.carbon.wso2.org/xsd", "tagCounts", xmlWriter);

                                               // write the nil attribute
                                               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                               xmlWriter.writeEndElement();
                                        
                                    }
                                 }
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://common.registry.carbon.wso2.org/xsd")){
                return "ns18";
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

                 if (localAbsentTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://common.registry.carbon.wso2.org/xsd",
                                                                      "absent"));
                                 
                                         elementList.add(localAbsent==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAbsent));
                                    } if (localAuthorUserNameTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://common.registry.carbon.wso2.org/xsd",
                                                                      "authorUserName"));
                                 
                                         elementList.add(localAuthorUserName==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAuthorUserName));
                                    } if (localAverageRatingTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://common.registry.carbon.wso2.org/xsd",
                                                                      "averageRating"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAverageRating));
                            } if (localAverageStarsTracker){
                            if (localAverageStars!=null){
                                  for (int i = 0;i < localAverageStars.length;i++){
                                      
                                         if (localAverageStars[i] != null){
                                          elementList.add(new javax.xml.namespace.QName("http://common.registry.carbon.wso2.org/xsd",
                                                                              "averageStars"));
                                          elementList.add(
                                          org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAverageStars[i]));
                                          } else {
                                             
                                                    elementList.add(new javax.xml.namespace.QName("http://common.registry.carbon.wso2.org/xsd",
                                                                              "averageStars"));
                                                    elementList.add(null);
                                                
                                          }
                                      

                                  }
                            } else {
                              
                                    elementList.add(new javax.xml.namespace.QName("http://common.registry.carbon.wso2.org/xsd",
                                                                              "averageStars"));
                                    elementList.add(null);
                                
                            }

                        } if (localCreatedOnTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://common.registry.carbon.wso2.org/xsd",
                                                                      "createdOn"));
                                 
                                         elementList.add(localCreatedOn==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCreatedOn));
                                    } if (localDeleteAllowedTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://common.registry.carbon.wso2.org/xsd",
                                                                      "deleteAllowed"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDeleteAllowed));
                            } if (localDescriptionTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://common.registry.carbon.wso2.org/xsd",
                                                                      "description"));
                                 
                                         elementList.add(localDescription==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDescription));
                                    } if (localExternalLinkTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://common.registry.carbon.wso2.org/xsd",
                                                                      "externalLink"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localExternalLink));
                            } if (localFormattedCreatedOnTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://common.registry.carbon.wso2.org/xsd",
                                                                      "formattedCreatedOn"));
                                 
                                         elementList.add(localFormattedCreatedOn==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFormattedCreatedOn));
                                    } if (localGetAllowedTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://common.registry.carbon.wso2.org/xsd",
                                                                      "getAllowed"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGetAllowed));
                            } if (localLinkTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://common.registry.carbon.wso2.org/xsd",
                                                                      "link"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLink));
                            } if (localMountedTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://common.registry.carbon.wso2.org/xsd",
                                                                      "mounted"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMounted));
                            } if (localNameTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://common.registry.carbon.wso2.org/xsd",
                                                                      "name"));
                                 
                                         elementList.add(localName==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localName));
                                    } if (localPutAllowedTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://common.registry.carbon.wso2.org/xsd",
                                                                      "putAllowed"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPutAllowed));
                            } if (localRealPathTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://common.registry.carbon.wso2.org/xsd",
                                                                      "realPath"));
                                 
                                         elementList.add(localRealPath==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRealPath));
                                    } if (localRelativePathTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://common.registry.carbon.wso2.org/xsd",
                                                                      "relativePath"));
                                 
                                         elementList.add(localRelativePath==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRelativePath));
                                    } if (localResourcePathTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://common.registry.carbon.wso2.org/xsd",
                                                                      "resourcePath"));
                                 
                                         elementList.add(localResourcePath==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localResourcePath));
                                    } if (localResourceTypeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://common.registry.carbon.wso2.org/xsd",
                                                                      "resourceType"));
                                 
                                         elementList.add(localResourceType==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localResourceType));
                                    } if (localTagCountsTracker){
                             if (localTagCounts!=null) {
                                 for (int i = 0;i < localTagCounts.length;i++){

                                    if (localTagCounts[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://common.registry.carbon.wso2.org/xsd",
                                                                          "tagCounts"));
                                         elementList.add(localTagCounts[i]);
                                    } else {
                                        
                                                elementList.add(new javax.xml.namespace.QName("http://common.registry.carbon.wso2.org/xsd",
                                                                          "tagCounts"));
                                                elementList.add(null);
                                            
                                    }

                                 }
                             } else {
                                 
                                        elementList.add(new javax.xml.namespace.QName("http://common.registry.carbon.wso2.org/xsd",
                                                                          "tagCounts"));
                                        elementList.add(localTagCounts);
                                    
                             }

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
        public static ResourceData parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            ResourceData object =
                new ResourceData();

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
                    
                            if (!"ResourceData".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (ResourceData)org.wso2.carbon.registry.resource.beans.xsd.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                        java.util.ArrayList list4 = new java.util.ArrayList();
                    
                        java.util.ArrayList list19 = new java.util.ArrayList();
                    
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://common.registry.carbon.wso2.org/xsd","absent").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setAbsent(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://common.registry.carbon.wso2.org/xsd","authorUserName").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setAuthorUserName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://common.registry.carbon.wso2.org/xsd","averageRating").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"averageRating" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setAverageRating(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToFloat(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setAverageRating(java.lang.Float.NaN);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://common.registry.carbon.wso2.org/xsd","averageStars").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                              nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                              if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                  list4.add(null);
                                                       
                                                  reader.next();
                                              } else {
                                            list4.add(reader.getElementText());
                                            }
                                            //loop until we find a start element that is not part of this array
                                            boolean loopDone4 = false;
                                            while(!loopDone4){
                                                // Ensure we are at the EndElement
                                                while (!reader.isEndElement()){
                                                    reader.next();
                                                }
                                                // Step out of this element
                                                reader.next();
                                                // Step to next element event.
                                                while (!reader.isStartElement() && !reader.isEndElement())
                                                    reader.next();
                                                if (reader.isEndElement()){
                                                    //two continuous end elements means we are exiting the xml structure
                                                    loopDone4 = true;
                                                } else {
                                                    if (new javax.xml.namespace.QName("http://common.registry.carbon.wso2.org/xsd","averageStars").equals(reader.getName())){
                                                         
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list4.add(null);
                                                                   
                                                              reader.next();
                                                          } else {
                                                        list4.add(reader.getElementText());
                                                        }
                                                    }else{
                                                        loopDone4 = true;
                                                    }
                                                }
                                            }
                                            // call the converter utility  to convert and set the array
                                            
                                                    object.setAverageStars((java.lang.String[])
                                                        list4.toArray(new java.lang.String[list4.size()]));
                                                
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://common.registry.carbon.wso2.org/xsd","createdOn").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCreatedOn(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://common.registry.carbon.wso2.org/xsd","deleteAllowed").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"deleteAllowed" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setDeleteAllowed(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://common.registry.carbon.wso2.org/xsd","description").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setDescription(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://common.registry.carbon.wso2.org/xsd","externalLink").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"externalLink" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setExternalLink(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://common.registry.carbon.wso2.org/xsd","formattedCreatedOn").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setFormattedCreatedOn(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://common.registry.carbon.wso2.org/xsd","getAllowed").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"getAllowed" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setGetAllowed(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://common.registry.carbon.wso2.org/xsd","link").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"link" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setLink(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://common.registry.carbon.wso2.org/xsd","mounted").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"mounted" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setMounted(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://common.registry.carbon.wso2.org/xsd","name").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://common.registry.carbon.wso2.org/xsd","putAllowed").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"putAllowed" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPutAllowed(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://common.registry.carbon.wso2.org/xsd","realPath").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setRealPath(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://common.registry.carbon.wso2.org/xsd","relativePath").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setRelativePath(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://common.registry.carbon.wso2.org/xsd","resourcePath").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setResourcePath(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://common.registry.carbon.wso2.org/xsd","resourceType").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setResourceType(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://common.registry.carbon.wso2.org/xsd","tagCounts").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list19.add(null);
                                                              reader.next();
                                                          } else {
                                                        list19.add(org.wso2.carbon.registry.common.xsd.TagCount.Factory.parse(reader));
                                                                }
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone19 = false;
                                                        while(!loopDone19){
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
                                                                loopDone19 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://common.registry.carbon.wso2.org/xsd","tagCounts").equals(reader.getName())){
                                                                    
                                                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                                          list19.add(null);
                                                                          reader.next();
                                                                      } else {
                                                                    list19.add(org.wso2.carbon.registry.common.xsd.TagCount.Factory.parse(reader));
                                                                        }
                                                                }else{
                                                                    loopDone19 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setTagCounts((org.wso2.carbon.registry.common.xsd.TagCount[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                org.wso2.carbon.registry.common.xsd.TagCount.class,
                                                                list19));
                                                            
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
           
    